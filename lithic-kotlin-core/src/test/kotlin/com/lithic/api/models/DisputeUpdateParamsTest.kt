// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class DisputeUpdateParamsTest {

    @Test
    fun create() {
        DisputeUpdateParams.builder()
            .disputeToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .amount(0L)
            .customerFiledDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .customerNote("customer_note")
            .reason(DisputeUpdateParams.Reason.ATM_CASH_MISDISPENSE)
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            DisputeUpdateParams.builder()
                .disputeToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            DisputeUpdateParams.builder()
                .disputeToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .amount(0L)
                .customerFiledDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .customerNote("customer_note")
                .reason(DisputeUpdateParams.Reason.ATM_CASH_MISDISPENSE)
                .build()

        val body = params._body()

        assertThat(body.amount()).isEqualTo(0L)
        assertThat(body.customerFiledDate())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(body.customerNote()).isEqualTo("customer_note")
        assertThat(body.reason()).isEqualTo(DisputeUpdateParams.Reason.ATM_CASH_MISDISPENSE)
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            DisputeUpdateParams.builder()
                .disputeToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()

        val body = params._body()
    }
}
