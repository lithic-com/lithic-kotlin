// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.lithic.api.core.Enum
import com.lithic.api.core.ExcludeMissing
import com.lithic.api.core.JsonField
import com.lithic.api.core.JsonValue
import com.lithic.api.core.NoAutoDetect
import com.lithic.api.core.http.Headers
import com.lithic.api.core.http.QueryParams
import com.lithic.api.core.toImmutable
import com.lithic.api.errors.LithicInvalidDataException
import com.lithic.api.models.*
import java.util.Objects

class CardUpdateParams
constructor(
    private val cardToken: String,
    private val digitalCardArtToken: String?,
    private val memo: String?,
    private val pin: String?,
    private val pinStatus: PinStatus?,
    private val spendLimit: Long?,
    private val spendLimitDuration: SpendLimitDuration?,
    private val state: State?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
    private val additionalBodyProperties: Map<String, JsonValue>,
) {

    fun cardToken(): String = cardToken

    fun digitalCardArtToken(): String? = digitalCardArtToken

    fun memo(): String? = memo

    fun pin(): String? = pin

    fun pinStatus(): PinStatus? = pinStatus

    fun spendLimit(): Long? = spendLimit

    fun spendLimitDuration(): SpendLimitDuration? = spendLimitDuration

    fun state(): State? = state

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun _additionalBodyProperties(): Map<String, JsonValue> = additionalBodyProperties

    internal fun getBody(): CardUpdateBody {
        return CardUpdateBody(
            digitalCardArtToken,
            memo,
            pin,
            pinStatus,
            spendLimit,
            spendLimitDuration,
            state,
            additionalBodyProperties,
        )
    }

    internal fun getHeaders(): Headers = additionalHeaders

    internal fun getQueryParams(): QueryParams = additionalQueryParams

    fun getPathParam(index: Int): String {
        return when (index) {
            0 -> cardToken
            else -> ""
        }
    }

    @JsonDeserialize(builder = CardUpdateBody.Builder::class)
    @NoAutoDetect
    class CardUpdateBody
    internal constructor(
        private val digitalCardArtToken: String?,
        private val memo: String?,
        private val pin: String?,
        private val pinStatus: PinStatus?,
        private val spendLimit: Long?,
        private val spendLimitDuration: SpendLimitDuration?,
        private val state: State?,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        /**
         * Specifies the digital card art to be displayed in the user’s digital wallet after
         * tokenization. This artwork must be approved by Mastercard and configured by Lithic to
         * use. See
         * [Flexible Card Art Guide](https://docs.lithic.com/docs/about-digital-wallets#flexible-card-art).
         */
        @JsonProperty("digital_card_art_token")
        fun digitalCardArtToken(): String? = digitalCardArtToken

        /** Friendly name to identify the card. */
        @JsonProperty("memo") fun memo(): String? = memo

        /**
         * Encrypted PIN block (in base64). Only applies to cards of type `PHYSICAL` and `VIRTUAL`.
         * Changing PIN also resets PIN status to `OK`. See
         * [Encrypted PIN Block](https://docs.lithic.com/docs/cards#encrypted-pin-block).
         */
        @JsonProperty("pin") fun pin(): String? = pin

        /**
         * Indicates if a card is blocked due a PIN status issue (e.g. excessive incorrect
         * attempts). Can only be set to `OK` to unblock a card.
         */
        @JsonProperty("pin_status") fun pinStatus(): PinStatus? = pinStatus

        /**
         * Amount (in cents) to limit approved authorizations. Transaction requests above the spend
         * limit will be declined. Note that a spend limit of 0 is effectively no limit, and should
         * only be used to reset or remove a prior limit. Only a limit of 1 or above will result in
         * declined transactions due to checks against the card limit.
         */
        @JsonProperty("spend_limit") fun spendLimit(): Long? = spendLimit

        /**
         * Spend limit duration values:
         * - `ANNUALLY` - Card will authorize transactions up to spend limit for the trailing year.
         * - `FOREVER` - Card will authorize only up to spend limit for the entire lifetime of the
         *   card.
         * - `MONTHLY` - Card will authorize transactions up to spend limit for the trailing month.
         *   To support recurring monthly payments, which can occur on different day every month,
         *   the time window we consider for monthly velocity starts 6 days after the current
         *   calendar date one month prior.
         * - `TRANSACTION` - Card will authorize multiple transactions if each individual
         *   transaction is under the spend limit.
         */
        @JsonProperty("spend_limit_duration")
        fun spendLimitDuration(): SpendLimitDuration? = spendLimitDuration

        /**
         * Card state values:
         * - `CLOSED` - Card will no longer approve authorizations. Closing a card cannot be undone.
         * - `OPEN` - Card will approve authorizations (if they match card and account parameters).
         * - `PAUSED` - Card will decline authorizations, but can be resumed at a later time.
         */
        @JsonProperty("state") fun state(): State? = state

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var digitalCardArtToken: String? = null
            private var memo: String? = null
            private var pin: String? = null
            private var pinStatus: PinStatus? = null
            private var spendLimit: Long? = null
            private var spendLimitDuration: SpendLimitDuration? = null
            private var state: State? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(cardUpdateBody: CardUpdateBody) = apply {
                this.digitalCardArtToken = cardUpdateBody.digitalCardArtToken
                this.memo = cardUpdateBody.memo
                this.pin = cardUpdateBody.pin
                this.pinStatus = cardUpdateBody.pinStatus
                this.spendLimit = cardUpdateBody.spendLimit
                this.spendLimitDuration = cardUpdateBody.spendLimitDuration
                this.state = cardUpdateBody.state
                additionalProperties(cardUpdateBody.additionalProperties)
            }

            /**
             * Specifies the digital card art to be displayed in the user’s digital wallet after
             * tokenization. This artwork must be approved by Mastercard and configured by Lithic to
             * use. See
             * [Flexible Card Art Guide](https://docs.lithic.com/docs/about-digital-wallets#flexible-card-art).
             */
            @JsonProperty("digital_card_art_token")
            fun digitalCardArtToken(digitalCardArtToken: String) = apply {
                this.digitalCardArtToken = digitalCardArtToken
            }

            /** Friendly name to identify the card. */
            @JsonProperty("memo") fun memo(memo: String) = apply { this.memo = memo }

            /**
             * Encrypted PIN block (in base64). Only applies to cards of type `PHYSICAL` and
             * `VIRTUAL`. Changing PIN also resets PIN status to `OK`. See
             * [Encrypted PIN Block](https://docs.lithic.com/docs/cards#encrypted-pin-block).
             */
            @JsonProperty("pin") fun pin(pin: String) = apply { this.pin = pin }

            /**
             * Indicates if a card is blocked due a PIN status issue (e.g. excessive incorrect
             * attempts). Can only be set to `OK` to unblock a card.
             */
            @JsonProperty("pin_status")
            fun pinStatus(pinStatus: PinStatus) = apply { this.pinStatus = pinStatus }

            /**
             * Amount (in cents) to limit approved authorizations. Transaction requests above the
             * spend limit will be declined. Note that a spend limit of 0 is effectively no limit,
             * and should only be used to reset or remove a prior limit. Only a limit of 1 or above
             * will result in declined transactions due to checks against the card limit.
             */
            @JsonProperty("spend_limit")
            fun spendLimit(spendLimit: Long) = apply { this.spendLimit = spendLimit }

            /**
             * Spend limit duration values:
             * - `ANNUALLY` - Card will authorize transactions up to spend limit for the trailing
             *   year.
             * - `FOREVER` - Card will authorize only up to spend limit for the entire lifetime of
             *   the card.
             * - `MONTHLY` - Card will authorize transactions up to spend limit for the trailing
             *   month. To support recurring monthly payments, which can occur on different day
             *   every month, the time window we consider for monthly velocity starts 6 days after
             *   the current calendar date one month prior.
             * - `TRANSACTION` - Card will authorize multiple transactions if each individual
             *   transaction is under the spend limit.
             */
            @JsonProperty("spend_limit_duration")
            fun spendLimitDuration(spendLimitDuration: SpendLimitDuration) = apply {
                this.spendLimitDuration = spendLimitDuration
            }

            /**
             * Card state values:
             * - `CLOSED` - Card will no longer approve authorizations. Closing a card cannot be
             *   undone.
             * - `OPEN` - Card will approve authorizations (if they match card and account
             *   parameters).
             * - `PAUSED` - Card will decline authorizations, but can be resumed at a later time.
             */
            @JsonProperty("state") fun state(state: State) = apply { this.state = state }

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

            fun build(): CardUpdateBody =
                CardUpdateBody(
                    digitalCardArtToken,
                    memo,
                    pin,
                    pinStatus,
                    spendLimit,
                    spendLimitDuration,
                    state,
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is CardUpdateBody && digitalCardArtToken == other.digitalCardArtToken && memo == other.memo && pin == other.pin && pinStatus == other.pinStatus && spendLimit == other.spendLimit && spendLimitDuration == other.spendLimitDuration && state == other.state && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(digitalCardArtToken, memo, pin, pinStatus, spendLimit, spendLimitDuration, state, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "CardUpdateBody{digitalCardArtToken=$digitalCardArtToken, memo=$memo, pin=$pin, pinStatus=$pinStatus, spendLimit=$spendLimit, spendLimitDuration=$spendLimitDuration, state=$state, additionalProperties=$additionalProperties}"
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var cardToken: String? = null
        private var digitalCardArtToken: String? = null
        private var memo: String? = null
        private var pin: String? = null
        private var pinStatus: PinStatus? = null
        private var spendLimit: Long? = null
        private var spendLimitDuration: SpendLimitDuration? = null
        private var state: State? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()
        private var additionalBodyProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(cardUpdateParams: CardUpdateParams) = apply {
            cardToken = cardUpdateParams.cardToken
            digitalCardArtToken = cardUpdateParams.digitalCardArtToken
            memo = cardUpdateParams.memo
            pin = cardUpdateParams.pin
            pinStatus = cardUpdateParams.pinStatus
            spendLimit = cardUpdateParams.spendLimit
            spendLimitDuration = cardUpdateParams.spendLimitDuration
            state = cardUpdateParams.state
            additionalHeaders = cardUpdateParams.additionalHeaders.toBuilder()
            additionalQueryParams = cardUpdateParams.additionalQueryParams.toBuilder()
            additionalBodyProperties = cardUpdateParams.additionalBodyProperties.toMutableMap()
        }

        fun cardToken(cardToken: String) = apply { this.cardToken = cardToken }

        /**
         * Specifies the digital card art to be displayed in the user’s digital wallet after
         * tokenization. This artwork must be approved by Mastercard and configured by Lithic to
         * use. See
         * [Flexible Card Art Guide](https://docs.lithic.com/docs/about-digital-wallets#flexible-card-art).
         */
        fun digitalCardArtToken(digitalCardArtToken: String) = apply {
            this.digitalCardArtToken = digitalCardArtToken
        }

        /** Friendly name to identify the card. */
        fun memo(memo: String) = apply { this.memo = memo }

        /**
         * Encrypted PIN block (in base64). Only applies to cards of type `PHYSICAL` and `VIRTUAL`.
         * Changing PIN also resets PIN status to `OK`. See
         * [Encrypted PIN Block](https://docs.lithic.com/docs/cards#encrypted-pin-block).
         */
        fun pin(pin: String) = apply { this.pin = pin }

        /**
         * Indicates if a card is blocked due a PIN status issue (e.g. excessive incorrect
         * attempts). Can only be set to `OK` to unblock a card.
         */
        fun pinStatus(pinStatus: PinStatus) = apply { this.pinStatus = pinStatus }

        /**
         * Amount (in cents) to limit approved authorizations. Transaction requests above the spend
         * limit will be declined. Note that a spend limit of 0 is effectively no limit, and should
         * only be used to reset or remove a prior limit. Only a limit of 1 or above will result in
         * declined transactions due to checks against the card limit.
         */
        fun spendLimit(spendLimit: Long) = apply { this.spendLimit = spendLimit }

        /**
         * Spend limit duration values:
         * - `ANNUALLY` - Card will authorize transactions up to spend limit for the trailing year.
         * - `FOREVER` - Card will authorize only up to spend limit for the entire lifetime of the
         *   card.
         * - `MONTHLY` - Card will authorize transactions up to spend limit for the trailing month.
         *   To support recurring monthly payments, which can occur on different day every month,
         *   the time window we consider for monthly velocity starts 6 days after the current
         *   calendar date one month prior.
         * - `TRANSACTION` - Card will authorize multiple transactions if each individual
         *   transaction is under the spend limit.
         */
        fun spendLimitDuration(spendLimitDuration: SpendLimitDuration) = apply {
            this.spendLimitDuration = spendLimitDuration
        }

        /**
         * Card state values:
         * - `CLOSED` - Card will no longer approve authorizations. Closing a card cannot be undone.
         * - `OPEN` - Card will approve authorizations (if they match card and account parameters).
         * - `PAUSED` - Card will decline authorizations, but can be resumed at a later time.
         */
        fun state(state: State) = apply { this.state = state }

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

        fun additionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) = apply {
            this.additionalBodyProperties.clear()
            putAllAdditionalBodyProperties(additionalBodyProperties)
        }

        fun putAdditionalBodyProperty(key: String, value: JsonValue) = apply {
            additionalBodyProperties.put(key, value)
        }

        fun putAllAdditionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) =
            apply {
                this.additionalBodyProperties.putAll(additionalBodyProperties)
            }

        fun removeAdditionalBodyProperty(key: String) = apply {
            additionalBodyProperties.remove(key)
        }

        fun removeAllAdditionalBodyProperties(keys: Set<String>) = apply {
            keys.forEach(::removeAdditionalBodyProperty)
        }

        fun build(): CardUpdateParams =
            CardUpdateParams(
                checkNotNull(cardToken) { "`cardToken` is required but was not set" },
                digitalCardArtToken,
                memo,
                pin,
                pinStatus,
                spendLimit,
                spendLimitDuration,
                state,
                additionalHeaders.build(),
                additionalQueryParams.build(),
                additionalBodyProperties.toImmutable(),
            )
    }

    class PinStatus
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is PinStatus && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()

        companion object {

            val OK = PinStatus(JsonField.of("OK"))

            fun of(value: String) = PinStatus(JsonField.of(value))
        }

        enum class Known {
            OK,
        }

        enum class Value {
            OK,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                OK -> Value.OK
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                OK -> Known.OK
                else -> throw LithicInvalidDataException("Unknown PinStatus: $value")
            }

        fun asString(): String = _value().asStringOrThrow()
    }

    class State
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is State && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()

        companion object {

            val CLOSED = State(JsonField.of("CLOSED"))

            val OPEN = State(JsonField.of("OPEN"))

            val PAUSED = State(JsonField.of("PAUSED"))

            fun of(value: String) = State(JsonField.of(value))
        }

        enum class Known {
            CLOSED,
            OPEN,
            PAUSED,
        }

        enum class Value {
            CLOSED,
            OPEN,
            PAUSED,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                CLOSED -> Value.CLOSED
                OPEN -> Value.OPEN
                PAUSED -> Value.PAUSED
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                CLOSED -> Known.CLOSED
                OPEN -> Known.OPEN
                PAUSED -> Known.PAUSED
                else -> throw LithicInvalidDataException("Unknown State: $value")
            }

        fun asString(): String = _value().asStringOrThrow()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is CardUpdateParams && cardToken == other.cardToken && digitalCardArtToken == other.digitalCardArtToken && memo == other.memo && pin == other.pin && pinStatus == other.pinStatus && spendLimit == other.spendLimit && spendLimitDuration == other.spendLimitDuration && state == other.state && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams && additionalBodyProperties == other.additionalBodyProperties /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(cardToken, digitalCardArtToken, memo, pin, pinStatus, spendLimit, spendLimitDuration, state, additionalHeaders, additionalQueryParams, additionalBodyProperties) /* spotless:on */

    override fun toString() =
        "CardUpdateParams{cardToken=$cardToken, digitalCardArtToken=$digitalCardArtToken, memo=$memo, pin=$pin, pinStatus=$pinStatus, spendLimit=$spendLimit, spendLimitDuration=$spendLimitDuration, state=$state, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams, additionalBodyProperties=$additionalBodyProperties}"
}
