// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.services.async.financialAccounts.statements

import com.google.errorprone.annotations.MustBeClosed
import com.lithic.api.core.ClientOptions
import com.lithic.api.core.RequestOptions
import com.lithic.api.core.http.HttpResponseFor
import com.lithic.api.models.FinancialAccountStatementLineItemListPageAsync
import com.lithic.api.models.FinancialAccountStatementLineItemListParams

interface LineItemServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): LineItemServiceAsync

    /** List the line items for a given statement within a given financial account. */
    suspend fun list(
        statementToken: String,
        params: FinancialAccountStatementLineItemListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): FinancialAccountStatementLineItemListPageAsync =
        list(params.toBuilder().statementToken(statementToken).build(), requestOptions)

    /** @see list */
    suspend fun list(
        params: FinancialAccountStatementLineItemListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): FinancialAccountStatementLineItemListPageAsync

    /**
     * A view of [LineItemServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): LineItemServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get
         * /v1/financial_accounts/{financial_account_token}/statements/{statement_token}/line_items`,
         * but is otherwise the same as [LineItemServiceAsync.list].
         */
        @MustBeClosed
        suspend fun list(
            statementToken: String,
            params: FinancialAccountStatementLineItemListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<FinancialAccountStatementLineItemListPageAsync> =
            list(params.toBuilder().statementToken(statementToken).build(), requestOptions)

        /** @see list */
        @MustBeClosed
        suspend fun list(
            params: FinancialAccountStatementLineItemListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<FinancialAccountStatementLineItemListPageAsync>
    }
}
