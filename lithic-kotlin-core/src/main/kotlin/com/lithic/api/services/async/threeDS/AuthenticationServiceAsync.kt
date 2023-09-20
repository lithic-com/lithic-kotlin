@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.lithic.api.services.async.threeDS

import com.lithic.api.core.RequestOptions
import com.lithic.api.models.AuthenticationRetrieveResponse
import com.lithic.api.models.AuthenticationSimulateResponse
import com.lithic.api.models.ThreeDSAuthenticationRetrieveParams
import com.lithic.api.models.ThreeDSAuthenticationSimulateParams

interface AuthenticationServiceAsync {

    /** Get 3DS Authentication by token */
    suspend fun retrieve(
        params: ThreeDSAuthenticationRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): AuthenticationRetrieveResponse

    /**
     * Simulates a 3DS authentication request from the payment network as if it came from an ACS. If
     * you're configured for 3DS Customer Decisioning, simulating authentications requires your
     * customer decisioning endpoint to be set up properly (respond with a valid JSON).
     */
    suspend fun simulate(
        params: ThreeDSAuthenticationSimulateParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): AuthenticationSimulateResponse
}
