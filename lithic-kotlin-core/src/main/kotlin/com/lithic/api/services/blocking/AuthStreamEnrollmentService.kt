// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.services.blocking

import com.lithic.api.core.RequestOptions
import com.lithic.api.models.AuthStreamEnrollmentRetrieveSecretParams
import com.lithic.api.models.AuthStreamEnrollmentRotateSecretParams
import com.lithic.api.models.AuthStreamSecret

interface AuthStreamEnrollmentService {

    /**
     * Retrieve the ASA HMAC secret key. If one does not exist for your program yet, calling this
     * endpoint will create one for you. The headers (which you can use to verify webhooks) will
     * begin appearing shortly after calling this endpoint for the first time. See
     * [this page](https://docs.lithic.com/docs/auth-stream-access-asa#asa-webhook-verification) for
     * more detail about verifying ASA webhooks.
     */
    fun retrieveSecret(
        params: AuthStreamEnrollmentRetrieveSecretParams =
            AuthStreamEnrollmentRetrieveSecretParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AuthStreamSecret

    /**
     * Retrieve the ASA HMAC secret key. If one does not exist for your program yet, calling this
     * endpoint will create one for you. The headers (which you can use to verify webhooks) will
     * begin appearing shortly after calling this endpoint for the first time. See
     * [this page](https://docs.lithic.com/docs/auth-stream-access-asa#asa-webhook-verification) for
     * more detail about verifying ASA webhooks.
     */
    fun retrieveSecret(requestOptions: RequestOptions): AuthStreamSecret =
        retrieveSecret(AuthStreamEnrollmentRetrieveSecretParams.none(), requestOptions)

    /**
     * Generate a new ASA HMAC secret key. The old ASA HMAC secret key will be deactivated 24 hours
     * after a successful request to this endpoint. Make a
     * [`GET /auth_stream/secret`](https://docs.lithic.com/reference/getauthstreamsecret) request to
     * retrieve the new secret key.
     */
    fun rotateSecret(
        params: AuthStreamEnrollmentRotateSecretParams =
            AuthStreamEnrollmentRotateSecretParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /**
     * Generate a new ASA HMAC secret key. The old ASA HMAC secret key will be deactivated 24 hours
     * after a successful request to this endpoint. Make a
     * [`GET /auth_stream/secret`](https://docs.lithic.com/reference/getauthstreamsecret) request to
     * retrieve the new secret key.
     */
    fun rotateSecret(requestOptions: RequestOptions) =
        rotateSecret(AuthStreamEnrollmentRotateSecretParams.none(), requestOptions)
}
