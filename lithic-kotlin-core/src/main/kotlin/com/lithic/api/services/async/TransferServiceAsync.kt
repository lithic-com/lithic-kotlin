// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.services.async

import com.google.errorprone.annotations.MustBeClosed
import com.lithic.api.core.RequestOptions
import com.lithic.api.core.http.HttpResponseFor
import com.lithic.api.models.transfers.Transfer
import com.lithic.api.models.transfers.TransferCreateParams

interface TransferServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /** Transfer funds between two financial accounts or between a financial account and card */
    suspend fun create(
        params: TransferCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Transfer

    /**
     * A view of [TransferServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `post /v1/transfer`, but is otherwise the same as
         * [TransferServiceAsync.create].
         */
        @MustBeClosed
        suspend fun create(
            params: TransferCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Transfer>
    }
}
