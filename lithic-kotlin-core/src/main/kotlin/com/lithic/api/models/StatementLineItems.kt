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
import com.lithic.api.core.immutableEmptyMap
import com.lithic.api.core.toImmutable
import com.lithic.api.errors.LithicInvalidDataException
import java.time.LocalDate
import java.time.OffsetDateTime
import java.util.Objects

@NoAutoDetect
class StatementLineItems
@JsonCreator
private constructor(
    @JsonProperty("data")
    @ExcludeMissing
    private val data: JsonField<List<StatementLineItemResponse>> = JsonMissing.of(),
    @JsonProperty("has_more")
    @ExcludeMissing
    private val hasMore: JsonField<Boolean> = JsonMissing.of(),
    @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
) {

    fun data(): List<StatementLineItemResponse> = data.getRequired("data")

    fun hasMore(): Boolean = hasMore.getRequired("has_more")

    @JsonProperty("data")
    @ExcludeMissing
    fun _data(): JsonField<List<StatementLineItemResponse>> = data

    @JsonProperty("has_more") @ExcludeMissing fun _hasMore(): JsonField<Boolean> = hasMore

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    private var validated: Boolean = false

    fun validate(): StatementLineItems = apply {
        if (validated) {
            return@apply
        }

        data().forEach { it.validate() }
        hasMore()
        validated = true
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        fun builder() = Builder()
    }

    /** A builder for [StatementLineItems]. */
    class Builder internal constructor() {

        private var data: JsonField<MutableList<StatementLineItemResponse>>? = null
        private var hasMore: JsonField<Boolean>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(statementLineItems: StatementLineItems) = apply {
            data = statementLineItems.data.map { it.toMutableList() }
            hasMore = statementLineItems.hasMore
            additionalProperties = statementLineItems.additionalProperties.toMutableMap()
        }

        fun data(data: List<StatementLineItemResponse>) = data(JsonField.of(data))

        fun data(data: JsonField<List<StatementLineItemResponse>>) = apply {
            this.data = data.map { it.toMutableList() }
        }

        fun addData(data: StatementLineItemResponse) = apply {
            this.data =
                (this.data ?: JsonField.of(mutableListOf())).apply {
                    (asKnown()
                            ?: throw IllegalStateException(
                                "Field was set to non-list type: ${javaClass.simpleName}"
                            ))
                        .add(data)
                }
        }

        fun hasMore(hasMore: Boolean) = hasMore(JsonField.of(hasMore))

        fun hasMore(hasMore: JsonField<Boolean>) = apply { this.hasMore = hasMore }

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

        fun build(): StatementLineItems =
            StatementLineItems(
                checkRequired("data", data).map { it.toImmutable() },
                checkRequired("hasMore", hasMore),
                additionalProperties.toImmutable(),
            )
    }

    @NoAutoDetect
    class StatementLineItemResponse
    @JsonCreator
    private constructor(
        @JsonProperty("token")
        @ExcludeMissing
        private val token: JsonField<String> = JsonMissing.of(),
        @JsonProperty("amount")
        @ExcludeMissing
        private val amount: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("category")
        @ExcludeMissing
        private val category: JsonField<TransactionCategory> = JsonMissing.of(),
        @JsonProperty("created")
        @ExcludeMissing
        private val created: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("currency")
        @ExcludeMissing
        private val currency: JsonField<String> = JsonMissing.of(),
        @JsonProperty("effective_date")
        @ExcludeMissing
        private val effectiveDate: JsonField<LocalDate> = JsonMissing.of(),
        @JsonProperty("event_type")
        @ExcludeMissing
        private val eventType: JsonField<FinancialEventType> = JsonMissing.of(),
        @JsonProperty("financial_account_token")
        @ExcludeMissing
        private val financialAccountToken: JsonField<String> = JsonMissing.of(),
        @JsonProperty("financial_transaction_event_token")
        @ExcludeMissing
        private val financialTransactionEventToken: JsonField<String> = JsonMissing.of(),
        @JsonProperty("financial_transaction_token")
        @ExcludeMissing
        private val financialTransactionToken: JsonField<String> = JsonMissing.of(),
        @JsonProperty("card_token")
        @ExcludeMissing
        private val cardToken: JsonField<String> = JsonMissing.of(),
        @JsonProperty("descriptor")
        @ExcludeMissing
        private val descriptor: JsonField<String> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /** Globally unique identifier for a Statement Line Item */
        fun token(): String = token.getRequired("token")

        /** Transaction amount in cents */
        fun amount(): Long = amount.getRequired("amount")

        fun category(): TransactionCategory = category.getRequired("category")

        /** Timestamp of when the line item was generated */
        fun created(): OffsetDateTime = created.getRequired("created")

        /** 3-digit alphabetic ISO 4217 code for the settling currency of the transaction */
        fun currency(): String = currency.getRequired("currency")

        /** Date that the transaction effected the account balance */
        fun effectiveDate(): LocalDate = effectiveDate.getRequired("effective_date")

        fun eventType(): FinancialEventType = eventType.getRequired("event_type")

        /** Globally unique identifier for a financial account */
        fun financialAccountToken(): String =
            financialAccountToken.getRequired("financial_account_token")

        /** Globally unique identifier for a financial transaction event */
        fun financialTransactionEventToken(): String =
            financialTransactionEventToken.getRequired("financial_transaction_event_token")

        /** Globally unique identifier for a financial transaction */
        fun financialTransactionToken(): String =
            financialTransactionToken.getRequired("financial_transaction_token")

        /** Globally unique identifier for a card */
        fun cardToken(): String? = cardToken.getNullable("card_token")

        fun descriptor(): String? = descriptor.getNullable("descriptor")

        /** Globally unique identifier for a Statement Line Item */
        @JsonProperty("token") @ExcludeMissing fun _token(): JsonField<String> = token

        /** Transaction amount in cents */
        @JsonProperty("amount") @ExcludeMissing fun _amount(): JsonField<Long> = amount

        @JsonProperty("category")
        @ExcludeMissing
        fun _category(): JsonField<TransactionCategory> = category

        /** Timestamp of when the line item was generated */
        @JsonProperty("created") @ExcludeMissing fun _created(): JsonField<OffsetDateTime> = created

        /** 3-digit alphabetic ISO 4217 code for the settling currency of the transaction */
        @JsonProperty("currency") @ExcludeMissing fun _currency(): JsonField<String> = currency

        /** Date that the transaction effected the account balance */
        @JsonProperty("effective_date")
        @ExcludeMissing
        fun _effectiveDate(): JsonField<LocalDate> = effectiveDate

        @JsonProperty("event_type")
        @ExcludeMissing
        fun _eventType(): JsonField<FinancialEventType> = eventType

        /** Globally unique identifier for a financial account */
        @JsonProperty("financial_account_token")
        @ExcludeMissing
        fun _financialAccountToken(): JsonField<String> = financialAccountToken

        /** Globally unique identifier for a financial transaction event */
        @JsonProperty("financial_transaction_event_token")
        @ExcludeMissing
        fun _financialTransactionEventToken(): JsonField<String> = financialTransactionEventToken

        /** Globally unique identifier for a financial transaction */
        @JsonProperty("financial_transaction_token")
        @ExcludeMissing
        fun _financialTransactionToken(): JsonField<String> = financialTransactionToken

        /** Globally unique identifier for a card */
        @JsonProperty("card_token") @ExcludeMissing fun _cardToken(): JsonField<String> = cardToken

        @JsonProperty("descriptor")
        @ExcludeMissing
        fun _descriptor(): JsonField<String> = descriptor

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): StatementLineItemResponse = apply {
            if (validated) {
                return@apply
            }

            token()
            amount()
            category()
            created()
            currency()
            effectiveDate()
            eventType()
            financialAccountToken()
            financialTransactionEventToken()
            financialTransactionToken()
            cardToken()
            descriptor()
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            fun builder() = Builder()
        }

        /** A builder for [StatementLineItemResponse]. */
        class Builder internal constructor() {

            private var token: JsonField<String>? = null
            private var amount: JsonField<Long>? = null
            private var category: JsonField<TransactionCategory>? = null
            private var created: JsonField<OffsetDateTime>? = null
            private var currency: JsonField<String>? = null
            private var effectiveDate: JsonField<LocalDate>? = null
            private var eventType: JsonField<FinancialEventType>? = null
            private var financialAccountToken: JsonField<String>? = null
            private var financialTransactionEventToken: JsonField<String>? = null
            private var financialTransactionToken: JsonField<String>? = null
            private var cardToken: JsonField<String> = JsonMissing.of()
            private var descriptor: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(statementLineItemResponse: StatementLineItemResponse) = apply {
                token = statementLineItemResponse.token
                amount = statementLineItemResponse.amount
                category = statementLineItemResponse.category
                created = statementLineItemResponse.created
                currency = statementLineItemResponse.currency
                effectiveDate = statementLineItemResponse.effectiveDate
                eventType = statementLineItemResponse.eventType
                financialAccountToken = statementLineItemResponse.financialAccountToken
                financialTransactionEventToken =
                    statementLineItemResponse.financialTransactionEventToken
                financialTransactionToken = statementLineItemResponse.financialTransactionToken
                cardToken = statementLineItemResponse.cardToken
                descriptor = statementLineItemResponse.descriptor
                additionalProperties = statementLineItemResponse.additionalProperties.toMutableMap()
            }

            /** Globally unique identifier for a Statement Line Item */
            fun token(token: String) = token(JsonField.of(token))

            /** Globally unique identifier for a Statement Line Item */
            fun token(token: JsonField<String>) = apply { this.token = token }

            /** Transaction amount in cents */
            fun amount(amount: Long) = amount(JsonField.of(amount))

            /** Transaction amount in cents */
            fun amount(amount: JsonField<Long>) = apply { this.amount = amount }

            fun category(category: TransactionCategory) = category(JsonField.of(category))

            fun category(category: JsonField<TransactionCategory>) = apply {
                this.category = category
            }

            /** Timestamp of when the line item was generated */
            fun created(created: OffsetDateTime) = created(JsonField.of(created))

            /** Timestamp of when the line item was generated */
            fun created(created: JsonField<OffsetDateTime>) = apply { this.created = created }

            /** 3-digit alphabetic ISO 4217 code for the settling currency of the transaction */
            fun currency(currency: String) = currency(JsonField.of(currency))

            /** 3-digit alphabetic ISO 4217 code for the settling currency of the transaction */
            fun currency(currency: JsonField<String>) = apply { this.currency = currency }

            /** Date that the transaction effected the account balance */
            fun effectiveDate(effectiveDate: LocalDate) = effectiveDate(JsonField.of(effectiveDate))

            /** Date that the transaction effected the account balance */
            fun effectiveDate(effectiveDate: JsonField<LocalDate>) = apply {
                this.effectiveDate = effectiveDate
            }

            fun eventType(eventType: FinancialEventType) = eventType(JsonField.of(eventType))

            fun eventType(eventType: JsonField<FinancialEventType>) = apply {
                this.eventType = eventType
            }

            /** Globally unique identifier for a financial account */
            fun financialAccountToken(financialAccountToken: String) =
                financialAccountToken(JsonField.of(financialAccountToken))

            /** Globally unique identifier for a financial account */
            fun financialAccountToken(financialAccountToken: JsonField<String>) = apply {
                this.financialAccountToken = financialAccountToken
            }

            /** Globally unique identifier for a financial transaction event */
            fun financialTransactionEventToken(financialTransactionEventToken: String) =
                financialTransactionEventToken(JsonField.of(financialTransactionEventToken))

            /** Globally unique identifier for a financial transaction event */
            fun financialTransactionEventToken(financialTransactionEventToken: JsonField<String>) =
                apply {
                    this.financialTransactionEventToken = financialTransactionEventToken
                }

            /** Globally unique identifier for a financial transaction */
            fun financialTransactionToken(financialTransactionToken: String) =
                financialTransactionToken(JsonField.of(financialTransactionToken))

            /** Globally unique identifier for a financial transaction */
            fun financialTransactionToken(financialTransactionToken: JsonField<String>) = apply {
                this.financialTransactionToken = financialTransactionToken
            }

            /** Globally unique identifier for a card */
            fun cardToken(cardToken: String) = cardToken(JsonField.of(cardToken))

            /** Globally unique identifier for a card */
            fun cardToken(cardToken: JsonField<String>) = apply { this.cardToken = cardToken }

            fun descriptor(descriptor: String) = descriptor(JsonField.of(descriptor))

            fun descriptor(descriptor: JsonField<String>) = apply { this.descriptor = descriptor }

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

            fun build(): StatementLineItemResponse =
                StatementLineItemResponse(
                    checkRequired("token", token),
                    checkRequired("amount", amount),
                    checkRequired("category", category),
                    checkRequired("created", created),
                    checkRequired("currency", currency),
                    checkRequired("effectiveDate", effectiveDate),
                    checkRequired("eventType", eventType),
                    checkRequired("financialAccountToken", financialAccountToken),
                    checkRequired("financialTransactionEventToken", financialTransactionEventToken),
                    checkRequired("financialTransactionToken", financialTransactionToken),
                    cardToken,
                    descriptor,
                    additionalProperties.toImmutable(),
                )
        }

        class TransactionCategory
        @JsonCreator
        private constructor(private val value: JsonField<String>) : Enum {

            /**
             * Returns this class instance's raw value.
             *
             * This is usually only useful if this instance was deserialized from data that doesn't
             * match any known member, and you want to know that value. For example, if the SDK is
             * on an older version than the API, then the API may respond with new members that the
             * SDK is unaware of.
             */
            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                val ACH = of("ACH")

                val BALANCE_OR_FUNDING = of("BALANCE_OR_FUNDING")

                val CARD = of("CARD")

                val EXTERNAL_ACH = of("EXTERNAL_ACH")

                val EXTERNAL_CHECK = of("EXTERNAL_CHECK")

                val EXTERNAL_TRANSFER = of("EXTERNAL_TRANSFER")

                val EXTERNAL_WIRE = of("EXTERNAL_WIRE")

                val MANAGEMENT_ADJUSTMENT = of("MANAGEMENT_ADJUSTMENT")

                val MANAGEMENT_DISPUTE = of("MANAGEMENT_DISPUTE")

                val MANAGEMENT_FEE = of("MANAGEMENT_FEE")

                val MANAGEMENT_REWARD = of("MANAGEMENT_REWARD")

                fun of(value: String) = TransactionCategory(JsonField.of(value))
            }

            /** An enum containing [TransactionCategory]'s known values. */
            enum class Known {
                ACH,
                BALANCE_OR_FUNDING,
                CARD,
                EXTERNAL_ACH,
                EXTERNAL_CHECK,
                EXTERNAL_TRANSFER,
                EXTERNAL_WIRE,
                MANAGEMENT_ADJUSTMENT,
                MANAGEMENT_DISPUTE,
                MANAGEMENT_FEE,
                MANAGEMENT_REWARD,
            }

            /**
             * An enum containing [TransactionCategory]'s known values, as well as an [_UNKNOWN]
             * member.
             *
             * An instance of [TransactionCategory] can contain an unknown value in a couple of
             * cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                ACH,
                BALANCE_OR_FUNDING,
                CARD,
                EXTERNAL_ACH,
                EXTERNAL_CHECK,
                EXTERNAL_TRANSFER,
                EXTERNAL_WIRE,
                MANAGEMENT_ADJUSTMENT,
                MANAGEMENT_DISPUTE,
                MANAGEMENT_FEE,
                MANAGEMENT_REWARD,
                /**
                 * An enum member indicating that [TransactionCategory] was instantiated with an
                 * unknown value.
                 */
                _UNKNOWN,
            }

            /**
             * Returns an enum member corresponding to this class instance's value, or
             * [Value._UNKNOWN] if the class was instantiated with an unknown value.
             *
             * Use the [known] method instead if you're certain the value is always known or if you
             * want to throw for the unknown case.
             */
            fun value(): Value =
                when (this) {
                    ACH -> Value.ACH
                    BALANCE_OR_FUNDING -> Value.BALANCE_OR_FUNDING
                    CARD -> Value.CARD
                    EXTERNAL_ACH -> Value.EXTERNAL_ACH
                    EXTERNAL_CHECK -> Value.EXTERNAL_CHECK
                    EXTERNAL_TRANSFER -> Value.EXTERNAL_TRANSFER
                    EXTERNAL_WIRE -> Value.EXTERNAL_WIRE
                    MANAGEMENT_ADJUSTMENT -> Value.MANAGEMENT_ADJUSTMENT
                    MANAGEMENT_DISPUTE -> Value.MANAGEMENT_DISPUTE
                    MANAGEMENT_FEE -> Value.MANAGEMENT_FEE
                    MANAGEMENT_REWARD -> Value.MANAGEMENT_REWARD
                    else -> Value._UNKNOWN
                }

            /**
             * Returns an enum member corresponding to this class instance's value.
             *
             * Use the [value] method instead if you're uncertain the value is always known and
             * don't want to throw for the unknown case.
             *
             * @throws LithicInvalidDataException if this class instance's value is a not a known
             *   member.
             */
            fun known(): Known =
                when (this) {
                    ACH -> Known.ACH
                    BALANCE_OR_FUNDING -> Known.BALANCE_OR_FUNDING
                    CARD -> Known.CARD
                    EXTERNAL_ACH -> Known.EXTERNAL_ACH
                    EXTERNAL_CHECK -> Known.EXTERNAL_CHECK
                    EXTERNAL_TRANSFER -> Known.EXTERNAL_TRANSFER
                    EXTERNAL_WIRE -> Known.EXTERNAL_WIRE
                    MANAGEMENT_ADJUSTMENT -> Known.MANAGEMENT_ADJUSTMENT
                    MANAGEMENT_DISPUTE -> Known.MANAGEMENT_DISPUTE
                    MANAGEMENT_FEE -> Known.MANAGEMENT_FEE
                    MANAGEMENT_REWARD -> Known.MANAGEMENT_REWARD
                    else -> throw LithicInvalidDataException("Unknown TransactionCategory: $value")
                }

            /**
             * Returns this class instance's primitive wire representation.
             *
             * This differs from the [toString] method because that method is primarily for
             * debugging and generally doesn't throw.
             *
             * @throws LithicInvalidDataException if this class instance's value does not have the
             *   expected primitive type.
             */
            fun asString(): String =
                _value().asString() ?: throw LithicInvalidDataException("Value is not a String")

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is TransactionCategory && value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        class FinancialEventType
        @JsonCreator
        private constructor(private val value: JsonField<String>) : Enum {

            /**
             * Returns this class instance's raw value.
             *
             * This is usually only useful if this instance was deserialized from data that doesn't
             * match any known member, and you want to know that value. For example, if the SDK is
             * on an older version than the API, then the API may respond with new members that the
             * SDK is unaware of.
             */
            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                val ACH_ORIGINATION_CANCELLED = of("ACH_ORIGINATION_CANCELLED")

                val ACH_ORIGINATION_INITIATED = of("ACH_ORIGINATION_INITIATED")

                val ACH_ORIGINATION_PROCESSED = of("ACH_ORIGINATION_PROCESSED")

                val ACH_ORIGINATION_RELEASED = of("ACH_ORIGINATION_RELEASED")

                val ACH_ORIGINATION_REVIEWED = of("ACH_ORIGINATION_REVIEWED")

                val ACH_ORIGINATION_SETTLED = of("ACH_ORIGINATION_SETTLED")

                val ACH_RECEIPT_PROCESSED = of("ACH_RECEIPT_PROCESSED")

                val ACH_RECEIPT_SETTLED = of("ACH_RECEIPT_SETTLED")

                val ACH_RETURN_INITIATED = of("ACH_RETURN_INITIATED")

                val ACH_RETURN_PROCESSED = of("ACH_RETURN_PROCESSED")

                val ACH_RETURN_SETTLED = of("ACH_RETURN_SETTLED")

                val AUTHORIZATION = of("AUTHORIZATION")

                val AUTHORIZATION_ADVICE = of("AUTHORIZATION_ADVICE")

                val AUTHORIZATION_EXPIRY = of("AUTHORIZATION_EXPIRY")

                val AUTHORIZATION_REVERSAL = of("AUTHORIZATION_REVERSAL")

                val BALANCE_INQUIRY = of("BALANCE_INQUIRY")

                val BILLING_ERROR = of("BILLING_ERROR")

                val BILLING_ERROR_REVERSAL = of("BILLING_ERROR_REVERSAL")

                val CARD_TO_CARD = of("CARD_TO_CARD")

                val CASH_BACK = of("CASH_BACK")

                val CASH_BACK_REVERSAL = of("CASH_BACK_REVERSAL")

                val CLEARING = of("CLEARING")

                val CORRECTION_CREDIT = of("CORRECTION_CREDIT")

                val CORRECTION_DEBIT = of("CORRECTION_DEBIT")

                val CREDIT_AUTHORIZATION = of("CREDIT_AUTHORIZATION")

                val CREDIT_AUTHORIZATION_ADVICE = of("CREDIT_AUTHORIZATION_ADVICE")

                val CURRENCY_CONVERSION = of("CURRENCY_CONVERSION")

                val CURRENCY_CONVERSION_REVERSAL = of("CURRENCY_CONVERSION_REVERSAL")

                val DISPUTE_WON = of("DISPUTE_WON")

                val EXTERNAL_ACH_CANCELED = of("EXTERNAL_ACH_CANCELED")

                val EXTERNAL_ACH_INITIATED = of("EXTERNAL_ACH_INITIATED")

                val EXTERNAL_ACH_RELEASED = of("EXTERNAL_ACH_RELEASED")

                val EXTERNAL_ACH_REVERSED = of("EXTERNAL_ACH_REVERSED")

                val EXTERNAL_ACH_SETTLED = of("EXTERNAL_ACH_SETTLED")

                val EXTERNAL_CHECK_CANCELED = of("EXTERNAL_CHECK_CANCELED")

                val EXTERNAL_CHECK_INITIATED = of("EXTERNAL_CHECK_INITIATED")

                val EXTERNAL_CHECK_RELEASED = of("EXTERNAL_CHECK_RELEASED")

                val EXTERNAL_CHECK_REVERSED = of("EXTERNAL_CHECK_REVERSED")

                val EXTERNAL_CHECK_SETTLED = of("EXTERNAL_CHECK_SETTLED")

                val EXTERNAL_TRANSFER_CANCELED = of("EXTERNAL_TRANSFER_CANCELED")

                val EXTERNAL_TRANSFER_INITIATED = of("EXTERNAL_TRANSFER_INITIATED")

                val EXTERNAL_TRANSFER_RELEASED = of("EXTERNAL_TRANSFER_RELEASED")

                val EXTERNAL_TRANSFER_REVERSED = of("EXTERNAL_TRANSFER_REVERSED")

                val EXTERNAL_TRANSFER_SETTLED = of("EXTERNAL_TRANSFER_SETTLED")

                val EXTERNAL_WIRE_CANCELED = of("EXTERNAL_WIRE_CANCELED")

                val EXTERNAL_WIRE_INITIATED = of("EXTERNAL_WIRE_INITIATED")

                val EXTERNAL_WIRE_RELEASED = of("EXTERNAL_WIRE_RELEASED")

                val EXTERNAL_WIRE_REVERSED = of("EXTERNAL_WIRE_REVERSED")

                val EXTERNAL_WIRE_SETTLED = of("EXTERNAL_WIRE_SETTLED")

                val FINANCIAL_AUTHORIZATION = of("FINANCIAL_AUTHORIZATION")

                val FINANCIAL_CREDIT_AUTHORIZATION = of("FINANCIAL_CREDIT_AUTHORIZATION")

                val INTEREST = of("INTEREST")

                val INTEREST_REVERSAL = of("INTEREST_REVERSAL")

                val INTERNAL_ADJUSTMENT = of("INTERNAL_ADJUSTMENT")

                val LATE_PAYMENT = of("LATE_PAYMENT")

                val LATE_PAYMENT_REVERSAL = of("LATE_PAYMENT_REVERSAL")

                val PROVISIONAL_CREDIT = of("PROVISIONAL_CREDIT")

                val PROVISIONAL_CREDIT_REVERSAL = of("PROVISIONAL_CREDIT_REVERSAL")

                val RETURN = of("RETURN")

                val RETURN_REVERSAL = of("RETURN_REVERSAL")

                val TRANSFER = of("TRANSFER")

                val TRANSFER_INSUFFICIENT_FUNDS = of("TRANSFER_INSUFFICIENT_FUNDS")

                val RETURNED_PAYMENT = of("RETURNED_PAYMENT")

                val RETURNED_PAYMENT_REVERSAL = of("RETURNED_PAYMENT_REVERSAL")

                fun of(value: String) = FinancialEventType(JsonField.of(value))
            }

            /** An enum containing [FinancialEventType]'s known values. */
            enum class Known {
                ACH_ORIGINATION_CANCELLED,
                ACH_ORIGINATION_INITIATED,
                ACH_ORIGINATION_PROCESSED,
                ACH_ORIGINATION_RELEASED,
                ACH_ORIGINATION_REVIEWED,
                ACH_ORIGINATION_SETTLED,
                ACH_RECEIPT_PROCESSED,
                ACH_RECEIPT_SETTLED,
                ACH_RETURN_INITIATED,
                ACH_RETURN_PROCESSED,
                ACH_RETURN_SETTLED,
                AUTHORIZATION,
                AUTHORIZATION_ADVICE,
                AUTHORIZATION_EXPIRY,
                AUTHORIZATION_REVERSAL,
                BALANCE_INQUIRY,
                BILLING_ERROR,
                BILLING_ERROR_REVERSAL,
                CARD_TO_CARD,
                CASH_BACK,
                CASH_BACK_REVERSAL,
                CLEARING,
                CORRECTION_CREDIT,
                CORRECTION_DEBIT,
                CREDIT_AUTHORIZATION,
                CREDIT_AUTHORIZATION_ADVICE,
                CURRENCY_CONVERSION,
                CURRENCY_CONVERSION_REVERSAL,
                DISPUTE_WON,
                EXTERNAL_ACH_CANCELED,
                EXTERNAL_ACH_INITIATED,
                EXTERNAL_ACH_RELEASED,
                EXTERNAL_ACH_REVERSED,
                EXTERNAL_ACH_SETTLED,
                EXTERNAL_CHECK_CANCELED,
                EXTERNAL_CHECK_INITIATED,
                EXTERNAL_CHECK_RELEASED,
                EXTERNAL_CHECK_REVERSED,
                EXTERNAL_CHECK_SETTLED,
                EXTERNAL_TRANSFER_CANCELED,
                EXTERNAL_TRANSFER_INITIATED,
                EXTERNAL_TRANSFER_RELEASED,
                EXTERNAL_TRANSFER_REVERSED,
                EXTERNAL_TRANSFER_SETTLED,
                EXTERNAL_WIRE_CANCELED,
                EXTERNAL_WIRE_INITIATED,
                EXTERNAL_WIRE_RELEASED,
                EXTERNAL_WIRE_REVERSED,
                EXTERNAL_WIRE_SETTLED,
                FINANCIAL_AUTHORIZATION,
                FINANCIAL_CREDIT_AUTHORIZATION,
                INTEREST,
                INTEREST_REVERSAL,
                INTERNAL_ADJUSTMENT,
                LATE_PAYMENT,
                LATE_PAYMENT_REVERSAL,
                PROVISIONAL_CREDIT,
                PROVISIONAL_CREDIT_REVERSAL,
                RETURN,
                RETURN_REVERSAL,
                TRANSFER,
                TRANSFER_INSUFFICIENT_FUNDS,
                RETURNED_PAYMENT,
                RETURNED_PAYMENT_REVERSAL,
            }

            /**
             * An enum containing [FinancialEventType]'s known values, as well as an [_UNKNOWN]
             * member.
             *
             * An instance of [FinancialEventType] can contain an unknown value in a couple of
             * cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                ACH_ORIGINATION_CANCELLED,
                ACH_ORIGINATION_INITIATED,
                ACH_ORIGINATION_PROCESSED,
                ACH_ORIGINATION_RELEASED,
                ACH_ORIGINATION_REVIEWED,
                ACH_ORIGINATION_SETTLED,
                ACH_RECEIPT_PROCESSED,
                ACH_RECEIPT_SETTLED,
                ACH_RETURN_INITIATED,
                ACH_RETURN_PROCESSED,
                ACH_RETURN_SETTLED,
                AUTHORIZATION,
                AUTHORIZATION_ADVICE,
                AUTHORIZATION_EXPIRY,
                AUTHORIZATION_REVERSAL,
                BALANCE_INQUIRY,
                BILLING_ERROR,
                BILLING_ERROR_REVERSAL,
                CARD_TO_CARD,
                CASH_BACK,
                CASH_BACK_REVERSAL,
                CLEARING,
                CORRECTION_CREDIT,
                CORRECTION_DEBIT,
                CREDIT_AUTHORIZATION,
                CREDIT_AUTHORIZATION_ADVICE,
                CURRENCY_CONVERSION,
                CURRENCY_CONVERSION_REVERSAL,
                DISPUTE_WON,
                EXTERNAL_ACH_CANCELED,
                EXTERNAL_ACH_INITIATED,
                EXTERNAL_ACH_RELEASED,
                EXTERNAL_ACH_REVERSED,
                EXTERNAL_ACH_SETTLED,
                EXTERNAL_CHECK_CANCELED,
                EXTERNAL_CHECK_INITIATED,
                EXTERNAL_CHECK_RELEASED,
                EXTERNAL_CHECK_REVERSED,
                EXTERNAL_CHECK_SETTLED,
                EXTERNAL_TRANSFER_CANCELED,
                EXTERNAL_TRANSFER_INITIATED,
                EXTERNAL_TRANSFER_RELEASED,
                EXTERNAL_TRANSFER_REVERSED,
                EXTERNAL_TRANSFER_SETTLED,
                EXTERNAL_WIRE_CANCELED,
                EXTERNAL_WIRE_INITIATED,
                EXTERNAL_WIRE_RELEASED,
                EXTERNAL_WIRE_REVERSED,
                EXTERNAL_WIRE_SETTLED,
                FINANCIAL_AUTHORIZATION,
                FINANCIAL_CREDIT_AUTHORIZATION,
                INTEREST,
                INTEREST_REVERSAL,
                INTERNAL_ADJUSTMENT,
                LATE_PAYMENT,
                LATE_PAYMENT_REVERSAL,
                PROVISIONAL_CREDIT,
                PROVISIONAL_CREDIT_REVERSAL,
                RETURN,
                RETURN_REVERSAL,
                TRANSFER,
                TRANSFER_INSUFFICIENT_FUNDS,
                RETURNED_PAYMENT,
                RETURNED_PAYMENT_REVERSAL,
                /**
                 * An enum member indicating that [FinancialEventType] was instantiated with an
                 * unknown value.
                 */
                _UNKNOWN,
            }

            /**
             * Returns an enum member corresponding to this class instance's value, or
             * [Value._UNKNOWN] if the class was instantiated with an unknown value.
             *
             * Use the [known] method instead if you're certain the value is always known or if you
             * want to throw for the unknown case.
             */
            fun value(): Value =
                when (this) {
                    ACH_ORIGINATION_CANCELLED -> Value.ACH_ORIGINATION_CANCELLED
                    ACH_ORIGINATION_INITIATED -> Value.ACH_ORIGINATION_INITIATED
                    ACH_ORIGINATION_PROCESSED -> Value.ACH_ORIGINATION_PROCESSED
                    ACH_ORIGINATION_RELEASED -> Value.ACH_ORIGINATION_RELEASED
                    ACH_ORIGINATION_REVIEWED -> Value.ACH_ORIGINATION_REVIEWED
                    ACH_ORIGINATION_SETTLED -> Value.ACH_ORIGINATION_SETTLED
                    ACH_RECEIPT_PROCESSED -> Value.ACH_RECEIPT_PROCESSED
                    ACH_RECEIPT_SETTLED -> Value.ACH_RECEIPT_SETTLED
                    ACH_RETURN_INITIATED -> Value.ACH_RETURN_INITIATED
                    ACH_RETURN_PROCESSED -> Value.ACH_RETURN_PROCESSED
                    ACH_RETURN_SETTLED -> Value.ACH_RETURN_SETTLED
                    AUTHORIZATION -> Value.AUTHORIZATION
                    AUTHORIZATION_ADVICE -> Value.AUTHORIZATION_ADVICE
                    AUTHORIZATION_EXPIRY -> Value.AUTHORIZATION_EXPIRY
                    AUTHORIZATION_REVERSAL -> Value.AUTHORIZATION_REVERSAL
                    BALANCE_INQUIRY -> Value.BALANCE_INQUIRY
                    BILLING_ERROR -> Value.BILLING_ERROR
                    BILLING_ERROR_REVERSAL -> Value.BILLING_ERROR_REVERSAL
                    CARD_TO_CARD -> Value.CARD_TO_CARD
                    CASH_BACK -> Value.CASH_BACK
                    CASH_BACK_REVERSAL -> Value.CASH_BACK_REVERSAL
                    CLEARING -> Value.CLEARING
                    CORRECTION_CREDIT -> Value.CORRECTION_CREDIT
                    CORRECTION_DEBIT -> Value.CORRECTION_DEBIT
                    CREDIT_AUTHORIZATION -> Value.CREDIT_AUTHORIZATION
                    CREDIT_AUTHORIZATION_ADVICE -> Value.CREDIT_AUTHORIZATION_ADVICE
                    CURRENCY_CONVERSION -> Value.CURRENCY_CONVERSION
                    CURRENCY_CONVERSION_REVERSAL -> Value.CURRENCY_CONVERSION_REVERSAL
                    DISPUTE_WON -> Value.DISPUTE_WON
                    EXTERNAL_ACH_CANCELED -> Value.EXTERNAL_ACH_CANCELED
                    EXTERNAL_ACH_INITIATED -> Value.EXTERNAL_ACH_INITIATED
                    EXTERNAL_ACH_RELEASED -> Value.EXTERNAL_ACH_RELEASED
                    EXTERNAL_ACH_REVERSED -> Value.EXTERNAL_ACH_REVERSED
                    EXTERNAL_ACH_SETTLED -> Value.EXTERNAL_ACH_SETTLED
                    EXTERNAL_CHECK_CANCELED -> Value.EXTERNAL_CHECK_CANCELED
                    EXTERNAL_CHECK_INITIATED -> Value.EXTERNAL_CHECK_INITIATED
                    EXTERNAL_CHECK_RELEASED -> Value.EXTERNAL_CHECK_RELEASED
                    EXTERNAL_CHECK_REVERSED -> Value.EXTERNAL_CHECK_REVERSED
                    EXTERNAL_CHECK_SETTLED -> Value.EXTERNAL_CHECK_SETTLED
                    EXTERNAL_TRANSFER_CANCELED -> Value.EXTERNAL_TRANSFER_CANCELED
                    EXTERNAL_TRANSFER_INITIATED -> Value.EXTERNAL_TRANSFER_INITIATED
                    EXTERNAL_TRANSFER_RELEASED -> Value.EXTERNAL_TRANSFER_RELEASED
                    EXTERNAL_TRANSFER_REVERSED -> Value.EXTERNAL_TRANSFER_REVERSED
                    EXTERNAL_TRANSFER_SETTLED -> Value.EXTERNAL_TRANSFER_SETTLED
                    EXTERNAL_WIRE_CANCELED -> Value.EXTERNAL_WIRE_CANCELED
                    EXTERNAL_WIRE_INITIATED -> Value.EXTERNAL_WIRE_INITIATED
                    EXTERNAL_WIRE_RELEASED -> Value.EXTERNAL_WIRE_RELEASED
                    EXTERNAL_WIRE_REVERSED -> Value.EXTERNAL_WIRE_REVERSED
                    EXTERNAL_WIRE_SETTLED -> Value.EXTERNAL_WIRE_SETTLED
                    FINANCIAL_AUTHORIZATION -> Value.FINANCIAL_AUTHORIZATION
                    FINANCIAL_CREDIT_AUTHORIZATION -> Value.FINANCIAL_CREDIT_AUTHORIZATION
                    INTEREST -> Value.INTEREST
                    INTEREST_REVERSAL -> Value.INTEREST_REVERSAL
                    INTERNAL_ADJUSTMENT -> Value.INTERNAL_ADJUSTMENT
                    LATE_PAYMENT -> Value.LATE_PAYMENT
                    LATE_PAYMENT_REVERSAL -> Value.LATE_PAYMENT_REVERSAL
                    PROVISIONAL_CREDIT -> Value.PROVISIONAL_CREDIT
                    PROVISIONAL_CREDIT_REVERSAL -> Value.PROVISIONAL_CREDIT_REVERSAL
                    RETURN -> Value.RETURN
                    RETURN_REVERSAL -> Value.RETURN_REVERSAL
                    TRANSFER -> Value.TRANSFER
                    TRANSFER_INSUFFICIENT_FUNDS -> Value.TRANSFER_INSUFFICIENT_FUNDS
                    RETURNED_PAYMENT -> Value.RETURNED_PAYMENT
                    RETURNED_PAYMENT_REVERSAL -> Value.RETURNED_PAYMENT_REVERSAL
                    else -> Value._UNKNOWN
                }

            /**
             * Returns an enum member corresponding to this class instance's value.
             *
             * Use the [value] method instead if you're uncertain the value is always known and
             * don't want to throw for the unknown case.
             *
             * @throws LithicInvalidDataException if this class instance's value is a not a known
             *   member.
             */
            fun known(): Known =
                when (this) {
                    ACH_ORIGINATION_CANCELLED -> Known.ACH_ORIGINATION_CANCELLED
                    ACH_ORIGINATION_INITIATED -> Known.ACH_ORIGINATION_INITIATED
                    ACH_ORIGINATION_PROCESSED -> Known.ACH_ORIGINATION_PROCESSED
                    ACH_ORIGINATION_RELEASED -> Known.ACH_ORIGINATION_RELEASED
                    ACH_ORIGINATION_REVIEWED -> Known.ACH_ORIGINATION_REVIEWED
                    ACH_ORIGINATION_SETTLED -> Known.ACH_ORIGINATION_SETTLED
                    ACH_RECEIPT_PROCESSED -> Known.ACH_RECEIPT_PROCESSED
                    ACH_RECEIPT_SETTLED -> Known.ACH_RECEIPT_SETTLED
                    ACH_RETURN_INITIATED -> Known.ACH_RETURN_INITIATED
                    ACH_RETURN_PROCESSED -> Known.ACH_RETURN_PROCESSED
                    ACH_RETURN_SETTLED -> Known.ACH_RETURN_SETTLED
                    AUTHORIZATION -> Known.AUTHORIZATION
                    AUTHORIZATION_ADVICE -> Known.AUTHORIZATION_ADVICE
                    AUTHORIZATION_EXPIRY -> Known.AUTHORIZATION_EXPIRY
                    AUTHORIZATION_REVERSAL -> Known.AUTHORIZATION_REVERSAL
                    BALANCE_INQUIRY -> Known.BALANCE_INQUIRY
                    BILLING_ERROR -> Known.BILLING_ERROR
                    BILLING_ERROR_REVERSAL -> Known.BILLING_ERROR_REVERSAL
                    CARD_TO_CARD -> Known.CARD_TO_CARD
                    CASH_BACK -> Known.CASH_BACK
                    CASH_BACK_REVERSAL -> Known.CASH_BACK_REVERSAL
                    CLEARING -> Known.CLEARING
                    CORRECTION_CREDIT -> Known.CORRECTION_CREDIT
                    CORRECTION_DEBIT -> Known.CORRECTION_DEBIT
                    CREDIT_AUTHORIZATION -> Known.CREDIT_AUTHORIZATION
                    CREDIT_AUTHORIZATION_ADVICE -> Known.CREDIT_AUTHORIZATION_ADVICE
                    CURRENCY_CONVERSION -> Known.CURRENCY_CONVERSION
                    CURRENCY_CONVERSION_REVERSAL -> Known.CURRENCY_CONVERSION_REVERSAL
                    DISPUTE_WON -> Known.DISPUTE_WON
                    EXTERNAL_ACH_CANCELED -> Known.EXTERNAL_ACH_CANCELED
                    EXTERNAL_ACH_INITIATED -> Known.EXTERNAL_ACH_INITIATED
                    EXTERNAL_ACH_RELEASED -> Known.EXTERNAL_ACH_RELEASED
                    EXTERNAL_ACH_REVERSED -> Known.EXTERNAL_ACH_REVERSED
                    EXTERNAL_ACH_SETTLED -> Known.EXTERNAL_ACH_SETTLED
                    EXTERNAL_CHECK_CANCELED -> Known.EXTERNAL_CHECK_CANCELED
                    EXTERNAL_CHECK_INITIATED -> Known.EXTERNAL_CHECK_INITIATED
                    EXTERNAL_CHECK_RELEASED -> Known.EXTERNAL_CHECK_RELEASED
                    EXTERNAL_CHECK_REVERSED -> Known.EXTERNAL_CHECK_REVERSED
                    EXTERNAL_CHECK_SETTLED -> Known.EXTERNAL_CHECK_SETTLED
                    EXTERNAL_TRANSFER_CANCELED -> Known.EXTERNAL_TRANSFER_CANCELED
                    EXTERNAL_TRANSFER_INITIATED -> Known.EXTERNAL_TRANSFER_INITIATED
                    EXTERNAL_TRANSFER_RELEASED -> Known.EXTERNAL_TRANSFER_RELEASED
                    EXTERNAL_TRANSFER_REVERSED -> Known.EXTERNAL_TRANSFER_REVERSED
                    EXTERNAL_TRANSFER_SETTLED -> Known.EXTERNAL_TRANSFER_SETTLED
                    EXTERNAL_WIRE_CANCELED -> Known.EXTERNAL_WIRE_CANCELED
                    EXTERNAL_WIRE_INITIATED -> Known.EXTERNAL_WIRE_INITIATED
                    EXTERNAL_WIRE_RELEASED -> Known.EXTERNAL_WIRE_RELEASED
                    EXTERNAL_WIRE_REVERSED -> Known.EXTERNAL_WIRE_REVERSED
                    EXTERNAL_WIRE_SETTLED -> Known.EXTERNAL_WIRE_SETTLED
                    FINANCIAL_AUTHORIZATION -> Known.FINANCIAL_AUTHORIZATION
                    FINANCIAL_CREDIT_AUTHORIZATION -> Known.FINANCIAL_CREDIT_AUTHORIZATION
                    INTEREST -> Known.INTEREST
                    INTEREST_REVERSAL -> Known.INTEREST_REVERSAL
                    INTERNAL_ADJUSTMENT -> Known.INTERNAL_ADJUSTMENT
                    LATE_PAYMENT -> Known.LATE_PAYMENT
                    LATE_PAYMENT_REVERSAL -> Known.LATE_PAYMENT_REVERSAL
                    PROVISIONAL_CREDIT -> Known.PROVISIONAL_CREDIT
                    PROVISIONAL_CREDIT_REVERSAL -> Known.PROVISIONAL_CREDIT_REVERSAL
                    RETURN -> Known.RETURN
                    RETURN_REVERSAL -> Known.RETURN_REVERSAL
                    TRANSFER -> Known.TRANSFER
                    TRANSFER_INSUFFICIENT_FUNDS -> Known.TRANSFER_INSUFFICIENT_FUNDS
                    RETURNED_PAYMENT -> Known.RETURNED_PAYMENT
                    RETURNED_PAYMENT_REVERSAL -> Known.RETURNED_PAYMENT_REVERSAL
                    else -> throw LithicInvalidDataException("Unknown FinancialEventType: $value")
                }

            /**
             * Returns this class instance's primitive wire representation.
             *
             * This differs from the [toString] method because that method is primarily for
             * debugging and generally doesn't throw.
             *
             * @throws LithicInvalidDataException if this class instance's value does not have the
             *   expected primitive type.
             */
            fun asString(): String =
                _value().asString() ?: throw LithicInvalidDataException("Value is not a String")

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is FinancialEventType && value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is StatementLineItemResponse && token == other.token && amount == other.amount && category == other.category && created == other.created && currency == other.currency && effectiveDate == other.effectiveDate && eventType == other.eventType && financialAccountToken == other.financialAccountToken && financialTransactionEventToken == other.financialTransactionEventToken && financialTransactionToken == other.financialTransactionToken && cardToken == other.cardToken && descriptor == other.descriptor && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(token, amount, category, created, currency, effectiveDate, eventType, financialAccountToken, financialTransactionEventToken, financialTransactionToken, cardToken, descriptor, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "StatementLineItemResponse{token=$token, amount=$amount, category=$category, created=$created, currency=$currency, effectiveDate=$effectiveDate, eventType=$eventType, financialAccountToken=$financialAccountToken, financialTransactionEventToken=$financialTransactionEventToken, financialTransactionToken=$financialTransactionToken, cardToken=$cardToken, descriptor=$descriptor, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is StatementLineItems && data == other.data && hasMore == other.hasMore && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(data, hasMore, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "StatementLineItems{data=$data, hasMore=$hasMore, additionalProperties=$additionalProperties}"
}
