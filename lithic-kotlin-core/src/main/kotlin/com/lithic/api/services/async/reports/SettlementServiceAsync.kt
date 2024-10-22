// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.services.async.reports

import com.lithic.api.core.RequestOptions
import com.lithic.api.models.ReportSettlementListDetailsPageAsync
import com.lithic.api.models.ReportSettlementListDetailsParams
import com.lithic.api.models.ReportSettlementSummaryParams
import com.lithic.api.models.SettlementReport

interface SettlementServiceAsync {

    /** List details. */
    suspend fun listDetails(
        params: ReportSettlementListDetailsParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): ReportSettlementListDetailsPageAsync

    /** Get the settlement report for a specified report date. Not available in sandbox. */
    suspend fun summary(
        params: ReportSettlementSummaryParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): SettlementReport
}
