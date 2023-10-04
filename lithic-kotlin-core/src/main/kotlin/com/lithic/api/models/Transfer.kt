// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.lithic.api.core.ExcludeMissing
import com.lithic.api.core.JsonField
import com.lithic.api.core.JsonMissing
import com.lithic.api.core.JsonValue
import com.lithic.api.core.NoAutoDetect
import com.lithic.api.core.toUnmodifiable
import com.lithic.api.errors.LithicInvalidDataException
import java.time.OffsetDateTime
import java.util.Objects

@JsonDeserialize(builder = Transfer.Builder::class)
@NoAutoDetect
class Transfer
private constructor(
    private val category: JsonField<Category>,
    private val created: JsonField<OffsetDateTime>,
    private val currency: JsonField<String>,
    private val descriptor: JsonField<String>,
    private val events: JsonField<List<FinancialEvent>>,
    private val pendingAmount: JsonField<Long>,
    private val result: JsonField<Result>,
    private val settledAmount: JsonField<Long>,
    private val status: JsonField<Status>,
    private val token: JsonField<String>,
    private val updated: JsonField<OffsetDateTime>,
    private val fromBalance: JsonField<List<Balance>>,
    private val toBalance: JsonField<List<Balance>>,
    private val additionalProperties: Map<String, JsonValue>,
) {

    private var validated: Boolean = false

    private var hashCode: Int = 0

    /**
     * Status types:
     *
     * - `TRANSFER` - Internal transfer of funds between financial accounts in your program.
     */
    fun category(): Category? = category.getNullable("category")

    /** Date and time when the transfer occurred. UTC time zone. */
    fun created(): OffsetDateTime? = created.getNullable("created")

    /** 3-digit alphabetic ISO 4217 code for the settling currency of the transaction. */
    fun currency(): String? = currency.getNullable("currency")

    /** A string that provides a description of the transfer; may be useful to display to users. */
    fun descriptor(): String? = descriptor.getNullable("descriptor")

    /** A list of all financial events that have modified this trasnfer. */
    fun events(): List<FinancialEvent>? = events.getNullable("events")

    /**
     * Pending amount of the transaction in the currency's smallest unit (e.g., cents), including
     * any acquirer fees. The value of this field will go to zero over time once the financial
     * transaction is settled.
     */
    fun pendingAmount(): Long? = pendingAmount.getNullable("pending_amount")

    /**
     * APPROVED transactions were successful while DECLINED transactions were declined by user,
     * Lithic, or the network.
     */
    fun result(): Result? = result.getNullable("result")

    /**
     * Amount of the transaction that has been settled in the currency's smallest unit (e.g.,
     * cents).
     */
    fun settledAmount(): Long? = settledAmount.getNullable("settled_amount")

    /**
     * Status types:
     *
     * - `DECLINED` - The transfer was declined.
     * - `EXPIRED` - The transfer was held in pending for too long and expired.
     * - `PENDING` - The transfer is pending release from a hold.
     * - `SETTLED` - The transfer is completed.
     * - `VOIDED` - The transfer was reversed before it settled.
     */
    fun status(): Status? = status.getNullable("status")

    /** Globally unique identifier for the transfer event. */
    fun token(): String? = token.getNullable("token")

    /** Date and time when the financial transaction was last updated. UTC time zone. */
    fun updated(): OffsetDateTime? = updated.getNullable("updated")

    /** The updated balance of the sending financial account. */
    fun fromBalance(): List<Balance>? = fromBalance.getNullable("from_balance")

    /** The updated balance of the receiving financial account. */
    fun toBalance(): List<Balance>? = toBalance.getNullable("to_balance")

    /**
     * Status types:
     *
     * - `TRANSFER` - Internal transfer of funds between financial accounts in your program.
     */
    @JsonProperty("category") @ExcludeMissing fun _category() = category

    /** Date and time when the transfer occurred. UTC time zone. */
    @JsonProperty("created") @ExcludeMissing fun _created() = created

    /** 3-digit alphabetic ISO 4217 code for the settling currency of the transaction. */
    @JsonProperty("currency") @ExcludeMissing fun _currency() = currency

    /** A string that provides a description of the transfer; may be useful to display to users. */
    @JsonProperty("descriptor") @ExcludeMissing fun _descriptor() = descriptor

    /** A list of all financial events that have modified this trasnfer. */
    @JsonProperty("events") @ExcludeMissing fun _events() = events

    /**
     * Pending amount of the transaction in the currency's smallest unit (e.g., cents), including
     * any acquirer fees. The value of this field will go to zero over time once the financial
     * transaction is settled.
     */
    @JsonProperty("pending_amount") @ExcludeMissing fun _pendingAmount() = pendingAmount

    /**
     * APPROVED transactions were successful while DECLINED transactions were declined by user,
     * Lithic, or the network.
     */
    @JsonProperty("result") @ExcludeMissing fun _result() = result

    /**
     * Amount of the transaction that has been settled in the currency's smallest unit (e.g.,
     * cents).
     */
    @JsonProperty("settled_amount") @ExcludeMissing fun _settledAmount() = settledAmount

    /**
     * Status types:
     *
     * - `DECLINED` - The transfer was declined.
     * - `EXPIRED` - The transfer was held in pending for too long and expired.
     * - `PENDING` - The transfer is pending release from a hold.
     * - `SETTLED` - The transfer is completed.
     * - `VOIDED` - The transfer was reversed before it settled.
     */
    @JsonProperty("status") @ExcludeMissing fun _status() = status

    /** Globally unique identifier for the transfer event. */
    @JsonProperty("token") @ExcludeMissing fun _token() = token

    /** Date and time when the financial transaction was last updated. UTC time zone. */
    @JsonProperty("updated") @ExcludeMissing fun _updated() = updated

    /** The updated balance of the sending financial account. */
    @JsonProperty("from_balance") @ExcludeMissing fun _fromBalance() = fromBalance

    /** The updated balance of the receiving financial account. */
    @JsonProperty("to_balance") @ExcludeMissing fun _toBalance() = toBalance

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    fun validate(): Transfer = apply {
        if (!validated) {
            category()
            created()
            currency()
            descriptor()
            events()?.forEach { it.validate() }
            pendingAmount()
            result()
            settledAmount()
            status()
            token()
            updated()
            fromBalance()?.forEach { it.validate() }
            toBalance()?.forEach { it.validate() }
            validated = true
        }
    }

    fun toBuilder() = Builder().from(this)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is Transfer &&
            this.category == other.category &&
            this.created == other.created &&
            this.currency == other.currency &&
            this.descriptor == other.descriptor &&
            this.events == other.events &&
            this.pendingAmount == other.pendingAmount &&
            this.result == other.result &&
            this.settledAmount == other.settledAmount &&
            this.status == other.status &&
            this.token == other.token &&
            this.updated == other.updated &&
            this.fromBalance == other.fromBalance &&
            this.toBalance == other.toBalance &&
            this.additionalProperties == other.additionalProperties
    }

    override fun hashCode(): Int {
        if (hashCode == 0) {
            hashCode =
                Objects.hash(
                    category,
                    created,
                    currency,
                    descriptor,
                    events,
                    pendingAmount,
                    result,
                    settledAmount,
                    status,
                    token,
                    updated,
                    fromBalance,
                    toBalance,
                    additionalProperties,
                )
        }
        return hashCode
    }

    override fun toString() =
        "Transfer{category=$category, created=$created, currency=$currency, descriptor=$descriptor, events=$events, pendingAmount=$pendingAmount, result=$result, settledAmount=$settledAmount, status=$status, token=$token, updated=$updated, fromBalance=$fromBalance, toBalance=$toBalance, additionalProperties=$additionalProperties}"

    companion object {

        fun builder() = Builder()
    }

    class Builder {

        private var category: JsonField<Category> = JsonMissing.of()
        private var created: JsonField<OffsetDateTime> = JsonMissing.of()
        private var currency: JsonField<String> = JsonMissing.of()
        private var descriptor: JsonField<String> = JsonMissing.of()
        private var events: JsonField<List<FinancialEvent>> = JsonMissing.of()
        private var pendingAmount: JsonField<Long> = JsonMissing.of()
        private var result: JsonField<Result> = JsonMissing.of()
        private var settledAmount: JsonField<Long> = JsonMissing.of()
        private var status: JsonField<Status> = JsonMissing.of()
        private var token: JsonField<String> = JsonMissing.of()
        private var updated: JsonField<OffsetDateTime> = JsonMissing.of()
        private var fromBalance: JsonField<List<Balance>> = JsonMissing.of()
        private var toBalance: JsonField<List<Balance>> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(transfer: Transfer) = apply {
            this.category = transfer.category
            this.created = transfer.created
            this.currency = transfer.currency
            this.descriptor = transfer.descriptor
            this.events = transfer.events
            this.pendingAmount = transfer.pendingAmount
            this.result = transfer.result
            this.settledAmount = transfer.settledAmount
            this.status = transfer.status
            this.token = transfer.token
            this.updated = transfer.updated
            this.fromBalance = transfer.fromBalance
            this.toBalance = transfer.toBalance
            additionalProperties(transfer.additionalProperties)
        }

        /**
         * Status types:
         *
         * - `TRANSFER` - Internal transfer of funds between financial accounts in your program.
         */
        fun category(category: Category) = category(JsonField.of(category))

        /**
         * Status types:
         *
         * - `TRANSFER` - Internal transfer of funds between financial accounts in your program.
         */
        @JsonProperty("category")
        @ExcludeMissing
        fun category(category: JsonField<Category>) = apply { this.category = category }

        /** Date and time when the transfer occurred. UTC time zone. */
        fun created(created: OffsetDateTime) = created(JsonField.of(created))

        /** Date and time when the transfer occurred. UTC time zone. */
        @JsonProperty("created")
        @ExcludeMissing
        fun created(created: JsonField<OffsetDateTime>) = apply { this.created = created }

        /** 3-digit alphabetic ISO 4217 code for the settling currency of the transaction. */
        fun currency(currency: String) = currency(JsonField.of(currency))

        /** 3-digit alphabetic ISO 4217 code for the settling currency of the transaction. */
        @JsonProperty("currency")
        @ExcludeMissing
        fun currency(currency: JsonField<String>) = apply { this.currency = currency }

        /**
         * A string that provides a description of the transfer; may be useful to display to users.
         */
        fun descriptor(descriptor: String) = descriptor(JsonField.of(descriptor))

        /**
         * A string that provides a description of the transfer; may be useful to display to users.
         */
        @JsonProperty("descriptor")
        @ExcludeMissing
        fun descriptor(descriptor: JsonField<String>) = apply { this.descriptor = descriptor }

        /** A list of all financial events that have modified this trasnfer. */
        fun events(events: List<FinancialEvent>) = events(JsonField.of(events))

        /** A list of all financial events that have modified this trasnfer. */
        @JsonProperty("events")
        @ExcludeMissing
        fun events(events: JsonField<List<FinancialEvent>>) = apply { this.events = events }

        /**
         * Pending amount of the transaction in the currency's smallest unit (e.g., cents),
         * including any acquirer fees. The value of this field will go to zero over time once the
         * financial transaction is settled.
         */
        fun pendingAmount(pendingAmount: Long) = pendingAmount(JsonField.of(pendingAmount))

        /**
         * Pending amount of the transaction in the currency's smallest unit (e.g., cents),
         * including any acquirer fees. The value of this field will go to zero over time once the
         * financial transaction is settled.
         */
        @JsonProperty("pending_amount")
        @ExcludeMissing
        fun pendingAmount(pendingAmount: JsonField<Long>) = apply {
            this.pendingAmount = pendingAmount
        }

        /**
         * APPROVED transactions were successful while DECLINED transactions were declined by user,
         * Lithic, or the network.
         */
        fun result(result: Result) = result(JsonField.of(result))

        /**
         * APPROVED transactions were successful while DECLINED transactions were declined by user,
         * Lithic, or the network.
         */
        @JsonProperty("result")
        @ExcludeMissing
        fun result(result: JsonField<Result>) = apply { this.result = result }

        /**
         * Amount of the transaction that has been settled in the currency's smallest unit (e.g.,
         * cents).
         */
        fun settledAmount(settledAmount: Long) = settledAmount(JsonField.of(settledAmount))

        /**
         * Amount of the transaction that has been settled in the currency's smallest unit (e.g.,
         * cents).
         */
        @JsonProperty("settled_amount")
        @ExcludeMissing
        fun settledAmount(settledAmount: JsonField<Long>) = apply {
            this.settledAmount = settledAmount
        }

        /**
         * Status types:
         *
         * - `DECLINED` - The transfer was declined.
         * - `EXPIRED` - The transfer was held in pending for too long and expired.
         * - `PENDING` - The transfer is pending release from a hold.
         * - `SETTLED` - The transfer is completed.
         * - `VOIDED` - The transfer was reversed before it settled.
         */
        fun status(status: Status) = status(JsonField.of(status))

        /**
         * Status types:
         *
         * - `DECLINED` - The transfer was declined.
         * - `EXPIRED` - The transfer was held in pending for too long and expired.
         * - `PENDING` - The transfer is pending release from a hold.
         * - `SETTLED` - The transfer is completed.
         * - `VOIDED` - The transfer was reversed before it settled.
         */
        @JsonProperty("status")
        @ExcludeMissing
        fun status(status: JsonField<Status>) = apply { this.status = status }

        /** Globally unique identifier for the transfer event. */
        fun token(token: String) = token(JsonField.of(token))

        /** Globally unique identifier for the transfer event. */
        @JsonProperty("token")
        @ExcludeMissing
        fun token(token: JsonField<String>) = apply { this.token = token }

        /** Date and time when the financial transaction was last updated. UTC time zone. */
        fun updated(updated: OffsetDateTime) = updated(JsonField.of(updated))

        /** Date and time when the financial transaction was last updated. UTC time zone. */
        @JsonProperty("updated")
        @ExcludeMissing
        fun updated(updated: JsonField<OffsetDateTime>) = apply { this.updated = updated }

        /** The updated balance of the sending financial account. */
        fun fromBalance(fromBalance: List<Balance>) = fromBalance(JsonField.of(fromBalance))

        /** The updated balance of the sending financial account. */
        @JsonProperty("from_balance")
        @ExcludeMissing
        fun fromBalance(fromBalance: JsonField<List<Balance>>) = apply {
            this.fromBalance = fromBalance
        }

        /** The updated balance of the receiving financial account. */
        fun toBalance(toBalance: List<Balance>) = toBalance(JsonField.of(toBalance))

        /** The updated balance of the receiving financial account. */
        @JsonProperty("to_balance")
        @ExcludeMissing
        fun toBalance(toBalance: JsonField<List<Balance>>) = apply { this.toBalance = toBalance }

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

        fun build(): Transfer =
            Transfer(
                category,
                created,
                currency,
                descriptor,
                events.map { it.toUnmodifiable() },
                pendingAmount,
                result,
                settledAmount,
                status,
                token,
                updated,
                fromBalance.map { it.toUnmodifiable() },
                toBalance.map { it.toUnmodifiable() },
                additionalProperties.toUnmodifiable(),
            )
    }

    class Category
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Category && this.value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()

        companion object {

            val TRANSFER = Category(JsonField.of("TRANSFER"))

            fun of(value: String) = Category(JsonField.of(value))
        }

        enum class Known {
            TRANSFER,
        }

        enum class Value {
            TRANSFER,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                TRANSFER -> Value.TRANSFER
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                TRANSFER -> Known.TRANSFER
                else -> throw LithicInvalidDataException("Unknown Category: $value")
            }

        fun asString(): String = _value().asStringOrThrow()
    }

    @JsonDeserialize(builder = FinancialEvent.Builder::class)
    @NoAutoDetect
    class FinancialEvent
    private constructor(
        private val amount: JsonField<Long>,
        private val created: JsonField<OffsetDateTime>,
        private val result: JsonField<Result>,
        private val token: JsonField<String>,
        private val type: JsonField<Type>,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var validated: Boolean = false

        private var hashCode: Int = 0

        /**
         * Amount of the financial event that has been settled in the currency's smallest unit
         * (e.g., cents).
         */
        fun amount(): Long? = amount.getNullable("amount")

        /** Date and time when the financial event occurred. UTC time zone. */
        fun created(): OffsetDateTime? = created.getNullable("created")

        /**
         * APPROVED financial events were successful while DECLINED financial events were declined
         * by user, Lithic, or the network.
         */
        fun result(): Result? = result.getNullable("result")

        /** Globally unique identifier. */
        fun token(): String? = token.getNullable("token")

        /**
         * Event types:
         *
         * - `ACH_INSUFFICIENT_FUNDS` - Attempted ACH origination declined due to insufficient
         * balance.
         * - `ACH_ORIGINATION_PENDING` - ACH origination pending release from an ACH hold.
         * - `ACH_ORIGINATION_RELEASED` - ACH origination released from pending to available
         * balance.
         * - `ACH_RECEIPT_PENDING` - ACH receipt pending release from an ACH holder.
         * - `ACH_RECEIPT_RELEASED` - ACH receipt released from pending to available balance.
         * - `ACH_RETURN` - ACH origination returned by the Receiving Depository Financial
         * Institution.
         * - `AUTHORIZATION` - Authorize a card transaction.
         * - `AUTHORIZATION_ADVICE` - Advice on a card transaction.
         * - `AUTHORIZATION_EXPIRY` - Card Authorization has expired and reversed by Lithic.
         * - `AUTHORIZATION_REVERSAL` - Card Authorization was reversed by the merchant.
         * - `BALANCE_INQUIRY` - A card balance inquiry (typically a $0 authorization) has occurred
         * on a card.
         * - `CLEARING` - Card Transaction is settled.
         * - `CORRECTION_DEBIT` - Manual card transaction correction (Debit).
         * - `CORRECTION_CREDIT` - Manual card transaction correction (Credit).
         * - `CREDIT_AUTHORIZATION` - A refund or credit card authorization from a merchant.
         * - `CREDIT_AUTHORIZATION_ADVICE` - A credit card authorization was approved on your behalf
         * by the network.
         * - `FINANCIAL_AUTHORIZATION` - A request from a merchant to debit card funds without
         * additional clearing.
         * - `FINANCIAL_CREDIT_AUTHORIZATION` - A request from a merchant to refund or credit card
         * funds without additional clearing.
         * - `RETURN` - A card refund has been processed on the transaction.
         * - `RETURN_REVERSAL` - A card refund has been reversed (e.g., when a merchant reverses an
         * incorrect refund).
         * - `TRANSFER` - Successful internal transfer of funds between financial accounts.
         * - `TRANSFER_INSUFFICIENT_FUNDS` - Declined internl transfer of funds due to insufficient
         * balance of the sender.
         */
        fun type(): Type? = type.getNullable("type")

        /**
         * Amount of the financial event that has been settled in the currency's smallest unit
         * (e.g., cents).
         */
        @JsonProperty("amount") @ExcludeMissing fun _amount() = amount

        /** Date and time when the financial event occurred. UTC time zone. */
        @JsonProperty("created") @ExcludeMissing fun _created() = created

        /**
         * APPROVED financial events were successful while DECLINED financial events were declined
         * by user, Lithic, or the network.
         */
        @JsonProperty("result") @ExcludeMissing fun _result() = result

        /** Globally unique identifier. */
        @JsonProperty("token") @ExcludeMissing fun _token() = token

        /**
         * Event types:
         *
         * - `ACH_INSUFFICIENT_FUNDS` - Attempted ACH origination declined due to insufficient
         * balance.
         * - `ACH_ORIGINATION_PENDING` - ACH origination pending release from an ACH hold.
         * - `ACH_ORIGINATION_RELEASED` - ACH origination released from pending to available
         * balance.
         * - `ACH_RECEIPT_PENDING` - ACH receipt pending release from an ACH holder.
         * - `ACH_RECEIPT_RELEASED` - ACH receipt released from pending to available balance.
         * - `ACH_RETURN` - ACH origination returned by the Receiving Depository Financial
         * Institution.
         * - `AUTHORIZATION` - Authorize a card transaction.
         * - `AUTHORIZATION_ADVICE` - Advice on a card transaction.
         * - `AUTHORIZATION_EXPIRY` - Card Authorization has expired and reversed by Lithic.
         * - `AUTHORIZATION_REVERSAL` - Card Authorization was reversed by the merchant.
         * - `BALANCE_INQUIRY` - A card balance inquiry (typically a $0 authorization) has occurred
         * on a card.
         * - `CLEARING` - Card Transaction is settled.
         * - `CORRECTION_DEBIT` - Manual card transaction correction (Debit).
         * - `CORRECTION_CREDIT` - Manual card transaction correction (Credit).
         * - `CREDIT_AUTHORIZATION` - A refund or credit card authorization from a merchant.
         * - `CREDIT_AUTHORIZATION_ADVICE` - A credit card authorization was approved on your behalf
         * by the network.
         * - `FINANCIAL_AUTHORIZATION` - A request from a merchant to debit card funds without
         * additional clearing.
         * - `FINANCIAL_CREDIT_AUTHORIZATION` - A request from a merchant to refund or credit card
         * funds without additional clearing.
         * - `RETURN` - A card refund has been processed on the transaction.
         * - `RETURN_REVERSAL` - A card refund has been reversed (e.g., when a merchant reverses an
         * incorrect refund).
         * - `TRANSFER` - Successful internal transfer of funds between financial accounts.
         * - `TRANSFER_INSUFFICIENT_FUNDS` - Declined internl transfer of funds due to insufficient
         * balance of the sender.
         */
        @JsonProperty("type") @ExcludeMissing fun _type() = type

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun validate(): FinancialEvent = apply {
            if (!validated) {
                amount()
                created()
                result()
                token()
                type()
                validated = true
            }
        }

        fun toBuilder() = Builder().from(this)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is FinancialEvent &&
                this.amount == other.amount &&
                this.created == other.created &&
                this.result == other.result &&
                this.token == other.token &&
                this.type == other.type &&
                this.additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode =
                    Objects.hash(
                        amount,
                        created,
                        result,
                        token,
                        type,
                        additionalProperties,
                    )
            }
            return hashCode
        }

        override fun toString() =
            "FinancialEvent{amount=$amount, created=$created, result=$result, token=$token, type=$type, additionalProperties=$additionalProperties}"

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var amount: JsonField<Long> = JsonMissing.of()
            private var created: JsonField<OffsetDateTime> = JsonMissing.of()
            private var result: JsonField<Result> = JsonMissing.of()
            private var token: JsonField<String> = JsonMissing.of()
            private var type: JsonField<Type> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(financialEvent: FinancialEvent) = apply {
                this.amount = financialEvent.amount
                this.created = financialEvent.created
                this.result = financialEvent.result
                this.token = financialEvent.token
                this.type = financialEvent.type
                additionalProperties(financialEvent.additionalProperties)
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
            @JsonProperty("amount")
            @ExcludeMissing
            fun amount(amount: JsonField<Long>) = apply { this.amount = amount }

            /** Date and time when the financial event occurred. UTC time zone. */
            fun created(created: OffsetDateTime) = created(JsonField.of(created))

            /** Date and time when the financial event occurred. UTC time zone. */
            @JsonProperty("created")
            @ExcludeMissing
            fun created(created: JsonField<OffsetDateTime>) = apply { this.created = created }

            /**
             * APPROVED financial events were successful while DECLINED financial events were
             * declined by user, Lithic, or the network.
             */
            fun result(result: Result) = result(JsonField.of(result))

            /**
             * APPROVED financial events were successful while DECLINED financial events were
             * declined by user, Lithic, or the network.
             */
            @JsonProperty("result")
            @ExcludeMissing
            fun result(result: JsonField<Result>) = apply { this.result = result }

            /** Globally unique identifier. */
            fun token(token: String) = token(JsonField.of(token))

            /** Globally unique identifier. */
            @JsonProperty("token")
            @ExcludeMissing
            fun token(token: JsonField<String>) = apply { this.token = token }

            /**
             * Event types:
             *
             * - `ACH_INSUFFICIENT_FUNDS` - Attempted ACH origination declined due to insufficient
             * balance.
             * - `ACH_ORIGINATION_PENDING` - ACH origination pending release from an ACH hold.
             * - `ACH_ORIGINATION_RELEASED` - ACH origination released from pending to available
             * balance.
             * - `ACH_RECEIPT_PENDING` - ACH receipt pending release from an ACH holder.
             * - `ACH_RECEIPT_RELEASED` - ACH receipt released from pending to available balance.
             * - `ACH_RETURN` - ACH origination returned by the Receiving Depository Financial
             * Institution.
             * - `AUTHORIZATION` - Authorize a card transaction.
             * - `AUTHORIZATION_ADVICE` - Advice on a card transaction.
             * - `AUTHORIZATION_EXPIRY` - Card Authorization has expired and reversed by Lithic.
             * - `AUTHORIZATION_REVERSAL` - Card Authorization was reversed by the merchant.
             * - `BALANCE_INQUIRY` - A card balance inquiry (typically a $0 authorization) has
             * occurred on a card.
             * - `CLEARING` - Card Transaction is settled.
             * - `CORRECTION_DEBIT` - Manual card transaction correction (Debit).
             * - `CORRECTION_CREDIT` - Manual card transaction correction (Credit).
             * - `CREDIT_AUTHORIZATION` - A refund or credit card authorization from a merchant.
             * - `CREDIT_AUTHORIZATION_ADVICE` - A credit card authorization was approved on your
             * behalf by the network.
             * - `FINANCIAL_AUTHORIZATION` - A request from a merchant to debit card funds without
             * additional clearing.
             * - `FINANCIAL_CREDIT_AUTHORIZATION` - A request from a merchant to refund or credit
             * card funds without additional clearing.
             * - `RETURN` - A card refund has been processed on the transaction.
             * - `RETURN_REVERSAL` - A card refund has been reversed (e.g., when a merchant reverses
             * an incorrect refund).
             * - `TRANSFER` - Successful internal transfer of funds between financial accounts.
             * - `TRANSFER_INSUFFICIENT_FUNDS` - Declined internl transfer of funds due to
             * insufficient balance of the sender.
             */
            fun type(type: Type) = type(JsonField.of(type))

            /**
             * Event types:
             *
             * - `ACH_INSUFFICIENT_FUNDS` - Attempted ACH origination declined due to insufficient
             * balance.
             * - `ACH_ORIGINATION_PENDING` - ACH origination pending release from an ACH hold.
             * - `ACH_ORIGINATION_RELEASED` - ACH origination released from pending to available
             * balance.
             * - `ACH_RECEIPT_PENDING` - ACH receipt pending release from an ACH holder.
             * - `ACH_RECEIPT_RELEASED` - ACH receipt released from pending to available balance.
             * - `ACH_RETURN` - ACH origination returned by the Receiving Depository Financial
             * Institution.
             * - `AUTHORIZATION` - Authorize a card transaction.
             * - `AUTHORIZATION_ADVICE` - Advice on a card transaction.
             * - `AUTHORIZATION_EXPIRY` - Card Authorization has expired and reversed by Lithic.
             * - `AUTHORIZATION_REVERSAL` - Card Authorization was reversed by the merchant.
             * - `BALANCE_INQUIRY` - A card balance inquiry (typically a $0 authorization) has
             * occurred on a card.
             * - `CLEARING` - Card Transaction is settled.
             * - `CORRECTION_DEBIT` - Manual card transaction correction (Debit).
             * - `CORRECTION_CREDIT` - Manual card transaction correction (Credit).
             * - `CREDIT_AUTHORIZATION` - A refund or credit card authorization from a merchant.
             * - `CREDIT_AUTHORIZATION_ADVICE` - A credit card authorization was approved on your
             * behalf by the network.
             * - `FINANCIAL_AUTHORIZATION` - A request from a merchant to debit card funds without
             * additional clearing.
             * - `FINANCIAL_CREDIT_AUTHORIZATION` - A request from a merchant to refund or credit
             * card funds without additional clearing.
             * - `RETURN` - A card refund has been processed on the transaction.
             * - `RETURN_REVERSAL` - A card refund has been reversed (e.g., when a merchant reverses
             * an incorrect refund).
             * - `TRANSFER` - Successful internal transfer of funds between financial accounts.
             * - `TRANSFER_INSUFFICIENT_FUNDS` - Declined internl transfer of funds due to
             * insufficient balance of the sender.
             */
            @JsonProperty("type")
            @ExcludeMissing
            fun type(type: JsonField<Type>) = apply { this.type = type }

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

            fun build(): FinancialEvent =
                FinancialEvent(
                    amount,
                    created,
                    result,
                    token,
                    type,
                    additionalProperties.toUnmodifiable(),
                )
        }

        class Result
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) {

            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Result && this.value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()

            companion object {

                val APPROVED = Result(JsonField.of("APPROVED"))

                val DECLINED = Result(JsonField.of("DECLINED"))

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
        }

        class Type
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) {

            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Type && this.value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()

            companion object {

                val ACH_INSUFFICIENT_FUNDS = Type(JsonField.of("ACH_INSUFFICIENT_FUNDS"))

                val ACH_ORIGINATION_PENDING = Type(JsonField.of("ACH_ORIGINATION_PENDING"))

                val ACH_ORIGINATION_RELEASED = Type(JsonField.of("ACH_ORIGINATION_RELEASED"))

                val ACH_RECEIPT_PENDING = Type(JsonField.of("ACH_RECEIPT_PENDING"))

                val ACH_RECEIPT_RELEASED = Type(JsonField.of("ACH_RECEIPT_RELEASED"))

                val ACH_RETURN = Type(JsonField.of("ACH_RETURN"))

                val AUTHORIZATION = Type(JsonField.of("AUTHORIZATION"))

                val AUTHORIZATION_ADVICE = Type(JsonField.of("AUTHORIZATION_ADVICE"))

                val AUTHORIZATION_EXPIRY = Type(JsonField.of("AUTHORIZATION_EXPIRY"))

                val AUTHORIZATION_REVERSAL = Type(JsonField.of("AUTHORIZATION_REVERSAL"))

                val BALANCE_INQUIRY = Type(JsonField.of("BALANCE_INQUIRY"))

                val CLEARING = Type(JsonField.of("CLEARING"))

                val CORRECTION_DEBIT = Type(JsonField.of("CORRECTION_DEBIT"))

                val CORRECTION_CREDIT = Type(JsonField.of("CORRECTION_CREDIT"))

                val CREDIT_AUTHORIZATION = Type(JsonField.of("CREDIT_AUTHORIZATION"))

                val CREDIT_AUTHORIZATION_ADVICE = Type(JsonField.of("CREDIT_AUTHORIZATION_ADVICE"))

                val FINANCIAL_AUTHORIZATION = Type(JsonField.of("FINANCIAL_AUTHORIZATION"))

                val FINANCIAL_CREDIT_AUTHORIZATION =
                    Type(JsonField.of("FINANCIAL_CREDIT_AUTHORIZATION"))

                val RETURN = Type(JsonField.of("RETURN"))

                val RETURN_REVERSAL = Type(JsonField.of("RETURN_REVERSAL"))

                val TRANSFER = Type(JsonField.of("TRANSFER"))

                val TRANSFER_INSUFFICIENT_FUNDS = Type(JsonField.of("TRANSFER_INSUFFICIENT_FUNDS"))

                fun of(value: String) = Type(JsonField.of(value))
            }

            enum class Known {
                ACH_INSUFFICIENT_FUNDS,
                ACH_ORIGINATION_PENDING,
                ACH_ORIGINATION_RELEASED,
                ACH_RECEIPT_PENDING,
                ACH_RECEIPT_RELEASED,
                ACH_RETURN,
                AUTHORIZATION,
                AUTHORIZATION_ADVICE,
                AUTHORIZATION_EXPIRY,
                AUTHORIZATION_REVERSAL,
                BALANCE_INQUIRY,
                CLEARING,
                CORRECTION_DEBIT,
                CORRECTION_CREDIT,
                CREDIT_AUTHORIZATION,
                CREDIT_AUTHORIZATION_ADVICE,
                FINANCIAL_AUTHORIZATION,
                FINANCIAL_CREDIT_AUTHORIZATION,
                RETURN,
                RETURN_REVERSAL,
                TRANSFER,
                TRANSFER_INSUFFICIENT_FUNDS,
            }

            enum class Value {
                ACH_INSUFFICIENT_FUNDS,
                ACH_ORIGINATION_PENDING,
                ACH_ORIGINATION_RELEASED,
                ACH_RECEIPT_PENDING,
                ACH_RECEIPT_RELEASED,
                ACH_RETURN,
                AUTHORIZATION,
                AUTHORIZATION_ADVICE,
                AUTHORIZATION_EXPIRY,
                AUTHORIZATION_REVERSAL,
                BALANCE_INQUIRY,
                CLEARING,
                CORRECTION_DEBIT,
                CORRECTION_CREDIT,
                CREDIT_AUTHORIZATION,
                CREDIT_AUTHORIZATION_ADVICE,
                FINANCIAL_AUTHORIZATION,
                FINANCIAL_CREDIT_AUTHORIZATION,
                RETURN,
                RETURN_REVERSAL,
                TRANSFER,
                TRANSFER_INSUFFICIENT_FUNDS,
                _UNKNOWN,
            }

            fun value(): Value =
                when (this) {
                    ACH_INSUFFICIENT_FUNDS -> Value.ACH_INSUFFICIENT_FUNDS
                    ACH_ORIGINATION_PENDING -> Value.ACH_ORIGINATION_PENDING
                    ACH_ORIGINATION_RELEASED -> Value.ACH_ORIGINATION_RELEASED
                    ACH_RECEIPT_PENDING -> Value.ACH_RECEIPT_PENDING
                    ACH_RECEIPT_RELEASED -> Value.ACH_RECEIPT_RELEASED
                    ACH_RETURN -> Value.ACH_RETURN
                    AUTHORIZATION -> Value.AUTHORIZATION
                    AUTHORIZATION_ADVICE -> Value.AUTHORIZATION_ADVICE
                    AUTHORIZATION_EXPIRY -> Value.AUTHORIZATION_EXPIRY
                    AUTHORIZATION_REVERSAL -> Value.AUTHORIZATION_REVERSAL
                    BALANCE_INQUIRY -> Value.BALANCE_INQUIRY
                    CLEARING -> Value.CLEARING
                    CORRECTION_DEBIT -> Value.CORRECTION_DEBIT
                    CORRECTION_CREDIT -> Value.CORRECTION_CREDIT
                    CREDIT_AUTHORIZATION -> Value.CREDIT_AUTHORIZATION
                    CREDIT_AUTHORIZATION_ADVICE -> Value.CREDIT_AUTHORIZATION_ADVICE
                    FINANCIAL_AUTHORIZATION -> Value.FINANCIAL_AUTHORIZATION
                    FINANCIAL_CREDIT_AUTHORIZATION -> Value.FINANCIAL_CREDIT_AUTHORIZATION
                    RETURN -> Value.RETURN
                    RETURN_REVERSAL -> Value.RETURN_REVERSAL
                    TRANSFER -> Value.TRANSFER
                    TRANSFER_INSUFFICIENT_FUNDS -> Value.TRANSFER_INSUFFICIENT_FUNDS
                    else -> Value._UNKNOWN
                }

            fun known(): Known =
                when (this) {
                    ACH_INSUFFICIENT_FUNDS -> Known.ACH_INSUFFICIENT_FUNDS
                    ACH_ORIGINATION_PENDING -> Known.ACH_ORIGINATION_PENDING
                    ACH_ORIGINATION_RELEASED -> Known.ACH_ORIGINATION_RELEASED
                    ACH_RECEIPT_PENDING -> Known.ACH_RECEIPT_PENDING
                    ACH_RECEIPT_RELEASED -> Known.ACH_RECEIPT_RELEASED
                    ACH_RETURN -> Known.ACH_RETURN
                    AUTHORIZATION -> Known.AUTHORIZATION
                    AUTHORIZATION_ADVICE -> Known.AUTHORIZATION_ADVICE
                    AUTHORIZATION_EXPIRY -> Known.AUTHORIZATION_EXPIRY
                    AUTHORIZATION_REVERSAL -> Known.AUTHORIZATION_REVERSAL
                    BALANCE_INQUIRY -> Known.BALANCE_INQUIRY
                    CLEARING -> Known.CLEARING
                    CORRECTION_DEBIT -> Known.CORRECTION_DEBIT
                    CORRECTION_CREDIT -> Known.CORRECTION_CREDIT
                    CREDIT_AUTHORIZATION -> Known.CREDIT_AUTHORIZATION
                    CREDIT_AUTHORIZATION_ADVICE -> Known.CREDIT_AUTHORIZATION_ADVICE
                    FINANCIAL_AUTHORIZATION -> Known.FINANCIAL_AUTHORIZATION
                    FINANCIAL_CREDIT_AUTHORIZATION -> Known.FINANCIAL_CREDIT_AUTHORIZATION
                    RETURN -> Known.RETURN
                    RETURN_REVERSAL -> Known.RETURN_REVERSAL
                    TRANSFER -> Known.TRANSFER
                    TRANSFER_INSUFFICIENT_FUNDS -> Known.TRANSFER_INSUFFICIENT_FUNDS
                    else -> throw LithicInvalidDataException("Unknown Type: $value")
                }

            fun asString(): String = _value().asStringOrThrow()
        }
    }

    class Result
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Result && this.value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()

        companion object {

            val APPROVED = Result(JsonField.of("APPROVED"))

            val DECLINED = Result(JsonField.of("DECLINED"))

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
    }

    class Status
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) {

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

            val DECLINED = Status(JsonField.of("DECLINED"))

            val EXPIRED = Status(JsonField.of("EXPIRED"))

            val PENDING = Status(JsonField.of("PENDING"))

            val SETTLED = Status(JsonField.of("SETTLED"))

            val VOIDED = Status(JsonField.of("VOIDED"))

            fun of(value: String) = Status(JsonField.of(value))
        }

        enum class Known {
            DECLINED,
            EXPIRED,
            PENDING,
            SETTLED,
            VOIDED,
        }

        enum class Value {
            DECLINED,
            EXPIRED,
            PENDING,
            SETTLED,
            VOIDED,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                DECLINED -> Value.DECLINED
                EXPIRED -> Value.EXPIRED
                PENDING -> Value.PENDING
                SETTLED -> Value.SETTLED
                VOIDED -> Value.VOIDED
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                DECLINED -> Known.DECLINED
                EXPIRED -> Known.EXPIRED
                PENDING -> Known.PENDING
                SETTLED -> Known.SETTLED
                VOIDED -> Known.VOIDED
                else -> throw LithicInvalidDataException("Unknown Status: $value")
            }

        fun asString(): String = _value().asStringOrThrow()
    }
}
