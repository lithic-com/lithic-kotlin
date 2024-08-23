// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class SettlementSummaryDetailsTest {

    @Test
    fun createSettlementSummaryDetails() {
        val settlementSummaryDetails =
            SettlementSummaryDetails.builder()
                .currency("USD")
                .disputesGrossAmount(123L)
                .institution("00001")
                .interchangeGrossAmount(123L)
                .network(SettlementSummaryDetails.Network.INTERLINK)
                .otherFeesGrossAmount(123L)
                .settledNetAmount(123L)
                .transactionsGrossAmount(123L)
                .build()
        assertThat(settlementSummaryDetails).isNotNull
        assertThat(settlementSummaryDetails.currency()).isEqualTo("USD")
        assertThat(settlementSummaryDetails.disputesGrossAmount()).isEqualTo(123L)
        assertThat(settlementSummaryDetails.institution()).isEqualTo("00001")
        assertThat(settlementSummaryDetails.interchangeGrossAmount()).isEqualTo(123L)
        assertThat(settlementSummaryDetails.network())
            .isEqualTo(SettlementSummaryDetails.Network.INTERLINK)
        assertThat(settlementSummaryDetails.otherFeesGrossAmount()).isEqualTo(123L)
        assertThat(settlementSummaryDetails.settledNetAmount()).isEqualTo(123L)
        assertThat(settlementSummaryDetails.transactionsGrossAmount()).isEqualTo(123L)
    }
}
