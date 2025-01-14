// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.lithic.api.core.Enum
import com.lithic.api.core.ExcludeMissing
import com.lithic.api.core.JsonField
import com.lithic.api.core.JsonMissing
import com.lithic.api.core.JsonValue
import com.lithic.api.core.NoAutoDetect
import com.lithic.api.core.checkRequired
import com.lithic.api.core.http.Headers
import com.lithic.api.core.http.QueryParams
import com.lithic.api.core.immutableEmptyMap
import com.lithic.api.core.toImmutable
import com.lithic.api.errors.LithicInvalidDataException
import java.time.OffsetDateTime
import java.util.Objects

/** Initiate a dispute. */
class DisputeCreateParams
constructor(
    private val body: DisputeCreateBody,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) {

    /** Amount to dispute */
    fun amount(): Long = body.amount()

    /** Reason for dispute */
    fun reason(): Reason = body.reason()

    /** Transaction to dispute */
    fun transactionToken(): String = body.transactionToken()

    /** Date the customer filed the dispute */
    fun customerFiledDate(): OffsetDateTime? = body.customerFiledDate()

    /** Customer description of dispute */
    fun customerNote(): String? = body.customerNote()

    /** Amount to dispute */
    fun _amount(): JsonField<Long> = body._amount()

    /** Reason for dispute */
    fun _reason(): JsonField<Reason> = body._reason()

    /** Transaction to dispute */
    fun _transactionToken(): JsonField<String> = body._transactionToken()

    /** Date the customer filed the dispute */
    fun _customerFiledDate(): JsonField<OffsetDateTime> = body._customerFiledDate()

    /** Customer description of dispute */
    fun _customerNote(): JsonField<String> = body._customerNote()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    internal fun getBody(): DisputeCreateBody = body

    internal fun getHeaders(): Headers = additionalHeaders

    internal fun getQueryParams(): QueryParams = additionalQueryParams

    @NoAutoDetect
    class DisputeCreateBody
    @JsonCreator
    internal constructor(
        @JsonProperty("amount")
        @ExcludeMissing
        private val amount: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("reason")
        @ExcludeMissing
        private val reason: JsonField<Reason> = JsonMissing.of(),
        @JsonProperty("transaction_token")
        @ExcludeMissing
        private val transactionToken: JsonField<String> = JsonMissing.of(),
        @JsonProperty("customer_filed_date")
        @ExcludeMissing
        private val customerFiledDate: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("customer_note")
        @ExcludeMissing
        private val customerNote: JsonField<String> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /** Amount to dispute */
        fun amount(): Long = amount.getRequired("amount")

        /** Reason for dispute */
        fun reason(): Reason = reason.getRequired("reason")

        /** Transaction to dispute */
        fun transactionToken(): String = transactionToken.getRequired("transaction_token")

        /** Date the customer filed the dispute */
        fun customerFiledDate(): OffsetDateTime? =
            customerFiledDate.getNullable("customer_filed_date")

        /** Customer description of dispute */
        fun customerNote(): String? = customerNote.getNullable("customer_note")

        /** Amount to dispute */
        @JsonProperty("amount") @ExcludeMissing fun _amount(): JsonField<Long> = amount

        /** Reason for dispute */
        @JsonProperty("reason") @ExcludeMissing fun _reason(): JsonField<Reason> = reason

        /** Transaction to dispute */
        @JsonProperty("transaction_token")
        @ExcludeMissing
        fun _transactionToken(): JsonField<String> = transactionToken

        /** Date the customer filed the dispute */
        @JsonProperty("customer_filed_date")
        @ExcludeMissing
        fun _customerFiledDate(): JsonField<OffsetDateTime> = customerFiledDate

        /** Customer description of dispute */
        @JsonProperty("customer_note")
        @ExcludeMissing
        fun _customerNote(): JsonField<String> = customerNote

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): DisputeCreateBody = apply {
            if (validated) {
                return@apply
            }

            amount()
            reason()
            transactionToken()
            customerFiledDate()
            customerNote()
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var amount: JsonField<Long>? = null
            private var reason: JsonField<Reason>? = null
            private var transactionToken: JsonField<String>? = null
            private var customerFiledDate: JsonField<OffsetDateTime> = JsonMissing.of()
            private var customerNote: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(disputeCreateBody: DisputeCreateBody) = apply {
                amount = disputeCreateBody.amount
                reason = disputeCreateBody.reason
                transactionToken = disputeCreateBody.transactionToken
                customerFiledDate = disputeCreateBody.customerFiledDate
                customerNote = disputeCreateBody.customerNote
                additionalProperties = disputeCreateBody.additionalProperties.toMutableMap()
            }

            /** Amount to dispute */
            fun amount(amount: Long) = amount(JsonField.of(amount))

            /** Amount to dispute */
            fun amount(amount: JsonField<Long>) = apply { this.amount = amount }

            /** Reason for dispute */
            fun reason(reason: Reason) = reason(JsonField.of(reason))

            /** Reason for dispute */
            fun reason(reason: JsonField<Reason>) = apply { this.reason = reason }

            /** Transaction to dispute */
            fun transactionToken(transactionToken: String) =
                transactionToken(JsonField.of(transactionToken))

            /** Transaction to dispute */
            fun transactionToken(transactionToken: JsonField<String>) = apply {
                this.transactionToken = transactionToken
            }

            /** Date the customer filed the dispute */
            fun customerFiledDate(customerFiledDate: OffsetDateTime) =
                customerFiledDate(JsonField.of(customerFiledDate))

            /** Date the customer filed the dispute */
            fun customerFiledDate(customerFiledDate: JsonField<OffsetDateTime>) = apply {
                this.customerFiledDate = customerFiledDate
            }

            /** Customer description of dispute */
            fun customerNote(customerNote: String) = customerNote(JsonField.of(customerNote))

            /** Customer description of dispute */
            fun customerNote(customerNote: JsonField<String>) = apply {
                this.customerNote = customerNote
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

            fun build(): DisputeCreateBody =
                DisputeCreateBody(
                    checkRequired("amount", amount),
                    checkRequired("reason", reason),
                    checkRequired("transactionToken", transactionToken),
                    customerFiledDate,
                    customerNote,
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is DisputeCreateBody && amount == other.amount && reason == other.reason && transactionToken == other.transactionToken && customerFiledDate == other.customerFiledDate && customerNote == other.customerNote && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(amount, reason, transactionToken, customerFiledDate, customerNote, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "DisputeCreateBody{amount=$amount, reason=$reason, transactionToken=$transactionToken, customerFiledDate=$customerFiledDate, customerNote=$customerNote, additionalProperties=$additionalProperties}"
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var body: DisputeCreateBody.Builder = DisputeCreateBody.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        internal fun from(disputeCreateParams: DisputeCreateParams) = apply {
            body = disputeCreateParams.body.toBuilder()
            additionalHeaders = disputeCreateParams.additionalHeaders.toBuilder()
            additionalQueryParams = disputeCreateParams.additionalQueryParams.toBuilder()
        }

        /** Amount to dispute */
        fun amount(amount: Long) = apply { body.amount(amount) }

        /** Amount to dispute */
        fun amount(amount: JsonField<Long>) = apply { body.amount(amount) }

        /** Reason for dispute */
        fun reason(reason: Reason) = apply { body.reason(reason) }

        /** Reason for dispute */
        fun reason(reason: JsonField<Reason>) = apply { body.reason(reason) }

        /** Transaction to dispute */
        fun transactionToken(transactionToken: String) = apply {
            body.transactionToken(transactionToken)
        }

        /** Transaction to dispute */
        fun transactionToken(transactionToken: JsonField<String>) = apply {
            body.transactionToken(transactionToken)
        }

        /** Date the customer filed the dispute */
        fun customerFiledDate(customerFiledDate: OffsetDateTime) = apply {
            body.customerFiledDate(customerFiledDate)
        }

        /** Date the customer filed the dispute */
        fun customerFiledDate(customerFiledDate: JsonField<OffsetDateTime>) = apply {
            body.customerFiledDate(customerFiledDate)
        }

        /** Customer description of dispute */
        fun customerNote(customerNote: String) = apply { body.customerNote(customerNote) }

        /** Customer description of dispute */
        fun customerNote(customerNote: JsonField<String>) = apply {
            body.customerNote(customerNote)
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

        fun build(): DisputeCreateParams =
            DisputeCreateParams(
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

        return /* spotless:off */ other is DisputeCreateParams && body == other.body && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(body, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() =
        "DisputeCreateParams{body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
