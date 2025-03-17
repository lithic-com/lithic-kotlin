// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.services.async

import com.lithic.api.TestServerExtension
import com.lithic.api.client.okhttp.LithicOkHttpClientAsync
import com.lithic.api.models.DigitalCardArtRetrieveParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class DigitalCardArtServiceAsyncTest {

    @Test
    suspend fun retrieve() {
        val client =
            LithicOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My Lithic API Key")
                .build()
        val digitalCardArtServiceAsync = client.digitalCardArt()

        val digitalCardArt =
            digitalCardArtServiceAsync.retrieve(
                DigitalCardArtRetrieveParams.builder()
                    .digitalCardArtToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )

        digitalCardArt.validate()
    }

    @Test
    suspend fun list() {
        val client =
            LithicOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My Lithic API Key")
                .build()
        val digitalCardArtServiceAsync = client.digitalCardArt()

        val page = digitalCardArtServiceAsync.list()

        page.response().validate()
    }
}
