// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.services.blocking

import com.lithic.api.core.RequestOptions
import com.lithic.api.models.FinancialAccount
import com.lithic.api.models.FinancialAccountChargeOffParams
import com.lithic.api.models.FinancialAccountCreateParams
import com.lithic.api.models.FinancialAccountCreditConfig
import com.lithic.api.models.FinancialAccountListPage
import com.lithic.api.models.FinancialAccountListParams
import com.lithic.api.models.FinancialAccountRetrieveParams
import com.lithic.api.models.FinancialAccountUpdateParams
import com.lithic.api.services.blocking.financialAccounts.BalanceService
import com.lithic.api.services.blocking.financialAccounts.CreditConfigurationService
import com.lithic.api.services.blocking.financialAccounts.FinancialTransactionService
import com.lithic.api.services.blocking.financialAccounts.LoanTapeService
import com.lithic.api.services.blocking.financialAccounts.StatementService

interface FinancialAccountService {

    fun balances(): BalanceService

    fun financialTransactions(): FinancialTransactionService

    fun creditConfiguration(): CreditConfigurationService

    fun statements(): StatementService

    fun loanTapes(): LoanTapeService

    /** Create a new financial account */
    fun create(
        params: FinancialAccountCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): FinancialAccount

    /** Get a financial account */
    fun retrieve(
        params: FinancialAccountRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): FinancialAccount

    /** Update a financial account */
    fun update(
        params: FinancialAccountUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): FinancialAccount

    /** Retrieve information on your financial accounts including routing and account number. */
    fun list(
        params: FinancialAccountListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): FinancialAccountListPage

    /** Update issuing account state to charged off */
    fun chargeOff(
        params: FinancialAccountChargeOffParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): FinancialAccountCreditConfig
}
