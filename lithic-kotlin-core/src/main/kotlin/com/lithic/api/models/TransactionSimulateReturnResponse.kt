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
class TransactionSimulateReturnResponse
@JsonCreator
private constructor(
    @JsonProperty("token") @ExcludeMissing private val token: JsonField<String> = JsonMissing.of(),
    @JsonProperty("debugging_request_id")
    @ExcludeMissing
    private val debuggingRequestId: JsonField<String> = JsonMissing.of(),
    @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
) {

    /** A unique token to reference this transaction. */
    fun token(): String? = token.getNullable("token")

    /** Debugging request ID to share with Lithic Support team. */
    fun debuggingRequestId(): String? = debuggingRequestId.getNullable("debugging_request_id")

    /** A unique token to reference this transaction. */
    @JsonProperty("token") @ExcludeMissing fun _token(): JsonField<String> = token

    /** Debugging request ID to share with Lithic Support team. */
    @JsonProperty("debugging_request_id")
    @ExcludeMissing
    fun _debuggingRequestId(): JsonField<String> = debuggingRequestId

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    private var validated: Boolean = false

    fun validate(): TransactionSimulateReturnResponse = apply {
        if (validated) {
            return@apply
        }

        token()
        debuggingRequestId()
        validated = true
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [TransactionSimulateReturnResponse].
         */
        fun builder() = Builder()
    }

    /** A builder for [TransactionSimulateReturnResponse]. */
    class Builder internal constructor() {

        private var token: JsonField<String> = JsonMissing.of()
        private var debuggingRequestId: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(transactionSimulateReturnResponse: TransactionSimulateReturnResponse) =
            apply {
                token = transactionSimulateReturnResponse.token
                debuggingRequestId = transactionSimulateReturnResponse.debuggingRequestId
                additionalProperties =
                    transactionSimulateReturnResponse.additionalProperties.toMutableMap()
            }

        /** A unique token to reference this transaction. */
        fun token(token: String) = token(JsonField.of(token))

        /** A unique token to reference this transaction. */
        fun token(token: JsonField<String>) = apply { this.token = token }

        /** Debugging request ID to share with Lithic Support team. */
        fun debuggingRequestId(debuggingRequestId: String) =
            debuggingRequestId(JsonField.of(debuggingRequestId))

        /** Debugging request ID to share with Lithic Support team. */
        fun debuggingRequestId(debuggingRequestId: JsonField<String>) = apply {
            this.debuggingRequestId = debuggingRequestId
        }

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

        fun build(): TransactionSimulateReturnResponse =
            TransactionSimulateReturnResponse(
                token,
                debuggingRequestId,
                additionalProperties.toImmutable(),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is TransactionSimulateReturnResponse && token == other.token && debuggingRequestId == other.debuggingRequestId && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(token, debuggingRequestId, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "TransactionSimulateReturnResponse{token=$token, debuggingRequestId=$debuggingRequestId, additionalProperties=$additionalProperties}"
}
