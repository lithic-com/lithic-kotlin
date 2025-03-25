// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.core.JsonGenerator
import com.fasterxml.jackson.core.ObjectCodec
import com.fasterxml.jackson.databind.JsonNode
import com.fasterxml.jackson.databind.SerializerProvider
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.fasterxml.jackson.databind.annotation.JsonSerialize
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lithic.api.core.BaseDeserializer
import com.lithic.api.core.BaseSerializer
import com.lithic.api.core.Enum
import com.lithic.api.core.ExcludeMissing
import com.lithic.api.core.JsonField
import com.lithic.api.core.JsonMissing
import com.lithic.api.core.JsonValue
import com.lithic.api.core.getOrThrow
import com.lithic.api.errors.LithicInvalidDataException
import java.util.Collections
import java.util.Objects

class AuthRuleCondition
private constructor(
    private val attribute: JsonField<ConditionalAttribute>,
    private val operation: JsonField<Operation>,
    private val value: JsonField<Value>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("attribute")
        @ExcludeMissing
        attribute: JsonField<ConditionalAttribute> = JsonMissing.of(),
        @JsonProperty("operation")
        @ExcludeMissing
        operation: JsonField<Operation> = JsonMissing.of(),
        @JsonProperty("value") @ExcludeMissing value: JsonField<Value> = JsonMissing.of(),
    ) : this(attribute, operation, value, mutableMapOf())

    /**
     * The attribute to target.
     *
     * The following attributes may be targeted:
     * - `MCC`: A four-digit number listed in ISO 18245. An MCC is used to classify a business by
     *   the types of goods or services it provides.
     * - `COUNTRY`: Country of entity of card acceptor. Possible values are: (1) all ISO 3166-1
     *   alpha-3 country codes, (2) QZZ for Kosovo, and (3) ANT for Netherlands Antilles.
     * - `CURRENCY`: 3-character alphabetic ISO 4217 code for the merchant currency of the
     *   transaction.
     * - `MERCHANT_ID`: Unique alphanumeric identifier for the payment card acceptor (merchant).
     * - `DESCRIPTOR`: Short description of card acceptor.
     * - `LIABILITY_SHIFT`: Indicates whether chargeback liability shift to the issuer applies to
     *   the transaction. Valid values are `NONE`, `3DS_AUTHENTICATED`, or `TOKEN_AUTHENTICATED`.
     * - `PAN_ENTRY_MODE`: The method by which the cardholder's primary account number (PAN) was
     *   entered. Valid values are `AUTO_ENTRY`, `BAR_CODE`, `CONTACTLESS`, `ECOMMERCE`,
     *   `ERROR_KEYED`, `ERROR_MAGNETIC_STRIPE`, `ICC`, `KEY_ENTERED`, `MAGNETIC_STRIPE`, `MANUAL`,
     *   `OCR`, `SECURE_CARDLESS`, `UNSPECIFIED`, `UNKNOWN`, `CREDENTIAL_ON_FILE`, or `ECOMMERCE`.
     * - `TRANSACTION_AMOUNT`: The base transaction amount (in cents) plus the acquirer fee field in
     *   the settlement/cardholder billing currency. This is the amount the issuer should authorize
     *   against unless the issuer is paying the acquirer fee on behalf of the cardholder.
     * - `RISK_SCORE`: Network-provided score assessing risk level associated with a given
     *   authorization. Scores are on a range of 0-999, with 0 representing the lowest risk and 999
     *   representing the highest risk. For Visa transactions, where the raw score has a range of
     *   0-99, Lithic will normalize the score by multiplying the raw score by 10x.
     * - `CARD_TRANSACTION_COUNT_1H`: The number of transactions on the card in the trailing hour up
     *   and until the authorization.
     * - `CARD_TRANSACTION_COUNT_24H`: The number of transactions on the card in the trailing 24
     *   hours up and until the authorization.
     * - `CARD_STATE`: The current state of the card associated with the transaction. Valid values
     *   are `CLOSED`, `OPEN`, `PAUSED`, `PENDING_ACTIVATION`, `PENDING_FULFILLMENT`.
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun attribute(): ConditionalAttribute? = attribute.getNullable("attribute")

    /**
     * The operation to apply to the attribute
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun operation(): Operation? = operation.getNullable("operation")

    /**
     * A regex string, to be used with `MATCHES` or `DOES_NOT_MATCH`
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun value(): Value? = value.getNullable("value")

    /**
     * Returns the raw JSON value of [attribute].
     *
     * Unlike [attribute], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("attribute")
    @ExcludeMissing
    fun _attribute(): JsonField<ConditionalAttribute> = attribute

    /**
     * Returns the raw JSON value of [operation].
     *
     * Unlike [operation], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("operation") @ExcludeMissing fun _operation(): JsonField<Operation> = operation

    /**
     * Returns the raw JSON value of [value].
     *
     * Unlike [value], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("value") @ExcludeMissing fun _value(): JsonField<Value> = value

    @JsonAnySetter
    private fun putAdditionalProperty(key: String, value: JsonValue) {
        additionalProperties.put(key, value)
    }

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> =
        Collections.unmodifiableMap(additionalProperties)

    fun toBuilder() = Builder().from(this)

    companion object {

        /** Returns a mutable builder for constructing an instance of [AuthRuleCondition]. */
        fun builder() = Builder()
    }

    /** A builder for [AuthRuleCondition]. */
    class Builder internal constructor() {

        private var attribute: JsonField<ConditionalAttribute> = JsonMissing.of()
        private var operation: JsonField<Operation> = JsonMissing.of()
        private var value: JsonField<Value> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(authRuleCondition: AuthRuleCondition) = apply {
            attribute = authRuleCondition.attribute
            operation = authRuleCondition.operation
            value = authRuleCondition.value
            additionalProperties = authRuleCondition.additionalProperties.toMutableMap()
        }

        /**
         * The attribute to target.
         *
         * The following attributes may be targeted:
         * - `MCC`: A four-digit number listed in ISO 18245. An MCC is used to classify a business
         *   by the types of goods or services it provides.
         * - `COUNTRY`: Country of entity of card acceptor. Possible values are: (1) all ISO 3166-1
         *   alpha-3 country codes, (2) QZZ for Kosovo, and (3) ANT for Netherlands Antilles.
         * - `CURRENCY`: 3-character alphabetic ISO 4217 code for the merchant currency of the
         *   transaction.
         * - `MERCHANT_ID`: Unique alphanumeric identifier for the payment card acceptor (merchant).
         * - `DESCRIPTOR`: Short description of card acceptor.
         * - `LIABILITY_SHIFT`: Indicates whether chargeback liability shift to the issuer applies
         *   to the transaction. Valid values are `NONE`, `3DS_AUTHENTICATED`, or
         *   `TOKEN_AUTHENTICATED`.
         * - `PAN_ENTRY_MODE`: The method by which the cardholder's primary account number (PAN) was
         *   entered. Valid values are `AUTO_ENTRY`, `BAR_CODE`, `CONTACTLESS`, `ECOMMERCE`,
         *   `ERROR_KEYED`, `ERROR_MAGNETIC_STRIPE`, `ICC`, `KEY_ENTERED`, `MAGNETIC_STRIPE`,
         *   `MANUAL`, `OCR`, `SECURE_CARDLESS`, `UNSPECIFIED`, `UNKNOWN`, `CREDENTIAL_ON_FILE`, or
         *   `ECOMMERCE`.
         * - `TRANSACTION_AMOUNT`: The base transaction amount (in cents) plus the acquirer fee
         *   field in the settlement/cardholder billing currency. This is the amount the issuer
         *   should authorize against unless the issuer is paying the acquirer fee on behalf of the
         *   cardholder.
         * - `RISK_SCORE`: Network-provided score assessing risk level associated with a given
         *   authorization. Scores are on a range of 0-999, with 0 representing the lowest risk and
         *   999 representing the highest risk. For Visa transactions, where the raw score has a
         *   range of 0-99, Lithic will normalize the score by multiplying the raw score by 10x.
         * - `CARD_TRANSACTION_COUNT_1H`: The number of transactions on the card in the trailing
         *   hour up and until the authorization.
         * - `CARD_TRANSACTION_COUNT_24H`: The number of transactions on the card in the trailing 24
         *   hours up and until the authorization.
         * - `CARD_STATE`: The current state of the card associated with the transaction. Valid
         *   values are `CLOSED`, `OPEN`, `PAUSED`, `PENDING_ACTIVATION`, `PENDING_FULFILLMENT`.
         */
        fun attribute(attribute: ConditionalAttribute) = attribute(JsonField.of(attribute))

        /**
         * Sets [Builder.attribute] to an arbitrary JSON value.
         *
         * You should usually call [Builder.attribute] with a well-typed [ConditionalAttribute]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun attribute(attribute: JsonField<ConditionalAttribute>) = apply {
            this.attribute = attribute
        }

        /** The operation to apply to the attribute */
        fun operation(operation: Operation) = operation(JsonField.of(operation))

        /**
         * Sets [Builder.operation] to an arbitrary JSON value.
         *
         * You should usually call [Builder.operation] with a well-typed [Operation] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun operation(operation: JsonField<Operation>) = apply { this.operation = operation }

        /** A regex string, to be used with `MATCHES` or `DOES_NOT_MATCH` */
        fun value(value: Value) = value(JsonField.of(value))

        /**
         * Sets [Builder.value] to an arbitrary JSON value.
         *
         * You should usually call [Builder.value] with a well-typed [Value] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun value(value: JsonField<Value>) = apply { this.value = value }

        /** Alias for calling [value] with `Value.ofRegex(regex)`. */
        fun value(regex: String) = value(Value.ofRegex(regex))

        /** Alias for calling [value] with `Value.ofNumber(number)`. */
        fun value(number: Long) = value(Value.ofNumber(number))

        /** Alias for calling [value] with `Value.ofListOfStrings(listOfStrings)`. */
        fun valueOfListOfStrings(listOfStrings: List<String>) =
            value(Value.ofListOfStrings(listOfStrings))

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

        /**
         * Returns an immutable instance of [AuthRuleCondition].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): AuthRuleCondition =
            AuthRuleCondition(attribute, operation, value, additionalProperties.toMutableMap())
    }

    private var validated: Boolean = false

    fun validate(): AuthRuleCondition = apply {
        if (validated) {
            return@apply
        }

        attribute()
        operation()
        value()?.validate()
        validated = true
    }

    /** The operation to apply to the attribute */
    class Operation @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            val IS_ONE_OF = of("IS_ONE_OF")

            val IS_NOT_ONE_OF = of("IS_NOT_ONE_OF")

            val MATCHES = of("MATCHES")

            val DOES_NOT_MATCH = of("DOES_NOT_MATCH")

            val IS_GREATER_THAN = of("IS_GREATER_THAN")

            val IS_LESS_THAN = of("IS_LESS_THAN")

            fun of(value: String) = Operation(JsonField.of(value))
        }

        /** An enum containing [Operation]'s known values. */
        enum class Known {
            IS_ONE_OF,
            IS_NOT_ONE_OF,
            MATCHES,
            DOES_NOT_MATCH,
            IS_GREATER_THAN,
            IS_LESS_THAN,
        }

        /**
         * An enum containing [Operation]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Operation] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            IS_ONE_OF,
            IS_NOT_ONE_OF,
            MATCHES,
            DOES_NOT_MATCH,
            IS_GREATER_THAN,
            IS_LESS_THAN,
            /**
             * An enum member indicating that [Operation] was instantiated with an unknown value.
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
                IS_ONE_OF -> Value.IS_ONE_OF
                IS_NOT_ONE_OF -> Value.IS_NOT_ONE_OF
                MATCHES -> Value.MATCHES
                DOES_NOT_MATCH -> Value.DOES_NOT_MATCH
                IS_GREATER_THAN -> Value.IS_GREATER_THAN
                IS_LESS_THAN -> Value.IS_LESS_THAN
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
                IS_ONE_OF -> Known.IS_ONE_OF
                IS_NOT_ONE_OF -> Known.IS_NOT_ONE_OF
                MATCHES -> Known.MATCHES
                DOES_NOT_MATCH -> Known.DOES_NOT_MATCH
                IS_GREATER_THAN -> Known.IS_GREATER_THAN
                IS_LESS_THAN -> Known.IS_LESS_THAN
                else -> throw LithicInvalidDataException("Unknown Operation: $value")
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

            return /* spotless:off */ other is Operation && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /** A regex string, to be used with `MATCHES` or `DOES_NOT_MATCH` */
    @JsonDeserialize(using = Value.Deserializer::class)
    @JsonSerialize(using = Value.Serializer::class)
    class Value
    private constructor(
        private val regex: String? = null,
        private val number: Long? = null,
        private val listOfStrings: List<String>? = null,
        private val _json: JsonValue? = null,
    ) {

        /** A regex string, to be used with `MATCHES` or `DOES_NOT_MATCH` */
        fun regex(): String? = regex

        /** A number, to be used with `IS_GREATER_THAN` or `IS_LESS_THAN` */
        fun number(): Long? = number

        /** An array of strings, to be used with `IS_ONE_OF` or `IS_NOT_ONE_OF` */
        fun listOfStrings(): List<String>? = listOfStrings

        fun isRegex(): Boolean = regex != null

        fun isNumber(): Boolean = number != null

        fun isListOfStrings(): Boolean = listOfStrings != null

        /** A regex string, to be used with `MATCHES` or `DOES_NOT_MATCH` */
        fun asRegex(): String = regex.getOrThrow("regex")

        /** A number, to be used with `IS_GREATER_THAN` or `IS_LESS_THAN` */
        fun asNumber(): Long = number.getOrThrow("number")

        /** An array of strings, to be used with `IS_ONE_OF` or `IS_NOT_ONE_OF` */
        fun asListOfStrings(): List<String> = listOfStrings.getOrThrow("listOfStrings")

        fun _json(): JsonValue? = _json

        fun <T> accept(visitor: Visitor<T>): T {
            return when {
                regex != null -> visitor.visitRegex(regex)
                number != null -> visitor.visitNumber(number)
                listOfStrings != null -> visitor.visitListOfStrings(listOfStrings)
                else -> visitor.unknown(_json)
            }
        }

        private var validated: Boolean = false

        fun validate(): Value = apply {
            if (validated) {
                return@apply
            }

            accept(
                object : Visitor<Unit> {
                    override fun visitRegex(regex: String) {}

                    override fun visitNumber(number: Long) {}

                    override fun visitListOfStrings(listOfStrings: List<String>) {}
                }
            )
            validated = true
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Value && regex == other.regex && number == other.number && listOfStrings == other.listOfStrings /* spotless:on */
        }

        override fun hashCode(): Int = /* spotless:off */ Objects.hash(regex, number, listOfStrings) /* spotless:on */

        override fun toString(): String =
            when {
                regex != null -> "Value{regex=$regex}"
                number != null -> "Value{number=$number}"
                listOfStrings != null -> "Value{listOfStrings=$listOfStrings}"
                _json != null -> "Value{_unknown=$_json}"
                else -> throw IllegalStateException("Invalid Value")
            }

        companion object {

            /** A regex string, to be used with `MATCHES` or `DOES_NOT_MATCH` */
            fun ofRegex(regex: String) = Value(regex = regex)

            /** A number, to be used with `IS_GREATER_THAN` or `IS_LESS_THAN` */
            fun ofNumber(number: Long) = Value(number = number)

            /** An array of strings, to be used with `IS_ONE_OF` or `IS_NOT_ONE_OF` */
            fun ofListOfStrings(listOfStrings: List<String>) = Value(listOfStrings = listOfStrings)
        }

        /** An interface that defines how to map each variant of [Value] to a value of type [T]. */
        interface Visitor<out T> {

            /** A regex string, to be used with `MATCHES` or `DOES_NOT_MATCH` */
            fun visitRegex(regex: String): T

            /** A number, to be used with `IS_GREATER_THAN` or `IS_LESS_THAN` */
            fun visitNumber(number: Long): T

            /** An array of strings, to be used with `IS_ONE_OF` or `IS_NOT_ONE_OF` */
            fun visitListOfStrings(listOfStrings: List<String>): T

            /**
             * Maps an unknown variant of [Value] to a value of type [T].
             *
             * An instance of [Value] can contain an unknown variant if it was deserialized from
             * data that doesn't match any known variant. For example, if the SDK is on an older
             * version than the API, then the API may respond with new variants that the SDK is
             * unaware of.
             *
             * @throws LithicInvalidDataException in the default implementation.
             */
            fun unknown(json: JsonValue?): T {
                throw LithicInvalidDataException("Unknown Value: $json")
            }
        }

        internal class Deserializer : BaseDeserializer<Value>(Value::class) {

            override fun ObjectCodec.deserialize(node: JsonNode): Value {
                val json = JsonValue.fromJsonNode(node)

                tryDeserialize(node, jacksonTypeRef<String>())?.let {
                    return Value(regex = it, _json = json)
                }
                tryDeserialize(node, jacksonTypeRef<Long>())?.let {
                    return Value(number = it, _json = json)
                }
                tryDeserialize(node, jacksonTypeRef<List<String>>())?.let {
                    return Value(listOfStrings = it, _json = json)
                }

                return Value(_json = json)
            }
        }

        internal class Serializer : BaseSerializer<Value>(Value::class) {

            override fun serialize(
                value: Value,
                generator: JsonGenerator,
                provider: SerializerProvider,
            ) {
                when {
                    value.regex != null -> generator.writeObject(value.regex)
                    value.number != null -> generator.writeObject(value.number)
                    value.listOfStrings != null -> generator.writeObject(value.listOfStrings)
                    value._json != null -> generator.writeObject(value._json)
                    else -> throw IllegalStateException("Invalid Value")
                }
            }
        }
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is AuthRuleCondition && attribute == other.attribute && operation == other.operation && value == other.value && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(attribute, operation, value, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "AuthRuleCondition{attribute=$attribute, operation=$operation, value=$value, additionalProperties=$additionalProperties}"
}
