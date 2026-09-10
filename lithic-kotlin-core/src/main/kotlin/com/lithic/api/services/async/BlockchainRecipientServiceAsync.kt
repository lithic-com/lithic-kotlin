// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.services.async

import com.google.errorprone.annotations.MustBeClosed
import com.lithic.api.core.ClientOptions
import com.lithic.api.core.RequestOptions
import com.lithic.api.core.http.HttpResponseFor
import com.lithic.api.models.BlockchainRecipient
import com.lithic.api.models.BlockchainRecipientCreateParams
import com.lithic.api.models.BlockchainRecipientRetrieveParams

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
     * Get a blockchain recipient by token
     *
     * Use this to poll the `verification_state` after registering an address: a recipient cannot
     * receive a payout until screening completes and moves it out of `PENDING`
     */
    suspend fun retrieve(
        blockchainRecipientToken: String,
        params: BlockchainRecipientRetrieveParams = BlockchainRecipientRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BlockchainRecipient =
        retrieve(
            params.toBuilder().blockchainRecipientToken(blockchainRecipientToken).build(),
            requestOptions,
        )

    /** @see retrieve */
    suspend fun retrieve(
        params: BlockchainRecipientRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BlockchainRecipient

    /** @see retrieve */
    suspend fun retrieve(
        blockchainRecipientToken: String,
        requestOptions: RequestOptions,
    ): BlockchainRecipient =
        retrieve(blockchainRecipientToken, BlockchainRecipientRetrieveParams.none(), requestOptions)

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

        /**
         * Returns a raw HTTP response for `get
         * /v1/blockchain_recipients/{blockchain_recipient_token}`, but is otherwise the same as
         * [BlockchainRecipientServiceAsync.retrieve].
         */
        @MustBeClosed
        suspend fun retrieve(
            blockchainRecipientToken: String,
            params: BlockchainRecipientRetrieveParams = BlockchainRecipientRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BlockchainRecipient> =
            retrieve(
                params.toBuilder().blockchainRecipientToken(blockchainRecipientToken).build(),
                requestOptions,
            )

        /** @see retrieve */
        @MustBeClosed
        suspend fun retrieve(
            params: BlockchainRecipientRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BlockchainRecipient>

        /** @see retrieve */
        @MustBeClosed
        suspend fun retrieve(
            blockchainRecipientToken: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<BlockchainRecipient> =
            retrieve(
                blockchainRecipientToken,
                BlockchainRecipientRetrieveParams.none(),
                requestOptions,
            )
    }
}
