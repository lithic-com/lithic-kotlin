// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.services.blocking

import com.lithic.api.core.RequestOptions
import com.lithic.api.models.AggregateBalanceListPage
import com.lithic.api.models.AggregateBalanceListParams

interface AggregateBalanceService {

    /** Get the aggregated balance across all end-user accounts by financial account type */
    fun list(
        params: AggregateBalanceListParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): AggregateBalanceListPage
}
