// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.services.blocking.financialAccounts

import com.google.errorprone.annotations.MustBeClosed
import com.lithic.api.core.ClientOptions
import com.lithic.api.core.RequestOptions
import com.lithic.api.core.http.HttpResponseFor
import com.lithic.api.models.FinancialAccountLoanTapeListPage
import com.lithic.api.models.FinancialAccountLoanTapeListParams
import com.lithic.api.models.FinancialAccountLoanTapeRetrieveParams
import com.lithic.api.models.LoanTape

interface LoanTapeService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): LoanTapeService

    /** Get a specific loan tape for a given financial account. */
    fun retrieve(
        loanTapeToken: String,
        params: FinancialAccountLoanTapeRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): LoanTape = retrieve(params.toBuilder().loanTapeToken(loanTapeToken).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        params: FinancialAccountLoanTapeRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): LoanTape

    /** List the loan tapes for a given financial account. */
    fun list(
        financialAccountToken: String,
        params: FinancialAccountLoanTapeListParams = FinancialAccountLoanTapeListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): FinancialAccountLoanTapeListPage =
        list(
            params.toBuilder().financialAccountToken(financialAccountToken).build(),
            requestOptions,
        )

    /** @see list */
    fun list(
        params: FinancialAccountLoanTapeListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): FinancialAccountLoanTapeListPage

    /** @see list */
    fun list(
        financialAccountToken: String,
        requestOptions: RequestOptions,
    ): FinancialAccountLoanTapeListPage =
        list(financialAccountToken, FinancialAccountLoanTapeListParams.none(), requestOptions)

    /** A view of [LoanTapeService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: (ClientOptions.Builder) -> Unit): LoanTapeService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get
         * /v1/financial_accounts/{financial_account_token}/loan_tapes/{loan_tape_token}`, but is
         * otherwise the same as [LoanTapeService.retrieve].
         */
        @MustBeClosed
        fun retrieve(
            loanTapeToken: String,
            params: FinancialAccountLoanTapeRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<LoanTape> =
            retrieve(params.toBuilder().loanTapeToken(loanTapeToken).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: FinancialAccountLoanTapeRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<LoanTape>

        /**
         * Returns a raw HTTP response for `get
         * /v1/financial_accounts/{financial_account_token}/loan_tapes`, but is otherwise the same
         * as [LoanTapeService.list].
         */
        @MustBeClosed
        fun list(
            financialAccountToken: String,
            params: FinancialAccountLoanTapeListParams = FinancialAccountLoanTapeListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<FinancialAccountLoanTapeListPage> =
            list(
                params.toBuilder().financialAccountToken(financialAccountToken).build(),
                requestOptions,
            )

        /** @see list */
        @MustBeClosed
        fun list(
            params: FinancialAccountLoanTapeListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<FinancialAccountLoanTapeListPage>

        /** @see list */
        @MustBeClosed
        fun list(
            financialAccountToken: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<FinancialAccountLoanTapeListPage> =
            list(financialAccountToken, FinancialAccountLoanTapeListParams.none(), requestOptions)
    }
}
