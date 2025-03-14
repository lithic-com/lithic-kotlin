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
import com.lithic.api.core.checkRequired
import com.lithic.api.core.immutableEmptyMap
import com.lithic.api.core.toImmutable
import com.lithic.api.errors.LithicInvalidDataException
import java.time.OffsetDateTime
import java.util.Objects

/** Balance of a Financial Account */
@NoAutoDetect
class BalanceListResponse
@JsonCreator
private constructor(
    @JsonProperty("token") @ExcludeMissing private val token: JsonField<String> = JsonMissing.of(),
    @JsonProperty("available_amount")
    @ExcludeMissing
    private val availableAmount: JsonField<Long> = JsonMissing.of(),
    @JsonProperty("created")
    @ExcludeMissing
    private val created: JsonField<OffsetDateTime> = JsonMissing.of(),
    @JsonProperty("currency")
    @ExcludeMissing
    private val currency: JsonField<String> = JsonMissing.of(),
    @JsonProperty("last_transaction_event_token")
    @ExcludeMissing
    private val lastTransactionEventToken: JsonField<String> = JsonMissing.of(),
    @JsonProperty("last_transaction_token")
    @ExcludeMissing
    private val lastTransactionToken: JsonField<String> = JsonMissing.of(),
    @JsonProperty("pending_amount")
    @ExcludeMissing
    private val pendingAmount: JsonField<Long> = JsonMissing.of(),
    @JsonProperty("total_amount")
    @ExcludeMissing
    private val totalAmount: JsonField<Long> = JsonMissing.of(),
    @JsonProperty("type") @ExcludeMissing private val type: JsonField<Type> = JsonMissing.of(),
    @JsonProperty("updated")
    @ExcludeMissing
    private val updated: JsonField<OffsetDateTime> = JsonMissing.of(),
    @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
) {

    /** Globally unique identifier for the financial account that holds this balance. */
    fun token(): String = token.getRequired("token")

    /** Funds available for spend in the currency's smallest unit (e.g., cents for USD) */
    fun availableAmount(): Long = availableAmount.getRequired("available_amount")

    /** Date and time for when the balance was first created. */
    fun created(): OffsetDateTime = created.getRequired("created")

    /** 3-character alphabetic ISO 4217 code for the local currency of the balance. */
    fun currency(): String = currency.getRequired("currency")

    /**
     * Globally unique identifier for the last financial transaction event that impacted this
     * balance.
     */
    fun lastTransactionEventToken(): String =
        lastTransactionEventToken.getRequired("last_transaction_event_token")

    /** Globally unique identifier for the last financial transaction that impacted this balance. */
    fun lastTransactionToken(): String = lastTransactionToken.getRequired("last_transaction_token")

    /**
     * Funds not available for spend due to card authorizations or pending ACH release. Shown in the
     * currency's smallest unit (e.g., cents for USD).
     */
    fun pendingAmount(): Long = pendingAmount.getRequired("pending_amount")

    /**
     * The sum of available and pending balance in the currency's smallest unit (e.g., cents for
     * USD).
     */
    fun totalAmount(): Long = totalAmount.getRequired("total_amount")

    /** Type of financial account. */
    fun type(): Type = type.getRequired("type")

    /** Date and time for when the balance was last updated. */
    fun updated(): OffsetDateTime = updated.getRequired("updated")

    /** Globally unique identifier for the financial account that holds this balance. */
    @JsonProperty("token") @ExcludeMissing fun _token(): JsonField<String> = token

    /** Funds available for spend in the currency's smallest unit (e.g., cents for USD) */
    @JsonProperty("available_amount")
    @ExcludeMissing
    fun _availableAmount(): JsonField<Long> = availableAmount

    /** Date and time for when the balance was first created. */
    @JsonProperty("created") @ExcludeMissing fun _created(): JsonField<OffsetDateTime> = created

    /** 3-character alphabetic ISO 4217 code for the local currency of the balance. */
    @JsonProperty("currency") @ExcludeMissing fun _currency(): JsonField<String> = currency

    /**
     * Globally unique identifier for the last financial transaction event that impacted this
     * balance.
     */
    @JsonProperty("last_transaction_event_token")
    @ExcludeMissing
    fun _lastTransactionEventToken(): JsonField<String> = lastTransactionEventToken

    /** Globally unique identifier for the last financial transaction that impacted this balance. */
    @JsonProperty("last_transaction_token")
    @ExcludeMissing
    fun _lastTransactionToken(): JsonField<String> = lastTransactionToken

    /**
     * Funds not available for spend due to card authorizations or pending ACH release. Shown in the
     * currency's smallest unit (e.g., cents for USD).
     */
    @JsonProperty("pending_amount")
    @ExcludeMissing
    fun _pendingAmount(): JsonField<Long> = pendingAmount

    /**
     * The sum of available and pending balance in the currency's smallest unit (e.g., cents for
     * USD).
     */
    @JsonProperty("total_amount") @ExcludeMissing fun _totalAmount(): JsonField<Long> = totalAmount

    /** Type of financial account. */
    @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

    /** Date and time for when the balance was last updated. */
    @JsonProperty("updated") @ExcludeMissing fun _updated(): JsonField<OffsetDateTime> = updated

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    private var validated: Boolean = false

    fun validate(): BalanceListResponse = apply {
        if (validated) {
            return@apply
        }

        token()
        availableAmount()
        created()
        currency()
        lastTransactionEventToken()
        lastTransactionToken()
        pendingAmount()
        totalAmount()
        type()
        updated()
        validated = true
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [BalanceListResponse].
         *
         * The following fields are required:
         * ```kotlin
         * .token()
         * .availableAmount()
         * .created()
         * .currency()
         * .lastTransactionEventToken()
         * .lastTransactionToken()
         * .pendingAmount()
         * .totalAmount()
         * .type()
         * .updated()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [BalanceListResponse]. */
    class Builder internal constructor() {

        private var token: JsonField<String>? = null
        private var availableAmount: JsonField<Long>? = null
        private var created: JsonField<OffsetDateTime>? = null
        private var currency: JsonField<String>? = null
        private var lastTransactionEventToken: JsonField<String>? = null
        private var lastTransactionToken: JsonField<String>? = null
        private var pendingAmount: JsonField<Long>? = null
        private var totalAmount: JsonField<Long>? = null
        private var type: JsonField<Type>? = null
        private var updated: JsonField<OffsetDateTime>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(balanceListResponse: BalanceListResponse) = apply {
            token = balanceListResponse.token
            availableAmount = balanceListResponse.availableAmount
            created = balanceListResponse.created
            currency = balanceListResponse.currency
            lastTransactionEventToken = balanceListResponse.lastTransactionEventToken
            lastTransactionToken = balanceListResponse.lastTransactionToken
            pendingAmount = balanceListResponse.pendingAmount
            totalAmount = balanceListResponse.totalAmount
            type = balanceListResponse.type
            updated = balanceListResponse.updated
            additionalProperties = balanceListResponse.additionalProperties.toMutableMap()
        }

        /** Globally unique identifier for the financial account that holds this balance. */
        fun token(token: String) = token(JsonField.of(token))

        /** Globally unique identifier for the financial account that holds this balance. */
        fun token(token: JsonField<String>) = apply { this.token = token }

        /** Funds available for spend in the currency's smallest unit (e.g., cents for USD) */
        fun availableAmount(availableAmount: Long) = availableAmount(JsonField.of(availableAmount))

        /** Funds available for spend in the currency's smallest unit (e.g., cents for USD) */
        fun availableAmount(availableAmount: JsonField<Long>) = apply {
            this.availableAmount = availableAmount
        }

        /** Date and time for when the balance was first created. */
        fun created(created: OffsetDateTime) = created(JsonField.of(created))

        /** Date and time for when the balance was first created. */
        fun created(created: JsonField<OffsetDateTime>) = apply { this.created = created }

        /** 3-character alphabetic ISO 4217 code for the local currency of the balance. */
        fun currency(currency: String) = currency(JsonField.of(currency))

        /** 3-character alphabetic ISO 4217 code for the local currency of the balance. */
        fun currency(currency: JsonField<String>) = apply { this.currency = currency }

        /**
         * Globally unique identifier for the last financial transaction event that impacted this
         * balance.
         */
        fun lastTransactionEventToken(lastTransactionEventToken: String) =
            lastTransactionEventToken(JsonField.of(lastTransactionEventToken))

        /**
         * Globally unique identifier for the last financial transaction event that impacted this
         * balance.
         */
        fun lastTransactionEventToken(lastTransactionEventToken: JsonField<String>) = apply {
            this.lastTransactionEventToken = lastTransactionEventToken
        }

        /**
         * Globally unique identifier for the last financial transaction that impacted this balance.
         */
        fun lastTransactionToken(lastTransactionToken: String) =
            lastTransactionToken(JsonField.of(lastTransactionToken))

        /**
         * Globally unique identifier for the last financial transaction that impacted this balance.
         */
        fun lastTransactionToken(lastTransactionToken: JsonField<String>) = apply {
            this.lastTransactionToken = lastTransactionToken
        }

        /**
         * Funds not available for spend due to card authorizations or pending ACH release. Shown in
         * the currency's smallest unit (e.g., cents for USD).
         */
        fun pendingAmount(pendingAmount: Long) = pendingAmount(JsonField.of(pendingAmount))

        /**
         * Funds not available for spend due to card authorizations or pending ACH release. Shown in
         * the currency's smallest unit (e.g., cents for USD).
         */
        fun pendingAmount(pendingAmount: JsonField<Long>) = apply {
            this.pendingAmount = pendingAmount
        }

        /**
         * The sum of available and pending balance in the currency's smallest unit (e.g., cents for
         * USD).
         */
        fun totalAmount(totalAmount: Long) = totalAmount(JsonField.of(totalAmount))

        /**
         * The sum of available and pending balance in the currency's smallest unit (e.g., cents for
         * USD).
         */
        fun totalAmount(totalAmount: JsonField<Long>) = apply { this.totalAmount = totalAmount }

        /** Type of financial account. */
        fun type(type: Type) = type(JsonField.of(type))

        /** Type of financial account. */
        fun type(type: JsonField<Type>) = apply { this.type = type }

        /** Date and time for when the balance was last updated. */
        fun updated(updated: OffsetDateTime) = updated(JsonField.of(updated))

        /** Date and time for when the balance was last updated. */
        fun updated(updated: JsonField<OffsetDateTime>) = apply { this.updated = updated }

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

        fun build(): BalanceListResponse =
            BalanceListResponse(
                checkRequired("token", token),
                checkRequired("availableAmount", availableAmount),
                checkRequired("created", created),
                checkRequired("currency", currency),
                checkRequired("lastTransactionEventToken", lastTransactionEventToken),
                checkRequired("lastTransactionToken", lastTransactionToken),
                checkRequired("pendingAmount", pendingAmount),
                checkRequired("totalAmount", totalAmount),
                checkRequired("type", type),
                checkRequired("updated", updated),
                additionalProperties.toImmutable(),
            )
    }

    /** Type of financial account. */
    class Type @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            val ISSUING = of("ISSUING")

            val OPERATING = of("OPERATING")

            val RESERVE = of("RESERVE")

            fun of(value: String) = Type(JsonField.of(value))
        }

        /** An enum containing [Type]'s known values. */
        enum class Known {
            ISSUING,
            OPERATING,
            RESERVE,
        }

        /**
         * An enum containing [Type]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Type] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            ISSUING,
            OPERATING,
            RESERVE,
            /** An enum member indicating that [Type] was instantiated with an unknown value. */
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
                ISSUING -> Value.ISSUING
                OPERATING -> Value.OPERATING
                RESERVE -> Value.RESERVE
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
                ISSUING -> Known.ISSUING
                OPERATING -> Known.OPERATING
                RESERVE -> Known.RESERVE
                else -> throw LithicInvalidDataException("Unknown Type: $value")
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

            return /* spotless:off */ other is Type && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is BalanceListResponse && token == other.token && availableAmount == other.availableAmount && created == other.created && currency == other.currency && lastTransactionEventToken == other.lastTransactionEventToken && lastTransactionToken == other.lastTransactionToken && pendingAmount == other.pendingAmount && totalAmount == other.totalAmount && type == other.type && updated == other.updated && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(token, availableAmount, created, currency, lastTransactionEventToken, lastTransactionToken, pendingAmount, totalAmount, type, updated, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "BalanceListResponse{token=$token, availableAmount=$availableAmount, created=$created, currency=$currency, lastTransactionEventToken=$lastTransactionEventToken, lastTransactionToken=$lastTransactionToken, pendingAmount=$pendingAmount, totalAmount=$totalAmount, type=$type, updated=$updated, additionalProperties=$additionalProperties}"
}
