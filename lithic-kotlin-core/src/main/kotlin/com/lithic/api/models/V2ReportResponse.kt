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
import java.util.Objects

@JsonDeserialize(builder = V2ReportResponse.Builder::class)
@NoAutoDetect
class V2ReportResponse
private constructor(
    private val reportToken: JsonField<String>,
    private val additionalProperties: Map<String, JsonValue>,
) {

    private var validated: Boolean = false

    private var hashCode: Int = 0

    fun reportToken(): String? = reportToken.getNullable("report_token")

    @JsonProperty("report_token") @ExcludeMissing fun _reportToken() = reportToken

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    fun validate(): V2ReportResponse = apply {
        if (!validated) {
            reportToken()
            validated = true
        }
    }

    fun toBuilder() = Builder().from(this)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is V2ReportResponse &&
            this.reportToken == other.reportToken &&
            this.additionalProperties == other.additionalProperties
    }

    override fun hashCode(): Int {
        if (hashCode == 0) {
            hashCode = Objects.hash(reportToken, additionalProperties)
        }
        return hashCode
    }

    override fun toString() =
        "V2ReportResponse{reportToken=$reportToken, additionalProperties=$additionalProperties}"

    companion object {

        fun builder() = Builder()
    }

    class Builder {

        private var reportToken: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(v2ReportResponse: V2ReportResponse) = apply {
            this.reportToken = v2ReportResponse.reportToken
            additionalProperties(v2ReportResponse.additionalProperties)
        }

        fun reportToken(reportToken: String) = reportToken(JsonField.of(reportToken))

        @JsonProperty("report_token")
        @ExcludeMissing
        fun reportToken(reportToken: JsonField<String>) = apply { this.reportToken = reportToken }

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

        fun build(): V2ReportResponse =
            V2ReportResponse(reportToken, additionalProperties.toUnmodifiable())
    }
}