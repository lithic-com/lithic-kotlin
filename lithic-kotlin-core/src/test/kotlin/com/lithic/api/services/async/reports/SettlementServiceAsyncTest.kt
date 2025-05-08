// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.services.async.reports

import com.lithic.api.TestServerExtension
import com.lithic.api.client.okhttp.LithicOkHttpClientAsync
import java.time.LocalDate
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class SettlementServiceAsyncTest {

    @Test
    suspend fun listDetails() {
        val client =
            LithicOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My Lithic API Key")
                .build()
        val settlementServiceAsync = client.reports().settlement()

        val page = settlementServiceAsync.listDetails(LocalDate.parse("2023-09-01"))

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

        val settlementReport = settlementServiceAsync.summary(LocalDate.parse("2023-09-01"))

        settlementReport.validate()
    }
}
