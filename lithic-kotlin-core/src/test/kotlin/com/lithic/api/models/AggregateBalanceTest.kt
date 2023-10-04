// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class AggregateBalanceTest {

    @Test
    fun createAggregateBalance() {
        val aggregateBalance =
            AggregateBalance.builder()
                .availableAmount(123L)
                .created(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .currency("string")
                .financialAccountType(AggregateBalance.FinancialAccountType.ISSUING)
                .lastFinancialAccountToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .lastTransactionEventToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .lastTransactionToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .pendingAmount(123L)
                .totalAmount(123L)
                .updated(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()
        assertThat(aggregateBalance).isNotNull
        assertThat(aggregateBalance.availableAmount()).isEqualTo(123L)
        assertThat(aggregateBalance.created())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(aggregateBalance.currency()).isEqualTo("string")
        assertThat(aggregateBalance.financialAccountType())
            .isEqualTo(AggregateBalance.FinancialAccountType.ISSUING)
        assertThat(aggregateBalance.lastFinancialAccountToken())
            .isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(aggregateBalance.lastTransactionEventToken())
            .isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(aggregateBalance.lastTransactionToken())
            .isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(aggregateBalance.pendingAmount()).isEqualTo(123L)
        assertThat(aggregateBalance.totalAmount()).isEqualTo(123L)
        assertThat(aggregateBalance.updated())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
    }
}
