// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.services.async

import com.google.errorprone.annotations.MustBeClosed
import com.lithic.api.core.ClientOptions
import com.lithic.api.core.RequestOptions
import com.lithic.api.core.http.HttpResponseFor
import com.lithic.api.models.TransferLimitListPageAsync
import com.lithic.api.models.TransferLimitListParams

interface TransferLimitServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): TransferLimitServiceAsync

    /** Get transfer limits for a specified date */
    suspend fun list(
        params: TransferLimitListParams = TransferLimitListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): TransferLimitListPageAsync

    /** @see list */
    suspend fun list(requestOptions: RequestOptions): TransferLimitListPageAsync =
        list(TransferLimitListParams.none(), requestOptions)

    /**
     * A view of [TransferLimitServiceAsync] that provides access to raw HTTP responses for each
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
        ): TransferLimitServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /v1/transfer_limits`, but is otherwise the same as
         * [TransferLimitServiceAsync.list].
         */
        @MustBeClosed
        suspend fun list(
            params: TransferLimitListParams = TransferLimitListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<TransferLimitListPageAsync>

        /** @see list */
        @MustBeClosed
        suspend fun list(
            requestOptions: RequestOptions
        ): HttpResponseFor<TransferLimitListPageAsync> =
            list(TransferLimitListParams.none(), requestOptions)
    }
}
