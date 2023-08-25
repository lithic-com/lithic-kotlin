package com.lithic.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.lithic.api.core.ExcludeMissing
import com.lithic.api.core.JsonField
import com.lithic.api.core.JsonValue
import com.lithic.api.core.NoAutoDetect
import com.lithic.api.core.toUnmodifiable
import com.lithic.api.errors.LithicInvalidDataException
import com.lithic.api.models.*
import java.util.Objects

class EventSubscriptionCreateParams
constructor(
    private val url: String,
    private val description: String?,
    private val disabled: Boolean?,
    private val eventTypes: List<EventType>?,
    private val additionalQueryParams: Map<String, List<String>>,
    private val additionalHeaders: Map<String, List<String>>,
    private val additionalBodyProperties: Map<String, JsonValue>,
) {

    fun url(): String = url

    fun description(): String? = description

    fun disabled(): Boolean? = disabled

    fun eventTypes(): List<EventType>? = eventTypes

    internal fun getBody(): EventSubscriptionCreateBody {
        return EventSubscriptionCreateBody(
            url,
            description,
            disabled,
            eventTypes,
            additionalBodyProperties,
        )
    }

    internal fun getQueryParams(): Map<String, List<String>> = additionalQueryParams

    internal fun getHeaders(): Map<String, List<String>> = additionalHeaders

    @JsonDeserialize(builder = EventSubscriptionCreateBody.Builder::class)
    @NoAutoDetect
    class EventSubscriptionCreateBody
    internal constructor(
        private val url: String?,
        private val description: String?,
        private val disabled: Boolean?,
        private val eventTypes: List<EventType>?,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var hashCode: Int = 0

        /** URL to which event webhooks will be sent. URL must be a valid HTTPS address. */
        @JsonProperty("url") fun url(): String? = url

        /** Event subscription description. */
        @JsonProperty("description") fun description(): String? = description

        /** Whether the event subscription is active (false) or inactive (true). */
        @JsonProperty("disabled") fun disabled(): Boolean? = disabled

        /**
         * Indicates types of events that will be sent to this subscription. If left blank, all
         * types will be sent.
         */
        @JsonProperty("event_types") fun eventTypes(): List<EventType>? = eventTypes

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is EventSubscriptionCreateBody &&
                this.url == other.url &&
                this.description == other.description &&
                this.disabled == other.disabled &&
                this.eventTypes == other.eventTypes &&
                this.additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode =
                    Objects.hash(
                        url,
                        description,
                        disabled,
                        eventTypes,
                        additionalProperties,
                    )
            }
            return hashCode
        }

        override fun toString() =
            "EventSubscriptionCreateBody{url=$url, description=$description, disabled=$disabled, eventTypes=$eventTypes, additionalProperties=$additionalProperties}"

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var url: String? = null
            private var description: String? = null
            private var disabled: Boolean? = null
            private var eventTypes: List<EventType>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(eventSubscriptionCreateBody: EventSubscriptionCreateBody) = apply {
                this.url = eventSubscriptionCreateBody.url
                this.description = eventSubscriptionCreateBody.description
                this.disabled = eventSubscriptionCreateBody.disabled
                this.eventTypes = eventSubscriptionCreateBody.eventTypes
                additionalProperties(eventSubscriptionCreateBody.additionalProperties)
            }

            /** URL to which event webhooks will be sent. URL must be a valid HTTPS address. */
            @JsonProperty("url") fun url(url: String) = apply { this.url = url }

            /** Event subscription description. */
            @JsonProperty("description")
            fun description(description: String) = apply { this.description = description }

            /** Whether the event subscription is active (false) or inactive (true). */
            @JsonProperty("disabled")
            fun disabled(disabled: Boolean) = apply { this.disabled = disabled }

            /**
             * Indicates types of events that will be sent to this subscription. If left blank, all
             * types will be sent.
             */
            @JsonProperty("event_types")
            fun eventTypes(eventTypes: List<EventType>) = apply { this.eventTypes = eventTypes }

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

            fun build(): EventSubscriptionCreateBody =
                EventSubscriptionCreateBody(
                    checkNotNull(url) { "`url` is required but was not set" },
                    description,
                    disabled,
                    eventTypes?.toUnmodifiable(),
                    additionalProperties.toUnmodifiable(),
                )
        }
    }

    fun _additionalQueryParams(): Map<String, List<String>> = additionalQueryParams

    fun _additionalHeaders(): Map<String, List<String>> = additionalHeaders

    fun _additionalBodyProperties(): Map<String, JsonValue> = additionalBodyProperties

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is EventSubscriptionCreateParams &&
            this.url == other.url &&
            this.description == other.description &&
            this.disabled == other.disabled &&
            this.eventTypes == other.eventTypes &&
            this.additionalQueryParams == other.additionalQueryParams &&
            this.additionalHeaders == other.additionalHeaders &&
            this.additionalBodyProperties == other.additionalBodyProperties
    }

    override fun hashCode(): Int {
        return Objects.hash(
            url,
            description,
            disabled,
            eventTypes,
            additionalQueryParams,
            additionalHeaders,
            additionalBodyProperties,
        )
    }

    override fun toString() =
        "EventSubscriptionCreateParams{url=$url, description=$description, disabled=$disabled, eventTypes=$eventTypes, additionalQueryParams=$additionalQueryParams, additionalHeaders=$additionalHeaders, additionalBodyProperties=$additionalBodyProperties}"

    fun toBuilder() = Builder().from(this)

    companion object {

        fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var url: String? = null
        private var description: String? = null
        private var disabled: Boolean? = null
        private var eventTypes: MutableList<EventType> = mutableListOf()
        private var additionalQueryParams: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalHeaders: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalBodyProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(eventSubscriptionCreateParams: EventSubscriptionCreateParams) = apply {
            this.url = eventSubscriptionCreateParams.url
            this.description = eventSubscriptionCreateParams.description
            this.disabled = eventSubscriptionCreateParams.disabled
            this.eventTypes(eventSubscriptionCreateParams.eventTypes ?: listOf())
            additionalQueryParams(eventSubscriptionCreateParams.additionalQueryParams)
            additionalHeaders(eventSubscriptionCreateParams.additionalHeaders)
            additionalBodyProperties(eventSubscriptionCreateParams.additionalBodyProperties)
        }

        /** URL to which event webhooks will be sent. URL must be a valid HTTPS address. */
        fun url(url: String) = apply { this.url = url }

        /** Event subscription description. */
        fun description(description: String) = apply { this.description = description }

        /** Whether the event subscription is active (false) or inactive (true). */
        fun disabled(disabled: Boolean) = apply { this.disabled = disabled }

        /**
         * Indicates types of events that will be sent to this subscription. If left blank, all
         * types will be sent.
         */
        fun eventTypes(eventTypes: List<EventType>) = apply {
            this.eventTypes.clear()
            this.eventTypes.addAll(eventTypes)
        }

        /**
         * Indicates types of events that will be sent to this subscription. If left blank, all
         * types will be sent.
         */
        fun addEventType(eventType: EventType) = apply { this.eventTypes.add(eventType) }

        fun additionalQueryParams(additionalQueryParams: Map<String, List<String>>) = apply {
            this.additionalQueryParams.clear()
            putAllQueryParams(additionalQueryParams)
        }

        fun putQueryParam(name: String, value: String) = apply {
            this.additionalQueryParams.getOrPut(name) { mutableListOf() }.add(value)
        }

        fun putQueryParams(name: String, values: Iterable<String>) = apply {
            this.additionalQueryParams.getOrPut(name) { mutableListOf() }.addAll(values)
        }

        fun putAllQueryParams(additionalQueryParams: Map<String, Iterable<String>>) = apply {
            additionalQueryParams.forEach(this::putQueryParams)
        }

        fun removeQueryParam(name: String) = apply {
            this.additionalQueryParams.put(name, mutableListOf())
        }

        fun additionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.clear()
            putAllHeaders(additionalHeaders)
        }

        fun putHeader(name: String, value: String) = apply {
            this.additionalHeaders.getOrPut(name) { mutableListOf() }.add(value)
        }

        fun putHeaders(name: String, values: Iterable<String>) = apply {
            this.additionalHeaders.getOrPut(name) { mutableListOf() }.addAll(values)
        }

        fun putAllHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            additionalHeaders.forEach(this::putHeaders)
        }

        fun removeHeader(name: String) = apply { this.additionalHeaders.put(name, mutableListOf()) }

        fun additionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) = apply {
            this.additionalBodyProperties.clear()
            this.additionalBodyProperties.putAll(additionalBodyProperties)
        }

        fun putAdditionalBodyProperty(key: String, value: JsonValue) = apply {
            this.additionalBodyProperties.put(key, value)
        }

        fun putAllAdditionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) =
            apply {
                this.additionalBodyProperties.putAll(additionalBodyProperties)
            }

        fun build(): EventSubscriptionCreateParams =
            EventSubscriptionCreateParams(
                checkNotNull(url) { "`url` is required but was not set" },
                description,
                disabled,
                if (eventTypes.size == 0) null else eventTypes.toUnmodifiable(),
                additionalQueryParams.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
                additionalHeaders.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
                additionalBodyProperties.toUnmodifiable(),
            )
    }

    class EventType
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is EventType && this.value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()

        companion object {

            val CARD_CREATED = EventType(JsonField.of("card.created"))

            val CARD_SHIPPED = EventType(JsonField.of("card.shipped"))

            val CARD_TRANSACTION_UPDATED = EventType(JsonField.of("card_transaction.updated"))

            val DIGITAL_WALLET_TOKENIZATION_APPROVAL_REQUEST =
                EventType(JsonField.of("digital_wallet.tokenization_approval_request"))

            val DIGITAL_WALLET_TOKENIZATION_RESULT =
                EventType(JsonField.of("digital_wallet.tokenization_result"))

            val DIGITAL_WALLET_TOKENIZATION_TWO_FACTOR_AUTHENTICATION_CODE =
                EventType(
                    JsonField.of("digital_wallet.tokenization_two_factor_authentication_code")
                )

            val DISPUTE_UPDATED = EventType(JsonField.of("dispute.updated"))

            val PAYMENT_TRANSACTION_CREATED = EventType(JsonField.of("payment_transaction.created"))

            val PAYMENT_TRANSACTION_UPDATED = EventType(JsonField.of("payment_transaction.updated"))

            val TRANSFER_TRANSACTION_CREATED =
                EventType(JsonField.of("transfer_transaction.created"))

            fun of(value: String) = EventType(JsonField.of(value))
        }

        enum class Known {
            CARD_CREATED,
            CARD_SHIPPED,
            CARD_TRANSACTION_UPDATED,
            DIGITAL_WALLET_TOKENIZATION_APPROVAL_REQUEST,
            DIGITAL_WALLET_TOKENIZATION_RESULT,
            DIGITAL_WALLET_TOKENIZATION_TWO_FACTOR_AUTHENTICATION_CODE,
            DISPUTE_UPDATED,
            PAYMENT_TRANSACTION_CREATED,
            PAYMENT_TRANSACTION_UPDATED,
            TRANSFER_TRANSACTION_CREATED,
        }

        enum class Value {
            CARD_CREATED,
            CARD_SHIPPED,
            CARD_TRANSACTION_UPDATED,
            DIGITAL_WALLET_TOKENIZATION_APPROVAL_REQUEST,
            DIGITAL_WALLET_TOKENIZATION_RESULT,
            DIGITAL_WALLET_TOKENIZATION_TWO_FACTOR_AUTHENTICATION_CODE,
            DISPUTE_UPDATED,
            PAYMENT_TRANSACTION_CREATED,
            PAYMENT_TRANSACTION_UPDATED,
            TRANSFER_TRANSACTION_CREATED,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                CARD_CREATED -> Value.CARD_CREATED
                CARD_SHIPPED -> Value.CARD_SHIPPED
                CARD_TRANSACTION_UPDATED -> Value.CARD_TRANSACTION_UPDATED
                DIGITAL_WALLET_TOKENIZATION_APPROVAL_REQUEST ->
                    Value.DIGITAL_WALLET_TOKENIZATION_APPROVAL_REQUEST
                DIGITAL_WALLET_TOKENIZATION_RESULT -> Value.DIGITAL_WALLET_TOKENIZATION_RESULT
                DIGITAL_WALLET_TOKENIZATION_TWO_FACTOR_AUTHENTICATION_CODE ->
                    Value.DIGITAL_WALLET_TOKENIZATION_TWO_FACTOR_AUTHENTICATION_CODE
                DISPUTE_UPDATED -> Value.DISPUTE_UPDATED
                PAYMENT_TRANSACTION_CREATED -> Value.PAYMENT_TRANSACTION_CREATED
                PAYMENT_TRANSACTION_UPDATED -> Value.PAYMENT_TRANSACTION_UPDATED
                TRANSFER_TRANSACTION_CREATED -> Value.TRANSFER_TRANSACTION_CREATED
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                CARD_CREATED -> Known.CARD_CREATED
                CARD_SHIPPED -> Known.CARD_SHIPPED
                CARD_TRANSACTION_UPDATED -> Known.CARD_TRANSACTION_UPDATED
                DIGITAL_WALLET_TOKENIZATION_APPROVAL_REQUEST ->
                    Known.DIGITAL_WALLET_TOKENIZATION_APPROVAL_REQUEST
                DIGITAL_WALLET_TOKENIZATION_RESULT -> Known.DIGITAL_WALLET_TOKENIZATION_RESULT
                DIGITAL_WALLET_TOKENIZATION_TWO_FACTOR_AUTHENTICATION_CODE ->
                    Known.DIGITAL_WALLET_TOKENIZATION_TWO_FACTOR_AUTHENTICATION_CODE
                DISPUTE_UPDATED -> Known.DISPUTE_UPDATED
                PAYMENT_TRANSACTION_CREATED -> Known.PAYMENT_TRANSACTION_CREATED
                PAYMENT_TRANSACTION_UPDATED -> Known.PAYMENT_TRANSACTION_UPDATED
                TRANSFER_TRANSACTION_CREATED -> Known.TRANSFER_TRANSACTION_CREATED
                else -> throw LithicInvalidDataException("Unknown EventType: $value")
            }

        fun asString(): String = _value().asStringOrThrow()
    }
}
