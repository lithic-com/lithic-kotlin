// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class SettlementSummaryResponseTest {

    @Test
    fun createSettlementSummaryResponse() {
        val settlementSummaryResponse =
            SettlementSummaryResponse.builder()
                .data(
                    listOf(
                        SettlementReport.builder()
                            .created(OffsetDateTime.parse("2023-06-01T00:00:00Z"))
                            .currency("840")
                            .details(
                                listOf(
                                    SettlementSummaryDetails.builder()
                                        .disputesGrossAmount(123L)
                                        .institution("00001")
                                        .interchangeGrossAmount(123L)
                                        .network(SettlementSummaryDetails.Network.MASTERCARD)
                                        .otherFeesGrossAmount(123L)
                                        .settledNetAmount(123L)
                                        .transactionsGrossAmount(123L)
                                        .build()
                                )
                            )
                            .disputesGrossAmount(123L)
                            .interchangeGrossAmount(123L)
                            .otherFeesGrossAmount(123L)
                            .reportDate("2023-06-01")
                            .settledNetAmount(123L)
                            .transactionsGrossAmount(123L)
                            .updated(OffsetDateTime.parse("2023-06-01T00:00:00Z"))
                            .build()
                    )
                )
                .build()
        assertThat(settlementSummaryResponse).isNotNull
        assertThat(settlementSummaryResponse.data())
            .containsExactly(
                SettlementReport.builder()
                    .created(OffsetDateTime.parse("2023-06-01T00:00:00Z"))
                    .currency("840")
                    .details(
                        listOf(
                            SettlementSummaryDetails.builder()
                                .disputesGrossAmount(123L)
                                .institution("00001")
                                .interchangeGrossAmount(123L)
                                .network(SettlementSummaryDetails.Network.MASTERCARD)
                                .otherFeesGrossAmount(123L)
                                .settledNetAmount(123L)
                                .transactionsGrossAmount(123L)
                                .build()
                        )
                    )
                    .disputesGrossAmount(123L)
                    .interchangeGrossAmount(123L)
                    .otherFeesGrossAmount(123L)
                    .reportDate("2023-06-01")
                    .settledNetAmount(123L)
                    .transactionsGrossAmount(123L)
                    .updated(OffsetDateTime.parse("2023-06-01T00:00:00Z"))
                    .build()
            )
    }
}
