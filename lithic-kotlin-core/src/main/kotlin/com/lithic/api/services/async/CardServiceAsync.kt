// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.services.async

import com.lithic.api.core.RequestOptions
import com.lithic.api.models.Card
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
import com.lithic.api.services.async.cards.BalanceServiceAsync
import com.lithic.api.services.async.cards.FinancialTransactionServiceAsync

interface CardServiceAsync {

    fun aggregateBalances(): AggregateBalanceServiceAsync

    fun balances(): BalanceServiceAsync

    fun financialTransactions(): FinancialTransactionServiceAsync

    /**
     * Create a new virtual or physical card. Parameters `pin`, `shipping_address`, and `product_id`
     * only apply to physical cards.
     */
    suspend fun create(
        params: CardCreateParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): Card

    /** Get card configuration such as spend limit and state. */
    suspend fun retrieve(
        params: CardRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): Card

    /**
     * Update the specified properties of the card. Unsupplied properties will remain unchanged.
     * `pin` parameter only applies to physical cards.
     *
     * _Note: setting a card to a `CLOSED` state is a final action that cannot be undone._
     */
    suspend fun update(
        params: CardUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): Card

    /** List cards. */
    suspend fun list(
        params: CardListParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CardListPageAsync

    /**
     * Handling full card PANs and CVV codes requires that you comply with the Payment Card Industry
     * Data Security Standards (PCI DSS). Some clients choose to reduce their compliance obligations
     * by leveraging our embedded card UI solution documented below.
     *
     * In this setup, PANs and CVV codes are presented to the end-user via a card UI that we
     * provide, optionally styled in the customer's branding using a specified css stylesheet. A
     * user's browser makes the request directly to api.lithic.com, so card PANs and CVVs never
     * touch the API customer's servers while full card data is displayed to their end-users. The
     * response contains an HTML document. This means that the url for the request can be inserted
     * straight into the `src` attribute of an iframe.
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
    suspend fun embed(
        params: CardEmbedParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): String

    /**
     * Allow your cardholders to directly add payment cards to the device's digital wallet (e.g.
     * Apple Pay) with one touch from your app.
     *
     * This requires some additional setup and configuration. Please
     * [Contact Us](https://lithic.com/contact) or your Customer Success representative for more
     * information.
     */
    suspend fun provision(
        params: CardProvisionParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CardProvisionResponse

    /**
     * Initiate print and shipment of a duplicate physical card.
     *
     * Only applies to cards of type `PHYSICAL`.
     */
    suspend fun reissue(
        params: CardReissueParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): Card

    /**
     * Initiate print and shipment of a renewed physical card.
     *
     * Only applies to cards of type `PHYSICAL`.
     */
    suspend fun renew(
        params: CardRenewParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): Card

    /**
     * Get a Card's available spend limit, which is based on the spend limit configured on the Card
     * and the amount already spent over the spend limit's duration. For example, if the Card has a
     * monthly spend limit of $1000 configured, and has spent $600 in the last month, the available
     * spend limit returned would be $400.
     */
    suspend fun retrieveSpendLimits(
        params: CardRetrieveSpendLimitsParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CardSpendLimits

    /**
     * Get card configuration such as spend limit and state. Customers must be PCI compliant to use
     * this endpoint. Please contact [support@lithic.com](mailto:support@lithic.com) for questions.
     * _Note: this is a `POST` endpoint because it is more secure to send sensitive data in a
     * request body than in a URL._
     */
    suspend fun searchByPan(
        params: CardSearchByPanParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): Card

    suspend fun getEmbedHtml(
        params: CardGetEmbedHtmlParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): String

    suspend fun getEmbedUrl(
        params: CardGetEmbedUrlParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): String
}
