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

@JsonDeserialize(builder = ResponderEndpointStatus.Builder::class)
@NoAutoDetect
class ResponderEndpointStatus
private constructor(
    private val enrolled: JsonField<Boolean>,
    private val url: JsonField<String>,
    private val additionalProperties: Map<String, JsonValue>,
) {

    private var validated: Boolean = false

    /** True if the instance has an endpoint enrolled. */
    fun enrolled(): Boolean? = enrolled.getNullable("enrolled")

    /** The URL of the currently enrolled endpoint or null. */
    fun url(): String? = url.getNullable("url")

    /** True if the instance has an endpoint enrolled. */
    @JsonProperty("enrolled") @ExcludeMissing fun _enrolled() = enrolled

    /** The URL of the currently enrolled endpoint or null. */
    @JsonProperty("url") @ExcludeMissing fun _url() = url

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    fun validate(): ResponderEndpointStatus = apply {
        if (!validated) {
            enrolled()
            url()
            validated = true
        }
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        fun builder() = Builder()
    }

    class Builder {

        private var enrolled: JsonField<Boolean> = JsonMissing.of()
        private var url: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(responderEndpointStatus: ResponderEndpointStatus) = apply {
            this.enrolled = responderEndpointStatus.enrolled
            this.url = responderEndpointStatus.url
            additionalProperties(responderEndpointStatus.additionalProperties)
        }

        /** True if the instance has an endpoint enrolled. */
        fun enrolled(enrolled: Boolean) = enrolled(JsonField.of(enrolled))

        /** True if the instance has an endpoint enrolled. */
        @JsonProperty("enrolled")
        @ExcludeMissing
        fun enrolled(enrolled: JsonField<Boolean>) = apply { this.enrolled = enrolled }

        /** The URL of the currently enrolled endpoint or null. */
        fun url(url: String) = url(JsonField.of(url))

        /** The URL of the currently enrolled endpoint or null. */
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

        fun build(): ResponderEndpointStatus =
            ResponderEndpointStatus(
                enrolled,
                url,
                additionalProperties.toImmutable(),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is ResponderEndpointStatus && enrolled == other.enrolled && url == other.url && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(enrolled, url, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "ResponderEndpointStatus{enrolled=$enrolled, url=$url, additionalProperties=$additionalProperties}"
}
