// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.services.blocking.cards

import com.google.errorprone.annotations.MustBeClosed
import com.lithic.api.core.ClientOptions
import com.lithic.api.core.RequestOptions
import com.lithic.api.core.http.HttpResponseFor
import com.lithic.api.models.CardFinancialTransactionListPage
import com.lithic.api.models.CardFinancialTransactionListParams
import com.lithic.api.models.CardFinancialTransactionRetrieveParams
import com.lithic.api.models.FinancialTransaction

interface FinancialTransactionService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): FinancialTransactionService

    /** Get the card financial transaction for the provided token. */
    fun retrieve(
        financialTransactionToken: String,
        params: CardFinancialTransactionRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): FinancialTransaction =
        retrieve(
            params.toBuilder().financialTransactionToken(financialTransactionToken).build(),
            requestOptions,
        )

    /** @see [retrieve] */
    fun retrieve(
        params: CardFinancialTransactionRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): FinancialTransaction

    /** List the financial transactions for a given card. */
    fun list(
        cardToken: String,
        params: CardFinancialTransactionListParams = CardFinancialTransactionListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CardFinancialTransactionListPage =
        list(params.toBuilder().cardToken(cardToken).build(), requestOptions)

    /** @see [list] */
    fun list(
        params: CardFinancialTransactionListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CardFinancialTransactionListPage

    /** @see [list] */
    fun list(cardToken: String, requestOptions: RequestOptions): CardFinancialTransactionListPage =
        list(cardToken, CardFinancialTransactionListParams.none(), requestOptions)

    /**
     * A view of [FinancialTransactionService] that provides access to raw HTTP responses for each
     * method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): FinancialTransactionService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get
         * /v1/cards/{card_token}/financial_transactions/{financial_transaction_token}`, but is
         * otherwise the same as [FinancialTransactionService.retrieve].
         */
        @MustBeClosed
        fun retrieve(
            financialTransactionToken: String,
            params: CardFinancialTransactionRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<FinancialTransaction> =
            retrieve(
                params.toBuilder().financialTransactionToken(financialTransactionToken).build(),
                requestOptions,
            )

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            params: CardFinancialTransactionRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<FinancialTransaction>

        /**
         * Returns a raw HTTP response for `get /v1/cards/{card_token}/financial_transactions`, but
         * is otherwise the same as [FinancialTransactionService.list].
         */
        @MustBeClosed
        fun list(
            cardToken: String,
            params: CardFinancialTransactionListParams = CardFinancialTransactionListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CardFinancialTransactionListPage> =
            list(params.toBuilder().cardToken(cardToken).build(), requestOptions)

        /** @see [list] */
        @MustBeClosed
        fun list(
            params: CardFinancialTransactionListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CardFinancialTransactionListPage>

        /** @see [list] */
        @MustBeClosed
        fun list(
            cardToken: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CardFinancialTransactionListPage> =
            list(cardToken, CardFinancialTransactionListParams.none(), requestOptions)
    }
}
