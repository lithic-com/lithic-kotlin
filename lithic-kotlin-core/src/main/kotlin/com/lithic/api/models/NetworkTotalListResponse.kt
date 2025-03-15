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
import java.time.LocalDate
import java.time.OffsetDateTime
import java.util.Objects

@NoAutoDetect
class NetworkTotalListResponse
@JsonCreator
private constructor(
    @JsonProperty("token") @ExcludeMissing private val token: JsonField<String> = JsonMissing.of(),
    @JsonProperty("amounts")
    @ExcludeMissing
    private val amounts: JsonField<Amounts> = JsonMissing.of(),
    @JsonProperty("created")
    @ExcludeMissing
    private val created: JsonField<OffsetDateTime> = JsonMissing.of(),
    @JsonProperty("currency")
    @ExcludeMissing
    private val currency: JsonField<String> = JsonMissing.of(),
    @JsonProperty("institution_id")
    @ExcludeMissing
    private val institutionId: JsonField<String> = JsonMissing.of(),
    @JsonProperty("network")
    @ExcludeMissing
    private val network: JsonField<Network> = JsonMissing.of(),
    @JsonProperty("report_date")
    @ExcludeMissing
    private val reportDate: JsonField<LocalDate> = JsonMissing.of(),
    @JsonProperty("settlement_institution_id")
    @ExcludeMissing
    private val settlementInstitutionId: JsonField<String> = JsonMissing.of(),
    @JsonProperty("settlement_service")
    @ExcludeMissing
    private val settlementService: JsonField<String> = JsonMissing.of(),
    @JsonProperty("updated")
    @ExcludeMissing
    private val updated: JsonField<OffsetDateTime> = JsonMissing.of(),
    @JsonProperty("cycle") @ExcludeMissing private val cycle: JsonField<Long> = JsonMissing.of(),
    @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
) {

    /**
     * Globally unique identifier.
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun token(): String = token.getRequired("token")

    /**
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun amounts(): Amounts = amounts.getRequired("amounts")

    /**
     * RFC 3339 timestamp for when the record was created. UTC time zone.
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun created(): OffsetDateTime = created.getRequired("created")

    /**
     * 3-character alphabetic ISO 4217 code.
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun currency(): String = currency.getRequired("currency")

    /**
     * The institution that activity occurred on. For Mastercard: ICA (Interbank Card Association).
     * For Maestro: institution ID. For Visa: lowest level SRE (Settlement Reporting Entity).
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun institutionId(): String = institutionId.getRequired("institution_id")

    /**
     * Card network where the transaction took place. VISA, MASTERCARD, MAESTRO, or INTERLINK.
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun network(): Network = network.getRequired("network")

    /**
     * Date that the network total record applies to. YYYY-MM-DD format.
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun reportDate(): LocalDate = reportDate.getRequired("report_date")

    /**
     * The institution responsible for settlement. For Mastercard: same as `institution_id`. For
     * Maestro: billing ICA. For Visa: Funds Transfer SRE (FTSRE).
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun settlementInstitutionId(): String =
        settlementInstitutionId.getRequired("settlement_institution_id")

    /**
     * Settlement service.
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun settlementService(): String = settlementService.getRequired("settlement_service")

    /**
     * RFC 3339 timestamp for when the record was last updated. UTC time zone.
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun updated(): OffsetDateTime = updated.getRequired("updated")

    /**
     * The clearing cycle that the network total record applies to. Mastercard only.
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun cycle(): Long? = cycle.getNullable("cycle")

    /**
     * Returns the raw JSON value of [token].
     *
     * Unlike [token], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("token") @ExcludeMissing fun _token(): JsonField<String> = token

    /**
     * Returns the raw JSON value of [amounts].
     *
     * Unlike [amounts], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("amounts") @ExcludeMissing fun _amounts(): JsonField<Amounts> = amounts

    /**
     * Returns the raw JSON value of [created].
     *
     * Unlike [created], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("created") @ExcludeMissing fun _created(): JsonField<OffsetDateTime> = created

    /**
     * Returns the raw JSON value of [currency].
     *
     * Unlike [currency], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("currency") @ExcludeMissing fun _currency(): JsonField<String> = currency

    /**
     * Returns the raw JSON value of [institutionId].
     *
     * Unlike [institutionId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("institution_id")
    @ExcludeMissing
    fun _institutionId(): JsonField<String> = institutionId

    /**
     * Returns the raw JSON value of [network].
     *
     * Unlike [network], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("network") @ExcludeMissing fun _network(): JsonField<Network> = network

    /**
     * Returns the raw JSON value of [reportDate].
     *
     * Unlike [reportDate], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("report_date")
    @ExcludeMissing
    fun _reportDate(): JsonField<LocalDate> = reportDate

    /**
     * Returns the raw JSON value of [settlementInstitutionId].
     *
     * Unlike [settlementInstitutionId], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("settlement_institution_id")
    @ExcludeMissing
    fun _settlementInstitutionId(): JsonField<String> = settlementInstitutionId

    /**
     * Returns the raw JSON value of [settlementService].
     *
     * Unlike [settlementService], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("settlement_service")
    @ExcludeMissing
    fun _settlementService(): JsonField<String> = settlementService

    /**
     * Returns the raw JSON value of [updated].
     *
     * Unlike [updated], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("updated") @ExcludeMissing fun _updated(): JsonField<OffsetDateTime> = updated

    /**
     * Returns the raw JSON value of [cycle].
     *
     * Unlike [cycle], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("cycle") @ExcludeMissing fun _cycle(): JsonField<Long> = cycle

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    private var validated: Boolean = false

    fun validate(): NetworkTotalListResponse = apply {
        if (validated) {
            return@apply
        }

        token()
        amounts().validate()
        created()
        currency()
        institutionId()
        network()
        reportDate()
        settlementInstitutionId()
        settlementService()
        updated()
        cycle()
        validated = true
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [NetworkTotalListResponse].
         *
         * The following fields are required:
         * ```kotlin
         * .token()
         * .amounts()
         * .created()
         * .currency()
         * .institutionId()
         * .network()
         * .reportDate()
         * .settlementInstitutionId()
         * .settlementService()
         * .updated()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [NetworkTotalListResponse]. */
    class Builder internal constructor() {

        private var token: JsonField<String>? = null
        private var amounts: JsonField<Amounts>? = null
        private var created: JsonField<OffsetDateTime>? = null
        private var currency: JsonField<String>? = null
        private var institutionId: JsonField<String>? = null
        private var network: JsonField<Network>? = null
        private var reportDate: JsonField<LocalDate>? = null
        private var settlementInstitutionId: JsonField<String>? = null
        private var settlementService: JsonField<String>? = null
        private var updated: JsonField<OffsetDateTime>? = null
        private var cycle: JsonField<Long> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(networkTotalListResponse: NetworkTotalListResponse) = apply {
            token = networkTotalListResponse.token
            amounts = networkTotalListResponse.amounts
            created = networkTotalListResponse.created
            currency = networkTotalListResponse.currency
            institutionId = networkTotalListResponse.institutionId
            network = networkTotalListResponse.network
            reportDate = networkTotalListResponse.reportDate
            settlementInstitutionId = networkTotalListResponse.settlementInstitutionId
            settlementService = networkTotalListResponse.settlementService
            updated = networkTotalListResponse.updated
            cycle = networkTotalListResponse.cycle
            additionalProperties = networkTotalListResponse.additionalProperties.toMutableMap()
        }

        /** Globally unique identifier. */
        fun token(token: String) = token(JsonField.of(token))

        /**
         * Sets [Builder.token] to an arbitrary JSON value.
         *
         * You should usually call [Builder.token] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun token(token: JsonField<String>) = apply { this.token = token }

        fun amounts(amounts: Amounts) = amounts(JsonField.of(amounts))

        /**
         * Sets [Builder.amounts] to an arbitrary JSON value.
         *
         * You should usually call [Builder.amounts] with a well-typed [Amounts] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun amounts(amounts: JsonField<Amounts>) = apply { this.amounts = amounts }

        /** RFC 3339 timestamp for when the record was created. UTC time zone. */
        fun created(created: OffsetDateTime) = created(JsonField.of(created))

        /**
         * Sets [Builder.created] to an arbitrary JSON value.
         *
         * You should usually call [Builder.created] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun created(created: JsonField<OffsetDateTime>) = apply { this.created = created }

        /** 3-character alphabetic ISO 4217 code. */
        fun currency(currency: String) = currency(JsonField.of(currency))

        /**
         * Sets [Builder.currency] to an arbitrary JSON value.
         *
         * You should usually call [Builder.currency] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun currency(currency: JsonField<String>) = apply { this.currency = currency }

        /**
         * The institution that activity occurred on. For Mastercard: ICA (Interbank Card
         * Association). For Maestro: institution ID. For Visa: lowest level SRE (Settlement
         * Reporting Entity).
         */
        fun institutionId(institutionId: String) = institutionId(JsonField.of(institutionId))

        /**
         * Sets [Builder.institutionId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.institutionId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun institutionId(institutionId: JsonField<String>) = apply {
            this.institutionId = institutionId
        }

        /**
         * Card network where the transaction took place. VISA, MASTERCARD, MAESTRO, or INTERLINK.
         */
        fun network(network: Network) = network(JsonField.of(network))

        /**
         * Sets [Builder.network] to an arbitrary JSON value.
         *
         * You should usually call [Builder.network] with a well-typed [Network] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun network(network: JsonField<Network>) = apply { this.network = network }

        /** Date that the network total record applies to. YYYY-MM-DD format. */
        fun reportDate(reportDate: LocalDate) = reportDate(JsonField.of(reportDate))

        /**
         * Sets [Builder.reportDate] to an arbitrary JSON value.
         *
         * You should usually call [Builder.reportDate] with a well-typed [LocalDate] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun reportDate(reportDate: JsonField<LocalDate>) = apply { this.reportDate = reportDate }

        /**
         * The institution responsible for settlement. For Mastercard: same as `institution_id`. For
         * Maestro: billing ICA. For Visa: Funds Transfer SRE (FTSRE).
         */
        fun settlementInstitutionId(settlementInstitutionId: String) =
            settlementInstitutionId(JsonField.of(settlementInstitutionId))

        /**
         * Sets [Builder.settlementInstitutionId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.settlementInstitutionId] with a well-typed [String]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun settlementInstitutionId(settlementInstitutionId: JsonField<String>) = apply {
            this.settlementInstitutionId = settlementInstitutionId
        }

        /** Settlement service. */
        fun settlementService(settlementService: String) =
            settlementService(JsonField.of(settlementService))

        /**
         * Sets [Builder.settlementService] to an arbitrary JSON value.
         *
         * You should usually call [Builder.settlementService] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun settlementService(settlementService: JsonField<String>) = apply {
            this.settlementService = settlementService
        }

        /** RFC 3339 timestamp for when the record was last updated. UTC time zone. */
        fun updated(updated: OffsetDateTime) = updated(JsonField.of(updated))

        /**
         * Sets [Builder.updated] to an arbitrary JSON value.
         *
         * You should usually call [Builder.updated] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun updated(updated: JsonField<OffsetDateTime>) = apply { this.updated = updated }

        /** The clearing cycle that the network total record applies to. Mastercard only. */
        fun cycle(cycle: Long) = cycle(JsonField.of(cycle))

        /**
         * Sets [Builder.cycle] to an arbitrary JSON value.
         *
         * You should usually call [Builder.cycle] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun cycle(cycle: JsonField<Long>) = apply { this.cycle = cycle }

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

        fun build(): NetworkTotalListResponse =
            NetworkTotalListResponse(
                checkRequired("token", token),
                checkRequired("amounts", amounts),
                checkRequired("created", created),
                checkRequired("currency", currency),
                checkRequired("institutionId", institutionId),
                checkRequired("network", network),
                checkRequired("reportDate", reportDate),
                checkRequired("settlementInstitutionId", settlementInstitutionId),
                checkRequired("settlementService", settlementService),
                checkRequired("updated", updated),
                cycle,
                additionalProperties.toImmutable(),
            )
    }

    @NoAutoDetect
    class Amounts
    @JsonCreator
    private constructor(
        @JsonProperty("gross_settlement")
        @ExcludeMissing
        private val grossSettlement: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("interchange_fees")
        @ExcludeMissing
        private val interchangeFees: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("net_settlement")
        @ExcludeMissing
        private val netSettlement: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("visa_charges")
        @ExcludeMissing
        private val visaCharges: JsonField<Long> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /**
         * Total settlement amount excluding interchange, in currency's smallest unit.
         *
         * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun grossSettlement(): Long = grossSettlement.getRequired("gross_settlement")

        /**
         * Interchange amount, in currency's smallest unit.
         *
         * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun interchangeFees(): Long = interchangeFees.getRequired("interchange_fees")

        /**
         * `gross_settlement` net of `interchange_fees` and `visa_charges` (if applicable), in
         * currency's smallest unit.
         *
         * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun netSettlement(): Long = netSettlement.getRequired("net_settlement")

        /**
         * Charges specific to Visa/Interlink, in currency's smallest unit.
         *
         * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun visaCharges(): Long? = visaCharges.getNullable("visa_charges")

        /**
         * Returns the raw JSON value of [grossSettlement].
         *
         * Unlike [grossSettlement], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("gross_settlement")
        @ExcludeMissing
        fun _grossSettlement(): JsonField<Long> = grossSettlement

        /**
         * Returns the raw JSON value of [interchangeFees].
         *
         * Unlike [interchangeFees], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("interchange_fees")
        @ExcludeMissing
        fun _interchangeFees(): JsonField<Long> = interchangeFees

        /**
         * Returns the raw JSON value of [netSettlement].
         *
         * Unlike [netSettlement], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("net_settlement")
        @ExcludeMissing
        fun _netSettlement(): JsonField<Long> = netSettlement

        /**
         * Returns the raw JSON value of [visaCharges].
         *
         * Unlike [visaCharges], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("visa_charges")
        @ExcludeMissing
        fun _visaCharges(): JsonField<Long> = visaCharges

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): Amounts = apply {
            if (validated) {
                return@apply
            }

            grossSettlement()
            interchangeFees()
            netSettlement()
            visaCharges()
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            /**
             * Returns a mutable builder for constructing an instance of [Amounts].
             *
             * The following fields are required:
             * ```kotlin
             * .grossSettlement()
             * .interchangeFees()
             * .netSettlement()
             * ```
             */
            fun builder() = Builder()
        }

        /** A builder for [Amounts]. */
        class Builder internal constructor() {

            private var grossSettlement: JsonField<Long>? = null
            private var interchangeFees: JsonField<Long>? = null
            private var netSettlement: JsonField<Long>? = null
            private var visaCharges: JsonField<Long> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(amounts: Amounts) = apply {
                grossSettlement = amounts.grossSettlement
                interchangeFees = amounts.interchangeFees
                netSettlement = amounts.netSettlement
                visaCharges = amounts.visaCharges
                additionalProperties = amounts.additionalProperties.toMutableMap()
            }

            /** Total settlement amount excluding interchange, in currency's smallest unit. */
            fun grossSettlement(grossSettlement: Long) =
                grossSettlement(JsonField.of(grossSettlement))

            /**
             * Sets [Builder.grossSettlement] to an arbitrary JSON value.
             *
             * You should usually call [Builder.grossSettlement] with a well-typed [Long] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun grossSettlement(grossSettlement: JsonField<Long>) = apply {
                this.grossSettlement = grossSettlement
            }

            /** Interchange amount, in currency's smallest unit. */
            fun interchangeFees(interchangeFees: Long) =
                interchangeFees(JsonField.of(interchangeFees))

            /**
             * Sets [Builder.interchangeFees] to an arbitrary JSON value.
             *
             * You should usually call [Builder.interchangeFees] with a well-typed [Long] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun interchangeFees(interchangeFees: JsonField<Long>) = apply {
                this.interchangeFees = interchangeFees
            }

            /**
             * `gross_settlement` net of `interchange_fees` and `visa_charges` (if applicable), in
             * currency's smallest unit.
             */
            fun netSettlement(netSettlement: Long) = netSettlement(JsonField.of(netSettlement))

            /**
             * Sets [Builder.netSettlement] to an arbitrary JSON value.
             *
             * You should usually call [Builder.netSettlement] with a well-typed [Long] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun netSettlement(netSettlement: JsonField<Long>) = apply {
                this.netSettlement = netSettlement
            }

            /** Charges specific to Visa/Interlink, in currency's smallest unit. */
            fun visaCharges(visaCharges: Long) = visaCharges(JsonField.of(visaCharges))

            /**
             * Sets [Builder.visaCharges] to an arbitrary JSON value.
             *
             * You should usually call [Builder.visaCharges] with a well-typed [Long] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun visaCharges(visaCharges: JsonField<Long>) = apply { this.visaCharges = visaCharges }

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

            fun build(): Amounts =
                Amounts(
                    checkRequired("grossSettlement", grossSettlement),
                    checkRequired("interchangeFees", interchangeFees),
                    checkRequired("netSettlement", netSettlement),
                    visaCharges,
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Amounts && grossSettlement == other.grossSettlement && interchangeFees == other.interchangeFees && netSettlement == other.netSettlement && visaCharges == other.visaCharges && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(grossSettlement, interchangeFees, netSettlement, visaCharges, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Amounts{grossSettlement=$grossSettlement, interchangeFees=$interchangeFees, netSettlement=$netSettlement, visaCharges=$visaCharges, additionalProperties=$additionalProperties}"
    }

    /** Card network where the transaction took place. VISA, MASTERCARD, MAESTRO, or INTERLINK. */
    class Network @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            val VISA = of("VISA")

            val MASTERCARD = of("MASTERCARD")

            val MAESTRO = of("MAESTRO")

            val INTERLINK = of("INTERLINK")

            fun of(value: String) = Network(JsonField.of(value))
        }

        /** An enum containing [Network]'s known values. */
        enum class Known {
            VISA,
            MASTERCARD,
            MAESTRO,
            INTERLINK,
        }

        /**
         * An enum containing [Network]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Network] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            VISA,
            MASTERCARD,
            MAESTRO,
            INTERLINK,
            /** An enum member indicating that [Network] was instantiated with an unknown value. */
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
                VISA -> Value.VISA
                MASTERCARD -> Value.MASTERCARD
                MAESTRO -> Value.MAESTRO
                INTERLINK -> Value.INTERLINK
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
                VISA -> Known.VISA
                MASTERCARD -> Known.MASTERCARD
                MAESTRO -> Known.MAESTRO
                INTERLINK -> Known.INTERLINK
                else -> throw LithicInvalidDataException("Unknown Network: $value")
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

            return /* spotless:off */ other is Network && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is NetworkTotalListResponse && token == other.token && amounts == other.amounts && created == other.created && currency == other.currency && institutionId == other.institutionId && network == other.network && reportDate == other.reportDate && settlementInstitutionId == other.settlementInstitutionId && settlementService == other.settlementService && updated == other.updated && cycle == other.cycle && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(token, amounts, created, currency, institutionId, network, reportDate, settlementInstitutionId, settlementService, updated, cycle, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "NetworkTotalListResponse{token=$token, amounts=$amounts, created=$created, currency=$currency, institutionId=$institutionId, network=$network, reportDate=$reportDate, settlementInstitutionId=$settlementInstitutionId, settlementService=$settlementService, updated=$updated, cycle=$cycle, additionalProperties=$additionalProperties}"
}
