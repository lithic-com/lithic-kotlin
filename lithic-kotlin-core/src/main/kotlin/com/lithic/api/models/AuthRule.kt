// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.lithic.api.core.Enum
import com.lithic.api.core.ExcludeMissing
import com.lithic.api.core.JsonField
import com.lithic.api.core.JsonMissing
import com.lithic.api.core.JsonValue
import com.lithic.api.core.NoAutoDetect
import com.lithic.api.core.toImmutable
import com.lithic.api.errors.LithicInvalidDataException
import java.util.Objects

@JsonDeserialize(builder = AuthRule.Builder::class)
@NoAutoDetect
class AuthRule
private constructor(
    private val accountTokens: JsonField<List<String>>,
    private val allowedCountries: JsonField<List<String>>,
    private val allowedMcc: JsonField<List<String>>,
    private val blockedCountries: JsonField<List<String>>,
    private val blockedMcc: JsonField<List<String>>,
    private val cardTokens: JsonField<List<String>>,
    private val programLevel: JsonField<Boolean>,
    private val state: JsonField<State>,
    private val token: JsonField<String>,
    private val additionalProperties: Map<String, JsonValue>,
) {

    private var validated: Boolean = false

    /**
     * Array of account_token(s) identifying the accounts that the Auth Rule applies to. Note that
     * only this field or `card_tokens` can be provided for a given Auth Rule.
     */
    fun accountTokens(): List<String>? = accountTokens.getNullable("account_tokens")

    /**
     * Countries in which the Auth Rule permits transactions. Note that Lithic maintains a list of
     * countries in which all transactions are blocked; "allowing" those countries in an Auth Rule
     * does not override the Lithic-wide restrictions.
     */
    fun allowedCountries(): List<String>? = allowedCountries.getNullable("allowed_countries")

    /** Merchant category codes for which the Auth Rule permits transactions. */
    fun allowedMcc(): List<String>? = allowedMcc.getNullable("allowed_mcc")

    /** Countries in which the Auth Rule automatically declines transactions. */
    fun blockedCountries(): List<String>? = blockedCountries.getNullable("blocked_countries")

    /** Merchant category codes for which the Auth Rule automatically declines transactions. */
    fun blockedMcc(): List<String>? = blockedMcc.getNullable("blocked_mcc")

    /**
     * Array of card_token(s) identifying the cards that the Auth Rule applies to. Note that only
     * this field or `account_tokens` can be provided for a given Auth Rule.
     */
    fun cardTokens(): List<String>? = cardTokens.getNullable("card_tokens")

    /** Boolean indicating whether the Auth Rule is applied at the program level. */
    fun programLevel(): Boolean? = programLevel.getNullable("program_level")

    /** Indicates whether the Auth Rule is ACTIVE or INACTIVE */
    fun state(): State = state.getRequired("state")

    /** Globally unique identifier. */
    fun token(): String = token.getRequired("token")

    /**
     * Array of account_token(s) identifying the accounts that the Auth Rule applies to. Note that
     * only this field or `card_tokens` can be provided for a given Auth Rule.
     */
    @JsonProperty("account_tokens") @ExcludeMissing fun _accountTokens() = accountTokens

    /**
     * Countries in which the Auth Rule permits transactions. Note that Lithic maintains a list of
     * countries in which all transactions are blocked; "allowing" those countries in an Auth Rule
     * does not override the Lithic-wide restrictions.
     */
    @JsonProperty("allowed_countries") @ExcludeMissing fun _allowedCountries() = allowedCountries

    /** Merchant category codes for which the Auth Rule permits transactions. */
    @JsonProperty("allowed_mcc") @ExcludeMissing fun _allowedMcc() = allowedMcc

    /** Countries in which the Auth Rule automatically declines transactions. */
    @JsonProperty("blocked_countries") @ExcludeMissing fun _blockedCountries() = blockedCountries

    /** Merchant category codes for which the Auth Rule automatically declines transactions. */
    @JsonProperty("blocked_mcc") @ExcludeMissing fun _blockedMcc() = blockedMcc

    /**
     * Array of card_token(s) identifying the cards that the Auth Rule applies to. Note that only
     * this field or `account_tokens` can be provided for a given Auth Rule.
     */
    @JsonProperty("card_tokens") @ExcludeMissing fun _cardTokens() = cardTokens

    /** Boolean indicating whether the Auth Rule is applied at the program level. */
    @JsonProperty("program_level") @ExcludeMissing fun _programLevel() = programLevel

    /** Indicates whether the Auth Rule is ACTIVE or INACTIVE */
    @JsonProperty("state") @ExcludeMissing fun _state() = state

    /** Globally unique identifier. */
    @JsonProperty("token") @ExcludeMissing fun _token() = token

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    fun validate(): AuthRule = apply {
        if (!validated) {
            accountTokens()
            allowedCountries()
            allowedMcc()
            blockedCountries()
            blockedMcc()
            cardTokens()
            programLevel()
            state()
            token()
            validated = true
        }
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        fun builder() = Builder()
    }

    class Builder {

        private var accountTokens: JsonField<List<String>> = JsonMissing.of()
        private var allowedCountries: JsonField<List<String>> = JsonMissing.of()
        private var allowedMcc: JsonField<List<String>> = JsonMissing.of()
        private var blockedCountries: JsonField<List<String>> = JsonMissing.of()
        private var blockedMcc: JsonField<List<String>> = JsonMissing.of()
        private var cardTokens: JsonField<List<String>> = JsonMissing.of()
        private var programLevel: JsonField<Boolean> = JsonMissing.of()
        private var state: JsonField<State> = JsonMissing.of()
        private var token: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(authRule: AuthRule) = apply {
            this.accountTokens = authRule.accountTokens
            this.allowedCountries = authRule.allowedCountries
            this.allowedMcc = authRule.allowedMcc
            this.blockedCountries = authRule.blockedCountries
            this.blockedMcc = authRule.blockedMcc
            this.cardTokens = authRule.cardTokens
            this.programLevel = authRule.programLevel
            this.state = authRule.state
            this.token = authRule.token
            additionalProperties(authRule.additionalProperties)
        }

        /**
         * Array of account_token(s) identifying the accounts that the Auth Rule applies to. Note
         * that only this field or `card_tokens` can be provided for a given Auth Rule.
         */
        fun accountTokens(accountTokens: List<String>) = accountTokens(JsonField.of(accountTokens))

        /**
         * Array of account_token(s) identifying the accounts that the Auth Rule applies to. Note
         * that only this field or `card_tokens` can be provided for a given Auth Rule.
         */
        @JsonProperty("account_tokens")
        @ExcludeMissing
        fun accountTokens(accountTokens: JsonField<List<String>>) = apply {
            this.accountTokens = accountTokens
        }

        /**
         * Countries in which the Auth Rule permits transactions. Note that Lithic maintains a list
         * of countries in which all transactions are blocked; "allowing" those countries in an Auth
         * Rule does not override the Lithic-wide restrictions.
         */
        fun allowedCountries(allowedCountries: List<String>) =
            allowedCountries(JsonField.of(allowedCountries))

        /**
         * Countries in which the Auth Rule permits transactions. Note that Lithic maintains a list
         * of countries in which all transactions are blocked; "allowing" those countries in an Auth
         * Rule does not override the Lithic-wide restrictions.
         */
        @JsonProperty("allowed_countries")
        @ExcludeMissing
        fun allowedCountries(allowedCountries: JsonField<List<String>>) = apply {
            this.allowedCountries = allowedCountries
        }

        /** Merchant category codes for which the Auth Rule permits transactions. */
        fun allowedMcc(allowedMcc: List<String>) = allowedMcc(JsonField.of(allowedMcc))

        /** Merchant category codes for which the Auth Rule permits transactions. */
        @JsonProperty("allowed_mcc")
        @ExcludeMissing
        fun allowedMcc(allowedMcc: JsonField<List<String>>) = apply { this.allowedMcc = allowedMcc }

        /** Countries in which the Auth Rule automatically declines transactions. */
        fun blockedCountries(blockedCountries: List<String>) =
            blockedCountries(JsonField.of(blockedCountries))

        /** Countries in which the Auth Rule automatically declines transactions. */
        @JsonProperty("blocked_countries")
        @ExcludeMissing
        fun blockedCountries(blockedCountries: JsonField<List<String>>) = apply {
            this.blockedCountries = blockedCountries
        }

        /** Merchant category codes for which the Auth Rule automatically declines transactions. */
        fun blockedMcc(blockedMcc: List<String>) = blockedMcc(JsonField.of(blockedMcc))

        /** Merchant category codes for which the Auth Rule automatically declines transactions. */
        @JsonProperty("blocked_mcc")
        @ExcludeMissing
        fun blockedMcc(blockedMcc: JsonField<List<String>>) = apply { this.blockedMcc = blockedMcc }

        /**
         * Array of card_token(s) identifying the cards that the Auth Rule applies to. Note that
         * only this field or `account_tokens` can be provided for a given Auth Rule.
         */
        fun cardTokens(cardTokens: List<String>) = cardTokens(JsonField.of(cardTokens))

        /**
         * Array of card_token(s) identifying the cards that the Auth Rule applies to. Note that
         * only this field or `account_tokens` can be provided for a given Auth Rule.
         */
        @JsonProperty("card_tokens")
        @ExcludeMissing
        fun cardTokens(cardTokens: JsonField<List<String>>) = apply { this.cardTokens = cardTokens }

        /** Boolean indicating whether the Auth Rule is applied at the program level. */
        fun programLevel(programLevel: Boolean) = programLevel(JsonField.of(programLevel))

        /** Boolean indicating whether the Auth Rule is applied at the program level. */
        @JsonProperty("program_level")
        @ExcludeMissing
        fun programLevel(programLevel: JsonField<Boolean>) = apply {
            this.programLevel = programLevel
        }

        /** Indicates whether the Auth Rule is ACTIVE or INACTIVE */
        fun state(state: State) = state(JsonField.of(state))

        /** Indicates whether the Auth Rule is ACTIVE or INACTIVE */
        @JsonProperty("state")
        @ExcludeMissing
        fun state(state: JsonField<State>) = apply { this.state = state }

        /** Globally unique identifier. */
        fun token(token: String) = token(JsonField.of(token))

        /** Globally unique identifier. */
        @JsonProperty("token")
        @ExcludeMissing
        fun token(token: JsonField<String>) = apply { this.token = token }

        fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
            this.additionalProperties.clear()
            this.additionalProperties.putAll(additionalProperties)
        }

        @JsonAnySetter
        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
            this.additionalProperties.put(key, value)
        }

        fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
            this.additionalProperties.putAll(additionalProperties)
        }

        fun build(): AuthRule =
            AuthRule(
                accountTokens.map { it.toImmutable() },
                allowedCountries.map { it.toImmutable() },
                allowedMcc.map { it.toImmutable() },
                blockedCountries.map { it.toImmutable() },
                blockedMcc.map { it.toImmutable() },
                cardTokens.map { it.toImmutable() },
                programLevel,
                state,
                token,
                additionalProperties.toImmutable(),
            )
    }

    class State
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is State && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()

        companion object {

            val ACTIVE = State(JsonField.of("ACTIVE"))

            val INACTIVE = State(JsonField.of("INACTIVE"))

            fun of(value: String) = State(JsonField.of(value))
        }

        enum class Known {
            ACTIVE,
            INACTIVE,
        }

        enum class Value {
            ACTIVE,
            INACTIVE,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                ACTIVE -> Value.ACTIVE
                INACTIVE -> Value.INACTIVE
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                ACTIVE -> Known.ACTIVE
                INACTIVE -> Known.INACTIVE
                else -> throw LithicInvalidDataException("Unknown State: $value")
            }

        fun asString(): String = _value().asStringOrThrow()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is AuthRule && accountTokens == other.accountTokens && allowedCountries == other.allowedCountries && allowedMcc == other.allowedMcc && blockedCountries == other.blockedCountries && blockedMcc == other.blockedMcc && cardTokens == other.cardTokens && programLevel == other.programLevel && state == other.state && token == other.token && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(accountTokens, allowedCountries, allowedMcc, blockedCountries, blockedMcc, cardTokens, programLevel, state, token, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "AuthRule{accountTokens=$accountTokens, allowedCountries=$allowedCountries, allowedMcc=$allowedMcc, blockedCountries=$blockedCountries, blockedMcc=$blockedMcc, cardTokens=$cardTokens, programLevel=$programLevel, state=$state, token=$token, additionalProperties=$additionalProperties}"
}
