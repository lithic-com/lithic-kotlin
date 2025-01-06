// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.lithic.api.core.Enum
import com.lithic.api.core.ExcludeMissing
import com.lithic.api.core.JsonField
import com.lithic.api.core.JsonValue
import com.lithic.api.core.NoAutoDetect
import com.lithic.api.core.http.Headers
import com.lithic.api.core.http.QueryParams
import com.lithic.api.core.immutableEmptyMap
import com.lithic.api.core.toImmutable
import com.lithic.api.errors.LithicInvalidDataException
import java.time.OffsetDateTime
import java.util.Objects

class DisputeUpdateParams
constructor(
    private val disputeToken: String,
    private val body: DisputeUpdateBody,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) {

    fun disputeToken(): String = disputeToken

    /** Amount to dispute */
    fun amount(): Long? = body.amount()

    /** Date the customer filed the dispute */
    fun customerFiledDate(): OffsetDateTime? = body.customerFiledDate()

    /** Customer description of dispute */
    fun customerNote(): String? = body.customerNote()

    /** Reason for dispute */
    fun reason(): Reason? = body.reason()

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    internal fun getBody(): DisputeUpdateBody = body

    internal fun getHeaders(): Headers = additionalHeaders

    internal fun getQueryParams(): QueryParams = additionalQueryParams

    fun getPathParam(index: Int): String {
        return when (index) {
            0 -> disputeToken
            else -> ""
        }
    }

    @NoAutoDetect
    class DisputeUpdateBody
    @JsonCreator
    internal constructor(
        @JsonProperty("amount") private val amount: Long?,
        @JsonProperty("customer_filed_date") private val customerFiledDate: OffsetDateTime?,
        @JsonProperty("customer_note") private val customerNote: String?,
        @JsonProperty("reason") private val reason: Reason?,
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
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
                amount = disputeUpdateBody.amount
                customerFiledDate = disputeUpdateBody.customerFiledDate
                customerNote = disputeUpdateBody.customerNote
                reason = disputeUpdateBody.reason
                additionalProperties = disputeUpdateBody.additionalProperties.toMutableMap()
            }

            /** Amount to dispute */
            fun amount(amount: Long?) = apply { this.amount = amount }

            /** Amount to dispute */
            fun amount(amount: Long) = amount(amount as Long?)

            /** Date the customer filed the dispute */
            fun customerFiledDate(customerFiledDate: OffsetDateTime?) = apply {
                this.customerFiledDate = customerFiledDate
            }

            /** Customer description of dispute */
            fun customerNote(customerNote: String?) = apply { this.customerNote = customerNote }

            /** Reason for dispute */
            fun reason(reason: Reason?) = apply { this.reason = reason }

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
        private var body: DisputeUpdateBody.Builder = DisputeUpdateBody.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        internal fun from(disputeUpdateParams: DisputeUpdateParams) = apply {
            disputeToken = disputeUpdateParams.disputeToken
            body = disputeUpdateParams.body.toBuilder()
            additionalHeaders = disputeUpdateParams.additionalHeaders.toBuilder()
            additionalQueryParams = disputeUpdateParams.additionalQueryParams.toBuilder()
        }

        fun disputeToken(disputeToken: String) = apply { this.disputeToken = disputeToken }

        /** Amount to dispute */
        fun amount(amount: Long?) = apply { body.amount(amount) }

        /** Amount to dispute */
        fun amount(amount: Long) = amount(amount as Long?)

        /** Date the customer filed the dispute */
        fun customerFiledDate(customerFiledDate: OffsetDateTime?) = apply {
            body.customerFiledDate(customerFiledDate)
        }

        /** Customer description of dispute */
        fun customerNote(customerNote: String?) = apply { body.customerNote(customerNote) }

        /** Reason for dispute */
        fun reason(reason: Reason?) = apply { body.reason(reason) }

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
            body.additionalProperties(additionalBodyProperties)
        }

        fun putAdditionalBodyProperty(key: String, value: JsonValue) = apply {
            body.putAdditionalProperty(key, value)
        }

        fun putAllAdditionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) =
            apply {
                body.putAllAdditionalProperties(additionalBodyProperties)
            }

        fun removeAdditionalBodyProperty(key: String) = apply { body.removeAdditionalProperty(key) }

        fun removeAllAdditionalBodyProperties(keys: Set<String>) = apply {
            body.removeAllAdditionalProperties(keys)
        }

        fun build(): DisputeUpdateParams =
            DisputeUpdateParams(
                checkNotNull(disputeToken) { "`disputeToken` is required but was not set" },
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    class Reason
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            val ATM_CASH_MISDISPENSE = of("ATM_CASH_MISDISPENSE")

            val CANCELLED = of("CANCELLED")

            val DUPLICATED = of("DUPLICATED")

            val FRAUD_CARD_NOT_PRESENT = of("FRAUD_CARD_NOT_PRESENT")

            val FRAUD_CARD_PRESENT = of("FRAUD_CARD_PRESENT")

            val FRAUD_OTHER = of("FRAUD_OTHER")

            val GOODS_SERVICES_NOT_AS_DESCRIBED = of("GOODS_SERVICES_NOT_AS_DESCRIBED")

            val GOODS_SERVICES_NOT_RECEIVED = of("GOODS_SERVICES_NOT_RECEIVED")

            val INCORRECT_AMOUNT = of("INCORRECT_AMOUNT")

            val MISSING_AUTH = of("MISSING_AUTH")

            val OTHER = of("OTHER")

            val PROCESSING_ERROR = of("PROCESSING_ERROR")

            val RECURRING_TRANSACTION_NOT_CANCELLED = of("RECURRING_TRANSACTION_NOT_CANCELLED")

            val REFUND_NOT_PROCESSED = of("REFUND_NOT_PROCESSED")

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

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Reason && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is DisputeUpdateParams && disputeToken == other.disputeToken && body == other.body && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(disputeToken, body, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() =
        "DisputeUpdateParams{disputeToken=$disputeToken, body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
