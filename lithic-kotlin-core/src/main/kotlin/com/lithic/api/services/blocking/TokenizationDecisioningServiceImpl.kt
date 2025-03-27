// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.services.blocking

import com.lithic.api.core.ClientOptions
import com.lithic.api.core.JsonValue
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
import com.lithic.api.core.prepare
import com.lithic.api.models.tokenizationdecisioning.TokenizationDecisioningRetrieveSecretParams
import com.lithic.api.models.tokenizationdecisioning.TokenizationDecisioningRotateSecretParams
import com.lithic.api.models.tokenizationdecisioning.TokenizationDecisioningRotateSecretResponse
import com.lithic.api.models.tokenizationdecisioning.TokenizationSecret

class TokenizationDecisioningServiceImpl
internal constructor(private val clientOptions: ClientOptions) : TokenizationDecisioningService {

    private val withRawResponse: TokenizationDecisioningService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): TokenizationDecisioningService.WithRawResponse = withRawResponse

    override fun retrieveSecret(
        params: TokenizationDecisioningRetrieveSecretParams,
        requestOptions: RequestOptions,
    ): TokenizationSecret =
        // get /v1/tokenization_decisioning/secret
        withRawResponse().retrieveSecret(params, requestOptions).parse()

    override fun rotateSecret(
        params: TokenizationDecisioningRotateSecretParams,
        requestOptions: RequestOptions,
    ): TokenizationDecisioningRotateSecretResponse =
        // post /v1/tokenization_decisioning/secret/rotate
        withRawResponse().rotateSecret(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        TokenizationDecisioningService.WithRawResponse {

        private val errorHandler: Handler<JsonValue> = errorHandler(clientOptions.jsonMapper)

        private val retrieveSecretHandler: Handler<TokenizationSecret> =
            jsonHandler<TokenizationSecret>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun retrieveSecret(
            params: TokenizationDecisioningRetrieveSecretParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<TokenizationSecret> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments("v1", "tokenization_decisioning", "secret")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
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

        override fun rotateSecret(
            params: TokenizationDecisioningRotateSecretParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<TokenizationDecisioningRotateSecretResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .addPathSegments("v1", "tokenization_decisioning", "secret", "rotate")
                    .apply { params._body()?.let { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
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
