// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lithic.api.core.JsonValue
import com.lithic.api.core.jsonMapper
import com.lithic.api.errors.LithicInvalidDataException
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.EnumSource

internal class RuleFeatureTest {

    @Test
    fun ofAuthorization() {
        val authorization =
            RuleFeature.AuthorizationFeature.builder()
                .type(RuleFeature.AuthorizationFeature.Type.AUTHORIZATION)
                .name("name")
                .build()

        val ruleFeature = RuleFeature.ofAuthorization(authorization)

        assertThat(ruleFeature.authorization()).isEqualTo(authorization)
        assertThat(ruleFeature.authentication()).isNull()
        assertThat(ruleFeature.tokenization()).isNull()
        assertThat(ruleFeature.achReceipt()).isNull()
        assertThat(ruleFeature.cardTransaction()).isNull()
        assertThat(ruleFeature.achPayment()).isNull()
        assertThat(ruleFeature.externalBankAccount()).isNull()
        assertThat(ruleFeature.card()).isNull()
        assertThat(ruleFeature.accountHolder()).isNull()
        assertThat(ruleFeature.ipMetadata()).isNull()
        assertThat(ruleFeature.spendVelocity()).isNull()
        assertThat(ruleFeature.paymentVelocity()).isNull()
        assertThat(ruleFeature.transactionHistorySignals()).isNull()
        assertThat(ruleFeature.consecutiveDeclines()).isNull()
        assertThat(ruleFeature.achPaymentHistory()).isNull()
    }

    @Test
    fun ofAuthorizationRoundtrip() {
        val jsonMapper = jsonMapper()
        val ruleFeature =
            RuleFeature.ofAuthorization(
                RuleFeature.AuthorizationFeature.builder()
                    .type(RuleFeature.AuthorizationFeature.Type.AUTHORIZATION)
                    .name("name")
                    .build()
            )

        val roundtrippedRuleFeature =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(ruleFeature),
                jacksonTypeRef<RuleFeature>(),
            )

