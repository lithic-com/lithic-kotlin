// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.lithic.api.services.async.reports

import com.lithic.api.core.RequestOptions
import com.lithic.api.models.ReportSettlementListDetailsPageAsync
import com.lithic.api.models.ReportSettlementListDetailsParams
import com.lithic.api.models.ReportSettlementSummaryParams
import com.lithic.api.models.SettlementSummaryResponse

interface SettlementServiceAsync {

    /** List details. */
    suspend fun listDetails(
        params: ReportSettlementListDetailsParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): ReportSettlementListDetailsPageAsync

    /** Get the settlement report for a specified report date. */
    suspend fun summary(
        params: ReportSettlementSummaryParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): SettlementSummaryResponse
}
