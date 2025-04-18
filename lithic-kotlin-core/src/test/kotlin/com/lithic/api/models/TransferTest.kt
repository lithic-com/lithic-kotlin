// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lithic.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TransferTest {

    @Test
    fun create() {
        val transfer =
            Transfer.builder()
                .token("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .category(Transfer.Category.TRANSFER)
                .created(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .currency("currency")
                .descriptor("descriptor")
                .addEvent(
                    Transfer.FinancialEvent.builder()
                        .token("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .amount(0L)
                        .created(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .result(Transfer.FinancialEvent.Result.APPROVED)
                        .type(Transfer.FinancialEvent.FinancialEventType.ACH_ORIGINATION_CANCELLED)
                        .build()
                )
                .addFromBalance(
                    Balance.builder()
                        .availableAmount(0L)
                        .created(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .currency("currency")
                        .financialAccountToken("3fa85f64-5717-4562-b3fc-2c963f66afa6")
                        .financialAccountType(Balance.FinancialAccountType.ISSUING)
                        .lastTransactionEventToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .lastTransactionToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .pendingAmount(0L)
                        .totalAmount(0L)
                        .updated(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .build()
                )
                .pendingAmount(0L)
                .result(Transfer.Result.APPROVED)
                .settledAmount(0L)
                .status(Transfer.Status.DECLINED)
                .addToBalance(
                    Balance.builder()
                        .availableAmount(0L)
                        .created(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .currency("currency")
                        .financialAccountToken("3fa85f64-5717-4562-b3fc-2c963f66afa6")
                        .financialAccountType(Balance.FinancialAccountType.ISSUING)
                        .lastTransactionEventToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .lastTransactionToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .pendingAmount(0L)
                        .totalAmount(0L)
                        .updated(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .build()
                )
                .updated(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        assertThat(transfer.token()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(transfer.category()).isEqualTo(Transfer.Category.TRANSFER)
        assertThat(transfer.created()).isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(transfer.currency()).isEqualTo("currency")
        assertThat(transfer.descriptor()).isEqualTo("descriptor")
        assertThat(transfer.events())
            .containsExactly(
                Transfer.FinancialEvent.builder()
                    .token("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .amount(0L)
                    .created(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .result(Transfer.FinancialEvent.Result.APPROVED)
                    .type(Transfer.FinancialEvent.FinancialEventType.ACH_ORIGINATION_CANCELLED)
                    .build()
            )
        assertThat(transfer.fromBalance())
            .containsExactly(
                Balance.builder()
                    .availableAmount(0L)
                    .created(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .currency("currency")
                    .financialAccountToken("3fa85f64-5717-4562-b3fc-2c963f66afa6")
                    .financialAccountType(Balance.FinancialAccountType.ISSUING)
                    .lastTransactionEventToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .lastTransactionToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .pendingAmount(0L)
                    .totalAmount(0L)
                    .updated(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .build()
            )
        assertThat(transfer.pendingAmount()).isEqualTo(0L)
        assertThat(transfer.result()).isEqualTo(Transfer.Result.APPROVED)
        assertThat(transfer.settledAmount()).isEqualTo(0L)
        assertThat(transfer.status()).isEqualTo(Transfer.Status.DECLINED)
        assertThat(transfer.toBalance())
            .containsExactly(
                Balance.builder()
                    .availableAmount(0L)
                    .created(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .currency("currency")
                    .financialAccountToken("3fa85f64-5717-4562-b3fc-2c963f66afa6")
                    .financialAccountType(Balance.FinancialAccountType.ISSUING)
                    .lastTransactionEventToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .lastTransactionToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .pendingAmount(0L)
                    .totalAmount(0L)
                    .updated(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .build()
            )
        assertThat(transfer.updated()).isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val transfer =
            Transfer.builder()
                .token("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .category(Transfer.Category.TRANSFER)
                .created(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .currency("currency")
                .descriptor("descriptor")
                .addEvent(
                    Transfer.FinancialEvent.builder()
                        .token("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .amount(0L)
                        .created(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .result(Transfer.FinancialEvent.Result.APPROVED)
                        .type(Transfer.FinancialEvent.FinancialEventType.ACH_ORIGINATION_CANCELLED)
                        .build()
                )
                .addFromBalance(
                    Balance.builder()
                        .availableAmount(0L)
                        .created(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .currency("currency")
                        .financialAccountToken("3fa85f64-5717-4562-b3fc-2c963f66afa6")
                        .financialAccountType(Balance.FinancialAccountType.ISSUING)
                        .lastTransactionEventToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .lastTransactionToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .pendingAmount(0L)
                        .totalAmount(0L)
                        .updated(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .build()
                )
                .pendingAmount(0L)
                .result(Transfer.Result.APPROVED)
                .settledAmount(0L)
                .status(Transfer.Status.DECLINED)
                .addToBalance(
                    Balance.builder()
                        .availableAmount(0L)
                        .created(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .currency("currency")
                        .financialAccountToken("3fa85f64-5717-4562-b3fc-2c963f66afa6")
                        .financialAccountType(Balance.FinancialAccountType.ISSUING)
                        .lastTransactionEventToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .lastTransactionToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .pendingAmount(0L)
                        .totalAmount(0L)
                        .updated(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .build()
                )
                .updated(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        val roundtrippedTransfer =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(transfer),
                jacksonTypeRef<Transfer>(),
            )

        assertThat(roundtrippedTransfer).isEqualTo(transfer)
    }
}
