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
import java.time.LocalDate
import java.time.OffsetDateTime
import java.util.Objects

@JsonDeserialize(builder = ExternalBankAccountCreateResponse.Builder::class)
@NoAutoDetect
class ExternalBankAccountCreateResponse
private constructor(
    private val token: JsonField<String>,
    private val type: JsonField<Type>,
    private val verificationMethod: JsonField<VerificationMethod>,
    private val ownerType: JsonField<OwnerType>,
    private val owner: JsonField<String>,
    private val state: JsonField<State>,
    private val verificationState: JsonField<VerificationState>,
    private val routingNumber: JsonField<String>,
    private val lastFour: JsonField<String>,
    private val name: JsonField<String>,
    private val currency: JsonField<String>,
    private val country: JsonField<String>,
    private val accountToken: JsonField<String>,
    private val created: JsonField<OffsetDateTime>,
    private val companyId: JsonField<String>,
    private val address: JsonField<ExternalBankAccountAddress>,
    private val dob: JsonField<LocalDate>,
    private val doingBusinessAs: JsonField<String>,
    private val additionalProperties: Map<String, JsonValue>,
) {

    private var validated: Boolean = false

    private var hashCode: Int = 0

    /**
     * A globally unique identifier for this record of an external bank account association. If a
     * program links an external bank account to more than one end-user or to both the program and
     * the end-user, then Lithic will return each record of the association
     */
    fun token(): String = token.getRequired("token")

    fun type(): Type = type.getRequired("type")

    fun verificationMethod(): VerificationMethod =
        verificationMethod.getRequired("verification_method")

    fun ownerType(): OwnerType = ownerType.getRequired("owner_type")

    /**
     * Legal Name of the business or individual who owns the external account. This will appear in
     * statements
     */
    fun owner(): String = owner.getRequired("owner")

    fun state(): State = state.getRequired("state")

    fun verificationState(): VerificationState = verificationState.getRequired("verification_state")

    fun routingNumber(): String = routingNumber.getRequired("routing_number")

    /** The last 4 digits of the bank account. Derived by Lithic from the account number passed */
    fun lastFour(): String = lastFour.getRequired("last_four")

    /** The nickname given to this record of External Bank Account */
    fun name(): String? = name.getNullable("name")

    /** currency of the external account 3-digit alphabetic ISO 4217 code */
    fun currency(): String = currency.getRequired("currency")

    /**
     * The country that the bank account is located in using ISO 3166-1. We will only accept US bank
     * accounts e.g., US
     */
    fun country(): String = country.getRequired("country")

    /**
     * Indicates which Lithic account the external account is associated with. For external accounts
     * that are associated with the program, account_token field returned will be null
     */
    fun accountToken(): String? = accountToken.getNullable("account_token")

    /** An ISO 8601 string representing when this funding source was added to the Lithic account. */
    fun created(): OffsetDateTime = created.getRequired("created")

    /** Optional field that helps identify bank accounts in receipts */
    fun companyId(): String? = companyId.getNullable("company_id")

    /**
     * Address used during Address Verification Service (AVS) checks during transactions if enabled
     * via Auth Rules.
     */
    fun address(): ExternalBankAccountAddress? = address.getNullable("address")

    /** Date of Birth of the Individual that owns the external bank account */
    fun dob(): LocalDate? = dob.getNullable("dob")

    fun doingBusinessAs(): String? = doingBusinessAs.getNullable("doing_business_as")

    /**
     * A globally unique identifier for this record of an external bank account association. If a
     * program links an external bank account to more than one end-user or to both the program and
     * the end-user, then Lithic will return each record of the association
     */
    @JsonProperty("token") @ExcludeMissing fun _token() = token

    @JsonProperty("type") @ExcludeMissing fun _type() = type

    @JsonProperty("verification_method")
    @ExcludeMissing
    fun _verificationMethod() = verificationMethod

    @JsonProperty("owner_type") @ExcludeMissing fun _ownerType() = ownerType

    /**
     * Legal Name of the business or individual who owns the external account. This will appear in
     * statements
     */
    @JsonProperty("owner") @ExcludeMissing fun _owner() = owner

    @JsonProperty("state") @ExcludeMissing fun _state() = state

    @JsonProperty("verification_state") @ExcludeMissing fun _verificationState() = verificationState

    @JsonProperty("routing_number") @ExcludeMissing fun _routingNumber() = routingNumber

    /** The last 4 digits of the bank account. Derived by Lithic from the account number passed */
    @JsonProperty("last_four") @ExcludeMissing fun _lastFour() = lastFour

    /** The nickname given to this record of External Bank Account */
    @JsonProperty("name") @ExcludeMissing fun _name() = name

    /** currency of the external account 3-digit alphabetic ISO 4217 code */
    @JsonProperty("currency") @ExcludeMissing fun _currency() = currency

    /**
     * The country that the bank account is located in using ISO 3166-1. We will only accept US bank
     * accounts e.g., US
     */
    @JsonProperty("country") @ExcludeMissing fun _country() = country

    /**
     * Indicates which Lithic account the external account is associated with. For external accounts
     * that are associated with the program, account_token field returned will be null
     */
    @JsonProperty("account_token") @ExcludeMissing fun _accountToken() = accountToken

    /** An ISO 8601 string representing when this funding source was added to the Lithic account. */
    @JsonProperty("created") @ExcludeMissing fun _created() = created

    /** Optional field that helps identify bank accounts in receipts */
    @JsonProperty("company_id") @ExcludeMissing fun _companyId() = companyId

    /**
     * Address used during Address Verification Service (AVS) checks during transactions if enabled
     * via Auth Rules.
     */
    @JsonProperty("address") @ExcludeMissing fun _address() = address

    /** Date of Birth of the Individual that owns the external bank account */
    @JsonProperty("dob") @ExcludeMissing fun _dob() = dob

    @JsonProperty("doing_business_as") @ExcludeMissing fun _doingBusinessAs() = doingBusinessAs

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    fun validate(): ExternalBankAccountCreateResponse = apply {
        if (!validated) {
            token()
            type()
            verificationMethod()
            ownerType()
            owner()
            state()
            verificationState()
            routingNumber()
            lastFour()
            name()
            currency()
            country()
            accountToken()
            created()
            companyId()
            address()?.validate()
            dob()
            doingBusinessAs()
            validated = true
        }
    }

    fun toBuilder() = Builder().from(this)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ExternalBankAccountCreateResponse &&
            this.token == other.token &&
            this.type == other.type &&
            this.verificationMethod == other.verificationMethod &&
            this.ownerType == other.ownerType &&
            this.owner == other.owner &&
            this.state == other.state &&
            this.verificationState == other.verificationState &&
            this.routingNumber == other.routingNumber &&
            this.lastFour == other.lastFour &&
            this.name == other.name &&
            this.currency == other.currency &&
            this.country == other.country &&
            this.accountToken == other.accountToken &&
            this.created == other.created &&
            this.companyId == other.companyId &&
            this.address == other.address &&
            this.dob == other.dob &&
            this.doingBusinessAs == other.doingBusinessAs &&
            this.additionalProperties == other.additionalProperties
    }

    override fun hashCode(): Int {
        if (hashCode == 0) {
            hashCode =
                Objects.hash(
                    token,
                    type,
                    verificationMethod,
                    ownerType,
                    owner,
                    state,
                    verificationState,
                    routingNumber,
                    lastFour,
                    name,
                    currency,
                    country,
                    accountToken,
                    created,
                    companyId,
                    address,
                    dob,
                    doingBusinessAs,
                    additionalProperties,
                )
        }
        return hashCode
    }

    override fun toString() =
        "ExternalBankAccountCreateResponse{token=$token, type=$type, verificationMethod=$verificationMethod, ownerType=$ownerType, owner=$owner, state=$state, verificationState=$verificationState, routingNumber=$routingNumber, lastFour=$lastFour, name=$name, currency=$currency, country=$country, accountToken=$accountToken, created=$created, companyId=$companyId, address=$address, dob=$dob, doingBusinessAs=$doingBusinessAs, additionalProperties=$additionalProperties}"

    companion object {

        fun builder() = Builder()
    }

    class Builder {

        private var token: JsonField<String> = JsonMissing.of()
        private var type: JsonField<Type> = JsonMissing.of()
        private var verificationMethod: JsonField<VerificationMethod> = JsonMissing.of()
        private var ownerType: JsonField<OwnerType> = JsonMissing.of()
        private var owner: JsonField<String> = JsonMissing.of()
        private var state: JsonField<State> = JsonMissing.of()
        private var verificationState: JsonField<VerificationState> = JsonMissing.of()
        private var routingNumber: JsonField<String> = JsonMissing.of()
        private var lastFour: JsonField<String> = JsonMissing.of()
        private var name: JsonField<String> = JsonMissing.of()
        private var currency: JsonField<String> = JsonMissing.of()
        private var country: JsonField<String> = JsonMissing.of()
        private var accountToken: JsonField<String> = JsonMissing.of()
        private var created: JsonField<OffsetDateTime> = JsonMissing.of()
        private var companyId: JsonField<String> = JsonMissing.of()
        private var address: JsonField<ExternalBankAccountAddress> = JsonMissing.of()
        private var dob: JsonField<LocalDate> = JsonMissing.of()
        private var doingBusinessAs: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(externalBankAccountCreateResponse: ExternalBankAccountCreateResponse) =
            apply {
                this.token = externalBankAccountCreateResponse.token
                this.type = externalBankAccountCreateResponse.type
                this.verificationMethod = externalBankAccountCreateResponse.verificationMethod
                this.ownerType = externalBankAccountCreateResponse.ownerType
                this.owner = externalBankAccountCreateResponse.owner
                this.state = externalBankAccountCreateResponse.state
                this.verificationState = externalBankAccountCreateResponse.verificationState
                this.routingNumber = externalBankAccountCreateResponse.routingNumber
                this.lastFour = externalBankAccountCreateResponse.lastFour
                this.name = externalBankAccountCreateResponse.name
                this.currency = externalBankAccountCreateResponse.currency
                this.country = externalBankAccountCreateResponse.country
                this.accountToken = externalBankAccountCreateResponse.accountToken
                this.created = externalBankAccountCreateResponse.created
                this.companyId = externalBankAccountCreateResponse.companyId
                this.address = externalBankAccountCreateResponse.address
                this.dob = externalBankAccountCreateResponse.dob
                this.doingBusinessAs = externalBankAccountCreateResponse.doingBusinessAs
                additionalProperties(externalBankAccountCreateResponse.additionalProperties)
            }

        /**
         * A globally unique identifier for this record of an external bank account association. If
         * a program links an external bank account to more than one end-user or to both the program
         * and the end-user, then Lithic will return each record of the association
         */
        fun token(token: String) = token(JsonField.of(token))

        /**
         * A globally unique identifier for this record of an external bank account association. If
         * a program links an external bank account to more than one end-user or to both the program
         * and the end-user, then Lithic will return each record of the association
         */
        @JsonProperty("token")
        @ExcludeMissing
        fun token(token: JsonField<String>) = apply { this.token = token }

        fun type(type: Type) = type(JsonField.of(type))

        @JsonProperty("type")
        @ExcludeMissing
        fun type(type: JsonField<Type>) = apply { this.type = type }

        fun verificationMethod(verificationMethod: VerificationMethod) =
            verificationMethod(JsonField.of(verificationMethod))

        @JsonProperty("verification_method")
        @ExcludeMissing
        fun verificationMethod(verificationMethod: JsonField<VerificationMethod>) = apply {
            this.verificationMethod = verificationMethod
        }

        fun ownerType(ownerType: OwnerType) = ownerType(JsonField.of(ownerType))

        @JsonProperty("owner_type")
        @ExcludeMissing
        fun ownerType(ownerType: JsonField<OwnerType>) = apply { this.ownerType = ownerType }

        /**
         * Legal Name of the business or individual who owns the external account. This will appear
         * in statements
         */
        fun owner(owner: String) = owner(JsonField.of(owner))

        /**
         * Legal Name of the business or individual who owns the external account. This will appear
         * in statements
         */
        @JsonProperty("owner")
        @ExcludeMissing
        fun owner(owner: JsonField<String>) = apply { this.owner = owner }

        fun state(state: State) = state(JsonField.of(state))

        @JsonProperty("state")
        @ExcludeMissing
        fun state(state: JsonField<State>) = apply { this.state = state }

        fun verificationState(verificationState: VerificationState) =
            verificationState(JsonField.of(verificationState))

        @JsonProperty("verification_state")
        @ExcludeMissing
        fun verificationState(verificationState: JsonField<VerificationState>) = apply {
            this.verificationState = verificationState
        }

        fun routingNumber(routingNumber: String) = routingNumber(JsonField.of(routingNumber))

        @JsonProperty("routing_number")
        @ExcludeMissing
        fun routingNumber(routingNumber: JsonField<String>) = apply {
            this.routingNumber = routingNumber
        }

        /**
         * The last 4 digits of the bank account. Derived by Lithic from the account number passed
         */
        fun lastFour(lastFour: String) = lastFour(JsonField.of(lastFour))

        /**
         * The last 4 digits of the bank account. Derived by Lithic from the account number passed
         */
        @JsonProperty("last_four")
        @ExcludeMissing
        fun lastFour(lastFour: JsonField<String>) = apply { this.lastFour = lastFour }

        /** The nickname given to this record of External Bank Account */
        fun name(name: String) = name(JsonField.of(name))

        /** The nickname given to this record of External Bank Account */
        @JsonProperty("name")
        @ExcludeMissing
        fun name(name: JsonField<String>) = apply { this.name = name }

        /** currency of the external account 3-digit alphabetic ISO 4217 code */
        fun currency(currency: String) = currency(JsonField.of(currency))

        /** currency of the external account 3-digit alphabetic ISO 4217 code */
        @JsonProperty("currency")
        @ExcludeMissing
        fun currency(currency: JsonField<String>) = apply { this.currency = currency }

        /**
         * The country that the bank account is located in using ISO 3166-1. We will only accept US
         * bank accounts e.g., US
         */
        fun country(country: String) = country(JsonField.of(country))

        /**
         * The country that the bank account is located in using ISO 3166-1. We will only accept US
         * bank accounts e.g., US
         */
        @JsonProperty("country")
        @ExcludeMissing
        fun country(country: JsonField<String>) = apply { this.country = country }

        /**
         * Indicates which Lithic account the external account is associated with. For external
         * accounts that are associated with the program, account_token field returned will be null
         */
        fun accountToken(accountToken: String) = accountToken(JsonField.of(accountToken))

        /**
         * Indicates which Lithic account the external account is associated with. For external
         * accounts that are associated with the program, account_token field returned will be null
         */
        @JsonProperty("account_token")
        @ExcludeMissing
        fun accountToken(accountToken: JsonField<String>) = apply {
            this.accountToken = accountToken
        }

        /**
         * An ISO 8601 string representing when this funding source was added to the Lithic account.
         */
        fun created(created: OffsetDateTime) = created(JsonField.of(created))

        /**
         * An ISO 8601 string representing when this funding source was added to the Lithic account.
         */
        @JsonProperty("created")
        @ExcludeMissing
        fun created(created: JsonField<OffsetDateTime>) = apply { this.created = created }

        /** Optional field that helps identify bank accounts in receipts */
        fun companyId(companyId: String) = companyId(JsonField.of(companyId))

        /** Optional field that helps identify bank accounts in receipts */
        @JsonProperty("company_id")
        @ExcludeMissing
        fun companyId(companyId: JsonField<String>) = apply { this.companyId = companyId }

        /**
         * Address used during Address Verification Service (AVS) checks during transactions if
         * enabled via Auth Rules.
         */
        fun address(address: ExternalBankAccountAddress) = address(JsonField.of(address))

        /**
         * Address used during Address Verification Service (AVS) checks during transactions if
         * enabled via Auth Rules.
         */
        @JsonProperty("address")
        @ExcludeMissing
        fun address(address: JsonField<ExternalBankAccountAddress>) = apply {
            this.address = address
        }

        /** Date of Birth of the Individual that owns the external bank account */
        fun dob(dob: LocalDate) = dob(JsonField.of(dob))

        /** Date of Birth of the Individual that owns the external bank account */
        @JsonProperty("dob")
        @ExcludeMissing
        fun dob(dob: JsonField<LocalDate>) = apply { this.dob = dob }

        fun doingBusinessAs(doingBusinessAs: String) =
            doingBusinessAs(JsonField.of(doingBusinessAs))

        @JsonProperty("doing_business_as")
        @ExcludeMissing
        fun doingBusinessAs(doingBusinessAs: JsonField<String>) = apply {
            this.doingBusinessAs = doingBusinessAs
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

        fun build(): ExternalBankAccountCreateResponse =
            ExternalBankAccountCreateResponse(
                token,
                type,
                verificationMethod,
                ownerType,
                owner,
                state,
                verificationState,
                routingNumber,
                lastFour,
                name,
                currency,
                country,
                accountToken,
                created,
                companyId,
                address,
                dob,
                doingBusinessAs,
                additionalProperties.toUnmodifiable(),
            )
    }

    class Type
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Type && this.value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()

        companion object {

            val CHECKING = Type(JsonField.of("CHECKING"))

            val SAVINGS = Type(JsonField.of("SAVINGS"))

            fun of(value: String) = Type(JsonField.of(value))
        }

        enum class Known {
            CHECKING,
            SAVINGS,
        }

        enum class Value {
            CHECKING,
            SAVINGS,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                CHECKING -> Value.CHECKING
                SAVINGS -> Value.SAVINGS
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                CHECKING -> Known.CHECKING
                SAVINGS -> Known.SAVINGS
                else -> throw LithicInvalidDataException("Unknown Type: $value")
            }

        fun asString(): String = _value().asStringOrThrow()
    }

    class VerificationMethod
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is VerificationMethod && this.value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()

        companion object {

            val MANUAL = VerificationMethod(JsonField.of("MANUAL"))

            val MICRO_DEPOSIT = VerificationMethod(JsonField.of("MICRO_DEPOSIT"))

            val PLAID = VerificationMethod(JsonField.of("PLAID"))

            fun of(value: String) = VerificationMethod(JsonField.of(value))
        }

        enum class Known {
            MANUAL,
            MICRO_DEPOSIT,
            PLAID,
        }

        enum class Value {
            MANUAL,
            MICRO_DEPOSIT,
            PLAID,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                MANUAL -> Value.MANUAL
                MICRO_DEPOSIT -> Value.MICRO_DEPOSIT
                PLAID -> Value.PLAID
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                MANUAL -> Known.MANUAL
                MICRO_DEPOSIT -> Known.MICRO_DEPOSIT
                PLAID -> Known.PLAID
                else -> throw LithicInvalidDataException("Unknown VerificationMethod: $value")
            }

        fun asString(): String = _value().asStringOrThrow()
    }

    class OwnerType
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is OwnerType && this.value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()

        companion object {

            val INDIVIDUAL = OwnerType(JsonField.of("INDIVIDUAL"))

            val BUSINESS = OwnerType(JsonField.of("BUSINESS"))

            fun of(value: String) = OwnerType(JsonField.of(value))
        }

        enum class Known {
            INDIVIDUAL,
            BUSINESS,
        }

        enum class Value {
            INDIVIDUAL,
            BUSINESS,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                INDIVIDUAL -> Value.INDIVIDUAL
                BUSINESS -> Value.BUSINESS
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                INDIVIDUAL -> Known.INDIVIDUAL
                BUSINESS -> Known.BUSINESS
                else -> throw LithicInvalidDataException("Unknown OwnerType: $value")
            }

        fun asString(): String = _value().asStringOrThrow()
    }

    class State
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is State && this.value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()

        companion object {

            val ENABLED = State(JsonField.of("ENABLED"))

            val CLOSED = State(JsonField.of("CLOSED"))

            val PAUSED = State(JsonField.of("PAUSED"))

            fun of(value: String) = State(JsonField.of(value))
        }

        enum class Known {
            ENABLED,
            CLOSED,
            PAUSED,
        }

        enum class Value {
            ENABLED,
            CLOSED,
            PAUSED,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                ENABLED -> Value.ENABLED
                CLOSED -> Value.CLOSED
                PAUSED -> Value.PAUSED
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                ENABLED -> Known.ENABLED
                CLOSED -> Known.CLOSED
                PAUSED -> Known.PAUSED
                else -> throw LithicInvalidDataException("Unknown State: $value")
            }

        fun asString(): String = _value().asStringOrThrow()
    }

    class VerificationState
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is VerificationState && this.value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()

        companion object {

            val PENDING = VerificationState(JsonField.of("PENDING"))

            val ENABLED = VerificationState(JsonField.of("ENABLED"))

            val FAILED_VERIFICATION = VerificationState(JsonField.of("FAILED_VERIFICATION"))

            fun of(value: String) = VerificationState(JsonField.of(value))
        }

        enum class Known {
            PENDING,
            ENABLED,
            FAILED_VERIFICATION,
        }

        enum class Value {
            PENDING,
            ENABLED,
            FAILED_VERIFICATION,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                PENDING -> Value.PENDING
                ENABLED -> Value.ENABLED
                FAILED_VERIFICATION -> Value.FAILED_VERIFICATION
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                PENDING -> Known.PENDING
                ENABLED -> Known.ENABLED
                FAILED_VERIFICATION -> Known.FAILED_VERIFICATION
                else -> throw LithicInvalidDataException("Unknown VerificationState: $value")
            }

        fun asString(): String = _value().asStringOrThrow()
    }
}