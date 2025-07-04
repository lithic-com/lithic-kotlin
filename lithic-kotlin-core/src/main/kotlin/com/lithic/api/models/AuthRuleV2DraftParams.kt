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
import com.lithic.api.core.Params
import com.lithic.api.core.allMaxBy
import com.lithic.api.core.checkKnown
import com.lithic.api.core.checkRequired
import com.lithic.api.core.getOrThrow
import com.lithic.api.core.http.Headers
import com.lithic.api.core.http.QueryParams
import com.lithic.api.core.toImmutable
import com.lithic.api.errors.LithicInvalidDataException
import java.util.Collections
import java.util.Objects

/**
 * Creates a new draft version of a rule that will be ran in shadow mode.
 *
 * This can also be utilized to reset the draft parameters, causing a draft version to no longer be
 * ran in shadow mode.
 */
class AuthRuleV2DraftParams
private constructor(
    private val authRuleToken: String?,
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun authRuleToken(): String? = authRuleToken

    /**
     * Parameters for the Auth Rule
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun parameters(): Parameters? = body.parameters()

    /**
     * Returns the raw JSON value of [parameters].
     *
     * Unlike [parameters], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _parameters(): JsonField<Parameters> = body._parameters()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        fun none(): AuthRuleV2DraftParams = builder().build()

        /** Returns a mutable builder for constructing an instance of [AuthRuleV2DraftParams]. */
        fun builder() = Builder()
    }

    /** A builder for [AuthRuleV2DraftParams]. */
    class Builder internal constructor() {

        private var authRuleToken: String? = null
        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        internal fun from(authRuleV2DraftParams: AuthRuleV2DraftParams) = apply {
            authRuleToken = authRuleV2DraftParams.authRuleToken
            body = authRuleV2DraftParams.body.toBuilder()
            additionalHeaders = authRuleV2DraftParams.additionalHeaders.toBuilder()
            additionalQueryParams = authRuleV2DraftParams.additionalQueryParams.toBuilder()
        }

        fun authRuleToken(authRuleToken: String?) = apply { this.authRuleToken = authRuleToken }

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [parameters]
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        /** Parameters for the Auth Rule */
        fun parameters(parameters: Parameters?) = apply { body.parameters(parameters) }

        /**
         * Sets [Builder.parameters] to an arbitrary JSON value.
         *
         * You should usually call [Builder.parameters] with a well-typed [Parameters] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun parameters(parameters: JsonField<Parameters>) = apply { body.parameters(parameters) }

        /**
         * Alias for calling [parameters] with `Parameters.ofConditionalBlock(conditionalBlock)`.
         */
        fun parameters(conditionalBlock: ConditionalBlockParameters) = apply {
            body.parameters(conditionalBlock)
        }

        /**
         * Alias for calling [parameters] with
         * `Parameters.ofVelocityLimitParams(velocityLimitParams)`.
         */
        fun parameters(velocityLimitParams: VelocityLimitParams) = apply {
            body.parameters(velocityLimitParams)
        }

        /** Alias for calling [parameters] with `Parameters.ofMerchantLock(merchantLock)`. */
        fun parameters(merchantLock: Parameters.MerchantLockParameters) = apply {
            body.parameters(merchantLock)
        }

        /**
         * Alias for calling [parameters] with
         * `Parameters.ofConditional3dsAction(conditional3dsAction)`.
         */
        fun parameters(conditional3dsAction: Parameters.Conditional3dsActionParameters) = apply {
            body.parameters(conditional3dsAction)
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

        /**
         * Returns an immutable instance of [AuthRuleV2DraftParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): AuthRuleV2DraftParams =
            AuthRuleV2DraftParams(
                authRuleToken,
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): Body = body

    fun _pathParam(index: Int): String =
        when (index) {
            0 -> authRuleToken ?: ""
            else -> ""
        }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    class Body
    private constructor(
        private val parameters: JsonField<Parameters>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("parameters")
            @ExcludeMissing
            parameters: JsonField<Parameters> = JsonMissing.of()
        ) : this(parameters, mutableMapOf())

        /**
         * Parameters for the Auth Rule
         *
         * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun parameters(): Parameters? = parameters.getNullable("parameters")

        /**
         * Returns the raw JSON value of [parameters].
         *
         * Unlike [parameters], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("parameters")
        @ExcludeMissing
        fun _parameters(): JsonField<Parameters> = parameters

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

            /** Returns a mutable builder for constructing an instance of [Body]. */
            fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var parameters: JsonField<Parameters> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(body: Body) = apply {
                parameters = body.parameters
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            /** Parameters for the Auth Rule */
            fun parameters(parameters: Parameters?) = parameters(JsonField.ofNullable(parameters))

            /**
             * Sets [Builder.parameters] to an arbitrary JSON value.
             *
             * You should usually call [Builder.parameters] with a well-typed [Parameters] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
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

            /** Alias for calling [parameters] with `Parameters.ofMerchantLock(merchantLock)`. */
            fun parameters(merchantLock: Parameters.MerchantLockParameters) =
                parameters(Parameters.ofMerchantLock(merchantLock))

            /**
             * Alias for calling [parameters] with
             * `Parameters.ofConditional3dsAction(conditional3dsAction)`.
             */
            fun parameters(conditional3dsAction: Parameters.Conditional3dsActionParameters) =
                parameters(Parameters.ofConditional3dsAction(conditional3dsAction))

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
             * Returns an immutable instance of [Body].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Body = Body(parameters, additionalProperties.toMutableMap())
        }

        private var validated: Boolean = false

        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            parameters()?.validate()
            validated = true
        }

        fun isValid(): Boolean =
            try {
                validate()
                true
            } catch (e: LithicInvalidDataException) {
                false
            }

        /**
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        internal fun validity(): Int = (parameters.asKnown()?.validity() ?: 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Body && parameters == other.parameters && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(parameters, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{parameters=$parameters, additionalProperties=$additionalProperties}"
    }

    /** Parameters for the Auth Rule */
    @JsonDeserialize(using = Parameters.Deserializer::class)
    @JsonSerialize(using = Parameters.Serializer::class)
    class Parameters
    private constructor(
        private val conditionalBlock: ConditionalBlockParameters? = null,
        private val velocityLimitParams: VelocityLimitParams? = null,
        private val merchantLock: MerchantLockParameters? = null,
        private val conditional3dsAction: Conditional3dsActionParameters? = null,
        private val _json: JsonValue? = null,
    ) {

        fun conditionalBlock(): ConditionalBlockParameters? = conditionalBlock

        fun velocityLimitParams(): VelocityLimitParams? = velocityLimitParams

        fun merchantLock(): MerchantLockParameters? = merchantLock

        fun conditional3dsAction(): Conditional3dsActionParameters? = conditional3dsAction

        fun isConditionalBlock(): Boolean = conditionalBlock != null

        fun isVelocityLimitParams(): Boolean = velocityLimitParams != null

        fun isMerchantLock(): Boolean = merchantLock != null

        fun isConditional3dsAction(): Boolean = conditional3dsAction != null

        fun asConditionalBlock(): ConditionalBlockParameters =
            conditionalBlock.getOrThrow("conditionalBlock")

        fun asVelocityLimitParams(): VelocityLimitParams =
            velocityLimitParams.getOrThrow("velocityLimitParams")

        fun asMerchantLock(): MerchantLockParameters = merchantLock.getOrThrow("merchantLock")

        fun asConditional3dsAction(): Conditional3dsActionParameters =
            conditional3dsAction.getOrThrow("conditional3dsAction")

        fun _json(): JsonValue? = _json

        fun <T> accept(visitor: Visitor<T>): T =
            when {
                conditionalBlock != null -> visitor.visitConditionalBlock(conditionalBlock)
                velocityLimitParams != null -> visitor.visitVelocityLimitParams(velocityLimitParams)
                merchantLock != null -> visitor.visitMerchantLock(merchantLock)
                conditional3dsAction != null ->
                    visitor.visitConditional3dsAction(conditional3dsAction)
                else -> visitor.unknown(_json)
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

                    override fun visitMerchantLock(merchantLock: MerchantLockParameters) {
                        merchantLock.validate()
                    }

                    override fun visitConditional3dsAction(
                        conditional3dsAction: Conditional3dsActionParameters
                    ) {
                        conditional3dsAction.validate()
                    }
                }
            )
            validated = true
        }

        fun isValid(): Boolean =
            try {
                validate()
                true
            } catch (e: LithicInvalidDataException) {
                false
            }

        /**
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        internal fun validity(): Int =
            accept(
                object : Visitor<Int> {
                    override fun visitConditionalBlock(
                        conditionalBlock: ConditionalBlockParameters
                    ) = conditionalBlock.validity()

                    override fun visitVelocityLimitParams(
                        velocityLimitParams: VelocityLimitParams
                    ) = velocityLimitParams.validity()

                    override fun visitMerchantLock(merchantLock: MerchantLockParameters) =
                        merchantLock.validity()

                    override fun visitConditional3dsAction(
                        conditional3dsAction: Conditional3dsActionParameters
                    ) = conditional3dsAction.validity()

                    override fun unknown(json: JsonValue?) = 0
                }
            )

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Parameters && conditionalBlock == other.conditionalBlock && velocityLimitParams == other.velocityLimitParams && merchantLock == other.merchantLock && conditional3dsAction == other.conditional3dsAction /* spotless:on */
        }

        override fun hashCode(): Int = /* spotless:off */ Objects.hash(conditionalBlock, velocityLimitParams, merchantLock, conditional3dsAction) /* spotless:on */

        override fun toString(): String =
            when {
                conditionalBlock != null -> "Parameters{conditionalBlock=$conditionalBlock}"
                velocityLimitParams != null ->
                    "Parameters{velocityLimitParams=$velocityLimitParams}"
                merchantLock != null -> "Parameters{merchantLock=$merchantLock}"
                conditional3dsAction != null ->
                    "Parameters{conditional3dsAction=$conditional3dsAction}"
                _json != null -> "Parameters{_unknown=$_json}"
                else -> throw IllegalStateException("Invalid Parameters")
            }

        companion object {

            fun ofConditionalBlock(conditionalBlock: ConditionalBlockParameters) =
                Parameters(conditionalBlock = conditionalBlock)

            fun ofVelocityLimitParams(velocityLimitParams: VelocityLimitParams) =
                Parameters(velocityLimitParams = velocityLimitParams)

            fun ofMerchantLock(merchantLock: MerchantLockParameters) =
                Parameters(merchantLock = merchantLock)

            fun ofConditional3dsAction(conditional3dsAction: Conditional3dsActionParameters) =
                Parameters(conditional3dsAction = conditional3dsAction)
        }

        /**
         * An interface that defines how to map each variant of [Parameters] to a value of type [T].
         */
        interface Visitor<out T> {

            fun visitConditionalBlock(conditionalBlock: ConditionalBlockParameters): T

            fun visitVelocityLimitParams(velocityLimitParams: VelocityLimitParams): T

            fun visitMerchantLock(merchantLock: MerchantLockParameters): T

            fun visitConditional3dsAction(conditional3dsAction: Conditional3dsActionParameters): T

            /**
             * Maps an unknown variant of [Parameters] to a value of type [T].
             *
             * An instance of [Parameters] can contain an unknown variant if it was deserialized
             * from data that doesn't match any known variant. For example, if the SDK is on an
             * older version than the API, then the API may respond with new variants that the SDK
             * is unaware of.
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

                val bestMatches =
                    sequenceOf(
                            tryDeserialize(node, jacksonTypeRef<ConditionalBlockParameters>())
                                ?.let { Parameters(conditionalBlock = it, _json = json) },
                            tryDeserialize(node, jacksonTypeRef<VelocityLimitParams>())?.let {
                                Parameters(velocityLimitParams = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<MerchantLockParameters>())?.let {
                                Parameters(merchantLock = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<Conditional3dsActionParameters>())
                                ?.let { Parameters(conditional3dsAction = it, _json = json) },
                        )
                        .filterNotNull()
                        .allMaxBy { it.validity() }
                        .toList()
                return when (bestMatches.size) {
                    // This can happen if what we're deserializing is completely incompatible with
                    // all the possible variants (e.g. deserializing from boolean).
                    0 -> Parameters(_json = json)
                    1 -> bestMatches.single()
                    // If there's more than one match with the highest validity, then use the first
                    // completely valid match, or simply the first match if none are completely
                    // valid.
                    else -> bestMatches.firstOrNull { it.isValid() } ?: bestMatches.first()
                }
            }
        }

        internal class Serializer : BaseSerializer<Parameters>(Parameters::class) {

            override fun serialize(
                value: Parameters,
                generator: JsonGenerator,
                provider: SerializerProvider,
            ) {
                when {
                    value.conditionalBlock != null -> generator.writeObject(value.conditionalBlock)
                    value.velocityLimitParams != null ->
                        generator.writeObject(value.velocityLimitParams)
                    value.merchantLock != null -> generator.writeObject(value.merchantLock)
                    value.conditional3dsAction != null ->
                        generator.writeObject(value.conditional3dsAction)
                    value._json != null -> generator.writeObject(value._json)
                    else -> throw IllegalStateException("Invalid Parameters")
                }
            }
        }

        class MerchantLockParameters
        private constructor(
            private val merchants: JsonField<List<Merchant>>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("merchants")
                @ExcludeMissing
                merchants: JsonField<List<Merchant>> = JsonMissing.of()
            ) : this(merchants, mutableMapOf())

            /**
             * A list of merchant locks defining specific merchants or groups of merchants (based on
             * descriptors or IDs) that the lock applies to.
             *
             * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun merchants(): List<Merchant> = merchants.getRequired("merchants")

            /**
             * Returns the raw JSON value of [merchants].
             *
             * Unlike [merchants], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("merchants")
            @ExcludeMissing
            fun _merchants(): JsonField<List<Merchant>> = merchants

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

                /**
                 * Returns a mutable builder for constructing an instance of
                 * [MerchantLockParameters].
                 *
                 * The following fields are required:
                 * ```kotlin
                 * .merchants()
                 * ```
                 */
                fun builder() = Builder()
            }

            /** A builder for [MerchantLockParameters]. */
            class Builder internal constructor() {

                private var merchants: JsonField<MutableList<Merchant>>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(merchantLockParameters: MerchantLockParameters) = apply {
                    merchants = merchantLockParameters.merchants.map { it.toMutableList() }
                    additionalProperties =
                        merchantLockParameters.additionalProperties.toMutableMap()
                }

                /**
                 * A list of merchant locks defining specific merchants or groups of merchants
                 * (based on descriptors or IDs) that the lock applies to.
                 */
                fun merchants(merchants: List<Merchant>) = merchants(JsonField.of(merchants))

                /**
                 * Sets [Builder.merchants] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.merchants] with a well-typed `List<Merchant>`
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun merchants(merchants: JsonField<List<Merchant>>) = apply {
                    this.merchants = merchants.map { it.toMutableList() }
                }

                /**
                 * Adds a single [Merchant] to [merchants].
                 *
                 * @throws IllegalStateException if the field was previously set to a non-list.
                 */
                fun addMerchant(merchant: Merchant) = apply {
                    merchants =
                        (merchants ?: JsonField.of(mutableListOf())).also {
                            checkKnown("merchants", it).add(merchant)
                        }
                }

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

                /**
                 * Returns an immutable instance of [MerchantLockParameters].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```kotlin
                 * .merchants()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): MerchantLockParameters =
                    MerchantLockParameters(
                        checkRequired("merchants", merchants).map { it.toImmutable() },
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): MerchantLockParameters = apply {
                if (validated) {
                    return@apply
                }

                merchants().forEach { it.validate() }
                validated = true
            }

            fun isValid(): Boolean =
                try {
                    validate()
                    true
                } catch (e: LithicInvalidDataException) {
                    false
                }

            /**
             * Returns a score indicating how many valid values are contained in this object
             * recursively.
             *
             * Used for best match union deserialization.
             */
            internal fun validity(): Int =
                (merchants.asKnown()?.sumOf { it.validity().toInt() } ?: 0)

            /**
             * Represents a specific merchant lock based on their ID or descriptor. Each merchant
             * object allows transaction rules to work at a granular level and requires at least one
             * of merchant_id or descriptor.
             */
            class Merchant
            private constructor(
                private val comment: JsonField<String>,
                private val descriptor: JsonField<String>,
                private val merchantId: JsonField<String>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("comment")
                    @ExcludeMissing
                    comment: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("descriptor")
                    @ExcludeMissing
                    descriptor: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("merchant_id")
                    @ExcludeMissing
                    merchantId: JsonField<String> = JsonMissing.of(),
                ) : this(comment, descriptor, merchantId, mutableMapOf())

                /**
                 * A comment or explanation about the merchant, used internally for rule management
                 * purposes.
                 *
                 * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g.
                 *   if the server responded with an unexpected value).
                 */
                fun comment(): String? = comment.getNullable("comment")

                /**
                 * Short description of the merchant, often used to provide more human-readable
                 * context about the transaction merchant. This is typically the name or label shown
                 * on transaction summaries.
                 *
                 * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g.
                 *   if the server responded with an unexpected value).
                 */
                fun descriptor(): String? = descriptor.getNullable("descriptor")

                /**
                 * Unique alphanumeric identifier for the payment card acceptor (merchant). This
                 * attribute specifies the merchant entity that will be locked or referenced for
                 * authorization rules.
                 *
                 * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g.
                 *   if the server responded with an unexpected value).
                 */
                fun merchantId(): String? = merchantId.getNullable("merchant_id")

                /**
                 * Returns the raw JSON value of [comment].
                 *
                 * Unlike [comment], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("comment") @ExcludeMissing fun _comment(): JsonField<String> = comment

                /**
                 * Returns the raw JSON value of [descriptor].
                 *
                 * Unlike [descriptor], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("descriptor")
                @ExcludeMissing
                fun _descriptor(): JsonField<String> = descriptor

                /**
                 * Returns the raw JSON value of [merchantId].
                 *
                 * Unlike [merchantId], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("merchant_id")
                @ExcludeMissing
                fun _merchantId(): JsonField<String> = merchantId

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

                    /** Returns a mutable builder for constructing an instance of [Merchant]. */
                    fun builder() = Builder()
                }

                /** A builder for [Merchant]. */
                class Builder internal constructor() {

                    private var comment: JsonField<String> = JsonMissing.of()
                    private var descriptor: JsonField<String> = JsonMissing.of()
                    private var merchantId: JsonField<String> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    internal fun from(merchant: Merchant) = apply {
                        comment = merchant.comment
                        descriptor = merchant.descriptor
                        merchantId = merchant.merchantId
                        additionalProperties = merchant.additionalProperties.toMutableMap()
                    }

                    /**
                     * A comment or explanation about the merchant, used internally for rule
                     * management purposes.
                     */
                    fun comment(comment: String) = comment(JsonField.of(comment))

                    /**
                     * Sets [Builder.comment] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.comment] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun comment(comment: JsonField<String>) = apply { this.comment = comment }

                    /**
                     * Short description of the merchant, often used to provide more human-readable
                     * context about the transaction merchant. This is typically the name or label
                     * shown on transaction summaries.
                     */
                    fun descriptor(descriptor: String) = descriptor(JsonField.of(descriptor))

                    /**
                     * Sets [Builder.descriptor] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.descriptor] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun descriptor(descriptor: JsonField<String>) = apply {
                        this.descriptor = descriptor
                    }

                    /**
                     * Unique alphanumeric identifier for the payment card acceptor (merchant). This
                     * attribute specifies the merchant entity that will be locked or referenced for
                     * authorization rules.
                     */
                    fun merchantId(merchantId: String) = merchantId(JsonField.of(merchantId))

                    /**
                     * Sets [Builder.merchantId] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.merchantId] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun merchantId(merchantId: JsonField<String>) = apply {
                        this.merchantId = merchantId
                    }

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

                    /**
                     * Returns an immutable instance of [Merchant].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     */
                    fun build(): Merchant =
                        Merchant(
                            comment,
                            descriptor,
                            merchantId,
                            additionalProperties.toMutableMap(),
                        )
                }

                private var validated: Boolean = false

                fun validate(): Merchant = apply {
                    if (validated) {
                        return@apply
                    }

                    comment()
                    descriptor()
                    merchantId()
                    validated = true
                }

                fun isValid(): Boolean =
                    try {
                        validate()
                        true
                    } catch (e: LithicInvalidDataException) {
                        false
                    }

                /**
                 * Returns a score indicating how many valid values are contained in this object
                 * recursively.
                 *
                 * Used for best match union deserialization.
                 */
                internal fun validity(): Int =
                    (if (comment.asKnown() == null) 0 else 1) +
                        (if (descriptor.asKnown() == null) 0 else 1) +
                        (if (merchantId.asKnown() == null) 0 else 1)

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is Merchant && comment == other.comment && descriptor == other.descriptor && merchantId == other.merchantId && additionalProperties == other.additionalProperties /* spotless:on */
                }

                /* spotless:off */
                private val hashCode: Int by lazy { Objects.hash(comment, descriptor, merchantId, additionalProperties) }
                /* spotless:on */

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "Merchant{comment=$comment, descriptor=$descriptor, merchantId=$merchantId, additionalProperties=$additionalProperties}"
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is MerchantLockParameters && merchants == other.merchants && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(merchants, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "MerchantLockParameters{merchants=$merchants, additionalProperties=$additionalProperties}"
        }

        class Conditional3dsActionParameters
        private constructor(
            private val action: JsonField<Action>,
            private val conditions: JsonField<List<Condition>>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("action")
                @ExcludeMissing
                action: JsonField<Action> = JsonMissing.of(),
                @JsonProperty("conditions")
                @ExcludeMissing
                conditions: JsonField<List<Condition>> = JsonMissing.of(),
            ) : this(action, conditions, mutableMapOf())

            /**
             * The action to take if the conditions are met.
             *
             * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun action(): Action = action.getRequired("action")

            /**
             * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun conditions(): List<Condition> = conditions.getRequired("conditions")

            /**
             * Returns the raw JSON value of [action].
             *
             * Unlike [action], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("action") @ExcludeMissing fun _action(): JsonField<Action> = action

            /**
             * Returns the raw JSON value of [conditions].
             *
             * Unlike [conditions], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("conditions")
            @ExcludeMissing
            fun _conditions(): JsonField<List<Condition>> = conditions

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

                /**
                 * Returns a mutable builder for constructing an instance of
                 * [Conditional3dsActionParameters].
                 *
                 * The following fields are required:
                 * ```kotlin
                 * .action()
                 * .conditions()
                 * ```
                 */
                fun builder() = Builder()
            }

            /** A builder for [Conditional3dsActionParameters]. */
            class Builder internal constructor() {

                private var action: JsonField<Action>? = null
                private var conditions: JsonField<MutableList<Condition>>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(conditional3dsActionParameters: Conditional3dsActionParameters) =
                    apply {
                        action = conditional3dsActionParameters.action
                        conditions =
                            conditional3dsActionParameters.conditions.map { it.toMutableList() }
                        additionalProperties =
                            conditional3dsActionParameters.additionalProperties.toMutableMap()
                    }

                /** The action to take if the conditions are met. */
                fun action(action: Action) = action(JsonField.of(action))

                /**
                 * Sets [Builder.action] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.action] with a well-typed [Action] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun action(action: JsonField<Action>) = apply { this.action = action }

                fun conditions(conditions: List<Condition>) = conditions(JsonField.of(conditions))

                /**
                 * Sets [Builder.conditions] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.conditions] with a well-typed `List<Condition>`
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun conditions(conditions: JsonField<List<Condition>>) = apply {
                    this.conditions = conditions.map { it.toMutableList() }
                }

                /**
                 * Adds a single [Condition] to [conditions].
                 *
                 * @throws IllegalStateException if the field was previously set to a non-list.
                 */
                fun addCondition(condition: Condition) = apply {
                    conditions =
                        (conditions ?: JsonField.of(mutableListOf())).also {
                            checkKnown("conditions", it).add(condition)
                        }
                }

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

                /**
                 * Returns an immutable instance of [Conditional3dsActionParameters].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```kotlin
                 * .action()
                 * .conditions()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): Conditional3dsActionParameters =
                    Conditional3dsActionParameters(
                        checkRequired("action", action),
                        checkRequired("conditions", conditions).map { it.toImmutable() },
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): Conditional3dsActionParameters = apply {
                if (validated) {
                    return@apply
                }

                action().validate()
                conditions().forEach { it.validate() }
                validated = true
            }

            fun isValid(): Boolean =
                try {
                    validate()
                    true
                } catch (e: LithicInvalidDataException) {
                    false
                }

            /**
             * Returns a score indicating how many valid values are contained in this object
             * recursively.
             *
             * Used for best match union deserialization.
             */
            internal fun validity(): Int =
                (action.asKnown()?.validity() ?: 0) +
                    (conditions.asKnown()?.sumOf { it.validity().toInt() } ?: 0)

            /** The action to take if the conditions are met. */
            class Action @JsonCreator private constructor(private val value: JsonField<String>) :
                Enum {

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

                    val DECLINE = of("DECLINE")

                    val CHALLENGE = of("CHALLENGE")

                    fun of(value: String) = Action(JsonField.of(value))
                }

                /** An enum containing [Action]'s known values. */
                enum class Known {
                    DECLINE,
                    CHALLENGE,
                }

                /**
                 * An enum containing [Action]'s known values, as well as an [_UNKNOWN] member.
                 *
                 * An instance of [Action] can contain an unknown value in a couple of cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    DECLINE,
                    CHALLENGE,
                    /**
                     * An enum member indicating that [Action] was instantiated with an unknown
                     * value.
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
                        DECLINE -> Value.DECLINE
                        CHALLENGE -> Value.CHALLENGE
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
                        DECLINE -> Known.DECLINE
                        CHALLENGE -> Known.CHALLENGE
                        else -> throw LithicInvalidDataException("Unknown Action: $value")
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

                private var validated: Boolean = false

                fun validate(): Action = apply {
                    if (validated) {
                        return@apply
                    }

                    known()
                    validated = true
                }

                fun isValid(): Boolean =
                    try {
                        validate()
                        true
                    } catch (e: LithicInvalidDataException) {
                        false
                    }

                /**
                 * Returns a score indicating how many valid values are contained in this object
                 * recursively.
                 *
                 * Used for best match union deserialization.
                 */
                internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is Action && value == other.value /* spotless:on */
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            class Condition
            private constructor(
                private val attribute: JsonField<Attribute>,
                private val operation: JsonField<Operation>,
                private val value: JsonField<Value>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("attribute")
                    @ExcludeMissing
                    attribute: JsonField<Attribute> = JsonMissing.of(),
                    @JsonProperty("operation")
                    @ExcludeMissing
                    operation: JsonField<Operation> = JsonMissing.of(),
                    @JsonProperty("value")
                    @ExcludeMissing
                    value: JsonField<Value> = JsonMissing.of(),
                ) : this(attribute, operation, value, mutableMapOf())

                /**
                 * The attribute to target.
                 *
                 * The following attributes may be targeted:
                 * - `MCC`: A four-digit number listed in ISO 18245. An MCC is used to classify a
                 *   business by the types of goods or services it provides.
                 * - `COUNTRY`: Country of entity of card acceptor. Possible values are: (1) all ISO
                 *   3166-1 alpha-3 country codes, (2) QZZ for Kosovo, and (3) ANT for Netherlands
                 *   Antilles.
                 * - `CURRENCY`: 3-character alphabetic ISO 4217 code for the merchant currency of
                 *   the transaction.
                 * - `MERCHANT_ID`: Unique alphanumeric identifier for the payment card acceptor
                 *   (merchant).
                 * - `DESCRIPTOR`: Short description of card acceptor.
                 * - `TRANSACTION_AMOUNT`: The base transaction amount (in cents) plus the acquirer
                 *   fee field in the settlement/cardholder billing currency. This is the amount the
                 *   issuer should authorize against unless the issuer is paying the acquirer fee on
                 *   behalf of the cardholder.
                 * - `RISK_SCORE`: Network-provided score assessing risk level associated with a
                 *   given authentication. Scores are on a range of 0-999, with 0 representing the
                 *   lowest risk and 999 representing the highest risk. For Visa transactions, where
                 *   the raw score has a range of 0-99, Lithic will normalize the score by
                 *   multiplying the raw score by 10x.
                 * - `MESSAGE_CATEGORY`: The category of the authentication being processed.
                 *
                 * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g.
                 *   if the server responded with an unexpected value).
                 */
                fun attribute(): Attribute? = attribute.getNullable("attribute")

                /**
                 * The operation to apply to the attribute
                 *
                 * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g.
                 *   if the server responded with an unexpected value).
                 */
                fun operation(): Operation? = operation.getNullable("operation")

                /**
                 * A regex string, to be used with `MATCHES` or `DOES_NOT_MATCH`
                 *
                 * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g.
                 *   if the server responded with an unexpected value).
                 */
                fun value(): Value? = value.getNullable("value")

                /**
                 * Returns the raw JSON value of [attribute].
                 *
                 * Unlike [attribute], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("attribute")
                @ExcludeMissing
                fun _attribute(): JsonField<Attribute> = attribute

                /**
                 * Returns the raw JSON value of [operation].
                 *
                 * Unlike [operation], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("operation")
                @ExcludeMissing
                fun _operation(): JsonField<Operation> = operation

                /**
                 * Returns the raw JSON value of [value].
                 *
                 * Unlike [value], this method doesn't throw if the JSON field has an unexpected
                 * type.
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

                    /** Returns a mutable builder for constructing an instance of [Condition]. */
                    fun builder() = Builder()
                }

                /** A builder for [Condition]. */
                class Builder internal constructor() {

                    private var attribute: JsonField<Attribute> = JsonMissing.of()
                    private var operation: JsonField<Operation> = JsonMissing.of()
                    private var value: JsonField<Value> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    internal fun from(condition: Condition) = apply {
                        attribute = condition.attribute
                        operation = condition.operation
                        value = condition.value
                        additionalProperties = condition.additionalProperties.toMutableMap()
                    }

                    /**
                     * The attribute to target.
                     *
                     * The following attributes may be targeted:
                     * - `MCC`: A four-digit number listed in ISO 18245. An MCC is used to classify
                     *   a business by the types of goods or services it provides.
                     * - `COUNTRY`: Country of entity of card acceptor. Possible values are: (1) all
                     *   ISO 3166-1 alpha-3 country codes, (2) QZZ for Kosovo, and (3) ANT for
                     *   Netherlands Antilles.
                     * - `CURRENCY`: 3-character alphabetic ISO 4217 code for the merchant currency
                     *   of the transaction.
                     * - `MERCHANT_ID`: Unique alphanumeric identifier for the payment card acceptor
                     *   (merchant).
                     * - `DESCRIPTOR`: Short description of card acceptor.
                     * - `TRANSACTION_AMOUNT`: The base transaction amount (in cents) plus the
                     *   acquirer fee field in the settlement/cardholder billing currency. This is
                     *   the amount the issuer should authorize against unless the issuer is paying
                     *   the acquirer fee on behalf of the cardholder.
                     * - `RISK_SCORE`: Network-provided score assessing risk level associated with a
                     *   given authentication. Scores are on a range of 0-999, with 0 representing
                     *   the lowest risk and 999 representing the highest risk. For Visa
                     *   transactions, where the raw score has a range of 0-99, Lithic will
                     *   normalize the score by multiplying the raw score by 10x.
                     * - `MESSAGE_CATEGORY`: The category of the authentication being processed.
                     */
                    fun attribute(attribute: Attribute) = attribute(JsonField.of(attribute))

                    /**
                     * Sets [Builder.attribute] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.attribute] with a well-typed [Attribute]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun attribute(attribute: JsonField<Attribute>) = apply {
                        this.attribute = attribute
                    }

                    /** The operation to apply to the attribute */
                    fun operation(operation: Operation) = operation(JsonField.of(operation))

                    /**
                     * Sets [Builder.operation] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.operation] with a well-typed [Operation]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun operation(operation: JsonField<Operation>) = apply {
                        this.operation = operation
                    }

                    /** A regex string, to be used with `MATCHES` or `DOES_NOT_MATCH` */
                    fun value(value: Value) = value(JsonField.of(value))

                    /**
                     * Sets [Builder.value] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.value] with a well-typed [Value] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
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

                    /**
                     * Returns an immutable instance of [Condition].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     */
                    fun build(): Condition =
                        Condition(attribute, operation, value, additionalProperties.toMutableMap())
                }

                private var validated: Boolean = false

                fun validate(): Condition = apply {
                    if (validated) {
                        return@apply
                    }

                    attribute()?.validate()
                    operation()?.validate()
                    value()?.validate()
                    validated = true
                }

                fun isValid(): Boolean =
                    try {
                        validate()
                        true
                    } catch (e: LithicInvalidDataException) {
                        false
                    }

                /**
                 * Returns a score indicating how many valid values are contained in this object
                 * recursively.
                 *
                 * Used for best match union deserialization.
                 */
                internal fun validity(): Int =
                    (attribute.asKnown()?.validity() ?: 0) +
                        (operation.asKnown()?.validity() ?: 0) +
                        (value.asKnown()?.validity() ?: 0)

                /**
                 * The attribute to target.
                 *
                 * The following attributes may be targeted:
                 * - `MCC`: A four-digit number listed in ISO 18245. An MCC is used to classify a
                 *   business by the types of goods or services it provides.
                 * - `COUNTRY`: Country of entity of card acceptor. Possible values are: (1) all ISO
                 *   3166-1 alpha-3 country codes, (2) QZZ for Kosovo, and (3) ANT for Netherlands
                 *   Antilles.
                 * - `CURRENCY`: 3-character alphabetic ISO 4217 code for the merchant currency of
                 *   the transaction.
                 * - `MERCHANT_ID`: Unique alphanumeric identifier for the payment card acceptor
                 *   (merchant).
                 * - `DESCRIPTOR`: Short description of card acceptor.
                 * - `TRANSACTION_AMOUNT`: The base transaction amount (in cents) plus the acquirer
                 *   fee field in the settlement/cardholder billing currency. This is the amount the
                 *   issuer should authorize against unless the issuer is paying the acquirer fee on
                 *   behalf of the cardholder.
                 * - `RISK_SCORE`: Network-provided score assessing risk level associated with a
                 *   given authentication. Scores are on a range of 0-999, with 0 representing the
                 *   lowest risk and 999 representing the highest risk. For Visa transactions, where
                 *   the raw score has a range of 0-99, Lithic will normalize the score by
                 *   multiplying the raw score by 10x.
                 * - `MESSAGE_CATEGORY`: The category of the authentication being processed.
                 */
                class Attribute
                @JsonCreator
                private constructor(private val value: JsonField<String>) : Enum {

                    /**
                     * Returns this class instance's raw value.
                     *
                     * This is usually only useful if this instance was deserialized from data that
                     * doesn't match any known member, and you want to know that value. For example,
                     * if the SDK is on an older version than the API, then the API may respond with
                     * new members that the SDK is unaware of.
                     */
                    @com.fasterxml.jackson.annotation.JsonValue
                    fun _value(): JsonField<String> = value

                    companion object {

                        val MCC = of("MCC")

                        val COUNTRY = of("COUNTRY")

                        val CURRENCY = of("CURRENCY")

                        val MERCHANT_ID = of("MERCHANT_ID")

                        val DESCRIPTOR = of("DESCRIPTOR")

                        val TRANSACTION_AMOUNT = of("TRANSACTION_AMOUNT")

                        val RISK_SCORE = of("RISK_SCORE")

                        val MESSAGE_CATEGORY = of("MESSAGE_CATEGORY")

                        fun of(value: String) = Attribute(JsonField.of(value))
                    }

                    /** An enum containing [Attribute]'s known values. */
                    enum class Known {
                        MCC,
                        COUNTRY,
                        CURRENCY,
                        MERCHANT_ID,
                        DESCRIPTOR,
                        TRANSACTION_AMOUNT,
                        RISK_SCORE,
                        MESSAGE_CATEGORY,
                    }

                    /**
                     * An enum containing [Attribute]'s known values, as well as an [_UNKNOWN]
                     * member.
                     *
                     * An instance of [Attribute] can contain an unknown value in a couple of cases:
                     * - It was deserialized from data that doesn't match any known member. For
                     *   example, if the SDK is on an older version than the API, then the API may
                     *   respond with new members that the SDK is unaware of.
                     * - It was constructed with an arbitrary value using the [of] method.
                     */
                    enum class Value {
                        MCC,
                        COUNTRY,
                        CURRENCY,
                        MERCHANT_ID,
                        DESCRIPTOR,
                        TRANSACTION_AMOUNT,
                        RISK_SCORE,
                        MESSAGE_CATEGORY,
                        /**
                         * An enum member indicating that [Attribute] was instantiated with an
                         * unknown value.
                         */
                        _UNKNOWN,
                    }

                    /**
                     * Returns an enum member corresponding to this class instance's value, or
                     * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                     *
                     * Use the [known] method instead if you're certain the value is always known or
                     * if you want to throw for the unknown case.
                     */
                    fun value(): Value =
                        when (this) {
                            MCC -> Value.MCC
                            COUNTRY -> Value.COUNTRY
                            CURRENCY -> Value.CURRENCY
                            MERCHANT_ID -> Value.MERCHANT_ID
                            DESCRIPTOR -> Value.DESCRIPTOR
                            TRANSACTION_AMOUNT -> Value.TRANSACTION_AMOUNT
                            RISK_SCORE -> Value.RISK_SCORE
                            MESSAGE_CATEGORY -> Value.MESSAGE_CATEGORY
                            else -> Value._UNKNOWN
                        }

                    /**
                     * Returns an enum member corresponding to this class instance's value.
                     *
                     * Use the [value] method instead if you're uncertain the value is always known
                     * and don't want to throw for the unknown case.
                     *
                     * @throws LithicInvalidDataException if this class instance's value is a not a
                     *   known member.
                     */
                    fun known(): Known =
                        when (this) {
                            MCC -> Known.MCC
                            COUNTRY -> Known.COUNTRY
                            CURRENCY -> Known.CURRENCY
                            MERCHANT_ID -> Known.MERCHANT_ID
                            DESCRIPTOR -> Known.DESCRIPTOR
                            TRANSACTION_AMOUNT -> Known.TRANSACTION_AMOUNT
                            RISK_SCORE -> Known.RISK_SCORE
                            MESSAGE_CATEGORY -> Known.MESSAGE_CATEGORY
                            else -> throw LithicInvalidDataException("Unknown Attribute: $value")
                        }

                    /**
                     * Returns this class instance's primitive wire representation.
                     *
                     * This differs from the [toString] method because that method is primarily for
                     * debugging and generally doesn't throw.
                     *
                     * @throws LithicInvalidDataException if this class instance's value does not
                     *   have the expected primitive type.
                     */
                    fun asString(): String =
                        _value().asString()
                            ?: throw LithicInvalidDataException("Value is not a String")

                    private var validated: Boolean = false

                    fun validate(): Attribute = apply {
                        if (validated) {
                            return@apply
                        }

                        known()
                        validated = true
                    }

                    fun isValid(): Boolean =
                        try {
                            validate()
                            true
                        } catch (e: LithicInvalidDataException) {
                            false
                        }

                    /**
                     * Returns a score indicating how many valid values are contained in this object
                     * recursively.
                     *
                     * Used for best match union deserialization.
                     */
                    internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return /* spotless:off */ other is Attribute && value == other.value /* spotless:on */
                    }

                    override fun hashCode() = value.hashCode()

                    override fun toString() = value.toString()
                }

                /** The operation to apply to the attribute */
                class Operation
                @JsonCreator
                private constructor(private val value: JsonField<String>) : Enum {

                    /**
                     * Returns this class instance's raw value.
                     *
                     * This is usually only useful if this instance was deserialized from data that
                     * doesn't match any known member, and you want to know that value. For example,
                     * if the SDK is on an older version than the API, then the API may respond with
                     * new members that the SDK is unaware of.
                     */
                    @com.fasterxml.jackson.annotation.JsonValue
                    fun _value(): JsonField<String> = value

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
                     * An enum containing [Operation]'s known values, as well as an [_UNKNOWN]
                     * member.
                     *
                     * An instance of [Operation] can contain an unknown value in a couple of cases:
                     * - It was deserialized from data that doesn't match any known member. For
                     *   example, if the SDK is on an older version than the API, then the API may
                     *   respond with new members that the SDK is unaware of.
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
                         * An enum member indicating that [Operation] was instantiated with an
                         * unknown value.
                         */
                        _UNKNOWN,
                    }

                    /**
                     * Returns an enum member corresponding to this class instance's value, or
                     * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                     *
                     * Use the [known] method instead if you're certain the value is always known or
                     * if you want to throw for the unknown case.
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
                     * Use the [value] method instead if you're uncertain the value is always known
                     * and don't want to throw for the unknown case.
                     *
                     * @throws LithicInvalidDataException if this class instance's value is a not a
                     *   known member.
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
                     * This differs from the [toString] method because that method is primarily for
                     * debugging and generally doesn't throw.
                     *
                     * @throws LithicInvalidDataException if this class instance's value does not
                     *   have the expected primitive type.
                     */
                    fun asString(): String =
                        _value().asString()
                            ?: throw LithicInvalidDataException("Value is not a String")

                    private var validated: Boolean = false

                    fun validate(): Operation = apply {
                        if (validated) {
                            return@apply
                        }

                        known()
                        validated = true
                    }

                    fun isValid(): Boolean =
                        try {
                            validate()
                            true
                        } catch (e: LithicInvalidDataException) {
                            false
                        }

                    /**
                     * Returns a score indicating how many valid values are contained in this object
                     * recursively.
                     *
                     * Used for best match union deserialization.
                     */
                    internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

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

                    fun <T> accept(visitor: Visitor<T>): T =
                        when {
                            regex != null -> visitor.visitRegex(regex)
                            number != null -> visitor.visitNumber(number)
                            listOfStrings != null -> visitor.visitListOfStrings(listOfStrings)
                            else -> visitor.unknown(_json)
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

                    fun isValid(): Boolean =
                        try {
                            validate()
                            true
                        } catch (e: LithicInvalidDataException) {
                            false
                        }

                    /**
                     * Returns a score indicating how many valid values are contained in this object
                     * recursively.
                     *
                     * Used for best match union deserialization.
                     */
                    internal fun validity(): Int =
                        accept(
                            object : Visitor<Int> {
                                override fun visitRegex(regex: String) = 1

                                override fun visitNumber(number: Long) = 1

                                override fun visitListOfStrings(listOfStrings: List<String>) =
                                    listOfStrings.size

                                override fun unknown(json: JsonValue?) = 0
                            }
                        )

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
                        fun ofListOfStrings(listOfStrings: List<String>) =
                            Value(listOfStrings = listOfStrings)
                    }

                    /**
                     * An interface that defines how to map each variant of [Value] to a value of
                     * type [T].
                     */
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
                         * An instance of [Value] can contain an unknown variant if it was
                         * deserialized from data that doesn't match any known variant. For example,
                         * if the SDK is on an older version than the API, then the API may respond
                         * with new variants that the SDK is unaware of.
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

                            val bestMatches =
                                sequenceOf(
                                        tryDeserialize(node, jacksonTypeRef<String>())?.let {
                                            Value(regex = it, _json = json)
                                        },
                                        tryDeserialize(node, jacksonTypeRef<Long>())?.let {
                                            Value(number = it, _json = json)
                                        },
                                        tryDeserialize(node, jacksonTypeRef<List<String>>())?.let {
                                            Value(listOfStrings = it, _json = json)
                                        },
                                    )
                                    .filterNotNull()
                                    .allMaxBy { it.validity() }
                                    .toList()
                            return when (bestMatches.size) {
                                // This can happen if what we're deserializing is completely
                                // incompatible with all the possible variants (e.g. deserializing
                                // from object).
                                0 -> Value(_json = json)
                                1 -> bestMatches.single()
                                // If there's more than one match with the highest validity, then
                                // use the first completely valid match, or simply the first match
                                // if none are completely valid.
                                else ->
                                    bestMatches.firstOrNull { it.isValid() } ?: bestMatches.first()
                            }
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
                                value.listOfStrings != null ->
                                    generator.writeObject(value.listOfStrings)
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

                    return /* spotless:off */ other is Condition && attribute == other.attribute && operation == other.operation && value == other.value && additionalProperties == other.additionalProperties /* spotless:on */
                }

                /* spotless:off */
                private val hashCode: Int by lazy { Objects.hash(attribute, operation, value, additionalProperties) }
                /* spotless:on */

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "Condition{attribute=$attribute, operation=$operation, value=$value, additionalProperties=$additionalProperties}"
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is Conditional3dsActionParameters && action == other.action && conditions == other.conditions && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(action, conditions, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Conditional3dsActionParameters{action=$action, conditions=$conditions, additionalProperties=$additionalProperties}"
        }
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is AuthRuleV2DraftParams && authRuleToken == other.authRuleToken && body == other.body && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(authRuleToken, body, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() =
        "AuthRuleV2DraftParams{authRuleToken=$authRuleToken, body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
