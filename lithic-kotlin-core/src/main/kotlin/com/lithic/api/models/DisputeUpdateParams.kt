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
import java.time.OffsetDateTime
import java.util.Objects

class DisputeUpdateParams
constructor(
    private val disputeToken: String,
    private val amount: Long?,
    private val customerFiledDate: OffsetDateTime?,
    private val customerNote: String?,
    private val reason: Reason?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
    private val additionalBodyProperties: Map<String, JsonValue>,
) {

    fun disputeToken(): String = disputeToken

    fun amount(): Long? = amount

    fun customerFiledDate(): OffsetDateTime? = customerFiledDate

    fun customerNote(): String? = customerNote

    fun reason(): Reason? = reason

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun _additionalBodyProperties(): Map<String, JsonValue> = additionalBodyProperties

    internal fun getBody(): DisputeUpdateBody {
        return DisputeUpdateBody(
            amount,
            customerFiledDate,
            customerNote,
            reason,
            additionalBodyProperties,
        )
    }

    internal fun getHeaders(): Headers = additionalHeaders

    internal fun getQueryParams(): QueryParams = additionalQueryParams

    fun getPathParam(index: Int): String {
        return when (index) {
            0 -> disputeToken
            else -> ""
        }
    }

    @JsonDeserialize(builder = DisputeUpdateBody.Builder::class)
    @NoAutoDetect
    class DisputeUpdateBody
    internal constructor(
        private val amount: Long?,
        private val customerFiledDate: OffsetDateTime?,
        private val customerNote: String?,
        private val reason: Reason?,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        /** Amount to dispute */
        @JsonProperty("amount") fun amount(): Long? = amount

        /** Date the customer filed the dispute */
        @JsonProperty("customer_filed_date")
        fun customerFiledDate(): OffsetDateTime? = customerFiledDate

        /** Customer description of dispute */
        @JsonProperty("customer_note") fun customerNote(): String? = customerNote

        /** Reason for dispute */
        @JsonProperty("reason") fun reason(): Reason? = reason

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var amount: Long? = null
            private var customerFiledDate: OffsetDateTime? = null
            private var customerNote: String? = null
            private var reason: Reason? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(disputeUpdateBody: DisputeUpdateBody) = apply {
                this.amount = disputeUpdateBody.amount
                this.customerFiledDate = disputeUpdateBody.customerFiledDate
                this.customerNote = disputeUpdateBody.customerNote
                this.reason = disputeUpdateBody.reason
                additionalProperties(disputeUpdateBody.additionalProperties)
            }

            /** Amount to dispute */
            @JsonProperty("amount") fun amount(amount: Long) = apply { this.amount = amount }

            /** Date the customer filed the dispute */
            @JsonProperty("customer_filed_date")
            fun customerFiledDate(customerFiledDate: OffsetDateTime) = apply {
                this.customerFiledDate = customerFiledDate
            }

            /** Customer description of dispute */
            @JsonProperty("customer_note")
            fun customerNote(customerNote: String) = apply { this.customerNote = customerNote }

            /** Reason for dispute */
            @JsonProperty("reason") fun reason(reason: Reason) = apply { this.reason = reason }

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

            fun build(): DisputeUpdateBody =
                DisputeUpdateBody(
                    amount,
                    customerFiledDate,
                    customerNote,
                    reason,
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is DisputeUpdateBody && amount == other.amount && customerFiledDate == other.customerFiledDate && customerNote == other.customerNote && reason == other.reason && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(amount, customerFiledDate, customerNote, reason, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "DisputeUpdateBody{amount=$amount, customerFiledDate=$customerFiledDate, customerNote=$customerNote, reason=$reason, additionalProperties=$additionalProperties}"
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var disputeToken: String? = null
        private var amount: Long? = null
        private var customerFiledDate: OffsetDateTime? = null
        private var customerNote: String? = null
        private var reason: Reason? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()
        private var additionalBodyProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(disputeUpdateParams: DisputeUpdateParams) = apply {
            disputeToken = disputeUpdateParams.disputeToken
            amount = disputeUpdateParams.amount
            customerFiledDate = disputeUpdateParams.customerFiledDate
            customerNote = disputeUpdateParams.customerNote
            reason = disputeUpdateParams.reason
            additionalHeaders = disputeUpdateParams.additionalHeaders.toBuilder()
            additionalQueryParams = disputeUpdateParams.additionalQueryParams.toBuilder()
            additionalBodyProperties = disputeUpdateParams.additionalBodyProperties.toMutableMap()
        }

        fun disputeToken(disputeToken: String) = apply { this.disputeToken = disputeToken }

        /** Amount to dispute */
        fun amount(amount: Long) = apply { this.amount = amount }

        /** Date the customer filed the dispute */
        fun customerFiledDate(customerFiledDate: OffsetDateTime) = apply {
            this.customerFiledDate = customerFiledDate
        }

        /** Customer description of dispute */
        fun customerNote(customerNote: String) = apply { this.customerNote = customerNote }

        /** Reason for dispute */
        fun reason(reason: Reason) = apply { this.reason = reason }

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

        fun build(): DisputeUpdateParams =
            DisputeUpdateParams(
                checkNotNull(disputeToken) { "`disputeToken` is required but was not set" },
                amount,
                customerFiledDate,
                customerNote,
                reason,
                additionalHeaders.build(),
                additionalQueryParams.build(),
                additionalBodyProperties.toImmutable(),
            )
    }

    class Reason
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Reason && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()

        companion object {

            val ATM_CASH_MISDISPENSE = Reason(JsonField.of("ATM_CASH_MISDISPENSE"))

            val CANCELLED = Reason(JsonField.of("CANCELLED"))

            val DUPLICATED = Reason(JsonField.of("DUPLICATED"))

            val FRAUD_CARD_NOT_PRESENT = Reason(JsonField.of("FRAUD_CARD_NOT_PRESENT"))

            val FRAUD_CARD_PRESENT = Reason(JsonField.of("FRAUD_CARD_PRESENT"))

            val FRAUD_OTHER = Reason(JsonField.of("FRAUD_OTHER"))

            val GOODS_SERVICES_NOT_AS_DESCRIBED =
                Reason(JsonField.of("GOODS_SERVICES_NOT_AS_DESCRIBED"))

            val GOODS_SERVICES_NOT_RECEIVED = Reason(JsonField.of("GOODS_SERVICES_NOT_RECEIVED"))

            val INCORRECT_AMOUNT = Reason(JsonField.of("INCORRECT_AMOUNT"))

            val MISSING_AUTH = Reason(JsonField.of("MISSING_AUTH"))

            val OTHER = Reason(JsonField.of("OTHER"))

            val PROCESSING_ERROR = Reason(JsonField.of("PROCESSING_ERROR"))

            val RECURRING_TRANSACTION_NOT_CANCELLED =
                Reason(JsonField.of("RECURRING_TRANSACTION_NOT_CANCELLED"))

            val REFUND_NOT_PROCESSED = Reason(JsonField.of("REFUND_NOT_PROCESSED"))

            fun of(value: String) = Reason(JsonField.of(value))
        }

        enum class Known {
            ATM_CASH_MISDISPENSE,
            CANCELLED,
            DUPLICATED,
            FRAUD_CARD_NOT_PRESENT,
            FRAUD_CARD_PRESENT,
            FRAUD_OTHER,
            GOODS_SERVICES_NOT_AS_DESCRIBED,
            GOODS_SERVICES_NOT_RECEIVED,
            INCORRECT_AMOUNT,
            MISSING_AUTH,
            OTHER,
            PROCESSING_ERROR,
            RECURRING_TRANSACTION_NOT_CANCELLED,
            REFUND_NOT_PROCESSED,
        }

        enum class Value {
            ATM_CASH_MISDISPENSE,
            CANCELLED,
            DUPLICATED,
            FRAUD_CARD_NOT_PRESENT,
            FRAUD_CARD_PRESENT,
            FRAUD_OTHER,
            GOODS_SERVICES_NOT_AS_DESCRIBED,
            GOODS_SERVICES_NOT_RECEIVED,
            INCORRECT_AMOUNT,
            MISSING_AUTH,
            OTHER,
            PROCESSING_ERROR,
            RECURRING_TRANSACTION_NOT_CANCELLED,
            REFUND_NOT_PROCESSED,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                ATM_CASH_MISDISPENSE -> Value.ATM_CASH_MISDISPENSE
                CANCELLED -> Value.CANCELLED
                DUPLICATED -> Value.DUPLICATED
                FRAUD_CARD_NOT_PRESENT -> Value.FRAUD_CARD_NOT_PRESENT
                FRAUD_CARD_PRESENT -> Value.FRAUD_CARD_PRESENT
                FRAUD_OTHER -> Value.FRAUD_OTHER
                GOODS_SERVICES_NOT_AS_DESCRIBED -> Value.GOODS_SERVICES_NOT_AS_DESCRIBED
                GOODS_SERVICES_NOT_RECEIVED -> Value.GOODS_SERVICES_NOT_RECEIVED
                INCORRECT_AMOUNT -> Value.INCORRECT_AMOUNT
                MISSING_AUTH -> Value.MISSING_AUTH
                OTHER -> Value.OTHER
                PROCESSING_ERROR -> Value.PROCESSING_ERROR
                RECURRING_TRANSACTION_NOT_CANCELLED -> Value.RECURRING_TRANSACTION_NOT_CANCELLED
                REFUND_NOT_PROCESSED -> Value.REFUND_NOT_PROCESSED
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                ATM_CASH_MISDISPENSE -> Known.ATM_CASH_MISDISPENSE
                CANCELLED -> Known.CANCELLED
                DUPLICATED -> Known.DUPLICATED
                FRAUD_CARD_NOT_PRESENT -> Known.FRAUD_CARD_NOT_PRESENT
                FRAUD_CARD_PRESENT -> Known.FRAUD_CARD_PRESENT
                FRAUD_OTHER -> Known.FRAUD_OTHER
                GOODS_SERVICES_NOT_AS_DESCRIBED -> Known.GOODS_SERVICES_NOT_AS_DESCRIBED
                GOODS_SERVICES_NOT_RECEIVED -> Known.GOODS_SERVICES_NOT_RECEIVED
                INCORRECT_AMOUNT -> Known.INCORRECT_AMOUNT
                MISSING_AUTH -> Known.MISSING_AUTH
                OTHER -> Known.OTHER
                PROCESSING_ERROR -> Known.PROCESSING_ERROR
                RECURRING_TRANSACTION_NOT_CANCELLED -> Known.RECURRING_TRANSACTION_NOT_CANCELLED
                REFUND_NOT_PROCESSED -> Known.REFUND_NOT_PROCESSED
                else -> throw LithicInvalidDataException("Unknown Reason: $value")
            }

        fun asString(): String = _value().asStringOrThrow()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is DisputeUpdateParams && disputeToken == other.disputeToken && amount == other.amount && customerFiledDate == other.customerFiledDate && customerNote == other.customerNote && reason == other.reason && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams && additionalBodyProperties == other.additionalBodyProperties /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(disputeToken, amount, customerFiledDate, customerNote, reason, additionalHeaders, additionalQueryParams, additionalBodyProperties) /* spotless:on */

    override fun toString() =
        "DisputeUpdateParams{disputeToken=$disputeToken, amount=$amount, customerFiledDate=$customerFiledDate, customerNote=$customerNote, reason=$reason, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams, additionalBodyProperties=$additionalBodyProperties}"
}
