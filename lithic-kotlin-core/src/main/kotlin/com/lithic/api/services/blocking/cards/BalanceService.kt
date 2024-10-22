// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.services.blocking.cards

import com.lithic.api.core.RequestOptions
import com.lithic.api.models.CardBalanceListPage
import com.lithic.api.models.CardBalanceListParams

interface BalanceService {

    /** Get the balances for a given card. */
    fun list(
        params: CardBalanceListParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CardBalanceListPage
}
