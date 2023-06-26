package com.lithic.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.lithic.api.core.ExcludeMissing
import com.lithic.api.core.JsonField
import com.lithic.api.core.JsonMissing
import com.lithic.api.core.JsonValue
import com.lithic.api.core.NoAutoDetect
import com.lithic.api.core.toUnmodifiable
import com.lithic.api.errors.LithicInvalidDataException
import java.util.Objects

@JsonDeserialize(builder = Kyc.Builder::class)
@NoAutoDetect
class Kyc
private constructor(
    private val individual: JsonField<Individual>,
    private val kycPassedTimestamp: JsonField<String>,
    private val tosTimestamp: JsonField<String>,
    private val workflow: JsonField<Workflow>,
    private val additionalProperties: Map<String, JsonValue>,
) {

    private var validated: Boolean = false

    private var hashCode: Int = 0

    /** Information on individual for whom the account is being opened and KYC is being run. */
    fun individual(): Individual = individual.getRequired("individual")

    /**
     * An RFC 3339 timestamp indicating when precomputed KYC was completed on the individual with a
     * pass result.
     *
     * This field is required only if workflow type is `KYC_BYO`.
     */
    fun kycPassedTimestamp(): String? = kycPassedTimestamp.getNullable("kyc_passed_timestamp")

    /**
     * An RFC 3339 timestamp indicating when the account holder accepted the applicable legal
     * agreements (e.g., cardholder terms) as agreed upon during API customer's implementation with
     * Lithic.
     */
    fun tosTimestamp(): String = tosTimestamp.getRequired("tos_timestamp")

    /** Specifies the type of KYC workflow to run. */
    fun workflow(): Workflow = workflow.getRequired("workflow")

    /** Information on individual for whom the account is being opened and KYC is being run. */
    @JsonProperty("individual") @ExcludeMissing fun _individual() = individual

    /**
     * An RFC 3339 timestamp indicating when precomputed KYC was completed on the individual with a
     * pass result.
     *
     * This field is required only if workflow type is `KYC_BYO`.
     */
    @JsonProperty("kyc_passed_timestamp")
    @ExcludeMissing
    fun _kycPassedTimestamp() = kycPassedTimestamp

    /**
     * An RFC 3339 timestamp indicating when the account holder accepted the applicable legal
     * agreements (e.g., cardholder terms) as agreed upon during API customer's implementation with
     * Lithic.
     */
    @JsonProperty("tos_timestamp") @ExcludeMissing fun _tosTimestamp() = tosTimestamp

    /** Specifies the type of KYC workflow to run. */
    @JsonProperty("workflow") @ExcludeMissing fun _workflow() = workflow

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    fun validate(): Kyc = apply {
        if (!validated) {
            individual().validate()
            kycPassedTimestamp()
            tosTimestamp()
            workflow()
            validated = true
        }
    }

    fun toBuilder() = Builder().from(this)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is Kyc &&
            this.individual == other.individual &&
            this.kycPassedTimestamp == other.kycPassedTimestamp &&
            this.tosTimestamp == other.tosTimestamp &&
            this.workflow == other.workflow &&
            this.additionalProperties == other.additionalProperties
    }

    override fun hashCode(): Int {
        if (hashCode == 0) {
            hashCode =
                Objects.hash(
                    individual,
                    kycPassedTimestamp,
                    tosTimestamp,
                    workflow,
                    additionalProperties,
                )
        }
        return hashCode
    }

    override fun toString() =
        "Kyc{individual=$individual, kycPassedTimestamp=$kycPassedTimestamp, tosTimestamp=$tosTimestamp, workflow=$workflow, additionalProperties=$additionalProperties}"

    companion object {

        fun builder() = Builder()
    }

    class Builder {

        private var individual: JsonField<Individual> = JsonMissing.of()
        private var kycPassedTimestamp: JsonField<String> = JsonMissing.of()
        private var tosTimestamp: JsonField<String> = JsonMissing.of()
        private var workflow: JsonField<Workflow> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(kyc: Kyc) = apply {
            this.individual = kyc.individual
            this.kycPassedTimestamp = kyc.kycPassedTimestamp
            this.tosTimestamp = kyc.tosTimestamp
            this.workflow = kyc.workflow
            additionalProperties(kyc.additionalProperties)
        }

        /** Information on individual for whom the account is being opened and KYC is being run. */
        fun individual(individual: Individual) = individual(JsonField.of(individual))

        /** Information on individual for whom the account is being opened and KYC is being run. */
        @JsonProperty("individual")
        @ExcludeMissing
        fun individual(individual: JsonField<Individual>) = apply { this.individual = individual }

        /**
         * An RFC 3339 timestamp indicating when precomputed KYC was completed on the individual
         * with a pass result.
         *
         * This field is required only if workflow type is `KYC_BYO`.
         */
        fun kycPassedTimestamp(kycPassedTimestamp: String) =
            kycPassedTimestamp(JsonField.of(kycPassedTimestamp))

        /**
         * An RFC 3339 timestamp indicating when precomputed KYC was completed on the individual
         * with a pass result.
         *
         * This field is required only if workflow type is `KYC_BYO`.
         */
        @JsonProperty("kyc_passed_timestamp")
        @ExcludeMissing
        fun kycPassedTimestamp(kycPassedTimestamp: JsonField<String>) = apply {
            this.kycPassedTimestamp = kycPassedTimestamp
        }

        /**
         * An RFC 3339 timestamp indicating when the account holder accepted the applicable legal
         * agreements (e.g., cardholder terms) as agreed upon during API customer's implementation
         * with Lithic.
         */
        fun tosTimestamp(tosTimestamp: String) = tosTimestamp(JsonField.of(tosTimestamp))

        /**
         * An RFC 3339 timestamp indicating when the account holder accepted the applicable legal
         * agreements (e.g., cardholder terms) as agreed upon during API customer's implementation
         * with Lithic.
         */
        @JsonProperty("tos_timestamp")
        @ExcludeMissing
        fun tosTimestamp(tosTimestamp: JsonField<String>) = apply {
            this.tosTimestamp = tosTimestamp
        }

        /** Specifies the type of KYC workflow to run. */
        fun workflow(workflow: Workflow) = workflow(JsonField.of(workflow))

        /** Specifies the type of KYC workflow to run. */
        @JsonProperty("workflow")
        @ExcludeMissing
        fun workflow(workflow: JsonField<Workflow>) = apply { this.workflow = workflow }

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

        fun build(): Kyc =
            Kyc(
                individual,
                kycPassedTimestamp,
                tosTimestamp,
                workflow,
                additionalProperties.toUnmodifiable(),
            )
    }

    /** Information on individual for whom the account is being opened and KYC is being run. */
    @JsonDeserialize(builder = Individual.Builder::class)
    @NoAutoDetect
    class Individual
    private constructor(
        private val address: JsonField<Address>,
        private val dob: JsonField<String>,
        private val email: JsonField<String>,
        private val firstName: JsonField<String>,
        private val governmentId: JsonField<String>,
        private val lastName: JsonField<String>,
        private val phoneNumber: JsonField<String>,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var validated: Boolean = false

        private var hashCode: Int = 0

        /**
         * Individual's current address - PO boxes, UPS drops, and FedEx drops are not acceptable;
         * APO/FPO are acceptable. Only USA addresses are currently supported.
         */
        fun address(): Address = address.getRequired("address")

        /** Individual's date of birth, as an RFC 3339 date. */
        fun dob(): String = dob.getRequired("dob")

        /**
         * Individual's email address. If utilizing Lithic for chargeback processing, this customer
         * email address may be used to communicate dispute status and resolution.
         */
        fun email(): String = email.getRequired("email")

        /** Individual's first name, as it appears on government-issued identity documents. */
        fun firstName(): String = firstName.getRequired("first_name")

        /**
         * Government-issued identification number (required for identity verification and
         * compliance with banking regulations). Social Security Numbers (SSN) and Individual
         * Taxpayer Identification Numbers (ITIN) are currently supported, entered as full
         * nine-digits, with or without hyphens
         */
        fun governmentId(): String = governmentId.getRequired("government_id")

        /** Individual's last name, as it appears on government-issued identity documents. */
        fun lastName(): String = lastName.getRequired("last_name")

        /** Individual's phone number, entered in E.164 format. */
        fun phoneNumber(): String = phoneNumber.getRequired("phone_number")

        /**
         * Individual's current address - PO boxes, UPS drops, and FedEx drops are not acceptable;
         * APO/FPO are acceptable. Only USA addresses are currently supported.
         */
        @JsonProperty("address") @ExcludeMissing fun _address() = address

        /** Individual's date of birth, as an RFC 3339 date. */
        @JsonProperty("dob") @ExcludeMissing fun _dob() = dob

        /**
         * Individual's email address. If utilizing Lithic for chargeback processing, this customer
         * email address may be used to communicate dispute status and resolution.
         */
        @JsonProperty("email") @ExcludeMissing fun _email() = email

        /** Individual's first name, as it appears on government-issued identity documents. */
        @JsonProperty("first_name") @ExcludeMissing fun _firstName() = firstName

        /**
         * Government-issued identification number (required for identity verification and
         * compliance with banking regulations). Social Security Numbers (SSN) and Individual
         * Taxpayer Identification Numbers (ITIN) are currently supported, entered as full
         * nine-digits, with or without hyphens
         */
        @JsonProperty("government_id") @ExcludeMissing fun _governmentId() = governmentId

        /** Individual's last name, as it appears on government-issued identity documents. */
        @JsonProperty("last_name") @ExcludeMissing fun _lastName() = lastName

        /** Individual's phone number, entered in E.164 format. */
        @JsonProperty("phone_number") @ExcludeMissing fun _phoneNumber() = phoneNumber

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun validate(): Individual = apply {
            if (!validated) {
                address().validate()
                dob()
                email()
                firstName()
                governmentId()
                lastName()
                phoneNumber()
                validated = true
            }
        }

        fun toBuilder() = Builder().from(this)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Individual &&
                this.address == other.address &&
                this.dob == other.dob &&
                this.email == other.email &&
                this.firstName == other.firstName &&
                this.governmentId == other.governmentId &&
                this.lastName == other.lastName &&
                this.phoneNumber == other.phoneNumber &&
                this.additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode =
                    Objects.hash(
                        address,
                        dob,
                        email,
                        firstName,
                        governmentId,
                        lastName,
                        phoneNumber,
                        additionalProperties,
                    )
            }
            return hashCode
        }

        override fun toString() =
            "Individual{address=$address, dob=$dob, email=$email, firstName=$firstName, governmentId=$governmentId, lastName=$lastName, phoneNumber=$phoneNumber, additionalProperties=$additionalProperties}"

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var address: JsonField<Address> = JsonMissing.of()
            private var dob: JsonField<String> = JsonMissing.of()
            private var email: JsonField<String> = JsonMissing.of()
            private var firstName: JsonField<String> = JsonMissing.of()
            private var governmentId: JsonField<String> = JsonMissing.of()
            private var lastName: JsonField<String> = JsonMissing.of()
            private var phoneNumber: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(individual: Individual) = apply {
                this.address = individual.address
                this.dob = individual.dob
                this.email = individual.email
                this.firstName = individual.firstName
                this.governmentId = individual.governmentId
                this.lastName = individual.lastName
                this.phoneNumber = individual.phoneNumber
                additionalProperties(individual.additionalProperties)
            }

            /**
             * Individual's current address - PO boxes, UPS drops, and FedEx drops are not
             * acceptable; APO/FPO are acceptable. Only USA addresses are currently supported.
             */
            fun address(address: Address) = address(JsonField.of(address))

            /**
             * Individual's current address - PO boxes, UPS drops, and FedEx drops are not
             * acceptable; APO/FPO are acceptable. Only USA addresses are currently supported.
             */
            @JsonProperty("address")
            @ExcludeMissing
            fun address(address: JsonField<Address>) = apply { this.address = address }

            /** Individual's date of birth, as an RFC 3339 date. */
            fun dob(dob: String) = dob(JsonField.of(dob))

            /** Individual's date of birth, as an RFC 3339 date. */
            @JsonProperty("dob")
            @ExcludeMissing
            fun dob(dob: JsonField<String>) = apply { this.dob = dob }

            /**
             * Individual's email address. If utilizing Lithic for chargeback processing, this
             * customer email address may be used to communicate dispute status and resolution.
             */
            fun email(email: String) = email(JsonField.of(email))

            /**
             * Individual's email address. If utilizing Lithic for chargeback processing, this
             * customer email address may be used to communicate dispute status and resolution.
             */
            @JsonProperty("email")
            @ExcludeMissing
            fun email(email: JsonField<String>) = apply { this.email = email }

            /** Individual's first name, as it appears on government-issued identity documents. */
            fun firstName(firstName: String) = firstName(JsonField.of(firstName))

            /** Individual's first name, as it appears on government-issued identity documents. */
            @JsonProperty("first_name")
            @ExcludeMissing
            fun firstName(firstName: JsonField<String>) = apply { this.firstName = firstName }

            /**
             * Government-issued identification number (required for identity verification and
             * compliance with banking regulations). Social Security Numbers (SSN) and Individual
             * Taxpayer Identification Numbers (ITIN) are currently supported, entered as full
             * nine-digits, with or without hyphens
             */
            fun governmentId(governmentId: String) = governmentId(JsonField.of(governmentId))

            /**
             * Government-issued identification number (required for identity verification and
             * compliance with banking regulations). Social Security Numbers (SSN) and Individual
             * Taxpayer Identification Numbers (ITIN) are currently supported, entered as full
             * nine-digits, with or without hyphens
             */
            @JsonProperty("government_id")
            @ExcludeMissing
            fun governmentId(governmentId: JsonField<String>) = apply {
                this.governmentId = governmentId
            }

            /** Individual's last name, as it appears on government-issued identity documents. */
            fun lastName(lastName: String) = lastName(JsonField.of(lastName))

            /** Individual's last name, as it appears on government-issued identity documents. */
            @JsonProperty("last_name")
            @ExcludeMissing
            fun lastName(lastName: JsonField<String>) = apply { this.lastName = lastName }

            /** Individual's phone number, entered in E.164 format. */
            fun phoneNumber(phoneNumber: String) = phoneNumber(JsonField.of(phoneNumber))

            /** Individual's phone number, entered in E.164 format. */
            @JsonProperty("phone_number")
            @ExcludeMissing
            fun phoneNumber(phoneNumber: JsonField<String>) = apply {
                this.phoneNumber = phoneNumber
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

            fun build(): Individual =
                Individual(
                    address,
                    dob,
                    email,
                    firstName,
                    governmentId,
                    lastName,
                    phoneNumber,
                    additionalProperties.toUnmodifiable(),
                )
        }
    }

    class Workflow
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Workflow && this.value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()

        companion object {

            val KYC_ADVANCED = Workflow(JsonField.of("KYC_ADVANCED"))

            val KYC_BASIC = Workflow(JsonField.of("KYC_BASIC"))

            val KYC_BYO = Workflow(JsonField.of("KYC_BYO"))

            fun of(value: String) = Workflow(JsonField.of(value))
        }

        enum class Known {
            KYC_ADVANCED,
            KYC_BASIC,
            KYC_BYO,
        }

        enum class Value {
            KYC_ADVANCED,
            KYC_BASIC,
            KYC_BYO,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                KYC_ADVANCED -> Value.KYC_ADVANCED
                KYC_BASIC -> Value.KYC_BASIC
                KYC_BYO -> Value.KYC_BYO
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                KYC_ADVANCED -> Known.KYC_ADVANCED
                KYC_BASIC -> Known.KYC_BASIC
                KYC_BYO -> Known.KYC_BYO
                else -> throw LithicInvalidDataException("Unknown Workflow: $value")
            }

        fun asString(): String = _value().asStringOrThrow()
    }
}
