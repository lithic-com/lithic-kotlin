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

@JsonDeserialize(builder = DecisioningSimulateChallengeResponse.Builder::class)
@NoAutoDetect
class DecisioningSimulateChallengeResponse
private constructor(
    private val token: JsonField<String>,
    private val additionalProperties: Map<String, JsonValue>,
) {

    private var validated: Boolean = false

    /**
     * A unique token to reference this transaction with later calls to void or clear the
     * authorization. This token is used in /v1/three_ds_decisioning/simulate/challenge_response to
     * Approve or Decline the authentication
     */
    fun token(): String? = token.getNullable("token")

    /**
     * A unique token to reference this transaction with later calls to void or clear the
     * authorization. This token is used in /v1/three_ds_decisioning/simulate/challenge_response to
     * Approve or Decline the authentication
     */
    @JsonProperty("token") @ExcludeMissing fun _token() = token

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    fun validate(): DecisioningSimulateChallengeResponse = apply {
        if (!validated) {
            token()
            validated = true
        }
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        fun builder() = Builder()
    }

    class Builder {

        private var token: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(
            decisioningSimulateChallengeResponse: DecisioningSimulateChallengeResponse
        ) = apply {
            this.token = decisioningSimulateChallengeResponse.token
            additionalProperties(decisioningSimulateChallengeResponse.additionalProperties)
        }

        /**
         * A unique token to reference this transaction with later calls to void or clear the
         * authorization. This token is used in /v1/three_ds_decisioning/simulate/challenge_response
         * to Approve or Decline the authentication
         */
        fun token(token: String) = token(JsonField.of(token))

        /**
         * A unique token to reference this transaction with later calls to void or clear the
         * authorization. This token is used in /v1/three_ds_decisioning/simulate/challenge_response
         * to Approve or Decline the authentication
         */
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

        fun build(): DecisioningSimulateChallengeResponse =
            DecisioningSimulateChallengeResponse(token, additionalProperties.toUnmodifiable())
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is DecisioningSimulateChallengeResponse && this.token == other.token && this.additionalProperties == other.additionalProperties /* spotless:on */
    }

    private var hashCode: Int = 0

    override fun hashCode(): Int {
        if (hashCode == 0) {
            hashCode = /* spotless:off */ Objects.hash(token, additionalProperties) /* spotless:on */
        }
        return hashCode
    }

    override fun toString() =
        "DecisioningSimulateChallengeResponse{token=$token, additionalProperties=$additionalProperties}"
}
