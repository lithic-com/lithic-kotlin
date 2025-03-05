// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.services.async

import com.google.errorprone.annotations.MustBeClosed
import com.lithic.api.core.RequestOptions
import com.lithic.api.core.http.HttpResponseFor
import com.lithic.api.models.BookTransferCreateParams
import com.lithic.api.models.BookTransferListPageAsync
import com.lithic.api.models.BookTransferListParams
import com.lithic.api.models.BookTransferResponse
import com.lithic.api.models.BookTransferRetrieveParams
import com.lithic.api.models.BookTransferReverseParams

interface BookTransferServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Book transfer funds between two financial accounts or between a financial account and card
     */
    suspend fun create(
        params: BookTransferCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BookTransferResponse

    /** Get book transfer by token */
    suspend fun retrieve(
        params: BookTransferRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BookTransferResponse

    /** List book transfers */
    suspend fun list(
        params: BookTransferListParams = BookTransferListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BookTransferListPageAsync

    /** List book transfers */
    suspend fun list(requestOptions: RequestOptions): BookTransferListPageAsync =
        list(BookTransferListParams.none(), requestOptions)

    /** Reverse a book transfer */
    suspend fun reverse(
        params: BookTransferReverseParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BookTransferResponse

    /**
     * A view of [BookTransferServiceAsync] that provides access to raw HTTP responses for each
     * method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `post /v1/book_transfers`, but is otherwise the same as
         * [BookTransferServiceAsync.create].
         */
        @MustBeClosed
        suspend fun create(
            params: BookTransferCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BookTransferResponse>

        /**
         * Returns a raw HTTP response for `get /v1/book_transfers/{book_transfer_token}`, but is
         * otherwise the same as [BookTransferServiceAsync.retrieve].
         */
        @MustBeClosed
        suspend fun retrieve(
            params: BookTransferRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BookTransferResponse>

        /**
         * Returns a raw HTTP response for `get /v1/book_transfers`, but is otherwise the same as
         * [BookTransferServiceAsync.list].
         */
        @MustBeClosed
        suspend fun list(
            params: BookTransferListParams = BookTransferListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BookTransferListPageAsync>

        /**
         * Returns a raw HTTP response for `get /v1/book_transfers`, but is otherwise the same as
         * [BookTransferServiceAsync.list].
         */
        @MustBeClosed
        suspend fun list(
            requestOptions: RequestOptions
        ): HttpResponseFor<BookTransferListPageAsync> =
            list(BookTransferListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /v1/book_transfers/{book_transfer_token}/reverse`,
         * but is otherwise the same as [BookTransferServiceAsync.reverse].
         */
        @MustBeClosed
        suspend fun reverse(
            params: BookTransferReverseParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BookTransferResponse>
    }
}
