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
import com.lithic.api.core.checkKnown
import com.lithic.api.core.checkRequired
import com.lithic.api.core.immutableEmptyMap
import com.lithic.api.core.toImmutable
import com.lithic.api.errors.LithicInvalidDataException
import java.time.OffsetDateTime
import java.util.Objects

@NoAutoDetect
class Account
@JsonCreator
private constructor(
    @JsonProperty("token") @ExcludeMissing private val token: JsonField<String> = JsonMissing.of(),
    @JsonProperty("created")
    @ExcludeMissing
    private val created: JsonField<OffsetDateTime> = JsonMissing.of(),
    @JsonProperty("spend_limit")
    @ExcludeMissing
    private val spendLimit: JsonField<SpendLimit> = JsonMissing.of(),
    @JsonProperty("state") @ExcludeMissing private val state: JsonField<State> = JsonMissing.of(),
    @JsonProperty("account_holder")
    @ExcludeMissing
    private val accountHolder: JsonField<AccountHolder> = JsonMissing.of(),
    @JsonProperty("auth_rule_tokens")
    @ExcludeMissing
    private val authRuleTokens: JsonField<List<String>> = JsonMissing.of(),
    @JsonProperty("cardholder_currency")
    @ExcludeMissing
    private val cardholderCurrency: JsonField<String> = JsonMissing.of(),
    @JsonProperty("verification_address")
    @ExcludeMissing
    private val verificationAddress: JsonField<VerificationAddress> = JsonMissing.of(),
    @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
) {

    /**
     * Globally unique identifier for the account. This is the same as the account_token returned by
     * the enroll endpoint. If using this parameter, do not include pagination.
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun token(): String = token.getRequired("token")

    /**
     * Timestamp of when the account was created. For accounts created before 2023-05-11, this field
     * will be null.
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun created(): OffsetDateTime? = created.getNullable("created")

    /**
     * Spend limit information for the user containing the daily, monthly, and lifetime spend limit
     * of the account. Any charges to a card owned by this account will be declined once their
     * transaction volume has surpassed the value in the applicable time limit (rolling). A lifetime
     * limit of 0 indicates that the lifetime limit feature is disabled.
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun spendLimit(): SpendLimit = spendLimit.getRequired("spend_limit")

    /**
     * Account state:
     * - `ACTIVE` - Account is able to transact and create new cards.
     * - `PAUSED` - Account will not be able to transact or create new cards. It can be set back to
     *   `ACTIVE`.
     * - `CLOSED` - Account will not be able to transact or create new cards. `CLOSED` accounts are
     *   also unable to be transitioned to `ACTIVE` or `PAUSED` states. `CLOSED` accounts result
     *   from failing to pass KYB/KYC or Lithic closing for risk/compliance reasons. Please contact
     *   [support@lithic.com](mailto:support@lithic.com) if you believe this was in error.
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun state(): State = state.getRequired("state")

    /**
     * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun accountHolder(): AccountHolder? = accountHolder.getNullable("account_holder")

    /**
     * List of identifiers for the Auth Rule(s) that are applied on the account. This field is
     * deprecated and will no longer be populated in the `account_holder` object. The key will be
     * removed from the schema in a future release. Use the `/auth_rules` endpoints to fetch Auth
     * Rule information instead.
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    @Deprecated("deprecated")
    fun authRuleTokens(): List<String>? = authRuleTokens.getNullable("auth_rule_tokens")

    /**
     * 3-character alphabetic ISO 4217 code for the currency of the cardholder.
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun cardholderCurrency(): String? = cardholderCurrency.getNullable("cardholder_currency")

    /**
     * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    @Deprecated("deprecated")
    fun verificationAddress(): VerificationAddress? =
        verificationAddress.getNullable("verification_address")

    /**
     * Returns the raw JSON value of [token].
     *
     * Unlike [token], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("token") @ExcludeMissing fun _token(): JsonField<String> = token

    /**
     * Returns the raw JSON value of [created].
     *
     * Unlike [created], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("created") @ExcludeMissing fun _created(): JsonField<OffsetDateTime> = created

    /**
     * Returns the raw JSON value of [spendLimit].
     *
     * Unlike [spendLimit], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("spend_limit")
    @ExcludeMissing
    fun _spendLimit(): JsonField<SpendLimit> = spendLimit

    /**
     * Returns the raw JSON value of [state].
     *
     * Unlike [state], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("state") @ExcludeMissing fun _state(): JsonField<State> = state

    /**
     * Returns the raw JSON value of [accountHolder].
     *
     * Unlike [accountHolder], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("account_holder")
    @ExcludeMissing
    fun _accountHolder(): JsonField<AccountHolder> = accountHolder

    /**
     * Returns the raw JSON value of [authRuleTokens].
     *
     * Unlike [authRuleTokens], this method doesn't throw if the JSON field has an unexpected type.
     */
    @Deprecated("deprecated")
    @JsonProperty("auth_rule_tokens")
    @ExcludeMissing
    fun _authRuleTokens(): JsonField<List<String>> = authRuleTokens

    /**
     * Returns the raw JSON value of [cardholderCurrency].
     *
     * Unlike [cardholderCurrency], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("cardholder_currency")
    @ExcludeMissing
    fun _cardholderCurrency(): JsonField<String> = cardholderCurrency

    /**
     * Returns the raw JSON value of [verificationAddress].
     *
     * Unlike [verificationAddress], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @Deprecated("deprecated")
    @JsonProperty("verification_address")
    @ExcludeMissing
    fun _verificationAddress(): JsonField<VerificationAddress> = verificationAddress

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    private var validated: Boolean = false

    fun validate(): Account = apply {
        if (validated) {
            return@apply
        }

        token()
        created()
        spendLimit().validate()
        state()
        accountHolder()?.validate()
        authRuleTokens()
        cardholderCurrency()
        verificationAddress()?.validate()
        validated = true
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [Account].
         *
         * The following fields are required:
         * ```kotlin
         * .token()
         * .created()
         * .spendLimit()
         * .state()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [Account]. */
    class Builder internal constructor() {

        private var token: JsonField<String>? = null
        private var created: JsonField<OffsetDateTime>? = null
        private var spendLimit: JsonField<SpendLimit>? = null
        private var state: JsonField<State>? = null
        private var accountHolder: JsonField<AccountHolder> = JsonMissing.of()
        private var authRuleTokens: JsonField<MutableList<String>>? = null
        private var cardholderCurrency: JsonField<String> = JsonMissing.of()
        private var verificationAddress: JsonField<VerificationAddress> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(account: Account) = apply {
            token = account.token
            created = account.created
            spendLimit = account.spendLimit
            state = account.state
            accountHolder = account.accountHolder
            authRuleTokens = account.authRuleTokens.map { it.toMutableList() }
            cardholderCurrency = account.cardholderCurrency
            verificationAddress = account.verificationAddress
            additionalProperties = account.additionalProperties.toMutableMap()
        }

        /**
         * Globally unique identifier for the account. This is the same as the account_token
         * returned by the enroll endpoint. If using this parameter, do not include pagination.
         */
        fun token(token: String) = token(JsonField.of(token))

        /**
         * Sets [Builder.token] to an arbitrary JSON value.
         *
         * You should usually call [Builder.token] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun token(token: JsonField<String>) = apply { this.token = token }

        /**
         * Timestamp of when the account was created. For accounts created before 2023-05-11, this
         * field will be null.
         */
        fun created(created: OffsetDateTime?) = created(JsonField.ofNullable(created))

        /**
         * Sets [Builder.created] to an arbitrary JSON value.
         *
         * You should usually call [Builder.created] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun created(created: JsonField<OffsetDateTime>) = apply { this.created = created }

        /**
         * Spend limit information for the user containing the daily, monthly, and lifetime spend
         * limit of the account. Any charges to a card owned by this account will be declined once
         * their transaction volume has surpassed the value in the applicable time limit (rolling).
         * A lifetime limit of 0 indicates that the lifetime limit feature is disabled.
         */
        fun spendLimit(spendLimit: SpendLimit) = spendLimit(JsonField.of(spendLimit))

        /**
         * Sets [Builder.spendLimit] to an arbitrary JSON value.
         *
         * You should usually call [Builder.spendLimit] with a well-typed [SpendLimit] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun spendLimit(spendLimit: JsonField<SpendLimit>) = apply { this.spendLimit = spendLimit }

        /**
         * Account state:
         * - `ACTIVE` - Account is able to transact and create new cards.
         * - `PAUSED` - Account will not be able to transact or create new cards. It can be set back
         *   to `ACTIVE`.
         * - `CLOSED` - Account will not be able to transact or create new cards. `CLOSED` accounts
         *   are also unable to be transitioned to `ACTIVE` or `PAUSED` states. `CLOSED` accounts
         *   result from failing to pass KYB/KYC or Lithic closing for risk/compliance reasons.
         *   Please contact [support@lithic.com](mailto:support@lithic.com) if you believe this was
         *   in error.
         */
        fun state(state: State) = state(JsonField.of(state))

        /**
         * Sets [Builder.state] to an arbitrary JSON value.
         *
         * You should usually call [Builder.state] with a well-typed [State] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun state(state: JsonField<State>) = apply { this.state = state }

        fun accountHolder(accountHolder: AccountHolder) = accountHolder(JsonField.of(accountHolder))

        /**
         * Sets [Builder.accountHolder] to an arbitrary JSON value.
         *
         * You should usually call [Builder.accountHolder] with a well-typed [AccountHolder] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun accountHolder(accountHolder: JsonField<AccountHolder>) = apply {
            this.accountHolder = accountHolder
        }

        /**
         * List of identifiers for the Auth Rule(s) that are applied on the account. This field is
         * deprecated and will no longer be populated in the `account_holder` object. The key will
         * be removed from the schema in a future release. Use the `/auth_rules` endpoints to fetch
         * Auth Rule information instead.
         */
        @Deprecated("deprecated")
        fun authRuleTokens(authRuleTokens: List<String>) =
            authRuleTokens(JsonField.of(authRuleTokens))

        /**
         * Sets [Builder.authRuleTokens] to an arbitrary JSON value.
         *
         * You should usually call [Builder.authRuleTokens] with a well-typed `List<String>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        @Deprecated("deprecated")
        fun authRuleTokens(authRuleTokens: JsonField<List<String>>) = apply {
            this.authRuleTokens = authRuleTokens.map { it.toMutableList() }
        }

        /**
         * Adds a single [String] to [authRuleTokens].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        @Deprecated("deprecated")
        fun addAuthRuleToken(authRuleToken: String) = apply {
            authRuleTokens =
                (authRuleTokens ?: JsonField.of(mutableListOf())).also {
                    checkKnown("authRuleTokens", it).add(authRuleToken)
                }
        }

        /** 3-character alphabetic ISO 4217 code for the currency of the cardholder. */
        fun cardholderCurrency(cardholderCurrency: String) =
            cardholderCurrency(JsonField.of(cardholderCurrency))

        /**
         * Sets [Builder.cardholderCurrency] to an arbitrary JSON value.
         *
         * You should usually call [Builder.cardholderCurrency] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun cardholderCurrency(cardholderCurrency: JsonField<String>) = apply {
            this.cardholderCurrency = cardholderCurrency
        }

        @Deprecated("deprecated")
        fun verificationAddress(verificationAddress: VerificationAddress) =
            verificationAddress(JsonField.of(verificationAddress))

        /**
         * Sets [Builder.verificationAddress] to an arbitrary JSON value.
         *
         * You should usually call [Builder.verificationAddress] with a well-typed
         * [VerificationAddress] value instead. This method is primarily for setting the field to an
         * undocumented or not yet supported value.
         */
        @Deprecated("deprecated")
        fun verificationAddress(verificationAddress: JsonField<VerificationAddress>) = apply {
            this.verificationAddress = verificationAddress
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

        fun build(): Account =
            Account(
                checkRequired("token", token),
                checkRequired("created", created),
                checkRequired("spendLimit", spendLimit),
                checkRequired("state", state),
                accountHolder,
                (authRuleTokens ?: JsonMissing.of()).map { it.toImmutable() },
                cardholderCurrency,
                verificationAddress,
                additionalProperties.toImmutable(),
            )
    }

    /**
     * Spend limit information for the user containing the daily, monthly, and lifetime spend limit
     * of the account. Any charges to a card owned by this account will be declined once their
     * transaction volume has surpassed the value in the applicable time limit (rolling). A lifetime
     * limit of 0 indicates that the lifetime limit feature is disabled.
     */
    @NoAutoDetect
    class SpendLimit
    @JsonCreator
    private constructor(
        @JsonProperty("daily")
        @ExcludeMissing
        private val daily: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("lifetime")
        @ExcludeMissing
        private val lifetime: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("monthly")
        @ExcludeMissing
        private val monthly: JsonField<Long> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /**
         * Daily spend limit (in cents).
         *
         * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun daily(): Long = daily.getRequired("daily")

        /**
         * Total spend limit over account lifetime (in cents).
         *
         * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun lifetime(): Long = lifetime.getRequired("lifetime")

        /**
         * Monthly spend limit (in cents).
         *
         * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun monthly(): Long = monthly.getRequired("monthly")

        /**
         * Returns the raw JSON value of [daily].
         *
         * Unlike [daily], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("daily") @ExcludeMissing fun _daily(): JsonField<Long> = daily

        /**
         * Returns the raw JSON value of [lifetime].
         *
         * Unlike [lifetime], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("lifetime") @ExcludeMissing fun _lifetime(): JsonField<Long> = lifetime

        /**
         * Returns the raw JSON value of [monthly].
         *
         * Unlike [monthly], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("monthly") @ExcludeMissing fun _monthly(): JsonField<Long> = monthly

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): SpendLimit = apply {
            if (validated) {
                return@apply
            }

            daily()
            lifetime()
            monthly()
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            /**
             * Returns a mutable builder for constructing an instance of [SpendLimit].
             *
             * The following fields are required:
             * ```kotlin
             * .daily()
             * .lifetime()
             * .monthly()
             * ```
             */
            fun builder() = Builder()
        }

        /** A builder for [SpendLimit]. */
        class Builder internal constructor() {

            private var daily: JsonField<Long>? = null
            private var lifetime: JsonField<Long>? = null
            private var monthly: JsonField<Long>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(spendLimit: SpendLimit) = apply {
                daily = spendLimit.daily
                lifetime = spendLimit.lifetime
                monthly = spendLimit.monthly
                additionalProperties = spendLimit.additionalProperties.toMutableMap()
            }

            /** Daily spend limit (in cents). */
            fun daily(daily: Long) = daily(JsonField.of(daily))

            /**
             * Sets [Builder.daily] to an arbitrary JSON value.
             *
             * You should usually call [Builder.daily] with a well-typed [Long] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun daily(daily: JsonField<Long>) = apply { this.daily = daily }

            /** Total spend limit over account lifetime (in cents). */
            fun lifetime(lifetime: Long) = lifetime(JsonField.of(lifetime))

            /**
             * Sets [Builder.lifetime] to an arbitrary JSON value.
             *
             * You should usually call [Builder.lifetime] with a well-typed [Long] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun lifetime(lifetime: JsonField<Long>) = apply { this.lifetime = lifetime }

            /** Monthly spend limit (in cents). */
            fun monthly(monthly: Long) = monthly(JsonField.of(monthly))

            /**
             * Sets [Builder.monthly] to an arbitrary JSON value.
             *
             * You should usually call [Builder.monthly] with a well-typed [Long] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun monthly(monthly: JsonField<Long>) = apply { this.monthly = monthly }

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

            fun build(): SpendLimit =
                SpendLimit(
                    checkRequired("daily", daily),
                    checkRequired("lifetime", lifetime),
                    checkRequired("monthly", monthly),
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is SpendLimit && daily == other.daily && lifetime == other.lifetime && monthly == other.monthly && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(daily, lifetime, monthly, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "SpendLimit{daily=$daily, lifetime=$lifetime, monthly=$monthly, additionalProperties=$additionalProperties}"
    }

    /**
     * Account state:
     * - `ACTIVE` - Account is able to transact and create new cards.
     * - `PAUSED` - Account will not be able to transact or create new cards. It can be set back to
     *   `ACTIVE`.
     * - `CLOSED` - Account will not be able to transact or create new cards. `CLOSED` accounts are
     *   also unable to be transitioned to `ACTIVE` or `PAUSED` states. `CLOSED` accounts result
     *   from failing to pass KYB/KYC or Lithic closing for risk/compliance reasons. Please contact
     *   [support@lithic.com](mailto:support@lithic.com) if you believe this was in error.
     */
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

            val ACTIVE = of("ACTIVE")

            val PAUSED = of("PAUSED")

            val CLOSED = of("CLOSED")

            fun of(value: String) = State(JsonField.of(value))
        }

        /** An enum containing [State]'s known values. */
        enum class Known {
            ACTIVE,
            PAUSED,
            CLOSED,
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
            ACTIVE,
            PAUSED,
            CLOSED,
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
                ACTIVE -> Value.ACTIVE
                PAUSED -> Value.PAUSED
                CLOSED -> Value.CLOSED
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
                ACTIVE -> Known.ACTIVE
                PAUSED -> Known.PAUSED
                CLOSED -> Known.CLOSED
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

    @NoAutoDetect
    class AccountHolder
    @JsonCreator
    private constructor(
        @JsonProperty("token")
        @ExcludeMissing
        private val token: JsonField<String> = JsonMissing.of(),
        @JsonProperty("business_account_token")
        @ExcludeMissing
        private val businessAccountToken: JsonField<String> = JsonMissing.of(),
        @JsonProperty("email")
        @ExcludeMissing
        private val email: JsonField<String> = JsonMissing.of(),
        @JsonProperty("phone_number")
        @ExcludeMissing
        private val phoneNumber: JsonField<String> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /**
         * Globally unique identifier for the account holder.
         *
         * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun token(): String = token.getRequired("token")

        /**
         * Only applicable for customers using the KYC-Exempt workflow to enroll authorized users of
         * businesses. Account_token of the enrolled business associated with an enrolled
         * AUTHORIZED_USER individual.
         *
         * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun businessAccountToken(): String =
            businessAccountToken.getRequired("business_account_token")

        /**
         * Email address.
         *
         * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun email(): String = email.getRequired("email")

        /**
         * Phone number of the individual.
         *
         * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun phoneNumber(): String = phoneNumber.getRequired("phone_number")

        /**
         * Returns the raw JSON value of [token].
         *
         * Unlike [token], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("token") @ExcludeMissing fun _token(): JsonField<String> = token

        /**
         * Returns the raw JSON value of [businessAccountToken].
         *
         * Unlike [businessAccountToken], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("business_account_token")
        @ExcludeMissing
        fun _businessAccountToken(): JsonField<String> = businessAccountToken

        /**
         * Returns the raw JSON value of [email].
         *
         * Unlike [email], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("email") @ExcludeMissing fun _email(): JsonField<String> = email

        /**
         * Returns the raw JSON value of [phoneNumber].
         *
         * Unlike [phoneNumber], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("phone_number")
        @ExcludeMissing
        fun _phoneNumber(): JsonField<String> = phoneNumber

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): AccountHolder = apply {
            if (validated) {
                return@apply
            }

            token()
            businessAccountToken()
            email()
            phoneNumber()
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            /**
             * Returns a mutable builder for constructing an instance of [AccountHolder].
             *
             * The following fields are required:
             * ```kotlin
             * .token()
             * .businessAccountToken()
             * .email()
             * .phoneNumber()
             * ```
             */
            fun builder() = Builder()
        }

        /** A builder for [AccountHolder]. */
        class Builder internal constructor() {

            private var token: JsonField<String>? = null
            private var businessAccountToken: JsonField<String>? = null
            private var email: JsonField<String>? = null
            private var phoneNumber: JsonField<String>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(accountHolder: AccountHolder) = apply {
                token = accountHolder.token
                businessAccountToken = accountHolder.businessAccountToken
                email = accountHolder.email
                phoneNumber = accountHolder.phoneNumber
                additionalProperties = accountHolder.additionalProperties.toMutableMap()
            }

            /** Globally unique identifier for the account holder. */
            fun token(token: String) = token(JsonField.of(token))

            /**
             * Sets [Builder.token] to an arbitrary JSON value.
             *
             * You should usually call [Builder.token] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun token(token: JsonField<String>) = apply { this.token = token }

            /**
             * Only applicable for customers using the KYC-Exempt workflow to enroll authorized
             * users of businesses. Account_token of the enrolled business associated with an
             * enrolled AUTHORIZED_USER individual.
             */
            fun businessAccountToken(businessAccountToken: String) =
                businessAccountToken(JsonField.of(businessAccountToken))

            /**
             * Sets [Builder.businessAccountToken] to an arbitrary JSON value.
             *
             * You should usually call [Builder.businessAccountToken] with a well-typed [String]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun businessAccountToken(businessAccountToken: JsonField<String>) = apply {
                this.businessAccountToken = businessAccountToken
            }

            /** Email address. */
            fun email(email: String) = email(JsonField.of(email))

            /**
             * Sets [Builder.email] to an arbitrary JSON value.
             *
             * You should usually call [Builder.email] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun email(email: JsonField<String>) = apply { this.email = email }

            /** Phone number of the individual. */
            fun phoneNumber(phoneNumber: String) = phoneNumber(JsonField.of(phoneNumber))

            /**
             * Sets [Builder.phoneNumber] to an arbitrary JSON value.
             *
             * You should usually call [Builder.phoneNumber] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun phoneNumber(phoneNumber: JsonField<String>) = apply {
                this.phoneNumber = phoneNumber
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

            fun build(): AccountHolder =
                AccountHolder(
                    checkRequired("token", token),
                    checkRequired("businessAccountToken", businessAccountToken),
                    checkRequired("email", email),
                    checkRequired("phoneNumber", phoneNumber),
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is AccountHolder && token == other.token && businessAccountToken == other.businessAccountToken && email == other.email && phoneNumber == other.phoneNumber && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(token, businessAccountToken, email, phoneNumber, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "AccountHolder{token=$token, businessAccountToken=$businessAccountToken, email=$email, phoneNumber=$phoneNumber, additionalProperties=$additionalProperties}"
    }

    @Deprecated("deprecated")
    @NoAutoDetect
    class VerificationAddress
    @JsonCreator
    private constructor(
        @JsonProperty("address1")
        @ExcludeMissing
        private val address1: JsonField<String> = JsonMissing.of(),
        @JsonProperty("city")
        @ExcludeMissing
        private val city: JsonField<String> = JsonMissing.of(),
        @JsonProperty("country")
        @ExcludeMissing
        private val country: JsonField<String> = JsonMissing.of(),
        @JsonProperty("postal_code")
        @ExcludeMissing
        private val postalCode: JsonField<String> = JsonMissing.of(),
        @JsonProperty("state")
        @ExcludeMissing
        private val state: JsonField<String> = JsonMissing.of(),
        @JsonProperty("address2")
        @ExcludeMissing
        private val address2: JsonField<String> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /**
         * Valid deliverable address (no PO boxes).
         *
         * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun address1(): String = address1.getRequired("address1")

        /**
         * City name.
         *
         * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun city(): String = city.getRequired("city")

        /**
         * Country name. Only USA is currently supported.
         *
         * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun country(): String = country.getRequired("country")

        /**
         * Valid postal code. Only USA postal codes (ZIP codes) are currently supported, entered as
         * a five-digit postal code or nine-digit postal code (ZIP+4) using the format 12345-1234.
         *
         * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun postalCode(): String = postalCode.getRequired("postal_code")

        /**
         * Valid state code. Only USA state codes are currently supported, entered in uppercase ISO
         * 3166-2 two-character format.
         *
         * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun state(): String = state.getRequired("state")

        /**
         * Unit or apartment number (if applicable).
         *
         * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun address2(): String? = address2.getNullable("address2")

        /**
         * Returns the raw JSON value of [address1].
         *
         * Unlike [address1], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("address1") @ExcludeMissing fun _address1(): JsonField<String> = address1

        /**
         * Returns the raw JSON value of [city].
         *
         * Unlike [city], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("city") @ExcludeMissing fun _city(): JsonField<String> = city

        /**
         * Returns the raw JSON value of [country].
         *
         * Unlike [country], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("country") @ExcludeMissing fun _country(): JsonField<String> = country

        /**
         * Returns the raw JSON value of [postalCode].
         *
         * Unlike [postalCode], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("postal_code")
        @ExcludeMissing
        fun _postalCode(): JsonField<String> = postalCode

        /**
         * Returns the raw JSON value of [state].
         *
         * Unlike [state], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("state") @ExcludeMissing fun _state(): JsonField<String> = state

        /**
         * Returns the raw JSON value of [address2].
         *
         * Unlike [address2], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("address2") @ExcludeMissing fun _address2(): JsonField<String> = address2

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): VerificationAddress = apply {
            if (validated) {
                return@apply
            }

            address1()
            city()
            country()
            postalCode()
            state()
            address2()
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            /**
             * Returns a mutable builder for constructing an instance of [VerificationAddress].
             *
             * The following fields are required:
             * ```kotlin
             * .address1()
             * .city()
             * .country()
             * .postalCode()
             * .state()
             * ```
             */
            fun builder() = Builder()
        }

        /** A builder for [VerificationAddress]. */
        class Builder internal constructor() {

            private var address1: JsonField<String>? = null
            private var city: JsonField<String>? = null
            private var country: JsonField<String>? = null
            private var postalCode: JsonField<String>? = null
            private var state: JsonField<String>? = null
            private var address2: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(verificationAddress: VerificationAddress) = apply {
                address1 = verificationAddress.address1
                city = verificationAddress.city
                country = verificationAddress.country
                postalCode = verificationAddress.postalCode
                state = verificationAddress.state
                address2 = verificationAddress.address2
                additionalProperties = verificationAddress.additionalProperties.toMutableMap()
            }

            /** Valid deliverable address (no PO boxes). */
            fun address1(address1: String) = address1(JsonField.of(address1))

            /**
             * Sets [Builder.address1] to an arbitrary JSON value.
             *
             * You should usually call [Builder.address1] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun address1(address1: JsonField<String>) = apply { this.address1 = address1 }

            /** City name. */
            fun city(city: String) = city(JsonField.of(city))

            /**
             * Sets [Builder.city] to an arbitrary JSON value.
             *
             * You should usually call [Builder.city] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun city(city: JsonField<String>) = apply { this.city = city }

            /** Country name. Only USA is currently supported. */
            fun country(country: String) = country(JsonField.of(country))

            /**
             * Sets [Builder.country] to an arbitrary JSON value.
             *
             * You should usually call [Builder.country] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun country(country: JsonField<String>) = apply { this.country = country }

            /**
             * Valid postal code. Only USA postal codes (ZIP codes) are currently supported, entered
             * as a five-digit postal code or nine-digit postal code (ZIP+4) using the format
             * 12345-1234.
             */
            fun postalCode(postalCode: String) = postalCode(JsonField.of(postalCode))

            /**
             * Sets [Builder.postalCode] to an arbitrary JSON value.
             *
             * You should usually call [Builder.postalCode] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun postalCode(postalCode: JsonField<String>) = apply { this.postalCode = postalCode }

            /**
             * Valid state code. Only USA state codes are currently supported, entered in uppercase
             * ISO 3166-2 two-character format.
             */
            fun state(state: String) = state(JsonField.of(state))

            /**
             * Sets [Builder.state] to an arbitrary JSON value.
             *
             * You should usually call [Builder.state] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun state(state: JsonField<String>) = apply { this.state = state }

            /** Unit or apartment number (if applicable). */
            fun address2(address2: String) = address2(JsonField.of(address2))

            /**
             * Sets [Builder.address2] to an arbitrary JSON value.
             *
             * You should usually call [Builder.address2] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun address2(address2: JsonField<String>) = apply { this.address2 = address2 }

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

            fun build(): VerificationAddress =
                VerificationAddress(
                    checkRequired("address1", address1),
                    checkRequired("city", city),
                    checkRequired("country", country),
                    checkRequired("postalCode", postalCode),
                    checkRequired("state", state),
                    address2,
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is VerificationAddress && address1 == other.address1 && city == other.city && country == other.country && postalCode == other.postalCode && state == other.state && address2 == other.address2 && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(address1, city, country, postalCode, state, address2, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "VerificationAddress{address1=$address1, city=$city, country=$country, postalCode=$postalCode, state=$state, address2=$address2, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is Account && token == other.token && created == other.created && spendLimit == other.spendLimit && state == other.state && accountHolder == other.accountHolder && authRuleTokens == other.authRuleTokens && cardholderCurrency == other.cardholderCurrency && verificationAddress == other.verificationAddress && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(token, created, spendLimit, state, accountHolder, authRuleTokens, cardholderCurrency, verificationAddress, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "Account{token=$token, created=$created, spendLimit=$spendLimit, state=$state, accountHolder=$accountHolder, authRuleTokens=$authRuleTokens, cardholderCurrency=$cardholderCurrency, verificationAddress=$verificationAddress, additionalProperties=$additionalProperties}"
}
