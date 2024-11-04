// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.google.common.collect.ArrayListMultimap
import com.google.common.collect.ListMultimap
import com.lithic.api.core.Enum
import com.lithic.api.core.ExcludeMissing
import com.lithic.api.core.JsonField
import com.lithic.api.core.JsonValue
import com.lithic.api.core.NoAutoDetect
import com.lithic.api.core.toImmutable
import com.lithic.api.errors.LithicInvalidDataException
import com.lithic.api.models.*
import java.util.Objects

class PaymentSimulateReceiptParams
constructor(
    private val token: String,
    private val amount: Long,
    private val financialAccountToken: String,
    private val receiptType: ReceiptType,
    private val memo: String?,
    private val additionalHeaders: Map<String, List<String>>,
    private val additionalQueryParams: Map<String, List<String>>,
    private val additionalBodyProperties: Map<String, JsonValue>,
) {

    fun token(): String = token

    fun amount(): Long = amount

    fun financialAccountToken(): String = financialAccountToken

    fun receiptType(): ReceiptType = receiptType

    fun memo(): String? = memo

    internal fun getBody(): PaymentSimulateReceiptBody {
        return PaymentSimulateReceiptBody(
            token,
            amount,
            financialAccountToken,
            receiptType,
            memo,
            additionalBodyProperties,
        )
    }

    internal fun getHeaders(): Map<String, List<String>> = additionalHeaders

    internal fun getQueryParams(): Map<String, List<String>> = additionalQueryParams

    @JsonDeserialize(builder = PaymentSimulateReceiptBody.Builder::class)
    @NoAutoDetect
    class PaymentSimulateReceiptBody
    internal constructor(
        private val token: String?,
        private val amount: Long?,
        private val financialAccountToken: String?,
        private val receiptType: ReceiptType?,
        private val memo: String?,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        /** Payment token */
        @JsonProperty("token") fun token(): String? = token

        /** Amount */
        @JsonProperty("amount") fun amount(): Long? = amount

        /** Financial Account Token */
        @JsonProperty("financial_account_token")
        fun financialAccountToken(): String? = financialAccountToken

        /** Receipt Type */
        @JsonProperty("receipt_type") fun receiptType(): ReceiptType? = receiptType

        /** Memo */
        @JsonProperty("memo") fun memo(): String? = memo

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var token: String? = null
            private var amount: Long? = null
            private var financialAccountToken: String? = null
            private var receiptType: ReceiptType? = null
            private var memo: String? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(paymentSimulateReceiptBody: PaymentSimulateReceiptBody) = apply {
                this.token = paymentSimulateReceiptBody.token
                this.amount = paymentSimulateReceiptBody.amount
                this.financialAccountToken = paymentSimulateReceiptBody.financialAccountToken
                this.receiptType = paymentSimulateReceiptBody.receiptType
                this.memo = paymentSimulateReceiptBody.memo
                additionalProperties(paymentSimulateReceiptBody.additionalProperties)
            }

            /** Payment token */
            @JsonProperty("token") fun token(token: String) = apply { this.token = token }

            /** Amount */
            @JsonProperty("amount") fun amount(amount: Long) = apply { this.amount = amount }

            /** Financial Account Token */
            @JsonProperty("financial_account_token")
            fun financialAccountToken(financialAccountToken: String) = apply {
                this.financialAccountToken = financialAccountToken
            }

            /** Receipt Type */
            @JsonProperty("receipt_type")
            fun receiptType(receiptType: ReceiptType) = apply { this.receiptType = receiptType }

            /** Memo */
            @JsonProperty("memo") fun memo(memo: String) = apply { this.memo = memo }

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

            fun build(): PaymentSimulateReceiptBody =
                PaymentSimulateReceiptBody(
                    checkNotNull(token) { "`token` is required but was not set" },
                    checkNotNull(amount) { "`amount` is required but was not set" },
                    checkNotNull(financialAccountToken) {
                        "`financialAccountToken` is required but was not set"
                    },
                    checkNotNull(receiptType) { "`receiptType` is required but was not set" },
                    memo,
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is PaymentSimulateReceiptBody && this.token == other.token && this.amount == other.amount && this.financialAccountToken == other.financialAccountToken && this.receiptType == other.receiptType && this.memo == other.memo && this.additionalProperties == other.additionalProperties /* spotless:on */
        }

        private var hashCode: Int = 0

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode = /* spotless:off */ Objects.hash(token, amount, financialAccountToken, receiptType, memo, additionalProperties) /* spotless:on */
            }
            return hashCode
        }

        override fun toString() =
            "PaymentSimulateReceiptBody{token=$token, amount=$amount, financialAccountToken=$financialAccountToken, receiptType=$receiptType, memo=$memo, additionalProperties=$additionalProperties}"
    }

    fun _additionalHeaders(): Map<String, List<String>> = additionalHeaders

    fun _additionalQueryParams(): Map<String, List<String>> = additionalQueryParams

    fun _additionalBodyProperties(): Map<String, JsonValue> = additionalBodyProperties

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is PaymentSimulateReceiptParams && this.token == other.token && this.amount == other.amount && this.financialAccountToken == other.financialAccountToken && this.receiptType == other.receiptType && this.memo == other.memo && this.additionalHeaders == other.additionalHeaders && this.additionalQueryParams == other.additionalQueryParams && this.additionalBodyProperties == other.additionalBodyProperties /* spotless:on */
    }

    override fun hashCode(): Int {
        return /* spotless:off */ Objects.hash(token, amount, financialAccountToken, receiptType, memo, additionalHeaders, additionalQueryParams, additionalBodyProperties) /* spotless:on */
    }

    override fun toString() =
        "PaymentSimulateReceiptParams{token=$token, amount=$amount, financialAccountToken=$financialAccountToken, receiptType=$receiptType, memo=$memo, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams, additionalBodyProperties=$additionalBodyProperties}"

    fun toBuilder() = Builder().from(this)

    companion object {

        fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var token: String? = null
        private var amount: Long? = null
        private var financialAccountToken: String? = null
        private var receiptType: ReceiptType? = null
        private var memo: String? = null
        private var additionalHeaders: ListMultimap<String, String> = ArrayListMultimap.create()
        private var additionalQueryParams: ListMultimap<String, String> = ArrayListMultimap.create()
        private var additionalBodyProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(paymentSimulateReceiptParams: PaymentSimulateReceiptParams) = apply {
            this.token = paymentSimulateReceiptParams.token
            this.amount = paymentSimulateReceiptParams.amount
            this.financialAccountToken = paymentSimulateReceiptParams.financialAccountToken
            this.receiptType = paymentSimulateReceiptParams.receiptType
            this.memo = paymentSimulateReceiptParams.memo
            additionalHeaders(paymentSimulateReceiptParams.additionalHeaders)
            additionalQueryParams(paymentSimulateReceiptParams.additionalQueryParams)
            additionalBodyProperties(paymentSimulateReceiptParams.additionalBodyProperties)
        }

        /** Payment token */
        fun token(token: String) = apply { this.token = token }

        /** Amount */
        fun amount(amount: Long) = apply { this.amount = amount }

        /** Financial Account Token */
        fun financialAccountToken(financialAccountToken: String) = apply {
            this.financialAccountToken = financialAccountToken
        }

        /** Receipt Type */
        fun receiptType(receiptType: ReceiptType) = apply { this.receiptType = receiptType }

        /** Memo */
        fun memo(memo: String) = apply { this.memo = memo }

        fun additionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun putAdditionalHeader(name: String, value: String) = apply {
            additionalHeaders.put(name, value)
        }

        fun putAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.putAll(name, values)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            additionalHeaders.forEach(::putAdditionalHeaders)
        }

        fun replaceAdditionalHeaders(name: String, value: String) = apply {
            additionalHeaders.replaceValues(name, listOf(value))
        }

        fun replaceAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.replaceValues(name, values)
        }

        fun replaceAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            additionalHeaders.forEach(::replaceAdditionalHeaders)
        }

        fun removeAdditionalHeaders(name: String) = apply { additionalHeaders.removeAll(name) }

        fun removeAllAdditionalHeaders(names: Set<String>) = apply {
            names.forEach(::removeAdditionalHeaders)
        }

        fun additionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun putAdditionalQueryParam(key: String, value: String) = apply {
            additionalQueryParams.put(key, value)
        }

        fun putAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.putAll(key, values)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                additionalQueryParams.forEach(::putAdditionalQueryParams)
            }

        fun replaceAdditionalQueryParams(key: String, value: String) = apply {
            additionalQueryParams.replaceValues(key, listOf(value))
        }

        fun replaceAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.replaceValues(key, values)
        }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                additionalQueryParams.forEach(::replaceAdditionalQueryParams)
            }

        fun removeAdditionalQueryParams(key: String) = apply {
            additionalQueryParams.removeAll(key)
        }

        fun removeAllAdditionalQueryParams(keys: Set<String>) = apply {
            keys.forEach(::removeAdditionalQueryParams)
        }

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

        fun build(): PaymentSimulateReceiptParams =
            PaymentSimulateReceiptParams(
                checkNotNull(token) { "`token` is required but was not set" },
                checkNotNull(amount) { "`amount` is required but was not set" },
                checkNotNull(financialAccountToken) {
                    "`financialAccountToken` is required but was not set"
                },
                checkNotNull(receiptType) { "`receiptType` is required but was not set" },
                memo,
                additionalHeaders
                    .asMap()
                    .mapValues { it.value.toList().toImmutable() }
                    .toImmutable(),
                additionalQueryParams
                    .asMap()
                    .mapValues { it.value.toList().toImmutable() }
                    .toImmutable(),
                additionalBodyProperties.toImmutable(),
            )
    }

    class ReceiptType
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is ReceiptType && this.value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()

        companion object {

            val RECEIPT_CREDIT = ReceiptType(JsonField.of("RECEIPT_CREDIT"))

            val RECEIPT_DEBIT = ReceiptType(JsonField.of("RECEIPT_DEBIT"))

            fun of(value: String) = ReceiptType(JsonField.of(value))
        }

        enum class Known {
            RECEIPT_CREDIT,
            RECEIPT_DEBIT,
        }

        enum class Value {
            RECEIPT_CREDIT,
            RECEIPT_DEBIT,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                RECEIPT_CREDIT -> Value.RECEIPT_CREDIT
                RECEIPT_DEBIT -> Value.RECEIPT_DEBIT
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                RECEIPT_CREDIT -> Known.RECEIPT_CREDIT
                RECEIPT_DEBIT -> Known.RECEIPT_DEBIT
                else -> throw LithicInvalidDataException("Unknown ReceiptType: $value")
            }

        fun asString(): String = _value().asStringOrThrow()
    }
}
