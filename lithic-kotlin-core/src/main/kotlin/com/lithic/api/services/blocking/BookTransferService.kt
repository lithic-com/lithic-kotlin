// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.lithic.api.core.RequestOptions
import com.lithic.api.core.http.HttpResponseFor
import com.lithic.api.models.booktransfers.BookTransferCreateParams
import com.lithic.api.models.booktransfers.BookTransferListPage
import com.lithic.api.models.booktransfers.BookTransferListParams
import com.lithic.api.models.booktransfers.BookTransferResponse
import com.lithic.api.models.booktransfers.BookTransferRetrieveParams
import com.lithic.api.models.booktransfers.BookTransferReverseParams

interface BookTransferService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Book transfer funds between two financial accounts or between a financial account and card
     */
    fun create(
        params: BookTransferCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BookTransferResponse

    /** Get book transfer by token */
    fun retrieve(
        params: BookTransferRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BookTransferResponse

    /** List book transfers */
    fun list(
        params: BookTransferListParams = BookTransferListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BookTransferListPage

    /** @see [list] */
    fun list(requestOptions: RequestOptions): BookTransferListPage =
        list(BookTransferListParams.none(), requestOptions)

    /** Reverse a book transfer */
    fun reverse(
        params: BookTransferReverseParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BookTransferResponse

    /**
     * A view of [BookTransferService] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `post /v1/book_transfers`, but is otherwise the same as
         * [BookTransferService.create].
         */
        @MustBeClosed
        fun create(
            params: BookTransferCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BookTransferResponse>

        /**
         * Returns a raw HTTP response for `get /v1/book_transfers/{book_transfer_token}`, but is
         * otherwise the same as [BookTransferService.retrieve].
         */
        @MustBeClosed
        fun retrieve(
            params: BookTransferRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BookTransferResponse>

        /**
         * Returns a raw HTTP response for `get /v1/book_transfers`, but is otherwise the same as
         * [BookTransferService.list].
         */
        @MustBeClosed
        fun list(
            params: BookTransferListParams = BookTransferListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BookTransferListPage>

        /** @see [list] */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<BookTransferListPage> =
            list(BookTransferListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /v1/book_transfers/{book_transfer_token}/reverse`,
         * but is otherwise the same as [BookTransferService.reverse].
         */
        @MustBeClosed
        fun reverse(
            params: BookTransferReverseParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BookTransferResponse>
    }
}
