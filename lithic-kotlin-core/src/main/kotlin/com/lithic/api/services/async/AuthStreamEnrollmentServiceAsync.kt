// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.services.async

import com.google.errorprone.annotations.MustBeClosed
import com.lithic.api.core.ClientOptions
import com.lithic.api.core.RequestOptions
import com.lithic.api.core.http.HttpResponse
import com.lithic.api.core.http.HttpResponseFor
import com.lithic.api.models.AuthStreamEnrollmentRetrieveSecretParams
import com.lithic.api.models.AuthStreamEnrollmentRotateSecretParams
import com.lithic.api.models.AuthStreamSecret

interface AuthStreamEnrollmentServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): AuthStreamEnrollmentServiceAsync

    /**
     * Retrieve the ASA HMAC secret key. If one does not exist for your program yet, calling this
     * endpoint will create one for you. The headers (which you can use to verify webhooks) will
     * begin appearing shortly after calling this endpoint for the first time. See
     * [this page](https://docs.lithic.com/docs/auth-stream-access-asa#asa-webhook-verification) for
     * more detail about verifying ASA webhooks.
     */
    suspend fun retrieveSecret(
        params: AuthStreamEnrollmentRetrieveSecretParams =
            AuthStreamEnrollmentRetrieveSecretParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AuthStreamSecret

    /** @see retrieveSecret */
    suspend fun retrieveSecret(requestOptions: RequestOptions): AuthStreamSecret =
        retrieveSecret(AuthStreamEnrollmentRetrieveSecretParams.none(), requestOptions)

    /**
     * Generate a new ASA HMAC secret key. The old ASA HMAC secret key will be deactivated 24 hours
     * after a successful request to this endpoint. Make a
     * [`GET /auth_stream/secret`](https://docs.lithic.com/reference/getauthstreamsecret) request to
     * retrieve the new secret key.
     */
    suspend fun rotateSecret(
        params: AuthStreamEnrollmentRotateSecretParams =
            AuthStreamEnrollmentRotateSecretParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** @see rotateSecret */
    suspend fun rotateSecret(requestOptions: RequestOptions) =
        rotateSecret(AuthStreamEnrollmentRotateSecretParams.none(), requestOptions)

    /**
     * A view of [AuthStreamEnrollmentServiceAsync] that provides access to raw HTTP responses for
     * each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): AuthStreamEnrollmentServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /v1/auth_stream/secret`, but is otherwise the same
         * as [AuthStreamEnrollmentServiceAsync.retrieveSecret].
         */
        @MustBeClosed
        suspend fun retrieveSecret(
            params: AuthStreamEnrollmentRetrieveSecretParams =
                AuthStreamEnrollmentRetrieveSecretParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AuthStreamSecret>

        /** @see retrieveSecret */
        @MustBeClosed
        suspend fun retrieveSecret(
            requestOptions: RequestOptions
        ): HttpResponseFor<AuthStreamSecret> =
            retrieveSecret(AuthStreamEnrollmentRetrieveSecretParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /v1/auth_stream/secret/rotate`, but is otherwise
         * the same as [AuthStreamEnrollmentServiceAsync.rotateSecret].
         */
        @MustBeClosed
        suspend fun rotateSecret(
            params: AuthStreamEnrollmentRotateSecretParams =
                AuthStreamEnrollmentRotateSecretParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see rotateSecret */
        @MustBeClosed
        suspend fun rotateSecret(requestOptions: RequestOptions): HttpResponse =
            rotateSecret(AuthStreamEnrollmentRotateSecretParams.none(), requestOptions)
    }
}
