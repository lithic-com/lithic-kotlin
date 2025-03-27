// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.services.async.creditproducts

import com.lithic.api.TestServerExtension
import com.lithic.api.client.okhttp.LithicOkHttpClientAsync
import com.lithic.api.models.creditproducts.primerates.PrimeRateCreateParams
import com.lithic.api.models.creditproducts.primerates.PrimeRateRetrieveParams
import java.time.LocalDate
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class PrimeRateServiceAsyncTest {

    @Test
    suspend fun create() {
        val client =
            LithicOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My Lithic API Key")
                .build()
        val primeRateServiceAsync = client.creditProducts().primeRates()

        primeRateServiceAsync.create(
            PrimeRateCreateParams.builder()
                .creditProductToken("credit_product_token")
                .effectiveDate(LocalDate.parse("2019-12-27"))
                .rate("rate")
                .build()
        )
    }

    @Test
    suspend fun retrieve() {
        val client =
            LithicOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My Lithic API Key")
                .build()
        val primeRateServiceAsync = client.creditProducts().primeRates()

        val primeRate =
            primeRateServiceAsync.retrieve(
                PrimeRateRetrieveParams.builder()
                    .creditProductToken("credit_product_token")
                    .endingBefore(LocalDate.parse("2019-12-27"))
                    .startingAfter(LocalDate.parse("2019-12-27"))
                    .build()
            )

        primeRate.validate()
    }
}
