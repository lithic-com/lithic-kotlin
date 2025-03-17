// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.services.async

import com.lithic.api.TestServerExtension
import com.lithic.api.client.okhttp.LithicOkHttpClientAsync
import com.lithic.api.models.PaymentCreateParams
import com.lithic.api.models.PaymentRetrieveParams
import com.lithic.api.models.PaymentRetryParams
import com.lithic.api.models.PaymentSimulateActionParams
import com.lithic.api.models.PaymentSimulateReceiptParams
import com.lithic.api.models.PaymentSimulateReleaseParams
import com.lithic.api.models.PaymentSimulateReturnParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class PaymentServiceAsyncTest {

    @Test
    suspend fun create() {
        val client =
            LithicOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My Lithic API Key")
                .build()
        val paymentServiceAsync = client.payments()

        val payment =
            paymentServiceAsync.create(
                PaymentCreateParams.builder()
                    .amount(1L)
                    .externalBankAccountToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .financialAccountToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .method(PaymentCreateParams.Method.ACH_NEXT_DAY)
                    .methodAttributes(
                        PaymentCreateParams.PaymentMethodRequestAttributes.builder()
                            .secCode(PaymentCreateParams.PaymentMethodRequestAttributes.SecCode.CCD)
                            .build()
                    )
                    .type(PaymentCreateParams.Type.COLLECTION)
                    .token("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .memo("memo")
                    .userDefinedId("user_defined_id")
                    .build()
            )

        payment.validate()
    }

    @Test
    suspend fun retrieve() {
        val client =
            LithicOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My Lithic API Key")
                .build()
        val paymentServiceAsync = client.payments()

        val payment =
            paymentServiceAsync.retrieve(
                PaymentRetrieveParams.builder()
                    .paymentToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )

        payment.validate()
    }

    @Test
    suspend fun list() {
        val client =
            LithicOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My Lithic API Key")
                .build()
        val paymentServiceAsync = client.payments()

        val page = paymentServiceAsync.list()

        page.response().validate()
    }

    @Test
    suspend fun retry() {
        val client =
            LithicOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My Lithic API Key")
                .build()
        val paymentServiceAsync = client.payments()

        val response =
            paymentServiceAsync.retry(
                PaymentRetryParams.builder()
                    .paymentToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )

        response.validate()
    }

    @Test
    suspend fun simulateAction() {
        val client =
            LithicOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My Lithic API Key")
                .build()
        val paymentServiceAsync = client.payments()

        val response =
            paymentServiceAsync.simulateAction(
                PaymentSimulateActionParams.builder()
                    .paymentToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .eventType(
                        PaymentSimulateActionParams.SupportedSimulationTypes
                            .ACH_ORIGINATION_REVIEWED
                    )
                    .declineReason(
                        PaymentSimulateActionParams.SupportedSimulationDeclineReasons
                            .PROGRAM_TRANSACTION_LIMIT_EXCEEDED
                    )
                    .returnReasonCode("return_reason_code")
                    .build()
            )

        response.validate()
    }

    @Test
    suspend fun simulateReceipt() {
        val client =
            LithicOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My Lithic API Key")
                .build()
        val paymentServiceAsync = client.payments()

        val response =
            paymentServiceAsync.simulateReceipt(
                PaymentSimulateReceiptParams.builder()
                    .token("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .amount(0L)
                    .financialAccountToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .receiptType(PaymentSimulateReceiptParams.ReceiptType.RECEIPT_CREDIT)
                    .memo("memo")
                    .build()
            )

        response.validate()
    }

    @Test
    suspend fun simulateRelease() {
        val client =
            LithicOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My Lithic API Key")
                .build()
        val paymentServiceAsync = client.payments()

        val response =
            paymentServiceAsync.simulateRelease(
                PaymentSimulateReleaseParams.builder()
                    .paymentToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )

        response.validate()
    }

    @Test
    suspend fun simulateReturn() {
        val client =
            LithicOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My Lithic API Key")
                .build()
        val paymentServiceAsync = client.payments()

        val response =
            paymentServiceAsync.simulateReturn(
                PaymentSimulateReturnParams.builder()
                    .paymentToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .returnReasonCode("R12")
                    .build()
            )

        response.validate()
    }
}
