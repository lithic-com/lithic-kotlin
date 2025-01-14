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

/** A subscription to specific event types. */
@NoAutoDetect
class MessageAttempt
@JsonCreator
private constructor(
    @JsonProperty("token") @ExcludeMissing private val token: JsonField<String> = JsonMissing.of(),
    @JsonProperty("created")
    @ExcludeMissing
    private val created: JsonField<OffsetDateTime> = JsonMissing.of(),
    @JsonProperty("event_subscription_token")
    @ExcludeMissing
    private val eventSubscriptionToken: JsonField<String> = JsonMissing.of(),
    @JsonProperty("event_token")
    @ExcludeMissing
    private val eventToken: JsonField<String> = JsonMissing.of(),
    @JsonProperty("response")
    @ExcludeMissing
    private val response: JsonField<String> = JsonMissing.of(),
    @JsonProperty("response_status_code")
    @ExcludeMissing
    private val responseStatusCode: JsonField<Long> = JsonMissing.of(),
    @JsonProperty("status")
    @ExcludeMissing
    private val status: JsonField<Status> = JsonMissing.of(),
    @JsonProperty("url") @ExcludeMissing private val url: JsonField<String> = JsonMissing.of(),
    @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
) {

    /** Globally unique identifier. */
    fun token(): String = token.getRequired("token")

    /**
     * An RFC 3339 timestamp for when the event was created. UTC time zone.
     *
     * If no timezone is specified, UTC will be used.
     */
    fun created(): OffsetDateTime = created.getRequired("created")

    /** Globally unique identifier. */
    fun eventSubscriptionToken(): String =
        eventSubscriptionToken.getRequired("event_subscription_token")

    /** Globally unique identifier. */
    fun eventToken(): String = eventToken.getRequired("event_token")

    /** The response body from the event subscription's URL. */
    fun response(): String = response.getRequired("response")

    /** The response status code from the event subscription's URL. */
    fun responseStatusCode(): Long = responseStatusCode.getRequired("response_status_code")

    /** The status of the event attempt. */
    fun status(): Status = status.getRequired("status")

    fun url(): String = url.getRequired("url")

    /** Globally unique identifier. */
    @JsonProperty("token") @ExcludeMissing fun _token(): JsonField<String> = token

    /**
     * An RFC 3339 timestamp for when the event was created. UTC time zone.
     *
     * If no timezone is specified, UTC will be used.
     */
    @JsonProperty("created") @ExcludeMissing fun _created(): JsonField<OffsetDateTime> = created

    /** Globally unique identifier. */
    @JsonProperty("event_subscription_token")
    @ExcludeMissing
    fun _eventSubscriptionToken(): JsonField<String> = eventSubscriptionToken

    /** Globally unique identifier. */
    @JsonProperty("event_token") @ExcludeMissing fun _eventToken(): JsonField<String> = eventToken

    /** The response body from the event subscription's URL. */
    @JsonProperty("response") @ExcludeMissing fun _response(): JsonField<String> = response

    /** The response status code from the event subscription's URL. */
    @JsonProperty("response_status_code")
    @ExcludeMissing
    fun _responseStatusCode(): JsonField<Long> = responseStatusCode

    /** The status of the event attempt. */
    @JsonProperty("status") @ExcludeMissing fun _status(): JsonField<Status> = status

    @JsonProperty("url") @ExcludeMissing fun _url(): JsonField<String> = url

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    private var validated: Boolean = false

    fun validate(): MessageAttempt = apply {
        if (validated) {
            return@apply
        }

        token()
        created()
        eventSubscriptionToken()
        eventToken()
        response()
        responseStatusCode()
        status()
        url()
        validated = true
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        fun builder() = Builder()
    }

    class Builder {

        private var token: JsonField<String>? = null
        private var created: JsonField<OffsetDateTime>? = null
        private var eventSubscriptionToken: JsonField<String>? = null
        private var eventToken: JsonField<String>? = null
        private var response: JsonField<String>? = null
        private var responseStatusCode: JsonField<Long>? = null
        private var status: JsonField<Status>? = null
        private var url: JsonField<String>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(messageAttempt: MessageAttempt) = apply {
            token = messageAttempt.token
            created = messageAttempt.created
            eventSubscriptionToken = messageAttempt.eventSubscriptionToken
            eventToken = messageAttempt.eventToken
            response = messageAttempt.response
            responseStatusCode = messageAttempt.responseStatusCode
            status = messageAttempt.status
            url = messageAttempt.url
            additionalProperties = messageAttempt.additionalProperties.toMutableMap()
        }

        /** Globally unique identifier. */
        fun token(token: String) = token(JsonField.of(token))

        /** Globally unique identifier. */
        fun token(token: JsonField<String>) = apply { this.token = token }

        /**
         * An RFC 3339 timestamp for when the event was created. UTC time zone.
         *
         * If no timezone is specified, UTC will be used.
         */
        fun created(created: OffsetDateTime) = created(JsonField.of(created))

        /**
         * An RFC 3339 timestamp for when the event was created. UTC time zone.
         *
         * If no timezone is specified, UTC will be used.
         */
        fun created(created: JsonField<OffsetDateTime>) = apply { this.created = created }

        /** Globally unique identifier. */
        fun eventSubscriptionToken(eventSubscriptionToken: String) =
            eventSubscriptionToken(JsonField.of(eventSubscriptionToken))

        /** Globally unique identifier. */
        fun eventSubscriptionToken(eventSubscriptionToken: JsonField<String>) = apply {
            this.eventSubscriptionToken = eventSubscriptionToken
        }

        /** Globally unique identifier. */
        fun eventToken(eventToken: String) = eventToken(JsonField.of(eventToken))

        /** Globally unique identifier. */
        fun eventToken(eventToken: JsonField<String>) = apply { this.eventToken = eventToken }

        /** The response body from the event subscription's URL. */
        fun response(response: String) = response(JsonField.of(response))

        /** The response body from the event subscription's URL. */
        fun response(response: JsonField<String>) = apply { this.response = response }

        /** The response status code from the event subscription's URL. */
        fun responseStatusCode(responseStatusCode: Long) =
            responseStatusCode(JsonField.of(responseStatusCode))

        /** The response status code from the event subscription's URL. */
        fun responseStatusCode(responseStatusCode: JsonField<Long>) = apply {
            this.responseStatusCode = responseStatusCode
        }

        /** The status of the event attempt. */
        fun status(status: Status) = status(JsonField.of(status))

        /** The status of the event attempt. */
        fun status(status: JsonField<Status>) = apply { this.status = status }

        fun url(url: String) = url(JsonField.of(url))

        fun url(url: JsonField<String>) = apply { this.url = url }

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

        fun build(): MessageAttempt =
            MessageAttempt(
                checkRequired("token", token),
                checkRequired("created", created),
                checkRequired("eventSubscriptionToken", eventSubscriptionToken),
                checkRequired("eventToken", eventToken),
                checkRequired("response", response),
                checkRequired("responseStatusCode", responseStatusCode),
                checkRequired("status", status),
                checkRequired("url", url),
                additionalProperties.toImmutable(),
            )
    }

    class Status
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            val FAILED = of("FAILED")

            val PENDING = of("PENDING")

            val SENDING = of("SENDING")

            val SUCCESS = of("SUCCESS")

            fun of(value: String) = Status(JsonField.of(value))
        }

        enum class Known {
            FAILED,
            PENDING,
            SENDING,
            SUCCESS,
        }

        enum class Value {
            FAILED,
            PENDING,
            SENDING,
            SUCCESS,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                FAILED -> Value.FAILED
                PENDING -> Value.PENDING
                SENDING -> Value.SENDING
                SUCCESS -> Value.SUCCESS
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                FAILED -> Known.FAILED
                PENDING -> Known.PENDING
                SENDING -> Known.SENDING
                SUCCESS -> Known.SUCCESS
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

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is MessageAttempt && token == other.token && created == other.created && eventSubscriptionToken == other.eventSubscriptionToken && eventToken == other.eventToken && response == other.response && responseStatusCode == other.responseStatusCode && status == other.status && url == other.url && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(token, created, eventSubscriptionToken, eventToken, response, responseStatusCode, status, url, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "MessageAttempt{token=$token, created=$created, eventSubscriptionToken=$eventSubscriptionToken, eventToken=$eventToken, response=$response, responseStatusCode=$responseStatusCode, status=$status, url=$url, additionalProperties=$additionalProperties}"
}
