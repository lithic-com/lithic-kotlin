// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BookTransferCreateParamsTest {

    @Test
    fun create() {
        BookTransferCreateParams.builder()
            .amount(1L)
            .category(BookTransferCreateParams.Category.ADJUSTMENT)
            .fromFinancialAccountToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .subtype("subtype")
            .toFinancialAccountToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .type(BookTransferCreateParams.Type.ATM_WITHDRAWAL)
            .token("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .memo("memo")
            .build()
    }

    @Test
    fun body() {
        val params =
            BookTransferCreateParams.builder()
                .amount(1L)
                .category(BookTransferCreateParams.Category.ADJUSTMENT)
                .fromFinancialAccountToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .subtype("subtype")
                .toFinancialAccountToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .type(BookTransferCreateParams.Type.ATM_WITHDRAWAL)
                .token("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .memo("memo")
                .build()

        val body = params._body()

        assertThat(body.amount()).isEqualTo(1L)
        assertThat(body.category()).isEqualTo(BookTransferCreateParams.Category.ADJUSTMENT)
        assertThat(body.fromFinancialAccountToken())
            .isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(body.subtype()).isEqualTo("subtype")
        assertThat(body.toFinancialAccountToken()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(body.type()).isEqualTo(BookTransferCreateParams.Type.ATM_WITHDRAWAL)
        assertThat(body.token()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(body.memo()).isEqualTo("memo")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            BookTransferCreateParams.builder()
                .amount(1L)
                .category(BookTransferCreateParams.Category.ADJUSTMENT)
                .fromFinancialAccountToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .subtype("subtype")
                .toFinancialAccountToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .type(BookTransferCreateParams.Type.ATM_WITHDRAWAL)
                .build()

        val body = params._body()

        assertThat(body.amount()).isEqualTo(1L)
        assertThat(body.category()).isEqualTo(BookTransferCreateParams.Category.ADJUSTMENT)
        assertThat(body.fromFinancialAccountToken())
            .isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(body.subtype()).isEqualTo("subtype")
        assertThat(body.toFinancialAccountToken()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(body.type()).isEqualTo(BookTransferCreateParams.Type.ATM_WITHDRAWAL)
    }
}
