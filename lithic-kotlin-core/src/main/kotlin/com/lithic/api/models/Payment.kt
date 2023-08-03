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

@JsonDeserialize(builder = Payment.Builder::class)
@NoAutoDetect
class Payment
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
    private val methodAttributes: JsonField<PaymentMethodAttributes>,
    private val externalBankAccountToken: JsonField<String>,
    private val direction: JsonField<Direction>,
    private val source: JsonField<Source>,
    private val method: JsonField<Method>,
    private val userDefinedId: JsonField<String>,
    private val additionalProperties: Map<String, JsonValue>,
) {

    private var validated: Boolean = false

    private var hashCode: Int = 0

    /**
     * Status types:
     *
     * - `CARD` - Issuing card transaction.
     * - `ACH` - Transaction over ACH.
     * - `TRANSFER` - Internal transfer of funds between financial accounts in your program.
     */
    fun category(): Category = category.getRequired("category")

    /** Date and time when the financial transaction first occurred. UTC time zone. */
    fun created(): OffsetDateTime = created.getRequired("created")

    /** 3-digit alphabetic ISO 4217 code for the settling currency of the transaction. */
    fun currency(): String = currency.getRequired("currency")

    /**
     * A string that provides a description of the financial transaction; may be useful to display
     * to users.
     */
    fun descriptor(): String = descriptor.getRequired("descriptor")

    /** A list of all financial events that have modified this financial transaction. */
    fun events(): List<FinancialEvent> = events.getRequired("events")

    /**
     * Pending amount of the transaction in the currency's smallest unit (e.g., cents), including
     * any acquirer fees. The value of this field will go to zero over time once the financial
     * transaction is settled.
     */
    fun pendingAmount(): Long = pendingAmount.getRequired("pending_amount")

    /**
     * APPROVED transactions were successful while DECLINED transactions were declined by user,
     * Lithic, or the network.
     */
    fun result(): Result = result.getRequired("result")

    /**
     * Amount of the transaction that has been settled in the currency's smallest unit (e.g.,
     * cents), including any acquirer fees. This may change over time.
     */
    fun settledAmount(): Long = settledAmount.getRequired("settled_amount")

    /**
     * Status types:
     *
     * - `DECLINED` - The card transaction was declined.
     * - `EXPIRED` - Lithic reversed the card authorization as it has passed its expiration time.
     * - `PENDING` - Authorization is pending completion from the merchant or pending release from
     * ACH hold period
     * - `SETTLED` - The financial transaction is completed.
     * - `VOIDED` - The merchant has voided the previously pending card authorization.
     */
    fun status(): Status = status.getRequired("status")

    /** Globally unique identifier. */
    fun token(): String = token.getRequired("token")

    /** Date and time when the financial transaction was last updated. UTC time zone. */
    fun updated(): OffsetDateTime = updated.getRequired("updated")

    fun methodAttributes(): PaymentMethodAttributes =
        methodAttributes.getRequired("method_attributes")

    fun externalBankAccountToken(): String? =
        externalBankAccountToken.getNullable("external_bank_account_token")

    fun direction(): Direction = direction.getRequired("direction")

    fun source(): Source = source.getRequired("source")

    fun method(): Method = method.getRequired("method")

    fun userDefinedId(): String? = userDefinedId.getNullable("user_defined_id")

    /**
     * Status types:
     *
     * - `CARD` - Issuing card transaction.
     * - `ACH` - Transaction over ACH.
     * - `TRANSFER` - Internal transfer of funds between financial accounts in your program.
     */
    @JsonProperty("category") @ExcludeMissing fun _category() = category

    /** Date and time when the financial transaction first occurred. UTC time zone. */
    @JsonProperty("created") @ExcludeMissing fun _created() = created

    /** 3-digit alphabetic ISO 4217 code for the settling currency of the transaction. */
    @JsonProperty("currency") @ExcludeMissing fun _currency() = currency

    /**
     * A string that provides a description of the financial transaction; may be useful to display
     * to users.
     */
    @JsonProperty("descriptor") @ExcludeMissing fun _descriptor() = descriptor

    /** A list of all financial events that have modified this financial transaction. */
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
     * cents), including any acquirer fees. This may change over time.
     */
    @JsonProperty("settled_amount") @ExcludeMissing fun _settledAmount() = settledAmount

    /**
     * Status types:
     *
     * - `DECLINED` - The card transaction was declined.
     * - `EXPIRED` - Lithic reversed the card authorization as it has passed its expiration time.
     * - `PENDING` - Authorization is pending completion from the merchant or pending release from
     * ACH hold period
     * - `SETTLED` - The financial transaction is completed.
     * - `VOIDED` - The merchant has voided the previously pending card authorization.
     */
    @JsonProperty("status") @ExcludeMissing fun _status() = status

    /** Globally unique identifier. */
    @JsonProperty("token") @ExcludeMissing fun _token() = token

    /** Date and time when the financial transaction was last updated. UTC time zone. */
    @JsonProperty("updated") @ExcludeMissing fun _updated() = updated

    @JsonProperty("method_attributes") @ExcludeMissing fun _methodAttributes() = methodAttributes

    @JsonProperty("external_bank_account_token")
    @ExcludeMissing
    fun _externalBankAccountToken() = externalBankAccountToken

    @JsonProperty("direction") @ExcludeMissing fun _direction() = direction

    @JsonProperty("source") @ExcludeMissing fun _source() = source

    @JsonProperty("method") @ExcludeMissing fun _method() = method

    @JsonProperty("user_defined_id") @ExcludeMissing fun _userDefinedId() = userDefinedId

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

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
            methodAttributes().validate()
            externalBankAccountToken()
            direction()
            source()
            method()
            userDefinedId()
            validated = true
        }
    }

    fun toBuilder() = Builder().from(this)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is Payment &&
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
            this.methodAttributes == other.methodAttributes &&
            this.externalBankAccountToken == other.externalBankAccountToken &&
            this.direction == other.direction &&
            this.source == other.source &&
            this.method == other.method &&
            this.userDefinedId == other.userDefinedId &&
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
                    methodAttributes,
                    externalBankAccountToken,
                    direction,
                    source,
                    method,
                    userDefinedId,
                    additionalProperties,
                )
        }
        return hashCode
    }

    override fun toString() =
        "Payment{category=$category, created=$created, currency=$currency, descriptor=$descriptor, events=$events, pendingAmount=$pendingAmount, result=$result, settledAmount=$settledAmount, status=$status, token=$token, updated=$updated, methodAttributes=$methodAttributes, externalBankAccountToken=$externalBankAccountToken, direction=$direction, source=$source, method=$method, userDefinedId=$userDefinedId, additionalProperties=$additionalProperties}"

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
        private var methodAttributes: JsonField<PaymentMethodAttributes> = JsonMissing.of()
        private var externalBankAccountToken: JsonField<String> = JsonMissing.of()
        private var direction: JsonField<Direction> = JsonMissing.of()
        private var source: JsonField<Source> = JsonMissing.of()
        private var method: JsonField<Method> = JsonMissing.of()
        private var userDefinedId: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(payment: Payment) = apply {
            this.category = payment.category
            this.created = payment.created
            this.currency = payment.currency
            this.descriptor = payment.descriptor
            this.events = payment.events
            this.pendingAmount = payment.pendingAmount
            this.result = payment.result
            this.settledAmount = payment.settledAmount
            this.status = payment.status
            this.token = payment.token
            this.updated = payment.updated
            this.methodAttributes = payment.methodAttributes
            this.externalBankAccountToken = payment.externalBankAccountToken
            this.direction = payment.direction
            this.source = payment.source
            this.method = payment.method
            this.userDefinedId = payment.userDefinedId
            additionalProperties(payment.additionalProperties)
        }

        /**
         * Status types:
         *
         * - `CARD` - Issuing card transaction.
         * - `ACH` - Transaction over ACH.
         * - `TRANSFER` - Internal transfer of funds between financial accounts in your program.
         */
        fun category(category: Category) = category(JsonField.of(category))

        /**
         * Status types:
         *
         * - `CARD` - Issuing card transaction.
         * - `ACH` - Transaction over ACH.
         * - `TRANSFER` - Internal transfer of funds between financial accounts in your program.
         */
        @JsonProperty("category")
        @ExcludeMissing
        fun category(category: JsonField<Category>) = apply { this.category = category }

        /** Date and time when the financial transaction first occurred. UTC time zone. */
        fun created(created: OffsetDateTime) = created(JsonField.of(created))

        /** Date and time when the financial transaction first occurred. UTC time zone. */
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
         * A string that provides a description of the financial transaction; may be useful to
         * display to users.
         */
        fun descriptor(descriptor: String) = descriptor(JsonField.of(descriptor))

        /**
         * A string that provides a description of the financial transaction; may be useful to
         * display to users.
         */
        @JsonProperty("descriptor")
        @ExcludeMissing
        fun descriptor(descriptor: JsonField<String>) = apply { this.descriptor = descriptor }

        /** A list of all financial events that have modified this financial transaction. */
        fun events(events: List<FinancialEvent>) = events(JsonField.of(events))

        /** A list of all financial events that have modified this financial transaction. */
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
         * cents), including any acquirer fees. This may change over time.
         */
        fun settledAmount(settledAmount: Long) = settledAmount(JsonField.of(settledAmount))

        /**
         * Amount of the transaction that has been settled in the currency's smallest unit (e.g.,
         * cents), including any acquirer fees. This may change over time.
         */
        @JsonProperty("settled_amount")
        @ExcludeMissing
        fun settledAmount(settledAmount: JsonField<Long>) = apply {
            this.settledAmount = settledAmount
        }

        /**
         * Status types:
         *
         * - `DECLINED` - The card transaction was declined.
         * - `EXPIRED` - Lithic reversed the card authorization as it has passed its expiration
         * time.
         * - `PENDING` - Authorization is pending completion from the merchant or pending release
         * from ACH hold period
         * - `SETTLED` - The financial transaction is completed.
         * - `VOIDED` - The merchant has voided the previously pending card authorization.
         */
        fun status(status: Status) = status(JsonField.of(status))

        /**
         * Status types:
         *
         * - `DECLINED` - The card transaction was declined.
         * - `EXPIRED` - Lithic reversed the card authorization as it has passed its expiration
         * time.
         * - `PENDING` - Authorization is pending completion from the merchant or pending release
         * from ACH hold period
         * - `SETTLED` - The financial transaction is completed.
         * - `VOIDED` - The merchant has voided the previously pending card authorization.
         */
        @JsonProperty("status")
        @ExcludeMissing
        fun status(status: JsonField<Status>) = apply { this.status = status }

        /** Globally unique identifier. */
        fun token(token: String) = token(JsonField.of(token))

        /** Globally unique identifier. */
        @JsonProperty("token")
        @ExcludeMissing
        fun token(token: JsonField<String>) = apply { this.token = token }

        /** Date and time when the financial transaction was last updated. UTC time zone. */
        fun updated(updated: OffsetDateTime) = updated(JsonField.of(updated))

        /** Date and time when the financial transaction was last updated. UTC time zone. */
        @JsonProperty("updated")
        @ExcludeMissing
        fun updated(updated: JsonField<OffsetDateTime>) = apply { this.updated = updated }

        fun methodAttributes(methodAttributes: PaymentMethodAttributes) =
            methodAttributes(JsonField.of(methodAttributes))

        @JsonProperty("method_attributes")
        @ExcludeMissing
        fun methodAttributes(methodAttributes: JsonField<PaymentMethodAttributes>) = apply {
            this.methodAttributes = methodAttributes
        }

        fun externalBankAccountToken(externalBankAccountToken: String) =
            externalBankAccountToken(JsonField.of(externalBankAccountToken))

        @JsonProperty("external_bank_account_token")
        @ExcludeMissing
        fun externalBankAccountToken(externalBankAccountToken: JsonField<String>) = apply {
            this.externalBankAccountToken = externalBankAccountToken
        }

        fun direction(direction: Direction) = direction(JsonField.of(direction))

        @JsonProperty("direction")
        @ExcludeMissing
        fun direction(direction: JsonField<Direction>) = apply { this.direction = direction }

        fun source(source: Source) = source(JsonField.of(source))

        @JsonProperty("source")
        @ExcludeMissing
        fun source(source: JsonField<Source>) = apply { this.source = source }

        fun method(method: Method) = method(JsonField.of(method))

        @JsonProperty("method")
        @ExcludeMissing
        fun method(method: JsonField<Method>) = apply { this.method = method }

        fun userDefinedId(userDefinedId: String) = userDefinedId(JsonField.of(userDefinedId))

        @JsonProperty("user_defined_id")
        @ExcludeMissing
        fun userDefinedId(userDefinedId: JsonField<String>) = apply {
            this.userDefinedId = userDefinedId
        }

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

        fun build(): Payment =
            Payment(
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
                methodAttributes,
                externalBankAccountToken,
                direction,
                source,
                method,
                userDefinedId,
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

            val CARD = Category(JsonField.of("CARD"))

            val ACH = Category(JsonField.of("ACH"))

            val TRANSFER = Category(JsonField.of("TRANSFER"))

            fun of(value: String) = Category(JsonField.of(value))
        }

        enum class Known {
            CARD,
            ACH,
            TRANSFER,
        }

        enum class Value {
            CARD,
            ACH,
            TRANSFER,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                CARD -> Value.CARD
                ACH -> Value.ACH
                TRANSFER -> Value.TRANSFER
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                CARD -> Known.CARD
                ACH -> Known.ACH
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

    class Direction
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Direction && this.value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()

        companion object {

            val CREDIT = Direction(JsonField.of("CREDIT"))

            val DEBIT = Direction(JsonField.of("DEBIT"))

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
    }

    class Method
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Method && this.value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()

        companion object {

            val ACH_NEXT_DAY = Method(JsonField.of("ACH_NEXT_DAY"))

            val ACH_SAME_DAY = Method(JsonField.of("ACH_SAME_DAY"))

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
    }

    @JsonDeserialize(builder = PaymentMethodAttributes.Builder::class)
    @NoAutoDetect
    class PaymentMethodAttributes
    private constructor(
        private val secCode: JsonField<SecCode>,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var validated: Boolean = false

        private var hashCode: Int = 0

        fun secCode(): SecCode = secCode.getRequired("sec_code")

        @JsonProperty("sec_code") @ExcludeMissing fun _secCode() = secCode

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun validate(): PaymentMethodAttributes = apply {
            if (!validated) {
                secCode()
                validated = true
            }
        }

        fun toBuilder() = Builder().from(this)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is PaymentMethodAttributes &&
                this.secCode == other.secCode &&
                this.additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode = Objects.hash(secCode, additionalProperties)
            }
            return hashCode
        }

        override fun toString() =
            "PaymentMethodAttributes{secCode=$secCode, additionalProperties=$additionalProperties}"

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var secCode: JsonField<SecCode> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(paymentMethodAttributes: PaymentMethodAttributes) = apply {
                this.secCode = paymentMethodAttributes.secCode
                additionalProperties(paymentMethodAttributes.additionalProperties)
            }

            fun secCode(secCode: SecCode) = secCode(JsonField.of(secCode))

            @JsonProperty("sec_code")
            @ExcludeMissing
            fun secCode(secCode: JsonField<SecCode>) = apply { this.secCode = secCode }

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

            fun build(): PaymentMethodAttributes =
                PaymentMethodAttributes(secCode, additionalProperties.toUnmodifiable())
        }

        class SecCode
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) {

            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is SecCode && this.value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()

            companion object {

                val PPD = SecCode(JsonField.of("PPD"))

                val CCD = SecCode(JsonField.of("CCD"))

                val WEB = SecCode(JsonField.of("WEB"))

                fun of(value: String) = SecCode(JsonField.of(value))
            }

            enum class Known {
                PPD,
                CCD,
                WEB,
            }

            enum class Value {
                PPD,
                CCD,
                WEB,
                _UNKNOWN,
            }

            fun value(): Value =
                when (this) {
                    PPD -> Value.PPD
                    CCD -> Value.CCD
                    WEB -> Value.WEB
                    else -> Value._UNKNOWN
                }

            fun known(): Known =
                when (this) {
                    PPD -> Known.PPD
                    CCD -> Known.CCD
                    WEB -> Known.WEB
                    else -> throw LithicInvalidDataException("Unknown SecCode: $value")
                }

            fun asString(): String = _value().asStringOrThrow()
        }
    }

    class Source
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Source && this.value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()

        companion object {

            val LITHIC = Source(JsonField.of("LITHIC"))

            val CUSTOMER = Source(JsonField.of("CUSTOMER"))

            fun of(value: String) = Source(JsonField.of(value))
        }

        enum class Known {
            LITHIC,
            CUSTOMER,
        }

        enum class Value {
            LITHIC,
            CUSTOMER,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                LITHIC -> Value.LITHIC
                CUSTOMER -> Value.CUSTOMER
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                LITHIC -> Known.LITHIC
                CUSTOMER -> Known.CUSTOMER
                else -> throw LithicInvalidDataException("Unknown Source: $value")
            }

        fun asString(): String = _value().asStringOrThrow()
    }
}
