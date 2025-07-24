// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.services.async

import com.google.errorprone.annotations.MustBeClosed
import com.lithic.api.core.ClientOptions
import com.lithic.api.core.RequestOptions
import com.lithic.api.core.http.HttpResponseFor
import com.lithic.api.models.AggregateBalanceListPageAsync
import com.lithic.api.models.AggregateBalanceListParams

interface AggregateBalanceServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): AggregateBalanceServiceAsync

    /** Get the aggregated balance across all end-user accounts by financial account type */
    suspend fun list(
        params: AggregateBalanceListParams = AggregateBalanceListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AggregateBalanceListPageAsync

    /** @see list */
    suspend fun list(requestOptions: RequestOptions): AggregateBalanceListPageAsync =
        list(AggregateBalanceListParams.none(), requestOptions)

    /**
     * A view of [AggregateBalanceServiceAsync] that provides access to raw HTTP responses for each
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
        ): AggregateBalanceServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /v1/aggregate_balances`, but is otherwise the same
         * as [AggregateBalanceServiceAsync.list].
         */
        @MustBeClosed
        suspend fun list(
            params: AggregateBalanceListParams = AggregateBalanceListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AggregateBalanceListPageAsync>

        /** @see list */
        @MustBeClosed
        suspend fun list(
            requestOptions: RequestOptions
        ): HttpResponseFor<AggregateBalanceListPageAsync> =
            list(AggregateBalanceListParams.none(), requestOptions)
    }
}
