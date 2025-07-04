// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.services.async.threeDS

import com.google.errorprone.annotations.MustBeClosed
import com.lithic.api.core.ClientOptions
import com.lithic.api.core.RequestOptions
import com.lithic.api.core.http.HttpResponse
import com.lithic.api.core.http.HttpResponseFor
import com.lithic.api.models.AuthenticationRetrieveResponse
import com.lithic.api.models.AuthenticationSimulateResponse
import com.lithic.api.models.ThreeDSAuthenticationRetrieveParams
import com.lithic.api.models.ThreeDSAuthenticationSimulateOtpEntryParams
import com.lithic.api.models.ThreeDSAuthenticationSimulateParams

interface AuthenticationServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): AuthenticationServiceAsync

    /** Get 3DS Authentication by token */
    suspend fun retrieve(
        threeDSAuthenticationToken: String,
        params: ThreeDSAuthenticationRetrieveParams = ThreeDSAuthenticationRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AuthenticationRetrieveResponse =
        retrieve(
            params.toBuilder().threeDSAuthenticationToken(threeDSAuthenticationToken).build(),
            requestOptions,
        )

    /** @see [retrieve] */
    suspend fun retrieve(
        params: ThreeDSAuthenticationRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AuthenticationRetrieveResponse

    /** @see [retrieve] */
    suspend fun retrieve(
        threeDSAuthenticationToken: String,
        requestOptions: RequestOptions,
    ): AuthenticationRetrieveResponse =
        retrieve(
            threeDSAuthenticationToken,
            ThreeDSAuthenticationRetrieveParams.none(),
            requestOptions,
        )

    /**
     * Simulates a 3DS authentication request from the payment network as if it came from an ACS. If
     * you're configured for 3DS Customer Decisioning, simulating authentications requires your
     * customer decisioning endpoint to be set up properly (respond with a valid JSON). If the
     * authentication decision is to challenge, ensure that the account holder associated with the
     * card transaction has a valid phone number configured to receive the OTP code via SMS.
     */
    suspend fun simulate(
        params: ThreeDSAuthenticationSimulateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AuthenticationSimulateResponse

    /**
     * Endpoint for simulating entering OTP into 3DS Challenge UI. A call to
     * [/v1/three_ds_authentication/simulate](https://docs.lithic.com/reference/postsimulateauthentication)
     * that resulted in triggered SMS-OTP challenge must precede. Only a single attempt is
     * supported; upon entering OTP, the challenge is either approved or declined.
     */
    suspend fun simulateOtpEntry(
        params: ThreeDSAuthenticationSimulateOtpEntryParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /**
     * A view of [AuthenticationServiceAsync] that provides access to raw HTTP responses for each
     * method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): AuthenticationServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get
         * /v1/three_ds_authentication/{three_ds_authentication_token}`, but is otherwise the same
         * as [AuthenticationServiceAsync.retrieve].
         */
        @MustBeClosed
        suspend fun retrieve(
            threeDSAuthenticationToken: String,
            params: ThreeDSAuthenticationRetrieveParams =
                ThreeDSAuthenticationRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AuthenticationRetrieveResponse> =
            retrieve(
                params.toBuilder().threeDSAuthenticationToken(threeDSAuthenticationToken).build(),
                requestOptions,
            )

        /** @see [retrieve] */
        @MustBeClosed
        suspend fun retrieve(
            params: ThreeDSAuthenticationRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AuthenticationRetrieveResponse>

        /** @see [retrieve] */
        @MustBeClosed
        suspend fun retrieve(
            threeDSAuthenticationToken: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<AuthenticationRetrieveResponse> =
            retrieve(
                threeDSAuthenticationToken,
                ThreeDSAuthenticationRetrieveParams.none(),
                requestOptions,
            )

        /**
         * Returns a raw HTTP response for `post /v1/three_ds_authentication/simulate`, but is
         * otherwise the same as [AuthenticationServiceAsync.simulate].
         */
        @MustBeClosed
        suspend fun simulate(
            params: ThreeDSAuthenticationSimulateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AuthenticationSimulateResponse>

        /**
         * Returns a raw HTTP response for `post /v1/three_ds_decisioning/simulate/enter_otp`, but
         * is otherwise the same as [AuthenticationServiceAsync.simulateOtpEntry].
         */
        @MustBeClosed
        suspend fun simulateOtpEntry(
            params: ThreeDSAuthenticationSimulateOtpEntryParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse
    }
}
