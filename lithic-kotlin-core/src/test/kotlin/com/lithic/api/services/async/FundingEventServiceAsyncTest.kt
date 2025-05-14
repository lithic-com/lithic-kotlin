// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.services.async

import com.lithic.api.TestServerExtension
import com.lithic.api.client.okhttp.LithicOkHttpClientAsync
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class FundingEventServiceAsyncTest {

    @Test
    suspend fun retrieve() {
        val client =
            LithicOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My Lithic API Key")
                .build()
        val fundingEventServiceAsync = client.fundingEvents()

        val fundingEvent = fundingEventServiceAsync.retrieve("funding_event_token")

        fundingEvent.validate()
    }

    @Test
    suspend fun list() {
        val client =
            LithicOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My Lithic API Key")
                .build()
        val fundingEventServiceAsync = client.fundingEvents()

        val page = fundingEventServiceAsync.list()

        page.response().validate()
    }

    @Test
    suspend fun retrieveDetails() {
        val client =
            LithicOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My Lithic API Key")
                .build()
        val fundingEventServiceAsync = client.fundingEvents()

        val response =
            fundingEventServiceAsync.retrieveDetails("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")

        response.validate()
    }
}
