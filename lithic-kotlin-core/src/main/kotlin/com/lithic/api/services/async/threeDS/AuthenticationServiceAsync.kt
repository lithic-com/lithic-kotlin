@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.lithic.api.services.async.threeDS

import com.lithic.api.core.RequestOptions
import com.lithic.api.models.AuthenticationRetrieveResponse
import com.lithic.api.models.ThreeDSAuthenticationRetrieveParams

interface AuthenticationServiceAsync {

    /** Get 3DS Authentication by token */
    suspend fun retrieve(
        params: ThreeDSAuthenticationRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): AuthenticationRetrieveResponse
}