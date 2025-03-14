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
class ExternalBankAccountRetryMicroDepositsResponse
@JsonCreator
private constructor(
    @JsonProperty("token") @ExcludeMissing private val token: JsonField<String> = JsonMissing.of(),
    @JsonProperty("country")
    @ExcludeMissing
    private val country: JsonField<String> = JsonMissing.of(),
    @JsonProperty("created")
    @ExcludeMissing
    private val created: JsonField<OffsetDateTime> = JsonMissing.of(),
    @JsonProperty("currency")
    @ExcludeMissing
    private val currency: JsonField<String> = JsonMissing.of(),
    @JsonProperty("last_four")
    @ExcludeMissing
    private val lastFour: JsonField<String> = JsonMissing.of(),
    @JsonProperty("owner") @ExcludeMissing private val owner: JsonField<String> = JsonMissing.of(),
    @JsonProperty("owner_type")
    @ExcludeMissing
    private val ownerType: JsonField<OwnerType> = JsonMissing.of(),
    @JsonProperty("routing_number")
    @ExcludeMissing
    private val routingNumber: JsonField<String> = JsonMissing.of(),
    @JsonProperty("state") @ExcludeMissing private val state: JsonField<State> = JsonMissing.of(),
    @JsonProperty("type") @ExcludeMissing private val type: JsonField<Type> = JsonMissing.of(),
    @JsonProperty("verification_attempts")
    @ExcludeMissing
    private val verificationAttempts: JsonField<Long> = JsonMissing.of(),
    @JsonProperty("verification_method")
    @ExcludeMissing
    private val verificationMethod: JsonField<VerificationMethod> = JsonMissing.of(),
    @JsonProperty("verification_state")
    @ExcludeMissing
    private val verificationState: JsonField<VerificationState> = JsonMissing.of(),
    @JsonProperty("account_token")
    @ExcludeMissing
    private val accountToken: JsonField<String> = JsonMissing.of(),
    @JsonProperty("address")
    @ExcludeMissing
    private val address: JsonField<ExternalBankAccountAddress> = JsonMissing.of(),
    @JsonProperty("company_id")
    @ExcludeMissing
    private val companyId: JsonField<String> = JsonMissing.of(),
    @JsonProperty("dob") @ExcludeMissing private val dob: JsonField<LocalDate> = JsonMissing.of(),
    @JsonProperty("doing_business_as")
    @ExcludeMissing
    private val doingBusinessAs: JsonField<String> = JsonMissing.of(),
    @JsonProperty("financial_account_token")
    @ExcludeMissing
    private val financialAccountToken: JsonField<String> = JsonMissing.of(),
    @JsonProperty("name") @ExcludeMissing private val name: JsonField<String> = JsonMissing.of(),
    @JsonProperty("user_defined_id")
    @ExcludeMissing
    private val userDefinedId: JsonField<String> = JsonMissing.of(),
    @JsonProperty("verification_failed_reason")
    @ExcludeMissing
    private val verificationFailedReason: JsonField<String> = JsonMissing.of(),
    @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
) {

    /**
     * A globally unique identifier for this record of an external bank account association. If a
     * program links an external bank account to more than one end-user or to both the program and
     * the end-user, then Lithic will return each record of the association
     */
    fun token(): String = token.getRequired("token")

    /**
     * The country that the bank account is located in using ISO 3166-1. We will only accept USA
     * bank accounts e.g., USA
     */
    fun country(): String = country.getRequired("country")

    /** An ISO 8601 string representing when this funding source was added to the Lithic account. */
    fun created(): OffsetDateTime = created.getRequired("created")

    /** currency of the external account 3-character alphabetic ISO 4217 code */
    fun currency(): String = currency.getRequired("currency")

    /** The last 4 digits of the bank account. Derived by Lithic from the account number passed */
    fun lastFour(): String = lastFour.getRequired("last_four")

    /**
     * Legal Name of the business or individual who owns the external account. This will appear in
     * statements
     */
    fun owner(): String = owner.getRequired("owner")

    /** Owner Type */
    fun ownerType(): OwnerType = ownerType.getRequired("owner_type")

    /** Routing Number */
    fun routingNumber(): String = routingNumber.getRequired("routing_number")

    /** Account State */
    fun state(): State = state.getRequired("state")

    /** Account Type */
    fun type(): Type = type.getRequired("type")

    /** The number of attempts at verification */
    fun verificationAttempts(): Long = verificationAttempts.getRequired("verification_attempts")

    /** Verification Method */
    fun verificationMethod(): VerificationMethod =
        verificationMethod.getRequired("verification_method")

    /** Verification State */
    fun verificationState(): VerificationState = verificationState.getRequired("verification_state")

    /**
     * Indicates which Lithic account the external account is associated with. For external accounts
     * that are associated with the program, account_token field returned will be null
     */
    fun accountToken(): String? = accountToken.getNullable("account_token")

    /** Address */
    fun address(): ExternalBankAccountAddress? = address.getNullable("address")

    /** Optional field that helps identify bank accounts in receipts */
    fun companyId(): String? = companyId.getNullable("company_id")

    /** Date of Birth of the Individual that owns the external bank account */
    fun dob(): LocalDate? = dob.getNullable("dob")

    /** Doing Business As */
    fun doingBusinessAs(): String? = doingBusinessAs.getNullable("doing_business_as")

    /** The financial account token of the operating account to fund the micro deposits */
    fun financialAccountToken(): String? =
        financialAccountToken.getNullable("financial_account_token")

    /** The nickname for this External Bank Account */
    fun name(): String? = name.getNullable("name")

    /** User Defined ID */
    fun userDefinedId(): String? = userDefinedId.getNullable("user_defined_id")

    /**
     * Optional free text description of the reason for the failed verification. For ACH
     * micro-deposits returned, this field will display the reason return code sent by the ACH
     * network
     */
    fun verificationFailedReason(): String? =
        verificationFailedReason.getNullable("verification_failed_reason")

    /**
     * A globally unique identifier for this record of an external bank account association. If a
     * program links an external bank account to more than one end-user or to both the program and
     * the end-user, then Lithic will return each record of the association
     */
    @JsonProperty("token") @ExcludeMissing fun _token(): JsonField<String> = token

    /**
     * The country that the bank account is located in using ISO 3166-1. We will only accept USA
     * bank accounts e.g., USA
     */
    @JsonProperty("country") @ExcludeMissing fun _country(): JsonField<String> = country

    /** An ISO 8601 string representing when this funding source was added to the Lithic account. */
    @JsonProperty("created") @ExcludeMissing fun _created(): JsonField<OffsetDateTime> = created

    /** currency of the external account 3-character alphabetic ISO 4217 code */
    @JsonProperty("currency") @ExcludeMissing fun _currency(): JsonField<String> = currency

    /** The last 4 digits of the bank account. Derived by Lithic from the account number passed */
    @JsonProperty("last_four") @ExcludeMissing fun _lastFour(): JsonField<String> = lastFour

    /**
     * Legal Name of the business or individual who owns the external account. This will appear in
     * statements
     */
    @JsonProperty("owner") @ExcludeMissing fun _owner(): JsonField<String> = owner

    /** Owner Type */
    @JsonProperty("owner_type") @ExcludeMissing fun _ownerType(): JsonField<OwnerType> = ownerType

    /** Routing Number */
    @JsonProperty("routing_number")
    @ExcludeMissing
    fun _routingNumber(): JsonField<String> = routingNumber

    /** Account State */
    @JsonProperty("state") @ExcludeMissing fun _state(): JsonField<State> = state

    /** Account Type */
    @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

    /** The number of attempts at verification */
    @JsonProperty("verification_attempts")
    @ExcludeMissing
    fun _verificationAttempts(): JsonField<Long> = verificationAttempts

    /** Verification Method */
    @JsonProperty("verification_method")
    @ExcludeMissing
    fun _verificationMethod(): JsonField<VerificationMethod> = verificationMethod

    /** Verification State */
    @JsonProperty("verification_state")
    @ExcludeMissing
    fun _verificationState(): JsonField<VerificationState> = verificationState

    /**
     * Indicates which Lithic account the external account is associated with. For external accounts
     * that are associated with the program, account_token field returned will be null
     */
    @JsonProperty("account_token")
    @ExcludeMissing
    fun _accountToken(): JsonField<String> = accountToken

    /** Address */
    @JsonProperty("address")
    @ExcludeMissing
    fun _address(): JsonField<ExternalBankAccountAddress> = address

    /** Optional field that helps identify bank accounts in receipts */
    @JsonProperty("company_id") @ExcludeMissing fun _companyId(): JsonField<String> = companyId

    /** Date of Birth of the Individual that owns the external bank account */
    @JsonProperty("dob") @ExcludeMissing fun _dob(): JsonField<LocalDate> = dob

    /** Doing Business As */
    @JsonProperty("doing_business_as")
    @ExcludeMissing
    fun _doingBusinessAs(): JsonField<String> = doingBusinessAs

    /** The financial account token of the operating account to fund the micro deposits */
    @JsonProperty("financial_account_token")
    @ExcludeMissing
    fun _financialAccountToken(): JsonField<String> = financialAccountToken

    /** The nickname for this External Bank Account */
    @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

    /** User Defined ID */
    @JsonProperty("user_defined_id")
    @ExcludeMissing
    fun _userDefinedId(): JsonField<String> = userDefinedId

    /**
     * Optional free text description of the reason for the failed verification. For ACH
     * micro-deposits returned, this field will display the reason return code sent by the ACH
     * network
     */
    @JsonProperty("verification_failed_reason")
    @ExcludeMissing
    fun _verificationFailedReason(): JsonField<String> = verificationFailedReason

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    private var validated: Boolean = false

    fun validate(): ExternalBankAccountRetryMicroDepositsResponse = apply {
        if (validated) {
            return@apply
        }

        token()
        country()
        created()
        currency()
        lastFour()
        owner()
        ownerType()
        routingNumber()
        state()
        type()
        verificationAttempts()
        verificationMethod()
        verificationState()
        accountToken()
        address()?.validate()
        companyId()
        dob()
        doingBusinessAs()
        financialAccountToken()
        name()
        userDefinedId()
        verificationFailedReason()
        validated = true
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [ExternalBankAccountRetryMicroDepositsResponse].
         *
         * The following fields are required:
         * ```kotlin
         * .token()
         * .country()
         * .created()
         * .currency()
         * .lastFour()
         * .owner()
         * .ownerType()
         * .routingNumber()
         * .state()
         * .type()
         * .verificationAttempts()
         * .verificationMethod()
         * .verificationState()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [ExternalBankAccountRetryMicroDepositsResponse]. */
    class Builder internal constructor() {

        private var token: JsonField<String>? = null
        private var country: JsonField<String>? = null
        private var created: JsonField<OffsetDateTime>? = null
        private var currency: JsonField<String>? = null
        private var lastFour: JsonField<String>? = null
        private var owner: JsonField<String>? = null
        private var ownerType: JsonField<OwnerType>? = null
        private var routingNumber: JsonField<String>? = null
        private var state: JsonField<State>? = null
        private var type: JsonField<Type>? = null
        private var verificationAttempts: JsonField<Long>? = null
        private var verificationMethod: JsonField<VerificationMethod>? = null
        private var verificationState: JsonField<VerificationState>? = null
        private var accountToken: JsonField<String> = JsonMissing.of()
        private var address: JsonField<ExternalBankAccountAddress> = JsonMissing.of()
        private var companyId: JsonField<String> = JsonMissing.of()
        private var dob: JsonField<LocalDate> = JsonMissing.of()
        private var doingBusinessAs: JsonField<String> = JsonMissing.of()
        private var financialAccountToken: JsonField<String> = JsonMissing.of()
        private var name: JsonField<String> = JsonMissing.of()
        private var userDefinedId: JsonField<String> = JsonMissing.of()
        private var verificationFailedReason: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(
            externalBankAccountRetryMicroDepositsResponse:
                ExternalBankAccountRetryMicroDepositsResponse
        ) = apply {
            token = externalBankAccountRetryMicroDepositsResponse.token
            country = externalBankAccountRetryMicroDepositsResponse.country
            created = externalBankAccountRetryMicroDepositsResponse.created
            currency = externalBankAccountRetryMicroDepositsResponse.currency
            lastFour = externalBankAccountRetryMicroDepositsResponse.lastFour
            owner = externalBankAccountRetryMicroDepositsResponse.owner
            ownerType = externalBankAccountRetryMicroDepositsResponse.ownerType
            routingNumber = externalBankAccountRetryMicroDepositsResponse.routingNumber
            state = externalBankAccountRetryMicroDepositsResponse.state
            type = externalBankAccountRetryMicroDepositsResponse.type
            verificationAttempts =
                externalBankAccountRetryMicroDepositsResponse.verificationAttempts
            verificationMethod = externalBankAccountRetryMicroDepositsResponse.verificationMethod
            verificationState = externalBankAccountRetryMicroDepositsResponse.verificationState
            accountToken = externalBankAccountRetryMicroDepositsResponse.accountToken
            address = externalBankAccountRetryMicroDepositsResponse.address
            companyId = externalBankAccountRetryMicroDepositsResponse.companyId
            dob = externalBankAccountRetryMicroDepositsResponse.dob
            doingBusinessAs = externalBankAccountRetryMicroDepositsResponse.doingBusinessAs
            financialAccountToken =
                externalBankAccountRetryMicroDepositsResponse.financialAccountToken
            name = externalBankAccountRetryMicroDepositsResponse.name
            userDefinedId = externalBankAccountRetryMicroDepositsResponse.userDefinedId
            verificationFailedReason =
                externalBankAccountRetryMicroDepositsResponse.verificationFailedReason
            additionalProperties =
                externalBankAccountRetryMicroDepositsResponse.additionalProperties.toMutableMap()
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
        fun token(token: JsonField<String>) = apply { this.token = token }

        /**
         * The country that the bank account is located in using ISO 3166-1. We will only accept USA
         * bank accounts e.g., USA
         */
        fun country(country: String) = country(JsonField.of(country))

        /**
         * The country that the bank account is located in using ISO 3166-1. We will only accept USA
         * bank accounts e.g., USA
         */
        fun country(country: JsonField<String>) = apply { this.country = country }

        /**
         * An ISO 8601 string representing when this funding source was added to the Lithic account.
         */
        fun created(created: OffsetDateTime) = created(JsonField.of(created))

        /**
         * An ISO 8601 string representing when this funding source was added to the Lithic account.
         */
        fun created(created: JsonField<OffsetDateTime>) = apply { this.created = created }

        /** currency of the external account 3-character alphabetic ISO 4217 code */
        fun currency(currency: String) = currency(JsonField.of(currency))

        /** currency of the external account 3-character alphabetic ISO 4217 code */
        fun currency(currency: JsonField<String>) = apply { this.currency = currency }

        /**
         * The last 4 digits of the bank account. Derived by Lithic from the account number passed
         */
        fun lastFour(lastFour: String) = lastFour(JsonField.of(lastFour))

        /**
         * The last 4 digits of the bank account. Derived by Lithic from the account number passed
         */
        fun lastFour(lastFour: JsonField<String>) = apply { this.lastFour = lastFour }

        /**
         * Legal Name of the business or individual who owns the external account. This will appear
         * in statements
         */
        fun owner(owner: String) = owner(JsonField.of(owner))

        /**
         * Legal Name of the business or individual who owns the external account. This will appear
         * in statements
         */
        fun owner(owner: JsonField<String>) = apply { this.owner = owner }

        /** Owner Type */
        fun ownerType(ownerType: OwnerType) = ownerType(JsonField.of(ownerType))

        /** Owner Type */
        fun ownerType(ownerType: JsonField<OwnerType>) = apply { this.ownerType = ownerType }

        /** Routing Number */
        fun routingNumber(routingNumber: String) = routingNumber(JsonField.of(routingNumber))

        /** Routing Number */
        fun routingNumber(routingNumber: JsonField<String>) = apply {
            this.routingNumber = routingNumber
        }

        /** Account State */
        fun state(state: State) = state(JsonField.of(state))

        /** Account State */
        fun state(state: JsonField<State>) = apply { this.state = state }

        /** Account Type */
        fun type(type: Type) = type(JsonField.of(type))

        /** Account Type */
        fun type(type: JsonField<Type>) = apply { this.type = type }

        /** The number of attempts at verification */
        fun verificationAttempts(verificationAttempts: Long) =
            verificationAttempts(JsonField.of(verificationAttempts))

        /** The number of attempts at verification */
        fun verificationAttempts(verificationAttempts: JsonField<Long>) = apply {
            this.verificationAttempts = verificationAttempts
        }

        /** Verification Method */
        fun verificationMethod(verificationMethod: VerificationMethod) =
            verificationMethod(JsonField.of(verificationMethod))

        /** Verification Method */
        fun verificationMethod(verificationMethod: JsonField<VerificationMethod>) = apply {
            this.verificationMethod = verificationMethod
        }

        /** Verification State */
        fun verificationState(verificationState: VerificationState) =
            verificationState(JsonField.of(verificationState))

        /** Verification State */
        fun verificationState(verificationState: JsonField<VerificationState>) = apply {
            this.verificationState = verificationState
        }

        /**
         * Indicates which Lithic account the external account is associated with. For external
         * accounts that are associated with the program, account_token field returned will be null
         */
        fun accountToken(accountToken: String) = accountToken(JsonField.of(accountToken))

        /**
         * Indicates which Lithic account the external account is associated with. For external
         * accounts that are associated with the program, account_token field returned will be null
         */
        fun accountToken(accountToken: JsonField<String>) = apply {
            this.accountToken = accountToken
        }

        /** Address */
        fun address(address: ExternalBankAccountAddress) = address(JsonField.of(address))

        /** Address */
        fun address(address: JsonField<ExternalBankAccountAddress>) = apply {
            this.address = address
        }

        /** Optional field that helps identify bank accounts in receipts */
        fun companyId(companyId: String) = companyId(JsonField.of(companyId))

        /** Optional field that helps identify bank accounts in receipts */
        fun companyId(companyId: JsonField<String>) = apply { this.companyId = companyId }

        /** Date of Birth of the Individual that owns the external bank account */
        fun dob(dob: LocalDate) = dob(JsonField.of(dob))

        /** Date of Birth of the Individual that owns the external bank account */
        fun dob(dob: JsonField<LocalDate>) = apply { this.dob = dob }

        /** Doing Business As */
        fun doingBusinessAs(doingBusinessAs: String) =
            doingBusinessAs(JsonField.of(doingBusinessAs))

        /** Doing Business As */
        fun doingBusinessAs(doingBusinessAs: JsonField<String>) = apply {
            this.doingBusinessAs = doingBusinessAs
        }

        /** The financial account token of the operating account to fund the micro deposits */
        fun financialAccountToken(financialAccountToken: String) =
            financialAccountToken(JsonField.of(financialAccountToken))

        /** The financial account token of the operating account to fund the micro deposits */
        fun financialAccountToken(financialAccountToken: JsonField<String>) = apply {
            this.financialAccountToken = financialAccountToken
        }

        /** The nickname for this External Bank Account */
        fun name(name: String) = name(JsonField.of(name))

        /** The nickname for this External Bank Account */
        fun name(name: JsonField<String>) = apply { this.name = name }

        /** User Defined ID */
        fun userDefinedId(userDefinedId: String) = userDefinedId(JsonField.of(userDefinedId))

        /** User Defined ID */
        fun userDefinedId(userDefinedId: JsonField<String>) = apply {
            this.userDefinedId = userDefinedId
        }

        /**
         * Optional free text description of the reason for the failed verification. For ACH
         * micro-deposits returned, this field will display the reason return code sent by the ACH
         * network
         */
        fun verificationFailedReason(verificationFailedReason: String) =
            verificationFailedReason(JsonField.of(verificationFailedReason))

        /**
         * Optional free text description of the reason for the failed verification. For ACH
         * micro-deposits returned, this field will display the reason return code sent by the ACH
         * network
         */
        fun verificationFailedReason(verificationFailedReason: JsonField<String>) = apply {
            this.verificationFailedReason = verificationFailedReason
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

        fun build(): ExternalBankAccountRetryMicroDepositsResponse =
            ExternalBankAccountRetryMicroDepositsResponse(
                checkRequired("token", token),
                checkRequired("country", country),
                checkRequired("created", created),
                checkRequired("currency", currency),
                checkRequired("lastFour", lastFour),
                checkRequired("owner", owner),
                checkRequired("ownerType", ownerType),
                checkRequired("routingNumber", routingNumber),
                checkRequired("state", state),
                checkRequired("type", type),
                checkRequired("verificationAttempts", verificationAttempts),
                checkRequired("verificationMethod", verificationMethod),
                checkRequired("verificationState", verificationState),
                accountToken,
                address,
                companyId,
                dob,
                doingBusinessAs,
                financialAccountToken,
                name,
                userDefinedId,
                verificationFailedReason,
                additionalProperties.toImmutable(),
            )
    }

    /** Owner Type */
    class OwnerType @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            val BUSINESS = of("BUSINESS")

            val INDIVIDUAL = of("INDIVIDUAL")

            fun of(value: String) = OwnerType(JsonField.of(value))
        }

        /** An enum containing [OwnerType]'s known values. */
        enum class Known {
            BUSINESS,
            INDIVIDUAL,
        }

        /**
         * An enum containing [OwnerType]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [OwnerType] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            BUSINESS,
            INDIVIDUAL,
            /**
             * An enum member indicating that [OwnerType] was instantiated with an unknown value.
             */
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
                BUSINESS -> Value.BUSINESS
                INDIVIDUAL -> Value.INDIVIDUAL
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
                BUSINESS -> Known.BUSINESS
                INDIVIDUAL -> Known.INDIVIDUAL
                else -> throw LithicInvalidDataException("Unknown OwnerType: $value")
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

            return /* spotless:off */ other is OwnerType && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /** Account State */
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

            val ENABLED = of("ENABLED")

            val CLOSED = of("CLOSED")

            val PAUSED = of("PAUSED")

            fun of(value: String) = State(JsonField.of(value))
        }

        /** An enum containing [State]'s known values. */
        enum class Known {
            ENABLED,
            CLOSED,
            PAUSED,
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
            ENABLED,
            CLOSED,
            PAUSED,
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
                ENABLED -> Value.ENABLED
                CLOSED -> Value.CLOSED
                PAUSED -> Value.PAUSED
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
                ENABLED -> Known.ENABLED
                CLOSED -> Known.CLOSED
                PAUSED -> Known.PAUSED
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

    /** Account Type */
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

            val CHECKING = of("CHECKING")

            val SAVINGS = of("SAVINGS")

            fun of(value: String) = Type(JsonField.of(value))
        }

        /** An enum containing [Type]'s known values. */
        enum class Known {
            CHECKING,
            SAVINGS,
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
            CHECKING,
            SAVINGS,
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
                CHECKING -> Value.CHECKING
                SAVINGS -> Value.SAVINGS
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
                CHECKING -> Known.CHECKING
                SAVINGS -> Known.SAVINGS
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

    /** Verification Method */
    class VerificationMethod
    @JsonCreator
    private constructor(private val value: JsonField<String>) : Enum {

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

            val MANUAL = of("MANUAL")

            val MICRO_DEPOSIT = of("MICRO_DEPOSIT")

            val PLAID = of("PLAID")

            val PRENOTE = of("PRENOTE")

            fun of(value: String) = VerificationMethod(JsonField.of(value))
        }

        /** An enum containing [VerificationMethod]'s known values. */
        enum class Known {
            MANUAL,
            MICRO_DEPOSIT,
            PLAID,
            PRENOTE,
        }

        /**
         * An enum containing [VerificationMethod]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [VerificationMethod] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            MANUAL,
            MICRO_DEPOSIT,
            PLAID,
            PRENOTE,
            /**
             * An enum member indicating that [VerificationMethod] was instantiated with an unknown
             * value.
             */
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
                MANUAL -> Value.MANUAL
                MICRO_DEPOSIT -> Value.MICRO_DEPOSIT
                PLAID -> Value.PLAID
                PRENOTE -> Value.PRENOTE
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
                MANUAL -> Known.MANUAL
                MICRO_DEPOSIT -> Known.MICRO_DEPOSIT
                PLAID -> Known.PLAID
                PRENOTE -> Known.PRENOTE
                else -> throw LithicInvalidDataException("Unknown VerificationMethod: $value")
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

            return /* spotless:off */ other is VerificationMethod && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /** Verification State */
    class VerificationState @JsonCreator private constructor(private val value: JsonField<String>) :
        Enum {

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

            val PENDING = of("PENDING")

            val ENABLED = of("ENABLED")

            val FAILED_VERIFICATION = of("FAILED_VERIFICATION")

            val INSUFFICIENT_FUNDS = of("INSUFFICIENT_FUNDS")

            fun of(value: String) = VerificationState(JsonField.of(value))
        }

        /** An enum containing [VerificationState]'s known values. */
        enum class Known {
            PENDING,
            ENABLED,
            FAILED_VERIFICATION,
            INSUFFICIENT_FUNDS,
        }

        /**
         * An enum containing [VerificationState]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [VerificationState] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            PENDING,
            ENABLED,
            FAILED_VERIFICATION,
            INSUFFICIENT_FUNDS,
            /**
             * An enum member indicating that [VerificationState] was instantiated with an unknown
             * value.
             */
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
                PENDING -> Value.PENDING
                ENABLED -> Value.ENABLED
                FAILED_VERIFICATION -> Value.FAILED_VERIFICATION
                INSUFFICIENT_FUNDS -> Value.INSUFFICIENT_FUNDS
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
                PENDING -> Known.PENDING
                ENABLED -> Known.ENABLED
                FAILED_VERIFICATION -> Known.FAILED_VERIFICATION
                INSUFFICIENT_FUNDS -> Known.INSUFFICIENT_FUNDS
                else -> throw LithicInvalidDataException("Unknown VerificationState: $value")
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

            return /* spotless:off */ other is VerificationState && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is ExternalBankAccountRetryMicroDepositsResponse && token == other.token && country == other.country && created == other.created && currency == other.currency && lastFour == other.lastFour && owner == other.owner && ownerType == other.ownerType && routingNumber == other.routingNumber && state == other.state && type == other.type && verificationAttempts == other.verificationAttempts && verificationMethod == other.verificationMethod && verificationState == other.verificationState && accountToken == other.accountToken && address == other.address && companyId == other.companyId && dob == other.dob && doingBusinessAs == other.doingBusinessAs && financialAccountToken == other.financialAccountToken && name == other.name && userDefinedId == other.userDefinedId && verificationFailedReason == other.verificationFailedReason && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(token, country, created, currency, lastFour, owner, ownerType, routingNumber, state, type, verificationAttempts, verificationMethod, verificationState, accountToken, address, companyId, dob, doingBusinessAs, financialAccountToken, name, userDefinedId, verificationFailedReason, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "ExternalBankAccountRetryMicroDepositsResponse{token=$token, country=$country, created=$created, currency=$currency, lastFour=$lastFour, owner=$owner, ownerType=$ownerType, routingNumber=$routingNumber, state=$state, type=$type, verificationAttempts=$verificationAttempts, verificationMethod=$verificationMethod, verificationState=$verificationState, accountToken=$accountToken, address=$address, companyId=$companyId, dob=$dob, doingBusinessAs=$doingBusinessAs, financialAccountToken=$financialAccountToken, name=$name, userDefinedId=$userDefinedId, verificationFailedReason=$verificationFailedReason, additionalProperties=$additionalProperties}"
}
