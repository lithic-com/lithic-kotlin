// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.lithic.api.core.ExcludeMissing
import com.lithic.api.core.JsonField
import com.lithic.api.core.JsonMissing
import com.lithic.api.core.JsonValue
import com.lithic.api.core.NoAutoDetect
import com.lithic.api.core.immutableEmptyMap
import com.lithic.api.core.toImmutable
import java.util.Objects

@NoAutoDetect
class AuthenticationSimulateResponse
@JsonCreator
private constructor(
    @JsonProperty("token") @ExcludeMissing private val token: JsonField<String> = JsonMissing.of(),
    @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
) {

    /**
     * A unique token to reference this transaction with later calls to void or clear the
     * authorization.
     */
    fun token(): String? = token.getNullable("token")

    /**
     * A unique token to reference this transaction with later calls to void or clear the
     * authorization.
     */
    @JsonProperty("token") @ExcludeMissing fun _token(): JsonField<String> = token

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    private var validated: Boolean = false

    fun validate(): AuthenticationSimulateResponse = apply {
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

        internal fun from(authenticationSimulateResponse: AuthenticationSimulateResponse) = apply {
            token = authenticationSimulateResponse.token
            additionalProperties =
                authenticationSimulateResponse.additionalProperties.toMutableMap()
        }

        /**
         * A unique token to reference this transaction with later calls to void or clear the
         * authorization.
         */
        fun token(token: String) = token(JsonField.of(token))

        /**
         * A unique token to reference this transaction with later calls to void or clear the
         * authorization.
         */
        fun token(token: JsonField<String>) = apply { this.token = token }

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

        fun build(): AuthenticationSimulateResponse =
            AuthenticationSimulateResponse(token, additionalProperties.toImmutable())
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is AuthenticationSimulateResponse && token == other.token && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(token, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "AuthenticationSimulateResponse{token=$token, additionalProperties=$additionalProperties}"
}
