// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lithic.api.core.jsonMapper
import java.time.LocalDate
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PaymentCreateResponseTest {

    @Test
    fun create() {
        val paymentCreateResponse =
            PaymentCreateResponse.builder()
                .token("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .category(Payment.Category.ACH)
                .created(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .currency("currency")
                .descriptor("descriptor")
                .direction(Payment.Direction.CREDIT)
                .addEvent(
                    Payment.PaymentEvent.builder()
                        .token("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .amount(0L)
                        .created(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .result(Payment.PaymentEvent.Result.APPROVED)
                        .type(Payment.PaymentEvent.PaymentEventType.ACH_ORIGINATION_CANCELLED)
                        .addDetailedResult(Payment.PaymentEvent.DetailedResult.APPROVED)
                        .build()
                )
                .externalBankAccountToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .financialAccountToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .method(Payment.Method.ACH_NEXT_DAY)
                .methodAttributes(
                    Payment.PaymentMethodAttributes.builder()
                        .companyId("company_id")
                        .receiptRoutingNumber("receipt_routing_number")
                        .retries(0L)
                        .returnReasonCode("return_reason_code")
                        .secCode(Payment.PaymentMethodAttributes.SecCode.CCD)
                        .addTraceNumber("string")
                        .build()
                )
                .pendingAmount(0L)
                .result(Payment.Result.APPROVED)
                .settledAmount(0L)
                .source(Payment.Source.CUSTOMER)
                .status(Payment.Status.DECLINED)
                .updated(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .userDefinedId("user_defined_id")
                .expectedReleaseDate(LocalDate.parse("2019-12-27"))
                .balance(
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
                .build()

        assertThat(paymentCreateResponse.token()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(paymentCreateResponse.category()).isEqualTo(Payment.Category.ACH)
        assertThat(paymentCreateResponse.created())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(paymentCreateResponse.currency()).isEqualTo("currency")
        assertThat(paymentCreateResponse.descriptor()).isEqualTo("descriptor")
        assertThat(paymentCreateResponse.direction()).isEqualTo(Payment.Direction.CREDIT)
        assertThat(paymentCreateResponse.events())
            .containsExactly(
                Payment.PaymentEvent.builder()
                    .token("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .amount(0L)
                    .created(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .result(Payment.PaymentEvent.Result.APPROVED)
                    .type(Payment.PaymentEvent.PaymentEventType.ACH_ORIGINATION_CANCELLED)
                    .addDetailedResult(Payment.PaymentEvent.DetailedResult.APPROVED)
                    .build()
            )
        assertThat(paymentCreateResponse.externalBankAccountToken())
            .isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(paymentCreateResponse.financialAccountToken())
            .isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(paymentCreateResponse.method()).isEqualTo(Payment.Method.ACH_NEXT_DAY)
        assertThat(paymentCreateResponse.methodAttributes())
            .isEqualTo(
                Payment.PaymentMethodAttributes.builder()
                    .companyId("company_id")
                    .receiptRoutingNumber("receipt_routing_number")
                    .retries(0L)
                    .returnReasonCode("return_reason_code")
                    .secCode(Payment.PaymentMethodAttributes.SecCode.CCD)
                    .addTraceNumber("string")
                    .build()
            )
        assertThat(paymentCreateResponse.pendingAmount()).isEqualTo(0L)
        assertThat(paymentCreateResponse.result()).isEqualTo(Payment.Result.APPROVED)
        assertThat(paymentCreateResponse.settledAmount()).isEqualTo(0L)
        assertThat(paymentCreateResponse.source()).isEqualTo(Payment.Source.CUSTOMER)
        assertThat(paymentCreateResponse.status()).isEqualTo(Payment.Status.DECLINED)
        assertThat(paymentCreateResponse.updated())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(paymentCreateResponse.userDefinedId()).isEqualTo("user_defined_id")
        assertThat(paymentCreateResponse.expectedReleaseDate())
            .isEqualTo(LocalDate.parse("2019-12-27"))
        assertThat(paymentCreateResponse.balance())
            .isEqualTo(
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
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val paymentCreateResponse =
            PaymentCreateResponse.builder()
                .token("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .category(Payment.Category.ACH)
                .created(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .currency("currency")
                .descriptor("descriptor")
                .direction(Payment.Direction.CREDIT)
                .addEvent(
                    Payment.PaymentEvent.builder()
                        .token("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .amount(0L)
                        .created(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .result(Payment.PaymentEvent.Result.APPROVED)
                        .type(Payment.PaymentEvent.PaymentEventType.ACH_ORIGINATION_CANCELLED)
                        .addDetailedResult(Payment.PaymentEvent.DetailedResult.APPROVED)
                        .build()
                )
                .externalBankAccountToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .financialAccountToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .method(Payment.Method.ACH_NEXT_DAY)
                .methodAttributes(
                    Payment.PaymentMethodAttributes.builder()
                        .companyId("company_id")
                        .receiptRoutingNumber("receipt_routing_number")
                        .retries(0L)
                        .returnReasonCode("return_reason_code")
                        .secCode(Payment.PaymentMethodAttributes.SecCode.CCD)
                        .addTraceNumber("string")
                        .build()
                )
                .pendingAmount(0L)
                .result(Payment.Result.APPROVED)
                .settledAmount(0L)
                .source(Payment.Source.CUSTOMER)
                .status(Payment.Status.DECLINED)
                .updated(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .userDefinedId("user_defined_id")
                .expectedReleaseDate(LocalDate.parse("2019-12-27"))
                .balance(
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
                .build()

        val roundtrippedPaymentCreateResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(paymentCreateResponse),
                jacksonTypeRef<PaymentCreateResponse>(),
            )

        assertThat(roundtrippedPaymentCreateResponse).isEqualTo(paymentCreateResponse)
    }
}