        assertThat(roundtrippedRuleFeature).isEqualTo(ruleFeature)
    }

    @Test
    fun ofAuthentication() {
        val authentication =
            RuleFeature.AuthenticationFeature.builder()
                .type(RuleFeature.AuthenticationFeature.Type.AUTHENTICATION)
                .name("name")
                .build()

        val ruleFeature = RuleFeature.ofAuthentication(authentication)

        assertThat(ruleFeature.authorization()).isNull()
        assertThat(ruleFeature.authentication()).isEqualTo(authentication)
        assertThat(ruleFeature.tokenization()).isNull()
        assertThat(ruleFeature.achReceipt()).isNull()
        assertThat(ruleFeature.cardTransaction()).isNull()
        assertThat(ruleFeature.achPayment()).isNull()
        assertThat(ruleFeature.externalBankAccount()).isNull()
        assertThat(ruleFeature.card()).isNull()
        assertThat(ruleFeature.accountHolder()).isNull()
        assertThat(ruleFeature.ipMetadata()).isNull()
        assertThat(ruleFeature.spendVelocity()).isNull()
        assertThat(ruleFeature.paymentVelocity()).isNull()
        assertThat(ruleFeature.transactionHistorySignals()).isNull()
        assertThat(ruleFeature.consecutiveDeclines()).isNull()
        assertThat(ruleFeature.achPaymentHistory()).isNull()
    }

    @Test
    fun ofAuthenticationRoundtrip() {
        val jsonMapper = jsonMapper()
        val ruleFeature =
            RuleFeature.ofAuthentication(
                RuleFeature.AuthenticationFeature.builder()
                    .type(RuleFeature.AuthenticationFeature.Type.AUTHENTICATION)
                    .name("name")
                    .build()
            )

        val roundtrippedRuleFeature =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(ruleFeature),
                jacksonTypeRef<RuleFeature>(),
            )

        assertThat(roundtrippedRuleFeature).isEqualTo(ruleFeature)
    }

    @Test
    fun ofTokenization() {
        val tokenization =
            RuleFeature.TokenizationFeature.builder()
                .type(RuleFeature.TokenizationFeature.Type.TOKENIZATION)
                .name("name")
                .build()

        val ruleFeature = RuleFeature.ofTokenization(tokenization)

        assertThat(ruleFeature.authorization()).isNull()
        assertThat(ruleFeature.authentication()).isNull()
        assertThat(ruleFeature.tokenization()).isEqualTo(tokenization)
        assertThat(ruleFeature.achReceipt()).isNull()
        assertThat(ruleFeature.cardTransaction()).isNull()
        assertThat(ruleFeature.achPayment()).isNull()
        assertThat(ruleFeature.externalBankAccount()).isNull()
        assertThat(ruleFeature.card()).isNull()
        assertThat(ruleFeature.accountHolder()).isNull()
        assertThat(ruleFeature.ipMetadata()).isNull()
        assertThat(ruleFeature.spendVelocity()).isNull()
        assertThat(ruleFeature.paymentVelocity()).isNull()
        assertThat(ruleFeature.transactionHistorySignals()).isNull()
        assertThat(ruleFeature.consecutiveDeclines()).isNull()
        assertThat(ruleFeature.achPaymentHistory()).isNull()
    }

    @Test
    fun ofTokenizationRoundtrip() {
        val jsonMapper = jsonMapper()
        val ruleFeature =
            RuleFeature.ofTokenization(
                RuleFeature.TokenizationFeature.builder()
                    .type(RuleFeature.TokenizationFeature.Type.TOKENIZATION)
                    .name("name")
                    .build()
            )

        val roundtrippedRuleFeature =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(ruleFeature),
                jacksonTypeRef<RuleFeature>(),
            )

        assertThat(roundtrippedRuleFeature).isEqualTo(ruleFeature)
    }

    @Test
    fun ofAchReceipt() {
        val achReceipt =
            RuleFeature.AchReceiptFeature.builder()
                .type(RuleFeature.AchReceiptFeature.Type.ACH_RECEIPT)
                .name("name")
                .build()

        val ruleFeature = RuleFeature.ofAchReceipt(achReceipt)

        assertThat(ruleFeature.authorization()).isNull()
        assertThat(ruleFeature.authentication()).isNull()
        assertThat(ruleFeature.tokenization()).isNull()
        assertThat(ruleFeature.achReceipt()).isEqualTo(achReceipt)
        assertThat(ruleFeature.cardTransaction()).isNull()
        assertThat(ruleFeature.achPayment()).isNull()
        assertThat(ruleFeature.externalBankAccount()).isNull()
        assertThat(ruleFeature.card()).isNull()
        assertThat(ruleFeature.accountHolder()).isNull()
        assertThat(ruleFeature.ipMetadata()).isNull()
        assertThat(ruleFeature.spendVelocity()).isNull()
        assertThat(ruleFeature.paymentVelocity()).isNull()
        assertThat(ruleFeature.transactionHistorySignals()).isNull()
        assertThat(ruleFeature.consecutiveDeclines()).isNull()
        assertThat(ruleFeature.achPaymentHistory()).isNull()
    }

    @Test
    fun ofAchReceiptRoundtrip() {
        val jsonMapper = jsonMapper()
        val ruleFeature =
            RuleFeature.ofAchReceipt(
                RuleFeature.AchReceiptFeature.builder()
                    .type(RuleFeature.AchReceiptFeature.Type.ACH_RECEIPT)
                    .name("name")
                    .build()
            )

        val roundtrippedRuleFeature =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(ruleFeature),
                jacksonTypeRef<RuleFeature>(),
            )

        assertThat(roundtrippedRuleFeature).isEqualTo(ruleFeature)
    }

    @Test
    fun ofCardTransaction() {
        val cardTransaction =
            RuleFeature.CardTransactionFeature.builder()
                .type(RuleFeature.CardTransactionFeature.Type.CARD_TRANSACTION)
                .name("name")
                .build()

        val ruleFeature = RuleFeature.ofCardTransaction(cardTransaction)

        assertThat(ruleFeature.authorization()).isNull()
        assertThat(ruleFeature.authentication()).isNull()
        assertThat(ruleFeature.tokenization()).isNull()
        assertThat(ruleFeature.achReceipt()).isNull()
        assertThat(ruleFeature.cardTransaction()).isEqualTo(cardTransaction)
        assertThat(ruleFeature.achPayment()).isNull()
        assertThat(ruleFeature.externalBankAccount()).isNull()
        assertThat(ruleFeature.card()).isNull()
        assertThat(ruleFeature.accountHolder()).isNull()
        assertThat(ruleFeature.ipMetadata()).isNull()
        assertThat(ruleFeature.spendVelocity()).isNull()
        assertThat(ruleFeature.paymentVelocity()).isNull()
        assertThat(ruleFeature.transactionHistorySignals()).isNull()
        assertThat(ruleFeature.consecutiveDeclines()).isNull()
        assertThat(ruleFeature.achPaymentHistory()).isNull()
    }

    @Test
    fun ofCardTransactionRoundtrip() {
        val jsonMapper = jsonMapper()
        val ruleFeature =
            RuleFeature.ofCardTransaction(
                RuleFeature.CardTransactionFeature.builder()
                    .type(RuleFeature.CardTransactionFeature.Type.CARD_TRANSACTION)
                    .name("name")
                    .build()
            )

        val roundtrippedRuleFeature =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(ruleFeature),
                jacksonTypeRef<RuleFeature>(),
            )

        assertThat(roundtrippedRuleFeature).isEqualTo(ruleFeature)
    }

    @Test
    fun ofAchPayment() {
        val achPayment =
            RuleFeature.AchPaymentFeature.builder()
                .type(RuleFeature.AchPaymentFeature.Type.ACH_PAYMENT)
                .name("name")
                .build()

        val ruleFeature = RuleFeature.ofAchPayment(achPayment)

        assertThat(ruleFeature.authorization()).isNull()
        assertThat(ruleFeature.authentication()).isNull()
        assertThat(ruleFeature.tokenization()).isNull()
        assertThat(ruleFeature.achReceipt()).isNull()
        assertThat(ruleFeature.cardTransaction()).isNull()
        assertThat(ruleFeature.achPayment()).isEqualTo(achPayment)
        assertThat(ruleFeature.externalBankAccount()).isNull()
        assertThat(ruleFeature.card()).isNull()
        assertThat(ruleFeature.accountHolder()).isNull()
        assertThat(ruleFeature.ipMetadata()).isNull()
        assertThat(ruleFeature.spendVelocity()).isNull()
        assertThat(ruleFeature.paymentVelocity()).isNull()
        assertThat(ruleFeature.transactionHistorySignals()).isNull()
        assertThat(ruleFeature.consecutiveDeclines()).isNull()
        assertThat(ruleFeature.achPaymentHistory()).isNull()
    }

    @Test
    fun ofAchPaymentRoundtrip() {
        val jsonMapper = jsonMapper()
        val ruleFeature =
            RuleFeature.ofAchPayment(
                RuleFeature.AchPaymentFeature.builder()
                    .type(RuleFeature.AchPaymentFeature.Type.ACH_PAYMENT)
                    .name("name")
                    .build()
            )

        val roundtrippedRuleFeature =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(ruleFeature),
                jacksonTypeRef<RuleFeature>(),
            )

        assertThat(roundtrippedRuleFeature).isEqualTo(ruleFeature)
    }

    @Test
    fun ofExternalBankAccount() {
        val externalBankAccount =
            RuleFeature.ExternalBankAccountFeature.builder()
                .type(RuleFeature.ExternalBankAccountFeature.Type.EXTERNAL_BANK_ACCOUNT)
                .name("name")
                .build()

        val ruleFeature = RuleFeature.ofExternalBankAccount(externalBankAccount)

        assertThat(ruleFeature.authorization()).isNull()
        assertThat(ruleFeature.authentication()).isNull()
        assertThat(ruleFeature.tokenization()).isNull()
        assertThat(ruleFeature.achReceipt()).isNull()
        assertThat(ruleFeature.cardTransaction()).isNull()
        assertThat(ruleFeature.achPayment()).isNull()
        assertThat(ruleFeature.externalBankAccount()).isEqualTo(externalBankAccount)
        assertThat(ruleFeature.card()).isNull()
        assertThat(ruleFeature.accountHolder()).isNull()
        assertThat(ruleFeature.ipMetadata()).isNull()
        assertThat(ruleFeature.spendVelocity()).isNull()
        assertThat(ruleFeature.paymentVelocity()).isNull()
        assertThat(ruleFeature.transactionHistorySignals()).isNull()
        assertThat(ruleFeature.consecutiveDeclines()).isNull()
        assertThat(ruleFeature.achPaymentHistory()).isNull()
    }

    @Test
    fun ofExternalBankAccountRoundtrip() {
        val jsonMapper = jsonMapper()
        val ruleFeature =
            RuleFeature.ofExternalBankAccount(
                RuleFeature.ExternalBankAccountFeature.builder()
                    .type(RuleFeature.ExternalBankAccountFeature.Type.EXTERNAL_BANK_ACCOUNT)
                    .name("name")
                    .build()
            )

        val roundtrippedRuleFeature =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(ruleFeature),
                jacksonTypeRef<RuleFeature>(),
            )

        assertThat(roundtrippedRuleFeature).isEqualTo(ruleFeature)
    }

    @Test
    fun ofCard() {
        val card =
            RuleFeature.CardFeature.builder()
                .type(RuleFeature.CardFeature.Type.CARD)
                .name("name")
                .build()

        val ruleFeature = RuleFeature.ofCard(card)

        assertThat(ruleFeature.authorization()).isNull()
        assertThat(ruleFeature.authentication()).isNull()
        assertThat(ruleFeature.tokenization()).isNull()
        assertThat(ruleFeature.achReceipt()).isNull()
        assertThat(ruleFeature.cardTransaction()).isNull()
        assertThat(ruleFeature.achPayment()).isNull()
        assertThat(ruleFeature.externalBankAccount()).isNull()
        assertThat(ruleFeature.card()).isEqualTo(card)
        assertThat(ruleFeature.accountHolder()).isNull()
        assertThat(ruleFeature.ipMetadata()).isNull()
        assertThat(ruleFeature.spendVelocity()).isNull()
        assertThat(ruleFeature.paymentVelocity()).isNull()
        assertThat(ruleFeature.transactionHistorySignals()).isNull()
        assertThat(ruleFeature.consecutiveDeclines()).isNull()
        assertThat(ruleFeature.achPaymentHistory()).isNull()
    }

    @Test
    fun ofCardRoundtrip() {
        val jsonMapper = jsonMapper()
        val ruleFeature =
            RuleFeature.ofCard(
                RuleFeature.CardFeature.builder()
                    .type(RuleFeature.CardFeature.Type.CARD)
                    .name("name")
                    .build()
            )

        val roundtrippedRuleFeature =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(ruleFeature),
                jacksonTypeRef<RuleFeature>(),
            )

        assertThat(roundtrippedRuleFeature).isEqualTo(ruleFeature)
    }

    @Test
    fun ofAccountHolder() {
        val accountHolder =
            RuleFeature.AccountHolderFeature.builder()
                .type(RuleFeature.AccountHolderFeature.Type.ACCOUNT_HOLDER)
                .name("name")
                .build()

        val ruleFeature = RuleFeature.ofAccountHolder(accountHolder)

        assertThat(ruleFeature.authorization()).isNull()
        assertThat(ruleFeature.authentication()).isNull()
        assertThat(ruleFeature.tokenization()).isNull()
        assertThat(ruleFeature.achReceipt()).isNull()
        assertThat(ruleFeature.cardTransaction()).isNull()
        assertThat(ruleFeature.achPayment()).isNull()
        assertThat(ruleFeature.externalBankAccount()).isNull()
        assertThat(ruleFeature.card()).isNull()
        assertThat(ruleFeature.accountHolder()).isEqualTo(accountHolder)
        assertThat(ruleFeature.ipMetadata()).isNull()
        assertThat(ruleFeature.spendVelocity()).isNull()
        assertThat(ruleFeature.paymentVelocity()).isNull()
        assertThat(ruleFeature.transactionHistorySignals()).isNull()
        assertThat(ruleFeature.consecutiveDeclines()).isNull()
        assertThat(ruleFeature.achPaymentHistory()).isNull()
    }

    @Test
    fun ofAccountHolderRoundtrip() {
        val jsonMapper = jsonMapper()
        val ruleFeature =
            RuleFeature.ofAccountHolder(
                RuleFeature.AccountHolderFeature.builder()
                    .type(RuleFeature.AccountHolderFeature.Type.ACCOUNT_HOLDER)
                    .name("name")
                    .build()
            )

        val roundtrippedRuleFeature =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(ruleFeature),
                jacksonTypeRef<RuleFeature>(),
            )

        assertThat(roundtrippedRuleFeature).isEqualTo(ruleFeature)
    }

    @Test
    fun ofIpMetadata() {
        val ipMetadata =
            RuleFeature.IpMetadataFeature.builder()
                .type(RuleFeature.IpMetadataFeature.Type.IP_METADATA)
                .name("name")
                .build()

        val ruleFeature = RuleFeature.ofIpMetadata(ipMetadata)

        assertThat(ruleFeature.authorization()).isNull()
        assertThat(ruleFeature.authentication()).isNull()
        assertThat(ruleFeature.tokenization()).isNull()
        assertThat(ruleFeature.achReceipt()).isNull()
        assertThat(ruleFeature.cardTransaction()).isNull()
        assertThat(ruleFeature.achPayment()).isNull()
        assertThat(ruleFeature.externalBankAccount()).isNull()
        assertThat(ruleFeature.card()).isNull()
        assertThat(ruleFeature.accountHolder()).isNull()
        assertThat(ruleFeature.ipMetadata()).isEqualTo(ipMetadata)
        assertThat(ruleFeature.spendVelocity()).isNull()
        assertThat(ruleFeature.paymentVelocity()).isNull()
        assertThat(ruleFeature.transactionHistorySignals()).isNull()
        assertThat(ruleFeature.consecutiveDeclines()).isNull()
        assertThat(ruleFeature.achPaymentHistory()).isNull()
    }

    @Test
    fun ofIpMetadataRoundtrip() {
        val jsonMapper = jsonMapper()
        val ruleFeature =
            RuleFeature.ofIpMetadata(
                RuleFeature.IpMetadataFeature.builder()
                    .type(RuleFeature.IpMetadataFeature.Type.IP_METADATA)
                    .name("name")
                    .build()
            )

        val roundtrippedRuleFeature =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(ruleFeature),
                jacksonTypeRef<RuleFeature>(),
            )

        assertThat(roundtrippedRuleFeature).isEqualTo(ruleFeature)
    }

    @Test
    fun ofSpendVelocity() {
        val spendVelocity =
            RuleFeature.SpendVelocityFeature.builder()
                .period(
                    VelocityLimitPeriod.TrailingWindowObject.builder()
                        .duration(10L)
                        .type(VelocityLimitPeriod.TrailingWindowObject.Type.CUSTOM)
                        .build()
                )
                .scope(RuleFeature.SpendVelocityFeature.VelocityScope.CARD)
                .type(RuleFeature.SpendVelocityFeature.Type.SPEND_VELOCITY)
                .filters(
                    VelocityLimitFilters.builder()
                        .addExcludeCountry("USD")
                        .addExcludeMcc("5542")
                        .addIncludeCountry("USD")
                        .addIncludeMcc("5542")
                        .addIncludePanEntryMode(VelocityLimitFilters.IncludePanEntryMode.AUTO_ENTRY)
                        .build()
                )
                .name("name")
                .build()

        val ruleFeature = RuleFeature.ofSpendVelocity(spendVelocity)

        assertThat(ruleFeature.authorization()).isNull()
        assertThat(ruleFeature.authentication()).isNull()
        assertThat(ruleFeature.tokenization()).isNull()
        assertThat(ruleFeature.achReceipt()).isNull()
        assertThat(ruleFeature.cardTransaction()).isNull()
        assertThat(ruleFeature.achPayment()).isNull()
        assertThat(ruleFeature.externalBankAccount()).isNull()
        assertThat(ruleFeature.card()).isNull()
        assertThat(ruleFeature.accountHolder()).isNull()
        assertThat(ruleFeature.ipMetadata()).isNull()
        assertThat(ruleFeature.spendVelocity()).isEqualTo(spendVelocity)
        assertThat(ruleFeature.paymentVelocity()).isNull()
        assertThat(ruleFeature.transactionHistorySignals()).isNull()
        assertThat(ruleFeature.consecutiveDeclines()).isNull()
        assertThat(ruleFeature.achPaymentHistory()).isNull()
    }

    @Test
    fun ofSpendVelocityRoundtrip() {
        val jsonMapper = jsonMapper()
        val ruleFeature =
            RuleFeature.ofSpendVelocity(
                RuleFeature.SpendVelocityFeature.builder()
                    .period(
                        VelocityLimitPeriod.TrailingWindowObject.builder()
                            .duration(10L)
                            .type(VelocityLimitPeriod.TrailingWindowObject.Type.CUSTOM)
                            .build()
                    )
                    .scope(RuleFeature.SpendVelocityFeature.VelocityScope.CARD)
                    .type(RuleFeature.SpendVelocityFeature.Type.SPEND_VELOCITY)
                    .filters(
                        VelocityLimitFilters.builder()
                            .addExcludeCountry("USD")
                            .addExcludeMcc("5542")
                            .addIncludeCountry("USD")
                            .addIncludeMcc("5542")
                            .addIncludePanEntryMode(
                                VelocityLimitFilters.IncludePanEntryMode.AUTO_ENTRY
                            )
                            .build()
                    )
                    .name("name")
                    .build()
            )

        val roundtrippedRuleFeature =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(ruleFeature),
                jacksonTypeRef<RuleFeature>(),
            )

        assertThat(roundtrippedRuleFeature).isEqualTo(ruleFeature)
    }

    @Test
    fun ofPaymentVelocity() {
        val paymentVelocity =
            RuleFeature.PaymentVelocityFeature.builder()
                .period(
                    VelocityLimitPeriod.TrailingWindowObject.builder()
                        .duration(10L)
                        .type(VelocityLimitPeriod.TrailingWindowObject.Type.CUSTOM)
                        .build()
                )
                .scope(RuleFeature.PaymentVelocityFeature.Scope.FINANCIAL_ACCOUNT)
                .type(RuleFeature.PaymentVelocityFeature.Type.PAYMENT_VELOCITY)
                .filters(
                    RuleFeature.PaymentVelocityFeature.PaymentVelocityFilters.builder()
                        .excludeTags(
                            RuleFeature.PaymentVelocityFeature.PaymentVelocityFilters.ExcludeTags
                                .builder()
                                .putAdditionalProperty("foo", JsonValue.from("string"))
                                .build()
                        )
                        .addIncludePaymentType(
                            RuleFeature.PaymentVelocityFeature.PaymentVelocityFilters
                                .IncludePaymentType
                                .ORIGINATION
                        )
                        .addIncludePolarity(
                            RuleFeature.PaymentVelocityFeature.PaymentVelocityFilters
                                .IncludePolarity
                                .CREDIT
                        )
                        .addIncludeStatus(
                            RuleFeature.PaymentVelocityFeature.PaymentVelocityFilters.IncludeStatus
                                .PENDING
                        )
                        .includeTags(
                            RuleFeature.PaymentVelocityFeature.PaymentVelocityFilters.IncludeTags
                                .builder()
                                .putAdditionalProperty("foo", JsonValue.from("string"))
                                .build()
                        )
                        .result(
                            RuleFeature.PaymentVelocityFeature.PaymentVelocityFilters.Result
                                .APPROVED
                        )
                        .build()
                )
                .name("name")
                .build()

        val ruleFeature = RuleFeature.ofPaymentVelocity(paymentVelocity)

        assertThat(ruleFeature.authorization()).isNull()
        assertThat(ruleFeature.authentication()).isNull()
        assertThat(ruleFeature.tokenization()).isNull()
        assertThat(ruleFeature.achReceipt()).isNull()
        assertThat(ruleFeature.cardTransaction()).isNull()
        assertThat(ruleFeature.achPayment()).isNull()
        assertThat(ruleFeature.externalBankAccount()).isNull()
        assertThat(ruleFeature.card()).isNull()
        assertThat(ruleFeature.accountHolder()).isNull()
        assertThat(ruleFeature.ipMetadata()).isNull()
        assertThat(ruleFeature.spendVelocity()).isNull()
        assertThat(ruleFeature.paymentVelocity()).isEqualTo(paymentVelocity)
        assertThat(ruleFeature.transactionHistorySignals()).isNull()
        assertThat(ruleFeature.consecutiveDeclines()).isNull()
        assertThat(ruleFeature.achPaymentHistory()).isNull()
    }

    @Test
    fun ofPaymentVelocityRoundtrip() {
        val jsonMapper = jsonMapper()
        val ruleFeature =
            RuleFeature.ofPaymentVelocity(
                RuleFeature.PaymentVelocityFeature.builder()
                    .period(
                        VelocityLimitPeriod.TrailingWindowObject.builder()
                            .duration(10L)
                            .type(VelocityLimitPeriod.TrailingWindowObject.Type.CUSTOM)
                            .build()
                    )
                    .scope(RuleFeature.PaymentVelocityFeature.Scope.FINANCIAL_ACCOUNT)
                    .type(RuleFeature.PaymentVelocityFeature.Type.PAYMENT_VELOCITY)
                    .filters(
                        RuleFeature.PaymentVelocityFeature.PaymentVelocityFilters.builder()
                            .excludeTags(
                                RuleFeature.PaymentVelocityFeature.PaymentVelocityFilters
                                    .ExcludeTags
                                    .builder()
                                    .putAdditionalProperty("foo", JsonValue.from("string"))
                                    .build()
                            )
                            .addIncludePaymentType(
                                RuleFeature.PaymentVelocityFeature.PaymentVelocityFilters
                                    .IncludePaymentType
                                    .ORIGINATION
                            )
                            .addIncludePolarity(
                                RuleFeature.PaymentVelocityFeature.PaymentVelocityFilters
                                    .IncludePolarity
                                    .CREDIT
                            )
                            .addIncludeStatus(
                                RuleFeature.PaymentVelocityFeature.PaymentVelocityFilters
                                    .IncludeStatus
                                    .PENDING
                            )
                            .includeTags(
                                RuleFeature.PaymentVelocityFeature.PaymentVelocityFilters
                                    .IncludeTags
                                    .builder()
                                    .putAdditionalProperty("foo", JsonValue.from("string"))
                                    .build()
                            )
                            .result(
                                RuleFeature.PaymentVelocityFeature.PaymentVelocityFilters.Result
                                    .APPROVED
                            )
                            .build()
                    )
                    .name("name")
                    .build()
            )

        val roundtrippedRuleFeature =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(ruleFeature),
                jacksonTypeRef<RuleFeature>(),
            )

        assertThat(roundtrippedRuleFeature).isEqualTo(ruleFeature)
    }

    @Test
    fun ofTransactionHistorySignals() {
        val transactionHistorySignals =
            RuleFeature.TransactionHistorySignalsFeature.builder()
                .scope(RuleFeature.TransactionHistorySignalsFeature.Scope.CARD)
                .type(RuleFeature.TransactionHistorySignalsFeature.Type.TRANSACTION_HISTORY_SIGNALS)
                .name("name")
                .build()

        val ruleFeature = RuleFeature.ofTransactionHistorySignals(transactionHistorySignals)

        assertThat(ruleFeature.authorization()).isNull()
        assertThat(ruleFeature.authentication()).isNull()
        assertThat(ruleFeature.tokenization()).isNull()
        assertThat(ruleFeature.achReceipt()).isNull()
        assertThat(ruleFeature.cardTransaction()).isNull()
        assertThat(ruleFeature.achPayment()).isNull()
        assertThat(ruleFeature.externalBankAccount()).isNull()
        assertThat(ruleFeature.card()).isNull()
        assertThat(ruleFeature.accountHolder()).isNull()
        assertThat(ruleFeature.ipMetadata()).isNull()
        assertThat(ruleFeature.spendVelocity()).isNull()
        assertThat(ruleFeature.paymentVelocity()).isNull()
        assertThat(ruleFeature.transactionHistorySignals()).isEqualTo(transactionHistorySignals)
        assertThat(ruleFeature.consecutiveDeclines()).isNull()
        assertThat(ruleFeature.achPaymentHistory()).isNull()
    }

    @Test
    fun ofTransactionHistorySignalsRoundtrip() {
        val jsonMapper = jsonMapper()
        val ruleFeature =
            RuleFeature.ofTransactionHistorySignals(
                RuleFeature.TransactionHistorySignalsFeature.builder()
                    .scope(RuleFeature.TransactionHistorySignalsFeature.Scope.CARD)
                    .type(
                        RuleFeature.TransactionHistorySignalsFeature.Type
                            .TRANSACTION_HISTORY_SIGNALS
                    )
                    .name("name")
                    .build()
            )

        val roundtrippedRuleFeature =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(ruleFeature),
                jacksonTypeRef<RuleFeature>(),
            )

        assertThat(roundtrippedRuleFeature).isEqualTo(ruleFeature)
    }

    @Test
    fun ofConsecutiveDeclines() {
        val consecutiveDeclines =
            RuleFeature.ConsecutiveDeclinesFeature.builder()
                .scope(RuleFeature.ConsecutiveDeclinesFeature.Scope.CARD)
                .type(RuleFeature.ConsecutiveDeclinesFeature.Type.CONSECUTIVE_DECLINES)
                .name("name")
                .build()

        val ruleFeature = RuleFeature.ofConsecutiveDeclines(consecutiveDeclines)

        assertThat(ruleFeature.authorization()).isNull()
        assertThat(ruleFeature.authentication()).isNull()
        assertThat(ruleFeature.tokenization()).isNull()
        assertThat(ruleFeature.achReceipt()).isNull()
        assertThat(ruleFeature.cardTransaction()).isNull()
        assertThat(ruleFeature.achPayment()).isNull()
        assertThat(ruleFeature.externalBankAccount()).isNull()
        assertThat(ruleFeature.card()).isNull()
        assertThat(ruleFeature.accountHolder()).isNull()
        assertThat(ruleFeature.ipMetadata()).isNull()
        assertThat(ruleFeature.spendVelocity()).isNull()
        assertThat(ruleFeature.paymentVelocity()).isNull()
        assertThat(ruleFeature.transactionHistorySignals()).isNull()
        assertThat(ruleFeature.consecutiveDeclines()).isEqualTo(consecutiveDeclines)
        assertThat(ruleFeature.achPaymentHistory()).isNull()
    }

    @Test
    fun ofConsecutiveDeclinesRoundtrip() {
        val jsonMapper = jsonMapper()
        val ruleFeature =
            RuleFeature.ofConsecutiveDeclines(
                RuleFeature.ConsecutiveDeclinesFeature.builder()
                    .scope(RuleFeature.ConsecutiveDeclinesFeature.Scope.CARD)
                    .type(RuleFeature.ConsecutiveDeclinesFeature.Type.CONSECUTIVE_DECLINES)
                    .name("name")
                    .build()
            )

        val roundtrippedRuleFeature =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(ruleFeature),
                jacksonTypeRef<RuleFeature>(),
            )

        assertThat(roundtrippedRuleFeature).isEqualTo(ruleFeature)
    }

    @Test
    fun ofAchPaymentHistory() {
        val achPaymentHistory =
            RuleFeature.AchPaymentHistoryFeature.builder()
                .scope(RuleFeature.AchPaymentHistoryFeature.Scope.FINANCIAL_ACCOUNT)
                .type(RuleFeature.AchPaymentHistoryFeature.Type.ACH_PAYMENT_HISTORY)
                .name("name")
                .build()

        val ruleFeature = RuleFeature.ofAchPaymentHistory(achPaymentHistory)

        assertThat(ruleFeature.authorization()).isNull()
        assertThat(ruleFeature.authentication()).isNull()
        assertThat(ruleFeature.tokenization()).isNull()
        assertThat(ruleFeature.achReceipt()).isNull()
        assertThat(ruleFeature.cardTransaction()).isNull()
        assertThat(ruleFeature.achPayment()).isNull()
        assertThat(ruleFeature.externalBankAccount()).isNull()
        assertThat(ruleFeature.card()).isNull()
        assertThat(ruleFeature.accountHolder()).isNull()
        assertThat(ruleFeature.ipMetadata()).isNull()
        assertThat(ruleFeature.spendVelocity()).isNull()
        assertThat(ruleFeature.paymentVelocity()).isNull()
        assertThat(ruleFeature.transactionHistorySignals()).isNull()
        assertThat(ruleFeature.consecutiveDeclines()).isNull()
        assertThat(ruleFeature.achPaymentHistory()).isEqualTo(achPaymentHistory)
    }

    @Test
    fun ofAchPaymentHistoryRoundtrip() {
        val jsonMapper = jsonMapper()
        val ruleFeature =
            RuleFeature.ofAchPaymentHistory(
                RuleFeature.AchPaymentHistoryFeature.builder()
                    .scope(RuleFeature.AchPaymentHistoryFeature.Scope.FINANCIAL_ACCOUNT)
                    .type(RuleFeature.AchPaymentHistoryFeature.Type.ACH_PAYMENT_HISTORY)
                    .name("name")
                    .build()
            )

        val roundtrippedRuleFeature =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(ruleFeature),
                jacksonTypeRef<RuleFeature>(),
            )

        assertThat(roundtrippedRuleFeature).isEqualTo(ruleFeature)
    }

    enum class IncompatibleJsonShapeTestCase(val value: JsonValue) {
        BOOLEAN(JsonValue.from(false)),
        STRING(JsonValue.from("invalid")),
        INTEGER(JsonValue.from(-1)),
        FLOAT(JsonValue.from(3.14)),
        ARRAY(JsonValue.from(listOf("invalid", "array"))),
    }

    @ParameterizedTest
    @EnumSource
    fun incompatibleJsonShapeDeserializesToUnknown(testCase: IncompatibleJsonShapeTestCase) {
        val ruleFeature = jsonMapper().convertValue(testCase.value, jacksonTypeRef<RuleFeature>())

        val e = assertThrows<LithicInvalidDataException> { ruleFeature.validate() }
        assertThat(e).hasMessageStartingWith("Unknown ")
    }
}
