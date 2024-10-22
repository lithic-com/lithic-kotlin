// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.services.async

import com.lithic.api.core.RequestOptions
import com.lithic.api.models.CardProgram
import com.lithic.api.models.CardProgramListPageAsync
import com.lithic.api.models.CardProgramListParams
import com.lithic.api.models.CardProgramRetrieveParams

interface CardProgramServiceAsync {

    /** Get card program. */
    suspend fun retrieve(
        params: CardProgramRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CardProgram

    /** List card programs. */
    suspend fun list(
        params: CardProgramListParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CardProgramListPageAsync
}
