// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lithic.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class DisputeDeleteResponseTest {

    @Test
    fun create() {
        val disputeDeleteResponse =
            DisputeDeleteResponse.builder()
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
                .reason(DisputeDeleteResponse.Reason.ATM_CASH_MISDISPENSE)
                .representmentDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .resolutionDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .resolutionNote("resolution_note")
                .resolutionReason(DisputeDeleteResponse.ResolutionReason.CASE_LOST)
                .status(DisputeDeleteResponse.Status.ARBITRATION)
                .transactionToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()

        assertThat(disputeDeleteResponse.token()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(disputeDeleteResponse.amount()).isEqualTo(0L)
        assertThat(disputeDeleteResponse.arbitrationDate())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(disputeDeleteResponse.created())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(disputeDeleteResponse.customerFiledDate())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(disputeDeleteResponse.customerNote()).isEqualTo("customer_note")
        assertThat(disputeDeleteResponse.networkClaimIds()).containsExactly("string")
        assertThat(disputeDeleteResponse.networkFiledDate())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(disputeDeleteResponse.networkReasonCode()).isEqualTo("network_reason_code")
        assertThat(disputeDeleteResponse.prearbitrationDate())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(disputeDeleteResponse.primaryClaimId()).isEqualTo("primary_claim_id")
        assertThat(disputeDeleteResponse.reason())
            .isEqualTo(DisputeDeleteResponse.Reason.ATM_CASH_MISDISPENSE)
        assertThat(disputeDeleteResponse.representmentDate())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(disputeDeleteResponse.resolutionDate())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(disputeDeleteResponse.resolutionNote()).isEqualTo("resolution_note")
        assertThat(disputeDeleteResponse.resolutionReason())
            .isEqualTo(DisputeDeleteResponse.ResolutionReason.CASE_LOST)
        assertThat(disputeDeleteResponse.status())
            .isEqualTo(DisputeDeleteResponse.Status.ARBITRATION)
        assertThat(disputeDeleteResponse.transactionToken())
            .isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val disputeDeleteResponse =
            DisputeDeleteResponse.builder()
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
                .reason(DisputeDeleteResponse.Reason.ATM_CASH_MISDISPENSE)
                .representmentDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .resolutionDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .resolutionNote("resolution_note")
                .resolutionReason(DisputeDeleteResponse.ResolutionReason.CASE_LOST)
                .status(DisputeDeleteResponse.Status.ARBITRATION)
                .transactionToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()

        val roundtrippedDisputeDeleteResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(disputeDeleteResponse),
                jacksonTypeRef<DisputeDeleteResponse>(),
            )

        assertThat(roundtrippedDisputeDeleteResponse).isEqualTo(disputeDeleteResponse)
    }
}
