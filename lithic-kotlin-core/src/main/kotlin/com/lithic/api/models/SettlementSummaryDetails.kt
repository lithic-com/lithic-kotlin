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

@JsonDeserialize(builder = SettlementSummaryDetails.Builder::class)
@NoAutoDetect
class SettlementSummaryDetails
private constructor(
    private val currency: JsonField<String>,
    private val disputesGrossAmount: JsonField<Long>,
    private val institution: JsonField<String>,
    private val interchangeGrossAmount: JsonField<Long>,
    private val network: JsonField<Network>,
    private val otherFeesGrossAmount: JsonField<Long>,
    private val settledNetAmount: JsonField<Long>,
    private val transactionsGrossAmount: JsonField<Long>,
    private val additionalProperties: Map<String, JsonValue>,
) {

    private var validated: Boolean = false

    /** ISO 4217 alpha 3 code. */
    fun currency(): String? = currency.getNullable("currency")

    /** The total gross amount of disputes settlements. */
    fun disputesGrossAmount(): Long? = disputesGrossAmount.getNullable("disputes_gross_amount")

    /** The most granular ID the network settles with (e.g., ICA for Mastercard, FTSRE for Visa). */
    fun institution(): String? = institution.getNullable("institution")

    /** The total amount of interchange. */
    fun interchangeGrossAmount(): Long? =
        interchangeGrossAmount.getNullable("interchange_gross_amount")

    /** Card network where the transaction took place */
    fun network(): Network? = network.getNullable("network")

    /** Total amount of gross other fees outside of interchange. */
    fun otherFeesGrossAmount(): Long? = otherFeesGrossAmount.getNullable("other_fees_gross_amount")

    /**
     * The total net amount of cash moved. (net value of settled_gross_amount, interchange, fees).
     */
    fun settledNetAmount(): Long? = settledNetAmount.getNullable("settled_net_amount")

    /**
     * The total amount of settlement impacting transactions (excluding interchange, fees, and
     * disputes).
     */
    fun transactionsGrossAmount(): Long? =
        transactionsGrossAmount.getNullable("transactions_gross_amount")

    /** ISO 4217 alpha 3 code. */
    @JsonProperty("currency") @ExcludeMissing fun _currency() = currency

    /** The total gross amount of disputes settlements. */
    @JsonProperty("disputes_gross_amount")
    @ExcludeMissing
    fun _disputesGrossAmount() = disputesGrossAmount

    /** The most granular ID the network settles with (e.g., ICA for Mastercard, FTSRE for Visa). */
    @JsonProperty("institution") @ExcludeMissing fun _institution() = institution

    /** The total amount of interchange. */
    @JsonProperty("interchange_gross_amount")
    @ExcludeMissing
    fun _interchangeGrossAmount() = interchangeGrossAmount

    /** Card network where the transaction took place */
    @JsonProperty("network") @ExcludeMissing fun _network() = network

    /** Total amount of gross other fees outside of interchange. */
    @JsonProperty("other_fees_gross_amount")
    @ExcludeMissing
    fun _otherFeesGrossAmount() = otherFeesGrossAmount

    /**
     * The total net amount of cash moved. (net value of settled_gross_amount, interchange, fees).
     */
    @JsonProperty("settled_net_amount") @ExcludeMissing fun _settledNetAmount() = settledNetAmount

    /**
     * The total amount of settlement impacting transactions (excluding interchange, fees, and
     * disputes).
     */
    @JsonProperty("transactions_gross_amount")
    @ExcludeMissing
    fun _transactionsGrossAmount() = transactionsGrossAmount

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    fun validate(): SettlementSummaryDetails = apply {
        if (!validated) {
            currency()
            disputesGrossAmount()
            institution()
            interchangeGrossAmount()
            network()
            otherFeesGrossAmount()
            settledNetAmount()
            transactionsGrossAmount()
            validated = true
        }
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        fun builder() = Builder()
    }

    class Builder {

        private var currency: JsonField<String> = JsonMissing.of()
        private var disputesGrossAmount: JsonField<Long> = JsonMissing.of()
        private var institution: JsonField<String> = JsonMissing.of()
        private var interchangeGrossAmount: JsonField<Long> = JsonMissing.of()
        private var network: JsonField<Network> = JsonMissing.of()
        private var otherFeesGrossAmount: JsonField<Long> = JsonMissing.of()
        private var settledNetAmount: JsonField<Long> = JsonMissing.of()
        private var transactionsGrossAmount: JsonField<Long> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(settlementSummaryDetails: SettlementSummaryDetails) = apply {
            this.currency = settlementSummaryDetails.currency
            this.disputesGrossAmount = settlementSummaryDetails.disputesGrossAmount
            this.institution = settlementSummaryDetails.institution
            this.interchangeGrossAmount = settlementSummaryDetails.interchangeGrossAmount
            this.network = settlementSummaryDetails.network
            this.otherFeesGrossAmount = settlementSummaryDetails.otherFeesGrossAmount
            this.settledNetAmount = settlementSummaryDetails.settledNetAmount
            this.transactionsGrossAmount = settlementSummaryDetails.transactionsGrossAmount
            additionalProperties(settlementSummaryDetails.additionalProperties)
        }

        /** ISO 4217 alpha 3 code. */
        fun currency(currency: String) = currency(JsonField.of(currency))

        /** ISO 4217 alpha 3 code. */
        @JsonProperty("currency")
        @ExcludeMissing
        fun currency(currency: JsonField<String>) = apply { this.currency = currency }

        /** The total gross amount of disputes settlements. */
        fun disputesGrossAmount(disputesGrossAmount: Long) =
            disputesGrossAmount(JsonField.of(disputesGrossAmount))

        /** The total gross amount of disputes settlements. */
        @JsonProperty("disputes_gross_amount")
        @ExcludeMissing
        fun disputesGrossAmount(disputesGrossAmount: JsonField<Long>) = apply {
            this.disputesGrossAmount = disputesGrossAmount
        }

        /**
         * The most granular ID the network settles with (e.g., ICA for Mastercard, FTSRE for Visa).
         */
        fun institution(institution: String) = institution(JsonField.of(institution))

        /**
         * The most granular ID the network settles with (e.g., ICA for Mastercard, FTSRE for Visa).
         */
        @JsonProperty("institution")
        @ExcludeMissing
        fun institution(institution: JsonField<String>) = apply { this.institution = institution }

        /** The total amount of interchange. */
        fun interchangeGrossAmount(interchangeGrossAmount: Long) =
            interchangeGrossAmount(JsonField.of(interchangeGrossAmount))

        /** The total amount of interchange. */
        @JsonProperty("interchange_gross_amount")
        @ExcludeMissing
        fun interchangeGrossAmount(interchangeGrossAmount: JsonField<Long>) = apply {
            this.interchangeGrossAmount = interchangeGrossAmount
        }

        /** Card network where the transaction took place */
        fun network(network: Network) = network(JsonField.of(network))

        /** Card network where the transaction took place */
        @JsonProperty("network")
        @ExcludeMissing
        fun network(network: JsonField<Network>) = apply { this.network = network }

        /** Total amount of gross other fees outside of interchange. */
        fun otherFeesGrossAmount(otherFeesGrossAmount: Long) =
            otherFeesGrossAmount(JsonField.of(otherFeesGrossAmount))

        /** Total amount of gross other fees outside of interchange. */
        @JsonProperty("other_fees_gross_amount")
        @ExcludeMissing
        fun otherFeesGrossAmount(otherFeesGrossAmount: JsonField<Long>) = apply {
            this.otherFeesGrossAmount = otherFeesGrossAmount
        }

        /**
         * The total net amount of cash moved. (net value of settled_gross_amount, interchange,
         * fees).
         */
        fun settledNetAmount(settledNetAmount: Long) =
            settledNetAmount(JsonField.of(settledNetAmount))

        /**
         * The total net amount of cash moved. (net value of settled_gross_amount, interchange,
         * fees).
         */
        @JsonProperty("settled_net_amount")
        @ExcludeMissing
        fun settledNetAmount(settledNetAmount: JsonField<Long>) = apply {
            this.settledNetAmount = settledNetAmount
        }

        /**
         * The total amount of settlement impacting transactions (excluding interchange, fees, and
         * disputes).
         */
        fun transactionsGrossAmount(transactionsGrossAmount: Long) =
            transactionsGrossAmount(JsonField.of(transactionsGrossAmount))

        /**
         * The total amount of settlement impacting transactions (excluding interchange, fees, and
         * disputes).
         */
        @JsonProperty("transactions_gross_amount")
        @ExcludeMissing
        fun transactionsGrossAmount(transactionsGrossAmount: JsonField<Long>) = apply {
            this.transactionsGrossAmount = transactionsGrossAmount
        }

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

        fun build(): SettlementSummaryDetails =
            SettlementSummaryDetails(
                currency,
                disputesGrossAmount,
                institution,
                interchangeGrossAmount,
                network,
                otherFeesGrossAmount,
                settledNetAmount,
                transactionsGrossAmount,
                additionalProperties.toImmutable(),
            )
    }

    class Network
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Network && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()

        companion object {

            val INTERLINK = Network(JsonField.of("INTERLINK"))

            val MAESTRO = Network(JsonField.of("MAESTRO"))

            val MASTERCARD = Network(JsonField.of("MASTERCARD"))

            val UNKNOWN = Network(JsonField.of("UNKNOWN"))

            val VISA = Network(JsonField.of("VISA"))

            fun of(value: String) = Network(JsonField.of(value))
        }

        enum class Known {
            INTERLINK,
            MAESTRO,
            MASTERCARD,
            UNKNOWN,
            VISA,
        }

        enum class Value {
            INTERLINK,
            MAESTRO,
            MASTERCARD,
            UNKNOWN,
            VISA,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                INTERLINK -> Value.INTERLINK
                MAESTRO -> Value.MAESTRO
                MASTERCARD -> Value.MASTERCARD
                UNKNOWN -> Value.UNKNOWN
                VISA -> Value.VISA
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                INTERLINK -> Known.INTERLINK
                MAESTRO -> Known.MAESTRO
                MASTERCARD -> Known.MASTERCARD
                UNKNOWN -> Known.UNKNOWN
                VISA -> Known.VISA
                else -> throw LithicInvalidDataException("Unknown Network: $value")
            }

        fun asString(): String = _value().asStringOrThrow()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is SettlementSummaryDetails && currency == other.currency && disputesGrossAmount == other.disputesGrossAmount && institution == other.institution && interchangeGrossAmount == other.interchangeGrossAmount && network == other.network && otherFeesGrossAmount == other.otherFeesGrossAmount && settledNetAmount == other.settledNetAmount && transactionsGrossAmount == other.transactionsGrossAmount && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(currency, disputesGrossAmount, institution, interchangeGrossAmount, network, otherFeesGrossAmount, settledNetAmount, transactionsGrossAmount, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "SettlementSummaryDetails{currency=$currency, disputesGrossAmount=$disputesGrossAmount, institution=$institution, interchangeGrossAmount=$interchangeGrossAmount, network=$network, otherFeesGrossAmount=$otherFeesGrossAmount, settledNetAmount=$settledNetAmount, transactionsGrossAmount=$transactionsGrossAmount, additionalProperties=$additionalProperties}"
}
