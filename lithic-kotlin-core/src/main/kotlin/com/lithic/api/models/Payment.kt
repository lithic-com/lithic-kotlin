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
    private val category: JsonField<FinancialTransaction.Category>,
    private val created: JsonField<OffsetDateTime>,
    private val currency: JsonField<String>,
    private val descriptor: JsonField<String>,
    private val events: JsonField<List<FinancialTransaction.FinancialEvent>>,
    private val pendingAmount: JsonField<Long>,
    private val result: JsonField<FinancialTransaction.Result>,
    private val settledAmount: JsonField<Long>,
    private val status: JsonField<FinancialTransaction.Status>,
    private val token: JsonField<String>,
    private val updated: JsonField<OffsetDateTime>,
    private val methodAttributes: JsonField<Payment.PaymentMethodAttributes>,
    private val externalBankAccountToken: JsonField<String>,
    private val direction: JsonField<Payment.Direction>,
    private val source: JsonField<Payment.Source>,
    private val method: JsonField<Payment.Method>,
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
    fun category(): FinancialTransaction.Category = category.getRequired("category")

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
    fun events(): List<FinancialTransaction.FinancialEvent> = events.getRequired("events")

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
    fun result(): FinancialTransaction.Result = result.getRequired("result")

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
    fun status(): FinancialTransaction.Status = status.getRequired("status")

    /** Globally unique identifier. */
    fun token(): String = token.getRequired("token")

    /** Date and time when the financial transaction was last updated. UTC time zone. */
    fun updated(): OffsetDateTime = updated.getRequired("updated")

    fun methodAttributes(): Payment.PaymentMethodAttributes =
        methodAttributes.getRequired("method_attributes")

    fun externalBankAccountToken(): String? =
        externalBankAccountToken.getNullable("external_bank_account_token")

    fun direction(): Payment.Direction = direction.getRequired("direction")

    fun source(): Payment.Source = source.getRequired("source")

    fun method(): Payment.Method = method.getRequired("method")

    fun userDefinedId(): String? = userDefinedId.getNullable("user_defined_id")

    fun toFinancialTransaction(): FinancialTransaction =
        FinancialTransaction.builder()
            .category(category)
            .created(created)
            .currency(currency)
            .descriptor(descriptor)
            .events(events)
            .pendingAmount(pendingAmount)
            .result(result)
            .settledAmount(settledAmount)
            .status(status)
            .token(token)
            .updated(updated)
            .build()

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

        private var category: JsonField<FinancialTransaction.Category> = JsonMissing.of()
        private var created: JsonField<OffsetDateTime> = JsonMissing.of()
        private var currency: JsonField<String> = JsonMissing.of()
        private var descriptor: JsonField<String> = JsonMissing.of()
        private var events: JsonField<List<FinancialTransaction.FinancialEvent>> = JsonMissing.of()
        private var pendingAmount: JsonField<Long> = JsonMissing.of()
        private var result: JsonField<FinancialTransaction.Result> = JsonMissing.of()
        private var settledAmount: JsonField<Long> = JsonMissing.of()
        private var status: JsonField<FinancialTransaction.Status> = JsonMissing.of()
        private var token: JsonField<String> = JsonMissing.of()
        private var updated: JsonField<OffsetDateTime> = JsonMissing.of()
        private var methodAttributes: JsonField<Payment.PaymentMethodAttributes> = JsonMissing.of()
        private var externalBankAccountToken: JsonField<String> = JsonMissing.of()
        private var direction: JsonField<Payment.Direction> = JsonMissing.of()
        private var source: JsonField<Payment.Source> = JsonMissing.of()
        private var method: JsonField<Payment.Method> = JsonMissing.of()
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
        fun category(category: FinancialTransaction.Category) = category(JsonField.of(category))

        /**
         * Status types:
         *
         * - `CARD` - Issuing card transaction.
         * - `ACH` - Transaction over ACH.
         * - `TRANSFER` - Internal transfer of funds between financial accounts in your program.
         */
        @JsonProperty("category")
        @ExcludeMissing
        fun category(category: JsonField<FinancialTransaction.Category>) = apply {
            this.category = category
        }

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
        fun events(events: List<FinancialTransaction.FinancialEvent>) = events(JsonField.of(events))

        /** A list of all financial events that have modified this financial transaction. */
        @JsonProperty("events")
        @ExcludeMissing
        fun events(events: JsonField<List<FinancialTransaction.FinancialEvent>>) = apply {
            this.events = events
        }

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
        fun result(result: FinancialTransaction.Result) = result(JsonField.of(result))

        /**
         * APPROVED transactions were successful while DECLINED transactions were declined by user,
         * Lithic, or the network.
         */
        @JsonProperty("result")
        @ExcludeMissing
        fun result(result: JsonField<FinancialTransaction.Result>) = apply { this.result = result }

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
        fun status(status: FinancialTransaction.Status) = status(JsonField.of(status))

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
        fun status(status: JsonField<FinancialTransaction.Status>) = apply { this.status = status }

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

        fun methodAttributes(methodAttributes: Payment.PaymentMethodAttributes) =
            methodAttributes(JsonField.of(methodAttributes))

        @JsonProperty("method_attributes")
        @ExcludeMissing
        fun methodAttributes(methodAttributes: JsonField<Payment.PaymentMethodAttributes>) = apply {
            this.methodAttributes = methodAttributes
        }

        fun externalBankAccountToken(externalBankAccountToken: String) =
            externalBankAccountToken(JsonField.of(externalBankAccountToken))

        @JsonProperty("external_bank_account_token")
        @ExcludeMissing
        fun externalBankAccountToken(externalBankAccountToken: JsonField<String>) = apply {
            this.externalBankAccountToken = externalBankAccountToken
        }

        fun direction(direction: Payment.Direction) = direction(JsonField.of(direction))

        @JsonProperty("direction")
        @ExcludeMissing
        fun direction(direction: JsonField<Payment.Direction>) = apply {
            this.direction = direction
        }

        fun source(source: Payment.Source) = source(JsonField.of(source))

        @JsonProperty("source")
        @ExcludeMissing
        fun source(source: JsonField<Payment.Source>) = apply { this.source = source }

        fun method(method: Payment.Method) = method(JsonField.of(method))

        @JsonProperty("method")
        @ExcludeMissing
        fun method(method: JsonField<Payment.Method>) = apply { this.method = method }

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