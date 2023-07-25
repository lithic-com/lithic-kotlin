package com.lithic.api.models

import com.fasterxml.jackson.annotation.JsonCreator
import com.lithic.api.core.JsonField
import com.lithic.api.core.JsonValue
import com.lithic.api.core.NoAutoDetect
import com.lithic.api.core.toUnmodifiable
import com.lithic.api.errors.LithicInvalidDataException
import com.lithic.api.models.*
import java.util.Objects

class ExternalBankAccountListParams
constructor(
    private val accountToken: String?,
    private val ownerTypes: List<OwnerType>?,
    private val accountTypes: List<AccountType>?,
    private val states: List<AccountState>?,
    private val verificationStates: List<VerificationState>?,
    private val countries: List<String>?,
    private val pageSize: Long?,
    private val startingAfter: String?,
    private val endingBefore: String?,
    private val additionalQueryParams: Map<String, List<String>>,
    private val additionalHeaders: Map<String, List<String>>,
) {

    fun accountToken(): String? = accountToken

    fun ownerTypes(): List<OwnerType>? = ownerTypes

    fun accountTypes(): List<AccountType>? = accountTypes

    fun states(): List<AccountState>? = states

    fun verificationStates(): List<VerificationState>? = verificationStates

    fun countries(): List<String>? = countries

    fun pageSize(): Long? = pageSize

    fun startingAfter(): String? = startingAfter

    fun endingBefore(): String? = endingBefore

    internal fun getQueryParams(): Map<String, List<String>> {
        val params = mutableMapOf<String, List<String>>()
        this.accountToken?.let { params.put("account_token", listOf(it.toString())) }
        this.ownerTypes?.let { params.put("owner_types", listOf(it.joinToString(separator = ","))) }
        this.accountTypes?.let {
            params.put("account_types", listOf(it.joinToString(separator = ",")))
        }
        this.states?.let { params.put("states", listOf(it.joinToString(separator = ","))) }
        this.verificationStates?.let {
            params.put("verification_states", listOf(it.joinToString(separator = ",")))
        }
        this.countries?.let { params.put("countries", listOf(it.joinToString(separator = ","))) }
        this.pageSize?.let { params.put("page_size", listOf(it.toString())) }
        this.startingAfter?.let { params.put("starting_after", listOf(it.toString())) }
        this.endingBefore?.let { params.put("ending_before", listOf(it.toString())) }
        params.putAll(additionalQueryParams)
        return params.toUnmodifiable()
    }

    internal fun getHeaders(): Map<String, List<String>> = additionalHeaders

    fun _additionalQueryParams(): Map<String, List<String>> = additionalQueryParams

    fun _additionalHeaders(): Map<String, List<String>> = additionalHeaders

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ExternalBankAccountListParams &&
            this.accountToken == other.accountToken &&
            this.ownerTypes == other.ownerTypes &&
            this.accountTypes == other.accountTypes &&
            this.states == other.states &&
            this.verificationStates == other.verificationStates &&
            this.countries == other.countries &&
            this.pageSize == other.pageSize &&
            this.startingAfter == other.startingAfter &&
            this.endingBefore == other.endingBefore &&
            this.additionalQueryParams == other.additionalQueryParams &&
            this.additionalHeaders == other.additionalHeaders
    }

    override fun hashCode(): Int {
        return Objects.hash(
            accountToken,
            ownerTypes,
            accountTypes,
            states,
            verificationStates,
            countries,
            pageSize,
            startingAfter,
            endingBefore,
            additionalQueryParams,
            additionalHeaders,
        )
    }

    override fun toString() =
        "ExternalBankAccountListParams{accountToken=$accountToken, ownerTypes=$ownerTypes, accountTypes=$accountTypes, states=$states, verificationStates=$verificationStates, countries=$countries, pageSize=$pageSize, startingAfter=$startingAfter, endingBefore=$endingBefore, additionalQueryParams=$additionalQueryParams, additionalHeaders=$additionalHeaders}"

    fun toBuilder() = Builder().from(this)

    companion object {

        fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var accountToken: String? = null
        private var ownerTypes: List<OwnerType>? = null
        private var accountTypes: List<AccountType>? = null
        private var states: List<AccountState>? = null
        private var verificationStates: List<VerificationState>? = null
        private var countries: List<String>? = null
        private var pageSize: Long? = null
        private var startingAfter: String? = null
        private var endingBefore: String? = null
        private var additionalQueryParams: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalHeaders: MutableMap<String, MutableList<String>> = mutableMapOf()

        internal fun from(externalBankAccountListParams: ExternalBankAccountListParams) = apply {
            this.accountToken = externalBankAccountListParams.accountToken
            this.ownerTypes = externalBankAccountListParams.ownerTypes
            this.accountTypes = externalBankAccountListParams.accountTypes
            this.states = externalBankAccountListParams.states
            this.verificationStates = externalBankAccountListParams.verificationStates
            this.countries = externalBankAccountListParams.countries
            this.pageSize = externalBankAccountListParams.pageSize
            this.startingAfter = externalBankAccountListParams.startingAfter
            this.endingBefore = externalBankAccountListParams.endingBefore
            additionalQueryParams(externalBankAccountListParams.additionalQueryParams)
            additionalHeaders(externalBankAccountListParams.additionalHeaders)
        }

        fun accountToken(accountToken: String) = apply { this.accountToken = accountToken }

        fun ownerTypes(ownerTypes: List<OwnerType>) = apply { this.ownerTypes = ownerTypes }

        fun accountTypes(accountTypes: List<AccountType>) = apply {
            this.accountTypes = accountTypes
        }

        fun states(states: List<AccountState>) = apply { this.states = states }

        fun verificationStates(verificationStates: List<VerificationState>) = apply {
            this.verificationStates = verificationStates
        }

        fun countries(countries: List<String>) = apply { this.countries = countries }

        /** Page size (for pagination). */
        fun pageSize(pageSize: Long) = apply { this.pageSize = pageSize }

        /**
         * A cursor representing an item's token after which a page of results should begin. Used to
         * retrieve the next page of results after this item.
         */
        fun startingAfter(startingAfter: String) = apply { this.startingAfter = startingAfter }

        /**
         * A cursor representing an item's token before which a page of results should end. Used to
         * retrieve the previous page of results before this item.
         */
        fun endingBefore(endingBefore: String) = apply { this.endingBefore = endingBefore }

        fun additionalQueryParams(additionalQueryParams: Map<String, List<String>>) = apply {
            this.additionalQueryParams.clear()
            putAllQueryParams(additionalQueryParams)
        }

        fun putQueryParam(name: String, value: String) = apply {
            this.additionalQueryParams.getOrPut(name) { mutableListOf() }.add(value)
        }

        fun putQueryParams(name: String, values: Iterable<String>) = apply {
            this.additionalQueryParams.getOrPut(name) { mutableListOf() }.addAll(values)
        }

        fun putAllQueryParams(additionalQueryParams: Map<String, Iterable<String>>) = apply {
            additionalQueryParams.forEach(this::putQueryParams)
        }

        fun removeQueryParam(name: String) = apply {
            this.additionalQueryParams.put(name, mutableListOf())
        }

        fun additionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.clear()
            putAllHeaders(additionalHeaders)
        }

        fun putHeader(name: String, value: String) = apply {
            this.additionalHeaders.getOrPut(name) { mutableListOf() }.add(value)
        }

        fun putHeaders(name: String, values: Iterable<String>) = apply {
            this.additionalHeaders.getOrPut(name) { mutableListOf() }.addAll(values)
        }

        fun putAllHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            additionalHeaders.forEach(this::putHeaders)
        }

        fun removeHeader(name: String) = apply { this.additionalHeaders.put(name, mutableListOf()) }

        fun build(): ExternalBankAccountListParams =
            ExternalBankAccountListParams(
                accountToken,
                ownerTypes?.toUnmodifiable(),
                accountTypes?.toUnmodifiable(),
                states?.toUnmodifiable(),
                verificationStates?.toUnmodifiable(),
                countries?.toUnmodifiable(),
                pageSize,
                startingAfter,
                endingBefore,
                additionalQueryParams.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
                additionalHeaders.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
            )
    }

    class AccountType
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is AccountType && this.value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()

        companion object {

            val CHECKING = AccountType(JsonField.of("CHECKING"))

            val SAVINGS = AccountType(JsonField.of("SAVINGS"))

            fun of(value: String) = AccountType(JsonField.of(value))
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
                else -> throw LithicInvalidDataException("Unknown AccountType: $value")
            }

        fun asString(): String = _value().asStringOrThrow()
    }

    class AccountState
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is AccountState && this.value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()

        companion object {

            val ENABLED = AccountState(JsonField.of("ENABLED"))

            val CLOSED = AccountState(JsonField.of("CLOSED"))

            val PAUSED = AccountState(JsonField.of("PAUSED"))

            fun of(value: String) = AccountState(JsonField.of(value))
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
                else -> throw LithicInvalidDataException("Unknown AccountState: $value")
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