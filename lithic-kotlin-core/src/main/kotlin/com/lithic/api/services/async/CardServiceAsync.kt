// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.services.async

import com.google.errorprone.annotations.MustBeClosed
import com.lithic.api.core.ClientOptions
import com.lithic.api.core.RequestOptions
import com.lithic.api.core.http.HttpResponseFor
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
import com.lithic.api.models.CardWebProvisionParams
import com.lithic.api.models.CardWebProvisionResponse
import com.lithic.api.services.async.cards.AggregateBalanceServiceAsync
import com.lithic.api.services.async.cards.BalanceServiceAsync
import com.lithic.api.services.async.cards.FinancialTransactionServiceAsync

interface CardServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): CardServiceAsync

    fun aggregateBalances(): AggregateBalanceServiceAsync

    fun balances(): BalanceServiceAsync

    fun financialTransactions(): FinancialTransactionServiceAsync

    /**
     * Create a new virtual or physical card. Parameters `shipping_address` and `product_id` only
     * apply to physical cards.
     */
    suspend fun create(
        params: CardCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Card

    /** Get card configuration such as spend limit and state. */
    suspend fun retrieve(
        cardToken: String,
        params: CardRetrieveParams = CardRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Card = retrieve(params.toBuilder().cardToken(cardToken).build(), requestOptions)

    /** @see [retrieve] */
    suspend fun retrieve(
        params: CardRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Card

    /** @see [retrieve] */
    suspend fun retrieve(cardToken: String, requestOptions: RequestOptions): Card =
        retrieve(cardToken, CardRetrieveParams.none(), requestOptions)

    /**
     * Update the specified properties of the card. Unsupplied properties will remain unchanged.
     *
     * _Note: setting a card to a `CLOSED` state is a final action that cannot be undone._
     */
    suspend fun update(
        cardToken: String,
        params: CardUpdateParams = CardUpdateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Card = update(params.toBuilder().cardToken(cardToken).build(), requestOptions)

    /** @see [update] */
    suspend fun update(
        params: CardUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Card

    /** @see [update] */
    suspend fun update(cardToken: String, requestOptions: RequestOptions): Card =
        update(cardToken, CardUpdateParams.none(), requestOptions)

    /** List cards. */
    suspend fun list(
        params: CardListParams = CardListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CardListPageAsync

    /** @see [list] */
    suspend fun list(requestOptions: RequestOptions): CardListPageAsync =
        list(CardListParams.none(), requestOptions)

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
    suspend fun convertPhysical(
        cardToken: String,
        params: CardConvertPhysicalParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Card = convertPhysical(params.toBuilder().cardToken(cardToken).build(), requestOptions)

    /** @see [convertPhysical] */
    suspend fun convertPhysical(
        params: CardConvertPhysicalParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Card

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
    suspend fun embed(
        params: CardEmbedParams,
        requestOptions: RequestOptions = RequestOptions.none(),
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
        cardToken: String,
        params: CardProvisionParams = CardProvisionParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CardProvisionResponse =
        provision(params.toBuilder().cardToken(cardToken).build(), requestOptions)

    /** @see [provision] */
    suspend fun provision(
        params: CardProvisionParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CardProvisionResponse

    /** @see [provision] */
    suspend fun provision(
        cardToken: String,
        requestOptions: RequestOptions,
    ): CardProvisionResponse = provision(cardToken, CardProvisionParams.none(), requestOptions)

    /**
     * Initiate print and shipment of a duplicate physical card (e.g. card is physically damaged).
     * The PAN, expiry, and CVC2 will remain the same and the original card can continue to be used
     * until the new card is activated. Only applies to cards of type `PHYSICAL`. A card can be
     * reissued or renewed a total of 8 times.
     */
    suspend fun reissue(
        cardToken: String,
        params: CardReissueParams = CardReissueParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Card = reissue(params.toBuilder().cardToken(cardToken).build(), requestOptions)

    /** @see [reissue] */
    suspend fun reissue(
        params: CardReissueParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Card

    /** @see [reissue] */
    suspend fun reissue(cardToken: String, requestOptions: RequestOptions): Card =
        reissue(cardToken, CardReissueParams.none(), requestOptions)

    /**
     * Applies to card types `PHYSICAL` and `VIRTUAL`. For `PHYSICAL`, creates a new card with the
     * same card token and PAN, but updated expiry and CVC2 code. The original card will keep
     * working for card-present transactions until the new card is activated. For card-not-present
     * transactions, the original card details (expiry, CVC2) will also keep working until the new
     * card is activated. A `PHYSICAL` card can be reissued or renewed a total of 8 times. For
     * `VIRTUAL`, the card will retain the same card token and PAN and receive an updated expiry and
     * CVC2 code. `product_id`, `shipping_method`, `shipping_address`, `carrier` are only relevant
     * for renewing `PHYSICAL` cards.
     */
    suspend fun renew(
        cardToken: String,
        params: CardRenewParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Card = renew(params.toBuilder().cardToken(cardToken).build(), requestOptions)

    /** @see [renew] */
    suspend fun renew(
        params: CardRenewParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Card

    /**
     * Get a Card's available spend limit, which is based on the spend limit configured on the Card
     * and the amount already spent over the spend limit's duration. For example, if the Card has a
     * monthly spend limit of $1000 configured, and has spent $600 in the last month, the available
     * spend limit returned would be $400.
     */
    suspend fun retrieveSpendLimits(
        cardToken: String,
        params: CardRetrieveSpendLimitsParams = CardRetrieveSpendLimitsParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CardSpendLimits =
        retrieveSpendLimits(params.toBuilder().cardToken(cardToken).build(), requestOptions)

    /** @see [retrieveSpendLimits] */
    suspend fun retrieveSpendLimits(
        params: CardRetrieveSpendLimitsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CardSpendLimits

    /** @see [retrieveSpendLimits] */
    suspend fun retrieveSpendLimits(
        cardToken: String,
        requestOptions: RequestOptions,
    ): CardSpendLimits =
        retrieveSpendLimits(cardToken, CardRetrieveSpendLimitsParams.none(), requestOptions)

    /**
     * Get card configuration such as spend limit and state. Customers must be PCI compliant to use
     * this endpoint. Please contact [support@lithic.com](mailto:support@lithic.com) for questions.
     * _Note: this is a `POST` endpoint because it is more secure to send sensitive data in a
     * request body than in a URL._
     */
    suspend fun searchByPan(
        params: CardSearchByPanParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Card

    /**
     * Allow your cardholders to directly add payment cards to the device's digital wallet from a
     * browser on the web. Currently only suported for Apple Pay.
     *
     * This requires some additional setup and configuration. Please
     * [Contact Us](https://lithic.com/contact) or your Customer Success representative for more
     * information.
     */
    suspend fun webProvision(
        cardToken: String,
        params: CardWebProvisionParams = CardWebProvisionParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CardWebProvisionResponse =
        webProvision(params.toBuilder().cardToken(cardToken).build(), requestOptions)

    /** @see [webProvision] */
    suspend fun webProvision(
        params: CardWebProvisionParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CardWebProvisionResponse

    /** @see [webProvision] */
    suspend fun webProvision(
        cardToken: String,
        requestOptions: RequestOptions,
    ): CardWebProvisionResponse =
        webProvision(cardToken, CardWebProvisionParams.none(), requestOptions)

    /** A view of [CardServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: (ClientOptions.Builder) -> Unit): CardServiceAsync.WithRawResponse

        fun aggregateBalances(): AggregateBalanceServiceAsync.WithRawResponse

        fun balances(): BalanceServiceAsync.WithRawResponse

        fun financialTransactions(): FinancialTransactionServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /v1/cards`, but is otherwise the same as
         * [CardServiceAsync.create].
         */
        @MustBeClosed
        suspend fun create(
            params: CardCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Card>

        /**
         * Returns a raw HTTP response for `get /v1/cards/{card_token}`, but is otherwise the same
         * as [CardServiceAsync.retrieve].
         */
        @MustBeClosed
        suspend fun retrieve(
            cardToken: String,
            params: CardRetrieveParams = CardRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Card> =
            retrieve(params.toBuilder().cardToken(cardToken).build(), requestOptions)

        /** @see [retrieve] */
        @MustBeClosed
        suspend fun retrieve(
            params: CardRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Card>

        /** @see [retrieve] */
        @MustBeClosed
        suspend fun retrieve(
            cardToken: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<Card> = retrieve(cardToken, CardRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `patch /v1/cards/{card_token}`, but is otherwise the same
         * as [CardServiceAsync.update].
         */
        @MustBeClosed
        suspend fun update(
            cardToken: String,
            params: CardUpdateParams = CardUpdateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Card> =
            update(params.toBuilder().cardToken(cardToken).build(), requestOptions)

        /** @see [update] */
        @MustBeClosed
        suspend fun update(
            params: CardUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Card>

        /** @see [update] */
        @MustBeClosed
        suspend fun update(
            cardToken: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<Card> = update(cardToken, CardUpdateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /v1/cards`, but is otherwise the same as
         * [CardServiceAsync.list].
         */
        @MustBeClosed
        suspend fun list(
            params: CardListParams = CardListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CardListPageAsync>

        /** @see [list] */
        @MustBeClosed
        suspend fun list(requestOptions: RequestOptions): HttpResponseFor<CardListPageAsync> =
            list(CardListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /v1/cards/{card_token}/convert_physical`, but is
         * otherwise the same as [CardServiceAsync.convertPhysical].
         */
        @MustBeClosed
        suspend fun convertPhysical(
            cardToken: String,
            params: CardConvertPhysicalParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Card> =
            convertPhysical(params.toBuilder().cardToken(cardToken).build(), requestOptions)

        /** @see [convertPhysical] */
        @MustBeClosed
        suspend fun convertPhysical(
            params: CardConvertPhysicalParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Card>

        /**
         * Returns a raw HTTP response for `get /v1/embed/card`, but is otherwise the same as
         * [CardServiceAsync.embed].
         */
        @MustBeClosed
        suspend fun embed(
            params: CardEmbedParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<String>

        /**
         * Returns a raw HTTP response for `post /v1/cards/{card_token}/provision`, but is otherwise
         * the same as [CardServiceAsync.provision].
         */
        @MustBeClosed
        suspend fun provision(
            cardToken: String,
            params: CardProvisionParams = CardProvisionParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CardProvisionResponse> =
            provision(params.toBuilder().cardToken(cardToken).build(), requestOptions)

        /** @see [provision] */
        @MustBeClosed
        suspend fun provision(
            params: CardProvisionParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CardProvisionResponse>

        /** @see [provision] */
        @MustBeClosed
        suspend fun provision(
            cardToken: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CardProvisionResponse> =
            provision(cardToken, CardProvisionParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /v1/cards/{card_token}/reissue`, but is otherwise
         * the same as [CardServiceAsync.reissue].
         */
        @MustBeClosed
        suspend fun reissue(
            cardToken: String,
            params: CardReissueParams = CardReissueParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Card> =
            reissue(params.toBuilder().cardToken(cardToken).build(), requestOptions)

        /** @see [reissue] */
        @MustBeClosed
        suspend fun reissue(
            params: CardReissueParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Card>

        /** @see [reissue] */
        @MustBeClosed
        suspend fun reissue(
            cardToken: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<Card> = reissue(cardToken, CardReissueParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /v1/cards/{card_token}/renew`, but is otherwise the
         * same as [CardServiceAsync.renew].
         */
        @MustBeClosed
        suspend fun renew(
            cardToken: String,
            params: CardRenewParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Card> =
            renew(params.toBuilder().cardToken(cardToken).build(), requestOptions)

        /** @see [renew] */
        @MustBeClosed
        suspend fun renew(
            params: CardRenewParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Card>

        /**
         * Returns a raw HTTP response for `get /v1/cards/{card_token}/spend_limits`, but is
         * otherwise the same as [CardServiceAsync.retrieveSpendLimits].
         */
        @MustBeClosed
        suspend fun retrieveSpendLimits(
            cardToken: String,
            params: CardRetrieveSpendLimitsParams = CardRetrieveSpendLimitsParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CardSpendLimits> =
            retrieveSpendLimits(params.toBuilder().cardToken(cardToken).build(), requestOptions)

        /** @see [retrieveSpendLimits] */
        @MustBeClosed
        suspend fun retrieveSpendLimits(
            params: CardRetrieveSpendLimitsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CardSpendLimits>

        /** @see [retrieveSpendLimits] */
        @MustBeClosed
        suspend fun retrieveSpendLimits(
            cardToken: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CardSpendLimits> =
            retrieveSpendLimits(cardToken, CardRetrieveSpendLimitsParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /v1/cards/search_by_pan`, but is otherwise the same
         * as [CardServiceAsync.searchByPan].
         */
        @MustBeClosed
        suspend fun searchByPan(
            params: CardSearchByPanParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Card>

        /**
         * Returns a raw HTTP response for `post /v1/cards/{card_token}/web_provision`, but is
         * otherwise the same as [CardServiceAsync.webProvision].
         */
        @MustBeClosed
        suspend fun webProvision(
            cardToken: String,
            params: CardWebProvisionParams = CardWebProvisionParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CardWebProvisionResponse> =
            webProvision(params.toBuilder().cardToken(cardToken).build(), requestOptions)

        /** @see [webProvision] */
        @MustBeClosed
        suspend fun webProvision(
            params: CardWebProvisionParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CardWebProvisionResponse>

        /** @see [webProvision] */
        @MustBeClosed
        suspend fun webProvision(
            cardToken: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CardWebProvisionResponse> =
            webProvision(cardToken, CardWebProvisionParams.none(), requestOptions)
    }
}
