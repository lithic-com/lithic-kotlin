// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.lithic.api.services.async.cards

import com.lithic.api.core.RequestOptions
import com.lithic.api.models.CardBalanceListPageAsync
import com.lithic.api.models.CardBalanceListParams

interface BalanceServiceAsync {

    /** Get the balances for a given card. */
    suspend fun list(
        params: CardBalanceListParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CardBalanceListPageAsync
}
