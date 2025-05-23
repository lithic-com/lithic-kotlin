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
import com.lithic.api.core.checkRequired
import com.lithic.api.errors.LithicInvalidDataException
import java.time.LocalDate
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects

class Statement
private constructor(
    private val token: JsonField<String>,
    private val accountStanding: JsonField<AccountStanding>,
    private val amountDue: JsonField<AmountDue>,
    private val availableCredit: JsonField<Long>,
    private val created: JsonField<OffsetDateTime>,
    private val creditLimit: JsonField<Long>,
    private val creditProductToken: JsonField<String>,
    private val daysInBillingCycle: JsonField<Long>,
    private val endingBalance: JsonField<Long>,
    private val financialAccountToken: JsonField<String>,
    private val paymentDueDate: JsonField<LocalDate>,
    private val periodTotals: JsonField<StatementTotals>,
    private val startingBalance: JsonField<Long>,
    private val statementEndDate: JsonField<LocalDate>,
    private val statementStartDate: JsonField<LocalDate>,
    private val statementType: JsonField<StatementType>,
    private val updated: JsonField<OffsetDateTime>,
    private val ytdTotals: JsonField<StatementTotals>,
    private val interestDetails: JsonField<InterestDetails>,
    private val nextPaymentDueDate: JsonField<LocalDate>,
    private val nextStatementEndDate: JsonField<LocalDate>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("token") @ExcludeMissing token: JsonField<String> = JsonMissing.of(),
        @JsonProperty("account_standing")
        @ExcludeMissing
        accountStanding: JsonField<AccountStanding> = JsonMissing.of(),
        @JsonProperty("amount_due")
        @ExcludeMissing
        amountDue: JsonField<AmountDue> = JsonMissing.of(),
        @JsonProperty("available_credit")
        @ExcludeMissing
        availableCredit: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("created")
        @ExcludeMissing
        created: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("credit_limit")
        @ExcludeMissing
        creditLimit: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("credit_product_token")
        @ExcludeMissing
        creditProductToken: JsonField<String> = JsonMissing.of(),
        @JsonProperty("days_in_billing_cycle")
        @ExcludeMissing
        daysInBillingCycle: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("ending_balance")
        @ExcludeMissing
        endingBalance: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("financial_account_token")
        @ExcludeMissing
        financialAccountToken: JsonField<String> = JsonMissing.of(),
        @JsonProperty("payment_due_date")
        @ExcludeMissing
        paymentDueDate: JsonField<LocalDate> = JsonMissing.of(),
        @JsonProperty("period_totals")
        @ExcludeMissing
        periodTotals: JsonField<StatementTotals> = JsonMissing.of(),
        @JsonProperty("starting_balance")
        @ExcludeMissing
        startingBalance: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("statement_end_date")
        @ExcludeMissing
        statementEndDate: JsonField<LocalDate> = JsonMissing.of(),
        @JsonProperty("statement_start_date")
        @ExcludeMissing
        statementStartDate: JsonField<LocalDate> = JsonMissing.of(),
        @JsonProperty("statement_type")
        @ExcludeMissing
        statementType: JsonField<StatementType> = JsonMissing.of(),
        @JsonProperty("updated")
        @ExcludeMissing
        updated: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("ytd_totals")
        @ExcludeMissing
        ytdTotals: JsonField<StatementTotals> = JsonMissing.of(),
        @JsonProperty("interest_details")
        @ExcludeMissing
        interestDetails: JsonField<InterestDetails> = JsonMissing.of(),
        @JsonProperty("next_payment_due_date")
        @ExcludeMissing
        nextPaymentDueDate: JsonField<LocalDate> = JsonMissing.of(),
        @JsonProperty("next_statement_end_date")
        @ExcludeMissing
        nextStatementEndDate: JsonField<LocalDate> = JsonMissing.of(),
    ) : this(
        token,
        accountStanding,
        amountDue,
        availableCredit,
        created,
        creditLimit,
        creditProductToken,
        daysInBillingCycle,
        endingBalance,
        financialAccountToken,
        paymentDueDate,
        periodTotals,
        startingBalance,
        statementEndDate,
        statementStartDate,
        statementType,
        updated,
        ytdTotals,
        interestDetails,
        nextPaymentDueDate,
        nextStatementEndDate,
        mutableMapOf(),
    )

    /**
     * Globally unique identifier for a statement
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun token(): String = token.getRequired("token")

    /**
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun accountStanding(): AccountStanding = accountStanding.getRequired("account_standing")

    /**
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun amountDue(): AmountDue = amountDue.getRequired("amount_due")

    /**
     * Amount of credit available to spend in cents
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun availableCredit(): Long = availableCredit.getRequired("available_credit")

    /**
     * Timestamp of when the statement was created
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun created(): OffsetDateTime = created.getRequired("created")

    /**
     * This is the maximum credit balance extended by the lender in cents
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun creditLimit(): Long = creditLimit.getRequired("credit_limit")

    /**
     * Globally unique identifier for a credit product
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun creditProductToken(): String = creditProductToken.getRequired("credit_product_token")

    /**
     * Number of days in the billing cycle
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun daysInBillingCycle(): Long = daysInBillingCycle.getRequired("days_in_billing_cycle")

    /**
     * Balance at the end of the billing period. For charge cards, this should be the same at the
     * statement amount due in cents
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun endingBalance(): Long = endingBalance.getRequired("ending_balance")

    /**
     * Globally unique identifier for a financial account
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun financialAccountToken(): String =
        financialAccountToken.getRequired("financial_account_token")

    /**
     * Date when the payment is due
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun paymentDueDate(): LocalDate? = paymentDueDate.getNullable("payment_due_date")

    /**
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun periodTotals(): StatementTotals = periodTotals.getRequired("period_totals")

    /**
     * Balance at the start of the billing period
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun startingBalance(): Long = startingBalance.getRequired("starting_balance")

    /**
     * Date when the billing period ended
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun statementEndDate(): LocalDate = statementEndDate.getRequired("statement_end_date")

    /**
     * Date when the billing period began
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun statementStartDate(): LocalDate = statementStartDate.getRequired("statement_start_date")

    /**
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun statementType(): StatementType = statementType.getRequired("statement_type")

    /**
     * Timestamp of when the statement was updated
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun updated(): OffsetDateTime = updated.getRequired("updated")

    /**
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun ytdTotals(): StatementTotals = ytdTotals.getRequired("ytd_totals")

    /**
     * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun interestDetails(): InterestDetails? = interestDetails.getNullable("interest_details")

    /**
     * Date when the next payment is due
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun nextPaymentDueDate(): LocalDate? = nextPaymentDueDate.getNullable("next_payment_due_date")

    /**
     * Date when the next billing period will end
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun nextStatementEndDate(): LocalDate? =
        nextStatementEndDate.getNullable("next_statement_end_date")

    /**
     * Returns the raw JSON value of [token].
     *
     * Unlike [token], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("token") @ExcludeMissing fun _token(): JsonField<String> = token

    /**
     * Returns the raw JSON value of [accountStanding].
     *
     * Unlike [accountStanding], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("account_standing")
    @ExcludeMissing
    fun _accountStanding(): JsonField<AccountStanding> = accountStanding

    /**
     * Returns the raw JSON value of [amountDue].
     *
     * Unlike [amountDue], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("amount_due") @ExcludeMissing fun _amountDue(): JsonField<AmountDue> = amountDue

    /**
     * Returns the raw JSON value of [availableCredit].
     *
     * Unlike [availableCredit], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("available_credit")
    @ExcludeMissing
    fun _availableCredit(): JsonField<Long> = availableCredit

    /**
     * Returns the raw JSON value of [created].
     *
     * Unlike [created], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("created") @ExcludeMissing fun _created(): JsonField<OffsetDateTime> = created

    /**
     * Returns the raw JSON value of [creditLimit].
     *
     * Unlike [creditLimit], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("credit_limit") @ExcludeMissing fun _creditLimit(): JsonField<Long> = creditLimit

    /**
     * Returns the raw JSON value of [creditProductToken].
     *
     * Unlike [creditProductToken], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("credit_product_token")
    @ExcludeMissing
    fun _creditProductToken(): JsonField<String> = creditProductToken

    /**
     * Returns the raw JSON value of [daysInBillingCycle].
     *
     * Unlike [daysInBillingCycle], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("days_in_billing_cycle")
    @ExcludeMissing
    fun _daysInBillingCycle(): JsonField<Long> = daysInBillingCycle

    /**
     * Returns the raw JSON value of [endingBalance].
     *
     * Unlike [endingBalance], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("ending_balance")
    @ExcludeMissing
    fun _endingBalance(): JsonField<Long> = endingBalance

    /**
     * Returns the raw JSON value of [financialAccountToken].
     *
     * Unlike [financialAccountToken], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("financial_account_token")
    @ExcludeMissing
    fun _financialAccountToken(): JsonField<String> = financialAccountToken

    /**
     * Returns the raw JSON value of [paymentDueDate].
     *
     * Unlike [paymentDueDate], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("payment_due_date")
    @ExcludeMissing
    fun _paymentDueDate(): JsonField<LocalDate> = paymentDueDate

    /**
     * Returns the raw JSON value of [periodTotals].
     *
     * Unlike [periodTotals], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("period_totals")
    @ExcludeMissing
    fun _periodTotals(): JsonField<StatementTotals> = periodTotals

    /**
     * Returns the raw JSON value of [startingBalance].
     *
     * Unlike [startingBalance], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("starting_balance")
    @ExcludeMissing
    fun _startingBalance(): JsonField<Long> = startingBalance

    /**
     * Returns the raw JSON value of [statementEndDate].
     *
     * Unlike [statementEndDate], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("statement_end_date")
    @ExcludeMissing
    fun _statementEndDate(): JsonField<LocalDate> = statementEndDate

    /**
     * Returns the raw JSON value of [statementStartDate].
     *
     * Unlike [statementStartDate], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("statement_start_date")
    @ExcludeMissing
    fun _statementStartDate(): JsonField<LocalDate> = statementStartDate

    /**
     * Returns the raw JSON value of [statementType].
     *
     * Unlike [statementType], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("statement_type")
    @ExcludeMissing
    fun _statementType(): JsonField<StatementType> = statementType

    /**
     * Returns the raw JSON value of [updated].
     *
     * Unlike [updated], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("updated") @ExcludeMissing fun _updated(): JsonField<OffsetDateTime> = updated

    /**
     * Returns the raw JSON value of [ytdTotals].
     *
     * Unlike [ytdTotals], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("ytd_totals")
    @ExcludeMissing
    fun _ytdTotals(): JsonField<StatementTotals> = ytdTotals

    /**
     * Returns the raw JSON value of [interestDetails].
     *
     * Unlike [interestDetails], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("interest_details")
    @ExcludeMissing
    fun _interestDetails(): JsonField<InterestDetails> = interestDetails

    /**
     * Returns the raw JSON value of [nextPaymentDueDate].
     *
     * Unlike [nextPaymentDueDate], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("next_payment_due_date")
    @ExcludeMissing
    fun _nextPaymentDueDate(): JsonField<LocalDate> = nextPaymentDueDate

    /**
     * Returns the raw JSON value of [nextStatementEndDate].
     *
     * Unlike [nextStatementEndDate], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("next_statement_end_date")
    @ExcludeMissing
    fun _nextStatementEndDate(): JsonField<LocalDate> = nextStatementEndDate

    @JsonAnySetter
    private fun putAdditionalProperty(key: String, value: JsonValue) {
        additionalProperties.put(key, value)
    }

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> =
        Collections.unmodifiableMap(additionalProperties)

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [Statement].
         *
         * The following fields are required:
         * ```kotlin
         * .token()
         * .accountStanding()
         * .amountDue()
         * .availableCredit()
         * .created()
         * .creditLimit()
         * .creditProductToken()
         * .daysInBillingCycle()
         * .endingBalance()
         * .financialAccountToken()
         * .paymentDueDate()
         * .periodTotals()
         * .startingBalance()
         * .statementEndDate()
         * .statementStartDate()
         * .statementType()
         * .updated()
         * .ytdTotals()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [Statement]. */
    class Builder internal constructor() {

        private var token: JsonField<String>? = null
        private var accountStanding: JsonField<AccountStanding>? = null
        private var amountDue: JsonField<AmountDue>? = null
        private var availableCredit: JsonField<Long>? = null
        private var created: JsonField<OffsetDateTime>? = null
        private var creditLimit: JsonField<Long>? = null
        private var creditProductToken: JsonField<String>? = null
        private var daysInBillingCycle: JsonField<Long>? = null
        private var endingBalance: JsonField<Long>? = null
        private var financialAccountToken: JsonField<String>? = null
        private var paymentDueDate: JsonField<LocalDate>? = null
        private var periodTotals: JsonField<StatementTotals>? = null
        private var startingBalance: JsonField<Long>? = null
        private var statementEndDate: JsonField<LocalDate>? = null
        private var statementStartDate: JsonField<LocalDate>? = null
        private var statementType: JsonField<StatementType>? = null
        private var updated: JsonField<OffsetDateTime>? = null
        private var ytdTotals: JsonField<StatementTotals>? = null
        private var interestDetails: JsonField<InterestDetails> = JsonMissing.of()
        private var nextPaymentDueDate: JsonField<LocalDate> = JsonMissing.of()
        private var nextStatementEndDate: JsonField<LocalDate> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(statement: Statement) = apply {
            token = statement.token
            accountStanding = statement.accountStanding
            amountDue = statement.amountDue
            availableCredit = statement.availableCredit
            created = statement.created
            creditLimit = statement.creditLimit
            creditProductToken = statement.creditProductToken
            daysInBillingCycle = statement.daysInBillingCycle
            endingBalance = statement.endingBalance
            financialAccountToken = statement.financialAccountToken
            paymentDueDate = statement.paymentDueDate
            periodTotals = statement.periodTotals
            startingBalance = statement.startingBalance
            statementEndDate = statement.statementEndDate
            statementStartDate = statement.statementStartDate
            statementType = statement.statementType
            updated = statement.updated
            ytdTotals = statement.ytdTotals
            interestDetails = statement.interestDetails
            nextPaymentDueDate = statement.nextPaymentDueDate
            nextStatementEndDate = statement.nextStatementEndDate
            additionalProperties = statement.additionalProperties.toMutableMap()
        }

        /** Globally unique identifier for a statement */
        fun token(token: String) = token(JsonField.of(token))

        /**
         * Sets [Builder.token] to an arbitrary JSON value.
         *
         * You should usually call [Builder.token] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun token(token: JsonField<String>) = apply { this.token = token }

        fun accountStanding(accountStanding: AccountStanding) =
            accountStanding(JsonField.of(accountStanding))

        /**
         * Sets [Builder.accountStanding] to an arbitrary JSON value.
         *
         * You should usually call [Builder.accountStanding] with a well-typed [AccountStanding]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun accountStanding(accountStanding: JsonField<AccountStanding>) = apply {
            this.accountStanding = accountStanding
        }

        fun amountDue(amountDue: AmountDue) = amountDue(JsonField.of(amountDue))

        /**
         * Sets [Builder.amountDue] to an arbitrary JSON value.
         *
         * You should usually call [Builder.amountDue] with a well-typed [AmountDue] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun amountDue(amountDue: JsonField<AmountDue>) = apply { this.amountDue = amountDue }

        /** Amount of credit available to spend in cents */
        fun availableCredit(availableCredit: Long) = availableCredit(JsonField.of(availableCredit))

        /**
         * Sets [Builder.availableCredit] to an arbitrary JSON value.
         *
         * You should usually call [Builder.availableCredit] with a well-typed [Long] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun availableCredit(availableCredit: JsonField<Long>) = apply {
            this.availableCredit = availableCredit
        }

        /** Timestamp of when the statement was created */
        fun created(created: OffsetDateTime) = created(JsonField.of(created))

        /**
         * Sets [Builder.created] to an arbitrary JSON value.
         *
         * You should usually call [Builder.created] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun created(created: JsonField<OffsetDateTime>) = apply { this.created = created }

        /** This is the maximum credit balance extended by the lender in cents */
        fun creditLimit(creditLimit: Long) = creditLimit(JsonField.of(creditLimit))

        /**
         * Sets [Builder.creditLimit] to an arbitrary JSON value.
         *
         * You should usually call [Builder.creditLimit] with a well-typed [Long] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun creditLimit(creditLimit: JsonField<Long>) = apply { this.creditLimit = creditLimit }

        /** Globally unique identifier for a credit product */
        fun creditProductToken(creditProductToken: String) =
            creditProductToken(JsonField.of(creditProductToken))

        /**
         * Sets [Builder.creditProductToken] to an arbitrary JSON value.
         *
         * You should usually call [Builder.creditProductToken] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun creditProductToken(creditProductToken: JsonField<String>) = apply {
            this.creditProductToken = creditProductToken
        }

        /** Number of days in the billing cycle */
        fun daysInBillingCycle(daysInBillingCycle: Long) =
            daysInBillingCycle(JsonField.of(daysInBillingCycle))

        /**
         * Sets [Builder.daysInBillingCycle] to an arbitrary JSON value.
         *
         * You should usually call [Builder.daysInBillingCycle] with a well-typed [Long] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun daysInBillingCycle(daysInBillingCycle: JsonField<Long>) = apply {
            this.daysInBillingCycle = daysInBillingCycle
        }

        /**
         * Balance at the end of the billing period. For charge cards, this should be the same at
         * the statement amount due in cents
         */
        fun endingBalance(endingBalance: Long) = endingBalance(JsonField.of(endingBalance))

        /**
         * Sets [Builder.endingBalance] to an arbitrary JSON value.
         *
         * You should usually call [Builder.endingBalance] with a well-typed [Long] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun endingBalance(endingBalance: JsonField<Long>) = apply {
            this.endingBalance = endingBalance
        }

        /** Globally unique identifier for a financial account */
        fun financialAccountToken(financialAccountToken: String) =
            financialAccountToken(JsonField.of(financialAccountToken))

        /**
         * Sets [Builder.financialAccountToken] to an arbitrary JSON value.
         *
         * You should usually call [Builder.financialAccountToken] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun financialAccountToken(financialAccountToken: JsonField<String>) = apply {
            this.financialAccountToken = financialAccountToken
        }

        /** Date when the payment is due */
        fun paymentDueDate(paymentDueDate: LocalDate?) =
            paymentDueDate(JsonField.ofNullable(paymentDueDate))

        /**
         * Sets [Builder.paymentDueDate] to an arbitrary JSON value.
         *
         * You should usually call [Builder.paymentDueDate] with a well-typed [LocalDate] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun paymentDueDate(paymentDueDate: JsonField<LocalDate>) = apply {
            this.paymentDueDate = paymentDueDate
        }

        fun periodTotals(periodTotals: StatementTotals) = periodTotals(JsonField.of(periodTotals))

        /**
         * Sets [Builder.periodTotals] to an arbitrary JSON value.
         *
         * You should usually call [Builder.periodTotals] with a well-typed [StatementTotals] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun periodTotals(periodTotals: JsonField<StatementTotals>) = apply {
            this.periodTotals = periodTotals
        }

        /** Balance at the start of the billing period */
        fun startingBalance(startingBalance: Long) = startingBalance(JsonField.of(startingBalance))

        /**
         * Sets [Builder.startingBalance] to an arbitrary JSON value.
         *
         * You should usually call [Builder.startingBalance] with a well-typed [Long] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun startingBalance(startingBalance: JsonField<Long>) = apply {
            this.startingBalance = startingBalance
        }

        /** Date when the billing period ended */
        fun statementEndDate(statementEndDate: LocalDate) =
            statementEndDate(JsonField.of(statementEndDate))

        /**
         * Sets [Builder.statementEndDate] to an arbitrary JSON value.
         *
         * You should usually call [Builder.statementEndDate] with a well-typed [LocalDate] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun statementEndDate(statementEndDate: JsonField<LocalDate>) = apply {
            this.statementEndDate = statementEndDate
        }

        /** Date when the billing period began */
        fun statementStartDate(statementStartDate: LocalDate) =
            statementStartDate(JsonField.of(statementStartDate))

        /**
         * Sets [Builder.statementStartDate] to an arbitrary JSON value.
         *
         * You should usually call [Builder.statementStartDate] with a well-typed [LocalDate] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun statementStartDate(statementStartDate: JsonField<LocalDate>) = apply {
            this.statementStartDate = statementStartDate
        }

        fun statementType(statementType: StatementType) = statementType(JsonField.of(statementType))

        /**
         * Sets [Builder.statementType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.statementType] with a well-typed [StatementType] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun statementType(statementType: JsonField<StatementType>) = apply {
            this.statementType = statementType
        }

        /** Timestamp of when the statement was updated */
        fun updated(updated: OffsetDateTime) = updated(JsonField.of(updated))

        /**
         * Sets [Builder.updated] to an arbitrary JSON value.
         *
         * You should usually call [Builder.updated] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun updated(updated: JsonField<OffsetDateTime>) = apply { this.updated = updated }

        fun ytdTotals(ytdTotals: StatementTotals) = ytdTotals(JsonField.of(ytdTotals))

        /**
         * Sets [Builder.ytdTotals] to an arbitrary JSON value.
         *
         * You should usually call [Builder.ytdTotals] with a well-typed [StatementTotals] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun ytdTotals(ytdTotals: JsonField<StatementTotals>) = apply { this.ytdTotals = ytdTotals }

        fun interestDetails(interestDetails: InterestDetails?) =
            interestDetails(JsonField.ofNullable(interestDetails))

        /**
         * Sets [Builder.interestDetails] to an arbitrary JSON value.
         *
         * You should usually call [Builder.interestDetails] with a well-typed [InterestDetails]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun interestDetails(interestDetails: JsonField<InterestDetails>) = apply {
            this.interestDetails = interestDetails
        }

        /** Date when the next payment is due */
        fun nextPaymentDueDate(nextPaymentDueDate: LocalDate) =
            nextPaymentDueDate(JsonField.of(nextPaymentDueDate))

        /**
         * Sets [Builder.nextPaymentDueDate] to an arbitrary JSON value.
         *
         * You should usually call [Builder.nextPaymentDueDate] with a well-typed [LocalDate] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun nextPaymentDueDate(nextPaymentDueDate: JsonField<LocalDate>) = apply {
            this.nextPaymentDueDate = nextPaymentDueDate
        }

        /** Date when the next billing period will end */
        fun nextStatementEndDate(nextStatementEndDate: LocalDate) =
            nextStatementEndDate(JsonField.of(nextStatementEndDate))

        /**
         * Sets [Builder.nextStatementEndDate] to an arbitrary JSON value.
         *
         * You should usually call [Builder.nextStatementEndDate] with a well-typed [LocalDate]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun nextStatementEndDate(nextStatementEndDate: JsonField<LocalDate>) = apply {
            this.nextStatementEndDate = nextStatementEndDate
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

        /**
         * Returns an immutable instance of [Statement].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```kotlin
         * .token()
         * .accountStanding()
         * .amountDue()
         * .availableCredit()
         * .created()
         * .creditLimit()
         * .creditProductToken()
         * .daysInBillingCycle()
         * .endingBalance()
         * .financialAccountToken()
         * .paymentDueDate()
         * .periodTotals()
         * .startingBalance()
         * .statementEndDate()
         * .statementStartDate()
         * .statementType()
         * .updated()
         * .ytdTotals()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): Statement =
            Statement(
                checkRequired("token", token),
                checkRequired("accountStanding", accountStanding),
                checkRequired("amountDue", amountDue),
                checkRequired("availableCredit", availableCredit),
                checkRequired("created", created),
                checkRequired("creditLimit", creditLimit),
                checkRequired("creditProductToken", creditProductToken),
                checkRequired("daysInBillingCycle", daysInBillingCycle),
                checkRequired("endingBalance", endingBalance),
                checkRequired("financialAccountToken", financialAccountToken),
                checkRequired("paymentDueDate", paymentDueDate),
                checkRequired("periodTotals", periodTotals),
                checkRequired("startingBalance", startingBalance),
                checkRequired("statementEndDate", statementEndDate),
                checkRequired("statementStartDate", statementStartDate),
                checkRequired("statementType", statementType),
                checkRequired("updated", updated),
                checkRequired("ytdTotals", ytdTotals),
                interestDetails,
                nextPaymentDueDate,
                nextStatementEndDate,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): Statement = apply {
        if (validated) {
            return@apply
        }

        token()
        accountStanding().validate()
        amountDue().validate()
        availableCredit()
        created()
        creditLimit()
        creditProductToken()
        daysInBillingCycle()
        endingBalance()
        financialAccountToken()
        paymentDueDate()
        periodTotals().validate()
        startingBalance()
        statementEndDate()
        statementStartDate()
        statementType().validate()
        updated()
        ytdTotals().validate()
        interestDetails()?.validate()
        nextPaymentDueDate()
        nextStatementEndDate()
        validated = true
    }

    fun isValid(): Boolean =
        try {
            validate()
            true
        } catch (e: LithicInvalidDataException) {
            false
        }

    /**
     * Returns a score indicating how many valid values are contained in this object recursively.
     *
     * Used for best match union deserialization.
     */
    internal fun validity(): Int =
        (if (token.asKnown() == null) 0 else 1) +
            (accountStanding.asKnown()?.validity() ?: 0) +
            (amountDue.asKnown()?.validity() ?: 0) +
            (if (availableCredit.asKnown() == null) 0 else 1) +
            (if (created.asKnown() == null) 0 else 1) +
            (if (creditLimit.asKnown() == null) 0 else 1) +
            (if (creditProductToken.asKnown() == null) 0 else 1) +
            (if (daysInBillingCycle.asKnown() == null) 0 else 1) +
            (if (endingBalance.asKnown() == null) 0 else 1) +
            (if (financialAccountToken.asKnown() == null) 0 else 1) +
            (if (paymentDueDate.asKnown() == null) 0 else 1) +
            (periodTotals.asKnown()?.validity() ?: 0) +
            (if (startingBalance.asKnown() == null) 0 else 1) +
            (if (statementEndDate.asKnown() == null) 0 else 1) +
            (if (statementStartDate.asKnown() == null) 0 else 1) +
            (statementType.asKnown()?.validity() ?: 0) +
            (if (updated.asKnown() == null) 0 else 1) +
            (ytdTotals.asKnown()?.validity() ?: 0) +
            (interestDetails.asKnown()?.validity() ?: 0) +
            (if (nextPaymentDueDate.asKnown() == null) 0 else 1) +
            (if (nextStatementEndDate.asKnown() == null) 0 else 1)

    class AccountStanding
    private constructor(
        private val consecutiveFullPaymentsMade: JsonField<Long>,
        private val consecutiveMinimumPaymentsMade: JsonField<Long>,
        private val consecutiveMinimumPaymentsMissed: JsonField<Long>,
        private val daysPastDue: JsonField<Long>,
        private val financialAccountState: JsonField<FinancialAccountState>,
        private val hasGrace: JsonField<Boolean>,
        private val periodNumber: JsonField<Long>,
        private val periodState: JsonField<PeriodState>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("consecutive_full_payments_made")
            @ExcludeMissing
            consecutiveFullPaymentsMade: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("consecutive_minimum_payments_made")
            @ExcludeMissing
            consecutiveMinimumPaymentsMade: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("consecutive_minimum_payments_missed")
            @ExcludeMissing
            consecutiveMinimumPaymentsMissed: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("days_past_due")
            @ExcludeMissing
            daysPastDue: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("financial_account_state")
            @ExcludeMissing
            financialAccountState: JsonField<FinancialAccountState> = JsonMissing.of(),
            @JsonProperty("has_grace")
            @ExcludeMissing
            hasGrace: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("period_number")
            @ExcludeMissing
            periodNumber: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("period_state")
            @ExcludeMissing
            periodState: JsonField<PeriodState> = JsonMissing.of(),
        ) : this(
            consecutiveFullPaymentsMade,
            consecutiveMinimumPaymentsMade,
            consecutiveMinimumPaymentsMissed,
            daysPastDue,
            financialAccountState,
            hasGrace,
            periodNumber,
            periodState,
            mutableMapOf(),
        )

        /**
         * Number of consecutive full payments made
         *
         * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun consecutiveFullPaymentsMade(): Long =
            consecutiveFullPaymentsMade.getRequired("consecutive_full_payments_made")

        /**
         * Number of consecutive minimum payments made
         *
         * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun consecutiveMinimumPaymentsMade(): Long =
            consecutiveMinimumPaymentsMade.getRequired("consecutive_minimum_payments_made")

        /**
         * Number of consecutive minimum payments missed
         *
         * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun consecutiveMinimumPaymentsMissed(): Long =
            consecutiveMinimumPaymentsMissed.getRequired("consecutive_minimum_payments_missed")

        /**
         * Number of days past due
         *
         * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun daysPastDue(): Long = daysPastDue.getRequired("days_past_due")

        /**
         * Information about the financial account state
         *
         * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun financialAccountState(): FinancialAccountState =
            financialAccountState.getRequired("financial_account_state")

        /**
         * Whether the account currently has grace or not
         *
         * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun hasGrace(): Boolean = hasGrace.getRequired("has_grace")

        /**
         * Current overall period number
         *
         * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun periodNumber(): Long = periodNumber.getRequired("period_number")

        /**
         * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun periodState(): PeriodState = periodState.getRequired("period_state")

        /**
         * Returns the raw JSON value of [consecutiveFullPaymentsMade].
         *
         * Unlike [consecutiveFullPaymentsMade], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("consecutive_full_payments_made")
        @ExcludeMissing
        fun _consecutiveFullPaymentsMade(): JsonField<Long> = consecutiveFullPaymentsMade

        /**
         * Returns the raw JSON value of [consecutiveMinimumPaymentsMade].
         *
         * Unlike [consecutiveMinimumPaymentsMade], this method doesn't throw if the JSON field has
         * an unexpected type.
         */
        @JsonProperty("consecutive_minimum_payments_made")
        @ExcludeMissing
        fun _consecutiveMinimumPaymentsMade(): JsonField<Long> = consecutiveMinimumPaymentsMade

        /**
         * Returns the raw JSON value of [consecutiveMinimumPaymentsMissed].
         *
         * Unlike [consecutiveMinimumPaymentsMissed], this method doesn't throw if the JSON field
         * has an unexpected type.
         */
        @JsonProperty("consecutive_minimum_payments_missed")
        @ExcludeMissing
        fun _consecutiveMinimumPaymentsMissed(): JsonField<Long> = consecutiveMinimumPaymentsMissed

        /**
         * Returns the raw JSON value of [daysPastDue].
         *
         * Unlike [daysPastDue], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("days_past_due")
        @ExcludeMissing
        fun _daysPastDue(): JsonField<Long> = daysPastDue

        /**
         * Returns the raw JSON value of [financialAccountState].
         *
         * Unlike [financialAccountState], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("financial_account_state")
        @ExcludeMissing
        fun _financialAccountState(): JsonField<FinancialAccountState> = financialAccountState

        /**
         * Returns the raw JSON value of [hasGrace].
         *
         * Unlike [hasGrace], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("has_grace") @ExcludeMissing fun _hasGrace(): JsonField<Boolean> = hasGrace

        /**
         * Returns the raw JSON value of [periodNumber].
         *
         * Unlike [periodNumber], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("period_number")
        @ExcludeMissing
        fun _periodNumber(): JsonField<Long> = periodNumber

        /**
         * Returns the raw JSON value of [periodState].
         *
         * Unlike [periodState], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("period_state")
        @ExcludeMissing
        fun _periodState(): JsonField<PeriodState> = periodState

        @JsonAnySetter
        private fun putAdditionalProperty(key: String, value: JsonValue) {
            additionalProperties.put(key, value)
        }

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> =
            Collections.unmodifiableMap(additionalProperties)

        fun toBuilder() = Builder().from(this)

        companion object {

            /**
             * Returns a mutable builder for constructing an instance of [AccountStanding].
             *
             * The following fields are required:
             * ```kotlin
             * .consecutiveFullPaymentsMade()
             * .consecutiveMinimumPaymentsMade()
             * .consecutiveMinimumPaymentsMissed()
             * .daysPastDue()
             * .financialAccountState()
             * .hasGrace()
             * .periodNumber()
             * .periodState()
             * ```
             */
            fun builder() = Builder()
        }

        /** A builder for [AccountStanding]. */
        class Builder internal constructor() {

            private var consecutiveFullPaymentsMade: JsonField<Long>? = null
            private var consecutiveMinimumPaymentsMade: JsonField<Long>? = null
            private var consecutiveMinimumPaymentsMissed: JsonField<Long>? = null
            private var daysPastDue: JsonField<Long>? = null
            private var financialAccountState: JsonField<FinancialAccountState>? = null
            private var hasGrace: JsonField<Boolean>? = null
            private var periodNumber: JsonField<Long>? = null
            private var periodState: JsonField<PeriodState>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(accountStanding: AccountStanding) = apply {
                consecutiveFullPaymentsMade = accountStanding.consecutiveFullPaymentsMade
                consecutiveMinimumPaymentsMade = accountStanding.consecutiveMinimumPaymentsMade
                consecutiveMinimumPaymentsMissed = accountStanding.consecutiveMinimumPaymentsMissed
                daysPastDue = accountStanding.daysPastDue
                financialAccountState = accountStanding.financialAccountState
                hasGrace = accountStanding.hasGrace
                periodNumber = accountStanding.periodNumber
                periodState = accountStanding.periodState
                additionalProperties = accountStanding.additionalProperties.toMutableMap()
            }

            /** Number of consecutive full payments made */
            fun consecutiveFullPaymentsMade(consecutiveFullPaymentsMade: Long) =
                consecutiveFullPaymentsMade(JsonField.of(consecutiveFullPaymentsMade))

            /**
             * Sets [Builder.consecutiveFullPaymentsMade] to an arbitrary JSON value.
             *
             * You should usually call [Builder.consecutiveFullPaymentsMade] with a well-typed
             * [Long] value instead. This method is primarily for setting the field to an
             * undocumented or not yet supported value.
             */
            fun consecutiveFullPaymentsMade(consecutiveFullPaymentsMade: JsonField<Long>) = apply {
                this.consecutiveFullPaymentsMade = consecutiveFullPaymentsMade
            }

            /** Number of consecutive minimum payments made */
            fun consecutiveMinimumPaymentsMade(consecutiveMinimumPaymentsMade: Long) =
                consecutiveMinimumPaymentsMade(JsonField.of(consecutiveMinimumPaymentsMade))

            /**
             * Sets [Builder.consecutiveMinimumPaymentsMade] to an arbitrary JSON value.
             *
             * You should usually call [Builder.consecutiveMinimumPaymentsMade] with a well-typed
             * [Long] value instead. This method is primarily for setting the field to an
             * undocumented or not yet supported value.
             */
            fun consecutiveMinimumPaymentsMade(consecutiveMinimumPaymentsMade: JsonField<Long>) =
                apply {
                    this.consecutiveMinimumPaymentsMade = consecutiveMinimumPaymentsMade
                }

            /** Number of consecutive minimum payments missed */
            fun consecutiveMinimumPaymentsMissed(consecutiveMinimumPaymentsMissed: Long) =
                consecutiveMinimumPaymentsMissed(JsonField.of(consecutiveMinimumPaymentsMissed))

            /**
             * Sets [Builder.consecutiveMinimumPaymentsMissed] to an arbitrary JSON value.
             *
             * You should usually call [Builder.consecutiveMinimumPaymentsMissed] with a well-typed
             * [Long] value instead. This method is primarily for setting the field to an
             * undocumented or not yet supported value.
             */
            fun consecutiveMinimumPaymentsMissed(
                consecutiveMinimumPaymentsMissed: JsonField<Long>
            ) = apply { this.consecutiveMinimumPaymentsMissed = consecutiveMinimumPaymentsMissed }

            /** Number of days past due */
            fun daysPastDue(daysPastDue: Long) = daysPastDue(JsonField.of(daysPastDue))

            /**
             * Sets [Builder.daysPastDue] to an arbitrary JSON value.
             *
             * You should usually call [Builder.daysPastDue] with a well-typed [Long] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun daysPastDue(daysPastDue: JsonField<Long>) = apply { this.daysPastDue = daysPastDue }

            /** Information about the financial account state */
            fun financialAccountState(financialAccountState: FinancialAccountState) =
                financialAccountState(JsonField.of(financialAccountState))

            /**
             * Sets [Builder.financialAccountState] to an arbitrary JSON value.
             *
             * You should usually call [Builder.financialAccountState] with a well-typed
             * [FinancialAccountState] value instead. This method is primarily for setting the field
             * to an undocumented or not yet supported value.
             */
            fun financialAccountState(financialAccountState: JsonField<FinancialAccountState>) =
                apply {
                    this.financialAccountState = financialAccountState
                }

            /** Whether the account currently has grace or not */
            fun hasGrace(hasGrace: Boolean) = hasGrace(JsonField.of(hasGrace))

            /**
             * Sets [Builder.hasGrace] to an arbitrary JSON value.
             *
             * You should usually call [Builder.hasGrace] with a well-typed [Boolean] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun hasGrace(hasGrace: JsonField<Boolean>) = apply { this.hasGrace = hasGrace }

            /** Current overall period number */
            fun periodNumber(periodNumber: Long) = periodNumber(JsonField.of(periodNumber))

            /**
             * Sets [Builder.periodNumber] to an arbitrary JSON value.
             *
             * You should usually call [Builder.periodNumber] with a well-typed [Long] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun periodNumber(periodNumber: JsonField<Long>) = apply {
                this.periodNumber = periodNumber
            }

            fun periodState(periodState: PeriodState) = periodState(JsonField.of(periodState))

            /**
             * Sets [Builder.periodState] to an arbitrary JSON value.
             *
             * You should usually call [Builder.periodState] with a well-typed [PeriodState] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun periodState(periodState: JsonField<PeriodState>) = apply {
                this.periodState = periodState
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

            /**
             * Returns an immutable instance of [AccountStanding].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```kotlin
             * .consecutiveFullPaymentsMade()
             * .consecutiveMinimumPaymentsMade()
             * .consecutiveMinimumPaymentsMissed()
             * .daysPastDue()
             * .financialAccountState()
             * .hasGrace()
             * .periodNumber()
             * .periodState()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): AccountStanding =
                AccountStanding(
                    checkRequired("consecutiveFullPaymentsMade", consecutiveFullPaymentsMade),
                    checkRequired("consecutiveMinimumPaymentsMade", consecutiveMinimumPaymentsMade),
                    checkRequired(
                        "consecutiveMinimumPaymentsMissed",
                        consecutiveMinimumPaymentsMissed,
                    ),
                    checkRequired("daysPastDue", daysPastDue),
                    checkRequired("financialAccountState", financialAccountState),
                    checkRequired("hasGrace", hasGrace),
                    checkRequired("periodNumber", periodNumber),
                    checkRequired("periodState", periodState),
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): AccountStanding = apply {
            if (validated) {
                return@apply
            }

            consecutiveFullPaymentsMade()
            consecutiveMinimumPaymentsMade()
            consecutiveMinimumPaymentsMissed()
            daysPastDue()
            financialAccountState().validate()
            hasGrace()
            periodNumber()
            periodState().validate()
            validated = true
        }

        fun isValid(): Boolean =
            try {
                validate()
                true
            } catch (e: LithicInvalidDataException) {
                false
            }

        /**
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        internal fun validity(): Int =
            (if (consecutiveFullPaymentsMade.asKnown() == null) 0 else 1) +
                (if (consecutiveMinimumPaymentsMade.asKnown() == null) 0 else 1) +
                (if (consecutiveMinimumPaymentsMissed.asKnown() == null) 0 else 1) +
                (if (daysPastDue.asKnown() == null) 0 else 1) +
                (financialAccountState.asKnown()?.validity() ?: 0) +
                (if (hasGrace.asKnown() == null) 0 else 1) +
                (if (periodNumber.asKnown() == null) 0 else 1) +
                (periodState.asKnown()?.validity() ?: 0)

        /** Information about the financial account state */
        class FinancialAccountState
        private constructor(
            private val status: JsonField<FinancialAccountStatus>,
            private val substatus: JsonField<FinancialAccountSubstatus>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("status")
                @ExcludeMissing
                status: JsonField<FinancialAccountStatus> = JsonMissing.of(),
                @JsonProperty("substatus")
                @ExcludeMissing
                substatus: JsonField<FinancialAccountSubstatus> = JsonMissing.of(),
            ) : this(status, substatus, mutableMapOf())

            /**
             * Status of the financial account
             *
             * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun status(): FinancialAccountStatus = status.getRequired("status")

            /**
             * Substatus for the financial account
             *
             * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun substatus(): FinancialAccountSubstatus? = substatus.getNullable("substatus")

            /**
             * Returns the raw JSON value of [status].
             *
             * Unlike [status], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("status")
            @ExcludeMissing
            fun _status(): JsonField<FinancialAccountStatus> = status

            /**
             * Returns the raw JSON value of [substatus].
             *
             * Unlike [substatus], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("substatus")
            @ExcludeMissing
            fun _substatus(): JsonField<FinancialAccountSubstatus> = substatus

            @JsonAnySetter
            private fun putAdditionalProperty(key: String, value: JsonValue) {
                additionalProperties.put(key, value)
            }

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> =
                Collections.unmodifiableMap(additionalProperties)

            fun toBuilder() = Builder().from(this)

            companion object {

                /**
                 * Returns a mutable builder for constructing an instance of
                 * [FinancialAccountState].
                 *
                 * The following fields are required:
                 * ```kotlin
                 * .status()
                 * ```
                 */
                fun builder() = Builder()
            }

            /** A builder for [FinancialAccountState]. */
            class Builder internal constructor() {

                private var status: JsonField<FinancialAccountStatus>? = null
                private var substatus: JsonField<FinancialAccountSubstatus> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(financialAccountState: FinancialAccountState) = apply {
                    status = financialAccountState.status
                    substatus = financialAccountState.substatus
                    additionalProperties = financialAccountState.additionalProperties.toMutableMap()
                }

                /** Status of the financial account */
                fun status(status: FinancialAccountStatus) = status(JsonField.of(status))

                /**
                 * Sets [Builder.status] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.status] with a well-typed
                 * [FinancialAccountStatus] value instead. This method is primarily for setting the
                 * field to an undocumented or not yet supported value.
                 */
                fun status(status: JsonField<FinancialAccountStatus>) = apply {
                    this.status = status
                }

                /** Substatus for the financial account */
                fun substatus(substatus: FinancialAccountSubstatus?) =
                    substatus(JsonField.ofNullable(substatus))

                /**
                 * Sets [Builder.substatus] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.substatus] with a well-typed
                 * [FinancialAccountSubstatus] value instead. This method is primarily for setting
                 * the field to an undocumented or not yet supported value.
                 */
                fun substatus(substatus: JsonField<FinancialAccountSubstatus>) = apply {
                    this.substatus = substatus
                }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                    keys.forEach(::removeAdditionalProperty)
                }

                /**
                 * Returns an immutable instance of [FinancialAccountState].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```kotlin
                 * .status()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): FinancialAccountState =
                    FinancialAccountState(
                        checkRequired("status", status),
                        substatus,
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): FinancialAccountState = apply {
                if (validated) {
                    return@apply
                }

                status().validate()
                substatus()?.validate()
                validated = true
            }

            fun isValid(): Boolean =
                try {
                    validate()
                    true
                } catch (e: LithicInvalidDataException) {
                    false
                }

            /**
             * Returns a score indicating how many valid values are contained in this object
             * recursively.
             *
             * Used for best match union deserialization.
             */
            internal fun validity(): Int =
                (status.asKnown()?.validity() ?: 0) + (substatus.asKnown()?.validity() ?: 0)

            /** Status of the financial account */
            class FinancialAccountStatus
            @JsonCreator
            private constructor(private val value: JsonField<String>) : Enum {

                /**
                 * Returns this class instance's raw value.
                 *
                 * This is usually only useful if this instance was deserialized from data that
                 * doesn't match any known member, and you want to know that value. For example, if
                 * the SDK is on an older version than the API, then the API may respond with new
                 * members that the SDK is unaware of.
                 */
                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                companion object {

                    val OPEN = of("OPEN")

                    val CLOSED = of("CLOSED")

                    val SUSPENDED = of("SUSPENDED")

                    val PENDING = of("PENDING")

                    fun of(value: String) = FinancialAccountStatus(JsonField.of(value))
                }

                /** An enum containing [FinancialAccountStatus]'s known values. */
                enum class Known {
                    OPEN,
                    CLOSED,
                    SUSPENDED,
                    PENDING,
                }

                /**
                 * An enum containing [FinancialAccountStatus]'s known values, as well as an
                 * [_UNKNOWN] member.
                 *
                 * An instance of [FinancialAccountStatus] can contain an unknown value in a couple
                 * of cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    OPEN,
                    CLOSED,
                    SUSPENDED,
                    PENDING,
                    /**
                     * An enum member indicating that [FinancialAccountStatus] was instantiated with
                     * an unknown value.
                     */
                    _UNKNOWN,
                }

                /**
                 * Returns an enum member corresponding to this class instance's value, or
                 * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                 *
                 * Use the [known] method instead if you're certain the value is always known or if
                 * you want to throw for the unknown case.
                 */
                fun value(): Value =
                    when (this) {
                        OPEN -> Value.OPEN
                        CLOSED -> Value.CLOSED
                        SUSPENDED -> Value.SUSPENDED
                        PENDING -> Value.PENDING
                        else -> Value._UNKNOWN
                    }

                /**
                 * Returns an enum member corresponding to this class instance's value.
                 *
                 * Use the [value] method instead if you're uncertain the value is always known and
                 * don't want to throw for the unknown case.
                 *
                 * @throws LithicInvalidDataException if this class instance's value is a not a
                 *   known member.
                 */
                fun known(): Known =
                    when (this) {
                        OPEN -> Known.OPEN
                        CLOSED -> Known.CLOSED
                        SUSPENDED -> Known.SUSPENDED
                        PENDING -> Known.PENDING
                        else ->
                            throw LithicInvalidDataException(
                                "Unknown FinancialAccountStatus: $value"
                            )
                    }

                /**
                 * Returns this class instance's primitive wire representation.
                 *
                 * This differs from the [toString] method because that method is primarily for
                 * debugging and generally doesn't throw.
                 *
                 * @throws LithicInvalidDataException if this class instance's value does not have
                 *   the expected primitive type.
                 */
                fun asString(): String =
                    _value().asString() ?: throw LithicInvalidDataException("Value is not a String")

                private var validated: Boolean = false

                fun validate(): FinancialAccountStatus = apply {
                    if (validated) {
                        return@apply
                    }

                    known()
                    validated = true
                }

                fun isValid(): Boolean =
                    try {
                        validate()
                        true
                    } catch (e: LithicInvalidDataException) {
                        false
                    }

                /**
                 * Returns a score indicating how many valid values are contained in this object
                 * recursively.
                 *
                 * Used for best match union deserialization.
                 */
                internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is FinancialAccountStatus && value == other.value /* spotless:on */
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            /** Substatus for the financial account */
            class FinancialAccountSubstatus
            @JsonCreator
            private constructor(private val value: JsonField<String>) : Enum {

                /**
                 * Returns this class instance's raw value.
                 *
                 * This is usually only useful if this instance was deserialized from data that
                 * doesn't match any known member, and you want to know that value. For example, if
                 * the SDK is on an older version than the API, then the API may respond with new
                 * members that the SDK is unaware of.
                 */
                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                companion object {

                    val CHARGED_OFF_DELINQUENT = of("CHARGED_OFF_DELINQUENT")

                    val CHARGED_OFF_FRAUD = of("CHARGED_OFF_FRAUD")

                    val END_USER_REQUEST = of("END_USER_REQUEST")

                    val BANK_REQUEST = of("BANK_REQUEST")

                    val DELINQUENT = of("DELINQUENT")

                    fun of(value: String) = FinancialAccountSubstatus(JsonField.of(value))
                }

                /** An enum containing [FinancialAccountSubstatus]'s known values. */
                enum class Known {
                    CHARGED_OFF_DELINQUENT,
                    CHARGED_OFF_FRAUD,
                    END_USER_REQUEST,
                    BANK_REQUEST,
                    DELINQUENT,
                }

                /**
                 * An enum containing [FinancialAccountSubstatus]'s known values, as well as an
                 * [_UNKNOWN] member.
                 *
                 * An instance of [FinancialAccountSubstatus] can contain an unknown value in a
                 * couple of cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    CHARGED_OFF_DELINQUENT,
                    CHARGED_OFF_FRAUD,
                    END_USER_REQUEST,
                    BANK_REQUEST,
                    DELINQUENT,
                    /**
                     * An enum member indicating that [FinancialAccountSubstatus] was instantiated
                     * with an unknown value.
                     */
                    _UNKNOWN,
                }

                /**
                 * Returns an enum member corresponding to this class instance's value, or
                 * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                 *
                 * Use the [known] method instead if you're certain the value is always known or if
                 * you want to throw for the unknown case.
                 */
                fun value(): Value =
                    when (this) {
                        CHARGED_OFF_DELINQUENT -> Value.CHARGED_OFF_DELINQUENT
                        CHARGED_OFF_FRAUD -> Value.CHARGED_OFF_FRAUD
                        END_USER_REQUEST -> Value.END_USER_REQUEST
                        BANK_REQUEST -> Value.BANK_REQUEST
                        DELINQUENT -> Value.DELINQUENT
                        else -> Value._UNKNOWN
                    }

                /**
                 * Returns an enum member corresponding to this class instance's value.
                 *
                 * Use the [value] method instead if you're uncertain the value is always known and
                 * don't want to throw for the unknown case.
                 *
                 * @throws LithicInvalidDataException if this class instance's value is a not a
                 *   known member.
                 */
                fun known(): Known =
                    when (this) {
                        CHARGED_OFF_DELINQUENT -> Known.CHARGED_OFF_DELINQUENT
                        CHARGED_OFF_FRAUD -> Known.CHARGED_OFF_FRAUD
                        END_USER_REQUEST -> Known.END_USER_REQUEST
                        BANK_REQUEST -> Known.BANK_REQUEST
                        DELINQUENT -> Known.DELINQUENT
                        else ->
                            throw LithicInvalidDataException(
                                "Unknown FinancialAccountSubstatus: $value"
                            )
                    }

                /**
                 * Returns this class instance's primitive wire representation.
                 *
                 * This differs from the [toString] method because that method is primarily for
                 * debugging and generally doesn't throw.
                 *
                 * @throws LithicInvalidDataException if this class instance's value does not have
                 *   the expected primitive type.
                 */
                fun asString(): String =
                    _value().asString() ?: throw LithicInvalidDataException("Value is not a String")

                private var validated: Boolean = false

                fun validate(): FinancialAccountSubstatus = apply {
                    if (validated) {
                        return@apply
                    }

                    known()
                    validated = true
                }

                fun isValid(): Boolean =
                    try {
                        validate()
                        true
                    } catch (e: LithicInvalidDataException) {
                        false
                    }

                /**
                 * Returns a score indicating how many valid values are contained in this object
                 * recursively.
                 *
                 * Used for best match union deserialization.
                 */
                internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is FinancialAccountSubstatus && value == other.value /* spotless:on */
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is FinancialAccountState && status == other.status && substatus == other.substatus && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(status, substatus, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "FinancialAccountState{status=$status, substatus=$substatus, additionalProperties=$additionalProperties}"
        }

        class PeriodState @JsonCreator private constructor(private val value: JsonField<String>) :
            Enum {

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

                val STANDARD = of("STANDARD")

                val PROMO = of("PROMO")

                val PENALTY = of("PENALTY")

                fun of(value: String) = PeriodState(JsonField.of(value))
            }

            /** An enum containing [PeriodState]'s known values. */
            enum class Known {
                STANDARD,
                PROMO,
                PENALTY,
            }

            /**
             * An enum containing [PeriodState]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [PeriodState] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                STANDARD,
                PROMO,
                PENALTY,
                /**
                 * An enum member indicating that [PeriodState] was instantiated with an unknown
                 * value.
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
                    STANDARD -> Value.STANDARD
                    PROMO -> Value.PROMO
                    PENALTY -> Value.PENALTY
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
                    STANDARD -> Known.STANDARD
                    PROMO -> Known.PROMO
                    PENALTY -> Known.PENALTY
                    else -> throw LithicInvalidDataException("Unknown PeriodState: $value")
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

            private var validated: Boolean = false

            fun validate(): PeriodState = apply {
                if (validated) {
                    return@apply
                }

                known()
                validated = true
            }

            fun isValid(): Boolean =
                try {
                    validate()
                    true
                } catch (e: LithicInvalidDataException) {
                    false
                }

            /**
             * Returns a score indicating how many valid values are contained in this object
             * recursively.
             *
             * Used for best match union deserialization.
             */
            internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is PeriodState && value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is AccountStanding && consecutiveFullPaymentsMade == other.consecutiveFullPaymentsMade && consecutiveMinimumPaymentsMade == other.consecutiveMinimumPaymentsMade && consecutiveMinimumPaymentsMissed == other.consecutiveMinimumPaymentsMissed && daysPastDue == other.daysPastDue && financialAccountState == other.financialAccountState && hasGrace == other.hasGrace && periodNumber == other.periodNumber && periodState == other.periodState && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(consecutiveFullPaymentsMade, consecutiveMinimumPaymentsMade, consecutiveMinimumPaymentsMissed, daysPastDue, financialAccountState, hasGrace, periodNumber, periodState, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "AccountStanding{consecutiveFullPaymentsMade=$consecutiveFullPaymentsMade, consecutiveMinimumPaymentsMade=$consecutiveMinimumPaymentsMade, consecutiveMinimumPaymentsMissed=$consecutiveMinimumPaymentsMissed, daysPastDue=$daysPastDue, financialAccountState=$financialAccountState, hasGrace=$hasGrace, periodNumber=$periodNumber, periodState=$periodState, additionalProperties=$additionalProperties}"
    }

    class AmountDue
    private constructor(
        private val amount: JsonField<Long>,
        private val pastDue: JsonField<Long>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("amount") @ExcludeMissing amount: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("past_due") @ExcludeMissing pastDue: JsonField<Long> = JsonMissing.of(),
        ) : this(amount, pastDue, mutableMapOf())

        /**
         * Payment due at the end of the billing period in cents. Negative amount indicates
         * something is owed. If the amount owed is positive there was a net credit. If
         * auto-collections are enabled this is the amount that will be requested on the payment due
         * date
         *
         * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun amount(): Long = amount.getRequired("amount")

        /**
         * Amount past due for statement in cents
         *
         * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun pastDue(): Long = pastDue.getRequired("past_due")

        /**
         * Returns the raw JSON value of [amount].
         *
         * Unlike [amount], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("amount") @ExcludeMissing fun _amount(): JsonField<Long> = amount

        /**
         * Returns the raw JSON value of [pastDue].
         *
         * Unlike [pastDue], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("past_due") @ExcludeMissing fun _pastDue(): JsonField<Long> = pastDue

        @JsonAnySetter
        private fun putAdditionalProperty(key: String, value: JsonValue) {
            additionalProperties.put(key, value)
        }

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> =
            Collections.unmodifiableMap(additionalProperties)

        fun toBuilder() = Builder().from(this)

        companion object {

            /**
             * Returns a mutable builder for constructing an instance of [AmountDue].
             *
             * The following fields are required:
             * ```kotlin
             * .amount()
             * .pastDue()
             * ```
             */
            fun builder() = Builder()
        }

        /** A builder for [AmountDue]. */
        class Builder internal constructor() {

            private var amount: JsonField<Long>? = null
            private var pastDue: JsonField<Long>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(amountDue: AmountDue) = apply {
                amount = amountDue.amount
                pastDue = amountDue.pastDue
                additionalProperties = amountDue.additionalProperties.toMutableMap()
            }

            /**
             * Payment due at the end of the billing period in cents. Negative amount indicates
             * something is owed. If the amount owed is positive there was a net credit. If
             * auto-collections are enabled this is the amount that will be requested on the payment
             * due date
             */
            fun amount(amount: Long) = amount(JsonField.of(amount))

            /**
             * Sets [Builder.amount] to an arbitrary JSON value.
             *
             * You should usually call [Builder.amount] with a well-typed [Long] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun amount(amount: JsonField<Long>) = apply { this.amount = amount }

            /** Amount past due for statement in cents */
            fun pastDue(pastDue: Long) = pastDue(JsonField.of(pastDue))

            /**
             * Sets [Builder.pastDue] to an arbitrary JSON value.
             *
             * You should usually call [Builder.pastDue] with a well-typed [Long] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun pastDue(pastDue: JsonField<Long>) = apply { this.pastDue = pastDue }

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

            /**
             * Returns an immutable instance of [AmountDue].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```kotlin
             * .amount()
             * .pastDue()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): AmountDue =
                AmountDue(
                    checkRequired("amount", amount),
                    checkRequired("pastDue", pastDue),
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): AmountDue = apply {
            if (validated) {
                return@apply
            }

            amount()
            pastDue()
            validated = true
        }

        fun isValid(): Boolean =
            try {
                validate()
                true
            } catch (e: LithicInvalidDataException) {
                false
            }

        /**
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        internal fun validity(): Int =
            (if (amount.asKnown() == null) 0 else 1) + (if (pastDue.asKnown() == null) 0 else 1)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is AmountDue && amount == other.amount && pastDue == other.pastDue && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(amount, pastDue, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "AmountDue{amount=$amount, pastDue=$pastDue, additionalProperties=$additionalProperties}"
    }

    class StatementTotals
    private constructor(
        private val balanceTransfers: JsonField<Long>,
        private val cashAdvances: JsonField<Long>,
        private val credits: JsonField<Long>,
        private val fees: JsonField<Long>,
        private val interest: JsonField<Long>,
        private val payments: JsonField<Long>,
        private val purchases: JsonField<Long>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("balance_transfers")
            @ExcludeMissing
            balanceTransfers: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("cash_advances")
            @ExcludeMissing
            cashAdvances: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("credits") @ExcludeMissing credits: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("fees") @ExcludeMissing fees: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("interest") @ExcludeMissing interest: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("payments") @ExcludeMissing payments: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("purchases") @ExcludeMissing purchases: JsonField<Long> = JsonMissing.of(),
        ) : this(
            balanceTransfers,
            cashAdvances,
            credits,
            fees,
            interest,
            payments,
            purchases,
            mutableMapOf(),
        )

        /**
         * Opening balance transferred from previous account in cents
         *
         * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun balanceTransfers(): Long = balanceTransfers.getRequired("balance_transfers")

        /**
         * ATM and cashback transactions in cents
         *
         * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun cashAdvances(): Long = cashAdvances.getRequired("cash_advances")

        /**
         * Volume of credit management operation transactions less any balance transfers in cents
         *
         * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun credits(): Long = credits.getRequired("credits")

        /**
         * Volume of debit management operation transactions less any interest in cents
         *
         * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun fees(): Long = fees.getRequired("fees")

        /**
         * Interest accrued in cents
         *
         * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun interest(): Long = interest.getRequired("interest")

        /**
         * Any funds transfers which affective the balance in cents
         *
         * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun payments(): Long = payments.getRequired("payments")

        /**
         * Net card transaction volume less any cash advances in cents
         *
         * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun purchases(): Long = purchases.getRequired("purchases")

        /**
         * Returns the raw JSON value of [balanceTransfers].
         *
         * Unlike [balanceTransfers], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("balance_transfers")
        @ExcludeMissing
        fun _balanceTransfers(): JsonField<Long> = balanceTransfers

        /**
         * Returns the raw JSON value of [cashAdvances].
         *
         * Unlike [cashAdvances], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("cash_advances")
        @ExcludeMissing
        fun _cashAdvances(): JsonField<Long> = cashAdvances

        /**
         * Returns the raw JSON value of [credits].
         *
         * Unlike [credits], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("credits") @ExcludeMissing fun _credits(): JsonField<Long> = credits

        /**
         * Returns the raw JSON value of [fees].
         *
         * Unlike [fees], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("fees") @ExcludeMissing fun _fees(): JsonField<Long> = fees

        /**
         * Returns the raw JSON value of [interest].
         *
         * Unlike [interest], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("interest") @ExcludeMissing fun _interest(): JsonField<Long> = interest

        /**
         * Returns the raw JSON value of [payments].
         *
         * Unlike [payments], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("payments") @ExcludeMissing fun _payments(): JsonField<Long> = payments

        /**
         * Returns the raw JSON value of [purchases].
         *
         * Unlike [purchases], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("purchases") @ExcludeMissing fun _purchases(): JsonField<Long> = purchases

        @JsonAnySetter
        private fun putAdditionalProperty(key: String, value: JsonValue) {
            additionalProperties.put(key, value)
        }

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> =
            Collections.unmodifiableMap(additionalProperties)

        fun toBuilder() = Builder().from(this)

        companion object {

            /**
             * Returns a mutable builder for constructing an instance of [StatementTotals].
             *
             * The following fields are required:
             * ```kotlin
             * .balanceTransfers()
             * .cashAdvances()
             * .credits()
             * .fees()
             * .interest()
             * .payments()
             * .purchases()
             * ```
             */
            fun builder() = Builder()
        }

        /** A builder for [StatementTotals]. */
        class Builder internal constructor() {

            private var balanceTransfers: JsonField<Long>? = null
            private var cashAdvances: JsonField<Long>? = null
            private var credits: JsonField<Long>? = null
            private var fees: JsonField<Long>? = null
            private var interest: JsonField<Long>? = null
            private var payments: JsonField<Long>? = null
            private var purchases: JsonField<Long>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(statementTotals: StatementTotals) = apply {
                balanceTransfers = statementTotals.balanceTransfers
                cashAdvances = statementTotals.cashAdvances
                credits = statementTotals.credits
                fees = statementTotals.fees
                interest = statementTotals.interest
                payments = statementTotals.payments
                purchases = statementTotals.purchases
                additionalProperties = statementTotals.additionalProperties.toMutableMap()
            }

            /** Opening balance transferred from previous account in cents */
            fun balanceTransfers(balanceTransfers: Long) =
                balanceTransfers(JsonField.of(balanceTransfers))

            /**
             * Sets [Builder.balanceTransfers] to an arbitrary JSON value.
             *
             * You should usually call [Builder.balanceTransfers] with a well-typed [Long] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun balanceTransfers(balanceTransfers: JsonField<Long>) = apply {
                this.balanceTransfers = balanceTransfers
            }

            /** ATM and cashback transactions in cents */
            fun cashAdvances(cashAdvances: Long) = cashAdvances(JsonField.of(cashAdvances))

            /**
             * Sets [Builder.cashAdvances] to an arbitrary JSON value.
             *
             * You should usually call [Builder.cashAdvances] with a well-typed [Long] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun cashAdvances(cashAdvances: JsonField<Long>) = apply {
                this.cashAdvances = cashAdvances
            }

            /**
             * Volume of credit management operation transactions less any balance transfers in
             * cents
             */
            fun credits(credits: Long) = credits(JsonField.of(credits))

            /**
             * Sets [Builder.credits] to an arbitrary JSON value.
             *
             * You should usually call [Builder.credits] with a well-typed [Long] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun credits(credits: JsonField<Long>) = apply { this.credits = credits }

            /** Volume of debit management operation transactions less any interest in cents */
            fun fees(fees: Long) = fees(JsonField.of(fees))

            /**
             * Sets [Builder.fees] to an arbitrary JSON value.
             *
             * You should usually call [Builder.fees] with a well-typed [Long] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun fees(fees: JsonField<Long>) = apply { this.fees = fees }

            /** Interest accrued in cents */
            fun interest(interest: Long) = interest(JsonField.of(interest))

            /**
             * Sets [Builder.interest] to an arbitrary JSON value.
             *
             * You should usually call [Builder.interest] with a well-typed [Long] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun interest(interest: JsonField<Long>) = apply { this.interest = interest }

            /** Any funds transfers which affective the balance in cents */
            fun payments(payments: Long) = payments(JsonField.of(payments))

            /**
             * Sets [Builder.payments] to an arbitrary JSON value.
             *
             * You should usually call [Builder.payments] with a well-typed [Long] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun payments(payments: JsonField<Long>) = apply { this.payments = payments }

            /** Net card transaction volume less any cash advances in cents */
            fun purchases(purchases: Long) = purchases(JsonField.of(purchases))

            /**
             * Sets [Builder.purchases] to an arbitrary JSON value.
             *
             * You should usually call [Builder.purchases] with a well-typed [Long] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun purchases(purchases: JsonField<Long>) = apply { this.purchases = purchases }

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

            /**
             * Returns an immutable instance of [StatementTotals].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```kotlin
             * .balanceTransfers()
             * .cashAdvances()
             * .credits()
             * .fees()
             * .interest()
             * .payments()
             * .purchases()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): StatementTotals =
                StatementTotals(
                    checkRequired("balanceTransfers", balanceTransfers),
                    checkRequired("cashAdvances", cashAdvances),
                    checkRequired("credits", credits),
                    checkRequired("fees", fees),
                    checkRequired("interest", interest),
                    checkRequired("payments", payments),
                    checkRequired("purchases", purchases),
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): StatementTotals = apply {
            if (validated) {
                return@apply
            }

            balanceTransfers()
            cashAdvances()
            credits()
            fees()
            interest()
            payments()
            purchases()
            validated = true
        }

        fun isValid(): Boolean =
            try {
                validate()
                true
            } catch (e: LithicInvalidDataException) {
                false
            }

        /**
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        internal fun validity(): Int =
            (if (balanceTransfers.asKnown() == null) 0 else 1) +
                (if (cashAdvances.asKnown() == null) 0 else 1) +
                (if (credits.asKnown() == null) 0 else 1) +
                (if (fees.asKnown() == null) 0 else 1) +
                (if (interest.asKnown() == null) 0 else 1) +
                (if (payments.asKnown() == null) 0 else 1) +
                (if (purchases.asKnown() == null) 0 else 1)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is StatementTotals && balanceTransfers == other.balanceTransfers && cashAdvances == other.cashAdvances && credits == other.credits && fees == other.fees && interest == other.interest && payments == other.payments && purchases == other.purchases && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(balanceTransfers, cashAdvances, credits, fees, interest, payments, purchases, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "StatementTotals{balanceTransfers=$balanceTransfers, cashAdvances=$cashAdvances, credits=$credits, fees=$fees, interest=$interest, payments=$payments, purchases=$purchases, additionalProperties=$additionalProperties}"
    }

    class StatementType @JsonCreator private constructor(private val value: JsonField<String>) :
        Enum {

        /**
         * Returns this class instance's raw value.
         *
         * This is usually only useful if this instance was deserialized from data that doesn't
         * match any known member, and you want to know that value. For example, if the SDK is on an
         * older version than the API, then the API may respond with new members that the SDK is
         * unaware of.
         */
        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            val INITIAL = of("INITIAL")

            val PERIOD_END = of("PERIOD_END")

            val FINAL = of("FINAL")

            fun of(value: String) = StatementType(JsonField.of(value))
        }

        /** An enum containing [StatementType]'s known values. */
        enum class Known {
            INITIAL,
            PERIOD_END,
            FINAL,
        }

        /**
         * An enum containing [StatementType]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [StatementType] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            INITIAL,
            PERIOD_END,
            FINAL,
            /**
             * An enum member indicating that [StatementType] was instantiated with an unknown
             * value.
             */
            _UNKNOWN,
        }

        /**
         * Returns an enum member corresponding to this class instance's value, or [Value._UNKNOWN]
         * if the class was instantiated with an unknown value.
         *
         * Use the [known] method instead if you're certain the value is always known or if you want
         * to throw for the unknown case.
         */
        fun value(): Value =
            when (this) {
                INITIAL -> Value.INITIAL
                PERIOD_END -> Value.PERIOD_END
                FINAL -> Value.FINAL
                else -> Value._UNKNOWN
            }

        /**
         * Returns an enum member corresponding to this class instance's value.
         *
         * Use the [value] method instead if you're uncertain the value is always known and don't
         * want to throw for the unknown case.
         *
         * @throws LithicInvalidDataException if this class instance's value is a not a known
         *   member.
         */
        fun known(): Known =
            when (this) {
                INITIAL -> Known.INITIAL
                PERIOD_END -> Known.PERIOD_END
                FINAL -> Known.FINAL
                else -> throw LithicInvalidDataException("Unknown StatementType: $value")
            }

        /**
         * Returns this class instance's primitive wire representation.
         *
         * This differs from the [toString] method because that method is primarily for debugging
         * and generally doesn't throw.
         *
         * @throws LithicInvalidDataException if this class instance's value does not have the
         *   expected primitive type.
         */
        fun asString(): String =
            _value().asString() ?: throw LithicInvalidDataException("Value is not a String")

        private var validated: Boolean = false

        fun validate(): StatementType = apply {
            if (validated) {
                return@apply
            }

            known()
            validated = true
        }

        fun isValid(): Boolean =
            try {
                validate()
                true
            } catch (e: LithicInvalidDataException) {
                false
            }

        /**
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is StatementType && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    class InterestDetails
    private constructor(
        private val actualInterestCharged: JsonField<Long>,
        private val dailyBalanceAmounts: JsonField<CategoryDetails>,
        private val effectiveApr: JsonField<CategoryDetails>,
        private val interestCalculationMethod: JsonField<InterestCalculationMethod>,
        private val interestForPeriod: JsonField<CategoryDetails>,
        private val primeRate: JsonField<String>,
        private val minimumInterestCharged: JsonField<Long>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("actual_interest_charged")
            @ExcludeMissing
            actualInterestCharged: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("daily_balance_amounts")
            @ExcludeMissing
            dailyBalanceAmounts: JsonField<CategoryDetails> = JsonMissing.of(),
            @JsonProperty("effective_apr")
            @ExcludeMissing
            effectiveApr: JsonField<CategoryDetails> = JsonMissing.of(),
            @JsonProperty("interest_calculation_method")
            @ExcludeMissing
            interestCalculationMethod: JsonField<InterestCalculationMethod> = JsonMissing.of(),
            @JsonProperty("interest_for_period")
            @ExcludeMissing
            interestForPeriod: JsonField<CategoryDetails> = JsonMissing.of(),
            @JsonProperty("prime_rate")
            @ExcludeMissing
            primeRate: JsonField<String> = JsonMissing.of(),
            @JsonProperty("minimum_interest_charged")
            @ExcludeMissing
            minimumInterestCharged: JsonField<Long> = JsonMissing.of(),
        ) : this(
            actualInterestCharged,
            dailyBalanceAmounts,
            effectiveApr,
            interestCalculationMethod,
            interestForPeriod,
            primeRate,
            minimumInterestCharged,
            mutableMapOf(),
        )

        /**
         * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun actualInterestCharged(): Long? =
            actualInterestCharged.getNullable("actual_interest_charged")

        /**
         * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun dailyBalanceAmounts(): CategoryDetails =
            dailyBalanceAmounts.getRequired("daily_balance_amounts")

        /**
         * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun effectiveApr(): CategoryDetails = effectiveApr.getRequired("effective_apr")

        /**
         * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun interestCalculationMethod(): InterestCalculationMethod =
            interestCalculationMethod.getRequired("interest_calculation_method")

        /**
         * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun interestForPeriod(): CategoryDetails =
            interestForPeriod.getRequired("interest_for_period")

        /**
         * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun primeRate(): String? = primeRate.getNullable("prime_rate")

        /**
         * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun minimumInterestCharged(): Long? =
            minimumInterestCharged.getNullable("minimum_interest_charged")

        /**
         * Returns the raw JSON value of [actualInterestCharged].
         *
         * Unlike [actualInterestCharged], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("actual_interest_charged")
        @ExcludeMissing
        fun _actualInterestCharged(): JsonField<Long> = actualInterestCharged

        /**
         * Returns the raw JSON value of [dailyBalanceAmounts].
         *
         * Unlike [dailyBalanceAmounts], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("daily_balance_amounts")
        @ExcludeMissing
        fun _dailyBalanceAmounts(): JsonField<CategoryDetails> = dailyBalanceAmounts

        /**
         * Returns the raw JSON value of [effectiveApr].
         *
         * Unlike [effectiveApr], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("effective_apr")
        @ExcludeMissing
        fun _effectiveApr(): JsonField<CategoryDetails> = effectiveApr

        /**
         * Returns the raw JSON value of [interestCalculationMethod].
         *
         * Unlike [interestCalculationMethod], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("interest_calculation_method")
        @ExcludeMissing
        fun _interestCalculationMethod(): JsonField<InterestCalculationMethod> =
            interestCalculationMethod

        /**
         * Returns the raw JSON value of [interestForPeriod].
         *
         * Unlike [interestForPeriod], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("interest_for_period")
        @ExcludeMissing
        fun _interestForPeriod(): JsonField<CategoryDetails> = interestForPeriod

        /**
         * Returns the raw JSON value of [primeRate].
         *
         * Unlike [primeRate], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("prime_rate") @ExcludeMissing fun _primeRate(): JsonField<String> = primeRate

        /**
         * Returns the raw JSON value of [minimumInterestCharged].
         *
         * Unlike [minimumInterestCharged], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("minimum_interest_charged")
        @ExcludeMissing
        fun _minimumInterestCharged(): JsonField<Long> = minimumInterestCharged

        @JsonAnySetter
        private fun putAdditionalProperty(key: String, value: JsonValue) {
            additionalProperties.put(key, value)
        }

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> =
            Collections.unmodifiableMap(additionalProperties)

        fun toBuilder() = Builder().from(this)

        companion object {

            /**
             * Returns a mutable builder for constructing an instance of [InterestDetails].
             *
             * The following fields are required:
             * ```kotlin
             * .actualInterestCharged()
             * .dailyBalanceAmounts()
             * .effectiveApr()
             * .interestCalculationMethod()
             * .interestForPeriod()
             * .primeRate()
             * ```
             */
            fun builder() = Builder()
        }

        /** A builder for [InterestDetails]. */
        class Builder internal constructor() {

            private var actualInterestCharged: JsonField<Long>? = null
            private var dailyBalanceAmounts: JsonField<CategoryDetails>? = null
            private var effectiveApr: JsonField<CategoryDetails>? = null
            private var interestCalculationMethod: JsonField<InterestCalculationMethod>? = null
            private var interestForPeriod: JsonField<CategoryDetails>? = null
            private var primeRate: JsonField<String>? = null
            private var minimumInterestCharged: JsonField<Long> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(interestDetails: InterestDetails) = apply {
                actualInterestCharged = interestDetails.actualInterestCharged
                dailyBalanceAmounts = interestDetails.dailyBalanceAmounts
                effectiveApr = interestDetails.effectiveApr
                interestCalculationMethod = interestDetails.interestCalculationMethod
                interestForPeriod = interestDetails.interestForPeriod
                primeRate = interestDetails.primeRate
                minimumInterestCharged = interestDetails.minimumInterestCharged
                additionalProperties = interestDetails.additionalProperties.toMutableMap()
            }

            fun actualInterestCharged(actualInterestCharged: Long?) =
                actualInterestCharged(JsonField.ofNullable(actualInterestCharged))

            /**
             * Alias for [Builder.actualInterestCharged].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun actualInterestCharged(actualInterestCharged: Long) =
                actualInterestCharged(actualInterestCharged as Long?)

            /**
             * Sets [Builder.actualInterestCharged] to an arbitrary JSON value.
             *
             * You should usually call [Builder.actualInterestCharged] with a well-typed [Long]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun actualInterestCharged(actualInterestCharged: JsonField<Long>) = apply {
                this.actualInterestCharged = actualInterestCharged
            }

            fun dailyBalanceAmounts(dailyBalanceAmounts: CategoryDetails) =
                dailyBalanceAmounts(JsonField.of(dailyBalanceAmounts))

            /**
             * Sets [Builder.dailyBalanceAmounts] to an arbitrary JSON value.
             *
             * You should usually call [Builder.dailyBalanceAmounts] with a well-typed
             * [CategoryDetails] value instead. This method is primarily for setting the field to an
             * undocumented or not yet supported value.
             */
            fun dailyBalanceAmounts(dailyBalanceAmounts: JsonField<CategoryDetails>) = apply {
                this.dailyBalanceAmounts = dailyBalanceAmounts
            }

            fun effectiveApr(effectiveApr: CategoryDetails) =
                effectiveApr(JsonField.of(effectiveApr))

            /**
             * Sets [Builder.effectiveApr] to an arbitrary JSON value.
             *
             * You should usually call [Builder.effectiveApr] with a well-typed [CategoryDetails]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun effectiveApr(effectiveApr: JsonField<CategoryDetails>) = apply {
                this.effectiveApr = effectiveApr
            }

            fun interestCalculationMethod(interestCalculationMethod: InterestCalculationMethod) =
                interestCalculationMethod(JsonField.of(interestCalculationMethod))

            /**
             * Sets [Builder.interestCalculationMethod] to an arbitrary JSON value.
             *
             * You should usually call [Builder.interestCalculationMethod] with a well-typed
             * [InterestCalculationMethod] value instead. This method is primarily for setting the
             * field to an undocumented or not yet supported value.
             */
            fun interestCalculationMethod(
                interestCalculationMethod: JsonField<InterestCalculationMethod>
            ) = apply { this.interestCalculationMethod = interestCalculationMethod }

            fun interestForPeriod(interestForPeriod: CategoryDetails) =
                interestForPeriod(JsonField.of(interestForPeriod))

            /**
             * Sets [Builder.interestForPeriod] to an arbitrary JSON value.
             *
             * You should usually call [Builder.interestForPeriod] with a well-typed
             * [CategoryDetails] value instead. This method is primarily for setting the field to an
             * undocumented or not yet supported value.
             */
            fun interestForPeriod(interestForPeriod: JsonField<CategoryDetails>) = apply {
                this.interestForPeriod = interestForPeriod
            }

            fun primeRate(primeRate: String?) = primeRate(JsonField.ofNullable(primeRate))

            /**
             * Sets [Builder.primeRate] to an arbitrary JSON value.
             *
             * You should usually call [Builder.primeRate] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun primeRate(primeRate: JsonField<String>) = apply { this.primeRate = primeRate }

            fun minimumInterestCharged(minimumInterestCharged: Long?) =
                minimumInterestCharged(JsonField.ofNullable(minimumInterestCharged))

            /**
             * Alias for [Builder.minimumInterestCharged].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun minimumInterestCharged(minimumInterestCharged: Long) =
                minimumInterestCharged(minimumInterestCharged as Long?)

            /**
             * Sets [Builder.minimumInterestCharged] to an arbitrary JSON value.
             *
             * You should usually call [Builder.minimumInterestCharged] with a well-typed [Long]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun minimumInterestCharged(minimumInterestCharged: JsonField<Long>) = apply {
                this.minimumInterestCharged = minimumInterestCharged
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

            /**
             * Returns an immutable instance of [InterestDetails].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```kotlin
             * .actualInterestCharged()
             * .dailyBalanceAmounts()
             * .effectiveApr()
             * .interestCalculationMethod()
             * .interestForPeriod()
             * .primeRate()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): InterestDetails =
                InterestDetails(
                    checkRequired("actualInterestCharged", actualInterestCharged),
                    checkRequired("dailyBalanceAmounts", dailyBalanceAmounts),
                    checkRequired("effectiveApr", effectiveApr),
                    checkRequired("interestCalculationMethod", interestCalculationMethod),
                    checkRequired("interestForPeriod", interestForPeriod),
                    checkRequired("primeRate", primeRate),
                    minimumInterestCharged,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): InterestDetails = apply {
            if (validated) {
                return@apply
            }

            actualInterestCharged()
            dailyBalanceAmounts().validate()
            effectiveApr().validate()
            interestCalculationMethod().validate()
            interestForPeriod().validate()
            primeRate()
            minimumInterestCharged()
            validated = true
        }

        fun isValid(): Boolean =
            try {
                validate()
                true
            } catch (e: LithicInvalidDataException) {
                false
            }

        /**
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        internal fun validity(): Int =
            (if (actualInterestCharged.asKnown() == null) 0 else 1) +
                (dailyBalanceAmounts.asKnown()?.validity() ?: 0) +
                (effectiveApr.asKnown()?.validity() ?: 0) +
                (interestCalculationMethod.asKnown()?.validity() ?: 0) +
                (interestForPeriod.asKnown()?.validity() ?: 0) +
                (if (primeRate.asKnown() == null) 0 else 1) +
                (if (minimumInterestCharged.asKnown() == null) 0 else 1)

        class CategoryDetails
        private constructor(
            private val balanceTransfers: JsonField<String>,
            private val cashAdvances: JsonField<String>,
            private val purchases: JsonField<String>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("balance_transfers")
                @ExcludeMissing
                balanceTransfers: JsonField<String> = JsonMissing.of(),
                @JsonProperty("cash_advances")
                @ExcludeMissing
                cashAdvances: JsonField<String> = JsonMissing.of(),
                @JsonProperty("purchases")
                @ExcludeMissing
                purchases: JsonField<String> = JsonMissing.of(),
            ) : this(balanceTransfers, cashAdvances, purchases, mutableMapOf())

            /**
             * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun balanceTransfers(): String = balanceTransfers.getRequired("balance_transfers")

            /**
             * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun cashAdvances(): String = cashAdvances.getRequired("cash_advances")

            /**
             * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun purchases(): String = purchases.getRequired("purchases")

            /**
             * Returns the raw JSON value of [balanceTransfers].
             *
             * Unlike [balanceTransfers], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("balance_transfers")
            @ExcludeMissing
            fun _balanceTransfers(): JsonField<String> = balanceTransfers

            /**
             * Returns the raw JSON value of [cashAdvances].
             *
             * Unlike [cashAdvances], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("cash_advances")
            @ExcludeMissing
            fun _cashAdvances(): JsonField<String> = cashAdvances

            /**
             * Returns the raw JSON value of [purchases].
             *
             * Unlike [purchases], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("purchases")
            @ExcludeMissing
            fun _purchases(): JsonField<String> = purchases

            @JsonAnySetter
            private fun putAdditionalProperty(key: String, value: JsonValue) {
                additionalProperties.put(key, value)
            }

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> =
                Collections.unmodifiableMap(additionalProperties)

            fun toBuilder() = Builder().from(this)

            companion object {

                /**
                 * Returns a mutable builder for constructing an instance of [CategoryDetails].
                 *
                 * The following fields are required:
                 * ```kotlin
                 * .balanceTransfers()
                 * .cashAdvances()
                 * .purchases()
                 * ```
                 */
                fun builder() = Builder()
            }

            /** A builder for [CategoryDetails]. */
            class Builder internal constructor() {

                private var balanceTransfers: JsonField<String>? = null
                private var cashAdvances: JsonField<String>? = null
                private var purchases: JsonField<String>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(categoryDetails: CategoryDetails) = apply {
                    balanceTransfers = categoryDetails.balanceTransfers
                    cashAdvances = categoryDetails.cashAdvances
                    purchases = categoryDetails.purchases
                    additionalProperties = categoryDetails.additionalProperties.toMutableMap()
                }

                fun balanceTransfers(balanceTransfers: String) =
                    balanceTransfers(JsonField.of(balanceTransfers))

                /**
                 * Sets [Builder.balanceTransfers] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.balanceTransfers] with a well-typed [String]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun balanceTransfers(balanceTransfers: JsonField<String>) = apply {
                    this.balanceTransfers = balanceTransfers
                }

                fun cashAdvances(cashAdvances: String) = cashAdvances(JsonField.of(cashAdvances))

                /**
                 * Sets [Builder.cashAdvances] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.cashAdvances] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun cashAdvances(cashAdvances: JsonField<String>) = apply {
                    this.cashAdvances = cashAdvances
                }

                fun purchases(purchases: String) = purchases(JsonField.of(purchases))

                /**
                 * Sets [Builder.purchases] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.purchases] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun purchases(purchases: JsonField<String>) = apply { this.purchases = purchases }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                    keys.forEach(::removeAdditionalProperty)
                }

                /**
                 * Returns an immutable instance of [CategoryDetails].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```kotlin
                 * .balanceTransfers()
                 * .cashAdvances()
                 * .purchases()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): CategoryDetails =
                    CategoryDetails(
                        checkRequired("balanceTransfers", balanceTransfers),
                        checkRequired("cashAdvances", cashAdvances),
                        checkRequired("purchases", purchases),
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): CategoryDetails = apply {
                if (validated) {
                    return@apply
                }

                balanceTransfers()
                cashAdvances()
                purchases()
                validated = true
            }

            fun isValid(): Boolean =
                try {
                    validate()
                    true
                } catch (e: LithicInvalidDataException) {
                    false
                }

            /**
             * Returns a score indicating how many valid values are contained in this object
             * recursively.
             *
             * Used for best match union deserialization.
             */
            internal fun validity(): Int =
                (if (balanceTransfers.asKnown() == null) 0 else 1) +
                    (if (cashAdvances.asKnown() == null) 0 else 1) +
                    (if (purchases.asKnown() == null) 0 else 1)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is CategoryDetails && balanceTransfers == other.balanceTransfers && cashAdvances == other.cashAdvances && purchases == other.purchases && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(balanceTransfers, cashAdvances, purchases, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "CategoryDetails{balanceTransfers=$balanceTransfers, cashAdvances=$cashAdvances, purchases=$purchases, additionalProperties=$additionalProperties}"
        }

        class InterestCalculationMethod
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

                val DAILY = of("DAILY")

                val AVERAGE_DAILY = of("AVERAGE_DAILY")

                fun of(value: String) = InterestCalculationMethod(JsonField.of(value))
            }

            /** An enum containing [InterestCalculationMethod]'s known values. */
            enum class Known {
                DAILY,
                AVERAGE_DAILY,
            }

            /**
             * An enum containing [InterestCalculationMethod]'s known values, as well as an
             * [_UNKNOWN] member.
             *
             * An instance of [InterestCalculationMethod] can contain an unknown value in a couple
             * of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                DAILY,
                AVERAGE_DAILY,
                /**
                 * An enum member indicating that [InterestCalculationMethod] was instantiated with
                 * an unknown value.
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
                    DAILY -> Value.DAILY
                    AVERAGE_DAILY -> Value.AVERAGE_DAILY
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
                    DAILY -> Known.DAILY
                    AVERAGE_DAILY -> Known.AVERAGE_DAILY
                    else ->
                        throw LithicInvalidDataException(
                            "Unknown InterestCalculationMethod: $value"
                        )
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

            private var validated: Boolean = false

            fun validate(): InterestCalculationMethod = apply {
                if (validated) {
                    return@apply
                }

                known()
                validated = true
            }

            fun isValid(): Boolean =
                try {
                    validate()
                    true
                } catch (e: LithicInvalidDataException) {
                    false
                }

            /**
             * Returns a score indicating how many valid values are contained in this object
             * recursively.
             *
             * Used for best match union deserialization.
             */
            internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is InterestCalculationMethod && value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is InterestDetails && actualInterestCharged == other.actualInterestCharged && dailyBalanceAmounts == other.dailyBalanceAmounts && effectiveApr == other.effectiveApr && interestCalculationMethod == other.interestCalculationMethod && interestForPeriod == other.interestForPeriod && primeRate == other.primeRate && minimumInterestCharged == other.minimumInterestCharged && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(actualInterestCharged, dailyBalanceAmounts, effectiveApr, interestCalculationMethod, interestForPeriod, primeRate, minimumInterestCharged, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "InterestDetails{actualInterestCharged=$actualInterestCharged, dailyBalanceAmounts=$dailyBalanceAmounts, effectiveApr=$effectiveApr, interestCalculationMethod=$interestCalculationMethod, interestForPeriod=$interestForPeriod, primeRate=$primeRate, minimumInterestCharged=$minimumInterestCharged, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is Statement && token == other.token && accountStanding == other.accountStanding && amountDue == other.amountDue && availableCredit == other.availableCredit && created == other.created && creditLimit == other.creditLimit && creditProductToken == other.creditProductToken && daysInBillingCycle == other.daysInBillingCycle && endingBalance == other.endingBalance && financialAccountToken == other.financialAccountToken && paymentDueDate == other.paymentDueDate && periodTotals == other.periodTotals && startingBalance == other.startingBalance && statementEndDate == other.statementEndDate && statementStartDate == other.statementStartDate && statementType == other.statementType && updated == other.updated && ytdTotals == other.ytdTotals && interestDetails == other.interestDetails && nextPaymentDueDate == other.nextPaymentDueDate && nextStatementEndDate == other.nextStatementEndDate && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(token, accountStanding, amountDue, availableCredit, created, creditLimit, creditProductToken, daysInBillingCycle, endingBalance, financialAccountToken, paymentDueDate, periodTotals, startingBalance, statementEndDate, statementStartDate, statementType, updated, ytdTotals, interestDetails, nextPaymentDueDate, nextStatementEndDate, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "Statement{token=$token, accountStanding=$accountStanding, amountDue=$amountDue, availableCredit=$availableCredit, created=$created, creditLimit=$creditLimit, creditProductToken=$creditProductToken, daysInBillingCycle=$daysInBillingCycle, endingBalance=$endingBalance, financialAccountToken=$financialAccountToken, paymentDueDate=$paymentDueDate, periodTotals=$periodTotals, startingBalance=$startingBalance, statementEndDate=$statementEndDate, statementStartDate=$statementStartDate, statementType=$statementType, updated=$updated, ytdTotals=$ytdTotals, interestDetails=$interestDetails, nextPaymentDueDate=$nextPaymentDueDate, nextStatementEndDate=$nextStatementEndDate, additionalProperties=$additionalProperties}"
}
