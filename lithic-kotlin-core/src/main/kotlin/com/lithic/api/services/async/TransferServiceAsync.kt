// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.services.async

import com.lithic.api.core.RequestOptions
import com.lithic.api.models.Transfer
import com.lithic.api.models.TransferCreateParams

interface TransferServiceAsync {

    /** Transfer funds between two financial accounts or between a financial account and card */
    suspend fun create(
        params: TransferCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Transfer
}
