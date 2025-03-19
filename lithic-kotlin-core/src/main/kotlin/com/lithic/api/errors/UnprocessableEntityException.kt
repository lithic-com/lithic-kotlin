// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.errors

import com.lithic.api.core.JsonValue
import com.lithic.api.core.checkRequired
import com.lithic.api.core.http.Headers

class UnprocessableEntityException
private constructor(private val headers: Headers, private val body: JsonValue, cause: Throwable?) :
    LithicServiceException("422: $body", cause) {

    override fun headers(): Headers = headers

    override fun body(): JsonValue = body

    override fun statusCode(): Int = 422

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [UnprocessableEntityException].
         *
         * The following fields are required:
         * ```kotlin
         * .headers()
         * .body()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [UnprocessableEntityException]. */
    class Builder internal constructor() {

        private var headers: Headers? = null
        private var body: JsonValue? = null
        private var cause: Throwable? = null

        internal fun from(unprocessableEntityException: UnprocessableEntityException) = apply {
            headers = unprocessableEntityException.headers
            body = unprocessableEntityException.body
            cause = unprocessableEntityException.cause
        }

        fun headers(headers: Headers) = apply { this.headers = headers }

        fun body(body: JsonValue) = apply { this.body = body }

        fun cause(cause: Throwable?) = apply { this.cause = cause }

        /**
         * Returns an immutable instance of [UnprocessableEntityException].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```kotlin
         * .headers()
         * .body()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): UnprocessableEntityException =
            UnprocessableEntityException(
                checkRequired("headers", headers),
                checkRequired("body", body),
                cause,
            )
    }
}
