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
import com.lithic.api.core.json
import com.lithic.api.core.prepareAsync
import com.lithic.api.errors.LithicError
import com.lithic.api.models.Card
import com.lithic.api.models.CardConvertPhysicalParams
import com.lithic.api.models.CardCreateParams
import com.lithic.api.models.CardEmbedParams
import com.lithic.api.models.CardGetEmbedHtmlParams
import com.lithic.api.models.CardGetEmbedUrlParams
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
import java.net.URI
import java.util.Base64
import javax.crypto.Mac
import javax.crypto.spec.SecretKeySpec
import org.apache.hc.core5.net.URIBuilder

class CardServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    CardServiceAsync {

    private val errorHandler: Handler<LithicError> = errorHandler(clientOptions.jsonMapper)

    private val aggregateBalances: AggregateBalanceServiceAsync by lazy {
        AggregateBalanceServiceAsyncImpl(clientOptions)
    }

    private val balances: BalanceServiceAsync by lazy { BalanceServiceAsyncImpl(clientOptions) }

    private val financialTransactions: FinancialTransactionServiceAsync by lazy {
        FinancialTransactionServiceAsyncImpl(clientOptions)
    }

    override fun aggregateBalances(): AggregateBalanceServiceAsync = aggregateBalances

    override fun balances(): BalanceServiceAsync = balances

    override fun financialTransactions(): FinancialTransactionServiceAsync = financialTransactions

