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
import com.lithic.api.core.JsonMissing
import com.lithic.api.core.JsonValue
import com.lithic.api.core.NoAutoDetect
import com.lithic.api.core.toImmutable
import com.lithic.api.errors.LithicInvalidDataException
import java.time.OffsetDateTime
import java.util.Objects

@JsonDeserialize(builder = AuthenticationRetrieveResponse.Builder::class)
@NoAutoDetect
class AuthenticationRetrieveResponse
private constructor(
    private val accountType: JsonField<AccountType>,
    private val additionalData: JsonField<AdditionalData>,
    private val app: JsonField<App>,
    private val authenticationRequestType: JsonField<AuthenticationRequestType>,
    private val authenticationResult: JsonField<AuthenticationResult>,
    private val browser: JsonField<Browser>,
    private val cardExpiryCheck: JsonField<CardExpiryCheck>,
    private val cardToken: JsonField<String>,
    private val cardholder: JsonField<Cardholder>,
    private val channel: JsonField<Channel>,
    private val created: JsonField<OffsetDateTime>,
    private val decisionMadeBy: JsonField<DecisionMadeBy>,
    private val merchant: JsonField<Merchant>,
    private val messageCategory: JsonField<MessageCategory>,
    private val threeRiRequestType: JsonField<ThreeRiRequestType>,
    private val token: JsonField<String>,
    private val transaction: JsonField<Transaction>,
    private val additionalProperties: Map<String, JsonValue>,
) {

    private var validated: Boolean = false

    /**
     * Type of account/card that is being used for the transaction. Maps to EMV 3DS field
     * `acctType`.
     */
    fun accountType(): AccountType? = accountType.getNullable("account_type")

    /**
     * Object containing additional data about the 3DS request that is beyond the EMV 3DS standard
     * spec (e.g., specific fields that only certain card networks send but are not required across
     * all 3DS requests).
     */
    fun additionalData(): AdditionalData? = additionalData.getNullable("additional_data")

    /**
     * Object containing data about the app used in the e-commerce transaction. Present if the
     * channel is 'APP_BASED'.
     */
    fun app(): App? = app.getNullable("app")

    /**
     * Type of authentication request - i.e., the type of transaction or interaction is causing the
     * merchant to request an authentication. Maps to EMV 3DS field
     * threeDSRequestorAuthenticationInd.
     */
    fun authenticationRequestType(): AuthenticationRequestType? =
        authenticationRequestType.getNullable("authentication_request_type")

    /** Indicates the outcome of the 3DS authentication process. */
    fun authenticationResult(): AuthenticationResult? =
        authenticationResult.getNullable("authentication_result")

    /**
     * Object containing data about the browser used in the e-commerce transaction. Present if the
     * channel is 'BROWSER'.
     */
    fun browser(): Browser? = browser.getNullable("browser")

    /**
     * Indicates whether the expiration date provided by the cardholder during checkout matches
     * Lithic's record of the card's expiration date.
     */
    fun cardExpiryCheck(): CardExpiryCheck = cardExpiryCheck.getRequired("card_expiry_check")

    /** Globally unique identifier for the card on which the 3DS authentication has occurred. */
    fun cardToken(): String = cardToken.getRequired("card_token")

    /** Object containing data about the cardholder provided during the transaction. */
    fun cardholder(): Cardholder = cardholder.getRequired("cardholder")

    /** Channel in which the authentication occurs. Maps to EMV 3DS field deviceChannel. */
    fun channel(): Channel = channel.getRequired("channel")

    /** Date and time when the authentication was created in Lithic's system. */
    fun created(): OffsetDateTime = created.getRequired("created")

    /** Entity that made the authentication decision. */
    fun decisionMadeBy(): DecisionMadeBy? = decisionMadeBy.getNullable("decision_made_by")

    /** Object containing data about the merchant involved in the e-commerce transaction. */
    fun merchant(): Merchant = merchant.getRequired("merchant")

    /**
     * Either PAYMENT_AUTHENTICATION or NON_PAYMENT_AUTHENTICATION. For NON_PAYMENT_AUTHENTICATION,
     * additional_data and transaction fields are not populated.
     */
    fun messageCategory(): MessageCategory = messageCategory.getRequired("message_category")

    /**
     * Type of 3DS Requestor Initiated (3RI) request i.e., a 3DS authentication that takes place at
     * the initiation of the merchant rather than the cardholder. The most common example of this is
     * where a merchant is authenticating before billing for a recurring transaction such as a pay
     * TV subscription or a utility bill. Maps to EMV 3DS field threeRIInd.
     */
    fun threeRiRequestType(): ThreeRiRequestType? =
        threeRiRequestType.getNullable("three_ri_request_type")

    /** Globally unique identifier for the 3DS authentication. */
    fun token(): String = token.getRequired("token")

    /**
     * Object containing data about the e-commerce transaction for which the merchant is requesting
     * authentication.
     */
    fun transaction(): Transaction? = transaction.getNullable("transaction")

    /**
     * Type of account/card that is being used for the transaction. Maps to EMV 3DS field
     * `acctType`.
     */
    @JsonProperty("account_type") @ExcludeMissing fun _accountType() = accountType

    /**
     * Object containing additional data about the 3DS request that is beyond the EMV 3DS standard
     * spec (e.g., specific fields that only certain card networks send but are not required across
     * all 3DS requests).
     */
    @JsonProperty("additional_data") @ExcludeMissing fun _additionalData() = additionalData

    /**
     * Object containing data about the app used in the e-commerce transaction. Present if the
     * channel is 'APP_BASED'.
     */
    @JsonProperty("app") @ExcludeMissing fun _app() = app

    /**
     * Type of authentication request - i.e., the type of transaction or interaction is causing the
     * merchant to request an authentication. Maps to EMV 3DS field
     * threeDSRequestorAuthenticationInd.
     */
    @JsonProperty("authentication_request_type")
    @ExcludeMissing
    fun _authenticationRequestType() = authenticationRequestType

    /** Indicates the outcome of the 3DS authentication process. */
    @JsonProperty("authentication_result")
    @ExcludeMissing
    fun _authenticationResult() = authenticationResult

    /**
     * Object containing data about the browser used in the e-commerce transaction. Present if the
     * channel is 'BROWSER'.
     */
    @JsonProperty("browser") @ExcludeMissing fun _browser() = browser

    /**
     * Indicates whether the expiration date provided by the cardholder during checkout matches
     * Lithic's record of the card's expiration date.
     */
    @JsonProperty("card_expiry_check") @ExcludeMissing fun _cardExpiryCheck() = cardExpiryCheck

    /** Globally unique identifier for the card on which the 3DS authentication has occurred. */
    @JsonProperty("card_token") @ExcludeMissing fun _cardToken() = cardToken

    /** Object containing data about the cardholder provided during the transaction. */
    @JsonProperty("cardholder") @ExcludeMissing fun _cardholder() = cardholder

    /** Channel in which the authentication occurs. Maps to EMV 3DS field deviceChannel. */
    @JsonProperty("channel") @ExcludeMissing fun _channel() = channel

    /** Date and time when the authentication was created in Lithic's system. */
    @JsonProperty("created") @ExcludeMissing fun _created() = created

    /** Entity that made the authentication decision. */
    @JsonProperty("decision_made_by") @ExcludeMissing fun _decisionMadeBy() = decisionMadeBy

    /** Object containing data about the merchant involved in the e-commerce transaction. */
    @JsonProperty("merchant") @ExcludeMissing fun _merchant() = merchant

    /**
     * Either PAYMENT_AUTHENTICATION or NON_PAYMENT_AUTHENTICATION. For NON_PAYMENT_AUTHENTICATION,
     * additional_data and transaction fields are not populated.
     */
    @JsonProperty("message_category") @ExcludeMissing fun _messageCategory() = messageCategory

    /**
     * Type of 3DS Requestor Initiated (3RI) request i.e., a 3DS authentication that takes place at
     * the initiation of the merchant rather than the cardholder. The most common example of this is
     * where a merchant is authenticating before billing for a recurring transaction such as a pay
     * TV subscription or a utility bill. Maps to EMV 3DS field threeRIInd.
     */
    @JsonProperty("three_ri_request_type")
    @ExcludeMissing
    fun _threeRiRequestType() = threeRiRequestType

    /** Globally unique identifier for the 3DS authentication. */
    @JsonProperty("token") @ExcludeMissing fun _token() = token

    /**
     * Object containing data about the e-commerce transaction for which the merchant is requesting
     * authentication.
     */
    @JsonProperty("transaction") @ExcludeMissing fun _transaction() = transaction

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    fun validate(): AuthenticationRetrieveResponse = apply {
        if (!validated) {
            accountType()
            additionalData()?.validate()
            app()?.validate()
            authenticationRequestType()
            authenticationResult()
            browser()?.validate()
            cardExpiryCheck()
            cardToken()
            cardholder().validate()
            channel()
            created()
            decisionMadeBy()
            merchant().validate()
            messageCategory()
            threeRiRequestType()
            token()
            transaction()?.validate()
            validated = true
        }
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        fun builder() = Builder()
    }

    class Builder {

        private var accountType: JsonField<AccountType> = JsonMissing.of()
        private var additionalData: JsonField<AdditionalData> = JsonMissing.of()
        private var app: JsonField<App> = JsonMissing.of()
        private var authenticationRequestType: JsonField<AuthenticationRequestType> =
            JsonMissing.of()
        private var authenticationResult: JsonField<AuthenticationResult> = JsonMissing.of()
        private var browser: JsonField<Browser> = JsonMissing.of()
        private var cardExpiryCheck: JsonField<CardExpiryCheck> = JsonMissing.of()
        private var cardToken: JsonField<String> = JsonMissing.of()
        private var cardholder: JsonField<Cardholder> = JsonMissing.of()
        private var channel: JsonField<Channel> = JsonMissing.of()
        private var created: JsonField<OffsetDateTime> = JsonMissing.of()
        private var decisionMadeBy: JsonField<DecisionMadeBy> = JsonMissing.of()
        private var merchant: JsonField<Merchant> = JsonMissing.of()
        private var messageCategory: JsonField<MessageCategory> = JsonMissing.of()
        private var threeRiRequestType: JsonField<ThreeRiRequestType> = JsonMissing.of()
        private var token: JsonField<String> = JsonMissing.of()
        private var transaction: JsonField<Transaction> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(authenticationRetrieveResponse: AuthenticationRetrieveResponse) = apply {
            this.accountType = authenticationRetrieveResponse.accountType
            this.additionalData = authenticationRetrieveResponse.additionalData
            this.app = authenticationRetrieveResponse.app
            this.authenticationRequestType =
                authenticationRetrieveResponse.authenticationRequestType
            this.authenticationResult = authenticationRetrieveResponse.authenticationResult
            this.browser = authenticationRetrieveResponse.browser
            this.cardExpiryCheck = authenticationRetrieveResponse.cardExpiryCheck
            this.cardToken = authenticationRetrieveResponse.cardToken
            this.cardholder = authenticationRetrieveResponse.cardholder
            this.channel = authenticationRetrieveResponse.channel
            this.created = authenticationRetrieveResponse.created
            this.decisionMadeBy = authenticationRetrieveResponse.decisionMadeBy
            this.merchant = authenticationRetrieveResponse.merchant
            this.messageCategory = authenticationRetrieveResponse.messageCategory
            this.threeRiRequestType = authenticationRetrieveResponse.threeRiRequestType
            this.token = authenticationRetrieveResponse.token
            this.transaction = authenticationRetrieveResponse.transaction
            additionalProperties(authenticationRetrieveResponse.additionalProperties)
        }

        /**
         * Type of account/card that is being used for the transaction. Maps to EMV 3DS field
         * `acctType`.
         */
        fun accountType(accountType: AccountType) = accountType(JsonField.of(accountType))

        /**
         * Type of account/card that is being used for the transaction. Maps to EMV 3DS field
         * `acctType`.
         */
        @JsonProperty("account_type")
        @ExcludeMissing
        fun accountType(accountType: JsonField<AccountType>) = apply {
            this.accountType = accountType
        }

        /**
         * Object containing additional data about the 3DS request that is beyond the EMV 3DS
         * standard spec (e.g., specific fields that only certain card networks send but are not
         * required across all 3DS requests).
         */
        fun additionalData(additionalData: AdditionalData) =
            additionalData(JsonField.of(additionalData))

        /**
         * Object containing additional data about the 3DS request that is beyond the EMV 3DS
         * standard spec (e.g., specific fields that only certain card networks send but are not
         * required across all 3DS requests).
         */
        @JsonProperty("additional_data")
        @ExcludeMissing
        fun additionalData(additionalData: JsonField<AdditionalData>) = apply {
            this.additionalData = additionalData
        }

        /**
         * Object containing data about the app used in the e-commerce transaction. Present if the
         * channel is 'APP_BASED'.
         */
        fun app(app: App) = app(JsonField.of(app))

        /**
         * Object containing data about the app used in the e-commerce transaction. Present if the
         * channel is 'APP_BASED'.
         */
        @JsonProperty("app") @ExcludeMissing fun app(app: JsonField<App>) = apply { this.app = app }

        /**
         * Type of authentication request - i.e., the type of transaction or interaction is causing
         * the merchant to request an authentication. Maps to EMV 3DS field
         * threeDSRequestorAuthenticationInd.
         */
        fun authenticationRequestType(authenticationRequestType: AuthenticationRequestType) =
            authenticationRequestType(JsonField.of(authenticationRequestType))

        /**
         * Type of authentication request - i.e., the type of transaction or interaction is causing
         * the merchant to request an authentication. Maps to EMV 3DS field
         * threeDSRequestorAuthenticationInd.
         */
        @JsonProperty("authentication_request_type")
        @ExcludeMissing
        fun authenticationRequestType(
            authenticationRequestType: JsonField<AuthenticationRequestType>
        ) = apply { this.authenticationRequestType = authenticationRequestType }

        /** Indicates the outcome of the 3DS authentication process. */
        fun authenticationResult(authenticationResult: AuthenticationResult) =
            authenticationResult(JsonField.of(authenticationResult))

        /** Indicates the outcome of the 3DS authentication process. */
        @JsonProperty("authentication_result")
        @ExcludeMissing
        fun authenticationResult(authenticationResult: JsonField<AuthenticationResult>) = apply {
            this.authenticationResult = authenticationResult
        }

        /**
         * Object containing data about the browser used in the e-commerce transaction. Present if
         * the channel is 'BROWSER'.
         */
        fun browser(browser: Browser) = browser(JsonField.of(browser))

        /**
         * Object containing data about the browser used in the e-commerce transaction. Present if
         * the channel is 'BROWSER'.
         */
        @JsonProperty("browser")
        @ExcludeMissing
        fun browser(browser: JsonField<Browser>) = apply { this.browser = browser }

        /**
         * Indicates whether the expiration date provided by the cardholder during checkout matches
         * Lithic's record of the card's expiration date.
         */
        fun cardExpiryCheck(cardExpiryCheck: CardExpiryCheck) =
            cardExpiryCheck(JsonField.of(cardExpiryCheck))

        /**
         * Indicates whether the expiration date provided by the cardholder during checkout matches
         * Lithic's record of the card's expiration date.
         */
        @JsonProperty("card_expiry_check")
        @ExcludeMissing
        fun cardExpiryCheck(cardExpiryCheck: JsonField<CardExpiryCheck>) = apply {
            this.cardExpiryCheck = cardExpiryCheck
        }

        /** Globally unique identifier for the card on which the 3DS authentication has occurred. */
        fun cardToken(cardToken: String) = cardToken(JsonField.of(cardToken))

        /** Globally unique identifier for the card on which the 3DS authentication has occurred. */
        @JsonProperty("card_token")
        @ExcludeMissing
        fun cardToken(cardToken: JsonField<String>) = apply { this.cardToken = cardToken }

        /** Object containing data about the cardholder provided during the transaction. */
        fun cardholder(cardholder: Cardholder) = cardholder(JsonField.of(cardholder))

        /** Object containing data about the cardholder provided during the transaction. */
        @JsonProperty("cardholder")
        @ExcludeMissing
        fun cardholder(cardholder: JsonField<Cardholder>) = apply { this.cardholder = cardholder }

        /** Channel in which the authentication occurs. Maps to EMV 3DS field deviceChannel. */
        fun channel(channel: Channel) = channel(JsonField.of(channel))

        /** Channel in which the authentication occurs. Maps to EMV 3DS field deviceChannel. */
        @JsonProperty("channel")
        @ExcludeMissing
        fun channel(channel: JsonField<Channel>) = apply { this.channel = channel }

        /** Date and time when the authentication was created in Lithic's system. */
        fun created(created: OffsetDateTime) = created(JsonField.of(created))

        /** Date and time when the authentication was created in Lithic's system. */
        @JsonProperty("created")
        @ExcludeMissing
        fun created(created: JsonField<OffsetDateTime>) = apply { this.created = created }

        /** Entity that made the authentication decision. */
        fun decisionMadeBy(decisionMadeBy: DecisionMadeBy) =
            decisionMadeBy(JsonField.of(decisionMadeBy))

        /** Entity that made the authentication decision. */
        @JsonProperty("decision_made_by")
        @ExcludeMissing
        fun decisionMadeBy(decisionMadeBy: JsonField<DecisionMadeBy>) = apply {
            this.decisionMadeBy = decisionMadeBy
        }

        /** Object containing data about the merchant involved in the e-commerce transaction. */
        fun merchant(merchant: Merchant) = merchant(JsonField.of(merchant))

        /** Object containing data about the merchant involved in the e-commerce transaction. */
        @JsonProperty("merchant")
        @ExcludeMissing
        fun merchant(merchant: JsonField<Merchant>) = apply { this.merchant = merchant }

        /**
         * Either PAYMENT_AUTHENTICATION or NON_PAYMENT_AUTHENTICATION. For
         * NON_PAYMENT_AUTHENTICATION, additional_data and transaction fields are not populated.
         */
        fun messageCategory(messageCategory: MessageCategory) =
            messageCategory(JsonField.of(messageCategory))

        /**
         * Either PAYMENT_AUTHENTICATION or NON_PAYMENT_AUTHENTICATION. For
         * NON_PAYMENT_AUTHENTICATION, additional_data and transaction fields are not populated.
         */
        @JsonProperty("message_category")
        @ExcludeMissing
        fun messageCategory(messageCategory: JsonField<MessageCategory>) = apply {
            this.messageCategory = messageCategory
        }

        /**
         * Type of 3DS Requestor Initiated (3RI) request i.e., a 3DS authentication that takes place
         * at the initiation of the merchant rather than the cardholder. The most common example of
         * this is where a merchant is authenticating before billing for a recurring transaction
         * such as a pay TV subscription or a utility bill. Maps to EMV 3DS field threeRIInd.
         */
        fun threeRiRequestType(threeRiRequestType: ThreeRiRequestType) =
            threeRiRequestType(JsonField.of(threeRiRequestType))

        /**
         * Type of 3DS Requestor Initiated (3RI) request i.e., a 3DS authentication that takes place
         * at the initiation of the merchant rather than the cardholder. The most common example of
         * this is where a merchant is authenticating before billing for a recurring transaction
         * such as a pay TV subscription or a utility bill. Maps to EMV 3DS field threeRIInd.
         */
        @JsonProperty("three_ri_request_type")
        @ExcludeMissing
        fun threeRiRequestType(threeRiRequestType: JsonField<ThreeRiRequestType>) = apply {
            this.threeRiRequestType = threeRiRequestType
        }

        /** Globally unique identifier for the 3DS authentication. */
        fun token(token: String) = token(JsonField.of(token))

        /** Globally unique identifier for the 3DS authentication. */
        @JsonProperty("token")
        @ExcludeMissing
        fun token(token: JsonField<String>) = apply { this.token = token }

        /**
         * Object containing data about the e-commerce transaction for which the merchant is
         * requesting authentication.
         */
        fun transaction(transaction: Transaction) = transaction(JsonField.of(transaction))

        /**
         * Object containing data about the e-commerce transaction for which the merchant is
         * requesting authentication.
         */
        @JsonProperty("transaction")
        @ExcludeMissing
        fun transaction(transaction: JsonField<Transaction>) = apply {
            this.transaction = transaction
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

        fun build(): AuthenticationRetrieveResponse =
            AuthenticationRetrieveResponse(
                accountType,
                additionalData,
                app,
                authenticationRequestType,
                authenticationResult,
                browser,
                cardExpiryCheck,
                cardToken,
                cardholder,
                channel,
                created,
                decisionMadeBy,
                merchant,
                messageCategory,
                threeRiRequestType,
                token,
                transaction,
                additionalProperties.toImmutable(),
            )
    }

    class AccountType
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is AccountType && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()

        companion object {

            val CREDIT = AccountType(JsonField.of("CREDIT"))

            val DEBIT = AccountType(JsonField.of("DEBIT"))

            val NOT_APPLICABLE = AccountType(JsonField.of("NOT_APPLICABLE"))

            fun of(value: String) = AccountType(JsonField.of(value))
        }

        enum class Known {
            CREDIT,
            DEBIT,
            NOT_APPLICABLE,
        }

        enum class Value {
            CREDIT,
            DEBIT,
            NOT_APPLICABLE,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                CREDIT -> Value.CREDIT
                DEBIT -> Value.DEBIT
                NOT_APPLICABLE -> Value.NOT_APPLICABLE
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                CREDIT -> Known.CREDIT
                DEBIT -> Known.DEBIT
                NOT_APPLICABLE -> Known.NOT_APPLICABLE
                else -> throw LithicInvalidDataException("Unknown AccountType: $value")
            }

        fun asString(): String = _value().asStringOrThrow()
    }

    class AuthenticationResult
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is AuthenticationResult && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()

        companion object {

            val DECLINE = AuthenticationResult(JsonField.of("DECLINE"))

            val SUCCESS = AuthenticationResult(JsonField.of("SUCCESS"))

            fun of(value: String) = AuthenticationResult(JsonField.of(value))
        }

        enum class Known {
            DECLINE,
            SUCCESS,
        }

        enum class Value {
            DECLINE,
            SUCCESS,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                DECLINE -> Value.DECLINE
                SUCCESS -> Value.SUCCESS
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                DECLINE -> Known.DECLINE
                SUCCESS -> Known.SUCCESS
                else -> throw LithicInvalidDataException("Unknown AuthenticationResult: $value")
            }

        fun asString(): String = _value().asStringOrThrow()
    }

    class CardExpiryCheck
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is CardExpiryCheck && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()

        companion object {

            val MATCH = CardExpiryCheck(JsonField.of("MATCH"))

            val MISMATCH = CardExpiryCheck(JsonField.of("MISMATCH"))

            val NOT_PRESENT = CardExpiryCheck(JsonField.of("NOT_PRESENT"))

            fun of(value: String) = CardExpiryCheck(JsonField.of(value))
        }

        enum class Known {
            MATCH,
            MISMATCH,
            NOT_PRESENT,
        }

        enum class Value {
            MATCH,
            MISMATCH,
            NOT_PRESENT,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                MATCH -> Value.MATCH
                MISMATCH -> Value.MISMATCH
                NOT_PRESENT -> Value.NOT_PRESENT
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                MATCH -> Known.MATCH
                MISMATCH -> Known.MISMATCH
                NOT_PRESENT -> Known.NOT_PRESENT
                else -> throw LithicInvalidDataException("Unknown CardExpiryCheck: $value")
            }

        fun asString(): String = _value().asStringOrThrow()
    }

    /** Object containing data about the cardholder provided during the transaction. */
    @JsonDeserialize(builder = Cardholder.Builder::class)
    @NoAutoDetect
    class Cardholder
    private constructor(
        private val addressMatch: JsonField<Boolean>,
        private val billingAddress: JsonField<ThreeDSAddress>,
        private val email: JsonField<String>,
        private val name: JsonField<String>,
        private val phoneNumberHome: JsonField<String>,
        private val phoneNumberMobile: JsonField<String>,
        private val phoneNumberWork: JsonField<String>,
        private val shippingAddress: JsonField<ThreeDSAddress>,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var validated: Boolean = false

        /**
         * Indicates whether the shipping address and billing address provided by the cardholder are
         * the same. This value - and assessment of whether the addresses match - is provided
         * directly in the 3DS request and is not determined by Lithic. Maps to EMV 3DS field
         * addrMatch.
         */
        fun addressMatch(): Boolean? = addressMatch.getNullable("address_match")

        /** Object containing data on the billing address provided during the transaction. */
        fun billingAddress(): ThreeDSAddress? = billingAddress.getNullable("billing_address")

        /**
         * Email address that is either provided by the cardholder or is on file with the merchant
         * in a 3RI request. Maps to EMV 3DS field email.
         */
        fun email(): String? = email.getNullable("email")

        /** Name of the cardholder. Maps to EMV 3DS field cardholderName. */
        fun name(): String? = name.getNullable("name")

        /**
         * Home phone number provided by the cardholder. Maps to EMV 3DS fields homePhone.cc and
         * homePhone.subscriber.
         */
        fun phoneNumberHome(): String? = phoneNumberHome.getNullable("phone_number_home")

        /**
         * Mobile/cell phone number provided by the cardholder. Maps to EMV 3DS fields
         * mobilePhone.cc and mobilePhone.subscriber.
         */
        fun phoneNumberMobile(): String? = phoneNumberMobile.getNullable("phone_number_mobile")

        /**
         * Work phone number provided by the cardholder. Maps to EMV 3DS fields workPhone.cc and
         * workPhone.subscriber.
         */
        fun phoneNumberWork(): String? = phoneNumberWork.getNullable("phone_number_work")

        /** Object containing data on the shipping address provided during the transaction. */
        fun shippingAddress(): ThreeDSAddress? = shippingAddress.getNullable("shipping_address")

        /**
         * Indicates whether the shipping address and billing address provided by the cardholder are
         * the same. This value - and assessment of whether the addresses match - is provided
         * directly in the 3DS request and is not determined by Lithic. Maps to EMV 3DS field
         * addrMatch.
         */
        @JsonProperty("address_match") @ExcludeMissing fun _addressMatch() = addressMatch

        /** Object containing data on the billing address provided during the transaction. */
        @JsonProperty("billing_address") @ExcludeMissing fun _billingAddress() = billingAddress

        /**
         * Email address that is either provided by the cardholder or is on file with the merchant
         * in a 3RI request. Maps to EMV 3DS field email.
         */
        @JsonProperty("email") @ExcludeMissing fun _email() = email

        /** Name of the cardholder. Maps to EMV 3DS field cardholderName. */
        @JsonProperty("name") @ExcludeMissing fun _name() = name

        /**
         * Home phone number provided by the cardholder. Maps to EMV 3DS fields homePhone.cc and
         * homePhone.subscriber.
         */
        @JsonProperty("phone_number_home") @ExcludeMissing fun _phoneNumberHome() = phoneNumberHome

        /**
         * Mobile/cell phone number provided by the cardholder. Maps to EMV 3DS fields
         * mobilePhone.cc and mobilePhone.subscriber.
         */
        @JsonProperty("phone_number_mobile")
        @ExcludeMissing
        fun _phoneNumberMobile() = phoneNumberMobile

        /**
         * Work phone number provided by the cardholder. Maps to EMV 3DS fields workPhone.cc and
         * workPhone.subscriber.
         */
        @JsonProperty("phone_number_work") @ExcludeMissing fun _phoneNumberWork() = phoneNumberWork

        /** Object containing data on the shipping address provided during the transaction. */
        @JsonProperty("shipping_address") @ExcludeMissing fun _shippingAddress() = shippingAddress

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun validate(): Cardholder = apply {
            if (!validated) {
                addressMatch()
                billingAddress()?.validate()
                email()
                name()
                phoneNumberHome()
                phoneNumberMobile()
                phoneNumberWork()
                shippingAddress()?.validate()
                validated = true
            }
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var addressMatch: JsonField<Boolean> = JsonMissing.of()
            private var billingAddress: JsonField<ThreeDSAddress> = JsonMissing.of()
            private var email: JsonField<String> = JsonMissing.of()
            private var name: JsonField<String> = JsonMissing.of()
            private var phoneNumberHome: JsonField<String> = JsonMissing.of()
            private var phoneNumberMobile: JsonField<String> = JsonMissing.of()
            private var phoneNumberWork: JsonField<String> = JsonMissing.of()
            private var shippingAddress: JsonField<ThreeDSAddress> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(cardholder: Cardholder) = apply {
                this.addressMatch = cardholder.addressMatch
                this.billingAddress = cardholder.billingAddress
                this.email = cardholder.email
                this.name = cardholder.name
                this.phoneNumberHome = cardholder.phoneNumberHome
                this.phoneNumberMobile = cardholder.phoneNumberMobile
                this.phoneNumberWork = cardholder.phoneNumberWork
                this.shippingAddress = cardholder.shippingAddress
                additionalProperties(cardholder.additionalProperties)
            }

            /**
             * Indicates whether the shipping address and billing address provided by the cardholder
             * are the same. This value - and assessment of whether the addresses match - is
             * provided directly in the 3DS request and is not determined by Lithic. Maps to EMV 3DS
             * field addrMatch.
             */
            fun addressMatch(addressMatch: Boolean) = addressMatch(JsonField.of(addressMatch))

            /**
             * Indicates whether the shipping address and billing address provided by the cardholder
             * are the same. This value - and assessment of whether the addresses match - is
             * provided directly in the 3DS request and is not determined by Lithic. Maps to EMV 3DS
             * field addrMatch.
             */
            @JsonProperty("address_match")
            @ExcludeMissing
            fun addressMatch(addressMatch: JsonField<Boolean>) = apply {
                this.addressMatch = addressMatch
            }

            /** Object containing data on the billing address provided during the transaction. */
            fun billingAddress(billingAddress: ThreeDSAddress) =
                billingAddress(JsonField.of(billingAddress))

            /** Object containing data on the billing address provided during the transaction. */
            @JsonProperty("billing_address")
            @ExcludeMissing
            fun billingAddress(billingAddress: JsonField<ThreeDSAddress>) = apply {
                this.billingAddress = billingAddress
            }

            /**
             * Email address that is either provided by the cardholder or is on file with the
             * merchant in a 3RI request. Maps to EMV 3DS field email.
             */
            fun email(email: String) = email(JsonField.of(email))

            /**
             * Email address that is either provided by the cardholder or is on file with the
             * merchant in a 3RI request. Maps to EMV 3DS field email.
             */
            @JsonProperty("email")
            @ExcludeMissing
            fun email(email: JsonField<String>) = apply { this.email = email }

            /** Name of the cardholder. Maps to EMV 3DS field cardholderName. */
            fun name(name: String) = name(JsonField.of(name))

            /** Name of the cardholder. Maps to EMV 3DS field cardholderName. */
            @JsonProperty("name")
            @ExcludeMissing
            fun name(name: JsonField<String>) = apply { this.name = name }

            /**
             * Home phone number provided by the cardholder. Maps to EMV 3DS fields homePhone.cc and
             * homePhone.subscriber.
             */
            fun phoneNumberHome(phoneNumberHome: String) =
                phoneNumberHome(JsonField.of(phoneNumberHome))

            /**
             * Home phone number provided by the cardholder. Maps to EMV 3DS fields homePhone.cc and
             * homePhone.subscriber.
             */
            @JsonProperty("phone_number_home")
            @ExcludeMissing
            fun phoneNumberHome(phoneNumberHome: JsonField<String>) = apply {
                this.phoneNumberHome = phoneNumberHome
            }

            /**
             * Mobile/cell phone number provided by the cardholder. Maps to EMV 3DS fields
             * mobilePhone.cc and mobilePhone.subscriber.
             */
            fun phoneNumberMobile(phoneNumberMobile: String) =
                phoneNumberMobile(JsonField.of(phoneNumberMobile))

            /**
             * Mobile/cell phone number provided by the cardholder. Maps to EMV 3DS fields
             * mobilePhone.cc and mobilePhone.subscriber.
             */
            @JsonProperty("phone_number_mobile")
            @ExcludeMissing
            fun phoneNumberMobile(phoneNumberMobile: JsonField<String>) = apply {
                this.phoneNumberMobile = phoneNumberMobile
            }

            /**
             * Work phone number provided by the cardholder. Maps to EMV 3DS fields workPhone.cc and
             * workPhone.subscriber.
             */
            fun phoneNumberWork(phoneNumberWork: String) =
                phoneNumberWork(JsonField.of(phoneNumberWork))

            /**
             * Work phone number provided by the cardholder. Maps to EMV 3DS fields workPhone.cc and
             * workPhone.subscriber.
             */
            @JsonProperty("phone_number_work")
            @ExcludeMissing
            fun phoneNumberWork(phoneNumberWork: JsonField<String>) = apply {
                this.phoneNumberWork = phoneNumberWork
            }

            /** Object containing data on the shipping address provided during the transaction. */
            fun shippingAddress(shippingAddress: ThreeDSAddress) =
                shippingAddress(JsonField.of(shippingAddress))

            /** Object containing data on the shipping address provided during the transaction. */
            @JsonProperty("shipping_address")
            @ExcludeMissing
            fun shippingAddress(shippingAddress: JsonField<ThreeDSAddress>) = apply {
                this.shippingAddress = shippingAddress
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

            fun build(): Cardholder =
                Cardholder(
                    addressMatch,
                    billingAddress,
                    email,
                    name,
                    phoneNumberHome,
                    phoneNumberMobile,
                    phoneNumberWork,
                    shippingAddress,
                    additionalProperties.toImmutable(),
                )
        }

        /** Object containing data on the billing address provided during the transaction. */
        @JsonDeserialize(builder = ThreeDSAddress.Builder::class)
        @NoAutoDetect
        class ThreeDSAddress
        private constructor(
            private val address1: JsonField<String>,
            private val address2: JsonField<String>,
            private val address3: JsonField<String>,
            private val city: JsonField<String>,
            private val country: JsonField<String>,
            private val postalCode: JsonField<String>,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            private var validated: Boolean = false

            /** First line of the street address provided by the cardholder. */
            fun address1(): String? = address1.getNullable("address1")

            /** Second line of the street address provided by the cardholder. */
            fun address2(): String? = address2.getNullable("address2")

            /** Third line of the street address provided by the cardholder. */
            fun address3(): String? = address3.getNullable("address3")

            /** City of the address provided by the cardholder. */
            fun city(): String? = city.getNullable("city")

            /**
             * Country of the address provided by the cardholder in ISO 3166-1 alpha-3 format (e.g.
             * USA)
             */
            fun country(): String? = country.getNullable("country")

            /** Postal code (e.g., ZIP code) of the address provided by the cardholder */
            fun postalCode(): String? = postalCode.getNullable("postal_code")

            /** First line of the street address provided by the cardholder. */
            @JsonProperty("address1") @ExcludeMissing fun _address1() = address1

            /** Second line of the street address provided by the cardholder. */
            @JsonProperty("address2") @ExcludeMissing fun _address2() = address2

            /** Third line of the street address provided by the cardholder. */
            @JsonProperty("address3") @ExcludeMissing fun _address3() = address3

            /** City of the address provided by the cardholder. */
            @JsonProperty("city") @ExcludeMissing fun _city() = city

            /**
             * Country of the address provided by the cardholder in ISO 3166-1 alpha-3 format (e.g.
             * USA)
             */
            @JsonProperty("country") @ExcludeMissing fun _country() = country

            /** Postal code (e.g., ZIP code) of the address provided by the cardholder */
            @JsonProperty("postal_code") @ExcludeMissing fun _postalCode() = postalCode

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun validate(): ThreeDSAddress = apply {
                if (!validated) {
                    address1()
                    address2()
                    address3()
                    city()
                    country()
                    postalCode()
                    validated = true
                }
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                fun builder() = Builder()
            }

            class Builder {

                private var address1: JsonField<String> = JsonMissing.of()
                private var address2: JsonField<String> = JsonMissing.of()
                private var address3: JsonField<String> = JsonMissing.of()
                private var city: JsonField<String> = JsonMissing.of()
                private var country: JsonField<String> = JsonMissing.of()
                private var postalCode: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(threeDSAddress: ThreeDSAddress) = apply {
                    this.address1 = threeDSAddress.address1
                    this.address2 = threeDSAddress.address2
                    this.address3 = threeDSAddress.address3
                    this.city = threeDSAddress.city
                    this.country = threeDSAddress.country
                    this.postalCode = threeDSAddress.postalCode
                    additionalProperties(threeDSAddress.additionalProperties)
                }

                /** First line of the street address provided by the cardholder. */
                fun address1(address1: String) = address1(JsonField.of(address1))

                /** First line of the street address provided by the cardholder. */
                @JsonProperty("address1")
                @ExcludeMissing
                fun address1(address1: JsonField<String>) = apply { this.address1 = address1 }

                /** Second line of the street address provided by the cardholder. */
                fun address2(address2: String) = address2(JsonField.of(address2))

                /** Second line of the street address provided by the cardholder. */
                @JsonProperty("address2")
                @ExcludeMissing
                fun address2(address2: JsonField<String>) = apply { this.address2 = address2 }

                /** Third line of the street address provided by the cardholder. */
                fun address3(address3: String) = address3(JsonField.of(address3))

                /** Third line of the street address provided by the cardholder. */
                @JsonProperty("address3")
                @ExcludeMissing
                fun address3(address3: JsonField<String>) = apply { this.address3 = address3 }

                /** City of the address provided by the cardholder. */
                fun city(city: String) = city(JsonField.of(city))

                /** City of the address provided by the cardholder. */
                @JsonProperty("city")
                @ExcludeMissing
                fun city(city: JsonField<String>) = apply { this.city = city }

                /**
                 * Country of the address provided by the cardholder in ISO 3166-1 alpha-3 format
                 * (e.g. USA)
                 */
                fun country(country: String) = country(JsonField.of(country))

                /**
                 * Country of the address provided by the cardholder in ISO 3166-1 alpha-3 format
                 * (e.g. USA)
                 */
                @JsonProperty("country")
                @ExcludeMissing
                fun country(country: JsonField<String>) = apply { this.country = country }

                /** Postal code (e.g., ZIP code) of the address provided by the cardholder */
                fun postalCode(postalCode: String) = postalCode(JsonField.of(postalCode))

                /** Postal code (e.g., ZIP code) of the address provided by the cardholder */
                @JsonProperty("postal_code")
                @ExcludeMissing
                fun postalCode(postalCode: JsonField<String>) = apply {
                    this.postalCode = postalCode
                }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    this.additionalProperties.putAll(additionalProperties)
                }

                @JsonAnySetter
                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    this.additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun build(): ThreeDSAddress =
                    ThreeDSAddress(
                        address1,
                        address2,
                        address3,
                        city,
                        country,
                        postalCode,
                        additionalProperties.toImmutable(),
                    )
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is ThreeDSAddress && address1 == other.address1 && address2 == other.address2 && address3 == other.address3 && city == other.city && country == other.country && postalCode == other.postalCode && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(address1, address2, address3, city, country, postalCode, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "ThreeDSAddress{address1=$address1, address2=$address2, address3=$address3, city=$city, country=$country, postalCode=$postalCode, additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Cardholder && addressMatch == other.addressMatch && billingAddress == other.billingAddress && email == other.email && name == other.name && phoneNumberHome == other.phoneNumberHome && phoneNumberMobile == other.phoneNumberMobile && phoneNumberWork == other.phoneNumberWork && shippingAddress == other.shippingAddress && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(addressMatch, billingAddress, email, name, phoneNumberHome, phoneNumberMobile, phoneNumberWork, shippingAddress, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Cardholder{addressMatch=$addressMatch, billingAddress=$billingAddress, email=$email, name=$name, phoneNumberHome=$phoneNumberHome, phoneNumberMobile=$phoneNumberMobile, phoneNumberWork=$phoneNumberWork, shippingAddress=$shippingAddress, additionalProperties=$additionalProperties}"
    }

    class Channel
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Channel && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()

        companion object {

            val APP_BASED = Channel(JsonField.of("APP_BASED"))

            val BROWSER = Channel(JsonField.of("BROWSER"))

            val THREE_DS_REQUESTOR_INITIATED = Channel(JsonField.of("THREE_DS_REQUESTOR_INITIATED"))

            fun of(value: String) = Channel(JsonField.of(value))
        }

        enum class Known {
            APP_BASED,
            BROWSER,
            THREE_DS_REQUESTOR_INITIATED,
        }

        enum class Value {
            APP_BASED,
            BROWSER,
            THREE_DS_REQUESTOR_INITIATED,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                APP_BASED -> Value.APP_BASED
                BROWSER -> Value.BROWSER
                THREE_DS_REQUESTOR_INITIATED -> Value.THREE_DS_REQUESTOR_INITIATED
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                APP_BASED -> Known.APP_BASED
                BROWSER -> Known.BROWSER
                THREE_DS_REQUESTOR_INITIATED -> Known.THREE_DS_REQUESTOR_INITIATED
                else -> throw LithicInvalidDataException("Unknown Channel: $value")
            }

        fun asString(): String = _value().asStringOrThrow()
    }

    class DecisionMadeBy
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is DecisionMadeBy && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()

        companion object {

            val CUSTOMER_ENDPOINT = DecisionMadeBy(JsonField.of("CUSTOMER_ENDPOINT"))

            val LITHIC_DEFAULT = DecisionMadeBy(JsonField.of("LITHIC_DEFAULT"))

            val LITHIC_RULES = DecisionMadeBy(JsonField.of("LITHIC_RULES"))

            val NETWORK = DecisionMadeBy(JsonField.of("NETWORK"))

            val UNKNOWN = DecisionMadeBy(JsonField.of("UNKNOWN"))

            fun of(value: String) = DecisionMadeBy(JsonField.of(value))
        }

        enum class Known {
            CUSTOMER_ENDPOINT,
            LITHIC_DEFAULT,
            LITHIC_RULES,
            NETWORK,
            UNKNOWN,
        }

        enum class Value {
            CUSTOMER_ENDPOINT,
            LITHIC_DEFAULT,
            LITHIC_RULES,
            NETWORK,
            UNKNOWN,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                CUSTOMER_ENDPOINT -> Value.CUSTOMER_ENDPOINT
                LITHIC_DEFAULT -> Value.LITHIC_DEFAULT
                LITHIC_RULES -> Value.LITHIC_RULES
                NETWORK -> Value.NETWORK
                UNKNOWN -> Value.UNKNOWN
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                CUSTOMER_ENDPOINT -> Known.CUSTOMER_ENDPOINT
                LITHIC_DEFAULT -> Known.LITHIC_DEFAULT
                LITHIC_RULES -> Known.LITHIC_RULES
                NETWORK -> Known.NETWORK
                UNKNOWN -> Known.UNKNOWN
                else -> throw LithicInvalidDataException("Unknown DecisionMadeBy: $value")
            }

        fun asString(): String = _value().asStringOrThrow()
    }

    /** Object containing data about the merchant involved in the e-commerce transaction. */
    @JsonDeserialize(builder = Merchant.Builder::class)
    @NoAutoDetect
    class Merchant
    private constructor(
        private val country: JsonField<String>,
        private val id: JsonField<String>,
        private val mcc: JsonField<String>,
        private val name: JsonField<String>,
        private val riskIndicator: JsonField<RiskIndicator>,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var validated: Boolean = false

        /**
         * Country code of the merchant requesting 3DS authentication. Maps to EMV 3DS field
         * merchantCountryCode.
         */
        fun country(): String = country.getRequired("country")

        /**
         * Merchant identifier as assigned by the acquirer. Maps to EMV 3DS field
         * acquirerMerchantId.
         */
        fun id(): String = id.getRequired("id")

        /**
         * Merchant category code assigned to the merchant that describes its business activity
         * type. Maps to EMV 3DS field mcc.
         */
        fun mcc(): String = mcc.getRequired("mcc")

        /** Name of the merchant. Maps to EMV 3DS field merchantName. */
        fun name(): String = name.getRequired("name")

        /**
         * Object containing additional data indicating additional risk factors related to the
         * e-commerce transaction.
         */
        fun riskIndicator(): RiskIndicator = riskIndicator.getRequired("risk_indicator")

        /**
         * Country code of the merchant requesting 3DS authentication. Maps to EMV 3DS field
         * merchantCountryCode.
         */
        @JsonProperty("country") @ExcludeMissing fun _country() = country

        /**
         * Merchant identifier as assigned by the acquirer. Maps to EMV 3DS field
         * acquirerMerchantId.
         */
        @JsonProperty("id") @ExcludeMissing fun _id() = id

        /**
         * Merchant category code assigned to the merchant that describes its business activity
         * type. Maps to EMV 3DS field mcc.
         */
        @JsonProperty("mcc") @ExcludeMissing fun _mcc() = mcc

        /** Name of the merchant. Maps to EMV 3DS field merchantName. */
        @JsonProperty("name") @ExcludeMissing fun _name() = name

        /**
         * Object containing additional data indicating additional risk factors related to the
         * e-commerce transaction.
         */
        @JsonProperty("risk_indicator") @ExcludeMissing fun _riskIndicator() = riskIndicator

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun validate(): Merchant = apply {
            if (!validated) {
                country()
                id()
                mcc()
                name()
                riskIndicator().validate()
                validated = true
            }
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var country: JsonField<String> = JsonMissing.of()
            private var id: JsonField<String> = JsonMissing.of()
            private var mcc: JsonField<String> = JsonMissing.of()
            private var name: JsonField<String> = JsonMissing.of()
            private var riskIndicator: JsonField<RiskIndicator> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(merchant: Merchant) = apply {
                this.country = merchant.country
                this.id = merchant.id
                this.mcc = merchant.mcc
                this.name = merchant.name
                this.riskIndicator = merchant.riskIndicator
                additionalProperties(merchant.additionalProperties)
            }

            /**
             * Country code of the merchant requesting 3DS authentication. Maps to EMV 3DS field
             * merchantCountryCode.
             */
            fun country(country: String) = country(JsonField.of(country))

            /**
             * Country code of the merchant requesting 3DS authentication. Maps to EMV 3DS field
             * merchantCountryCode.
             */
            @JsonProperty("country")
            @ExcludeMissing
            fun country(country: JsonField<String>) = apply { this.country = country }

            /**
             * Merchant identifier as assigned by the acquirer. Maps to EMV 3DS field
             * acquirerMerchantId.
             */
            fun id(id: String) = id(JsonField.of(id))

            /**
             * Merchant identifier as assigned by the acquirer. Maps to EMV 3DS field
             * acquirerMerchantId.
             */
            @JsonProperty("id")
            @ExcludeMissing
            fun id(id: JsonField<String>) = apply { this.id = id }

            /**
             * Merchant category code assigned to the merchant that describes its business activity
             * type. Maps to EMV 3DS field mcc.
             */
            fun mcc(mcc: String) = mcc(JsonField.of(mcc))

            /**
             * Merchant category code assigned to the merchant that describes its business activity
             * type. Maps to EMV 3DS field mcc.
             */
            @JsonProperty("mcc")
            @ExcludeMissing
            fun mcc(mcc: JsonField<String>) = apply { this.mcc = mcc }

            /** Name of the merchant. Maps to EMV 3DS field merchantName. */
            fun name(name: String) = name(JsonField.of(name))

            /** Name of the merchant. Maps to EMV 3DS field merchantName. */
            @JsonProperty("name")
            @ExcludeMissing
            fun name(name: JsonField<String>) = apply { this.name = name }

            /**
             * Object containing additional data indicating additional risk factors related to the
             * e-commerce transaction.
             */
            fun riskIndicator(riskIndicator: RiskIndicator) =
                riskIndicator(JsonField.of(riskIndicator))

            /**
             * Object containing additional data indicating additional risk factors related to the
             * e-commerce transaction.
             */
            @JsonProperty("risk_indicator")
            @ExcludeMissing
            fun riskIndicator(riskIndicator: JsonField<RiskIndicator>) = apply {
                this.riskIndicator = riskIndicator
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

            fun build(): Merchant =
                Merchant(
                    country,
                    id,
                    mcc,
                    name,
                    riskIndicator,
                    additionalProperties.toImmutable(),
                )
        }

        /**
         * Object containing additional data indicating additional risk factors related to the
         * e-commerce transaction.
         */
        @JsonDeserialize(builder = RiskIndicator.Builder::class)
        @NoAutoDetect
        class RiskIndicator
        private constructor(
            private val deliveryEmailAddress: JsonField<String>,
            private val deliveryTimeFrame: JsonField<DeliveryTimeFrame>,
            private val giftCardAmount: JsonField<Long>,
            private val giftCardCount: JsonField<Long>,
            private val giftCardCurrency: JsonField<String>,
            private val orderAvailability: JsonField<OrderAvailability>,
            private val preOrderAvailableDate: JsonField<OffsetDateTime>,
            private val reorderItems: JsonField<ReorderItems>,
            private val shippingMethod: JsonField<ShippingMethod>,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            private var validated: Boolean = false

            /**
             * In transactions with electronic delivery, email address to which merchandise is
             * delivered. Maps to EMV 3DS field deliveryEmailAddress.
             */
            fun deliveryEmailAddress(): String? =
                deliveryEmailAddress.getNullable("delivery_email_address")

            /**
             * The delivery time frame for the merchandise. Maps to EMV 3DS field deliveryTimeframe.
             */
            fun deliveryTimeFrame(): DeliveryTimeFrame? =
                deliveryTimeFrame.getNullable("delivery_time_frame")

            /**
             * In prepaid or gift card purchase transactions, purchase amount total in major units
             * (e.g., a purchase of USD $205.10 would be 205). Maps to EMV 3DS field giftCardAmount.
             */
            fun giftCardAmount(): Long? = giftCardAmount.getNullable("gift_card_amount")

            /**
             * In prepaid or gift card purchase transactions, count of individual prepaid or gift
             * cards/codes purchased. Maps to EMV 3DS field giftCardCount.
             */
            fun giftCardCount(): Long? = giftCardCount.getNullable("gift_card_count")

            /**
             * In prepaid or gift card purchase transactions, currency code of the gift card. Maps
             * to EMV 3DS field giftCardCurr.
             */
            fun giftCardCurrency(): String? = giftCardCurrency.getNullable("gift_card_currency")

            /**
             * Indicates whether the purchase is for merchandise that is available now or at a
             * future date. Maps to EMV 3DS field preOrderPurchaseInd.
             */
            fun orderAvailability(): OrderAvailability? =
                orderAvailability.getNullable("order_availability")

            /**
             * In pre-order purchase transactions, the expected date that the merchandise will be
             * available. Maps to EMV 3DS field preOrderDate.
             */
            fun preOrderAvailableDate(): OffsetDateTime? =
                preOrderAvailableDate.getNullable("pre_order_available_date")

            /**
             * Indicates whether the cardholder is reordering previously purchased merchandise. Maps
             * to EMV 3DS field reorderItemsInd.
             */
            fun reorderItems(): ReorderItems? = reorderItems.getNullable("reorder_items")

            /**
             * Shipping method that the cardholder chose for the transaction. If purchase includes
             * one or more item, this indicator is used for the physical goods; if the purchase only
             * includes digital goods, this indicator is used to describe the most expensive item
             * purchased. Maps to EMV 3DS field shipIndicator.
             */
            fun shippingMethod(): ShippingMethod? = shippingMethod.getNullable("shipping_method")

            /**
             * In transactions with electronic delivery, email address to which merchandise is
             * delivered. Maps to EMV 3DS field deliveryEmailAddress.
             */
            @JsonProperty("delivery_email_address")
            @ExcludeMissing
            fun _deliveryEmailAddress() = deliveryEmailAddress

            /**
             * The delivery time frame for the merchandise. Maps to EMV 3DS field deliveryTimeframe.
             */
            @JsonProperty("delivery_time_frame")
            @ExcludeMissing
            fun _deliveryTimeFrame() = deliveryTimeFrame

            /**
             * In prepaid or gift card purchase transactions, purchase amount total in major units
             * (e.g., a purchase of USD $205.10 would be 205). Maps to EMV 3DS field giftCardAmount.
             */
            @JsonProperty("gift_card_amount") @ExcludeMissing fun _giftCardAmount() = giftCardAmount

            /**
             * In prepaid or gift card purchase transactions, count of individual prepaid or gift
             * cards/codes purchased. Maps to EMV 3DS field giftCardCount.
             */
            @JsonProperty("gift_card_count") @ExcludeMissing fun _giftCardCount() = giftCardCount

            /**
             * In prepaid or gift card purchase transactions, currency code of the gift card. Maps
             * to EMV 3DS field giftCardCurr.
             */
            @JsonProperty("gift_card_currency")
            @ExcludeMissing
            fun _giftCardCurrency() = giftCardCurrency

            /**
             * Indicates whether the purchase is for merchandise that is available now or at a
             * future date. Maps to EMV 3DS field preOrderPurchaseInd.
             */
            @JsonProperty("order_availability")
            @ExcludeMissing
            fun _orderAvailability() = orderAvailability

            /**
             * In pre-order purchase transactions, the expected date that the merchandise will be
             * available. Maps to EMV 3DS field preOrderDate.
             */
            @JsonProperty("pre_order_available_date")
            @ExcludeMissing
            fun _preOrderAvailableDate() = preOrderAvailableDate

            /**
             * Indicates whether the cardholder is reordering previously purchased merchandise. Maps
             * to EMV 3DS field reorderItemsInd.
             */
            @JsonProperty("reorder_items") @ExcludeMissing fun _reorderItems() = reorderItems

            /**
             * Shipping method that the cardholder chose for the transaction. If purchase includes
             * one or more item, this indicator is used for the physical goods; if the purchase only
             * includes digital goods, this indicator is used to describe the most expensive item
             * purchased. Maps to EMV 3DS field shipIndicator.
             */
            @JsonProperty("shipping_method") @ExcludeMissing fun _shippingMethod() = shippingMethod

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun validate(): RiskIndicator = apply {
                if (!validated) {
                    deliveryEmailAddress()
                    deliveryTimeFrame()
                    giftCardAmount()
                    giftCardCount()
                    giftCardCurrency()
                    orderAvailability()
                    preOrderAvailableDate()
                    reorderItems()
                    shippingMethod()
                    validated = true
                }
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                fun builder() = Builder()
            }

            class Builder {

                private var deliveryEmailAddress: JsonField<String> = JsonMissing.of()
                private var deliveryTimeFrame: JsonField<DeliveryTimeFrame> = JsonMissing.of()
                private var giftCardAmount: JsonField<Long> = JsonMissing.of()
                private var giftCardCount: JsonField<Long> = JsonMissing.of()
                private var giftCardCurrency: JsonField<String> = JsonMissing.of()
                private var orderAvailability: JsonField<OrderAvailability> = JsonMissing.of()
                private var preOrderAvailableDate: JsonField<OffsetDateTime> = JsonMissing.of()
                private var reorderItems: JsonField<ReorderItems> = JsonMissing.of()
                private var shippingMethod: JsonField<ShippingMethod> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(riskIndicator: RiskIndicator) = apply {
                    this.deliveryEmailAddress = riskIndicator.deliveryEmailAddress
                    this.deliveryTimeFrame = riskIndicator.deliveryTimeFrame
                    this.giftCardAmount = riskIndicator.giftCardAmount
                    this.giftCardCount = riskIndicator.giftCardCount
                    this.giftCardCurrency = riskIndicator.giftCardCurrency
                    this.orderAvailability = riskIndicator.orderAvailability
                    this.preOrderAvailableDate = riskIndicator.preOrderAvailableDate
                    this.reorderItems = riskIndicator.reorderItems
                    this.shippingMethod = riskIndicator.shippingMethod
                    additionalProperties(riskIndicator.additionalProperties)
                }

                /**
                 * In transactions with electronic delivery, email address to which merchandise is
                 * delivered. Maps to EMV 3DS field deliveryEmailAddress.
                 */
                fun deliveryEmailAddress(deliveryEmailAddress: String) =
                    deliveryEmailAddress(JsonField.of(deliveryEmailAddress))

                /**
                 * In transactions with electronic delivery, email address to which merchandise is
                 * delivered. Maps to EMV 3DS field deliveryEmailAddress.
                 */
                @JsonProperty("delivery_email_address")
                @ExcludeMissing
                fun deliveryEmailAddress(deliveryEmailAddress: JsonField<String>) = apply {
                    this.deliveryEmailAddress = deliveryEmailAddress
                }

                /**
                 * The delivery time frame for the merchandise. Maps to EMV 3DS field
                 * deliveryTimeframe.
                 */
                fun deliveryTimeFrame(deliveryTimeFrame: DeliveryTimeFrame) =
                    deliveryTimeFrame(JsonField.of(deliveryTimeFrame))

                /**
                 * The delivery time frame for the merchandise. Maps to EMV 3DS field
                 * deliveryTimeframe.
                 */
                @JsonProperty("delivery_time_frame")
                @ExcludeMissing
                fun deliveryTimeFrame(deliveryTimeFrame: JsonField<DeliveryTimeFrame>) = apply {
                    this.deliveryTimeFrame = deliveryTimeFrame
                }

                /**
                 * In prepaid or gift card purchase transactions, purchase amount total in major
                 * units (e.g., a purchase of USD $205.10 would be 205). Maps to EMV 3DS field
                 * giftCardAmount.
                 */
                fun giftCardAmount(giftCardAmount: Long) =
                    giftCardAmount(JsonField.of(giftCardAmount))

                /**
                 * In prepaid or gift card purchase transactions, purchase amount total in major
                 * units (e.g., a purchase of USD $205.10 would be 205). Maps to EMV 3DS field
                 * giftCardAmount.
                 */
                @JsonProperty("gift_card_amount")
                @ExcludeMissing
                fun giftCardAmount(giftCardAmount: JsonField<Long>) = apply {
                    this.giftCardAmount = giftCardAmount
                }

                /**
                 * In prepaid or gift card purchase transactions, count of individual prepaid or
                 * gift cards/codes purchased. Maps to EMV 3DS field giftCardCount.
                 */
                fun giftCardCount(giftCardCount: Long) = giftCardCount(JsonField.of(giftCardCount))

                /**
                 * In prepaid or gift card purchase transactions, count of individual prepaid or
                 * gift cards/codes purchased. Maps to EMV 3DS field giftCardCount.
                 */
                @JsonProperty("gift_card_count")
                @ExcludeMissing
                fun giftCardCount(giftCardCount: JsonField<Long>) = apply {
                    this.giftCardCount = giftCardCount
                }

                /**
                 * In prepaid or gift card purchase transactions, currency code of the gift card.
                 * Maps to EMV 3DS field giftCardCurr.
                 */
                fun giftCardCurrency(giftCardCurrency: String) =
                    giftCardCurrency(JsonField.of(giftCardCurrency))

                /**
                 * In prepaid or gift card purchase transactions, currency code of the gift card.
                 * Maps to EMV 3DS field giftCardCurr.
                 */
                @JsonProperty("gift_card_currency")
                @ExcludeMissing
                fun giftCardCurrency(giftCardCurrency: JsonField<String>) = apply {
                    this.giftCardCurrency = giftCardCurrency
                }

                /**
                 * Indicates whether the purchase is for merchandise that is available now or at a
                 * future date. Maps to EMV 3DS field preOrderPurchaseInd.
                 */
                fun orderAvailability(orderAvailability: OrderAvailability) =
                    orderAvailability(JsonField.of(orderAvailability))

                /**
                 * Indicates whether the purchase is for merchandise that is available now or at a
                 * future date. Maps to EMV 3DS field preOrderPurchaseInd.
                 */
                @JsonProperty("order_availability")
                @ExcludeMissing
                fun orderAvailability(orderAvailability: JsonField<OrderAvailability>) = apply {
                    this.orderAvailability = orderAvailability
                }

                /**
                 * In pre-order purchase transactions, the expected date that the merchandise will
                 * be available. Maps to EMV 3DS field preOrderDate.
                 */
                fun preOrderAvailableDate(preOrderAvailableDate: OffsetDateTime) =
                    preOrderAvailableDate(JsonField.of(preOrderAvailableDate))

                /**
                 * In pre-order purchase transactions, the expected date that the merchandise will
                 * be available. Maps to EMV 3DS field preOrderDate.
                 */
                @JsonProperty("pre_order_available_date")
                @ExcludeMissing
                fun preOrderAvailableDate(preOrderAvailableDate: JsonField<OffsetDateTime>) =
                    apply {
                        this.preOrderAvailableDate = preOrderAvailableDate
                    }

                /**
                 * Indicates whether the cardholder is reordering previously purchased merchandise.
                 * Maps to EMV 3DS field reorderItemsInd.
                 */
                fun reorderItems(reorderItems: ReorderItems) =
                    reorderItems(JsonField.of(reorderItems))

                /**
                 * Indicates whether the cardholder is reordering previously purchased merchandise.
                 * Maps to EMV 3DS field reorderItemsInd.
                 */
                @JsonProperty("reorder_items")
                @ExcludeMissing
                fun reorderItems(reorderItems: JsonField<ReorderItems>) = apply {
                    this.reorderItems = reorderItems
                }

                /**
                 * Shipping method that the cardholder chose for the transaction. If purchase
                 * includes one or more item, this indicator is used for the physical goods; if the
                 * purchase only includes digital goods, this indicator is used to describe the most
                 * expensive item purchased. Maps to EMV 3DS field shipIndicator.
                 */
                fun shippingMethod(shippingMethod: ShippingMethod) =
                    shippingMethod(JsonField.of(shippingMethod))

                /**
                 * Shipping method that the cardholder chose for the transaction. If purchase
                 * includes one or more item, this indicator is used for the physical goods; if the
                 * purchase only includes digital goods, this indicator is used to describe the most
                 * expensive item purchased. Maps to EMV 3DS field shipIndicator.
                 */
                @JsonProperty("shipping_method")
                @ExcludeMissing
                fun shippingMethod(shippingMethod: JsonField<ShippingMethod>) = apply {
                    this.shippingMethod = shippingMethod
                }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    this.additionalProperties.putAll(additionalProperties)
                }

                @JsonAnySetter
                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    this.additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun build(): RiskIndicator =
                    RiskIndicator(
                        deliveryEmailAddress,
                        deliveryTimeFrame,
                        giftCardAmount,
                        giftCardCount,
                        giftCardCurrency,
                        orderAvailability,
                        preOrderAvailableDate,
                        reorderItems,
                        shippingMethod,
                        additionalProperties.toImmutable(),
                    )
            }

            class DeliveryTimeFrame
            @JsonCreator
            private constructor(
                private val value: JsonField<String>,
            ) : Enum {

                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is DeliveryTimeFrame && value == other.value /* spotless:on */
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()

                companion object {

                    val ELECTRONIC_DELIVERY = DeliveryTimeFrame(JsonField.of("ELECTRONIC_DELIVERY"))

                    val OVERNIGHT_SHIPPING = DeliveryTimeFrame(JsonField.of("OVERNIGHT_SHIPPING"))

                    val SAME_DAY_SHIPPING = DeliveryTimeFrame(JsonField.of("SAME_DAY_SHIPPING"))

                    val TWO_DAY_OR_MORE_SHIPPING =
                        DeliveryTimeFrame(JsonField.of("TWO_DAY_OR_MORE_SHIPPING"))

                    fun of(value: String) = DeliveryTimeFrame(JsonField.of(value))
                }

                enum class Known {
                    ELECTRONIC_DELIVERY,
                    OVERNIGHT_SHIPPING,
                    SAME_DAY_SHIPPING,
                    TWO_DAY_OR_MORE_SHIPPING,
                }

                enum class Value {
                    ELECTRONIC_DELIVERY,
                    OVERNIGHT_SHIPPING,
                    SAME_DAY_SHIPPING,
                    TWO_DAY_OR_MORE_SHIPPING,
                    _UNKNOWN,
                }

                fun value(): Value =
                    when (this) {
                        ELECTRONIC_DELIVERY -> Value.ELECTRONIC_DELIVERY
                        OVERNIGHT_SHIPPING -> Value.OVERNIGHT_SHIPPING
                        SAME_DAY_SHIPPING -> Value.SAME_DAY_SHIPPING
                        TWO_DAY_OR_MORE_SHIPPING -> Value.TWO_DAY_OR_MORE_SHIPPING
                        else -> Value._UNKNOWN
                    }

                fun known(): Known =
                    when (this) {
                        ELECTRONIC_DELIVERY -> Known.ELECTRONIC_DELIVERY
                        OVERNIGHT_SHIPPING -> Known.OVERNIGHT_SHIPPING
                        SAME_DAY_SHIPPING -> Known.SAME_DAY_SHIPPING
                        TWO_DAY_OR_MORE_SHIPPING -> Known.TWO_DAY_OR_MORE_SHIPPING
                        else ->
                            throw LithicInvalidDataException("Unknown DeliveryTimeFrame: $value")
                    }

                fun asString(): String = _value().asStringOrThrow()
            }

            class OrderAvailability
            @JsonCreator
            private constructor(
                private val value: JsonField<String>,
            ) : Enum {

                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is OrderAvailability && value == other.value /* spotless:on */
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()

                companion object {

                    val FUTURE_AVAILABILITY = OrderAvailability(JsonField.of("FUTURE_AVAILABILITY"))

                    val MERCHANDISE_AVAILABLE =
                        OrderAvailability(JsonField.of("MERCHANDISE_AVAILABLE"))

                    fun of(value: String) = OrderAvailability(JsonField.of(value))
                }

                enum class Known {
                    FUTURE_AVAILABILITY,
                    MERCHANDISE_AVAILABLE,
                }

                enum class Value {
                    FUTURE_AVAILABILITY,
                    MERCHANDISE_AVAILABLE,
                    _UNKNOWN,
                }

                fun value(): Value =
                    when (this) {
                        FUTURE_AVAILABILITY -> Value.FUTURE_AVAILABILITY
                        MERCHANDISE_AVAILABLE -> Value.MERCHANDISE_AVAILABLE
                        else -> Value._UNKNOWN
                    }

                fun known(): Known =
                    when (this) {
                        FUTURE_AVAILABILITY -> Known.FUTURE_AVAILABILITY
                        MERCHANDISE_AVAILABLE -> Known.MERCHANDISE_AVAILABLE
                        else ->
                            throw LithicInvalidDataException("Unknown OrderAvailability: $value")
                    }

                fun asString(): String = _value().asStringOrThrow()
            }

            class ReorderItems
            @JsonCreator
            private constructor(
                private val value: JsonField<String>,
            ) : Enum {

                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is ReorderItems && value == other.value /* spotless:on */
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()

                companion object {

                    val FIRST_TIME_ORDERED = ReorderItems(JsonField.of("FIRST_TIME_ORDERED"))

                    val REORDERED = ReorderItems(JsonField.of("REORDERED"))

                    fun of(value: String) = ReorderItems(JsonField.of(value))
                }

                enum class Known {
                    FIRST_TIME_ORDERED,
                    REORDERED,
                }

                enum class Value {
                    FIRST_TIME_ORDERED,
                    REORDERED,
                    _UNKNOWN,
                }

                fun value(): Value =
                    when (this) {
                        FIRST_TIME_ORDERED -> Value.FIRST_TIME_ORDERED
                        REORDERED -> Value.REORDERED
                        else -> Value._UNKNOWN
                    }

                fun known(): Known =
                    when (this) {
                        FIRST_TIME_ORDERED -> Known.FIRST_TIME_ORDERED
                        REORDERED -> Known.REORDERED
                        else -> throw LithicInvalidDataException("Unknown ReorderItems: $value")
                    }

                fun asString(): String = _value().asStringOrThrow()
            }

            class ShippingMethod
            @JsonCreator
            private constructor(
                private val value: JsonField<String>,
            ) : Enum {

                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is ShippingMethod && value == other.value /* spotless:on */
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()

                companion object {

                    val DIGITAL_GOODS = ShippingMethod(JsonField.of("DIGITAL_GOODS"))

                    val LOCKER_DELIVERY = ShippingMethod(JsonField.of("LOCKER_DELIVERY"))

                    val OTHER = ShippingMethod(JsonField.of("OTHER"))

                    val PICK_UP_AND_GO_DELIVERY =
                        ShippingMethod(JsonField.of("PICK_UP_AND_GO_DELIVERY"))

                    val SHIP_TO_BILLING_ADDRESS =
                        ShippingMethod(JsonField.of("SHIP_TO_BILLING_ADDRESS"))

                    val SHIP_TO_NON_BILLING_ADDRESS =
                        ShippingMethod(JsonField.of("SHIP_TO_NON_BILLING_ADDRESS"))

                    val SHIP_TO_OTHER_VERIFIED_ADDRESS =
                        ShippingMethod(JsonField.of("SHIP_TO_OTHER_VERIFIED_ADDRESS"))

                    val SHIP_TO_STORE = ShippingMethod(JsonField.of("SHIP_TO_STORE"))

                    val TRAVEL_AND_EVENT_TICKETS =
                        ShippingMethod(JsonField.of("TRAVEL_AND_EVENT_TICKETS"))

                    fun of(value: String) = ShippingMethod(JsonField.of(value))
                }

                enum class Known {
                    DIGITAL_GOODS,
                    LOCKER_DELIVERY,
                    OTHER,
                    PICK_UP_AND_GO_DELIVERY,
                    SHIP_TO_BILLING_ADDRESS,
                    SHIP_TO_NON_BILLING_ADDRESS,
                    SHIP_TO_OTHER_VERIFIED_ADDRESS,
                    SHIP_TO_STORE,
                    TRAVEL_AND_EVENT_TICKETS,
                }

                enum class Value {
                    DIGITAL_GOODS,
                    LOCKER_DELIVERY,
                    OTHER,
                    PICK_UP_AND_GO_DELIVERY,
                    SHIP_TO_BILLING_ADDRESS,
                    SHIP_TO_NON_BILLING_ADDRESS,
                    SHIP_TO_OTHER_VERIFIED_ADDRESS,
                    SHIP_TO_STORE,
                    TRAVEL_AND_EVENT_TICKETS,
                    _UNKNOWN,
                }

                fun value(): Value =
                    when (this) {
                        DIGITAL_GOODS -> Value.DIGITAL_GOODS
                        LOCKER_DELIVERY -> Value.LOCKER_DELIVERY
                        OTHER -> Value.OTHER
                        PICK_UP_AND_GO_DELIVERY -> Value.PICK_UP_AND_GO_DELIVERY
                        SHIP_TO_BILLING_ADDRESS -> Value.SHIP_TO_BILLING_ADDRESS
                        SHIP_TO_NON_BILLING_ADDRESS -> Value.SHIP_TO_NON_BILLING_ADDRESS
                        SHIP_TO_OTHER_VERIFIED_ADDRESS -> Value.SHIP_TO_OTHER_VERIFIED_ADDRESS
                        SHIP_TO_STORE -> Value.SHIP_TO_STORE
                        TRAVEL_AND_EVENT_TICKETS -> Value.TRAVEL_AND_EVENT_TICKETS
                        else -> Value._UNKNOWN
                    }

                fun known(): Known =
                    when (this) {
                        DIGITAL_GOODS -> Known.DIGITAL_GOODS
                        LOCKER_DELIVERY -> Known.LOCKER_DELIVERY
                        OTHER -> Known.OTHER
                        PICK_UP_AND_GO_DELIVERY -> Known.PICK_UP_AND_GO_DELIVERY
                        SHIP_TO_BILLING_ADDRESS -> Known.SHIP_TO_BILLING_ADDRESS
                        SHIP_TO_NON_BILLING_ADDRESS -> Known.SHIP_TO_NON_BILLING_ADDRESS
                        SHIP_TO_OTHER_VERIFIED_ADDRESS -> Known.SHIP_TO_OTHER_VERIFIED_ADDRESS
                        SHIP_TO_STORE -> Known.SHIP_TO_STORE
                        TRAVEL_AND_EVENT_TICKETS -> Known.TRAVEL_AND_EVENT_TICKETS
                        else -> throw LithicInvalidDataException("Unknown ShippingMethod: $value")
                    }

                fun asString(): String = _value().asStringOrThrow()
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is RiskIndicator && deliveryEmailAddress == other.deliveryEmailAddress && deliveryTimeFrame == other.deliveryTimeFrame && giftCardAmount == other.giftCardAmount && giftCardCount == other.giftCardCount && giftCardCurrency == other.giftCardCurrency && orderAvailability == other.orderAvailability && preOrderAvailableDate == other.preOrderAvailableDate && reorderItems == other.reorderItems && shippingMethod == other.shippingMethod && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(deliveryEmailAddress, deliveryTimeFrame, giftCardAmount, giftCardCount, giftCardCurrency, orderAvailability, preOrderAvailableDate, reorderItems, shippingMethod, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "RiskIndicator{deliveryEmailAddress=$deliveryEmailAddress, deliveryTimeFrame=$deliveryTimeFrame, giftCardAmount=$giftCardAmount, giftCardCount=$giftCardCount, giftCardCurrency=$giftCardCurrency, orderAvailability=$orderAvailability, preOrderAvailableDate=$preOrderAvailableDate, reorderItems=$reorderItems, shippingMethod=$shippingMethod, additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Merchant && country == other.country && id == other.id && mcc == other.mcc && name == other.name && riskIndicator == other.riskIndicator && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(country, id, mcc, name, riskIndicator, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Merchant{country=$country, id=$id, mcc=$mcc, name=$name, riskIndicator=$riskIndicator, additionalProperties=$additionalProperties}"
    }

    class MessageCategory
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is MessageCategory && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()

        companion object {

            val NON_PAYMENT_AUTHENTICATION =
                MessageCategory(JsonField.of("NON_PAYMENT_AUTHENTICATION"))

            val PAYMENT_AUTHENTICATION = MessageCategory(JsonField.of("PAYMENT_AUTHENTICATION"))

            fun of(value: String) = MessageCategory(JsonField.of(value))
        }

        enum class Known {
            NON_PAYMENT_AUTHENTICATION,
            PAYMENT_AUTHENTICATION,
        }

        enum class Value {
            NON_PAYMENT_AUTHENTICATION,
            PAYMENT_AUTHENTICATION,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                NON_PAYMENT_AUTHENTICATION -> Value.NON_PAYMENT_AUTHENTICATION
                PAYMENT_AUTHENTICATION -> Value.PAYMENT_AUTHENTICATION
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                NON_PAYMENT_AUTHENTICATION -> Known.NON_PAYMENT_AUTHENTICATION
                PAYMENT_AUTHENTICATION -> Known.PAYMENT_AUTHENTICATION
                else -> throw LithicInvalidDataException("Unknown MessageCategory: $value")
            }

        fun asString(): String = _value().asStringOrThrow()
    }

    /**
     * Object containing additional data about the 3DS request that is beyond the EMV 3DS standard
     * spec (e.g., specific fields that only certain card networks send but are not required across
     * all 3DS requests).
     */
    @JsonDeserialize(builder = AdditionalData.Builder::class)
    @NoAutoDetect
    class AdditionalData
    private constructor(
        private val networkDecision: JsonField<NetworkDecision>,
        private val networkRiskScore: JsonField<Long>,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var validated: Boolean = false

        /**
         * Mastercard only: Indicates whether the network would have considered the authentication
         * request to be low risk or not.
         */
        fun networkDecision(): NetworkDecision? = networkDecision.getNullable("network_decision")

        /**
         * Mastercard only: Assessment by the network of the authentication risk level, with a
         * higher value indicating a higher amount of risk.
         */
        fun networkRiskScore(): Long? = networkRiskScore.getNullable("network_risk_score")

        /**
         * Mastercard only: Indicates whether the network would have considered the authentication
         * request to be low risk or not.
         */
        @JsonProperty("network_decision") @ExcludeMissing fun _networkDecision() = networkDecision

        /**
         * Mastercard only: Assessment by the network of the authentication risk level, with a
         * higher value indicating a higher amount of risk.
         */
        @JsonProperty("network_risk_score")
        @ExcludeMissing
        fun _networkRiskScore() = networkRiskScore

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun validate(): AdditionalData = apply {
            if (!validated) {
                networkDecision()
                networkRiskScore()
                validated = true
            }
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var networkDecision: JsonField<NetworkDecision> = JsonMissing.of()
            private var networkRiskScore: JsonField<Long> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(additionalData: AdditionalData) = apply {
                this.networkDecision = additionalData.networkDecision
                this.networkRiskScore = additionalData.networkRiskScore
                additionalProperties(additionalData.additionalProperties)
            }

            /**
             * Mastercard only: Indicates whether the network would have considered the
             * authentication request to be low risk or not.
             */
            fun networkDecision(networkDecision: NetworkDecision) =
                networkDecision(JsonField.of(networkDecision))

            /**
             * Mastercard only: Indicates whether the network would have considered the
             * authentication request to be low risk or not.
             */
            @JsonProperty("network_decision")
            @ExcludeMissing
            fun networkDecision(networkDecision: JsonField<NetworkDecision>) = apply {
                this.networkDecision = networkDecision
            }

            /**
             * Mastercard only: Assessment by the network of the authentication risk level, with a
             * higher value indicating a higher amount of risk.
             */
            fun networkRiskScore(networkRiskScore: Long) =
                networkRiskScore(JsonField.of(networkRiskScore))

            /**
             * Mastercard only: Assessment by the network of the authentication risk level, with a
             * higher value indicating a higher amount of risk.
             */
            @JsonProperty("network_risk_score")
            @ExcludeMissing
            fun networkRiskScore(networkRiskScore: JsonField<Long>) = apply {
                this.networkRiskScore = networkRiskScore
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

            fun build(): AdditionalData =
                AdditionalData(
                    networkDecision,
                    networkRiskScore,
                    additionalProperties.toImmutable(),
                )
        }

        class NetworkDecision
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) : Enum {

            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is NetworkDecision && value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()

            companion object {

                val LOW_RISK = NetworkDecision(JsonField.of("LOW_RISK"))

                val NOT_LOW_RISK = NetworkDecision(JsonField.of("NOT_LOW_RISK"))

                fun of(value: String) = NetworkDecision(JsonField.of(value))
            }

            enum class Known {
                LOW_RISK,
                NOT_LOW_RISK,
            }

            enum class Value {
                LOW_RISK,
                NOT_LOW_RISK,
                _UNKNOWN,
            }

            fun value(): Value =
                when (this) {
                    LOW_RISK -> Value.LOW_RISK
                    NOT_LOW_RISK -> Value.NOT_LOW_RISK
                    else -> Value._UNKNOWN
                }

            fun known(): Known =
                when (this) {
                    LOW_RISK -> Known.LOW_RISK
                    NOT_LOW_RISK -> Known.NOT_LOW_RISK
                    else -> throw LithicInvalidDataException("Unknown NetworkDecision: $value")
                }

            fun asString(): String = _value().asStringOrThrow()
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is AdditionalData && networkDecision == other.networkDecision && networkRiskScore == other.networkRiskScore && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(networkDecision, networkRiskScore, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "AdditionalData{networkDecision=$networkDecision, networkRiskScore=$networkRiskScore, additionalProperties=$additionalProperties}"
    }

    /**
     * Object containing data about the app used in the e-commerce transaction. Present if the
     * channel is 'APP_BASED'.
     */
    @JsonDeserialize(builder = App.Builder::class)
    @NoAutoDetect
    class App
    private constructor(
        private val deviceInfo: JsonField<String>,
        private val ip: JsonField<String>,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var validated: Boolean = false

        /**
         * Device information gathered from the cardholder's device - JSON name/value pairs that is
         * Base64url encoded. Maps to EMV 3DS field deviceInfo.
         */
        fun deviceInfo(): String? = deviceInfo.getNullable("device_info")

        /**
         * External IP address used by the app generating the 3DS authentication request. Maps to
         * EMV 3DS field appIp.
         */
        fun ip(): String? = ip.getNullable("ip")

        /**
         * Device information gathered from the cardholder's device - JSON name/value pairs that is
         * Base64url encoded. Maps to EMV 3DS field deviceInfo.
         */
        @JsonProperty("device_info") @ExcludeMissing fun _deviceInfo() = deviceInfo

        /**
         * External IP address used by the app generating the 3DS authentication request. Maps to
         * EMV 3DS field appIp.
         */
        @JsonProperty("ip") @ExcludeMissing fun _ip() = ip

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun validate(): App = apply {
            if (!validated) {
                deviceInfo()
                ip()
                validated = true
            }
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var deviceInfo: JsonField<String> = JsonMissing.of()
            private var ip: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(app: App) = apply {
                this.deviceInfo = app.deviceInfo
                this.ip = app.ip
                additionalProperties(app.additionalProperties)
            }

            /**
             * Device information gathered from the cardholder's device - JSON name/value pairs that
             * is Base64url encoded. Maps to EMV 3DS field deviceInfo.
             */
            fun deviceInfo(deviceInfo: String) = deviceInfo(JsonField.of(deviceInfo))

            /**
             * Device information gathered from the cardholder's device - JSON name/value pairs that
             * is Base64url encoded. Maps to EMV 3DS field deviceInfo.
             */
            @JsonProperty("device_info")
            @ExcludeMissing
            fun deviceInfo(deviceInfo: JsonField<String>) = apply { this.deviceInfo = deviceInfo }

            /**
             * External IP address used by the app generating the 3DS authentication request. Maps
             * to EMV 3DS field appIp.
             */
            fun ip(ip: String) = ip(JsonField.of(ip))

            /**
             * External IP address used by the app generating the 3DS authentication request. Maps
             * to EMV 3DS field appIp.
             */
            @JsonProperty("ip")
            @ExcludeMissing
            fun ip(ip: JsonField<String>) = apply { this.ip = ip }

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

            fun build(): App =
                App(
                    deviceInfo,
                    ip,
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is App && deviceInfo == other.deviceInfo && ip == other.ip && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(deviceInfo, ip, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "App{deviceInfo=$deviceInfo, ip=$ip, additionalProperties=$additionalProperties}"
    }

    class AuthenticationRequestType
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is AuthenticationRequestType && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()

        companion object {

            val ADD_CARD = AuthenticationRequestType(JsonField.of("ADD_CARD"))

            val BILLING_AGREEMENT = AuthenticationRequestType(JsonField.of("BILLING_AGREEMENT"))

            val DELAYED_SHIPMENT = AuthenticationRequestType(JsonField.of("DELAYED_SHIPMENT"))

            val EMV_TOKEN_CARDHOLDER_VERIFICATION =
                AuthenticationRequestType(JsonField.of("EMV_TOKEN_CARDHOLDER_VERIFICATION"))

            val INSTALLMENT_TRANSACTION =
                AuthenticationRequestType(JsonField.of("INSTALLMENT_TRANSACTION"))

            val MAINTAIN_CARD = AuthenticationRequestType(JsonField.of("MAINTAIN_CARD"))

            val PAYMENT_TRANSACTION = AuthenticationRequestType(JsonField.of("PAYMENT_TRANSACTION"))

            val RECURRING_TRANSACTION =
                AuthenticationRequestType(JsonField.of("RECURRING_TRANSACTION"))

            val SPLIT_PAYMENT = AuthenticationRequestType(JsonField.of("SPLIT_PAYMENT"))

            val SPLIT_SHIPMENT = AuthenticationRequestType(JsonField.of("SPLIT_SHIPMENT"))

            fun of(value: String) = AuthenticationRequestType(JsonField.of(value))
        }

        enum class Known {
            ADD_CARD,
            BILLING_AGREEMENT,
            DELAYED_SHIPMENT,
            EMV_TOKEN_CARDHOLDER_VERIFICATION,
            INSTALLMENT_TRANSACTION,
            MAINTAIN_CARD,
            PAYMENT_TRANSACTION,
            RECURRING_TRANSACTION,
            SPLIT_PAYMENT,
            SPLIT_SHIPMENT,
        }

        enum class Value {
            ADD_CARD,
            BILLING_AGREEMENT,
            DELAYED_SHIPMENT,
            EMV_TOKEN_CARDHOLDER_VERIFICATION,
            INSTALLMENT_TRANSACTION,
            MAINTAIN_CARD,
            PAYMENT_TRANSACTION,
            RECURRING_TRANSACTION,
            SPLIT_PAYMENT,
            SPLIT_SHIPMENT,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                ADD_CARD -> Value.ADD_CARD
                BILLING_AGREEMENT -> Value.BILLING_AGREEMENT
                DELAYED_SHIPMENT -> Value.DELAYED_SHIPMENT
                EMV_TOKEN_CARDHOLDER_VERIFICATION -> Value.EMV_TOKEN_CARDHOLDER_VERIFICATION
                INSTALLMENT_TRANSACTION -> Value.INSTALLMENT_TRANSACTION
                MAINTAIN_CARD -> Value.MAINTAIN_CARD
                PAYMENT_TRANSACTION -> Value.PAYMENT_TRANSACTION
                RECURRING_TRANSACTION -> Value.RECURRING_TRANSACTION
                SPLIT_PAYMENT -> Value.SPLIT_PAYMENT
                SPLIT_SHIPMENT -> Value.SPLIT_SHIPMENT
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                ADD_CARD -> Known.ADD_CARD
                BILLING_AGREEMENT -> Known.BILLING_AGREEMENT
                DELAYED_SHIPMENT -> Known.DELAYED_SHIPMENT
                EMV_TOKEN_CARDHOLDER_VERIFICATION -> Known.EMV_TOKEN_CARDHOLDER_VERIFICATION
                INSTALLMENT_TRANSACTION -> Known.INSTALLMENT_TRANSACTION
                MAINTAIN_CARD -> Known.MAINTAIN_CARD
                PAYMENT_TRANSACTION -> Known.PAYMENT_TRANSACTION
                RECURRING_TRANSACTION -> Known.RECURRING_TRANSACTION
                SPLIT_PAYMENT -> Known.SPLIT_PAYMENT
                SPLIT_SHIPMENT -> Known.SPLIT_SHIPMENT
                else ->
                    throw LithicInvalidDataException("Unknown AuthenticationRequestType: $value")
            }

        fun asString(): String = _value().asStringOrThrow()
    }

    /**
     * Object containing data about the browser used in the e-commerce transaction. Present if the
     * channel is 'BROWSER'.
     */
    @JsonDeserialize(builder = Browser.Builder::class)
    @NoAutoDetect
    class Browser
    private constructor(
        private val ip: JsonField<String>,
        private val javaEnabled: JsonField<Boolean>,
        private val javascriptEnabled: JsonField<Boolean>,
        private val language: JsonField<String>,
        private val timeZone: JsonField<String>,
        private val userAgent: JsonField<String>,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var validated: Boolean = false

        /**
         * IP address of the browser as returned by the HTTP headers to the 3DS requestor (e.g.,
         * merchant or digital wallet). Maps to EMV 3DS field browserIP.
         */
        fun ip(): String? = ip.getNullable("ip")

        /**
         * Indicates whether the cardholder's browser has the ability to execute Java. Maps to EMV
         * 3DS field browserJavaEnabled.
         */
        fun javaEnabled(): Boolean? = javaEnabled.getNullable("java_enabled")

        /**
         * Indicates whether the cardholder's browser has the ability to execute JavaScript. Maps to
         * EMV 3DS field browserJavascriptEnabled.
         */
        fun javascriptEnabled(): Boolean? = javascriptEnabled.getNullable("javascript_enabled")

        /**
         * Language of the cardholder's browser as defined in IETF BCP47. Maps to EMV 3DS field
         * browserLanguage.
         */
        fun language(): String? = language.getNullable("language")

        /**
         * Time zone of the cardholder's browser offset in minutes between UTC and the cardholder
         * browser's local time. The offset is positive if the local time is behind UTC and negative
         * if it is ahead. Maps to EMV 3DS field browserTz.
         */
        fun timeZone(): String? = timeZone.getNullable("time_zone")

        /** Content of the HTTP user-agent header. Maps to EMV 3DS field browserUserAgent. */
        fun userAgent(): String? = userAgent.getNullable("user_agent")

        /**
         * IP address of the browser as returned by the HTTP headers to the 3DS requestor (e.g.,
         * merchant or digital wallet). Maps to EMV 3DS field browserIP.
         */
        @JsonProperty("ip") @ExcludeMissing fun _ip() = ip

        /**
         * Indicates whether the cardholder's browser has the ability to execute Java. Maps to EMV
         * 3DS field browserJavaEnabled.
         */
        @JsonProperty("java_enabled") @ExcludeMissing fun _javaEnabled() = javaEnabled

        /**
         * Indicates whether the cardholder's browser has the ability to execute JavaScript. Maps to
         * EMV 3DS field browserJavascriptEnabled.
         */
        @JsonProperty("javascript_enabled")
        @ExcludeMissing
        fun _javascriptEnabled() = javascriptEnabled

        /**
         * Language of the cardholder's browser as defined in IETF BCP47. Maps to EMV 3DS field
         * browserLanguage.
         */
        @JsonProperty("language") @ExcludeMissing fun _language() = language

        /**
         * Time zone of the cardholder's browser offset in minutes between UTC and the cardholder
         * browser's local time. The offset is positive if the local time is behind UTC and negative
         * if it is ahead. Maps to EMV 3DS field browserTz.
         */
        @JsonProperty("time_zone") @ExcludeMissing fun _timeZone() = timeZone

        /** Content of the HTTP user-agent header. Maps to EMV 3DS field browserUserAgent. */
        @JsonProperty("user_agent") @ExcludeMissing fun _userAgent() = userAgent

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun validate(): Browser = apply {
            if (!validated) {
                ip()
                javaEnabled()
                javascriptEnabled()
                language()
                timeZone()
                userAgent()
                validated = true
            }
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var ip: JsonField<String> = JsonMissing.of()
            private var javaEnabled: JsonField<Boolean> = JsonMissing.of()
            private var javascriptEnabled: JsonField<Boolean> = JsonMissing.of()
            private var language: JsonField<String> = JsonMissing.of()
            private var timeZone: JsonField<String> = JsonMissing.of()
            private var userAgent: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(browser: Browser) = apply {
                this.ip = browser.ip
                this.javaEnabled = browser.javaEnabled
                this.javascriptEnabled = browser.javascriptEnabled
                this.language = browser.language
                this.timeZone = browser.timeZone
                this.userAgent = browser.userAgent
                additionalProperties(browser.additionalProperties)
            }

            /**
             * IP address of the browser as returned by the HTTP headers to the 3DS requestor (e.g.,
             * merchant or digital wallet). Maps to EMV 3DS field browserIP.
             */
            fun ip(ip: String) = ip(JsonField.of(ip))

            /**
             * IP address of the browser as returned by the HTTP headers to the 3DS requestor (e.g.,
             * merchant or digital wallet). Maps to EMV 3DS field browserIP.
             */
            @JsonProperty("ip")
            @ExcludeMissing
            fun ip(ip: JsonField<String>) = apply { this.ip = ip }

            /**
             * Indicates whether the cardholder's browser has the ability to execute Java. Maps to
             * EMV 3DS field browserJavaEnabled.
             */
            fun javaEnabled(javaEnabled: Boolean) = javaEnabled(JsonField.of(javaEnabled))

            /**
             * Indicates whether the cardholder's browser has the ability to execute Java. Maps to
             * EMV 3DS field browserJavaEnabled.
             */
            @JsonProperty("java_enabled")
            @ExcludeMissing
            fun javaEnabled(javaEnabled: JsonField<Boolean>) = apply {
                this.javaEnabled = javaEnabled
            }

            /**
             * Indicates whether the cardholder's browser has the ability to execute JavaScript.
             * Maps to EMV 3DS field browserJavascriptEnabled.
             */
            fun javascriptEnabled(javascriptEnabled: Boolean) =
                javascriptEnabled(JsonField.of(javascriptEnabled))

            /**
             * Indicates whether the cardholder's browser has the ability to execute JavaScript.
             * Maps to EMV 3DS field browserJavascriptEnabled.
             */
            @JsonProperty("javascript_enabled")
            @ExcludeMissing
            fun javascriptEnabled(javascriptEnabled: JsonField<Boolean>) = apply {
                this.javascriptEnabled = javascriptEnabled
            }

            /**
             * Language of the cardholder's browser as defined in IETF BCP47. Maps to EMV 3DS field
             * browserLanguage.
             */
            fun language(language: String) = language(JsonField.of(language))

            /**
             * Language of the cardholder's browser as defined in IETF BCP47. Maps to EMV 3DS field
             * browserLanguage.
             */
            @JsonProperty("language")
            @ExcludeMissing
            fun language(language: JsonField<String>) = apply { this.language = language }

            /**
             * Time zone of the cardholder's browser offset in minutes between UTC and the
             * cardholder browser's local time. The offset is positive if the local time is behind
             * UTC and negative if it is ahead. Maps to EMV 3DS field browserTz.
             */
            fun timeZone(timeZone: String) = timeZone(JsonField.of(timeZone))

            /**
             * Time zone of the cardholder's browser offset in minutes between UTC and the
             * cardholder browser's local time. The offset is positive if the local time is behind
             * UTC and negative if it is ahead. Maps to EMV 3DS field browserTz.
             */
            @JsonProperty("time_zone")
            @ExcludeMissing
            fun timeZone(timeZone: JsonField<String>) = apply { this.timeZone = timeZone }

            /** Content of the HTTP user-agent header. Maps to EMV 3DS field browserUserAgent. */
            fun userAgent(userAgent: String) = userAgent(JsonField.of(userAgent))

            /** Content of the HTTP user-agent header. Maps to EMV 3DS field browserUserAgent. */
            @JsonProperty("user_agent")
            @ExcludeMissing
            fun userAgent(userAgent: JsonField<String>) = apply { this.userAgent = userAgent }

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

            fun build(): Browser =
                Browser(
                    ip,
                    javaEnabled,
                    javascriptEnabled,
                    language,
                    timeZone,
                    userAgent,
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Browser && ip == other.ip && javaEnabled == other.javaEnabled && javascriptEnabled == other.javascriptEnabled && language == other.language && timeZone == other.timeZone && userAgent == other.userAgent && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(ip, javaEnabled, javascriptEnabled, language, timeZone, userAgent, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Browser{ip=$ip, javaEnabled=$javaEnabled, javascriptEnabled=$javascriptEnabled, language=$language, timeZone=$timeZone, userAgent=$userAgent, additionalProperties=$additionalProperties}"
    }

    class ThreeRiRequestType
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is ThreeRiRequestType && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()

        companion object {

            val ACCOUNT_VERIFICATION = ThreeRiRequestType(JsonField.of("ACCOUNT_VERIFICATION"))

            val ADD_CARD = ThreeRiRequestType(JsonField.of("ADD_CARD"))

            val BILLING_AGREEMENT = ThreeRiRequestType(JsonField.of("BILLING_AGREEMENT"))

            val CARD_SECURITY_CODE_STATUS_CHECK =
                ThreeRiRequestType(JsonField.of("CARD_SECURITY_CODE_STATUS_CHECK"))

            val DELAYED_SHIPMENT = ThreeRiRequestType(JsonField.of("DELAYED_SHIPMENT"))

            val DEVICE_BINDING_STATUS_CHECK =
                ThreeRiRequestType(JsonField.of("DEVICE_BINDING_STATUS_CHECK"))

            val INSTALLMENT_TRANSACTION =
                ThreeRiRequestType(JsonField.of("INSTALLMENT_TRANSACTION"))

            val MAIL_ORDER = ThreeRiRequestType(JsonField.of("MAIL_ORDER"))

            val MAINTAIN_CARD_INFO = ThreeRiRequestType(JsonField.of("MAINTAIN_CARD_INFO"))

            val OTHER_PAYMENT = ThreeRiRequestType(JsonField.of("OTHER_PAYMENT"))

            val RECURRING_TRANSACTION = ThreeRiRequestType(JsonField.of("RECURRING_TRANSACTION"))

            val SPLIT_PAYMENT = ThreeRiRequestType(JsonField.of("SPLIT_PAYMENT"))

            val SPLIT_SHIPMENT = ThreeRiRequestType(JsonField.of("SPLIT_SHIPMENT"))

            val TELEPHONE_ORDER = ThreeRiRequestType(JsonField.of("TELEPHONE_ORDER"))

            val TOP_UP = ThreeRiRequestType(JsonField.of("TOP_UP"))

            val TRUST_LIST_STATUS_CHECK =
                ThreeRiRequestType(JsonField.of("TRUST_LIST_STATUS_CHECK"))

            fun of(value: String) = ThreeRiRequestType(JsonField.of(value))
        }

        enum class Known {
            ACCOUNT_VERIFICATION,
            ADD_CARD,
            BILLING_AGREEMENT,
            CARD_SECURITY_CODE_STATUS_CHECK,
            DELAYED_SHIPMENT,
            DEVICE_BINDING_STATUS_CHECK,
            INSTALLMENT_TRANSACTION,
            MAIL_ORDER,
            MAINTAIN_CARD_INFO,
            OTHER_PAYMENT,
            RECURRING_TRANSACTION,
            SPLIT_PAYMENT,
            SPLIT_SHIPMENT,
            TELEPHONE_ORDER,
            TOP_UP,
            TRUST_LIST_STATUS_CHECK,
        }

        enum class Value {
            ACCOUNT_VERIFICATION,
            ADD_CARD,
            BILLING_AGREEMENT,
            CARD_SECURITY_CODE_STATUS_CHECK,
            DELAYED_SHIPMENT,
            DEVICE_BINDING_STATUS_CHECK,
            INSTALLMENT_TRANSACTION,
            MAIL_ORDER,
            MAINTAIN_CARD_INFO,
            OTHER_PAYMENT,
            RECURRING_TRANSACTION,
            SPLIT_PAYMENT,
            SPLIT_SHIPMENT,
            TELEPHONE_ORDER,
            TOP_UP,
            TRUST_LIST_STATUS_CHECK,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                ACCOUNT_VERIFICATION -> Value.ACCOUNT_VERIFICATION
                ADD_CARD -> Value.ADD_CARD
                BILLING_AGREEMENT -> Value.BILLING_AGREEMENT
                CARD_SECURITY_CODE_STATUS_CHECK -> Value.CARD_SECURITY_CODE_STATUS_CHECK
                DELAYED_SHIPMENT -> Value.DELAYED_SHIPMENT
                DEVICE_BINDING_STATUS_CHECK -> Value.DEVICE_BINDING_STATUS_CHECK
                INSTALLMENT_TRANSACTION -> Value.INSTALLMENT_TRANSACTION
                MAIL_ORDER -> Value.MAIL_ORDER
                MAINTAIN_CARD_INFO -> Value.MAINTAIN_CARD_INFO
                OTHER_PAYMENT -> Value.OTHER_PAYMENT
                RECURRING_TRANSACTION -> Value.RECURRING_TRANSACTION
                SPLIT_PAYMENT -> Value.SPLIT_PAYMENT
                SPLIT_SHIPMENT -> Value.SPLIT_SHIPMENT
                TELEPHONE_ORDER -> Value.TELEPHONE_ORDER
                TOP_UP -> Value.TOP_UP
                TRUST_LIST_STATUS_CHECK -> Value.TRUST_LIST_STATUS_CHECK
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                ACCOUNT_VERIFICATION -> Known.ACCOUNT_VERIFICATION
                ADD_CARD -> Known.ADD_CARD
                BILLING_AGREEMENT -> Known.BILLING_AGREEMENT
                CARD_SECURITY_CODE_STATUS_CHECK -> Known.CARD_SECURITY_CODE_STATUS_CHECK
                DELAYED_SHIPMENT -> Known.DELAYED_SHIPMENT
                DEVICE_BINDING_STATUS_CHECK -> Known.DEVICE_BINDING_STATUS_CHECK
                INSTALLMENT_TRANSACTION -> Known.INSTALLMENT_TRANSACTION
                MAIL_ORDER -> Known.MAIL_ORDER
                MAINTAIN_CARD_INFO -> Known.MAINTAIN_CARD_INFO
                OTHER_PAYMENT -> Known.OTHER_PAYMENT
                RECURRING_TRANSACTION -> Known.RECURRING_TRANSACTION
                SPLIT_PAYMENT -> Known.SPLIT_PAYMENT
                SPLIT_SHIPMENT -> Known.SPLIT_SHIPMENT
                TELEPHONE_ORDER -> Known.TELEPHONE_ORDER
                TOP_UP -> Known.TOP_UP
                TRUST_LIST_STATUS_CHECK -> Known.TRUST_LIST_STATUS_CHECK
                else -> throw LithicInvalidDataException("Unknown ThreeRiRequestType: $value")
            }

        fun asString(): String = _value().asStringOrThrow()
    }

    /**
     * Object containing data about the e-commerce transaction for which the merchant is requesting
     * authentication.
     */
    @JsonDeserialize(builder = Transaction.Builder::class)
    @NoAutoDetect
    class Transaction
    private constructor(
        private val amount: JsonField<Double>,
        private val currency: JsonField<String>,
        private val currencyExponent: JsonField<Double>,
        private val dateTime: JsonField<OffsetDateTime>,
        private val type: JsonField<Type>,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var validated: Boolean = false

        /**
         * Amount of the purchase in minor units of currency with all punctuation removed. Maps to
         * EMV 3DS field purchaseAmount.
         */
        fun amount(): Double = amount.getRequired("amount")

        /** Currency of the purchase. Maps to EMV 3DS field purchaseCurrency. */
        fun currency(): String = currency.getRequired("currency")

        /**
         * Minor units of currency, as specified in ISO 4217 currency exponent. Maps to EMV 3DS
         * field purchaseExponent.
         */
        fun currencyExponent(): Double = currencyExponent.getRequired("currency_exponent")

        /**
         * Date and time when the authentication was generated by the merchant/acquirer's 3DS
         * server. Maps to EMV 3DS field purchaseDate.
         */
        fun dateTime(): OffsetDateTime = dateTime.getRequired("date_time")

        /**
         * Type of the transaction for which a 3DS authentication request is occurring. Maps to EMV
         * 3DS field transType.
         */
        fun type(): Type? = type.getNullable("type")

        /**
         * Amount of the purchase in minor units of currency with all punctuation removed. Maps to
         * EMV 3DS field purchaseAmount.
         */
        @JsonProperty("amount") @ExcludeMissing fun _amount() = amount

        /** Currency of the purchase. Maps to EMV 3DS field purchaseCurrency. */
        @JsonProperty("currency") @ExcludeMissing fun _currency() = currency

        /**
         * Minor units of currency, as specified in ISO 4217 currency exponent. Maps to EMV 3DS
         * field purchaseExponent.
         */
        @JsonProperty("currency_exponent")
        @ExcludeMissing
        fun _currencyExponent() = currencyExponent

        /**
         * Date and time when the authentication was generated by the merchant/acquirer's 3DS
         * server. Maps to EMV 3DS field purchaseDate.
         */
        @JsonProperty("date_time") @ExcludeMissing fun _dateTime() = dateTime

        /**
         * Type of the transaction for which a 3DS authentication request is occurring. Maps to EMV
         * 3DS field transType.
         */
        @JsonProperty("type") @ExcludeMissing fun _type() = type

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun validate(): Transaction = apply {
            if (!validated) {
                amount()
                currency()
                currencyExponent()
                dateTime()
                type()
                validated = true
            }
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var amount: JsonField<Double> = JsonMissing.of()
            private var currency: JsonField<String> = JsonMissing.of()
            private var currencyExponent: JsonField<Double> = JsonMissing.of()
            private var dateTime: JsonField<OffsetDateTime> = JsonMissing.of()
            private var type: JsonField<Type> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(transaction: Transaction) = apply {
                this.amount = transaction.amount
                this.currency = transaction.currency
                this.currencyExponent = transaction.currencyExponent
                this.dateTime = transaction.dateTime
                this.type = transaction.type
                additionalProperties(transaction.additionalProperties)
            }

            /**
             * Amount of the purchase in minor units of currency with all punctuation removed. Maps
             * to EMV 3DS field purchaseAmount.
             */
            fun amount(amount: Double) = amount(JsonField.of(amount))

            /**
             * Amount of the purchase in minor units of currency with all punctuation removed. Maps
             * to EMV 3DS field purchaseAmount.
             */
            @JsonProperty("amount")
            @ExcludeMissing
            fun amount(amount: JsonField<Double>) = apply { this.amount = amount }

            /** Currency of the purchase. Maps to EMV 3DS field purchaseCurrency. */
            fun currency(currency: String) = currency(JsonField.of(currency))

            /** Currency of the purchase. Maps to EMV 3DS field purchaseCurrency. */
            @JsonProperty("currency")
            @ExcludeMissing
            fun currency(currency: JsonField<String>) = apply { this.currency = currency }

            /**
             * Minor units of currency, as specified in ISO 4217 currency exponent. Maps to EMV 3DS
             * field purchaseExponent.
             */
            fun currencyExponent(currencyExponent: Double) =
                currencyExponent(JsonField.of(currencyExponent))

            /**
             * Minor units of currency, as specified in ISO 4217 currency exponent. Maps to EMV 3DS
             * field purchaseExponent.
             */
            @JsonProperty("currency_exponent")
            @ExcludeMissing
            fun currencyExponent(currencyExponent: JsonField<Double>) = apply {
                this.currencyExponent = currencyExponent
            }

            /**
             * Date and time when the authentication was generated by the merchant/acquirer's 3DS
             * server. Maps to EMV 3DS field purchaseDate.
             */
            fun dateTime(dateTime: OffsetDateTime) = dateTime(JsonField.of(dateTime))

            /**
             * Date and time when the authentication was generated by the merchant/acquirer's 3DS
             * server. Maps to EMV 3DS field purchaseDate.
             */
            @JsonProperty("date_time")
            @ExcludeMissing
            fun dateTime(dateTime: JsonField<OffsetDateTime>) = apply { this.dateTime = dateTime }

            /**
             * Type of the transaction for which a 3DS authentication request is occurring. Maps to
             * EMV 3DS field transType.
             */
            fun type(type: Type) = type(JsonField.of(type))

            /**
             * Type of the transaction for which a 3DS authentication request is occurring. Maps to
             * EMV 3DS field transType.
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

            fun build(): Transaction =
                Transaction(
                    amount,
                    currency,
                    currencyExponent,
                    dateTime,
                    type,
                    additionalProperties.toImmutable(),
                )
        }

        class Type
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) : Enum {

            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is Type && value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()

            companion object {

                val ACCOUNT_FUNDING = Type(JsonField.of("ACCOUNT_FUNDING"))

                val CHECK_ACCEPTANCE = Type(JsonField.of("CHECK_ACCEPTANCE"))

                val GOODS_SERVICE_PURCHASE = Type(JsonField.of("GOODS_SERVICE_PURCHASE"))

                val PREPAID_ACTIVATION_AND_LOAD = Type(JsonField.of("PREPAID_ACTIVATION_AND_LOAD"))

                val QUASI_CASH_TRANSACTION = Type(JsonField.of("QUASI_CASH_TRANSACTION"))

                fun of(value: String) = Type(JsonField.of(value))
            }

            enum class Known {
                ACCOUNT_FUNDING,
                CHECK_ACCEPTANCE,
                GOODS_SERVICE_PURCHASE,
                PREPAID_ACTIVATION_AND_LOAD,
                QUASI_CASH_TRANSACTION,
            }

            enum class Value {
                ACCOUNT_FUNDING,
                CHECK_ACCEPTANCE,
                GOODS_SERVICE_PURCHASE,
                PREPAID_ACTIVATION_AND_LOAD,
                QUASI_CASH_TRANSACTION,
                _UNKNOWN,
            }

            fun value(): Value =
                when (this) {
                    ACCOUNT_FUNDING -> Value.ACCOUNT_FUNDING
                    CHECK_ACCEPTANCE -> Value.CHECK_ACCEPTANCE
                    GOODS_SERVICE_PURCHASE -> Value.GOODS_SERVICE_PURCHASE
                    PREPAID_ACTIVATION_AND_LOAD -> Value.PREPAID_ACTIVATION_AND_LOAD
                    QUASI_CASH_TRANSACTION -> Value.QUASI_CASH_TRANSACTION
                    else -> Value._UNKNOWN
                }

            fun known(): Known =
                when (this) {
                    ACCOUNT_FUNDING -> Known.ACCOUNT_FUNDING
                    CHECK_ACCEPTANCE -> Known.CHECK_ACCEPTANCE
                    GOODS_SERVICE_PURCHASE -> Known.GOODS_SERVICE_PURCHASE
                    PREPAID_ACTIVATION_AND_LOAD -> Known.PREPAID_ACTIVATION_AND_LOAD
                    QUASI_CASH_TRANSACTION -> Known.QUASI_CASH_TRANSACTION
                    else -> throw LithicInvalidDataException("Unknown Type: $value")
                }

            fun asString(): String = _value().asStringOrThrow()
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Transaction && amount == other.amount && currency == other.currency && currencyExponent == other.currencyExponent && dateTime == other.dateTime && type == other.type && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(amount, currency, currencyExponent, dateTime, type, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Transaction{amount=$amount, currency=$currency, currencyExponent=$currencyExponent, dateTime=$dateTime, type=$type, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is AuthenticationRetrieveResponse && accountType == other.accountType && additionalData == other.additionalData && app == other.app && authenticationRequestType == other.authenticationRequestType && authenticationResult == other.authenticationResult && browser == other.browser && cardExpiryCheck == other.cardExpiryCheck && cardToken == other.cardToken && cardholder == other.cardholder && channel == other.channel && created == other.created && decisionMadeBy == other.decisionMadeBy && merchant == other.merchant && messageCategory == other.messageCategory && threeRiRequestType == other.threeRiRequestType && token == other.token && transaction == other.transaction && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(accountType, additionalData, app, authenticationRequestType, authenticationResult, browser, cardExpiryCheck, cardToken, cardholder, channel, created, decisionMadeBy, merchant, messageCategory, threeRiRequestType, token, transaction, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "AuthenticationRetrieveResponse{accountType=$accountType, additionalData=$additionalData, app=$app, authenticationRequestType=$authenticationRequestType, authenticationResult=$authenticationResult, browser=$browser, cardExpiryCheck=$cardExpiryCheck, cardToken=$cardToken, cardholder=$cardholder, channel=$channel, created=$created, decisionMadeBy=$decisionMadeBy, merchant=$merchant, messageCategory=$messageCategory, threeRiRequestType=$threeRiRequestType, token=$token, transaction=$transaction, additionalProperties=$additionalProperties}"
}
