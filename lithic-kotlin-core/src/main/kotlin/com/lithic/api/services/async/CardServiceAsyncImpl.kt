// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.services.async

import com.lithic.api.core.ClientOptions
import com.lithic.api.core.RequestOptions
import com.lithic.api.core.handlers.errorHandler
import com.lithic.api.core.handlers.jsonHandler
import com.lithic.api.core.handlers.stringHandler
import com.lithic.api.core.handlers.withErrorHandler
import com.lithic.api.core.http.HttpMethod
import com.lithic.api.core.http.HttpRequest
import com.lithic.api.core.http.HttpResponse.Handler
import com.lithic.api.core.http.HttpResponseFor
import com.lithic.api.core.http.parseable
import com.lithic.api.core.json
import com.lithic.api.core.prepareAsync
import com.lithic.api.errors.LithicError
import com.lithic.api.models.Card
import com.lithic.api.models.CardConvertPhysicalParams
import com.lithic.api.models.CardCreateParams
import com.lithic.api.models.CardEmbedParams
import com.lithic.api.models.CardListPageAsync
import com.lithic.api.models.CardListParams
import com.lithic.api.models.CardProvisionParams
import com.lithic.api.models.CardProvisionResponse
import com.lithic.api.models.CardReissueParams
import com.lithic.api.models.CardRenewParams
import com.lithic.api.models.CardRetrieveParams
import com.lithic.api.models.CardRetrieveSpendLimitsParams
import com.lithic.api.models.CardSearchByPanParams
import com.lithic.api.models.CardSpendLimits
import com.lithic.api.models.CardUpdateParams
import com.lithic.api.services.async.cards.AggregateBalanceServiceAsync
import com.lithic.api.services.async.cards.AggregateBalanceServiceAsyncImpl
import com.lithic.api.services.async.cards.BalanceServiceAsync
import com.lithic.api.services.async.cards.BalanceServiceAsyncImpl
import com.lithic.api.services.async.cards.FinancialTransactionServiceAsync
import com.lithic.api.services.async.cards.FinancialTransactionServiceAsyncImpl

class CardServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    CardServiceAsync {

    private val withRawResponse: CardServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val aggregateBalances: AggregateBalanceServiceAsync by lazy {
        AggregateBalanceServiceAsyncImpl(clientOptions)
    }

    private val balances: BalanceServiceAsync by lazy { BalanceServiceAsyncImpl(clientOptions) }

    private val financialTransactions: FinancialTransactionServiceAsync by lazy {
        FinancialTransactionServiceAsyncImpl(clientOptions)
    }

    override fun withRawResponse(): CardServiceAsync.WithRawResponse = withRawResponse

    override fun aggregateBalances(): AggregateBalanceServiceAsync = aggregateBalances

    override fun balances(): BalanceServiceAsync = balances

    override fun financialTransactions(): FinancialTransactionServiceAsync = financialTransactions

    override suspend fun create(params: CardCreateParams, requestOptions: RequestOptions): Card =
        // post /v1/cards
        withRawResponse().create(params, requestOptions).parse()

    override suspend fun retrieve(
        params: CardRetrieveParams,
        requestOptions: RequestOptions,
    ): Card =
        // get /v1/cards/{card_token}
        withRawResponse().retrieve(params, requestOptions).parse()

    override suspend fun update(params: CardUpdateParams, requestOptions: RequestOptions): Card =
        // patch /v1/cards/{card_token}
        withRawResponse().update(params, requestOptions).parse()

    override suspend fun list(
        params: CardListParams,
        requestOptions: RequestOptions,
    ): CardListPageAsync =
        // get /v1/cards
        withRawResponse().list(params, requestOptions).parse()

    override suspend fun convertPhysical(
        params: CardConvertPhysicalParams,
        requestOptions: RequestOptions,
    ): Card =
        // post /v1/cards/{card_token}/convert_physical
        withRawResponse().convertPhysical(params, requestOptions).parse()

    override suspend fun embed(params: CardEmbedParams, requestOptions: RequestOptions): String =
        // get /v1/embed/card
        withRawResponse().embed(params, requestOptions).parse()

    override suspend fun provision(
        params: CardProvisionParams,
        requestOptions: RequestOptions,
    ): CardProvisionResponse =
        // post /v1/cards/{card_token}/provision
        withRawResponse().provision(params, requestOptions).parse()

    override suspend fun reissue(params: CardReissueParams, requestOptions: RequestOptions): Card =
        // post /v1/cards/{card_token}/reissue
        withRawResponse().reissue(params, requestOptions).parse()

