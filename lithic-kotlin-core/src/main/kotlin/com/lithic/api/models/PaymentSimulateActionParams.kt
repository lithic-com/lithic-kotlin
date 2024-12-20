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
import com.lithic.api.core.JsonValue
import com.lithic.api.core.NoAutoDetect
import com.lithic.api.core.http.Headers
import com.lithic.api.core.http.QueryParams
import com.lithic.api.core.toImmutable
import com.lithic.api.errors.LithicInvalidDataException
import com.lithic.api.models.*
import java.util.Objects

class PaymentSimulateActionParams
constructor(
    private val paymentToken: String,
    private val eventType: SupportedSimulationTypes,
    private val declineReason: SupportedSimulationDeclineReasons?,
    private val returnReasonCode: String?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
    private val additionalBodyProperties: Map<String, JsonValue>,
) {

    fun paymentToken(): String = paymentToken

    fun eventType(): SupportedSimulationTypes = eventType

    fun declineReason(): SupportedSimulationDeclineReasons? = declineReason

    fun returnReasonCode(): String? = returnReasonCode

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun _additionalBodyProperties(): Map<String, JsonValue> = additionalBodyProperties

    internal fun getBody(): PaymentSimulateActionBody {
        return PaymentSimulateActionBody(
            eventType,
            declineReason,
            returnReasonCode,
            additionalBodyProperties,
        )
    }

    internal fun getHeaders(): Headers = additionalHeaders

    internal fun getQueryParams(): QueryParams = additionalQueryParams

    fun getPathParam(index: Int): String {
        return when (index) {
            0 -> paymentToken
            else -> ""
        }
    }

    @JsonDeserialize(builder = PaymentSimulateActionBody.Builder::class)
    @NoAutoDetect
    class PaymentSimulateActionBody
    internal constructor(
        private val eventType: SupportedSimulationTypes?,
        private val declineReason: SupportedSimulationDeclineReasons?,
        private val returnReasonCode: String?,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        /** Event Type */
        @JsonProperty("event_type") fun eventType(): SupportedSimulationTypes? = eventType

        /** Decline reason */
        @JsonProperty("decline_reason")
        fun declineReason(): SupportedSimulationDeclineReasons? = declineReason

        /** Return Reason Code */
        @JsonProperty("return_reason_code") fun returnReasonCode(): String? = returnReasonCode

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var eventType: SupportedSimulationTypes? = null
            private var declineReason: SupportedSimulationDeclineReasons? = null
            private var returnReasonCode: String? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(paymentSimulateActionBody: PaymentSimulateActionBody) = apply {
                this.eventType = paymentSimulateActionBody.eventType
                this.declineReason = paymentSimulateActionBody.declineReason
                this.returnReasonCode = paymentSimulateActionBody.returnReasonCode
                additionalProperties(paymentSimulateActionBody.additionalProperties)
            }

            /** Event Type */
            @JsonProperty("event_type")
            fun eventType(eventType: SupportedSimulationTypes) = apply {
                this.eventType = eventType
            }

            /** Decline reason */
            @JsonProperty("decline_reason")
            fun declineReason(declineReason: SupportedSimulationDeclineReasons) = apply {
                this.declineReason = declineReason
            }

            /** Return Reason Code */
            @JsonProperty("return_reason_code")
            fun returnReasonCode(returnReasonCode: String) = apply {
                this.returnReasonCode = returnReasonCode
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

            fun build(): PaymentSimulateActionBody =
                PaymentSimulateActionBody(
                    checkNotNull(eventType) { "`eventType` is required but was not set" },
                    declineReason,
                    returnReasonCode,
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is PaymentSimulateActionBody && eventType == other.eventType && declineReason == other.declineReason && returnReasonCode == other.returnReasonCode && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(eventType, declineReason, returnReasonCode, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "PaymentSimulateActionBody{eventType=$eventType, declineReason=$declineReason, returnReasonCode=$returnReasonCode, additionalProperties=$additionalProperties}"
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var paymentToken: String? = null
        private var eventType: SupportedSimulationTypes? = null
        private var declineReason: SupportedSimulationDeclineReasons? = null
        private var returnReasonCode: String? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()
        private var additionalBodyProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(paymentSimulateActionParams: PaymentSimulateActionParams) = apply {
            paymentToken = paymentSimulateActionParams.paymentToken
            eventType = paymentSimulateActionParams.eventType
            declineReason = paymentSimulateActionParams.declineReason
            returnReasonCode = paymentSimulateActionParams.returnReasonCode
            additionalHeaders = paymentSimulateActionParams.additionalHeaders.toBuilder()
            additionalQueryParams = paymentSimulateActionParams.additionalQueryParams.toBuilder()
            additionalBodyProperties =
                paymentSimulateActionParams.additionalBodyProperties.toMutableMap()
        }

        fun paymentToken(paymentToken: String) = apply { this.paymentToken = paymentToken }

        /** Event Type */
        fun eventType(eventType: SupportedSimulationTypes) = apply { this.eventType = eventType }

        /** Decline reason */
        fun declineReason(declineReason: SupportedSimulationDeclineReasons) = apply {
            this.declineReason = declineReason
        }

        /** Return Reason Code */
        fun returnReasonCode(returnReasonCode: String) = apply {
            this.returnReasonCode = returnReasonCode
        }

        fun additionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun additionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun putAdditionalHeader(name: String, value: String) = apply {
            additionalHeaders.put(name, value)
        }

        fun putAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.put(name, values)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun replaceAdditionalHeaders(name: String, value: String) = apply {
            additionalHeaders.replace(name, value)
        }

        fun replaceAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.replace(name, values)
        }

        fun replaceAllAdditionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun replaceAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun removeAdditionalHeaders(name: String) = apply { additionalHeaders.remove(name) }

        fun removeAllAdditionalHeaders(names: Set<String>) = apply {
            additionalHeaders.removeAll(names)
        }

        fun additionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun additionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun putAdditionalQueryParam(key: String, value: String) = apply {
            additionalQueryParams.put(key, value)
        }

        fun putAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.put(key, values)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.putAll(additionalQueryParams)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.putAll(additionalQueryParams)
            }

        fun replaceAdditionalQueryParams(key: String, value: String) = apply {
            additionalQueryParams.replace(key, value)
        }

        fun replaceAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.replace(key, values)
        }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.replaceAll(additionalQueryParams)
        }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.replaceAll(additionalQueryParams)
            }

        fun removeAdditionalQueryParams(key: String) = apply { additionalQueryParams.remove(key) }

        fun removeAllAdditionalQueryParams(keys: Set<String>) = apply {
            additionalQueryParams.removeAll(keys)
        }

        fun additionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) = apply {
            this.additionalBodyProperties.clear()
            putAllAdditionalBodyProperties(additionalBodyProperties)
        }

        fun putAdditionalBodyProperty(key: String, value: JsonValue) = apply {
            additionalBodyProperties.put(key, value)
        }

        fun putAllAdditionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) =
            apply {
                this.additionalBodyProperties.putAll(additionalBodyProperties)
            }

        fun removeAdditionalBodyProperty(key: String) = apply {
            additionalBodyProperties.remove(key)
        }

        fun removeAllAdditionalBodyProperties(keys: Set<String>) = apply {
            keys.forEach(::removeAdditionalBodyProperty)
        }

        fun build(): PaymentSimulateActionParams =
            PaymentSimulateActionParams(
                checkNotNull(paymentToken) { "`paymentToken` is required but was not set" },
                checkNotNull(eventType) { "`eventType` is required but was not set" },
                declineReason,
                returnReasonCode,
                additionalHeaders.build(),
                additionalQueryParams.build(),
                additionalBodyProperties.toImmutable(),
            )
    }

    class SupportedSimulationTypes
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is SupportedSimulationTypes && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()

        companion object {

            val ACH_ORIGINATION_REVIEWED =
                SupportedSimulationTypes(JsonField.of("ACH_ORIGINATION_REVIEWED"))

            val ACH_ORIGINATION_RELEASED =
                SupportedSimulationTypes(JsonField.of("ACH_ORIGINATION_RELEASED"))

            val ACH_ORIGINATION_PROCESSED =
                SupportedSimulationTypes(JsonField.of("ACH_ORIGINATION_PROCESSED"))

            val ACH_ORIGINATION_SETTLED =
                SupportedSimulationTypes(JsonField.of("ACH_ORIGINATION_SETTLED"))

            val ACH_RECEIPT_SETTLED = SupportedSimulationTypes(JsonField.of("ACH_RECEIPT_SETTLED"))

            val ACH_RETURN_INITIATED =
                SupportedSimulationTypes(JsonField.of("ACH_RETURN_INITIATED"))

            val ACH_RETURN_PROCESSED =
                SupportedSimulationTypes(JsonField.of("ACH_RETURN_PROCESSED"))

            fun of(value: String) = SupportedSimulationTypes(JsonField.of(value))
        }

        enum class Known {
            ACH_ORIGINATION_REVIEWED,
            ACH_ORIGINATION_RELEASED,
            ACH_ORIGINATION_PROCESSED,
            ACH_ORIGINATION_SETTLED,
            ACH_RECEIPT_SETTLED,
            ACH_RETURN_INITIATED,
            ACH_RETURN_PROCESSED,
        }

        enum class Value {
            ACH_ORIGINATION_REVIEWED,
            ACH_ORIGINATION_RELEASED,
            ACH_ORIGINATION_PROCESSED,
            ACH_ORIGINATION_SETTLED,
            ACH_RECEIPT_SETTLED,
            ACH_RETURN_INITIATED,
            ACH_RETURN_PROCESSED,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                ACH_ORIGINATION_REVIEWED -> Value.ACH_ORIGINATION_REVIEWED
                ACH_ORIGINATION_RELEASED -> Value.ACH_ORIGINATION_RELEASED
                ACH_ORIGINATION_PROCESSED -> Value.ACH_ORIGINATION_PROCESSED
                ACH_ORIGINATION_SETTLED -> Value.ACH_ORIGINATION_SETTLED
                ACH_RECEIPT_SETTLED -> Value.ACH_RECEIPT_SETTLED
                ACH_RETURN_INITIATED -> Value.ACH_RETURN_INITIATED
                ACH_RETURN_PROCESSED -> Value.ACH_RETURN_PROCESSED
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                ACH_ORIGINATION_REVIEWED -> Known.ACH_ORIGINATION_REVIEWED
                ACH_ORIGINATION_RELEASED -> Known.ACH_ORIGINATION_RELEASED
                ACH_ORIGINATION_PROCESSED -> Known.ACH_ORIGINATION_PROCESSED
                ACH_ORIGINATION_SETTLED -> Known.ACH_ORIGINATION_SETTLED
                ACH_RECEIPT_SETTLED -> Known.ACH_RECEIPT_SETTLED
                ACH_RETURN_INITIATED -> Known.ACH_RETURN_INITIATED
                ACH_RETURN_PROCESSED -> Known.ACH_RETURN_PROCESSED
                else -> throw LithicInvalidDataException("Unknown SupportedSimulationTypes: $value")
            }

        fun asString(): String = _value().asStringOrThrow()
    }

    class SupportedSimulationDeclineReasons
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is SupportedSimulationDeclineReasons && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()

        companion object {

            val PROGRAM_TRANSACTION_LIMIT_EXCEEDED =
                SupportedSimulationDeclineReasons(
                    JsonField.of("PROGRAM_TRANSACTION_LIMIT_EXCEEDED")
                )

            val PROGRAM_DAILY_LIMIT_EXCEEDED =
                SupportedSimulationDeclineReasons(JsonField.of("PROGRAM_DAILY_LIMIT_EXCEEDED"))

            val PROGRAM_MONTHLY_LIMIT_EXCEEDED =
                SupportedSimulationDeclineReasons(JsonField.of("PROGRAM_MONTHLY_LIMIT_EXCEEDED"))

            fun of(value: String) = SupportedSimulationDeclineReasons(JsonField.of(value))
        }

        enum class Known {
            PROGRAM_TRANSACTION_LIMIT_EXCEEDED,
            PROGRAM_DAILY_LIMIT_EXCEEDED,
            PROGRAM_MONTHLY_LIMIT_EXCEEDED,
        }

        enum class Value {
            PROGRAM_TRANSACTION_LIMIT_EXCEEDED,
            PROGRAM_DAILY_LIMIT_EXCEEDED,
            PROGRAM_MONTHLY_LIMIT_EXCEEDED,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                PROGRAM_TRANSACTION_LIMIT_EXCEEDED -> Value.PROGRAM_TRANSACTION_LIMIT_EXCEEDED
                PROGRAM_DAILY_LIMIT_EXCEEDED -> Value.PROGRAM_DAILY_LIMIT_EXCEEDED
                PROGRAM_MONTHLY_LIMIT_EXCEEDED -> Value.PROGRAM_MONTHLY_LIMIT_EXCEEDED
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                PROGRAM_TRANSACTION_LIMIT_EXCEEDED -> Known.PROGRAM_TRANSACTION_LIMIT_EXCEEDED
                PROGRAM_DAILY_LIMIT_EXCEEDED -> Known.PROGRAM_DAILY_LIMIT_EXCEEDED
                PROGRAM_MONTHLY_LIMIT_EXCEEDED -> Known.PROGRAM_MONTHLY_LIMIT_EXCEEDED
                else ->
                    throw LithicInvalidDataException(
                        "Unknown SupportedSimulationDeclineReasons: $value"
                    )
            }

        fun asString(): String = _value().asStringOrThrow()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is PaymentSimulateActionParams && paymentToken == other.paymentToken && eventType == other.eventType && declineReason == other.declineReason && returnReasonCode == other.returnReasonCode && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams && additionalBodyProperties == other.additionalBodyProperties /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(paymentToken, eventType, declineReason, returnReasonCode, additionalHeaders, additionalQueryParams, additionalBodyProperties) /* spotless:on */

    override fun toString() =
        "PaymentSimulateActionParams{paymentToken=$paymentToken, eventType=$eventType, declineReason=$declineReason, returnReasonCode=$returnReasonCode, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams, additionalBodyProperties=$additionalBodyProperties}"
}
