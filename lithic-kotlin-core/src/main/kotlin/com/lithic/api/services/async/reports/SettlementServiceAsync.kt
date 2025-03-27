// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.services.async.reports

import com.google.errorprone.annotations.MustBeClosed
import com.lithic.api.core.RequestOptions
import com.lithic.api.core.http.HttpResponseFor
import com.lithic.api.models.reports.SettlementReport
import com.lithic.api.models.reports.settlement.SettlementListDetailsPageAsync
import com.lithic.api.models.reports.settlement.SettlementListDetailsParams
import com.lithic.api.models.reports.settlement.SettlementSummaryParams

interface SettlementServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /** List details. */
    suspend fun listDetails(
        params: SettlementListDetailsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SettlementListDetailsPageAsync

    /** Get the settlement report for a specified report date. Not available in sandbox. */
    suspend fun summary(
        params: SettlementSummaryParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SettlementReport

    /**
     * A view of [SettlementServiceAsync] that provides access to raw HTTP responses for each
     * method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `get /v1/reports/settlement/details/{report_date}`, but
         * is otherwise the same as [SettlementServiceAsync.listDetails].
         */
        @MustBeClosed
        suspend fun listDetails(
            params: SettlementListDetailsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SettlementListDetailsPageAsync>

        /**
         * Returns a raw HTTP response for `get /v1/reports/settlement/summary/{report_date}`, but
         * is otherwise the same as [SettlementServiceAsync.summary].
         */
        @MustBeClosed
        suspend fun summary(
            params: SettlementSummaryParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SettlementReport>
    }
}