    override suspend fun renew(params: CardRenewParams, requestOptions: RequestOptions): Card =
        // post /v1/cards/{card_token}/renew
        withRawResponse().renew(params, requestOptions).parse()

    override suspend fun retrieveSpendLimits(
        params: CardRetrieveSpendLimitsParams,
        requestOptions: RequestOptions,
    ): CardSpendLimits =
        // get /v1/cards/{card_token}/spend_limits
        withRawResponse().retrieveSpendLimits(params, requestOptions).parse()

    override suspend fun searchByPan(
        params: CardSearchByPanParams,
        requestOptions: RequestOptions,
    ): Card =
        // post /v1/cards/search_by_pan
        withRawResponse().searchByPan(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        CardServiceAsync.WithRawResponse {

        private val errorHandler: Handler<LithicError> = errorHandler(clientOptions.jsonMapper)

        private val aggregateBalances: AggregateBalanceServiceAsync.WithRawResponse by lazy {
            AggregateBalanceServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val balances: BalanceServiceAsync.WithRawResponse by lazy {
            BalanceServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val financialTransactions:
            FinancialTransactionServiceAsync.WithRawResponse by lazy {
            FinancialTransactionServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun aggregateBalances(): AggregateBalanceServiceAsync.WithRawResponse =
            aggregateBalances

        override fun balances(): BalanceServiceAsync.WithRawResponse = balances

        override fun financialTransactions(): FinancialTransactionServiceAsync.WithRawResponse =
            financialTransactions

        private val createHandler: Handler<Card> =
            jsonHandler<Card>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override suspend fun create(
            params: CardCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<Card> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .addPathSegments("v1", "cards")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return response.parseable {
                response
                    .use { createHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val retrieveHandler: Handler<Card> =
            jsonHandler<Card>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override suspend fun retrieve(
            params: CardRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<Card> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments("v1", "cards", params.getPathParam(0))
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

        private val updateHandler: Handler<Card> =
            jsonHandler<Card>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override suspend fun update(
            params: CardUpdateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<Card> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PATCH)
                    .addPathSegments("v1", "cards", params.getPathParam(0))
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return response.parseable {
                response
                    .use { updateHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val listHandler: Handler<CardListPageAsync.Response> =
            jsonHandler<CardListPageAsync.Response>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override suspend fun list(
            params: CardListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CardListPageAsync> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments("v1", "cards")
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
                    .let { CardListPageAsync.of(CardServiceAsyncImpl(clientOptions), params, it) }
            }
        }

        private val convertPhysicalHandler: Handler<Card> =
            jsonHandler<Card>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override suspend fun convertPhysical(
            params: CardConvertPhysicalParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<Card> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .addPathSegments("v1", "cards", params.getPathParam(0), "convert_physical")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return response.parseable {
                response
                    .use { convertPhysicalHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val embedHandler: Handler<String> = stringHandler().withErrorHandler(errorHandler)

        override suspend fun embed(
            params: CardEmbedParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<String> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments("v1", "embed", "card")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return response.parseable { response.use { embedHandler.handle(it) } }
        }

        private val provisionHandler: Handler<CardProvisionResponse> =
            jsonHandler<CardProvisionResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override suspend fun provision(
            params: CardProvisionParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CardProvisionResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .addPathSegments("v1", "cards", params.getPathParam(0), "provision")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return response.parseable {
                response
                    .use { provisionHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val reissueHandler: Handler<Card> =
            jsonHandler<Card>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override suspend fun reissue(
            params: CardReissueParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<Card> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .addPathSegments("v1", "cards", params.getPathParam(0), "reissue")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return response.parseable {
                response
                    .use { reissueHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val renewHandler: Handler<Card> =
            jsonHandler<Card>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override suspend fun renew(
            params: CardRenewParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<Card> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .addPathSegments("v1", "cards", params.getPathParam(0), "renew")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return response.parseable {
                response
                    .use { renewHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val retrieveSpendLimitsHandler: Handler<CardSpendLimits> =
            jsonHandler<CardSpendLimits>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override suspend fun retrieveSpendLimits(
            params: CardRetrieveSpendLimitsParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CardSpendLimits> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments("v1", "cards", params.getPathParam(0), "spend_limits")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return response.parseable {
                response
                    .use { retrieveSpendLimitsHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val searchByPanHandler: Handler<Card> =
            jsonHandler<Card>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override suspend fun searchByPan(
            params: CardSearchByPanParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<Card> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .addPathSegments("v1", "cards", "search_by_pan")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return response.parseable {
                response
                    .use { searchByPanHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }
    }
}
