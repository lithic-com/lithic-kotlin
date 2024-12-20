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
import com.lithic.api.core.toImmutable
import java.util.Objects

@JsonDeserialize(builder = Carrier.Builder::class)
@NoAutoDetect
class Carrier
private constructor(
    private val qrCodeUrl: JsonField<String>,
    private val additionalProperties: Map<String, JsonValue>,
) {

    private var validated: Boolean = false

    /** QR code url to display on the card carrier */
    fun qrCodeUrl(): String? = qrCodeUrl.getNullable("qr_code_url")

    /** QR code url to display on the card carrier */
    @JsonProperty("qr_code_url") @ExcludeMissing fun _qrCodeUrl() = qrCodeUrl

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    fun validate(): Carrier = apply {
        if (!validated) {
            qrCodeUrl()
            validated = true
        }
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        fun builder() = Builder()
    }

    class Builder {

        private var qrCodeUrl: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(carrier: Carrier) = apply {
            this.qrCodeUrl = carrier.qrCodeUrl
            additionalProperties(carrier.additionalProperties)
        }

        /** QR code url to display on the card carrier */
        fun qrCodeUrl(qrCodeUrl: String) = qrCodeUrl(JsonField.of(qrCodeUrl))

        /** QR code url to display on the card carrier */
        @JsonProperty("qr_code_url")
        @ExcludeMissing
        fun qrCodeUrl(qrCodeUrl: JsonField<String>) = apply { this.qrCodeUrl = qrCodeUrl }

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

        fun build(): Carrier = Carrier(qrCodeUrl, additionalProperties.toImmutable())
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is Carrier && qrCodeUrl == other.qrCodeUrl && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(qrCodeUrl, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "Carrier{qrCodeUrl=$qrCodeUrl, additionalProperties=$additionalProperties}"
}
