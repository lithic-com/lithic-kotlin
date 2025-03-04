// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.services.async.threeDS

import com.google.errorprone.annotations.MustBeClosed
import com.lithic.api.core.RequestOptions
import com.lithic.api.core.http.HttpResponseFor
import com.lithic.api.models.AuthenticationRetrieveResponse
import com.lithic.api.models.AuthenticationSimulateResponse
import com.lithic.api.models.ThreeDSAuthenticationRetrieveParams
import com.lithic.api.models.ThreeDSAuthenticationSimulateParams

interface AuthenticationServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /** Get 3DS Authentication by token */
    suspend fun retrieve(
        params: ThreeDSAuthenticationRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AuthenticationRetrieveResponse

    /**
     * Simulates a 3DS authentication request from the payment network as if it came from an ACS. If
     * you're configured for 3DS Customer Decisioning, simulating authentications requires your
     * customer decisioning endpoint to be set up properly (respond with a valid JSON).
     */
    suspend fun simulate(
        params: ThreeDSAuthenticationSimulateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AuthenticationSimulateResponse

    /**
     * A view of [AuthenticationServiceAsync] that provides access to raw HTTP responses for each
     * method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `get
         * /v1/three_ds_authentication/{three_ds_authentication_token}`, but is otherwise the same
         * as [AuthenticationServiceAsync.retrieve].
         */
        @MustBeClosed
        suspend fun retrieve(
            params: ThreeDSAuthenticationRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AuthenticationRetrieveResponse>

        /**
         * Returns a raw HTTP response for `post /v1/three_ds_authentication/simulate`, but is
         * otherwise the same as [AuthenticationServiceAsync.simulate].
         */
        @MustBeClosed
        suspend fun simulate(
            params: ThreeDSAuthenticationSimulateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AuthenticationSimulateResponse>
    }
}
