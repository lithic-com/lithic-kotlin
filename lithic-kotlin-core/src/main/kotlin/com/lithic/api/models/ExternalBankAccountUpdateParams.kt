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
import com.lithic.api.core.Params
import com.lithic.api.core.checkRequired
import com.lithic.api.core.http.Headers
import com.lithic.api.core.http.QueryParams
import com.lithic.api.core.immutableEmptyMap
import com.lithic.api.core.toImmutable
import com.lithic.api.errors.LithicInvalidDataException
import java.time.LocalDate
import java.util.Objects

/** Update the external bank account by token. */
class ExternalBankAccountUpdateParams
private constructor(
    private val externalBankAccountToken: String,
    private val body: UpdateBankAccountApiRequest,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun externalBankAccountToken(): String = externalBankAccountToken

    /** Address */
    fun address(): ExternalBankAccountAddress? = body.address()

    /** Optional field that helps identify bank accounts in receipts */
    fun companyId(): String? = body.companyId()

    /** Date of Birth of the Individual that owns the external bank account */
    fun dob(): LocalDate? = body.dob()

    /** Doing Business As */
    fun doingBusinessAs(): String? = body.doingBusinessAs()

    /** The nickname for this External Bank Account */
    fun name(): String? = body.name()

    /**
     * Legal Name of the business or individual who owns the external account. This will appear in
     * statements
     */
    fun owner(): String? = body.owner()

    /** Owner Type */
    fun ownerType(): OwnerType? = body.ownerType()

    fun type(): AccountTypeExternal? = body.type()

    /** User Defined ID */
    fun userDefinedId(): String? = body.userDefinedId()

    /** Address */
    fun _address(): JsonField<ExternalBankAccountAddress> = body._address()

    /** Optional field that helps identify bank accounts in receipts */
    fun _companyId(): JsonField<String> = body._companyId()

    /** Date of Birth of the Individual that owns the external bank account */
    fun _dob(): JsonField<LocalDate> = body._dob()

    /** Doing Business As */
    fun _doingBusinessAs(): JsonField<String> = body._doingBusinessAs()

    /** The nickname for this External Bank Account */
    fun _name(): JsonField<String> = body._name()

    /**
     * Legal Name of the business or individual who owns the external account. This will appear in
     * statements
     */
    fun _owner(): JsonField<String> = body._owner()

    /** Owner Type */
    fun _ownerType(): JsonField<OwnerType> = body._ownerType()

    fun _type(): JsonField<AccountTypeExternal> = body._type()

    /** User Defined ID */
    fun _userDefinedId(): JsonField<String> = body._userDefinedId()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    internal fun _body(): UpdateBankAccountApiRequest = body

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    fun getPathParam(index: Int): String {
        return when (index) {
            0 -> externalBankAccountToken
            else -> ""
        }
    }

    @NoAutoDetect
    class UpdateBankAccountApiRequest
    @JsonCreator
    private constructor(
        @JsonProperty("address")
        @ExcludeMissing
        private val address: JsonField<ExternalBankAccountAddress> = JsonMissing.of(),
        @JsonProperty("company_id")
        @ExcludeMissing
        private val companyId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("dob")
        @ExcludeMissing
        private val dob: JsonField<LocalDate> = JsonMissing.of(),
        @JsonProperty("doing_business_as")
        @ExcludeMissing
        private val doingBusinessAs: JsonField<String> = JsonMissing.of(),
        @JsonProperty("name")
        @ExcludeMissing
        private val name: JsonField<String> = JsonMissing.of(),
        @JsonProperty("owner")
        @ExcludeMissing
        private val owner: JsonField<String> = JsonMissing.of(),
        @JsonProperty("owner_type")
        @ExcludeMissing
        private val ownerType: JsonField<OwnerType> = JsonMissing.of(),
        @JsonProperty("type")
        @ExcludeMissing
        private val type: JsonField<AccountTypeExternal> = JsonMissing.of(),
        @JsonProperty("user_defined_id")
        @ExcludeMissing
        private val userDefinedId: JsonField<String> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /** Address */
        fun address(): ExternalBankAccountAddress? = address.getNullable("address")

        /** Optional field that helps identify bank accounts in receipts */
        fun companyId(): String? = companyId.getNullable("company_id")

        /** Date of Birth of the Individual that owns the external bank account */
        fun dob(): LocalDate? = dob.getNullable("dob")

        /** Doing Business As */
        fun doingBusinessAs(): String? = doingBusinessAs.getNullable("doing_business_as")

        /** The nickname for this External Bank Account */
        fun name(): String? = name.getNullable("name")

        /**
         * Legal Name of the business or individual who owns the external account. This will appear
         * in statements
         */
        fun owner(): String? = owner.getNullable("owner")

        /** Owner Type */
        fun ownerType(): OwnerType? = ownerType.getNullable("owner_type")

        fun type(): AccountTypeExternal? = type.getNullable("type")

        /** User Defined ID */
        fun userDefinedId(): String? = userDefinedId.getNullable("user_defined_id")

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

        /** The nickname for this External Bank Account */
        @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

        /**
         * Legal Name of the business or individual who owns the external account. This will appear
         * in statements
         */
        @JsonProperty("owner") @ExcludeMissing fun _owner(): JsonField<String> = owner

        /** Owner Type */
        @JsonProperty("owner_type")
        @ExcludeMissing
        fun _ownerType(): JsonField<OwnerType> = ownerType

        @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<AccountTypeExternal> = type

        /** User Defined ID */
        @JsonProperty("user_defined_id")
        @ExcludeMissing
        fun _userDefinedId(): JsonField<String> = userDefinedId

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): UpdateBankAccountApiRequest = apply {
            if (validated) {
                return@apply
            }

            address()?.validate()
            companyId()
            dob()
            doingBusinessAs()
            name()
            owner()
            ownerType()
            type()
            userDefinedId()
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            fun builder() = Builder()
        }

        /** A builder for [UpdateBankAccountApiRequest]. */
        class Builder internal constructor() {

            private var address: JsonField<ExternalBankAccountAddress> = JsonMissing.of()
            private var companyId: JsonField<String> = JsonMissing.of()
            private var dob: JsonField<LocalDate> = JsonMissing.of()
            private var doingBusinessAs: JsonField<String> = JsonMissing.of()
            private var name: JsonField<String> = JsonMissing.of()
            private var owner: JsonField<String> = JsonMissing.of()
            private var ownerType: JsonField<OwnerType> = JsonMissing.of()
            private var type: JsonField<AccountTypeExternal> = JsonMissing.of()
            private var userDefinedId: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(updateBankAccountApiRequest: UpdateBankAccountApiRequest) = apply {
                address = updateBankAccountApiRequest.address
                companyId = updateBankAccountApiRequest.companyId
                dob = updateBankAccountApiRequest.dob
                doingBusinessAs = updateBankAccountApiRequest.doingBusinessAs
                name = updateBankAccountApiRequest.name
                owner = updateBankAccountApiRequest.owner
                ownerType = updateBankAccountApiRequest.ownerType
                type = updateBankAccountApiRequest.type
                userDefinedId = updateBankAccountApiRequest.userDefinedId
                additionalProperties =
                    updateBankAccountApiRequest.additionalProperties.toMutableMap()
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

            /** The nickname for this External Bank Account */
            fun name(name: String) = name(JsonField.of(name))

            /** The nickname for this External Bank Account */
            fun name(name: JsonField<String>) = apply { this.name = name }

            /**
             * Legal Name of the business or individual who owns the external account. This will
             * appear in statements
             */
            fun owner(owner: String) = owner(JsonField.of(owner))

            /**
             * Legal Name of the business or individual who owns the external account. This will
             * appear in statements
             */
            fun owner(owner: JsonField<String>) = apply { this.owner = owner }

            /** Owner Type */
            fun ownerType(ownerType: OwnerType) = ownerType(JsonField.of(ownerType))

            /** Owner Type */
            fun ownerType(ownerType: JsonField<OwnerType>) = apply { this.ownerType = ownerType }

            fun type(type: AccountTypeExternal) = type(JsonField.of(type))

            fun type(type: JsonField<AccountTypeExternal>) = apply { this.type = type }

            /** User Defined ID */
            fun userDefinedId(userDefinedId: String) = userDefinedId(JsonField.of(userDefinedId))

            /** User Defined ID */
            fun userDefinedId(userDefinedId: JsonField<String>) = apply {
                this.userDefinedId = userDefinedId
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

            fun build(): UpdateBankAccountApiRequest =
                UpdateBankAccountApiRequest(
                    address,
                    companyId,
                    dob,
                    doingBusinessAs,
                    name,
                    owner,
                    ownerType,
                    type,
                    userDefinedId,
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is UpdateBankAccountApiRequest && address == other.address && companyId == other.companyId && dob == other.dob && doingBusinessAs == other.doingBusinessAs && name == other.name && owner == other.owner && ownerType == other.ownerType && type == other.type && userDefinedId == other.userDefinedId && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(address, companyId, dob, doingBusinessAs, name, owner, ownerType, type, userDefinedId, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "UpdateBankAccountApiRequest{address=$address, companyId=$companyId, dob=$dob, doingBusinessAs=$doingBusinessAs, name=$name, owner=$owner, ownerType=$ownerType, type=$type, userDefinedId=$userDefinedId, additionalProperties=$additionalProperties}"
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        fun builder() = Builder()
    }

    /** A builder for [ExternalBankAccountUpdateParams]. */
    @NoAutoDetect
    class Builder internal constructor() {

        private var externalBankAccountToken: String? = null
        private var body: UpdateBankAccountApiRequest.Builder =
            UpdateBankAccountApiRequest.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        internal fun from(externalBankAccountUpdateParams: ExternalBankAccountUpdateParams) =
            apply {
                externalBankAccountToken = externalBankAccountUpdateParams.externalBankAccountToken
                body = externalBankAccountUpdateParams.body.toBuilder()
                additionalHeaders = externalBankAccountUpdateParams.additionalHeaders.toBuilder()
                additionalQueryParams =
                    externalBankAccountUpdateParams.additionalQueryParams.toBuilder()
            }

        fun externalBankAccountToken(externalBankAccountToken: String) = apply {
            this.externalBankAccountToken = externalBankAccountToken
        }

        /** Address */
        fun address(address: ExternalBankAccountAddress) = apply { body.address(address) }

        /** Address */
        fun address(address: JsonField<ExternalBankAccountAddress>) = apply {
            body.address(address)
        }

        /** Optional field that helps identify bank accounts in receipts */
        fun companyId(companyId: String) = apply { body.companyId(companyId) }

        /** Optional field that helps identify bank accounts in receipts */
        fun companyId(companyId: JsonField<String>) = apply { body.companyId(companyId) }

        /** Date of Birth of the Individual that owns the external bank account */
        fun dob(dob: LocalDate) = apply { body.dob(dob) }

        /** Date of Birth of the Individual that owns the external bank account */
        fun dob(dob: JsonField<LocalDate>) = apply { body.dob(dob) }

        /** Doing Business As */
        fun doingBusinessAs(doingBusinessAs: String) = apply {
            body.doingBusinessAs(doingBusinessAs)
        }

        /** Doing Business As */
        fun doingBusinessAs(doingBusinessAs: JsonField<String>) = apply {
            body.doingBusinessAs(doingBusinessAs)
        }

        /** The nickname for this External Bank Account */
        fun name(name: String) = apply { body.name(name) }

        /** The nickname for this External Bank Account */
        fun name(name: JsonField<String>) = apply { body.name(name) }

        /**
         * Legal Name of the business or individual who owns the external account. This will appear
         * in statements
         */
        fun owner(owner: String) = apply { body.owner(owner) }

        /**
         * Legal Name of the business or individual who owns the external account. This will appear
         * in statements
         */
        fun owner(owner: JsonField<String>) = apply { body.owner(owner) }

        /** Owner Type */
        fun ownerType(ownerType: OwnerType) = apply { body.ownerType(ownerType) }

        /** Owner Type */
        fun ownerType(ownerType: JsonField<OwnerType>) = apply { body.ownerType(ownerType) }

        fun type(type: AccountTypeExternal) = apply { body.type(type) }

        fun type(type: JsonField<AccountTypeExternal>) = apply { body.type(type) }

        /** User Defined ID */
        fun userDefinedId(userDefinedId: String) = apply { body.userDefinedId(userDefinedId) }

        /** User Defined ID */
        fun userDefinedId(userDefinedId: JsonField<String>) = apply {
            body.userDefinedId(userDefinedId)
        }

        fun additionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) = apply {
            body.additionalProperties(additionalBodyProperties)
        }

        fun putAdditionalBodyProperty(key: String, value: JsonValue) = apply {
            body.putAdditionalProperty(key, value)
        }

        fun putAllAdditionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) =
            apply {
                body.putAllAdditionalProperties(additionalBodyProperties)
            }

        fun removeAdditionalBodyProperty(key: String) = apply { body.removeAdditionalProperty(key) }

        fun removeAllAdditionalBodyProperties(keys: Set<String>) = apply {
            body.removeAllAdditionalProperties(keys)
        }

        fun additionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun additionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun putAdditionalHeader(name: String, value: String) = apply {
            additionalHeaders.put(name, value)
        }

        fun putAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.put(name, values)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun replaceAdditionalHeaders(name: String, value: String) = apply {
            additionalHeaders.replace(name, value)
        }

        fun replaceAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.replace(name, values)
        }

        fun replaceAllAdditionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun replaceAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun removeAdditionalHeaders(name: String) = apply { additionalHeaders.remove(name) }

        fun removeAllAdditionalHeaders(names: Set<String>) = apply {
            additionalHeaders.removeAll(names)
        }

        fun additionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun additionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun putAdditionalQueryParam(key: String, value: String) = apply {
            additionalQueryParams.put(key, value)
        }

        fun putAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.put(key, values)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.putAll(additionalQueryParams)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.putAll(additionalQueryParams)
            }

        fun replaceAdditionalQueryParams(key: String, value: String) = apply {
            additionalQueryParams.replace(key, value)
        }

        fun replaceAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.replace(key, values)
        }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.replaceAll(additionalQueryParams)
        }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.replaceAll(additionalQueryParams)
            }

        fun removeAdditionalQueryParams(key: String) = apply { additionalQueryParams.remove(key) }

        fun removeAllAdditionalQueryParams(keys: Set<String>) = apply {
            additionalQueryParams.removeAll(keys)
        }

        fun build(): ExternalBankAccountUpdateParams =
            ExternalBankAccountUpdateParams(
                checkRequired("externalBankAccountToken", externalBankAccountToken),
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    class AccountTypeExternal
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

            val CHECKING = of("CHECKING")

            val SAVINGS = of("SAVINGS")

            fun of(value: String) = AccountTypeExternal(JsonField.of(value))
        }

        /** An enum containing [AccountTypeExternal]'s known values. */
        enum class Known {
            CHECKING,
            SAVINGS,
        }

        /**
         * An enum containing [AccountTypeExternal]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [AccountTypeExternal] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            CHECKING,
            SAVINGS,
            /**
             * An enum member indicating that [AccountTypeExternal] was instantiated with an unknown
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
                else -> throw LithicInvalidDataException("Unknown AccountTypeExternal: $value")
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

            return /* spotless:off */ other is AccountTypeExternal && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is ExternalBankAccountUpdateParams && externalBankAccountToken == other.externalBankAccountToken && body == other.body && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(externalBankAccountToken, body, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() =
        "ExternalBankAccountUpdateParams{externalBankAccountToken=$externalBankAccountToken, body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
