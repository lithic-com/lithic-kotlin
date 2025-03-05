// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.services.async

import com.lithic.api.core.ClientOptions
import com.lithic.api.core.RequestOptions
import com.lithic.api.core.handlers.errorHandler
import com.lithic.api.core.handlers.jsonHandler
import com.lithic.api.core.handlers.withErrorHandler
import com.lithic.api.core.http.HttpMethod
import com.lithic.api.core.http.HttpRequest
import com.lithic.api.core.http.HttpResponse.Handler
import com.lithic.api.core.http.HttpResponseFor
import com.lithic.api.core.http.json
import com.lithic.api.core.http.parseable
import com.lithic.api.core.prepareAsync
import com.lithic.api.errors.LithicError
import com.lithic.api.models.TokenizationDecisioningRetrieveSecretParams
import com.lithic.api.models.TokenizationDecisioningRotateSecretParams
import com.lithic.api.models.TokenizationDecisioningRotateSecretResponse
import com.lithic.api.models.TokenizationSecret

class TokenizationDecisioningServiceAsyncImpl
internal constructor(private val clientOptions: ClientOptions) :
    TokenizationDecisioningServiceAsync {

    private val withRawResponse: TokenizationDecisioningServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): TokenizationDecisioningServiceAsync.WithRawResponse =
        withRawResponse

    override suspend fun retrieveSecret(
        params: TokenizationDecisioningRetrieveSecretParams,
        requestOptions: RequestOptions,
    ): TokenizationSecret =
        // get /v1/tokenization_decisioning/secret
        withRawResponse().retrieveSecret(params, requestOptions).parse()

    override suspend fun rotateSecret(
        params: TokenizationDecisioningRotateSecretParams,
        requestOptions: RequestOptions,
    ): TokenizationDecisioningRotateSecretResponse =
        // post /v1/tokenization_decisioning/secret/rotate
        withRawResponse().rotateSecret(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        TokenizationDecisioningServiceAsync.WithRawResponse {

        private val errorHandler: Handler<LithicError> = errorHandler(clientOptions.jsonMapper)

        private val retrieveSecretHandler: Handler<TokenizationSecret> =
            jsonHandler<TokenizationSecret>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override suspend fun retrieveSecret(
            params: TokenizationDecisioningRetrieveSecretParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<TokenizationSecret> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments("v1", "tokenization_decisioning", "secret")
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

        private val rotateSecretHandler: Handler<TokenizationDecisioningRotateSecretResponse> =
            jsonHandler<TokenizationDecisioningRotateSecretResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override suspend fun rotateSecret(
            params: TokenizationDecisioningRotateSecretParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<TokenizationDecisioningRotateSecretResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .addPathSegments("v1", "tokenization_decisioning", "secret", "rotate")
                    .apply { params._body()?.let { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return response.parseable {
                response
                    .use { rotateSecretHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }
    }
}
