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
import java.util.Objects

/**
 * Voids a pending authorization. If `amount` is not set, the full amount will be voided. Can be
 * used on partially voided transactions but not partially cleared transactions. _Simulating an
 * authorization expiry on credit authorizations or credit authorization advice is not currently
 * supported but will be added soon._
 */
class TransactionSimulateVoidParams
private constructor(
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /** The transaction token returned from the /v1/simulate/authorize response. */
    fun token(): String = body.token()

    /**
     * Amount (in cents) to void. Typically this will match the amount in the original
     * authorization, but can be less.
     */
    fun amount(): Long? = body.amount()

    /**
     * Type of event to simulate. Defaults to `AUTHORIZATION_REVERSAL`.
     * - `AUTHORIZATION_EXPIRY` indicates authorization has expired and been reversed by Lithic.
     * - `AUTHORIZATION_REVERSAL` indicates authorization was reversed by the merchant.
     */
    fun type(): Type? = body.type()

    /** The transaction token returned from the /v1/simulate/authorize response. */
    fun _token(): JsonField<String> = body._token()

    /**
     * Amount (in cents) to void. Typically this will match the amount in the original
     * authorization, but can be less.
     */
    fun _amount(): JsonField<Long> = body._amount()

    /**
     * Type of event to simulate. Defaults to `AUTHORIZATION_REVERSAL`.
     * - `AUTHORIZATION_EXPIRY` indicates authorization has expired and been reversed by Lithic.
     * - `AUTHORIZATION_REVERSAL` indicates authorization was reversed by the merchant.
     */
    fun _type(): JsonField<Type> = body._type()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    internal fun _body(): Body = body

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    @NoAutoDetect
    class Body
    @JsonCreator
    private constructor(
        @JsonProperty("token")
        @ExcludeMissing
        private val token: JsonField<String> = JsonMissing.of(),
        @JsonProperty("amount")
        @ExcludeMissing
        private val amount: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("type") @ExcludeMissing private val type: JsonField<Type> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /** The transaction token returned from the /v1/simulate/authorize response. */
        fun token(): String = token.getRequired("token")

        /**
         * Amount (in cents) to void. Typically this will match the amount in the original
         * authorization, but can be less.
         */
        fun amount(): Long? = amount.getNullable("amount")

        /**
         * Type of event to simulate. Defaults to `AUTHORIZATION_REVERSAL`.
         * - `AUTHORIZATION_EXPIRY` indicates authorization has expired and been reversed by Lithic.
         * - `AUTHORIZATION_REVERSAL` indicates authorization was reversed by the merchant.
         */
        fun type(): Type? = type.getNullable("type")

        /** The transaction token returned from the /v1/simulate/authorize response. */
        @JsonProperty("token") @ExcludeMissing fun _token(): JsonField<String> = token

        /**
         * Amount (in cents) to void. Typically this will match the amount in the original
         * authorization, but can be less.
         */
        @JsonProperty("amount") @ExcludeMissing fun _amount(): JsonField<Long> = amount

        /**
         * Type of event to simulate. Defaults to `AUTHORIZATION_REVERSAL`.
         * - `AUTHORIZATION_EXPIRY` indicates authorization has expired and been reversed by Lithic.
         * - `AUTHORIZATION_REVERSAL` indicates authorization was reversed by the merchant.
         */
        @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            token()
            amount()
            type()
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            /**
             * Returns a mutable builder for constructing an instance of [Body].
             *
             * The following fields are required:
             * ```kotlin
             * .token()
             * ```
             */
            fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var token: JsonField<String>? = null
            private var amount: JsonField<Long> = JsonMissing.of()
            private var type: JsonField<Type> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(body: Body) = apply {
                token = body.token
                amount = body.amount
                type = body.type
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            /** The transaction token returned from the /v1/simulate/authorize response. */
            fun token(token: String) = token(JsonField.of(token))

            /** The transaction token returned from the /v1/simulate/authorize response. */
            fun token(token: JsonField<String>) = apply { this.token = token }

            /**
             * Amount (in cents) to void. Typically this will match the amount in the original
             * authorization, but can be less.
             */
            fun amount(amount: Long) = amount(JsonField.of(amount))

            /**
             * Amount (in cents) to void. Typically this will match the amount in the original
             * authorization, but can be less.
             */
            fun amount(amount: JsonField<Long>) = apply { this.amount = amount }

            /**
             * Type of event to simulate. Defaults to `AUTHORIZATION_REVERSAL`.
             * - `AUTHORIZATION_EXPIRY` indicates authorization has expired and been reversed by
             *   Lithic.
             * - `AUTHORIZATION_REVERSAL` indicates authorization was reversed by the merchant.
             */
            fun type(type: Type) = type(JsonField.of(type))

            /**
             * Type of event to simulate. Defaults to `AUTHORIZATION_REVERSAL`.
             * - `AUTHORIZATION_EXPIRY` indicates authorization has expired and been reversed by
             *   Lithic.
             * - `AUTHORIZATION_REVERSAL` indicates authorization was reversed by the merchant.
             */
            fun type(type: JsonField<Type>) = apply { this.type = type }

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

            fun build(): Body =
                Body(
                    checkRequired("token", token),
                    amount,
                    type,
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Body && token == other.token && amount == other.amount && type == other.type && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(token, amount, type, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{token=$token, amount=$amount, type=$type, additionalProperties=$additionalProperties}"
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [TransactionSimulateVoidParams].
         *
         * The following fields are required:
         * ```kotlin
         * .token()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [TransactionSimulateVoidParams]. */
    @NoAutoDetect
    class Builder internal constructor() {

        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        internal fun from(transactionSimulateVoidParams: TransactionSimulateVoidParams) = apply {
            body = transactionSimulateVoidParams.body.toBuilder()
            additionalHeaders = transactionSimulateVoidParams.additionalHeaders.toBuilder()
            additionalQueryParams = transactionSimulateVoidParams.additionalQueryParams.toBuilder()
        }

        /** The transaction token returned from the /v1/simulate/authorize response. */
        fun token(token: String) = apply { body.token(token) }

        /** The transaction token returned from the /v1/simulate/authorize response. */
        fun token(token: JsonField<String>) = apply { body.token(token) }

        /**
         * Amount (in cents) to void. Typically this will match the amount in the original
         * authorization, but can be less.
         */
        fun amount(amount: Long) = apply { body.amount(amount) }

        /**
         * Amount (in cents) to void. Typically this will match the amount in the original
         * authorization, but can be less.
         */
        fun amount(amount: JsonField<Long>) = apply { body.amount(amount) }

        /**
         * Type of event to simulate. Defaults to `AUTHORIZATION_REVERSAL`.
         * - `AUTHORIZATION_EXPIRY` indicates authorization has expired and been reversed by Lithic.
         * - `AUTHORIZATION_REVERSAL` indicates authorization was reversed by the merchant.
         */
        fun type(type: Type) = apply { body.type(type) }

        /**
         * Type of event to simulate. Defaults to `AUTHORIZATION_REVERSAL`.
         * - `AUTHORIZATION_EXPIRY` indicates authorization has expired and been reversed by Lithic.
         * - `AUTHORIZATION_REVERSAL` indicates authorization was reversed by the merchant.
         */
        fun type(type: JsonField<Type>) = apply { body.type(type) }

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

        fun build(): TransactionSimulateVoidParams =
            TransactionSimulateVoidParams(
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    /**
     * Type of event to simulate. Defaults to `AUTHORIZATION_REVERSAL`.
     * - `AUTHORIZATION_EXPIRY` indicates authorization has expired and been reversed by Lithic.
     * - `AUTHORIZATION_REVERSAL` indicates authorization was reversed by the merchant.
     */
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

            val AUTHORIZATION_EXPIRY = of("AUTHORIZATION_EXPIRY")

            val AUTHORIZATION_REVERSAL = of("AUTHORIZATION_REVERSAL")

            fun of(value: String) = Type(JsonField.of(value))
        }

        /** An enum containing [Type]'s known values. */
        enum class Known {
            AUTHORIZATION_EXPIRY,
            AUTHORIZATION_REVERSAL,
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
            AUTHORIZATION_EXPIRY,
            AUTHORIZATION_REVERSAL,
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
                AUTHORIZATION_EXPIRY -> Value.AUTHORIZATION_EXPIRY
                AUTHORIZATION_REVERSAL -> Value.AUTHORIZATION_REVERSAL
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
                AUTHORIZATION_EXPIRY -> Known.AUTHORIZATION_EXPIRY
                AUTHORIZATION_REVERSAL -> Known.AUTHORIZATION_REVERSAL
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

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is TransactionSimulateVoidParams && body == other.body && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(body, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() =
        "TransactionSimulateVoidParams{body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
