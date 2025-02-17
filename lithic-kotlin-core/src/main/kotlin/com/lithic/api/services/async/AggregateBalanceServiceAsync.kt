// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.services.async

import com.lithic.api.core.RequestOptions
import com.lithic.api.models.AggregateBalanceListPageAsync
import com.lithic.api.models.AggregateBalanceListParams

interface AggregateBalanceServiceAsync {

    /** Get the aggregated balance across all end-user accounts by financial account type */
    suspend fun list(
        params: AggregateBalanceListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AggregateBalanceListPageAsync
}
