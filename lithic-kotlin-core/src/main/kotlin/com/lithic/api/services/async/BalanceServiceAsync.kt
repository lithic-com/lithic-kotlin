// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.services.async

import com.lithic.api.core.RequestOptions
import com.lithic.api.models.BalanceListPageAsync
import com.lithic.api.models.BalanceListParams

interface BalanceServiceAsync {

    /** Get the balances for a program, business, or a given end-user account */
    suspend fun list(
        params: BalanceListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BalanceListPageAsync
}
