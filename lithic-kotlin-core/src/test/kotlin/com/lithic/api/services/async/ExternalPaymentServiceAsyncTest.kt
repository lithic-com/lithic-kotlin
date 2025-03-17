// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.services.async

import com.lithic.api.TestServerExtension
import com.lithic.api.client.okhttp.LithicOkHttpClientAsync
import com.lithic.api.models.ExternalPaymentCancelParams
import com.lithic.api.models.ExternalPaymentCreateParams
import com.lithic.api.models.ExternalPaymentReleaseParams
import com.lithic.api.models.ExternalPaymentRetrieveParams
import com.lithic.api.models.ExternalPaymentReverseParams
import com.lithic.api.models.ExternalPaymentSettleParams
import java.time.LocalDate
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class ExternalPaymentServiceAsyncTest {

    @Test
    suspend fun create() {
        val client =
            LithicOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My Lithic API Key")
                .build()
        val externalPaymentServiceAsync = client.externalPayments()

        val externalPayment =
            externalPaymentServiceAsync.create(
                ExternalPaymentCreateParams.builder()
                    .amount(0L)
                    .category(ExternalPaymentCreateParams.ExternalPaymentCategory.EXTERNAL_WIRE)
                    .effectiveDate(LocalDate.parse("2019-12-27"))
                    .financialAccountToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .paymentType(ExternalPaymentCreateParams.ExternalPaymentDirection.DEPOSIT)
                    .token("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .memo("memo")
                    .progressTo(ExternalPaymentCreateParams.ExternalPaymentProgressTo.SETTLED)
                    .userDefinedId("user_defined_id")
                    .build()
            )

        externalPayment.validate()
    }

    @Test
    suspend fun retrieve() {
        val client =
            LithicOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My Lithic API Key")
                .build()
        val externalPaymentServiceAsync = client.externalPayments()

        val externalPayment =
            externalPaymentServiceAsync.retrieve(
                ExternalPaymentRetrieveParams.builder()
                    .externalPaymentToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )

        externalPayment.validate()
    }

    @Test
    suspend fun list() {
        val client =
            LithicOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My Lithic API Key")
                .build()
        val externalPaymentServiceAsync = client.externalPayments()

        val page = externalPaymentServiceAsync.list()

        page.response().validate()
    }

    @Test
    suspend fun cancel() {
        val client =
            LithicOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My Lithic API Key")
                .build()
        val externalPaymentServiceAsync = client.externalPayments()

        val externalPayment =
            externalPaymentServiceAsync.cancel(
                ExternalPaymentCancelParams.builder()
                    .externalPaymentToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .effectiveDate(LocalDate.parse("2019-12-27"))
                    .memo("memo")
                    .build()
            )

        externalPayment.validate()
    }

    @Test
    suspend fun release() {
        val client =
            LithicOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My Lithic API Key")
                .build()
        val externalPaymentServiceAsync = client.externalPayments()

        val externalPayment =
            externalPaymentServiceAsync.release(
                ExternalPaymentReleaseParams.builder()
                    .externalPaymentToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .effectiveDate(LocalDate.parse("2019-12-27"))
                    .memo("memo")
                    .build()
            )

        externalPayment.validate()
    }

    @Test
    suspend fun reverse() {
        val client =
            LithicOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My Lithic API Key")
                .build()
        val externalPaymentServiceAsync = client.externalPayments()

        val externalPayment =
            externalPaymentServiceAsync.reverse(
                ExternalPaymentReverseParams.builder()
                    .externalPaymentToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .effectiveDate(LocalDate.parse("2019-12-27"))
                    .memo("memo")
                    .build()
            )

        externalPayment.validate()
    }

    @Test
    suspend fun settle() {
        val client =
            LithicOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My Lithic API Key")
                .build()
        val externalPaymentServiceAsync = client.externalPayments()

        val externalPayment =
            externalPaymentServiceAsync.settle(
                ExternalPaymentSettleParams.builder()
                    .externalPaymentToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .effectiveDate(LocalDate.parse("2019-12-27"))
                    .memo("memo")
                    .progressTo(ExternalPaymentSettleParams.ExternalPaymentProgressTo.SETTLED)
                    .build()
            )

        externalPayment.validate()
    }
}
