// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.services.async

import com.google.errorprone.annotations.MustBeClosed
import com.lithic.api.core.ClientOptions
import com.lithic.api.core.RequestOptions
import com.lithic.api.core.http.HttpResponseFor
import com.lithic.api.models.BlockchainRecipient
import com.lithic.api.models.BlockchainRecipientCreateParams

interface BlockchainRecipientServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): BlockchainRecipientServiceAsync

    /**
     * Register a blockchain address as a withdrawal destination for a financial account
     *
     * The recipient is created with a `PENDING` verification state and cannot receive a payout
     * until screening of the address completes. Registering an address that is already registered
     * to the same financial account returns the existing recipient and its current verification
     * state, rather than creating a second one
     */
    suspend fun create(
        params: BlockchainRecipientCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BlockchainRecipient

    /**
     * A view of [BlockchainRecipientServiceAsync] that provides access to raw HTTP responses for
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
        ): BlockchainRecipientServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /v1/blockchain_recipients`, but is otherwise the
         * same as [BlockchainRecipientServiceAsync.create].
         */
        @MustBeClosed
        suspend fun create(
            params: BlockchainRecipientCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BlockchainRecipient>
    }
}
