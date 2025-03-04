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
import com.lithic.api.core.checkKnown
import com.lithic.api.core.checkRequired
import com.lithic.api.core.immutableEmptyMap
import com.lithic.api.core.toImmutable
import com.lithic.api.errors.LithicInvalidDataException
import java.util.Objects

@NoAutoDetect
class AuthRule
@JsonCreator
private constructor(
    @JsonProperty("token") @ExcludeMissing private val token: JsonField<String> = JsonMissing.of(),
    @JsonProperty("state") @ExcludeMissing private val state: JsonField<State> = JsonMissing.of(),
    @JsonProperty("account_tokens")
    @ExcludeMissing
    private val accountTokens: JsonField<List<String>> = JsonMissing.of(),
    @JsonProperty("allowed_countries")
    @ExcludeMissing
    private val allowedCountries: JsonField<List<String>> = JsonMissing.of(),
    @JsonProperty("allowed_mcc")
    @ExcludeMissing
    private val allowedMcc: JsonField<List<String>> = JsonMissing.of(),
    @JsonProperty("blocked_countries")
    @ExcludeMissing
    private val blockedCountries: JsonField<List<String>> = JsonMissing.of(),
    @JsonProperty("blocked_mcc")
    @ExcludeMissing
    private val blockedMcc: JsonField<List<String>> = JsonMissing.of(),
    @JsonProperty("card_tokens")
    @ExcludeMissing
    private val cardTokens: JsonField<List<String>> = JsonMissing.of(),
    @JsonProperty("program_level")
    @ExcludeMissing
    private val programLevel: JsonField<Boolean> = JsonMissing.of(),
    @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
) {

    /** Globally unique identifier. */
    fun token(): String = token.getRequired("token")

    /** Indicates whether the Auth Rule is ACTIVE or INACTIVE */
    fun state(): State = state.getRequired("state")

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

    /** Globally unique identifier. */
    @JsonProperty("token") @ExcludeMissing fun _token(): JsonField<String> = token

    /** Indicates whether the Auth Rule is ACTIVE or INACTIVE */
    @JsonProperty("state") @ExcludeMissing fun _state(): JsonField<State> = state

    /**
     * Array of account_token(s) identifying the accounts that the Auth Rule applies to. Note that
     * only this field or `card_tokens` can be provided for a given Auth Rule.
     */
    @JsonProperty("account_tokens")
    @ExcludeMissing
    fun _accountTokens(): JsonField<List<String>> = accountTokens

    /**
     * Countries in which the Auth Rule permits transactions. Note that Lithic maintains a list of
     * countries in which all transactions are blocked; "allowing" those countries in an Auth Rule
     * does not override the Lithic-wide restrictions.
     */
    @JsonProperty("allowed_countries")
    @ExcludeMissing
    fun _allowedCountries(): JsonField<List<String>> = allowedCountries

    /** Merchant category codes for which the Auth Rule permits transactions. */
    @JsonProperty("allowed_mcc")
    @ExcludeMissing
    fun _allowedMcc(): JsonField<List<String>> = allowedMcc

    /** Countries in which the Auth Rule automatically declines transactions. */
    @JsonProperty("blocked_countries")
    @ExcludeMissing
    fun _blockedCountries(): JsonField<List<String>> = blockedCountries

    /** Merchant category codes for which the Auth Rule automatically declines transactions. */
    @JsonProperty("blocked_mcc")
    @ExcludeMissing
    fun _blockedMcc(): JsonField<List<String>> = blockedMcc

    /**
     * Array of card_token(s) identifying the cards that the Auth Rule applies to. Note that only
     * this field or `account_tokens` can be provided for a given Auth Rule.
     */
    @JsonProperty("card_tokens")
    @ExcludeMissing
    fun _cardTokens(): JsonField<List<String>> = cardTokens

    /** Boolean indicating whether the Auth Rule is applied at the program level. */
    @JsonProperty("program_level")
    @ExcludeMissing
    fun _programLevel(): JsonField<Boolean> = programLevel

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    private var validated: Boolean = false

    fun validate(): AuthRule = apply {
        if (validated) {
            return@apply
        }

        token()
        state()
        accountTokens()
        allowedCountries()
        allowedMcc()
        blockedCountries()
        blockedMcc()
        cardTokens()
        programLevel()
        validated = true
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        fun builder() = Builder()
    }

    /** A builder for [AuthRule]. */
    class Builder internal constructor() {

        private var token: JsonField<String>? = null
        private var state: JsonField<State>? = null
        private var accountTokens: JsonField<MutableList<String>>? = null
        private var allowedCountries: JsonField<MutableList<String>>? = null
        private var allowedMcc: JsonField<MutableList<String>>? = null
        private var blockedCountries: JsonField<MutableList<String>>? = null
        private var blockedMcc: JsonField<MutableList<String>>? = null
        private var cardTokens: JsonField<MutableList<String>>? = null
        private var programLevel: JsonField<Boolean> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(authRule: AuthRule) = apply {
            token = authRule.token
            state = authRule.state
            accountTokens = authRule.accountTokens.map { it.toMutableList() }
            allowedCountries = authRule.allowedCountries.map { it.toMutableList() }
            allowedMcc = authRule.allowedMcc.map { it.toMutableList() }
            blockedCountries = authRule.blockedCountries.map { it.toMutableList() }
            blockedMcc = authRule.blockedMcc.map { it.toMutableList() }
            cardTokens = authRule.cardTokens.map { it.toMutableList() }
            programLevel = authRule.programLevel
            additionalProperties = authRule.additionalProperties.toMutableMap()
        }

        /** Globally unique identifier. */
        fun token(token: String) = token(JsonField.of(token))

        /** Globally unique identifier. */
        fun token(token: JsonField<String>) = apply { this.token = token }

        /** Indicates whether the Auth Rule is ACTIVE or INACTIVE */
        fun state(state: State) = state(JsonField.of(state))

        /** Indicates whether the Auth Rule is ACTIVE or INACTIVE */
        fun state(state: JsonField<State>) = apply { this.state = state }

        /**
         * Array of account_token(s) identifying the accounts that the Auth Rule applies to. Note
         * that only this field or `card_tokens` can be provided for a given Auth Rule.
         */
        fun accountTokens(accountTokens: List<String>) = accountTokens(JsonField.of(accountTokens))

        /**
         * Array of account_token(s) identifying the accounts that the Auth Rule applies to. Note
         * that only this field or `card_tokens` can be provided for a given Auth Rule.
         */
        fun accountTokens(accountTokens: JsonField<List<String>>) = apply {
            this.accountTokens = accountTokens.map { it.toMutableList() }
        }

        /**
         * Array of account_token(s) identifying the accounts that the Auth Rule applies to. Note
         * that only this field or `card_tokens` can be provided for a given Auth Rule.
         */
        fun addAccountToken(accountToken: String) = apply {
            accountTokens =
                (accountTokens ?: JsonField.of(mutableListOf())).also {
                    checkKnown("accountTokens", it).add(accountToken)
                }
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
        fun allowedCountries(allowedCountries: JsonField<List<String>>) = apply {
            this.allowedCountries = allowedCountries.map { it.toMutableList() }
        }

        /**
         * Countries in which the Auth Rule permits transactions. Note that Lithic maintains a list
         * of countries in which all transactions are blocked; "allowing" those countries in an Auth
         * Rule does not override the Lithic-wide restrictions.
         */
        fun addAllowedCountry(allowedCountry: String) = apply {
            allowedCountries =
                (allowedCountries ?: JsonField.of(mutableListOf())).also {
                    checkKnown("allowedCountries", it).add(allowedCountry)
                }
        }

        /** Merchant category codes for which the Auth Rule permits transactions. */
        fun allowedMcc(allowedMcc: List<String>) = allowedMcc(JsonField.of(allowedMcc))

        /** Merchant category codes for which the Auth Rule permits transactions. */
        fun allowedMcc(allowedMcc: JsonField<List<String>>) = apply {
            this.allowedMcc = allowedMcc.map { it.toMutableList() }
        }

        /** Merchant category codes for which the Auth Rule permits transactions. */
        fun addAllowedMcc(allowedMcc: String) = apply {
            this.allowedMcc =
                (this.allowedMcc ?: JsonField.of(mutableListOf())).also {
                    checkKnown("allowedMcc", it).add(allowedMcc)
                }
        }

        /** Countries in which the Auth Rule automatically declines transactions. */
        fun blockedCountries(blockedCountries: List<String>) =
            blockedCountries(JsonField.of(blockedCountries))

        /** Countries in which the Auth Rule automatically declines transactions. */
        fun blockedCountries(blockedCountries: JsonField<List<String>>) = apply {
            this.blockedCountries = blockedCountries.map { it.toMutableList() }
        }

        /** Countries in which the Auth Rule automatically declines transactions. */
        fun addBlockedCountry(blockedCountry: String) = apply {
            blockedCountries =
                (blockedCountries ?: JsonField.of(mutableListOf())).also {
                    checkKnown("blockedCountries", it).add(blockedCountry)
                }
        }

        /** Merchant category codes for which the Auth Rule automatically declines transactions. */
        fun blockedMcc(blockedMcc: List<String>) = blockedMcc(JsonField.of(blockedMcc))

        /** Merchant category codes for which the Auth Rule automatically declines transactions. */
        fun blockedMcc(blockedMcc: JsonField<List<String>>) = apply {
            this.blockedMcc = blockedMcc.map { it.toMutableList() }
        }

        /** Merchant category codes for which the Auth Rule automatically declines transactions. */
        fun addBlockedMcc(blockedMcc: String) = apply {
            this.blockedMcc =
                (this.blockedMcc ?: JsonField.of(mutableListOf())).also {
                    checkKnown("blockedMcc", it).add(blockedMcc)
                }
        }

        /**
         * Array of card_token(s) identifying the cards that the Auth Rule applies to. Note that
         * only this field or `account_tokens` can be provided for a given Auth Rule.
         */
        fun cardTokens(cardTokens: List<String>) = cardTokens(JsonField.of(cardTokens))

        /**
         * Array of card_token(s) identifying the cards that the Auth Rule applies to. Note that
         * only this field or `account_tokens` can be provided for a given Auth Rule.
         */
        fun cardTokens(cardTokens: JsonField<List<String>>) = apply {
            this.cardTokens = cardTokens.map { it.toMutableList() }
        }

        /**
         * Array of card_token(s) identifying the cards that the Auth Rule applies to. Note that
         * only this field or `account_tokens` can be provided for a given Auth Rule.
         */
        fun addCardToken(cardToken: String) = apply {
            cardTokens =
                (cardTokens ?: JsonField.of(mutableListOf())).also {
                    checkKnown("cardTokens", it).add(cardToken)
                }
        }

        /** Boolean indicating whether the Auth Rule is applied at the program level. */
        fun programLevel(programLevel: Boolean) = programLevel(JsonField.of(programLevel))

        /** Boolean indicating whether the Auth Rule is applied at the program level. */
        fun programLevel(programLevel: JsonField<Boolean>) = apply {
            this.programLevel = programLevel
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

        fun build(): AuthRule =
            AuthRule(
                checkRequired("token", token),
                checkRequired("state", state),
                (accountTokens ?: JsonMissing.of()).map { it.toImmutable() },
                (allowedCountries ?: JsonMissing.of()).map { it.toImmutable() },
                (allowedMcc ?: JsonMissing.of()).map { it.toImmutable() },
                (blockedCountries ?: JsonMissing.of()).map { it.toImmutable() },
                (blockedMcc ?: JsonMissing.of()).map { it.toImmutable() },
                (cardTokens ?: JsonMissing.of()).map { it.toImmutable() },
                programLevel,
                additionalProperties.toImmutable(),
            )
    }

    /** Indicates whether the Auth Rule is ACTIVE or INACTIVE */
    class State @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

        /**
         * Returns this class instance's raw value.
         *
         * This is usually only useful if this instance was deserialized from data that doesn't
         * match any known member, and you want to know that value. For example, if the SDK is on an
         * older version than the API, then the API may respond with new members that the SDK is
         * unaware of.
         */
        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            val ACTIVE = of("ACTIVE")

            val INACTIVE = of("INACTIVE")

            fun of(value: String) = State(JsonField.of(value))
        }

        /** An enum containing [State]'s known values. */
        enum class Known {
            ACTIVE,
            INACTIVE,
        }

        /**
         * An enum containing [State]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [State] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            ACTIVE,
            INACTIVE,
            /** An enum member indicating that [State] was instantiated with an unknown value. */
            _UNKNOWN,
        }

        /**
         * Returns an enum member corresponding to this class instance's value, or [Value._UNKNOWN]
         * if the class was instantiated with an unknown value.
         *
         * Use the [known] method instead if you're certain the value is always known or if you want
         * to throw for the unknown case.
         */
        fun value(): Value =
            when (this) {
                ACTIVE -> Value.ACTIVE
                INACTIVE -> Value.INACTIVE
                else -> Value._UNKNOWN
            }

        /**
         * Returns an enum member corresponding to this class instance's value.
         *
         * Use the [value] method instead if you're uncertain the value is always known and don't
         * want to throw for the unknown case.
         *
         * @throws LithicInvalidDataException if this class instance's value is a not a known
         *   member.
         */
        fun known(): Known =
            when (this) {
                ACTIVE -> Known.ACTIVE
                INACTIVE -> Known.INACTIVE
                else -> throw LithicInvalidDataException("Unknown State: $value")
            }

        /**
         * Returns this class instance's primitive wire representation.
         *
         * This differs from the [toString] method because that method is primarily for debugging
         * and generally doesn't throw.
         *
         * @throws LithicInvalidDataException if this class instance's value does not have the
         *   expected primitive type.
         */
        fun asString(): String =
            _value().asString() ?: throw LithicInvalidDataException("Value is not a String")

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is State && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is AuthRule && token == other.token && state == other.state && accountTokens == other.accountTokens && allowedCountries == other.allowedCountries && allowedMcc == other.allowedMcc && blockedCountries == other.blockedCountries && blockedMcc == other.blockedMcc && cardTokens == other.cardTokens && programLevel == other.programLevel && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(token, state, accountTokens, allowedCountries, allowedMcc, blockedCountries, blockedMcc, cardTokens, programLevel, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "AuthRule{token=$token, state=$state, accountTokens=$accountTokens, allowedCountries=$allowedCountries, allowedMcc=$allowedMcc, blockedCountries=$blockedCountries, blockedMcc=$blockedMcc, cardTokens=$cardTokens, programLevel=$programLevel, additionalProperties=$additionalProperties}"
}
