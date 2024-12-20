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
import java.time.OffsetDateTime
import java.util.Objects

@JsonDeserialize(builder = SettlementDetail.Builder::class)
@NoAutoDetect
class SettlementDetail
private constructor(
    private val accountToken: JsonField<String>,
    private val cardProgramToken: JsonField<String>,
    private val cardToken: JsonField<String>,
    private val created: JsonField<OffsetDateTime>,
    private val currency: JsonField<String>,
    private val disputesGrossAmount: JsonField<Long>,
    private val eventTokens: JsonField<List<String>>,
    private val feeDescription: JsonField<String>,
    private val institution: JsonField<String>,
    private val interchangeFeeExtendedPrecision: JsonField<Long>,
    private val interchangeGrossAmount: JsonField<Long>,
    private val network: JsonField<Network>,
    private val otherFeesDetails: JsonField<OtherFeesDetails>,
    private val otherFeesGrossAmount: JsonField<Long>,
    private val reportDate: JsonField<String>,
    private val settlementDate: JsonField<String>,
    private val token: JsonField<String>,
    private val transactionToken: JsonField<String>,
    private val transactionsGrossAmount: JsonField<Long>,
    private val type: JsonField<Type>,
    private val updated: JsonField<OffsetDateTime>,
    private val additionalProperties: Map<String, JsonValue>,
) {

    private var validated: Boolean = false

    /** The most granular ID the network settles with (e.g., ICA for Mastercard, FTSRE for Visa). */
    fun accountToken(): String = accountToken.getRequired("account_token")

    /**
     * Globally unique identifier denoting the card program that the associated Transaction occurred
     * on.
     */
    fun cardProgramToken(): String = cardProgramToken.getRequired("card_program_token")

    /** Globally unique identifier denoting the card that the associated Transaction occurred on. */
    fun cardToken(): String = cardToken.getRequired("card_token")

    /** Date and time when the transaction first occurred. UTC time zone. */
    fun created(): OffsetDateTime = created.getRequired("created")

    /** Three-digit alphabetic ISO 4217 code. */
    fun currency(): String = currency.getRequired("currency")

    /** The total gross amount of disputes settlements. */
    fun disputesGrossAmount(): Long = disputesGrossAmount.getRequired("disputes_gross_amount")

    /** Globally unique identifiers denoting the Events associated with this settlement. */
    fun eventTokens(): List<String> = eventTokens.getRequired("event_tokens")

    /** Network's description of a fee, only present on records with type `FEE`. */
    fun feeDescription(): String? = feeDescription.getNullable("fee_description")

    /** The most granular ID the network settles with (e.g., ICA for Mastercard, FTSRE for Visa). */
    fun institution(): String = institution.getRequired("institution")

    /** The total amount of interchange in six-digit extended precision. */
    fun interchangeFeeExtendedPrecision(): Long =
        interchangeFeeExtendedPrecision.getRequired("interchange_fee_extended_precision")

    /** The total amount of interchange. */
    fun interchangeGrossAmount(): Long =
        interchangeGrossAmount.getRequired("interchange_gross_amount")

    /** Card network where the transaction took place. */
    fun network(): Network = network.getRequired("network")

    /** The total gross amount of other fees by type. */
    fun otherFeesDetails(): OtherFeesDetails = otherFeesDetails.getRequired("other_fees_details")

    /** Total amount of gross other fees outside of interchange. */
    fun otherFeesGrossAmount(): Long = otherFeesGrossAmount.getRequired("other_fees_gross_amount")

    /** Date of when the report was first generated. */
    fun reportDate(): String = reportDate.getRequired("report_date")

    /** Date of when money movement is triggered for the transaction. */
    fun settlementDate(): String = settlementDate.getRequired("settlement_date")

    /** Globally unique identifier denoting the Settlement Detail. */
    fun token(): String = token.getRequired("token")

    /** Globally unique identifier denoting the associated Transaction object. */
    fun transactionToken(): String = transactionToken.getRequired("transaction_token")

    /**
     * The total amount of settlement impacting transactions (excluding interchange, fees, and
     * disputes).
     */
    fun transactionsGrossAmount(): Long =
        transactionsGrossAmount.getRequired("transactions_gross_amount")

    /** The type of settlement record. */
    fun type(): Type = type.getRequired("type")

    /** Date and time when the transaction first occurred. UTC time zone. */
    fun updated(): OffsetDateTime = updated.getRequired("updated")

    /** The most granular ID the network settles with (e.g., ICA for Mastercard, FTSRE for Visa). */
    @JsonProperty("account_token") @ExcludeMissing fun _accountToken() = accountToken

    /**
     * Globally unique identifier denoting the card program that the associated Transaction occurred
     * on.
     */
    @JsonProperty("card_program_token") @ExcludeMissing fun _cardProgramToken() = cardProgramToken

    /** Globally unique identifier denoting the card that the associated Transaction occurred on. */
    @JsonProperty("card_token") @ExcludeMissing fun _cardToken() = cardToken

    /** Date and time when the transaction first occurred. UTC time zone. */
    @JsonProperty("created") @ExcludeMissing fun _created() = created

    /** Three-digit alphabetic ISO 4217 code. */
    @JsonProperty("currency") @ExcludeMissing fun _currency() = currency

    /** The total gross amount of disputes settlements. */
    @JsonProperty("disputes_gross_amount")
    @ExcludeMissing
    fun _disputesGrossAmount() = disputesGrossAmount

    /** Globally unique identifiers denoting the Events associated with this settlement. */
    @JsonProperty("event_tokens") @ExcludeMissing fun _eventTokens() = eventTokens

    /** Network's description of a fee, only present on records with type `FEE`. */
    @JsonProperty("fee_description") @ExcludeMissing fun _feeDescription() = feeDescription

    /** The most granular ID the network settles with (e.g., ICA for Mastercard, FTSRE for Visa). */
    @JsonProperty("institution") @ExcludeMissing fun _institution() = institution

    /** The total amount of interchange in six-digit extended precision. */
    @JsonProperty("interchange_fee_extended_precision")
    @ExcludeMissing
    fun _interchangeFeeExtendedPrecision() = interchangeFeeExtendedPrecision

    /** The total amount of interchange. */
    @JsonProperty("interchange_gross_amount")
    @ExcludeMissing
    fun _interchangeGrossAmount() = interchangeGrossAmount

    /** Card network where the transaction took place. */
    @JsonProperty("network") @ExcludeMissing fun _network() = network

    /** The total gross amount of other fees by type. */
    @JsonProperty("other_fees_details") @ExcludeMissing fun _otherFeesDetails() = otherFeesDetails

    /** Total amount of gross other fees outside of interchange. */
    @JsonProperty("other_fees_gross_amount")
    @ExcludeMissing
    fun _otherFeesGrossAmount() = otherFeesGrossAmount

    /** Date of when the report was first generated. */
    @JsonProperty("report_date") @ExcludeMissing fun _reportDate() = reportDate

    /** Date of when money movement is triggered for the transaction. */
    @JsonProperty("settlement_date") @ExcludeMissing fun _settlementDate() = settlementDate

    /** Globally unique identifier denoting the Settlement Detail. */
    @JsonProperty("token") @ExcludeMissing fun _token() = token

    /** Globally unique identifier denoting the associated Transaction object. */
    @JsonProperty("transaction_token") @ExcludeMissing fun _transactionToken() = transactionToken

    /**
     * The total amount of settlement impacting transactions (excluding interchange, fees, and
     * disputes).
     */
    @JsonProperty("transactions_gross_amount")
    @ExcludeMissing
    fun _transactionsGrossAmount() = transactionsGrossAmount

    /** The type of settlement record. */
    @JsonProperty("type") @ExcludeMissing fun _type() = type

    /** Date and time when the transaction first occurred. UTC time zone. */
    @JsonProperty("updated") @ExcludeMissing fun _updated() = updated

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    fun validate(): SettlementDetail = apply {
        if (!validated) {
            accountToken()
            cardProgramToken()
            cardToken()
            created()
            currency()
            disputesGrossAmount()
            eventTokens()
            feeDescription()
            institution()
            interchangeFeeExtendedPrecision()
            interchangeGrossAmount()
            network()
            otherFeesDetails().validate()
            otherFeesGrossAmount()
            reportDate()
            settlementDate()
            token()
            transactionToken()
            transactionsGrossAmount()
            type()
            updated()
            validated = true
        }
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        fun builder() = Builder()
    }

    class Builder {

        private var accountToken: JsonField<String> = JsonMissing.of()
        private var cardProgramToken: JsonField<String> = JsonMissing.of()
        private var cardToken: JsonField<String> = JsonMissing.of()
        private var created: JsonField<OffsetDateTime> = JsonMissing.of()
        private var currency: JsonField<String> = JsonMissing.of()
        private var disputesGrossAmount: JsonField<Long> = JsonMissing.of()
        private var eventTokens: JsonField<List<String>> = JsonMissing.of()
        private var feeDescription: JsonField<String> = JsonMissing.of()
        private var institution: JsonField<String> = JsonMissing.of()
        private var interchangeFeeExtendedPrecision: JsonField<Long> = JsonMissing.of()
        private var interchangeGrossAmount: JsonField<Long> = JsonMissing.of()
        private var network: JsonField<Network> = JsonMissing.of()
        private var otherFeesDetails: JsonField<OtherFeesDetails> = JsonMissing.of()
        private var otherFeesGrossAmount: JsonField<Long> = JsonMissing.of()
        private var reportDate: JsonField<String> = JsonMissing.of()
        private var settlementDate: JsonField<String> = JsonMissing.of()
        private var token: JsonField<String> = JsonMissing.of()
        private var transactionToken: JsonField<String> = JsonMissing.of()
        private var transactionsGrossAmount: JsonField<Long> = JsonMissing.of()
        private var type: JsonField<Type> = JsonMissing.of()
        private var updated: JsonField<OffsetDateTime> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(settlementDetail: SettlementDetail) = apply {
            this.accountToken = settlementDetail.accountToken
            this.cardProgramToken = settlementDetail.cardProgramToken
            this.cardToken = settlementDetail.cardToken
            this.created = settlementDetail.created
            this.currency = settlementDetail.currency
            this.disputesGrossAmount = settlementDetail.disputesGrossAmount
            this.eventTokens = settlementDetail.eventTokens
            this.feeDescription = settlementDetail.feeDescription
            this.institution = settlementDetail.institution
            this.interchangeFeeExtendedPrecision = settlementDetail.interchangeFeeExtendedPrecision
            this.interchangeGrossAmount = settlementDetail.interchangeGrossAmount
            this.network = settlementDetail.network
            this.otherFeesDetails = settlementDetail.otherFeesDetails
            this.otherFeesGrossAmount = settlementDetail.otherFeesGrossAmount
            this.reportDate = settlementDetail.reportDate
            this.settlementDate = settlementDetail.settlementDate
            this.token = settlementDetail.token
            this.transactionToken = settlementDetail.transactionToken
            this.transactionsGrossAmount = settlementDetail.transactionsGrossAmount
            this.type = settlementDetail.type
            this.updated = settlementDetail.updated
            additionalProperties(settlementDetail.additionalProperties)
        }

        /**
         * The most granular ID the network settles with (e.g., ICA for Mastercard, FTSRE for Visa).
         */
        fun accountToken(accountToken: String) = accountToken(JsonField.of(accountToken))

        /**
         * The most granular ID the network settles with (e.g., ICA for Mastercard, FTSRE for Visa).
         */
        @JsonProperty("account_token")
        @ExcludeMissing
        fun accountToken(accountToken: JsonField<String>) = apply {
            this.accountToken = accountToken
        }

        /**
         * Globally unique identifier denoting the card program that the associated Transaction
         * occurred on.
         */
        fun cardProgramToken(cardProgramToken: String) =
            cardProgramToken(JsonField.of(cardProgramToken))

        /**
         * Globally unique identifier denoting the card program that the associated Transaction
         * occurred on.
         */
        @JsonProperty("card_program_token")
        @ExcludeMissing
        fun cardProgramToken(cardProgramToken: JsonField<String>) = apply {
            this.cardProgramToken = cardProgramToken
        }

        /**
         * Globally unique identifier denoting the card that the associated Transaction occurred on.
         */
        fun cardToken(cardToken: String) = cardToken(JsonField.of(cardToken))

        /**
         * Globally unique identifier denoting the card that the associated Transaction occurred on.
         */
        @JsonProperty("card_token")
        @ExcludeMissing
        fun cardToken(cardToken: JsonField<String>) = apply { this.cardToken = cardToken }

        /** Date and time when the transaction first occurred. UTC time zone. */
        fun created(created: OffsetDateTime) = created(JsonField.of(created))

        /** Date and time when the transaction first occurred. UTC time zone. */
        @JsonProperty("created")
        @ExcludeMissing
        fun created(created: JsonField<OffsetDateTime>) = apply { this.created = created }

        /** Three-digit alphabetic ISO 4217 code. */
        fun currency(currency: String) = currency(JsonField.of(currency))

        /** Three-digit alphabetic ISO 4217 code. */
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

        /** Globally unique identifiers denoting the Events associated with this settlement. */
        fun eventTokens(eventTokens: List<String>) = eventTokens(JsonField.of(eventTokens))

        /** Globally unique identifiers denoting the Events associated with this settlement. */
        @JsonProperty("event_tokens")
        @ExcludeMissing
        fun eventTokens(eventTokens: JsonField<List<String>>) = apply {
            this.eventTokens = eventTokens
        }

        /** Network's description of a fee, only present on records with type `FEE`. */
        fun feeDescription(feeDescription: String) = feeDescription(JsonField.of(feeDescription))

        /** Network's description of a fee, only present on records with type `FEE`. */
        @JsonProperty("fee_description")
        @ExcludeMissing
        fun feeDescription(feeDescription: JsonField<String>) = apply {
            this.feeDescription = feeDescription
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

        /** The total amount of interchange in six-digit extended precision. */
        fun interchangeFeeExtendedPrecision(interchangeFeeExtendedPrecision: Long) =
            interchangeFeeExtendedPrecision(JsonField.of(interchangeFeeExtendedPrecision))

        /** The total amount of interchange in six-digit extended precision. */
        @JsonProperty("interchange_fee_extended_precision")
        @ExcludeMissing
        fun interchangeFeeExtendedPrecision(interchangeFeeExtendedPrecision: JsonField<Long>) =
            apply {
                this.interchangeFeeExtendedPrecision = interchangeFeeExtendedPrecision
            }

        /** The total amount of interchange. */
        fun interchangeGrossAmount(interchangeGrossAmount: Long) =
            interchangeGrossAmount(JsonField.of(interchangeGrossAmount))

        /** The total amount of interchange. */
        @JsonProperty("interchange_gross_amount")
        @ExcludeMissing
        fun interchangeGrossAmount(interchangeGrossAmount: JsonField<Long>) = apply {
            this.interchangeGrossAmount = interchangeGrossAmount
        }

        /** Card network where the transaction took place. */
        fun network(network: Network) = network(JsonField.of(network))

        /** Card network where the transaction took place. */
        @JsonProperty("network")
        @ExcludeMissing
        fun network(network: JsonField<Network>) = apply { this.network = network }

        /** The total gross amount of other fees by type. */
        fun otherFeesDetails(otherFeesDetails: OtherFeesDetails) =
            otherFeesDetails(JsonField.of(otherFeesDetails))

        /** The total gross amount of other fees by type. */
        @JsonProperty("other_fees_details")
        @ExcludeMissing
        fun otherFeesDetails(otherFeesDetails: JsonField<OtherFeesDetails>) = apply {
            this.otherFeesDetails = otherFeesDetails
        }

        /** Total amount of gross other fees outside of interchange. */
        fun otherFeesGrossAmount(otherFeesGrossAmount: Long) =
            otherFeesGrossAmount(JsonField.of(otherFeesGrossAmount))

        /** Total amount of gross other fees outside of interchange. */
        @JsonProperty("other_fees_gross_amount")
        @ExcludeMissing
        fun otherFeesGrossAmount(otherFeesGrossAmount: JsonField<Long>) = apply {
            this.otherFeesGrossAmount = otherFeesGrossAmount
        }

        /** Date of when the report was first generated. */
        fun reportDate(reportDate: String) = reportDate(JsonField.of(reportDate))

        /** Date of when the report was first generated. */
        @JsonProperty("report_date")
        @ExcludeMissing
        fun reportDate(reportDate: JsonField<String>) = apply { this.reportDate = reportDate }

        /** Date of when money movement is triggered for the transaction. */
        fun settlementDate(settlementDate: String) = settlementDate(JsonField.of(settlementDate))

        /** Date of when money movement is triggered for the transaction. */
        @JsonProperty("settlement_date")
        @ExcludeMissing
        fun settlementDate(settlementDate: JsonField<String>) = apply {
            this.settlementDate = settlementDate
        }

        /** Globally unique identifier denoting the Settlement Detail. */
        fun token(token: String) = token(JsonField.of(token))

        /** Globally unique identifier denoting the Settlement Detail. */
        @JsonProperty("token")
        @ExcludeMissing
        fun token(token: JsonField<String>) = apply { this.token = token }

        /** Globally unique identifier denoting the associated Transaction object. */
        fun transactionToken(transactionToken: String) =
            transactionToken(JsonField.of(transactionToken))

        /** Globally unique identifier denoting the associated Transaction object. */
        @JsonProperty("transaction_token")
        @ExcludeMissing
        fun transactionToken(transactionToken: JsonField<String>) = apply {
            this.transactionToken = transactionToken
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

        /** The type of settlement record. */
        fun type(type: Type) = type(JsonField.of(type))

        /** The type of settlement record. */
        @JsonProperty("type")
        @ExcludeMissing
        fun type(type: JsonField<Type>) = apply { this.type = type }

        /** Date and time when the transaction first occurred. UTC time zone. */
        fun updated(updated: OffsetDateTime) = updated(JsonField.of(updated))

        /** Date and time when the transaction first occurred. UTC time zone. */
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

        fun build(): SettlementDetail =
            SettlementDetail(
                accountToken,
                cardProgramToken,
                cardToken,
                created,
                currency,
                disputesGrossAmount,
                eventTokens.map { it.toImmutable() },
                feeDescription,
                institution,
                interchangeFeeExtendedPrecision,
                interchangeGrossAmount,
                network,
                otherFeesDetails,
                otherFeesGrossAmount,
                reportDate,
                settlementDate,
                token,
                transactionToken,
                transactionsGrossAmount,
                type,
                updated,
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

    /** The total gross amount of other fees by type. */
    @JsonDeserialize(builder = OtherFeesDetails.Builder::class)
    @NoAutoDetect
    class OtherFeesDetails
    private constructor(
        private val isa: JsonField<Long>,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var validated: Boolean = false

        fun isa(): Long? = isa.getNullable("ISA")

        @JsonProperty("ISA") @ExcludeMissing fun _isa() = isa

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun validate(): OtherFeesDetails = apply {
            if (!validated) {
                isa()
                validated = true
            }
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var isa: JsonField<Long> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(otherFeesDetails: OtherFeesDetails) = apply {
                this.isa = otherFeesDetails.isa
                additionalProperties(otherFeesDetails.additionalProperties)
            }

            fun isa(isa: Long) = isa(JsonField.of(isa))

            @JsonProperty("ISA")
            @ExcludeMissing
            fun isa(isa: JsonField<Long>) = apply { this.isa = isa }

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

            fun build(): OtherFeesDetails =
                OtherFeesDetails(isa, additionalProperties.toImmutable())
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is OtherFeesDetails && isa == other.isa && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(isa, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "OtherFeesDetails{isa=$isa, additionalProperties=$additionalProperties}"
    }

    class Type
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Type && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()

        companion object {

            val ADJUSTMENT = Type(JsonField.of("ADJUSTMENT"))

            val ARBITRATION = Type(JsonField.of("ARBITRATION"))

            val CHARGEBACK = Type(JsonField.of("CHARGEBACK"))

            val CLEARING = Type(JsonField.of("CLEARING"))

            val FEE = Type(JsonField.of("FEE"))

            val FINANCIAL = Type(JsonField.of("FINANCIAL"))

            val NON_FINANCIAL = Type(JsonField.of("NON-FINANCIAL"))

            val PREARBITRATION = Type(JsonField.of("PREARBITRATION"))

            val REPRESENTMENT = Type(JsonField.of("REPRESENTMENT"))

            fun of(value: String) = Type(JsonField.of(value))
        }

        enum class Known {
            ADJUSTMENT,
            ARBITRATION,
            CHARGEBACK,
            CLEARING,
            FEE,
            FINANCIAL,
            NON_FINANCIAL,
            PREARBITRATION,
            REPRESENTMENT,
        }

        enum class Value {
            ADJUSTMENT,
            ARBITRATION,
            CHARGEBACK,
            CLEARING,
            FEE,
            FINANCIAL,
            NON_FINANCIAL,
            PREARBITRATION,
            REPRESENTMENT,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                ADJUSTMENT -> Value.ADJUSTMENT
                ARBITRATION -> Value.ARBITRATION
                CHARGEBACK -> Value.CHARGEBACK
                CLEARING -> Value.CLEARING
                FEE -> Value.FEE
                FINANCIAL -> Value.FINANCIAL
                NON_FINANCIAL -> Value.NON_FINANCIAL
                PREARBITRATION -> Value.PREARBITRATION
                REPRESENTMENT -> Value.REPRESENTMENT
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                ADJUSTMENT -> Known.ADJUSTMENT
                ARBITRATION -> Known.ARBITRATION
                CHARGEBACK -> Known.CHARGEBACK
                CLEARING -> Known.CLEARING
                FEE -> Known.FEE
                FINANCIAL -> Known.FINANCIAL
                NON_FINANCIAL -> Known.NON_FINANCIAL
                PREARBITRATION -> Known.PREARBITRATION
                REPRESENTMENT -> Known.REPRESENTMENT
                else -> throw LithicInvalidDataException("Unknown Type: $value")
            }

        fun asString(): String = _value().asStringOrThrow()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is SettlementDetail && accountToken == other.accountToken && cardProgramToken == other.cardProgramToken && cardToken == other.cardToken && created == other.created && currency == other.currency && disputesGrossAmount == other.disputesGrossAmount && eventTokens == other.eventTokens && feeDescription == other.feeDescription && institution == other.institution && interchangeFeeExtendedPrecision == other.interchangeFeeExtendedPrecision && interchangeGrossAmount == other.interchangeGrossAmount && network == other.network && otherFeesDetails == other.otherFeesDetails && otherFeesGrossAmount == other.otherFeesGrossAmount && reportDate == other.reportDate && settlementDate == other.settlementDate && token == other.token && transactionToken == other.transactionToken && transactionsGrossAmount == other.transactionsGrossAmount && type == other.type && updated == other.updated && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(accountToken, cardProgramToken, cardToken, created, currency, disputesGrossAmount, eventTokens, feeDescription, institution, interchangeFeeExtendedPrecision, interchangeGrossAmount, network, otherFeesDetails, otherFeesGrossAmount, reportDate, settlementDate, token, transactionToken, transactionsGrossAmount, type, updated, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "SettlementDetail{accountToken=$accountToken, cardProgramToken=$cardProgramToken, cardToken=$cardToken, created=$created, currency=$currency, disputesGrossAmount=$disputesGrossAmount, eventTokens=$eventTokens, feeDescription=$feeDescription, institution=$institution, interchangeFeeExtendedPrecision=$interchangeFeeExtendedPrecision, interchangeGrossAmount=$interchangeGrossAmount, network=$network, otherFeesDetails=$otherFeesDetails, otherFeesGrossAmount=$otherFeesGrossAmount, reportDate=$reportDate, settlementDate=$settlementDate, token=$token, transactionToken=$transactionToken, transactionsGrossAmount=$transactionsGrossAmount, type=$type, updated=$updated, additionalProperties=$additionalProperties}"
}
