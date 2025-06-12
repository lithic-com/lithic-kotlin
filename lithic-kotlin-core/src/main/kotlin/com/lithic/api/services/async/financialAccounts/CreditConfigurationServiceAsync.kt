// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.services.async.financialAccounts

import com.google.errorprone.annotations.MustBeClosed
import com.lithic.api.core.ClientOptions
import com.lithic.api.core.RequestOptions
import com.lithic.api.core.http.HttpResponseFor
import com.lithic.api.models.FinancialAccountCreditConfig
import com.lithic.api.models.FinancialAccountCreditConfigurationRetrieveParams
import com.lithic.api.models.FinancialAccountCreditConfigurationUpdateParams

interface CreditConfigurationServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): CreditConfigurationServiceAsync

    /** Get an Account's credit configuration */
    suspend fun retrieve(
        financialAccountToken: String,
        params: FinancialAccountCreditConfigurationRetrieveParams =
            FinancialAccountCreditConfigurationRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): FinancialAccountCreditConfig =
        retrieve(
            params.toBuilder().financialAccountToken(financialAccountToken).build(),
            requestOptions,
        )

    /** @see [retrieve] */
    suspend fun retrieve(
        params: FinancialAccountCreditConfigurationRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): FinancialAccountCreditConfig

    /** @see [retrieve] */
    suspend fun retrieve(
        financialAccountToken: String,
        requestOptions: RequestOptions,
    ): FinancialAccountCreditConfig =
        retrieve(
            financialAccountToken,
            FinancialAccountCreditConfigurationRetrieveParams.none(),
            requestOptions,
        )

    /** Update an account's credit configuration */
    suspend fun update(
        financialAccountToken: String,
        params: FinancialAccountCreditConfigurationUpdateParams =
            FinancialAccountCreditConfigurationUpdateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): FinancialAccountCreditConfig =
        update(
            params.toBuilder().financialAccountToken(financialAccountToken).build(),
            requestOptions,
        )

    /** @see [update] */
    suspend fun update(
        params: FinancialAccountCreditConfigurationUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): FinancialAccountCreditConfig

    /** @see [update] */
    suspend fun update(
        financialAccountToken: String,
        requestOptions: RequestOptions,
    ): FinancialAccountCreditConfig =
        update(
            financialAccountToken,
            FinancialAccountCreditConfigurationUpdateParams.none(),
            requestOptions,
        )

    /**
     * A view of [CreditConfigurationServiceAsync] that provides access to raw HTTP responses for
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
        ): CreditConfigurationServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get
         * /v1/financial_accounts/{financial_account_token}/credit_configuration`, but is otherwise
         * the same as [CreditConfigurationServiceAsync.retrieve].
         */
        @MustBeClosed
        suspend fun retrieve(
            financialAccountToken: String,
            params: FinancialAccountCreditConfigurationRetrieveParams =
                FinancialAccountCreditConfigurationRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<FinancialAccountCreditConfig> =
            retrieve(
                params.toBuilder().financialAccountToken(financialAccountToken).build(),
                requestOptions,
            )

        /** @see [retrieve] */
        @MustBeClosed
        suspend fun retrieve(
            params: FinancialAccountCreditConfigurationRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<FinancialAccountCreditConfig>

        /** @see [retrieve] */
        @MustBeClosed
        suspend fun retrieve(
            financialAccountToken: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<FinancialAccountCreditConfig> =
            retrieve(
                financialAccountToken,
                FinancialAccountCreditConfigurationRetrieveParams.none(),
                requestOptions,
            )

        /**
         * Returns a raw HTTP response for `patch
         * /v1/financial_accounts/{financial_account_token}/credit_configuration`, but is otherwise
         * the same as [CreditConfigurationServiceAsync.update].
         */
        @MustBeClosed
        suspend fun update(
            financialAccountToken: String,
            params: FinancialAccountCreditConfigurationUpdateParams =
                FinancialAccountCreditConfigurationUpdateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<FinancialAccountCreditConfig> =
            update(
                params.toBuilder().financialAccountToken(financialAccountToken).build(),
                requestOptions,
            )

        /** @see [update] */
        @MustBeClosed
        suspend fun update(
            params: FinancialAccountCreditConfigurationUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<FinancialAccountCreditConfig>

        /** @see [update] */
        @MustBeClosed
        suspend fun update(
            financialAccountToken: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<FinancialAccountCreditConfig> =
            update(
                financialAccountToken,
                FinancialAccountCreditConfigurationUpdateParams.none(),
                requestOptions,
            )
    }
}
