// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.lithic.api.core.ExcludeMissing
import com.lithic.api.core.JsonField
import com.lithic.api.core.JsonMissing
import com.lithic.api.core.JsonValue
import com.lithic.api.core.NoAutoDetect
import com.lithic.api.core.toImmutable
import java.time.OffsetDateTime
import java.util.Objects

/** Card Aggregate Balance across all end-user accounts */
@JsonDeserialize(builder = AggregateBalanceListResponse.Builder::class)
@NoAutoDetect
class AggregateBalanceListResponse
private constructor(
    private val availableAmount: JsonField<Long>,
    private val created: JsonField<OffsetDateTime>,
    private val currency: JsonField<String>,
    private val lastCardToken: JsonField<String>,
    private val lastTransactionEventToken: JsonField<String>,
    private val lastTransactionToken: JsonField<String>,
    private val pendingAmount: JsonField<Long>,
    private val totalAmount: JsonField<Long>,
    private val updated: JsonField<OffsetDateTime>,
    private val additionalProperties: Map<String, JsonValue>,
) {

    private var validated: Boolean = false

    /** Funds available for spend in the currency's smallest unit (e.g., cents for USD) */
    fun availableAmount(): Long = availableAmount.getRequired("available_amount")

    /** Date and time for when the balance was first created. */
    fun created(): OffsetDateTime = created.getRequired("created")

    /** 3-digit alphabetic ISO 4217 code for the local currency of the balance. */
    fun currency(): String = currency.getRequired("currency")

    /** Globally unique identifier for the card that had its balance updated most recently */
    fun lastCardToken(): String = lastCardToken.getRequired("last_card_token")

    /** Globally unique identifier for the last transaction event that impacted this balance */
    fun lastTransactionEventToken(): String =
        lastTransactionEventToken.getRequired("last_transaction_event_token")

    /** Globally unique identifier for the last transaction that impacted this balance */
    fun lastTransactionToken(): String = lastTransactionToken.getRequired("last_transaction_token")

    /**
     * Funds not available for spend due to card authorizations or pending ACH release. Shown in the
     * currency's smallest unit (e.g., cents for USD)
     */
    fun pendingAmount(): Long = pendingAmount.getRequired("pending_amount")

    /**
     * The sum of available and pending balance in the currency's smallest unit (e.g., cents for
     * USD)
     */
    fun totalAmount(): Long = totalAmount.getRequired("total_amount")

    /** Date and time for when the balance was last updated. */
    fun updated(): OffsetDateTime = updated.getRequired("updated")

    /** Funds available for spend in the currency's smallest unit (e.g., cents for USD) */
    @JsonProperty("available_amount") @ExcludeMissing fun _availableAmount() = availableAmount

    /** Date and time for when the balance was first created. */
    @JsonProperty("created") @ExcludeMissing fun _created() = created

    /** 3-digit alphabetic ISO 4217 code for the local currency of the balance. */
    @JsonProperty("currency") @ExcludeMissing fun _currency() = currency

    /** Globally unique identifier for the card that had its balance updated most recently */
    @JsonProperty("last_card_token") @ExcludeMissing fun _lastCardToken() = lastCardToken

    /** Globally unique identifier for the last transaction event that impacted this balance */
    @JsonProperty("last_transaction_event_token")
    @ExcludeMissing
    fun _lastTransactionEventToken() = lastTransactionEventToken

    /** Globally unique identifier for the last transaction that impacted this balance */
    @JsonProperty("last_transaction_token")
    @ExcludeMissing
    fun _lastTransactionToken() = lastTransactionToken

    /**
     * Funds not available for spend due to card authorizations or pending ACH release. Shown in the
     * currency's smallest unit (e.g., cents for USD)
     */
    @JsonProperty("pending_amount") @ExcludeMissing fun _pendingAmount() = pendingAmount

    /**
     * The sum of available and pending balance in the currency's smallest unit (e.g., cents for
     * USD)
     */
    @JsonProperty("total_amount") @ExcludeMissing fun _totalAmount() = totalAmount

    /** Date and time for when the balance was last updated. */
    @JsonProperty("updated") @ExcludeMissing fun _updated() = updated

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    fun validate(): AggregateBalanceListResponse = apply {
        if (!validated) {
            availableAmount()
            created()
            currency()
            lastCardToken()
            lastTransactionEventToken()
            lastTransactionToken()
            pendingAmount()
            totalAmount()
            updated()
            validated = true
        }
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        fun builder() = Builder()
    }

    class Builder {

        private var availableAmount: JsonField<Long> = JsonMissing.of()
        private var created: JsonField<OffsetDateTime> = JsonMissing.of()
        private var currency: JsonField<String> = JsonMissing.of()
        private var lastCardToken: JsonField<String> = JsonMissing.of()
        private var lastTransactionEventToken: JsonField<String> = JsonMissing.of()
        private var lastTransactionToken: JsonField<String> = JsonMissing.of()
        private var pendingAmount: JsonField<Long> = JsonMissing.of()
        private var totalAmount: JsonField<Long> = JsonMissing.of()
        private var updated: JsonField<OffsetDateTime> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(aggregateBalanceListResponse: AggregateBalanceListResponse) = apply {
            this.availableAmount = aggregateBalanceListResponse.availableAmount
            this.created = aggregateBalanceListResponse.created
            this.currency = aggregateBalanceListResponse.currency
            this.lastCardToken = aggregateBalanceListResponse.lastCardToken
            this.lastTransactionEventToken = aggregateBalanceListResponse.lastTransactionEventToken
            this.lastTransactionToken = aggregateBalanceListResponse.lastTransactionToken
            this.pendingAmount = aggregateBalanceListResponse.pendingAmount
            this.totalAmount = aggregateBalanceListResponse.totalAmount
            this.updated = aggregateBalanceListResponse.updated
            additionalProperties(aggregateBalanceListResponse.additionalProperties)
        }

        /** Funds available for spend in the currency's smallest unit (e.g., cents for USD) */
        fun availableAmount(availableAmount: Long) = availableAmount(JsonField.of(availableAmount))

        /** Funds available for spend in the currency's smallest unit (e.g., cents for USD) */
        @JsonProperty("available_amount")
        @ExcludeMissing
        fun availableAmount(availableAmount: JsonField<Long>) = apply {
            this.availableAmount = availableAmount
        }

        /** Date and time for when the balance was first created. */
        fun created(created: OffsetDateTime) = created(JsonField.of(created))

        /** Date and time for when the balance was first created. */
        @JsonProperty("created")
        @ExcludeMissing
        fun created(created: JsonField<OffsetDateTime>) = apply { this.created = created }

        /** 3-digit alphabetic ISO 4217 code for the local currency of the balance. */
        fun currency(currency: String) = currency(JsonField.of(currency))

        /** 3-digit alphabetic ISO 4217 code for the local currency of the balance. */
        @JsonProperty("currency")
        @ExcludeMissing
        fun currency(currency: JsonField<String>) = apply { this.currency = currency }

        /** Globally unique identifier for the card that had its balance updated most recently */
        fun lastCardToken(lastCardToken: String) = lastCardToken(JsonField.of(lastCardToken))

        /** Globally unique identifier for the card that had its balance updated most recently */
        @JsonProperty("last_card_token")
        @ExcludeMissing
        fun lastCardToken(lastCardToken: JsonField<String>) = apply {
            this.lastCardToken = lastCardToken
        }

        /** Globally unique identifier for the last transaction event that impacted this balance */
        fun lastTransactionEventToken(lastTransactionEventToken: String) =
            lastTransactionEventToken(JsonField.of(lastTransactionEventToken))

        /** Globally unique identifier for the last transaction event that impacted this balance */
        @JsonProperty("last_transaction_event_token")
        @ExcludeMissing
        fun lastTransactionEventToken(lastTransactionEventToken: JsonField<String>) = apply {
            this.lastTransactionEventToken = lastTransactionEventToken
        }

        /** Globally unique identifier for the last transaction that impacted this balance */
        fun lastTransactionToken(lastTransactionToken: String) =
            lastTransactionToken(JsonField.of(lastTransactionToken))

        /** Globally unique identifier for the last transaction that impacted this balance */
        @JsonProperty("last_transaction_token")
        @ExcludeMissing
        fun lastTransactionToken(lastTransactionToken: JsonField<String>) = apply {
            this.lastTransactionToken = lastTransactionToken
        }

        /**
         * Funds not available for spend due to card authorizations or pending ACH release. Shown in
         * the currency's smallest unit (e.g., cents for USD)
         */
        fun pendingAmount(pendingAmount: Long) = pendingAmount(JsonField.of(pendingAmount))

        /**
         * Funds not available for spend due to card authorizations or pending ACH release. Shown in
         * the currency's smallest unit (e.g., cents for USD)
         */
        @JsonProperty("pending_amount")
        @ExcludeMissing
        fun pendingAmount(pendingAmount: JsonField<Long>) = apply {
            this.pendingAmount = pendingAmount
        }

        /**
         * The sum of available and pending balance in the currency's smallest unit (e.g., cents for
         * USD)
         */
        fun totalAmount(totalAmount: Long) = totalAmount(JsonField.of(totalAmount))

        /**
         * The sum of available and pending balance in the currency's smallest unit (e.g., cents for
         * USD)
         */
        @JsonProperty("total_amount")
        @ExcludeMissing
        fun totalAmount(totalAmount: JsonField<Long>) = apply { this.totalAmount = totalAmount }

        /** Date and time for when the balance was last updated. */
        fun updated(updated: OffsetDateTime) = updated(JsonField.of(updated))

        /** Date and time for when the balance was last updated. */
        @JsonProperty("updated")
        @ExcludeMissing
        fun updated(updated: JsonField<OffsetDateTime>) = apply { this.updated = updated }

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

        fun build(): AggregateBalanceListResponse =
            AggregateBalanceListResponse(
                availableAmount,
                created,
                currency,
                lastCardToken,
                lastTransactionEventToken,
                lastTransactionToken,
                pendingAmount,
                totalAmount,
                updated,
                additionalProperties.toImmutable(),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is AggregateBalanceListResponse && availableAmount == other.availableAmount && created == other.created && currency == other.currency && lastCardToken == other.lastCardToken && lastTransactionEventToken == other.lastTransactionEventToken && lastTransactionToken == other.lastTransactionToken && pendingAmount == other.pendingAmount && totalAmount == other.totalAmount && updated == other.updated && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(availableAmount, created, currency, lastCardToken, lastTransactionEventToken, lastTransactionToken, pendingAmount, totalAmount, updated, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "AggregateBalanceListResponse{availableAmount=$availableAmount, created=$created, currency=$currency, lastCardToken=$lastCardToken, lastTransactionEventToken=$lastTransactionEventToken, lastTransactionToken=$lastTransactionToken, pendingAmount=$pendingAmount, totalAmount=$totalAmount, updated=$updated, additionalProperties=$additionalProperties}"
}
