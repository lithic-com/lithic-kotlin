// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.services.async.threeDS

import com.google.errorprone.annotations.MustBeClosed
import com.lithic.api.core.ClientOptions
import com.lithic.api.core.RequestOptions
import com.lithic.api.core.http.HttpResponse
import com.lithic.api.core.http.HttpResponseFor
import com.lithic.api.models.DecisioningRetrieveSecretResponse
import com.lithic.api.models.ThreeDSDecisioningChallengeResponseParams
import com.lithic.api.models.ThreeDSDecisioningRetrieveSecretParams
import com.lithic.api.models.ThreeDSDecisioningRotateSecretParams

interface DecisioningServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): DecisioningServiceAsync

    /**
     * Card program's response to a 3DS Challenge Request. Challenge Request is emitted as a webhook
     * [three_ds_authentication.challenge](https://docs.lithic.com/reference/post_three-ds-authentication-challenge)
     * and your Card Program needs to be configured with Out of Band (OOB) Challenges in order to
     * receive it (see https://docs.lithic.com/docs/3ds-challenge-flow for more information).
     */
    suspend fun challengeResponse(
        params: ThreeDSDecisioningChallengeResponseParams,
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
        params: ThreeDSDecisioningRetrieveSecretParams =
            ThreeDSDecisioningRetrieveSecretParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): DecisioningRetrieveSecretResponse

    /** @see [retrieveSecret] */
    suspend fun retrieveSecret(requestOptions: RequestOptions): DecisioningRetrieveSecretResponse =
        retrieveSecret(ThreeDSDecisioningRetrieveSecretParams.none(), requestOptions)

    /**
     * Generate a new 3DS Decisioning HMAC secret key. The old secret key will be deactivated 24
     * hours after a successful request to this endpoint. Make a
     * [`GET /three_ds_decisioning/secret`](https://docs.lithic.com/reference/getthreedsdecisioningsecret)
     * request to retrieve the new secret key.
     */
    suspend fun rotateSecret(
        params: ThreeDSDecisioningRotateSecretParams = ThreeDSDecisioningRotateSecretParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** @see [rotateSecret] */
    suspend fun rotateSecret(requestOptions: RequestOptions) =
        rotateSecret(ThreeDSDecisioningRotateSecretParams.none(), requestOptions)

    /**
     * A view of [DecisioningServiceAsync] that provides access to raw HTTP responses for each
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
        ): DecisioningServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /v1/three_ds_decisioning/challenge_response`, but
         * is otherwise the same as [DecisioningServiceAsync.challengeResponse].
         */
        @MustBeClosed
        suspend fun challengeResponse(
            params: ThreeDSDecisioningChallengeResponseParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /**
         * Returns a raw HTTP response for `get /v1/three_ds_decisioning/secret`, but is otherwise
         * the same as [DecisioningServiceAsync.retrieveSecret].
         */
        @MustBeClosed
        suspend fun retrieveSecret(
            params: ThreeDSDecisioningRetrieveSecretParams =
                ThreeDSDecisioningRetrieveSecretParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<DecisioningRetrieveSecretResponse>

        /** @see [retrieveSecret] */
        @MustBeClosed
        suspend fun retrieveSecret(
            requestOptions: RequestOptions
        ): HttpResponseFor<DecisioningRetrieveSecretResponse> =
            retrieveSecret(ThreeDSDecisioningRetrieveSecretParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /v1/three_ds_decisioning/secret/rotate`, but is
         * otherwise the same as [DecisioningServiceAsync.rotateSecret].
         */
        @MustBeClosed
        suspend fun rotateSecret(
            params: ThreeDSDecisioningRotateSecretParams =
                ThreeDSDecisioningRotateSecretParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see [rotateSecret] */
        @MustBeClosed
        suspend fun rotateSecret(requestOptions: RequestOptions): HttpResponse =
            rotateSecret(ThreeDSDecisioningRotateSecretParams.none(), requestOptions)
    }
}
