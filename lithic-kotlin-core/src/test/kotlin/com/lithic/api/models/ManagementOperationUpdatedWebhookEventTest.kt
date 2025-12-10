// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lithic.api.core.jsonMapper
import java.time.LocalDate
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ManagementOperationUpdatedWebhookEventTest {

    @Test
    fun create() {
        val managementOperationUpdatedWebhookEvent =
            ManagementOperationUpdatedWebhookEvent.builder()
                .token("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .created(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .status(ManagementOperationTransaction.TransactionStatus.PENDING)
                .updated(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .category(ManagementOperationTransaction.ManagementOperationCategory.MANAGEMENT_FEE)
                .currency("currency")
                .direction(ManagementOperationTransaction.ManagementOperationDirection.CREDIT)
                .addEvent(
                    ManagementOperationTransaction.ManagementOperationEvent.builder()
                        .token("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .amount(0L)
                        .created(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .addDetailedResult(
                            ManagementOperationTransaction.ManagementOperationEvent.DetailedResults
                                .APPROVED
                        )
                        .effectiveDate(LocalDate.parse("2019-12-27"))
                        .memo("memo")
                        .result(
                            ManagementOperationTransaction.ManagementOperationEvent
                                .TransactionResult
                                .APPROVED
                        )
                        .type(
                            ManagementOperationTransaction.ManagementOperationEvent
                                .ManagementOperationEventType
                                .LOSS_WRITE_OFF
                        )
                        .subtype("subtype")
                        .build()
                )
                .externalResource(
                    ExternalResource.builder()
                        .externalResourceToken("external_resource_token")
                        .externalResourceType(ExternalResourceType.STATEMENT)
                        .externalResourceSubToken("external_resource_sub_token")
                        .build()
                )
                .family(ManagementOperationTransaction.Family.MANAGEMENT_OPERATION)
                .financialAccountToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .pendingAmount(0L)
                .result(ManagementOperationTransaction.TransactionResult.APPROVED)
                .settledAmount(0L)
                .transactionSeries(
                    ManagementOperationTransaction.TransactionSeries.builder()
                        .relatedTransactionEventToken("123e4567-e89b-12d3-a456-426614174000")
                        .relatedTransactionToken("123e4567-e89b-12d3-a456-426614174000")
                        .type("FEE")
                        .build()
                )
                .userDefinedId("user_defined_id")
                .eventType(
                    ManagementOperationUpdatedWebhookEvent.EventType.MANAGEMENT_OPERATION_UPDATED
                )
                .build()

        assertThat(managementOperationUpdatedWebhookEvent.token())
            .isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(managementOperationUpdatedWebhookEvent.created())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(managementOperationUpdatedWebhookEvent.status())
            .isEqualTo(ManagementOperationTransaction.TransactionStatus.PENDING)
        assertThat(managementOperationUpdatedWebhookEvent.updated())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(managementOperationUpdatedWebhookEvent.category())
            .isEqualTo(ManagementOperationTransaction.ManagementOperationCategory.MANAGEMENT_FEE)
        assertThat(managementOperationUpdatedWebhookEvent.currency()).isEqualTo("currency")
        assertThat(managementOperationUpdatedWebhookEvent.direction())
            .isEqualTo(ManagementOperationTransaction.ManagementOperationDirection.CREDIT)
        assertThat(managementOperationUpdatedWebhookEvent.events())
            .containsExactly(
                ManagementOperationTransaction.ManagementOperationEvent.builder()
                    .token("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .amount(0L)
                    .created(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .addDetailedResult(
                        ManagementOperationTransaction.ManagementOperationEvent.DetailedResults
                            .APPROVED
                    )
                    .effectiveDate(LocalDate.parse("2019-12-27"))
                    .memo("memo")
                    .result(
                        ManagementOperationTransaction.ManagementOperationEvent.TransactionResult
                            .APPROVED
                    )
                    .type(
                        ManagementOperationTransaction.ManagementOperationEvent
                            .ManagementOperationEventType
                            .LOSS_WRITE_OFF
                    )
                    .subtype("subtype")
                    .build()
            )
        assertThat(managementOperationUpdatedWebhookEvent.externalResource())
            .isEqualTo(
                ExternalResource.builder()
                    .externalResourceToken("external_resource_token")
                    .externalResourceType(ExternalResourceType.STATEMENT)
                    .externalResourceSubToken("external_resource_sub_token")
                    .build()
            )
        assertThat(managementOperationUpdatedWebhookEvent.family())
            .isEqualTo(ManagementOperationTransaction.Family.MANAGEMENT_OPERATION)
        assertThat(managementOperationUpdatedWebhookEvent.financialAccountToken())
            .isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(managementOperationUpdatedWebhookEvent.pendingAmount()).isEqualTo(0L)
        assertThat(managementOperationUpdatedWebhookEvent.result())
            .isEqualTo(ManagementOperationTransaction.TransactionResult.APPROVED)
        assertThat(managementOperationUpdatedWebhookEvent.settledAmount()).isEqualTo(0L)
        assertThat(managementOperationUpdatedWebhookEvent.transactionSeries())
            .isEqualTo(
                ManagementOperationTransaction.TransactionSeries.builder()
                    .relatedTransactionEventToken("123e4567-e89b-12d3-a456-426614174000")
                    .relatedTransactionToken("123e4567-e89b-12d3-a456-426614174000")
                    .type("FEE")
                    .build()
            )
        assertThat(managementOperationUpdatedWebhookEvent.userDefinedId())
            .isEqualTo("user_defined_id")
        assertThat(managementOperationUpdatedWebhookEvent.eventType())
            .isEqualTo(
                ManagementOperationUpdatedWebhookEvent.EventType.MANAGEMENT_OPERATION_UPDATED
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val managementOperationUpdatedWebhookEvent =
            ManagementOperationUpdatedWebhookEvent.builder()
                .token("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .created(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .status(ManagementOperationTransaction.TransactionStatus.PENDING)
                .updated(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .category(ManagementOperationTransaction.ManagementOperationCategory.MANAGEMENT_FEE)
                .currency("currency")
                .direction(ManagementOperationTransaction.ManagementOperationDirection.CREDIT)
                .addEvent(
                    ManagementOperationTransaction.ManagementOperationEvent.builder()
                        .token("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .amount(0L)
                        .created(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .addDetailedResult(
                            ManagementOperationTransaction.ManagementOperationEvent.DetailedResults
                                .APPROVED
                        )
                        .effectiveDate(LocalDate.parse("2019-12-27"))
                        .memo("memo")
                        .result(
                            ManagementOperationTransaction.ManagementOperationEvent
                                .TransactionResult
                                .APPROVED
                        )
                        .type(
                            ManagementOperationTransaction.ManagementOperationEvent
                                .ManagementOperationEventType
                                .LOSS_WRITE_OFF
                        )
                        .subtype("subtype")
                        .build()
                )
                .externalResource(
                    ExternalResource.builder()
                        .externalResourceToken("external_resource_token")
                        .externalResourceType(ExternalResourceType.STATEMENT)
                        .externalResourceSubToken("external_resource_sub_token")
                        .build()
                )
                .family(ManagementOperationTransaction.Family.MANAGEMENT_OPERATION)
                .financialAccountToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .pendingAmount(0L)
                .result(ManagementOperationTransaction.TransactionResult.APPROVED)
                .settledAmount(0L)
                .transactionSeries(
                    ManagementOperationTransaction.TransactionSeries.builder()
                        .relatedTransactionEventToken("123e4567-e89b-12d3-a456-426614174000")
                        .relatedTransactionToken("123e4567-e89b-12d3-a456-426614174000")
                        .type("FEE")
                        .build()
                )
                .userDefinedId("user_defined_id")
                .eventType(
                    ManagementOperationUpdatedWebhookEvent.EventType.MANAGEMENT_OPERATION_UPDATED
                )
                .build()

        val roundtrippedManagementOperationUpdatedWebhookEvent =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(managementOperationUpdatedWebhookEvent),
                jacksonTypeRef<ManagementOperationUpdatedWebhookEvent>(),
            )

        assertThat(roundtrippedManagementOperationUpdatedWebhookEvent)
            .isEqualTo(managementOperationUpdatedWebhookEvent)
    }
}
