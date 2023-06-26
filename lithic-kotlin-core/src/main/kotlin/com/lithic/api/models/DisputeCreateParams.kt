package com.lithic.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.lithic.api.core.ExcludeMissing
import com.lithic.api.core.JsonField
import com.lithic.api.core.JsonValue
import com.lithic.api.core.NoAutoDetect
import com.lithic.api.core.toUnmodifiable
import com.lithic.api.errors.LithicInvalidDataException
import com.lithic.api.models.*
import java.time.OffsetDateTime
import java.util.Objects

class DisputeCreateParams
constructor(
    private val amount: Long,
    private val customerFiledDate: OffsetDateTime?,
    private val reason: Reason,
    private val transactionToken: String,
    private val customerNote: String?,
    private val additionalQueryParams: Map<String, List<String>>,
    private val additionalHeaders: Map<String, List<String>>,
    private val additionalBodyProperties: Map<String, JsonValue>,
) {

    fun amount(): Long = amount

    fun customerFiledDate(): OffsetDateTime? = customerFiledDate

    fun reason(): Reason = reason

    fun transactionToken(): String = transactionToken

    fun customerNote(): String? = customerNote

    internal fun getBody(): DisputeCreateBody {
        return DisputeCreateBody(
            amount,
            customerFiledDate,
            reason,
            transactionToken,
            customerNote,
            additionalBodyProperties,
        )
    }

    internal fun getQueryParams(): Map<String, List<String>> = additionalQueryParams

    internal fun getHeaders(): Map<String, List<String>> = additionalHeaders

    @JsonDeserialize(builder = DisputeCreateBody.Builder::class)
    @NoAutoDetect
    class DisputeCreateBody
    internal constructor(
        private val amount: Long?,
        private val customerFiledDate: OffsetDateTime?,
        private val reason: Reason?,
        private val transactionToken: String?,
        private val customerNote: String?,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var hashCode: Int = 0

        /** Amount to dispute */
        @JsonProperty("amount") fun amount(): Long? = amount

        /** Date the customer filed the dispute */
        @JsonProperty("customer_filed_date")
        fun customerFiledDate(): OffsetDateTime? = customerFiledDate

        /** Reason for dispute */
        @JsonProperty("reason") fun reason(): Reason? = reason

        /** Transaction to dispute */
        @JsonProperty("transaction_token") fun transactionToken(): String? = transactionToken

        /** Customer description of dispute */
        @JsonProperty("customer_note") fun customerNote(): String? = customerNote

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is DisputeCreateBody &&
                this.amount == other.amount &&
                this.customerFiledDate == other.customerFiledDate &&
                this.reason == other.reason &&
                this.transactionToken == other.transactionToken &&
                this.customerNote == other.customerNote &&
                this.additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode =
                    Objects.hash(
                        amount,
                        customerFiledDate,
                        reason,
                        transactionToken,
                        customerNote,
                        additionalProperties,
                    )
            }
            return hashCode
        }

        override fun toString() =
            "DisputeCreateBody{amount=$amount, customerFiledDate=$customerFiledDate, reason=$reason, transactionToken=$transactionToken, customerNote=$customerNote, additionalProperties=$additionalProperties}"

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var amount: Long? = null
            private var customerFiledDate: OffsetDateTime? = null
            private var reason: Reason? = null
            private var transactionToken: String? = null
            private var customerNote: String? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(disputeCreateBody: DisputeCreateBody) = apply {
                this.amount = disputeCreateBody.amount
                this.customerFiledDate = disputeCreateBody.customerFiledDate
                this.reason = disputeCreateBody.reason
                this.transactionToken = disputeCreateBody.transactionToken
                this.customerNote = disputeCreateBody.customerNote
                additionalProperties(disputeCreateBody.additionalProperties)
            }

            /** Amount to dispute */
            @JsonProperty("amount") fun amount(amount: Long) = apply { this.amount = amount }

            /** Date the customer filed the dispute */
            @JsonProperty("customer_filed_date")
            fun customerFiledDate(customerFiledDate: OffsetDateTime) = apply {
                this.customerFiledDate = customerFiledDate
            }

            /** Reason for dispute */
            @JsonProperty("reason") fun reason(reason: Reason) = apply { this.reason = reason }

            /** Transaction to dispute */
            @JsonProperty("transaction_token")
            fun transactionToken(transactionToken: String) = apply {
                this.transactionToken = transactionToken
            }

            /** Customer description of dispute */
            @JsonProperty("customer_note")
            fun customerNote(customerNote: String) = apply { this.customerNote = customerNote }

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

            fun build(): DisputeCreateBody =
                DisputeCreateBody(
                    checkNotNull(amount) { "`amount` is required but was not set" },
                    customerFiledDate,
                    checkNotNull(reason) { "`reason` is required but was not set" },
                    checkNotNull(transactionToken) {
                        "`transactionToken` is required but was not set"
                    },
                    customerNote,
                    additionalProperties.toUnmodifiable(),
                )
        }
    }

    fun _additionalQueryParams(): Map<String, List<String>> = additionalQueryParams

    fun _additionalHeaders(): Map<String, List<String>> = additionalHeaders

    fun _additionalBodyProperties(): Map<String, JsonValue> = additionalBodyProperties

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is DisputeCreateParams &&
            this.amount == other.amount &&
            this.customerFiledDate == other.customerFiledDate &&
            this.reason == other.reason &&
            this.transactionToken == other.transactionToken &&
            this.customerNote == other.customerNote &&
            this.additionalQueryParams == other.additionalQueryParams &&
            this.additionalHeaders == other.additionalHeaders &&
            this.additionalBodyProperties == other.additionalBodyProperties
    }

    override fun hashCode(): Int {
        return Objects.hash(
            amount,
            customerFiledDate,
            reason,
            transactionToken,
            customerNote,
            additionalQueryParams,
            additionalHeaders,
            additionalBodyProperties,
        )
    }

    override fun toString() =
        "DisputeCreateParams{amount=$amount, customerFiledDate=$customerFiledDate, reason=$reason, transactionToken=$transactionToken, customerNote=$customerNote, additionalQueryParams=$additionalQueryParams, additionalHeaders=$additionalHeaders, additionalBodyProperties=$additionalBodyProperties}"

    fun toBuilder() = Builder().from(this)

    companion object {

        fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var amount: Long? = null
        private var customerFiledDate: OffsetDateTime? = null
        private var reason: Reason? = null
        private var transactionToken: String? = null
        private var customerNote: String? = null
        private var additionalQueryParams: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalHeaders: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalBodyProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(disputeCreateParams: DisputeCreateParams) = apply {
            this.amount = disputeCreateParams.amount
            this.customerFiledDate = disputeCreateParams.customerFiledDate
            this.reason = disputeCreateParams.reason
            this.transactionToken = disputeCreateParams.transactionToken
            this.customerNote = disputeCreateParams.customerNote
            additionalQueryParams(disputeCreateParams.additionalQueryParams)
            additionalHeaders(disputeCreateParams.additionalHeaders)
            additionalBodyProperties(disputeCreateParams.additionalBodyProperties)
        }

        /** Amount to dispute */
        fun amount(amount: Long) = apply { this.amount = amount }

        /** Date the customer filed the dispute */
        fun customerFiledDate(customerFiledDate: OffsetDateTime) = apply {
            this.customerFiledDate = customerFiledDate
        }

        /** Reason for dispute */
        fun reason(reason: Reason) = apply { this.reason = reason }

        /** Transaction to dispute */
        fun transactionToken(transactionToken: String) = apply {
            this.transactionToken = transactionToken
        }

        /** Customer description of dispute */
        fun customerNote(customerNote: String) = apply { this.customerNote = customerNote }

        fun additionalQueryParams(additionalQueryParams: Map<String, List<String>>) = apply {
            this.additionalQueryParams.clear()
            putAllQueryParams(additionalQueryParams)
        }

        fun putQueryParam(name: String, value: String) = apply {
            this.additionalQueryParams.getOrPut(name) { mutableListOf() }.add(value)
        }

        fun putQueryParams(name: String, values: Iterable<String>) = apply {
            this.additionalQueryParams.getOrPut(name) { mutableListOf() }.addAll(values)
        }

        fun putAllQueryParams(additionalQueryParams: Map<String, Iterable<String>>) = apply {
            additionalQueryParams.forEach(this::putQueryParams)
        }

        fun removeQueryParam(name: String) = apply {
            this.additionalQueryParams.put(name, mutableListOf())
        }

        fun additionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.clear()
            putAllHeaders(additionalHeaders)
        }

        fun putHeader(name: String, value: String) = apply {
            this.additionalHeaders.getOrPut(name) { mutableListOf() }.add(value)
        }

        fun putHeaders(name: String, values: Iterable<String>) = apply {
            this.additionalHeaders.getOrPut(name) { mutableListOf() }.addAll(values)
        }

        fun putAllHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            additionalHeaders.forEach(this::putHeaders)
        }

        fun removeHeader(name: String) = apply { this.additionalHeaders.put(name, mutableListOf()) }

        fun additionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) = apply {
            this.additionalBodyProperties.clear()
            this.additionalBodyProperties.putAll(additionalBodyProperties)
        }

        fun putAdditionalBodyProperty(key: String, value: JsonValue) = apply {
            this.additionalBodyProperties.put(key, value)
        }

        fun putAllAdditionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) =
            apply {
                this.additionalBodyProperties.putAll(additionalBodyProperties)
            }

        fun build(): DisputeCreateParams =
            DisputeCreateParams(
                checkNotNull(amount) { "`amount` is required but was not set" },
                customerFiledDate,
                checkNotNull(reason) { "`reason` is required but was not set" },
                checkNotNull(transactionToken) { "`transactionToken` is required but was not set" },
                customerNote,
                additionalQueryParams.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
                additionalHeaders.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
                additionalBodyProperties.toUnmodifiable(),
            )
    }

    class Reason
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Reason && this.value == other.value
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

            val REFUND_NOT_PROCESSED = Reason(JsonField.of("REFUND_NOT_PROCESSED"))

            val RECURRING_TRANSACTION_NOT_CANCELLED =
                Reason(JsonField.of("RECURRING_TRANSACTION_NOT_CANCELLED"))

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
            REFUND_NOT_PROCESSED,
            RECURRING_TRANSACTION_NOT_CANCELLED,
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
            REFUND_NOT_PROCESSED,
            RECURRING_TRANSACTION_NOT_CANCELLED,
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
                REFUND_NOT_PROCESSED -> Value.REFUND_NOT_PROCESSED
                RECURRING_TRANSACTION_NOT_CANCELLED -> Value.RECURRING_TRANSACTION_NOT_CANCELLED
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
                REFUND_NOT_PROCESSED -> Known.REFUND_NOT_PROCESSED
                RECURRING_TRANSACTION_NOT_CANCELLED -> Known.RECURRING_TRANSACTION_NOT_CANCELLED
                else -> throw LithicInvalidDataException("Unknown Reason: $value")
            }

        fun asString(): String = _value().asStringOrThrow()
    }
}
