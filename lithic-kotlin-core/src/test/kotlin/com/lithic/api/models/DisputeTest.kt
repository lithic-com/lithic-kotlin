// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lithic.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class DisputeTest {

    @Test
    fun create() {
        val dispute =
            Dispute.builder()
                .token("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .amount(0L)
                .arbitrationDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .created(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .customerFiledDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .customerNote("customer_note")
                .addNetworkClaimId("string")
                .networkFiledDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .networkReasonCode("network_reason_code")
                .prearbitrationDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .primaryClaimId("primary_claim_id")
                .reason(Dispute.Reason.ATM_CASH_MISDISPENSE)
                .representmentDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .resolutionAmount(0L)
                .resolutionDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .resolutionNote("resolution_note")
                .resolutionReason(Dispute.ResolutionReason.CASE_LOST)
                .status(Dispute.Status.ARBITRATION)
                .transactionToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()

        assertThat(dispute.token()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(dispute.amount()).isEqualTo(0L)
        assertThat(dispute.arbitrationDate())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(dispute.created()).isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(dispute.customerFiledDate())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(dispute.customerNote()).isEqualTo("customer_note")
        assertThat(dispute.networkClaimIds()).containsExactly("string")
        assertThat(dispute.networkFiledDate())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(dispute.networkReasonCode()).isEqualTo("network_reason_code")
        assertThat(dispute.prearbitrationDate())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(dispute.primaryClaimId()).isEqualTo("primary_claim_id")
        assertThat(dispute.reason()).isEqualTo(Dispute.Reason.ATM_CASH_MISDISPENSE)
        assertThat(dispute.representmentDate())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(dispute.resolutionAmount()).isEqualTo(0L)
        assertThat(dispute.resolutionDate())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(dispute.resolutionNote()).isEqualTo("resolution_note")
        assertThat(dispute.resolutionReason()).isEqualTo(Dispute.ResolutionReason.CASE_LOST)
        assertThat(dispute.status()).isEqualTo(Dispute.Status.ARBITRATION)
        assertThat(dispute.transactionToken()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val dispute =
            Dispute.builder()
                .token("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .amount(0L)
                .arbitrationDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .created(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .customerFiledDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .customerNote("customer_note")
                .addNetworkClaimId("string")
                .networkFiledDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .networkReasonCode("network_reason_code")
                .prearbitrationDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .primaryClaimId("primary_claim_id")
                .reason(Dispute.Reason.ATM_CASH_MISDISPENSE)
                .representmentDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .resolutionAmount(0L)
                .resolutionDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .resolutionNote("resolution_note")
                .resolutionReason(Dispute.ResolutionReason.CASE_LOST)
                .status(Dispute.Status.ARBITRATION)
                .transactionToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()

        val roundtrippedDispute =
            jsonMapper.readValue(jsonMapper.writeValueAsString(dispute), jacksonTypeRef<Dispute>())

        assertThat(roundtrippedDispute).isEqualTo(dispute)
    }
}
