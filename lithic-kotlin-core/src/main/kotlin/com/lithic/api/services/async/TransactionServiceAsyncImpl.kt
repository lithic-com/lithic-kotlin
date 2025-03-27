// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.services.async

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
import com.lithic.api.core.prepareAsync
import com.lithic.api.models.transactions.Transaction
import com.lithic.api.models.transactions.TransactionListPageAsync
import com.lithic.api.models.transactions.TransactionListParams
import com.lithic.api.models.transactions.TransactionRetrieveParams
import com.lithic.api.models.transactions.TransactionSimulateAuthorizationAdviceParams
import com.lithic.api.models.transactions.TransactionSimulateAuthorizationAdviceResponse
import com.lithic.api.models.transactions.TransactionSimulateAuthorizationParams
import com.lithic.api.models.transactions.TransactionSimulateAuthorizationResponse
import com.lithic.api.models.transactions.TransactionSimulateClearingParams
import com.lithic.api.models.transactions.TransactionSimulateClearingResponse
import com.lithic.api.models.transactions.TransactionSimulateCreditAuthorizationParams
import com.lithic.api.models.transactions.TransactionSimulateCreditAuthorizationResponse
import com.lithic.api.models.transactions.TransactionSimulateReturnParams
import com.lithic.api.models.transactions.TransactionSimulateReturnResponse
import com.lithic.api.models.transactions.TransactionSimulateReturnReversalParams
import com.lithic.api.models.transactions.TransactionSimulateReturnReversalResponse
import com.lithic.api.models.transactions.TransactionSimulateVoidParams
import com.lithic.api.models.transactions.TransactionSimulateVoidResponse
import com.lithic.api.services.async.transactions.EnhancedCommercialDataServiceAsync
import com.lithic.api.services.async.transactions.EnhancedCommercialDataServiceAsyncImpl
import com.lithic.api.services.async.transactions.EventServiceAsync
import com.lithic.api.services.async.transactions.EventServiceAsyncImpl

class TransactionServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    TransactionServiceAsync {

    private val withRawResponse: TransactionServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val enhancedCommercialData: EnhancedCommercialDataServiceAsync by lazy {
        EnhancedCommercialDataServiceAsyncImpl(clientOptions)
    }

    private val events: EventServiceAsync by lazy { EventServiceAsyncImpl(clientOptions) }

    override fun withRawResponse(): TransactionServiceAsync.WithRawResponse = withRawResponse

    override fun enhancedCommercialData(): EnhancedCommercialDataServiceAsync =
        enhancedCommercialData

    override fun events(): EventServiceAsync = events

    override suspend fun retrieve(
        params: TransactionRetrieveParams,
        requestOptions: RequestOptions,
    ): Transaction =
        // get /v1/transactions/{transaction_token}
        withRawResponse().retrieve(params, requestOptions).parse()

    override suspend fun list(
        params: TransactionListParams,
        requestOptions: RequestOptions,
    ): TransactionListPageAsync =
        // get /v1/transactions
        withRawResponse().list(params, requestOptions).parse()

    override suspend fun simulateAuthorization(
        params: TransactionSimulateAuthorizationParams,
        requestOptions: RequestOptions,
    ): TransactionSimulateAuthorizationResponse =
        // post /v1/simulate/authorize
        withRawResponse().simulateAuthorization(params, requestOptions).parse()

    override suspend fun simulateAuthorizationAdvice(
        params: TransactionSimulateAuthorizationAdviceParams,
        requestOptions: RequestOptions,
    ): TransactionSimulateAuthorizationAdviceResponse =
        // post /v1/simulate/authorization_advice
        withRawResponse().simulateAuthorizationAdvice(params, requestOptions).parse()

    override suspend fun simulateClearing(
        params: TransactionSimulateClearingParams,
        requestOptions: RequestOptions,
    ): TransactionSimulateClearingResponse =
        // post /v1/simulate/clearing
        withRawResponse().simulateClearing(params, requestOptions).parse()

    override suspend fun simulateCreditAuthorization(
        params: TransactionSimulateCreditAuthorizationParams,
        requestOptions: RequestOptions,
    ): TransactionSimulateCreditAuthorizationResponse =
        // post /v1/simulate/credit_authorization_advice
        withRawResponse().simulateCreditAuthorization(params, requestOptions).parse()

    override suspend fun simulateReturn(
        params: TransactionSimulateReturnParams,
        requestOptions: RequestOptions,
    ): TransactionSimulateReturnResponse =
        // post /v1/simulate/return
        withRawResponse().simulateReturn(params, requestOptions).parse()

