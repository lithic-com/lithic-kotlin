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
import com.lithic.api.core.checkRequired
import com.lithic.api.core.getOrThrow
import com.lithic.api.core.immutableEmptyMap
import com.lithic.api.core.toImmutable
import com.lithic.api.errors.LithicInvalidDataException
import java.util.Objects

@NoAutoDetect
class V2RetrieveResponse
@JsonCreator
private constructor(
    @JsonProperty("token") @ExcludeMissing private val token: JsonField<String> = JsonMissing.of(),
    @JsonProperty("account_tokens")
    @ExcludeMissing
    private val accountTokens: JsonField<List<String>> = JsonMissing.of(),
    @JsonProperty("card_tokens")
    @ExcludeMissing
    private val cardTokens: JsonField<List<String>> = JsonMissing.of(),
    @JsonProperty("current_version")
    @ExcludeMissing
    private val currentVersion: JsonField<CurrentVersion> = JsonMissing.of(),
    @JsonProperty("draft_version")
    @ExcludeMissing
    private val draftVersion: JsonField<DraftVersion> = JsonMissing.of(),
    @JsonProperty("name") @ExcludeMissing private val name: JsonField<String> = JsonMissing.of(),
    @JsonProperty("program_level")
    @ExcludeMissing
    private val programLevel: JsonField<Boolean> = JsonMissing.of(),
    @JsonProperty("state")
    @ExcludeMissing
    private val state: JsonField<AuthRuleState> = JsonMissing.of(),
    @JsonProperty("type")
    @ExcludeMissing
    private val type: JsonField<AuthRuleType> = JsonMissing.of(),
    @JsonProperty("excluded_card_tokens")
    @ExcludeMissing
    private val excludedCardTokens: JsonField<List<String>> = JsonMissing.of(),
    @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
) {

    /** Auth Rule Token */
    fun token(): String = token.getRequired("token")

    /** Account tokens to which the Auth Rule applies. */
    fun accountTokens(): List<String> = accountTokens.getRequired("account_tokens")

    /** Card tokens to which the Auth Rule applies. */
    fun cardTokens(): List<String> = cardTokens.getRequired("card_tokens")

    fun currentVersion(): CurrentVersion? = currentVersion.getNullable("current_version")

    fun draftVersion(): DraftVersion? = draftVersion.getNullable("draft_version")

    /** Auth Rule Name */
    fun name(): String? = name.getNullable("name")

    /** Whether the Auth Rule applies to all authorizations on the card program. */
    fun programLevel(): Boolean = programLevel.getRequired("program_level")

    /** The state of the Auth Rule */
    fun state(): AuthRuleState = state.getRequired("state")

    /** The type of Auth Rule */
    fun type(): AuthRuleType = type.getRequired("type")

    /** Card tokens to which the Auth Rule does not apply. */
    fun excludedCardTokens(): List<String>? = excludedCardTokens.getNullable("excluded_card_tokens")

    /** Auth Rule Token */
    @JsonProperty("token") @ExcludeMissing fun _token(): JsonField<String> = token

    /** Account tokens to which the Auth Rule applies. */
    @JsonProperty("account_tokens")
    @ExcludeMissing
    fun _accountTokens(): JsonField<List<String>> = accountTokens

    /** Card tokens to which the Auth Rule applies. */
    @JsonProperty("card_tokens")
    @ExcludeMissing
    fun _cardTokens(): JsonField<List<String>> = cardTokens

    @JsonProperty("current_version")
    @ExcludeMissing
    fun _currentVersion(): JsonField<CurrentVersion> = currentVersion

    @JsonProperty("draft_version")
    @ExcludeMissing
    fun _draftVersion(): JsonField<DraftVersion> = draftVersion

    /** Auth Rule Name */
    @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

    /** Whether the Auth Rule applies to all authorizations on the card program. */
    @JsonProperty("program_level")
    @ExcludeMissing
    fun _programLevel(): JsonField<Boolean> = programLevel

    /** The state of the Auth Rule */
    @JsonProperty("state") @ExcludeMissing fun _state(): JsonField<AuthRuleState> = state

    /** The type of Auth Rule */
    @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<AuthRuleType> = type

    /** Card tokens to which the Auth Rule does not apply. */
    @JsonProperty("excluded_card_tokens")
    @ExcludeMissing
    fun _excludedCardTokens(): JsonField<List<String>> = excludedCardTokens

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    private var validated: Boolean = false

    fun validate(): V2RetrieveResponse = apply {
        if (validated) {
            return@apply
        }

        token()
        accountTokens()
        cardTokens()
        currentVersion()?.validate()
        draftVersion()?.validate()
        name()
        programLevel()
        state()
        type()
        excludedCardTokens()
        validated = true
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        fun builder() = Builder()
    }

    class Builder {

        private var token: JsonField<String>? = null
        private var accountTokens: JsonField<MutableList<String>>? = null
        private var cardTokens: JsonField<MutableList<String>>? = null
        private var currentVersion: JsonField<CurrentVersion>? = null
        private var draftVersion: JsonField<DraftVersion>? = null
        private var name: JsonField<String>? = null
        private var programLevel: JsonField<Boolean>? = null
        private var state: JsonField<AuthRuleState>? = null
        private var type: JsonField<AuthRuleType>? = null
        private var excludedCardTokens: JsonField<MutableList<String>>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(v2RetrieveResponse: V2RetrieveResponse) = apply {
            token = v2RetrieveResponse.token
            accountTokens = v2RetrieveResponse.accountTokens.map { it.toMutableList() }
            cardTokens = v2RetrieveResponse.cardTokens.map { it.toMutableList() }
            currentVersion = v2RetrieveResponse.currentVersion
            draftVersion = v2RetrieveResponse.draftVersion
            name = v2RetrieveResponse.name
            programLevel = v2RetrieveResponse.programLevel
            state = v2RetrieveResponse.state
            type = v2RetrieveResponse.type
            excludedCardTokens = v2RetrieveResponse.excludedCardTokens.map { it.toMutableList() }
            additionalProperties = v2RetrieveResponse.additionalProperties.toMutableMap()
        }

        /** Auth Rule Token */
        fun token(token: String) = token(JsonField.of(token))

        /** Auth Rule Token */
        fun token(token: JsonField<String>) = apply { this.token = token }

        /** Account tokens to which the Auth Rule applies. */
        fun accountTokens(accountTokens: List<String>) = accountTokens(JsonField.of(accountTokens))

        /** Account tokens to which the Auth Rule applies. */
        fun accountTokens(accountTokens: JsonField<List<String>>) = apply {
            this.accountTokens = accountTokens.map { it.toMutableList() }
        }

        /** Account tokens to which the Auth Rule applies. */
        fun addAccountToken(accountToken: String) = apply {
            accountTokens =
                (accountTokens ?: JsonField.of(mutableListOf())).apply {
                    (asKnown()
                            ?: throw IllegalStateException(
                                "Field was set to non-list type: ${javaClass.simpleName}"
                            ))
                        .add(accountToken)
                }
        }

        /** Card tokens to which the Auth Rule applies. */
        fun cardTokens(cardTokens: List<String>) = cardTokens(JsonField.of(cardTokens))

        /** Card tokens to which the Auth Rule applies. */
        fun cardTokens(cardTokens: JsonField<List<String>>) = apply {
            this.cardTokens = cardTokens.map { it.toMutableList() }
        }

        /** Card tokens to which the Auth Rule applies. */
        fun addCardToken(cardToken: String) = apply {
            cardTokens =
                (cardTokens ?: JsonField.of(mutableListOf())).apply {
                    (asKnown()
                            ?: throw IllegalStateException(
                                "Field was set to non-list type: ${javaClass.simpleName}"
                            ))
                        .add(cardToken)
                }
        }

        fun currentVersion(currentVersion: CurrentVersion?) =
            currentVersion(JsonField.ofNullable(currentVersion))

        fun currentVersion(currentVersion: JsonField<CurrentVersion>) = apply {
            this.currentVersion = currentVersion
        }

        fun draftVersion(draftVersion: DraftVersion?) =
            draftVersion(JsonField.ofNullable(draftVersion))

        fun draftVersion(draftVersion: JsonField<DraftVersion>) = apply {
            this.draftVersion = draftVersion
        }

        /** Auth Rule Name */
        fun name(name: String?) = name(JsonField.ofNullable(name))

        /** Auth Rule Name */
        fun name(name: JsonField<String>) = apply { this.name = name }

        /** Whether the Auth Rule applies to all authorizations on the card program. */
        fun programLevel(programLevel: Boolean) = programLevel(JsonField.of(programLevel))

        /** Whether the Auth Rule applies to all authorizations on the card program. */
        fun programLevel(programLevel: JsonField<Boolean>) = apply {
            this.programLevel = programLevel
        }

        /** The state of the Auth Rule */
        fun state(state: AuthRuleState) = state(JsonField.of(state))

        /** The state of the Auth Rule */
        fun state(state: JsonField<AuthRuleState>) = apply { this.state = state }

        /** The type of Auth Rule */
        fun type(type: AuthRuleType) = type(JsonField.of(type))

        /** The type of Auth Rule */
        fun type(type: JsonField<AuthRuleType>) = apply { this.type = type }

        /** Card tokens to which the Auth Rule does not apply. */
        fun excludedCardTokens(excludedCardTokens: List<String>) =
            excludedCardTokens(JsonField.of(excludedCardTokens))

        /** Card tokens to which the Auth Rule does not apply. */
        fun excludedCardTokens(excludedCardTokens: JsonField<List<String>>) = apply {
            this.excludedCardTokens = excludedCardTokens.map { it.toMutableList() }
        }

        /** Card tokens to which the Auth Rule does not apply. */
        fun addExcludedCardToken(excludedCardToken: String) = apply {
            excludedCardTokens =
                (excludedCardTokens ?: JsonField.of(mutableListOf())).apply {
                    (asKnown()
                            ?: throw IllegalStateException(
                                "Field was set to non-list type: ${javaClass.simpleName}"
                            ))
                        .add(excludedCardToken)
                }
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

        fun build(): V2RetrieveResponse =
            V2RetrieveResponse(
                checkRequired("token", token),
                checkRequired("accountTokens", accountTokens).map { it.toImmutable() },
                checkRequired("cardTokens", cardTokens).map { it.toImmutable() },
                checkRequired("currentVersion", currentVersion),
                checkRequired("draftVersion", draftVersion),
                checkRequired("name", name),
                checkRequired("programLevel", programLevel),
                checkRequired("state", state),
                checkRequired("type", type),
                (excludedCardTokens ?: JsonMissing.of()).map { it.toImmutable() },
                additionalProperties.toImmutable(),
            )
    }

    @NoAutoDetect
    class CurrentVersion
    @JsonCreator
    private constructor(
        @JsonProperty("parameters")
        @ExcludeMissing
        private val parameters: JsonField<Parameters> = JsonMissing.of(),
        @JsonProperty("version")
        @ExcludeMissing
        private val version: JsonField<Long> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /** Parameters for the current version of the Auth Rule */
        fun parameters(): Parameters = parameters.getRequired("parameters")

        /** The version of the rule, this is incremented whenever the rule's parameters change. */
        fun version(): Long = version.getRequired("version")

        /** Parameters for the current version of the Auth Rule */
        @JsonProperty("parameters")
        @ExcludeMissing
        fun _parameters(): JsonField<Parameters> = parameters

        /** The version of the rule, this is incremented whenever the rule's parameters change. */
        @JsonProperty("version") @ExcludeMissing fun _version(): JsonField<Long> = version

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): CurrentVersion = apply {
            if (validated) {
                return@apply
            }

            parameters().validate()
            version()
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var parameters: JsonField<Parameters>? = null
            private var version: JsonField<Long>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(currentVersion: CurrentVersion) = apply {
                parameters = currentVersion.parameters
                version = currentVersion.version
                additionalProperties = currentVersion.additionalProperties.toMutableMap()
            }

            /** Parameters for the current version of the Auth Rule */
            fun parameters(parameters: Parameters) = parameters(JsonField.of(parameters))

            /** Parameters for the current version of the Auth Rule */
            fun parameters(parameters: JsonField<Parameters>) = apply {
                this.parameters = parameters
            }

            /** Parameters for the current version of the Auth Rule */
            fun parameters(conditionalBlockParameters: Parameters.ConditionalBlockParameters) =
                parameters(Parameters.ofConditionalBlockParameters(conditionalBlockParameters))

            /** Parameters for the current version of the Auth Rule */
            fun parameters(velocityLimitParams: VelocityLimitParams) =
                parameters(Parameters.ofVelocityLimitParams(velocityLimitParams))

            /**
             * The version of the rule, this is incremented whenever the rule's parameters change.
             */
            fun version(version: Long) = version(JsonField.of(version))

            /**
             * The version of the rule, this is incremented whenever the rule's parameters change.
             */
            fun version(version: JsonField<Long>) = apply { this.version = version }

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

            fun build(): CurrentVersion =
                CurrentVersion(
                    checkRequired("parameters", parameters),
                    checkRequired("version", version),
                    additionalProperties.toImmutable(),
                )
        }

        /** Parameters for the current version of the Auth Rule */
        @JsonDeserialize(using = Parameters.Deserializer::class)
        @JsonSerialize(using = Parameters.Serializer::class)
        class Parameters
        private constructor(
            private val conditionalBlockParameters: ConditionalBlockParameters? = null,
            private val velocityLimitParams: VelocityLimitParams? = null,
            private val _json: JsonValue? = null,
        ) {

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

            private var validated: Boolean = false

            fun validate(): Parameters = apply {
                if (validated) {
                    return@apply
                }

                accept(
                    object : Visitor<Unit> {
                        override fun visitConditionalBlockParameters(
                            conditionalBlockParameters: ConditionalBlockParameters
                        ) {
                            conditionalBlockParameters.validate()
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

            @NoAutoDetect
            class ConditionalBlockParameters
            @JsonCreator
            private constructor(
                @JsonProperty("conditions")
                @ExcludeMissing
                private val conditions: JsonField<List<Condition>> = JsonMissing.of(),
                @JsonAnySetter
                private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
            ) {

                fun conditions(): List<Condition> = conditions.getRequired("conditions")

                @JsonProperty("conditions")
                @ExcludeMissing
                fun _conditions(): JsonField<List<Condition>> = conditions

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                private var validated: Boolean = false

                fun validate(): ConditionalBlockParameters = apply {
                    if (validated) {
                        return@apply
                    }

                    conditions().forEach { it.validate() }
                    validated = true
                }

                fun toBuilder() = Builder().from(this)

                companion object {

                    fun builder() = Builder()
                }

                class Builder {

                    private var conditions: JsonField<MutableList<Condition>>? = null
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    internal fun from(conditionalBlockParameters: ConditionalBlockParameters) =
                        apply {
                            conditions =
                                conditionalBlockParameters.conditions.map { it.toMutableList() }
                            additionalProperties =
                                conditionalBlockParameters.additionalProperties.toMutableMap()
                        }

                    fun conditions(conditions: List<Condition>) =
                        conditions(JsonField.of(conditions))

                    fun conditions(conditions: JsonField<List<Condition>>) = apply {
                        this.conditions = conditions.map { it.toMutableList() }
                    }

                    fun addCondition(condition: Condition) = apply {
                        conditions =
                            (conditions ?: JsonField.of(mutableListOf())).apply {
                                (asKnown()
                                        ?: throw IllegalStateException(
                                            "Field was set to non-list type: ${javaClass.simpleName}"
                                        ))
                                    .add(condition)
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

                    fun build(): ConditionalBlockParameters =
                        ConditionalBlockParameters(
                            checkRequired("conditions", conditions).map { it.toImmutable() },
                            additionalProperties.toImmutable()
                        )
                }

                @NoAutoDetect
                class Condition
                @JsonCreator
                private constructor(
                    @JsonProperty("attribute")
                    @ExcludeMissing
                    private val attribute: JsonField<Attribute> = JsonMissing.of(),
                    @JsonProperty("operation")
                    @ExcludeMissing
                    private val operation: JsonField<Operation> = JsonMissing.of(),
                    @JsonProperty("value")
                    @ExcludeMissing
                    private val value: JsonField<Value> = JsonMissing.of(),
                    @JsonAnySetter
                    private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
                ) {

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
                     * - `CARD_TRANSACTION_COUNT_1H`: The number of transactions on the card in the
                     *   trailing hour up and until the authorization.
                     * - `CARD_TRANSACTION_COUNT_24H`: The number of transactions on the card in the
                     *   trailing 24 hours up and until the authorization.
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
                     * - `CARD_TRANSACTION_COUNT_1H`: The number of transactions on the card in the
                     *   trailing hour up and until the authorization.
                     * - `CARD_TRANSACTION_COUNT_24H`: The number of transactions on the card in the
                     *   trailing 24 hours up and until the authorization.
                     */
                    @JsonProperty("attribute")
                    @ExcludeMissing
                    fun _attribute(): JsonField<Attribute> = attribute

                    /** The operation to apply to the attribute */
                    @JsonProperty("operation")
                    @ExcludeMissing
                    fun _operation(): JsonField<Operation> = operation

                    /** A regex string, to be used with `MATCHES` or `DOES_NOT_MATCH` */
                    @JsonProperty("value") @ExcludeMissing fun _value(): JsonField<Value> = value

                    @JsonAnyGetter
                    @ExcludeMissing
                    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                    private var validated: Boolean = false

                    fun validate(): Condition = apply {
                        if (validated) {
                            return@apply
                        }

                        attribute()
                        operation()
                        value()?.validate()
                        validated = true
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
                         * - `CARD_TRANSACTION_COUNT_1H`: The number of transactions on the card in
                         *   the trailing hour up and until the authorization.
                         * - `CARD_TRANSACTION_COUNT_24H`: The number of transactions on the card in
                         *   the trailing 24 hours up and until the authorization.
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
                         * - `CARD_TRANSACTION_COUNT_1H`: The number of transactions on the card in
                         *   the trailing hour up and until the authorization.
                         * - `CARD_TRANSACTION_COUNT_24H`: The number of transactions on the card in
                         *   the trailing 24 hours up and until the authorization.
                         */
                        fun attribute(attribute: JsonField<Attribute>) = apply {
                            this.attribute = attribute
                        }

                        /** The operation to apply to the attribute */
                        fun operation(operation: Operation) = operation(JsonField.of(operation))

                        /** The operation to apply to the attribute */
                        fun operation(operation: JsonField<Operation>) = apply {
                            this.operation = operation
                        }

                        /** A regex string, to be used with `MATCHES` or `DOES_NOT_MATCH` */
                        fun value(value: Value) = value(JsonField.of(value))

                        /** A regex string, to be used with `MATCHES` or `DOES_NOT_MATCH` */
                        fun value(value: JsonField<Value>) = apply { this.value = value }

                        /** A regex string, to be used with `MATCHES` or `DOES_NOT_MATCH` */
                        fun value(string: String) = value(Value.ofString(string))

                        /** A number, to be used with `IS_GREATER_THAN` or `IS_LESS_THAN` */
                        fun value(long: Long) = value(Value.ofLong(long))

                        /** An array of strings, to be used with `IS_ONE_OF` or `IS_NOT_ONE_OF` */
                        fun valueOfStrings(strings: List<String>) = value(Value.ofStrings(strings))

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

                            val CARD_TRANSACTION_COUNT_1_H = of("CARD_TRANSACTION_COUNT_1H")

                            val CARD_TRANSACTION_COUNT_24_H = of("CARD_TRANSACTION_COUNT_24H")

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
                            CARD_TRANSACTION_COUNT_1_H,
                            CARD_TRANSACTION_COUNT_24_H,
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
                            CARD_TRANSACTION_COUNT_1_H,
                            CARD_TRANSACTION_COUNT_24_H,
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
                                CARD_TRANSACTION_COUNT_1_H -> Value.CARD_TRANSACTION_COUNT_1_H
                                CARD_TRANSACTION_COUNT_24_H -> Value.CARD_TRANSACTION_COUNT_24_H
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
                                CARD_TRANSACTION_COUNT_1_H -> Known.CARD_TRANSACTION_COUNT_1_H
                                CARD_TRANSACTION_COUNT_24_H -> Known.CARD_TRANSACTION_COUNT_24_H
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

                    /** A regex string, to be used with `MATCHES` or `DOES_NOT_MATCH` */
                    @JsonDeserialize(using = Value.Deserializer::class)
                    @JsonSerialize(using = Value.Serializer::class)
                    class Value
                    private constructor(
                        private val string: String? = null,
                        private val long: Long? = null,
                        private val strings: List<String>? = null,
                        private val _json: JsonValue? = null,
                    ) {

                        /** A regex string, to be used with `MATCHES` or `DOES_NOT_MATCH` */
                        fun string(): String? = string

                        /** A number, to be used with `IS_GREATER_THAN` or `IS_LESS_THAN` */
                        fun long(): Long? = long

                        /** An array of strings, to be used with `IS_ONE_OF` or `IS_NOT_ONE_OF` */
                        fun strings(): List<String>? = strings

                        fun isString(): Boolean = string != null

                        fun isLong(): Boolean = long != null

                        fun isStrings(): Boolean = strings != null

                        /** A regex string, to be used with `MATCHES` or `DOES_NOT_MATCH` */
                        fun asString(): String = string.getOrThrow("string")

                        /** A number, to be used with `IS_GREATER_THAN` or `IS_LESS_THAN` */
                        fun asLong(): Long = long.getOrThrow("long")

                        /** An array of strings, to be used with `IS_ONE_OF` or `IS_NOT_ONE_OF` */
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

                        private var validated: Boolean = false

                        fun validate(): Value = apply {
                            if (validated) {
                                return@apply
                            }

                            accept(
                                object : Visitor<Unit> {
                                    override fun visitString(string: String) {}

                                    override fun visitLong(long: Long) {}

                                    override fun visitStrings(strings: List<String>) {}
                                }
                            )
                            validated = true
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

                            /** A regex string, to be used with `MATCHES` or `DOES_NOT_MATCH` */
                            fun ofString(string: String) = Value(string = string)

                            /** A number, to be used with `IS_GREATER_THAN` or `IS_LESS_THAN` */
                            fun ofLong(long: Long) = Value(long = long)

                            /**
                             * An array of strings, to be used with `IS_ONE_OF` or `IS_NOT_ONE_OF`
                             */
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

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is CurrentVersion && parameters == other.parameters && version == other.version && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(parameters, version, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "CurrentVersion{parameters=$parameters, version=$version, additionalProperties=$additionalProperties}"
    }

    @NoAutoDetect
    class DraftVersion
    @JsonCreator
    private constructor(
        @JsonProperty("parameters")
        @ExcludeMissing
        private val parameters: JsonField<Parameters> = JsonMissing.of(),
        @JsonProperty("version")
        @ExcludeMissing
        private val version: JsonField<Long> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /** Parameters for the current version of the Auth Rule */
        fun parameters(): Parameters = parameters.getRequired("parameters")

        /** The version of the rule, this is incremented whenever the rule's parameters change. */
        fun version(): Long = version.getRequired("version")

        /** Parameters for the current version of the Auth Rule */
        @JsonProperty("parameters")
        @ExcludeMissing
        fun _parameters(): JsonField<Parameters> = parameters

        /** The version of the rule, this is incremented whenever the rule's parameters change. */
        @JsonProperty("version") @ExcludeMissing fun _version(): JsonField<Long> = version

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): DraftVersion = apply {
            if (validated) {
                return@apply
            }

            parameters().validate()
            version()
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var parameters: JsonField<Parameters>? = null
            private var version: JsonField<Long>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(draftVersion: DraftVersion) = apply {
                parameters = draftVersion.parameters
                version = draftVersion.version
                additionalProperties = draftVersion.additionalProperties.toMutableMap()
            }

            /** Parameters for the current version of the Auth Rule */
            fun parameters(parameters: Parameters) = parameters(JsonField.of(parameters))

            /** Parameters for the current version of the Auth Rule */
            fun parameters(parameters: JsonField<Parameters>) = apply {
                this.parameters = parameters
            }

            /** Parameters for the current version of the Auth Rule */
            fun parameters(conditionalBlockParameters: Parameters.ConditionalBlockParameters) =
                parameters(Parameters.ofConditionalBlockParameters(conditionalBlockParameters))

            /** Parameters for the current version of the Auth Rule */
            fun parameters(velocityLimitParams: VelocityLimitParams) =
                parameters(Parameters.ofVelocityLimitParams(velocityLimitParams))

            /**
             * The version of the rule, this is incremented whenever the rule's parameters change.
             */
            fun version(version: Long) = version(JsonField.of(version))

            /**
             * The version of the rule, this is incremented whenever the rule's parameters change.
             */
            fun version(version: JsonField<Long>) = apply { this.version = version }

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

            fun build(): DraftVersion =
                DraftVersion(
                    checkRequired("parameters", parameters),
                    checkRequired("version", version),
                    additionalProperties.toImmutable(),
                )
        }

        /** Parameters for the current version of the Auth Rule */
        @JsonDeserialize(using = Parameters.Deserializer::class)
        @JsonSerialize(using = Parameters.Serializer::class)
        class Parameters
        private constructor(
            private val conditionalBlockParameters: ConditionalBlockParameters? = null,
            private val velocityLimitParams: VelocityLimitParams? = null,
            private val _json: JsonValue? = null,
        ) {

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

            private var validated: Boolean = false

            fun validate(): Parameters = apply {
                if (validated) {
                    return@apply
                }

                accept(
                    object : Visitor<Unit> {
                        override fun visitConditionalBlockParameters(
                            conditionalBlockParameters: ConditionalBlockParameters
                        ) {
                            conditionalBlockParameters.validate()
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

            @NoAutoDetect
            class ConditionalBlockParameters
            @JsonCreator
            private constructor(
                @JsonProperty("conditions")
                @ExcludeMissing
                private val conditions: JsonField<List<Condition>> = JsonMissing.of(),
                @JsonAnySetter
                private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
            ) {

                fun conditions(): List<Condition> = conditions.getRequired("conditions")

                @JsonProperty("conditions")
                @ExcludeMissing
                fun _conditions(): JsonField<List<Condition>> = conditions

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                private var validated: Boolean = false

                fun validate(): ConditionalBlockParameters = apply {
                    if (validated) {
                        return@apply
                    }

                    conditions().forEach { it.validate() }
                    validated = true
                }

                fun toBuilder() = Builder().from(this)

                companion object {

                    fun builder() = Builder()
                }

                class Builder {

                    private var conditions: JsonField<MutableList<Condition>>? = null
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    internal fun from(conditionalBlockParameters: ConditionalBlockParameters) =
                        apply {
                            conditions =
                                conditionalBlockParameters.conditions.map { it.toMutableList() }
                            additionalProperties =
                                conditionalBlockParameters.additionalProperties.toMutableMap()
                        }

                    fun conditions(conditions: List<Condition>) =
                        conditions(JsonField.of(conditions))

                    fun conditions(conditions: JsonField<List<Condition>>) = apply {
                        this.conditions = conditions.map { it.toMutableList() }
                    }

                    fun addCondition(condition: Condition) = apply {
                        conditions =
                            (conditions ?: JsonField.of(mutableListOf())).apply {
                                (asKnown()
                                        ?: throw IllegalStateException(
                                            "Field was set to non-list type: ${javaClass.simpleName}"
                                        ))
                                    .add(condition)
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

                    fun build(): ConditionalBlockParameters =
                        ConditionalBlockParameters(
                            checkRequired("conditions", conditions).map { it.toImmutable() },
                            additionalProperties.toImmutable()
                        )
                }

                @NoAutoDetect
                class Condition
                @JsonCreator
                private constructor(
                    @JsonProperty("attribute")
                    @ExcludeMissing
                    private val attribute: JsonField<Attribute> = JsonMissing.of(),
                    @JsonProperty("operation")
                    @ExcludeMissing
                    private val operation: JsonField<Operation> = JsonMissing.of(),
                    @JsonProperty("value")
                    @ExcludeMissing
                    private val value: JsonField<Value> = JsonMissing.of(),
                    @JsonAnySetter
                    private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
                ) {

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
                     * - `CARD_TRANSACTION_COUNT_1H`: The number of transactions on the card in the
                     *   trailing hour up and until the authorization.
                     * - `CARD_TRANSACTION_COUNT_24H`: The number of transactions on the card in the
                     *   trailing 24 hours up and until the authorization.
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
                     * - `CARD_TRANSACTION_COUNT_1H`: The number of transactions on the card in the
                     *   trailing hour up and until the authorization.
                     * - `CARD_TRANSACTION_COUNT_24H`: The number of transactions on the card in the
                     *   trailing 24 hours up and until the authorization.
                     */
                    @JsonProperty("attribute")
                    @ExcludeMissing
                    fun _attribute(): JsonField<Attribute> = attribute

                    /** The operation to apply to the attribute */
                    @JsonProperty("operation")
                    @ExcludeMissing
                    fun _operation(): JsonField<Operation> = operation

                    /** A regex string, to be used with `MATCHES` or `DOES_NOT_MATCH` */
                    @JsonProperty("value") @ExcludeMissing fun _value(): JsonField<Value> = value

                    @JsonAnyGetter
                    @ExcludeMissing
                    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                    private var validated: Boolean = false

                    fun validate(): Condition = apply {
                        if (validated) {
                            return@apply
                        }

                        attribute()
                        operation()
                        value()?.validate()
                        validated = true
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
                         * - `CARD_TRANSACTION_COUNT_1H`: The number of transactions on the card in
                         *   the trailing hour up and until the authorization.
                         * - `CARD_TRANSACTION_COUNT_24H`: The number of transactions on the card in
                         *   the trailing 24 hours up and until the authorization.
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
                         * - `CARD_TRANSACTION_COUNT_1H`: The number of transactions on the card in
                         *   the trailing hour up and until the authorization.
                         * - `CARD_TRANSACTION_COUNT_24H`: The number of transactions on the card in
                         *   the trailing 24 hours up and until the authorization.
                         */
                        fun attribute(attribute: JsonField<Attribute>) = apply {
                            this.attribute = attribute
                        }

                        /** The operation to apply to the attribute */
                        fun operation(operation: Operation) = operation(JsonField.of(operation))

                        /** The operation to apply to the attribute */
                        fun operation(operation: JsonField<Operation>) = apply {
                            this.operation = operation
                        }

                        /** A regex string, to be used with `MATCHES` or `DOES_NOT_MATCH` */
                        fun value(value: Value) = value(JsonField.of(value))

                        /** A regex string, to be used with `MATCHES` or `DOES_NOT_MATCH` */
                        fun value(value: JsonField<Value>) = apply { this.value = value }

                        /** A regex string, to be used with `MATCHES` or `DOES_NOT_MATCH` */
                        fun value(string: String) = value(Value.ofString(string))

                        /** A number, to be used with `IS_GREATER_THAN` or `IS_LESS_THAN` */
                        fun value(long: Long) = value(Value.ofLong(long))

                        /** An array of strings, to be used with `IS_ONE_OF` or `IS_NOT_ONE_OF` */
                        fun valueOfStrings(strings: List<String>) = value(Value.ofStrings(strings))

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

                            val CARD_TRANSACTION_COUNT_1_H = of("CARD_TRANSACTION_COUNT_1H")

                            val CARD_TRANSACTION_COUNT_24_H = of("CARD_TRANSACTION_COUNT_24H")

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
                            CARD_TRANSACTION_COUNT_1_H,
                            CARD_TRANSACTION_COUNT_24_H,
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
                            CARD_TRANSACTION_COUNT_1_H,
                            CARD_TRANSACTION_COUNT_24_H,
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
                                CARD_TRANSACTION_COUNT_1_H -> Value.CARD_TRANSACTION_COUNT_1_H
                                CARD_TRANSACTION_COUNT_24_H -> Value.CARD_TRANSACTION_COUNT_24_H
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
                                CARD_TRANSACTION_COUNT_1_H -> Known.CARD_TRANSACTION_COUNT_1_H
                                CARD_TRANSACTION_COUNT_24_H -> Known.CARD_TRANSACTION_COUNT_24_H
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

                    /** A regex string, to be used with `MATCHES` or `DOES_NOT_MATCH` */
                    @JsonDeserialize(using = Value.Deserializer::class)
                    @JsonSerialize(using = Value.Serializer::class)
                    class Value
                    private constructor(
                        private val string: String? = null,
                        private val long: Long? = null,
                        private val strings: List<String>? = null,
                        private val _json: JsonValue? = null,
                    ) {

                        /** A regex string, to be used with `MATCHES` or `DOES_NOT_MATCH` */
                        fun string(): String? = string

                        /** A number, to be used with `IS_GREATER_THAN` or `IS_LESS_THAN` */
                        fun long(): Long? = long

                        /** An array of strings, to be used with `IS_ONE_OF` or `IS_NOT_ONE_OF` */
                        fun strings(): List<String>? = strings

                        fun isString(): Boolean = string != null

                        fun isLong(): Boolean = long != null

                        fun isStrings(): Boolean = strings != null

                        /** A regex string, to be used with `MATCHES` or `DOES_NOT_MATCH` */
                        fun asString(): String = string.getOrThrow("string")

                        /** A number, to be used with `IS_GREATER_THAN` or `IS_LESS_THAN` */
                        fun asLong(): Long = long.getOrThrow("long")

                        /** An array of strings, to be used with `IS_ONE_OF` or `IS_NOT_ONE_OF` */
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

                        private var validated: Boolean = false

                        fun validate(): Value = apply {
                            if (validated) {
                                return@apply
                            }

                            accept(
                                object : Visitor<Unit> {
                                    override fun visitString(string: String) {}

                                    override fun visitLong(long: Long) {}

                                    override fun visitStrings(strings: List<String>) {}
                                }
                            )
                            validated = true
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

                            /** A regex string, to be used with `MATCHES` or `DOES_NOT_MATCH` */
                            fun ofString(string: String) = Value(string = string)

                            /** A number, to be used with `IS_GREATER_THAN` or `IS_LESS_THAN` */
                            fun ofLong(long: Long) = Value(long = long)

                            /**
                             * An array of strings, to be used with `IS_ONE_OF` or `IS_NOT_ONE_OF`
                             */
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

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is DraftVersion && parameters == other.parameters && version == other.version && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(parameters, version, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "DraftVersion{parameters=$parameters, version=$version, additionalProperties=$additionalProperties}"
    }

    class AuthRuleState
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            val ACTIVE = of("ACTIVE")

            val INACTIVE = of("INACTIVE")

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

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is AuthRuleState && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
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

        return /* spotless:off */ other is V2RetrieveResponse && token == other.token && accountTokens == other.accountTokens && cardTokens == other.cardTokens && currentVersion == other.currentVersion && draftVersion == other.draftVersion && name == other.name && programLevel == other.programLevel && state == other.state && type == other.type && excludedCardTokens == other.excludedCardTokens && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(token, accountTokens, cardTokens, currentVersion, draftVersion, name, programLevel, state, type, excludedCardTokens, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "V2RetrieveResponse{token=$token, accountTokens=$accountTokens, cardTokens=$cardTokens, currentVersion=$currentVersion, draftVersion=$draftVersion, name=$name, programLevel=$programLevel, state=$state, type=$type, excludedCardTokens=$excludedCardTokens, additionalProperties=$additionalProperties}"
}
