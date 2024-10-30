// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.services.async

import com.lithic.api.core.RequestOptions
import com.lithic.api.models.FinancialAccount
import com.lithic.api.models.FinancialAccountChargeOffParams
import com.lithic.api.models.FinancialAccountCreateParams
import com.lithic.api.models.FinancialAccountCreditConfig
import com.lithic.api.models.FinancialAccountListPageAsync
import com.lithic.api.models.FinancialAccountListParams
import com.lithic.api.models.FinancialAccountRetrieveParams
import com.lithic.api.models.FinancialAccountUpdateParams
import com.lithic.api.services.async.financialAccounts.BalanceServiceAsync
import com.lithic.api.services.async.financialAccounts.CreditConfigurationServiceAsync
import com.lithic.api.services.async.financialAccounts.FinancialTransactionServiceAsync
import com.lithic.api.services.async.financialAccounts.LoanTapeServiceAsync
import com.lithic.api.services.async.financialAccounts.StatementServiceAsync

interface FinancialAccountServiceAsync {

    fun balances(): BalanceServiceAsync

    fun financialTransactions(): FinancialTransactionServiceAsync

    fun creditConfiguration(): CreditConfigurationServiceAsync

    fun statements(): StatementServiceAsync

    fun loanTapes(): LoanTapeServiceAsync

    /** Create a new financial account */
    suspend fun create(
        params: FinancialAccountCreateParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): FinancialAccount

    /** Get a financial account */
    suspend fun retrieve(
        params: FinancialAccountRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): FinancialAccount

    /** Update a financial account */
    suspend fun update(
        params: FinancialAccountUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): FinancialAccount

    /** Retrieve information on your financial accounts including routing and account number. */
    suspend fun list(
        params: FinancialAccountListParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): FinancialAccountListPageAsync

    /** Update issuing account state to charged off */
    suspend fun chargeOff(
        params: FinancialAccountChargeOffParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): FinancialAccountCreditConfig
}
