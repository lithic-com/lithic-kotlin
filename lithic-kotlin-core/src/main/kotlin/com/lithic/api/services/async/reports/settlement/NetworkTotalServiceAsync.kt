// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.services.async.reports.settlement

import com.google.errorprone.annotations.MustBeClosed
import com.lithic.api.core.ClientOptions
import com.lithic.api.core.RequestOptions
import com.lithic.api.core.http.HttpResponseFor
import com.lithic.api.models.NetworkTotal
import com.lithic.api.models.ReportSettlementNetworkTotalListPageAsync
import com.lithic.api.models.ReportSettlementNetworkTotalListParams
import com.lithic.api.models.ReportSettlementNetworkTotalRetrieveParams

interface NetworkTotalServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): NetworkTotalServiceAsync

    /** Retrieve a specific network total record by token. Not available in sandbox. */
    suspend fun retrieve(
        token: String,
        params: ReportSettlementNetworkTotalRetrieveParams =
            ReportSettlementNetworkTotalRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): NetworkTotal = retrieve(params.toBuilder().token(token).build(), requestOptions)

    /** @see retrieve */
    suspend fun retrieve(
        params: ReportSettlementNetworkTotalRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): NetworkTotal

    /** @see retrieve */
    suspend fun retrieve(token: String, requestOptions: RequestOptions): NetworkTotal =
        retrieve(token, ReportSettlementNetworkTotalRetrieveParams.none(), requestOptions)

    /** List network total records with optional filters. Not available in sandbox. */
    suspend fun list(
        params: ReportSettlementNetworkTotalListParams =
            ReportSettlementNetworkTotalListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ReportSettlementNetworkTotalListPageAsync

    /** @see list */
    suspend fun list(requestOptions: RequestOptions): ReportSettlementNetworkTotalListPageAsync =
        list(ReportSettlementNetworkTotalListParams.none(), requestOptions)

    /**
     * A view of [NetworkTotalServiceAsync] that provides access to raw HTTP responses for each
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
        ): NetworkTotalServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /v1/reports/settlement/network_totals/{token}`, but
         * is otherwise the same as [NetworkTotalServiceAsync.retrieve].
         */
        @MustBeClosed
        suspend fun retrieve(
            token: String,
            params: ReportSettlementNetworkTotalRetrieveParams =
                ReportSettlementNetworkTotalRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<NetworkTotal> =
            retrieve(params.toBuilder().token(token).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        suspend fun retrieve(
            params: ReportSettlementNetworkTotalRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<NetworkTotal>

        /** @see retrieve */
        @MustBeClosed
        suspend fun retrieve(
            token: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<NetworkTotal> =
            retrieve(token, ReportSettlementNetworkTotalRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /v1/reports/settlement/network_totals`, but is
         * otherwise the same as [NetworkTotalServiceAsync.list].
         */
        @MustBeClosed
        suspend fun list(
            params: ReportSettlementNetworkTotalListParams =
                ReportSettlementNetworkTotalListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ReportSettlementNetworkTotalListPageAsync>

        /** @see list */
        @MustBeClosed
        suspend fun list(
            requestOptions: RequestOptions
        ): HttpResponseFor<ReportSettlementNetworkTotalListPageAsync> =
            list(ReportSettlementNetworkTotalListParams.none(), requestOptions)
    }
}
