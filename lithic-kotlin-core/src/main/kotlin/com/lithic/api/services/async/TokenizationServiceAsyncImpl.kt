// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.services.async

import com.lithic.api.core.ClientOptions
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
import com.lithic.api.core.http.parseable
import com.lithic.api.core.json
import com.lithic.api.core.prepareAsync
import com.lithic.api.errors.LithicError
import com.lithic.api.models.TokenizationActivateParams
import com.lithic.api.models.TokenizationDeactivateParams
import com.lithic.api.models.TokenizationListPageAsync
import com.lithic.api.models.TokenizationListParams
import com.lithic.api.models.TokenizationPauseParams
import com.lithic.api.models.TokenizationResendActivationCodeParams
import com.lithic.api.models.TokenizationRetrieveParams
import com.lithic.api.models.TokenizationRetrieveResponse
import com.lithic.api.models.TokenizationSimulateParams
import com.lithic.api.models.TokenizationSimulateResponse
import com.lithic.api.models.TokenizationUnpauseParams
import com.lithic.api.models.TokenizationUpdateDigitalCardArtParams
import com.lithic.api.models.TokenizationUpdateDigitalCardArtResponse

class TokenizationServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    TokenizationServiceAsync {

    private val withRawResponse: TokenizationServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): TokenizationServiceAsync.WithRawResponse = withRawResponse

    override suspend fun retrieve(
        params: TokenizationRetrieveParams,
        requestOptions: RequestOptions,
    ): TokenizationRetrieveResponse =
        // get /v1/tokenizations/{tokenization_token}
        withRawResponse().retrieve(params, requestOptions).parse()

    override suspend fun list(
        params: TokenizationListParams,
        requestOptions: RequestOptions,
    ): TokenizationListPageAsync =
        // get /v1/tokenizations
        withRawResponse().list(params, requestOptions).parse()

    override suspend fun activate(
        params: TokenizationActivateParams,
        requestOptions: RequestOptions,
    ) {
        // post /v1/tokenizations/{tokenization_token}/activate
        withRawResponse().activate(params, requestOptions)
    }

    override suspend fun deactivate(
        params: TokenizationDeactivateParams,
        requestOptions: RequestOptions,
    ) {
        // post /v1/tokenizations/{tokenization_token}/deactivate
        withRawResponse().deactivate(params, requestOptions)
    }

    override suspend fun pause(params: TokenizationPauseParams, requestOptions: RequestOptions) {
        // post /v1/tokenizations/{tokenization_token}/pause
        withRawResponse().pause(params, requestOptions)
    }

    override suspend fun resendActivationCode(
        params: TokenizationResendActivationCodeParams,
        requestOptions: RequestOptions,
    ) {
        // post /v1/tokenizations/{tokenization_token}/resend_activation_code
        withRawResponse().resendActivationCode(params, requestOptions)
    }

    override suspend fun simulate(
        params: TokenizationSimulateParams,
        requestOptions: RequestOptions,
    ): TokenizationSimulateResponse =
        // post /v1/simulate/tokenizations
        withRawResponse().simulate(params, requestOptions).parse()

    override suspend fun unpause(
        params: TokenizationUnpauseParams,
        requestOptions: RequestOptions,
    ) {
        // post /v1/tokenizations/{tokenization_token}/unpause
        withRawResponse().unpause(params, requestOptions)
    }

    override suspend fun updateDigitalCardArt(
        params: TokenizationUpdateDigitalCardArtParams,
        requestOptions: RequestOptions,
    ): TokenizationUpdateDigitalCardArtResponse =
        // post /v1/tokenizations/{tokenization_token}/update_digital_card_art
        withRawResponse().updateDigitalCardArt(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        TokenizationServiceAsync.WithRawResponse {

        private val errorHandler: Handler<LithicError> = errorHandler(clientOptions.jsonMapper)

        private val retrieveHandler: Handler<TokenizationRetrieveResponse> =
            jsonHandler<TokenizationRetrieveResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override suspend fun retrieve(
            params: TokenizationRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<TokenizationRetrieveResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments("v1", "tokenizations", params.getPathParam(0))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return response.parseable {
                response
                    .use { retrieveHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val listHandler: Handler<TokenizationListPageAsync.Response> =
            jsonHandler<TokenizationListPageAsync.Response>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override suspend fun list(
            params: TokenizationListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<TokenizationListPageAsync> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments("v1", "tokenizations")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return response.parseable {
                response
                    .use { listHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
                    .let {
                        TokenizationListPageAsync.of(
                            TokenizationServiceAsyncImpl(clientOptions),
                            params,
                            it,
                        )
                    }
            }
        }

        private val activateHandler: Handler<Void?> = emptyHandler().withErrorHandler(errorHandler)

        override suspend fun activate(
            params: TokenizationActivateParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .addPathSegments("v1", "tokenizations", params.getPathParam(0), "activate")
                    .apply { params._body()?.let { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return response.parseable { response.use { activateHandler.handle(it) } }
        }

        private val deactivateHandler: Handler<Void?> =
            emptyHandler().withErrorHandler(errorHandler)

        override suspend fun deactivate(
            params: TokenizationDeactivateParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .addPathSegments("v1", "tokenizations", params.getPathParam(0), "deactivate")
                    .apply { params._body()?.let { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return response.parseable { response.use { deactivateHandler.handle(it) } }
        }

        private val pauseHandler: Handler<Void?> = emptyHandler().withErrorHandler(errorHandler)

        override suspend fun pause(
            params: TokenizationPauseParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .addPathSegments("v1", "tokenizations", params.getPathParam(0), "pause")
                    .apply { params._body()?.let { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return response.parseable { response.use { pauseHandler.handle(it) } }
        }

        private val resendActivationCodeHandler: Handler<Void?> =
            emptyHandler().withErrorHandler(errorHandler)

        override suspend fun resendActivationCode(
            params: TokenizationResendActivationCodeParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .addPathSegments(
                        "v1",
                        "tokenizations",
                        params.getPathParam(0),
                        "resend_activation_code",
                    )
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return response.parseable { response.use { resendActivationCodeHandler.handle(it) } }
        }

        private val simulateHandler: Handler<TokenizationSimulateResponse> =
            jsonHandler<TokenizationSimulateResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override suspend fun simulate(
            params: TokenizationSimulateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<TokenizationSimulateResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .addPathSegments("v1", "simulate", "tokenizations")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return response.parseable {
                response
                    .use { simulateHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val unpauseHandler: Handler<Void?> = emptyHandler().withErrorHandler(errorHandler)

        override suspend fun unpause(
            params: TokenizationUnpauseParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .addPathSegments("v1", "tokenizations", params.getPathParam(0), "unpause")
                    .apply { params._body()?.let { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return response.parseable { response.use { unpauseHandler.handle(it) } }
        }

        private val updateDigitalCardArtHandler: Handler<TokenizationUpdateDigitalCardArtResponse> =
            jsonHandler<TokenizationUpdateDigitalCardArtResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override suspend fun updateDigitalCardArt(
            params: TokenizationUpdateDigitalCardArtParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<TokenizationUpdateDigitalCardArtResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .addPathSegments(
                        "v1",
                        "tokenizations",
                        params.getPathParam(0),
                        "update_digital_card_art",
                    )
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return response.parseable {
                response
                    .use { updateDigitalCardArtHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }
    }
}
