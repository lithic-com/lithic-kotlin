// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.lithic.api.core.ClientOptions
import com.lithic.api.core.RequestOptions
import com.lithic.api.core.http.HttpResponseFor
import com.lithic.api.models.BookTransferCreateParams
import com.lithic.api.models.BookTransferListPage
import com.lithic.api.models.BookTransferListParams
import com.lithic.api.models.BookTransferResponse
import com.lithic.api.models.BookTransferRetrieveParams
import com.lithic.api.models.BookTransferReverseParams

interface BookTransferService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): BookTransferService

    /**
     * Book transfer funds between two financial accounts or between a financial account and card
     */
    fun create(
        params: BookTransferCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BookTransferResponse

    /** Get book transfer by token */
    fun retrieve(
        bookTransferToken: String,
        params: BookTransferRetrieveParams = BookTransferRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BookTransferResponse =
        retrieve(params.toBuilder().bookTransferToken(bookTransferToken).build(), requestOptions)

    /** @see [retrieve] */
    fun retrieve(
        params: BookTransferRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BookTransferResponse

    /** @see [retrieve] */
    fun retrieve(bookTransferToken: String, requestOptions: RequestOptions): BookTransferResponse =
        retrieve(bookTransferToken, BookTransferRetrieveParams.none(), requestOptions)

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
        bookTransferToken: String,
        params: BookTransferReverseParams = BookTransferReverseParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BookTransferResponse =
        reverse(params.toBuilder().bookTransferToken(bookTransferToken).build(), requestOptions)

    /** @see [reverse] */
    fun reverse(
        params: BookTransferReverseParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BookTransferResponse

    /** @see [reverse] */
    fun reverse(bookTransferToken: String, requestOptions: RequestOptions): BookTransferResponse =
        reverse(bookTransferToken, BookTransferReverseParams.none(), requestOptions)

    /**
     * A view of [BookTransferService] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): BookTransferService.WithRawResponse

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
            bookTransferToken: String,
            params: BookTransferRetrieveParams = BookTransferRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BookTransferResponse> =
            retrieve(
                params.toBuilder().bookTransferToken(bookTransferToken).build(),
                requestOptions,
            )

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            params: BookTransferRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BookTransferResponse>

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            bookTransferToken: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<BookTransferResponse> =
            retrieve(bookTransferToken, BookTransferRetrieveParams.none(), requestOptions)

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
            bookTransferToken: String,
            params: BookTransferReverseParams = BookTransferReverseParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BookTransferResponse> =
            reverse(params.toBuilder().bookTransferToken(bookTransferToken).build(), requestOptions)

        /** @see [reverse] */
        @MustBeClosed
        fun reverse(
            params: BookTransferReverseParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BookTransferResponse>

        /** @see [reverse] */
        @MustBeClosed
        fun reverse(
            bookTransferToken: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<BookTransferResponse> =
            reverse(bookTransferToken, BookTransferReverseParams.none(), requestOptions)
    }
}
