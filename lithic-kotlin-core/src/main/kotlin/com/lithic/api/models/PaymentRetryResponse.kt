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
import java.time.OffsetDateTime
import java.util.Objects

@NoAutoDetect
class PaymentRetryResponse
@JsonCreator
private constructor(
    @JsonProperty("token") @ExcludeMissing private val token: JsonField<String> = JsonMissing.of(),
    @JsonProperty("category")
    @ExcludeMissing
    private val category: JsonField<Payment.Category> = JsonMissing.of(),
    @JsonProperty("created")
    @ExcludeMissing
    private val created: JsonField<OffsetDateTime> = JsonMissing.of(),
    @JsonProperty("currency")
    @ExcludeMissing
    private val currency: JsonField<String> = JsonMissing.of(),
    @JsonProperty("descriptor")
    @ExcludeMissing
    private val descriptor: JsonField<String> = JsonMissing.of(),
    @JsonProperty("direction")
    @ExcludeMissing
    private val direction: JsonField<Payment.Direction> = JsonMissing.of(),
    @JsonProperty("events")
    @ExcludeMissing
    private val events: JsonField<List<Payment.PaymentEvent>> = JsonMissing.of(),
    @JsonProperty("external_bank_account_token")
    @ExcludeMissing
    private val externalBankAccountToken: JsonField<String> = JsonMissing.of(),
    @JsonProperty("financial_account_token")
    @ExcludeMissing
    private val financialAccountToken: JsonField<String> = JsonMissing.of(),
    @JsonProperty("method")
    @ExcludeMissing
    private val method: JsonField<Payment.Method> = JsonMissing.of(),
    @JsonProperty("method_attributes")
    @ExcludeMissing
    private val methodAttributes: JsonField<Payment.PaymentMethodAttributes> = JsonMissing.of(),
    @JsonProperty("pending_amount")
    @ExcludeMissing
    private val pendingAmount: JsonField<Long> = JsonMissing.of(),
    @JsonProperty("result")
    @ExcludeMissing
    private val result: JsonField<Payment.Result> = JsonMissing.of(),
    @JsonProperty("settled_amount")
    @ExcludeMissing
    private val settledAmount: JsonField<Long> = JsonMissing.of(),
    @JsonProperty("source")
    @ExcludeMissing
    private val source: JsonField<Payment.Source> = JsonMissing.of(),
    @JsonProperty("status")
    @ExcludeMissing
    private val status: JsonField<Payment.Status> = JsonMissing.of(),
    @JsonProperty("updated")
    @ExcludeMissing
    private val updated: JsonField<OffsetDateTime> = JsonMissing.of(),
    @JsonProperty("user_defined_id")
    @ExcludeMissing
    private val userDefinedId: JsonField<String> = JsonMissing.of(),
    @JsonProperty("balance")
    @ExcludeMissing
    private val balance: JsonField<Balance> = JsonMissing.of(),
    @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
) {

    /** Globally unique identifier. */
    fun token(): String = token.getRequired("token")

    /** Payment category */
    fun category(): Payment.Category = category.getRequired("category")

    /** Date and time when the payment first occurred. UTC time zone. */
    fun created(): OffsetDateTime = created.getRequired("created")

    /** 3-digit alphabetic ISO 4217 code for the settling currency of the payment. */
    fun currency(): String = currency.getRequired("currency")

    /** A string that provides a description of the payment; may be useful to display to users. */
    fun descriptor(): String = descriptor.getRequired("descriptor")

    fun direction(): Payment.Direction = direction.getRequired("direction")

    /** A list of all payment events that have modified this payment. */
    fun events(): List<Payment.PaymentEvent> = events.getRequired("events")

    fun externalBankAccountToken(): String? =
        externalBankAccountToken.getNullable("external_bank_account_token")

    fun financialAccountToken(): String =
        financialAccountToken.getRequired("financial_account_token")

    fun method(): Payment.Method = method.getRequired("method")

    fun methodAttributes(): Payment.PaymentMethodAttributes =
        methodAttributes.getRequired("method_attributes")

    /**
     * Pending amount of the payment in the currency's smallest unit (e.g., cents). The value of
     * this field will go to zero over time once the payment is settled.
     */
    fun pendingAmount(): Long = pendingAmount.getRequired("pending_amount")

    /**
     * APPROVED payments were successful while DECLINED payments were declined by Lithic or
     * returned.
     */
    fun result(): Payment.Result = result.getRequired("result")

    /**
     * Amount of the payment that has been settled in the currency's smallest unit (e.g., cents).
     */
    fun settledAmount(): Long = settledAmount.getRequired("settled_amount")

    fun source(): Payment.Source = source.getRequired("source")

    /**
     * Status types:
     * - `DECLINED` - The payment was declined.
     * - `PENDING` - The payment is being processed and has yet to settle or release (origination
     *   debit).
     * - `RETURNED` - The payment has been returned.
     * - `SETTLED` - The payment is completed.
     */
    fun status(): Payment.Status = status.getRequired("status")

    /** Date and time when the financial transaction was last updated. UTC time zone. */
    fun updated(): OffsetDateTime = updated.getRequired("updated")

    fun userDefinedId(): String? = userDefinedId.getNullable("user_defined_id")

    /** Balance */
    fun balance(): Balance? = balance.getNullable("balance")

    /** Globally unique identifier. */
    @JsonProperty("token") @ExcludeMissing fun _token() = token

    /** Payment category */
    @JsonProperty("category") @ExcludeMissing fun _category() = category

    /** Date and time when the payment first occurred. UTC time zone. */
    @JsonProperty("created") @ExcludeMissing fun _created() = created

    /** 3-digit alphabetic ISO 4217 code for the settling currency of the payment. */
    @JsonProperty("currency") @ExcludeMissing fun _currency() = currency

    /** A string that provides a description of the payment; may be useful to display to users. */
    @JsonProperty("descriptor") @ExcludeMissing fun _descriptor() = descriptor

    @JsonProperty("direction") @ExcludeMissing fun _direction() = direction

    /** A list of all payment events that have modified this payment. */
    @JsonProperty("events") @ExcludeMissing fun _events() = events

    @JsonProperty("external_bank_account_token")
    @ExcludeMissing
    fun _externalBankAccountToken() = externalBankAccountToken

    @JsonProperty("financial_account_token")
    @ExcludeMissing
    fun _financialAccountToken() = financialAccountToken

    @JsonProperty("method") @ExcludeMissing fun _method() = method

    @JsonProperty("method_attributes") @ExcludeMissing fun _methodAttributes() = methodAttributes

    /**
     * Pending amount of the payment in the currency's smallest unit (e.g., cents). The value of
     * this field will go to zero over time once the payment is settled.
     */
    @JsonProperty("pending_amount") @ExcludeMissing fun _pendingAmount() = pendingAmount

    /**
     * APPROVED payments were successful while DECLINED payments were declined by Lithic or
     * returned.
     */
    @JsonProperty("result") @ExcludeMissing fun _result() = result

    /**
     * Amount of the payment that has been settled in the currency's smallest unit (e.g., cents).
     */
    @JsonProperty("settled_amount") @ExcludeMissing fun _settledAmount() = settledAmount

    @JsonProperty("source") @ExcludeMissing fun _source() = source

    /**
     * Status types:
     * - `DECLINED` - The payment was declined.
     * - `PENDING` - The payment is being processed and has yet to settle or release (origination
     *   debit).
     * - `RETURNED` - The payment has been returned.
     * - `SETTLED` - The payment is completed.
     */
    @JsonProperty("status") @ExcludeMissing fun _status() = status

    /** Date and time when the financial transaction was last updated. UTC time zone. */
    @JsonProperty("updated") @ExcludeMissing fun _updated() = updated

    @JsonProperty("user_defined_id") @ExcludeMissing fun _userDefinedId() = userDefinedId

    /** Balance */
    @JsonProperty("balance") @ExcludeMissing fun _balance() = balance

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    fun toPayment(): Payment =
        Payment.builder()
            .token(token)
            .category(category)
            .created(created)
            .currency(currency)
            .descriptor(descriptor)
            .direction(direction)
            .events(events)
            .externalBankAccountToken(externalBankAccountToken)
            .financialAccountToken(financialAccountToken)
            .method(method)
            .methodAttributes(methodAttributes)
            .pendingAmount(pendingAmount)
            .result(result)
            .settledAmount(settledAmount)
            .source(source)
            .status(status)
            .updated(updated)
            .userDefinedId(userDefinedId)
            .build()

    private var validated: Boolean = false

    fun validate(): PaymentRetryResponse = apply {
        if (!validated) {
            token()
            category()
            created()
            currency()
            descriptor()
            direction()
            events().forEach { it.validate() }
            externalBankAccountToken()
            financialAccountToken()
            method()
            methodAttributes().validate()
            pendingAmount()
            result()
            settledAmount()
            source()
            status()
            updated()
            userDefinedId()
            balance()?.validate()
            validated = true
        }
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        fun builder() = Builder()
    }

    class Builder {

        private var token: JsonField<String> = JsonMissing.of()
        private var category: JsonField<Payment.Category> = JsonMissing.of()
        private var created: JsonField<OffsetDateTime> = JsonMissing.of()
        private var currency: JsonField<String> = JsonMissing.of()
        private var descriptor: JsonField<String> = JsonMissing.of()
        private var direction: JsonField<Payment.Direction> = JsonMissing.of()
        private var events: JsonField<List<Payment.PaymentEvent>> = JsonMissing.of()
        private var externalBankAccountToken: JsonField<String> = JsonMissing.of()
        private var financialAccountToken: JsonField<String> = JsonMissing.of()
        private var method: JsonField<Payment.Method> = JsonMissing.of()
        private var methodAttributes: JsonField<Payment.PaymentMethodAttributes> = JsonMissing.of()
        private var pendingAmount: JsonField<Long> = JsonMissing.of()
        private var result: JsonField<Payment.Result> = JsonMissing.of()
        private var settledAmount: JsonField<Long> = JsonMissing.of()
        private var source: JsonField<Payment.Source> = JsonMissing.of()
        private var status: JsonField<Payment.Status> = JsonMissing.of()
        private var updated: JsonField<OffsetDateTime> = JsonMissing.of()
        private var userDefinedId: JsonField<String> = JsonMissing.of()
        private var balance: JsonField<Balance> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(paymentRetryResponse: PaymentRetryResponse) = apply {
            token = paymentRetryResponse.token
            category = paymentRetryResponse.category
            created = paymentRetryResponse.created
            currency = paymentRetryResponse.currency
            descriptor = paymentRetryResponse.descriptor
            direction = paymentRetryResponse.direction
            events = paymentRetryResponse.events
            externalBankAccountToken = paymentRetryResponse.externalBankAccountToken
            financialAccountToken = paymentRetryResponse.financialAccountToken
            method = paymentRetryResponse.method
            methodAttributes = paymentRetryResponse.methodAttributes
            pendingAmount = paymentRetryResponse.pendingAmount
            result = paymentRetryResponse.result
            settledAmount = paymentRetryResponse.settledAmount
            source = paymentRetryResponse.source
            status = paymentRetryResponse.status
            updated = paymentRetryResponse.updated
            userDefinedId = paymentRetryResponse.userDefinedId
            balance = paymentRetryResponse.balance
            additionalProperties = paymentRetryResponse.additionalProperties.toMutableMap()
        }

        /** Globally unique identifier. */
        fun token(token: String) = token(JsonField.of(token))

        /** Globally unique identifier. */
        fun token(token: JsonField<String>) = apply { this.token = token }

        /** Payment category */
        fun category(category: Payment.Category) = category(JsonField.of(category))

        /** Payment category */
        fun category(category: JsonField<Payment.Category>) = apply { this.category = category }

        /** Date and time when the payment first occurred. UTC time zone. */
        fun created(created: OffsetDateTime) = created(JsonField.of(created))

        /** Date and time when the payment first occurred. UTC time zone. */
        fun created(created: JsonField<OffsetDateTime>) = apply { this.created = created }

        /** 3-digit alphabetic ISO 4217 code for the settling currency of the payment. */
        fun currency(currency: String) = currency(JsonField.of(currency))

        /** 3-digit alphabetic ISO 4217 code for the settling currency of the payment. */
        fun currency(currency: JsonField<String>) = apply { this.currency = currency }

        /**
         * A string that provides a description of the payment; may be useful to display to users.
         */
        fun descriptor(descriptor: String) = descriptor(JsonField.of(descriptor))

        /**
         * A string that provides a description of the payment; may be useful to display to users.
         */
        fun descriptor(descriptor: JsonField<String>) = apply { this.descriptor = descriptor }

        fun direction(direction: Payment.Direction) = direction(JsonField.of(direction))

        fun direction(direction: JsonField<Payment.Direction>) = apply {
            this.direction = direction
        }

        /** A list of all payment events that have modified this payment. */
        fun events(events: List<Payment.PaymentEvent>) = events(JsonField.of(events))

        /** A list of all payment events that have modified this payment. */
        fun events(events: JsonField<List<Payment.PaymentEvent>>) = apply { this.events = events }

        fun externalBankAccountToken(externalBankAccountToken: String) =
            externalBankAccountToken(JsonField.of(externalBankAccountToken))

        fun externalBankAccountToken(externalBankAccountToken: JsonField<String>) = apply {
            this.externalBankAccountToken = externalBankAccountToken
        }

        fun financialAccountToken(financialAccountToken: String) =
            financialAccountToken(JsonField.of(financialAccountToken))

        fun financialAccountToken(financialAccountToken: JsonField<String>) = apply {
            this.financialAccountToken = financialAccountToken
        }

        fun method(method: Payment.Method) = method(JsonField.of(method))

        fun method(method: JsonField<Payment.Method>) = apply { this.method = method }

        fun methodAttributes(methodAttributes: Payment.PaymentMethodAttributes) =
            methodAttributes(JsonField.of(methodAttributes))

        fun methodAttributes(methodAttributes: JsonField<Payment.PaymentMethodAttributes>) = apply {
            this.methodAttributes = methodAttributes
        }

        /**
         * Pending amount of the payment in the currency's smallest unit (e.g., cents). The value of
         * this field will go to zero over time once the payment is settled.
         */
        fun pendingAmount(pendingAmount: Long) = pendingAmount(JsonField.of(pendingAmount))

        /**
         * Pending amount of the payment in the currency's smallest unit (e.g., cents). The value of
         * this field will go to zero over time once the payment is settled.
         */
        fun pendingAmount(pendingAmount: JsonField<Long>) = apply {
            this.pendingAmount = pendingAmount
        }

        /**
         * APPROVED payments were successful while DECLINED payments were declined by Lithic or
         * returned.
         */
        fun result(result: Payment.Result) = result(JsonField.of(result))

        /**
         * APPROVED payments were successful while DECLINED payments were declined by Lithic or
         * returned.
         */
        fun result(result: JsonField<Payment.Result>) = apply { this.result = result }

        /**
         * Amount of the payment that has been settled in the currency's smallest unit (e.g.,
         * cents).
         */
        fun settledAmount(settledAmount: Long) = settledAmount(JsonField.of(settledAmount))

        /**
         * Amount of the payment that has been settled in the currency's smallest unit (e.g.,
         * cents).
         */
        fun settledAmount(settledAmount: JsonField<Long>) = apply {
            this.settledAmount = settledAmount
        }

        fun source(source: Payment.Source) = source(JsonField.of(source))

        fun source(source: JsonField<Payment.Source>) = apply { this.source = source }

        /**
         * Status types:
         * - `DECLINED` - The payment was declined.
         * - `PENDING` - The payment is being processed and has yet to settle or release
         *   (origination debit).
         * - `RETURNED` - The payment has been returned.
         * - `SETTLED` - The payment is completed.
         */
        fun status(status: Payment.Status) = status(JsonField.of(status))

        /**
         * Status types:
         * - `DECLINED` - The payment was declined.
         * - `PENDING` - The payment is being processed and has yet to settle or release
         *   (origination debit).
         * - `RETURNED` - The payment has been returned.
         * - `SETTLED` - The payment is completed.
         */
        fun status(status: JsonField<Payment.Status>) = apply { this.status = status }

        /** Date and time when the financial transaction was last updated. UTC time zone. */
        fun updated(updated: OffsetDateTime) = updated(JsonField.of(updated))

        /** Date and time when the financial transaction was last updated. UTC time zone. */
        fun updated(updated: JsonField<OffsetDateTime>) = apply { this.updated = updated }

        fun userDefinedId(userDefinedId: String) = userDefinedId(JsonField.of(userDefinedId))

        fun userDefinedId(userDefinedId: JsonField<String>) = apply {
            this.userDefinedId = userDefinedId
        }

        /** Balance */
        fun balance(balance: Balance) = balance(JsonField.of(balance))

        /** Balance */
        fun balance(balance: JsonField<Balance>) = apply { this.balance = balance }

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

        fun build(): PaymentRetryResponse =
            PaymentRetryResponse(
                token,
                category,
                created,
                currency,
                descriptor,
                direction,
                events.map { it.toImmutable() },
                externalBankAccountToken,
                financialAccountToken,
                method,
                methodAttributes,
                pendingAmount,
                result,
                settledAmount,
                source,
                status,
                updated,
                userDefinedId,
                balance,
                additionalProperties.toImmutable(),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is PaymentRetryResponse && token == other.token && category == other.category && created == other.created && currency == other.currency && descriptor == other.descriptor && direction == other.direction && events == other.events && externalBankAccountToken == other.externalBankAccountToken && financialAccountToken == other.financialAccountToken && method == other.method && methodAttributes == other.methodAttributes && pendingAmount == other.pendingAmount && result == other.result && settledAmount == other.settledAmount && source == other.source && status == other.status && updated == other.updated && userDefinedId == other.userDefinedId && balance == other.balance && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(token, category, created, currency, descriptor, direction, events, externalBankAccountToken, financialAccountToken, method, methodAttributes, pendingAmount, result, settledAmount, source, status, updated, userDefinedId, balance, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "PaymentRetryResponse{token=$token, category=$category, created=$created, currency=$currency, descriptor=$descriptor, direction=$direction, events=$events, externalBankAccountToken=$externalBankAccountToken, financialAccountToken=$financialAccountToken, method=$method, methodAttributes=$methodAttributes, pendingAmount=$pendingAmount, result=$result, settledAmount=$settledAmount, source=$source, status=$status, updated=$updated, userDefinedId=$userDefinedId, balance=$balance, additionalProperties=$additionalProperties}"
}
