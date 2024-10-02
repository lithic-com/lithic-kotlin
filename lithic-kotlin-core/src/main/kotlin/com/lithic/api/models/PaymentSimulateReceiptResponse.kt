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
import com.lithic.api.core.toUnmodifiable
import com.lithic.api.errors.LithicInvalidDataException
import java.util.Objects

@JsonDeserialize(builder = PaymentSimulateReceiptResponse.Builder::class)
@NoAutoDetect
class PaymentSimulateReceiptResponse
private constructor(
    private val result: JsonField<Result>,
    private val transactionEventToken: JsonField<String>,
    private val debuggingRequestId: JsonField<String>,
    private val additionalProperties: Map<String, JsonValue>,
) {

    private var validated: Boolean = false

    /** Request Result */
    fun result(): Result = result.getRequired("result")

    /** Transaction Event Token */
    fun transactionEventToken(): String =
        transactionEventToken.getRequired("transaction_event_token")

    /** Debugging Request Id */
    fun debuggingRequestId(): String = debuggingRequestId.getRequired("debugging_request_id")

    /** Request Result */
    @JsonProperty("result") @ExcludeMissing fun _result() = result

    /** Transaction Event Token */
    @JsonProperty("transaction_event_token")
    @ExcludeMissing
    fun _transactionEventToken() = transactionEventToken

    /** Debugging Request Id */
    @JsonProperty("debugging_request_id")
    @ExcludeMissing
    fun _debuggingRequestId() = debuggingRequestId

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    fun validate(): PaymentSimulateReceiptResponse = apply {
        if (!validated) {
            result()
            transactionEventToken()
            debuggingRequestId()
            validated = true
        }
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        fun builder() = Builder()
    }

    class Builder {

        private var result: JsonField<Result> = JsonMissing.of()
        private var transactionEventToken: JsonField<String> = JsonMissing.of()
        private var debuggingRequestId: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(paymentSimulateReceiptResponse: PaymentSimulateReceiptResponse) = apply {
            this.result = paymentSimulateReceiptResponse.result
            this.transactionEventToken = paymentSimulateReceiptResponse.transactionEventToken
            this.debuggingRequestId = paymentSimulateReceiptResponse.debuggingRequestId
            additionalProperties(paymentSimulateReceiptResponse.additionalProperties)
        }

        /** Request Result */
        fun result(result: Result) = result(JsonField.of(result))

        /** Request Result */
        @JsonProperty("result")
        @ExcludeMissing
        fun result(result: JsonField<Result>) = apply { this.result = result }

        /** Transaction Event Token */
        fun transactionEventToken(transactionEventToken: String) =
            transactionEventToken(JsonField.of(transactionEventToken))

        /** Transaction Event Token */
        @JsonProperty("transaction_event_token")
        @ExcludeMissing
        fun transactionEventToken(transactionEventToken: JsonField<String>) = apply {
            this.transactionEventToken = transactionEventToken
        }

        /** Debugging Request Id */
        fun debuggingRequestId(debuggingRequestId: String) =
            debuggingRequestId(JsonField.of(debuggingRequestId))

        /** Debugging Request Id */
        @JsonProperty("debugging_request_id")
        @ExcludeMissing
        fun debuggingRequestId(debuggingRequestId: JsonField<String>) = apply {
            this.debuggingRequestId = debuggingRequestId
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

        fun build(): PaymentSimulateReceiptResponse =
            PaymentSimulateReceiptResponse(
                result,
                transactionEventToken,
                debuggingRequestId,
                additionalProperties.toUnmodifiable(),
            )
    }

    class Result
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Result && this.value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()

        companion object {

            val APPROVED = Result(JsonField.of("APPROVED"))

            val DECLINED = Result(JsonField.of("DECLINED"))

            fun of(value: String) = Result(JsonField.of(value))
        }

        enum class Known {
            APPROVED,
            DECLINED,
        }

        enum class Value {
            APPROVED,
            DECLINED,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                APPROVED -> Value.APPROVED
                DECLINED -> Value.DECLINED
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                APPROVED -> Known.APPROVED
                DECLINED -> Known.DECLINED
                else -> throw LithicInvalidDataException("Unknown Result: $value")
            }

        fun asString(): String = _value().asStringOrThrow()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is PaymentSimulateReceiptResponse &&
            this.result == other.result &&
            this.transactionEventToken == other.transactionEventToken &&
            this.debuggingRequestId == other.debuggingRequestId &&
            this.additionalProperties == other.additionalProperties
    }

    private var hashCode: Int = 0

    override fun hashCode(): Int {
        if (hashCode == 0) {
            hashCode =
                Objects.hash(
                    result,
                    transactionEventToken,
                    debuggingRequestId,
                    additionalProperties,
                )
        }
        return hashCode
    }

    override fun toString() =
        "PaymentSimulateReceiptResponse{result=$result, transactionEventToken=$transactionEventToken, debuggingRequestId=$debuggingRequestId, additionalProperties=$additionalProperties}"
}
