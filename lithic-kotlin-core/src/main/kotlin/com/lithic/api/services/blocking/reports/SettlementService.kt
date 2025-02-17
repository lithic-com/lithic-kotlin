// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.services.blocking.reports

import com.lithic.api.core.RequestOptions
import com.lithic.api.models.ReportSettlementListDetailsPage
import com.lithic.api.models.ReportSettlementListDetailsParams
import com.lithic.api.models.ReportSettlementSummaryParams
import com.lithic.api.models.SettlementReport

interface SettlementService {

    /** List details. */
    fun listDetails(
        params: ReportSettlementListDetailsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ReportSettlementListDetailsPage

    /** Get the settlement report for a specified report date. Not available in sandbox. */
    fun summary(
        params: ReportSettlementSummaryParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SettlementReport
}
