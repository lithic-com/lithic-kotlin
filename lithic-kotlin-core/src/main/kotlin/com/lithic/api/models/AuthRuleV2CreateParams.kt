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
import com.lithic.api.core.http.Headers
import com.lithic.api.core.http.QueryParams
import com.lithic.api.core.toImmutable
import com.lithic.api.errors.LithicInvalidDataException
import java.util.Objects

class AuthRuleV2CreateParams
constructor(
    private val createAuthRuleRequestAccountTokens: CreateAuthRuleRequestAccountTokens?,
    private val createAuthRuleRequestCardTokens: CreateAuthRuleRequestCardTokens?,
    private val createAuthRuleRequestProgramLevel: CreateAuthRuleRequestProgramLevel?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) {

    fun createAuthRuleRequestAccountTokens(): CreateAuthRuleRequestAccountTokens? =
        createAuthRuleRequestAccountTokens

    fun createAuthRuleRequestCardTokens(): CreateAuthRuleRequestCardTokens? =
        createAuthRuleRequestCardTokens

    fun createAuthRuleRequestProgramLevel(): CreateAuthRuleRequestProgramLevel? =
        createAuthRuleRequestProgramLevel

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    internal fun getBody(): AuthRuleV2CreateBody {
        return AuthRuleV2CreateBody(
            createAuthRuleRequestAccountTokens,
            createAuthRuleRequestCardTokens,
            createAuthRuleRequestProgramLevel,
        )
    }

    internal fun getHeaders(): Headers = additionalHeaders

    internal fun getQueryParams(): QueryParams = additionalQueryParams

    @JsonDeserialize(using = AuthRuleV2CreateBody.Deserializer::class)
    @JsonSerialize(using = AuthRuleV2CreateBody.Serializer::class)
    class AuthRuleV2CreateBody
    internal constructor(
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

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is AuthRuleV2CreateBody && createAuthRuleRequestAccountTokens == other.createAuthRuleRequestAccountTokens && createAuthRuleRequestCardTokens == other.createAuthRuleRequestCardTokens && createAuthRuleRequestProgramLevel == other.createAuthRuleRequestProgramLevel /* spotless:on */
        }

        override fun hashCode(): Int = /* spotless:off */ Objects.hash(createAuthRuleRequestAccountTokens, createAuthRuleRequestCardTokens, createAuthRuleRequestProgramLevel) /* spotless:on */

        override fun toString(): String =
            when {
                createAuthRuleRequestAccountTokens != null ->
                    "AuthRuleV2CreateBody{createAuthRuleRequestAccountTokens=$createAuthRuleRequestAccountTokens}"
                createAuthRuleRequestCardTokens != null ->
                    "AuthRuleV2CreateBody{createAuthRuleRequestCardTokens=$createAuthRuleRequestCardTokens}"
                createAuthRuleRequestProgramLevel != null ->
                    "AuthRuleV2CreateBody{createAuthRuleRequestProgramLevel=$createAuthRuleRequestProgramLevel}"
                _json != null -> "AuthRuleV2CreateBody{_unknown=$_json}"
                else -> throw IllegalStateException("Invalid AuthRuleV2CreateBody")
            }

        companion object {

            fun ofCreateAuthRuleRequestAccountTokens(
                createAuthRuleRequestAccountTokens: CreateAuthRuleRequestAccountTokens
            ) =
                AuthRuleV2CreateBody(
                    createAuthRuleRequestAccountTokens = createAuthRuleRequestAccountTokens
                )

            fun ofCreateAuthRuleRequestCardTokens(
                createAuthRuleRequestCardTokens: CreateAuthRuleRequestCardTokens
            ) =
                AuthRuleV2CreateBody(
                    createAuthRuleRequestCardTokens = createAuthRuleRequestCardTokens
                )

            fun ofCreateAuthRuleRequestProgramLevel(
                createAuthRuleRequestProgramLevel: CreateAuthRuleRequestProgramLevel
            ) =
                AuthRuleV2CreateBody(
                    createAuthRuleRequestProgramLevel = createAuthRuleRequestProgramLevel
                )
        }

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

            fun unknown(json: JsonValue?): T {
                throw LithicInvalidDataException("Unknown AuthRuleV2CreateBody: $json")
            }
        }

        class Deserializer : BaseDeserializer<AuthRuleV2CreateBody>(AuthRuleV2CreateBody::class) {

            override fun ObjectCodec.deserialize(node: JsonNode): AuthRuleV2CreateBody {
                val json = JsonValue.fromJsonNode(node)

                tryDeserialize(node, jacksonTypeRef<CreateAuthRuleRequestAccountTokens>())?.let {
                    return AuthRuleV2CreateBody(
                        createAuthRuleRequestAccountTokens = it,
                        _json = json
                    )
                }
                tryDeserialize(node, jacksonTypeRef<CreateAuthRuleRequestCardTokens>())?.let {
                    return AuthRuleV2CreateBody(createAuthRuleRequestCardTokens = it, _json = json)
                }
                tryDeserialize(node, jacksonTypeRef<CreateAuthRuleRequestProgramLevel>())?.let {
                    return AuthRuleV2CreateBody(
                        createAuthRuleRequestProgramLevel = it,
                        _json = json
                    )
                }

                return AuthRuleV2CreateBody(_json = json)
            }
        }

        class Serializer : BaseSerializer<AuthRuleV2CreateBody>(AuthRuleV2CreateBody::class) {

            override fun serialize(
                value: AuthRuleV2CreateBody,
                generator: JsonGenerator,
                provider: SerializerProvider
            ) {
                when {
                    value.createAuthRuleRequestAccountTokens != null ->
                        generator.writeObject(value.createAuthRuleRequestAccountTokens)
                    value.createAuthRuleRequestCardTokens != null ->
                        generator.writeObject(value.createAuthRuleRequestCardTokens)
                    value.createAuthRuleRequestProgramLevel != null ->
                        generator.writeObject(value.createAuthRuleRequestProgramLevel)
                    value._json != null -> generator.writeObject(value._json)
                    else -> throw IllegalStateException("Invalid AuthRuleV2CreateBody")
                }
            }
        }
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var createAuthRuleRequestAccountTokens: CreateAuthRuleRequestAccountTokens? = null
        private var createAuthRuleRequestCardTokens: CreateAuthRuleRequestCardTokens? = null
        private var createAuthRuleRequestProgramLevel: CreateAuthRuleRequestProgramLevel? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        internal fun from(authRuleV2CreateParams: AuthRuleV2CreateParams) = apply {
            createAuthRuleRequestAccountTokens =
                authRuleV2CreateParams.createAuthRuleRequestAccountTokens
            createAuthRuleRequestCardTokens = authRuleV2CreateParams.createAuthRuleRequestCardTokens
            createAuthRuleRequestProgramLevel =
                authRuleV2CreateParams.createAuthRuleRequestProgramLevel
            additionalHeaders = authRuleV2CreateParams.additionalHeaders.toBuilder()
            additionalQueryParams = authRuleV2CreateParams.additionalQueryParams.toBuilder()
        }

        fun forCreateAuthRuleRequestAccountTokens(
            createAuthRuleRequestAccountTokens: CreateAuthRuleRequestAccountTokens
        ) = apply {
            this.createAuthRuleRequestAccountTokens = createAuthRuleRequestAccountTokens
            this.createAuthRuleRequestCardTokens = null
            this.createAuthRuleRequestProgramLevel = null
        }

        fun forCreateAuthRuleRequestCardTokens(
            createAuthRuleRequestCardTokens: CreateAuthRuleRequestCardTokens
        ) = apply {
            this.createAuthRuleRequestAccountTokens = null
            this.createAuthRuleRequestCardTokens = createAuthRuleRequestCardTokens
            this.createAuthRuleRequestProgramLevel = null
        }

        fun forCreateAuthRuleRequestProgramLevel(
            createAuthRuleRequestProgramLevel: CreateAuthRuleRequestProgramLevel
        ) = apply {
            this.createAuthRuleRequestAccountTokens = null
            this.createAuthRuleRequestCardTokens = null
            this.createAuthRuleRequestProgramLevel = createAuthRuleRequestProgramLevel
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

        fun build(): AuthRuleV2CreateParams =
            AuthRuleV2CreateParams(
                createAuthRuleRequestAccountTokens,
                createAuthRuleRequestCardTokens,
                createAuthRuleRequestProgramLevel,
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    @JsonDeserialize(builder = CreateAuthRuleRequestAccountTokens.Builder::class)
    @NoAutoDetect
    class CreateAuthRuleRequestAccountTokens
    private constructor(
        private val accountTokens: List<String>?,
        private val type: AuthRuleType?,
        private val parameters: Parameters?,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        /** Account tokens to which the Auth Rule applies. */
        @JsonProperty("account_tokens") fun accountTokens(): List<String>? = accountTokens

        /** The type of Auth Rule */
        @JsonProperty("type") fun type(): AuthRuleType? = type

        /** Parameters for the current version of the Auth Rule */
        @JsonProperty("parameters") fun parameters(): Parameters? = parameters

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var accountTokens: List<String>? = null
            private var type: AuthRuleType? = null
            private var parameters: Parameters? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(
                createAuthRuleRequestAccountTokens: CreateAuthRuleRequestAccountTokens
            ) = apply {
                this.accountTokens = createAuthRuleRequestAccountTokens.accountTokens
                this.type = createAuthRuleRequestAccountTokens.type
                this.parameters = createAuthRuleRequestAccountTokens.parameters
                additionalProperties(createAuthRuleRequestAccountTokens.additionalProperties)
            }

            /** Account tokens to which the Auth Rule applies. */
            @JsonProperty("account_tokens")
            fun accountTokens(accountTokens: List<String>) = apply {
                this.accountTokens = accountTokens
            }

            /** The type of Auth Rule */
            @JsonProperty("type") fun type(type: AuthRuleType) = apply { this.type = type }

            /** Parameters for the current version of the Auth Rule */
            @JsonProperty("parameters")
            fun parameters(parameters: Parameters) = apply { this.parameters = parameters }

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

            fun build(): CreateAuthRuleRequestAccountTokens =
                CreateAuthRuleRequestAccountTokens(
                    checkNotNull(accountTokens) { "`accountTokens` is required but was not set" }
                        .toImmutable(),
                    type,
                    parameters,
                    additionalProperties.toImmutable(),
                )
        }

        @JsonDeserialize(using = Parameters.Deserializer::class)
        @JsonSerialize(using = Parameters.Serializer::class)
        class Parameters
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

            fun validate(): Parameters = apply {
                if (!validated) {
                    if (conditionalBlockParameters == null && velocityLimitParams == null) {
                        throw LithicInvalidDataException("Unknown Parameters: $_json")
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

                return /* spotless:off */ other is Parameters && conditionalBlockParameters == other.conditionalBlockParameters && velocityLimitParams == other.velocityLimitParams /* spotless:on */
            }

            override fun hashCode(): Int = /* spotless:off */ Objects.hash(conditionalBlockParameters, velocityLimitParams) /* spotless:on */

            override fun toString(): String =
                when {
                    conditionalBlockParameters != null ->
                        "Parameters{conditionalBlockParameters=$conditionalBlockParameters}"
                    velocityLimitParams != null ->
                        "Parameters{velocityLimitParams=$velocityLimitParams}"
                    _json != null -> "Parameters{_unknown=$_json}"
                    else -> throw IllegalStateException("Invalid Parameters")
                }

            companion object {

                fun ofConditionalBlockParameters(
                    conditionalBlockParameters: ConditionalBlockParameters
                ) = Parameters(conditionalBlockParameters = conditionalBlockParameters)

                fun ofVelocityLimitParams(velocityLimitParams: VelocityLimitParams) =
                    Parameters(velocityLimitParams = velocityLimitParams)
            }

            interface Visitor<out T> {

                fun visitConditionalBlockParameters(
                    conditionalBlockParameters: ConditionalBlockParameters
                ): T

                fun visitVelocityLimitParams(velocityLimitParams: VelocityLimitParams): T

                fun unknown(json: JsonValue?): T {
                    throw LithicInvalidDataException("Unknown Parameters: $json")
                }
            }

            class Deserializer : BaseDeserializer<Parameters>(Parameters::class) {

                override fun ObjectCodec.deserialize(node: JsonNode): Parameters {
                    val json = JsonValue.fromJsonNode(node)

                    tryDeserialize(node, jacksonTypeRef<ConditionalBlockParameters>()) {
                            it.validate()
                        }
                        ?.let {
                            return Parameters(conditionalBlockParameters = it, _json = json)
                        }
                    tryDeserialize(node, jacksonTypeRef<VelocityLimitParams>()) { it.validate() }
                        ?.let {
                            return Parameters(velocityLimitParams = it, _json = json)
                        }

                    return Parameters(_json = json)
                }
            }

            class Serializer : BaseSerializer<Parameters>(Parameters::class) {

                override fun serialize(
                    value: Parameters,
                    generator: JsonGenerator,
                    provider: SerializerProvider
                ) {
                    when {
                        value.conditionalBlockParameters != null ->
                            generator.writeObject(value.conditionalBlockParameters)
                        value.velocityLimitParams != null ->
                            generator.writeObject(value.velocityLimitParams)
                        value._json != null -> generator.writeObject(value._json)
                        else -> throw IllegalStateException("Invalid Parameters")
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
                            conditions.map { it.toImmutable() },
                            additionalProperties.toImmutable()
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

                    /**
                     * The attribute to target.
                     *
                     * The following attributes may be targeted:
                     * - `MCC`: A four-digit number listed in ISO 18245. An MCC is used to classify
                     *   a business by the types of goods or services it provides.
                     * - `COUNTRY`: Country of entity of card acceptor. Possible values are: (1) all
                     *   ISO 3166-1 alpha-3 country codes, (2) QZZ for Kosovo, and (3) ANT for
                     *   Netherlands Antilles.
                     * - `CURRENCY`: 3-digit alphabetic ISO 4217 code for the merchant currency of
                     *   the transaction.
                     * - `MERCHANT_ID`: Unique alphanumeric identifier for the payment card acceptor
                     *   (merchant).
                     * - `DESCRIPTOR`: Short description of card acceptor.
                     * - `LIABILITY_SHIFT`: Indicates whether chargeback liability shift to the
                     *   issuer applies to the transaction. Valid values are `NONE`,
                     *   `3DS_AUTHENTICATED`, or `TOKEN_AUTHENTICATED`.
                     * - `PAN_ENTRY_MODE`: The method by which the cardholder's primary account
                     *   number (PAN) was entered. Valid values are `AUTO_ENTRY`, `BAR_CODE`,
                     *   `CONTACTLESS`, `ECOMMERCE`, `ERROR_KEYED`, `ERROR_MAGNETIC_STRIPE`, `ICC`,
                     *   `KEY_ENTERED`, `MAGNETIC_STRIPE`, `MANUAL`, `OCR`, `SECURE_CARDLESS`,
                     *   `UNSPECIFIED`, `UNKNOWN`, `CREDENTIAL_ON_FILE`, or `ECOMMERCE`.
                     * - `TRANSACTION_AMOUNT`: The base transaction amount (in cents) plus the
                     *   acquirer fee field in the settlement/cardholder billing currency. This is
                     *   the amount the issuer should authorize against unless the issuer is paying
                     *   the acquirer fee on behalf of the cardholder.
                     * - `RISK_SCORE`: Network-provided score assessing risk level associated with a
                     *   given authorization. Scores are on a range of 0-999, with 0 representing
                     *   the lowest risk and 999 representing the highest risk. For Visa
                     *   transactions, where the raw score has a range of 0-99, Lithic will
                     *   normalize the score by multiplying the raw score by 10x.
                     */
                    fun attribute(): Attribute? = attribute.getNullable("attribute")

                    /** The operation to apply to the attribute */
                    fun operation(): Operation? = operation.getNullable("operation")

                    /** A regex string, to be used with `MATCHES` or `DOES_NOT_MATCH` */
                    fun value(): Value? = value.getNullable("value")

                    /**
                     * The attribute to target.
                     *
                     * The following attributes may be targeted:
                     * - `MCC`: A four-digit number listed in ISO 18245. An MCC is used to classify
                     *   a business by the types of goods or services it provides.
                     * - `COUNTRY`: Country of entity of card acceptor. Possible values are: (1) all
                     *   ISO 3166-1 alpha-3 country codes, (2) QZZ for Kosovo, and (3) ANT for
                     *   Netherlands Antilles.
                     * - `CURRENCY`: 3-digit alphabetic ISO 4217 code for the merchant currency of
                     *   the transaction.
                     * - `MERCHANT_ID`: Unique alphanumeric identifier for the payment card acceptor
                     *   (merchant).
                     * - `DESCRIPTOR`: Short description of card acceptor.
                     * - `LIABILITY_SHIFT`: Indicates whether chargeback liability shift to the
                     *   issuer applies to the transaction. Valid values are `NONE`,
                     *   `3DS_AUTHENTICATED`, or `TOKEN_AUTHENTICATED`.
                     * - `PAN_ENTRY_MODE`: The method by which the cardholder's primary account
                     *   number (PAN) was entered. Valid values are `AUTO_ENTRY`, `BAR_CODE`,
                     *   `CONTACTLESS`, `ECOMMERCE`, `ERROR_KEYED`, `ERROR_MAGNETIC_STRIPE`, `ICC`,
                     *   `KEY_ENTERED`, `MAGNETIC_STRIPE`, `MANUAL`, `OCR`, `SECURE_CARDLESS`,
                     *   `UNSPECIFIED`, `UNKNOWN`, `CREDENTIAL_ON_FILE`, or `ECOMMERCE`.
                     * - `TRANSACTION_AMOUNT`: The base transaction amount (in cents) plus the
                     *   acquirer fee field in the settlement/cardholder billing currency. This is
                     *   the amount the issuer should authorize against unless the issuer is paying
                     *   the acquirer fee on behalf of the cardholder.
                     * - `RISK_SCORE`: Network-provided score assessing risk level associated with a
                     *   given authorization. Scores are on a range of 0-999, with 0 representing
                     *   the lowest risk and 999 representing the highest risk. For Visa
                     *   transactions, where the raw score has a range of 0-99, Lithic will
                     *   normalize the score by multiplying the raw score by 10x.
                     */
                    @JsonProperty("attribute") @ExcludeMissing fun _attribute() = attribute

                    /** The operation to apply to the attribute */
                    @JsonProperty("operation") @ExcludeMissing fun _operation() = operation

                    /** A regex string, to be used with `MATCHES` or `DOES_NOT_MATCH` */
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

                        /**
                         * The attribute to target.
                         *
                         * The following attributes may be targeted:
                         * - `MCC`: A four-digit number listed in ISO 18245. An MCC is used to
                         *   classify a business by the types of goods or services it provides.
                         * - `COUNTRY`: Country of entity of card acceptor. Possible values are: (1)
                         *   all ISO 3166-1 alpha-3 country codes, (2) QZZ for Kosovo, and (3) ANT
                         *   for Netherlands Antilles.
                         * - `CURRENCY`: 3-digit alphabetic ISO 4217 code for the merchant currency
                         *   of the transaction.
                         * - `MERCHANT_ID`: Unique alphanumeric identifier for the payment card
                         *   acceptor (merchant).
                         * - `DESCRIPTOR`: Short description of card acceptor.
                         * - `LIABILITY_SHIFT`: Indicates whether chargeback liability shift to the
                         *   issuer applies to the transaction. Valid values are `NONE`,
                         *   `3DS_AUTHENTICATED`, or `TOKEN_AUTHENTICATED`.
                         * - `PAN_ENTRY_MODE`: The method by which the cardholder's primary account
                         *   number (PAN) was entered. Valid values are `AUTO_ENTRY`, `BAR_CODE`,
                         *   `CONTACTLESS`, `ECOMMERCE`, `ERROR_KEYED`, `ERROR_MAGNETIC_STRIPE`,
                         *   `ICC`, `KEY_ENTERED`, `MAGNETIC_STRIPE`, `MANUAL`, `OCR`,
                         *   `SECURE_CARDLESS`, `UNSPECIFIED`, `UNKNOWN`, `CREDENTIAL_ON_FILE`, or
                         *   `ECOMMERCE`.
                         * - `TRANSACTION_AMOUNT`: The base transaction amount (in cents) plus the
                         *   acquirer fee field in the settlement/cardholder billing currency. This
                         *   is the amount the issuer should authorize against unless the issuer is
                         *   paying the acquirer fee on behalf of the cardholder.
                         * - `RISK_SCORE`: Network-provided score assessing risk level associated
                         *   with a given authorization. Scores are on a range of 0-999, with 0
                         *   representing the lowest risk and 999 representing the highest risk. For
                         *   Visa transactions, where the raw score has a range of 0-99, Lithic will
                         *   normalize the score by multiplying the raw score by 10x.
                         */
                        fun attribute(attribute: Attribute) = attribute(JsonField.of(attribute))

                        /**
                         * The attribute to target.
                         *
                         * The following attributes may be targeted:
                         * - `MCC`: A four-digit number listed in ISO 18245. An MCC is used to
                         *   classify a business by the types of goods or services it provides.
                         * - `COUNTRY`: Country of entity of card acceptor. Possible values are: (1)
                         *   all ISO 3166-1 alpha-3 country codes, (2) QZZ for Kosovo, and (3) ANT
                         *   for Netherlands Antilles.
                         * - `CURRENCY`: 3-digit alphabetic ISO 4217 code for the merchant currency
                         *   of the transaction.
                         * - `MERCHANT_ID`: Unique alphanumeric identifier for the payment card
                         *   acceptor (merchant).
                         * - `DESCRIPTOR`: Short description of card acceptor.
                         * - `LIABILITY_SHIFT`: Indicates whether chargeback liability shift to the
                         *   issuer applies to the transaction. Valid values are `NONE`,
                         *   `3DS_AUTHENTICATED`, or `TOKEN_AUTHENTICATED`.
                         * - `PAN_ENTRY_MODE`: The method by which the cardholder's primary account
                         *   number (PAN) was entered. Valid values are `AUTO_ENTRY`, `BAR_CODE`,
                         *   `CONTACTLESS`, `ECOMMERCE`, `ERROR_KEYED`, `ERROR_MAGNETIC_STRIPE`,
                         *   `ICC`, `KEY_ENTERED`, `MAGNETIC_STRIPE`, `MANUAL`, `OCR`,
                         *   `SECURE_CARDLESS`, `UNSPECIFIED`, `UNKNOWN`, `CREDENTIAL_ON_FILE`, or
                         *   `ECOMMERCE`.
                         * - `TRANSACTION_AMOUNT`: The base transaction amount (in cents) plus the
                         *   acquirer fee field in the settlement/cardholder billing currency. This
                         *   is the amount the issuer should authorize against unless the issuer is
                         *   paying the acquirer fee on behalf of the cardholder.
                         * - `RISK_SCORE`: Network-provided score assessing risk level associated
                         *   with a given authorization. Scores are on a range of 0-999, with 0
                         *   representing the lowest risk and 999 representing the highest risk. For
                         *   Visa transactions, where the raw score has a range of 0-99, Lithic will
                         *   normalize the score by multiplying the raw score by 10x.
                         */
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

                        /** A regex string, to be used with `MATCHES` or `DOES_NOT_MATCH` */
                        fun value(value: Value) = value(JsonField.of(value))

                        /** A regex string, to be used with `MATCHES` or `DOES_NOT_MATCH` */
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
                                additionalProperties.toImmutable(),
                            )
                    }

                    class Attribute
                    @JsonCreator
                    private constructor(
                        private val value: JsonField<String>,
                    ) : Enum {

                        @com.fasterxml.jackson.annotation.JsonValue
                        fun _value(): JsonField<String> = value

                        companion object {

                            val MCC = of("MCC")

                            val COUNTRY = of("COUNTRY")

                            val CURRENCY = of("CURRENCY")

                            val MERCHANT_ID = of("MERCHANT_ID")

                            val DESCRIPTOR = of("DESCRIPTOR")

                            val LIABILITY_SHIFT = of("LIABILITY_SHIFT")

                            val PAN_ENTRY_MODE = of("PAN_ENTRY_MODE")

                            val TRANSACTION_AMOUNT = of("TRANSACTION_AMOUNT")

                            val RISK_SCORE = of("RISK_SCORE")

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

                        override fun equals(other: Any?): Boolean {
                            if (this === other) {
                                return true
                            }

                            return /* spotless:off */ other is Attribute && value == other.value /* spotless:on */
                        }

                        override fun hashCode() = value.hashCode()

                        override fun toString() = value.toString()
                    }

                    class Operation
                    @JsonCreator
                    private constructor(
                        private val value: JsonField<String>,
                    ) : Enum {

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

                        override fun equals(other: Any?): Boolean {
                            if (this === other) {
                                return true
                            }

                            return /* spotless:off */ other is Operation && value == other.value /* spotless:on */
                        }

                        override fun hashCode() = value.hashCode()

                        override fun toString() = value.toString()
                    }

                    @JsonDeserialize(using = Value.Deserializer::class)
                    @JsonSerialize(using = Value.Serializer::class)
                    class Value
                    private constructor(
                        private val string: String? = null,
                        private val long: Long? = null,
                        private val strings: List<String>? = null,
                        private val _json: JsonValue? = null,
                    ) {

                        private var validated: Boolean = false

                        /** A regex string, to be used with `MATCHES` or `DOES_NOT_MATCH` */
                        fun string(): String? = string
                        /** A number, to be used with `IS_GREATER_THAN` or `IS_LESS_THAN` */
                        fun long(): Long? = long
                        /** An array of strings, to be used with `IS_ONE_OF` or `IS_NOT_ONE_OF` */
                        fun strings(): List<String>? = strings

                        fun isString(): Boolean = string != null

                        fun isLong(): Boolean = long != null

                        fun isStrings(): Boolean = strings != null

                        fun asString(): String = string.getOrThrow("string")

                        fun asLong(): Long = long.getOrThrow("long")

                        fun asStrings(): List<String> = strings.getOrThrow("strings")

                        fun _json(): JsonValue? = _json

                        fun <T> accept(visitor: Visitor<T>): T {
                            return when {
                                string != null -> visitor.visitString(string)
                                long != null -> visitor.visitLong(long)
                                strings != null -> visitor.visitStrings(strings)
                                else -> visitor.unknown(_json)
                            }
                        }

                        fun validate(): Value = apply {
                            if (!validated) {
                                if (string == null && long == null && strings == null) {
                                    throw LithicInvalidDataException("Unknown Value: $_json")
                                }
                                validated = true
                            }
                        }

                        override fun equals(other: Any?): Boolean {
                            if (this === other) {
                                return true
                            }

                            return /* spotless:off */ other is Value && string == other.string && long == other.long && strings == other.strings /* spotless:on */
                        }

                        override fun hashCode(): Int = /* spotless:off */ Objects.hash(string, long, strings) /* spotless:on */

                        override fun toString(): String =
                            when {
                                string != null -> "Value{string=$string}"
                                long != null -> "Value{long=$long}"
                                strings != null -> "Value{strings=$strings}"
                                _json != null -> "Value{_unknown=$_json}"
                                else -> throw IllegalStateException("Invalid Value")
                            }

                        companion object {

                            fun ofString(string: String) = Value(string = string)

                            fun ofLong(long: Long) = Value(long = long)

                            fun ofStrings(strings: List<String>) = Value(strings = strings)
                        }

                        interface Visitor<out T> {

                            fun visitString(string: String): T

                            fun visitLong(long: Long): T

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
                                tryDeserialize(node, jacksonTypeRef<Long>())?.let {
                                    return Value(long = it, _json = json)
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
                                    value.long != null -> generator.writeObject(value.long)
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

                    return /* spotless:off */ other is ConditionalBlockParameters && conditions == other.conditions && additionalProperties == other.additionalProperties /* spotless:on */
                }

                /* spotless:off */
                private val hashCode: Int by lazy { Objects.hash(conditions, additionalProperties) }
                /* spotless:on */

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "ConditionalBlockParameters{conditions=$conditions, additionalProperties=$additionalProperties}"
            }
        }

        class AuthRuleType
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) : Enum {

            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                val CONDITIONAL_BLOCK = of("CONDITIONAL_BLOCK")

                val VELOCITY_LIMIT = of("VELOCITY_LIMIT")

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

            return /* spotless:off */ other is CreateAuthRuleRequestAccountTokens && accountTokens == other.accountTokens && type == other.type && parameters == other.parameters && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(accountTokens, type, parameters, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "CreateAuthRuleRequestAccountTokens{accountTokens=$accountTokens, type=$type, parameters=$parameters, additionalProperties=$additionalProperties}"
    }

    @JsonDeserialize(builder = CreateAuthRuleRequestCardTokens.Builder::class)
    @NoAutoDetect
    class CreateAuthRuleRequestCardTokens
    private constructor(
        private val cardTokens: List<String>?,
        private val type: AuthRuleType?,
        private val parameters: Parameters?,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        /** Card tokens to which the Auth Rule applies. */
        @JsonProperty("card_tokens") fun cardTokens(): List<String>? = cardTokens

        /** The type of Auth Rule */
        @JsonProperty("type") fun type(): AuthRuleType? = type

        /** Parameters for the current version of the Auth Rule */
        @JsonProperty("parameters") fun parameters(): Parameters? = parameters

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var cardTokens: List<String>? = null
            private var type: AuthRuleType? = null
            private var parameters: Parameters? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(createAuthRuleRequestCardTokens: CreateAuthRuleRequestCardTokens) =
                apply {
                    this.cardTokens = createAuthRuleRequestCardTokens.cardTokens
                    this.type = createAuthRuleRequestCardTokens.type
                    this.parameters = createAuthRuleRequestCardTokens.parameters
                    additionalProperties(createAuthRuleRequestCardTokens.additionalProperties)
                }

            /** Card tokens to which the Auth Rule applies. */
            @JsonProperty("card_tokens")
            fun cardTokens(cardTokens: List<String>) = apply { this.cardTokens = cardTokens }

            /** The type of Auth Rule */
            @JsonProperty("type") fun type(type: AuthRuleType) = apply { this.type = type }

            /** Parameters for the current version of the Auth Rule */
            @JsonProperty("parameters")
            fun parameters(parameters: Parameters) = apply { this.parameters = parameters }

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

            fun build(): CreateAuthRuleRequestCardTokens =
                CreateAuthRuleRequestCardTokens(
                    checkNotNull(cardTokens) { "`cardTokens` is required but was not set" }
                        .toImmutable(),
                    type,
                    parameters,
                    additionalProperties.toImmutable(),
                )
        }

        @JsonDeserialize(using = Parameters.Deserializer::class)
        @JsonSerialize(using = Parameters.Serializer::class)
        class Parameters
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

            fun validate(): Parameters = apply {
                if (!validated) {
                    if (conditionalBlockParameters == null && velocityLimitParams == null) {
                        throw LithicInvalidDataException("Unknown Parameters: $_json")
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

                return /* spotless:off */ other is Parameters && conditionalBlockParameters == other.conditionalBlockParameters && velocityLimitParams == other.velocityLimitParams /* spotless:on */
            }

            override fun hashCode(): Int = /* spotless:off */ Objects.hash(conditionalBlockParameters, velocityLimitParams) /* spotless:on */

            override fun toString(): String =
                when {
                    conditionalBlockParameters != null ->
                        "Parameters{conditionalBlockParameters=$conditionalBlockParameters}"
                    velocityLimitParams != null ->
                        "Parameters{velocityLimitParams=$velocityLimitParams}"
                    _json != null -> "Parameters{_unknown=$_json}"
                    else -> throw IllegalStateException("Invalid Parameters")
                }

            companion object {

                fun ofConditionalBlockParameters(
                    conditionalBlockParameters: ConditionalBlockParameters
                ) = Parameters(conditionalBlockParameters = conditionalBlockParameters)

                fun ofVelocityLimitParams(velocityLimitParams: VelocityLimitParams) =
                    Parameters(velocityLimitParams = velocityLimitParams)
            }

            interface Visitor<out T> {

                fun visitConditionalBlockParameters(
                    conditionalBlockParameters: ConditionalBlockParameters
                ): T

                fun visitVelocityLimitParams(velocityLimitParams: VelocityLimitParams): T

                fun unknown(json: JsonValue?): T {
                    throw LithicInvalidDataException("Unknown Parameters: $json")
                }
            }

            class Deserializer : BaseDeserializer<Parameters>(Parameters::class) {

                override fun ObjectCodec.deserialize(node: JsonNode): Parameters {
                    val json = JsonValue.fromJsonNode(node)

                    tryDeserialize(node, jacksonTypeRef<ConditionalBlockParameters>()) {
                            it.validate()
                        }
                        ?.let {
                            return Parameters(conditionalBlockParameters = it, _json = json)
                        }
                    tryDeserialize(node, jacksonTypeRef<VelocityLimitParams>()) { it.validate() }
                        ?.let {
                            return Parameters(velocityLimitParams = it, _json = json)
                        }

                    return Parameters(_json = json)
                }
            }

            class Serializer : BaseSerializer<Parameters>(Parameters::class) {

                override fun serialize(
                    value: Parameters,
                    generator: JsonGenerator,
                    provider: SerializerProvider
                ) {
                    when {
                        value.conditionalBlockParameters != null ->
                            generator.writeObject(value.conditionalBlockParameters)
                        value.velocityLimitParams != null ->
                            generator.writeObject(value.velocityLimitParams)
                        value._json != null -> generator.writeObject(value._json)
                        else -> throw IllegalStateException("Invalid Parameters")
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
                            conditions.map { it.toImmutable() },
                            additionalProperties.toImmutable()
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

                    /**
                     * The attribute to target.
                     *
                     * The following attributes may be targeted:
                     * - `MCC`: A four-digit number listed in ISO 18245. An MCC is used to classify
                     *   a business by the types of goods or services it provides.
                     * - `COUNTRY`: Country of entity of card acceptor. Possible values are: (1) all
                     *   ISO 3166-1 alpha-3 country codes, (2) QZZ for Kosovo, and (3) ANT for
                     *   Netherlands Antilles.
                     * - `CURRENCY`: 3-digit alphabetic ISO 4217 code for the merchant currency of
                     *   the transaction.
                     * - `MERCHANT_ID`: Unique alphanumeric identifier for the payment card acceptor
                     *   (merchant).
                     * - `DESCRIPTOR`: Short description of card acceptor.
                     * - `LIABILITY_SHIFT`: Indicates whether chargeback liability shift to the
                     *   issuer applies to the transaction. Valid values are `NONE`,
                     *   `3DS_AUTHENTICATED`, or `TOKEN_AUTHENTICATED`.
                     * - `PAN_ENTRY_MODE`: The method by which the cardholder's primary account
                     *   number (PAN) was entered. Valid values are `AUTO_ENTRY`, `BAR_CODE`,
                     *   `CONTACTLESS`, `ECOMMERCE`, `ERROR_KEYED`, `ERROR_MAGNETIC_STRIPE`, `ICC`,
                     *   `KEY_ENTERED`, `MAGNETIC_STRIPE`, `MANUAL`, `OCR`, `SECURE_CARDLESS`,
                     *   `UNSPECIFIED`, `UNKNOWN`, `CREDENTIAL_ON_FILE`, or `ECOMMERCE`.
                     * - `TRANSACTION_AMOUNT`: The base transaction amount (in cents) plus the
                     *   acquirer fee field in the settlement/cardholder billing currency. This is
                     *   the amount the issuer should authorize against unless the issuer is paying
                     *   the acquirer fee on behalf of the cardholder.
                     * - `RISK_SCORE`: Network-provided score assessing risk level associated with a
                     *   given authorization. Scores are on a range of 0-999, with 0 representing
                     *   the lowest risk and 999 representing the highest risk. For Visa
                     *   transactions, where the raw score has a range of 0-99, Lithic will
                     *   normalize the score by multiplying the raw score by 10x.
                     */
                    fun attribute(): Attribute? = attribute.getNullable("attribute")

                    /** The operation to apply to the attribute */
                    fun operation(): Operation? = operation.getNullable("operation")

                    /** A regex string, to be used with `MATCHES` or `DOES_NOT_MATCH` */
                    fun value(): Value? = value.getNullable("value")

                    /**
                     * The attribute to target.
                     *
                     * The following attributes may be targeted:
                     * - `MCC`: A four-digit number listed in ISO 18245. An MCC is used to classify
                     *   a business by the types of goods or services it provides.
                     * - `COUNTRY`: Country of entity of card acceptor. Possible values are: (1) all
                     *   ISO 3166-1 alpha-3 country codes, (2) QZZ for Kosovo, and (3) ANT for
                     *   Netherlands Antilles.
                     * - `CURRENCY`: 3-digit alphabetic ISO 4217 code for the merchant currency of
                     *   the transaction.
                     * - `MERCHANT_ID`: Unique alphanumeric identifier for the payment card acceptor
                     *   (merchant).
                     * - `DESCRIPTOR`: Short description of card acceptor.
                     * - `LIABILITY_SHIFT`: Indicates whether chargeback liability shift to the
                     *   issuer applies to the transaction. Valid values are `NONE`,
                     *   `3DS_AUTHENTICATED`, or `TOKEN_AUTHENTICATED`.
                     * - `PAN_ENTRY_MODE`: The method by which the cardholder's primary account
                     *   number (PAN) was entered. Valid values are `AUTO_ENTRY`, `BAR_CODE`,
                     *   `CONTACTLESS`, `ECOMMERCE`, `ERROR_KEYED`, `ERROR_MAGNETIC_STRIPE`, `ICC`,
                     *   `KEY_ENTERED`, `MAGNETIC_STRIPE`, `MANUAL`, `OCR`, `SECURE_CARDLESS`,
                     *   `UNSPECIFIED`, `UNKNOWN`, `CREDENTIAL_ON_FILE`, or `ECOMMERCE`.
                     * - `TRANSACTION_AMOUNT`: The base transaction amount (in cents) plus the
                     *   acquirer fee field in the settlement/cardholder billing currency. This is
                     *   the amount the issuer should authorize against unless the issuer is paying
                     *   the acquirer fee on behalf of the cardholder.
                     * - `RISK_SCORE`: Network-provided score assessing risk level associated with a
                     *   given authorization. Scores are on a range of 0-999, with 0 representing
                     *   the lowest risk and 999 representing the highest risk. For Visa
                     *   transactions, where the raw score has a range of 0-99, Lithic will
                     *   normalize the score by multiplying the raw score by 10x.
                     */
                    @JsonProperty("attribute") @ExcludeMissing fun _attribute() = attribute

                    /** The operation to apply to the attribute */
                    @JsonProperty("operation") @ExcludeMissing fun _operation() = operation

                    /** A regex string, to be used with `MATCHES` or `DOES_NOT_MATCH` */
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

                        /**
                         * The attribute to target.
                         *
                         * The following attributes may be targeted:
                         * - `MCC`: A four-digit number listed in ISO 18245. An MCC is used to
                         *   classify a business by the types of goods or services it provides.
                         * - `COUNTRY`: Country of entity of card acceptor. Possible values are: (1)
                         *   all ISO 3166-1 alpha-3 country codes, (2) QZZ for Kosovo, and (3) ANT
                         *   for Netherlands Antilles.
                         * - `CURRENCY`: 3-digit alphabetic ISO 4217 code for the merchant currency
                         *   of the transaction.
                         * - `MERCHANT_ID`: Unique alphanumeric identifier for the payment card
                         *   acceptor (merchant).
                         * - `DESCRIPTOR`: Short description of card acceptor.
                         * - `LIABILITY_SHIFT`: Indicates whether chargeback liability shift to the
                         *   issuer applies to the transaction. Valid values are `NONE`,
                         *   `3DS_AUTHENTICATED`, or `TOKEN_AUTHENTICATED`.
                         * - `PAN_ENTRY_MODE`: The method by which the cardholder's primary account
                         *   number (PAN) was entered. Valid values are `AUTO_ENTRY`, `BAR_CODE`,
                         *   `CONTACTLESS`, `ECOMMERCE`, `ERROR_KEYED`, `ERROR_MAGNETIC_STRIPE`,
                         *   `ICC`, `KEY_ENTERED`, `MAGNETIC_STRIPE`, `MANUAL`, `OCR`,
                         *   `SECURE_CARDLESS`, `UNSPECIFIED`, `UNKNOWN`, `CREDENTIAL_ON_FILE`, or
                         *   `ECOMMERCE`.
                         * - `TRANSACTION_AMOUNT`: The base transaction amount (in cents) plus the
                         *   acquirer fee field in the settlement/cardholder billing currency. This
                         *   is the amount the issuer should authorize against unless the issuer is
                         *   paying the acquirer fee on behalf of the cardholder.
                         * - `RISK_SCORE`: Network-provided score assessing risk level associated
                         *   with a given authorization. Scores are on a range of 0-999, with 0
                         *   representing the lowest risk and 999 representing the highest risk. For
                         *   Visa transactions, where the raw score has a range of 0-99, Lithic will
                         *   normalize the score by multiplying the raw score by 10x.
                         */
                        fun attribute(attribute: Attribute) = attribute(JsonField.of(attribute))

                        /**
                         * The attribute to target.
                         *
                         * The following attributes may be targeted:
                         * - `MCC`: A four-digit number listed in ISO 18245. An MCC is used to
                         *   classify a business by the types of goods or services it provides.
                         * - `COUNTRY`: Country of entity of card acceptor. Possible values are: (1)
                         *   all ISO 3166-1 alpha-3 country codes, (2) QZZ for Kosovo, and (3) ANT
                         *   for Netherlands Antilles.
                         * - `CURRENCY`: 3-digit alphabetic ISO 4217 code for the merchant currency
                         *   of the transaction.
                         * - `MERCHANT_ID`: Unique alphanumeric identifier for the payment card
                         *   acceptor (merchant).
                         * - `DESCRIPTOR`: Short description of card acceptor.
                         * - `LIABILITY_SHIFT`: Indicates whether chargeback liability shift to the
                         *   issuer applies to the transaction. Valid values are `NONE`,
                         *   `3DS_AUTHENTICATED`, or `TOKEN_AUTHENTICATED`.
                         * - `PAN_ENTRY_MODE`: The method by which the cardholder's primary account
                         *   number (PAN) was entered. Valid values are `AUTO_ENTRY`, `BAR_CODE`,
                         *   `CONTACTLESS`, `ECOMMERCE`, `ERROR_KEYED`, `ERROR_MAGNETIC_STRIPE`,
                         *   `ICC`, `KEY_ENTERED`, `MAGNETIC_STRIPE`, `MANUAL`, `OCR`,
                         *   `SECURE_CARDLESS`, `UNSPECIFIED`, `UNKNOWN`, `CREDENTIAL_ON_FILE`, or
                         *   `ECOMMERCE`.
                         * - `TRANSACTION_AMOUNT`: The base transaction amount (in cents) plus the
                         *   acquirer fee field in the settlement/cardholder billing currency. This
                         *   is the amount the issuer should authorize against unless the issuer is
                         *   paying the acquirer fee on behalf of the cardholder.
                         * - `RISK_SCORE`: Network-provided score assessing risk level associated
                         *   with a given authorization. Scores are on a range of 0-999, with 0
                         *   representing the lowest risk and 999 representing the highest risk. For
                         *   Visa transactions, where the raw score has a range of 0-99, Lithic will
                         *   normalize the score by multiplying the raw score by 10x.
                         */
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

                        /** A regex string, to be used with `MATCHES` or `DOES_NOT_MATCH` */
                        fun value(value: Value) = value(JsonField.of(value))

                        /** A regex string, to be used with `MATCHES` or `DOES_NOT_MATCH` */
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
                                additionalProperties.toImmutable(),
                            )
                    }

                    class Attribute
                    @JsonCreator
                    private constructor(
                        private val value: JsonField<String>,
                    ) : Enum {

                        @com.fasterxml.jackson.annotation.JsonValue
                        fun _value(): JsonField<String> = value

                        companion object {

                            val MCC = of("MCC")

                            val COUNTRY = of("COUNTRY")

                            val CURRENCY = of("CURRENCY")

                            val MERCHANT_ID = of("MERCHANT_ID")

                            val DESCRIPTOR = of("DESCRIPTOR")

                            val LIABILITY_SHIFT = of("LIABILITY_SHIFT")

                            val PAN_ENTRY_MODE = of("PAN_ENTRY_MODE")

                            val TRANSACTION_AMOUNT = of("TRANSACTION_AMOUNT")

                            val RISK_SCORE = of("RISK_SCORE")

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

                        override fun equals(other: Any?): Boolean {
                            if (this === other) {
                                return true
                            }

                            return /* spotless:off */ other is Attribute && value == other.value /* spotless:on */
                        }

                        override fun hashCode() = value.hashCode()

                        override fun toString() = value.toString()
                    }

                    class Operation
                    @JsonCreator
                    private constructor(
                        private val value: JsonField<String>,
                    ) : Enum {

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

                        override fun equals(other: Any?): Boolean {
                            if (this === other) {
                                return true
                            }

                            return /* spotless:off */ other is Operation && value == other.value /* spotless:on */
                        }

                        override fun hashCode() = value.hashCode()

                        override fun toString() = value.toString()
                    }

                    @JsonDeserialize(using = Value.Deserializer::class)
                    @JsonSerialize(using = Value.Serializer::class)
                    class Value
                    private constructor(
                        private val string: String? = null,
                        private val long: Long? = null,
                        private val strings: List<String>? = null,
                        private val _json: JsonValue? = null,
                    ) {

                        private var validated: Boolean = false

                        /** A regex string, to be used with `MATCHES` or `DOES_NOT_MATCH` */
                        fun string(): String? = string
                        /** A number, to be used with `IS_GREATER_THAN` or `IS_LESS_THAN` */
                        fun long(): Long? = long
                        /** An array of strings, to be used with `IS_ONE_OF` or `IS_NOT_ONE_OF` */
                        fun strings(): List<String>? = strings

                        fun isString(): Boolean = string != null

                        fun isLong(): Boolean = long != null

                        fun isStrings(): Boolean = strings != null

                        fun asString(): String = string.getOrThrow("string")

                        fun asLong(): Long = long.getOrThrow("long")

                        fun asStrings(): List<String> = strings.getOrThrow("strings")

                        fun _json(): JsonValue? = _json

                        fun <T> accept(visitor: Visitor<T>): T {
                            return when {
                                string != null -> visitor.visitString(string)
                                long != null -> visitor.visitLong(long)
                                strings != null -> visitor.visitStrings(strings)
                                else -> visitor.unknown(_json)
                            }
                        }

                        fun validate(): Value = apply {
                            if (!validated) {
                                if (string == null && long == null && strings == null) {
                                    throw LithicInvalidDataException("Unknown Value: $_json")
                                }
                                validated = true
                            }
                        }

                        override fun equals(other: Any?): Boolean {
                            if (this === other) {
                                return true
                            }

                            return /* spotless:off */ other is Value && string == other.string && long == other.long && strings == other.strings /* spotless:on */
                        }

                        override fun hashCode(): Int = /* spotless:off */ Objects.hash(string, long, strings) /* spotless:on */

                        override fun toString(): String =
                            when {
                                string != null -> "Value{string=$string}"
                                long != null -> "Value{long=$long}"
                                strings != null -> "Value{strings=$strings}"
                                _json != null -> "Value{_unknown=$_json}"
                                else -> throw IllegalStateException("Invalid Value")
                            }

                        companion object {

                            fun ofString(string: String) = Value(string = string)

                            fun ofLong(long: Long) = Value(long = long)

                            fun ofStrings(strings: List<String>) = Value(strings = strings)
                        }

                        interface Visitor<out T> {

                            fun visitString(string: String): T

                            fun visitLong(long: Long): T

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
                                tryDeserialize(node, jacksonTypeRef<Long>())?.let {
                                    return Value(long = it, _json = json)
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
                                    value.long != null -> generator.writeObject(value.long)
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

                    return /* spotless:off */ other is ConditionalBlockParameters && conditions == other.conditions && additionalProperties == other.additionalProperties /* spotless:on */
                }

                /* spotless:off */
                private val hashCode: Int by lazy { Objects.hash(conditions, additionalProperties) }
                /* spotless:on */

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "ConditionalBlockParameters{conditions=$conditions, additionalProperties=$additionalProperties}"
            }
        }

        class AuthRuleType
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) : Enum {

            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                val CONDITIONAL_BLOCK = of("CONDITIONAL_BLOCK")

                val VELOCITY_LIMIT = of("VELOCITY_LIMIT")

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

            return /* spotless:off */ other is CreateAuthRuleRequestCardTokens && cardTokens == other.cardTokens && type == other.type && parameters == other.parameters && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(cardTokens, type, parameters, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "CreateAuthRuleRequestCardTokens{cardTokens=$cardTokens, type=$type, parameters=$parameters, additionalProperties=$additionalProperties}"
    }

    @JsonDeserialize(builder = CreateAuthRuleRequestProgramLevel.Builder::class)
    @NoAutoDetect
    class CreateAuthRuleRequestProgramLevel
    private constructor(
        private val programLevel: Boolean?,
        private val type: AuthRuleType?,
        private val parameters: Parameters?,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        /** Whether the Auth Rule applies to all authorizations on the card program. */
        @JsonProperty("program_level") fun programLevel(): Boolean? = programLevel

        /** The type of Auth Rule */
        @JsonProperty("type") fun type(): AuthRuleType? = type

        /** Parameters for the current version of the Auth Rule */
        @JsonProperty("parameters") fun parameters(): Parameters? = parameters

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var programLevel: Boolean? = null
            private var type: AuthRuleType? = null
            private var parameters: Parameters? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(
                createAuthRuleRequestProgramLevel: CreateAuthRuleRequestProgramLevel
            ) = apply {
                this.programLevel = createAuthRuleRequestProgramLevel.programLevel
                this.type = createAuthRuleRequestProgramLevel.type
                this.parameters = createAuthRuleRequestProgramLevel.parameters
                additionalProperties(createAuthRuleRequestProgramLevel.additionalProperties)
            }

            /** Whether the Auth Rule applies to all authorizations on the card program. */
            @JsonProperty("program_level")
            fun programLevel(programLevel: Boolean) = apply { this.programLevel = programLevel }

            /** The type of Auth Rule */
            @JsonProperty("type") fun type(type: AuthRuleType) = apply { this.type = type }

            /** Parameters for the current version of the Auth Rule */
            @JsonProperty("parameters")
            fun parameters(parameters: Parameters) = apply { this.parameters = parameters }

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

            fun build(): CreateAuthRuleRequestProgramLevel =
                CreateAuthRuleRequestProgramLevel(
                    checkNotNull(programLevel) { "`programLevel` is required but was not set" },
                    type,
                    parameters,
                    additionalProperties.toImmutable(),
                )
        }

        @JsonDeserialize(using = Parameters.Deserializer::class)
        @JsonSerialize(using = Parameters.Serializer::class)
        class Parameters
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

            fun validate(): Parameters = apply {
                if (!validated) {
                    if (conditionalBlockParameters == null && velocityLimitParams == null) {
                        throw LithicInvalidDataException("Unknown Parameters: $_json")
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

                return /* spotless:off */ other is Parameters && conditionalBlockParameters == other.conditionalBlockParameters && velocityLimitParams == other.velocityLimitParams /* spotless:on */
            }

            override fun hashCode(): Int = /* spotless:off */ Objects.hash(conditionalBlockParameters, velocityLimitParams) /* spotless:on */

            override fun toString(): String =
                when {
                    conditionalBlockParameters != null ->
                        "Parameters{conditionalBlockParameters=$conditionalBlockParameters}"
                    velocityLimitParams != null ->
                        "Parameters{velocityLimitParams=$velocityLimitParams}"
                    _json != null -> "Parameters{_unknown=$_json}"
                    else -> throw IllegalStateException("Invalid Parameters")
                }

            companion object {

                fun ofConditionalBlockParameters(
                    conditionalBlockParameters: ConditionalBlockParameters
                ) = Parameters(conditionalBlockParameters = conditionalBlockParameters)

                fun ofVelocityLimitParams(velocityLimitParams: VelocityLimitParams) =
                    Parameters(velocityLimitParams = velocityLimitParams)
            }

            interface Visitor<out T> {

                fun visitConditionalBlockParameters(
                    conditionalBlockParameters: ConditionalBlockParameters
                ): T

                fun visitVelocityLimitParams(velocityLimitParams: VelocityLimitParams): T

                fun unknown(json: JsonValue?): T {
                    throw LithicInvalidDataException("Unknown Parameters: $json")
                }
            }

            class Deserializer : BaseDeserializer<Parameters>(Parameters::class) {

                override fun ObjectCodec.deserialize(node: JsonNode): Parameters {
                    val json = JsonValue.fromJsonNode(node)

                    tryDeserialize(node, jacksonTypeRef<ConditionalBlockParameters>()) {
                            it.validate()
                        }
                        ?.let {
                            return Parameters(conditionalBlockParameters = it, _json = json)
                        }
                    tryDeserialize(node, jacksonTypeRef<VelocityLimitParams>()) { it.validate() }
                        ?.let {
                            return Parameters(velocityLimitParams = it, _json = json)
                        }

                    return Parameters(_json = json)
                }
            }

            class Serializer : BaseSerializer<Parameters>(Parameters::class) {

                override fun serialize(
                    value: Parameters,
                    generator: JsonGenerator,
                    provider: SerializerProvider
                ) {
                    when {
                        value.conditionalBlockParameters != null ->
                            generator.writeObject(value.conditionalBlockParameters)
                        value.velocityLimitParams != null ->
                            generator.writeObject(value.velocityLimitParams)
                        value._json != null -> generator.writeObject(value._json)
                        else -> throw IllegalStateException("Invalid Parameters")
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
                            conditions.map { it.toImmutable() },
                            additionalProperties.toImmutable()
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

                    /**
                     * The attribute to target.
                     *
                     * The following attributes may be targeted:
                     * - `MCC`: A four-digit number listed in ISO 18245. An MCC is used to classify
                     *   a business by the types of goods or services it provides.
                     * - `COUNTRY`: Country of entity of card acceptor. Possible values are: (1) all
                     *   ISO 3166-1 alpha-3 country codes, (2) QZZ for Kosovo, and (3) ANT for
                     *   Netherlands Antilles.
                     * - `CURRENCY`: 3-digit alphabetic ISO 4217 code for the merchant currency of
                     *   the transaction.
                     * - `MERCHANT_ID`: Unique alphanumeric identifier for the payment card acceptor
                     *   (merchant).
                     * - `DESCRIPTOR`: Short description of card acceptor.
                     * - `LIABILITY_SHIFT`: Indicates whether chargeback liability shift to the
                     *   issuer applies to the transaction. Valid values are `NONE`,
                     *   `3DS_AUTHENTICATED`, or `TOKEN_AUTHENTICATED`.
                     * - `PAN_ENTRY_MODE`: The method by which the cardholder's primary account
                     *   number (PAN) was entered. Valid values are `AUTO_ENTRY`, `BAR_CODE`,
                     *   `CONTACTLESS`, `ECOMMERCE`, `ERROR_KEYED`, `ERROR_MAGNETIC_STRIPE`, `ICC`,
                     *   `KEY_ENTERED`, `MAGNETIC_STRIPE`, `MANUAL`, `OCR`, `SECURE_CARDLESS`,
                     *   `UNSPECIFIED`, `UNKNOWN`, `CREDENTIAL_ON_FILE`, or `ECOMMERCE`.
                     * - `TRANSACTION_AMOUNT`: The base transaction amount (in cents) plus the
                     *   acquirer fee field in the settlement/cardholder billing currency. This is
                     *   the amount the issuer should authorize against unless the issuer is paying
                     *   the acquirer fee on behalf of the cardholder.
                     * - `RISK_SCORE`: Network-provided score assessing risk level associated with a
                     *   given authorization. Scores are on a range of 0-999, with 0 representing
                     *   the lowest risk and 999 representing the highest risk. For Visa
                     *   transactions, where the raw score has a range of 0-99, Lithic will
                     *   normalize the score by multiplying the raw score by 10x.
                     */
                    fun attribute(): Attribute? = attribute.getNullable("attribute")

                    /** The operation to apply to the attribute */
                    fun operation(): Operation? = operation.getNullable("operation")

                    /** A regex string, to be used with `MATCHES` or `DOES_NOT_MATCH` */
                    fun value(): Value? = value.getNullable("value")

                    /**
                     * The attribute to target.
                     *
                     * The following attributes may be targeted:
                     * - `MCC`: A four-digit number listed in ISO 18245. An MCC is used to classify
                     *   a business by the types of goods or services it provides.
                     * - `COUNTRY`: Country of entity of card acceptor. Possible values are: (1) all
                     *   ISO 3166-1 alpha-3 country codes, (2) QZZ for Kosovo, and (3) ANT for
                     *   Netherlands Antilles.
                     * - `CURRENCY`: 3-digit alphabetic ISO 4217 code for the merchant currency of
                     *   the transaction.
                     * - `MERCHANT_ID`: Unique alphanumeric identifier for the payment card acceptor
                     *   (merchant).
                     * - `DESCRIPTOR`: Short description of card acceptor.
                     * - `LIABILITY_SHIFT`: Indicates whether chargeback liability shift to the
                     *   issuer applies to the transaction. Valid values are `NONE`,
                     *   `3DS_AUTHENTICATED`, or `TOKEN_AUTHENTICATED`.
                     * - `PAN_ENTRY_MODE`: The method by which the cardholder's primary account
                     *   number (PAN) was entered. Valid values are `AUTO_ENTRY`, `BAR_CODE`,
                     *   `CONTACTLESS`, `ECOMMERCE`, `ERROR_KEYED`, `ERROR_MAGNETIC_STRIPE`, `ICC`,
                     *   `KEY_ENTERED`, `MAGNETIC_STRIPE`, `MANUAL`, `OCR`, `SECURE_CARDLESS`,
                     *   `UNSPECIFIED`, `UNKNOWN`, `CREDENTIAL_ON_FILE`, or `ECOMMERCE`.
                     * - `TRANSACTION_AMOUNT`: The base transaction amount (in cents) plus the
                     *   acquirer fee field in the settlement/cardholder billing currency. This is
                     *   the amount the issuer should authorize against unless the issuer is paying
                     *   the acquirer fee on behalf of the cardholder.
                     * - `RISK_SCORE`: Network-provided score assessing risk level associated with a
                     *   given authorization. Scores are on a range of 0-999, with 0 representing
                     *   the lowest risk and 999 representing the highest risk. For Visa
                     *   transactions, where the raw score has a range of 0-99, Lithic will
                     *   normalize the score by multiplying the raw score by 10x.
                     */
                    @JsonProperty("attribute") @ExcludeMissing fun _attribute() = attribute

                    /** The operation to apply to the attribute */
                    @JsonProperty("operation") @ExcludeMissing fun _operation() = operation

                    /** A regex string, to be used with `MATCHES` or `DOES_NOT_MATCH` */
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

                        /**
                         * The attribute to target.
                         *
                         * The following attributes may be targeted:
                         * - `MCC`: A four-digit number listed in ISO 18245. An MCC is used to
                         *   classify a business by the types of goods or services it provides.
                         * - `COUNTRY`: Country of entity of card acceptor. Possible values are: (1)
                         *   all ISO 3166-1 alpha-3 country codes, (2) QZZ for Kosovo, and (3) ANT
                         *   for Netherlands Antilles.
                         * - `CURRENCY`: 3-digit alphabetic ISO 4217 code for the merchant currency
                         *   of the transaction.
                         * - `MERCHANT_ID`: Unique alphanumeric identifier for the payment card
                         *   acceptor (merchant).
                         * - `DESCRIPTOR`: Short description of card acceptor.
                         * - `LIABILITY_SHIFT`: Indicates whether chargeback liability shift to the
                         *   issuer applies to the transaction. Valid values are `NONE`,
                         *   `3DS_AUTHENTICATED`, or `TOKEN_AUTHENTICATED`.
                         * - `PAN_ENTRY_MODE`: The method by which the cardholder's primary account
                         *   number (PAN) was entered. Valid values are `AUTO_ENTRY`, `BAR_CODE`,
                         *   `CONTACTLESS`, `ECOMMERCE`, `ERROR_KEYED`, `ERROR_MAGNETIC_STRIPE`,
                         *   `ICC`, `KEY_ENTERED`, `MAGNETIC_STRIPE`, `MANUAL`, `OCR`,
                         *   `SECURE_CARDLESS`, `UNSPECIFIED`, `UNKNOWN`, `CREDENTIAL_ON_FILE`, or
                         *   `ECOMMERCE`.
                         * - `TRANSACTION_AMOUNT`: The base transaction amount (in cents) plus the
                         *   acquirer fee field in the settlement/cardholder billing currency. This
                         *   is the amount the issuer should authorize against unless the issuer is
                         *   paying the acquirer fee on behalf of the cardholder.
                         * - `RISK_SCORE`: Network-provided score assessing risk level associated
                         *   with a given authorization. Scores are on a range of 0-999, with 0
                         *   representing the lowest risk and 999 representing the highest risk. For
                         *   Visa transactions, where the raw score has a range of 0-99, Lithic will
                         *   normalize the score by multiplying the raw score by 10x.
                         */
                        fun attribute(attribute: Attribute) = attribute(JsonField.of(attribute))

                        /**
                         * The attribute to target.
                         *
                         * The following attributes may be targeted:
                         * - `MCC`: A four-digit number listed in ISO 18245. An MCC is used to
                         *   classify a business by the types of goods or services it provides.
                         * - `COUNTRY`: Country of entity of card acceptor. Possible values are: (1)
                         *   all ISO 3166-1 alpha-3 country codes, (2) QZZ for Kosovo, and (3) ANT
                         *   for Netherlands Antilles.
                         * - `CURRENCY`: 3-digit alphabetic ISO 4217 code for the merchant currency
                         *   of the transaction.
                         * - `MERCHANT_ID`: Unique alphanumeric identifier for the payment card
                         *   acceptor (merchant).
                         * - `DESCRIPTOR`: Short description of card acceptor.
                         * - `LIABILITY_SHIFT`: Indicates whether chargeback liability shift to the
                         *   issuer applies to the transaction. Valid values are `NONE`,
                         *   `3DS_AUTHENTICATED`, or `TOKEN_AUTHENTICATED`.
                         * - `PAN_ENTRY_MODE`: The method by which the cardholder's primary account
                         *   number (PAN) was entered. Valid values are `AUTO_ENTRY`, `BAR_CODE`,
                         *   `CONTACTLESS`, `ECOMMERCE`, `ERROR_KEYED`, `ERROR_MAGNETIC_STRIPE`,
                         *   `ICC`, `KEY_ENTERED`, `MAGNETIC_STRIPE`, `MANUAL`, `OCR`,
                         *   `SECURE_CARDLESS`, `UNSPECIFIED`, `UNKNOWN`, `CREDENTIAL_ON_FILE`, or
                         *   `ECOMMERCE`.
                         * - `TRANSACTION_AMOUNT`: The base transaction amount (in cents) plus the
                         *   acquirer fee field in the settlement/cardholder billing currency. This
                         *   is the amount the issuer should authorize against unless the issuer is
                         *   paying the acquirer fee on behalf of the cardholder.
                         * - `RISK_SCORE`: Network-provided score assessing risk level associated
                         *   with a given authorization. Scores are on a range of 0-999, with 0
                         *   representing the lowest risk and 999 representing the highest risk. For
                         *   Visa transactions, where the raw score has a range of 0-99, Lithic will
                         *   normalize the score by multiplying the raw score by 10x.
                         */
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

                        /** A regex string, to be used with `MATCHES` or `DOES_NOT_MATCH` */
                        fun value(value: Value) = value(JsonField.of(value))

                        /** A regex string, to be used with `MATCHES` or `DOES_NOT_MATCH` */
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
                                additionalProperties.toImmutable(),
                            )
                    }

                    class Attribute
                    @JsonCreator
                    private constructor(
                        private val value: JsonField<String>,
                    ) : Enum {

                        @com.fasterxml.jackson.annotation.JsonValue
                        fun _value(): JsonField<String> = value

                        companion object {

                            val MCC = of("MCC")

                            val COUNTRY = of("COUNTRY")

                            val CURRENCY = of("CURRENCY")

                            val MERCHANT_ID = of("MERCHANT_ID")

                            val DESCRIPTOR = of("DESCRIPTOR")

                            val LIABILITY_SHIFT = of("LIABILITY_SHIFT")

                            val PAN_ENTRY_MODE = of("PAN_ENTRY_MODE")

                            val TRANSACTION_AMOUNT = of("TRANSACTION_AMOUNT")

                            val RISK_SCORE = of("RISK_SCORE")

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

                        override fun equals(other: Any?): Boolean {
                            if (this === other) {
                                return true
                            }

                            return /* spotless:off */ other is Attribute && value == other.value /* spotless:on */
                        }

                        override fun hashCode() = value.hashCode()

                        override fun toString() = value.toString()
                    }

                    class Operation
                    @JsonCreator
                    private constructor(
                        private val value: JsonField<String>,
                    ) : Enum {

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

                        override fun equals(other: Any?): Boolean {
                            if (this === other) {
                                return true
                            }

                            return /* spotless:off */ other is Operation && value == other.value /* spotless:on */
                        }

                        override fun hashCode() = value.hashCode()

                        override fun toString() = value.toString()
                    }

                    @JsonDeserialize(using = Value.Deserializer::class)
                    @JsonSerialize(using = Value.Serializer::class)
                    class Value
                    private constructor(
                        private val string: String? = null,
                        private val long: Long? = null,
                        private val strings: List<String>? = null,
                        private val _json: JsonValue? = null,
                    ) {

                        private var validated: Boolean = false

                        /** A regex string, to be used with `MATCHES` or `DOES_NOT_MATCH` */
                        fun string(): String? = string
                        /** A number, to be used with `IS_GREATER_THAN` or `IS_LESS_THAN` */
                        fun long(): Long? = long
                        /** An array of strings, to be used with `IS_ONE_OF` or `IS_NOT_ONE_OF` */
                        fun strings(): List<String>? = strings

                        fun isString(): Boolean = string != null

                        fun isLong(): Boolean = long != null

                        fun isStrings(): Boolean = strings != null

                        fun asString(): String = string.getOrThrow("string")

                        fun asLong(): Long = long.getOrThrow("long")

                        fun asStrings(): List<String> = strings.getOrThrow("strings")

                        fun _json(): JsonValue? = _json

                        fun <T> accept(visitor: Visitor<T>): T {
                            return when {
                                string != null -> visitor.visitString(string)
                                long != null -> visitor.visitLong(long)
                                strings != null -> visitor.visitStrings(strings)
                                else -> visitor.unknown(_json)
                            }
                        }

                        fun validate(): Value = apply {
                            if (!validated) {
                                if (string == null && long == null && strings == null) {
                                    throw LithicInvalidDataException("Unknown Value: $_json")
                                }
                                validated = true
                            }
                        }

                        override fun equals(other: Any?): Boolean {
                            if (this === other) {
                                return true
                            }

                            return /* spotless:off */ other is Value && string == other.string && long == other.long && strings == other.strings /* spotless:on */
                        }

                        override fun hashCode(): Int = /* spotless:off */ Objects.hash(string, long, strings) /* spotless:on */

                        override fun toString(): String =
                            when {
                                string != null -> "Value{string=$string}"
                                long != null -> "Value{long=$long}"
                                strings != null -> "Value{strings=$strings}"
                                _json != null -> "Value{_unknown=$_json}"
                                else -> throw IllegalStateException("Invalid Value")
                            }

                        companion object {

                            fun ofString(string: String) = Value(string = string)

                            fun ofLong(long: Long) = Value(long = long)

                            fun ofStrings(strings: List<String>) = Value(strings = strings)
                        }

                        interface Visitor<out T> {

                            fun visitString(string: String): T

                            fun visitLong(long: Long): T

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
                                tryDeserialize(node, jacksonTypeRef<Long>())?.let {
                                    return Value(long = it, _json = json)
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
                                    value.long != null -> generator.writeObject(value.long)
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

                    return /* spotless:off */ other is ConditionalBlockParameters && conditions == other.conditions && additionalProperties == other.additionalProperties /* spotless:on */
                }

                /* spotless:off */
                private val hashCode: Int by lazy { Objects.hash(conditions, additionalProperties) }
                /* spotless:on */

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "ConditionalBlockParameters{conditions=$conditions, additionalProperties=$additionalProperties}"
            }
        }

        class AuthRuleType
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) : Enum {

            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                val CONDITIONAL_BLOCK = of("CONDITIONAL_BLOCK")

                val VELOCITY_LIMIT = of("VELOCITY_LIMIT")

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

            return /* spotless:off */ other is CreateAuthRuleRequestProgramLevel && programLevel == other.programLevel && type == other.type && parameters == other.parameters && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(programLevel, type, parameters, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "CreateAuthRuleRequestProgramLevel{programLevel=$programLevel, type=$type, parameters=$parameters, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is AuthRuleV2CreateParams && createAuthRuleRequestAccountTokens == other.createAuthRuleRequestAccountTokens && createAuthRuleRequestCardTokens == other.createAuthRuleRequestCardTokens && createAuthRuleRequestProgramLevel == other.createAuthRuleRequestProgramLevel && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(createAuthRuleRequestAccountTokens, createAuthRuleRequestCardTokens, createAuthRuleRequestProgramLevel, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() =
        "AuthRuleV2CreateParams{createAuthRuleRequestAccountTokens=$createAuthRuleRequestAccountTokens, createAuthRuleRequestCardTokens=$createAuthRuleRequestCardTokens, createAuthRuleRequestProgramLevel=$createAuthRuleRequestProgramLevel, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
