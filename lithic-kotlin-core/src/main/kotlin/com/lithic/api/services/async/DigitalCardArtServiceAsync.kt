// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.lithic.api.services.async

import com.lithic.api.core.RequestOptions
import com.lithic.api.models.DigitalCardArtListPageAsync
import com.lithic.api.models.DigitalCardArtListParams

interface DigitalCardArtServiceAsync {

    /** List digital card art. */
    suspend fun list(
        params: DigitalCardArtListParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): DigitalCardArtListPageAsync
}
