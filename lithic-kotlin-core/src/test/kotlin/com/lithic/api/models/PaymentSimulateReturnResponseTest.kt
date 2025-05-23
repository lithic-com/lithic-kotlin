// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lithic.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PaymentSimulateReturnResponseTest {

    @Test
    fun create() {
        val paymentSimulateReturnResponse =
            PaymentSimulateReturnResponse.builder()
                .debuggingRequestId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .result(PaymentSimulateReturnResponse.Result.APPROVED)
                .transactionEventToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()

        assertThat(paymentSimulateReturnResponse.debuggingRequestId())
            .isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(paymentSimulateReturnResponse.result())
            .isEqualTo(PaymentSimulateReturnResponse.Result.APPROVED)
        assertThat(paymentSimulateReturnResponse.transactionEventToken())
            .isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val paymentSimulateReturnResponse =
            PaymentSimulateReturnResponse.builder()
                .debuggingRequestId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .result(PaymentSimulateReturnResponse.Result.APPROVED)
                .transactionEventToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()

        val roundtrippedPaymentSimulateReturnResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(paymentSimulateReturnResponse),
                jacksonTypeRef<PaymentSimulateReturnResponse>(),
            )

        assertThat(roundtrippedPaymentSimulateReturnResponse)
            .isEqualTo(paymentSimulateReturnResponse)
    }
}
