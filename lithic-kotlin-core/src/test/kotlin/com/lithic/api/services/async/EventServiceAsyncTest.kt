// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.services.async

import com.lithic.api.TestServerExtension
import com.lithic.api.client.okhttp.LithicOkHttpClientAsync
import com.lithic.api.models.EventListAttemptsParams
import com.lithic.api.models.EventRetrieveParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class EventServiceAsyncTest {

    @Test
    suspend fun retrieve() {
        val client =
            LithicOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My Lithic API Key")
                .build()
        val eventServiceAsync = client.events()

        val event =
            eventServiceAsync.retrieve(
                EventRetrieveParams.builder().eventToken("event_token").build()
            )

        event.validate()
    }

    @Test
    suspend fun list() {
        val client =
            LithicOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My Lithic API Key")
                .build()
        val eventServiceAsync = client.events()

        val page = eventServiceAsync.list()

        page.response().validate()
    }

    @Test
    suspend fun listAttempts() {
        val client =
            LithicOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My Lithic API Key")
                .build()
        val eventServiceAsync = client.events()

        val page =
            eventServiceAsync.listAttempts(
                EventListAttemptsParams.builder().eventToken("event_token").build()
            )

        page.response().validate()
    }
}
