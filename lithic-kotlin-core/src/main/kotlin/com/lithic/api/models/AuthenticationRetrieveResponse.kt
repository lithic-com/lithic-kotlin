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
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects

class AuthenticationRetrieveResponse
private constructor(
    private val token: JsonField<String>,
    private val accountType: JsonField<AccountType>,
    private val authenticationResult: JsonField<AuthenticationResult>,
    private val cardExpiryCheck: JsonField<CardExpiryCheck>,
    private val cardToken: JsonField<String>,
    private val cardholder: JsonField<Cardholder>,
    private val channel: JsonField<Channel>,
    private val created: JsonField<OffsetDateTime>,
    private val merchant: JsonField<Merchant>,
    private val messageCategory: JsonField<MessageCategory>,
    private val threeDSRequestorChallengeIndicator: JsonField<ThreeDSRequestorChallengeIndicator>,
    private val additionalData: JsonField<AdditionalData>,
    private val app: JsonField<App>,
    private val authenticationRequestType: JsonField<AuthenticationRequestType>,
    private val browser: JsonField<Browser>,
    private val challengeMetadata: JsonField<ChallengeMetadata>,
    private val challengeOrchestratedBy: JsonField<ChallengeOrchestratedBy>,
    private val decisionMadeBy: JsonField<DecisionMadeBy>,
    private val threeRiRequestType: JsonField<ThreeRiRequestType>,
    private val transaction: JsonField<Transaction>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("token") @ExcludeMissing token: JsonField<String> = JsonMissing.of(),
        @JsonProperty("account_type")
        @ExcludeMissing
        accountType: JsonField<AccountType> = JsonMissing.of(),
        @JsonProperty("authentication_result")
        @ExcludeMissing
        authenticationResult: JsonField<AuthenticationResult> = JsonMissing.of(),
        @JsonProperty("card_expiry_check")
        @ExcludeMissing
        cardExpiryCheck: JsonField<CardExpiryCheck> = JsonMissing.of(),
        @JsonProperty("card_token") @ExcludeMissing cardToken: JsonField<String> = JsonMissing.of(),
        @JsonProperty("cardholder")
        @ExcludeMissing
        cardholder: JsonField<Cardholder> = JsonMissing.of(),
        @JsonProperty("channel") @ExcludeMissing channel: JsonField<Channel> = JsonMissing.of(),
        @JsonProperty("created")
        @ExcludeMissing
        created: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("merchant") @ExcludeMissing merchant: JsonField<Merchant> = JsonMissing.of(),
        @JsonProperty("message_category")
        @ExcludeMissing
        messageCategory: JsonField<MessageCategory> = JsonMissing.of(),
        @JsonProperty("three_ds_requestor_challenge_indicator")
        @ExcludeMissing
        threeDSRequestorChallengeIndicator: JsonField<ThreeDSRequestorChallengeIndicator> =
            JsonMissing.of(),
        @JsonProperty("additional_data")
        @ExcludeMissing
        additionalData: JsonField<AdditionalData> = JsonMissing.of(),
        @JsonProperty("app") @ExcludeMissing app: JsonField<App> = JsonMissing.of(),
        @JsonProperty("authentication_request_type")
        @ExcludeMissing
        authenticationRequestType: JsonField<AuthenticationRequestType> = JsonMissing.of(),
        @JsonProperty("browser") @ExcludeMissing browser: JsonField<Browser> = JsonMissing.of(),
        @JsonProperty("challenge_metadata")
        @ExcludeMissing
        challengeMetadata: JsonField<ChallengeMetadata> = JsonMissing.of(),
        @JsonProperty("challenge_orchestrated_by")
        @ExcludeMissing
        challengeOrchestratedBy: JsonField<ChallengeOrchestratedBy> = JsonMissing.of(),
        @JsonProperty("decision_made_by")
        @ExcludeMissing
        decisionMadeBy: JsonField<DecisionMadeBy> = JsonMissing.of(),
        @JsonProperty("three_ri_request_type")
        @ExcludeMissing
        threeRiRequestType: JsonField<ThreeRiRequestType> = JsonMissing.of(),
        @JsonProperty("transaction")
        @ExcludeMissing
        transaction: JsonField<Transaction> = JsonMissing.of(),
    ) : this(
        token,
        accountType,
        authenticationResult,
        cardExpiryCheck,
        cardToken,
        cardholder,
        channel,
        created,
        merchant,
        messageCategory,
        threeDSRequestorChallengeIndicator,
        additionalData,
        app,
        authenticationRequestType,
        browser,
        challengeMetadata,
        challengeOrchestratedBy,
        decisionMadeBy,
        threeRiRequestType,
        transaction,
        mutableMapOf(),
    )

    /**
     * Globally unique identifier for the 3DS authentication.
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun token(): String = token.getRequired("token")

    /**
     * Type of account/card that is being used for the transaction. Maps to EMV 3DS field
     * `acctType`.
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun accountType(): AccountType? = accountType.getNullable("account_type")

    /**
     * Indicates the outcome of the 3DS authentication process.
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun authenticationResult(): AuthenticationResult =
        authenticationResult.getRequired("authentication_result")

    /**
     * Indicates whether the expiration date provided by the cardholder during checkout matches
     * Lithic's record of the card's expiration date.
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun cardExpiryCheck(): CardExpiryCheck = cardExpiryCheck.getRequired("card_expiry_check")

    /**
     * Globally unique identifier for the card on which the 3DS authentication has occurred.
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun cardToken(): String = cardToken.getRequired("card_token")

    /**
     * Object containing data about the cardholder provided during the transaction.
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun cardholder(): Cardholder = cardholder.getRequired("cardholder")

    /**
     * Channel in which the authentication occurs. Maps to EMV 3DS field deviceChannel.
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun channel(): Channel = channel.getRequired("channel")

    /**
     * Date and time when the authentication was created in Lithic's system.
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun created(): OffsetDateTime = created.getRequired("created")

    /**
     * Object containing data about the merchant involved in the e-commerce transaction.
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun merchant(): Merchant = merchant.getRequired("merchant")

    /**
     * Either PAYMENT_AUTHENTICATION or NON_PAYMENT_AUTHENTICATION. For NON_PAYMENT_AUTHENTICATION,
     * additional_data and transaction fields are not populated.
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun messageCategory(): MessageCategory = messageCategory.getRequired("message_category")

    /**
     * Indicates whether a challenge is requested for this transaction
     * - `NO_PREFERENCE` - No Preference
     * - `NO_CHALLENGE_REQUESTED` - No Challenge Requested
     * - `CHALLENGE_PREFERENCE` - Challenge requested (3DS Requestor preference)
     * - `CHALLENGE_MANDATE` - Challenge requested (Mandate)
     * - `NO_CHALLENGE_RISK_ALREADY_ASSESSED` - No Challenge requested (Transactional risk analysis
     *   is already performed)
     * - `DATA_SHARE_ONLY` - No Challenge requested (Data Share Only)
     * - `OTHER` - Other indicators not captured by above. These are rarely used
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun threeDSRequestorChallengeIndicator(): ThreeDSRequestorChallengeIndicator =
        threeDSRequestorChallengeIndicator.getRequired("three_ds_requestor_challenge_indicator")

    /**
     * Object containing additional data about the 3DS request that is beyond the EMV 3DS standard
     * spec (e.g., specific fields that only certain card networks send but are not required across
     * all 3DS requests).
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun additionalData(): AdditionalData? = additionalData.getNullable("additional_data")

    /**
     * Object containing data about the app used in the e-commerce transaction. Present if the
     * channel is 'APP_BASED'.
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun app(): App? = app.getNullable("app")

    /**
     * Type of authentication request - i.e., the type of transaction or interaction is causing the
     * merchant to request an authentication. Maps to EMV 3DS field
     * threeDSRequestorAuthenticationInd.
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun authenticationRequestType(): AuthenticationRequestType? =
        authenticationRequestType.getNullable("authentication_request_type")

    /**
     * Object containing data about the browser used in the e-commerce transaction. Present if the
     * channel is 'BROWSER'.
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun browser(): Browser? = browser.getNullable("browser")

    /**
     * Metadata about the challenge method and delivery.
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun challengeMetadata(): ChallengeMetadata? =
        challengeMetadata.getNullable("challenge_metadata")

    /**
     * Entity that orchestrates the challenge.
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun challengeOrchestratedBy(): ChallengeOrchestratedBy? =
        challengeOrchestratedBy.getNullable("challenge_orchestrated_by")

    /**
     * Entity that made the authentication decision.
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun decisionMadeBy(): DecisionMadeBy? = decisionMadeBy.getNullable("decision_made_by")

    /**
     * Type of 3DS Requestor Initiated (3RI) request i.e., a 3DS authentication that takes place at
     * the initiation of the merchant rather than the cardholder. The most common example of this is
     * where a merchant is authenticating before billing for a recurring transaction such as a pay
     * TV subscription or a utility bill. Maps to EMV 3DS field threeRIInd.
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun threeRiRequestType(): ThreeRiRequestType? =
        threeRiRequestType.getNullable("three_ri_request_type")

    /**
     * Object containing data about the e-commerce transaction for which the merchant is requesting
     * authentication.
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun transaction(): Transaction? = transaction.getNullable("transaction")

    /**
     * Returns the raw JSON value of [token].
     *
     * Unlike [token], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("token") @ExcludeMissing fun _token(): JsonField<String> = token

    /**
     * Returns the raw JSON value of [accountType].
     *
     * Unlike [accountType], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("account_type")
    @ExcludeMissing
    fun _accountType(): JsonField<AccountType> = accountType

    /**
     * Returns the raw JSON value of [authenticationResult].
     *
     * Unlike [authenticationResult], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("authentication_result")
    @ExcludeMissing
    fun _authenticationResult(): JsonField<AuthenticationResult> = authenticationResult

    /**
     * Returns the raw JSON value of [cardExpiryCheck].
     *
     * Unlike [cardExpiryCheck], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("card_expiry_check")
    @ExcludeMissing
    fun _cardExpiryCheck(): JsonField<CardExpiryCheck> = cardExpiryCheck

    /**
     * Returns the raw JSON value of [cardToken].
     *
     * Unlike [cardToken], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("card_token") @ExcludeMissing fun _cardToken(): JsonField<String> = cardToken

    /**
     * Returns the raw JSON value of [cardholder].
     *
     * Unlike [cardholder], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("cardholder")
    @ExcludeMissing
    fun _cardholder(): JsonField<Cardholder> = cardholder

    /**
     * Returns the raw JSON value of [channel].
     *
     * Unlike [channel], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("channel") @ExcludeMissing fun _channel(): JsonField<Channel> = channel

    /**
     * Returns the raw JSON value of [created].
     *
     * Unlike [created], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("created") @ExcludeMissing fun _created(): JsonField<OffsetDateTime> = created

    /**
     * Returns the raw JSON value of [merchant].
     *
     * Unlike [merchant], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("merchant") @ExcludeMissing fun _merchant(): JsonField<Merchant> = merchant

    /**
     * Returns the raw JSON value of [messageCategory].
     *
     * Unlike [messageCategory], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("message_category")
    @ExcludeMissing
    fun _messageCategory(): JsonField<MessageCategory> = messageCategory

    /**
     * Returns the raw JSON value of [threeDSRequestorChallengeIndicator].
     *
     * Unlike [threeDSRequestorChallengeIndicator], this method doesn't throw if the JSON field has
     * an unexpected type.
     */
    @JsonProperty("three_ds_requestor_challenge_indicator")
    @ExcludeMissing
    fun _threeDSRequestorChallengeIndicator(): JsonField<ThreeDSRequestorChallengeIndicator> =
        threeDSRequestorChallengeIndicator

    /**
     * Returns the raw JSON value of [additionalData].
     *
     * Unlike [additionalData], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("additional_data")
    @ExcludeMissing
    fun _additionalData(): JsonField<AdditionalData> = additionalData

    /**
     * Returns the raw JSON value of [app].
     *
     * Unlike [app], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("app") @ExcludeMissing fun _app(): JsonField<App> = app

    /**
     * Returns the raw JSON value of [authenticationRequestType].
     *
     * Unlike [authenticationRequestType], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("authentication_request_type")
    @ExcludeMissing
    fun _authenticationRequestType(): JsonField<AuthenticationRequestType> =
        authenticationRequestType

    /**
     * Returns the raw JSON value of [browser].
     *
     * Unlike [browser], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("browser") @ExcludeMissing fun _browser(): JsonField<Browser> = browser

    /**
     * Returns the raw JSON value of [challengeMetadata].
     *
     * Unlike [challengeMetadata], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("challenge_metadata")
    @ExcludeMissing
    fun _challengeMetadata(): JsonField<ChallengeMetadata> = challengeMetadata

    /**
     * Returns the raw JSON value of [challengeOrchestratedBy].
     *
     * Unlike [challengeOrchestratedBy], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("challenge_orchestrated_by")
    @ExcludeMissing
    fun _challengeOrchestratedBy(): JsonField<ChallengeOrchestratedBy> = challengeOrchestratedBy

    /**
     * Returns the raw JSON value of [decisionMadeBy].
     *
     * Unlike [decisionMadeBy], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("decision_made_by")
    @ExcludeMissing
    fun _decisionMadeBy(): JsonField<DecisionMadeBy> = decisionMadeBy

    /**
     * Returns the raw JSON value of [threeRiRequestType].
     *
     * Unlike [threeRiRequestType], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("three_ri_request_type")
    @ExcludeMissing
    fun _threeRiRequestType(): JsonField<ThreeRiRequestType> = threeRiRequestType

    /**
     * Returns the raw JSON value of [transaction].
     *
     * Unlike [transaction], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("transaction")
    @ExcludeMissing
    fun _transaction(): JsonField<Transaction> = transaction

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
         * [AuthenticationRetrieveResponse].
         *
         * The following fields are required:
         * ```kotlin
         * .token()
         * .accountType()
         * .authenticationResult()
         * .cardExpiryCheck()
         * .cardToken()
         * .cardholder()
         * .channel()
         * .created()
         * .merchant()
         * .messageCategory()
         * .threeDSRequestorChallengeIndicator()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [AuthenticationRetrieveResponse]. */
    class Builder internal constructor() {

        private var token: JsonField<String>? = null
        private var accountType: JsonField<AccountType>? = null
        private var authenticationResult: JsonField<AuthenticationResult>? = null
        private var cardExpiryCheck: JsonField<CardExpiryCheck>? = null
        private var cardToken: JsonField<String>? = null
        private var cardholder: JsonField<Cardholder>? = null
        private var channel: JsonField<Channel>? = null
        private var created: JsonField<OffsetDateTime>? = null
        private var merchant: JsonField<Merchant>? = null
        private var messageCategory: JsonField<MessageCategory>? = null
        private var threeDSRequestorChallengeIndicator:
            JsonField<ThreeDSRequestorChallengeIndicator>? =
            null
        private var additionalData: JsonField<AdditionalData> = JsonMissing.of()
        private var app: JsonField<App> = JsonMissing.of()
        private var authenticationRequestType: JsonField<AuthenticationRequestType> =
            JsonMissing.of()
        private var browser: JsonField<Browser> = JsonMissing.of()
        private var challengeMetadata: JsonField<ChallengeMetadata> = JsonMissing.of()
        private var challengeOrchestratedBy: JsonField<ChallengeOrchestratedBy> = JsonMissing.of()
        private var decisionMadeBy: JsonField<DecisionMadeBy> = JsonMissing.of()
        private var threeRiRequestType: JsonField<ThreeRiRequestType> = JsonMissing.of()
        private var transaction: JsonField<Transaction> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(authenticationRetrieveResponse: AuthenticationRetrieveResponse) = apply {
            token = authenticationRetrieveResponse.token
            accountType = authenticationRetrieveResponse.accountType
            authenticationResult = authenticationRetrieveResponse.authenticationResult
            cardExpiryCheck = authenticationRetrieveResponse.cardExpiryCheck
            cardToken = authenticationRetrieveResponse.cardToken
            cardholder = authenticationRetrieveResponse.cardholder
            channel = authenticationRetrieveResponse.channel
            created = authenticationRetrieveResponse.created
            merchant = authenticationRetrieveResponse.merchant
            messageCategory = authenticationRetrieveResponse.messageCategory
            threeDSRequestorChallengeIndicator =
                authenticationRetrieveResponse.threeDSRequestorChallengeIndicator
            additionalData = authenticationRetrieveResponse.additionalData
            app = authenticationRetrieveResponse.app
            authenticationRequestType = authenticationRetrieveResponse.authenticationRequestType
            browser = authenticationRetrieveResponse.browser
            challengeMetadata = authenticationRetrieveResponse.challengeMetadata
            challengeOrchestratedBy = authenticationRetrieveResponse.challengeOrchestratedBy
            decisionMadeBy = authenticationRetrieveResponse.decisionMadeBy
            threeRiRequestType = authenticationRetrieveResponse.threeRiRequestType
            transaction = authenticationRetrieveResponse.transaction
            additionalProperties =
                authenticationRetrieveResponse.additionalProperties.toMutableMap()
        }

        /** Globally unique identifier for the 3DS authentication. */
        fun token(token: String) = token(JsonField.of(token))

        /**
         * Sets [Builder.token] to an arbitrary JSON value.
         *
         * You should usually call [Builder.token] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun token(token: JsonField<String>) = apply { this.token = token }

        /**
         * Type of account/card that is being used for the transaction. Maps to EMV 3DS field
         * `acctType`.
         */
        fun accountType(accountType: AccountType?) = accountType(JsonField.ofNullable(accountType))

        /**
         * Sets [Builder.accountType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.accountType] with a well-typed [AccountType] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun accountType(accountType: JsonField<AccountType>) = apply {
            this.accountType = accountType
        }

        /** Indicates the outcome of the 3DS authentication process. */
        fun authenticationResult(authenticationResult: AuthenticationResult) =
            authenticationResult(JsonField.of(authenticationResult))

        /**
         * Sets [Builder.authenticationResult] to an arbitrary JSON value.
         *
         * You should usually call [Builder.authenticationResult] with a well-typed
         * [AuthenticationResult] value instead. This method is primarily for setting the field to
         * an undocumented or not yet supported value.
         */
        fun authenticationResult(authenticationResult: JsonField<AuthenticationResult>) = apply {
            this.authenticationResult = authenticationResult
        }

        /**
         * Indicates whether the expiration date provided by the cardholder during checkout matches
         * Lithic's record of the card's expiration date.
         */
        fun cardExpiryCheck(cardExpiryCheck: CardExpiryCheck) =
            cardExpiryCheck(JsonField.of(cardExpiryCheck))

        /**
         * Sets [Builder.cardExpiryCheck] to an arbitrary JSON value.
         *
         * You should usually call [Builder.cardExpiryCheck] with a well-typed [CardExpiryCheck]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun cardExpiryCheck(cardExpiryCheck: JsonField<CardExpiryCheck>) = apply {
            this.cardExpiryCheck = cardExpiryCheck
        }

        /** Globally unique identifier for the card on which the 3DS authentication has occurred. */
        fun cardToken(cardToken: String) = cardToken(JsonField.of(cardToken))

        /**
         * Sets [Builder.cardToken] to an arbitrary JSON value.
         *
         * You should usually call [Builder.cardToken] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun cardToken(cardToken: JsonField<String>) = apply { this.cardToken = cardToken }

        /** Object containing data about the cardholder provided during the transaction. */
        fun cardholder(cardholder: Cardholder) = cardholder(JsonField.of(cardholder))

        /**
         * Sets [Builder.cardholder] to an arbitrary JSON value.
         *
         * You should usually call [Builder.cardholder] with a well-typed [Cardholder] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun cardholder(cardholder: JsonField<Cardholder>) = apply { this.cardholder = cardholder }

        /** Channel in which the authentication occurs. Maps to EMV 3DS field deviceChannel. */
        fun channel(channel: Channel) = channel(JsonField.of(channel))

        /**
         * Sets [Builder.channel] to an arbitrary JSON value.
         *
         * You should usually call [Builder.channel] with a well-typed [Channel] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun channel(channel: JsonField<Channel>) = apply { this.channel = channel }

        /** Date and time when the authentication was created in Lithic's system. */
        fun created(created: OffsetDateTime) = created(JsonField.of(created))

        /**
         * Sets [Builder.created] to an arbitrary JSON value.
         *
         * You should usually call [Builder.created] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun created(created: JsonField<OffsetDateTime>) = apply { this.created = created }

        /** Object containing data about the merchant involved in the e-commerce transaction. */
        fun merchant(merchant: Merchant) = merchant(JsonField.of(merchant))

        /**
         * Sets [Builder.merchant] to an arbitrary JSON value.
         *
         * You should usually call [Builder.merchant] with a well-typed [Merchant] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun merchant(merchant: JsonField<Merchant>) = apply { this.merchant = merchant }

        /**
         * Either PAYMENT_AUTHENTICATION or NON_PAYMENT_AUTHENTICATION. For
         * NON_PAYMENT_AUTHENTICATION, additional_data and transaction fields are not populated.
         */
        fun messageCategory(messageCategory: MessageCategory) =
            messageCategory(JsonField.of(messageCategory))

        /**
         * Sets [Builder.messageCategory] to an arbitrary JSON value.
         *
         * You should usually call [Builder.messageCategory] with a well-typed [MessageCategory]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun messageCategory(messageCategory: JsonField<MessageCategory>) = apply {
            this.messageCategory = messageCategory
        }

        /**
         * Indicates whether a challenge is requested for this transaction
         * - `NO_PREFERENCE` - No Preference
         * - `NO_CHALLENGE_REQUESTED` - No Challenge Requested
         * - `CHALLENGE_PREFERENCE` - Challenge requested (3DS Requestor preference)
         * - `CHALLENGE_MANDATE` - Challenge requested (Mandate)
         * - `NO_CHALLENGE_RISK_ALREADY_ASSESSED` - No Challenge requested (Transactional risk
         *   analysis is already performed)
         * - `DATA_SHARE_ONLY` - No Challenge requested (Data Share Only)
         * - `OTHER` - Other indicators not captured by above. These are rarely used
         */
        fun threeDSRequestorChallengeIndicator(
            threeDSRequestorChallengeIndicator: ThreeDSRequestorChallengeIndicator
        ) = threeDSRequestorChallengeIndicator(JsonField.of(threeDSRequestorChallengeIndicator))

        /**
         * Sets [Builder.threeDSRequestorChallengeIndicator] to an arbitrary JSON value.
         *
         * You should usually call [Builder.threeDSRequestorChallengeIndicator] with a well-typed
         * [ThreeDSRequestorChallengeIndicator] value instead. This method is primarily for setting
         * the field to an undocumented or not yet supported value.
         */
        fun threeDSRequestorChallengeIndicator(
            threeDSRequestorChallengeIndicator: JsonField<ThreeDSRequestorChallengeIndicator>
        ) = apply { this.threeDSRequestorChallengeIndicator = threeDSRequestorChallengeIndicator }

        /**
         * Object containing additional data about the 3DS request that is beyond the EMV 3DS
         * standard spec (e.g., specific fields that only certain card networks send but are not
         * required across all 3DS requests).
         */
        fun additionalData(additionalData: AdditionalData?) =
            additionalData(JsonField.ofNullable(additionalData))

        /**
         * Sets [Builder.additionalData] to an arbitrary JSON value.
         *
         * You should usually call [Builder.additionalData] with a well-typed [AdditionalData] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun additionalData(additionalData: JsonField<AdditionalData>) = apply {
            this.additionalData = additionalData
        }

        /**
         * Object containing data about the app used in the e-commerce transaction. Present if the
         * channel is 'APP_BASED'.
         */
        fun app(app: App) = app(JsonField.of(app))

        /**
         * Sets [Builder.app] to an arbitrary JSON value.
         *
         * You should usually call [Builder.app] with a well-typed [App] value instead. This method
         * is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun app(app: JsonField<App>) = apply { this.app = app }

        /**
         * Type of authentication request - i.e., the type of transaction or interaction is causing
         * the merchant to request an authentication. Maps to EMV 3DS field
         * threeDSRequestorAuthenticationInd.
         */
        fun authenticationRequestType(authenticationRequestType: AuthenticationRequestType?) =
            authenticationRequestType(JsonField.ofNullable(authenticationRequestType))

        /**
         * Sets [Builder.authenticationRequestType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.authenticationRequestType] with a well-typed
         * [AuthenticationRequestType] value instead. This method is primarily for setting the field
         * to an undocumented or not yet supported value.
         */
        fun authenticationRequestType(
            authenticationRequestType: JsonField<AuthenticationRequestType>
        ) = apply { this.authenticationRequestType = authenticationRequestType }

        /**
         * Object containing data about the browser used in the e-commerce transaction. Present if
         * the channel is 'BROWSER'.
         */
        fun browser(browser: Browser) = browser(JsonField.of(browser))

        /**
         * Sets [Builder.browser] to an arbitrary JSON value.
         *
         * You should usually call [Builder.browser] with a well-typed [Browser] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun browser(browser: JsonField<Browser>) = apply { this.browser = browser }

        /** Metadata about the challenge method and delivery. */
        fun challengeMetadata(challengeMetadata: ChallengeMetadata?) =
            challengeMetadata(JsonField.ofNullable(challengeMetadata))

        /**
         * Sets [Builder.challengeMetadata] to an arbitrary JSON value.
         *
         * You should usually call [Builder.challengeMetadata] with a well-typed [ChallengeMetadata]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun challengeMetadata(challengeMetadata: JsonField<ChallengeMetadata>) = apply {
            this.challengeMetadata = challengeMetadata
        }

        /** Entity that orchestrates the challenge. */
        fun challengeOrchestratedBy(challengeOrchestratedBy: ChallengeOrchestratedBy?) =
            challengeOrchestratedBy(JsonField.ofNullable(challengeOrchestratedBy))

        /**
         * Sets [Builder.challengeOrchestratedBy] to an arbitrary JSON value.
         *
         * You should usually call [Builder.challengeOrchestratedBy] with a well-typed
         * [ChallengeOrchestratedBy] value instead. This method is primarily for setting the field
         * to an undocumented or not yet supported value.
         */
        fun challengeOrchestratedBy(challengeOrchestratedBy: JsonField<ChallengeOrchestratedBy>) =
            apply {
                this.challengeOrchestratedBy = challengeOrchestratedBy
            }

        /** Entity that made the authentication decision. */
        fun decisionMadeBy(decisionMadeBy: DecisionMadeBy?) =
            decisionMadeBy(JsonField.ofNullable(decisionMadeBy))

        /**
         * Sets [Builder.decisionMadeBy] to an arbitrary JSON value.
         *
         * You should usually call [Builder.decisionMadeBy] with a well-typed [DecisionMadeBy] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun decisionMadeBy(decisionMadeBy: JsonField<DecisionMadeBy>) = apply {
            this.decisionMadeBy = decisionMadeBy
        }

        /**
         * Type of 3DS Requestor Initiated (3RI) request i.e., a 3DS authentication that takes place
         * at the initiation of the merchant rather than the cardholder. The most common example of
         * this is where a merchant is authenticating before billing for a recurring transaction
         * such as a pay TV subscription or a utility bill. Maps to EMV 3DS field threeRIInd.
         */
        fun threeRiRequestType(threeRiRequestType: ThreeRiRequestType?) =
            threeRiRequestType(JsonField.ofNullable(threeRiRequestType))

        /**
         * Sets [Builder.threeRiRequestType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.threeRiRequestType] with a well-typed
         * [ThreeRiRequestType] value instead. This method is primarily for setting the field to an
         * undocumented or not yet supported value.
         */
        fun threeRiRequestType(threeRiRequestType: JsonField<ThreeRiRequestType>) = apply {
            this.threeRiRequestType = threeRiRequestType
        }

        /**
         * Object containing data about the e-commerce transaction for which the merchant is
         * requesting authentication.
         */
        fun transaction(transaction: Transaction?) = transaction(JsonField.ofNullable(transaction))

        /**
         * Sets [Builder.transaction] to an arbitrary JSON value.
         *
         * You should usually call [Builder.transaction] with a well-typed [Transaction] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun transaction(transaction: JsonField<Transaction>) = apply {
            this.transaction = transaction
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
         * Returns an immutable instance of [AuthenticationRetrieveResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```kotlin
         * .token()
         * .accountType()
         * .authenticationResult()
         * .cardExpiryCheck()
         * .cardToken()
         * .cardholder()
         * .channel()
         * .created()
         * .merchant()
         * .messageCategory()
         * .threeDSRequestorChallengeIndicator()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): AuthenticationRetrieveResponse =
            AuthenticationRetrieveResponse(
                checkRequired("token", token),
                checkRequired("accountType", accountType),
                checkRequired("authenticationResult", authenticationResult),
                checkRequired("cardExpiryCheck", cardExpiryCheck),
                checkRequired("cardToken", cardToken),
                checkRequired("cardholder", cardholder),
                checkRequired("channel", channel),
                checkRequired("created", created),
                checkRequired("merchant", merchant),
                checkRequired("messageCategory", messageCategory),
                checkRequired(
                    "threeDSRequestorChallengeIndicator",
                    threeDSRequestorChallengeIndicator,
                ),
                additionalData,
                app,
                authenticationRequestType,
                browser,
                challengeMetadata,
                challengeOrchestratedBy,
                decisionMadeBy,
                threeRiRequestType,
                transaction,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): AuthenticationRetrieveResponse = apply {
        if (validated) {
            return@apply
        }

        token()
        accountType()?.validate()
        authenticationResult().validate()
        cardExpiryCheck().validate()
        cardToken()
        cardholder().validate()
        channel().validate()
        created()
        merchant().validate()
        messageCategory().validate()
        threeDSRequestorChallengeIndicator().validate()
        additionalData()?.validate()
        app()?.validate()
        authenticationRequestType()?.validate()
        browser()?.validate()
        challengeMetadata()?.validate()
        challengeOrchestratedBy()?.validate()
        decisionMadeBy()?.validate()
        threeRiRequestType()?.validate()
        transaction()?.validate()
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
            (accountType.asKnown()?.validity() ?: 0) +
            (authenticationResult.asKnown()?.validity() ?: 0) +
            (cardExpiryCheck.asKnown()?.validity() ?: 0) +
            (if (cardToken.asKnown() == null) 0 else 1) +
            (cardholder.asKnown()?.validity() ?: 0) +
            (channel.asKnown()?.validity() ?: 0) +
            (if (created.asKnown() == null) 0 else 1) +
            (merchant.asKnown()?.validity() ?: 0) +
            (messageCategory.asKnown()?.validity() ?: 0) +
            (threeDSRequestorChallengeIndicator.asKnown()?.validity() ?: 0) +
            (additionalData.asKnown()?.validity() ?: 0) +
            (app.asKnown()?.validity() ?: 0) +
            (authenticationRequestType.asKnown()?.validity() ?: 0) +
            (browser.asKnown()?.validity() ?: 0) +
            (challengeMetadata.asKnown()?.validity() ?: 0) +
            (challengeOrchestratedBy.asKnown()?.validity() ?: 0) +
            (decisionMadeBy.asKnown()?.validity() ?: 0) +
            (threeRiRequestType.asKnown()?.validity() ?: 0) +
            (transaction.asKnown()?.validity() ?: 0)

    /**
     * Type of account/card that is being used for the transaction. Maps to EMV 3DS field
     * `acctType`.
     */
    class AccountType @JsonCreator private constructor(private val value: JsonField<String>) :
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

            val CREDIT = of("CREDIT")

            val DEBIT = of("DEBIT")

            val NOT_APPLICABLE = of("NOT_APPLICABLE")

            fun of(value: String) = AccountType(JsonField.of(value))
        }

        /** An enum containing [AccountType]'s known values. */
        enum class Known {
            CREDIT,
            DEBIT,
            NOT_APPLICABLE,
        }

        /**
         * An enum containing [AccountType]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [AccountType] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            CREDIT,
            DEBIT,
            NOT_APPLICABLE,
            /**
             * An enum member indicating that [AccountType] was instantiated with an unknown value.
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
                CREDIT -> Value.CREDIT
                DEBIT -> Value.DEBIT
                NOT_APPLICABLE -> Value.NOT_APPLICABLE
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
                CREDIT -> Known.CREDIT
                DEBIT -> Known.DEBIT
                NOT_APPLICABLE -> Known.NOT_APPLICABLE
                else -> throw LithicInvalidDataException("Unknown AccountType: $value")
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

        fun validate(): AccountType = apply {
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

            return /* spotless:off */ other is AccountType && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /** Indicates the outcome of the 3DS authentication process. */
    class AuthenticationResult
    @JsonCreator
    private constructor(private val value: JsonField<String>) : Enum {

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

            val DECLINE = of("DECLINE")

            val SUCCESS = of("SUCCESS")

            val PENDING_CHALLENGE = of("PENDING_CHALLENGE")

            val PENDING_DECISION = of("PENDING_DECISION")

            fun of(value: String) = AuthenticationResult(JsonField.of(value))
        }

        /** An enum containing [AuthenticationResult]'s known values. */
        enum class Known {
            DECLINE,
            SUCCESS,
            PENDING_CHALLENGE,
            PENDING_DECISION,
        }

        /**
         * An enum containing [AuthenticationResult]'s known values, as well as an [_UNKNOWN]
         * member.
         *
         * An instance of [AuthenticationResult] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            DECLINE,
            SUCCESS,
            PENDING_CHALLENGE,
            PENDING_DECISION,
            /**
             * An enum member indicating that [AuthenticationResult] was instantiated with an
             * unknown value.
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
                DECLINE -> Value.DECLINE
                SUCCESS -> Value.SUCCESS
                PENDING_CHALLENGE -> Value.PENDING_CHALLENGE
                PENDING_DECISION -> Value.PENDING_DECISION
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
                DECLINE -> Known.DECLINE
                SUCCESS -> Known.SUCCESS
                PENDING_CHALLENGE -> Known.PENDING_CHALLENGE
                PENDING_DECISION -> Known.PENDING_DECISION
                else -> throw LithicInvalidDataException("Unknown AuthenticationResult: $value")
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

        fun validate(): AuthenticationResult = apply {
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

            return /* spotless:off */ other is AuthenticationResult && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /**
     * Indicates whether the expiration date provided by the cardholder during checkout matches
     * Lithic's record of the card's expiration date.
     */
    class CardExpiryCheck @JsonCreator private constructor(private val value: JsonField<String>) :
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

            val MATCH = of("MATCH")

            val MISMATCH = of("MISMATCH")

            val NOT_PRESENT = of("NOT_PRESENT")

            fun of(value: String) = CardExpiryCheck(JsonField.of(value))
        }

        /** An enum containing [CardExpiryCheck]'s known values. */
        enum class Known {
            MATCH,
            MISMATCH,
            NOT_PRESENT,
        }

        /**
         * An enum containing [CardExpiryCheck]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [CardExpiryCheck] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            MATCH,
            MISMATCH,
            NOT_PRESENT,
            /**
             * An enum member indicating that [CardExpiryCheck] was instantiated with an unknown
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
                MATCH -> Value.MATCH
                MISMATCH -> Value.MISMATCH
                NOT_PRESENT -> Value.NOT_PRESENT
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
                MATCH -> Known.MATCH
                MISMATCH -> Known.MISMATCH
                NOT_PRESENT -> Known.NOT_PRESENT
                else -> throw LithicInvalidDataException("Unknown CardExpiryCheck: $value")
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

        fun validate(): CardExpiryCheck = apply {
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

            return /* spotless:off */ other is CardExpiryCheck && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /** Object containing data about the cardholder provided during the transaction. */
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
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("address_match")
            @ExcludeMissing
            addressMatch: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("billing_address")
            @ExcludeMissing
            billingAddress: JsonField<ThreeDSAddress> = JsonMissing.of(),
            @JsonProperty("email") @ExcludeMissing email: JsonField<String> = JsonMissing.of(),
            @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
            @JsonProperty("phone_number_home")
            @ExcludeMissing
            phoneNumberHome: JsonField<String> = JsonMissing.of(),
            @JsonProperty("phone_number_mobile")
            @ExcludeMissing
            phoneNumberMobile: JsonField<String> = JsonMissing.of(),
            @JsonProperty("phone_number_work")
            @ExcludeMissing
            phoneNumberWork: JsonField<String> = JsonMissing.of(),
            @JsonProperty("shipping_address")
            @ExcludeMissing
            shippingAddress: JsonField<ThreeDSAddress> = JsonMissing.of(),
        ) : this(
            addressMatch,
            billingAddress,
            email,
            name,
            phoneNumberHome,
            phoneNumberMobile,
            phoneNumberWork,
            shippingAddress,
            mutableMapOf(),
        )

        /**
         * Indicates whether the shipping address and billing address provided by the cardholder are
         * the same. This value - and assessment of whether the addresses match - is provided
         * directly in the 3DS request and is not determined by Lithic. Maps to EMV 3DS field
         * addrMatch.
         *
         * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun addressMatch(): Boolean? = addressMatch.getNullable("address_match")

        /**
         * Object containing data on the billing address provided during the transaction.
         *
         * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun billingAddress(): ThreeDSAddress? = billingAddress.getNullable("billing_address")

        /**
         * Email address that is either provided by the cardholder or is on file with the merchant
         * in a 3RI request. Maps to EMV 3DS field email.
         *
         * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun email(): String? = email.getNullable("email")

        /**
         * Name of the cardholder. Maps to EMV 3DS field cardholderName.
         *
         * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun name(): String? = name.getNullable("name")

        /**
         * Home phone number provided by the cardholder. Maps to EMV 3DS fields homePhone.cc and
         * homePhone.subscriber.
         *
         * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun phoneNumberHome(): String? = phoneNumberHome.getNullable("phone_number_home")

        /**
         * Mobile/cell phone number provided by the cardholder. Maps to EMV 3DS fields
         * mobilePhone.cc and mobilePhone.subscriber.
         *
         * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun phoneNumberMobile(): String? = phoneNumberMobile.getNullable("phone_number_mobile")

        /**
         * Work phone number provided by the cardholder. Maps to EMV 3DS fields workPhone.cc and
         * workPhone.subscriber.
         *
         * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun phoneNumberWork(): String? = phoneNumberWork.getNullable("phone_number_work")

        /**
         * Object containing data on the shipping address provided during the transaction.
         *
         * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun shippingAddress(): ThreeDSAddress? = shippingAddress.getNullable("shipping_address")

        /**
         * Returns the raw JSON value of [addressMatch].
         *
         * Unlike [addressMatch], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("address_match")
        @ExcludeMissing
        fun _addressMatch(): JsonField<Boolean> = addressMatch

        /**
         * Returns the raw JSON value of [billingAddress].
         *
         * Unlike [billingAddress], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("billing_address")
        @ExcludeMissing
        fun _billingAddress(): JsonField<ThreeDSAddress> = billingAddress

        /**
         * Returns the raw JSON value of [email].
         *
         * Unlike [email], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("email") @ExcludeMissing fun _email(): JsonField<String> = email

        /**
         * Returns the raw JSON value of [name].
         *
         * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

        /**
         * Returns the raw JSON value of [phoneNumberHome].
         *
         * Unlike [phoneNumberHome], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("phone_number_home")
        @ExcludeMissing
        fun _phoneNumberHome(): JsonField<String> = phoneNumberHome

        /**
         * Returns the raw JSON value of [phoneNumberMobile].
         *
         * Unlike [phoneNumberMobile], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("phone_number_mobile")
        @ExcludeMissing
        fun _phoneNumberMobile(): JsonField<String> = phoneNumberMobile

        /**
         * Returns the raw JSON value of [phoneNumberWork].
         *
         * Unlike [phoneNumberWork], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("phone_number_work")
        @ExcludeMissing
        fun _phoneNumberWork(): JsonField<String> = phoneNumberWork

        /**
         * Returns the raw JSON value of [shippingAddress].
         *
         * Unlike [shippingAddress], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("shipping_address")
        @ExcludeMissing
        fun _shippingAddress(): JsonField<ThreeDSAddress> = shippingAddress

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

            /** Returns a mutable builder for constructing an instance of [Cardholder]. */
            fun builder() = Builder()
        }

        /** A builder for [Cardholder]. */
        class Builder internal constructor() {

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
                addressMatch = cardholder.addressMatch
                billingAddress = cardholder.billingAddress
                email = cardholder.email
                name = cardholder.name
                phoneNumberHome = cardholder.phoneNumberHome
                phoneNumberMobile = cardholder.phoneNumberMobile
                phoneNumberWork = cardholder.phoneNumberWork
                shippingAddress = cardholder.shippingAddress
                additionalProperties = cardholder.additionalProperties.toMutableMap()
            }

            /**
             * Indicates whether the shipping address and billing address provided by the cardholder
             * are the same. This value - and assessment of whether the addresses match - is
             * provided directly in the 3DS request and is not determined by Lithic. Maps to EMV 3DS
             * field addrMatch.
             */
            fun addressMatch(addressMatch: Boolean?) =
                addressMatch(JsonField.ofNullable(addressMatch))

            /**
             * Alias for [Builder.addressMatch].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun addressMatch(addressMatch: Boolean) = addressMatch(addressMatch as Boolean?)

            /**
             * Sets [Builder.addressMatch] to an arbitrary JSON value.
             *
             * You should usually call [Builder.addressMatch] with a well-typed [Boolean] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun addressMatch(addressMatch: JsonField<Boolean>) = apply {
                this.addressMatch = addressMatch
            }

            /** Object containing data on the billing address provided during the transaction. */
            fun billingAddress(billingAddress: ThreeDSAddress) =
                billingAddress(JsonField.of(billingAddress))

            /**
             * Sets [Builder.billingAddress] to an arbitrary JSON value.
             *
             * You should usually call [Builder.billingAddress] with a well-typed [ThreeDSAddress]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun billingAddress(billingAddress: JsonField<ThreeDSAddress>) = apply {
                this.billingAddress = billingAddress
            }

            /**
             * Email address that is either provided by the cardholder or is on file with the
             * merchant in a 3RI request. Maps to EMV 3DS field email.
             */
            fun email(email: String?) = email(JsonField.ofNullable(email))

            /**
             * Sets [Builder.email] to an arbitrary JSON value.
             *
             * You should usually call [Builder.email] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun email(email: JsonField<String>) = apply { this.email = email }

            /** Name of the cardholder. Maps to EMV 3DS field cardholderName. */
            fun name(name: String?) = name(JsonField.ofNullable(name))

            /**
             * Sets [Builder.name] to an arbitrary JSON value.
             *
             * You should usually call [Builder.name] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun name(name: JsonField<String>) = apply { this.name = name }

            /**
             * Home phone number provided by the cardholder. Maps to EMV 3DS fields homePhone.cc and
             * homePhone.subscriber.
             */
            fun phoneNumberHome(phoneNumberHome: String?) =
                phoneNumberHome(JsonField.ofNullable(phoneNumberHome))

            /**
             * Sets [Builder.phoneNumberHome] to an arbitrary JSON value.
             *
             * You should usually call [Builder.phoneNumberHome] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun phoneNumberHome(phoneNumberHome: JsonField<String>) = apply {
                this.phoneNumberHome = phoneNumberHome
            }

            /**
             * Mobile/cell phone number provided by the cardholder. Maps to EMV 3DS fields
             * mobilePhone.cc and mobilePhone.subscriber.
             */
            fun phoneNumberMobile(phoneNumberMobile: String?) =
                phoneNumberMobile(JsonField.ofNullable(phoneNumberMobile))

            /**
             * Sets [Builder.phoneNumberMobile] to an arbitrary JSON value.
             *
             * You should usually call [Builder.phoneNumberMobile] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun phoneNumberMobile(phoneNumberMobile: JsonField<String>) = apply {
                this.phoneNumberMobile = phoneNumberMobile
            }

            /**
             * Work phone number provided by the cardholder. Maps to EMV 3DS fields workPhone.cc and
             * workPhone.subscriber.
             */
            fun phoneNumberWork(phoneNumberWork: String?) =
                phoneNumberWork(JsonField.ofNullable(phoneNumberWork))

            /**
             * Sets [Builder.phoneNumberWork] to an arbitrary JSON value.
             *
             * You should usually call [Builder.phoneNumberWork] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun phoneNumberWork(phoneNumberWork: JsonField<String>) = apply {
                this.phoneNumberWork = phoneNumberWork
            }

            /** Object containing data on the shipping address provided during the transaction. */
            fun shippingAddress(shippingAddress: ThreeDSAddress) =
                shippingAddress(JsonField.of(shippingAddress))

            /**
             * Sets [Builder.shippingAddress] to an arbitrary JSON value.
             *
             * You should usually call [Builder.shippingAddress] with a well-typed [ThreeDSAddress]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun shippingAddress(shippingAddress: JsonField<ThreeDSAddress>) = apply {
                this.shippingAddress = shippingAddress
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
             * Returns an immutable instance of [Cardholder].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
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
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Cardholder = apply {
            if (validated) {
                return@apply
            }

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
            (if (addressMatch.asKnown() == null) 0 else 1) +
                (billingAddress.asKnown()?.validity() ?: 0) +
                (if (email.asKnown() == null) 0 else 1) +
                (if (name.asKnown() == null) 0 else 1) +
                (if (phoneNumberHome.asKnown() == null) 0 else 1) +
                (if (phoneNumberMobile.asKnown() == null) 0 else 1) +
                (if (phoneNumberWork.asKnown() == null) 0 else 1) +
                (shippingAddress.asKnown()?.validity() ?: 0)

        /** Object containing data on the billing address provided during the transaction. */
        class ThreeDSAddress
        private constructor(
            private val address1: JsonField<String>,
            private val address2: JsonField<String>,
            private val address3: JsonField<String>,
            private val city: JsonField<String>,
            private val country: JsonField<String>,
            private val postalCode: JsonField<String>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("address1")
                @ExcludeMissing
                address1: JsonField<String> = JsonMissing.of(),
                @JsonProperty("address2")
                @ExcludeMissing
                address2: JsonField<String> = JsonMissing.of(),
                @JsonProperty("address3")
                @ExcludeMissing
                address3: JsonField<String> = JsonMissing.of(),
                @JsonProperty("city") @ExcludeMissing city: JsonField<String> = JsonMissing.of(),
                @JsonProperty("country")
                @ExcludeMissing
                country: JsonField<String> = JsonMissing.of(),
                @JsonProperty("postal_code")
                @ExcludeMissing
                postalCode: JsonField<String> = JsonMissing.of(),
            ) : this(address1, address2, address3, city, country, postalCode, mutableMapOf())

            /**
             * First line of the street address provided by the cardholder.
             *
             * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun address1(): String? = address1.getNullable("address1")

            /**
             * Second line of the street address provided by the cardholder.
             *
             * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun address2(): String? = address2.getNullable("address2")

            /**
             * Third line of the street address provided by the cardholder.
             *
             * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun address3(): String? = address3.getNullable("address3")

            /**
             * City of the address provided by the cardholder.
             *
             * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun city(): String? = city.getNullable("city")

            /**
             * Country of the address provided by the cardholder in ISO 3166-1 alpha-3 format (e.g.
             * USA)
             *
             * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun country(): String? = country.getNullable("country")

            /**
             * Postal code (e.g., ZIP code) of the address provided by the cardholder
             *
             * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun postalCode(): String? = postalCode.getNullable("postal_code")

            /**
             * Returns the raw JSON value of [address1].
             *
             * Unlike [address1], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("address1") @ExcludeMissing fun _address1(): JsonField<String> = address1

            /**
             * Returns the raw JSON value of [address2].
             *
             * Unlike [address2], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("address2") @ExcludeMissing fun _address2(): JsonField<String> = address2

            /**
             * Returns the raw JSON value of [address3].
             *
             * Unlike [address3], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("address3") @ExcludeMissing fun _address3(): JsonField<String> = address3

            /**
             * Returns the raw JSON value of [city].
             *
             * Unlike [city], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("city") @ExcludeMissing fun _city(): JsonField<String> = city

            /**
             * Returns the raw JSON value of [country].
             *
             * Unlike [country], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("country") @ExcludeMissing fun _country(): JsonField<String> = country

            /**
             * Returns the raw JSON value of [postalCode].
             *
             * Unlike [postalCode], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("postal_code")
            @ExcludeMissing
            fun _postalCode(): JsonField<String> = postalCode

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

                /** Returns a mutable builder for constructing an instance of [ThreeDSAddress]. */
                fun builder() = Builder()
            }

            /** A builder for [ThreeDSAddress]. */
            class Builder internal constructor() {

                private var address1: JsonField<String> = JsonMissing.of()
                private var address2: JsonField<String> = JsonMissing.of()
                private var address3: JsonField<String> = JsonMissing.of()
                private var city: JsonField<String> = JsonMissing.of()
                private var country: JsonField<String> = JsonMissing.of()
                private var postalCode: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(threeDSAddress: ThreeDSAddress) = apply {
                    address1 = threeDSAddress.address1
                    address2 = threeDSAddress.address2
                    address3 = threeDSAddress.address3
                    city = threeDSAddress.city
                    country = threeDSAddress.country
                    postalCode = threeDSAddress.postalCode
                    additionalProperties = threeDSAddress.additionalProperties.toMutableMap()
                }

                /** First line of the street address provided by the cardholder. */
                fun address1(address1: String?) = address1(JsonField.ofNullable(address1))

                /**
                 * Sets [Builder.address1] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.address1] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun address1(address1: JsonField<String>) = apply { this.address1 = address1 }

                /** Second line of the street address provided by the cardholder. */
                fun address2(address2: String?) = address2(JsonField.ofNullable(address2))

                /**
                 * Sets [Builder.address2] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.address2] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun address2(address2: JsonField<String>) = apply { this.address2 = address2 }

                /** Third line of the street address provided by the cardholder. */
                fun address3(address3: String?) = address3(JsonField.ofNullable(address3))

                /**
                 * Sets [Builder.address3] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.address3] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun address3(address3: JsonField<String>) = apply { this.address3 = address3 }

                /** City of the address provided by the cardholder. */
                fun city(city: String?) = city(JsonField.ofNullable(city))

                /**
                 * Sets [Builder.city] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.city] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun city(city: JsonField<String>) = apply { this.city = city }

                /**
                 * Country of the address provided by the cardholder in ISO 3166-1 alpha-3 format
                 * (e.g. USA)
                 */
                fun country(country: String?) = country(JsonField.ofNullable(country))

                /**
                 * Sets [Builder.country] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.country] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun country(country: JsonField<String>) = apply { this.country = country }

                /** Postal code (e.g., ZIP code) of the address provided by the cardholder */
                fun postalCode(postalCode: String?) = postalCode(JsonField.ofNullable(postalCode))

                /**
                 * Sets [Builder.postalCode] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.postalCode] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun postalCode(postalCode: JsonField<String>) = apply {
                    this.postalCode = postalCode
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
                 * Returns an immutable instance of [ThreeDSAddress].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): ThreeDSAddress =
                    ThreeDSAddress(
                        address1,
                        address2,
                        address3,
                        city,
                        country,
                        postalCode,
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): ThreeDSAddress = apply {
                if (validated) {
                    return@apply
                }

                address1()
                address2()
                address3()
                city()
                country()
                postalCode()
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
                (if (address1.asKnown() == null) 0 else 1) +
                    (if (address2.asKnown() == null) 0 else 1) +
                    (if (address3.asKnown() == null) 0 else 1) +
                    (if (city.asKnown() == null) 0 else 1) +
                    (if (country.asKnown() == null) 0 else 1) +
                    (if (postalCode.asKnown() == null) 0 else 1)

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

    /** Channel in which the authentication occurs. Maps to EMV 3DS field deviceChannel. */
    class Channel @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            val APP_BASED = of("APP_BASED")

            val BROWSER = of("BROWSER")

            val THREE_DS_REQUESTOR_INITIATED = of("THREE_DS_REQUESTOR_INITIATED")

            fun of(value: String) = Channel(JsonField.of(value))
        }

        /** An enum containing [Channel]'s known values. */
        enum class Known {
            APP_BASED,
            BROWSER,
            THREE_DS_REQUESTOR_INITIATED,
        }

        /**
         * An enum containing [Channel]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Channel] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            APP_BASED,
            BROWSER,
            THREE_DS_REQUESTOR_INITIATED,
            /** An enum member indicating that [Channel] was instantiated with an unknown value. */
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
                APP_BASED -> Value.APP_BASED
                BROWSER -> Value.BROWSER
                THREE_DS_REQUESTOR_INITIATED -> Value.THREE_DS_REQUESTOR_INITIATED
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
                APP_BASED -> Known.APP_BASED
                BROWSER -> Known.BROWSER
                THREE_DS_REQUESTOR_INITIATED -> Known.THREE_DS_REQUESTOR_INITIATED
                else -> throw LithicInvalidDataException("Unknown Channel: $value")
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

        fun validate(): Channel = apply {
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

            return /* spotless:off */ other is Channel && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /** Object containing data about the merchant involved in the e-commerce transaction. */
    class Merchant
    private constructor(
        private val id: JsonField<String>,
        private val country: JsonField<String>,
        private val mcc: JsonField<String>,
        private val name: JsonField<String>,
        private val riskIndicator: JsonField<RiskIndicator>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
            @JsonProperty("country") @ExcludeMissing country: JsonField<String> = JsonMissing.of(),
            @JsonProperty("mcc") @ExcludeMissing mcc: JsonField<String> = JsonMissing.of(),
            @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
            @JsonProperty("risk_indicator")
            @ExcludeMissing
            riskIndicator: JsonField<RiskIndicator> = JsonMissing.of(),
        ) : this(id, country, mcc, name, riskIndicator, mutableMapOf())

        /**
         * Merchant identifier as assigned by the acquirer. Maps to EMV 3DS field
         * acquirerMerchantId.
         *
         * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun id(): String = id.getRequired("id")

        /**
         * Country code of the merchant requesting 3DS authentication. Maps to EMV 3DS field
         * merchantCountryCode.
         *
         * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun country(): String = country.getRequired("country")

        /**
         * Merchant category code assigned to the merchant that describes its business activity
         * type. Maps to EMV 3DS field mcc.
         *
         * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun mcc(): String = mcc.getRequired("mcc")

        /**
         * Name of the merchant. Maps to EMV 3DS field merchantName.
         *
         * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun name(): String = name.getRequired("name")

        /**
         * Object containing additional data indicating additional risk factors related to the
         * e-commerce transaction.
         *
         * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun riskIndicator(): RiskIndicator = riskIndicator.getRequired("risk_indicator")

        /**
         * Returns the raw JSON value of [id].
         *
         * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

        /**
         * Returns the raw JSON value of [country].
         *
         * Unlike [country], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("country") @ExcludeMissing fun _country(): JsonField<String> = country

        /**
         * Returns the raw JSON value of [mcc].
         *
         * Unlike [mcc], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("mcc") @ExcludeMissing fun _mcc(): JsonField<String> = mcc

        /**
         * Returns the raw JSON value of [name].
         *
         * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

        /**
         * Returns the raw JSON value of [riskIndicator].
         *
         * Unlike [riskIndicator], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("risk_indicator")
        @ExcludeMissing
        fun _riskIndicator(): JsonField<RiskIndicator> = riskIndicator

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
             * Returns a mutable builder for constructing an instance of [Merchant].
             *
             * The following fields are required:
             * ```kotlin
             * .id()
             * .country()
             * .mcc()
             * .name()
             * .riskIndicator()
             * ```
             */
            fun builder() = Builder()
        }

        /** A builder for [Merchant]. */
        class Builder internal constructor() {

            private var id: JsonField<String>? = null
            private var country: JsonField<String>? = null
            private var mcc: JsonField<String>? = null
            private var name: JsonField<String>? = null
            private var riskIndicator: JsonField<RiskIndicator>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(merchant: Merchant) = apply {
                id = merchant.id
                country = merchant.country
                mcc = merchant.mcc
                name = merchant.name
                riskIndicator = merchant.riskIndicator
                additionalProperties = merchant.additionalProperties.toMutableMap()
            }

            /**
             * Merchant identifier as assigned by the acquirer. Maps to EMV 3DS field
             * acquirerMerchantId.
             */
            fun id(id: String) = id(JsonField.of(id))

            /**
             * Sets [Builder.id] to an arbitrary JSON value.
             *
             * You should usually call [Builder.id] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun id(id: JsonField<String>) = apply { this.id = id }

            /**
             * Country code of the merchant requesting 3DS authentication. Maps to EMV 3DS field
             * merchantCountryCode.
             */
            fun country(country: String) = country(JsonField.of(country))

            /**
             * Sets [Builder.country] to an arbitrary JSON value.
             *
             * You should usually call [Builder.country] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun country(country: JsonField<String>) = apply { this.country = country }

            /**
             * Merchant category code assigned to the merchant that describes its business activity
             * type. Maps to EMV 3DS field mcc.
             */
            fun mcc(mcc: String) = mcc(JsonField.of(mcc))

            /**
             * Sets [Builder.mcc] to an arbitrary JSON value.
             *
             * You should usually call [Builder.mcc] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun mcc(mcc: JsonField<String>) = apply { this.mcc = mcc }

            /** Name of the merchant. Maps to EMV 3DS field merchantName. */
            fun name(name: String) = name(JsonField.of(name))

            /**
             * Sets [Builder.name] to an arbitrary JSON value.
             *
             * You should usually call [Builder.name] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun name(name: JsonField<String>) = apply { this.name = name }

            /**
             * Object containing additional data indicating additional risk factors related to the
             * e-commerce transaction.
             */
            fun riskIndicator(riskIndicator: RiskIndicator) =
                riskIndicator(JsonField.of(riskIndicator))

            /**
             * Sets [Builder.riskIndicator] to an arbitrary JSON value.
             *
             * You should usually call [Builder.riskIndicator] with a well-typed [RiskIndicator]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun riskIndicator(riskIndicator: JsonField<RiskIndicator>) = apply {
                this.riskIndicator = riskIndicator
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
             * Returns an immutable instance of [Merchant].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```kotlin
             * .id()
             * .country()
             * .mcc()
             * .name()
             * .riskIndicator()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Merchant =
                Merchant(
                    checkRequired("id", id),
                    checkRequired("country", country),
                    checkRequired("mcc", mcc),
                    checkRequired("name", name),
                    checkRequired("riskIndicator", riskIndicator),
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Merchant = apply {
            if (validated) {
                return@apply
            }

            id()
            country()
            mcc()
            name()
            riskIndicator().validate()
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
            (if (id.asKnown() == null) 0 else 1) +
                (if (country.asKnown() == null) 0 else 1) +
                (if (mcc.asKnown() == null) 0 else 1) +
                (if (name.asKnown() == null) 0 else 1) +
                (riskIndicator.asKnown()?.validity() ?: 0)

        /**
         * Object containing additional data indicating additional risk factors related to the
         * e-commerce transaction.
         */
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
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("delivery_email_address")
                @ExcludeMissing
                deliveryEmailAddress: JsonField<String> = JsonMissing.of(),
                @JsonProperty("delivery_time_frame")
                @ExcludeMissing
                deliveryTimeFrame: JsonField<DeliveryTimeFrame> = JsonMissing.of(),
                @JsonProperty("gift_card_amount")
                @ExcludeMissing
                giftCardAmount: JsonField<Long> = JsonMissing.of(),
                @JsonProperty("gift_card_count")
                @ExcludeMissing
                giftCardCount: JsonField<Long> = JsonMissing.of(),
                @JsonProperty("gift_card_currency")
                @ExcludeMissing
                giftCardCurrency: JsonField<String> = JsonMissing.of(),
                @JsonProperty("order_availability")
                @ExcludeMissing
                orderAvailability: JsonField<OrderAvailability> = JsonMissing.of(),
                @JsonProperty("pre_order_available_date")
                @ExcludeMissing
                preOrderAvailableDate: JsonField<OffsetDateTime> = JsonMissing.of(),
                @JsonProperty("reorder_items")
                @ExcludeMissing
                reorderItems: JsonField<ReorderItems> = JsonMissing.of(),
                @JsonProperty("shipping_method")
                @ExcludeMissing
                shippingMethod: JsonField<ShippingMethod> = JsonMissing.of(),
            ) : this(
                deliveryEmailAddress,
                deliveryTimeFrame,
                giftCardAmount,
                giftCardCount,
                giftCardCurrency,
                orderAvailability,
                preOrderAvailableDate,
                reorderItems,
                shippingMethod,
                mutableMapOf(),
            )

            /**
             * In transactions with electronic delivery, email address to which merchandise is
             * delivered. Maps to EMV 3DS field deliveryEmailAddress.
             *
             * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun deliveryEmailAddress(): String? =
                deliveryEmailAddress.getNullable("delivery_email_address")

            /**
             * The delivery time frame for the merchandise. Maps to EMV 3DS field deliveryTimeframe.
             *
             * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun deliveryTimeFrame(): DeliveryTimeFrame? =
                deliveryTimeFrame.getNullable("delivery_time_frame")

            /**
             * In prepaid or gift card purchase transactions, purchase amount total in major units
             * (e.g., a purchase of USD $205.10 would be 205). Maps to EMV 3DS field giftCardAmount.
             *
             * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun giftCardAmount(): Long? = giftCardAmount.getNullable("gift_card_amount")

            /**
             * In prepaid or gift card purchase transactions, count of individual prepaid or gift
             * cards/codes purchased. Maps to EMV 3DS field giftCardCount.
             *
             * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun giftCardCount(): Long? = giftCardCount.getNullable("gift_card_count")

            /**
             * In prepaid or gift card purchase transactions, currency code of the gift card. Maps
             * to EMV 3DS field giftCardCurr.
             *
             * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun giftCardCurrency(): String? = giftCardCurrency.getNullable("gift_card_currency")

            /**
             * Indicates whether the purchase is for merchandise that is available now or at a
             * future date. Maps to EMV 3DS field preOrderPurchaseInd.
             *
             * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun orderAvailability(): OrderAvailability? =
                orderAvailability.getNullable("order_availability")

            /**
             * In pre-order purchase transactions, the expected date that the merchandise will be
             * available. Maps to EMV 3DS field preOrderDate.
             *
             * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun preOrderAvailableDate(): OffsetDateTime? =
                preOrderAvailableDate.getNullable("pre_order_available_date")

            /**
             * Indicates whether the cardholder is reordering previously purchased merchandise. Maps
             * to EMV 3DS field reorderItemsInd.
             *
             * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun reorderItems(): ReorderItems? = reorderItems.getNullable("reorder_items")

            /**
             * Shipping method that the cardholder chose for the transaction. If purchase includes
             * one or more item, this indicator is used for the physical goods; if the purchase only
             * includes digital goods, this indicator is used to describe the most expensive item
             * purchased. Maps to EMV 3DS field shipIndicator.
             *
             * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun shippingMethod(): ShippingMethod? = shippingMethod.getNullable("shipping_method")

            /**
             * Returns the raw JSON value of [deliveryEmailAddress].
             *
             * Unlike [deliveryEmailAddress], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("delivery_email_address")
            @ExcludeMissing
            fun _deliveryEmailAddress(): JsonField<String> = deliveryEmailAddress

            /**
             * Returns the raw JSON value of [deliveryTimeFrame].
             *
             * Unlike [deliveryTimeFrame], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("delivery_time_frame")
            @ExcludeMissing
            fun _deliveryTimeFrame(): JsonField<DeliveryTimeFrame> = deliveryTimeFrame

            /**
             * Returns the raw JSON value of [giftCardAmount].
             *
             * Unlike [giftCardAmount], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("gift_card_amount")
            @ExcludeMissing
            fun _giftCardAmount(): JsonField<Long> = giftCardAmount

            /**
             * Returns the raw JSON value of [giftCardCount].
             *
             * Unlike [giftCardCount], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("gift_card_count")
            @ExcludeMissing
            fun _giftCardCount(): JsonField<Long> = giftCardCount

            /**
             * Returns the raw JSON value of [giftCardCurrency].
             *
             * Unlike [giftCardCurrency], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("gift_card_currency")
            @ExcludeMissing
            fun _giftCardCurrency(): JsonField<String> = giftCardCurrency

            /**
             * Returns the raw JSON value of [orderAvailability].
             *
             * Unlike [orderAvailability], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("order_availability")
            @ExcludeMissing
            fun _orderAvailability(): JsonField<OrderAvailability> = orderAvailability

            /**
             * Returns the raw JSON value of [preOrderAvailableDate].
             *
             * Unlike [preOrderAvailableDate], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("pre_order_available_date")
            @ExcludeMissing
            fun _preOrderAvailableDate(): JsonField<OffsetDateTime> = preOrderAvailableDate

            /**
             * Returns the raw JSON value of [reorderItems].
             *
             * Unlike [reorderItems], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("reorder_items")
            @ExcludeMissing
            fun _reorderItems(): JsonField<ReorderItems> = reorderItems

            /**
             * Returns the raw JSON value of [shippingMethod].
             *
             * Unlike [shippingMethod], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("shipping_method")
            @ExcludeMissing
            fun _shippingMethod(): JsonField<ShippingMethod> = shippingMethod

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

                /** Returns a mutable builder for constructing an instance of [RiskIndicator]. */
                fun builder() = Builder()
            }

            /** A builder for [RiskIndicator]. */
            class Builder internal constructor() {

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
                    deliveryEmailAddress = riskIndicator.deliveryEmailAddress
                    deliveryTimeFrame = riskIndicator.deliveryTimeFrame
                    giftCardAmount = riskIndicator.giftCardAmount
                    giftCardCount = riskIndicator.giftCardCount
                    giftCardCurrency = riskIndicator.giftCardCurrency
                    orderAvailability = riskIndicator.orderAvailability
                    preOrderAvailableDate = riskIndicator.preOrderAvailableDate
                    reorderItems = riskIndicator.reorderItems
                    shippingMethod = riskIndicator.shippingMethod
                    additionalProperties = riskIndicator.additionalProperties.toMutableMap()
                }

                /**
                 * In transactions with electronic delivery, email address to which merchandise is
                 * delivered. Maps to EMV 3DS field deliveryEmailAddress.
                 */
                fun deliveryEmailAddress(deliveryEmailAddress: String?) =
                    deliveryEmailAddress(JsonField.ofNullable(deliveryEmailAddress))

                /**
                 * Sets [Builder.deliveryEmailAddress] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.deliveryEmailAddress] with a well-typed [String]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun deliveryEmailAddress(deliveryEmailAddress: JsonField<String>) = apply {
                    this.deliveryEmailAddress = deliveryEmailAddress
                }

                /**
                 * The delivery time frame for the merchandise. Maps to EMV 3DS field
                 * deliveryTimeframe.
                 */
                fun deliveryTimeFrame(deliveryTimeFrame: DeliveryTimeFrame?) =
                    deliveryTimeFrame(JsonField.ofNullable(deliveryTimeFrame))

                /**
                 * Sets [Builder.deliveryTimeFrame] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.deliveryTimeFrame] with a well-typed
                 * [DeliveryTimeFrame] value instead. This method is primarily for setting the field
                 * to an undocumented or not yet supported value.
                 */
                fun deliveryTimeFrame(deliveryTimeFrame: JsonField<DeliveryTimeFrame>) = apply {
                    this.deliveryTimeFrame = deliveryTimeFrame
                }

                /**
                 * In prepaid or gift card purchase transactions, purchase amount total in major
                 * units (e.g., a purchase of USD $205.10 would be 205). Maps to EMV 3DS field
                 * giftCardAmount.
                 */
                fun giftCardAmount(giftCardAmount: Long?) =
                    giftCardAmount(JsonField.ofNullable(giftCardAmount))

                /**
                 * Alias for [Builder.giftCardAmount].
                 *
                 * This unboxed primitive overload exists for backwards compatibility.
                 */
                fun giftCardAmount(giftCardAmount: Long) = giftCardAmount(giftCardAmount as Long?)

                /**
                 * Sets [Builder.giftCardAmount] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.giftCardAmount] with a well-typed [Long] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun giftCardAmount(giftCardAmount: JsonField<Long>) = apply {
                    this.giftCardAmount = giftCardAmount
                }

                /**
                 * In prepaid or gift card purchase transactions, count of individual prepaid or
                 * gift cards/codes purchased. Maps to EMV 3DS field giftCardCount.
                 */
                fun giftCardCount(giftCardCount: Long?) =
                    giftCardCount(JsonField.ofNullable(giftCardCount))

                /**
                 * Alias for [Builder.giftCardCount].
                 *
                 * This unboxed primitive overload exists for backwards compatibility.
                 */
                fun giftCardCount(giftCardCount: Long) = giftCardCount(giftCardCount as Long?)

                /**
                 * Sets [Builder.giftCardCount] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.giftCardCount] with a well-typed [Long] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun giftCardCount(giftCardCount: JsonField<Long>) = apply {
                    this.giftCardCount = giftCardCount
                }

                /**
                 * In prepaid or gift card purchase transactions, currency code of the gift card.
                 * Maps to EMV 3DS field giftCardCurr.
                 */
                fun giftCardCurrency(giftCardCurrency: String?) =
                    giftCardCurrency(JsonField.ofNullable(giftCardCurrency))

                /**
                 * Sets [Builder.giftCardCurrency] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.giftCardCurrency] with a well-typed [String]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun giftCardCurrency(giftCardCurrency: JsonField<String>) = apply {
                    this.giftCardCurrency = giftCardCurrency
                }

                /**
                 * Indicates whether the purchase is for merchandise that is available now or at a
                 * future date. Maps to EMV 3DS field preOrderPurchaseInd.
                 */
                fun orderAvailability(orderAvailability: OrderAvailability?) =
                    orderAvailability(JsonField.ofNullable(orderAvailability))

                /**
                 * Sets [Builder.orderAvailability] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.orderAvailability] with a well-typed
                 * [OrderAvailability] value instead. This method is primarily for setting the field
                 * to an undocumented or not yet supported value.
                 */
                fun orderAvailability(orderAvailability: JsonField<OrderAvailability>) = apply {
                    this.orderAvailability = orderAvailability
                }

                /**
                 * In pre-order purchase transactions, the expected date that the merchandise will
                 * be available. Maps to EMV 3DS field preOrderDate.
                 */
                fun preOrderAvailableDate(preOrderAvailableDate: OffsetDateTime?) =
                    preOrderAvailableDate(JsonField.ofNullable(preOrderAvailableDate))

                /**
                 * Sets [Builder.preOrderAvailableDate] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.preOrderAvailableDate] with a well-typed
                 * [OffsetDateTime] value instead. This method is primarily for setting the field to
                 * an undocumented or not yet supported value.
                 */
                fun preOrderAvailableDate(preOrderAvailableDate: JsonField<OffsetDateTime>) =
                    apply {
                        this.preOrderAvailableDate = preOrderAvailableDate
                    }

                /**
                 * Indicates whether the cardholder is reordering previously purchased merchandise.
                 * Maps to EMV 3DS field reorderItemsInd.
                 */
                fun reorderItems(reorderItems: ReorderItems?) =
                    reorderItems(JsonField.ofNullable(reorderItems))

                /**
                 * Sets [Builder.reorderItems] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.reorderItems] with a well-typed [ReorderItems]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun reorderItems(reorderItems: JsonField<ReorderItems>) = apply {
                    this.reorderItems = reorderItems
                }

                /**
                 * Shipping method that the cardholder chose for the transaction. If purchase
                 * includes one or more item, this indicator is used for the physical goods; if the
                 * purchase only includes digital goods, this indicator is used to describe the most
                 * expensive item purchased. Maps to EMV 3DS field shipIndicator.
                 */
                fun shippingMethod(shippingMethod: ShippingMethod?) =
                    shippingMethod(JsonField.ofNullable(shippingMethod))

                /**
                 * Sets [Builder.shippingMethod] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.shippingMethod] with a well-typed
                 * [ShippingMethod] value instead. This method is primarily for setting the field to
                 * an undocumented or not yet supported value.
                 */
                fun shippingMethod(shippingMethod: JsonField<ShippingMethod>) = apply {
                    this.shippingMethod = shippingMethod
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
                 * Returns an immutable instance of [RiskIndicator].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
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
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): RiskIndicator = apply {
                if (validated) {
                    return@apply
                }

                deliveryEmailAddress()
                deliveryTimeFrame()?.validate()
                giftCardAmount()
                giftCardCount()
                giftCardCurrency()
                orderAvailability()?.validate()
                preOrderAvailableDate()
                reorderItems()?.validate()
                shippingMethod()?.validate()
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
                (if (deliveryEmailAddress.asKnown() == null) 0 else 1) +
                    (deliveryTimeFrame.asKnown()?.validity() ?: 0) +
                    (if (giftCardAmount.asKnown() == null) 0 else 1) +
                    (if (giftCardCount.asKnown() == null) 0 else 1) +
                    (if (giftCardCurrency.asKnown() == null) 0 else 1) +
                    (orderAvailability.asKnown()?.validity() ?: 0) +
                    (if (preOrderAvailableDate.asKnown() == null) 0 else 1) +
                    (reorderItems.asKnown()?.validity() ?: 0) +
                    (shippingMethod.asKnown()?.validity() ?: 0)

            /**
             * The delivery time frame for the merchandise. Maps to EMV 3DS field deliveryTimeframe.
             */
            class DeliveryTimeFrame
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

                    val ELECTRONIC_DELIVERY = of("ELECTRONIC_DELIVERY")

                    val OVERNIGHT_SHIPPING = of("OVERNIGHT_SHIPPING")

                    val SAME_DAY_SHIPPING = of("SAME_DAY_SHIPPING")

                    val TWO_DAY_OR_MORE_SHIPPING = of("TWO_DAY_OR_MORE_SHIPPING")

                    fun of(value: String) = DeliveryTimeFrame(JsonField.of(value))
                }

                /** An enum containing [DeliveryTimeFrame]'s known values. */
                enum class Known {
                    ELECTRONIC_DELIVERY,
                    OVERNIGHT_SHIPPING,
                    SAME_DAY_SHIPPING,
                    TWO_DAY_OR_MORE_SHIPPING,
                }

                /**
                 * An enum containing [DeliveryTimeFrame]'s known values, as well as an [_UNKNOWN]
                 * member.
                 *
                 * An instance of [DeliveryTimeFrame] can contain an unknown value in a couple of
                 * cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    ELECTRONIC_DELIVERY,
                    OVERNIGHT_SHIPPING,
                    SAME_DAY_SHIPPING,
                    TWO_DAY_OR_MORE_SHIPPING,
                    /**
                     * An enum member indicating that [DeliveryTimeFrame] was instantiated with an
                     * unknown value.
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
                        ELECTRONIC_DELIVERY -> Value.ELECTRONIC_DELIVERY
                        OVERNIGHT_SHIPPING -> Value.OVERNIGHT_SHIPPING
                        SAME_DAY_SHIPPING -> Value.SAME_DAY_SHIPPING
                        TWO_DAY_OR_MORE_SHIPPING -> Value.TWO_DAY_OR_MORE_SHIPPING
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
                        ELECTRONIC_DELIVERY -> Known.ELECTRONIC_DELIVERY
                        OVERNIGHT_SHIPPING -> Known.OVERNIGHT_SHIPPING
                        SAME_DAY_SHIPPING -> Known.SAME_DAY_SHIPPING
                        TWO_DAY_OR_MORE_SHIPPING -> Known.TWO_DAY_OR_MORE_SHIPPING
                        else ->
                            throw LithicInvalidDataException("Unknown DeliveryTimeFrame: $value")
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

                fun validate(): DeliveryTimeFrame = apply {
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

                    return /* spotless:off */ other is DeliveryTimeFrame && value == other.value /* spotless:on */
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            /**
             * Indicates whether the purchase is for merchandise that is available now or at a
             * future date. Maps to EMV 3DS field preOrderPurchaseInd.
             */
            class OrderAvailability
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

                    val FUTURE_AVAILABILITY = of("FUTURE_AVAILABILITY")

                    val MERCHANDISE_AVAILABLE = of("MERCHANDISE_AVAILABLE")

                    fun of(value: String) = OrderAvailability(JsonField.of(value))
                }

                /** An enum containing [OrderAvailability]'s known values. */
                enum class Known {
                    FUTURE_AVAILABILITY,
                    MERCHANDISE_AVAILABLE,
                }

                /**
                 * An enum containing [OrderAvailability]'s known values, as well as an [_UNKNOWN]
                 * member.
                 *
                 * An instance of [OrderAvailability] can contain an unknown value in a couple of
                 * cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    FUTURE_AVAILABILITY,
                    MERCHANDISE_AVAILABLE,
                    /**
                     * An enum member indicating that [OrderAvailability] was instantiated with an
                     * unknown value.
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
                        FUTURE_AVAILABILITY -> Value.FUTURE_AVAILABILITY
                        MERCHANDISE_AVAILABLE -> Value.MERCHANDISE_AVAILABLE
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
                        FUTURE_AVAILABILITY -> Known.FUTURE_AVAILABILITY
                        MERCHANDISE_AVAILABLE -> Known.MERCHANDISE_AVAILABLE
                        else ->
                            throw LithicInvalidDataException("Unknown OrderAvailability: $value")
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

                fun validate(): OrderAvailability = apply {
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

                    return /* spotless:off */ other is OrderAvailability && value == other.value /* spotless:on */
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            /**
             * Indicates whether the cardholder is reordering previously purchased merchandise. Maps
             * to EMV 3DS field reorderItemsInd.
             */
            class ReorderItems
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

                    val FIRST_TIME_ORDERED = of("FIRST_TIME_ORDERED")

                    val REORDERED = of("REORDERED")

                    fun of(value: String) = ReorderItems(JsonField.of(value))
                }

                /** An enum containing [ReorderItems]'s known values. */
                enum class Known {
                    FIRST_TIME_ORDERED,
                    REORDERED,
                }

                /**
                 * An enum containing [ReorderItems]'s known values, as well as an [_UNKNOWN]
                 * member.
                 *
                 * An instance of [ReorderItems] can contain an unknown value in a couple of cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    FIRST_TIME_ORDERED,
                    REORDERED,
                    /**
                     * An enum member indicating that [ReorderItems] was instantiated with an
                     * unknown value.
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
                        FIRST_TIME_ORDERED -> Value.FIRST_TIME_ORDERED
                        REORDERED -> Value.REORDERED
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
                        FIRST_TIME_ORDERED -> Known.FIRST_TIME_ORDERED
                        REORDERED -> Known.REORDERED
                        else -> throw LithicInvalidDataException("Unknown ReorderItems: $value")
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

                fun validate(): ReorderItems = apply {
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

                    return /* spotless:off */ other is ReorderItems && value == other.value /* spotless:on */
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            /**
             * Shipping method that the cardholder chose for the transaction. If purchase includes
             * one or more item, this indicator is used for the physical goods; if the purchase only
             * includes digital goods, this indicator is used to describe the most expensive item
             * purchased. Maps to EMV 3DS field shipIndicator.
             */
            class ShippingMethod
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

                    val DIGITAL_GOODS = of("DIGITAL_GOODS")

                    val LOCKER_DELIVERY = of("LOCKER_DELIVERY")

                    val OTHER = of("OTHER")

                    val PICK_UP_AND_GO_DELIVERY = of("PICK_UP_AND_GO_DELIVERY")

                    val SHIP_TO_BILLING_ADDRESS = of("SHIP_TO_BILLING_ADDRESS")

                    val SHIP_TO_NON_BILLING_ADDRESS = of("SHIP_TO_NON_BILLING_ADDRESS")

                    val SHIP_TO_OTHER_VERIFIED_ADDRESS = of("SHIP_TO_OTHER_VERIFIED_ADDRESS")

                    val SHIP_TO_STORE = of("SHIP_TO_STORE")

                    val TRAVEL_AND_EVENT_TICKETS = of("TRAVEL_AND_EVENT_TICKETS")

                    fun of(value: String) = ShippingMethod(JsonField.of(value))
                }

                /** An enum containing [ShippingMethod]'s known values. */
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

                /**
                 * An enum containing [ShippingMethod]'s known values, as well as an [_UNKNOWN]
                 * member.
                 *
                 * An instance of [ShippingMethod] can contain an unknown value in a couple of
                 * cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
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
                    /**
                     * An enum member indicating that [ShippingMethod] was instantiated with an
                     * unknown value.
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

                fun validate(): ShippingMethod = apply {
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

                    return /* spotless:off */ other is ShippingMethod && value == other.value /* spotless:on */
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
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

            return /* spotless:off */ other is Merchant && id == other.id && country == other.country && mcc == other.mcc && name == other.name && riskIndicator == other.riskIndicator && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(id, country, mcc, name, riskIndicator, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Merchant{id=$id, country=$country, mcc=$mcc, name=$name, riskIndicator=$riskIndicator, additionalProperties=$additionalProperties}"
    }

    /**
     * Either PAYMENT_AUTHENTICATION or NON_PAYMENT_AUTHENTICATION. For NON_PAYMENT_AUTHENTICATION,
     * additional_data and transaction fields are not populated.
     */
    class MessageCategory @JsonCreator private constructor(private val value: JsonField<String>) :
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

            val NON_PAYMENT_AUTHENTICATION = of("NON_PAYMENT_AUTHENTICATION")

            val PAYMENT_AUTHENTICATION = of("PAYMENT_AUTHENTICATION")

            fun of(value: String) = MessageCategory(JsonField.of(value))
        }

        /** An enum containing [MessageCategory]'s known values. */
        enum class Known {
            NON_PAYMENT_AUTHENTICATION,
            PAYMENT_AUTHENTICATION,
        }

        /**
         * An enum containing [MessageCategory]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [MessageCategory] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            NON_PAYMENT_AUTHENTICATION,
            PAYMENT_AUTHENTICATION,
            /**
             * An enum member indicating that [MessageCategory] was instantiated with an unknown
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
                NON_PAYMENT_AUTHENTICATION -> Value.NON_PAYMENT_AUTHENTICATION
                PAYMENT_AUTHENTICATION -> Value.PAYMENT_AUTHENTICATION
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
                NON_PAYMENT_AUTHENTICATION -> Known.NON_PAYMENT_AUTHENTICATION
                PAYMENT_AUTHENTICATION -> Known.PAYMENT_AUTHENTICATION
                else -> throw LithicInvalidDataException("Unknown MessageCategory: $value")
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

        fun validate(): MessageCategory = apply {
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

            return /* spotless:off */ other is MessageCategory && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /**
     * Indicates whether a challenge is requested for this transaction
     * - `NO_PREFERENCE` - No Preference
     * - `NO_CHALLENGE_REQUESTED` - No Challenge Requested
     * - `CHALLENGE_PREFERENCE` - Challenge requested (3DS Requestor preference)
     * - `CHALLENGE_MANDATE` - Challenge requested (Mandate)
     * - `NO_CHALLENGE_RISK_ALREADY_ASSESSED` - No Challenge requested (Transactional risk analysis
     *   is already performed)
     * - `DATA_SHARE_ONLY` - No Challenge requested (Data Share Only)
     * - `OTHER` - Other indicators not captured by above. These are rarely used
     */
    class ThreeDSRequestorChallengeIndicator
    @JsonCreator
    private constructor(private val value: JsonField<String>) : Enum {

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

            val NO_PREFERENCE = of("NO_PREFERENCE")

            val NO_CHALLENGE_REQUESTED = of("NO_CHALLENGE_REQUESTED")

            val CHALLENGE_PREFERENCE = of("CHALLENGE_PREFERENCE")

            val CHALLENGE_MANDATE = of("CHALLENGE_MANDATE")

            val NO_CHALLENGE_RISK_ALREADY_ASSESSED = of("NO_CHALLENGE_RISK_ALREADY_ASSESSED")

            val DATA_SHARE_ONLY = of("DATA_SHARE_ONLY")

            val OTHER = of("OTHER")

            fun of(value: String) = ThreeDSRequestorChallengeIndicator(JsonField.of(value))
        }

        /** An enum containing [ThreeDSRequestorChallengeIndicator]'s known values. */
        enum class Known {
            NO_PREFERENCE,
            NO_CHALLENGE_REQUESTED,
            CHALLENGE_PREFERENCE,
            CHALLENGE_MANDATE,
            NO_CHALLENGE_RISK_ALREADY_ASSESSED,
            DATA_SHARE_ONLY,
            OTHER,
        }

        /**
         * An enum containing [ThreeDSRequestorChallengeIndicator]'s known values, as well as an
         * [_UNKNOWN] member.
         *
         * An instance of [ThreeDSRequestorChallengeIndicator] can contain an unknown value in a
         * couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            NO_PREFERENCE,
            NO_CHALLENGE_REQUESTED,
            CHALLENGE_PREFERENCE,
            CHALLENGE_MANDATE,
            NO_CHALLENGE_RISK_ALREADY_ASSESSED,
            DATA_SHARE_ONLY,
            OTHER,
            /**
             * An enum member indicating that [ThreeDSRequestorChallengeIndicator] was instantiated
             * with an unknown value.
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
                NO_PREFERENCE -> Value.NO_PREFERENCE
                NO_CHALLENGE_REQUESTED -> Value.NO_CHALLENGE_REQUESTED
                CHALLENGE_PREFERENCE -> Value.CHALLENGE_PREFERENCE
                CHALLENGE_MANDATE -> Value.CHALLENGE_MANDATE
                NO_CHALLENGE_RISK_ALREADY_ASSESSED -> Value.NO_CHALLENGE_RISK_ALREADY_ASSESSED
                DATA_SHARE_ONLY -> Value.DATA_SHARE_ONLY
                OTHER -> Value.OTHER
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
                NO_PREFERENCE -> Known.NO_PREFERENCE
                NO_CHALLENGE_REQUESTED -> Known.NO_CHALLENGE_REQUESTED
                CHALLENGE_PREFERENCE -> Known.CHALLENGE_PREFERENCE
                CHALLENGE_MANDATE -> Known.CHALLENGE_MANDATE
                NO_CHALLENGE_RISK_ALREADY_ASSESSED -> Known.NO_CHALLENGE_RISK_ALREADY_ASSESSED
                DATA_SHARE_ONLY -> Known.DATA_SHARE_ONLY
                OTHER -> Known.OTHER
                else ->
                    throw LithicInvalidDataException(
                        "Unknown ThreeDSRequestorChallengeIndicator: $value"
                    )
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

        fun validate(): ThreeDSRequestorChallengeIndicator = apply {
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

            return /* spotless:off */ other is ThreeDSRequestorChallengeIndicator && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /**
     * Object containing additional data about the 3DS request that is beyond the EMV 3DS standard
     * spec (e.g., specific fields that only certain card networks send but are not required across
     * all 3DS requests).
     */
    class AdditionalData
    private constructor(
        private val networkDecision: JsonField<NetworkDecision>,
        private val networkRiskScore: JsonField<Long>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("network_decision")
            @ExcludeMissing
            networkDecision: JsonField<NetworkDecision> = JsonMissing.of(),
            @JsonProperty("network_risk_score")
            @ExcludeMissing
            networkRiskScore: JsonField<Long> = JsonMissing.of(),
        ) : this(networkDecision, networkRiskScore, mutableMapOf())

        /**
         * Mastercard only: Indicates whether the network would have considered the authentication
         * request to be low risk or not.
         *
         * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun networkDecision(): NetworkDecision? = networkDecision.getNullable("network_decision")

        /**
         * Mastercard only: Assessment by the network of the authentication risk level, with a
         * higher value indicating a higher amount of risk.
         *
         * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun networkRiskScore(): Long? = networkRiskScore.getNullable("network_risk_score")

        /**
         * Returns the raw JSON value of [networkDecision].
         *
         * Unlike [networkDecision], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("network_decision")
        @ExcludeMissing
        fun _networkDecision(): JsonField<NetworkDecision> = networkDecision

        /**
         * Returns the raw JSON value of [networkRiskScore].
         *
         * Unlike [networkRiskScore], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("network_risk_score")
        @ExcludeMissing
        fun _networkRiskScore(): JsonField<Long> = networkRiskScore

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

            /** Returns a mutable builder for constructing an instance of [AdditionalData]. */
            fun builder() = Builder()
        }

        /** A builder for [AdditionalData]. */
        class Builder internal constructor() {

            private var networkDecision: JsonField<NetworkDecision> = JsonMissing.of()
            private var networkRiskScore: JsonField<Long> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(additionalData: AdditionalData) = apply {
                networkDecision = additionalData.networkDecision
                networkRiskScore = additionalData.networkRiskScore
                additionalProperties = additionalData.additionalProperties.toMutableMap()
            }

            /**
             * Mastercard only: Indicates whether the network would have considered the
             * authentication request to be low risk or not.
             */
            fun networkDecision(networkDecision: NetworkDecision?) =
                networkDecision(JsonField.ofNullable(networkDecision))

            /**
             * Sets [Builder.networkDecision] to an arbitrary JSON value.
             *
             * You should usually call [Builder.networkDecision] with a well-typed [NetworkDecision]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun networkDecision(networkDecision: JsonField<NetworkDecision>) = apply {
                this.networkDecision = networkDecision
            }

            /**
             * Mastercard only: Assessment by the network of the authentication risk level, with a
             * higher value indicating a higher amount of risk.
             */
            fun networkRiskScore(networkRiskScore: Long?) =
                networkRiskScore(JsonField.ofNullable(networkRiskScore))

            /**
             * Alias for [Builder.networkRiskScore].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun networkRiskScore(networkRiskScore: Long) =
                networkRiskScore(networkRiskScore as Long?)

            /**
             * Sets [Builder.networkRiskScore] to an arbitrary JSON value.
             *
             * You should usually call [Builder.networkRiskScore] with a well-typed [Long] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun networkRiskScore(networkRiskScore: JsonField<Long>) = apply {
                this.networkRiskScore = networkRiskScore
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
             * Returns an immutable instance of [AdditionalData].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): AdditionalData =
                AdditionalData(
                    networkDecision,
                    networkRiskScore,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): AdditionalData = apply {
            if (validated) {
                return@apply
            }

            networkDecision()?.validate()
            networkRiskScore()
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
            (networkDecision.asKnown()?.validity() ?: 0) +
                (if (networkRiskScore.asKnown() == null) 0 else 1)

        /**
         * Mastercard only: Indicates whether the network would have considered the authentication
         * request to be low risk or not.
         */
        class NetworkDecision
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

                val LOW_RISK = of("LOW_RISK")

                val NOT_LOW_RISK = of("NOT_LOW_RISK")

                fun of(value: String) = NetworkDecision(JsonField.of(value))
            }

            /** An enum containing [NetworkDecision]'s known values. */
            enum class Known {
                LOW_RISK,
                NOT_LOW_RISK,
            }

            /**
             * An enum containing [NetworkDecision]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [NetworkDecision] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                LOW_RISK,
                NOT_LOW_RISK,
                /**
                 * An enum member indicating that [NetworkDecision] was instantiated with an unknown
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
                    LOW_RISK -> Value.LOW_RISK
                    NOT_LOW_RISK -> Value.NOT_LOW_RISK
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
                    LOW_RISK -> Known.LOW_RISK
                    NOT_LOW_RISK -> Known.NOT_LOW_RISK
                    else -> throw LithicInvalidDataException("Unknown NetworkDecision: $value")
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

            fun validate(): NetworkDecision = apply {
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

                return /* spotless:off */ other is NetworkDecision && value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
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
    class App
    private constructor(
        private val deviceInfo: JsonField<String>,
        private val ip: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("device_info")
            @ExcludeMissing
            deviceInfo: JsonField<String> = JsonMissing.of(),
            @JsonProperty("ip") @ExcludeMissing ip: JsonField<String> = JsonMissing.of(),
        ) : this(deviceInfo, ip, mutableMapOf())

        /**
         * Device information gathered from the cardholder's device - JSON name/value pairs that is
         * Base64url encoded. Maps to EMV 3DS field deviceInfo.
         *
         * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun deviceInfo(): String? = deviceInfo.getNullable("device_info")

        /**
         * External IP address used by the app generating the 3DS authentication request. Maps to
         * EMV 3DS field appIp.
         *
         * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun ip(): String? = ip.getNullable("ip")

        /**
         * Returns the raw JSON value of [deviceInfo].
         *
         * Unlike [deviceInfo], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("device_info")
        @ExcludeMissing
        fun _deviceInfo(): JsonField<String> = deviceInfo

        /**
         * Returns the raw JSON value of [ip].
         *
         * Unlike [ip], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("ip") @ExcludeMissing fun _ip(): JsonField<String> = ip

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

            /** Returns a mutable builder for constructing an instance of [App]. */
            fun builder() = Builder()
        }

        /** A builder for [App]. */
        class Builder internal constructor() {

            private var deviceInfo: JsonField<String> = JsonMissing.of()
            private var ip: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(app: App) = apply {
                deviceInfo = app.deviceInfo
                ip = app.ip
                additionalProperties = app.additionalProperties.toMutableMap()
            }

            /**
             * Device information gathered from the cardholder's device - JSON name/value pairs that
             * is Base64url encoded. Maps to EMV 3DS field deviceInfo.
             */
            fun deviceInfo(deviceInfo: String?) = deviceInfo(JsonField.ofNullable(deviceInfo))

            /**
             * Sets [Builder.deviceInfo] to an arbitrary JSON value.
             *
             * You should usually call [Builder.deviceInfo] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun deviceInfo(deviceInfo: JsonField<String>) = apply { this.deviceInfo = deviceInfo }

            /**
             * External IP address used by the app generating the 3DS authentication request. Maps
             * to EMV 3DS field appIp.
             */
            fun ip(ip: String) = ip(JsonField.of(ip))

            /**
             * Sets [Builder.ip] to an arbitrary JSON value.
             *
             * You should usually call [Builder.ip] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun ip(ip: JsonField<String>) = apply { this.ip = ip }

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
             * Returns an immutable instance of [App].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): App = App(deviceInfo, ip, additionalProperties.toMutableMap())
        }

        private var validated: Boolean = false

        fun validate(): App = apply {
            if (validated) {
                return@apply
            }

            deviceInfo()
            ip()
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
            (if (deviceInfo.asKnown() == null) 0 else 1) + (if (ip.asKnown() == null) 0 else 1)

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

    /**
     * Type of authentication request - i.e., the type of transaction or interaction is causing the
     * merchant to request an authentication. Maps to EMV 3DS field
     * threeDSRequestorAuthenticationInd.
     */
    class AuthenticationRequestType
    @JsonCreator
    private constructor(private val value: JsonField<String>) : Enum {

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

            val ADD_CARD = of("ADD_CARD")

            val BILLING_AGREEMENT = of("BILLING_AGREEMENT")

            val DELAYED_SHIPMENT = of("DELAYED_SHIPMENT")

            val EMV_TOKEN_CARDHOLDER_VERIFICATION = of("EMV_TOKEN_CARDHOLDER_VERIFICATION")

            val INSTALLMENT_TRANSACTION = of("INSTALLMENT_TRANSACTION")

            val MAINTAIN_CARD = of("MAINTAIN_CARD")

            val PAYMENT_TRANSACTION = of("PAYMENT_TRANSACTION")

            val RECURRING_TRANSACTION = of("RECURRING_TRANSACTION")

            val SPLIT_PAYMENT = of("SPLIT_PAYMENT")

            val SPLIT_SHIPMENT = of("SPLIT_SHIPMENT")

            fun of(value: String) = AuthenticationRequestType(JsonField.of(value))
        }

        /** An enum containing [AuthenticationRequestType]'s known values. */
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

        /**
         * An enum containing [AuthenticationRequestType]'s known values, as well as an [_UNKNOWN]
         * member.
         *
         * An instance of [AuthenticationRequestType] can contain an unknown value in a couple of
         * cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
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
            /**
             * An enum member indicating that [AuthenticationRequestType] was instantiated with an
             * unknown value.
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

        fun validate(): AuthenticationRequestType = apply {
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

            return /* spotless:off */ other is AuthenticationRequestType && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /**
     * Object containing data about the browser used in the e-commerce transaction. Present if the
     * channel is 'BROWSER'.
     */
    class Browser
    private constructor(
        private val ip: JsonField<String>,
        private val javaEnabled: JsonField<Boolean>,
        private val javascriptEnabled: JsonField<Boolean>,
        private val language: JsonField<String>,
        private val timeZone: JsonField<String>,
        private val userAgent: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("ip") @ExcludeMissing ip: JsonField<String> = JsonMissing.of(),
            @JsonProperty("java_enabled")
            @ExcludeMissing
            javaEnabled: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("javascript_enabled")
            @ExcludeMissing
            javascriptEnabled: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("language")
            @ExcludeMissing
            language: JsonField<String> = JsonMissing.of(),
            @JsonProperty("time_zone")
            @ExcludeMissing
            timeZone: JsonField<String> = JsonMissing.of(),
            @JsonProperty("user_agent")
            @ExcludeMissing
            userAgent: JsonField<String> = JsonMissing.of(),
        ) : this(ip, javaEnabled, javascriptEnabled, language, timeZone, userAgent, mutableMapOf())

        /**
         * IP address of the browser as returned by the HTTP headers to the 3DS requestor (e.g.,
         * merchant or digital wallet). Maps to EMV 3DS field browserIP.
         *
         * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun ip(): String? = ip.getNullable("ip")

        /**
         * Indicates whether the cardholder's browser has the ability to execute Java. Maps to EMV
         * 3DS field browserJavaEnabled.
         *
         * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun javaEnabled(): Boolean? = javaEnabled.getNullable("java_enabled")

        /**
         * Indicates whether the cardholder's browser has the ability to execute JavaScript. Maps to
         * EMV 3DS field browserJavascriptEnabled.
         *
         * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun javascriptEnabled(): Boolean? = javascriptEnabled.getNullable("javascript_enabled")

        /**
         * Language of the cardholder's browser as defined in IETF BCP47. Maps to EMV 3DS field
         * browserLanguage.
         *
         * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun language(): String? = language.getNullable("language")

        /**
         * Time zone of the cardholder's browser offset in minutes between UTC and the cardholder
         * browser's local time. The offset is positive if the local time is behind UTC and negative
         * if it is ahead. Maps to EMV 3DS field browserTz.
         *
         * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun timeZone(): String? = timeZone.getNullable("time_zone")

        /**
         * Content of the HTTP user-agent header. Maps to EMV 3DS field browserUserAgent.
         *
         * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun userAgent(): String? = userAgent.getNullable("user_agent")

        /**
         * Returns the raw JSON value of [ip].
         *
         * Unlike [ip], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("ip") @ExcludeMissing fun _ip(): JsonField<String> = ip

        /**
         * Returns the raw JSON value of [javaEnabled].
         *
         * Unlike [javaEnabled], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("java_enabled")
        @ExcludeMissing
        fun _javaEnabled(): JsonField<Boolean> = javaEnabled

        /**
         * Returns the raw JSON value of [javascriptEnabled].
         *
         * Unlike [javascriptEnabled], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("javascript_enabled")
        @ExcludeMissing
        fun _javascriptEnabled(): JsonField<Boolean> = javascriptEnabled

        /**
         * Returns the raw JSON value of [language].
         *
         * Unlike [language], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("language") @ExcludeMissing fun _language(): JsonField<String> = language

        /**
         * Returns the raw JSON value of [timeZone].
         *
         * Unlike [timeZone], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("time_zone") @ExcludeMissing fun _timeZone(): JsonField<String> = timeZone

        /**
         * Returns the raw JSON value of [userAgent].
         *
         * Unlike [userAgent], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("user_agent") @ExcludeMissing fun _userAgent(): JsonField<String> = userAgent

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

            /** Returns a mutable builder for constructing an instance of [Browser]. */
            fun builder() = Builder()
        }

        /** A builder for [Browser]. */
        class Builder internal constructor() {

            private var ip: JsonField<String> = JsonMissing.of()
            private var javaEnabled: JsonField<Boolean> = JsonMissing.of()
            private var javascriptEnabled: JsonField<Boolean> = JsonMissing.of()
            private var language: JsonField<String> = JsonMissing.of()
            private var timeZone: JsonField<String> = JsonMissing.of()
            private var userAgent: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(browser: Browser) = apply {
                ip = browser.ip
                javaEnabled = browser.javaEnabled
                javascriptEnabled = browser.javascriptEnabled
                language = browser.language
                timeZone = browser.timeZone
                userAgent = browser.userAgent
                additionalProperties = browser.additionalProperties.toMutableMap()
            }

            /**
             * IP address of the browser as returned by the HTTP headers to the 3DS requestor (e.g.,
             * merchant or digital wallet). Maps to EMV 3DS field browserIP.
             */
            fun ip(ip: String?) = ip(JsonField.ofNullable(ip))

            /**
             * Sets [Builder.ip] to an arbitrary JSON value.
             *
             * You should usually call [Builder.ip] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun ip(ip: JsonField<String>) = apply { this.ip = ip }

            /**
             * Indicates whether the cardholder's browser has the ability to execute Java. Maps to
             * EMV 3DS field browserJavaEnabled.
             */
            fun javaEnabled(javaEnabled: Boolean?) = javaEnabled(JsonField.ofNullable(javaEnabled))

            /**
             * Alias for [Builder.javaEnabled].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun javaEnabled(javaEnabled: Boolean) = javaEnabled(javaEnabled as Boolean?)

            /**
             * Sets [Builder.javaEnabled] to an arbitrary JSON value.
             *
             * You should usually call [Builder.javaEnabled] with a well-typed [Boolean] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun javaEnabled(javaEnabled: JsonField<Boolean>) = apply {
                this.javaEnabled = javaEnabled
            }

            /**
             * Indicates whether the cardholder's browser has the ability to execute JavaScript.
             * Maps to EMV 3DS field browserJavascriptEnabled.
             */
            fun javascriptEnabled(javascriptEnabled: Boolean?) =
                javascriptEnabled(JsonField.ofNullable(javascriptEnabled))

            /**
             * Alias for [Builder.javascriptEnabled].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun javascriptEnabled(javascriptEnabled: Boolean) =
                javascriptEnabled(javascriptEnabled as Boolean?)

            /**
             * Sets [Builder.javascriptEnabled] to an arbitrary JSON value.
             *
             * You should usually call [Builder.javascriptEnabled] with a well-typed [Boolean] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun javascriptEnabled(javascriptEnabled: JsonField<Boolean>) = apply {
                this.javascriptEnabled = javascriptEnabled
            }

            /**
             * Language of the cardholder's browser as defined in IETF BCP47. Maps to EMV 3DS field
             * browserLanguage.
             */
            fun language(language: String?) = language(JsonField.ofNullable(language))

            /**
             * Sets [Builder.language] to an arbitrary JSON value.
             *
             * You should usually call [Builder.language] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun language(language: JsonField<String>) = apply { this.language = language }

            /**
             * Time zone of the cardholder's browser offset in minutes between UTC and the
             * cardholder browser's local time. The offset is positive if the local time is behind
             * UTC and negative if it is ahead. Maps to EMV 3DS field browserTz.
             */
            fun timeZone(timeZone: String?) = timeZone(JsonField.ofNullable(timeZone))

            /**
             * Sets [Builder.timeZone] to an arbitrary JSON value.
             *
             * You should usually call [Builder.timeZone] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun timeZone(timeZone: JsonField<String>) = apply { this.timeZone = timeZone }

            /** Content of the HTTP user-agent header. Maps to EMV 3DS field browserUserAgent. */
            fun userAgent(userAgent: String?) = userAgent(JsonField.ofNullable(userAgent))

            /**
             * Sets [Builder.userAgent] to an arbitrary JSON value.
             *
             * You should usually call [Builder.userAgent] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun userAgent(userAgent: JsonField<String>) = apply { this.userAgent = userAgent }

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
             * Returns an immutable instance of [Browser].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Browser =
                Browser(
                    ip,
                    javaEnabled,
                    javascriptEnabled,
                    language,
                    timeZone,
                    userAgent,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Browser = apply {
            if (validated) {
                return@apply
            }

            ip()
            javaEnabled()
            javascriptEnabled()
            language()
            timeZone()
            userAgent()
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
            (if (ip.asKnown() == null) 0 else 1) +
                (if (javaEnabled.asKnown() == null) 0 else 1) +
                (if (javascriptEnabled.asKnown() == null) 0 else 1) +
                (if (language.asKnown() == null) 0 else 1) +
                (if (timeZone.asKnown() == null) 0 else 1) +
                (if (userAgent.asKnown() == null) 0 else 1)

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

    /** Metadata about the challenge method and delivery. */
    class ChallengeMetadata
    private constructor(
        private val methodType: JsonField<MethodType>,
        private val phoneNumber: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("method_type")
            @ExcludeMissing
            methodType: JsonField<MethodType> = JsonMissing.of(),
            @JsonProperty("phone_number")
            @ExcludeMissing
            phoneNumber: JsonField<String> = JsonMissing.of(),
        ) : this(methodType, phoneNumber, mutableMapOf())

        /**
         * The type of challenge method used for authentication.
         *
         * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun methodType(): MethodType = methodType.getRequired("method_type")

        /**
         * The phone number used for delivering the OTP. Relevant only for SMS_OTP method.
         *
         * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun phoneNumber(): String? = phoneNumber.getNullable("phone_number")

        /**
         * Returns the raw JSON value of [methodType].
         *
         * Unlike [methodType], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("method_type")
        @ExcludeMissing
        fun _methodType(): JsonField<MethodType> = methodType

        /**
         * Returns the raw JSON value of [phoneNumber].
         *
         * Unlike [phoneNumber], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("phone_number")
        @ExcludeMissing
        fun _phoneNumber(): JsonField<String> = phoneNumber

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
             * Returns a mutable builder for constructing an instance of [ChallengeMetadata].
             *
             * The following fields are required:
             * ```kotlin
             * .methodType()
             * ```
             */
            fun builder() = Builder()
        }

        /** A builder for [ChallengeMetadata]. */
        class Builder internal constructor() {

            private var methodType: JsonField<MethodType>? = null
            private var phoneNumber: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(challengeMetadata: ChallengeMetadata) = apply {
                methodType = challengeMetadata.methodType
                phoneNumber = challengeMetadata.phoneNumber
                additionalProperties = challengeMetadata.additionalProperties.toMutableMap()
            }

            /** The type of challenge method used for authentication. */
            fun methodType(methodType: MethodType) = methodType(JsonField.of(methodType))

            /**
             * Sets [Builder.methodType] to an arbitrary JSON value.
             *
             * You should usually call [Builder.methodType] with a well-typed [MethodType] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun methodType(methodType: JsonField<MethodType>) = apply {
                this.methodType = methodType
            }

            /** The phone number used for delivering the OTP. Relevant only for SMS_OTP method. */
            fun phoneNumber(phoneNumber: String?) = phoneNumber(JsonField.ofNullable(phoneNumber))

            /**
             * Sets [Builder.phoneNumber] to an arbitrary JSON value.
             *
             * You should usually call [Builder.phoneNumber] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun phoneNumber(phoneNumber: JsonField<String>) = apply {
                this.phoneNumber = phoneNumber
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
             * Returns an immutable instance of [ChallengeMetadata].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```kotlin
             * .methodType()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): ChallengeMetadata =
                ChallengeMetadata(
                    checkRequired("methodType", methodType),
                    phoneNumber,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): ChallengeMetadata = apply {
            if (validated) {
                return@apply
            }

            methodType().validate()
            phoneNumber()
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
            (methodType.asKnown()?.validity() ?: 0) + (if (phoneNumber.asKnown() == null) 0 else 1)

        /** The type of challenge method used for authentication. */
        class MethodType @JsonCreator private constructor(private val value: JsonField<String>) :
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

                val SMS_OTP = of("SMS_OTP")

                val OUT_OF_BAND = of("OUT_OF_BAND")

                fun of(value: String) = MethodType(JsonField.of(value))
            }

            /** An enum containing [MethodType]'s known values. */
            enum class Known {
                SMS_OTP,
                OUT_OF_BAND,
            }

            /**
             * An enum containing [MethodType]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [MethodType] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                SMS_OTP,
                OUT_OF_BAND,
                /**
                 * An enum member indicating that [MethodType] was instantiated with an unknown
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
                    SMS_OTP -> Value.SMS_OTP
                    OUT_OF_BAND -> Value.OUT_OF_BAND
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
                    SMS_OTP -> Known.SMS_OTP
                    OUT_OF_BAND -> Known.OUT_OF_BAND
                    else -> throw LithicInvalidDataException("Unknown MethodType: $value")
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

            fun validate(): MethodType = apply {
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

                return /* spotless:off */ other is MethodType && value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is ChallengeMetadata && methodType == other.methodType && phoneNumber == other.phoneNumber && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(methodType, phoneNumber, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "ChallengeMetadata{methodType=$methodType, phoneNumber=$phoneNumber, additionalProperties=$additionalProperties}"
    }

    /** Entity that orchestrates the challenge. */
    class ChallengeOrchestratedBy
    @JsonCreator
    private constructor(private val value: JsonField<String>) : Enum {

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

            val LITHIC = of("LITHIC")

            val CUSTOMER = of("CUSTOMER")

            val NO_CHALLENGE = of("NO_CHALLENGE")

            fun of(value: String) = ChallengeOrchestratedBy(JsonField.of(value))
        }

        /** An enum containing [ChallengeOrchestratedBy]'s known values. */
        enum class Known {
            LITHIC,
            CUSTOMER,
            NO_CHALLENGE,
        }

        /**
         * An enum containing [ChallengeOrchestratedBy]'s known values, as well as an [_UNKNOWN]
         * member.
         *
         * An instance of [ChallengeOrchestratedBy] can contain an unknown value in a couple of
         * cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            LITHIC,
            CUSTOMER,
            NO_CHALLENGE,
            /**
             * An enum member indicating that [ChallengeOrchestratedBy] was instantiated with an
             * unknown value.
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
                LITHIC -> Value.LITHIC
                CUSTOMER -> Value.CUSTOMER
                NO_CHALLENGE -> Value.NO_CHALLENGE
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
                LITHIC -> Known.LITHIC
                CUSTOMER -> Known.CUSTOMER
                NO_CHALLENGE -> Known.NO_CHALLENGE
                else -> throw LithicInvalidDataException("Unknown ChallengeOrchestratedBy: $value")
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

        fun validate(): ChallengeOrchestratedBy = apply {
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

            return /* spotless:off */ other is ChallengeOrchestratedBy && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /** Entity that made the authentication decision. */
    class DecisionMadeBy @JsonCreator private constructor(private val value: JsonField<String>) :
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

            val CUSTOMER_ENDPOINT = of("CUSTOMER_ENDPOINT")

            val LITHIC_DEFAULT = of("LITHIC_DEFAULT")

            val LITHIC_RULES = of("LITHIC_RULES")

            val NETWORK = of("NETWORK")

            val UNKNOWN = of("UNKNOWN")

            fun of(value: String) = DecisionMadeBy(JsonField.of(value))
        }

        /** An enum containing [DecisionMadeBy]'s known values. */
        enum class Known {
            CUSTOMER_ENDPOINT,
            LITHIC_DEFAULT,
            LITHIC_RULES,
            NETWORK,
            UNKNOWN,
        }

        /**
         * An enum containing [DecisionMadeBy]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [DecisionMadeBy] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            CUSTOMER_ENDPOINT,
            LITHIC_DEFAULT,
            LITHIC_RULES,
            NETWORK,
            UNKNOWN,
            /**
             * An enum member indicating that [DecisionMadeBy] was instantiated with an unknown
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
                CUSTOMER_ENDPOINT -> Value.CUSTOMER_ENDPOINT
                LITHIC_DEFAULT -> Value.LITHIC_DEFAULT
                LITHIC_RULES -> Value.LITHIC_RULES
                NETWORK -> Value.NETWORK
                UNKNOWN -> Value.UNKNOWN
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
                CUSTOMER_ENDPOINT -> Known.CUSTOMER_ENDPOINT
                LITHIC_DEFAULT -> Known.LITHIC_DEFAULT
                LITHIC_RULES -> Known.LITHIC_RULES
                NETWORK -> Known.NETWORK
                UNKNOWN -> Known.UNKNOWN
                else -> throw LithicInvalidDataException("Unknown DecisionMadeBy: $value")
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

        fun validate(): DecisionMadeBy = apply {
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

            return /* spotless:off */ other is DecisionMadeBy && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /**
     * Type of 3DS Requestor Initiated (3RI) request i.e., a 3DS authentication that takes place at
     * the initiation of the merchant rather than the cardholder. The most common example of this is
     * where a merchant is authenticating before billing for a recurring transaction such as a pay
     * TV subscription or a utility bill. Maps to EMV 3DS field threeRIInd.
     */
    class ThreeRiRequestType
    @JsonCreator
    private constructor(private val value: JsonField<String>) : Enum {

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

            val ACCOUNT_VERIFICATION = of("ACCOUNT_VERIFICATION")

            val ADD_CARD = of("ADD_CARD")

            val BILLING_AGREEMENT = of("BILLING_AGREEMENT")

            val CARD_SECURITY_CODE_STATUS_CHECK = of("CARD_SECURITY_CODE_STATUS_CHECK")

            val DELAYED_SHIPMENT = of("DELAYED_SHIPMENT")

            val DEVICE_BINDING_STATUS_CHECK = of("DEVICE_BINDING_STATUS_CHECK")

            val INSTALLMENT_TRANSACTION = of("INSTALLMENT_TRANSACTION")

            val MAIL_ORDER = of("MAIL_ORDER")

            val MAINTAIN_CARD_INFO = of("MAINTAIN_CARD_INFO")

            val OTHER_PAYMENT = of("OTHER_PAYMENT")

            val RECURRING_TRANSACTION = of("RECURRING_TRANSACTION")

            val SPLIT_PAYMENT = of("SPLIT_PAYMENT")

            val SPLIT_SHIPMENT = of("SPLIT_SHIPMENT")

            val TELEPHONE_ORDER = of("TELEPHONE_ORDER")

            val TOP_UP = of("TOP_UP")

            val TRUST_LIST_STATUS_CHECK = of("TRUST_LIST_STATUS_CHECK")

            fun of(value: String) = ThreeRiRequestType(JsonField.of(value))
        }

        /** An enum containing [ThreeRiRequestType]'s known values. */
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

        /**
         * An enum containing [ThreeRiRequestType]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [ThreeRiRequestType] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
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
            /**
             * An enum member indicating that [ThreeRiRequestType] was instantiated with an unknown
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

        fun validate(): ThreeRiRequestType = apply {
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

            return /* spotless:off */ other is ThreeRiRequestType && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /**
     * Object containing data about the e-commerce transaction for which the merchant is requesting
     * authentication.
     */
    class Transaction
    private constructor(
        private val amount: JsonField<Double>,
        private val currency: JsonField<String>,
        private val currencyExponent: JsonField<Double>,
        private val dateTime: JsonField<OffsetDateTime>,
        private val type: JsonField<Type>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("amount") @ExcludeMissing amount: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("currency")
            @ExcludeMissing
            currency: JsonField<String> = JsonMissing.of(),
            @JsonProperty("currency_exponent")
            @ExcludeMissing
            currencyExponent: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("date_time")
            @ExcludeMissing
            dateTime: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("type") @ExcludeMissing type: JsonField<Type> = JsonMissing.of(),
        ) : this(amount, currency, currencyExponent, dateTime, type, mutableMapOf())

        /**
         * Amount of the purchase in minor units of currency with all punctuation removed. Maps to
         * EMV 3DS field purchaseAmount.
         *
         * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun amount(): Double = amount.getRequired("amount")

        /**
         * Currency of the purchase. Maps to EMV 3DS field purchaseCurrency.
         *
         * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun currency(): String = currency.getRequired("currency")

        /**
         * Minor units of currency, as specified in ISO 4217 currency exponent. Maps to EMV 3DS
         * field purchaseExponent.
         *
         * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun currencyExponent(): Double = currencyExponent.getRequired("currency_exponent")

        /**
         * Date and time when the authentication was generated by the merchant/acquirer's 3DS
         * server. Maps to EMV 3DS field purchaseDate.
         *
         * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun dateTime(): OffsetDateTime = dateTime.getRequired("date_time")

        /**
         * Type of the transaction for which a 3DS authentication request is occurring. Maps to EMV
         * 3DS field transType.
         *
         * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun type(): Type? = type.getNullable("type")

        /**
         * Returns the raw JSON value of [amount].
         *
         * Unlike [amount], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("amount") @ExcludeMissing fun _amount(): JsonField<Double> = amount

        /**
         * Returns the raw JSON value of [currency].
         *
         * Unlike [currency], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("currency") @ExcludeMissing fun _currency(): JsonField<String> = currency

        /**
         * Returns the raw JSON value of [currencyExponent].
         *
         * Unlike [currencyExponent], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("currency_exponent")
        @ExcludeMissing
        fun _currencyExponent(): JsonField<Double> = currencyExponent

        /**
         * Returns the raw JSON value of [dateTime].
         *
         * Unlike [dateTime], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("date_time")
        @ExcludeMissing
        fun _dateTime(): JsonField<OffsetDateTime> = dateTime

        /**
         * Returns the raw JSON value of [type].
         *
         * Unlike [type], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

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
             * Returns a mutable builder for constructing an instance of [Transaction].
             *
             * The following fields are required:
             * ```kotlin
             * .amount()
             * .currency()
             * .currencyExponent()
             * .dateTime()
             * .type()
             * ```
             */
            fun builder() = Builder()
        }

        /** A builder for [Transaction]. */
        class Builder internal constructor() {

            private var amount: JsonField<Double>? = null
            private var currency: JsonField<String>? = null
            private var currencyExponent: JsonField<Double>? = null
            private var dateTime: JsonField<OffsetDateTime>? = null
            private var type: JsonField<Type>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(transaction: Transaction) = apply {
                amount = transaction.amount
                currency = transaction.currency
                currencyExponent = transaction.currencyExponent
                dateTime = transaction.dateTime
                type = transaction.type
                additionalProperties = transaction.additionalProperties.toMutableMap()
            }

            /**
             * Amount of the purchase in minor units of currency with all punctuation removed. Maps
             * to EMV 3DS field purchaseAmount.
             */
            fun amount(amount: Double) = amount(JsonField.of(amount))

            /**
             * Sets [Builder.amount] to an arbitrary JSON value.
             *
             * You should usually call [Builder.amount] with a well-typed [Double] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun amount(amount: JsonField<Double>) = apply { this.amount = amount }

            /** Currency of the purchase. Maps to EMV 3DS field purchaseCurrency. */
            fun currency(currency: String) = currency(JsonField.of(currency))

            /**
             * Sets [Builder.currency] to an arbitrary JSON value.
             *
             * You should usually call [Builder.currency] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun currency(currency: JsonField<String>) = apply { this.currency = currency }

            /**
             * Minor units of currency, as specified in ISO 4217 currency exponent. Maps to EMV 3DS
             * field purchaseExponent.
             */
            fun currencyExponent(currencyExponent: Double) =
                currencyExponent(JsonField.of(currencyExponent))

            /**
             * Sets [Builder.currencyExponent] to an arbitrary JSON value.
             *
             * You should usually call [Builder.currencyExponent] with a well-typed [Double] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun currencyExponent(currencyExponent: JsonField<Double>) = apply {
                this.currencyExponent = currencyExponent
            }

            /**
             * Date and time when the authentication was generated by the merchant/acquirer's 3DS
             * server. Maps to EMV 3DS field purchaseDate.
             */
            fun dateTime(dateTime: OffsetDateTime) = dateTime(JsonField.of(dateTime))

            /**
             * Sets [Builder.dateTime] to an arbitrary JSON value.
             *
             * You should usually call [Builder.dateTime] with a well-typed [OffsetDateTime] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun dateTime(dateTime: JsonField<OffsetDateTime>) = apply { this.dateTime = dateTime }

            /**
             * Type of the transaction for which a 3DS authentication request is occurring. Maps to
             * EMV 3DS field transType.
             */
            fun type(type: Type?) = type(JsonField.ofNullable(type))

            /**
             * Sets [Builder.type] to an arbitrary JSON value.
             *
             * You should usually call [Builder.type] with a well-typed [Type] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun type(type: JsonField<Type>) = apply { this.type = type }

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
             * Returns an immutable instance of [Transaction].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```kotlin
             * .amount()
             * .currency()
             * .currencyExponent()
             * .dateTime()
             * .type()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Transaction =
                Transaction(
                    checkRequired("amount", amount),
                    checkRequired("currency", currency),
                    checkRequired("currencyExponent", currencyExponent),
                    checkRequired("dateTime", dateTime),
                    checkRequired("type", type),
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Transaction = apply {
            if (validated) {
                return@apply
            }

            amount()
            currency()
            currencyExponent()
            dateTime()
            type()?.validate()
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
            (if (amount.asKnown() == null) 0 else 1) +
                (if (currency.asKnown() == null) 0 else 1) +
                (if (currencyExponent.asKnown() == null) 0 else 1) +
                (if (dateTime.asKnown() == null) 0 else 1) +
                (type.asKnown()?.validity() ?: 0)

        /**
         * Type of the transaction for which a 3DS authentication request is occurring. Maps to EMV
         * 3DS field transType.
         */
        class Type @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

                val ACCOUNT_FUNDING = of("ACCOUNT_FUNDING")

                val CHECK_ACCEPTANCE = of("CHECK_ACCEPTANCE")

                val GOODS_SERVICE_PURCHASE = of("GOODS_SERVICE_PURCHASE")

                val PREPAID_ACTIVATION_AND_LOAD = of("PREPAID_ACTIVATION_AND_LOAD")

                val QUASI_CASH_TRANSACTION = of("QUASI_CASH_TRANSACTION")

                fun of(value: String) = Type(JsonField.of(value))
            }

            /** An enum containing [Type]'s known values. */
            enum class Known {
                ACCOUNT_FUNDING,
                CHECK_ACCEPTANCE,
                GOODS_SERVICE_PURCHASE,
                PREPAID_ACTIVATION_AND_LOAD,
                QUASI_CASH_TRANSACTION,
            }

            /**
             * An enum containing [Type]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [Type] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                ACCOUNT_FUNDING,
                CHECK_ACCEPTANCE,
                GOODS_SERVICE_PURCHASE,
                PREPAID_ACTIVATION_AND_LOAD,
                QUASI_CASH_TRANSACTION,
                /** An enum member indicating that [Type] was instantiated with an unknown value. */
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
                    ACCOUNT_FUNDING -> Value.ACCOUNT_FUNDING
                    CHECK_ACCEPTANCE -> Value.CHECK_ACCEPTANCE
                    GOODS_SERVICE_PURCHASE -> Value.GOODS_SERVICE_PURCHASE
                    PREPAID_ACTIVATION_AND_LOAD -> Value.PREPAID_ACTIVATION_AND_LOAD
                    QUASI_CASH_TRANSACTION -> Value.QUASI_CASH_TRANSACTION
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
                    ACCOUNT_FUNDING -> Known.ACCOUNT_FUNDING
                    CHECK_ACCEPTANCE -> Known.CHECK_ACCEPTANCE
                    GOODS_SERVICE_PURCHASE -> Known.GOODS_SERVICE_PURCHASE
                    PREPAID_ACTIVATION_AND_LOAD -> Known.PREPAID_ACTIVATION_AND_LOAD
                    QUASI_CASH_TRANSACTION -> Known.QUASI_CASH_TRANSACTION
                    else -> throw LithicInvalidDataException("Unknown Type: $value")
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

            fun validate(): Type = apply {
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

                return /* spotless:off */ other is Type && value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
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

        return /* spotless:off */ other is AuthenticationRetrieveResponse && token == other.token && accountType == other.accountType && authenticationResult == other.authenticationResult && cardExpiryCheck == other.cardExpiryCheck && cardToken == other.cardToken && cardholder == other.cardholder && channel == other.channel && created == other.created && merchant == other.merchant && messageCategory == other.messageCategory && threeDSRequestorChallengeIndicator == other.threeDSRequestorChallengeIndicator && additionalData == other.additionalData && app == other.app && authenticationRequestType == other.authenticationRequestType && browser == other.browser && challengeMetadata == other.challengeMetadata && challengeOrchestratedBy == other.challengeOrchestratedBy && decisionMadeBy == other.decisionMadeBy && threeRiRequestType == other.threeRiRequestType && transaction == other.transaction && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(token, accountType, authenticationResult, cardExpiryCheck, cardToken, cardholder, channel, created, merchant, messageCategory, threeDSRequestorChallengeIndicator, additionalData, app, authenticationRequestType, browser, challengeMetadata, challengeOrchestratedBy, decisionMadeBy, threeRiRequestType, transaction, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "AuthenticationRetrieveResponse{token=$token, accountType=$accountType, authenticationResult=$authenticationResult, cardExpiryCheck=$cardExpiryCheck, cardToken=$cardToken, cardholder=$cardholder, channel=$channel, created=$created, merchant=$merchant, messageCategory=$messageCategory, threeDSRequestorChallengeIndicator=$threeDSRequestorChallengeIndicator, additionalData=$additionalData, app=$app, authenticationRequestType=$authenticationRequestType, browser=$browser, challengeMetadata=$challengeMetadata, challengeOrchestratedBy=$challengeOrchestratedBy, decisionMadeBy=$decisionMadeBy, threeRiRequestType=$threeRiRequestType, transaction=$transaction, additionalProperties=$additionalProperties}"
}
