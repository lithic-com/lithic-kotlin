// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.services.async.financialAccounts

import com.google.errorprone.annotations.MustBeClosed
import com.lithic.api.core.ClientOptions
import com.lithic.api.core.RequestOptions
import com.lithic.api.core.http.HttpResponseFor
import com.lithic.api.models.FinancialAccountBalanceListPageAsync
import com.lithic.api.models.FinancialAccountBalanceListParams

interface BalanceServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): BalanceServiceAsync

    /** Get the balances for a given financial account. */
    suspend fun list(
        financialAccountToken: String,
        params: FinancialAccountBalanceListParams = FinancialAccountBalanceListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): FinancialAccountBalanceListPageAsync =
        list(
            params.toBuilder().financialAccountToken(financialAccountToken).build(),
            requestOptions,
        )

    /** @see list */
    suspend fun list(
        params: FinancialAccountBalanceListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): FinancialAccountBalanceListPageAsync

    /** @see list */
    suspend fun list(
        financialAccountToken: String,
        requestOptions: RequestOptions,
    ): FinancialAccountBalanceListPageAsync =
        list(financialAccountToken, FinancialAccountBalanceListParams.none(), requestOptions)

    /**
     * A view of [BalanceServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): BalanceServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get
         * /v1/financial_accounts/{financial_account_token}/balances`, but is otherwise the same as
         * [BalanceServiceAsync.list].
         */
        @MustBeClosed
        suspend fun list(
            financialAccountToken: String,
            params: FinancialAccountBalanceListParams = FinancialAccountBalanceListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<FinancialAccountBalanceListPageAsync> =
            list(
                params.toBuilder().financialAccountToken(financialAccountToken).build(),
                requestOptions,
            )

        /** @see list */
        @MustBeClosed
        suspend fun list(
            params: FinancialAccountBalanceListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<FinancialAccountBalanceListPageAsync>

        /** @see list */
        @MustBeClosed
        suspend fun list(
            financialAccountToken: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<FinancialAccountBalanceListPageAsync> =
            list(financialAccountToken, FinancialAccountBalanceListParams.none(), requestOptions)
    }
}
