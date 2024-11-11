// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.services.blocking

import com.lithic.api.core.RequestOptions
import com.lithic.api.models.BalanceListPage
import com.lithic.api.models.BalanceListParams

interface BalanceService {

    /** Get the balances for a program, business, or a given end-user account */
    fun list(
        params: BalanceListParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): BalanceListPage
}
