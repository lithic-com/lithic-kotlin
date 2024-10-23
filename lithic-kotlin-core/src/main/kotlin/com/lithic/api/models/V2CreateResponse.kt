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
import com.lithic.api.core.NoAutoDetect
import com.lithic.api.core.getOrThrow
import com.lithic.api.core.toUnmodifiable
import com.lithic.api.errors.LithicInvalidDataException
import java.util.Objects

@JsonDeserialize(builder = V2CreateResponse.Builder::class)
@NoAutoDetect
class V2CreateResponse
private constructor(
    private val token: JsonField<String>,
    private val state: JsonField<AuthRuleState>,
    private val programLevel: JsonField<Boolean>,
    private val cardTokens: JsonField<List<String>>,
    private val accountTokens: JsonField<List<String>>,
    private val type: JsonField<AuthRuleType>,
    private val currentVersion: JsonField<CurrentVersion>,
    private val draftVersion: JsonField<DraftVersion>,
    private val additionalProperties: Map<String, JsonValue>,
) {

    private var validated: Boolean = false

    fun token(): String = token.getRequired("token")

    /** The state of the Auth Rule */
    fun state(): AuthRuleState = state.getRequired("state")

    /** Whether the Auth Rule applies to all authorizations on the card program. */
    fun programLevel(): Boolean = programLevel.getRequired("program_level")

    /** Card tokens to which the Auth Rule applies. */
    fun cardTokens(): List<String> = cardTokens.getRequired("card_tokens")

    /** Account tokens to which the Auth Rule applies. */
    fun accountTokens(): List<String> = accountTokens.getRequired("account_tokens")

    /** The type of Auth Rule */
    fun type(): AuthRuleType = type.getRequired("type")

    fun currentVersion(): CurrentVersion? = currentVersion.getNullable("current_version")

    fun draftVersion(): DraftVersion? = draftVersion.getNullable("draft_version")

    @JsonProperty("token") @ExcludeMissing fun _token() = token

    /** The state of the Auth Rule */
    @JsonProperty("state") @ExcludeMissing fun _state() = state

    /** Whether the Auth Rule applies to all authorizations on the card program. */
    @JsonProperty("program_level") @ExcludeMissing fun _programLevel() = programLevel

    /** Card tokens to which the Auth Rule applies. */
    @JsonProperty("card_tokens") @ExcludeMissing fun _cardTokens() = cardTokens

    /** Account tokens to which the Auth Rule applies. */
    @JsonProperty("account_tokens") @ExcludeMissing fun _accountTokens() = accountTokens

    /** The type of Auth Rule */
    @JsonProperty("type") @ExcludeMissing fun _type() = type

    @JsonProperty("current_version") @ExcludeMissing fun _currentVersion() = currentVersion

    @JsonProperty("draft_version") @ExcludeMissing fun _draftVersion() = draftVersion

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    fun validate(): V2CreateResponse = apply {
        if (!validated) {
            token()
            state()
            programLevel()
            cardTokens()
            accountTokens()
            type()
            currentVersion()?.validate()
            draftVersion()?.validate()
            validated = true
        }
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        fun builder() = Builder()
    }

    class Builder {

        private var token: JsonField<String> = JsonMissing.of()
        private var state: JsonField<AuthRuleState> = JsonMissing.of()
        private var programLevel: JsonField<Boolean> = JsonMissing.of()
        private var cardTokens: JsonField<List<String>> = JsonMissing.of()
        private var accountTokens: JsonField<List<String>> = JsonMissing.of()
        private var type: JsonField<AuthRuleType> = JsonMissing.of()
        private var currentVersion: JsonField<CurrentVersion> = JsonMissing.of()
        private var draftVersion: JsonField<DraftVersion> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(v2CreateResponse: V2CreateResponse) = apply {
            this.token = v2CreateResponse.token
            this.state = v2CreateResponse.state
            this.programLevel = v2CreateResponse.programLevel
            this.cardTokens = v2CreateResponse.cardTokens
            this.accountTokens = v2CreateResponse.accountTokens
            this.type = v2CreateResponse.type
            this.currentVersion = v2CreateResponse.currentVersion
            this.draftVersion = v2CreateResponse.draftVersion
            additionalProperties(v2CreateResponse.additionalProperties)
        }

        fun token(token: String) = token(JsonField.of(token))

        @JsonProperty("token")
        @ExcludeMissing
        fun token(token: JsonField<String>) = apply { this.token = token }

        /** The state of the Auth Rule */
        fun state(state: AuthRuleState) = state(JsonField.of(state))

        /** The state of the Auth Rule */
        @JsonProperty("state")
        @ExcludeMissing
        fun state(state: JsonField<AuthRuleState>) = apply { this.state = state }

        /** Whether the Auth Rule applies to all authorizations on the card program. */
        fun programLevel(programLevel: Boolean) = programLevel(JsonField.of(programLevel))

        /** Whether the Auth Rule applies to all authorizations on the card program. */
        @JsonProperty("program_level")
        @ExcludeMissing
        fun programLevel(programLevel: JsonField<Boolean>) = apply {
            this.programLevel = programLevel
        }

        /** Card tokens to which the Auth Rule applies. */
        fun cardTokens(cardTokens: List<String>) = cardTokens(JsonField.of(cardTokens))

        /** Card tokens to which the Auth Rule applies. */
        @JsonProperty("card_tokens")
        @ExcludeMissing
        fun cardTokens(cardTokens: JsonField<List<String>>) = apply { this.cardTokens = cardTokens }

        /** Account tokens to which the Auth Rule applies. */
        fun accountTokens(accountTokens: List<String>) = accountTokens(JsonField.of(accountTokens))

        /** Account tokens to which the Auth Rule applies. */
        @JsonProperty("account_tokens")
        @ExcludeMissing
        fun accountTokens(accountTokens: JsonField<List<String>>) = apply {
            this.accountTokens = accountTokens
        }

        /** The type of Auth Rule */
        fun type(type: AuthRuleType) = type(JsonField.of(type))

        /** The type of Auth Rule */
        @JsonProperty("type")
        @ExcludeMissing
        fun type(type: JsonField<AuthRuleType>) = apply { this.type = type }

        fun currentVersion(currentVersion: CurrentVersion) =
            currentVersion(JsonField.of(currentVersion))

        @JsonProperty("current_version")
        @ExcludeMissing
        fun currentVersion(currentVersion: JsonField<CurrentVersion>) = apply {
            this.currentVersion = currentVersion
        }

        fun draftVersion(draftVersion: DraftVersion) = draftVersion(JsonField.of(draftVersion))

        @JsonProperty("draft_version")
        @ExcludeMissing
        fun draftVersion(draftVersion: JsonField<DraftVersion>) = apply {
            this.draftVersion = draftVersion
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

        fun build(): V2CreateResponse =
            V2CreateResponse(
                token,
                state,
                programLevel,
                cardTokens.map { it.toUnmodifiable() },
                accountTokens.map { it.toUnmodifiable() },
                type,
                currentVersion,
                draftVersion,
                additionalProperties.toUnmodifiable(),
            )
    }

    @JsonDeserialize(builder = CurrentVersion.Builder::class)
    @NoAutoDetect
    class CurrentVersion
    private constructor(
        private val parameters: JsonField<AuthRuleParameters>,
        private val version: JsonField<Long>,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var validated: Boolean = false

        /** Parameters for the current version of the Auth Rule */
        fun parameters(): AuthRuleParameters = parameters.getRequired("parameters")

        /** The version of the rule, this is incremented whenever the rule's parameters change. */
        fun version(): Long = version.getRequired("version")

        /** Parameters for the current version of the Auth Rule */
        @JsonProperty("parameters") @ExcludeMissing fun _parameters() = parameters

        /** The version of the rule, this is incremented whenever the rule's parameters change. */
        @JsonProperty("version") @ExcludeMissing fun _version() = version

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun validate(): CurrentVersion = apply {
            if (!validated) {
                parameters()
                version()
                validated = true
            }
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var parameters: JsonField<AuthRuleParameters> = JsonMissing.of()
            private var version: JsonField<Long> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(currentVersion: CurrentVersion) = apply {
                this.parameters = currentVersion.parameters
                this.version = currentVersion.version
                additionalProperties(currentVersion.additionalProperties)
            }

            /** Parameters for the current version of the Auth Rule */
            fun parameters(parameters: AuthRuleParameters) = parameters(JsonField.of(parameters))

            /** Parameters for the current version of the Auth Rule */
            @JsonProperty("parameters")
            @ExcludeMissing
            fun parameters(parameters: JsonField<AuthRuleParameters>) = apply {
                this.parameters = parameters
            }

            /**
             * The version of the rule, this is incremented whenever the rule's parameters change.
             */
            fun version(version: Long) = version(JsonField.of(version))

            /**
             * The version of the rule, this is incremented whenever the rule's parameters change.
             */
            @JsonProperty("version")
            @ExcludeMissing
            fun version(version: JsonField<Long>) = apply { this.version = version }

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

            fun build(): CurrentVersion =
                CurrentVersion(
                    parameters,
                    version,
                    additionalProperties.toUnmodifiable(),
                )
        }

        @JsonDeserialize(using = AuthRuleParameters.Deserializer::class)
        @JsonSerialize(using = AuthRuleParameters.Serializer::class)
        class AuthRuleParameters
        private constructor(
            private val conditionalBlockParameters: ConditionalBlockParameters? = null,
            private val velocityLimitParams: VelocityLimitParams? = null,
            private val _json: JsonValue? = null,
        ) {

            private var validated: Boolean = false

            fun conditionalBlockParameters(): ConditionalBlockParameters? =
                conditionalBlockParameters

            fun velocityLimitParams(): VelocityLimitParams? = velocityLimitParams

            fun isConditionalBlockParameters(): Boolean = conditionalBlockParameters != null

            fun isVelocityLimitParams(): Boolean = velocityLimitParams != null

            fun asConditionalBlockParameters(): ConditionalBlockParameters =
                conditionalBlockParameters.getOrThrow("conditionalBlockParameters")

            fun asVelocityLimitParams(): VelocityLimitParams =
                velocityLimitParams.getOrThrow("velocityLimitParams")

            fun _json(): JsonValue? = _json

            fun <T> accept(visitor: Visitor<T>): T {
                return when {
                    conditionalBlockParameters != null ->
                        visitor.visitConditionalBlockParameters(conditionalBlockParameters)
                    velocityLimitParams != null ->
                        visitor.visitVelocityLimitParams(velocityLimitParams)
                    else -> visitor.unknown(_json)
                }
            }

            fun validate(): AuthRuleParameters = apply {
                if (!validated) {
                    if (conditionalBlockParameters == null && velocityLimitParams == null) {
                        throw LithicInvalidDataException("Unknown AuthRuleParameters: $_json")
                    }
                    conditionalBlockParameters?.validate()
                    velocityLimitParams?.validate()
                    validated = true
                }
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is AuthRuleParameters && this.conditionalBlockParameters == other.conditionalBlockParameters && this.velocityLimitParams == other.velocityLimitParams /* spotless:on */
            }

            override fun hashCode(): Int {
                return /* spotless:off */ Objects.hash(conditionalBlockParameters, velocityLimitParams) /* spotless:on */
            }

            override fun toString(): String {
                return when {
                    conditionalBlockParameters != null ->
                        "AuthRuleParameters{conditionalBlockParameters=$conditionalBlockParameters}"
                    velocityLimitParams != null ->
                        "AuthRuleParameters{velocityLimitParams=$velocityLimitParams}"
                    _json != null -> "AuthRuleParameters{_unknown=$_json}"
                    else -> throw IllegalStateException("Invalid AuthRuleParameters")
                }
            }

            companion object {

                fun ofConditionalBlockParameters(
                    conditionalBlockParameters: ConditionalBlockParameters
                ) = AuthRuleParameters(conditionalBlockParameters = conditionalBlockParameters)

                fun ofVelocityLimitParams(velocityLimitParams: VelocityLimitParams) =
                    AuthRuleParameters(velocityLimitParams = velocityLimitParams)
            }

            interface Visitor<out T> {

                fun visitConditionalBlockParameters(
                    conditionalBlockParameters: ConditionalBlockParameters
                ): T

                fun visitVelocityLimitParams(velocityLimitParams: VelocityLimitParams): T

                fun unknown(json: JsonValue?): T {
                    throw LithicInvalidDataException("Unknown AuthRuleParameters: $json")
                }
            }

            class Deserializer : BaseDeserializer<AuthRuleParameters>(AuthRuleParameters::class) {

                override fun ObjectCodec.deserialize(node: JsonNode): AuthRuleParameters {
                    val json = JsonValue.fromJsonNode(node)

                    tryDeserialize(node, jacksonTypeRef<ConditionalBlockParameters>()) {
                            it.validate()
                        }
                        ?.let {
                            return AuthRuleParameters(conditionalBlockParameters = it, _json = json)
                        }
                    tryDeserialize(node, jacksonTypeRef<VelocityLimitParams>()) { it.validate() }
                        ?.let {
                            return AuthRuleParameters(velocityLimitParams = it, _json = json)
                        }

                    return AuthRuleParameters(_json = json)
                }
            }

            class Serializer : BaseSerializer<AuthRuleParameters>(AuthRuleParameters::class) {

                override fun serialize(
                    value: AuthRuleParameters,
                    generator: JsonGenerator,
                    provider: SerializerProvider
                ) {
                    when {
                        value.conditionalBlockParameters != null ->
                            generator.writeObject(value.conditionalBlockParameters)
                        value.velocityLimitParams != null ->
                            generator.writeObject(value.velocityLimitParams)
                        value._json != null -> generator.writeObject(value._json)
                        else -> throw IllegalStateException("Invalid AuthRuleParameters")
                    }
                }
            }

            @JsonDeserialize(builder = ConditionalBlockParameters.Builder::class)
            @NoAutoDetect
            class ConditionalBlockParameters
            private constructor(
                private val conditions: JsonField<List<Condition>>,
                private val additionalProperties: Map<String, JsonValue>,
            ) {

                private var validated: Boolean = false

                fun conditions(): List<Condition> = conditions.getRequired("conditions")

                @JsonProperty("conditions") @ExcludeMissing fun _conditions() = conditions

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                fun validate(): ConditionalBlockParameters = apply {
                    if (!validated) {
                        conditions().forEach { it.validate() }
                        validated = true
                    }
                }

                fun toBuilder() = Builder().from(this)

                companion object {

                    fun builder() = Builder()
                }

                class Builder {

                    private var conditions: JsonField<List<Condition>> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    internal fun from(conditionalBlockParameters: ConditionalBlockParameters) =
                        apply {
                            this.conditions = conditionalBlockParameters.conditions
                            additionalProperties(conditionalBlockParameters.additionalProperties)
                        }

                    fun conditions(conditions: List<Condition>) =
                        conditions(JsonField.of(conditions))

                    @JsonProperty("conditions")
                    @ExcludeMissing
                    fun conditions(conditions: JsonField<List<Condition>>) = apply {
                        this.conditions = conditions
                    }

                    fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                        this.additionalProperties.clear()
                        this.additionalProperties.putAll(additionalProperties)
                    }

                    @JsonAnySetter
                    fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                        this.additionalProperties.put(key, value)
                    }

                    fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                        apply {
                            this.additionalProperties.putAll(additionalProperties)
                        }

                    fun build(): ConditionalBlockParameters =
                        ConditionalBlockParameters(
                            conditions.map { it.toUnmodifiable() },
                            additionalProperties.toUnmodifiable()
                        )
                }

                @JsonDeserialize(builder = Condition.Builder::class)
                @NoAutoDetect
                class Condition
                private constructor(
                    private val attribute: JsonField<Attribute>,
                    private val operation: JsonField<Operation>,
                    private val value: JsonField<Value>,
                    private val additionalProperties: Map<String, JsonValue>,
                ) {

                    private var validated: Boolean = false

                    /** The attribute to target */
                    fun attribute(): Attribute? = attribute.getNullable("attribute")

                    /** The operation to apply to the attribute */
                    fun operation(): Operation? = operation.getNullable("operation")

                    fun value(): Value? = value.getNullable("value")

                    /** The attribute to target */
                    @JsonProperty("attribute") @ExcludeMissing fun _attribute() = attribute

                    /** The operation to apply to the attribute */
                    @JsonProperty("operation") @ExcludeMissing fun _operation() = operation

                    @JsonProperty("value") @ExcludeMissing fun _value() = value

                    @JsonAnyGetter
                    @ExcludeMissing
                    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                    fun validate(): Condition = apply {
                        if (!validated) {
                            attribute()
                            operation()
                            value()
                            validated = true
                        }
                    }

                    fun toBuilder() = Builder().from(this)

                    companion object {

                        fun builder() = Builder()
                    }

                    class Builder {

                        private var attribute: JsonField<Attribute> = JsonMissing.of()
                        private var operation: JsonField<Operation> = JsonMissing.of()
                        private var value: JsonField<Value> = JsonMissing.of()
                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        internal fun from(condition: Condition) = apply {
                            this.attribute = condition.attribute
                            this.operation = condition.operation
                            this.value = condition.value
                            additionalProperties(condition.additionalProperties)
                        }

                        /** The attribute to target */
                        fun attribute(attribute: Attribute) = attribute(JsonField.of(attribute))

                        /** The attribute to target */
                        @JsonProperty("attribute")
                        @ExcludeMissing
                        fun attribute(attribute: JsonField<Attribute>) = apply {
                            this.attribute = attribute
                        }

                        /** The operation to apply to the attribute */
                        fun operation(operation: Operation) = operation(JsonField.of(operation))

                        /** The operation to apply to the attribute */
                        @JsonProperty("operation")
                        @ExcludeMissing
                        fun operation(operation: JsonField<Operation>) = apply {
                            this.operation = operation
                        }

                        fun value(value: Value) = value(JsonField.of(value))

                        @JsonProperty("value")
                        @ExcludeMissing
                        fun value(value: JsonField<Value>) = apply { this.value = value }

                        fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                            apply {
                                this.additionalProperties.clear()
                                this.additionalProperties.putAll(additionalProperties)
                            }

                        @JsonAnySetter
                        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                            this.additionalProperties.put(key, value)
                        }

                        fun putAllAdditionalProperties(
                            additionalProperties: Map<String, JsonValue>
                        ) = apply { this.additionalProperties.putAll(additionalProperties) }

                        fun build(): Condition =
                            Condition(
                                attribute,
                                operation,
                                value,
                                additionalProperties.toUnmodifiable(),
                            )
                    }

                    class Attribute
                    @JsonCreator
                    private constructor(
                        private val value: JsonField<String>,
                    ) : Enum {

                        @com.fasterxml.jackson.annotation.JsonValue
                        fun _value(): JsonField<String> = value

                        override fun equals(other: Any?): Boolean {
                            if (this === other) {
                                return true
                            }

                            return /* spotless:off */ other is Attribute && this.value == other.value /* spotless:on */
                        }

                        override fun hashCode() = value.hashCode()

                        override fun toString() = value.toString()

                        companion object {

                            val MCC = Attribute(JsonField.of("MCC"))

                            val COUNTRY = Attribute(JsonField.of("COUNTRY"))

                            val CURRENCY = Attribute(JsonField.of("CURRENCY"))

                            val MERCHANT_ID = Attribute(JsonField.of("MERCHANT_ID"))

                            val DESCRIPTOR = Attribute(JsonField.of("DESCRIPTOR"))

                            val LIABILITY_SHIFT = Attribute(JsonField.of("LIABILITY_SHIFT"))

                            val PAN_ENTRY_MODE = Attribute(JsonField.of("PAN_ENTRY_MODE"))

                            val TRANSACTION_AMOUNT = Attribute(JsonField.of("TRANSACTION_AMOUNT"))

                            val RISK_SCORE = Attribute(JsonField.of("RISK_SCORE"))

                            fun of(value: String) = Attribute(JsonField.of(value))
                        }

                        enum class Known {
                            MCC,
                            COUNTRY,
                            CURRENCY,
                            MERCHANT_ID,
                            DESCRIPTOR,
                            LIABILITY_SHIFT,
                            PAN_ENTRY_MODE,
                            TRANSACTION_AMOUNT,
                            RISK_SCORE,
                        }

                        enum class Value {
                            MCC,
                            COUNTRY,
                            CURRENCY,
                            MERCHANT_ID,
                            DESCRIPTOR,
                            LIABILITY_SHIFT,
                            PAN_ENTRY_MODE,
                            TRANSACTION_AMOUNT,
                            RISK_SCORE,
                            _UNKNOWN,
                        }

                        fun value(): Value =
                            when (this) {
                                MCC -> Value.MCC
                                COUNTRY -> Value.COUNTRY
                                CURRENCY -> Value.CURRENCY
                                MERCHANT_ID -> Value.MERCHANT_ID
                                DESCRIPTOR -> Value.DESCRIPTOR
                                LIABILITY_SHIFT -> Value.LIABILITY_SHIFT
                                PAN_ENTRY_MODE -> Value.PAN_ENTRY_MODE
                                TRANSACTION_AMOUNT -> Value.TRANSACTION_AMOUNT
                                RISK_SCORE -> Value.RISK_SCORE
                                else -> Value._UNKNOWN
                            }

                        fun known(): Known =
                            when (this) {
                                MCC -> Known.MCC
                                COUNTRY -> Known.COUNTRY
                                CURRENCY -> Known.CURRENCY
                                MERCHANT_ID -> Known.MERCHANT_ID
                                DESCRIPTOR -> Known.DESCRIPTOR
                                LIABILITY_SHIFT -> Known.LIABILITY_SHIFT
                                PAN_ENTRY_MODE -> Known.PAN_ENTRY_MODE
                                TRANSACTION_AMOUNT -> Known.TRANSACTION_AMOUNT
                                RISK_SCORE -> Known.RISK_SCORE
                                else ->
                                    throw LithicInvalidDataException("Unknown Attribute: $value")
                            }

                        fun asString(): String = _value().asStringOrThrow()
                    }

                    class Operation
                    @JsonCreator
                    private constructor(
                        private val value: JsonField<String>,
                    ) : Enum {

                        @com.fasterxml.jackson.annotation.JsonValue
                        fun _value(): JsonField<String> = value

                        override fun equals(other: Any?): Boolean {
                            if (this === other) {
                                return true
                            }

                            return /* spotless:off */ other is Operation && this.value == other.value /* spotless:on */
                        }

                        override fun hashCode() = value.hashCode()

                        override fun toString() = value.toString()

                        companion object {

                            val IS_ONE_OF = Operation(JsonField.of("IS_ONE_OF"))

                            val IS_NOT_ONE_OF = Operation(JsonField.of("IS_NOT_ONE_OF"))

                            val MATCHES = Operation(JsonField.of("MATCHES"))

                            val DOES_NOT_MATCH = Operation(JsonField.of("DOES_NOT_MATCH"))

                            val IS_GREATER_THAN = Operation(JsonField.of("IS_GREATER_THAN"))

                            val IS_LESS_THAN = Operation(JsonField.of("IS_LESS_THAN"))

                            fun of(value: String) = Operation(JsonField.of(value))
                        }

                        enum class Known {
                            IS_ONE_OF,
                            IS_NOT_ONE_OF,
                            MATCHES,
                            DOES_NOT_MATCH,
                            IS_GREATER_THAN,
                            IS_LESS_THAN,
                        }

                        enum class Value {
                            IS_ONE_OF,
                            IS_NOT_ONE_OF,
                            MATCHES,
                            DOES_NOT_MATCH,
                            IS_GREATER_THAN,
                            IS_LESS_THAN,
                            _UNKNOWN,
                        }

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

                        fun known(): Known =
                            when (this) {
                                IS_ONE_OF -> Known.IS_ONE_OF
                                IS_NOT_ONE_OF -> Known.IS_NOT_ONE_OF
                                MATCHES -> Known.MATCHES
                                DOES_NOT_MATCH -> Known.DOES_NOT_MATCH
                                IS_GREATER_THAN -> Known.IS_GREATER_THAN
                                IS_LESS_THAN -> Known.IS_LESS_THAN
                                else ->
                                    throw LithicInvalidDataException("Unknown Operation: $value")
                            }

                        fun asString(): String = _value().asStringOrThrow()
                    }

                    @JsonDeserialize(using = Value.Deserializer::class)
                    @JsonSerialize(using = Value.Serializer::class)
                    class Value
                    private constructor(
                        private val string: String? = null,
                        private val double: Double? = null,
                        private val strings: List<String>? = null,
                        private val _json: JsonValue? = null,
                    ) {

                        private var validated: Boolean = false

                        /** A regex string, to be used with `MATCHES` or `DOES_NOT_MATCH` */
                        fun string(): String? = string
                        /** A number, to be used with `IS_GREATER_THAN` or `IS_LESS_THAN` */
                        fun double(): Double? = double
                        /** An array of strings, to be used with `IS_ONE_OF` or `IS_NOT_ONE_OF` */
                        fun strings(): List<String>? = strings

                        fun isString(): Boolean = string != null

                        fun isDouble(): Boolean = double != null

                        fun isStrings(): Boolean = strings != null

                        fun asString(): String = string.getOrThrow("string")

                        fun asDouble(): Double = double.getOrThrow("double")

                        fun asStrings(): List<String> = strings.getOrThrow("strings")

                        fun _json(): JsonValue? = _json

                        fun <T> accept(visitor: Visitor<T>): T {
                            return when {
                                string != null -> visitor.visitString(string)
                                double != null -> visitor.visitDouble(double)
                                strings != null -> visitor.visitStrings(strings)
                                else -> visitor.unknown(_json)
                            }
                        }

                        fun validate(): Value = apply {
                            if (!validated) {
                                if (string == null && double == null && strings == null) {
                                    throw LithicInvalidDataException("Unknown Value: $_json")
                                }
                                validated = true
                            }
                        }

                        override fun equals(other: Any?): Boolean {
                            if (this === other) {
                                return true
                            }

                            return /* spotless:off */ other is Value && this.string == other.string && this.double == other.double && this.strings == other.strings /* spotless:on */
                        }

                        override fun hashCode(): Int {
                            return /* spotless:off */ Objects.hash(string, double, strings) /* spotless:on */
                        }

                        override fun toString(): String {
                            return when {
                                string != null -> "Value{string=$string}"
                                double != null -> "Value{double=$double}"
                                strings != null -> "Value{strings=$strings}"
                                _json != null -> "Value{_unknown=$_json}"
                                else -> throw IllegalStateException("Invalid Value")
                            }
                        }

                        companion object {

                            fun ofString(string: String) = Value(string = string)

                            fun ofDouble(double: Double) = Value(double = double)

                            fun ofStrings(strings: List<String>) = Value(strings = strings)
                        }

                        interface Visitor<out T> {

                            fun visitString(string: String): T

                            fun visitDouble(double: Double): T

                            fun visitStrings(strings: List<String>): T

                            fun unknown(json: JsonValue?): T {
                                throw LithicInvalidDataException("Unknown Value: $json")
                            }
                        }

                        class Deserializer : BaseDeserializer<Value>(Value::class) {

                            override fun ObjectCodec.deserialize(node: JsonNode): Value {
                                val json = JsonValue.fromJsonNode(node)

                                tryDeserialize(node, jacksonTypeRef<String>())?.let {
                                    return Value(string = it, _json = json)
                                }
                                tryDeserialize(node, jacksonTypeRef<Double>())?.let {
                                    return Value(double = it, _json = json)
                                }
                                tryDeserialize(node, jacksonTypeRef<List<String>>())?.let {
                                    return Value(strings = it, _json = json)
                                }

                                return Value(_json = json)
                            }
                        }

                        class Serializer : BaseSerializer<Value>(Value::class) {

                            override fun serialize(
                                value: Value,
                                generator: JsonGenerator,
                                provider: SerializerProvider
                            ) {
                                when {
                                    value.string != null -> generator.writeObject(value.string)
                                    value.double != null -> generator.writeObject(value.double)
                                    value.strings != null -> generator.writeObject(value.strings)
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

                        return /* spotless:off */ other is Condition && this.attribute == other.attribute && this.operation == other.operation && this.value == other.value && this.additionalProperties == other.additionalProperties /* spotless:on */
                    }

                    private var hashCode: Int = 0

                    override fun hashCode(): Int {
                        if (hashCode == 0) {
                            hashCode = /* spotless:off */ Objects.hash(attribute, operation, value, additionalProperties) /* spotless:on */
                        }
                        return hashCode
                    }

                    override fun toString() =
                        "Condition{attribute=$attribute, operation=$operation, value=$value, additionalProperties=$additionalProperties}"
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is ConditionalBlockParameters && this.conditions == other.conditions && this.additionalProperties == other.additionalProperties /* spotless:on */
                }

                private var hashCode: Int = 0

                override fun hashCode(): Int {
                    if (hashCode == 0) {
                        hashCode = /* spotless:off */ Objects.hash(conditions, additionalProperties) /* spotless:on */
                    }
                    return hashCode
                }

                override fun toString() =
                    "ConditionalBlockParameters{conditions=$conditions, additionalProperties=$additionalProperties}"
            }
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is CurrentVersion && this.parameters == other.parameters && this.version == other.version && this.additionalProperties == other.additionalProperties /* spotless:on */
        }

        private var hashCode: Int = 0

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode = /* spotless:off */ Objects.hash(parameters, version, additionalProperties) /* spotless:on */
            }
            return hashCode
        }

        override fun toString() =
            "CurrentVersion{parameters=$parameters, version=$version, additionalProperties=$additionalProperties}"
    }

    @JsonDeserialize(builder = DraftVersion.Builder::class)
    @NoAutoDetect
    class DraftVersion
    private constructor(
        private val parameters: JsonField<AuthRuleParameters>,
        private val version: JsonField<Long>,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var validated: Boolean = false

        /** Parameters for the current version of the Auth Rule */
        fun parameters(): AuthRuleParameters = parameters.getRequired("parameters")

        /** The version of the rule, this is incremented whenever the rule's parameters change. */
        fun version(): Long = version.getRequired("version")

        /** Parameters for the current version of the Auth Rule */
        @JsonProperty("parameters") @ExcludeMissing fun _parameters() = parameters

        /** The version of the rule, this is incremented whenever the rule's parameters change. */
        @JsonProperty("version") @ExcludeMissing fun _version() = version

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun validate(): DraftVersion = apply {
            if (!validated) {
                parameters()
                version()
                validated = true
            }
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var parameters: JsonField<AuthRuleParameters> = JsonMissing.of()
            private var version: JsonField<Long> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(draftVersion: DraftVersion) = apply {
                this.parameters = draftVersion.parameters
                this.version = draftVersion.version
                additionalProperties(draftVersion.additionalProperties)
            }

            /** Parameters for the current version of the Auth Rule */
            fun parameters(parameters: AuthRuleParameters) = parameters(JsonField.of(parameters))

            /** Parameters for the current version of the Auth Rule */
            @JsonProperty("parameters")
            @ExcludeMissing
            fun parameters(parameters: JsonField<AuthRuleParameters>) = apply {
                this.parameters = parameters
            }

            /**
             * The version of the rule, this is incremented whenever the rule's parameters change.
             */
            fun version(version: Long) = version(JsonField.of(version))

            /**
             * The version of the rule, this is incremented whenever the rule's parameters change.
             */
            @JsonProperty("version")
            @ExcludeMissing
            fun version(version: JsonField<Long>) = apply { this.version = version }

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

            fun build(): DraftVersion =
                DraftVersion(
                    parameters,
                    version,
                    additionalProperties.toUnmodifiable(),
                )
        }

        @JsonDeserialize(using = AuthRuleParameters.Deserializer::class)
        @JsonSerialize(using = AuthRuleParameters.Serializer::class)
        class AuthRuleParameters
        private constructor(
            private val conditionalBlockParameters: ConditionalBlockParameters? = null,
            private val velocityLimitParams: VelocityLimitParams? = null,
            private val _json: JsonValue? = null,
        ) {

            private var validated: Boolean = false

            fun conditionalBlockParameters(): ConditionalBlockParameters? =
                conditionalBlockParameters

            fun velocityLimitParams(): VelocityLimitParams? = velocityLimitParams

            fun isConditionalBlockParameters(): Boolean = conditionalBlockParameters != null

            fun isVelocityLimitParams(): Boolean = velocityLimitParams != null

            fun asConditionalBlockParameters(): ConditionalBlockParameters =
                conditionalBlockParameters.getOrThrow("conditionalBlockParameters")

            fun asVelocityLimitParams(): VelocityLimitParams =
                velocityLimitParams.getOrThrow("velocityLimitParams")

            fun _json(): JsonValue? = _json

            fun <T> accept(visitor: Visitor<T>): T {
                return when {
                    conditionalBlockParameters != null ->
                        visitor.visitConditionalBlockParameters(conditionalBlockParameters)
                    velocityLimitParams != null ->
                        visitor.visitVelocityLimitParams(velocityLimitParams)
                    else -> visitor.unknown(_json)
                }
            }

            fun validate(): AuthRuleParameters = apply {
                if (!validated) {
                    if (conditionalBlockParameters == null && velocityLimitParams == null) {
                        throw LithicInvalidDataException("Unknown AuthRuleParameters: $_json")
                    }
                    conditionalBlockParameters?.validate()
                    velocityLimitParams?.validate()
                    validated = true
                }
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is AuthRuleParameters && this.conditionalBlockParameters == other.conditionalBlockParameters && this.velocityLimitParams == other.velocityLimitParams /* spotless:on */
            }

            override fun hashCode(): Int {
                return /* spotless:off */ Objects.hash(conditionalBlockParameters, velocityLimitParams) /* spotless:on */
            }

            override fun toString(): String {
                return when {
                    conditionalBlockParameters != null ->
                        "AuthRuleParameters{conditionalBlockParameters=$conditionalBlockParameters}"
                    velocityLimitParams != null ->
                        "AuthRuleParameters{velocityLimitParams=$velocityLimitParams}"
                    _json != null -> "AuthRuleParameters{_unknown=$_json}"
                    else -> throw IllegalStateException("Invalid AuthRuleParameters")
                }
            }

            companion object {

                fun ofConditionalBlockParameters(
                    conditionalBlockParameters: ConditionalBlockParameters
                ) = AuthRuleParameters(conditionalBlockParameters = conditionalBlockParameters)

                fun ofVelocityLimitParams(velocityLimitParams: VelocityLimitParams) =
                    AuthRuleParameters(velocityLimitParams = velocityLimitParams)
            }

            interface Visitor<out T> {

                fun visitConditionalBlockParameters(
                    conditionalBlockParameters: ConditionalBlockParameters
                ): T

                fun visitVelocityLimitParams(velocityLimitParams: VelocityLimitParams): T

                fun unknown(json: JsonValue?): T {
                    throw LithicInvalidDataException("Unknown AuthRuleParameters: $json")
                }
            }

            class Deserializer : BaseDeserializer<AuthRuleParameters>(AuthRuleParameters::class) {

                override fun ObjectCodec.deserialize(node: JsonNode): AuthRuleParameters {
                    val json = JsonValue.fromJsonNode(node)

                    tryDeserialize(node, jacksonTypeRef<ConditionalBlockParameters>()) {
                            it.validate()
                        }
                        ?.let {
                            return AuthRuleParameters(conditionalBlockParameters = it, _json = json)
                        }
                    tryDeserialize(node, jacksonTypeRef<VelocityLimitParams>()) { it.validate() }
                        ?.let {
                            return AuthRuleParameters(velocityLimitParams = it, _json = json)
                        }

                    return AuthRuleParameters(_json = json)
                }
            }

            class Serializer : BaseSerializer<AuthRuleParameters>(AuthRuleParameters::class) {

                override fun serialize(
                    value: AuthRuleParameters,
                    generator: JsonGenerator,
                    provider: SerializerProvider
                ) {
                    when {
                        value.conditionalBlockParameters != null ->
                            generator.writeObject(value.conditionalBlockParameters)
                        value.velocityLimitParams != null ->
                            generator.writeObject(value.velocityLimitParams)
                        value._json != null -> generator.writeObject(value._json)
                        else -> throw IllegalStateException("Invalid AuthRuleParameters")
                    }
                }
            }

            @JsonDeserialize(builder = ConditionalBlockParameters.Builder::class)
            @NoAutoDetect
            class ConditionalBlockParameters
            private constructor(
                private val conditions: JsonField<List<Condition>>,
                private val additionalProperties: Map<String, JsonValue>,
            ) {

                private var validated: Boolean = false

                fun conditions(): List<Condition> = conditions.getRequired("conditions")

                @JsonProperty("conditions") @ExcludeMissing fun _conditions() = conditions

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                fun validate(): ConditionalBlockParameters = apply {
                    if (!validated) {
                        conditions().forEach { it.validate() }
                        validated = true
                    }
                }

                fun toBuilder() = Builder().from(this)

                companion object {

                    fun builder() = Builder()
                }

                class Builder {

                    private var conditions: JsonField<List<Condition>> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    internal fun from(conditionalBlockParameters: ConditionalBlockParameters) =
                        apply {
                            this.conditions = conditionalBlockParameters.conditions
                            additionalProperties(conditionalBlockParameters.additionalProperties)
                        }

                    fun conditions(conditions: List<Condition>) =
                        conditions(JsonField.of(conditions))

                    @JsonProperty("conditions")
                    @ExcludeMissing
                    fun conditions(conditions: JsonField<List<Condition>>) = apply {
                        this.conditions = conditions
                    }

                    fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                        this.additionalProperties.clear()
                        this.additionalProperties.putAll(additionalProperties)
                    }

                    @JsonAnySetter
                    fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                        this.additionalProperties.put(key, value)
                    }

                    fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                        apply {
                            this.additionalProperties.putAll(additionalProperties)
                        }

                    fun build(): ConditionalBlockParameters =
                        ConditionalBlockParameters(
                            conditions.map { it.toUnmodifiable() },
                            additionalProperties.toUnmodifiable()
                        )
                }

                @JsonDeserialize(builder = Condition.Builder::class)
                @NoAutoDetect
                class Condition
                private constructor(
                    private val attribute: JsonField<Attribute>,
                    private val operation: JsonField<Operation>,
                    private val value: JsonField<Value>,
                    private val additionalProperties: Map<String, JsonValue>,
                ) {

                    private var validated: Boolean = false

                    /** The attribute to target */
                    fun attribute(): Attribute? = attribute.getNullable("attribute")

                    /** The operation to apply to the attribute */
                    fun operation(): Operation? = operation.getNullable("operation")

                    fun value(): Value? = value.getNullable("value")

                    /** The attribute to target */
                    @JsonProperty("attribute") @ExcludeMissing fun _attribute() = attribute

                    /** The operation to apply to the attribute */
                    @JsonProperty("operation") @ExcludeMissing fun _operation() = operation

                    @JsonProperty("value") @ExcludeMissing fun _value() = value

                    @JsonAnyGetter
                    @ExcludeMissing
                    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                    fun validate(): Condition = apply {
                        if (!validated) {
                            attribute()
                            operation()
                            value()
                            validated = true
                        }
                    }

                    fun toBuilder() = Builder().from(this)

                    companion object {

                        fun builder() = Builder()
                    }

                    class Builder {

                        private var attribute: JsonField<Attribute> = JsonMissing.of()
                        private var operation: JsonField<Operation> = JsonMissing.of()
                        private var value: JsonField<Value> = JsonMissing.of()
                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        internal fun from(condition: Condition) = apply {
                            this.attribute = condition.attribute
                            this.operation = condition.operation
                            this.value = condition.value
                            additionalProperties(condition.additionalProperties)
                        }

                        /** The attribute to target */
                        fun attribute(attribute: Attribute) = attribute(JsonField.of(attribute))

                        /** The attribute to target */
                        @JsonProperty("attribute")
                        @ExcludeMissing
                        fun attribute(attribute: JsonField<Attribute>) = apply {
                            this.attribute = attribute
                        }

                        /** The operation to apply to the attribute */
                        fun operation(operation: Operation) = operation(JsonField.of(operation))

                        /** The operation to apply to the attribute */
                        @JsonProperty("operation")
                        @ExcludeMissing
                        fun operation(operation: JsonField<Operation>) = apply {
                            this.operation = operation
                        }

                        fun value(value: Value) = value(JsonField.of(value))

                        @JsonProperty("value")
                        @ExcludeMissing
                        fun value(value: JsonField<Value>) = apply { this.value = value }

                        fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                            apply {
                                this.additionalProperties.clear()
                                this.additionalProperties.putAll(additionalProperties)
                            }

                        @JsonAnySetter
                        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                            this.additionalProperties.put(key, value)
                        }

                        fun putAllAdditionalProperties(
                            additionalProperties: Map<String, JsonValue>
                        ) = apply { this.additionalProperties.putAll(additionalProperties) }

                        fun build(): Condition =
                            Condition(
                                attribute,
                                operation,
                                value,
                                additionalProperties.toUnmodifiable(),
                            )
                    }

                    class Attribute
                    @JsonCreator
                    private constructor(
                        private val value: JsonField<String>,
                    ) : Enum {

                        @com.fasterxml.jackson.annotation.JsonValue
                        fun _value(): JsonField<String> = value

                        override fun equals(other: Any?): Boolean {
                            if (this === other) {
                                return true
                            }

                            return /* spotless:off */ other is Attribute && this.value == other.value /* spotless:on */
                        }

                        override fun hashCode() = value.hashCode()

                        override fun toString() = value.toString()

                        companion object {

                            val MCC = Attribute(JsonField.of("MCC"))

                            val COUNTRY = Attribute(JsonField.of("COUNTRY"))

                            val CURRENCY = Attribute(JsonField.of("CURRENCY"))

                            val MERCHANT_ID = Attribute(JsonField.of("MERCHANT_ID"))

                            val DESCRIPTOR = Attribute(JsonField.of("DESCRIPTOR"))

                            val LIABILITY_SHIFT = Attribute(JsonField.of("LIABILITY_SHIFT"))

                            val PAN_ENTRY_MODE = Attribute(JsonField.of("PAN_ENTRY_MODE"))

                            val TRANSACTION_AMOUNT = Attribute(JsonField.of("TRANSACTION_AMOUNT"))

                            val RISK_SCORE = Attribute(JsonField.of("RISK_SCORE"))

                            fun of(value: String) = Attribute(JsonField.of(value))
                        }

                        enum class Known {
                            MCC,
                            COUNTRY,
                            CURRENCY,
                            MERCHANT_ID,
                            DESCRIPTOR,
                            LIABILITY_SHIFT,
                            PAN_ENTRY_MODE,
                            TRANSACTION_AMOUNT,
                            RISK_SCORE,
                        }

                        enum class Value {
                            MCC,
                            COUNTRY,
                            CURRENCY,
                            MERCHANT_ID,
                            DESCRIPTOR,
                            LIABILITY_SHIFT,
                            PAN_ENTRY_MODE,
                            TRANSACTION_AMOUNT,
                            RISK_SCORE,
                            _UNKNOWN,
                        }

                        fun value(): Value =
                            when (this) {
                                MCC -> Value.MCC
                                COUNTRY -> Value.COUNTRY
                                CURRENCY -> Value.CURRENCY
                                MERCHANT_ID -> Value.MERCHANT_ID
                                DESCRIPTOR -> Value.DESCRIPTOR
                                LIABILITY_SHIFT -> Value.LIABILITY_SHIFT
                                PAN_ENTRY_MODE -> Value.PAN_ENTRY_MODE
                                TRANSACTION_AMOUNT -> Value.TRANSACTION_AMOUNT
                                RISK_SCORE -> Value.RISK_SCORE
                                else -> Value._UNKNOWN
                            }

                        fun known(): Known =
                            when (this) {
                                MCC -> Known.MCC
                                COUNTRY -> Known.COUNTRY
                                CURRENCY -> Known.CURRENCY
                                MERCHANT_ID -> Known.MERCHANT_ID
                                DESCRIPTOR -> Known.DESCRIPTOR
                                LIABILITY_SHIFT -> Known.LIABILITY_SHIFT
                                PAN_ENTRY_MODE -> Known.PAN_ENTRY_MODE
                                TRANSACTION_AMOUNT -> Known.TRANSACTION_AMOUNT
                                RISK_SCORE -> Known.RISK_SCORE
                                else ->
                                    throw LithicInvalidDataException("Unknown Attribute: $value")
                            }

                        fun asString(): String = _value().asStringOrThrow()
                    }

                    class Operation
                    @JsonCreator
                    private constructor(
                        private val value: JsonField<String>,
                    ) : Enum {

                        @com.fasterxml.jackson.annotation.JsonValue
                        fun _value(): JsonField<String> = value

                        override fun equals(other: Any?): Boolean {
                            if (this === other) {
                                return true
                            }

                            return /* spotless:off */ other is Operation && this.value == other.value /* spotless:on */
                        }

                        override fun hashCode() = value.hashCode()

                        override fun toString() = value.toString()

                        companion object {

                            val IS_ONE_OF = Operation(JsonField.of("IS_ONE_OF"))

                            val IS_NOT_ONE_OF = Operation(JsonField.of("IS_NOT_ONE_OF"))

                            val MATCHES = Operation(JsonField.of("MATCHES"))

                            val DOES_NOT_MATCH = Operation(JsonField.of("DOES_NOT_MATCH"))

                            val IS_GREATER_THAN = Operation(JsonField.of("IS_GREATER_THAN"))

                            val IS_LESS_THAN = Operation(JsonField.of("IS_LESS_THAN"))

                            fun of(value: String) = Operation(JsonField.of(value))
                        }

                        enum class Known {
                            IS_ONE_OF,
                            IS_NOT_ONE_OF,
                            MATCHES,
                            DOES_NOT_MATCH,
                            IS_GREATER_THAN,
                            IS_LESS_THAN,
                        }

                        enum class Value {
                            IS_ONE_OF,
                            IS_NOT_ONE_OF,
                            MATCHES,
                            DOES_NOT_MATCH,
                            IS_GREATER_THAN,
                            IS_LESS_THAN,
                            _UNKNOWN,
                        }

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

                        fun known(): Known =
                            when (this) {
                                IS_ONE_OF -> Known.IS_ONE_OF
                                IS_NOT_ONE_OF -> Known.IS_NOT_ONE_OF
                                MATCHES -> Known.MATCHES
                                DOES_NOT_MATCH -> Known.DOES_NOT_MATCH
                                IS_GREATER_THAN -> Known.IS_GREATER_THAN
                                IS_LESS_THAN -> Known.IS_LESS_THAN
                                else ->
                                    throw LithicInvalidDataException("Unknown Operation: $value")
                            }

                        fun asString(): String = _value().asStringOrThrow()
                    }

                    @JsonDeserialize(using = Value.Deserializer::class)
                    @JsonSerialize(using = Value.Serializer::class)
                    class Value
                    private constructor(
                        private val string: String? = null,
                        private val double: Double? = null,
                        private val strings: List<String>? = null,
                        private val _json: JsonValue? = null,
                    ) {

                        private var validated: Boolean = false

                        /** A regex string, to be used with `MATCHES` or `DOES_NOT_MATCH` */
                        fun string(): String? = string
                        /** A number, to be used with `IS_GREATER_THAN` or `IS_LESS_THAN` */
                        fun double(): Double? = double
                        /** An array of strings, to be used with `IS_ONE_OF` or `IS_NOT_ONE_OF` */
                        fun strings(): List<String>? = strings

                        fun isString(): Boolean = string != null

                        fun isDouble(): Boolean = double != null

                        fun isStrings(): Boolean = strings != null

                        fun asString(): String = string.getOrThrow("string")

                        fun asDouble(): Double = double.getOrThrow("double")

                        fun asStrings(): List<String> = strings.getOrThrow("strings")

                        fun _json(): JsonValue? = _json

                        fun <T> accept(visitor: Visitor<T>): T {
                            return when {
                                string != null -> visitor.visitString(string)
                                double != null -> visitor.visitDouble(double)
                                strings != null -> visitor.visitStrings(strings)
                                else -> visitor.unknown(_json)
                            }
                        }

                        fun validate(): Value = apply {
                            if (!validated) {
                                if (string == null && double == null && strings == null) {
                                    throw LithicInvalidDataException("Unknown Value: $_json")
                                }
                                validated = true
                            }
                        }

                        override fun equals(other: Any?): Boolean {
                            if (this === other) {
                                return true
                            }

                            return /* spotless:off */ other is Value && this.string == other.string && this.double == other.double && this.strings == other.strings /* spotless:on */
                        }

                        override fun hashCode(): Int {
                            return /* spotless:off */ Objects.hash(string, double, strings) /* spotless:on */
                        }

                        override fun toString(): String {
                            return when {
                                string != null -> "Value{string=$string}"
                                double != null -> "Value{double=$double}"
                                strings != null -> "Value{strings=$strings}"
                                _json != null -> "Value{_unknown=$_json}"
                                else -> throw IllegalStateException("Invalid Value")
                            }
                        }

                        companion object {

                            fun ofString(string: String) = Value(string = string)

                            fun ofDouble(double: Double) = Value(double = double)

                            fun ofStrings(strings: List<String>) = Value(strings = strings)
                        }

                        interface Visitor<out T> {

                            fun visitString(string: String): T

                            fun visitDouble(double: Double): T

                            fun visitStrings(strings: List<String>): T

                            fun unknown(json: JsonValue?): T {
                                throw LithicInvalidDataException("Unknown Value: $json")
                            }
                        }

                        class Deserializer : BaseDeserializer<Value>(Value::class) {

                            override fun ObjectCodec.deserialize(node: JsonNode): Value {
                                val json = JsonValue.fromJsonNode(node)

                                tryDeserialize(node, jacksonTypeRef<String>())?.let {
                                    return Value(string = it, _json = json)
                                }
                                tryDeserialize(node, jacksonTypeRef<Double>())?.let {
                                    return Value(double = it, _json = json)
                                }
                                tryDeserialize(node, jacksonTypeRef<List<String>>())?.let {
                                    return Value(strings = it, _json = json)
                                }

                                return Value(_json = json)
                            }
                        }

                        class Serializer : BaseSerializer<Value>(Value::class) {

                            override fun serialize(
                                value: Value,
                                generator: JsonGenerator,
                                provider: SerializerProvider
                            ) {
                                when {
                                    value.string != null -> generator.writeObject(value.string)
                                    value.double != null -> generator.writeObject(value.double)
                                    value.strings != null -> generator.writeObject(value.strings)
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

                        return /* spotless:off */ other is Condition && this.attribute == other.attribute && this.operation == other.operation && this.value == other.value && this.additionalProperties == other.additionalProperties /* spotless:on */
                    }

                    private var hashCode: Int = 0

                    override fun hashCode(): Int {
                        if (hashCode == 0) {
                            hashCode = /* spotless:off */ Objects.hash(attribute, operation, value, additionalProperties) /* spotless:on */
                        }
                        return hashCode
                    }

                    override fun toString() =
                        "Condition{attribute=$attribute, operation=$operation, value=$value, additionalProperties=$additionalProperties}"
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is ConditionalBlockParameters && this.conditions == other.conditions && this.additionalProperties == other.additionalProperties /* spotless:on */
                }

                private var hashCode: Int = 0

                override fun hashCode(): Int {
                    if (hashCode == 0) {
                        hashCode = /* spotless:off */ Objects.hash(conditions, additionalProperties) /* spotless:on */
                    }
                    return hashCode
                }

                override fun toString() =
                    "ConditionalBlockParameters{conditions=$conditions, additionalProperties=$additionalProperties}"
            }
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is DraftVersion && this.parameters == other.parameters && this.version == other.version && this.additionalProperties == other.additionalProperties /* spotless:on */
        }

        private var hashCode: Int = 0

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode = /* spotless:off */ Objects.hash(parameters, version, additionalProperties) /* spotless:on */
            }
            return hashCode
        }

        override fun toString() =
            "DraftVersion{parameters=$parameters, version=$version, additionalProperties=$additionalProperties}"
    }

    class AuthRuleState
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is AuthRuleState && this.value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()

        companion object {

            val ACTIVE = AuthRuleState(JsonField.of("ACTIVE"))

            val INACTIVE = AuthRuleState(JsonField.of("INACTIVE"))

            fun of(value: String) = AuthRuleState(JsonField.of(value))
        }

        enum class Known {
            ACTIVE,
            INACTIVE,
        }

        enum class Value {
            ACTIVE,
            INACTIVE,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                ACTIVE -> Value.ACTIVE
                INACTIVE -> Value.INACTIVE
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                ACTIVE -> Known.ACTIVE
                INACTIVE -> Known.INACTIVE
                else -> throw LithicInvalidDataException("Unknown AuthRuleState: $value")
            }

        fun asString(): String = _value().asStringOrThrow()
    }

    class AuthRuleType
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is AuthRuleType && this.value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()

        companion object {

            val CONDITIONAL_BLOCK = AuthRuleType(JsonField.of("CONDITIONAL_BLOCK"))

            val VELOCITY_LIMIT = AuthRuleType(JsonField.of("VELOCITY_LIMIT"))

            fun of(value: String) = AuthRuleType(JsonField.of(value))
        }

        enum class Known {
            CONDITIONAL_BLOCK,
            VELOCITY_LIMIT,
        }

        enum class Value {
            CONDITIONAL_BLOCK,
            VELOCITY_LIMIT,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                CONDITIONAL_BLOCK -> Value.CONDITIONAL_BLOCK
                VELOCITY_LIMIT -> Value.VELOCITY_LIMIT
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                CONDITIONAL_BLOCK -> Known.CONDITIONAL_BLOCK
                VELOCITY_LIMIT -> Known.VELOCITY_LIMIT
                else -> throw LithicInvalidDataException("Unknown AuthRuleType: $value")
            }

        fun asString(): String = _value().asStringOrThrow()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is V2CreateResponse && this.token == other.token && this.state == other.state && this.programLevel == other.programLevel && this.cardTokens == other.cardTokens && this.accountTokens == other.accountTokens && this.type == other.type && this.currentVersion == other.currentVersion && this.draftVersion == other.draftVersion && this.additionalProperties == other.additionalProperties /* spotless:on */
    }

    private var hashCode: Int = 0

    override fun hashCode(): Int {
        if (hashCode == 0) {
            hashCode = /* spotless:off */ Objects.hash(token, state, programLevel, cardTokens, accountTokens, type, currentVersion, draftVersion, additionalProperties) /* spotless:on */
        }
        return hashCode
    }

    override fun toString() =
        "V2CreateResponse{token=$token, state=$state, programLevel=$programLevel, cardTokens=$cardTokens, accountTokens=$accountTokens, type=$type, currentVersion=$currentVersion, draftVersion=$draftVersion, additionalProperties=$additionalProperties}"
}