// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.services.async.financialAccounts

import com.google.errorprone.annotations.MustBeClosed
import com.lithic.api.core.ClientOptions
import com.lithic.api.core.RequestOptions
import com.lithic.api.core.http.HttpResponseFor
import com.lithic.api.models.FinancialAccountLoanTapeListPageAsync
import com.lithic.api.models.FinancialAccountLoanTapeListParams
import com.lithic.api.models.FinancialAccountLoanTapeRetrieveParams
import com.lithic.api.models.LoanTape

interface LoanTapeServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): LoanTapeServiceAsync

    /** Get a specific loan tape for a given financial account. */
    suspend fun retrieve(
        loanTapeToken: String,
        params: FinancialAccountLoanTapeRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): LoanTape = retrieve(params.toBuilder().loanTapeToken(loanTapeToken).build(), requestOptions)

    /** @see retrieve */
    suspend fun retrieve(
        params: FinancialAccountLoanTapeRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): LoanTape

    /** List the loan tapes for a given financial account. */
    suspend fun list(
        financialAccountToken: String,
        params: FinancialAccountLoanTapeListParams = FinancialAccountLoanTapeListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): FinancialAccountLoanTapeListPageAsync =
        list(
            params.toBuilder().financialAccountToken(financialAccountToken).build(),
            requestOptions,
        )

    /** @see list */
    suspend fun list(
        params: FinancialAccountLoanTapeListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): FinancialAccountLoanTapeListPageAsync

    /** @see list */
    suspend fun list(
        financialAccountToken: String,
        requestOptions: RequestOptions,
    ): FinancialAccountLoanTapeListPageAsync =
        list(financialAccountToken, FinancialAccountLoanTapeListParams.none(), requestOptions)

    /**
     * A view of [LoanTapeServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): LoanTapeServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get
         * /v1/financial_accounts/{financial_account_token}/loan_tapes/{loan_tape_token}`, but is
         * otherwise the same as [LoanTapeServiceAsync.retrieve].
         */
        @MustBeClosed
        suspend fun retrieve(
            loanTapeToken: String,
            params: FinancialAccountLoanTapeRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<LoanTape> =
            retrieve(params.toBuilder().loanTapeToken(loanTapeToken).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        suspend fun retrieve(
            params: FinancialAccountLoanTapeRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<LoanTape>

        /**
         * Returns a raw HTTP response for `get
         * /v1/financial_accounts/{financial_account_token}/loan_tapes`, but is otherwise the same
         * as [LoanTapeServiceAsync.list].
         */
        @MustBeClosed
        suspend fun list(
            financialAccountToken: String,
            params: FinancialAccountLoanTapeListParams = FinancialAccountLoanTapeListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<FinancialAccountLoanTapeListPageAsync> =
            list(
                params.toBuilder().financialAccountToken(financialAccountToken).build(),
                requestOptions,
            )

        /** @see list */
        @MustBeClosed
        suspend fun list(
            params: FinancialAccountLoanTapeListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<FinancialAccountLoanTapeListPageAsync>

        /** @see list */
        @MustBeClosed
        suspend fun list(
            financialAccountToken: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<FinancialAccountLoanTapeListPageAsync> =
            list(financialAccountToken, FinancialAccountLoanTapeListParams.none(), requestOptions)
    }
}
