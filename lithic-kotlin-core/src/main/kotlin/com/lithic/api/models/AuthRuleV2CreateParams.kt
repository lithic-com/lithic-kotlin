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
import com.lithic.api.core.Params
import com.lithic.api.core.checkKnown
import com.lithic.api.core.checkRequired
import com.lithic.api.core.getOrThrow
import com.lithic.api.core.http.Headers
import com.lithic.api.core.http.QueryParams
import com.lithic.api.core.immutableEmptyMap
import com.lithic.api.core.toImmutable
import com.lithic.api.errors.LithicInvalidDataException
import java.util.Objects

/** Creates a new V2 authorization rule in draft mode */
class AuthRuleV2CreateParams
private constructor(
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun body(): Body = body

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    internal fun _body(): Body = body

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    @JsonDeserialize(using = Body.Deserializer::class)
    @JsonSerialize(using = Body.Serializer::class)
    class Body
    private constructor(
        private val createAuthRuleRequestAccountTokens: CreateAuthRuleRequestAccountTokens? = null,
        private val createAuthRuleRequestCardTokens: CreateAuthRuleRequestCardTokens? = null,
        private val createAuthRuleRequestProgramLevel: CreateAuthRuleRequestProgramLevel? = null,
        private val _json: JsonValue? = null,
    ) {

        fun createAuthRuleRequestAccountTokens(): CreateAuthRuleRequestAccountTokens? =
            createAuthRuleRequestAccountTokens

        fun createAuthRuleRequestCardTokens(): CreateAuthRuleRequestCardTokens? =
            createAuthRuleRequestCardTokens

        fun createAuthRuleRequestProgramLevel(): CreateAuthRuleRequestProgramLevel? =
            createAuthRuleRequestProgramLevel

        fun isCreateAuthRuleRequestAccountTokens(): Boolean =
            createAuthRuleRequestAccountTokens != null

        fun isCreateAuthRuleRequestCardTokens(): Boolean = createAuthRuleRequestCardTokens != null

        fun isCreateAuthRuleRequestProgramLevel(): Boolean =
            createAuthRuleRequestProgramLevel != null

        fun asCreateAuthRuleRequestAccountTokens(): CreateAuthRuleRequestAccountTokens =
            createAuthRuleRequestAccountTokens.getOrThrow("createAuthRuleRequestAccountTokens")

        fun asCreateAuthRuleRequestCardTokens(): CreateAuthRuleRequestCardTokens =
            createAuthRuleRequestCardTokens.getOrThrow("createAuthRuleRequestCardTokens")

        fun asCreateAuthRuleRequestProgramLevel(): CreateAuthRuleRequestProgramLevel =
            createAuthRuleRequestProgramLevel.getOrThrow("createAuthRuleRequestProgramLevel")

        fun _json(): JsonValue? = _json

        fun <T> accept(visitor: Visitor<T>): T {
            return when {
                createAuthRuleRequestAccountTokens != null ->
                    visitor.visitCreateAuthRuleRequestAccountTokens(
                        createAuthRuleRequestAccountTokens
                    )
                createAuthRuleRequestCardTokens != null ->
                    visitor.visitCreateAuthRuleRequestCardTokens(createAuthRuleRequestCardTokens)
                createAuthRuleRequestProgramLevel != null ->
                    visitor.visitCreateAuthRuleRequestProgramLevel(
                        createAuthRuleRequestProgramLevel
                    )
                else -> visitor.unknown(_json)
            }
        }

        private var validated: Boolean = false

        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            accept(
                object : Visitor<Unit> {
                    override fun visitCreateAuthRuleRequestAccountTokens(
                        createAuthRuleRequestAccountTokens: CreateAuthRuleRequestAccountTokens
                    ) {
                        createAuthRuleRequestAccountTokens.validate()
                    }

                    override fun visitCreateAuthRuleRequestCardTokens(
                        createAuthRuleRequestCardTokens: CreateAuthRuleRequestCardTokens
                    ) {
                        createAuthRuleRequestCardTokens.validate()
                    }

                    override fun visitCreateAuthRuleRequestProgramLevel(
                        createAuthRuleRequestProgramLevel: CreateAuthRuleRequestProgramLevel
                    ) {
                        createAuthRuleRequestProgramLevel.validate()
                    }
                }
            )
            validated = true
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Body && createAuthRuleRequestAccountTokens == other.createAuthRuleRequestAccountTokens && createAuthRuleRequestCardTokens == other.createAuthRuleRequestCardTokens && createAuthRuleRequestProgramLevel == other.createAuthRuleRequestProgramLevel /* spotless:on */
        }

        override fun hashCode(): Int = /* spotless:off */ Objects.hash(createAuthRuleRequestAccountTokens, createAuthRuleRequestCardTokens, createAuthRuleRequestProgramLevel) /* spotless:on */

        override fun toString(): String =
            when {
                createAuthRuleRequestAccountTokens != null ->
                    "Body{createAuthRuleRequestAccountTokens=$createAuthRuleRequestAccountTokens}"
                createAuthRuleRequestCardTokens != null ->
                    "Body{createAuthRuleRequestCardTokens=$createAuthRuleRequestCardTokens}"
                createAuthRuleRequestProgramLevel != null ->
                    "Body{createAuthRuleRequestProgramLevel=$createAuthRuleRequestProgramLevel}"
                _json != null -> "Body{_unknown=$_json}"
                else -> throw IllegalStateException("Invalid Body")
            }

        companion object {

            fun ofCreateAuthRuleRequestAccountTokens(
                createAuthRuleRequestAccountTokens: CreateAuthRuleRequestAccountTokens
            ) = Body(createAuthRuleRequestAccountTokens = createAuthRuleRequestAccountTokens)

            fun ofCreateAuthRuleRequestCardTokens(
                createAuthRuleRequestCardTokens: CreateAuthRuleRequestCardTokens
            ) = Body(createAuthRuleRequestCardTokens = createAuthRuleRequestCardTokens)

            fun ofCreateAuthRuleRequestProgramLevel(
                createAuthRuleRequestProgramLevel: CreateAuthRuleRequestProgramLevel
            ) = Body(createAuthRuleRequestProgramLevel = createAuthRuleRequestProgramLevel)
        }

        /** An interface that defines how to map each variant of [Body] to a value of type [T]. */
        interface Visitor<out T> {

            fun visitCreateAuthRuleRequestAccountTokens(
                createAuthRuleRequestAccountTokens: CreateAuthRuleRequestAccountTokens
            ): T

            fun visitCreateAuthRuleRequestCardTokens(
                createAuthRuleRequestCardTokens: CreateAuthRuleRequestCardTokens
            ): T

            fun visitCreateAuthRuleRequestProgramLevel(
                createAuthRuleRequestProgramLevel: CreateAuthRuleRequestProgramLevel
            ): T

            /**
             * Maps an unknown variant of [Body] to a value of type [T].
             *
             * An instance of [Body] can contain an unknown variant if it was deserialized from data
             * that doesn't match any known variant. For example, if the SDK is on an older version
             * than the API, then the API may respond with new variants that the SDK is unaware of.
             *
             * @throws LithicInvalidDataException in the default implementation.
             */
            fun unknown(json: JsonValue?): T {
                throw LithicInvalidDataException("Unknown Body: $json")
            }
        }

        internal class Deserializer : BaseDeserializer<Body>(Body::class) {

            override fun ObjectCodec.deserialize(node: JsonNode): Body {
                val json = JsonValue.fromJsonNode(node)

                tryDeserialize(node, jacksonTypeRef<CreateAuthRuleRequestAccountTokens>()) {
                        it.validate()
                    }
                    ?.let {
                        return Body(createAuthRuleRequestAccountTokens = it, _json = json)
                    }
                tryDeserialize(node, jacksonTypeRef<CreateAuthRuleRequestCardTokens>()) {
                        it.validate()
                    }
                    ?.let {
                        return Body(createAuthRuleRequestCardTokens = it, _json = json)
                    }
                tryDeserialize(node, jacksonTypeRef<CreateAuthRuleRequestProgramLevel>()) {
                        it.validate()
                    }
                    ?.let {
                        return Body(createAuthRuleRequestProgramLevel = it, _json = json)
                    }

                return Body(_json = json)
            }
        }

        internal class Serializer : BaseSerializer<Body>(Body::class) {

            override fun serialize(
                value: Body,
                generator: JsonGenerator,
                provider: SerializerProvider,
            ) {
                when {
                    value.createAuthRuleRequestAccountTokens != null ->
                        generator.writeObject(value.createAuthRuleRequestAccountTokens)
                    value.createAuthRuleRequestCardTokens != null ->
                        generator.writeObject(value.createAuthRuleRequestCardTokens)
                    value.createAuthRuleRequestProgramLevel != null ->
                        generator.writeObject(value.createAuthRuleRequestProgramLevel)
                    value._json != null -> generator.writeObject(value._json)
                    else -> throw IllegalStateException("Invalid Body")
                }
            }
        }

        @NoAutoDetect
        class CreateAuthRuleRequestAccountTokens
        @JsonCreator
        private constructor(
            @JsonProperty("account_tokens")
            @ExcludeMissing
            private val accountTokens: JsonField<List<String>> = JsonMissing.of(),
            @JsonProperty("name")
            @ExcludeMissing
            private val name: JsonField<String> = JsonMissing.of(),
            @JsonProperty("parameters")
            @ExcludeMissing
            private val parameters: JsonField<Parameters> = JsonMissing.of(),
            @JsonProperty("type")
            @ExcludeMissing
            private val type: JsonField<AuthRuleType> = JsonMissing.of(),
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            /**
             * Account tokens to which the Auth Rule applies.
             *
             * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun accountTokens(): List<String> = accountTokens.getRequired("account_tokens")

            /**
             * Auth Rule Name
             *
             * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun name(): String? = name.getNullable("name")

            /**
             * Parameters for the Auth Rule
             *
             * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun parameters(): Parameters? = parameters.getNullable("parameters")

            /**
             * The type of Auth Rule
             *
             * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun type(): AuthRuleType? = type.getNullable("type")

            /**
             * Returns the raw JSON value of [accountTokens].
             *
             * Unlike [accountTokens], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("account_tokens")
            @ExcludeMissing
            fun _accountTokens(): JsonField<List<String>> = accountTokens

            /**
             * Returns the raw JSON value of [name].
             *
             * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

            /**
             * Returns the raw JSON value of [parameters].
             *
             * Unlike [parameters], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("parameters")
            @ExcludeMissing
            fun _parameters(): JsonField<Parameters> = parameters

            /**
             * Returns the raw JSON value of [type].
             *
             * Unlike [type], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<AuthRuleType> = type

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            private var validated: Boolean = false

            fun validate(): CreateAuthRuleRequestAccountTokens = apply {
                if (validated) {
                    return@apply
                }

                accountTokens()
                name()
                parameters()?.validate()
                type()
                validated = true
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                /**
                 * Returns a mutable builder for constructing an instance of
                 * [CreateAuthRuleRequestAccountTokens].
                 *
                 * The following fields are required:
                 * ```kotlin
                 * .accountTokens()
                 * ```
                 */
                fun builder() = Builder()
            }

            /** A builder for [CreateAuthRuleRequestAccountTokens]. */
            class Builder internal constructor() {

                private var accountTokens: JsonField<MutableList<String>>? = null
                private var name: JsonField<String> = JsonMissing.of()
                private var parameters: JsonField<Parameters> = JsonMissing.of()
                private var type: JsonField<AuthRuleType> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(
                    createAuthRuleRequestAccountTokens: CreateAuthRuleRequestAccountTokens
                ) = apply {
                    accountTokens =
                        createAuthRuleRequestAccountTokens.accountTokens.map { it.toMutableList() }
                    name = createAuthRuleRequestAccountTokens.name
                    parameters = createAuthRuleRequestAccountTokens.parameters
                    type = createAuthRuleRequestAccountTokens.type
                    additionalProperties =
                        createAuthRuleRequestAccountTokens.additionalProperties.toMutableMap()
                }

                /** Account tokens to which the Auth Rule applies. */
                fun accountTokens(accountTokens: List<String>) =
                    accountTokens(JsonField.of(accountTokens))

                /**
                 * Sets [Builder.accountTokens] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.accountTokens] with a well-typed `List<String>`
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun accountTokens(accountTokens: JsonField<List<String>>) = apply {
                    this.accountTokens = accountTokens.map { it.toMutableList() }
                }

                /**
                 * Adds a single [String] to [accountTokens].
                 *
                 * @throws IllegalStateException if the field was previously set to a non-list.
                 */
                fun addAccountToken(accountToken: String) = apply {
                    accountTokens =
                        (accountTokens ?: JsonField.of(mutableListOf())).also {
                            checkKnown("accountTokens", it).add(accountToken)
                        }
                }

                /** Auth Rule Name */
                fun name(name: String?) = name(JsonField.ofNullable(name))

                /**
                 * Sets [Builder.name] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.name] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun name(name: JsonField<String>) = apply { this.name = name }

                /** Parameters for the Auth Rule */
                fun parameters(parameters: Parameters) = parameters(JsonField.of(parameters))

                /**
                 * Sets [Builder.parameters] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.parameters] with a well-typed [Parameters] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun parameters(parameters: JsonField<Parameters>) = apply {
                    this.parameters = parameters
                }

                /**
                 * Alias for calling [parameters] with
                 * `Parameters.ofConditionalBlock(conditionalBlock)`.
                 */
                fun parameters(conditionalBlock: ConditionalBlockParameters) =
                    parameters(Parameters.ofConditionalBlock(conditionalBlock))

                /**
                 * Alias for calling [parameters] with
                 * `Parameters.ofVelocityLimitParams(velocityLimitParams)`.
                 */
                fun parameters(velocityLimitParams: VelocityLimitParams) =
                    parameters(Parameters.ofVelocityLimitParams(velocityLimitParams))

                /** The type of Auth Rule */
                fun type(type: AuthRuleType) = type(JsonField.of(type))

                /**
                 * Sets [Builder.type] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.type] with a well-typed [AuthRuleType] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun type(type: JsonField<AuthRuleType>) = apply { this.type = type }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                    keys.forEach(::removeAdditionalProperty)
                }

                fun build(): CreateAuthRuleRequestAccountTokens =
                    CreateAuthRuleRequestAccountTokens(
                        checkRequired("accountTokens", accountTokens).map { it.toImmutable() },
                        name,
                        parameters,
                        type,
                        additionalProperties.toImmutable(),
                    )
            }

            /** Parameters for the Auth Rule */
            @JsonDeserialize(using = Parameters.Deserializer::class)
            @JsonSerialize(using = Parameters.Serializer::class)
            class Parameters
            private constructor(
                private val conditionalBlock: ConditionalBlockParameters? = null,
                private val velocityLimitParams: VelocityLimitParams? = null,
                private val _json: JsonValue? = null,
            ) {

                fun conditionalBlock(): ConditionalBlockParameters? = conditionalBlock

                fun velocityLimitParams(): VelocityLimitParams? = velocityLimitParams

                fun isConditionalBlock(): Boolean = conditionalBlock != null

                fun isVelocityLimitParams(): Boolean = velocityLimitParams != null

                fun asConditionalBlock(): ConditionalBlockParameters =
                    conditionalBlock.getOrThrow("conditionalBlock")

                fun asVelocityLimitParams(): VelocityLimitParams =
                    velocityLimitParams.getOrThrow("velocityLimitParams")

                fun _json(): JsonValue? = _json

                fun <T> accept(visitor: Visitor<T>): T {
                    return when {
                        conditionalBlock != null -> visitor.visitConditionalBlock(conditionalBlock)
                        velocityLimitParams != null ->
                            visitor.visitVelocityLimitParams(velocityLimitParams)
                        else -> visitor.unknown(_json)
                    }
                }

                private var validated: Boolean = false

                fun validate(): Parameters = apply {
                    if (validated) {
                        return@apply
                    }

                    accept(
                        object : Visitor<Unit> {
                            override fun visitConditionalBlock(
                                conditionalBlock: ConditionalBlockParameters
                            ) {
                                conditionalBlock.validate()
                            }

                            override fun visitVelocityLimitParams(
                                velocityLimitParams: VelocityLimitParams
                            ) {
                                velocityLimitParams.validate()
                            }
                        }
                    )
                    validated = true
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is Parameters && conditionalBlock == other.conditionalBlock && velocityLimitParams == other.velocityLimitParams /* spotless:on */
                }

                override fun hashCode(): Int = /* spotless:off */ Objects.hash(conditionalBlock, velocityLimitParams) /* spotless:on */

                override fun toString(): String =
                    when {
                        conditionalBlock != null -> "Parameters{conditionalBlock=$conditionalBlock}"
                        velocityLimitParams != null ->
                            "Parameters{velocityLimitParams=$velocityLimitParams}"
                        _json != null -> "Parameters{_unknown=$_json}"
                        else -> throw IllegalStateException("Invalid Parameters")
                    }

                companion object {

                    fun ofConditionalBlock(conditionalBlock: ConditionalBlockParameters) =
                        Parameters(conditionalBlock = conditionalBlock)

                    fun ofVelocityLimitParams(velocityLimitParams: VelocityLimitParams) =
                        Parameters(velocityLimitParams = velocityLimitParams)
                }

                /**
                 * An interface that defines how to map each variant of [Parameters] to a value of
                 * type [T].
                 */
                interface Visitor<out T> {

                    fun visitConditionalBlock(conditionalBlock: ConditionalBlockParameters): T

                    fun visitVelocityLimitParams(velocityLimitParams: VelocityLimitParams): T

                    /**
                     * Maps an unknown variant of [Parameters] to a value of type [T].
                     *
                     * An instance of [Parameters] can contain an unknown variant if it was
                     * deserialized from data that doesn't match any known variant. For example, if
                     * the SDK is on an older version than the API, then the API may respond with
                     * new variants that the SDK is unaware of.
                     *
                     * @throws LithicInvalidDataException in the default implementation.
                     */
                    fun unknown(json: JsonValue?): T {
                        throw LithicInvalidDataException("Unknown Parameters: $json")
                    }
                }

                internal class Deserializer : BaseDeserializer<Parameters>(Parameters::class) {

                    override fun ObjectCodec.deserialize(node: JsonNode): Parameters {
                        val json = JsonValue.fromJsonNode(node)

                        tryDeserialize(node, jacksonTypeRef<ConditionalBlockParameters>()) {
                                it.validate()
                            }
                            ?.let {
                                return Parameters(conditionalBlock = it, _json = json)
                            }
                        tryDeserialize(node, jacksonTypeRef<VelocityLimitParams>()) {
                                it.validate()
                            }
                            ?.let {
                                return Parameters(velocityLimitParams = it, _json = json)
                            }

                        return Parameters(_json = json)
                    }
                }

                internal class Serializer : BaseSerializer<Parameters>(Parameters::class) {

                    override fun serialize(
                        value: Parameters,
                        generator: JsonGenerator,
                        provider: SerializerProvider,
                    ) {
                        when {
                            value.conditionalBlock != null ->
                                generator.writeObject(value.conditionalBlock)
                            value.velocityLimitParams != null ->
                                generator.writeObject(value.velocityLimitParams)
                            value._json != null -> generator.writeObject(value._json)
                            else -> throw IllegalStateException("Invalid Parameters")
                        }
                    }
                }
            }

            /** The type of Auth Rule */
            class AuthRuleType
            @JsonCreator
            private constructor(private val value: JsonField<String>) : Enum {

                /**
                 * Returns this class instance's raw value.
                 *
                 * This is usually only useful if this instance was deserialized from data that
                 * doesn't match any known member, and you want to know that value. For example, if
                 * the SDK is on an older version than the API, then the API may respond with new
                 * members that the SDK is unaware of.
                 */
                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                companion object {

                    val CONDITIONAL_BLOCK = of("CONDITIONAL_BLOCK")

                    val VELOCITY_LIMIT = of("VELOCITY_LIMIT")

                    fun of(value: String) = AuthRuleType(JsonField.of(value))
                }

                /** An enum containing [AuthRuleType]'s known values. */
                enum class Known {
                    CONDITIONAL_BLOCK,
                    VELOCITY_LIMIT,
                }

                /**
                 * An enum containing [AuthRuleType]'s known values, as well as an [_UNKNOWN]
                 * member.
                 *
                 * An instance of [AuthRuleType] can contain an unknown value in a couple of cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    CONDITIONAL_BLOCK,
                    VELOCITY_LIMIT,
                    /**
                     * An enum member indicating that [AuthRuleType] was instantiated with an
                     * unknown value.
                     */
                    _UNKNOWN,
                }

                /**
                 * Returns an enum member corresponding to this class instance's value, or
                 * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                 *
                 * Use the [known] method instead if you're certain the value is always known or if
                 * you want to throw for the unknown case.
                 */
                fun value(): Value =
                    when (this) {
                        CONDITIONAL_BLOCK -> Value.CONDITIONAL_BLOCK
                        VELOCITY_LIMIT -> Value.VELOCITY_LIMIT
                        else -> Value._UNKNOWN
                    }

                /**
                 * Returns an enum member corresponding to this class instance's value.
                 *
                 * Use the [value] method instead if you're uncertain the value is always known and
                 * don't want to throw for the unknown case.
                 *
                 * @throws LithicInvalidDataException if this class instance's value is a not a
                 *   known member.
                 */
                fun known(): Known =
                    when (this) {
                        CONDITIONAL_BLOCK -> Known.CONDITIONAL_BLOCK
                        VELOCITY_LIMIT -> Known.VELOCITY_LIMIT
                        else -> throw LithicInvalidDataException("Unknown AuthRuleType: $value")
                    }

                /**
                 * Returns this class instance's primitive wire representation.
                 *
                 * This differs from the [toString] method because that method is primarily for
                 * debugging and generally doesn't throw.
                 *
                 * @throws LithicInvalidDataException if this class instance's value does not have
                 *   the expected primitive type.
                 */
                fun asString(): String =
                    _value().asString() ?: throw LithicInvalidDataException("Value is not a String")

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is AuthRuleType && value == other.value /* spotless:on */
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is CreateAuthRuleRequestAccountTokens && accountTokens == other.accountTokens && name == other.name && parameters == other.parameters && type == other.type && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(accountTokens, name, parameters, type, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "CreateAuthRuleRequestAccountTokens{accountTokens=$accountTokens, name=$name, parameters=$parameters, type=$type, additionalProperties=$additionalProperties}"
        }

        @NoAutoDetect
        class CreateAuthRuleRequestCardTokens
        @JsonCreator
        private constructor(
            @JsonProperty("card_tokens")
            @ExcludeMissing
            private val cardTokens: JsonField<List<String>> = JsonMissing.of(),
            @JsonProperty("name")
            @ExcludeMissing
            private val name: JsonField<String> = JsonMissing.of(),
            @JsonProperty("parameters")
            @ExcludeMissing
            private val parameters: JsonField<Parameters> = JsonMissing.of(),
            @JsonProperty("type")
            @ExcludeMissing
            private val type: JsonField<AuthRuleType> = JsonMissing.of(),
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            /**
             * Card tokens to which the Auth Rule applies.
             *
             * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun cardTokens(): List<String> = cardTokens.getRequired("card_tokens")

            /**
             * Auth Rule Name
             *
             * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun name(): String? = name.getNullable("name")

            /**
             * Parameters for the Auth Rule
             *
             * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun parameters(): Parameters? = parameters.getNullable("parameters")

            /**
             * The type of Auth Rule
             *
             * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun type(): AuthRuleType? = type.getNullable("type")

            /**
             * Returns the raw JSON value of [cardTokens].
             *
             * Unlike [cardTokens], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("card_tokens")
            @ExcludeMissing
            fun _cardTokens(): JsonField<List<String>> = cardTokens

            /**
             * Returns the raw JSON value of [name].
             *
             * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

            /**
             * Returns the raw JSON value of [parameters].
             *
             * Unlike [parameters], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("parameters")
            @ExcludeMissing
            fun _parameters(): JsonField<Parameters> = parameters

            /**
             * Returns the raw JSON value of [type].
             *
             * Unlike [type], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<AuthRuleType> = type

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            private var validated: Boolean = false

            fun validate(): CreateAuthRuleRequestCardTokens = apply {
                if (validated) {
                    return@apply
                }

                cardTokens()
                name()
                parameters()?.validate()
                type()
                validated = true
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                /**
                 * Returns a mutable builder for constructing an instance of
                 * [CreateAuthRuleRequestCardTokens].
                 *
                 * The following fields are required:
                 * ```kotlin
                 * .cardTokens()
                 * ```
                 */
                fun builder() = Builder()
            }

            /** A builder for [CreateAuthRuleRequestCardTokens]. */
            class Builder internal constructor() {

                private var cardTokens: JsonField<MutableList<String>>? = null
                private var name: JsonField<String> = JsonMissing.of()
                private var parameters: JsonField<Parameters> = JsonMissing.of()
                private var type: JsonField<AuthRuleType> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(
                    createAuthRuleRequestCardTokens: CreateAuthRuleRequestCardTokens
                ) = apply {
                    cardTokens =
                        createAuthRuleRequestCardTokens.cardTokens.map { it.toMutableList() }
                    name = createAuthRuleRequestCardTokens.name
                    parameters = createAuthRuleRequestCardTokens.parameters
                    type = createAuthRuleRequestCardTokens.type
                    additionalProperties =
                        createAuthRuleRequestCardTokens.additionalProperties.toMutableMap()
                }

                /** Card tokens to which the Auth Rule applies. */
                fun cardTokens(cardTokens: List<String>) = cardTokens(JsonField.of(cardTokens))

                /**
                 * Sets [Builder.cardTokens] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.cardTokens] with a well-typed `List<String>`
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun cardTokens(cardTokens: JsonField<List<String>>) = apply {
                    this.cardTokens = cardTokens.map { it.toMutableList() }
                }

                /**
                 * Adds a single [String] to [cardTokens].
                 *
                 * @throws IllegalStateException if the field was previously set to a non-list.
                 */
                fun addCardToken(cardToken: String) = apply {
                    cardTokens =
                        (cardTokens ?: JsonField.of(mutableListOf())).also {
                            checkKnown("cardTokens", it).add(cardToken)
                        }
                }

                /** Auth Rule Name */
                fun name(name: String?) = name(JsonField.ofNullable(name))

                /**
                 * Sets [Builder.name] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.name] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun name(name: JsonField<String>) = apply { this.name = name }

                /** Parameters for the Auth Rule */
                fun parameters(parameters: Parameters) = parameters(JsonField.of(parameters))

                /**
                 * Sets [Builder.parameters] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.parameters] with a well-typed [Parameters] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun parameters(parameters: JsonField<Parameters>) = apply {
                    this.parameters = parameters
                }

                /**
                 * Alias for calling [parameters] with
                 * `Parameters.ofConditionalBlock(conditionalBlock)`.
                 */
                fun parameters(conditionalBlock: ConditionalBlockParameters) =
                    parameters(Parameters.ofConditionalBlock(conditionalBlock))

                /**
                 * Alias for calling [parameters] with
                 * `Parameters.ofVelocityLimitParams(velocityLimitParams)`.
                 */
                fun parameters(velocityLimitParams: VelocityLimitParams) =
                    parameters(Parameters.ofVelocityLimitParams(velocityLimitParams))

                /** The type of Auth Rule */
                fun type(type: AuthRuleType) = type(JsonField.of(type))

                /**
                 * Sets [Builder.type] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.type] with a well-typed [AuthRuleType] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun type(type: JsonField<AuthRuleType>) = apply { this.type = type }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                    keys.forEach(::removeAdditionalProperty)
                }

                fun build(): CreateAuthRuleRequestCardTokens =
                    CreateAuthRuleRequestCardTokens(
                        checkRequired("cardTokens", cardTokens).map { it.toImmutable() },
                        name,
                        parameters,
                        type,
                        additionalProperties.toImmutable(),
                    )
            }

            /** Parameters for the Auth Rule */
            @JsonDeserialize(using = Parameters.Deserializer::class)
            @JsonSerialize(using = Parameters.Serializer::class)
            class Parameters
            private constructor(
                private val conditionalBlock: ConditionalBlockParameters? = null,
                private val velocityLimitParams: VelocityLimitParams? = null,
                private val _json: JsonValue? = null,
            ) {

                fun conditionalBlock(): ConditionalBlockParameters? = conditionalBlock

                fun velocityLimitParams(): VelocityLimitParams? = velocityLimitParams

                fun isConditionalBlock(): Boolean = conditionalBlock != null

                fun isVelocityLimitParams(): Boolean = velocityLimitParams != null

                fun asConditionalBlock(): ConditionalBlockParameters =
                    conditionalBlock.getOrThrow("conditionalBlock")

                fun asVelocityLimitParams(): VelocityLimitParams =
                    velocityLimitParams.getOrThrow("velocityLimitParams")

                fun _json(): JsonValue? = _json

                fun <T> accept(visitor: Visitor<T>): T {
                    return when {
                        conditionalBlock != null -> visitor.visitConditionalBlock(conditionalBlock)
                        velocityLimitParams != null ->
                            visitor.visitVelocityLimitParams(velocityLimitParams)
                        else -> visitor.unknown(_json)
                    }
                }

                private var validated: Boolean = false

                fun validate(): Parameters = apply {
                    if (validated) {
                        return@apply
                    }

                    accept(
                        object : Visitor<Unit> {
                            override fun visitConditionalBlock(
                                conditionalBlock: ConditionalBlockParameters
                            ) {
                                conditionalBlock.validate()
                            }

                            override fun visitVelocityLimitParams(
                                velocityLimitParams: VelocityLimitParams
                            ) {
                                velocityLimitParams.validate()
                            }
                        }
                    )
                    validated = true
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is Parameters && conditionalBlock == other.conditionalBlock && velocityLimitParams == other.velocityLimitParams /* spotless:on */
                }

                override fun hashCode(): Int = /* spotless:off */ Objects.hash(conditionalBlock, velocityLimitParams) /* spotless:on */

                override fun toString(): String =
                    when {
                        conditionalBlock != null -> "Parameters{conditionalBlock=$conditionalBlock}"
                        velocityLimitParams != null ->
                            "Parameters{velocityLimitParams=$velocityLimitParams}"
                        _json != null -> "Parameters{_unknown=$_json}"
                        else -> throw IllegalStateException("Invalid Parameters")
                    }

                companion object {

                    fun ofConditionalBlock(conditionalBlock: ConditionalBlockParameters) =
                        Parameters(conditionalBlock = conditionalBlock)

                    fun ofVelocityLimitParams(velocityLimitParams: VelocityLimitParams) =
                        Parameters(velocityLimitParams = velocityLimitParams)
                }

                /**
                 * An interface that defines how to map each variant of [Parameters] to a value of
                 * type [T].
                 */
                interface Visitor<out T> {

                    fun visitConditionalBlock(conditionalBlock: ConditionalBlockParameters): T

                    fun visitVelocityLimitParams(velocityLimitParams: VelocityLimitParams): T

                    /**
                     * Maps an unknown variant of [Parameters] to a value of type [T].
                     *
                     * An instance of [Parameters] can contain an unknown variant if it was
                     * deserialized from data that doesn't match any known variant. For example, if
                     * the SDK is on an older version than the API, then the API may respond with
                     * new variants that the SDK is unaware of.
                     *
                     * @throws LithicInvalidDataException in the default implementation.
                     */
                    fun unknown(json: JsonValue?): T {
                        throw LithicInvalidDataException("Unknown Parameters: $json")
                    }
                }

                internal class Deserializer : BaseDeserializer<Parameters>(Parameters::class) {

                    override fun ObjectCodec.deserialize(node: JsonNode): Parameters {
                        val json = JsonValue.fromJsonNode(node)

                        tryDeserialize(node, jacksonTypeRef<ConditionalBlockParameters>()) {
                                it.validate()
                            }
                            ?.let {
                                return Parameters(conditionalBlock = it, _json = json)
                            }
                        tryDeserialize(node, jacksonTypeRef<VelocityLimitParams>()) {
                                it.validate()
                            }
                            ?.let {
                                return Parameters(velocityLimitParams = it, _json = json)
                            }

                        return Parameters(_json = json)
                    }
                }

                internal class Serializer : BaseSerializer<Parameters>(Parameters::class) {

                    override fun serialize(
                        value: Parameters,
                        generator: JsonGenerator,
                        provider: SerializerProvider,
                    ) {
                        when {
                            value.conditionalBlock != null ->
                                generator.writeObject(value.conditionalBlock)
                            value.velocityLimitParams != null ->
                                generator.writeObject(value.velocityLimitParams)
                            value._json != null -> generator.writeObject(value._json)
                            else -> throw IllegalStateException("Invalid Parameters")
                        }
                    }
                }
            }

            /** The type of Auth Rule */
            class AuthRuleType
            @JsonCreator
            private constructor(private val value: JsonField<String>) : Enum {

                /**
                 * Returns this class instance's raw value.
                 *
                 * This is usually only useful if this instance was deserialized from data that
                 * doesn't match any known member, and you want to know that value. For example, if
                 * the SDK is on an older version than the API, then the API may respond with new
                 * members that the SDK is unaware of.
                 */
                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                companion object {

                    val CONDITIONAL_BLOCK = of("CONDITIONAL_BLOCK")

                    val VELOCITY_LIMIT = of("VELOCITY_LIMIT")

                    fun of(value: String) = AuthRuleType(JsonField.of(value))
                }

                /** An enum containing [AuthRuleType]'s known values. */
                enum class Known {
                    CONDITIONAL_BLOCK,
                    VELOCITY_LIMIT,
                }

                /**
                 * An enum containing [AuthRuleType]'s known values, as well as an [_UNKNOWN]
                 * member.
                 *
                 * An instance of [AuthRuleType] can contain an unknown value in a couple of cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    CONDITIONAL_BLOCK,
                    VELOCITY_LIMIT,
                    /**
                     * An enum member indicating that [AuthRuleType] was instantiated with an
                     * unknown value.
                     */
                    _UNKNOWN,
                }

                /**
                 * Returns an enum member corresponding to this class instance's value, or
                 * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                 *
                 * Use the [known] method instead if you're certain the value is always known or if
                 * you want to throw for the unknown case.
                 */
                fun value(): Value =
                    when (this) {
                        CONDITIONAL_BLOCK -> Value.CONDITIONAL_BLOCK
                        VELOCITY_LIMIT -> Value.VELOCITY_LIMIT
                        else -> Value._UNKNOWN
                    }

                /**
                 * Returns an enum member corresponding to this class instance's value.
                 *
                 * Use the [value] method instead if you're uncertain the value is always known and
                 * don't want to throw for the unknown case.
                 *
                 * @throws LithicInvalidDataException if this class instance's value is a not a
                 *   known member.
                 */
                fun known(): Known =
                    when (this) {
                        CONDITIONAL_BLOCK -> Known.CONDITIONAL_BLOCK
                        VELOCITY_LIMIT -> Known.VELOCITY_LIMIT
                        else -> throw LithicInvalidDataException("Unknown AuthRuleType: $value")
                    }

                /**
                 * Returns this class instance's primitive wire representation.
                 *
                 * This differs from the [toString] method because that method is primarily for
                 * debugging and generally doesn't throw.
                 *
                 * @throws LithicInvalidDataException if this class instance's value does not have
                 *   the expected primitive type.
                 */
                fun asString(): String =
                    _value().asString() ?: throw LithicInvalidDataException("Value is not a String")

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is AuthRuleType && value == other.value /* spotless:on */
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is CreateAuthRuleRequestCardTokens && cardTokens == other.cardTokens && name == other.name && parameters == other.parameters && type == other.type && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(cardTokens, name, parameters, type, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "CreateAuthRuleRequestCardTokens{cardTokens=$cardTokens, name=$name, parameters=$parameters, type=$type, additionalProperties=$additionalProperties}"
        }

        @NoAutoDetect
        class CreateAuthRuleRequestProgramLevel
        @JsonCreator
        private constructor(
            @JsonProperty("program_level")
            @ExcludeMissing
            private val programLevel: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("excluded_card_tokens")
            @ExcludeMissing
            private val excludedCardTokens: JsonField<List<String>> = JsonMissing.of(),
            @JsonProperty("name")
            @ExcludeMissing
            private val name: JsonField<String> = JsonMissing.of(),
            @JsonProperty("parameters")
            @ExcludeMissing
            private val parameters: JsonField<Parameters> = JsonMissing.of(),
            @JsonProperty("type")
            @ExcludeMissing
            private val type: JsonField<AuthRuleType> = JsonMissing.of(),
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            /**
             * Whether the Auth Rule applies to all authorizations on the card program.
             *
             * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun programLevel(): Boolean = programLevel.getRequired("program_level")

            /**
             * Card tokens to which the Auth Rule does not apply.
             *
             * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun excludedCardTokens(): List<String>? =
                excludedCardTokens.getNullable("excluded_card_tokens")

            /**
             * Auth Rule Name
             *
             * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun name(): String? = name.getNullable("name")

            /**
             * Parameters for the Auth Rule
             *
             * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun parameters(): Parameters? = parameters.getNullable("parameters")

            /**
             * The type of Auth Rule
             *
             * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun type(): AuthRuleType? = type.getNullable("type")

            /**
             * Returns the raw JSON value of [programLevel].
             *
             * Unlike [programLevel], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("program_level")
            @ExcludeMissing
            fun _programLevel(): JsonField<Boolean> = programLevel

            /**
             * Returns the raw JSON value of [excludedCardTokens].
             *
             * Unlike [excludedCardTokens], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("excluded_card_tokens")
            @ExcludeMissing
            fun _excludedCardTokens(): JsonField<List<String>> = excludedCardTokens

            /**
             * Returns the raw JSON value of [name].
             *
             * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

            /**
             * Returns the raw JSON value of [parameters].
             *
             * Unlike [parameters], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("parameters")
            @ExcludeMissing
            fun _parameters(): JsonField<Parameters> = parameters

            /**
             * Returns the raw JSON value of [type].
             *
             * Unlike [type], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<AuthRuleType> = type

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            private var validated: Boolean = false

            fun validate(): CreateAuthRuleRequestProgramLevel = apply {
                if (validated) {
                    return@apply
                }

                programLevel()
                excludedCardTokens()
                name()
                parameters()?.validate()
                type()
                validated = true
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                /**
                 * Returns a mutable builder for constructing an instance of
                 * [CreateAuthRuleRequestProgramLevel].
                 *
                 * The following fields are required:
                 * ```kotlin
                 * .programLevel()
                 * ```
                 */
                fun builder() = Builder()
            }

            /** A builder for [CreateAuthRuleRequestProgramLevel]. */
            class Builder internal constructor() {

                private var programLevel: JsonField<Boolean>? = null
                private var excludedCardTokens: JsonField<MutableList<String>>? = null
                private var name: JsonField<String> = JsonMissing.of()
                private var parameters: JsonField<Parameters> = JsonMissing.of()
                private var type: JsonField<AuthRuleType> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(
                    createAuthRuleRequestProgramLevel: CreateAuthRuleRequestProgramLevel
                ) = apply {
                    programLevel = createAuthRuleRequestProgramLevel.programLevel
                    excludedCardTokens =
                        createAuthRuleRequestProgramLevel.excludedCardTokens.map {
                            it.toMutableList()
                        }
                    name = createAuthRuleRequestProgramLevel.name
                    parameters = createAuthRuleRequestProgramLevel.parameters
                    type = createAuthRuleRequestProgramLevel.type
                    additionalProperties =
                        createAuthRuleRequestProgramLevel.additionalProperties.toMutableMap()
                }

                /** Whether the Auth Rule applies to all authorizations on the card program. */
                fun programLevel(programLevel: Boolean) = programLevel(JsonField.of(programLevel))

                /**
                 * Sets [Builder.programLevel] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.programLevel] with a well-typed [Boolean] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun programLevel(programLevel: JsonField<Boolean>) = apply {
                    this.programLevel = programLevel
                }

                /** Card tokens to which the Auth Rule does not apply. */
                fun excludedCardTokens(excludedCardTokens: List<String>) =
                    excludedCardTokens(JsonField.of(excludedCardTokens))

                /**
                 * Sets [Builder.excludedCardTokens] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.excludedCardTokens] with a well-typed
                 * `List<String>` value instead. This method is primarily for setting the field to
                 * an undocumented or not yet supported value.
                 */
                fun excludedCardTokens(excludedCardTokens: JsonField<List<String>>) = apply {
                    this.excludedCardTokens = excludedCardTokens.map { it.toMutableList() }
                }

                /**
                 * Adds a single [String] to [excludedCardTokens].
                 *
                 * @throws IllegalStateException if the field was previously set to a non-list.
                 */
                fun addExcludedCardToken(excludedCardToken: String) = apply {
                    excludedCardTokens =
                        (excludedCardTokens ?: JsonField.of(mutableListOf())).also {
                            checkKnown("excludedCardTokens", it).add(excludedCardToken)
                        }
                }

                /** Auth Rule Name */
                fun name(name: String?) = name(JsonField.ofNullable(name))

                /**
                 * Sets [Builder.name] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.name] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun name(name: JsonField<String>) = apply { this.name = name }

                /** Parameters for the Auth Rule */
                fun parameters(parameters: Parameters) = parameters(JsonField.of(parameters))

                /**
                 * Sets [Builder.parameters] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.parameters] with a well-typed [Parameters] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun parameters(parameters: JsonField<Parameters>) = apply {
                    this.parameters = parameters
                }

                /**
                 * Alias for calling [parameters] with
                 * `Parameters.ofConditionalBlock(conditionalBlock)`.
                 */
                fun parameters(conditionalBlock: ConditionalBlockParameters) =
                    parameters(Parameters.ofConditionalBlock(conditionalBlock))

                /**
                 * Alias for calling [parameters] with
                 * `Parameters.ofVelocityLimitParams(velocityLimitParams)`.
                 */
                fun parameters(velocityLimitParams: VelocityLimitParams) =
                    parameters(Parameters.ofVelocityLimitParams(velocityLimitParams))

                /** The type of Auth Rule */
                fun type(type: AuthRuleType) = type(JsonField.of(type))

                /**
                 * Sets [Builder.type] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.type] with a well-typed [AuthRuleType] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun type(type: JsonField<AuthRuleType>) = apply { this.type = type }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                    keys.forEach(::removeAdditionalProperty)
                }

                fun build(): CreateAuthRuleRequestProgramLevel =
                    CreateAuthRuleRequestProgramLevel(
                        checkRequired("programLevel", programLevel),
                        (excludedCardTokens ?: JsonMissing.of()).map { it.toImmutable() },
                        name,
                        parameters,
                        type,
                        additionalProperties.toImmutable(),
                    )
            }

            /** Parameters for the Auth Rule */
            @JsonDeserialize(using = Parameters.Deserializer::class)
            @JsonSerialize(using = Parameters.Serializer::class)
            class Parameters
            private constructor(
                private val conditionalBlock: ConditionalBlockParameters? = null,
                private val velocityLimitParams: VelocityLimitParams? = null,
                private val _json: JsonValue? = null,
            ) {

                fun conditionalBlock(): ConditionalBlockParameters? = conditionalBlock

                fun velocityLimitParams(): VelocityLimitParams? = velocityLimitParams

                fun isConditionalBlock(): Boolean = conditionalBlock != null

                fun isVelocityLimitParams(): Boolean = velocityLimitParams != null

                fun asConditionalBlock(): ConditionalBlockParameters =
                    conditionalBlock.getOrThrow("conditionalBlock")

                fun asVelocityLimitParams(): VelocityLimitParams =
                    velocityLimitParams.getOrThrow("velocityLimitParams")

                fun _json(): JsonValue? = _json

                fun <T> accept(visitor: Visitor<T>): T {
                    return when {
                        conditionalBlock != null -> visitor.visitConditionalBlock(conditionalBlock)
                        velocityLimitParams != null ->
                            visitor.visitVelocityLimitParams(velocityLimitParams)
                        else -> visitor.unknown(_json)
                    }
                }

                private var validated: Boolean = false

                fun validate(): Parameters = apply {
                    if (validated) {
                        return@apply
                    }

                    accept(
                        object : Visitor<Unit> {
                            override fun visitConditionalBlock(
                                conditionalBlock: ConditionalBlockParameters
                            ) {
                                conditionalBlock.validate()
                            }

                            override fun visitVelocityLimitParams(
                                velocityLimitParams: VelocityLimitParams
                            ) {
                                velocityLimitParams.validate()
                            }
                        }
                    )
                    validated = true
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is Parameters && conditionalBlock == other.conditionalBlock && velocityLimitParams == other.velocityLimitParams /* spotless:on */
                }

                override fun hashCode(): Int = /* spotless:off */ Objects.hash(conditionalBlock, velocityLimitParams) /* spotless:on */

                override fun toString(): String =
                    when {
                        conditionalBlock != null -> "Parameters{conditionalBlock=$conditionalBlock}"
                        velocityLimitParams != null ->
                            "Parameters{velocityLimitParams=$velocityLimitParams}"
                        _json != null -> "Parameters{_unknown=$_json}"
                        else -> throw IllegalStateException("Invalid Parameters")
                    }

                companion object {

                    fun ofConditionalBlock(conditionalBlock: ConditionalBlockParameters) =
                        Parameters(conditionalBlock = conditionalBlock)

                    fun ofVelocityLimitParams(velocityLimitParams: VelocityLimitParams) =
                        Parameters(velocityLimitParams = velocityLimitParams)
                }

                /**
                 * An interface that defines how to map each variant of [Parameters] to a value of
                 * type [T].
                 */
                interface Visitor<out T> {

                    fun visitConditionalBlock(conditionalBlock: ConditionalBlockParameters): T

                    fun visitVelocityLimitParams(velocityLimitParams: VelocityLimitParams): T

                    /**
                     * Maps an unknown variant of [Parameters] to a value of type [T].
                     *
                     * An instance of [Parameters] can contain an unknown variant if it was
                     * deserialized from data that doesn't match any known variant. For example, if
                     * the SDK is on an older version than the API, then the API may respond with
                     * new variants that the SDK is unaware of.
                     *
                     * @throws LithicInvalidDataException in the default implementation.
                     */
                    fun unknown(json: JsonValue?): T {
                        throw LithicInvalidDataException("Unknown Parameters: $json")
                    }
                }

                internal class Deserializer : BaseDeserializer<Parameters>(Parameters::class) {

                    override fun ObjectCodec.deserialize(node: JsonNode): Parameters {
                        val json = JsonValue.fromJsonNode(node)

                        tryDeserialize(node, jacksonTypeRef<ConditionalBlockParameters>()) {
                                it.validate()
                            }
                            ?.let {
                                return Parameters(conditionalBlock = it, _json = json)
                            }
                        tryDeserialize(node, jacksonTypeRef<VelocityLimitParams>()) {
                                it.validate()
                            }
                            ?.let {
                                return Parameters(velocityLimitParams = it, _json = json)
                            }

                        return Parameters(_json = json)
                    }
                }

                internal class Serializer : BaseSerializer<Parameters>(Parameters::class) {

                    override fun serialize(
                        value: Parameters,
                        generator: JsonGenerator,
                        provider: SerializerProvider,
                    ) {
                        when {
                            value.conditionalBlock != null ->
                                generator.writeObject(value.conditionalBlock)
                            value.velocityLimitParams != null ->
                                generator.writeObject(value.velocityLimitParams)
                            value._json != null -> generator.writeObject(value._json)
                            else -> throw IllegalStateException("Invalid Parameters")
                        }
                    }
                }
            }

            /** The type of Auth Rule */
            class AuthRuleType
            @JsonCreator
            private constructor(private val value: JsonField<String>) : Enum {

                /**
                 * Returns this class instance's raw value.
                 *
                 * This is usually only useful if this instance was deserialized from data that
                 * doesn't match any known member, and you want to know that value. For example, if
                 * the SDK is on an older version than the API, then the API may respond with new
                 * members that the SDK is unaware of.
                 */
                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                companion object {

                    val CONDITIONAL_BLOCK = of("CONDITIONAL_BLOCK")

                    val VELOCITY_LIMIT = of("VELOCITY_LIMIT")

                    fun of(value: String) = AuthRuleType(JsonField.of(value))
                }

                /** An enum containing [AuthRuleType]'s known values. */
                enum class Known {
                    CONDITIONAL_BLOCK,
                    VELOCITY_LIMIT,
                }

                /**
                 * An enum containing [AuthRuleType]'s known values, as well as an [_UNKNOWN]
                 * member.
                 *
                 * An instance of [AuthRuleType] can contain an unknown value in a couple of cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    CONDITIONAL_BLOCK,
                    VELOCITY_LIMIT,
                    /**
                     * An enum member indicating that [AuthRuleType] was instantiated with an
                     * unknown value.
                     */
                    _UNKNOWN,
                }

                /**
                 * Returns an enum member corresponding to this class instance's value, or
                 * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                 *
                 * Use the [known] method instead if you're certain the value is always known or if
                 * you want to throw for the unknown case.
                 */
                fun value(): Value =
                    when (this) {
                        CONDITIONAL_BLOCK -> Value.CONDITIONAL_BLOCK
                        VELOCITY_LIMIT -> Value.VELOCITY_LIMIT
                        else -> Value._UNKNOWN
                    }

                /**
                 * Returns an enum member corresponding to this class instance's value.
                 *
                 * Use the [value] method instead if you're uncertain the value is always known and
                 * don't want to throw for the unknown case.
                 *
                 * @throws LithicInvalidDataException if this class instance's value is a not a
                 *   known member.
                 */
                fun known(): Known =
                    when (this) {
                        CONDITIONAL_BLOCK -> Known.CONDITIONAL_BLOCK
                        VELOCITY_LIMIT -> Known.VELOCITY_LIMIT
                        else -> throw LithicInvalidDataException("Unknown AuthRuleType: $value")
                    }

                /**
                 * Returns this class instance's primitive wire representation.
                 *
                 * This differs from the [toString] method because that method is primarily for
                 * debugging and generally doesn't throw.
                 *
                 * @throws LithicInvalidDataException if this class instance's value does not have
                 *   the expected primitive type.
                 */
                fun asString(): String =
                    _value().asString() ?: throw LithicInvalidDataException("Value is not a String")

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is AuthRuleType && value == other.value /* spotless:on */
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is CreateAuthRuleRequestProgramLevel && programLevel == other.programLevel && excludedCardTokens == other.excludedCardTokens && name == other.name && parameters == other.parameters && type == other.type && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(programLevel, excludedCardTokens, name, parameters, type, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "CreateAuthRuleRequestProgramLevel{programLevel=$programLevel, excludedCardTokens=$excludedCardTokens, name=$name, parameters=$parameters, type=$type, additionalProperties=$additionalProperties}"
        }
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [AuthRuleV2CreateParams].
         *
         * The following fields are required:
         * ```kotlin
         * .body()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [AuthRuleV2CreateParams]. */
    @NoAutoDetect
    class Builder internal constructor() {

        private var body: Body? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        internal fun from(authRuleV2CreateParams: AuthRuleV2CreateParams) = apply {
            body = authRuleV2CreateParams.body
            additionalHeaders = authRuleV2CreateParams.additionalHeaders.toBuilder()
            additionalQueryParams = authRuleV2CreateParams.additionalQueryParams.toBuilder()
        }

        fun body(body: Body) = apply { this.body = body }

        /**
         * Alias for calling [body] with
         * `Body.ofCreateAuthRuleRequestAccountTokens(createAuthRuleRequestAccountTokens)`.
         */
        fun body(createAuthRuleRequestAccountTokens: Body.CreateAuthRuleRequestAccountTokens) =
            body(Body.ofCreateAuthRuleRequestAccountTokens(createAuthRuleRequestAccountTokens))

        /**
         * Alias for calling [body] with
         * `Body.ofCreateAuthRuleRequestCardTokens(createAuthRuleRequestCardTokens)`.
         */
        fun body(createAuthRuleRequestCardTokens: Body.CreateAuthRuleRequestCardTokens) =
            body(Body.ofCreateAuthRuleRequestCardTokens(createAuthRuleRequestCardTokens))

        /**
         * Alias for calling [body] with
         * `Body.ofCreateAuthRuleRequestProgramLevel(createAuthRuleRequestProgramLevel)`.
         */
        fun body(createAuthRuleRequestProgramLevel: Body.CreateAuthRuleRequestProgramLevel) =
            body(Body.ofCreateAuthRuleRequestProgramLevel(createAuthRuleRequestProgramLevel))

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

        fun build(): AuthRuleV2CreateParams =
            AuthRuleV2CreateParams(
                checkRequired("body", body),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is AuthRuleV2CreateParams && body == other.body && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(body, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() =
        "AuthRuleV2CreateParams{body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
