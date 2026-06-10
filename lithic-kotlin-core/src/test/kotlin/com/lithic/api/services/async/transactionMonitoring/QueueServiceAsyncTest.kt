// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.services.async.transactionMonitoring

import com.lithic.api.TestServerExtension
import com.lithic.api.client.okhttp.LithicOkHttpClientAsync
import com.lithic.api.models.TransactionMonitoringQueueCreateParams
import com.lithic.api.models.TransactionMonitoringQueueUpdateParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class QueueServiceAsyncTest {

    @Test
    suspend fun create() {
        val client =
            LithicOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My Lithic API Key")
                .build()
        val queueServiceAsync = client.transactionMonitoring().queues()

        val queue =
            queueServiceAsync.create(
                TransactionMonitoringQueueCreateParams.builder()
                    .name("name")
                    .description("description")
                    .build()
            )

        queue.validate()
    }

    @Test
    suspend fun retrieve() {
        val client =
            LithicOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My Lithic API Key")
                .build()
        val queueServiceAsync = client.transactionMonitoring().queues()

        val queue = queueServiceAsync.retrieve("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")

        queue.validate()
    }

    @Test
    suspend fun update() {
        val client =
            LithicOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My Lithic API Key")
                .build()
        val queueServiceAsync = client.transactionMonitoring().queues()

        val queue =
            queueServiceAsync.update(
                TransactionMonitoringQueueUpdateParams.builder()
                    .queueToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .description("description")
                    .name("name")
                    .build()
            )

        queue.validate()
    }

    @Test
    suspend fun list() {
        val client =
            LithicOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My Lithic API Key")
                .build()
        val queueServiceAsync = client.transactionMonitoring().queues()

        val page = queueServiceAsync.list()

        page.response().validate()
    }

    @Test
    suspend fun delete() {
        val client =
            LithicOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My Lithic API Key")
                .build()
        val queueServiceAsync = client.transactionMonitoring().queues()

        queueServiceAsync.delete("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
    }
}
