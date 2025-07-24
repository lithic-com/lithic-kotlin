// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.services.async.reports

import com.google.errorprone.annotations.MustBeClosed
import com.lithic.api.core.ClientOptions
import com.lithic.api.core.RequestOptions
import com.lithic.api.core.http.HttpResponseFor
import com.lithic.api.models.ReportSettlementListDetailsPageAsync
import com.lithic.api.models.ReportSettlementListDetailsParams
import com.lithic.api.models.ReportSettlementSummaryParams
import com.lithic.api.models.SettlementReport
import com.lithic.api.services.async.reports.settlement.NetworkTotalServiceAsync
import java.time.LocalDate

interface SettlementServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): SettlementServiceAsync

    fun networkTotals(): NetworkTotalServiceAsync

    /** List details. */
    suspend fun listDetails(
        reportDate: LocalDate,
        params: ReportSettlementListDetailsParams = ReportSettlementListDetailsParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ReportSettlementListDetailsPageAsync =
        listDetails(params.toBuilder().reportDate(reportDate).build(), requestOptions)

    /** @see listDetails */
    suspend fun listDetails(
        params: ReportSettlementListDetailsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ReportSettlementListDetailsPageAsync

    /** @see listDetails */
    suspend fun listDetails(
        reportDate: LocalDate,
        requestOptions: RequestOptions,
    ): ReportSettlementListDetailsPageAsync =
        listDetails(reportDate, ReportSettlementListDetailsParams.none(), requestOptions)

    /** Get the settlement report for a specified report date. Not available in sandbox. */
    suspend fun summary(
        reportDate: LocalDate,
        params: ReportSettlementSummaryParams = ReportSettlementSummaryParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SettlementReport = summary(params.toBuilder().reportDate(reportDate).build(), requestOptions)

    /** @see summary */
    suspend fun summary(
        params: ReportSettlementSummaryParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SettlementReport

    /** @see summary */
    suspend fun summary(reportDate: LocalDate, requestOptions: RequestOptions): SettlementReport =
        summary(reportDate, ReportSettlementSummaryParams.none(), requestOptions)

    /**
     * A view of [SettlementServiceAsync] that provides access to raw HTTP responses for each
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
        ): SettlementServiceAsync.WithRawResponse

        fun networkTotals(): NetworkTotalServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /v1/reports/settlement/details/{report_date}`, but
         * is otherwise the same as [SettlementServiceAsync.listDetails].
         */
        @MustBeClosed
        suspend fun listDetails(
            reportDate: LocalDate,
            params: ReportSettlementListDetailsParams = ReportSettlementListDetailsParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ReportSettlementListDetailsPageAsync> =
            listDetails(params.toBuilder().reportDate(reportDate).build(), requestOptions)

        /** @see listDetails */
        @MustBeClosed
        suspend fun listDetails(
            params: ReportSettlementListDetailsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ReportSettlementListDetailsPageAsync>

        /** @see listDetails */
        @MustBeClosed
        suspend fun listDetails(
            reportDate: LocalDate,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ReportSettlementListDetailsPageAsync> =
            listDetails(reportDate, ReportSettlementListDetailsParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /v1/reports/settlement/summary/{report_date}`, but
         * is otherwise the same as [SettlementServiceAsync.summary].
         */
        @MustBeClosed
        suspend fun summary(
            reportDate: LocalDate,
            params: ReportSettlementSummaryParams = ReportSettlementSummaryParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SettlementReport> =
            summary(params.toBuilder().reportDate(reportDate).build(), requestOptions)

        /** @see summary */
        @MustBeClosed
        suspend fun summary(
            params: ReportSettlementSummaryParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SettlementReport>

        /** @see summary */
        @MustBeClosed
        suspend fun summary(
            reportDate: LocalDate,
            requestOptions: RequestOptions,
        ): HttpResponseFor<SettlementReport> =
            summary(reportDate, ReportSettlementSummaryParams.none(), requestOptions)
    }
}
