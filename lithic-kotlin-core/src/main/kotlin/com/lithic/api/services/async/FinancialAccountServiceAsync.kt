@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.lithic.api.services.async

import com.lithic.api.core.RequestOptions
import com.lithic.api.models.FinancialAccountListPageAsync
import com.lithic.api.models.FinancialAccountListParams
import com.lithic.api.services.async.financialAccounts.BalanceServiceAsync
import com.lithic.api.services.async.financialAccounts.FinancialTransactionServiceAsync

interface FinancialAccountServiceAsync {

    fun balances(): BalanceServiceAsync

    fun financialTransactions(): FinancialTransactionServiceAsync

    /** Retrieve information on your financial accounts including routing and account number. */
    suspend fun list(
        params: FinancialAccountListParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): FinancialAccountListPageAsync
}
