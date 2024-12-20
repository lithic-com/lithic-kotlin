// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.lithic.api.core.Enum
import com.lithic.api.core.ExcludeMissing
import com.lithic.api.core.JsonField
import com.lithic.api.core.JsonMissing
import com.lithic.api.core.JsonValue
import com.lithic.api.core.NoAutoDetect
import com.lithic.api.core.immutableEmptyMap
import com.lithic.api.core.toImmutable
import com.lithic.api.errors.LithicInvalidDataException
import java.util.Objects

@NoAutoDetect
class FinancialAccountCreditConfig
@JsonCreator
private constructor(
    @JsonProperty("account_token")
    @ExcludeMissing
    private val accountToken: JsonField<String> = JsonMissing.of(),
    @JsonProperty("credit_limit")
    @ExcludeMissing
    private val creditLimit: JsonField<Long> = JsonMissing.of(),
    @JsonProperty("external_bank_account_token")
    @ExcludeMissing
    private val externalBankAccountToken: JsonField<String> = JsonMissing.of(),
    @JsonProperty("credit_product_token")
    @ExcludeMissing
    private val creditProductToken: JsonField<String> = JsonMissing.of(),
    @JsonProperty("tier") @ExcludeMissing private val tier: JsonField<String> = JsonMissing.of(),
    @JsonProperty("financial_account_state")
    @ExcludeMissing
    private val financialAccountState: JsonField<FinancialAccountState> = JsonMissing.of(),
    @JsonProperty("is_spend_blocked")
    @ExcludeMissing
    private val isSpendBlocked: JsonField<Boolean> = JsonMissing.of(),
    @JsonProperty("charged_off_reason")
    @ExcludeMissing
    private val chargedOffReason: JsonField<ChargedOffReason> = JsonMissing.of(),
    @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
) {

    /** Globally unique identifier for the account */
    fun accountToken(): String = accountToken.getRequired("account_token")

    fun creditLimit(): Long? = creditLimit.getNullable("credit_limit")

    fun externalBankAccountToken(): String? =
        externalBankAccountToken.getNullable("external_bank_account_token")

    /** Globally unique identifier for the credit product */
    fun creditProductToken(): String? = creditProductToken.getNullable("credit_product_token")

    /** Tier assigned to the financial account */
    fun tier(): String? = tier.getNullable("tier")

    /** State of the financial account */
    fun financialAccountState(): FinancialAccountState =
        financialAccountState.getRequired("financial_account_state")

    fun isSpendBlocked(): Boolean = isSpendBlocked.getRequired("is_spend_blocked")

    /** Reason for the financial account being marked as Charged Off */
    fun chargedOffReason(): ChargedOffReason? = chargedOffReason.getNullable("charged_off_reason")

    /** Globally unique identifier for the account */
    @JsonProperty("account_token") @ExcludeMissing fun _accountToken() = accountToken

    @JsonProperty("credit_limit") @ExcludeMissing fun _creditLimit() = creditLimit

    @JsonProperty("external_bank_account_token")
    @ExcludeMissing
    fun _externalBankAccountToken() = externalBankAccountToken

    /** Globally unique identifier for the credit product */
    @JsonProperty("credit_product_token")
    @ExcludeMissing
    fun _creditProductToken() = creditProductToken

    /** Tier assigned to the financial account */
    @JsonProperty("tier") @ExcludeMissing fun _tier() = tier

    /** State of the financial account */
    @JsonProperty("financial_account_state")
    @ExcludeMissing
    fun _financialAccountState() = financialAccountState

    @JsonProperty("is_spend_blocked") @ExcludeMissing fun _isSpendBlocked() = isSpendBlocked

    /** Reason for the financial account being marked as Charged Off */
    @JsonProperty("charged_off_reason") @ExcludeMissing fun _chargedOffReason() = chargedOffReason

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    private var validated: Boolean = false

    fun validate(): FinancialAccountCreditConfig = apply {
        if (!validated) {
            accountToken()
            creditLimit()
            externalBankAccountToken()
            creditProductToken()
            tier()
            financialAccountState()
            isSpendBlocked()
            chargedOffReason()
            validated = true
        }
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        fun builder() = Builder()
    }

    class Builder {

        private var accountToken: JsonField<String> = JsonMissing.of()
        private var creditLimit: JsonField<Long> = JsonMissing.of()
        private var externalBankAccountToken: JsonField<String> = JsonMissing.of()
        private var creditProductToken: JsonField<String> = JsonMissing.of()
        private var tier: JsonField<String> = JsonMissing.of()
        private var financialAccountState: JsonField<FinancialAccountState> = JsonMissing.of()
        private var isSpendBlocked: JsonField<Boolean> = JsonMissing.of()
        private var chargedOffReason: JsonField<ChargedOffReason> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(financialAccountCreditConfig: FinancialAccountCreditConfig) = apply {
            accountToken = financialAccountCreditConfig.accountToken
            creditLimit = financialAccountCreditConfig.creditLimit
            externalBankAccountToken = financialAccountCreditConfig.externalBankAccountToken
            creditProductToken = financialAccountCreditConfig.creditProductToken
            tier = financialAccountCreditConfig.tier
            financialAccountState = financialAccountCreditConfig.financialAccountState
            isSpendBlocked = financialAccountCreditConfig.isSpendBlocked
            chargedOffReason = financialAccountCreditConfig.chargedOffReason
            additionalProperties = financialAccountCreditConfig.additionalProperties.toMutableMap()
        }

        /** Globally unique identifier for the account */
        fun accountToken(accountToken: String) = accountToken(JsonField.of(accountToken))

        /** Globally unique identifier for the account */
        fun accountToken(accountToken: JsonField<String>) = apply {
            this.accountToken = accountToken
        }

        fun creditLimit(creditLimit: Long) = creditLimit(JsonField.of(creditLimit))

        fun creditLimit(creditLimit: JsonField<Long>) = apply { this.creditLimit = creditLimit }

        fun externalBankAccountToken(externalBankAccountToken: String) =
            externalBankAccountToken(JsonField.of(externalBankAccountToken))

        fun externalBankAccountToken(externalBankAccountToken: JsonField<String>) = apply {
            this.externalBankAccountToken = externalBankAccountToken
        }

        /** Globally unique identifier for the credit product */
        fun creditProductToken(creditProductToken: String) =
            creditProductToken(JsonField.of(creditProductToken))

        /** Globally unique identifier for the credit product */
        fun creditProductToken(creditProductToken: JsonField<String>) = apply {
            this.creditProductToken = creditProductToken
        }

        /** Tier assigned to the financial account */
        fun tier(tier: String) = tier(JsonField.of(tier))

        /** Tier assigned to the financial account */
        fun tier(tier: JsonField<String>) = apply { this.tier = tier }

        /** State of the financial account */
        fun financialAccountState(financialAccountState: FinancialAccountState) =
            financialAccountState(JsonField.of(financialAccountState))

        /** State of the financial account */
        fun financialAccountState(financialAccountState: JsonField<FinancialAccountState>) = apply {
            this.financialAccountState = financialAccountState
        }

        fun isSpendBlocked(isSpendBlocked: Boolean) = isSpendBlocked(JsonField.of(isSpendBlocked))

        fun isSpendBlocked(isSpendBlocked: JsonField<Boolean>) = apply {
            this.isSpendBlocked = isSpendBlocked
        }

        /** Reason for the financial account being marked as Charged Off */
        fun chargedOffReason(chargedOffReason: ChargedOffReason) =
            chargedOffReason(JsonField.of(chargedOffReason))

        /** Reason for the financial account being marked as Charged Off */
        fun chargedOffReason(chargedOffReason: JsonField<ChargedOffReason>) = apply {
            this.chargedOffReason = chargedOffReason
        }

        fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
            this.additionalProperties.clear()
            putAllAdditionalProperties(additionalProperties)
        }

        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
            additionalProperties.put(key, value)
        }

        fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
            this.additionalProperties.putAll(additionalProperties)
        }

        fun removeAdditionalProperty(key: String) = apply { additionalProperties.remove(key) }

        fun removeAllAdditionalProperties(keys: Set<String>) = apply {
            keys.forEach(::removeAdditionalProperty)
        }

        fun build(): FinancialAccountCreditConfig =
            FinancialAccountCreditConfig(
                accountToken,
                creditLimit,
                externalBankAccountToken,
                creditProductToken,
                tier,
                financialAccountState,
                isSpendBlocked,
                chargedOffReason,
                additionalProperties.toImmutable(),
            )
    }

    class ChargedOffReason
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            val DELINQUENT = of("DELINQUENT")

            val FRAUD = of("FRAUD")

            fun of(value: String) = ChargedOffReason(JsonField.of(value))
        }

        enum class Known {
            DELINQUENT,
            FRAUD,
        }

        enum class Value {
            DELINQUENT,
            FRAUD,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                DELINQUENT -> Value.DELINQUENT
                FRAUD -> Value.FRAUD
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                DELINQUENT -> Known.DELINQUENT
                FRAUD -> Known.FRAUD
                else -> throw LithicInvalidDataException("Unknown ChargedOffReason: $value")
            }

        fun asString(): String = _value().asStringOrThrow()

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is ChargedOffReason && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    class FinancialAccountState
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            val PENDING = of("PENDING")

            val CURRENT = of("CURRENT")

            val DELINQUENT = of("DELINQUENT")

            val CHARGED_OFF = of("CHARGED_OFF")

            fun of(value: String) = FinancialAccountState(JsonField.of(value))
        }

        enum class Known {
            PENDING,
            CURRENT,
            DELINQUENT,
            CHARGED_OFF,
        }

        enum class Value {
            PENDING,
            CURRENT,
            DELINQUENT,
            CHARGED_OFF,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                PENDING -> Value.PENDING
                CURRENT -> Value.CURRENT
                DELINQUENT -> Value.DELINQUENT
                CHARGED_OFF -> Value.CHARGED_OFF
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                PENDING -> Known.PENDING
                CURRENT -> Known.CURRENT
                DELINQUENT -> Known.DELINQUENT
                CHARGED_OFF -> Known.CHARGED_OFF
                else -> throw LithicInvalidDataException("Unknown FinancialAccountState: $value")
            }

        fun asString(): String = _value().asStringOrThrow()

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is FinancialAccountState && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is FinancialAccountCreditConfig && accountToken == other.accountToken && creditLimit == other.creditLimit && externalBankAccountToken == other.externalBankAccountToken && creditProductToken == other.creditProductToken && tier == other.tier && financialAccountState == other.financialAccountState && isSpendBlocked == other.isSpendBlocked && chargedOffReason == other.chargedOffReason && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(accountToken, creditLimit, externalBankAccountToken, creditProductToken, tier, financialAccountState, isSpendBlocked, chargedOffReason, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "FinancialAccountCreditConfig{accountToken=$accountToken, creditLimit=$creditLimit, externalBankAccountToken=$externalBankAccountToken, creditProductToken=$creditProductToken, tier=$tier, financialAccountState=$financialAccountState, isSpendBlocked=$isSpendBlocked, chargedOffReason=$chargedOffReason, additionalProperties=$additionalProperties}"
}
