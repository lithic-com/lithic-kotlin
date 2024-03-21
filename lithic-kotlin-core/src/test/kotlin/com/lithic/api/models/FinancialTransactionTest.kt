// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class FinancialTransactionTest {

    @Test
    fun createFinancialTransaction() {
        val financialTransaction =
            FinancialTransaction.builder()
                .token("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .category(FinancialTransaction.Category.ACH)
                .created(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .currency("string")
                .descriptor("string")
                .events(
                    listOf(
                        FinancialTransaction.FinancialEvent.builder()
                            .token("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                            .amount(123L)
                            .created(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .result(FinancialTransaction.FinancialEvent.Result.APPROVED)
                            .type(
                                FinancialTransaction.FinancialEvent.FinancialEventType
                                    .ACH_EXCEEDED_THRESHOLD
                            )
                            .build()
                    )
                )
                .pendingAmount(123L)
                .result(FinancialTransaction.Result.APPROVED)
                .settledAmount(123L)
                .status(FinancialTransaction.Status.DECLINED)
                .updated(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()
        assertThat(financialTransaction).isNotNull
        assertThat(financialTransaction.token()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(financialTransaction.category()).isEqualTo(FinancialTransaction.Category.ACH)
        assertThat(financialTransaction.created())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(financialTransaction.currency()).isEqualTo("string")
        assertThat(financialTransaction.descriptor()).isEqualTo("string")
        assertThat(financialTransaction.events())
            .containsExactly(
                FinancialTransaction.FinancialEvent.builder()
                    .token("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .amount(123L)
                    .created(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .result(FinancialTransaction.FinancialEvent.Result.APPROVED)
                    .type(
                        FinancialTransaction.FinancialEvent.FinancialEventType
                            .ACH_EXCEEDED_THRESHOLD
                    )
                    .build()
            )
        assertThat(financialTransaction.pendingAmount()).isEqualTo(123L)
        assertThat(financialTransaction.result()).isEqualTo(FinancialTransaction.Result.APPROVED)
        assertThat(financialTransaction.settledAmount()).isEqualTo(123L)
        assertThat(financialTransaction.status()).isEqualTo(FinancialTransaction.Status.DECLINED)
        assertThat(financialTransaction.updated())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
    }
}