    private val createHandler: Handler<Card> =
        jsonHandler<Card>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /**
     * Create a new virtual or physical card. Parameters `shipping_address` and `product_id` only
     * apply to physical cards.
     */
    override suspend fun create(params: CardCreateParams, requestOptions: RequestOptions): Card {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("v1", "cards")
                .body(json(clientOptions.jsonMapper, params._body()))
                .build()
                .prepareAsync(clientOptions, params)
        val response = clientOptions.httpClient.executeAsync(request, requestOptions)
        return response
            .use { createHandler.handle(it) }
            .also {
                if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                    it.validate()
                }
            }
    }

    private val retrieveHandler: Handler<Card> =
        jsonHandler<Card>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** Get card configuration such as spend limit and state. */
    override suspend fun retrieve(
        params: CardRetrieveParams,
        requestOptions: RequestOptions,
    ): Card {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("v1", "cards", params.getPathParam(0))
                .build()
                .prepareAsync(clientOptions, params)
        val response = clientOptions.httpClient.executeAsync(request, requestOptions)
        return response
            .use { retrieveHandler.handle(it) }
            .also {
                if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                    it.validate()
                }
            }
    }

    private val updateHandler: Handler<Card> =
        jsonHandler<Card>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /**
     * Update the specified properties of the card. Unsupplied properties will remain unchanged.
     *
     * _Note: setting a card to a `CLOSED` state is a final action that cannot be undone._
     */
    override suspend fun update(params: CardUpdateParams, requestOptions: RequestOptions): Card {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.PATCH)
                .addPathSegments("v1", "cards", params.getPathParam(0))
                .body(json(clientOptions.jsonMapper, params._body()))
                .build()
                .prepareAsync(clientOptions, params)
        val response = clientOptions.httpClient.executeAsync(request, requestOptions)
        return response
            .use { updateHandler.handle(it) }
            .also {
                if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                    it.validate()
                }
            }
    }

    private val listHandler: Handler<CardListPageAsync.Response> =
        jsonHandler<CardListPageAsync.Response>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /** List cards. */
    override suspend fun list(
        params: CardListParams,
        requestOptions: RequestOptions,
    ): CardListPageAsync {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("v1", "cards")
                .build()
                .prepareAsync(clientOptions, params)
        val response = clientOptions.httpClient.executeAsync(request, requestOptions)
        return response
            .use { listHandler.handle(it) }
            .also {
                if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                    it.validate()
                }
            }
            .let { CardListPageAsync.of(this, params, it) }
    }

    private val convertPhysicalHandler: Handler<Card> =
        jsonHandler<Card>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /**
     * Convert a virtual card into a physical card and manufacture it. Customer must supply relevant
     * fields for physical card creation including `product_id`, `carrier`, `shipping_method`, and
     * `shipping_address`. The card token will be unchanged. The card's type will be altered to
     * `PHYSICAL`. The card will be set to state `PENDING_FULFILLMENT` and fulfilled at next
     * fulfillment cycle. Virtual cards created on card programs which do not support physical cards
     * cannot be converted. The card program cannot be changed as part of the conversion. Cards must
     * be in an `OPEN` state to be converted. Only applies to cards of type `VIRTUAL` (or existing
     * cards with deprecated types of `DIGITAL_WALLET` and `UNLOCKED`).
     */
    override suspend fun convertPhysical(
        params: CardConvertPhysicalParams,
        requestOptions: RequestOptions,
    ): Card {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("v1", "cards", params.getPathParam(0), "convert_physical")
                .body(json(clientOptions.jsonMapper, params._body()))
                .build()
                .prepareAsync(clientOptions, params)
        val response = clientOptions.httpClient.executeAsync(request, requestOptions)
        return response
            .use { convertPhysicalHandler.handle(it) }
            .also {
                if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                    it.validate()
                }
            }
    }

    private val embedHandler: Handler<String> = stringHandler().withErrorHandler(errorHandler)

    /**
     * Handling full card PANs and CVV codes requires that you comply with the Payment Card Industry
     * Data Security Standards (PCI DSS). Some clients choose to reduce their compliance obligations
     * by leveraging our embedded card UI solution documented below.
     *
     * In this setup, PANs and CVV codes are presented to the end-user via a card UI that we
     * provide, optionally styled in the customer's branding using a specified css stylesheet. A
     * user's browser makes the request directly to api.lithic.com, so card PANs and CVVs never
     * touch the API customer's servers while full card data is displayed to their end-users. The
     * response contains an HTML document (see Embedded Card UI or Changelog for upcoming changes in
     * January). This means that the url for the request can be inserted straight into the `src`
     * attribute of an iframe.
     *
     * ```html
     * <iframe
     *   id="card-iframe"
     *   src="https://sandbox.lithic.com/v1/embed/card?embed_request=eyJjc3MiO...;hmac=r8tx1..."
     *   allow="clipboard-write"
     *   class="content"
     * ></iframe>
     * ```
     *
     * You should compute the request payload on the server side. You can render it (or the whole
     * iframe) on the server or make an ajax call from your front end code, but **do not ever embed
     * your API key into front end code, as doing so introduces a serious security vulnerability**.
     */
    override suspend fun embed(params: CardEmbedParams, requestOptions: RequestOptions): String {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("v1", "embed", "card")
                .build()
                .prepareAsync(clientOptions, params)
        val response = clientOptions.httpClient.executeAsync(request, requestOptions)
        return response.use { embedHandler.handle(it) }
    }

    private val provisionHandler: Handler<CardProvisionResponse> =
        jsonHandler<CardProvisionResponse>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /**
     * Allow your cardholders to directly add payment cards to the device's digital wallet (e.g.
     * Apple Pay) with one touch from your app.
     *
     * This requires some additional setup and configuration. Please
     * [Contact Us](https://lithic.com/contact) or your Customer Success representative for more
     * information.
     */
    override suspend fun provision(
        params: CardProvisionParams,
        requestOptions: RequestOptions,
    ): CardProvisionResponse {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("v1", "cards", params.getPathParam(0), "provision")
                .body(json(clientOptions.jsonMapper, params._body()))
                .build()
                .prepareAsync(clientOptions, params)
        val response = clientOptions.httpClient.executeAsync(request, requestOptions)
        return response
            .use { provisionHandler.handle(it) }
            .also {
                if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                    it.validate()
                }
            }
    }

    private val reissueHandler: Handler<Card> =
        jsonHandler<Card>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /**
     * Initiate print and shipment of a duplicate physical card (e.g. card is physically damaged).
     * The PAN, expiry, and CVC2 will remain the same and the original card can continue to be used
     * until the new card is activated. Only applies to cards of type `PHYSICAL`. A card can be
     * replaced or renewed a total of 8 times.
     */
    override suspend fun reissue(params: CardReissueParams, requestOptions: RequestOptions): Card {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("v1", "cards", params.getPathParam(0), "reissue")
                .body(json(clientOptions.jsonMapper, params._body()))
                .build()
                .prepareAsync(clientOptions, params)
        val response = clientOptions.httpClient.executeAsync(request, requestOptions)
        return response
            .use { reissueHandler.handle(it) }
            .also {
                if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                    it.validate()
                }
            }
    }

    private val renewHandler: Handler<Card> =
        jsonHandler<Card>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /**
     * Creates a new card with the same card token and PAN, but updated expiry and CVC2 code. The
     * original card will keep working for card-present transactions until the new card is
     * activated. For card-not-present transactions, the original card details (expiry, CVC2) will
     * also keep working until the new card is activated. Applies to card types `PHYSICAL` and
     * `VIRTUAL`. A card can be replaced or renewed a total of 8 times.
     */
    override suspend fun renew(params: CardRenewParams, requestOptions: RequestOptions): Card {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("v1", "cards", params.getPathParam(0), "renew")
                .body(json(clientOptions.jsonMapper, params._body()))
                .build()
                .prepareAsync(clientOptions, params)
        val response = clientOptions.httpClient.executeAsync(request, requestOptions)
        return response
            .use { renewHandler.handle(it) }
            .also {
                if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                    it.validate()
                }
            }
    }

    private val retrieveSpendLimitsHandler: Handler<CardSpendLimits> =
        jsonHandler<CardSpendLimits>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /**
     * Get a Card's available spend limit, which is based on the spend limit configured on the Card
     * and the amount already spent over the spend limit's duration. For example, if the Card has a
     * monthly spend limit of $1000 configured, and has spent $600 in the last month, the available
     * spend limit returned would be $400.
     */
    override suspend fun retrieveSpendLimits(
        params: CardRetrieveSpendLimitsParams,
        requestOptions: RequestOptions,
    ): CardSpendLimits {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("v1", "cards", params.getPathParam(0), "spend_limits")
                .build()
                .prepareAsync(clientOptions, params)
        val response = clientOptions.httpClient.executeAsync(request, requestOptions)
        return response
            .use { retrieveSpendLimitsHandler.handle(it) }
            .also {
                if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                    it.validate()
                }
            }
    }

    private val searchByPanHandler: Handler<Card> =
        jsonHandler<Card>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /**
     * Get card configuration such as spend limit and state. Customers must be PCI compliant to use
     * this endpoint. Please contact [support@lithic.com](mailto:support@lithic.com) for questions.
     * _Note: this is a `POST` endpoint because it is more secure to send sensitive data in a
     * request body than in a URL._
     */
    override suspend fun searchByPan(
        params: CardSearchByPanParams,
        requestOptions: RequestOptions,
    ): Card {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("v1", "cards", "search_by_pan")
                .body(json(clientOptions.jsonMapper, params._body()))
                .build()
                .prepareAsync(clientOptions, params)
        val response = clientOptions.httpClient.executeAsync(request, requestOptions)
        return response
            .use { searchByPanHandler.handle(it) }
            .also {
                if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                    it.validate()
                }
            }
    }

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

        return URIBuilder(URI.create(clientOptions.baseUrl))
            .appendPathSegments("embed", "card")
            .addParameter("embed_request", embed_request)
            .addParameter("hmac", embed_request_hmac)
            .toString()
    }
}
