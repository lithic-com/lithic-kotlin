// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TransactionTest {

    @Test
    fun createTransaction() {
        val transaction =
            Transaction.builder()
                .token("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .accountToken("bd5e5649-1be8-4117-9bc5-3268258d1417")
                .acquirerFee(0L)
                .acquirerReferenceNumber("12345678987654321234567")
                .amount(1000L)
                .amounts(
                    Transaction.TransactionAmounts.builder()
                        .cardholder(
                            Transaction.TransactionAmounts.Cardholder.builder()
                                .amount(-1000L)
                                .conversionRate("1.000000")
                                .currency("USD")
                                .build()
                        )
                        .hold(
                            Transaction.TransactionAmounts.Hold.builder()
                                .amount(0L)
                                .currency("USD")
                                .build()
                        )
                        .merchant(
                            Transaction.TransactionAmounts.Merchant.builder()
                                .amount(-1000L)
                                .currency("USD")
                                .build()
                        )
                        .settlement(
                            Transaction.TransactionAmounts.Settlement.builder()
                                .amount(-1000L)
                                .currency("USD")
                                .build()
                        )
                        .build()
                )
                .authorizationAmount(1000L)
                .authorizationCode("123456")
                .avs(Transaction.Avs.builder().address("address").zipcode("zipcode").build())
                .cardToken("19c22c47-7a75-43ee-9891-595419830f7e")
                .cardholderAuthentication(
                    Transaction.CardholderAuthentication.builder()
                        ._3dsVersion("2")
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
                        .threeDSAuthenticationToken("a6e372d0-b40a-43eb-b0d1-4e1aebef5875")
                        .verificationAttempted(
                            Transaction.CardholderAuthentication.VerificationAttempted.NONE
                        )
                        .verificationResult(
                            Transaction.CardholderAuthentication.VerificationResult.CANCELLED
                        )
                        .build()
                )
                .created(OffsetDateTime.parse("2023-09-26T21:14:28.637Z"))
                .merchant(
                    Transaction.Merchant.builder()
                        .acceptorId("333301802529120")
                        .acquiringInstitutionId("191231")
                        .city("NEW YORK")
                        .country("USA")
                        .descriptor("COFFEE SHOP")
                        .mcc("5812")
                        .state("NY")
                        .build()
                )
                .merchantAmount(1000L)
                .merchantAuthorizationAmount(1000L)
                .merchantCurrency("USD")
                .network(Transaction.Network.INTERLINK)
                .networkRiskScore(0L)
                .pos(
                    Transaction.Pos.builder()
                        .entryMode(
                            Transaction.Pos.PosEntryMode.builder()
                                .card(Transaction.Pos.PosEntryMode.Card.NOT_PRESENT)
                                .cardholder(
                                    Transaction.Pos.PosEntryMode.Cardholder.DEFERRED_BILLING
                                )
                                .pan(Transaction.Pos.PosEntryMode.Pan.AUTO_ENTRY)
                                .pinEntered(true)
                                .build()
                        )
                        .terminal(
                            Transaction.Pos.PosTerminal.builder()
                                .attended(true)
                                .cardRetentionCapable(true)
                                .onPremise(true)
                                .operator(Transaction.Pos.PosTerminal.Operator.ADMINISTRATIVE)
                                .partialApprovalCapable(true)
                                .pinCapability(Transaction.Pos.PosTerminal.PinCapability.CAPABLE)
                                .type(Transaction.Pos.PosTerminal.Type.ADMINISTRATIVE)
                                .build()
                        )
                        .build()
                )
                .result(Transaction.DeclineResult.ACCOUNT_STATE_TRANSACTION_FAIL)
                .settledAmount(1000L)
                .status(Transaction.Status.DECLINED)
                .tokenInfo(
                    Transaction.TokenInfo.builder()
                        .walletType(Transaction.TokenInfo.WalletType.APPLE_PAY)
                        .build()
                )
                .updated(OffsetDateTime.parse("2023-09-26T21:14:28.637Z"))
                .addEvent(
                    Transaction.TransactionEvent.builder()
                        .token("0c2adae9-f535-4505-8c35-421dad9bd0b6")
                        .amount(1000L)
                        .amounts(
                            Transaction.TransactionEvent.TransactionEventAmounts.builder()
                                .cardholder(
                                    Transaction.TransactionEvent.TransactionEventAmounts.Cardholder
                                        .builder()
                                        .amount(1000L)
                                        .conversionRate("1.000000")
                                        .currency("USD")
                                        .build()
                                )
                                .merchant(
                                    Transaction.TransactionEvent.TransactionEventAmounts.Merchant
                                        .builder()
                                        .amount(1000L)
                                        .currency("USD")
                                        .build()
                                )
                                .settlement(
                                    Transaction.TransactionEvent.TransactionEventAmounts.Settlement
                                        .builder()
                                        .amount(1000L)
                                        .conversionRate("1.000000")
                                        .currency("USD")
                                        .build()
                                )
                                .build()
                        )
                        .created(OffsetDateTime.parse("2023-09-26T21:14:28.637Z"))
                        .addDetailedResult(
                            Transaction.TransactionEvent.DetailedResult
                                .ACCOUNT_DAILY_SPEND_LIMIT_EXCEEDED
                        )
                        .effectivePolarity(Transaction.TransactionEvent.EffectivePolarity.CREDIT)
                        .networkInfo(
                            Transaction.TransactionEvent.NetworkInfo.builder()
                                .acquirer(
                                    Transaction.TransactionEvent.NetworkInfo.Acquirer.builder()
                                        .acquirerReferenceNumber("acquirer_reference_number")
                                        .retrievalReferenceNumber("retrieval_reference_number")
                                        .build()
                                )
                                .mastercard(
                                    Transaction.TransactionEvent.NetworkInfo.Mastercard.builder()
                                        .banknetReferenceNumber("banknet_reference_number")
                                        .originalBanknetReferenceNumber(
                                            "original_banknet_reference_number"
                                        )
                                        .originalSwitchSerialNumber("original_switch_serial_number")
                                        .switchSerialNumber("switch_serial_number")
                                        .build()
                                )
                                .visa(
                                    Transaction.TransactionEvent.NetworkInfo.Visa.builder()
                                        .originalTransactionId("original_transaction_id")
                                        .transactionId("transaction_id")
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
        assertThat(transaction.token()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(transaction.accountToken()).isEqualTo("bd5e5649-1be8-4117-9bc5-3268258d1417")
        assertThat(transaction.acquirerFee()).isEqualTo(0L)
        assertThat(transaction.acquirerReferenceNumber()).isEqualTo("12345678987654321234567")
        assertThat(transaction.amount()).isEqualTo(1000L)
        assertThat(transaction.amounts())
            .isEqualTo(
                Transaction.TransactionAmounts.builder()
                    .cardholder(
                        Transaction.TransactionAmounts.Cardholder.builder()
                            .amount(-1000L)
                            .conversionRate("1.000000")
                            .currency("USD")
                            .build()
                    )
                    .hold(
                        Transaction.TransactionAmounts.Hold.builder()
                            .amount(0L)
                            .currency("USD")
                            .build()
                    )
                    .merchant(
                        Transaction.TransactionAmounts.Merchant.builder()
                            .amount(-1000L)
                            .currency("USD")
                            .build()
                    )
                    .settlement(
                        Transaction.TransactionAmounts.Settlement.builder()
                            .amount(-1000L)
                            .currency("USD")
                            .build()
                    )
                    .build()
            )
        assertThat(transaction.authorizationAmount()).isEqualTo(1000L)
        assertThat(transaction.authorizationCode()).isEqualTo("123456")
        assertThat(transaction.avs())
            .isEqualTo(Transaction.Avs.builder().address("address").zipcode("zipcode").build())
        assertThat(transaction.cardToken()).isEqualTo("19c22c47-7a75-43ee-9891-595419830f7e")
        assertThat(transaction.cardholderAuthentication())
            .isEqualTo(
                Transaction.CardholderAuthentication.builder()
                    ._3dsVersion("2")
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
                    .threeDSAuthenticationToken("a6e372d0-b40a-43eb-b0d1-4e1aebef5875")
                    .verificationAttempted(
                        Transaction.CardholderAuthentication.VerificationAttempted.NONE
                    )
                    .verificationResult(
                        Transaction.CardholderAuthentication.VerificationResult.CANCELLED
                    )
                    .build()
            )
        assertThat(transaction.created())
            .isEqualTo(OffsetDateTime.parse("2023-09-26T21:14:28.637Z"))
        assertThat(transaction.merchant())
            .isEqualTo(
                Transaction.Merchant.builder()
                    .acceptorId("333301802529120")
                    .acquiringInstitutionId("191231")
                    .city("NEW YORK")
                    .country("USA")
                    .descriptor("COFFEE SHOP")
                    .mcc("5812")
                    .state("NY")
                    .build()
            )
        assertThat(transaction.merchantAmount()).isEqualTo(1000L)
        assertThat(transaction.merchantAuthorizationAmount()).isEqualTo(1000L)
        assertThat(transaction.merchantCurrency()).isEqualTo("USD")
        assertThat(transaction.network()).isEqualTo(Transaction.Network.INTERLINK)
        assertThat(transaction.networkRiskScore()).isEqualTo(0L)
        assertThat(transaction.pos())
            .isEqualTo(
                Transaction.Pos.builder()
                    .entryMode(
                        Transaction.Pos.PosEntryMode.builder()
                            .card(Transaction.Pos.PosEntryMode.Card.NOT_PRESENT)
                            .cardholder(Transaction.Pos.PosEntryMode.Cardholder.DEFERRED_BILLING)
                            .pan(Transaction.Pos.PosEntryMode.Pan.AUTO_ENTRY)
                            .pinEntered(true)
                            .build()
                    )
                    .terminal(
                        Transaction.Pos.PosTerminal.builder()
                            .attended(true)
                            .cardRetentionCapable(true)
                            .onPremise(true)
                            .operator(Transaction.Pos.PosTerminal.Operator.ADMINISTRATIVE)
                            .partialApprovalCapable(true)
                            .pinCapability(Transaction.Pos.PosTerminal.PinCapability.CAPABLE)
                            .type(Transaction.Pos.PosTerminal.Type.ADMINISTRATIVE)
                            .build()
                    )
                    .build()
            )
        assertThat(transaction.result())
            .isEqualTo(Transaction.DeclineResult.ACCOUNT_STATE_TRANSACTION_FAIL)
        assertThat(transaction.settledAmount()).isEqualTo(1000L)
        assertThat(transaction.status()).isEqualTo(Transaction.Status.DECLINED)
        assertThat(transaction.tokenInfo())
            .isEqualTo(
                Transaction.TokenInfo.builder()
                    .walletType(Transaction.TokenInfo.WalletType.APPLE_PAY)
                    .build()
            )
        assertThat(transaction.updated())
            .isEqualTo(OffsetDateTime.parse("2023-09-26T21:14:28.637Z"))
        assertThat(transaction.events())
            .containsExactly(
                Transaction.TransactionEvent.builder()
                    .token("0c2adae9-f535-4505-8c35-421dad9bd0b6")
                    .amount(1000L)
                    .amounts(
                        Transaction.TransactionEvent.TransactionEventAmounts.builder()
                            .cardholder(
                                Transaction.TransactionEvent.TransactionEventAmounts.Cardholder
                                    .builder()
                                    .amount(1000L)
                                    .conversionRate("1.000000")
                                    .currency("USD")
                                    .build()
                            )
                            .merchant(
                                Transaction.TransactionEvent.TransactionEventAmounts.Merchant
                                    .builder()
                                    .amount(1000L)
                                    .currency("USD")
                                    .build()
                            )
                            .settlement(
                                Transaction.TransactionEvent.TransactionEventAmounts.Settlement
                                    .builder()
                                    .amount(1000L)
                                    .conversionRate("1.000000")
                                    .currency("USD")
                                    .build()
                            )
                            .build()
                    )
                    .created(OffsetDateTime.parse("2023-09-26T21:14:28.637Z"))
                    .addDetailedResult(
                        Transaction.TransactionEvent.DetailedResult
                            .ACCOUNT_DAILY_SPEND_LIMIT_EXCEEDED
                    )
                    .effectivePolarity(Transaction.TransactionEvent.EffectivePolarity.CREDIT)
                    .networkInfo(
                        Transaction.TransactionEvent.NetworkInfo.builder()
                            .acquirer(
                                Transaction.TransactionEvent.NetworkInfo.Acquirer.builder()
                                    .acquirerReferenceNumber("acquirer_reference_number")
                                    .retrievalReferenceNumber("retrieval_reference_number")
                                    .build()
                            )
                            .mastercard(
                                Transaction.TransactionEvent.NetworkInfo.Mastercard.builder()
                                    .banknetReferenceNumber("banknet_reference_number")
                                    .originalBanknetReferenceNumber(
                                        "original_banknet_reference_number"
                                    )
                                    .originalSwitchSerialNumber("original_switch_serial_number")
                                    .switchSerialNumber("switch_serial_number")
                                    .build()
                            )
                            .visa(
                                Transaction.TransactionEvent.NetworkInfo.Visa.builder()
                                    .originalTransactionId("original_transaction_id")
                                    .transactionId("transaction_id")
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
