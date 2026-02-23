// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.services.async.financialAccounts

import com.google.errorprone.annotations.MustBeClosed
import com.lithic.api.core.ClientOptions
import com.lithic.api.core.RequestOptions
import com.lithic.api.core.http.HttpResponseFor
import com.lithic.api.models.FinancialAccountLoanTapeConfigurationRetrieveParams
import com.lithic.api.models.LoanTapeConfiguration

interface LoanTapeConfigurationServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): LoanTapeConfigurationServiceAsync

    /** Get the loan tape configuration for a given financial account. */
    suspend fun retrieve(
        financialAccountToken: String,
        params: FinancialAccountLoanTapeConfigurationRetrieveParams =
            FinancialAccountLoanTapeConfigurationRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): LoanTapeConfiguration =
        retrieve(
            params.toBuilder().financialAccountToken(financialAccountToken).build(),
            requestOptions,
        )

    /** @see retrieve */
    suspend fun retrieve(
        params: FinancialAccountLoanTapeConfigurationRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): LoanTapeConfiguration

    /** @see retrieve */
    suspend fun retrieve(
        financialAccountToken: String,
        requestOptions: RequestOptions,
    ): LoanTapeConfiguration =
        retrieve(
            financialAccountToken,
            FinancialAccountLoanTapeConfigurationRetrieveParams.none(),
            requestOptions,
        )

    /**
     * A view of [LoanTapeConfigurationServiceAsync] that provides access to raw HTTP responses for
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
        ): LoanTapeConfigurationServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get
         * /v1/financial_accounts/{financial_account_token}/loan_tape_configuration`, but is
         * otherwise the same as [LoanTapeConfigurationServiceAsync.retrieve].
         */
        @MustBeClosed
        suspend fun retrieve(
            financialAccountToken: String,
            params: FinancialAccountLoanTapeConfigurationRetrieveParams =
                FinancialAccountLoanTapeConfigurationRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<LoanTapeConfiguration> =
            retrieve(
                params.toBuilder().financialAccountToken(financialAccountToken).build(),
                requestOptions,
            )

        /** @see retrieve */
        @MustBeClosed
        suspend fun retrieve(
            params: FinancialAccountLoanTapeConfigurationRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<LoanTapeConfiguration>

        /** @see retrieve */
        @MustBeClosed
        suspend fun retrieve(
            financialAccountToken: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<LoanTapeConfiguration> =
            retrieve(
                financialAccountToken,
                FinancialAccountLoanTapeConfigurationRetrieveParams.none(),
                requestOptions,
            )
    }
}
