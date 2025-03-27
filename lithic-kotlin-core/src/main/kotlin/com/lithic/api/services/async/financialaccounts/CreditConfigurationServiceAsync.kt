// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.services.async.financialaccounts

import com.google.errorprone.annotations.MustBeClosed
import com.lithic.api.core.RequestOptions
import com.lithic.api.core.http.HttpResponseFor
import com.lithic.api.models.financialaccounts.creditconfiguration.CreditConfigurationRetrieveParams
import com.lithic.api.models.financialaccounts.creditconfiguration.CreditConfigurationUpdateParams
import com.lithic.api.models.financialaccounts.creditconfiguration.FinancialAccountCreditConfig

interface CreditConfigurationServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /** Get an Account's credit configuration */
    suspend fun retrieve(
        params: CreditConfigurationRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): FinancialAccountCreditConfig

    /** Update an account's credit configuration */
    suspend fun update(
        params: CreditConfigurationUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): FinancialAccountCreditConfig

    /**
     * A view of [CreditConfigurationServiceAsync] that provides access to raw HTTP responses for
     * each method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `get
         * /v1/financial_accounts/{financial_account_token}/credit_configuration`, but is otherwise
         * the same as [CreditConfigurationServiceAsync.retrieve].
         */
        @MustBeClosed
        suspend fun retrieve(
            params: CreditConfigurationRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<FinancialAccountCreditConfig>

        /**
         * Returns a raw HTTP response for `patch
         * /v1/financial_accounts/{financial_account_token}/credit_configuration`, but is otherwise
         * the same as [CreditConfigurationServiceAsync.update].
         */
        @MustBeClosed
        suspend fun update(
            params: CreditConfigurationUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<FinancialAccountCreditConfig>
    }
}
