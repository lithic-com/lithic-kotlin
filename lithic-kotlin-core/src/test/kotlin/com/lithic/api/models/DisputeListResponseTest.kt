// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lithic.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class DisputeListResponseTest {

    @Test
    fun create() {
        val disputeListResponse =
            DisputeListResponse.builder()
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
                .reason(DisputeListResponse.Reason.ATM_CASH_MISDISPENSE)
                .representmentDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .resolutionDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .resolutionNote("resolution_note")
                .resolutionReason(DisputeListResponse.ResolutionReason.CASE_LOST)
                .status(DisputeListResponse.Status.ARBITRATION)
                .transactionToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()

        assertThat(disputeListResponse.token()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(disputeListResponse.amount()).isEqualTo(0L)
        assertThat(disputeListResponse.arbitrationDate())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(disputeListResponse.created())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(disputeListResponse.customerFiledDate())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(disputeListResponse.customerNote()).isEqualTo("customer_note")
        assertThat(disputeListResponse.networkClaimIds()).containsExactly("string")
        assertThat(disputeListResponse.networkFiledDate())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(disputeListResponse.networkReasonCode()).isEqualTo("network_reason_code")
        assertThat(disputeListResponse.prearbitrationDate())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(disputeListResponse.primaryClaimId()).isEqualTo("primary_claim_id")
        assertThat(disputeListResponse.reason())
            .isEqualTo(DisputeListResponse.Reason.ATM_CASH_MISDISPENSE)
        assertThat(disputeListResponse.representmentDate())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(disputeListResponse.resolutionDate())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(disputeListResponse.resolutionNote()).isEqualTo("resolution_note")
        assertThat(disputeListResponse.resolutionReason())
            .isEqualTo(DisputeListResponse.ResolutionReason.CASE_LOST)
        assertThat(disputeListResponse.status()).isEqualTo(DisputeListResponse.Status.ARBITRATION)
        assertThat(disputeListResponse.transactionToken())
            .isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val disputeListResponse =
            DisputeListResponse.builder()
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
                .reason(DisputeListResponse.Reason.ATM_CASH_MISDISPENSE)
                .representmentDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .resolutionDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .resolutionNote("resolution_note")
                .resolutionReason(DisputeListResponse.ResolutionReason.CASE_LOST)
                .status(DisputeListResponse.Status.ARBITRATION)
                .transactionToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()

        val roundtrippedDisputeListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(disputeListResponse),
                jacksonTypeRef<DisputeListResponse>(),
            )

        assertThat(roundtrippedDisputeListResponse).isEqualTo(disputeListResponse)
    }
}
