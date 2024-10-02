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
import com.lithic.api.core.toUnmodifiable
import com.lithic.api.errors.LithicInvalidDataException
import com.lithic.api.models.*
import java.util.Objects

class TransactionSimulateAuthorizationParams
constructor(
    private val amount: Long,
    private val descriptor: String,
    private val pan: String,
    private val mcc: String?,
    private val merchantAcceptorId: String?,
    private val merchantAmount: Long?,
    private val merchantCurrency: String?,
    private val partialApprovalCapable: Boolean?,
    private val status: Status?,
    private val additionalQueryParams: Map<String, List<String>>,
    private val additionalHeaders: Map<String, List<String>>,
    private val additionalBodyProperties: Map<String, JsonValue>,
) {

    fun amount(): Long = amount

    fun descriptor(): String = descriptor

    fun pan(): String = pan

    fun mcc(): String? = mcc

    fun merchantAcceptorId(): String? = merchantAcceptorId

    fun merchantAmount(): Long? = merchantAmount

    fun merchantCurrency(): String? = merchantCurrency

    fun partialApprovalCapable(): Boolean? = partialApprovalCapable

    fun status(): Status? = status

    internal fun getBody(): TransactionSimulateAuthorizationBody {
        return TransactionSimulateAuthorizationBody(
            amount,
            descriptor,
            pan,
            mcc,
            merchantAcceptorId,
            merchantAmount,
            merchantCurrency,
            partialApprovalCapable,
            status,
            additionalBodyProperties,
        )
    }

    internal fun getQueryParams(): Map<String, List<String>> = additionalQueryParams

    internal fun getHeaders(): Map<String, List<String>> = additionalHeaders

    @JsonDeserialize(builder = TransactionSimulateAuthorizationBody.Builder::class)
    @NoAutoDetect
    class TransactionSimulateAuthorizationBody
    internal constructor(
        private val amount: Long?,
        private val descriptor: String?,
        private val pan: String?,
        private val mcc: String?,
        private val merchantAcceptorId: String?,
        private val merchantAmount: Long?,
        private val merchantCurrency: String?,
        private val partialApprovalCapable: Boolean?,
        private val status: Status?,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        /**
         * Amount (in cents) to authorize. For credit authorizations and financial credit
         * authorizations, any value entered will be converted into a negative amount in the
         * simulated transaction. For example, entering 100 in this field will appear as a -100
         * amount in the transaction. For balance inquiries, this field must be set to 0.
         */
        @JsonProperty("amount") fun amount(): Long? = amount

        /** Merchant descriptor. */
        @JsonProperty("descriptor") fun descriptor(): String? = descriptor

        /** Sixteen digit card number. */
        @JsonProperty("pan") fun pan(): String? = pan

        /**
         * Merchant category code for the transaction to be simulated. A four-digit number listed in
         * ISO 18245. Supported merchant category codes can be found
         * [here](https://docs.lithic.com/docs/transactions#merchant-category-codes-mccs).
         */
        @JsonProperty("mcc") fun mcc(): String? = mcc

        /** Unique identifier to identify the payment card acceptor. */
        @JsonProperty("merchant_acceptor_id") fun merchantAcceptorId(): String? = merchantAcceptorId

        /**
         * Amount of the transaction to be simulated in currency specified in merchant_currency,
         * including any acquirer fees.
         */
        @JsonProperty("merchant_amount") fun merchantAmount(): Long? = merchantAmount

        /**
         * 3-digit alphabetic ISO 4217 currency code. Note: Simulator only accepts USD, GBP, EUR and
         * defaults to GBP if another ISO 4217 code is provided
         */
        @JsonProperty("merchant_currency") fun merchantCurrency(): String? = merchantCurrency

        /**
         * Set to true if the terminal is capable of partial approval otherwise false. Partial
         * approval is when part of a transaction is approved and another payment must be used for
         * the remainder.
         */
        @JsonProperty("partial_approval_capable")
        fun partialApprovalCapable(): Boolean? = partialApprovalCapable

        /**
         * Type of event to simulate.
         * - `AUTHORIZATION` is a dual message purchase authorization, meaning a subsequent clearing
         *   step is required to settle the transaction.
         * - `BALANCE_INQUIRY` is a $0 authorization that includes a request for the balance held on
         *   the card, and is most typically seen when a cardholder requests to view a card's
         *   balance at an ATM.
         * - `CREDIT_AUTHORIZATION` is a dual message request from a merchant to authorize a refund
         *   or credit, meaning a subsequent clearing step is required to settle the transaction.
         * - `FINANCIAL_AUTHORIZATION` is a single message request from a merchant to debit funds
         *   immediately (such as an ATM withdrawal), and no subsequent clearing is required to
         *   settle the transaction.
         * - `FINANCIAL_CREDIT_AUTHORIZATION` is a single message request from a merchant to credit
         *   funds immediately, and no subsequent clearing is required to settle the transaction.
         */
        @JsonProperty("status") fun status(): Status? = status

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var amount: Long? = null
            private var descriptor: String? = null
            private var pan: String? = null
            private var mcc: String? = null
            private var merchantAcceptorId: String? = null
            private var merchantAmount: Long? = null
            private var merchantCurrency: String? = null
            private var partialApprovalCapable: Boolean? = null
            private var status: Status? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(
                transactionSimulateAuthorizationBody: TransactionSimulateAuthorizationBody
            ) = apply {
                this.amount = transactionSimulateAuthorizationBody.amount
                this.descriptor = transactionSimulateAuthorizationBody.descriptor
                this.pan = transactionSimulateAuthorizationBody.pan
                this.mcc = transactionSimulateAuthorizationBody.mcc
                this.merchantAcceptorId = transactionSimulateAuthorizationBody.merchantAcceptorId
                this.merchantAmount = transactionSimulateAuthorizationBody.merchantAmount
                this.merchantCurrency = transactionSimulateAuthorizationBody.merchantCurrency
                this.partialApprovalCapable =
                    transactionSimulateAuthorizationBody.partialApprovalCapable
                this.status = transactionSimulateAuthorizationBody.status
                additionalProperties(transactionSimulateAuthorizationBody.additionalProperties)
            }

            /**
             * Amount (in cents) to authorize. For credit authorizations and financial credit
             * authorizations, any value entered will be converted into a negative amount in the
             * simulated transaction. For example, entering 100 in this field will appear as a -100
             * amount in the transaction. For balance inquiries, this field must be set to 0.
             */
            @JsonProperty("amount") fun amount(amount: Long) = apply { this.amount = amount }

            /** Merchant descriptor. */
            @JsonProperty("descriptor")
            fun descriptor(descriptor: String) = apply { this.descriptor = descriptor }

            /** Sixteen digit card number. */
            @JsonProperty("pan") fun pan(pan: String) = apply { this.pan = pan }

            /**
             * Merchant category code for the transaction to be simulated. A four-digit number
             * listed in ISO 18245. Supported merchant category codes can be found
             * [here](https://docs.lithic.com/docs/transactions#merchant-category-codes-mccs).
             */
            @JsonProperty("mcc") fun mcc(mcc: String) = apply { this.mcc = mcc }

            /** Unique identifier to identify the payment card acceptor. */
            @JsonProperty("merchant_acceptor_id")
            fun merchantAcceptorId(merchantAcceptorId: String) = apply {
                this.merchantAcceptorId = merchantAcceptorId
            }

            /**
             * Amount of the transaction to be simulated in currency specified in merchant_currency,
             * including any acquirer fees.
             */
            @JsonProperty("merchant_amount")
            fun merchantAmount(merchantAmount: Long) = apply {
                this.merchantAmount = merchantAmount
            }

            /**
             * 3-digit alphabetic ISO 4217 currency code. Note: Simulator only accepts USD, GBP, EUR
             * and defaults to GBP if another ISO 4217 code is provided
             */
            @JsonProperty("merchant_currency")
            fun merchantCurrency(merchantCurrency: String) = apply {
                this.merchantCurrency = merchantCurrency
            }

            /**
             * Set to true if the terminal is capable of partial approval otherwise false. Partial
             * approval is when part of a transaction is approved and another payment must be used
             * for the remainder.
             */
            @JsonProperty("partial_approval_capable")
            fun partialApprovalCapable(partialApprovalCapable: Boolean) = apply {
                this.partialApprovalCapable = partialApprovalCapable
            }

            /**
             * Type of event to simulate.
             * - `AUTHORIZATION` is a dual message purchase authorization, meaning a subsequent
             *   clearing step is required to settle the transaction.
             * - `BALANCE_INQUIRY` is a $0 authorization that includes a request for the balance
             *   held on the card, and is most typically seen when a cardholder requests to view a
             *   card's balance at an ATM.
             * - `CREDIT_AUTHORIZATION` is a dual message request from a merchant to authorize a
             *   refund or credit, meaning a subsequent clearing step is required to settle the
             *   transaction.
             * - `FINANCIAL_AUTHORIZATION` is a single message request from a merchant to debit
             *   funds immediately (such as an ATM withdrawal), and no subsequent clearing is
             *   required to settle the transaction.
             * - `FINANCIAL_CREDIT_AUTHORIZATION` is a single message request from a merchant to
             *   credit funds immediately, and no subsequent clearing is required to settle the
             *   transaction.
             */
            @JsonProperty("status") fun status(status: Status) = apply { this.status = status }

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

            fun build(): TransactionSimulateAuthorizationBody =
                TransactionSimulateAuthorizationBody(
                    checkNotNull(amount) { "`amount` is required but was not set" },
                    checkNotNull(descriptor) { "`descriptor` is required but was not set" },
                    checkNotNull(pan) { "`pan` is required but was not set" },
                    mcc,
                    merchantAcceptorId,
                    merchantAmount,
                    merchantCurrency,
                    partialApprovalCapable,
                    status,
                    additionalProperties.toUnmodifiable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is TransactionSimulateAuthorizationBody &&
                this.amount == other.amount &&
                this.descriptor == other.descriptor &&
                this.pan == other.pan &&
                this.mcc == other.mcc &&
                this.merchantAcceptorId == other.merchantAcceptorId &&
                this.merchantAmount == other.merchantAmount &&
                this.merchantCurrency == other.merchantCurrency &&
                this.partialApprovalCapable == other.partialApprovalCapable &&
                this.status == other.status &&
                this.additionalProperties == other.additionalProperties
        }

        private var hashCode: Int = 0

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode =
                    Objects.hash(
                        amount,
                        descriptor,
                        pan,
                        mcc,
                        merchantAcceptorId,
                        merchantAmount,
                        merchantCurrency,
                        partialApprovalCapable,
                        status,
                        additionalProperties,
                    )
            }
            return hashCode
        }

        override fun toString() =
            "TransactionSimulateAuthorizationBody{amount=$amount, descriptor=$descriptor, pan=$pan, mcc=$mcc, merchantAcceptorId=$merchantAcceptorId, merchantAmount=$merchantAmount, merchantCurrency=$merchantCurrency, partialApprovalCapable=$partialApprovalCapable, status=$status, additionalProperties=$additionalProperties}"
    }

    fun _additionalQueryParams(): Map<String, List<String>> = additionalQueryParams

    fun _additionalHeaders(): Map<String, List<String>> = additionalHeaders

    fun _additionalBodyProperties(): Map<String, JsonValue> = additionalBodyProperties

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is TransactionSimulateAuthorizationParams &&
            this.amount == other.amount &&
            this.descriptor == other.descriptor &&
            this.pan == other.pan &&
            this.mcc == other.mcc &&
            this.merchantAcceptorId == other.merchantAcceptorId &&
            this.merchantAmount == other.merchantAmount &&
            this.merchantCurrency == other.merchantCurrency &&
            this.partialApprovalCapable == other.partialApprovalCapable &&
            this.status == other.status &&
            this.additionalQueryParams == other.additionalQueryParams &&
            this.additionalHeaders == other.additionalHeaders &&
            this.additionalBodyProperties == other.additionalBodyProperties
    }

    override fun hashCode(): Int {
        return Objects.hash(
            amount,
            descriptor,
            pan,
            mcc,
            merchantAcceptorId,
            merchantAmount,
            merchantCurrency,
            partialApprovalCapable,
            status,
            additionalQueryParams,
            additionalHeaders,
            additionalBodyProperties,
        )
    }

    override fun toString() =
        "TransactionSimulateAuthorizationParams{amount=$amount, descriptor=$descriptor, pan=$pan, mcc=$mcc, merchantAcceptorId=$merchantAcceptorId, merchantAmount=$merchantAmount, merchantCurrency=$merchantCurrency, partialApprovalCapable=$partialApprovalCapable, status=$status, additionalQueryParams=$additionalQueryParams, additionalHeaders=$additionalHeaders, additionalBodyProperties=$additionalBodyProperties}"

    fun toBuilder() = Builder().from(this)

    companion object {

        fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var amount: Long? = null
        private var descriptor: String? = null
        private var pan: String? = null
        private var mcc: String? = null
        private var merchantAcceptorId: String? = null
        private var merchantAmount: Long? = null
        private var merchantCurrency: String? = null
        private var partialApprovalCapable: Boolean? = null
        private var status: Status? = null
        private var additionalQueryParams: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalHeaders: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalBodyProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(
            transactionSimulateAuthorizationParams: TransactionSimulateAuthorizationParams
        ) = apply {
            this.amount = transactionSimulateAuthorizationParams.amount
            this.descriptor = transactionSimulateAuthorizationParams.descriptor
            this.pan = transactionSimulateAuthorizationParams.pan
            this.mcc = transactionSimulateAuthorizationParams.mcc
            this.merchantAcceptorId = transactionSimulateAuthorizationParams.merchantAcceptorId
            this.merchantAmount = transactionSimulateAuthorizationParams.merchantAmount
            this.merchantCurrency = transactionSimulateAuthorizationParams.merchantCurrency
            this.partialApprovalCapable =
                transactionSimulateAuthorizationParams.partialApprovalCapable
            this.status = transactionSimulateAuthorizationParams.status
            additionalQueryParams(transactionSimulateAuthorizationParams.additionalQueryParams)
            additionalHeaders(transactionSimulateAuthorizationParams.additionalHeaders)
            additionalBodyProperties(
                transactionSimulateAuthorizationParams.additionalBodyProperties
            )
        }

        /**
         * Amount (in cents) to authorize. For credit authorizations and financial credit
         * authorizations, any value entered will be converted into a negative amount in the
         * simulated transaction. For example, entering 100 in this field will appear as a -100
         * amount in the transaction. For balance inquiries, this field must be set to 0.
         */
        fun amount(amount: Long) = apply { this.amount = amount }

        /** Merchant descriptor. */
        fun descriptor(descriptor: String) = apply { this.descriptor = descriptor }

        /** Sixteen digit card number. */
        fun pan(pan: String) = apply { this.pan = pan }

        /**
         * Merchant category code for the transaction to be simulated. A four-digit number listed in
         * ISO 18245. Supported merchant category codes can be found
         * [here](https://docs.lithic.com/docs/transactions#merchant-category-codes-mccs).
         */
        fun mcc(mcc: String) = apply { this.mcc = mcc }

        /** Unique identifier to identify the payment card acceptor. */
        fun merchantAcceptorId(merchantAcceptorId: String) = apply {
            this.merchantAcceptorId = merchantAcceptorId
        }

        /**
         * Amount of the transaction to be simulated in currency specified in merchant_currency,
         * including any acquirer fees.
         */
        fun merchantAmount(merchantAmount: Long) = apply { this.merchantAmount = merchantAmount }

        /**
         * 3-digit alphabetic ISO 4217 currency code. Note: Simulator only accepts USD, GBP, EUR and
         * defaults to GBP if another ISO 4217 code is provided
         */
        fun merchantCurrency(merchantCurrency: String) = apply {
            this.merchantCurrency = merchantCurrency
        }

        /**
         * Set to true if the terminal is capable of partial approval otherwise false. Partial
         * approval is when part of a transaction is approved and another payment must be used for
         * the remainder.
         */
        fun partialApprovalCapable(partialApprovalCapable: Boolean) = apply {
            this.partialApprovalCapable = partialApprovalCapable
        }

        /**
         * Type of event to simulate.
         * - `AUTHORIZATION` is a dual message purchase authorization, meaning a subsequent clearing
         *   step is required to settle the transaction.
         * - `BALANCE_INQUIRY` is a $0 authorization that includes a request for the balance held on
         *   the card, and is most typically seen when a cardholder requests to view a card's
         *   balance at an ATM.
         * - `CREDIT_AUTHORIZATION` is a dual message request from a merchant to authorize a refund
         *   or credit, meaning a subsequent clearing step is required to settle the transaction.
         * - `FINANCIAL_AUTHORIZATION` is a single message request from a merchant to debit funds
         *   immediately (such as an ATM withdrawal), and no subsequent clearing is required to
         *   settle the transaction.
         * - `FINANCIAL_CREDIT_AUTHORIZATION` is a single message request from a merchant to credit
         *   funds immediately, and no subsequent clearing is required to settle the transaction.
         */
        fun status(status: Status) = apply { this.status = status }

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

        fun build(): TransactionSimulateAuthorizationParams =
            TransactionSimulateAuthorizationParams(
                checkNotNull(amount) { "`amount` is required but was not set" },
                checkNotNull(descriptor) { "`descriptor` is required but was not set" },
                checkNotNull(pan) { "`pan` is required but was not set" },
                mcc,
                merchantAcceptorId,
                merchantAmount,
                merchantCurrency,
                partialApprovalCapable,
                status,
                additionalQueryParams.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
                additionalHeaders.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
                additionalBodyProperties.toUnmodifiable(),
            )
    }

    class Status
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Status && this.value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()

        companion object {

            val AUTHORIZATION = Status(JsonField.of("AUTHORIZATION"))

            val BALANCE_INQUIRY = Status(JsonField.of("BALANCE_INQUIRY"))

            val CREDIT_AUTHORIZATION = Status(JsonField.of("CREDIT_AUTHORIZATION"))

            val FINANCIAL_AUTHORIZATION = Status(JsonField.of("FINANCIAL_AUTHORIZATION"))

            val FINANCIAL_CREDIT_AUTHORIZATION =
                Status(JsonField.of("FINANCIAL_CREDIT_AUTHORIZATION"))

            fun of(value: String) = Status(JsonField.of(value))
        }

        enum class Known {
            AUTHORIZATION,
            BALANCE_INQUIRY,
            CREDIT_AUTHORIZATION,
            FINANCIAL_AUTHORIZATION,
            FINANCIAL_CREDIT_AUTHORIZATION,
        }

        enum class Value {
            AUTHORIZATION,
            BALANCE_INQUIRY,
            CREDIT_AUTHORIZATION,
            FINANCIAL_AUTHORIZATION,
            FINANCIAL_CREDIT_AUTHORIZATION,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                AUTHORIZATION -> Value.AUTHORIZATION
                BALANCE_INQUIRY -> Value.BALANCE_INQUIRY
                CREDIT_AUTHORIZATION -> Value.CREDIT_AUTHORIZATION
                FINANCIAL_AUTHORIZATION -> Value.FINANCIAL_AUTHORIZATION
                FINANCIAL_CREDIT_AUTHORIZATION -> Value.FINANCIAL_CREDIT_AUTHORIZATION
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                AUTHORIZATION -> Known.AUTHORIZATION
                BALANCE_INQUIRY -> Known.BALANCE_INQUIRY
                CREDIT_AUTHORIZATION -> Known.CREDIT_AUTHORIZATION
                FINANCIAL_AUTHORIZATION -> Known.FINANCIAL_AUTHORIZATION
                FINANCIAL_CREDIT_AUTHORIZATION -> Known.FINANCIAL_CREDIT_AUTHORIZATION
                else -> throw LithicInvalidDataException("Unknown Status: $value")
            }

        fun asString(): String = _value().asStringOrThrow()
    }
}
