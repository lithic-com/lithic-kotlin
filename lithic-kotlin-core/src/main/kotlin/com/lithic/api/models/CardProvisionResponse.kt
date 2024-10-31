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

@JsonDeserialize(builder = CardProvisionResponse.Builder::class)
@NoAutoDetect
class CardProvisionResponse
private constructor(
    private val provisioningPayload: JsonField<String>,
    private val additionalProperties: Map<String, JsonValue>,
) {

    private var validated: Boolean = false

    fun provisioningPayload(): String? = provisioningPayload.getNullable("provisioning_payload")

    @JsonProperty("provisioning_payload")
    @ExcludeMissing
    fun _provisioningPayload() = provisioningPayload

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    fun validate(): CardProvisionResponse = apply {
        if (!validated) {
            provisioningPayload()
            validated = true
        }
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        fun builder() = Builder()
    }

    class Builder {

        private var provisioningPayload: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(cardProvisionResponse: CardProvisionResponse) = apply {
            this.provisioningPayload = cardProvisionResponse.provisioningPayload
            additionalProperties(cardProvisionResponse.additionalProperties)
        }

        fun provisioningPayload(provisioningPayload: String) =
            provisioningPayload(JsonField.of(provisioningPayload))

        @JsonProperty("provisioning_payload")
        @ExcludeMissing
        fun provisioningPayload(provisioningPayload: JsonField<String>) = apply {
            this.provisioningPayload = provisioningPayload
        }

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

        fun build(): CardProvisionResponse =
            CardProvisionResponse(provisioningPayload, additionalProperties.toImmutable())
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is CardProvisionResponse && this.provisioningPayload == other.provisioningPayload && this.additionalProperties == other.additionalProperties /* spotless:on */
    }

    private var hashCode: Int = 0

    override fun hashCode(): Int {
        if (hashCode == 0) {
            hashCode = /* spotless:off */ Objects.hash(provisioningPayload, additionalProperties) /* spotless:on */
        }
        return hashCode
    }

    override fun toString() =
        "CardProvisionResponse{provisioningPayload=$provisioningPayload, additionalProperties=$additionalProperties}"
}
