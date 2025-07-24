// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.services.async.cards

import com.google.errorprone.annotations.MustBeClosed
import com.lithic.api.core.ClientOptions
import com.lithic.api.core.RequestOptions
import com.lithic.api.core.http.HttpResponseFor
import com.lithic.api.models.CardFinancialTransactionListPageAsync
import com.lithic.api.models.CardFinancialTransactionListParams
import com.lithic.api.models.CardFinancialTransactionRetrieveParams
import com.lithic.api.models.FinancialTransaction

interface FinancialTransactionServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): FinancialTransactionServiceAsync

    /** Get the card financial transaction for the provided token. */
    suspend fun retrieve(
        financialTransactionToken: String,
        params: CardFinancialTransactionRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): FinancialTransaction =
        retrieve(
            params.toBuilder().financialTransactionToken(financialTransactionToken).build(),
            requestOptions,
        )

    /** @see retrieve */
    suspend fun retrieve(
        params: CardFinancialTransactionRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): FinancialTransaction

    /** List the financial transactions for a given card. */
    suspend fun list(
        cardToken: String,
        params: CardFinancialTransactionListParams = CardFinancialTransactionListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CardFinancialTransactionListPageAsync =
        list(params.toBuilder().cardToken(cardToken).build(), requestOptions)

    /** @see list */
    suspend fun list(
        params: CardFinancialTransactionListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CardFinancialTransactionListPageAsync

    /** @see list */
    suspend fun list(
        cardToken: String,
        requestOptions: RequestOptions,
    ): CardFinancialTransactionListPageAsync =
        list(cardToken, CardFinancialTransactionListParams.none(), requestOptions)

    /**
     * A view of [FinancialTransactionServiceAsync] that provides access to raw HTTP responses for
     * each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): FinancialTransactionServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get
         * /v1/cards/{card_token}/financial_transactions/{financial_transaction_token}`, but is
         * otherwise the same as [FinancialTransactionServiceAsync.retrieve].
         */
        @MustBeClosed
        suspend fun retrieve(
            financialTransactionToken: String,
            params: CardFinancialTransactionRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<FinancialTransaction> =
            retrieve(
                params.toBuilder().financialTransactionToken(financialTransactionToken).build(),
                requestOptions,
            )

        /** @see retrieve */
        @MustBeClosed
        suspend fun retrieve(
            params: CardFinancialTransactionRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<FinancialTransaction>

        /**
         * Returns a raw HTTP response for `get /v1/cards/{card_token}/financial_transactions`, but
         * is otherwise the same as [FinancialTransactionServiceAsync.list].
         */
        @MustBeClosed
        suspend fun list(
            cardToken: String,
            params: CardFinancialTransactionListParams = CardFinancialTransactionListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CardFinancialTransactionListPageAsync> =
            list(params.toBuilder().cardToken(cardToken).build(), requestOptions)

        /** @see list */
        @MustBeClosed
        suspend fun list(
            params: CardFinancialTransactionListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CardFinancialTransactionListPageAsync>

        /** @see list */
        @MustBeClosed
        suspend fun list(
            cardToken: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CardFinancialTransactionListPageAsync> =
            list(cardToken, CardFinancialTransactionListParams.none(), requestOptions)
    }
}
