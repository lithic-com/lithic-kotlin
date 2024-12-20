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
import com.lithic.api.core.JsonMissing
import com.lithic.api.core.JsonValue
import com.lithic.api.core.NoAutoDetect
import com.lithic.api.core.toImmutable
import com.lithic.api.errors.LithicInvalidDataException
import java.time.OffsetDateTime
import java.util.Objects

/** A subscription to specific event types. */
@JsonDeserialize(builder = MessageAttempt.Builder::class)
@NoAutoDetect
class MessageAttempt
private constructor(
    private val created: JsonField<OffsetDateTime>,
    private val eventSubscriptionToken: JsonField<String>,
    private val eventToken: JsonField<String>,
    private val response: JsonField<String>,
    private val responseStatusCode: JsonField<Long>,
    private val status: JsonField<Status>,
    private val token: JsonField<String>,
    private val url: JsonField<String>,
    private val additionalProperties: Map<String, JsonValue>,
) {

    private var validated: Boolean = false

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

    /** Globally unique identifier. */
    fun token(): String = token.getRequired("token")

    fun url(): String = url.getRequired("url")

    /**
     * An RFC 3339 timestamp for when the event was created. UTC time zone.
     *
     * If no timezone is specified, UTC will be used.
     */
    @JsonProperty("created") @ExcludeMissing fun _created() = created

    /** Globally unique identifier. */
    @JsonProperty("event_subscription_token")
    @ExcludeMissing
    fun _eventSubscriptionToken() = eventSubscriptionToken

    /** Globally unique identifier. */
    @JsonProperty("event_token") @ExcludeMissing fun _eventToken() = eventToken

    /** The response body from the event subscription's URL. */
    @JsonProperty("response") @ExcludeMissing fun _response() = response

    /** The response status code from the event subscription's URL. */
    @JsonProperty("response_status_code")
    @ExcludeMissing
    fun _responseStatusCode() = responseStatusCode

    /** The status of the event attempt. */
    @JsonProperty("status") @ExcludeMissing fun _status() = status

    /** Globally unique identifier. */
    @JsonProperty("token") @ExcludeMissing fun _token() = token

    @JsonProperty("url") @ExcludeMissing fun _url() = url

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    fun validate(): MessageAttempt = apply {
        if (!validated) {
            created()
            eventSubscriptionToken()
            eventToken()
            response()
            responseStatusCode()
            status()
            token()
            url()
            validated = true
        }
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        fun builder() = Builder()
    }

    class Builder {

        private var created: JsonField<OffsetDateTime> = JsonMissing.of()
        private var eventSubscriptionToken: JsonField<String> = JsonMissing.of()
        private var eventToken: JsonField<String> = JsonMissing.of()
        private var response: JsonField<String> = JsonMissing.of()
        private var responseStatusCode: JsonField<Long> = JsonMissing.of()
        private var status: JsonField<Status> = JsonMissing.of()
        private var token: JsonField<String> = JsonMissing.of()
        private var url: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(messageAttempt: MessageAttempt) = apply {
            this.created = messageAttempt.created
            this.eventSubscriptionToken = messageAttempt.eventSubscriptionToken
            this.eventToken = messageAttempt.eventToken
            this.response = messageAttempt.response
            this.responseStatusCode = messageAttempt.responseStatusCode
            this.status = messageAttempt.status
            this.token = messageAttempt.token
            this.url = messageAttempt.url
            additionalProperties(messageAttempt.additionalProperties)
        }

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
        @JsonProperty("created")
        @ExcludeMissing
        fun created(created: JsonField<OffsetDateTime>) = apply { this.created = created }

        /** Globally unique identifier. */
        fun eventSubscriptionToken(eventSubscriptionToken: String) =
            eventSubscriptionToken(JsonField.of(eventSubscriptionToken))

        /** Globally unique identifier. */
        @JsonProperty("event_subscription_token")
        @ExcludeMissing
        fun eventSubscriptionToken(eventSubscriptionToken: JsonField<String>) = apply {
            this.eventSubscriptionToken = eventSubscriptionToken
        }

        /** Globally unique identifier. */
        fun eventToken(eventToken: String) = eventToken(JsonField.of(eventToken))

        /** Globally unique identifier. */
        @JsonProperty("event_token")
        @ExcludeMissing
        fun eventToken(eventToken: JsonField<String>) = apply { this.eventToken = eventToken }

        /** The response body from the event subscription's URL. */
        fun response(response: String) = response(JsonField.of(response))

        /** The response body from the event subscription's URL. */
        @JsonProperty("response")
        @ExcludeMissing
        fun response(response: JsonField<String>) = apply { this.response = response }

        /** The response status code from the event subscription's URL. */
        fun responseStatusCode(responseStatusCode: Long) =
            responseStatusCode(JsonField.of(responseStatusCode))

        /** The response status code from the event subscription's URL. */
        @JsonProperty("response_status_code")
        @ExcludeMissing
        fun responseStatusCode(responseStatusCode: JsonField<Long>) = apply {
            this.responseStatusCode = responseStatusCode
        }

        /** The status of the event attempt. */
        fun status(status: Status) = status(JsonField.of(status))

        /** The status of the event attempt. */
        @JsonProperty("status")
        @ExcludeMissing
        fun status(status: JsonField<Status>) = apply { this.status = status }

        /** Globally unique identifier. */
        fun token(token: String) = token(JsonField.of(token))

        /** Globally unique identifier. */
        @JsonProperty("token")
        @ExcludeMissing
        fun token(token: JsonField<String>) = apply { this.token = token }

        fun url(url: String) = url(JsonField.of(url))

        @JsonProperty("url")
        @ExcludeMissing
        fun url(url: JsonField<String>) = apply { this.url = url }

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

        fun build(): MessageAttempt =
            MessageAttempt(
                created,
                eventSubscriptionToken,
                eventToken,
                response,
                responseStatusCode,
                status,
                token,
                url,
                additionalProperties.toImmutable(),
            )
    }

    class Status
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Status && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()

        companion object {

            val FAILED = Status(JsonField.of("FAILED"))

            val PENDING = Status(JsonField.of("PENDING"))

            val SENDING = Status(JsonField.of("SENDING"))

            val SUCCESS = Status(JsonField.of("SUCCESS"))

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
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is MessageAttempt && created == other.created && eventSubscriptionToken == other.eventSubscriptionToken && eventToken == other.eventToken && response == other.response && responseStatusCode == other.responseStatusCode && status == other.status && token == other.token && url == other.url && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(created, eventSubscriptionToken, eventToken, response, responseStatusCode, status, token, url, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "MessageAttempt{created=$created, eventSubscriptionToken=$eventSubscriptionToken, eventToken=$eventToken, response=$response, responseStatusCode=$responseStatusCode, status=$status, token=$token, url=$url, additionalProperties=$additionalProperties}"
}
