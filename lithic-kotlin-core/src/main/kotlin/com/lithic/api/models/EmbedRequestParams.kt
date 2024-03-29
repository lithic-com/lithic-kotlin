// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.lithic.api.core.ExcludeMissing
import com.lithic.api.core.JsonField
import com.lithic.api.core.JsonMissing
import com.lithic.api.core.JsonValue
import com.lithic.api.core.NoAutoDetect
import com.lithic.api.core.toUnmodifiable
import java.time.OffsetDateTime
import java.util.Objects

@JsonDeserialize(builder = EmbedRequestParams.Builder::class)
@NoAutoDetect
class EmbedRequestParams
private constructor(
    private val css: JsonField<String>,
    private val expiration: JsonField<OffsetDateTime>,
    private val targetOrigin: JsonField<String>,
    private val token: JsonField<String>,
    private val additionalProperties: Map<String, JsonValue>,
) {

    private var validated: Boolean = false

    private var hashCode: Int = 0

    /**
     * A publicly available URI, so the white-labeled card element can be styled with the client's
     * branding.
     */
    fun css(): String? = css.getNullable("css")

    /**
     * An RFC 3339 timestamp for when the request should expire. UTC time zone.
     *
     * If no timezone is specified, UTC will be used. If payload does not contain an expiration, the
     * request will never expire.
     *
     * Using an `expiration` reduces the risk of a
     * [replay attack](https://en.wikipedia.org/wiki/Replay_attack). Without supplying the
     * `expiration`, in the event that a malicious user gets a copy of your request in transit, they
     * will be able to obtain the response data indefinitely.
     */
    fun expiration(): OffsetDateTime? = expiration.getNullable("expiration")

    /**
     * Required if you want to post the element clicked to the parent iframe.
     *
     * If you supply this param, you can also capture click events in the parent iframe by adding an
     * event listener.
     */
    fun targetOrigin(): String? = targetOrigin.getNullable("target_origin")

    /** Globally unique identifier for the card to be displayed. */
    fun token(): String = token.getRequired("token")

    /**
     * A publicly available URI, so the white-labeled card element can be styled with the client's
     * branding.
     */
    @JsonProperty("css") @ExcludeMissing fun _css() = css

    /**
     * An RFC 3339 timestamp for when the request should expire. UTC time zone.
     *
     * If no timezone is specified, UTC will be used. If payload does not contain an expiration, the
     * request will never expire.
     *
     * Using an `expiration` reduces the risk of a
     * [replay attack](https://en.wikipedia.org/wiki/Replay_attack). Without supplying the
     * `expiration`, in the event that a malicious user gets a copy of your request in transit, they
     * will be able to obtain the response data indefinitely.
     */
    @JsonProperty("expiration") @ExcludeMissing fun _expiration() = expiration

    /**
     * Required if you want to post the element clicked to the parent iframe.
     *
     * If you supply this param, you can also capture click events in the parent iframe by adding an
     * event listener.
     */
    @JsonProperty("target_origin") @ExcludeMissing fun _targetOrigin() = targetOrigin

    /** Globally unique identifier for the card to be displayed. */
    @JsonProperty("token") @ExcludeMissing fun _token() = token

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    fun validate(): EmbedRequestParams = apply {
        if (!validated) {
            css()
            expiration()
            targetOrigin()
            token()
            validated = true
        }
    }

    fun toBuilder() = Builder().from(this)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is EmbedRequestParams &&
            this.css == other.css &&
            this.expiration == other.expiration &&
            this.targetOrigin == other.targetOrigin &&
            this.token == other.token &&
            this.additionalProperties == other.additionalProperties
    }

    override fun hashCode(): Int {
        if (hashCode == 0) {
            hashCode =
                Objects.hash(
                    css,
                    expiration,
                    targetOrigin,
                    token,
                    additionalProperties,
                )
        }
        return hashCode
    }

    override fun toString() =
        "EmbedRequestParams{css=$css, expiration=$expiration, targetOrigin=$targetOrigin, token=$token, additionalProperties=$additionalProperties}"

    companion object {

        fun builder() = Builder()
    }

    class Builder {

        private var css: JsonField<String> = JsonMissing.of()
        private var expiration: JsonField<OffsetDateTime> = JsonMissing.of()
        private var targetOrigin: JsonField<String> = JsonMissing.of()
        private var token: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(embedRequestParams: EmbedRequestParams) = apply {
            this.css = embedRequestParams.css
            this.expiration = embedRequestParams.expiration
            this.targetOrigin = embedRequestParams.targetOrigin
            this.token = embedRequestParams.token
            additionalProperties(embedRequestParams.additionalProperties)
        }

        /**
         * A publicly available URI, so the white-labeled card element can be styled with the
         * client's branding.
         */
        fun css(css: String) = css(JsonField.of(css))

        /**
         * A publicly available URI, so the white-labeled card element can be styled with the
         * client's branding.
         */
        @JsonProperty("css")
        @ExcludeMissing
        fun css(css: JsonField<String>) = apply { this.css = css }

        /**
         * An RFC 3339 timestamp for when the request should expire. UTC time zone.
         *
         * If no timezone is specified, UTC will be used. If payload does not contain an expiration,
         * the request will never expire.
         *
         * Using an `expiration` reduces the risk of a
         * [replay attack](https://en.wikipedia.org/wiki/Replay_attack). Without supplying the
         * `expiration`, in the event that a malicious user gets a copy of your request in transit,
         * they will be able to obtain the response data indefinitely.
         */
        fun expiration(expiration: OffsetDateTime) = expiration(JsonField.of(expiration))

        /**
         * An RFC 3339 timestamp for when the request should expire. UTC time zone.
         *
         * If no timezone is specified, UTC will be used. If payload does not contain an expiration,
         * the request will never expire.
         *
         * Using an `expiration` reduces the risk of a
         * [replay attack](https://en.wikipedia.org/wiki/Replay_attack). Without supplying the
         * `expiration`, in the event that a malicious user gets a copy of your request in transit,
         * they will be able to obtain the response data indefinitely.
         */
        @JsonProperty("expiration")
        @ExcludeMissing
        fun expiration(expiration: JsonField<OffsetDateTime>) = apply {
            this.expiration = expiration
        }

        /**
         * Required if you want to post the element clicked to the parent iframe.
         *
         * If you supply this param, you can also capture click events in the parent iframe by
         * adding an event listener.
         */
        fun targetOrigin(targetOrigin: String) = targetOrigin(JsonField.of(targetOrigin))

        /**
         * Required if you want to post the element clicked to the parent iframe.
         *
         * If you supply this param, you can also capture click events in the parent iframe by
         * adding an event listener.
         */
        @JsonProperty("target_origin")
        @ExcludeMissing
        fun targetOrigin(targetOrigin: JsonField<String>) = apply {
            this.targetOrigin = targetOrigin
        }

        /** Globally unique identifier for the card to be displayed. */
        fun token(token: String) = token(JsonField.of(token))

        /** Globally unique identifier for the card to be displayed. */
        @JsonProperty("token")
        @ExcludeMissing
        fun token(token: JsonField<String>) = apply { this.token = token }

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

        fun build(): EmbedRequestParams =
            EmbedRequestParams(
                css,
                expiration,
                targetOrigin,
                token,
                additionalProperties.toUnmodifiable(),
            )
    }
}
