// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.services.blocking.reports.settlement

import com.google.errorprone.annotations.MustBeClosed
import com.lithic.api.core.ClientOptions
import com.lithic.api.core.RequestOptions
import com.lithic.api.core.http.HttpResponseFor
import com.lithic.api.models.NetworkTotal
import com.lithic.api.models.ReportSettlementNetworkTotalListPage
import com.lithic.api.models.ReportSettlementNetworkTotalListParams
import com.lithic.api.models.ReportSettlementNetworkTotalRetrieveParams

interface NetworkTotalService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): NetworkTotalService

    /** Retrieve a specific network total record by token. Not available in sandbox. */
    fun retrieve(
        token: String,
        params: ReportSettlementNetworkTotalRetrieveParams =
            ReportSettlementNetworkTotalRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): NetworkTotal = retrieve(params.toBuilder().token(token).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        params: ReportSettlementNetworkTotalRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): NetworkTotal

    /** @see retrieve */
    fun retrieve(token: String, requestOptions: RequestOptions): NetworkTotal =
        retrieve(token, ReportSettlementNetworkTotalRetrieveParams.none(), requestOptions)

    /** List network total records with optional filters. Not available in sandbox. */
    fun list(
        params: ReportSettlementNetworkTotalListParams =
            ReportSettlementNetworkTotalListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ReportSettlementNetworkTotalListPage

    /** @see list */
    fun list(requestOptions: RequestOptions): ReportSettlementNetworkTotalListPage =
        list(ReportSettlementNetworkTotalListParams.none(), requestOptions)

    /**
     * A view of [NetworkTotalService] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): NetworkTotalService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /v1/reports/settlement/network_totals/{token}`, but
         * is otherwise the same as [NetworkTotalService.retrieve].
         */
        @MustBeClosed
        fun retrieve(
            token: String,
            params: ReportSettlementNetworkTotalRetrieveParams =
                ReportSettlementNetworkTotalRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<NetworkTotal> =
            retrieve(params.toBuilder().token(token).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: ReportSettlementNetworkTotalRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<NetworkTotal>

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(token: String, requestOptions: RequestOptions): HttpResponseFor<NetworkTotal> =
            retrieve(token, ReportSettlementNetworkTotalRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /v1/reports/settlement/network_totals`, but is
         * otherwise the same as [NetworkTotalService.list].
         */
        @MustBeClosed
        fun list(
            params: ReportSettlementNetworkTotalListParams =
                ReportSettlementNetworkTotalListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ReportSettlementNetworkTotalListPage>

        /** @see list */
        @MustBeClosed
        fun list(
            requestOptions: RequestOptions
        ): HttpResponseFor<ReportSettlementNetworkTotalListPage> =
            list(ReportSettlementNetworkTotalListParams.none(), requestOptions)
    }
}
