@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.lithic.api.services.async

import com.lithic.api.core.RequestOptions
import com.lithic.api.models.TransferCreateParams
import com.lithic.api.models.TransferCreateResponse

interface TransferServiceAsync {

    /** Transfer funds between two financial accounts */
    suspend fun create(
        params: TransferCreateParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): TransferCreateResponse
}
