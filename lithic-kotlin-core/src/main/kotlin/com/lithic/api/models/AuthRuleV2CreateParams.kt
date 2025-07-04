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

/** Creates a new V2 Auth rule in draft mode */
class AuthRuleV2CreateParams
private constructor(
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun body(): Body = body

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

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

        /**
         * Returns an immutable instance of [AuthRuleV2CreateParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```kotlin
         * .body()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): AuthRuleV2CreateParams =
            AuthRuleV2CreateParams(
                checkRequired("body", body),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): Body = body

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

        fun <T> accept(visitor: Visitor<T>): T =
            when {
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
                    override fun visitCreateAuthRuleRequestAccountTokens(
                        createAuthRuleRequestAccountTokens: CreateAuthRuleRequestAccountTokens
                    ) = createAuthRuleRequestAccountTokens.validity()

                    override fun visitCreateAuthRuleRequestCardTokens(
                        createAuthRuleRequestCardTokens: CreateAuthRuleRequestCardTokens
                    ) = createAuthRuleRequestCardTokens.validity()

                    override fun visitCreateAuthRuleRequestProgramLevel(
                        createAuthRuleRequestProgramLevel: CreateAuthRuleRequestProgramLevel
                    ) = createAuthRuleRequestProgramLevel.validity()

                    override fun unknown(json: JsonValue?) = 0
                }
            )

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

                val bestMatches =
                    sequenceOf(
                            tryDeserialize(
                                    node,
                                    jacksonTypeRef<CreateAuthRuleRequestAccountTokens>(),
                                )
                                ?.let {
                                    Body(createAuthRuleRequestAccountTokens = it, _json = json)
                                },
                            tryDeserialize(node, jacksonTypeRef<CreateAuthRuleRequestCardTokens>())
                                ?.let { Body(createAuthRuleRequestCardTokens = it, _json = json) },
                            tryDeserialize(
                                    node,
                                    jacksonTypeRef<CreateAuthRuleRequestProgramLevel>(),
                                )
                                ?.let { Body(createAuthRuleRequestProgramLevel = it, _json = json) },
                        )
                        .filterNotNull()
                        .allMaxBy { it.validity() }
                        .toList()
                return when (bestMatches.size) {
                    // This can happen if what we're deserializing is completely incompatible with
                    // all the possible variants (e.g. deserializing from boolean).
                    0 -> Body(_json = json)
                    1 -> bestMatches.single()
                    // If there's more than one match with the highest validity, then use the first
                    // completely valid match, or simply the first match if none are completely
                    // valid.
                    else -> bestMatches.firstOrNull { it.isValid() } ?: bestMatches.first()
                }
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

        class CreateAuthRuleRequestAccountTokens
        private constructor(
            private val accountTokens: JsonField<List<String>>,
            private val name: JsonField<String>,
            private val parameters: JsonField<Parameters>,
            private val type: JsonField<AuthRuleType>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("account_tokens")
                @ExcludeMissing
                accountTokens: JsonField<List<String>> = JsonMissing.of(),
                @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
                @JsonProperty("parameters")
                @ExcludeMissing
                parameters: JsonField<Parameters> = JsonMissing.of(),
                @JsonProperty("type")
                @ExcludeMissing
                type: JsonField<AuthRuleType> = JsonMissing.of(),
            ) : this(accountTokens, name, parameters, type, mutableMapOf())

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
             * The type of Auth Rule. Effectively determines the event stream during which it will
             * be evaluated.
             * - `CONDITIONAL_BLOCK`: AUTHORIZATION event stream.
             * - `VELOCITY_LIMIT`: AUTHORIZATION event stream.
             * - `MERCHANT_LOCK`: AUTHORIZATION event stream.
             * - `CONDITIONAL_3DS_ACTION`: THREE_DS_AUTHENTICATION event stream.
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

                /**
                 * Alias for calling [parameters] with `Parameters.ofMerchantLock(merchantLock)`.
                 */
                fun parameters(merchantLock: Parameters.MerchantLockParameters) =
                    parameters(Parameters.ofMerchantLock(merchantLock))

                /**
                 * Alias for calling [parameters] with
                 * `Parameters.ofConditional3dsAction(conditional3dsAction)`.
                 */
                fun parameters(conditional3dsAction: Parameters.Conditional3dsActionParameters) =
                    parameters(Parameters.ofConditional3dsAction(conditional3dsAction))

                /**
                 * The type of Auth Rule. Effectively determines the event stream during which it
                 * will be evaluated.
                 * - `CONDITIONAL_BLOCK`: AUTHORIZATION event stream.
                 * - `VELOCITY_LIMIT`: AUTHORIZATION event stream.
                 * - `MERCHANT_LOCK`: AUTHORIZATION event stream.
                 * - `CONDITIONAL_3DS_ACTION`: THREE_DS_AUTHENTICATION event stream.
                 */
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

                /**
                 * Returns an immutable instance of [CreateAuthRuleRequestAccountTokens].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```kotlin
                 * .accountTokens()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): CreateAuthRuleRequestAccountTokens =
                    CreateAuthRuleRequestAccountTokens(
                        checkRequired("accountTokens", accountTokens).map { it.toImmutable() },
                        name,
                        parameters,
                        type,
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): CreateAuthRuleRequestAccountTokens = apply {
                if (validated) {
                    return@apply
                }

                accountTokens()
                name()
                parameters()?.validate()
                type()?.validate()
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
                (accountTokens.asKnown()?.size ?: 0) +
                    (if (name.asKnown() == null) 0 else 1) +
                    (parameters.asKnown()?.validity() ?: 0) +
                    (type.asKnown()?.validity() ?: 0)

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

                fun asMerchantLock(): MerchantLockParameters =
                    merchantLock.getOrThrow("merchantLock")

                fun asConditional3dsAction(): Conditional3dsActionParameters =
                    conditional3dsAction.getOrThrow("conditional3dsAction")

                fun _json(): JsonValue? = _json

                fun <T> accept(visitor: Visitor<T>): T =
                    when {
                        conditionalBlock != null -> visitor.visitConditionalBlock(conditionalBlock)
                        velocityLimitParams != null ->
                            visitor.visitVelocityLimitParams(velocityLimitParams)
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

                    fun ofConditional3dsAction(
                        conditional3dsAction: Conditional3dsActionParameters
                    ) = Parameters(conditional3dsAction = conditional3dsAction)
                }

                /**
                 * An interface that defines how to map each variant of [Parameters] to a value of
                 * type [T].
                 */
                interface Visitor<out T> {

                    fun visitConditionalBlock(conditionalBlock: ConditionalBlockParameters): T

                    fun visitVelocityLimitParams(velocityLimitParams: VelocityLimitParams): T

                    fun visitMerchantLock(merchantLock: MerchantLockParameters): T

                    fun visitConditional3dsAction(
                        conditional3dsAction: Conditional3dsActionParameters
                    ): T

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

                        val bestMatches =
                            sequenceOf(
                                    tryDeserialize(
                                            node,
                                            jacksonTypeRef<ConditionalBlockParameters>(),
                                        )
                                        ?.let { Parameters(conditionalBlock = it, _json = json) },
                                    tryDeserialize(node, jacksonTypeRef<VelocityLimitParams>())
                                        ?.let {
                                            Parameters(velocityLimitParams = it, _json = json)
                                        },
                                    tryDeserialize(node, jacksonTypeRef<MerchantLockParameters>())
                                        ?.let { Parameters(merchantLock = it, _json = json) },
                                    tryDeserialize(
                                            node,
                                            jacksonTypeRef<Conditional3dsActionParameters>(),
                                        )
                                        ?.let {
                                            Parameters(conditional3dsAction = it, _json = json)
                                        },
                                )
                                .filterNotNull()
                                .allMaxBy { it.validity() }
                                .toList()
                        return when (bestMatches.size) {
                            // This can happen if what we're deserializing is completely
                            // incompatible with all the possible variants (e.g. deserializing from
                            // boolean).
                            0 -> Parameters(_json = json)
                            1 -> bestMatches.single()
                            // If there's more than one match with the highest validity, then use
                            // the first completely valid match, or simply the first match if none
                            // are completely valid.
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
                            value.conditionalBlock != null ->
                                generator.writeObject(value.conditionalBlock)
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
                     * A list of merchant locks defining specific merchants or groups of merchants
                     * (based on descriptors or IDs) that the lock applies to.
                     *
                     * @throws LithicInvalidDataException if the JSON field has an unexpected type
                     *   or is unexpectedly missing or null (e.g. if the server responded with an
                     *   unexpected value).
                     */
                    fun merchants(): List<Merchant> = merchants.getRequired("merchants")

                    /**
                     * Returns the raw JSON value of [merchants].
                     *
                     * Unlike [merchants], this method doesn't throw if the JSON field has an
                     * unexpected type.
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
                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        internal fun from(merchantLockParameters: MerchantLockParameters) = apply {
                            merchants = merchantLockParameters.merchants.map { it.toMutableList() }
                            additionalProperties =
                                merchantLockParameters.additionalProperties.toMutableMap()
                        }

                        /**
                         * A list of merchant locks defining specific merchants or groups of
                         * merchants (based on descriptors or IDs) that the lock applies to.
                         */
                        fun merchants(merchants: List<Merchant>) =
                            merchants(JsonField.of(merchants))

                        /**
                         * Sets [Builder.merchants] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.merchants] with a well-typed
                         * `List<Merchant>` value instead. This method is primarily for setting the
                         * field to an undocumented or not yet supported value.
                         */
                        fun merchants(merchants: JsonField<List<Merchant>>) = apply {
                            this.merchants = merchants.map { it.toMutableList() }
                        }

                        /**
                         * Adds a single [Merchant] to [merchants].
                         *
                         * @throws IllegalStateException if the field was previously set to a
                         *   non-list.
                         */
                        fun addMerchant(merchant: Merchant) = apply {
                            merchants =
                                (merchants ?: JsonField.of(mutableListOf())).also {
                                    checkKnown("merchants", it).add(merchant)
                                }
                        }

                        fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                            apply {
                                this.additionalProperties.clear()
                                putAllAdditionalProperties(additionalProperties)
                            }

                        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                            additionalProperties.put(key, value)
                        }

                        fun putAllAdditionalProperties(
                            additionalProperties: Map<String, JsonValue>
                        ) = apply { this.additionalProperties.putAll(additionalProperties) }

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
                     * Represents a specific merchant lock based on their ID or descriptor. Each
                     * merchant object allows transaction rules to work at a granular level and
                     * requires at least one of merchant_id or descriptor.
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
                         * A comment or explanation about the merchant, used internally for rule
                         * management purposes.
                         *
                         * @throws LithicInvalidDataException if the JSON field has an unexpected
                         *   type (e.g. if the server responded with an unexpected value).
                         */
                        fun comment(): String? = comment.getNullable("comment")

                        /**
                         * Short description of the merchant, often used to provide more
                         * human-readable context about the transaction merchant. This is typically
                         * the name or label shown on transaction summaries.
                         *
                         * @throws LithicInvalidDataException if the JSON field has an unexpected
                         *   type (e.g. if the server responded with an unexpected value).
                         */
                        fun descriptor(): String? = descriptor.getNullable("descriptor")

                        /**
                         * Unique alphanumeric identifier for the payment card acceptor (merchant).
                         * This attribute specifies the merchant entity that will be locked or
                         * referenced for authorization rules.
                         *
                         * @throws LithicInvalidDataException if the JSON field has an unexpected
                         *   type (e.g. if the server responded with an unexpected value).
                         */
                        fun merchantId(): String? = merchantId.getNullable("merchant_id")

                        /**
                         * Returns the raw JSON value of [comment].
                         *
                         * Unlike [comment], this method doesn't throw if the JSON field has an
                         * unexpected type.
                         */
                        @JsonProperty("comment")
                        @ExcludeMissing
                        fun _comment(): JsonField<String> = comment

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

                            /**
                             * Returns a mutable builder for constructing an instance of [Merchant].
                             */
                            fun builder() = Builder()
                        }

                        /** A builder for [Merchant]. */
                        class Builder internal constructor() {

                            private var comment: JsonField<String> = JsonMissing.of()
                            private var descriptor: JsonField<String> = JsonMissing.of()
                            private var merchantId: JsonField<String> = JsonMissing.of()
                            private var additionalProperties: MutableMap<String, JsonValue> =
                                mutableMapOf()

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
                             * You should usually call [Builder.comment] with a well-typed [String]
                             * value instead. This method is primarily for setting the field to an
                             * undocumented or not yet supported value.
                             */
                            fun comment(comment: JsonField<String>) = apply {
                                this.comment = comment
                            }

                            /**
                             * Short description of the merchant, often used to provide more
                             * human-readable context about the transaction merchant. This is
                             * typically the name or label shown on transaction summaries.
                             */
                            fun descriptor(descriptor: String) =
                                descriptor(JsonField.of(descriptor))

                            /**
                             * Sets [Builder.descriptor] to an arbitrary JSON value.
                             *
                             * You should usually call [Builder.descriptor] with a well-typed
                             * [String] value instead. This method is primarily for setting the
                             * field to an undocumented or not yet supported value.
                             */
                            fun descriptor(descriptor: JsonField<String>) = apply {
                                this.descriptor = descriptor
                            }

                            /**
                             * Unique alphanumeric identifier for the payment card acceptor
                             * (merchant). This attribute specifies the merchant entity that will be
                             * locked or referenced for authorization rules.
                             */
                            fun merchantId(merchantId: String) =
                                merchantId(JsonField.of(merchantId))

                            /**
                             * Sets [Builder.merchantId] to an arbitrary JSON value.
                             *
                             * You should usually call [Builder.merchantId] with a well-typed
                             * [String] value instead. This method is primarily for setting the
                             * field to an undocumented or not yet supported value.
                             */
                            fun merchantId(merchantId: JsonField<String>) = apply {
                                this.merchantId = merchantId
                            }

                            fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                                apply {
                                    this.additionalProperties.clear()
                                    putAllAdditionalProperties(additionalProperties)
                                }

                            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                                additionalProperties.put(key, value)
                            }

                            fun putAllAdditionalProperties(
                                additionalProperties: Map<String, JsonValue>
                            ) = apply { this.additionalProperties.putAll(additionalProperties) }

                            fun removeAdditionalProperty(key: String) = apply {
                                additionalProperties.remove(key)
                            }

                            fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                                keys.forEach(::removeAdditionalProperty)
                            }

                            /**
                             * Returns an immutable instance of [Merchant].
                             *
                             * Further updates to this [Builder] will not mutate the returned
                             * instance.
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
                         * Returns a score indicating how many valid values are contained in this
                         * object recursively.
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
                     * @throws LithicInvalidDataException if the JSON field has an unexpected type
                     *   or is unexpectedly missing or null (e.g. if the server responded with an
                     *   unexpected value).
                     */
                    fun action(): Action = action.getRequired("action")

                    /**
                     * @throws LithicInvalidDataException if the JSON field has an unexpected type
                     *   or is unexpectedly missing or null (e.g. if the server responded with an
                     *   unexpected value).
                     */
                    fun conditions(): List<Condition> = conditions.getRequired("conditions")

                    /**
                     * Returns the raw JSON value of [action].
                     *
                     * Unlike [action], this method doesn't throw if the JSON field has an
                     * unexpected type.
                     */
                    @JsonProperty("action")
                    @ExcludeMissing
                    fun _action(): JsonField<Action> = action

                    /**
                     * Returns the raw JSON value of [conditions].
                     *
                     * Unlike [conditions], this method doesn't throw if the JSON field has an
                     * unexpected type.
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
                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        internal fun from(
                            conditional3dsActionParameters: Conditional3dsActionParameters
                        ) = apply {
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
                         * instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun action(action: JsonField<Action>) = apply { this.action = action }

                        fun conditions(conditions: List<Condition>) =
                            conditions(JsonField.of(conditions))

                        /**
                         * Sets [Builder.conditions] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.conditions] with a well-typed
                         * `List<Condition>` value instead. This method is primarily for setting the
                         * field to an undocumented or not yet supported value.
                         */
                        fun conditions(conditions: JsonField<List<Condition>>) = apply {
                            this.conditions = conditions.map { it.toMutableList() }
                        }

                        /**
                         * Adds a single [Condition] to [conditions].
                         *
                         * @throws IllegalStateException if the field was previously set to a
                         *   non-list.
                         */
                        fun addCondition(condition: Condition) = apply {
                            conditions =
                                (conditions ?: JsonField.of(mutableListOf())).also {
                                    checkKnown("conditions", it).add(condition)
                                }
                        }

                        fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                            apply {
                                this.additionalProperties.clear()
                                putAllAdditionalProperties(additionalProperties)
                            }

                        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                            additionalProperties.put(key, value)
                        }

                        fun putAllAdditionalProperties(
                            additionalProperties: Map<String, JsonValue>
                        ) = apply { this.additionalProperties.putAll(additionalProperties) }

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
                    class Action
                    @JsonCreator
                    private constructor(private val value: JsonField<String>) : Enum {

                        /**
                         * Returns this class instance's raw value.
                         *
                         * This is usually only useful if this instance was deserialized from data
                         * that doesn't match any known member, and you want to know that value. For
                         * example, if the SDK is on an older version than the API, then the API may
                         * respond with new members that the SDK is unaware of.
                         */
                        @com.fasterxml.jackson.annotation.JsonValue
                        fun _value(): JsonField<String> = value

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
                         * An enum containing [Action]'s known values, as well as an [_UNKNOWN]
                         * member.
                         *
                         * An instance of [Action] can contain an unknown value in a couple of
                         * cases:
                         * - It was deserialized from data that doesn't match any known member. For
                         *   example, if the SDK is on an older version than the API, then the API
                         *   may respond with new members that the SDK is unaware of.
                         * - It was constructed with an arbitrary value using the [of] method.
                         */
                        enum class Value {
                            DECLINE,
                            CHALLENGE,
                            /**
                             * An enum member indicating that [Action] was instantiated with an
                             * unknown value.
                             */
                            _UNKNOWN,
                        }

                        /**
                         * Returns an enum member corresponding to this class instance's value, or
                         * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                         *
                         * Use the [known] method instead if you're certain the value is always
                         * known or if you want to throw for the unknown case.
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
                         * Use the [value] method instead if you're uncertain the value is always
                         * known and don't want to throw for the unknown case.
                         *
                         * @throws LithicInvalidDataException if this class instance's value is a
                         *   not a known member.
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
                         * This differs from the [toString] method because that method is primarily
                         * for debugging and generally doesn't throw.
                         *
                         * @throws LithicInvalidDataException if this class instance's value does
                         *   not have the expected primitive type.
                         */
                        fun asString(): String =
                            _value().asString()
                                ?: throw LithicInvalidDataException("Value is not a String")

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
                         * Returns a score indicating how many valid values are contained in this
                         * object recursively.
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
                         * - `MCC`: A four-digit number listed in ISO 18245. An MCC is used to
                         *   classify a business by the types of goods or services it provides.
                         * - `COUNTRY`: Country of entity of card acceptor. Possible values are: (1)
                         *   all ISO 3166-1 alpha-3 country codes, (2) QZZ for Kosovo, and (3) ANT
                         *   for Netherlands Antilles.
                         * - `CURRENCY`: 3-character alphabetic ISO 4217 code for the merchant
                         *   currency of the transaction.
                         * - `MERCHANT_ID`: Unique alphanumeric identifier for the payment card
                         *   acceptor (merchant).
                         * - `DESCRIPTOR`: Short description of card acceptor.
                         * - `TRANSACTION_AMOUNT`: The base transaction amount (in cents) plus the
                         *   acquirer fee field in the settlement/cardholder billing currency. This
                         *   is the amount the issuer should authorize against unless the issuer is
                         *   paying the acquirer fee on behalf of the cardholder.
                         * - `RISK_SCORE`: Network-provided score assessing risk level associated
                         *   with a given authentication. Scores are on a range of 0-999, with 0
                         *   representing the lowest risk and 999 representing the highest risk. For
                         *   Visa transactions, where the raw score has a range of 0-99, Lithic will
                         *   normalize the score by multiplying the raw score by 10x.
                         * - `MESSAGE_CATEGORY`: The category of the authentication being processed.
                         *
                         * @throws LithicInvalidDataException if the JSON field has an unexpected
                         *   type (e.g. if the server responded with an unexpected value).
                         */
                        fun attribute(): Attribute? = attribute.getNullable("attribute")

                        /**
                         * The operation to apply to the attribute
                         *
                         * @throws LithicInvalidDataException if the JSON field has an unexpected
                         *   type (e.g. if the server responded with an unexpected value).
                         */
                        fun operation(): Operation? = operation.getNullable("operation")

                        /**
                         * A regex string, to be used with `MATCHES` or `DOES_NOT_MATCH`
                         *
                         * @throws LithicInvalidDataException if the JSON field has an unexpected
                         *   type (e.g. if the server responded with an unexpected value).
                         */
                        fun value(): Value? = value.getNullable("value")

                        /**
                         * Returns the raw JSON value of [attribute].
                         *
                         * Unlike [attribute], this method doesn't throw if the JSON field has an
                         * unexpected type.
                         */
                        @JsonProperty("attribute")
                        @ExcludeMissing
                        fun _attribute(): JsonField<Attribute> = attribute

                        /**
                         * Returns the raw JSON value of [operation].
                         *
                         * Unlike [operation], this method doesn't throw if the JSON field has an
                         * unexpected type.
                         */
                        @JsonProperty("operation")
                        @ExcludeMissing
                        fun _operation(): JsonField<Operation> = operation

                        /**
                         * Returns the raw JSON value of [value].
                         *
                         * Unlike [value], this method doesn't throw if the JSON field has an
                         * unexpected type.
                         */
                        @JsonProperty("value")
                        @ExcludeMissing
                        fun _value(): JsonField<Value> = value

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
                             * [Condition].
                             */
                            fun builder() = Builder()
                        }

                        /** A builder for [Condition]. */
                        class Builder internal constructor() {

                            private var attribute: JsonField<Attribute> = JsonMissing.of()
                            private var operation: JsonField<Operation> = JsonMissing.of()
                            private var value: JsonField<Value> = JsonMissing.of()
                            private var additionalProperties: MutableMap<String, JsonValue> =
                                mutableMapOf()

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
                             * - `MCC`: A four-digit number listed in ISO 18245. An MCC is used to
                             *   classify a business by the types of goods or services it provides.
                             * - `COUNTRY`: Country of entity of card acceptor. Possible values are:
                             *   (1) all ISO 3166-1 alpha-3 country codes, (2) QZZ for Kosovo, and
                             *   (3) ANT for Netherlands Antilles.
                             * - `CURRENCY`: 3-character alphabetic ISO 4217 code for the merchant
                             *   currency of the transaction.
                             * - `MERCHANT_ID`: Unique alphanumeric identifier for the payment card
                             *   acceptor (merchant).
                             * - `DESCRIPTOR`: Short description of card acceptor.
                             * - `TRANSACTION_AMOUNT`: The base transaction amount (in cents) plus
                             *   the acquirer fee field in the settlement/cardholder billing
                             *   currency. This is the amount the issuer should authorize against
                             *   unless the issuer is paying the acquirer fee on behalf of the
                             *   cardholder.
                             * - `RISK_SCORE`: Network-provided score assessing risk level
                             *   associated with a given authentication. Scores are on a range of
                             *   0-999, with 0 representing the lowest risk and 999 representing the
                             *   highest risk. For Visa transactions, where the raw score has a
                             *   range of 0-99, Lithic will normalize the score by multiplying the
                             *   raw score by 10x.
                             * - `MESSAGE_CATEGORY`: The category of the authentication being
                             *   processed.
                             */
                            fun attribute(attribute: Attribute) = attribute(JsonField.of(attribute))

                            /**
                             * Sets [Builder.attribute] to an arbitrary JSON value.
                             *
                             * You should usually call [Builder.attribute] with a well-typed
                             * [Attribute] value instead. This method is primarily for setting the
                             * field to an undocumented or not yet supported value.
                             */
                            fun attribute(attribute: JsonField<Attribute>) = apply {
                                this.attribute = attribute
                            }

                            /** The operation to apply to the attribute */
                            fun operation(operation: Operation) = operation(JsonField.of(operation))

                            /**
                             * Sets [Builder.operation] to an arbitrary JSON value.
                             *
                             * You should usually call [Builder.operation] with a well-typed
                             * [Operation] value instead. This method is primarily for setting the
                             * field to an undocumented or not yet supported value.
                             */
                            fun operation(operation: JsonField<Operation>) = apply {
                                this.operation = operation
                            }

                            /** A regex string, to be used with `MATCHES` or `DOES_NOT_MATCH` */
                            fun value(value: Value) = value(JsonField.of(value))

                            /**
                             * Sets [Builder.value] to an arbitrary JSON value.
                             *
                             * You should usually call [Builder.value] with a well-typed [Value]
                             * value instead. This method is primarily for setting the field to an
                             * undocumented or not yet supported value.
                             */
                            fun value(value: JsonField<Value>) = apply { this.value = value }

                            /** Alias for calling [value] with `Value.ofRegex(regex)`. */
                            fun value(regex: String) = value(Value.ofRegex(regex))

                            /** Alias for calling [value] with `Value.ofNumber(number)`. */
                            fun value(number: Long) = value(Value.ofNumber(number))

                            /**
                             * Alias for calling [value] with
                             * `Value.ofListOfStrings(listOfStrings)`.
                             */
                            fun valueOfListOfStrings(listOfStrings: List<String>) =
                                value(Value.ofListOfStrings(listOfStrings))

                            fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                                apply {
                                    this.additionalProperties.clear()
                                    putAllAdditionalProperties(additionalProperties)
                                }

                            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                                additionalProperties.put(key, value)
                            }

                            fun putAllAdditionalProperties(
                                additionalProperties: Map<String, JsonValue>
                            ) = apply { this.additionalProperties.putAll(additionalProperties) }

                            fun removeAdditionalProperty(key: String) = apply {
                                additionalProperties.remove(key)
                            }

                            fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                                keys.forEach(::removeAdditionalProperty)
                            }

                            /**
                             * Returns an immutable instance of [Condition].
                             *
                             * Further updates to this [Builder] will not mutate the returned
                             * instance.
                             */
                            fun build(): Condition =
                                Condition(
                                    attribute,
                                    operation,
                                    value,
                                    additionalProperties.toMutableMap(),
                                )
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
                         * Returns a score indicating how many valid values are contained in this
                         * object recursively.
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
                         * - `MCC`: A four-digit number listed in ISO 18245. An MCC is used to
                         *   classify a business by the types of goods or services it provides.
                         * - `COUNTRY`: Country of entity of card acceptor. Possible values are: (1)
                         *   all ISO 3166-1 alpha-3 country codes, (2) QZZ for Kosovo, and (3) ANT
                         *   for Netherlands Antilles.
                         * - `CURRENCY`: 3-character alphabetic ISO 4217 code for the merchant
                         *   currency of the transaction.
                         * - `MERCHANT_ID`: Unique alphanumeric identifier for the payment card
                         *   acceptor (merchant).
                         * - `DESCRIPTOR`: Short description of card acceptor.
                         * - `TRANSACTION_AMOUNT`: The base transaction amount (in cents) plus the
                         *   acquirer fee field in the settlement/cardholder billing currency. This
                         *   is the amount the issuer should authorize against unless the issuer is
                         *   paying the acquirer fee on behalf of the cardholder.
                         * - `RISK_SCORE`: Network-provided score assessing risk level associated
                         *   with a given authentication. Scores are on a range of 0-999, with 0
                         *   representing the lowest risk and 999 representing the highest risk. For
                         *   Visa transactions, where the raw score has a range of 0-99, Lithic will
                         *   normalize the score by multiplying the raw score by 10x.
                         * - `MESSAGE_CATEGORY`: The category of the authentication being processed.
                         */
                        class Attribute
                        @JsonCreator
                        private constructor(private val value: JsonField<String>) : Enum {

                            /**
                             * Returns this class instance's raw value.
                             *
                             * This is usually only useful if this instance was deserialized from
                             * data that doesn't match any known member, and you want to know that
                             * value. For example, if the SDK is on an older version than the API,
                             * then the API may respond with new members that the SDK is unaware of.
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
                             * An enum containing [Attribute]'s known values, as well as an
                             * [_UNKNOWN] member.
                             *
                             * An instance of [Attribute] can contain an unknown value in a couple
                             * of cases:
                             * - It was deserialized from data that doesn't match any known member.
                             *   For example, if the SDK is on an older version than the API, then
                             *   the API may respond with new members that the SDK is unaware of.
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
                                 * An enum member indicating that [Attribute] was instantiated with
                                 * an unknown value.
                                 */
                                _UNKNOWN,
                            }

                            /**
                             * Returns an enum member corresponding to this class instance's value,
                             * or [Value._UNKNOWN] if the class was instantiated with an unknown
                             * value.
                             *
                             * Use the [known] method instead if you're certain the value is always
                             * known or if you want to throw for the unknown case.
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
                             * Use the [value] method instead if you're uncertain the value is
                             * always known and don't want to throw for the unknown case.
                             *
                             * @throws LithicInvalidDataException if this class instance's value is
                             *   a not a known member.
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
                                    else ->
                                        throw LithicInvalidDataException(
                                            "Unknown Attribute: $value"
                                        )
                                }

                            /**
                             * Returns this class instance's primitive wire representation.
                             *
                             * This differs from the [toString] method because that method is
                             * primarily for debugging and generally doesn't throw.
                             *
                             * @throws LithicInvalidDataException if this class instance's value
                             *   does not have the expected primitive type.
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
                             * Returns a score indicating how many valid values are contained in
                             * this object recursively.
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
                             * This is usually only useful if this instance was deserialized from
                             * data that doesn't match any known member, and you want to know that
                             * value. For example, if the SDK is on an older version than the API,
                             * then the API may respond with new members that the SDK is unaware of.
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
                             * An enum containing [Operation]'s known values, as well as an
                             * [_UNKNOWN] member.
                             *
                             * An instance of [Operation] can contain an unknown value in a couple
                             * of cases:
                             * - It was deserialized from data that doesn't match any known member.
                             *   For example, if the SDK is on an older version than the API, then
                             *   the API may respond with new members that the SDK is unaware of.
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
                                 * An enum member indicating that [Operation] was instantiated with
                                 * an unknown value.
                                 */
                                _UNKNOWN,
                            }

                            /**
                             * Returns an enum member corresponding to this class instance's value,
                             * or [Value._UNKNOWN] if the class was instantiated with an unknown
                             * value.
                             *
                             * Use the [known] method instead if you're certain the value is always
                             * known or if you want to throw for the unknown case.
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
                             * Use the [value] method instead if you're uncertain the value is
                             * always known and don't want to throw for the unknown case.
                             *
                             * @throws LithicInvalidDataException if this class instance's value is
                             *   a not a known member.
                             */
                            fun known(): Known =
                                when (this) {
                                    IS_ONE_OF -> Known.IS_ONE_OF
                                    IS_NOT_ONE_OF -> Known.IS_NOT_ONE_OF
                                    MATCHES -> Known.MATCHES
                                    DOES_NOT_MATCH -> Known.DOES_NOT_MATCH
                                    IS_GREATER_THAN -> Known.IS_GREATER_THAN
                                    IS_LESS_THAN -> Known.IS_LESS_THAN
                                    else ->
                                        throw LithicInvalidDataException(
                                            "Unknown Operation: $value"
                                        )
                                }

                            /**
                             * Returns this class instance's primitive wire representation.
                             *
                             * This differs from the [toString] method because that method is
                             * primarily for debugging and generally doesn't throw.
                             *
                             * @throws LithicInvalidDataException if this class instance's value
                             *   does not have the expected primitive type.
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
                             * Returns a score indicating how many valid values are contained in
                             * this object recursively.
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

                            /**
                             * An array of strings, to be used with `IS_ONE_OF` or `IS_NOT_ONE_OF`
                             */
                            fun listOfStrings(): List<String>? = listOfStrings

                            fun isRegex(): Boolean = regex != null

                            fun isNumber(): Boolean = number != null

                            fun isListOfStrings(): Boolean = listOfStrings != null

                            /** A regex string, to be used with `MATCHES` or `DOES_NOT_MATCH` */
                            fun asRegex(): String = regex.getOrThrow("regex")

                            /** A number, to be used with `IS_GREATER_THAN` or `IS_LESS_THAN` */
                            fun asNumber(): Long = number.getOrThrow("number")

                            /**
                             * An array of strings, to be used with `IS_ONE_OF` or `IS_NOT_ONE_OF`
                             */
                            fun asListOfStrings(): List<String> =
                                listOfStrings.getOrThrow("listOfStrings")

                            fun _json(): JsonValue? = _json

                            fun <T> accept(visitor: Visitor<T>): T =
                                when {
                                    regex != null -> visitor.visitRegex(regex)
                                    number != null -> visitor.visitNumber(number)
                                    listOfStrings != null ->
                                        visitor.visitListOfStrings(listOfStrings)
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

                                        override fun visitListOfStrings(
                                            listOfStrings: List<String>
                                        ) {}
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
                             * Returns a score indicating how many valid values are contained in
                             * this object recursively.
                             *
                             * Used for best match union deserialization.
                             */
                            internal fun validity(): Int =
                                accept(
                                    object : Visitor<Int> {
                                        override fun visitRegex(regex: String) = 1

                                        override fun visitNumber(number: Long) = 1

                                        override fun visitListOfStrings(
                                            listOfStrings: List<String>
                                        ) = listOfStrings.size

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

                                /**
                                 * An array of strings, to be used with `IS_ONE_OF` or
                                 * `IS_NOT_ONE_OF`
                                 */
                                fun ofListOfStrings(listOfStrings: List<String>) =
                                    Value(listOfStrings = listOfStrings)
                            }

                            /**
                             * An interface that defines how to map each variant of [Value] to a
                             * value of type [T].
                             */
                            interface Visitor<out T> {

                                /** A regex string, to be used with `MATCHES` or `DOES_NOT_MATCH` */
                                fun visitRegex(regex: String): T

                                /** A number, to be used with `IS_GREATER_THAN` or `IS_LESS_THAN` */
                                fun visitNumber(number: Long): T

                                /**
                                 * An array of strings, to be used with `IS_ONE_OF` or
                                 * `IS_NOT_ONE_OF`
                                 */
                                fun visitListOfStrings(listOfStrings: List<String>): T

                                /**
                                 * Maps an unknown variant of [Value] to a value of type [T].
                                 *
                                 * An instance of [Value] can contain an unknown variant if it was
                                 * deserialized from data that doesn't match any known variant. For
                                 * example, if the SDK is on an older version than the API, then the
                                 * API may respond with new variants that the SDK is unaware of.
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
                                                tryDeserialize(node, jacksonTypeRef<String>())
                                                    ?.let { Value(regex = it, _json = json) },
                                                tryDeserialize(node, jacksonTypeRef<Long>())?.let {
                                                    Value(number = it, _json = json)
                                                },
                                                tryDeserialize(node, jacksonTypeRef<List<String>>())
                                                    ?.let {
                                                        Value(listOfStrings = it, _json = json)
                                                    },
                                            )
                                            .filterNotNull()
                                            .allMaxBy { it.validity() }
                                            .toList()
                                    return when (bestMatches.size) {
                                        // This can happen if what we're deserializing is completely
                                        // incompatible with all the possible variants (e.g.
                                        // deserializing from object).
                                        0 -> Value(_json = json)
                                        1 -> bestMatches.single()
                                        // If there's more than one match with the highest validity,
                                        // then use the first completely valid match, or simply the
                                        // first match if none are completely valid.
                                        else ->
                                            bestMatches.firstOrNull { it.isValid() }
                                                ?: bestMatches.first()
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

            /**
             * The type of Auth Rule. Effectively determines the event stream during which it will
             * be evaluated.
             * - `CONDITIONAL_BLOCK`: AUTHORIZATION event stream.
             * - `VELOCITY_LIMIT`: AUTHORIZATION event stream.
             * - `MERCHANT_LOCK`: AUTHORIZATION event stream.
             * - `CONDITIONAL_3DS_ACTION`: THREE_DS_AUTHENTICATION event stream.
             */
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

                    val MERCHANT_LOCK = of("MERCHANT_LOCK")

                    val CONDITIONAL_3DS_ACTION = of("CONDITIONAL_3DS_ACTION")

                    fun of(value: String) = AuthRuleType(JsonField.of(value))
                }

                /** An enum containing [AuthRuleType]'s known values. */
                enum class Known {
                    CONDITIONAL_BLOCK,
                    VELOCITY_LIMIT,
                    MERCHANT_LOCK,
                    CONDITIONAL_3DS_ACTION,
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
                    MERCHANT_LOCK,
                    CONDITIONAL_3DS_ACTION,
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
                        MERCHANT_LOCK -> Value.MERCHANT_LOCK
                        CONDITIONAL_3DS_ACTION -> Value.CONDITIONAL_3DS_ACTION
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
                        MERCHANT_LOCK -> Known.MERCHANT_LOCK
                        CONDITIONAL_3DS_ACTION -> Known.CONDITIONAL_3DS_ACTION
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

                private var validated: Boolean = false

                fun validate(): AuthRuleType = apply {
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

        class CreateAuthRuleRequestCardTokens
        private constructor(
            private val cardTokens: JsonField<List<String>>,
            private val name: JsonField<String>,
            private val parameters: JsonField<Parameters>,
            private val type: JsonField<AuthRuleType>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("card_tokens")
                @ExcludeMissing
                cardTokens: JsonField<List<String>> = JsonMissing.of(),
                @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
                @JsonProperty("parameters")
                @ExcludeMissing
                parameters: JsonField<Parameters> = JsonMissing.of(),
                @JsonProperty("type")
                @ExcludeMissing
                type: JsonField<AuthRuleType> = JsonMissing.of(),
            ) : this(cardTokens, name, parameters, type, mutableMapOf())

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
             * The type of Auth Rule. Effectively determines the event stream during which it will
             * be evaluated.
             * - `CONDITIONAL_BLOCK`: AUTHORIZATION event stream.
             * - `VELOCITY_LIMIT`: AUTHORIZATION event stream.
             * - `MERCHANT_LOCK`: AUTHORIZATION event stream.
             * - `CONDITIONAL_3DS_ACTION`: THREE_DS_AUTHENTICATION event stream.
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

                /**
                 * Alias for calling [parameters] with `Parameters.ofMerchantLock(merchantLock)`.
                 */
                fun parameters(merchantLock: Parameters.MerchantLockParameters) =
                    parameters(Parameters.ofMerchantLock(merchantLock))

                /**
                 * Alias for calling [parameters] with
                 * `Parameters.ofConditional3dsAction(conditional3dsAction)`.
                 */
                fun parameters(conditional3dsAction: Parameters.Conditional3dsActionParameters) =
                    parameters(Parameters.ofConditional3dsAction(conditional3dsAction))

                /**
                 * The type of Auth Rule. Effectively determines the event stream during which it
                 * will be evaluated.
                 * - `CONDITIONAL_BLOCK`: AUTHORIZATION event stream.
                 * - `VELOCITY_LIMIT`: AUTHORIZATION event stream.
                 * - `MERCHANT_LOCK`: AUTHORIZATION event stream.
                 * - `CONDITIONAL_3DS_ACTION`: THREE_DS_AUTHENTICATION event stream.
                 */
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

                /**
                 * Returns an immutable instance of [CreateAuthRuleRequestCardTokens].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```kotlin
                 * .cardTokens()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): CreateAuthRuleRequestCardTokens =
                    CreateAuthRuleRequestCardTokens(
                        checkRequired("cardTokens", cardTokens).map { it.toImmutable() },
                        name,
                        parameters,
                        type,
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): CreateAuthRuleRequestCardTokens = apply {
                if (validated) {
                    return@apply
                }

                cardTokens()
                name()
                parameters()?.validate()
                type()?.validate()
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
                (cardTokens.asKnown()?.size ?: 0) +
                    (if (name.asKnown() == null) 0 else 1) +
                    (parameters.asKnown()?.validity() ?: 0) +
                    (type.asKnown()?.validity() ?: 0)

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

                fun asMerchantLock(): MerchantLockParameters =
                    merchantLock.getOrThrow("merchantLock")

                fun asConditional3dsAction(): Conditional3dsActionParameters =
                    conditional3dsAction.getOrThrow("conditional3dsAction")

                fun _json(): JsonValue? = _json

                fun <T> accept(visitor: Visitor<T>): T =
                    when {
                        conditionalBlock != null -> visitor.visitConditionalBlock(conditionalBlock)
                        velocityLimitParams != null ->
                            visitor.visitVelocityLimitParams(velocityLimitParams)
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

                    fun ofConditional3dsAction(
                        conditional3dsAction: Conditional3dsActionParameters
                    ) = Parameters(conditional3dsAction = conditional3dsAction)
                }

                /**
                 * An interface that defines how to map each variant of [Parameters] to a value of
                 * type [T].
                 */
                interface Visitor<out T> {

                    fun visitConditionalBlock(conditionalBlock: ConditionalBlockParameters): T

                    fun visitVelocityLimitParams(velocityLimitParams: VelocityLimitParams): T

                    fun visitMerchantLock(merchantLock: MerchantLockParameters): T

                    fun visitConditional3dsAction(
                        conditional3dsAction: Conditional3dsActionParameters
                    ): T

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

                        val bestMatches =
                            sequenceOf(
                                    tryDeserialize(
                                            node,
                                            jacksonTypeRef<ConditionalBlockParameters>(),
                                        )
                                        ?.let { Parameters(conditionalBlock = it, _json = json) },
                                    tryDeserialize(node, jacksonTypeRef<VelocityLimitParams>())
                                        ?.let {
                                            Parameters(velocityLimitParams = it, _json = json)
                                        },
                                    tryDeserialize(node, jacksonTypeRef<MerchantLockParameters>())
                                        ?.let { Parameters(merchantLock = it, _json = json) },
                                    tryDeserialize(
                                            node,
                                            jacksonTypeRef<Conditional3dsActionParameters>(),
                                        )
                                        ?.let {
                                            Parameters(conditional3dsAction = it, _json = json)
                                        },
                                )
                                .filterNotNull()
                                .allMaxBy { it.validity() }
                                .toList()
                        return when (bestMatches.size) {
                            // This can happen if what we're deserializing is completely
                            // incompatible with all the possible variants (e.g. deserializing from
                            // boolean).
                            0 -> Parameters(_json = json)
                            1 -> bestMatches.single()
                            // If there's more than one match with the highest validity, then use
                            // the first completely valid match, or simply the first match if none
                            // are completely valid.
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
                            value.conditionalBlock != null ->
                                generator.writeObject(value.conditionalBlock)
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
                     * A list of merchant locks defining specific merchants or groups of merchants
                     * (based on descriptors or IDs) that the lock applies to.
                     *
                     * @throws LithicInvalidDataException if the JSON field has an unexpected type
                     *   or is unexpectedly missing or null (e.g. if the server responded with an
                     *   unexpected value).
                     */
                    fun merchants(): List<Merchant> = merchants.getRequired("merchants")

                    /**
                     * Returns the raw JSON value of [merchants].
                     *
                     * Unlike [merchants], this method doesn't throw if the JSON field has an
                     * unexpected type.
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
                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        internal fun from(merchantLockParameters: MerchantLockParameters) = apply {
                            merchants = merchantLockParameters.merchants.map { it.toMutableList() }
                            additionalProperties =
                                merchantLockParameters.additionalProperties.toMutableMap()
                        }

                        /**
                         * A list of merchant locks defining specific merchants or groups of
                         * merchants (based on descriptors or IDs) that the lock applies to.
                         */
                        fun merchants(merchants: List<Merchant>) =
                            merchants(JsonField.of(merchants))

                        /**
                         * Sets [Builder.merchants] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.merchants] with a well-typed
                         * `List<Merchant>` value instead. This method is primarily for setting the
                         * field to an undocumented or not yet supported value.
                         */
                        fun merchants(merchants: JsonField<List<Merchant>>) = apply {
                            this.merchants = merchants.map { it.toMutableList() }
                        }

                        /**
                         * Adds a single [Merchant] to [merchants].
                         *
                         * @throws IllegalStateException if the field was previously set to a
                         *   non-list.
                         */
                        fun addMerchant(merchant: Merchant) = apply {
                            merchants =
                                (merchants ?: JsonField.of(mutableListOf())).also {
                                    checkKnown("merchants", it).add(merchant)
                                }
                        }

                        fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                            apply {
                                this.additionalProperties.clear()
                                putAllAdditionalProperties(additionalProperties)
                            }

                        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                            additionalProperties.put(key, value)
                        }

                        fun putAllAdditionalProperties(
                            additionalProperties: Map<String, JsonValue>
                        ) = apply { this.additionalProperties.putAll(additionalProperties) }

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
                     * Represents a specific merchant lock based on their ID or descriptor. Each
                     * merchant object allows transaction rules to work at a granular level and
                     * requires at least one of merchant_id or descriptor.
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
                         * A comment or explanation about the merchant, used internally for rule
                         * management purposes.
                         *
                         * @throws LithicInvalidDataException if the JSON field has an unexpected
                         *   type (e.g. if the server responded with an unexpected value).
                         */
                        fun comment(): String? = comment.getNullable("comment")

                        /**
                         * Short description of the merchant, often used to provide more
                         * human-readable context about the transaction merchant. This is typically
                         * the name or label shown on transaction summaries.
                         *
                         * @throws LithicInvalidDataException if the JSON field has an unexpected
                         *   type (e.g. if the server responded with an unexpected value).
                         */
                        fun descriptor(): String? = descriptor.getNullable("descriptor")

                        /**
                         * Unique alphanumeric identifier for the payment card acceptor (merchant).
                         * This attribute specifies the merchant entity that will be locked or
                         * referenced for authorization rules.
                         *
                         * @throws LithicInvalidDataException if the JSON field has an unexpected
                         *   type (e.g. if the server responded with an unexpected value).
                         */
                        fun merchantId(): String? = merchantId.getNullable("merchant_id")

                        /**
                         * Returns the raw JSON value of [comment].
                         *
                         * Unlike [comment], this method doesn't throw if the JSON field has an
                         * unexpected type.
                         */
                        @JsonProperty("comment")
                        @ExcludeMissing
                        fun _comment(): JsonField<String> = comment

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

                            /**
                             * Returns a mutable builder for constructing an instance of [Merchant].
                             */
                            fun builder() = Builder()
                        }

                        /** A builder for [Merchant]. */
                        class Builder internal constructor() {

                            private var comment: JsonField<String> = JsonMissing.of()
                            private var descriptor: JsonField<String> = JsonMissing.of()
                            private var merchantId: JsonField<String> = JsonMissing.of()
                            private var additionalProperties: MutableMap<String, JsonValue> =
                                mutableMapOf()

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
                             * You should usually call [Builder.comment] with a well-typed [String]
                             * value instead. This method is primarily for setting the field to an
                             * undocumented or not yet supported value.
                             */
                            fun comment(comment: JsonField<String>) = apply {
                                this.comment = comment
                            }

                            /**
                             * Short description of the merchant, often used to provide more
                             * human-readable context about the transaction merchant. This is
                             * typically the name or label shown on transaction summaries.
                             */
                            fun descriptor(descriptor: String) =
                                descriptor(JsonField.of(descriptor))

                            /**
                             * Sets [Builder.descriptor] to an arbitrary JSON value.
                             *
                             * You should usually call [Builder.descriptor] with a well-typed
                             * [String] value instead. This method is primarily for setting the
                             * field to an undocumented or not yet supported value.
                             */
                            fun descriptor(descriptor: JsonField<String>) = apply {
                                this.descriptor = descriptor
                            }

                            /**
                             * Unique alphanumeric identifier for the payment card acceptor
                             * (merchant). This attribute specifies the merchant entity that will be
                             * locked or referenced for authorization rules.
                             */
                            fun merchantId(merchantId: String) =
                                merchantId(JsonField.of(merchantId))

                            /**
                             * Sets [Builder.merchantId] to an arbitrary JSON value.
                             *
                             * You should usually call [Builder.merchantId] with a well-typed
                             * [String] value instead. This method is primarily for setting the
                             * field to an undocumented or not yet supported value.
                             */
                            fun merchantId(merchantId: JsonField<String>) = apply {
                                this.merchantId = merchantId
                            }

                            fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                                apply {
                                    this.additionalProperties.clear()
                                    putAllAdditionalProperties(additionalProperties)
                                }

                            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                                additionalProperties.put(key, value)
                            }

                            fun putAllAdditionalProperties(
                                additionalProperties: Map<String, JsonValue>
                            ) = apply { this.additionalProperties.putAll(additionalProperties) }

                            fun removeAdditionalProperty(key: String) = apply {
                                additionalProperties.remove(key)
                            }

                            fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                                keys.forEach(::removeAdditionalProperty)
                            }

                            /**
                             * Returns an immutable instance of [Merchant].
                             *
                             * Further updates to this [Builder] will not mutate the returned
                             * instance.
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
                         * Returns a score indicating how many valid values are contained in this
                         * object recursively.
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
                     * @throws LithicInvalidDataException if the JSON field has an unexpected type
                     *   or is unexpectedly missing or null (e.g. if the server responded with an
                     *   unexpected value).
                     */
                    fun action(): Action = action.getRequired("action")

                    /**
                     * @throws LithicInvalidDataException if the JSON field has an unexpected type
                     *   or is unexpectedly missing or null (e.g. if the server responded with an
                     *   unexpected value).
                     */
                    fun conditions(): List<Condition> = conditions.getRequired("conditions")

                    /**
                     * Returns the raw JSON value of [action].
                     *
                     * Unlike [action], this method doesn't throw if the JSON field has an
                     * unexpected type.
                     */
                    @JsonProperty("action")
                    @ExcludeMissing
                    fun _action(): JsonField<Action> = action

                    /**
                     * Returns the raw JSON value of [conditions].
                     *
                     * Unlike [conditions], this method doesn't throw if the JSON field has an
                     * unexpected type.
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
                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        internal fun from(
                            conditional3dsActionParameters: Conditional3dsActionParameters
                        ) = apply {
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
                         * instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun action(action: JsonField<Action>) = apply { this.action = action }

                        fun conditions(conditions: List<Condition>) =
                            conditions(JsonField.of(conditions))

                        /**
                         * Sets [Builder.conditions] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.conditions] with a well-typed
                         * `List<Condition>` value instead. This method is primarily for setting the
                         * field to an undocumented or not yet supported value.
                         */
                        fun conditions(conditions: JsonField<List<Condition>>) = apply {
                            this.conditions = conditions.map { it.toMutableList() }
                        }

                        /**
                         * Adds a single [Condition] to [conditions].
                         *
                         * @throws IllegalStateException if the field was previously set to a
                         *   non-list.
                         */
                        fun addCondition(condition: Condition) = apply {
                            conditions =
                                (conditions ?: JsonField.of(mutableListOf())).also {
                                    checkKnown("conditions", it).add(condition)
                                }
                        }

                        fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                            apply {
                                this.additionalProperties.clear()
                                putAllAdditionalProperties(additionalProperties)
                            }

                        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                            additionalProperties.put(key, value)
                        }

                        fun putAllAdditionalProperties(
                            additionalProperties: Map<String, JsonValue>
                        ) = apply { this.additionalProperties.putAll(additionalProperties) }

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
                    class Action
                    @JsonCreator
                    private constructor(private val value: JsonField<String>) : Enum {

                        /**
                         * Returns this class instance's raw value.
                         *
                         * This is usually only useful if this instance was deserialized from data
                         * that doesn't match any known member, and you want to know that value. For
                         * example, if the SDK is on an older version than the API, then the API may
                         * respond with new members that the SDK is unaware of.
                         */
                        @com.fasterxml.jackson.annotation.JsonValue
                        fun _value(): JsonField<String> = value

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
                         * An enum containing [Action]'s known values, as well as an [_UNKNOWN]
                         * member.
                         *
                         * An instance of [Action] can contain an unknown value in a couple of
                         * cases:
                         * - It was deserialized from data that doesn't match any known member. For
                         *   example, if the SDK is on an older version than the API, then the API
                         *   may respond with new members that the SDK is unaware of.
                         * - It was constructed with an arbitrary value using the [of] method.
                         */
                        enum class Value {
                            DECLINE,
                            CHALLENGE,
                            /**
                             * An enum member indicating that [Action] was instantiated with an
                             * unknown value.
                             */
                            _UNKNOWN,
                        }

                        /**
                         * Returns an enum member corresponding to this class instance's value, or
                         * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                         *
                         * Use the [known] method instead if you're certain the value is always
                         * known or if you want to throw for the unknown case.
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
                         * Use the [value] method instead if you're uncertain the value is always
                         * known and don't want to throw for the unknown case.
                         *
                         * @throws LithicInvalidDataException if this class instance's value is a
                         *   not a known member.
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
                         * This differs from the [toString] method because that method is primarily
                         * for debugging and generally doesn't throw.
                         *
                         * @throws LithicInvalidDataException if this class instance's value does
                         *   not have the expected primitive type.
                         */
                        fun asString(): String =
                            _value().asString()
                                ?: throw LithicInvalidDataException("Value is not a String")

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
                         * Returns a score indicating how many valid values are contained in this
                         * object recursively.
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
                         * - `MCC`: A four-digit number listed in ISO 18245. An MCC is used to
                         *   classify a business by the types of goods or services it provides.
                         * - `COUNTRY`: Country of entity of card acceptor. Possible values are: (1)
                         *   all ISO 3166-1 alpha-3 country codes, (2) QZZ for Kosovo, and (3) ANT
                         *   for Netherlands Antilles.
                         * - `CURRENCY`: 3-character alphabetic ISO 4217 code for the merchant
                         *   currency of the transaction.
                         * - `MERCHANT_ID`: Unique alphanumeric identifier for the payment card
                         *   acceptor (merchant).
                         * - `DESCRIPTOR`: Short description of card acceptor.
                         * - `TRANSACTION_AMOUNT`: The base transaction amount (in cents) plus the
                         *   acquirer fee field in the settlement/cardholder billing currency. This
                         *   is the amount the issuer should authorize against unless the issuer is
                         *   paying the acquirer fee on behalf of the cardholder.
                         * - `RISK_SCORE`: Network-provided score assessing risk level associated
                         *   with a given authentication. Scores are on a range of 0-999, with 0
                         *   representing the lowest risk and 999 representing the highest risk. For
                         *   Visa transactions, where the raw score has a range of 0-99, Lithic will
                         *   normalize the score by multiplying the raw score by 10x.
                         * - `MESSAGE_CATEGORY`: The category of the authentication being processed.
                         *
                         * @throws LithicInvalidDataException if the JSON field has an unexpected
                         *   type (e.g. if the server responded with an unexpected value).
                         */
                        fun attribute(): Attribute? = attribute.getNullable("attribute")

                        /**
                         * The operation to apply to the attribute
                         *
                         * @throws LithicInvalidDataException if the JSON field has an unexpected
                         *   type (e.g. if the server responded with an unexpected value).
                         */
                        fun operation(): Operation? = operation.getNullable("operation")

                        /**
                         * A regex string, to be used with `MATCHES` or `DOES_NOT_MATCH`
                         *
                         * @throws LithicInvalidDataException if the JSON field has an unexpected
                         *   type (e.g. if the server responded with an unexpected value).
                         */
                        fun value(): Value? = value.getNullable("value")

                        /**
                         * Returns the raw JSON value of [attribute].
                         *
                         * Unlike [attribute], this method doesn't throw if the JSON field has an
                         * unexpected type.
                         */
                        @JsonProperty("attribute")
                        @ExcludeMissing
                        fun _attribute(): JsonField<Attribute> = attribute

                        /**
                         * Returns the raw JSON value of [operation].
                         *
                         * Unlike [operation], this method doesn't throw if the JSON field has an
                         * unexpected type.
                         */
                        @JsonProperty("operation")
                        @ExcludeMissing
                        fun _operation(): JsonField<Operation> = operation

                        /**
                         * Returns the raw JSON value of [value].
                         *
                         * Unlike [value], this method doesn't throw if the JSON field has an
                         * unexpected type.
                         */
                        @JsonProperty("value")
                        @ExcludeMissing
                        fun _value(): JsonField<Value> = value

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
                             * [Condition].
                             */
                            fun builder() = Builder()
                        }

                        /** A builder for [Condition]. */
                        class Builder internal constructor() {

                            private var attribute: JsonField<Attribute> = JsonMissing.of()
                            private var operation: JsonField<Operation> = JsonMissing.of()
                            private var value: JsonField<Value> = JsonMissing.of()
                            private var additionalProperties: MutableMap<String, JsonValue> =
                                mutableMapOf()

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
                             * - `MCC`: A four-digit number listed in ISO 18245. An MCC is used to
                             *   classify a business by the types of goods or services it provides.
                             * - `COUNTRY`: Country of entity of card acceptor. Possible values are:
                             *   (1) all ISO 3166-1 alpha-3 country codes, (2) QZZ for Kosovo, and
                             *   (3) ANT for Netherlands Antilles.
                             * - `CURRENCY`: 3-character alphabetic ISO 4217 code for the merchant
                             *   currency of the transaction.
                             * - `MERCHANT_ID`: Unique alphanumeric identifier for the payment card
                             *   acceptor (merchant).
                             * - `DESCRIPTOR`: Short description of card acceptor.
                             * - `TRANSACTION_AMOUNT`: The base transaction amount (in cents) plus
                             *   the acquirer fee field in the settlement/cardholder billing
                             *   currency. This is the amount the issuer should authorize against
                             *   unless the issuer is paying the acquirer fee on behalf of the
                             *   cardholder.
                             * - `RISK_SCORE`: Network-provided score assessing risk level
                             *   associated with a given authentication. Scores are on a range of
                             *   0-999, with 0 representing the lowest risk and 999 representing the
                             *   highest risk. For Visa transactions, where the raw score has a
                             *   range of 0-99, Lithic will normalize the score by multiplying the
                             *   raw score by 10x.
                             * - `MESSAGE_CATEGORY`: The category of the authentication being
                             *   processed.
                             */
                            fun attribute(attribute: Attribute) = attribute(JsonField.of(attribute))

                            /**
                             * Sets [Builder.attribute] to an arbitrary JSON value.
                             *
                             * You should usually call [Builder.attribute] with a well-typed
                             * [Attribute] value instead. This method is primarily for setting the
                             * field to an undocumented or not yet supported value.
                             */
                            fun attribute(attribute: JsonField<Attribute>) = apply {
                                this.attribute = attribute
                            }

                            /** The operation to apply to the attribute */
                            fun operation(operation: Operation) = operation(JsonField.of(operation))

                            /**
                             * Sets [Builder.operation] to an arbitrary JSON value.
                             *
                             * You should usually call [Builder.operation] with a well-typed
                             * [Operation] value instead. This method is primarily for setting the
                             * field to an undocumented or not yet supported value.
                             */
                            fun operation(operation: JsonField<Operation>) = apply {
                                this.operation = operation
                            }

                            /** A regex string, to be used with `MATCHES` or `DOES_NOT_MATCH` */
                            fun value(value: Value) = value(JsonField.of(value))

                            /**
                             * Sets [Builder.value] to an arbitrary JSON value.
                             *
                             * You should usually call [Builder.value] with a well-typed [Value]
                             * value instead. This method is primarily for setting the field to an
                             * undocumented or not yet supported value.
                             */
                            fun value(value: JsonField<Value>) = apply { this.value = value }

                            /** Alias for calling [value] with `Value.ofRegex(regex)`. */
                            fun value(regex: String) = value(Value.ofRegex(regex))

                            /** Alias for calling [value] with `Value.ofNumber(number)`. */
                            fun value(number: Long) = value(Value.ofNumber(number))

                            /**
                             * Alias for calling [value] with
                             * `Value.ofListOfStrings(listOfStrings)`.
                             */
                            fun valueOfListOfStrings(listOfStrings: List<String>) =
                                value(Value.ofListOfStrings(listOfStrings))

                            fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                                apply {
                                    this.additionalProperties.clear()
                                    putAllAdditionalProperties(additionalProperties)
                                }

                            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                                additionalProperties.put(key, value)
                            }

                            fun putAllAdditionalProperties(
                                additionalProperties: Map<String, JsonValue>
                            ) = apply { this.additionalProperties.putAll(additionalProperties) }

                            fun removeAdditionalProperty(key: String) = apply {
                                additionalProperties.remove(key)
                            }

                            fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                                keys.forEach(::removeAdditionalProperty)
                            }

                            /**
                             * Returns an immutable instance of [Condition].
                             *
                             * Further updates to this [Builder] will not mutate the returned
                             * instance.
                             */
                            fun build(): Condition =
                                Condition(
                                    attribute,
                                    operation,
                                    value,
                                    additionalProperties.toMutableMap(),
                                )
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
                         * Returns a score indicating how many valid values are contained in this
                         * object recursively.
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
                         * - `MCC`: A four-digit number listed in ISO 18245. An MCC is used to
                         *   classify a business by the types of goods or services it provides.
                         * - `COUNTRY`: Country of entity of card acceptor. Possible values are: (1)
                         *   all ISO 3166-1 alpha-3 country codes, (2) QZZ for Kosovo, and (3) ANT
                         *   for Netherlands Antilles.
                         * - `CURRENCY`: 3-character alphabetic ISO 4217 code for the merchant
                         *   currency of the transaction.
                         * - `MERCHANT_ID`: Unique alphanumeric identifier for the payment card
                         *   acceptor (merchant).
                         * - `DESCRIPTOR`: Short description of card acceptor.
                         * - `TRANSACTION_AMOUNT`: The base transaction amount (in cents) plus the
                         *   acquirer fee field in the settlement/cardholder billing currency. This
                         *   is the amount the issuer should authorize against unless the issuer is
                         *   paying the acquirer fee on behalf of the cardholder.
                         * - `RISK_SCORE`: Network-provided score assessing risk level associated
                         *   with a given authentication. Scores are on a range of 0-999, with 0
                         *   representing the lowest risk and 999 representing the highest risk. For
                         *   Visa transactions, where the raw score has a range of 0-99, Lithic will
                         *   normalize the score by multiplying the raw score by 10x.
                         * - `MESSAGE_CATEGORY`: The category of the authentication being processed.
                         */
                        class Attribute
                        @JsonCreator
                        private constructor(private val value: JsonField<String>) : Enum {

                            /**
                             * Returns this class instance's raw value.
                             *
                             * This is usually only useful if this instance was deserialized from
                             * data that doesn't match any known member, and you want to know that
                             * value. For example, if the SDK is on an older version than the API,
                             * then the API may respond with new members that the SDK is unaware of.
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
                             * An enum containing [Attribute]'s known values, as well as an
                             * [_UNKNOWN] member.
                             *
                             * An instance of [Attribute] can contain an unknown value in a couple
                             * of cases:
                             * - It was deserialized from data that doesn't match any known member.
                             *   For example, if the SDK is on an older version than the API, then
                             *   the API may respond with new members that the SDK is unaware of.
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
                                 * An enum member indicating that [Attribute] was instantiated with
                                 * an unknown value.
                                 */
                                _UNKNOWN,
                            }

                            /**
                             * Returns an enum member corresponding to this class instance's value,
                             * or [Value._UNKNOWN] if the class was instantiated with an unknown
                             * value.
                             *
                             * Use the [known] method instead if you're certain the value is always
                             * known or if you want to throw for the unknown case.
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
                             * Use the [value] method instead if you're uncertain the value is
                             * always known and don't want to throw for the unknown case.
                             *
                             * @throws LithicInvalidDataException if this class instance's value is
                             *   a not a known member.
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
                                    else ->
                                        throw LithicInvalidDataException(
                                            "Unknown Attribute: $value"
                                        )
                                }

                            /**
                             * Returns this class instance's primitive wire representation.
                             *
                             * This differs from the [toString] method because that method is
                             * primarily for debugging and generally doesn't throw.
                             *
                             * @throws LithicInvalidDataException if this class instance's value
                             *   does not have the expected primitive type.
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
                             * Returns a score indicating how many valid values are contained in
                             * this object recursively.
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
                             * This is usually only useful if this instance was deserialized from
                             * data that doesn't match any known member, and you want to know that
                             * value. For example, if the SDK is on an older version than the API,
                             * then the API may respond with new members that the SDK is unaware of.
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
                             * An enum containing [Operation]'s known values, as well as an
                             * [_UNKNOWN] member.
                             *
                             * An instance of [Operation] can contain an unknown value in a couple
                             * of cases:
                             * - It was deserialized from data that doesn't match any known member.
                             *   For example, if the SDK is on an older version than the API, then
                             *   the API may respond with new members that the SDK is unaware of.
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
                                 * An enum member indicating that [Operation] was instantiated with
                                 * an unknown value.
                                 */
                                _UNKNOWN,
                            }

                            /**
                             * Returns an enum member corresponding to this class instance's value,
                             * or [Value._UNKNOWN] if the class was instantiated with an unknown
                             * value.
                             *
                             * Use the [known] method instead if you're certain the value is always
                             * known or if you want to throw for the unknown case.
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
                             * Use the [value] method instead if you're uncertain the value is
                             * always known and don't want to throw for the unknown case.
                             *
                             * @throws LithicInvalidDataException if this class instance's value is
                             *   a not a known member.
                             */
                            fun known(): Known =
                                when (this) {
                                    IS_ONE_OF -> Known.IS_ONE_OF
                                    IS_NOT_ONE_OF -> Known.IS_NOT_ONE_OF
                                    MATCHES -> Known.MATCHES
                                    DOES_NOT_MATCH -> Known.DOES_NOT_MATCH
                                    IS_GREATER_THAN -> Known.IS_GREATER_THAN
                                    IS_LESS_THAN -> Known.IS_LESS_THAN
                                    else ->
                                        throw LithicInvalidDataException(
                                            "Unknown Operation: $value"
                                        )
                                }

                            /**
                             * Returns this class instance's primitive wire representation.
                             *
                             * This differs from the [toString] method because that method is
                             * primarily for debugging and generally doesn't throw.
                             *
                             * @throws LithicInvalidDataException if this class instance's value
                             *   does not have the expected primitive type.
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
                             * Returns a score indicating how many valid values are contained in
                             * this object recursively.
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

                            /**
                             * An array of strings, to be used with `IS_ONE_OF` or `IS_NOT_ONE_OF`
                             */
                            fun listOfStrings(): List<String>? = listOfStrings

                            fun isRegex(): Boolean = regex != null

                            fun isNumber(): Boolean = number != null

                            fun isListOfStrings(): Boolean = listOfStrings != null

                            /** A regex string, to be used with `MATCHES` or `DOES_NOT_MATCH` */
                            fun asRegex(): String = regex.getOrThrow("regex")

                            /** A number, to be used with `IS_GREATER_THAN` or `IS_LESS_THAN` */
                            fun asNumber(): Long = number.getOrThrow("number")

                            /**
                             * An array of strings, to be used with `IS_ONE_OF` or `IS_NOT_ONE_OF`
                             */
                            fun asListOfStrings(): List<String> =
                                listOfStrings.getOrThrow("listOfStrings")

                            fun _json(): JsonValue? = _json

                            fun <T> accept(visitor: Visitor<T>): T =
                                when {
                                    regex != null -> visitor.visitRegex(regex)
                                    number != null -> visitor.visitNumber(number)
                                    listOfStrings != null ->
                                        visitor.visitListOfStrings(listOfStrings)
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

                                        override fun visitListOfStrings(
                                            listOfStrings: List<String>
                                        ) {}
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
                             * Returns a score indicating how many valid values are contained in
                             * this object recursively.
                             *
                             * Used for best match union deserialization.
                             */
                            internal fun validity(): Int =
                                accept(
                                    object : Visitor<Int> {
                                        override fun visitRegex(regex: String) = 1

                                        override fun visitNumber(number: Long) = 1

                                        override fun visitListOfStrings(
                                            listOfStrings: List<String>
                                        ) = listOfStrings.size

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

                                /**
                                 * An array of strings, to be used with `IS_ONE_OF` or
                                 * `IS_NOT_ONE_OF`
                                 */
                                fun ofListOfStrings(listOfStrings: List<String>) =
                                    Value(listOfStrings = listOfStrings)
                            }

                            /**
                             * An interface that defines how to map each variant of [Value] to a
                             * value of type [T].
                             */
                            interface Visitor<out T> {

                                /** A regex string, to be used with `MATCHES` or `DOES_NOT_MATCH` */
                                fun visitRegex(regex: String): T

                                /** A number, to be used with `IS_GREATER_THAN` or `IS_LESS_THAN` */
                                fun visitNumber(number: Long): T

                                /**
                                 * An array of strings, to be used with `IS_ONE_OF` or
                                 * `IS_NOT_ONE_OF`
                                 */
                                fun visitListOfStrings(listOfStrings: List<String>): T

                                /**
                                 * Maps an unknown variant of [Value] to a value of type [T].
                                 *
                                 * An instance of [Value] can contain an unknown variant if it was
                                 * deserialized from data that doesn't match any known variant. For
                                 * example, if the SDK is on an older version than the API, then the
                                 * API may respond with new variants that the SDK is unaware of.
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
                                                tryDeserialize(node, jacksonTypeRef<String>())
                                                    ?.let { Value(regex = it, _json = json) },
                                                tryDeserialize(node, jacksonTypeRef<Long>())?.let {
                                                    Value(number = it, _json = json)
                                                },
                                                tryDeserialize(node, jacksonTypeRef<List<String>>())
                                                    ?.let {
                                                        Value(listOfStrings = it, _json = json)
                                                    },
                                            )
                                            .filterNotNull()
                                            .allMaxBy { it.validity() }
                                            .toList()
                                    return when (bestMatches.size) {
                                        // This can happen if what we're deserializing is completely
                                        // incompatible with all the possible variants (e.g.
                                        // deserializing from object).
                                        0 -> Value(_json = json)
                                        1 -> bestMatches.single()
                                        // If there's more than one match with the highest validity,
                                        // then use the first completely valid match, or simply the
                                        // first match if none are completely valid.
                                        else ->
                                            bestMatches.firstOrNull { it.isValid() }
                                                ?: bestMatches.first()
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

            /**
             * The type of Auth Rule. Effectively determines the event stream during which it will
             * be evaluated.
             * - `CONDITIONAL_BLOCK`: AUTHORIZATION event stream.
             * - `VELOCITY_LIMIT`: AUTHORIZATION event stream.
             * - `MERCHANT_LOCK`: AUTHORIZATION event stream.
             * - `CONDITIONAL_3DS_ACTION`: THREE_DS_AUTHENTICATION event stream.
             */
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

                    val MERCHANT_LOCK = of("MERCHANT_LOCK")

                    val CONDITIONAL_3DS_ACTION = of("CONDITIONAL_3DS_ACTION")

                    fun of(value: String) = AuthRuleType(JsonField.of(value))
                }

                /** An enum containing [AuthRuleType]'s known values. */
                enum class Known {
                    CONDITIONAL_BLOCK,
                    VELOCITY_LIMIT,
                    MERCHANT_LOCK,
                    CONDITIONAL_3DS_ACTION,
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
                    MERCHANT_LOCK,
                    CONDITIONAL_3DS_ACTION,
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
                        MERCHANT_LOCK -> Value.MERCHANT_LOCK
                        CONDITIONAL_3DS_ACTION -> Value.CONDITIONAL_3DS_ACTION
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
                        MERCHANT_LOCK -> Known.MERCHANT_LOCK
                        CONDITIONAL_3DS_ACTION -> Known.CONDITIONAL_3DS_ACTION
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

                private var validated: Boolean = false

                fun validate(): AuthRuleType = apply {
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

        class CreateAuthRuleRequestProgramLevel
        private constructor(
            private val programLevel: JsonField<Boolean>,
            private val excludedCardTokens: JsonField<List<String>>,
            private val name: JsonField<String>,
            private val parameters: JsonField<Parameters>,
            private val type: JsonField<AuthRuleType>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("program_level")
                @ExcludeMissing
                programLevel: JsonField<Boolean> = JsonMissing.of(),
                @JsonProperty("excluded_card_tokens")
                @ExcludeMissing
                excludedCardTokens: JsonField<List<String>> = JsonMissing.of(),
                @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
                @JsonProperty("parameters")
                @ExcludeMissing
                parameters: JsonField<Parameters> = JsonMissing.of(),
                @JsonProperty("type")
                @ExcludeMissing
                type: JsonField<AuthRuleType> = JsonMissing.of(),
            ) : this(programLevel, excludedCardTokens, name, parameters, type, mutableMapOf())

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
             * The type of Auth Rule. Effectively determines the event stream during which it will
             * be evaluated.
             * - `CONDITIONAL_BLOCK`: AUTHORIZATION event stream.
             * - `VELOCITY_LIMIT`: AUTHORIZATION event stream.
             * - `MERCHANT_LOCK`: AUTHORIZATION event stream.
             * - `CONDITIONAL_3DS_ACTION`: THREE_DS_AUTHENTICATION event stream.
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

                /**
                 * Alias for calling [parameters] with `Parameters.ofMerchantLock(merchantLock)`.
                 */
                fun parameters(merchantLock: Parameters.MerchantLockParameters) =
                    parameters(Parameters.ofMerchantLock(merchantLock))

                /**
                 * Alias for calling [parameters] with
                 * `Parameters.ofConditional3dsAction(conditional3dsAction)`.
                 */
                fun parameters(conditional3dsAction: Parameters.Conditional3dsActionParameters) =
                    parameters(Parameters.ofConditional3dsAction(conditional3dsAction))

                /**
                 * The type of Auth Rule. Effectively determines the event stream during which it
                 * will be evaluated.
                 * - `CONDITIONAL_BLOCK`: AUTHORIZATION event stream.
                 * - `VELOCITY_LIMIT`: AUTHORIZATION event stream.
                 * - `MERCHANT_LOCK`: AUTHORIZATION event stream.
                 * - `CONDITIONAL_3DS_ACTION`: THREE_DS_AUTHENTICATION event stream.
                 */
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

                /**
                 * Returns an immutable instance of [CreateAuthRuleRequestProgramLevel].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```kotlin
                 * .programLevel()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): CreateAuthRuleRequestProgramLevel =
                    CreateAuthRuleRequestProgramLevel(
                        checkRequired("programLevel", programLevel),
                        (excludedCardTokens ?: JsonMissing.of()).map { it.toImmutable() },
                        name,
                        parameters,
                        type,
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): CreateAuthRuleRequestProgramLevel = apply {
                if (validated) {
                    return@apply
                }

                programLevel()
                excludedCardTokens()
                name()
                parameters()?.validate()
                type()?.validate()
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
                (if (programLevel.asKnown() == null) 0 else 1) +
                    (excludedCardTokens.asKnown()?.size ?: 0) +
                    (if (name.asKnown() == null) 0 else 1) +
                    (parameters.asKnown()?.validity() ?: 0) +
                    (type.asKnown()?.validity() ?: 0)

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

                fun asMerchantLock(): MerchantLockParameters =
                    merchantLock.getOrThrow("merchantLock")

                fun asConditional3dsAction(): Conditional3dsActionParameters =
                    conditional3dsAction.getOrThrow("conditional3dsAction")

                fun _json(): JsonValue? = _json

                fun <T> accept(visitor: Visitor<T>): T =
                    when {
                        conditionalBlock != null -> visitor.visitConditionalBlock(conditionalBlock)
                        velocityLimitParams != null ->
                            visitor.visitVelocityLimitParams(velocityLimitParams)
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

                    fun ofConditional3dsAction(
                        conditional3dsAction: Conditional3dsActionParameters
                    ) = Parameters(conditional3dsAction = conditional3dsAction)
                }

                /**
                 * An interface that defines how to map each variant of [Parameters] to a value of
                 * type [T].
                 */
                interface Visitor<out T> {

                    fun visitConditionalBlock(conditionalBlock: ConditionalBlockParameters): T

                    fun visitVelocityLimitParams(velocityLimitParams: VelocityLimitParams): T

                    fun visitMerchantLock(merchantLock: MerchantLockParameters): T

                    fun visitConditional3dsAction(
                        conditional3dsAction: Conditional3dsActionParameters
                    ): T

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

                        val bestMatches =
                            sequenceOf(
                                    tryDeserialize(
                                            node,
                                            jacksonTypeRef<ConditionalBlockParameters>(),
                                        )
                                        ?.let { Parameters(conditionalBlock = it, _json = json) },
                                    tryDeserialize(node, jacksonTypeRef<VelocityLimitParams>())
                                        ?.let {
                                            Parameters(velocityLimitParams = it, _json = json)
                                        },
                                    tryDeserialize(node, jacksonTypeRef<MerchantLockParameters>())
                                        ?.let { Parameters(merchantLock = it, _json = json) },
                                    tryDeserialize(
                                            node,
                                            jacksonTypeRef<Conditional3dsActionParameters>(),
                                        )
                                        ?.let {
                                            Parameters(conditional3dsAction = it, _json = json)
                                        },
                                )
                                .filterNotNull()
                                .allMaxBy { it.validity() }
                                .toList()
                        return when (bestMatches.size) {
                            // This can happen if what we're deserializing is completely
                            // incompatible with all the possible variants (e.g. deserializing from
                            // boolean).
                            0 -> Parameters(_json = json)
                            1 -> bestMatches.single()
                            // If there's more than one match with the highest validity, then use
                            // the first completely valid match, or simply the first match if none
                            // are completely valid.
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
                            value.conditionalBlock != null ->
                                generator.writeObject(value.conditionalBlock)
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
                     * A list of merchant locks defining specific merchants or groups of merchants
                     * (based on descriptors or IDs) that the lock applies to.
                     *
                     * @throws LithicInvalidDataException if the JSON field has an unexpected type
                     *   or is unexpectedly missing or null (e.g. if the server responded with an
                     *   unexpected value).
                     */
                    fun merchants(): List<Merchant> = merchants.getRequired("merchants")

                    /**
                     * Returns the raw JSON value of [merchants].
                     *
                     * Unlike [merchants], this method doesn't throw if the JSON field has an
                     * unexpected type.
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
                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        internal fun from(merchantLockParameters: MerchantLockParameters) = apply {
                            merchants = merchantLockParameters.merchants.map { it.toMutableList() }
                            additionalProperties =
                                merchantLockParameters.additionalProperties.toMutableMap()
                        }

                        /**
                         * A list of merchant locks defining specific merchants or groups of
                         * merchants (based on descriptors or IDs) that the lock applies to.
                         */
                        fun merchants(merchants: List<Merchant>) =
                            merchants(JsonField.of(merchants))

                        /**
                         * Sets [Builder.merchants] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.merchants] with a well-typed
                         * `List<Merchant>` value instead. This method is primarily for setting the
                         * field to an undocumented or not yet supported value.
                         */
                        fun merchants(merchants: JsonField<List<Merchant>>) = apply {
                            this.merchants = merchants.map { it.toMutableList() }
                        }

                        /**
                         * Adds a single [Merchant] to [merchants].
                         *
                         * @throws IllegalStateException if the field was previously set to a
                         *   non-list.
                         */
                        fun addMerchant(merchant: Merchant) = apply {
                            merchants =
                                (merchants ?: JsonField.of(mutableListOf())).also {
                                    checkKnown("merchants", it).add(merchant)
                                }
                        }

                        fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                            apply {
                                this.additionalProperties.clear()
                                putAllAdditionalProperties(additionalProperties)
                            }

                        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                            additionalProperties.put(key, value)
                        }

                        fun putAllAdditionalProperties(
                            additionalProperties: Map<String, JsonValue>
                        ) = apply { this.additionalProperties.putAll(additionalProperties) }

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
                     * Represents a specific merchant lock based on their ID or descriptor. Each
                     * merchant object allows transaction rules to work at a granular level and
                     * requires at least one of merchant_id or descriptor.
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
                         * A comment or explanation about the merchant, used internally for rule
                         * management purposes.
                         *
                         * @throws LithicInvalidDataException if the JSON field has an unexpected
                         *   type (e.g. if the server responded with an unexpected value).
                         */
                        fun comment(): String? = comment.getNullable("comment")

                        /**
                         * Short description of the merchant, often used to provide more
                         * human-readable context about the transaction merchant. This is typically
                         * the name or label shown on transaction summaries.
                         *
                         * @throws LithicInvalidDataException if the JSON field has an unexpected
                         *   type (e.g. if the server responded with an unexpected value).
                         */
                        fun descriptor(): String? = descriptor.getNullable("descriptor")

                        /**
                         * Unique alphanumeric identifier for the payment card acceptor (merchant).
                         * This attribute specifies the merchant entity that will be locked or
                         * referenced for authorization rules.
                         *
                         * @throws LithicInvalidDataException if the JSON field has an unexpected
                         *   type (e.g. if the server responded with an unexpected value).
                         */
                        fun merchantId(): String? = merchantId.getNullable("merchant_id")

                        /**
                         * Returns the raw JSON value of [comment].
                         *
                         * Unlike [comment], this method doesn't throw if the JSON field has an
                         * unexpected type.
                         */
                        @JsonProperty("comment")
                        @ExcludeMissing
                        fun _comment(): JsonField<String> = comment

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

                            /**
                             * Returns a mutable builder for constructing an instance of [Merchant].
                             */
                            fun builder() = Builder()
                        }

                        /** A builder for [Merchant]. */
                        class Builder internal constructor() {

                            private var comment: JsonField<String> = JsonMissing.of()
                            private var descriptor: JsonField<String> = JsonMissing.of()
                            private var merchantId: JsonField<String> = JsonMissing.of()
                            private var additionalProperties: MutableMap<String, JsonValue> =
                                mutableMapOf()

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
                             * You should usually call [Builder.comment] with a well-typed [String]
                             * value instead. This method is primarily for setting the field to an
                             * undocumented or not yet supported value.
                             */
                            fun comment(comment: JsonField<String>) = apply {
                                this.comment = comment
                            }

                            /**
                             * Short description of the merchant, often used to provide more
                             * human-readable context about the transaction merchant. This is
                             * typically the name or label shown on transaction summaries.
                             */
                            fun descriptor(descriptor: String) =
                                descriptor(JsonField.of(descriptor))

                            /**
                             * Sets [Builder.descriptor] to an arbitrary JSON value.
                             *
                             * You should usually call [Builder.descriptor] with a well-typed
                             * [String] value instead. This method is primarily for setting the
                             * field to an undocumented or not yet supported value.
                             */
                            fun descriptor(descriptor: JsonField<String>) = apply {
                                this.descriptor = descriptor
                            }

                            /**
                             * Unique alphanumeric identifier for the payment card acceptor
                             * (merchant). This attribute specifies the merchant entity that will be
                             * locked or referenced for authorization rules.
                             */
                            fun merchantId(merchantId: String) =
                                merchantId(JsonField.of(merchantId))

                            /**
                             * Sets [Builder.merchantId] to an arbitrary JSON value.
                             *
                             * You should usually call [Builder.merchantId] with a well-typed
                             * [String] value instead. This method is primarily for setting the
                             * field to an undocumented or not yet supported value.
                             */
                            fun merchantId(merchantId: JsonField<String>) = apply {
                                this.merchantId = merchantId
                            }

                            fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                                apply {
                                    this.additionalProperties.clear()
                                    putAllAdditionalProperties(additionalProperties)
                                }

                            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                                additionalProperties.put(key, value)
                            }

                            fun putAllAdditionalProperties(
                                additionalProperties: Map<String, JsonValue>
                            ) = apply { this.additionalProperties.putAll(additionalProperties) }

                            fun removeAdditionalProperty(key: String) = apply {
                                additionalProperties.remove(key)
                            }

                            fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                                keys.forEach(::removeAdditionalProperty)
                            }

                            /**
                             * Returns an immutable instance of [Merchant].
                             *
                             * Further updates to this [Builder] will not mutate the returned
                             * instance.
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
                         * Returns a score indicating how many valid values are contained in this
                         * object recursively.
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
                     * @throws LithicInvalidDataException if the JSON field has an unexpected type
                     *   or is unexpectedly missing or null (e.g. if the server responded with an
                     *   unexpected value).
                     */
                    fun action(): Action = action.getRequired("action")

                    /**
                     * @throws LithicInvalidDataException if the JSON field has an unexpected type
                     *   or is unexpectedly missing or null (e.g. if the server responded with an
                     *   unexpected value).
                     */
                    fun conditions(): List<Condition> = conditions.getRequired("conditions")

                    /**
                     * Returns the raw JSON value of [action].
                     *
                     * Unlike [action], this method doesn't throw if the JSON field has an
                     * unexpected type.
                     */
                    @JsonProperty("action")
                    @ExcludeMissing
                    fun _action(): JsonField<Action> = action

                    /**
                     * Returns the raw JSON value of [conditions].
                     *
                     * Unlike [conditions], this method doesn't throw if the JSON field has an
                     * unexpected type.
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
                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        internal fun from(
                            conditional3dsActionParameters: Conditional3dsActionParameters
                        ) = apply {
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
                         * instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun action(action: JsonField<Action>) = apply { this.action = action }

                        fun conditions(conditions: List<Condition>) =
                            conditions(JsonField.of(conditions))

                        /**
                         * Sets [Builder.conditions] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.conditions] with a well-typed
                         * `List<Condition>` value instead. This method is primarily for setting the
                         * field to an undocumented or not yet supported value.
                         */
                        fun conditions(conditions: JsonField<List<Condition>>) = apply {
                            this.conditions = conditions.map { it.toMutableList() }
                        }

                        /**
                         * Adds a single [Condition] to [conditions].
                         *
                         * @throws IllegalStateException if the field was previously set to a
                         *   non-list.
                         */
                        fun addCondition(condition: Condition) = apply {
                            conditions =
                                (conditions ?: JsonField.of(mutableListOf())).also {
                                    checkKnown("conditions", it).add(condition)
                                }
                        }

                        fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                            apply {
                                this.additionalProperties.clear()
                                putAllAdditionalProperties(additionalProperties)
                            }

                        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                            additionalProperties.put(key, value)
                        }

                        fun putAllAdditionalProperties(
                            additionalProperties: Map<String, JsonValue>
                        ) = apply { this.additionalProperties.putAll(additionalProperties) }

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
                    class Action
                    @JsonCreator
                    private constructor(private val value: JsonField<String>) : Enum {

                        /**
                         * Returns this class instance's raw value.
                         *
                         * This is usually only useful if this instance was deserialized from data
                         * that doesn't match any known member, and you want to know that value. For
                         * example, if the SDK is on an older version than the API, then the API may
                         * respond with new members that the SDK is unaware of.
                         */
                        @com.fasterxml.jackson.annotation.JsonValue
                        fun _value(): JsonField<String> = value

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
                         * An enum containing [Action]'s known values, as well as an [_UNKNOWN]
                         * member.
                         *
                         * An instance of [Action] can contain an unknown value in a couple of
                         * cases:
                         * - It was deserialized from data that doesn't match any known member. For
                         *   example, if the SDK is on an older version than the API, then the API
                         *   may respond with new members that the SDK is unaware of.
                         * - It was constructed with an arbitrary value using the [of] method.
                         */
                        enum class Value {
                            DECLINE,
                            CHALLENGE,
                            /**
                             * An enum member indicating that [Action] was instantiated with an
                             * unknown value.
                             */
                            _UNKNOWN,
                        }

                        /**
                         * Returns an enum member corresponding to this class instance's value, or
                         * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                         *
                         * Use the [known] method instead if you're certain the value is always
                         * known or if you want to throw for the unknown case.
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
                         * Use the [value] method instead if you're uncertain the value is always
                         * known and don't want to throw for the unknown case.
                         *
                         * @throws LithicInvalidDataException if this class instance's value is a
                         *   not a known member.
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
                         * This differs from the [toString] method because that method is primarily
                         * for debugging and generally doesn't throw.
                         *
                         * @throws LithicInvalidDataException if this class instance's value does
                         *   not have the expected primitive type.
                         */
                        fun asString(): String =
                            _value().asString()
                                ?: throw LithicInvalidDataException("Value is not a String")

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
                         * Returns a score indicating how many valid values are contained in this
                         * object recursively.
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
                         * - `MCC`: A four-digit number listed in ISO 18245. An MCC is used to
                         *   classify a business by the types of goods or services it provides.
                         * - `COUNTRY`: Country of entity of card acceptor. Possible values are: (1)
                         *   all ISO 3166-1 alpha-3 country codes, (2) QZZ for Kosovo, and (3) ANT
                         *   for Netherlands Antilles.
                         * - `CURRENCY`: 3-character alphabetic ISO 4217 code for the merchant
                         *   currency of the transaction.
                         * - `MERCHANT_ID`: Unique alphanumeric identifier for the payment card
                         *   acceptor (merchant).
                         * - `DESCRIPTOR`: Short description of card acceptor.
                         * - `TRANSACTION_AMOUNT`: The base transaction amount (in cents) plus the
                         *   acquirer fee field in the settlement/cardholder billing currency. This
                         *   is the amount the issuer should authorize against unless the issuer is
                         *   paying the acquirer fee on behalf of the cardholder.
                         * - `RISK_SCORE`: Network-provided score assessing risk level associated
                         *   with a given authentication. Scores are on a range of 0-999, with 0
                         *   representing the lowest risk and 999 representing the highest risk. For
                         *   Visa transactions, where the raw score has a range of 0-99, Lithic will
                         *   normalize the score by multiplying the raw score by 10x.
                         * - `MESSAGE_CATEGORY`: The category of the authentication being processed.
                         *
                         * @throws LithicInvalidDataException if the JSON field has an unexpected
                         *   type (e.g. if the server responded with an unexpected value).
                         */
                        fun attribute(): Attribute? = attribute.getNullable("attribute")

                        /**
                         * The operation to apply to the attribute
                         *
                         * @throws LithicInvalidDataException if the JSON field has an unexpected
                         *   type (e.g. if the server responded with an unexpected value).
                         */
                        fun operation(): Operation? = operation.getNullable("operation")

                        /**
                         * A regex string, to be used with `MATCHES` or `DOES_NOT_MATCH`
                         *
                         * @throws LithicInvalidDataException if the JSON field has an unexpected
                         *   type (e.g. if the server responded with an unexpected value).
                         */
                        fun value(): Value? = value.getNullable("value")

                        /**
                         * Returns the raw JSON value of [attribute].
                         *
                         * Unlike [attribute], this method doesn't throw if the JSON field has an
                         * unexpected type.
                         */
                        @JsonProperty("attribute")
                        @ExcludeMissing
                        fun _attribute(): JsonField<Attribute> = attribute

                        /**
                         * Returns the raw JSON value of [operation].
                         *
                         * Unlike [operation], this method doesn't throw if the JSON field has an
                         * unexpected type.
                         */
                        @JsonProperty("operation")
                        @ExcludeMissing
                        fun _operation(): JsonField<Operation> = operation

                        /**
                         * Returns the raw JSON value of [value].
                         *
                         * Unlike [value], this method doesn't throw if the JSON field has an
                         * unexpected type.
                         */
                        @JsonProperty("value")
                        @ExcludeMissing
                        fun _value(): JsonField<Value> = value

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
                             * [Condition].
                             */
                            fun builder() = Builder()
                        }

                        /** A builder for [Condition]. */
                        class Builder internal constructor() {

                            private var attribute: JsonField<Attribute> = JsonMissing.of()
                            private var operation: JsonField<Operation> = JsonMissing.of()
                            private var value: JsonField<Value> = JsonMissing.of()
                            private var additionalProperties: MutableMap<String, JsonValue> =
                                mutableMapOf()

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
                             * - `MCC`: A four-digit number listed in ISO 18245. An MCC is used to
                             *   classify a business by the types of goods or services it provides.
                             * - `COUNTRY`: Country of entity of card acceptor. Possible values are:
                             *   (1) all ISO 3166-1 alpha-3 country codes, (2) QZZ for Kosovo, and
                             *   (3) ANT for Netherlands Antilles.
                             * - `CURRENCY`: 3-character alphabetic ISO 4217 code for the merchant
                             *   currency of the transaction.
                             * - `MERCHANT_ID`: Unique alphanumeric identifier for the payment card
                             *   acceptor (merchant).
                             * - `DESCRIPTOR`: Short description of card acceptor.
                             * - `TRANSACTION_AMOUNT`: The base transaction amount (in cents) plus
                             *   the acquirer fee field in the settlement/cardholder billing
                             *   currency. This is the amount the issuer should authorize against
                             *   unless the issuer is paying the acquirer fee on behalf of the
                             *   cardholder.
                             * - `RISK_SCORE`: Network-provided score assessing risk level
                             *   associated with a given authentication. Scores are on a range of
                             *   0-999, with 0 representing the lowest risk and 999 representing the
                             *   highest risk. For Visa transactions, where the raw score has a
                             *   range of 0-99, Lithic will normalize the score by multiplying the
                             *   raw score by 10x.
                             * - `MESSAGE_CATEGORY`: The category of the authentication being
                             *   processed.
                             */
                            fun attribute(attribute: Attribute) = attribute(JsonField.of(attribute))

                            /**
                             * Sets [Builder.attribute] to an arbitrary JSON value.
                             *
                             * You should usually call [Builder.attribute] with a well-typed
                             * [Attribute] value instead. This method is primarily for setting the
                             * field to an undocumented or not yet supported value.
                             */
                            fun attribute(attribute: JsonField<Attribute>) = apply {
                                this.attribute = attribute
                            }

                            /** The operation to apply to the attribute */
                            fun operation(operation: Operation) = operation(JsonField.of(operation))

                            /**
                             * Sets [Builder.operation] to an arbitrary JSON value.
                             *
                             * You should usually call [Builder.operation] with a well-typed
                             * [Operation] value instead. This method is primarily for setting the
                             * field to an undocumented or not yet supported value.
                             */
                            fun operation(operation: JsonField<Operation>) = apply {
                                this.operation = operation
                            }

                            /** A regex string, to be used with `MATCHES` or `DOES_NOT_MATCH` */
                            fun value(value: Value) = value(JsonField.of(value))

                            /**
                             * Sets [Builder.value] to an arbitrary JSON value.
                             *
                             * You should usually call [Builder.value] with a well-typed [Value]
                             * value instead. This method is primarily for setting the field to an
                             * undocumented or not yet supported value.
                             */
                            fun value(value: JsonField<Value>) = apply { this.value = value }

                            /** Alias for calling [value] with `Value.ofRegex(regex)`. */
                            fun value(regex: String) = value(Value.ofRegex(regex))

                            /** Alias for calling [value] with `Value.ofNumber(number)`. */
                            fun value(number: Long) = value(Value.ofNumber(number))

                            /**
                             * Alias for calling [value] with
                             * `Value.ofListOfStrings(listOfStrings)`.
                             */
                            fun valueOfListOfStrings(listOfStrings: List<String>) =
                                value(Value.ofListOfStrings(listOfStrings))

                            fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                                apply {
                                    this.additionalProperties.clear()
                                    putAllAdditionalProperties(additionalProperties)
                                }

                            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                                additionalProperties.put(key, value)
                            }

                            fun putAllAdditionalProperties(
                                additionalProperties: Map<String, JsonValue>
                            ) = apply { this.additionalProperties.putAll(additionalProperties) }

                            fun removeAdditionalProperty(key: String) = apply {
                                additionalProperties.remove(key)
                            }

                            fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                                keys.forEach(::removeAdditionalProperty)
                            }

                            /**
                             * Returns an immutable instance of [Condition].
                             *
                             * Further updates to this [Builder] will not mutate the returned
                             * instance.
                             */
                            fun build(): Condition =
                                Condition(
                                    attribute,
                                    operation,
                                    value,
                                    additionalProperties.toMutableMap(),
                                )
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
                         * Returns a score indicating how many valid values are contained in this
                         * object recursively.
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
                         * - `MCC`: A four-digit number listed in ISO 18245. An MCC is used to
                         *   classify a business by the types of goods or services it provides.
                         * - `COUNTRY`: Country of entity of card acceptor. Possible values are: (1)
                         *   all ISO 3166-1 alpha-3 country codes, (2) QZZ for Kosovo, and (3) ANT
                         *   for Netherlands Antilles.
                         * - `CURRENCY`: 3-character alphabetic ISO 4217 code for the merchant
                         *   currency of the transaction.
                         * - `MERCHANT_ID`: Unique alphanumeric identifier for the payment card
                         *   acceptor (merchant).
                         * - `DESCRIPTOR`: Short description of card acceptor.
                         * - `TRANSACTION_AMOUNT`: The base transaction amount (in cents) plus the
                         *   acquirer fee field in the settlement/cardholder billing currency. This
                         *   is the amount the issuer should authorize against unless the issuer is
                         *   paying the acquirer fee on behalf of the cardholder.
                         * - `RISK_SCORE`: Network-provided score assessing risk level associated
                         *   with a given authentication. Scores are on a range of 0-999, with 0
                         *   representing the lowest risk and 999 representing the highest risk. For
                         *   Visa transactions, where the raw score has a range of 0-99, Lithic will
                         *   normalize the score by multiplying the raw score by 10x.
                         * - `MESSAGE_CATEGORY`: The category of the authentication being processed.
                         */
                        class Attribute
                        @JsonCreator
                        private constructor(private val value: JsonField<String>) : Enum {

                            /**
                             * Returns this class instance's raw value.
                             *
                             * This is usually only useful if this instance was deserialized from
                             * data that doesn't match any known member, and you want to know that
                             * value. For example, if the SDK is on an older version than the API,
                             * then the API may respond with new members that the SDK is unaware of.
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
                             * An enum containing [Attribute]'s known values, as well as an
                             * [_UNKNOWN] member.
                             *
                             * An instance of [Attribute] can contain an unknown value in a couple
                             * of cases:
                             * - It was deserialized from data that doesn't match any known member.
                             *   For example, if the SDK is on an older version than the API, then
                             *   the API may respond with new members that the SDK is unaware of.
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
                                 * An enum member indicating that [Attribute] was instantiated with
                                 * an unknown value.
                                 */
                                _UNKNOWN,
                            }

                            /**
                             * Returns an enum member corresponding to this class instance's value,
                             * or [Value._UNKNOWN] if the class was instantiated with an unknown
                             * value.
                             *
                             * Use the [known] method instead if you're certain the value is always
                             * known or if you want to throw for the unknown case.
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
                             * Use the [value] method instead if you're uncertain the value is
                             * always known and don't want to throw for the unknown case.
                             *
                             * @throws LithicInvalidDataException if this class instance's value is
                             *   a not a known member.
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
                                    else ->
                                        throw LithicInvalidDataException(
                                            "Unknown Attribute: $value"
                                        )
                                }

                            /**
                             * Returns this class instance's primitive wire representation.
                             *
                             * This differs from the [toString] method because that method is
                             * primarily for debugging and generally doesn't throw.
                             *
                             * @throws LithicInvalidDataException if this class instance's value
                             *   does not have the expected primitive type.
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
                             * Returns a score indicating how many valid values are contained in
                             * this object recursively.
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
                             * This is usually only useful if this instance was deserialized from
                             * data that doesn't match any known member, and you want to know that
                             * value. For example, if the SDK is on an older version than the API,
                             * then the API may respond with new members that the SDK is unaware of.
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
                             * An enum containing [Operation]'s known values, as well as an
                             * [_UNKNOWN] member.
                             *
                             * An instance of [Operation] can contain an unknown value in a couple
                             * of cases:
                             * - It was deserialized from data that doesn't match any known member.
                             *   For example, if the SDK is on an older version than the API, then
                             *   the API may respond with new members that the SDK is unaware of.
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
                                 * An enum member indicating that [Operation] was instantiated with
                                 * an unknown value.
                                 */
                                _UNKNOWN,
                            }

                            /**
                             * Returns an enum member corresponding to this class instance's value,
                             * or [Value._UNKNOWN] if the class was instantiated with an unknown
                             * value.
                             *
                             * Use the [known] method instead if you're certain the value is always
                             * known or if you want to throw for the unknown case.
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
                             * Use the [value] method instead if you're uncertain the value is
                             * always known and don't want to throw for the unknown case.
                             *
                             * @throws LithicInvalidDataException if this class instance's value is
                             *   a not a known member.
                             */
                            fun known(): Known =
                                when (this) {
                                    IS_ONE_OF -> Known.IS_ONE_OF
                                    IS_NOT_ONE_OF -> Known.IS_NOT_ONE_OF
                                    MATCHES -> Known.MATCHES
                                    DOES_NOT_MATCH -> Known.DOES_NOT_MATCH
                                    IS_GREATER_THAN -> Known.IS_GREATER_THAN
                                    IS_LESS_THAN -> Known.IS_LESS_THAN
                                    else ->
                                        throw LithicInvalidDataException(
                                            "Unknown Operation: $value"
                                        )
                                }

                            /**
                             * Returns this class instance's primitive wire representation.
                             *
                             * This differs from the [toString] method because that method is
                             * primarily for debugging and generally doesn't throw.
                             *
                             * @throws LithicInvalidDataException if this class instance's value
                             *   does not have the expected primitive type.
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
                             * Returns a score indicating how many valid values are contained in
                             * this object recursively.
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

                            /**
                             * An array of strings, to be used with `IS_ONE_OF` or `IS_NOT_ONE_OF`
                             */
                            fun listOfStrings(): List<String>? = listOfStrings

                            fun isRegex(): Boolean = regex != null

                            fun isNumber(): Boolean = number != null

                            fun isListOfStrings(): Boolean = listOfStrings != null

                            /** A regex string, to be used with `MATCHES` or `DOES_NOT_MATCH` */
                            fun asRegex(): String = regex.getOrThrow("regex")

                            /** A number, to be used with `IS_GREATER_THAN` or `IS_LESS_THAN` */
                            fun asNumber(): Long = number.getOrThrow("number")

                            /**
                             * An array of strings, to be used with `IS_ONE_OF` or `IS_NOT_ONE_OF`
                             */
                            fun asListOfStrings(): List<String> =
                                listOfStrings.getOrThrow("listOfStrings")

                            fun _json(): JsonValue? = _json

                            fun <T> accept(visitor: Visitor<T>): T =
                                when {
                                    regex != null -> visitor.visitRegex(regex)
                                    number != null -> visitor.visitNumber(number)
                                    listOfStrings != null ->
                                        visitor.visitListOfStrings(listOfStrings)
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

                                        override fun visitListOfStrings(
                                            listOfStrings: List<String>
                                        ) {}
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
                             * Returns a score indicating how many valid values are contained in
                             * this object recursively.
                             *
                             * Used for best match union deserialization.
                             */
                            internal fun validity(): Int =
                                accept(
                                    object : Visitor<Int> {
                                        override fun visitRegex(regex: String) = 1

                                        override fun visitNumber(number: Long) = 1

                                        override fun visitListOfStrings(
                                            listOfStrings: List<String>
                                        ) = listOfStrings.size

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

                                /**
                                 * An array of strings, to be used with `IS_ONE_OF` or
                                 * `IS_NOT_ONE_OF`
                                 */
                                fun ofListOfStrings(listOfStrings: List<String>) =
                                    Value(listOfStrings = listOfStrings)
                            }

                            /**
                             * An interface that defines how to map each variant of [Value] to a
                             * value of type [T].
                             */
                            interface Visitor<out T> {

                                /** A regex string, to be used with `MATCHES` or `DOES_NOT_MATCH` */
                                fun visitRegex(regex: String): T

                                /** A number, to be used with `IS_GREATER_THAN` or `IS_LESS_THAN` */
                                fun visitNumber(number: Long): T

                                /**
                                 * An array of strings, to be used with `IS_ONE_OF` or
                                 * `IS_NOT_ONE_OF`
                                 */
                                fun visitListOfStrings(listOfStrings: List<String>): T

                                /**
                                 * Maps an unknown variant of [Value] to a value of type [T].
                                 *
                                 * An instance of [Value] can contain an unknown variant if it was
                                 * deserialized from data that doesn't match any known variant. For
                                 * example, if the SDK is on an older version than the API, then the
                                 * API may respond with new variants that the SDK is unaware of.
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
                                                tryDeserialize(node, jacksonTypeRef<String>())
                                                    ?.let { Value(regex = it, _json = json) },
                                                tryDeserialize(node, jacksonTypeRef<Long>())?.let {
                                                    Value(number = it, _json = json)
                                                },
                                                tryDeserialize(node, jacksonTypeRef<List<String>>())
                                                    ?.let {
                                                        Value(listOfStrings = it, _json = json)
                                                    },
                                            )
                                            .filterNotNull()
                                            .allMaxBy { it.validity() }
                                            .toList()
                                    return when (bestMatches.size) {
                                        // This can happen if what we're deserializing is completely
                                        // incompatible with all the possible variants (e.g.
                                        // deserializing from object).
                                        0 -> Value(_json = json)
                                        1 -> bestMatches.single()
                                        // If there's more than one match with the highest validity,
                                        // then use the first completely valid match, or simply the
                                        // first match if none are completely valid.
                                        else ->
                                            bestMatches.firstOrNull { it.isValid() }
                                                ?: bestMatches.first()
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

            /**
             * The type of Auth Rule. Effectively determines the event stream during which it will
             * be evaluated.
             * - `CONDITIONAL_BLOCK`: AUTHORIZATION event stream.
             * - `VELOCITY_LIMIT`: AUTHORIZATION event stream.
             * - `MERCHANT_LOCK`: AUTHORIZATION event stream.
             * - `CONDITIONAL_3DS_ACTION`: THREE_DS_AUTHENTICATION event stream.
             */
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

                    val MERCHANT_LOCK = of("MERCHANT_LOCK")

                    val CONDITIONAL_3DS_ACTION = of("CONDITIONAL_3DS_ACTION")

                    fun of(value: String) = AuthRuleType(JsonField.of(value))
                }

                /** An enum containing [AuthRuleType]'s known values. */
                enum class Known {
                    CONDITIONAL_BLOCK,
                    VELOCITY_LIMIT,
                    MERCHANT_LOCK,
                    CONDITIONAL_3DS_ACTION,
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
                    MERCHANT_LOCK,
                    CONDITIONAL_3DS_ACTION,
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
                        MERCHANT_LOCK -> Value.MERCHANT_LOCK
                        CONDITIONAL_3DS_ACTION -> Value.CONDITIONAL_3DS_ACTION
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
                        MERCHANT_LOCK -> Known.MERCHANT_LOCK
                        CONDITIONAL_3DS_ACTION -> Known.CONDITIONAL_3DS_ACTION
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

                private var validated: Boolean = false

                fun validate(): AuthRuleType = apply {
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
