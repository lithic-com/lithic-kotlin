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
import com.lithic.api.core.ExcludeMissing
import com.lithic.api.core.JsonField
import com.lithic.api.core.JsonMissing
import com.lithic.api.core.JsonValue
import com.lithic.api.core.NoAutoDetect
import com.lithic.api.core.Params
import com.lithic.api.core.checkRequired
import com.lithic.api.core.getOrThrow
import com.lithic.api.core.http.Headers
import com.lithic.api.core.http.QueryParams
import com.lithic.api.core.immutableEmptyMap
import com.lithic.api.core.toImmutable
import com.lithic.api.errors.LithicInvalidDataException
import java.util.Objects

/**
 * Creates a new draft version of a rule that will be ran in shadow mode.
 *
 * This can also be utilized to reset the draft parameters, causing a draft version to no longer be
 * ran in shadow mode.
 */
class AuthRuleV2DraftParams
private constructor(
    private val authRuleToken: String,
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun authRuleToken(): String = authRuleToken

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

    internal fun _body(): Body = body

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    fun getPathParam(index: Int): String {
        return when (index) {
            0 -> authRuleToken
            else -> ""
        }
    }

    @NoAutoDetect
    class Body
    @JsonCreator
    private constructor(
        @JsonProperty("parameters")
        @ExcludeMissing
        private val parameters: JsonField<Parameters> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

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

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            parameters()?.validate()
            validated = true
        }

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

            fun build(): Body = Body(parameters, additionalProperties.toImmutable())
        }

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

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [AuthRuleV2DraftParams].
         *
         * The following fields are required:
         * ```kotlin
         * .authRuleToken()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [AuthRuleV2DraftParams]. */
    @NoAutoDetect
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

        fun authRuleToken(authRuleToken: String) = apply { this.authRuleToken = authRuleToken }

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

        fun build(): AuthRuleV2DraftParams =
            AuthRuleV2DraftParams(
                checkRequired("authRuleToken", authRuleToken),
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
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
                velocityLimitParams != null -> visitor.visitVelocityLimitParams(velocityLimitParams)
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
         * An interface that defines how to map each variant of [Parameters] to a value of type [T].
         */
        interface Visitor<out T> {

            fun visitConditionalBlock(conditionalBlock: ConditionalBlockParameters): T

            fun visitVelocityLimitParams(velocityLimitParams: VelocityLimitParams): T

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

                tryDeserialize(node, jacksonTypeRef<ConditionalBlockParameters>()) { it.validate() }
                    ?.let {
                        return Parameters(conditionalBlock = it, _json = json)
                    }
                tryDeserialize(node, jacksonTypeRef<VelocityLimitParams>()) { it.validate() }
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
                    value.conditionalBlock != null -> generator.writeObject(value.conditionalBlock)
                    value.velocityLimitParams != null ->
                        generator.writeObject(value.velocityLimitParams)
                    value._json != null -> generator.writeObject(value._json)
                    else -> throw IllegalStateException("Invalid Parameters")
                }
            }
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
