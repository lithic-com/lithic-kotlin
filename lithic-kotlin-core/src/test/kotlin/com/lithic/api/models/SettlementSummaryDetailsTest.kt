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
                .disputesGrossAmount(0L)
                .institution("00001")
                .interchangeGrossAmount(-7L)
                .network(SettlementSummaryDetails.Network.INTERLINK)
                .otherFeesGrossAmount(0L)
                .settledNetAmount(1893L)
                .transactionsGrossAmount(1900L)
                .build()
        assertThat(settlementSummaryDetails).isNotNull
        assertThat(settlementSummaryDetails.currency()).isEqualTo("USD")
        assertThat(settlementSummaryDetails.disputesGrossAmount()).isEqualTo(0L)
        assertThat(settlementSummaryDetails.institution()).isEqualTo("00001")
        assertThat(settlementSummaryDetails.interchangeGrossAmount()).isEqualTo(-7L)
        assertThat(settlementSummaryDetails.network())
            .isEqualTo(SettlementSummaryDetails.Network.INTERLINK)
        assertThat(settlementSummaryDetails.otherFeesGrossAmount()).isEqualTo(0L)
        assertThat(settlementSummaryDetails.settledNetAmount()).isEqualTo(1893L)
        assertThat(settlementSummaryDetails.transactionsGrossAmount()).isEqualTo(1900L)
    }
}
