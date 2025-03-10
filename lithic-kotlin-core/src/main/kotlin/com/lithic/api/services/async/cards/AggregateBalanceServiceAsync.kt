// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.services.async.cards

import com.google.errorprone.annotations.MustBeClosed
import com.lithic.api.core.RequestOptions
import com.lithic.api.core.http.HttpResponseFor
import com.lithic.api.models.CardAggregateBalanceListPageAsync
import com.lithic.api.models.CardAggregateBalanceListParams

interface AggregateBalanceServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /** Get the aggregated card balance across all end-user accounts. */
    suspend fun list(
        params: CardAggregateBalanceListParams = CardAggregateBalanceListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CardAggregateBalanceListPageAsync

    /** @see [list] */
    suspend fun list(requestOptions: RequestOptions): CardAggregateBalanceListPageAsync =
        list(CardAggregateBalanceListParams.none(), requestOptions)

    /**
     * A view of [AggregateBalanceServiceAsync] that provides access to raw HTTP responses for each
     * method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `get /v1/cards/aggregate_balances`, but is otherwise the
         * same as [AggregateBalanceServiceAsync.list].
         */
        @MustBeClosed
        suspend fun list(
            params: CardAggregateBalanceListParams = CardAggregateBalanceListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CardAggregateBalanceListPageAsync>

        /** @see [list] */
        @MustBeClosed
        suspend fun list(
            requestOptions: RequestOptions
        ): HttpResponseFor<CardAggregateBalanceListPageAsync> =
            list(CardAggregateBalanceListParams.none(), requestOptions)
    }
}
