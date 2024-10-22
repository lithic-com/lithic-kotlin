// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.services.async.cards

import com.lithic.api.core.RequestOptions
import com.lithic.api.models.CardAggregateBalanceListPageAsync
import com.lithic.api.models.CardAggregateBalanceListParams

interface AggregateBalanceServiceAsync {

    /** Get the aggregated card balance across all end-user accounts. */
    suspend fun list(
        params: CardAggregateBalanceListParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CardAggregateBalanceListPageAsync
}
