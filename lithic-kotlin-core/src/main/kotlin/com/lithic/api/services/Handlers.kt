@file:JvmName("Handlers")

package com.lithic.api.services

import com.fasterxml.jackson.databind.json.JsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lithic.api.core.http.BinaryResponseContent
import com.lithic.api.core.http.HttpResponse
import com.lithic.api.core.http.HttpResponse.Handler
import com.lithic.api.errors.BadRequestException
import com.lithic.api.errors.InternalServerException
import com.lithic.api.errors.LithicError
import com.lithic.api.errors.LithicException
import com.lithic.api.errors.NotFoundException
import com.lithic.api.errors.PermissionDeniedException
import com.lithic.api.errors.RateLimitException
import com.lithic.api.errors.UnauthorizedException
import com.lithic.api.errors.UnexpectedStatusCodeException
import com.lithic.api.errors.UnprocessableEntityException
import java.io.InputStream
import java.io.OutputStream

internal fun emptyHandler(): Handler<Void?> = EmptyHandler

private object EmptyHandler : Handler<Void?> {
    override fun handle(response: HttpResponse): Void? = null
}

internal fun stringHandler(): Handler<String> = StringHandler

internal fun binaryHandler(): Handler<BinaryResponseContent> = BinaryHandler

private object StringHandler : Handler<String> {
    override fun handle(response: HttpResponse): String {
        return response.body().readBytes().toString(Charsets.UTF_8)
    }
}

private object BinaryHandler : Handler<BinaryResponseContent> {
    override fun handle(response: HttpResponse): BinaryResponseContent {
        return object : BinaryResponseContent {
            override fun contentType(): String? =
                response.headers().get("Content-Type").firstOrNull()

            override fun body(): InputStream = response.body()

            override fun close() = response.close()

            override fun writeTo(outputStream: OutputStream) {
                response.body().copyTo(outputStream)
            }
        }
    }
}

internal inline fun <reified T> jsonHandler(jsonMapper: JsonMapper): Handler<T> {
    return object : Handler<T> {
        override fun handle(response: HttpResponse): T {
            try {
                return jsonMapper.readValue(response.body(), jacksonTypeRef())
            } catch (e: Exception) {
                throw LithicException("Error reading response", e)
            }
        }
    }
}

internal fun errorHandler(jsonMapper: JsonMapper): Handler<LithicError> {
    val handler = jsonHandler<LithicError>(jsonMapper)

    return object : Handler<LithicError> {
        override fun handle(response: HttpResponse): LithicError {
            try {
                return handler.handle(response)
            } catch (e: Exception) {
                return LithicError.builder().build()
            }
        }
    }
}

internal fun <T> Handler<T>.withErrorHandler(errorHandler: Handler<LithicError>): Handler<T> {
    return object : Handler<T> {
        override fun handle(response: HttpResponse): T {
            when (val statusCode = response.statusCode()) {
                in 200..299 -> return this@withErrorHandler.handle(response)
                400 -> throw BadRequestException(response.headers(), errorHandler.handle(response))
                401 ->
                    throw UnauthorizedException(response.headers(), errorHandler.handle(response))
                403 ->
                    throw PermissionDeniedException(
                        response.headers(),
                        errorHandler.handle(response)
                    )
                404 -> throw NotFoundException(response.headers(), errorHandler.handle(response))
                422 ->
                    throw UnprocessableEntityException(
                        response.headers(),
                        errorHandler.handle(response)
                    )
                429 -> throw RateLimitException(response.headers(), errorHandler.handle(response))
                in 500..599 ->
                    throw InternalServerException(
                        statusCode,
                        response.headers(),
                        errorHandler.handle(response)
                    )
                else ->
                    throw UnexpectedStatusCodeException(
                        statusCode,
                        response.headers(),
                        StringHandler.handle(response)
                    )
            }
        }
    }
}
