// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class TransactionTest {

    @Test
    fun createTransaction() {
        val transaction =
            Transaction.builder()
                .token("c30c2182-1e69-4e0d-b40f-eec0d2a19123")
                .accountToken("db3942f0-0627-4887-a190-1ea83b46d091")
                .acquirerFee(0L)
                .acquirerReferenceNumber(null)
                .amount(1800L)
                .amounts(
                    Transaction.TransactionAmounts.builder()
                        .cardholder(
                            Transaction.TransactionAmounts.Cardholder.builder()
                                .amount(0L)
                                .conversionRate("1.000000")
                                .currency(Currency.AED)
                                .build()
                        )
                        .hold(
                            Transaction.TransactionAmounts.Hold.builder()
                                .amount(-1800L)
                                .currency(Currency.AED)
                                .build()
                        )
                        .merchant(
                            Transaction.TransactionAmounts.Merchant.builder()
                                .amount(0L)
                                .currency(Currency.AED)
                                .build()
                        )
                        .settlement(
                            Transaction.TransactionAmounts.Settlement.builder()
                                .amount(0L)
                                .currency(Currency.AED)
                                .build()
                        )
                        .build()
                )
                .authorizationAmount(1800L)
                .authorizationCode("071471")
                .avs(
                    Transaction.Avs.builder()
                        .address("123 Evergreen Terrace")
                        .zipcode("95006")
                        .build()
                )
                .cardToken("aac502f9-aecc-458a-954e-4bcf6edb6123")
                .cardholderAuthentication(
                    Transaction.CardholderAuthentication.builder()
                        ._3dsVersion(null)
                        .acquirerExemption(
                            Transaction.CardholderAuthentication.AcquirerExemption
                                .AUTHENTICATION_OUTAGE_EXCEPTION
                        )
                        .authenticationResult(
                            Transaction.CardholderAuthentication.AuthenticationResult.ATTEMPTS
                        )
                        .decisionMadeBy(
                            Transaction.CardholderAuthentication.DecisionMadeBy.CUSTOMER_ENDPOINT
                        )
                        .liabilityShift(
                            Transaction.CardholderAuthentication.LiabilityShift._3DS_AUTHENTICATED
                        )
                        .threeDSAuthenticationToken("fc60d37d-95f7-419c-b628-dd9fbf9d80d0")
                        .verificationAttempted(
                            Transaction.CardholderAuthentication.VerificationAttempted.NONE
                        )
                        .verificationResult(
                            Transaction.CardholderAuthentication.VerificationResult.CANCELLED
                        )
                        .build()
                )
                .created(OffsetDateTime.parse("2023-08-03T18:42:30Z"))
                .merchant(
                    Transaction.Merchant.builder()
                        .acceptorId("452322000053360")
                        .acquiringInstitutionId("333301802529120")
                        .city("gosq.com")
                        .country("USA")
                        .descriptor("SQ *SOMA EATS")
                        .mcc("5812")
                        .state("CA")
                        .build()
                )
                .merchantAmount(1800L)
                .merchantAuthorizationAmount(1800L)
                .merchantCurrency("USD")
                .network(Transaction.Network.INTERLINK)
                .networkRiskScore(5L)
                .pos(
                    Transaction.Pos.builder()
                        .entryMode(
                            Transaction.Pos.PosEntryMode.builder()
                                .card(Transaction.Pos.PosEntryMode.Card.NOT_PRESENT)
                                .cardholder(
                                    Transaction.Pos.PosEntryMode.Cardholder.DEFERRED_BILLING
                                )
                                .pan(Transaction.Pos.PosEntryMode.Pan.AUTO_ENTRY)
                                .pinEntered(false)
                                .build()
                        )
                        .terminal(
                            Transaction.Pos.PosTerminal.builder()
                                .attended(false)
                                .cardRetentionCapable(false)
                                .onPremise(false)
                                .operator(Transaction.Pos.PosTerminal.Operator.ADMINISTRATIVE)
                                .partialApprovalCapable(false)
                                .pinCapability(Transaction.Pos.PosTerminal.PinCapability.CAPABLE)
                                .type(Transaction.Pos.PosTerminal.Type.ADMINISTRATIVE)
                                .build()
                        )
                        .build()
                )
                .result(Transaction.DeclineResult.ACCOUNT_STATE_TRANSACTION_FAIL)
                .settledAmount(0L)
                .status(Transaction.Status.DECLINED)
                .tokenInfo(
                    Transaction.TokenInfo.builder()
                        .walletType(Transaction.TokenInfo.WalletType.APPLE_PAY)
                        .build()
                )
                .updated(OffsetDateTime.parse("2023-08-03T18:42:30Z"))
                .addEvent(
                    Transaction.TransactionEvent.builder()
                        .token("bbbf1e86-322d-11ee-9779-00505685a123")
                        .amount(1800L)
                        .amounts(
                            Transaction.TransactionEvent.TransactionEventAmounts.builder()
                                .cardholder(
                                    Transaction.TransactionEvent.TransactionEventAmounts.Cardholder
                                        .builder()
                                        .amount(1800L)
                                        .conversionRate("1.000000")
                                        .currency(Currency.AED)
                                        .build()
                                )
                                .merchant(
                                    Transaction.TransactionEvent.TransactionEventAmounts.Merchant
                                        .builder()
                                        .amount(1800L)
                                        .currency(Currency.AED)
                                        .build()
                                )
                                .settlement(
                                    Transaction.TransactionEvent.TransactionEventAmounts.Settlement
                                        .builder()
                                        .amount(1000L)
                                        .conversionRate("1.000000")
                                        .currency(Currency.AED)
                                        .build()
                                )
                                .build()
                        )
                        .created(OffsetDateTime.parse("2023-08-03T18:42:30Z"))
                        .addDetailedResult(
                            Transaction.TransactionEvent.DetailedResult
                                .ACCOUNT_DAILY_SPEND_LIMIT_EXCEEDED
                        )
                        .effectivePolarity(Transaction.TransactionEvent.EffectivePolarity.CREDIT)
                        .networkInfo(
                            Transaction.TransactionEvent.NetworkInfo.builder()
                                .acquirer(
                                    Transaction.TransactionEvent.NetworkInfo.Acquirer.builder()
                                        .acquirerReferenceNumber(null)
                                        .retrievalReferenceNumber("064386558597")
                                        .build()
                                )
                                .mastercard(
                                    Transaction.TransactionEvent.NetworkInfo.Mastercard.builder()
                                        .banknetReferenceNumber("U1HSCJ")
                                        .switchSerialNumber(null)
                                        .originalBanknetReferenceNumber(
                                            "original_banknet_reference_number"
                                        )
                                        .originalSwitchSerialNumber("original_switch_serial_number")
                                        .build()
                                )
                                .visa(
                                    Transaction.TransactionEvent.NetworkInfo.Visa.builder()
                                        .transactionId("transaction_id")
                                        .originalTransactionId("original_transaction_id")
                                        .build()
                                )
                                .build()
                        )
                        .result(
                            Transaction.TransactionEvent.DeclineResult
                                .ACCOUNT_STATE_TRANSACTION_FAIL
                        )
                        .addRuleResult(
                            Transaction.TransactionEvent.RuleResult.builder()
                                .authRuleToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                .explanation("explanation")
                                .name("name")
                                .result(
                                    Transaction.TransactionEvent.RuleResult.DetailedResult
                                        .ACCOUNT_DAILY_SPEND_LIMIT_EXCEEDED
                                )
                                .build()
                        )
                        .type(Transaction.TransactionEvent.Type.AUTHORIZATION)
                        .build()
                )
                .build()
        assertThat(transaction).isNotNull
        assertThat(transaction.token()).isEqualTo("c30c2182-1e69-4e0d-b40f-eec0d2a19123")
        assertThat(transaction.accountToken()).isEqualTo("db3942f0-0627-4887-a190-1ea83b46d091")
        assertThat(transaction.acquirerFee()).isEqualTo(0L)
        assertThat(transaction.acquirerReferenceNumber()).isNull()
        assertThat(transaction.amount()).isEqualTo(1800L)
        assertThat(transaction.amounts())
            .isEqualTo(
                Transaction.TransactionAmounts.builder()
                    .cardholder(
                        Transaction.TransactionAmounts.Cardholder.builder()
                            .amount(0L)
                            .conversionRate("1.000000")
                            .currency(Currency.AED)
                            .build()
                    )
                    .hold(
                        Transaction.TransactionAmounts.Hold.builder()
                            .amount(-1800L)
                            .currency(Currency.AED)
                            .build()
                    )
                    .merchant(
                        Transaction.TransactionAmounts.Merchant.builder()
                            .amount(0L)
                            .currency(Currency.AED)
                            .build()
                    )
                    .settlement(
                        Transaction.TransactionAmounts.Settlement.builder()
                            .amount(0L)
                            .currency(Currency.AED)
                            .build()
                    )
                    .build()
            )
        assertThat(transaction.authorizationAmount()).isEqualTo(1800L)
        assertThat(transaction.authorizationCode()).isEqualTo("071471")
        assertThat(transaction.avs())
            .isEqualTo(
                Transaction.Avs.builder().address("123 Evergreen Terrace").zipcode("95006").build()
            )
        assertThat(transaction.cardToken()).isEqualTo("aac502f9-aecc-458a-954e-4bcf6edb6123")
        assertThat(transaction.cardholderAuthentication())
            .isEqualTo(
                Transaction.CardholderAuthentication.builder()
                    ._3dsVersion(null)
                    .acquirerExemption(
                        Transaction.CardholderAuthentication.AcquirerExemption
                            .AUTHENTICATION_OUTAGE_EXCEPTION
                    )
                    .authenticationResult(
                        Transaction.CardholderAuthentication.AuthenticationResult.ATTEMPTS
                    )
                    .decisionMadeBy(
                        Transaction.CardholderAuthentication.DecisionMadeBy.CUSTOMER_ENDPOINT
                    )
                    .liabilityShift(
                        Transaction.CardholderAuthentication.LiabilityShift._3DS_AUTHENTICATED
                    )
                    .threeDSAuthenticationToken("fc60d37d-95f7-419c-b628-dd9fbf9d80d0")
                    .verificationAttempted(
                        Transaction.CardholderAuthentication.VerificationAttempted.NONE
                    )
                    .verificationResult(
                        Transaction.CardholderAuthentication.VerificationResult.CANCELLED
                    )
                    .build()
            )
        assertThat(transaction.created()).isEqualTo(OffsetDateTime.parse("2023-08-03T18:42:30Z"))
        assertThat(transaction.merchant())
            .isEqualTo(
                Transaction.Merchant.builder()
                    .acceptorId("452322000053360")
                    .acquiringInstitutionId("333301802529120")
                    .city("gosq.com")
                    .country("USA")
                    .descriptor("SQ *SOMA EATS")
                    .mcc("5812")
                    .state("CA")
                    .build()
            )
        assertThat(transaction.merchantAmount()).isEqualTo(1800L)
        assertThat(transaction.merchantAuthorizationAmount()).isEqualTo(1800L)
        assertThat(transaction.merchantCurrency()).isEqualTo("USD")
        assertThat(transaction.network()).isEqualTo(Transaction.Network.INTERLINK)
        assertThat(transaction.networkRiskScore()).isEqualTo(5L)
        assertThat(transaction.pos())
            .isEqualTo(
                Transaction.Pos.builder()
                    .entryMode(
                        Transaction.Pos.PosEntryMode.builder()
                            .card(Transaction.Pos.PosEntryMode.Card.NOT_PRESENT)
                            .cardholder(Transaction.Pos.PosEntryMode.Cardholder.DEFERRED_BILLING)
                            .pan(Transaction.Pos.PosEntryMode.Pan.AUTO_ENTRY)
                            .pinEntered(false)
                            .build()
                    )
                    .terminal(
                        Transaction.Pos.PosTerminal.builder()
                            .attended(false)
                            .cardRetentionCapable(false)
                            .onPremise(false)
                            .operator(Transaction.Pos.PosTerminal.Operator.ADMINISTRATIVE)
                            .partialApprovalCapable(false)
                            .pinCapability(Transaction.Pos.PosTerminal.PinCapability.CAPABLE)
                            .type(Transaction.Pos.PosTerminal.Type.ADMINISTRATIVE)
                            .build()
                    )
                    .build()
            )
        assertThat(transaction.result())
            .isEqualTo(Transaction.DeclineResult.ACCOUNT_STATE_TRANSACTION_FAIL)
        assertThat(transaction.settledAmount()).isEqualTo(0L)
        assertThat(transaction.status()).isEqualTo(Transaction.Status.DECLINED)
        assertThat(transaction.tokenInfo())
            .isEqualTo(
                Transaction.TokenInfo.builder()
                    .walletType(Transaction.TokenInfo.WalletType.APPLE_PAY)
                    .build()
            )
        assertThat(transaction.updated()).isEqualTo(OffsetDateTime.parse("2023-08-03T18:42:30Z"))
        assertThat(transaction.events())
            .containsExactly(
                Transaction.TransactionEvent.builder()
                    .token("bbbf1e86-322d-11ee-9779-00505685a123")
                    .amount(1800L)
                    .amounts(
                        Transaction.TransactionEvent.TransactionEventAmounts.builder()
                            .cardholder(
                                Transaction.TransactionEvent.TransactionEventAmounts.Cardholder
                                    .builder()
                                    .amount(1800L)
                                    .conversionRate("1.000000")
                                    .currency(Currency.AED)
                                    .build()
                            )
                            .merchant(
                                Transaction.TransactionEvent.TransactionEventAmounts.Merchant
                                    .builder()
                                    .amount(1800L)
                                    .currency(Currency.AED)
                                    .build()
                            )
                            .settlement(
                                Transaction.TransactionEvent.TransactionEventAmounts.Settlement
                                    .builder()
                                    .amount(1000L)
                                    .conversionRate("1.000000")
                                    .currency(Currency.AED)
                                    .build()
                            )
                            .build()
                    )
                    .created(OffsetDateTime.parse("2023-08-03T18:42:30Z"))
                    .addDetailedResult(
                        Transaction.TransactionEvent.DetailedResult
                            .ACCOUNT_DAILY_SPEND_LIMIT_EXCEEDED
                    )
                    .effectivePolarity(Transaction.TransactionEvent.EffectivePolarity.CREDIT)
                    .networkInfo(
                        Transaction.TransactionEvent.NetworkInfo.builder()
                            .acquirer(
                                Transaction.TransactionEvent.NetworkInfo.Acquirer.builder()
                                    .acquirerReferenceNumber(null)
                                    .retrievalReferenceNumber("064386558597")
                                    .build()
                            )
                            .mastercard(
                                Transaction.TransactionEvent.NetworkInfo.Mastercard.builder()
                                    .banknetReferenceNumber("U1HSCJ")
                                    .switchSerialNumber(null)
                                    .originalBanknetReferenceNumber(
                                        "original_banknet_reference_number"
                                    )
                                    .originalSwitchSerialNumber("original_switch_serial_number")
                                    .build()
                            )
                            .visa(
                                Transaction.TransactionEvent.NetworkInfo.Visa.builder()
                                    .transactionId("transaction_id")
                                    .originalTransactionId("original_transaction_id")
                                    .build()
                            )
                            .build()
                    )
                    .result(
                        Transaction.TransactionEvent.DeclineResult.ACCOUNT_STATE_TRANSACTION_FAIL
                    )
                    .addRuleResult(
                        Transaction.TransactionEvent.RuleResult.builder()
                            .authRuleToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                            .explanation("explanation")
                            .name("name")
                            .result(
                                Transaction.TransactionEvent.RuleResult.DetailedResult
                                    .ACCOUNT_DAILY_SPEND_LIMIT_EXCEEDED
                            )
                            .build()
                    )
                    .type(Transaction.TransactionEvent.Type.AUTHORIZATION)
                    .build()
            )
    }
}
