// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.services.async.threeds

import com.google.errorprone.annotations.MustBeClosed
import com.lithic.api.core.RequestOptions
import com.lithic.api.core.http.HttpResponse
import com.lithic.api.core.http.HttpResponseFor
import com.lithic.api.models.threeds.decisioning.DecisioningChallengeResponseParams
import com.lithic.api.models.threeds.decisioning.DecisioningRetrieveSecretParams
import com.lithic.api.models.threeds.decisioning.DecisioningRetrieveSecretResponse
import com.lithic.api.models.threeds.decisioning.DecisioningRotateSecretParams
import com.lithic.api.models.threeds.decisioning.DecisioningSimulateChallengeParams
import com.lithic.api.models.threeds.decisioning.DecisioningSimulateChallengeResponse
import com.lithic.api.models.threeds.decisioning.DecisioningSimulateChallengeResponseParams

interface DecisioningServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /** Card program's response to a 3DS Challenge Request (CReq) */
    suspend fun challengeResponse(
        params: DecisioningChallengeResponseParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /**
     * Retrieve the 3DS Decisioning HMAC secret key. If one does not exist for your program yet,
     * calling this endpoint will create one for you. The headers (which you can use to verify 3DS
     * Decisioning requests) will begin appearing shortly after calling this endpoint for the first
     * time. See
     * [this page](https://docs.lithic.com/docs/3ds-decisioning#3ds-decisioning-hmac-secrets) for
     * more detail about verifying 3DS Decisioning requests.
     */
    suspend fun retrieveSecret(
        params: DecisioningRetrieveSecretParams = DecisioningRetrieveSecretParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): DecisioningRetrieveSecretResponse

    /** @see [retrieveSecret] */
    suspend fun retrieveSecret(requestOptions: RequestOptions): DecisioningRetrieveSecretResponse =
        retrieveSecret(DecisioningRetrieveSecretParams.none(), requestOptions)

    /**
     * Generate a new 3DS Decisioning HMAC secret key. The old secret key will be deactivated 24
     * hours after a successful request to this endpoint. Make a
     * [`GET /three_ds_decisioning/secret`](https://docs.lithic.com/reference/getthreedsdecisioningsecret)
     * request to retrieve the new secret key.
     */
    suspend fun rotateSecret(
        params: DecisioningRotateSecretParams = DecisioningRotateSecretParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** @see [rotateSecret] */
    suspend fun rotateSecret(requestOptions: RequestOptions) =
        rotateSecret(DecisioningRotateSecretParams.none(), requestOptions)

    /**
     * Simulates a 3DS authentication challenge request from the payment network as if it came from
     * an ACS. Requires being configured for 3DS Customer Decisioning, and enrolled with Lithic's
     * Challenge solution.
     */
    suspend fun simulateChallenge(
        params: DecisioningSimulateChallengeParams = DecisioningSimulateChallengeParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): DecisioningSimulateChallengeResponse

    /** @see [simulateChallenge] */
    suspend fun simulateChallenge(
        requestOptions: RequestOptions
    ): DecisioningSimulateChallengeResponse =
        simulateChallenge(DecisioningSimulateChallengeParams.none(), requestOptions)

    /**
     * Endpoint for responding to a 3DS Challenge initiated by a call to
     * /v1/three_ds_decisioning/simulate/challenge
     */
    suspend fun simulateChallengeResponse(
        params: DecisioningSimulateChallengeResponseParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /**
     * A view of [DecisioningServiceAsync] that provides access to raw HTTP responses for each
     * method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `post /v1/three_ds_decisioning/challenge_response`, but
         * is otherwise the same as [DecisioningServiceAsync.challengeResponse].
         */
        @MustBeClosed
        suspend fun challengeResponse(
            params: DecisioningChallengeResponseParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /**
         * Returns a raw HTTP response for `get /v1/three_ds_decisioning/secret`, but is otherwise
         * the same as [DecisioningServiceAsync.retrieveSecret].
         */
        @MustBeClosed
        suspend fun retrieveSecret(
            params: DecisioningRetrieveSecretParams = DecisioningRetrieveSecretParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<DecisioningRetrieveSecretResponse>

        /** @see [retrieveSecret] */
        @MustBeClosed
        suspend fun retrieveSecret(
            requestOptions: RequestOptions
        ): HttpResponseFor<DecisioningRetrieveSecretResponse> =
            retrieveSecret(DecisioningRetrieveSecretParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /v1/three_ds_decisioning/secret/rotate`, but is
         * otherwise the same as [DecisioningServiceAsync.rotateSecret].
         */
        @MustBeClosed
        suspend fun rotateSecret(
            params: DecisioningRotateSecretParams = DecisioningRotateSecretParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see [rotateSecret] */
        @MustBeClosed
        suspend fun rotateSecret(requestOptions: RequestOptions): HttpResponse =
            rotateSecret(DecisioningRotateSecretParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /v1/three_ds_decisioning/simulate/challenge`, but
         * is otherwise the same as [DecisioningServiceAsync.simulateChallenge].
         */
        @MustBeClosed
        suspend fun simulateChallenge(
            params: DecisioningSimulateChallengeParams = DecisioningSimulateChallengeParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<DecisioningSimulateChallengeResponse>

        /** @see [simulateChallenge] */
        @MustBeClosed
        suspend fun simulateChallenge(
            requestOptions: RequestOptions
        ): HttpResponseFor<DecisioningSimulateChallengeResponse> =
            simulateChallenge(DecisioningSimulateChallengeParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post
         * /v1/three_ds_decisioning/simulate/challenge_response`, but is otherwise the same as
         * [DecisioningServiceAsync.simulateChallengeResponse].
         */
        @MustBeClosed
        suspend fun simulateChallengeResponse(
            params: DecisioningSimulateChallengeResponseParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse
    }
}
