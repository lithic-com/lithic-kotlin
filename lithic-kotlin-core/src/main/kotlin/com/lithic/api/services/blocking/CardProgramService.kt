// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.services.blocking

import com.lithic.api.core.RequestOptions
import com.lithic.api.models.CardProgram
import com.lithic.api.models.CardProgramListPage
import com.lithic.api.models.CardProgramListParams
import com.lithic.api.models.CardProgramRetrieveParams

interface CardProgramService {

    /** Get card program. */
    fun retrieve(
        params: CardProgramRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CardProgram

    /** List card programs. */
    fun list(
        params: CardProgramListParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CardProgramListPage
}
