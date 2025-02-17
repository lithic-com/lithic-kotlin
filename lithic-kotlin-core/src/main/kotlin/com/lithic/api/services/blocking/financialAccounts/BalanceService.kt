// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.services.blocking.financialAccounts

import com.lithic.api.core.RequestOptions
import com.lithic.api.models.FinancialAccountBalanceListPage
import com.lithic.api.models.FinancialAccountBalanceListParams

interface BalanceService {

    /** Get the balances for a given financial account. */
    fun list(
        params: FinancialAccountBalanceListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): FinancialAccountBalanceListPage
}