    override suspend fun simulateReturnReversal(
        params: TransactionSimulateReturnReversalParams,
        requestOptions: RequestOptions,
    ): TransactionSimulateReturnReversalResponse =
        // post /v1/simulate/return_reversal
        withRawResponse().simulateReturnReversal(params, requestOptions).parse()

    override suspend fun simulateVoid(
        params: TransactionSimulateVoidParams,
        requestOptions: RequestOptions,
    ): TransactionSimulateVoidResponse =
        // post /v1/simulate/void
        withRawResponse().simulateVoid(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        TransactionServiceAsync.WithRawResponse {

        private val errorHandler: Handler<JsonValue> = errorHandler(clientOptions.jsonMapper)

        private val enhancedCommercialData:
            EnhancedCommercialDataServiceAsync.WithRawResponse by lazy {
            EnhancedCommercialDataServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val events: EventServiceAsync.WithRawResponse by lazy {
            EventServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun enhancedCommercialData(): EnhancedCommercialDataServiceAsync.WithRawResponse =
            enhancedCommercialData

        override fun events(): EventServiceAsync.WithRawResponse = events

        private val retrieveHandler: Handler<Transaction> =
            jsonHandler<Transaction>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override suspend fun retrieve(
            params: TransactionRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<Transaction> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments("v1", "transactions", params._pathParam(0))
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

        private val listHandler: Handler<TransactionListPageAsync.Response> =
            jsonHandler<TransactionListPageAsync.Response>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override suspend fun list(
            params: TransactionListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<TransactionListPageAsync> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments("v1", "transactions")
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
                        TransactionListPageAsync.of(
                            TransactionServiceAsyncImpl(clientOptions),
                            params,
                            it,
                        )
                    }
            }
        }

        private val simulateAuthorizationHandler:
            Handler<TransactionSimulateAuthorizationResponse> =
            jsonHandler<TransactionSimulateAuthorizationResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override suspend fun simulateAuthorization(
            params: TransactionSimulateAuthorizationParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<TransactionSimulateAuthorizationResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .addPathSegments("v1", "simulate", "authorize")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return response.parseable {
                response
                    .use { simulateAuthorizationHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val simulateAuthorizationAdviceHandler:
            Handler<TransactionSimulateAuthorizationAdviceResponse> =
            jsonHandler<TransactionSimulateAuthorizationAdviceResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override suspend fun simulateAuthorizationAdvice(
            params: TransactionSimulateAuthorizationAdviceParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<TransactionSimulateAuthorizationAdviceResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .addPathSegments("v1", "simulate", "authorization_advice")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return response.parseable {
                response
                    .use { simulateAuthorizationAdviceHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val simulateClearingHandler: Handler<TransactionSimulateClearingResponse> =
            jsonHandler<TransactionSimulateClearingResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override suspend fun simulateClearing(
            params: TransactionSimulateClearingParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<TransactionSimulateClearingResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .addPathSegments("v1", "simulate", "clearing")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return response.parseable {
                response
                    .use { simulateClearingHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val simulateCreditAuthorizationHandler:
            Handler<TransactionSimulateCreditAuthorizationResponse> =
            jsonHandler<TransactionSimulateCreditAuthorizationResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override suspend fun simulateCreditAuthorization(
            params: TransactionSimulateCreditAuthorizationParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<TransactionSimulateCreditAuthorizationResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .addPathSegments("v1", "simulate", "credit_authorization_advice")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return response.parseable {
                response
                    .use { simulateCreditAuthorizationHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val simulateReturnHandler: Handler<TransactionSimulateReturnResponse> =
            jsonHandler<TransactionSimulateReturnResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override suspend fun simulateReturn(
            params: TransactionSimulateReturnParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<TransactionSimulateReturnResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .addPathSegments("v1", "simulate", "return")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return response.parseable {
                response
                    .use { simulateReturnHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val simulateReturnReversalHandler:
            Handler<TransactionSimulateReturnReversalResponse> =
            jsonHandler<TransactionSimulateReturnReversalResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override suspend fun simulateReturnReversal(
            params: TransactionSimulateReturnReversalParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<TransactionSimulateReturnReversalResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .addPathSegments("v1", "simulate", "return_reversal")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return response.parseable {
                response
                    .use { simulateReturnReversalHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val simulateVoidHandler: Handler<TransactionSimulateVoidResponse> =
            jsonHandler<TransactionSimulateVoidResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override suspend fun simulateVoid(
            params: TransactionSimulateVoidParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<TransactionSimulateVoidResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .addPathSegments("v1", "simulate", "void")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return response.parseable {
                response
                    .use { simulateVoidHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }
    }
}
