// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.services.async.cards

import com.google.errorprone.annotations.MustBeClosed
import com.lithic.api.core.RequestOptions
import com.lithic.api.core.http.HttpResponseFor
import com.lithic.api.models.cards.financialtransactions.FinancialTransactionListPageAsync
import com.lithic.api.models.cards.financialtransactions.FinancialTransactionListParams
import com.lithic.api.models.cards.financialtransactions.FinancialTransactionRetrieveParams
import com.lithic.api.models.financialaccounts.FinancialTransaction

interface FinancialTransactionServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /** Get the card financial transaction for the provided token. */
    suspend fun retrieve(
        params: FinancialTransactionRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): FinancialTransaction

    /** List the financial transactions for a given card. */
    suspend fun list(
        params: FinancialTransactionListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): FinancialTransactionListPageAsync

    /**
     * A view of [FinancialTransactionServiceAsync] that provides access to raw HTTP responses for
     * each method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `get
         * /v1/cards/{card_token}/financial_transactions/{financial_transaction_token}`, but is
         * otherwise the same as [FinancialTransactionServiceAsync.retrieve].
         */
        @MustBeClosed
        suspend fun retrieve(
            params: FinancialTransactionRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<FinancialTransaction>

        /**
         * Returns a raw HTTP response for `get /v1/cards/{card_token}/financial_transactions`, but
         * is otherwise the same as [FinancialTransactionServiceAsync.list].
         */
        @MustBeClosed
        suspend fun list(
            params: FinancialTransactionListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<FinancialTransactionListPageAsync>
    }
}
