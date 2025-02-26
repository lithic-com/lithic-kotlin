// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.services.async

import com.lithic.api.TestServerExtension
import com.lithic.api.client.okhttp.LithicOkHttpClientAsync
import com.lithic.api.models.ResponderEndpointCheckStatusParams
import com.lithic.api.models.ResponderEndpointCreateParams
import com.lithic.api.models.ResponderEndpointDeleteParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class ResponderEndpointServiceAsyncTest {

    @Test
    suspend fun create() {
        val client =
            LithicOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My Lithic API Key")
                .build()
        val responderEndpointServiceAsync = client.responderEndpoints()

        val responderEndpoint =
            responderEndpointServiceAsync.create(
                ResponderEndpointCreateParams.builder()
                    .type(ResponderEndpointCreateParams.Type.AUTH_STREAM_ACCESS)
                    .url("https://example.com")
                    .build()
            )

        responderEndpoint.validate()
    }

    @Disabled("Prism errors when accept header set but no request body is defined")
    @Test
    suspend fun delete() {
        val client =
            LithicOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My Lithic API Key")
                .build()
        val responderEndpointServiceAsync = client.responderEndpoints()

        responderEndpointServiceAsync.delete(
            ResponderEndpointDeleteParams.builder()
                .type(ResponderEndpointDeleteParams.Type.AUTH_STREAM_ACCESS)
                .build()
        )
    }

    @Test
    suspend fun checkStatus() {
        val client =
            LithicOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My Lithic API Key")
                .build()
        val responderEndpointServiceAsync = client.responderEndpoints()

        val responderEndpointStatus =
            responderEndpointServiceAsync.checkStatus(
                ResponderEndpointCheckStatusParams.builder()
                    .type(ResponderEndpointCheckStatusParams.Type.AUTH_STREAM_ACCESS)
                    .build()
            )

        responderEndpointStatus.validate()
    }
}
