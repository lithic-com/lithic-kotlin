// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.services.async

import com.lithic.api.core.ClientOptions
import com.lithic.api.core.JsonValue
import com.lithic.api.core.RequestOptions
import com.lithic.api.core.checkRequired
import com.lithic.api.core.handlers.errorHandler
import com.lithic.api.core.handlers.jsonHandler
import com.lithic.api.core.handlers.stringHandler
import com.lithic.api.core.handlers.withErrorHandler
import com.lithic.api.core.http.HttpMethod
import com.lithic.api.core.http.HttpRequest
import com.lithic.api.core.http.HttpResponse.Handler
import com.lithic.api.core.http.HttpResponseFor
import com.lithic.api.core.http.json
import com.lithic.api.core.http.parseable
import com.lithic.api.core.prepareAsync
import com.lithic.api.models.Card
import com.lithic.api.models.CardConvertPhysicalParams
import com.lithic.api.models.CardCreateParams
import com.lithic.api.models.CardEmbedParams
import com.lithic.api.models.CardGetEmbedHtmlParams
import com.lithic.api.models.CardGetEmbedUrlParams
import com.lithic.api.models.CardListPageAsync
import com.lithic.api.models.CardListPageResponse
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
import com.lithic.api.models.CardWebProvisionParams
import com.lithic.api.models.CardWebProvisionResponse
import com.lithic.api.services.async.cards.AggregateBalanceServiceAsync
import com.lithic.api.services.async.cards.AggregateBalanceServiceAsyncImpl
import com.lithic.api.services.async.cards.BalanceServiceAsync
import com.lithic.api.services.async.cards.BalanceServiceAsyncImpl
import com.lithic.api.services.async.cards.FinancialTransactionServiceAsync
import com.lithic.api.services.async.cards.FinancialTransactionServiceAsyncImpl
import java.net.URI
import java.util.Base64
import javax.crypto.Mac
import javax.crypto.spec.SecretKeySpec
import org.apache.hc.core5.net.URIBuilder

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

    override fun withOptions(modifier: (ClientOptions.Builder) -> Unit): CardServiceAsync =
        CardServiceAsyncImpl(clientOptions.toBuilder().apply(modifier).build())

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

    override suspend fun webProvision(
        params: CardWebProvisionParams,
        requestOptions: RequestOptions,
    ): CardWebProvisionResponse =
        // post /v1/cards/{card_token}/web_provision
        withRawResponse().webProvision(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        CardServiceAsync.WithRawResponse {

        private val errorHandler: Handler<JsonValue> = errorHandler(clientOptions.jsonMapper)

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

        override fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): CardServiceAsync.WithRawResponse =
            CardServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier).build()
            )

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
                    .baseUrl(clientOptions.baseUrl())
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
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("cardToken", params.cardToken())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "cards", params._pathParam(0))
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
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("cardToken", params.cardToken())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PATCH)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "cards", params._pathParam(0))
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

        private val listHandler: Handler<CardListPageResponse> =
            jsonHandler<CardListPageResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override suspend fun list(
            params: CardListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CardListPageAsync> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
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
                    .let {
                        CardListPageAsync.builder()
                            .service(CardServiceAsyncImpl(clientOptions))
                            .params(params)
                            .response(it)
                            .build()
                    }
            }
        }

        private val convertPhysicalHandler: Handler<Card> =
            jsonHandler<Card>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override suspend fun convertPhysical(
            params: CardConvertPhysicalParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<Card> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("cardToken", params.cardToken())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "cards", params._pathParam(0), "convert_physical")
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
                    .baseUrl(clientOptions.baseUrl())
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
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("cardToken", params.cardToken())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "cards", params._pathParam(0), "provision")
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
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("cardToken", params.cardToken())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "cards", params._pathParam(0), "reissue")
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
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("cardToken", params.cardToken())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "cards", params._pathParam(0), "renew")
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
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("cardToken", params.cardToken())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "cards", params._pathParam(0), "spend_limits")
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
                    .baseUrl(clientOptions.baseUrl())
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

        private val webProvisionHandler: Handler<CardWebProvisionResponse> =
            jsonHandler<CardWebProvisionResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override suspend fun webProvision(
            params: CardWebProvisionParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CardWebProvisionResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("cardToken", params.cardToken())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "cards", params._pathParam(0), "web_provision")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return response.parseable {
                response
                    .use { webProvisionHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }
    }

    private val errorHandler: Handler<JsonValue> = errorHandler(clientOptions.jsonMapper)
    private val embedHandler: Handler<String> = stringHandler().withErrorHandler(errorHandler)

    override suspend fun getEmbedHtml(
        params: CardGetEmbedHtmlParams,
        requestOptions: RequestOptions,
    ): String {
        val embed_request =
            Base64.getEncoder()
                .encodeToString(clientOptions.jsonMapper.writeValueAsBytes(params.getBody()))

        val mac: Mac = Mac.getInstance("HmacSHA256")
        mac.init(SecretKeySpec(clientOptions.apiKey.toByteArray(), "HmacSHA256"))
        val embed_request_hmac =
            Base64.getEncoder().encodeToString(mac.doFinal(embed_request.toByteArray()))

        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .baseUrl(clientOptions.baseUrl())
                .addPathSegments("v1", "embed", "card")
                .putQueryParam("embed_request", embed_request)
                .putQueryParam("hmac", embed_request_hmac)
                .putAllHeaders(clientOptions.headers)
                .replaceAllHeaders(params.getHeaders())
                .putHeader("Accept", "text/html")
                .build()
        return clientOptions.httpClient.executeAsync(request).let { response ->
            response.let { embedHandler.handle(it) }
        }
    }

    override suspend fun getEmbedUrl(
        params: CardGetEmbedUrlParams,
        requestOptions: RequestOptions,
    ): String {
        val embed_request =
            Base64.getEncoder()
                .encodeToString(clientOptions.jsonMapper.writeValueAsBytes(params.getBody()))

        val mac: Mac = Mac.getInstance("HmacSHA256")
        mac.init(SecretKeySpec(clientOptions.apiKey.toByteArray(), "HmacSHA256"))
        val embed_request_hmac =
            Base64.getEncoder().encodeToString(mac.doFinal(embed_request.toByteArray()))

        return URIBuilder(URI.create(clientOptions.baseUrl()))
            .appendPathSegments("embed", "card")
            .addParameter("embed_request", embed_request)
            .addParameter("hmac", embed_request_hmac)
            .toString()
    }
}
