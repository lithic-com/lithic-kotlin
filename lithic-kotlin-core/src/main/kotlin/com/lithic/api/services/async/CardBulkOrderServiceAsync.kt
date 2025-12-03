// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.services.async

import com.google.errorprone.annotations.MustBeClosed
import com.lithic.api.core.ClientOptions
import com.lithic.api.core.RequestOptions
import com.lithic.api.core.http.HttpResponseFor
import com.lithic.api.models.CardBulkOrder
import com.lithic.api.models.CardBulkOrderCreateParams
import com.lithic.api.models.CardBulkOrderListPageAsync
import com.lithic.api.models.CardBulkOrderListParams
import com.lithic.api.models.CardBulkOrderRetrieveParams
import com.lithic.api.models.CardBulkOrderUpdateParams

interface CardBulkOrderServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): CardBulkOrderServiceAsync

    /**
     * Create a new bulk order for physical card shipments **[BETA]**. Cards can be added to the
     * order via the POST /v1/cards endpoint by specifying the bulk_order_token. Lock the order via
     * PATCH /v1/card_bulk_orders/{bulk_order_token} to prepare for shipment. Please work with your
     * Customer Success Manager and card personalization bureau to ensure bulk shipping is supported
     * for your program.
     */
    suspend fun create(
        params: CardBulkOrderCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CardBulkOrder

    /** Retrieve a specific bulk order by token **[BETA]** */
    suspend fun retrieve(
        bulkOrderToken: String,
        params: CardBulkOrderRetrieveParams = CardBulkOrderRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CardBulkOrder =
        retrieve(params.toBuilder().bulkOrderToken(bulkOrderToken).build(), requestOptions)

    /** @see retrieve */
    suspend fun retrieve(
        params: CardBulkOrderRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CardBulkOrder

    /** @see retrieve */
    suspend fun retrieve(bulkOrderToken: String, requestOptions: RequestOptions): CardBulkOrder =
        retrieve(bulkOrderToken, CardBulkOrderRetrieveParams.none(), requestOptions)

    /**
     * Update a bulk order **[BETA]**. Primarily used to lock the order, preventing additional cards
     * from being added
     */
    suspend fun update(
        bulkOrderToken: String,
        params: CardBulkOrderUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CardBulkOrder =
        update(params.toBuilder().bulkOrderToken(bulkOrderToken).build(), requestOptions)

    /** @see update */
    suspend fun update(
        params: CardBulkOrderUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CardBulkOrder

    /** List bulk orders for physical card shipments **[BETA]** */
    suspend fun list(
        params: CardBulkOrderListParams = CardBulkOrderListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CardBulkOrderListPageAsync

    /** @see list */
    suspend fun list(requestOptions: RequestOptions): CardBulkOrderListPageAsync =
        list(CardBulkOrderListParams.none(), requestOptions)

    /**
     * A view of [CardBulkOrderServiceAsync] that provides access to raw HTTP responses for each
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
        ): CardBulkOrderServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /v1/card_bulk_orders`, but is otherwise the same as
         * [CardBulkOrderServiceAsync.create].
         */
        @MustBeClosed
        suspend fun create(
            params: CardBulkOrderCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CardBulkOrder>

        /**
         * Returns a raw HTTP response for `get /v1/card_bulk_orders/{bulk_order_token}`, but is
         * otherwise the same as [CardBulkOrderServiceAsync.retrieve].
         */
        @MustBeClosed
        suspend fun retrieve(
            bulkOrderToken: String,
            params: CardBulkOrderRetrieveParams = CardBulkOrderRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CardBulkOrder> =
            retrieve(params.toBuilder().bulkOrderToken(bulkOrderToken).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        suspend fun retrieve(
            params: CardBulkOrderRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CardBulkOrder>

        /** @see retrieve */
        @MustBeClosed
        suspend fun retrieve(
            bulkOrderToken: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CardBulkOrder> =
            retrieve(bulkOrderToken, CardBulkOrderRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `patch /v1/card_bulk_orders/{bulk_order_token}`, but is
         * otherwise the same as [CardBulkOrderServiceAsync.update].
         */
        @MustBeClosed
        suspend fun update(
            bulkOrderToken: String,
            params: CardBulkOrderUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CardBulkOrder> =
            update(params.toBuilder().bulkOrderToken(bulkOrderToken).build(), requestOptions)

        /** @see update */
        @MustBeClosed
        suspend fun update(
            params: CardBulkOrderUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CardBulkOrder>

        /**
         * Returns a raw HTTP response for `get /v1/card_bulk_orders`, but is otherwise the same as
         * [CardBulkOrderServiceAsync.list].
         */
        @MustBeClosed
        suspend fun list(
            params: CardBulkOrderListParams = CardBulkOrderListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CardBulkOrderListPageAsync>

        /** @see list */
        @MustBeClosed
        suspend fun list(
            requestOptions: RequestOptions
        ): HttpResponseFor<CardBulkOrderListPageAsync> =
            list(CardBulkOrderListParams.none(), requestOptions)
    }
}
