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

@JsonDeserialize(builder = TokenizationDecisioningRotateSecretResponse.Builder::class)
@NoAutoDetect
class TokenizationDecisioningRotateSecretResponse
private constructor(
    private val secret: JsonField<String>,
    private val additionalProperties: Map<String, JsonValue>,
) {

    private var validated: Boolean = false

    private var hashCode: Int = 0

    /** The new Tokenization Decisioning HMAC secret */
    fun secret(): String? = secret.getNullable("secret")

    /** The new Tokenization Decisioning HMAC secret */
    @JsonProperty("secret") @ExcludeMissing fun _secret() = secret

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    fun validate(): TokenizationDecisioningRotateSecretResponse = apply {
        if (!validated) {
            secret()
            validated = true
        }
    }

    fun toBuilder() = Builder().from(this)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is TokenizationDecisioningRotateSecretResponse &&
            this.secret == other.secret &&
            this.additionalProperties == other.additionalProperties
    }

    override fun hashCode(): Int {
        if (hashCode == 0) {
            hashCode = Objects.hash(secret, additionalProperties)
        }
        return hashCode
    }

    override fun toString() =
        "TokenizationDecisioningRotateSecretResponse{secret=$secret, additionalProperties=$additionalProperties}"

    companion object {

        fun builder() = Builder()
    }

    class Builder {

        private var secret: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(
            tokenizationDecisioningRotateSecretResponse: TokenizationDecisioningRotateSecretResponse
        ) = apply {
            this.secret = tokenizationDecisioningRotateSecretResponse.secret
            additionalProperties(tokenizationDecisioningRotateSecretResponse.additionalProperties)
        }

        /** The new Tokenization Decisioning HMAC secret */
        fun secret(secret: String) = secret(JsonField.of(secret))

        /** The new Tokenization Decisioning HMAC secret */
        @JsonProperty("secret")
        @ExcludeMissing
        fun secret(secret: JsonField<String>) = apply { this.secret = secret }

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

        fun build(): TokenizationDecisioningRotateSecretResponse =
            TokenizationDecisioningRotateSecretResponse(
                secret,
                additionalProperties.toUnmodifiable()
            )
    }
}
