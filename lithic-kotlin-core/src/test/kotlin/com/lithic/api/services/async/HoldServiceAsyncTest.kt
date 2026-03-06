// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.services.async

import com.lithic.api.TestServerExtension
import com.lithic.api.client.okhttp.LithicOkHttpClientAsync
import com.lithic.api.models.HoldCreateParams
import com.lithic.api.models.HoldVoidParams
import java.time.OffsetDateTime
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class HoldServiceAsyncTest {

    @Test
    suspend fun create() {
        val client =
            LithicOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My Lithic API Key")
                .build()
        val holdServiceAsync = client.holds()

        val hold =
            holdServiceAsync.create(
                HoldCreateParams.builder()
                    .financialAccountToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .amount(1L)
                    .token("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .expirationDatetime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .memo("memo")
                    .userDefinedId("user_defined_id")
                    .build()
            )

        hold.validate()
    }

    @Test
    suspend fun retrieve() {
        val client =
            LithicOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My Lithic API Key")
                .build()
        val holdServiceAsync = client.holds()

        val hold = holdServiceAsync.retrieve("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")

        hold.validate()
    }

    @Test
    suspend fun list() {
        val client =
            LithicOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My Lithic API Key")
                .build()
        val holdServiceAsync = client.holds()

        val page = holdServiceAsync.list("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")

        page.response().validate()
    }

    @Test
    suspend fun void() {
        val client =
            LithicOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My Lithic API Key")
                .build()
        val holdServiceAsync = client.holds()

        val hold =
            holdServiceAsync.void(
                HoldVoidParams.builder()
                    .holdToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .memo("memo")
                    .build()
            )

        hold.validate()
    }
}
