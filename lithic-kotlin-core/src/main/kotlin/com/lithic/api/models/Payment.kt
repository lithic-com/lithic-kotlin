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
import com.lithic.api.core.immutableEmptyMap
import com.lithic.api.core.toImmutable
import com.lithic.api.errors.LithicInvalidDataException
import java.time.OffsetDateTime
import java.util.Objects

@NoAutoDetect
class Payment
@JsonCreator
private constructor(
    @JsonProperty("category")
    @ExcludeMissing
    private val category: JsonField<Category> = JsonMissing.of(),
    @JsonProperty("created")
    @ExcludeMissing
    private val created: JsonField<OffsetDateTime> = JsonMissing.of(),
    @JsonProperty("currency")
    @ExcludeMissing
    private val currency: JsonField<String> = JsonMissing.of(),
    @JsonProperty("descriptor")
    @ExcludeMissing
    private val descriptor: JsonField<String> = JsonMissing.of(),
    @JsonProperty("events")
    @ExcludeMissing
    private val events: JsonField<List<PaymentEvent>> = JsonMissing.of(),
    @JsonProperty("pending_amount")
    @ExcludeMissing
    private val pendingAmount: JsonField<Long> = JsonMissing.of(),
    @JsonProperty("result")
    @ExcludeMissing
    private val result: JsonField<Result> = JsonMissing.of(),
    @JsonProperty("settled_amount")
    @ExcludeMissing
    private val settledAmount: JsonField<Long> = JsonMissing.of(),
    @JsonProperty("status")
    @ExcludeMissing
    private val status: JsonField<Status> = JsonMissing.of(),
    @JsonProperty("token") @ExcludeMissing private val token: JsonField<String> = JsonMissing.of(),
    @JsonProperty("updated")
    @ExcludeMissing
    private val updated: JsonField<OffsetDateTime> = JsonMissing.of(),
    @JsonProperty("direction")
    @ExcludeMissing
    private val direction: JsonField<Direction> = JsonMissing.of(),
    @JsonProperty("financial_account_token")
    @ExcludeMissing
    private val financialAccountToken: JsonField<String> = JsonMissing.of(),
    @JsonProperty("external_bank_account_token")
    @ExcludeMissing
    private val externalBankAccountToken: JsonField<String> = JsonMissing.of(),
    @JsonProperty("method")
    @ExcludeMissing
    private val method: JsonField<Method> = JsonMissing.of(),
    @JsonProperty("method_attributes")
    @ExcludeMissing
    private val methodAttributes: JsonField<PaymentMethodAttributes> = JsonMissing.of(),
    @JsonProperty("source")
    @ExcludeMissing
    private val source: JsonField<Source> = JsonMissing.of(),
    @JsonProperty("user_defined_id")
    @ExcludeMissing
    private val userDefinedId: JsonField<String> = JsonMissing.of(),
    @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
) {

    /** Payment category */
    fun category(): Category = category.getRequired("category")

    /** Date and time when the payment first occurred. UTC time zone. */
    fun created(): OffsetDateTime = created.getRequired("created")

    /** 3-digit alphabetic ISO 4217 code for the settling currency of the payment. */
    fun currency(): String = currency.getRequired("currency")

    /** A string that provides a description of the payment; may be useful to display to users. */
    fun descriptor(): String = descriptor.getRequired("descriptor")

    /** A list of all payment events that have modified this payment. */
    fun events(): List<PaymentEvent> = events.getRequired("events")

    /**
     * Pending amount of the payment in the currency's smallest unit (e.g., cents). The value of
     * this field will go to zero over time once the payment is settled.
     */
    fun pendingAmount(): Long = pendingAmount.getRequired("pending_amount")

    /**
     * APPROVED payments were successful while DECLINED payments were declined by Lithic or
     * returned.
     */
    fun result(): Result = result.getRequired("result")

    /**
     * Amount of the payment that has been settled in the currency's smallest unit (e.g., cents).
     */
    fun settledAmount(): Long = settledAmount.getRequired("settled_amount")

    /**
     * Status types:
     * - `DECLINED` - The payment was declined.
     * - `PENDING` - The payment is being processed and has yet to settle or release (origination
     *   debit).
     * - `RETURNED` - The payment has been returned.
     * - `SETTLED` - The payment is completed.
     */
    fun status(): Status = status.getRequired("status")

    /** Globally unique identifier. */
    fun token(): String = token.getRequired("token")

    /** Date and time when the financial transaction was last updated. UTC time zone. */
    fun updated(): OffsetDateTime = updated.getRequired("updated")

    fun direction(): Direction = direction.getRequired("direction")

    fun financialAccountToken(): String =
        financialAccountToken.getRequired("financial_account_token")

    fun externalBankAccountToken(): String? =
        externalBankAccountToken.getNullable("external_bank_account_token")

    fun method(): Method = method.getRequired("method")

    fun methodAttributes(): PaymentMethodAttributes =
        methodAttributes.getRequired("method_attributes")

    fun source(): Source = source.getRequired("source")

    fun userDefinedId(): String? = userDefinedId.getNullable("user_defined_id")

    /** Payment category */
    @JsonProperty("category") @ExcludeMissing fun _category() = category

    /** Date and time when the payment first occurred. UTC time zone. */
    @JsonProperty("created") @ExcludeMissing fun _created() = created

    /** 3-digit alphabetic ISO 4217 code for the settling currency of the payment. */
    @JsonProperty("currency") @ExcludeMissing fun _currency() = currency

    /** A string that provides a description of the payment; may be useful to display to users. */
    @JsonProperty("descriptor") @ExcludeMissing fun _descriptor() = descriptor

    /** A list of all payment events that have modified this payment. */
    @JsonProperty("events") @ExcludeMissing fun _events() = events

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

    /**
     * Status types:
     * - `DECLINED` - The payment was declined.
     * - `PENDING` - The payment is being processed and has yet to settle or release (origination
     *   debit).
     * - `RETURNED` - The payment has been returned.
     * - `SETTLED` - The payment is completed.
     */
    @JsonProperty("status") @ExcludeMissing fun _status() = status

    /** Globally unique identifier. */
    @JsonProperty("token") @ExcludeMissing fun _token() = token

    /** Date and time when the financial transaction was last updated. UTC time zone. */
    @JsonProperty("updated") @ExcludeMissing fun _updated() = updated

    @JsonProperty("direction") @ExcludeMissing fun _direction() = direction

    @JsonProperty("financial_account_token")
    @ExcludeMissing
    fun _financialAccountToken() = financialAccountToken

    @JsonProperty("external_bank_account_token")
    @ExcludeMissing
    fun _externalBankAccountToken() = externalBankAccountToken

    @JsonProperty("method") @ExcludeMissing fun _method() = method

    @JsonProperty("method_attributes") @ExcludeMissing fun _methodAttributes() = methodAttributes

    @JsonProperty("source") @ExcludeMissing fun _source() = source

    @JsonProperty("user_defined_id") @ExcludeMissing fun _userDefinedId() = userDefinedId

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    private var validated: Boolean = false

    fun validate(): Payment = apply {
        if (!validated) {
            category()
            created()
            currency()
            descriptor()
            events().forEach { it.validate() }
            pendingAmount()
            result()
            settledAmount()
            status()
            token()
            updated()
            direction()
            financialAccountToken()
            externalBankAccountToken()
            method()
            methodAttributes().validate()
            source()
            userDefinedId()
            validated = true
        }
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        fun builder() = Builder()
    }

    class Builder {

        private var category: JsonField<Category> = JsonMissing.of()
        private var created: JsonField<OffsetDateTime> = JsonMissing.of()
        private var currency: JsonField<String> = JsonMissing.of()
        private var descriptor: JsonField<String> = JsonMissing.of()
        private var events: JsonField<List<PaymentEvent>> = JsonMissing.of()
        private var pendingAmount: JsonField<Long> = JsonMissing.of()
        private var result: JsonField<Result> = JsonMissing.of()
        private var settledAmount: JsonField<Long> = JsonMissing.of()
        private var status: JsonField<Status> = JsonMissing.of()
        private var token: JsonField<String> = JsonMissing.of()
        private var updated: JsonField<OffsetDateTime> = JsonMissing.of()
        private var direction: JsonField<Direction> = JsonMissing.of()
        private var financialAccountToken: JsonField<String> = JsonMissing.of()
        private var externalBankAccountToken: JsonField<String> = JsonMissing.of()
        private var method: JsonField<Method> = JsonMissing.of()
        private var methodAttributes: JsonField<PaymentMethodAttributes> = JsonMissing.of()
        private var source: JsonField<Source> = JsonMissing.of()
        private var userDefinedId: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(payment: Payment) = apply {
            category = payment.category
            created = payment.created
            currency = payment.currency
            descriptor = payment.descriptor
            events = payment.events
            pendingAmount = payment.pendingAmount
            result = payment.result
            settledAmount = payment.settledAmount
            status = payment.status
            token = payment.token
            updated = payment.updated
            direction = payment.direction
            financialAccountToken = payment.financialAccountToken
            externalBankAccountToken = payment.externalBankAccountToken
            method = payment.method
            methodAttributes = payment.methodAttributes
            source = payment.source
            userDefinedId = payment.userDefinedId
            additionalProperties = payment.additionalProperties.toMutableMap()
        }

        /** Payment category */
        fun category(category: Category) = category(JsonField.of(category))

        /** Payment category */
        fun category(category: JsonField<Category>) = apply { this.category = category }

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

        /** A list of all payment events that have modified this payment. */
        fun events(events: List<PaymentEvent>) = events(JsonField.of(events))

        /** A list of all payment events that have modified this payment. */
        fun events(events: JsonField<List<PaymentEvent>>) = apply { this.events = events }

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
        fun result(result: Result) = result(JsonField.of(result))

        /**
         * APPROVED payments were successful while DECLINED payments were declined by Lithic or
         * returned.
         */
        fun result(result: JsonField<Result>) = apply { this.result = result }

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

        /**
         * Status types:
         * - `DECLINED` - The payment was declined.
         * - `PENDING` - The payment is being processed and has yet to settle or release
         *   (origination debit).
         * - `RETURNED` - The payment has been returned.
         * - `SETTLED` - The payment is completed.
         */
        fun status(status: Status) = status(JsonField.of(status))

        /**
         * Status types:
         * - `DECLINED` - The payment was declined.
         * - `PENDING` - The payment is being processed and has yet to settle or release
         *   (origination debit).
         * - `RETURNED` - The payment has been returned.
         * - `SETTLED` - The payment is completed.
         */
        fun status(status: JsonField<Status>) = apply { this.status = status }

        /** Globally unique identifier. */
        fun token(token: String) = token(JsonField.of(token))

        /** Globally unique identifier. */
        fun token(token: JsonField<String>) = apply { this.token = token }

        /** Date and time when the financial transaction was last updated. UTC time zone. */
        fun updated(updated: OffsetDateTime) = updated(JsonField.of(updated))

        /** Date and time when the financial transaction was last updated. UTC time zone. */
        fun updated(updated: JsonField<OffsetDateTime>) = apply { this.updated = updated }

        fun direction(direction: Direction) = direction(JsonField.of(direction))

        fun direction(direction: JsonField<Direction>) = apply { this.direction = direction }

        fun financialAccountToken(financialAccountToken: String) =
            financialAccountToken(JsonField.of(financialAccountToken))

        fun financialAccountToken(financialAccountToken: JsonField<String>) = apply {
            this.financialAccountToken = financialAccountToken
        }

        fun externalBankAccountToken(externalBankAccountToken: String) =
            externalBankAccountToken(JsonField.of(externalBankAccountToken))

        fun externalBankAccountToken(externalBankAccountToken: JsonField<String>) = apply {
            this.externalBankAccountToken = externalBankAccountToken
        }

        fun method(method: Method) = method(JsonField.of(method))

        fun method(method: JsonField<Method>) = apply { this.method = method }

        fun methodAttributes(methodAttributes: PaymentMethodAttributes) =
            methodAttributes(JsonField.of(methodAttributes))

        fun methodAttributes(methodAttributes: JsonField<PaymentMethodAttributes>) = apply {
            this.methodAttributes = methodAttributes
        }

        fun source(source: Source) = source(JsonField.of(source))

        fun source(source: JsonField<Source>) = apply { this.source = source }

        fun userDefinedId(userDefinedId: String) = userDefinedId(JsonField.of(userDefinedId))

        fun userDefinedId(userDefinedId: JsonField<String>) = apply {
            this.userDefinedId = userDefinedId
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

        fun build(): Payment =
            Payment(
                category,
                created,
                currency,
                descriptor,
                events.map { it.toImmutable() },
                pendingAmount,
                result,
                settledAmount,
                status,
                token,
                updated,
                direction,
                financialAccountToken,
                externalBankAccountToken,
                method,
                methodAttributes,
                source,
                userDefinedId,
                additionalProperties.toImmutable(),
            )
    }

    class Category
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            val ACH = of("ACH")

            fun of(value: String) = Category(JsonField.of(value))
        }

        enum class Known {
            ACH,
        }

        enum class Value {
            ACH,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                ACH -> Value.ACH
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                ACH -> Known.ACH
                else -> throw LithicInvalidDataException("Unknown Category: $value")
            }

        fun asString(): String = _value().asStringOrThrow()

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Category && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    class Direction
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            val CREDIT = of("CREDIT")

            val DEBIT = of("DEBIT")

            fun of(value: String) = Direction(JsonField.of(value))
        }

        enum class Known {
            CREDIT,
            DEBIT,
        }

        enum class Value {
            CREDIT,
            DEBIT,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                CREDIT -> Value.CREDIT
                DEBIT -> Value.DEBIT
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                CREDIT -> Known.CREDIT
                DEBIT -> Known.DEBIT
                else -> throw LithicInvalidDataException("Unknown Direction: $value")
            }

        fun asString(): String = _value().asStringOrThrow()

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Direction && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    @NoAutoDetect
    class PaymentEvent
    @JsonCreator
    private constructor(
        @JsonProperty("amount")
        @ExcludeMissing
        private val amount: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("created")
        @ExcludeMissing
        private val created: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("detailed_results")
        @ExcludeMissing
        private val detailedResults: JsonField<List<DetailedResult>> = JsonMissing.of(),
        @JsonProperty("result")
        @ExcludeMissing
        private val result: JsonField<Result> = JsonMissing.of(),
        @JsonProperty("token")
        @ExcludeMissing
        private val token: JsonField<String> = JsonMissing.of(),
        @JsonProperty("type")
        @ExcludeMissing
        private val type: JsonField<PaymentEventType> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /**
         * Amount of the financial event that has been settled in the currency's smallest unit
         * (e.g., cents).
         */
        fun amount(): Long = amount.getRequired("amount")

        /** Date and time when the financial event occurred. UTC time zone. */
        fun created(): OffsetDateTime = created.getRequired("created")

        /** More detailed reasons for the event */
        fun detailedResults(): List<DetailedResult>? =
            detailedResults.getNullable("detailed_results")

        /**
         * APPROVED financial events were successful while DECLINED financial events were declined
         * by user, Lithic, or the network.
         */
        fun result(): Result = result.getRequired("result")

        /** Globally unique identifier. */
        fun token(): String = token.getRequired("token")

        /**
         * Event types:
         * - `ACH_ORIGINATION_INITIATED` - ACH origination received and pending approval/release
         *   from an ACH hold.
         * - `ACH_ORIGINATION_REVIEWED` - ACH origination has completed the review process.
         * - `ACH_ORIGINATION_CANCELLED` - ACH origination has been cancelled.
         * - `ACH_ORIGINATION_PROCESSED` - ACH origination has been processed and sent to the fed.
         * - `ACH_ORIGINATION_SETTLED` - ACH origination has settled.
         * - `ACH_ORIGINATION_RELEASED` - ACH origination released from pending to available
         *   balance.
         * - `ACH_RETURN_PROCESSED` - ACH origination returned by the Receiving Depository Financial
         *   Institution.
         * - `ACH_RECEIPT_PROCESSED` - ACH receipt pending release from an ACH holder.
         * - `ACH_RETURN_INITIATED` - ACH initiated return for a ACH receipt.
         * - `ACH_RECEIPT_SETTLED` - ACH receipt funds have settled.
         * - `ACH_RECEIPT_RELEASED` - ACH receipt released from pending to available balance.
         */
        fun type(): PaymentEventType = type.getRequired("type")

        /**
         * Amount of the financial event that has been settled in the currency's smallest unit
         * (e.g., cents).
         */
        @JsonProperty("amount") @ExcludeMissing fun _amount() = amount

        /** Date and time when the financial event occurred. UTC time zone. */
        @JsonProperty("created") @ExcludeMissing fun _created() = created

        /** More detailed reasons for the event */
        @JsonProperty("detailed_results") @ExcludeMissing fun _detailedResults() = detailedResults

        /**
         * APPROVED financial events were successful while DECLINED financial events were declined
         * by user, Lithic, or the network.
         */
        @JsonProperty("result") @ExcludeMissing fun _result() = result

        /** Globally unique identifier. */
        @JsonProperty("token") @ExcludeMissing fun _token() = token

        /**
         * Event types:
         * - `ACH_ORIGINATION_INITIATED` - ACH origination received and pending approval/release
         *   from an ACH hold.
         * - `ACH_ORIGINATION_REVIEWED` - ACH origination has completed the review process.
         * - `ACH_ORIGINATION_CANCELLED` - ACH origination has been cancelled.
         * - `ACH_ORIGINATION_PROCESSED` - ACH origination has been processed and sent to the fed.
         * - `ACH_ORIGINATION_SETTLED` - ACH origination has settled.
         * - `ACH_ORIGINATION_RELEASED` - ACH origination released from pending to available
         *   balance.
         * - `ACH_RETURN_PROCESSED` - ACH origination returned by the Receiving Depository Financial
         *   Institution.
         * - `ACH_RECEIPT_PROCESSED` - ACH receipt pending release from an ACH holder.
         * - `ACH_RETURN_INITIATED` - ACH initiated return for a ACH receipt.
         * - `ACH_RECEIPT_SETTLED` - ACH receipt funds have settled.
         * - `ACH_RECEIPT_RELEASED` - ACH receipt released from pending to available balance.
         */
        @JsonProperty("type") @ExcludeMissing fun _type() = type

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): PaymentEvent = apply {
            if (!validated) {
                amount()
                created()
                detailedResults()
                result()
                token()
                type()
                validated = true
            }
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var amount: JsonField<Long> = JsonMissing.of()
            private var created: JsonField<OffsetDateTime> = JsonMissing.of()
            private var detailedResults: JsonField<List<DetailedResult>> = JsonMissing.of()
            private var result: JsonField<Result> = JsonMissing.of()
            private var token: JsonField<String> = JsonMissing.of()
            private var type: JsonField<PaymentEventType> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(paymentEvent: PaymentEvent) = apply {
                amount = paymentEvent.amount
                created = paymentEvent.created
                detailedResults = paymentEvent.detailedResults
                result = paymentEvent.result
                token = paymentEvent.token
                type = paymentEvent.type
                additionalProperties = paymentEvent.additionalProperties.toMutableMap()
            }

            /**
             * Amount of the financial event that has been settled in the currency's smallest unit
             * (e.g., cents).
             */
            fun amount(amount: Long) = amount(JsonField.of(amount))

            /**
             * Amount of the financial event that has been settled in the currency's smallest unit
             * (e.g., cents).
             */
            fun amount(amount: JsonField<Long>) = apply { this.amount = amount }

            /** Date and time when the financial event occurred. UTC time zone. */
            fun created(created: OffsetDateTime) = created(JsonField.of(created))

            /** Date and time when the financial event occurred. UTC time zone. */
            fun created(created: JsonField<OffsetDateTime>) = apply { this.created = created }

            /** More detailed reasons for the event */
            fun detailedResults(detailedResults: List<DetailedResult>) =
                detailedResults(JsonField.of(detailedResults))

            /** More detailed reasons for the event */
            fun detailedResults(detailedResults: JsonField<List<DetailedResult>>) = apply {
                this.detailedResults = detailedResults
            }

            /**
             * APPROVED financial events were successful while DECLINED financial events were
             * declined by user, Lithic, or the network.
             */
            fun result(result: Result) = result(JsonField.of(result))

            /**
             * APPROVED financial events were successful while DECLINED financial events were
             * declined by user, Lithic, or the network.
             */
            fun result(result: JsonField<Result>) = apply { this.result = result }

            /** Globally unique identifier. */
            fun token(token: String) = token(JsonField.of(token))

            /** Globally unique identifier. */
            fun token(token: JsonField<String>) = apply { this.token = token }

            /**
             * Event types:
             * - `ACH_ORIGINATION_INITIATED` - ACH origination received and pending approval/release
             *   from an ACH hold.
             * - `ACH_ORIGINATION_REVIEWED` - ACH origination has completed the review process.
             * - `ACH_ORIGINATION_CANCELLED` - ACH origination has been cancelled.
             * - `ACH_ORIGINATION_PROCESSED` - ACH origination has been processed and sent to the
             *   fed.
             * - `ACH_ORIGINATION_SETTLED` - ACH origination has settled.
             * - `ACH_ORIGINATION_RELEASED` - ACH origination released from pending to available
             *   balance.
             * - `ACH_RETURN_PROCESSED` - ACH origination returned by the Receiving Depository
             *   Financial Institution.
             * - `ACH_RECEIPT_PROCESSED` - ACH receipt pending release from an ACH holder.
             * - `ACH_RETURN_INITIATED` - ACH initiated return for a ACH receipt.
             * - `ACH_RECEIPT_SETTLED` - ACH receipt funds have settled.
             * - `ACH_RECEIPT_RELEASED` - ACH receipt released from pending to available balance.
             */
            fun type(type: PaymentEventType) = type(JsonField.of(type))

            /**
             * Event types:
             * - `ACH_ORIGINATION_INITIATED` - ACH origination received and pending approval/release
             *   from an ACH hold.
             * - `ACH_ORIGINATION_REVIEWED` - ACH origination has completed the review process.
             * - `ACH_ORIGINATION_CANCELLED` - ACH origination has been cancelled.
             * - `ACH_ORIGINATION_PROCESSED` - ACH origination has been processed and sent to the
             *   fed.
             * - `ACH_ORIGINATION_SETTLED` - ACH origination has settled.
             * - `ACH_ORIGINATION_RELEASED` - ACH origination released from pending to available
             *   balance.
             * - `ACH_RETURN_PROCESSED` - ACH origination returned by the Receiving Depository
             *   Financial Institution.
             * - `ACH_RECEIPT_PROCESSED` - ACH receipt pending release from an ACH holder.
             * - `ACH_RETURN_INITIATED` - ACH initiated return for a ACH receipt.
             * - `ACH_RECEIPT_SETTLED` - ACH receipt funds have settled.
             * - `ACH_RECEIPT_RELEASED` - ACH receipt released from pending to available balance.
             */
            fun type(type: JsonField<PaymentEventType>) = apply { this.type = type }

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

            fun build(): PaymentEvent =
                PaymentEvent(
                    amount,
                    created,
                    detailedResults.map { it.toImmutable() },
                    result,
                    token,
                    type,
                    additionalProperties.toImmutable(),
                )
        }

        class Result
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) : Enum {

            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                val APPROVED = of("APPROVED")

                val DECLINED = of("DECLINED")

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

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is Result && value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        class PaymentEventType
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) : Enum {

            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                val ACH_ORIGINATION_CANCELLED = of("ACH_ORIGINATION_CANCELLED")

                val ACH_ORIGINATION_INITIATED = of("ACH_ORIGINATION_INITIATED")

                val ACH_ORIGINATION_PROCESSED = of("ACH_ORIGINATION_PROCESSED")

                val ACH_ORIGINATION_SETTLED = of("ACH_ORIGINATION_SETTLED")

                val ACH_ORIGINATION_RELEASED = of("ACH_ORIGINATION_RELEASED")

                val ACH_ORIGINATION_REVIEWED = of("ACH_ORIGINATION_REVIEWED")

                val ACH_RECEIPT_PROCESSED = of("ACH_RECEIPT_PROCESSED")

                val ACH_RECEIPT_SETTLED = of("ACH_RECEIPT_SETTLED")

                val ACH_RETURN_INITIATED = of("ACH_RETURN_INITIATED")

                val ACH_RETURN_PROCESSED = of("ACH_RETURN_PROCESSED")

                fun of(value: String) = PaymentEventType(JsonField.of(value))
            }

            enum class Known {
                ACH_ORIGINATION_CANCELLED,
                ACH_ORIGINATION_INITIATED,
                ACH_ORIGINATION_PROCESSED,
                ACH_ORIGINATION_SETTLED,
                ACH_ORIGINATION_RELEASED,
                ACH_ORIGINATION_REVIEWED,
                ACH_RECEIPT_PROCESSED,
                ACH_RECEIPT_SETTLED,
                ACH_RETURN_INITIATED,
                ACH_RETURN_PROCESSED,
            }

            enum class Value {
                ACH_ORIGINATION_CANCELLED,
                ACH_ORIGINATION_INITIATED,
                ACH_ORIGINATION_PROCESSED,
                ACH_ORIGINATION_SETTLED,
                ACH_ORIGINATION_RELEASED,
                ACH_ORIGINATION_REVIEWED,
                ACH_RECEIPT_PROCESSED,
                ACH_RECEIPT_SETTLED,
                ACH_RETURN_INITIATED,
                ACH_RETURN_PROCESSED,
                _UNKNOWN,
            }

            fun value(): Value =
                when (this) {
                    ACH_ORIGINATION_CANCELLED -> Value.ACH_ORIGINATION_CANCELLED
                    ACH_ORIGINATION_INITIATED -> Value.ACH_ORIGINATION_INITIATED
                    ACH_ORIGINATION_PROCESSED -> Value.ACH_ORIGINATION_PROCESSED
                    ACH_ORIGINATION_SETTLED -> Value.ACH_ORIGINATION_SETTLED
                    ACH_ORIGINATION_RELEASED -> Value.ACH_ORIGINATION_RELEASED
                    ACH_ORIGINATION_REVIEWED -> Value.ACH_ORIGINATION_REVIEWED
                    ACH_RECEIPT_PROCESSED -> Value.ACH_RECEIPT_PROCESSED
                    ACH_RECEIPT_SETTLED -> Value.ACH_RECEIPT_SETTLED
                    ACH_RETURN_INITIATED -> Value.ACH_RETURN_INITIATED
                    ACH_RETURN_PROCESSED -> Value.ACH_RETURN_PROCESSED
                    else -> Value._UNKNOWN
                }

            fun known(): Known =
                when (this) {
                    ACH_ORIGINATION_CANCELLED -> Known.ACH_ORIGINATION_CANCELLED
                    ACH_ORIGINATION_INITIATED -> Known.ACH_ORIGINATION_INITIATED
                    ACH_ORIGINATION_PROCESSED -> Known.ACH_ORIGINATION_PROCESSED
                    ACH_ORIGINATION_SETTLED -> Known.ACH_ORIGINATION_SETTLED
                    ACH_ORIGINATION_RELEASED -> Known.ACH_ORIGINATION_RELEASED
                    ACH_ORIGINATION_REVIEWED -> Known.ACH_ORIGINATION_REVIEWED
                    ACH_RECEIPT_PROCESSED -> Known.ACH_RECEIPT_PROCESSED
                    ACH_RECEIPT_SETTLED -> Known.ACH_RECEIPT_SETTLED
                    ACH_RETURN_INITIATED -> Known.ACH_RETURN_INITIATED
                    ACH_RETURN_PROCESSED -> Known.ACH_RETURN_PROCESSED
                    else -> throw LithicInvalidDataException("Unknown PaymentEventType: $value")
                }

            fun asString(): String = _value().asStringOrThrow()

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is PaymentEventType && value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        class DetailedResult
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) : Enum {

            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                val APPROVED = of("APPROVED")

                val FUNDS_INSUFFICIENT = of("FUNDS_INSUFFICIENT")

                val ACCOUNT_INVALID = of("ACCOUNT_INVALID")

                val PROGRAM_TRANSACTION_LIMIT_EXCEEDED = of("PROGRAM_TRANSACTION_LIMIT_EXCEEDED")

                val PROGRAM_DAILY_LIMIT_EXCEEDED = of("PROGRAM_DAILY_LIMIT_EXCEEDED")

                val PROGRAM_MONTHLY_LIMIT_EXCEEDED = of("PROGRAM_MONTHLY_LIMIT_EXCEEDED")

                fun of(value: String) = DetailedResult(JsonField.of(value))
            }

            enum class Known {
                APPROVED,
                FUNDS_INSUFFICIENT,
                ACCOUNT_INVALID,
                PROGRAM_TRANSACTION_LIMIT_EXCEEDED,
                PROGRAM_DAILY_LIMIT_EXCEEDED,
                PROGRAM_MONTHLY_LIMIT_EXCEEDED,
            }

            enum class Value {
                APPROVED,
                FUNDS_INSUFFICIENT,
                ACCOUNT_INVALID,
                PROGRAM_TRANSACTION_LIMIT_EXCEEDED,
                PROGRAM_DAILY_LIMIT_EXCEEDED,
                PROGRAM_MONTHLY_LIMIT_EXCEEDED,
                _UNKNOWN,
            }

            fun value(): Value =
                when (this) {
                    APPROVED -> Value.APPROVED
                    FUNDS_INSUFFICIENT -> Value.FUNDS_INSUFFICIENT
                    ACCOUNT_INVALID -> Value.ACCOUNT_INVALID
                    PROGRAM_TRANSACTION_LIMIT_EXCEEDED -> Value.PROGRAM_TRANSACTION_LIMIT_EXCEEDED
                    PROGRAM_DAILY_LIMIT_EXCEEDED -> Value.PROGRAM_DAILY_LIMIT_EXCEEDED
                    PROGRAM_MONTHLY_LIMIT_EXCEEDED -> Value.PROGRAM_MONTHLY_LIMIT_EXCEEDED
                    else -> Value._UNKNOWN
                }

            fun known(): Known =
                when (this) {
                    APPROVED -> Known.APPROVED
                    FUNDS_INSUFFICIENT -> Known.FUNDS_INSUFFICIENT
                    ACCOUNT_INVALID -> Known.ACCOUNT_INVALID
                    PROGRAM_TRANSACTION_LIMIT_EXCEEDED -> Known.PROGRAM_TRANSACTION_LIMIT_EXCEEDED
                    PROGRAM_DAILY_LIMIT_EXCEEDED -> Known.PROGRAM_DAILY_LIMIT_EXCEEDED
                    PROGRAM_MONTHLY_LIMIT_EXCEEDED -> Known.PROGRAM_MONTHLY_LIMIT_EXCEEDED
                    else -> throw LithicInvalidDataException("Unknown DetailedResult: $value")
                }

            fun asString(): String = _value().asStringOrThrow()

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is DetailedResult && value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is PaymentEvent && amount == other.amount && created == other.created && detailedResults == other.detailedResults && result == other.result && token == other.token && type == other.type && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(amount, created, detailedResults, result, token, type, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "PaymentEvent{amount=$amount, created=$created, detailedResults=$detailedResults, result=$result, token=$token, type=$type, additionalProperties=$additionalProperties}"
    }

    class Method
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            val ACH_NEXT_DAY = of("ACH_NEXT_DAY")

            val ACH_SAME_DAY = of("ACH_SAME_DAY")

            fun of(value: String) = Method(JsonField.of(value))
        }

        enum class Known {
            ACH_NEXT_DAY,
            ACH_SAME_DAY,
        }

        enum class Value {
            ACH_NEXT_DAY,
            ACH_SAME_DAY,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                ACH_NEXT_DAY -> Value.ACH_NEXT_DAY
                ACH_SAME_DAY -> Value.ACH_SAME_DAY
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                ACH_NEXT_DAY -> Known.ACH_NEXT_DAY
                ACH_SAME_DAY -> Known.ACH_SAME_DAY
                else -> throw LithicInvalidDataException("Unknown Method: $value")
            }

        fun asString(): String = _value().asStringOrThrow()

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Method && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    @NoAutoDetect
    class PaymentMethodAttributes
    @JsonCreator
    private constructor(
        @JsonProperty("company_id")
        @ExcludeMissing
        private val companyId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("receipt_routing_number")
        @ExcludeMissing
        private val receiptRoutingNumber: JsonField<String> = JsonMissing.of(),
        @JsonProperty("retries")
        @ExcludeMissing
        private val retries: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("return_reason_code")
        @ExcludeMissing
        private val returnReasonCode: JsonField<String> = JsonMissing.of(),
        @JsonProperty("sec_code")
        @ExcludeMissing
        private val secCode: JsonField<SecCode> = JsonMissing.of(),
        @JsonProperty("trace_numbers")
        @ExcludeMissing
        private val traceNumbers: JsonField<List<String?>> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        fun companyId(): String? = companyId.getNullable("company_id")

        fun receiptRoutingNumber(): String? =
            receiptRoutingNumber.getNullable("receipt_routing_number")

        fun retries(): Long? = retries.getNullable("retries")

        fun returnReasonCode(): String? = returnReasonCode.getNullable("return_reason_code")

        fun secCode(): SecCode = secCode.getRequired("sec_code")

        fun traceNumbers(): List<String?> = traceNumbers.getRequired("trace_numbers")

        @JsonProperty("company_id") @ExcludeMissing fun _companyId() = companyId

        @JsonProperty("receipt_routing_number")
        @ExcludeMissing
        fun _receiptRoutingNumber() = receiptRoutingNumber

        @JsonProperty("retries") @ExcludeMissing fun _retries() = retries

        @JsonProperty("return_reason_code")
        @ExcludeMissing
        fun _returnReasonCode() = returnReasonCode

        @JsonProperty("sec_code") @ExcludeMissing fun _secCode() = secCode

        @JsonProperty("trace_numbers") @ExcludeMissing fun _traceNumbers() = traceNumbers

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): PaymentMethodAttributes = apply {
            if (!validated) {
                companyId()
                receiptRoutingNumber()
                retries()
                returnReasonCode()
                secCode()
                traceNumbers()
                validated = true
            }
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var companyId: JsonField<String> = JsonMissing.of()
            private var receiptRoutingNumber: JsonField<String> = JsonMissing.of()
            private var retries: JsonField<Long> = JsonMissing.of()
            private var returnReasonCode: JsonField<String> = JsonMissing.of()
            private var secCode: JsonField<SecCode> = JsonMissing.of()
            private var traceNumbers: JsonField<List<String?>> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(paymentMethodAttributes: PaymentMethodAttributes) = apply {
                companyId = paymentMethodAttributes.companyId
                receiptRoutingNumber = paymentMethodAttributes.receiptRoutingNumber
                retries = paymentMethodAttributes.retries
                returnReasonCode = paymentMethodAttributes.returnReasonCode
                secCode = paymentMethodAttributes.secCode
                traceNumbers = paymentMethodAttributes.traceNumbers
                additionalProperties = paymentMethodAttributes.additionalProperties.toMutableMap()
            }

            fun companyId(companyId: String) = companyId(JsonField.of(companyId))

            fun companyId(companyId: JsonField<String>) = apply { this.companyId = companyId }

            fun receiptRoutingNumber(receiptRoutingNumber: String) =
                receiptRoutingNumber(JsonField.of(receiptRoutingNumber))

            fun receiptRoutingNumber(receiptRoutingNumber: JsonField<String>) = apply {
                this.receiptRoutingNumber = receiptRoutingNumber
            }

            fun retries(retries: Long) = retries(JsonField.of(retries))

            fun retries(retries: JsonField<Long>) = apply { this.retries = retries }

            fun returnReasonCode(returnReasonCode: String) =
                returnReasonCode(JsonField.of(returnReasonCode))

            fun returnReasonCode(returnReasonCode: JsonField<String>) = apply {
                this.returnReasonCode = returnReasonCode
            }

            fun secCode(secCode: SecCode) = secCode(JsonField.of(secCode))

            fun secCode(secCode: JsonField<SecCode>) = apply { this.secCode = secCode }

            fun traceNumbers(traceNumbers: List<String?>) = traceNumbers(JsonField.of(traceNumbers))

            fun traceNumbers(traceNumbers: JsonField<List<String?>>) = apply {
                this.traceNumbers = traceNumbers
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

            fun build(): PaymentMethodAttributes =
                PaymentMethodAttributes(
                    companyId,
                    receiptRoutingNumber,
                    retries,
                    returnReasonCode,
                    secCode,
                    traceNumbers.map { it.toImmutable() },
                    additionalProperties.toImmutable(),
                )
        }

        class SecCode
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) : Enum {

            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                val CCD = of("CCD")

                val PPD = of("PPD")

                val WEB = of("WEB")

                fun of(value: String) = SecCode(JsonField.of(value))
            }

            enum class Known {
                CCD,
                PPD,
                WEB,
            }

            enum class Value {
                CCD,
                PPD,
                WEB,
                _UNKNOWN,
            }

            fun value(): Value =
                when (this) {
                    CCD -> Value.CCD
                    PPD -> Value.PPD
                    WEB -> Value.WEB
                    else -> Value._UNKNOWN
                }

            fun known(): Known =
                when (this) {
                    CCD -> Known.CCD
                    PPD -> Known.PPD
                    WEB -> Known.WEB
                    else -> throw LithicInvalidDataException("Unknown SecCode: $value")
                }

            fun asString(): String = _value().asStringOrThrow()

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is SecCode && value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is PaymentMethodAttributes && companyId == other.companyId && receiptRoutingNumber == other.receiptRoutingNumber && retries == other.retries && returnReasonCode == other.returnReasonCode && secCode == other.secCode && traceNumbers == other.traceNumbers && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(companyId, receiptRoutingNumber, retries, returnReasonCode, secCode, traceNumbers, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "PaymentMethodAttributes{companyId=$companyId, receiptRoutingNumber=$receiptRoutingNumber, retries=$retries, returnReasonCode=$returnReasonCode, secCode=$secCode, traceNumbers=$traceNumbers, additionalProperties=$additionalProperties}"
    }

    class Result
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            val APPROVED = of("APPROVED")

            val DECLINED = of("DECLINED")

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

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Result && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    class Source
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            val CUSTOMER = of("CUSTOMER")

            val LITHIC = of("LITHIC")

            fun of(value: String) = Source(JsonField.of(value))
        }

        enum class Known {
            CUSTOMER,
            LITHIC,
        }

        enum class Value {
            CUSTOMER,
            LITHIC,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                CUSTOMER -> Value.CUSTOMER
                LITHIC -> Value.LITHIC
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                CUSTOMER -> Known.CUSTOMER
                LITHIC -> Known.LITHIC
                else -> throw LithicInvalidDataException("Unknown Source: $value")
            }

        fun asString(): String = _value().asStringOrThrow()

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Source && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    class Status
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            val DECLINED = of("DECLINED")

            val PENDING = of("PENDING")

            val RETURNED = of("RETURNED")

            val SETTLED = of("SETTLED")

            fun of(value: String) = Status(JsonField.of(value))
        }

        enum class Known {
            DECLINED,
            PENDING,
            RETURNED,
            SETTLED,
        }

        enum class Value {
            DECLINED,
            PENDING,
            RETURNED,
            SETTLED,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                DECLINED -> Value.DECLINED
                PENDING -> Value.PENDING
                RETURNED -> Value.RETURNED
                SETTLED -> Value.SETTLED
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                DECLINED -> Known.DECLINED
                PENDING -> Known.PENDING
                RETURNED -> Known.RETURNED
                SETTLED -> Known.SETTLED
                else -> throw LithicInvalidDataException("Unknown Status: $value")
            }

        fun asString(): String = _value().asStringOrThrow()

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Status && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is Payment && category == other.category && created == other.created && currency == other.currency && descriptor == other.descriptor && events == other.events && pendingAmount == other.pendingAmount && result == other.result && settledAmount == other.settledAmount && status == other.status && token == other.token && updated == other.updated && direction == other.direction && financialAccountToken == other.financialAccountToken && externalBankAccountToken == other.externalBankAccountToken && method == other.method && methodAttributes == other.methodAttributes && source == other.source && userDefinedId == other.userDefinedId && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(category, created, currency, descriptor, events, pendingAmount, result, settledAmount, status, token, updated, direction, financialAccountToken, externalBankAccountToken, method, methodAttributes, source, userDefinedId, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "Payment{category=$category, created=$created, currency=$currency, descriptor=$descriptor, events=$events, pendingAmount=$pendingAmount, result=$result, settledAmount=$settledAmount, status=$status, token=$token, updated=$updated, direction=$direction, financialAccountToken=$financialAccountToken, externalBankAccountToken=$externalBankAccountToken, method=$method, methodAttributes=$methodAttributes, source=$source, userDefinedId=$userDefinedId, additionalProperties=$additionalProperties}"
}
