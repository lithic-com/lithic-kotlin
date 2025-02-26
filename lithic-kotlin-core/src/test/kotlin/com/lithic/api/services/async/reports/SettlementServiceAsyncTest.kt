// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.services.async.reports

import com.lithic.api.TestServerExtension
import com.lithic.api.client.okhttp.LithicOkHttpClientAsync
import com.lithic.api.models.ReportSettlementListDetailsParams
import com.lithic.api.models.ReportSettlementSummaryParams
import java.time.LocalDate
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class SettlementServiceAsyncTest {

    @Test
    suspend fun listDetails() {
        val client =
            LithicOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My Lithic API Key")
                .build()
        val settlementServiceAsync = client.reports().settlement()

        val page =
            settlementServiceAsync.listDetails(
                ReportSettlementListDetailsParams.builder()
                    .reportDate(LocalDate.parse("2023-09-01"))
                    .build()
            )

        page.response().validate()
    }

    @Test
    suspend fun summary() {
        val client =
            LithicOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My Lithic API Key")
                .build()
        val settlementServiceAsync = client.reports().settlement()

        val settlementReport =
            settlementServiceAsync.summary(
                ReportSettlementSummaryParams.builder()
                    .reportDate(LocalDate.parse("2023-09-01"))
                    .build()
            )

        settlementReport.validate()
    }
}
