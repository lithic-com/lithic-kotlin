// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.services.async

import com.lithic.api.core.ClientOptions
import com.lithic.api.core.JsonValue
import com.lithic.api.core.RequestOptions
import com.lithic.api.core.handlers.emptyHandler
import com.lithic.api.core.handlers.errorHandler
import com.lithic.api.core.handlers.jsonHandler
import com.lithic.api.core.handlers.withErrorHandler
import com.lithic.api.core.http.HttpMethod
import com.lithic.api.core.http.HttpRequest
import com.lithic.api.core.http.HttpResponse
import com.lithic.api.core.http.HttpResponse.Handler
import com.lithic.api.core.http.HttpResponseFor
import com.lithic.api.core.http.json
import com.lithic.api.core.http.parseable
import com.lithic.api.core.prepareAsync
import com.lithic.api.models.authstreamenrollment.AuthStreamEnrollmentRetrieveSecretParams
import com.lithic.api.models.authstreamenrollment.AuthStreamEnrollmentRotateSecretParams
import com.lithic.api.models.authstreamenrollment.AuthStreamSecret

class AuthStreamEnrollmentServiceAsyncImpl
internal constructor(private val clientOptions: ClientOptions) : AuthStreamEnrollmentServiceAsync {

    private val withRawResponse: AuthStreamEnrollmentServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): AuthStreamEnrollmentServiceAsync.WithRawResponse =
        withRawResponse

    override suspend fun retrieveSecret(
        params: AuthStreamEnrollmentRetrieveSecretParams,
        requestOptions: RequestOptions,
    ): AuthStreamSecret =
        // get /v1/auth_stream/secret
        withRawResponse().retrieveSecret(params, requestOptions).parse()

    override suspend fun rotateSecret(
        params: AuthStreamEnrollmentRotateSecretParams,
        requestOptions: RequestOptions,
    ) {
        // post /v1/auth_stream/secret/rotate
        withRawResponse().rotateSecret(params, requestOptions)
    }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        AuthStreamEnrollmentServiceAsync.WithRawResponse {

        private val errorHandler: Handler<JsonValue> = errorHandler(clientOptions.jsonMapper)

        private val retrieveSecretHandler: Handler<AuthStreamSecret> =
            jsonHandler<AuthStreamSecret>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override suspend fun retrieveSecret(
            params: AuthStreamEnrollmentRetrieveSecretParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<AuthStreamSecret> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments("v1", "auth_stream", "secret")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return response.parseable {
                response
                    .use { retrieveSecretHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val rotateSecretHandler: Handler<Void?> =
            emptyHandler().withErrorHandler(errorHandler)

        override suspend fun rotateSecret(
            params: AuthStreamEnrollmentRotateSecretParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .addPathSegments("v1", "auth_stream", "secret", "rotate")
                    .apply { params._body()?.let { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return response.parseable { response.use { rotateSecretHandler.handle(it) } }
        }
    }
}
