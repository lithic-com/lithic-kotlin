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
import com.lithic.api.core.checkRequired
import com.lithic.api.core.immutableEmptyMap
import com.lithic.api.core.toImmutable
import com.lithic.api.errors.LithicInvalidDataException
import java.time.OffsetDateTime
import java.util.Objects

@NoAutoDetect
class Tokenization
@JsonCreator
private constructor(
    @JsonProperty("token") @ExcludeMissing private val token: JsonField<String> = JsonMissing.of(),
    @JsonProperty("account_token")
    @ExcludeMissing
    private val accountToken: JsonField<String> = JsonMissing.of(),
    @JsonProperty("card_token")
    @ExcludeMissing
    private val cardToken: JsonField<String> = JsonMissing.of(),
    @JsonProperty("created_at")
    @ExcludeMissing
    private val createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
    @JsonProperty("dpan") @ExcludeMissing private val dpan: JsonField<String> = JsonMissing.of(),
    @JsonProperty("status")
    @ExcludeMissing
    private val status: JsonField<Status> = JsonMissing.of(),
    @JsonProperty("token_requestor_name")
    @ExcludeMissing
    private val tokenRequestorName: JsonField<TokenRequestorName> = JsonMissing.of(),
    @JsonProperty("token_unique_reference")
    @ExcludeMissing
    private val tokenUniqueReference: JsonField<String> = JsonMissing.of(),
    @JsonProperty("tokenization_channel")
    @ExcludeMissing
    private val tokenizationChannel: JsonField<TokenizationChannel> = JsonMissing.of(),
    @JsonProperty("updated_at")
    @ExcludeMissing
    private val updatedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
    @JsonProperty("digital_card_art_token")
    @ExcludeMissing
    private val digitalCardArtToken: JsonField<String> = JsonMissing.of(),
    @JsonProperty("events")
    @ExcludeMissing
    private val events: JsonField<List<TokenizationEvent>> = JsonMissing.of(),
    @JsonProperty("payment_account_reference_id")
    @ExcludeMissing
    private val paymentAccountReferenceId: JsonField<String> = JsonMissing.of(),
    @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
) {

    /** Globally unique identifier for a Tokenization */
    fun token(): String = token.getRequired("token")

    /** The account token associated with the card being tokenized. */
    fun accountToken(): String = accountToken.getRequired("account_token")

    /** The card token associated with the card being tokenized. */
    fun cardToken(): String = cardToken.getRequired("card_token")

    /** Date and time when the tokenization first occurred. UTC time zone. */
    fun createdAt(): OffsetDateTime = createdAt.getRequired("created_at")

    /** The dynamic pan assigned to the token by the network. */
    fun dpan(): String? = dpan.getNullable("dpan")

    /** The status of the tokenization request */
    fun status(): Status = status.getRequired("status")

    /** The entity that requested the tokenization. Represents a Digital Wallet or merchant. */
    fun tokenRequestorName(): TokenRequestorName =
        tokenRequestorName.getRequired("token_requestor_name")

    /** The network's unique reference for the tokenization. */
    fun tokenUniqueReference(): String = tokenUniqueReference.getRequired("token_unique_reference")

    /** The channel through which the tokenization was made. */
    fun tokenizationChannel(): TokenizationChannel =
        tokenizationChannel.getRequired("tokenization_channel")

    /** Latest date and time when the tokenization was updated. UTC time zone. */
    fun updatedAt(): OffsetDateTime = updatedAt.getRequired("updated_at")

    /**
     * Specifies the digital card art displayed in the user’s digital wallet after tokenization.
     * This will be null if the tokenization was created without an associated digital card art. See
     * [Flexible Card Art Guide](https://docs.lithic.com/docs/about-digital-wallets#flexible-card-art).
     */
    fun digitalCardArtToken(): String? = digitalCardArtToken.getNullable("digital_card_art_token")

    /** A list of events related to the tokenization. */
    fun events(): List<TokenizationEvent>? = events.getNullable("events")

    /** The network's unique reference for the card that is tokenized. */
    fun paymentAccountReferenceId(): String? =
        paymentAccountReferenceId.getNullable("payment_account_reference_id")

    /** Globally unique identifier for a Tokenization */
    @JsonProperty("token") @ExcludeMissing fun _token(): JsonField<String> = token

    /** The account token associated with the card being tokenized. */
    @JsonProperty("account_token")
    @ExcludeMissing
    fun _accountToken(): JsonField<String> = accountToken

    /** The card token associated with the card being tokenized. */
    @JsonProperty("card_token") @ExcludeMissing fun _cardToken(): JsonField<String> = cardToken

    /** Date and time when the tokenization first occurred. UTC time zone. */
    @JsonProperty("created_at")
    @ExcludeMissing
    fun _createdAt(): JsonField<OffsetDateTime> = createdAt

    /** The dynamic pan assigned to the token by the network. */
    @JsonProperty("dpan") @ExcludeMissing fun _dpan(): JsonField<String> = dpan

    /** The status of the tokenization request */
    @JsonProperty("status") @ExcludeMissing fun _status(): JsonField<Status> = status

    /** The entity that requested the tokenization. Represents a Digital Wallet or merchant. */
    @JsonProperty("token_requestor_name")
    @ExcludeMissing
    fun _tokenRequestorName(): JsonField<TokenRequestorName> = tokenRequestorName

    /** The network's unique reference for the tokenization. */
    @JsonProperty("token_unique_reference")
    @ExcludeMissing
    fun _tokenUniqueReference(): JsonField<String> = tokenUniqueReference

    /** The channel through which the tokenization was made. */
    @JsonProperty("tokenization_channel")
    @ExcludeMissing
    fun _tokenizationChannel(): JsonField<TokenizationChannel> = tokenizationChannel

    /** Latest date and time when the tokenization was updated. UTC time zone. */
    @JsonProperty("updated_at")
    @ExcludeMissing
    fun _updatedAt(): JsonField<OffsetDateTime> = updatedAt

    /**
     * Specifies the digital card art displayed in the user’s digital wallet after tokenization.
     * This will be null if the tokenization was created without an associated digital card art. See
     * [Flexible Card Art Guide](https://docs.lithic.com/docs/about-digital-wallets#flexible-card-art).
     */
    @JsonProperty("digital_card_art_token")
    @ExcludeMissing
    fun _digitalCardArtToken(): JsonField<String> = digitalCardArtToken

    /** A list of events related to the tokenization. */
    @JsonProperty("events")
    @ExcludeMissing
    fun _events(): JsonField<List<TokenizationEvent>> = events

    /** The network's unique reference for the card that is tokenized. */
    @JsonProperty("payment_account_reference_id")
    @ExcludeMissing
    fun _paymentAccountReferenceId(): JsonField<String> = paymentAccountReferenceId

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    private var validated: Boolean = false

    fun validate(): Tokenization = apply {
        if (validated) {
            return@apply
        }

        token()
        accountToken()
        cardToken()
        createdAt()
        dpan()
        status()
        tokenRequestorName()
        tokenUniqueReference()
        tokenizationChannel()
        updatedAt()
        digitalCardArtToken()
        events()?.forEach { it.validate() }
        paymentAccountReferenceId()
        validated = true
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        fun builder() = Builder()
    }

    class Builder {

        private var token: JsonField<String>? = null
        private var accountToken: JsonField<String>? = null
        private var cardToken: JsonField<String>? = null
        private var createdAt: JsonField<OffsetDateTime>? = null
        private var dpan: JsonField<String>? = null
        private var status: JsonField<Status>? = null
        private var tokenRequestorName: JsonField<TokenRequestorName>? = null
        private var tokenUniqueReference: JsonField<String>? = null
        private var tokenizationChannel: JsonField<TokenizationChannel>? = null
        private var updatedAt: JsonField<OffsetDateTime>? = null
        private var digitalCardArtToken: JsonField<String> = JsonMissing.of()
        private var events: JsonField<MutableList<TokenizationEvent>>? = null
        private var paymentAccountReferenceId: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(tokenization: Tokenization) = apply {
            token = tokenization.token
            accountToken = tokenization.accountToken
            cardToken = tokenization.cardToken
            createdAt = tokenization.createdAt
            dpan = tokenization.dpan
            status = tokenization.status
            tokenRequestorName = tokenization.tokenRequestorName
            tokenUniqueReference = tokenization.tokenUniqueReference
            tokenizationChannel = tokenization.tokenizationChannel
            updatedAt = tokenization.updatedAt
            digitalCardArtToken = tokenization.digitalCardArtToken
            events = tokenization.events.map { it.toMutableList() }
            paymentAccountReferenceId = tokenization.paymentAccountReferenceId
            additionalProperties = tokenization.additionalProperties.toMutableMap()
        }

        /** Globally unique identifier for a Tokenization */
        fun token(token: String) = token(JsonField.of(token))

        /** Globally unique identifier for a Tokenization */
        fun token(token: JsonField<String>) = apply { this.token = token }

        /** The account token associated with the card being tokenized. */
        fun accountToken(accountToken: String) = accountToken(JsonField.of(accountToken))

        /** The account token associated with the card being tokenized. */
        fun accountToken(accountToken: JsonField<String>) = apply {
            this.accountToken = accountToken
        }

        /** The card token associated with the card being tokenized. */
        fun cardToken(cardToken: String) = cardToken(JsonField.of(cardToken))

        /** The card token associated with the card being tokenized. */
        fun cardToken(cardToken: JsonField<String>) = apply { this.cardToken = cardToken }

        /** Date and time when the tokenization first occurred. UTC time zone. */
        fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

        /** Date and time when the tokenization first occurred. UTC time zone. */
        fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply { this.createdAt = createdAt }

        /** The dynamic pan assigned to the token by the network. */
        fun dpan(dpan: String?) = dpan(JsonField.ofNullable(dpan))

        /** The dynamic pan assigned to the token by the network. */
        fun dpan(dpan: JsonField<String>) = apply { this.dpan = dpan }

        /** The status of the tokenization request */
        fun status(status: Status) = status(JsonField.of(status))

        /** The status of the tokenization request */
        fun status(status: JsonField<Status>) = apply { this.status = status }

        /** The entity that requested the tokenization. Represents a Digital Wallet or merchant. */
        fun tokenRequestorName(tokenRequestorName: TokenRequestorName) =
            tokenRequestorName(JsonField.of(tokenRequestorName))

        /** The entity that requested the tokenization. Represents a Digital Wallet or merchant. */
        fun tokenRequestorName(tokenRequestorName: JsonField<TokenRequestorName>) = apply {
            this.tokenRequestorName = tokenRequestorName
        }

        /** The network's unique reference for the tokenization. */
        fun tokenUniqueReference(tokenUniqueReference: String) =
            tokenUniqueReference(JsonField.of(tokenUniqueReference))

        /** The network's unique reference for the tokenization. */
        fun tokenUniqueReference(tokenUniqueReference: JsonField<String>) = apply {
            this.tokenUniqueReference = tokenUniqueReference
        }

        /** The channel through which the tokenization was made. */
        fun tokenizationChannel(tokenizationChannel: TokenizationChannel) =
            tokenizationChannel(JsonField.of(tokenizationChannel))

        /** The channel through which the tokenization was made. */
        fun tokenizationChannel(tokenizationChannel: JsonField<TokenizationChannel>) = apply {
            this.tokenizationChannel = tokenizationChannel
        }

        /** Latest date and time when the tokenization was updated. UTC time zone. */
        fun updatedAt(updatedAt: OffsetDateTime) = updatedAt(JsonField.of(updatedAt))

        /** Latest date and time when the tokenization was updated. UTC time zone. */
        fun updatedAt(updatedAt: JsonField<OffsetDateTime>) = apply { this.updatedAt = updatedAt }

        /**
         * Specifies the digital card art displayed in the user’s digital wallet after tokenization.
         * This will be null if the tokenization was created without an associated digital card art.
         * See
         * [Flexible Card Art Guide](https://docs.lithic.com/docs/about-digital-wallets#flexible-card-art).
         */
        fun digitalCardArtToken(digitalCardArtToken: String) =
            digitalCardArtToken(JsonField.of(digitalCardArtToken))

        /**
         * Specifies the digital card art displayed in the user’s digital wallet after tokenization.
         * This will be null if the tokenization was created without an associated digital card art.
         * See
         * [Flexible Card Art Guide](https://docs.lithic.com/docs/about-digital-wallets#flexible-card-art).
         */
        fun digitalCardArtToken(digitalCardArtToken: JsonField<String>) = apply {
            this.digitalCardArtToken = digitalCardArtToken
        }

        /** A list of events related to the tokenization. */
        fun events(events: List<TokenizationEvent>) = events(JsonField.of(events))

        /** A list of events related to the tokenization. */
        fun events(events: JsonField<List<TokenizationEvent>>) = apply {
            this.events = events.map { it.toMutableList() }
        }

        /** A list of events related to the tokenization. */
        fun addEvent(event: TokenizationEvent) = apply {
            events =
                (events ?: JsonField.of(mutableListOf())).apply {
                    (asKnown()
                            ?: throw IllegalStateException(
                                "Field was set to non-list type: ${javaClass.simpleName}"
                            ))
                        .add(event)
                }
        }

        /** The network's unique reference for the card that is tokenized. */
        fun paymentAccountReferenceId(paymentAccountReferenceId: String?) =
            paymentAccountReferenceId(JsonField.ofNullable(paymentAccountReferenceId))

        /** The network's unique reference for the card that is tokenized. */
        fun paymentAccountReferenceId(paymentAccountReferenceId: JsonField<String>) = apply {
            this.paymentAccountReferenceId = paymentAccountReferenceId
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

        fun build(): Tokenization =
            Tokenization(
                checkRequired("token", token),
                checkRequired("accountToken", accountToken),
                checkRequired("cardToken", cardToken),
                checkRequired("createdAt", createdAt),
                checkRequired("dpan", dpan),
                checkRequired("status", status),
                checkRequired("tokenRequestorName", tokenRequestorName),
                checkRequired("tokenUniqueReference", tokenUniqueReference),
                checkRequired("tokenizationChannel", tokenizationChannel),
                checkRequired("updatedAt", updatedAt),
                digitalCardArtToken,
                (events ?: JsonMissing.of()).map { it.toImmutable() },
                paymentAccountReferenceId,
                additionalProperties.toImmutable(),
            )
    }

    /** The status of the tokenization request */
    class Status
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            val ACTIVE = of("ACTIVE")

            val DEACTIVATED = of("DEACTIVATED")

            val INACTIVE = of("INACTIVE")

            val PAUSED = of("PAUSED")

            val PENDING_2_FA = of("PENDING_2FA")

            val PENDING_ACTIVATION = of("PENDING_ACTIVATION")

            val UNKNOWN = of("UNKNOWN")

            fun of(value: String) = Status(JsonField.of(value))
        }

        enum class Known {
            ACTIVE,
            DEACTIVATED,
            INACTIVE,
            PAUSED,
            PENDING_2_FA,
            PENDING_ACTIVATION,
            UNKNOWN,
        }

        enum class Value {
            ACTIVE,
            DEACTIVATED,
            INACTIVE,
            PAUSED,
            PENDING_2_FA,
            PENDING_ACTIVATION,
            UNKNOWN,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                ACTIVE -> Value.ACTIVE
                DEACTIVATED -> Value.DEACTIVATED
                INACTIVE -> Value.INACTIVE
                PAUSED -> Value.PAUSED
                PENDING_2_FA -> Value.PENDING_2_FA
                PENDING_ACTIVATION -> Value.PENDING_ACTIVATION
                UNKNOWN -> Value.UNKNOWN
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                ACTIVE -> Known.ACTIVE
                DEACTIVATED -> Known.DEACTIVATED
                INACTIVE -> Known.INACTIVE
                PAUSED -> Known.PAUSED
                PENDING_2_FA -> Known.PENDING_2_FA
                PENDING_ACTIVATION -> Known.PENDING_ACTIVATION
                UNKNOWN -> Known.UNKNOWN
                else -> throw LithicInvalidDataException("Unknown Status: $value")
            }

        fun asString(): String = _value().asStringOrThrow()

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Status && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /** The entity that requested the tokenization. Represents a Digital Wallet or merchant. */
    class TokenRequestorName
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            val AMAZON_ONE = of("AMAZON_ONE")

            val ANDROID_PAY = of("ANDROID_PAY")

            val APPLE_PAY = of("APPLE_PAY")

            val FACEBOOK = of("FACEBOOK")

            val FITBIT_PAY = of("FITBIT_PAY")

            val GARMIN_PAY = of("GARMIN_PAY")

            val MICROSOFT_PAY = of("MICROSOFT_PAY")

            val NETFLIX = of("NETFLIX")

            val SAMSUNG_PAY = of("SAMSUNG_PAY")

            val UNKNOWN = of("UNKNOWN")

            val VISA_CHECKOUT = of("VISA_CHECKOUT")

            fun of(value: String) = TokenRequestorName(JsonField.of(value))
        }

        enum class Known {
            AMAZON_ONE,
            ANDROID_PAY,
            APPLE_PAY,
            FACEBOOK,
            FITBIT_PAY,
            GARMIN_PAY,
            MICROSOFT_PAY,
            NETFLIX,
            SAMSUNG_PAY,
            UNKNOWN,
            VISA_CHECKOUT,
        }

        enum class Value {
            AMAZON_ONE,
            ANDROID_PAY,
            APPLE_PAY,
            FACEBOOK,
            FITBIT_PAY,
            GARMIN_PAY,
            MICROSOFT_PAY,
            NETFLIX,
            SAMSUNG_PAY,
            UNKNOWN,
            VISA_CHECKOUT,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                AMAZON_ONE -> Value.AMAZON_ONE
                ANDROID_PAY -> Value.ANDROID_PAY
                APPLE_PAY -> Value.APPLE_PAY
                FACEBOOK -> Value.FACEBOOK
                FITBIT_PAY -> Value.FITBIT_PAY
                GARMIN_PAY -> Value.GARMIN_PAY
                MICROSOFT_PAY -> Value.MICROSOFT_PAY
                NETFLIX -> Value.NETFLIX
                SAMSUNG_PAY -> Value.SAMSUNG_PAY
                UNKNOWN -> Value.UNKNOWN
                VISA_CHECKOUT -> Value.VISA_CHECKOUT
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                AMAZON_ONE -> Known.AMAZON_ONE
                ANDROID_PAY -> Known.ANDROID_PAY
                APPLE_PAY -> Known.APPLE_PAY
                FACEBOOK -> Known.FACEBOOK
                FITBIT_PAY -> Known.FITBIT_PAY
                GARMIN_PAY -> Known.GARMIN_PAY
                MICROSOFT_PAY -> Known.MICROSOFT_PAY
                NETFLIX -> Known.NETFLIX
                SAMSUNG_PAY -> Known.SAMSUNG_PAY
                UNKNOWN -> Known.UNKNOWN
                VISA_CHECKOUT -> Known.VISA_CHECKOUT
                else -> throw LithicInvalidDataException("Unknown TokenRequestorName: $value")
            }

        fun asString(): String = _value().asStringOrThrow()

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is TokenRequestorName && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /** The channel through which the tokenization was made. */
    class TokenizationChannel
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            val DIGITAL_WALLET = of("DIGITAL_WALLET")

            val MERCHANT = of("MERCHANT")

            fun of(value: String) = TokenizationChannel(JsonField.of(value))
        }

        enum class Known {
            DIGITAL_WALLET,
            MERCHANT,
        }

        enum class Value {
            DIGITAL_WALLET,
            MERCHANT,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                DIGITAL_WALLET -> Value.DIGITAL_WALLET
                MERCHANT -> Value.MERCHANT
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                DIGITAL_WALLET -> Known.DIGITAL_WALLET
                MERCHANT -> Known.MERCHANT
                else -> throw LithicInvalidDataException("Unknown TokenizationChannel: $value")
            }

        fun asString(): String = _value().asStringOrThrow()

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is TokenizationChannel && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    @NoAutoDetect
    class TokenizationEvent
    @JsonCreator
    private constructor(
        @JsonProperty("token")
        @ExcludeMissing
        private val token: JsonField<String> = JsonMissing.of(),
        @JsonProperty("created_at")
        @ExcludeMissing
        private val createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("result")
        @ExcludeMissing
        private val result: JsonField<Result> = JsonMissing.of(),
        @JsonProperty("type") @ExcludeMissing private val type: JsonField<Type> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /** Globally unique identifier for a Tokenization Event */
        fun token(): String? = token.getNullable("token")

        /** Date and time when the tokenization event first occurred. UTC time zone. */
        fun createdAt(): OffsetDateTime? = createdAt.getNullable("created_at")

        /** Enum representing the result of the tokenization event */
        fun result(): Result? = result.getNullable("result")

        /** Enum representing the type of tokenization event that occurred */
        fun type(): Type? = type.getNullable("type")

        /** Globally unique identifier for a Tokenization Event */
        @JsonProperty("token") @ExcludeMissing fun _token(): JsonField<String> = token

        /** Date and time when the tokenization event first occurred. UTC time zone. */
        @JsonProperty("created_at")
        @ExcludeMissing
        fun _createdAt(): JsonField<OffsetDateTime> = createdAt

        /** Enum representing the result of the tokenization event */
        @JsonProperty("result") @ExcludeMissing fun _result(): JsonField<Result> = result

        /** Enum representing the type of tokenization event that occurred */
        @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): TokenizationEvent = apply {
            if (validated) {
                return@apply
            }

            token()
            createdAt()
            result()
            type()
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var token: JsonField<String> = JsonMissing.of()
            private var createdAt: JsonField<OffsetDateTime> = JsonMissing.of()
            private var result: JsonField<Result> = JsonMissing.of()
            private var type: JsonField<Type> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(tokenizationEvent: TokenizationEvent) = apply {
                token = tokenizationEvent.token
                createdAt = tokenizationEvent.createdAt
                result = tokenizationEvent.result
                type = tokenizationEvent.type
                additionalProperties = tokenizationEvent.additionalProperties.toMutableMap()
            }

            /** Globally unique identifier for a Tokenization Event */
            fun token(token: String) = token(JsonField.of(token))

            /** Globally unique identifier for a Tokenization Event */
            fun token(token: JsonField<String>) = apply { this.token = token }

            /** Date and time when the tokenization event first occurred. UTC time zone. */
            fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

            /** Date and time when the tokenization event first occurred. UTC time zone. */
            fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply {
                this.createdAt = createdAt
            }

            /** Enum representing the result of the tokenization event */
            fun result(result: Result) = result(JsonField.of(result))

            /** Enum representing the result of the tokenization event */
            fun result(result: JsonField<Result>) = apply { this.result = result }

            /** Enum representing the type of tokenization event that occurred */
            fun type(type: Type) = type(JsonField.of(type))

            /** Enum representing the type of tokenization event that occurred */
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

            fun build(): TokenizationEvent =
                TokenizationEvent(
                    token,
                    createdAt,
                    result,
                    type,
                    additionalProperties.toImmutable(),
                )
        }

        /** Enum representing the result of the tokenization event */
        class Result
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) : Enum {

            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                val APPROVED = of("APPROVED")

                val DECLINED = of("DECLINED")

                val NOTIFICATION_DELIVERED = of("NOTIFICATION_DELIVERED")

                val REQUIRE_ADDITIONAL_AUTHENTICATION = of("REQUIRE_ADDITIONAL_AUTHENTICATION")

                val TOKEN_ACTIVATED = of("TOKEN_ACTIVATED")

                val TOKEN_CREATED = of("TOKEN_CREATED")

                val TOKEN_DEACTIVATED = of("TOKEN_DEACTIVATED")

                val TOKEN_INACTIVE = of("TOKEN_INACTIVE")

                val TOKEN_STATE_UNKNOWN = of("TOKEN_STATE_UNKNOWN")

                val TOKEN_SUSPENDED = of("TOKEN_SUSPENDED")

                val TOKEN_UPDATED = of("TOKEN_UPDATED")

                fun of(value: String) = Result(JsonField.of(value))
            }

            enum class Known {
                APPROVED,
                DECLINED,
                NOTIFICATION_DELIVERED,
                REQUIRE_ADDITIONAL_AUTHENTICATION,
                TOKEN_ACTIVATED,
                TOKEN_CREATED,
                TOKEN_DEACTIVATED,
                TOKEN_INACTIVE,
                TOKEN_STATE_UNKNOWN,
                TOKEN_SUSPENDED,
                TOKEN_UPDATED,
            }

            enum class Value {
                APPROVED,
                DECLINED,
                NOTIFICATION_DELIVERED,
                REQUIRE_ADDITIONAL_AUTHENTICATION,
                TOKEN_ACTIVATED,
                TOKEN_CREATED,
                TOKEN_DEACTIVATED,
                TOKEN_INACTIVE,
                TOKEN_STATE_UNKNOWN,
                TOKEN_SUSPENDED,
                TOKEN_UPDATED,
                _UNKNOWN,
            }

            fun value(): Value =
                when (this) {
                    APPROVED -> Value.APPROVED
                    DECLINED -> Value.DECLINED
                    NOTIFICATION_DELIVERED -> Value.NOTIFICATION_DELIVERED
                    REQUIRE_ADDITIONAL_AUTHENTICATION -> Value.REQUIRE_ADDITIONAL_AUTHENTICATION
                    TOKEN_ACTIVATED -> Value.TOKEN_ACTIVATED
                    TOKEN_CREATED -> Value.TOKEN_CREATED
                    TOKEN_DEACTIVATED -> Value.TOKEN_DEACTIVATED
                    TOKEN_INACTIVE -> Value.TOKEN_INACTIVE
                    TOKEN_STATE_UNKNOWN -> Value.TOKEN_STATE_UNKNOWN
                    TOKEN_SUSPENDED -> Value.TOKEN_SUSPENDED
                    TOKEN_UPDATED -> Value.TOKEN_UPDATED
                    else -> Value._UNKNOWN
                }

            fun known(): Known =
                when (this) {
                    APPROVED -> Known.APPROVED
                    DECLINED -> Known.DECLINED
                    NOTIFICATION_DELIVERED -> Known.NOTIFICATION_DELIVERED
                    REQUIRE_ADDITIONAL_AUTHENTICATION -> Known.REQUIRE_ADDITIONAL_AUTHENTICATION
                    TOKEN_ACTIVATED -> Known.TOKEN_ACTIVATED
                    TOKEN_CREATED -> Known.TOKEN_CREATED
                    TOKEN_DEACTIVATED -> Known.TOKEN_DEACTIVATED
                    TOKEN_INACTIVE -> Known.TOKEN_INACTIVE
                    TOKEN_STATE_UNKNOWN -> Known.TOKEN_STATE_UNKNOWN
                    TOKEN_SUSPENDED -> Known.TOKEN_SUSPENDED
                    TOKEN_UPDATED -> Known.TOKEN_UPDATED
                    else -> throw LithicInvalidDataException("Unknown Result: $value")
                }

            fun asString(): String = _value().asStringOrThrow()

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is Result && value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        /** Enum representing the type of tokenization event that occurred */
        class Type
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) : Enum {

            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                val TOKENIZATION_2_FA = of("TOKENIZATION_2FA")

                val TOKENIZATION_AUTHORIZATION = of("TOKENIZATION_AUTHORIZATION")

                val TOKENIZATION_DECISIONING = of("TOKENIZATION_DECISIONING")

                val TOKENIZATION_ELIGIBILITY_CHECK = of("TOKENIZATION_ELIGIBILITY_CHECK")

                val TOKENIZATION_UPDATED = of("TOKENIZATION_UPDATED")

                fun of(value: String) = Type(JsonField.of(value))
            }

            enum class Known {
                TOKENIZATION_2_FA,
                TOKENIZATION_AUTHORIZATION,
                TOKENIZATION_DECISIONING,
                TOKENIZATION_ELIGIBILITY_CHECK,
                TOKENIZATION_UPDATED,
            }

            enum class Value {
                TOKENIZATION_2_FA,
                TOKENIZATION_AUTHORIZATION,
                TOKENIZATION_DECISIONING,
                TOKENIZATION_ELIGIBILITY_CHECK,
                TOKENIZATION_UPDATED,
                _UNKNOWN,
            }

            fun value(): Value =
                when (this) {
                    TOKENIZATION_2_FA -> Value.TOKENIZATION_2_FA
                    TOKENIZATION_AUTHORIZATION -> Value.TOKENIZATION_AUTHORIZATION
                    TOKENIZATION_DECISIONING -> Value.TOKENIZATION_DECISIONING
                    TOKENIZATION_ELIGIBILITY_CHECK -> Value.TOKENIZATION_ELIGIBILITY_CHECK
                    TOKENIZATION_UPDATED -> Value.TOKENIZATION_UPDATED
                    else -> Value._UNKNOWN
                }

            fun known(): Known =
                when (this) {
                    TOKENIZATION_2_FA -> Known.TOKENIZATION_2_FA
                    TOKENIZATION_AUTHORIZATION -> Known.TOKENIZATION_AUTHORIZATION
                    TOKENIZATION_DECISIONING -> Known.TOKENIZATION_DECISIONING
                    TOKENIZATION_ELIGIBILITY_CHECK -> Known.TOKENIZATION_ELIGIBILITY_CHECK
                    TOKENIZATION_UPDATED -> Known.TOKENIZATION_UPDATED
                    else -> throw LithicInvalidDataException("Unknown Type: $value")
                }

            fun asString(): String = _value().asStringOrThrow()

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

            return /* spotless:off */ other is TokenizationEvent && token == other.token && createdAt == other.createdAt && result == other.result && type == other.type && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(token, createdAt, result, type, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "TokenizationEvent{token=$token, createdAt=$createdAt, result=$result, type=$type, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is Tokenization && token == other.token && accountToken == other.accountToken && cardToken == other.cardToken && createdAt == other.createdAt && dpan == other.dpan && status == other.status && tokenRequestorName == other.tokenRequestorName && tokenUniqueReference == other.tokenUniqueReference && tokenizationChannel == other.tokenizationChannel && updatedAt == other.updatedAt && digitalCardArtToken == other.digitalCardArtToken && events == other.events && paymentAccountReferenceId == other.paymentAccountReferenceId && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(token, accountToken, cardToken, createdAt, dpan, status, tokenRequestorName, tokenUniqueReference, tokenizationChannel, updatedAt, digitalCardArtToken, events, paymentAccountReferenceId, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "Tokenization{token=$token, accountToken=$accountToken, cardToken=$cardToken, createdAt=$createdAt, dpan=$dpan, status=$status, tokenRequestorName=$tokenRequestorName, tokenUniqueReference=$tokenUniqueReference, tokenizationChannel=$tokenizationChannel, updatedAt=$updatedAt, digitalCardArtToken=$digitalCardArtToken, events=$events, paymentAccountReferenceId=$paymentAccountReferenceId, additionalProperties=$additionalProperties}"
}
