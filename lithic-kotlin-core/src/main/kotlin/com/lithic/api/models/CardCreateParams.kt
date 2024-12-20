// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.lithic.api.core.Enum
import com.lithic.api.core.ExcludeMissing
import com.lithic.api.core.JsonField
import com.lithic.api.core.JsonValue
import com.lithic.api.core.NoAutoDetect
import com.lithic.api.core.http.Headers
import com.lithic.api.core.http.QueryParams
import com.lithic.api.core.immutableEmptyMap
import com.lithic.api.core.toImmutable
import com.lithic.api.errors.LithicInvalidDataException
import java.util.Objects

class CardCreateParams
constructor(
    private val type: Type,
    private val accountToken: String?,
    private val cardProgramToken: String?,
    private val carrier: Carrier?,
    private val digitalCardArtToken: String?,
    private val expMonth: String?,
    private val expYear: String?,
    private val memo: String?,
    private val pin: String?,
    private val productId: String?,
    private val replacementAccountToken: String?,
    private val replacementFor: String?,
    private val shippingAddress: ShippingAddress?,
    private val shippingMethod: ShippingMethod?,
    private val spendLimit: Long?,
    private val spendLimitDuration: SpendLimitDuration?,
    private val state: State?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
    private val additionalBodyProperties: Map<String, JsonValue>,
) {

    fun type(): Type = type

    fun accountToken(): String? = accountToken

    fun cardProgramToken(): String? = cardProgramToken

    fun carrier(): Carrier? = carrier

    fun digitalCardArtToken(): String? = digitalCardArtToken

    fun expMonth(): String? = expMonth

    fun expYear(): String? = expYear

    fun memo(): String? = memo

    fun pin(): String? = pin

    fun productId(): String? = productId

    fun replacementAccountToken(): String? = replacementAccountToken

    fun replacementFor(): String? = replacementFor

    fun shippingAddress(): ShippingAddress? = shippingAddress

    fun shippingMethod(): ShippingMethod? = shippingMethod

    fun spendLimit(): Long? = spendLimit

    fun spendLimitDuration(): SpendLimitDuration? = spendLimitDuration

    fun state(): State? = state

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun _additionalBodyProperties(): Map<String, JsonValue> = additionalBodyProperties

    internal fun getBody(): CardCreateBody {
        return CardCreateBody(
            type,
            accountToken,
            cardProgramToken,
            carrier,
            digitalCardArtToken,
            expMonth,
            expYear,
            memo,
            pin,
            productId,
            replacementAccountToken,
            replacementFor,
            shippingAddress,
            shippingMethod,
            spendLimit,
            spendLimitDuration,
            state,
            additionalBodyProperties,
        )
    }

    internal fun getHeaders(): Headers = additionalHeaders

    internal fun getQueryParams(): QueryParams = additionalQueryParams

    @NoAutoDetect
    class CardCreateBody
    @JsonCreator
    internal constructor(
        @JsonProperty("type") private val type: Type,
        @JsonProperty("account_token") private val accountToken: String?,
        @JsonProperty("card_program_token") private val cardProgramToken: String?,
        @JsonProperty("carrier") private val carrier: Carrier?,
        @JsonProperty("digital_card_art_token") private val digitalCardArtToken: String?,
        @JsonProperty("exp_month") private val expMonth: String?,
        @JsonProperty("exp_year") private val expYear: String?,
        @JsonProperty("memo") private val memo: String?,
        @JsonProperty("pin") private val pin: String?,
        @JsonProperty("product_id") private val productId: String?,
        @JsonProperty("replacement_account_token") private val replacementAccountToken: String?,
        @JsonProperty("replacement_for") private val replacementFor: String?,
        @JsonProperty("shipping_address") private val shippingAddress: ShippingAddress?,
        @JsonProperty("shipping_method") private val shippingMethod: ShippingMethod?,
        @JsonProperty("spend_limit") private val spendLimit: Long?,
        @JsonProperty("spend_limit_duration") private val spendLimitDuration: SpendLimitDuration?,
        @JsonProperty("state") private val state: State?,
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /**
         * Card types:
         * - `VIRTUAL` - Card will authorize at any merchant and can be added to a digital wallet
         *   like Apple Pay or Google Pay (if the card program is digital wallet-enabled).
         * - `PHYSICAL` - Manufactured and sent to the cardholder. We offer white label branding,
         *   credit, ATM, PIN debit, chip/EMV, NFC and magstripe functionality. Reach out at
         *   [lithic.com/contact](https://lithic.com/contact) for more information.
         * - `SINGLE_USE` - Card is closed upon first successful authorization.
         * - `MERCHANT_LOCKED` - _[Deprecated]_ Card is locked to the first merchant that
         *   successfully authorizes the card.
         * - `UNLOCKED` - _[Deprecated]_ Similar behavior to VIRTUAL cards, please use VIRTUAL
         *   instead.
         * - `DIGITAL_WALLET` - _[Deprecated]_ Similar behavior to VIRTUAL cards, please use VIRTUAL
         *   instead.
         */
        @JsonProperty("type") fun type(): Type = type

        /**
         * Globally unique identifier for the account that the card will be associated with.
         * Required for programs enrolling users using the
         * [/account_holders endpoint](https://docs.lithic.com/docs/account-holders-kyc). See
         * [Managing Your Program](doc:managing-your-program) for more information.
         */
        @JsonProperty("account_token") fun accountToken(): String? = accountToken

        /**
         * For card programs with more than one BIN range. This must be configured with Lithic
         * before use. Identifies the card program/BIN range under which to create the card. If
         * omitted, will utilize the program's default `card_program_token`. In Sandbox, use
         * 00000000-0000-0000-1000-000000000000 and 00000000-0000-0000-2000-000000000000 to test
         * creating cards on specific card programs.
         */
        @JsonProperty("card_program_token") fun cardProgramToken(): String? = cardProgramToken

        @JsonProperty("carrier") fun carrier(): Carrier? = carrier

        /**
         * Specifies the digital card art to be displayed in the user’s digital wallet after
         * tokenization. This artwork must be approved by Mastercard and configured by Lithic to
         * use. See
         * [Flexible Card Art Guide](https://docs.lithic.com/docs/about-digital-wallets#flexible-card-art).
         */
        @JsonProperty("digital_card_art_token")
        fun digitalCardArtToken(): String? = digitalCardArtToken

        /**
         * Two digit (MM) expiry month. If neither `exp_month` nor `exp_year` is provided, an
         * expiration date will be generated.
         */
        @JsonProperty("exp_month") fun expMonth(): String? = expMonth

        /**
         * Four digit (yyyy) expiry year. If neither `exp_month` nor `exp_year` is provided, an
         * expiration date will be generated.
         */
        @JsonProperty("exp_year") fun expYear(): String? = expYear

        /** Friendly name to identify the card. */
        @JsonProperty("memo") fun memo(): String? = memo

        /**
         * Encrypted PIN block (in base64). Applies to cards of type `PHYSICAL` and `VIRTUAL`. See
         * [Encrypted PIN Block](https://docs.lithic.com/docs/cards#encrypted-pin-block).
         */
        @JsonProperty("pin") fun pin(): String? = pin

        /**
         * Only applicable to cards of type `PHYSICAL`. This must be configured with Lithic before
         * use. Specifies the configuration (i.e., physical card art) that the card should be
         * manufactured with.
         */
        @JsonProperty("product_id") fun productId(): String? = productId

        /**
         * Restricted field limited to select use cases. Lithic will reach out directly if this
         * field should be used. Globally unique identifier for the replacement card's account. If
         * this field is specified, `replacement_for` must also be specified. If `replacement_for`
         * is specified and this field is omitted, the replacement card's account will be inferred
         * from the card being replaced.
         */
        @JsonProperty("replacement_account_token")
        fun replacementAccountToken(): String? = replacementAccountToken

        /**
         * Globally unique identifier for the card that this card will replace. If the card type is
         * `PHYSICAL` it will be replaced by a `PHYSICAL` card. If the card type is `VIRTUAL` it
         * will be replaced by a `VIRTUAL` card.
         */
        @JsonProperty("replacement_for") fun replacementFor(): String? = replacementFor

        @JsonProperty("shipping_address") fun shippingAddress(): ShippingAddress? = shippingAddress

        /**
         * Shipping method for the card. Only applies to cards of type PHYSICAL. Use of options
         * besides `STANDARD` require additional permissions.
         * - `STANDARD` - USPS regular mail or similar international option, with no tracking
         * - `STANDARD_WITH_TRACKING` - USPS regular mail or similar international option, with
         *   tracking
         * - `PRIORITY` - USPS Priority, 1-3 day shipping, with tracking
         * - `EXPRESS` - FedEx Express, 3-day shipping, with tracking
         * - `2_DAY` - FedEx 2-day shipping, with tracking
         * - `EXPEDITED` - FedEx Standard Overnight or similar international option, with tracking
         */
        @JsonProperty("shipping_method") fun shippingMethod(): ShippingMethod? = shippingMethod

        /**
         * Amount (in cents) to limit approved authorizations. Transaction requests above the spend
         * limit will be declined. Note that a spend limit of 0 is effectively no limit, and should
         * only be used to reset or remove a prior limit. Only a limit of 1 or above will result in
         * declined transactions due to checks against the card limit.
         */
        @JsonProperty("spend_limit") fun spendLimit(): Long? = spendLimit

        /**
         * Spend limit duration values:
         * - `ANNUALLY` - Card will authorize transactions up to spend limit for the trailing year.
         * - `FOREVER` - Card will authorize only up to spend limit for the entire lifetime of the
         *   card.
         * - `MONTHLY` - Card will authorize transactions up to spend limit for the trailing month.
         *   To support recurring monthly payments, which can occur on different day every month,
         *   the time window we consider for monthly velocity starts 6 days after the current
         *   calendar date one month prior.
         * - `TRANSACTION` - Card will authorize multiple transactions if each individual
         *   transaction is under the spend limit.
         */
        @JsonProperty("spend_limit_duration")
        fun spendLimitDuration(): SpendLimitDuration? = spendLimitDuration

        /**
         * Card state values:
         * - `OPEN` - Card will approve authorizations (if they match card and account parameters).
         * - `PAUSED` - Card will decline authorizations, but can be resumed at a later time.
         */
        @JsonProperty("state") fun state(): State? = state

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var type: Type? = null
            private var accountToken: String? = null
            private var cardProgramToken: String? = null
            private var carrier: Carrier? = null
            private var digitalCardArtToken: String? = null
            private var expMonth: String? = null
            private var expYear: String? = null
            private var memo: String? = null
            private var pin: String? = null
            private var productId: String? = null
            private var replacementAccountToken: String? = null
            private var replacementFor: String? = null
            private var shippingAddress: ShippingAddress? = null
            private var shippingMethod: ShippingMethod? = null
            private var spendLimit: Long? = null
            private var spendLimitDuration: SpendLimitDuration? = null
            private var state: State? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(cardCreateBody: CardCreateBody) = apply {
                type = cardCreateBody.type
                accountToken = cardCreateBody.accountToken
                cardProgramToken = cardCreateBody.cardProgramToken
                carrier = cardCreateBody.carrier
                digitalCardArtToken = cardCreateBody.digitalCardArtToken
                expMonth = cardCreateBody.expMonth
                expYear = cardCreateBody.expYear
                memo = cardCreateBody.memo
                pin = cardCreateBody.pin
                productId = cardCreateBody.productId
                replacementAccountToken = cardCreateBody.replacementAccountToken
                replacementFor = cardCreateBody.replacementFor
                shippingAddress = cardCreateBody.shippingAddress
                shippingMethod = cardCreateBody.shippingMethod
                spendLimit = cardCreateBody.spendLimit
                spendLimitDuration = cardCreateBody.spendLimitDuration
                state = cardCreateBody.state
                additionalProperties = cardCreateBody.additionalProperties.toMutableMap()
            }

            /**
             * Card types:
             * - `VIRTUAL` - Card will authorize at any merchant and can be added to a digital
             *   wallet like Apple Pay or Google Pay (if the card program is digital
             *   wallet-enabled).
             * - `PHYSICAL` - Manufactured and sent to the cardholder. We offer white label
             *   branding, credit, ATM, PIN debit, chip/EMV, NFC and magstripe functionality. Reach
             *   out at [lithic.com/contact](https://lithic.com/contact) for more information.
             * - `SINGLE_USE` - Card is closed upon first successful authorization.
             * - `MERCHANT_LOCKED` - _[Deprecated]_ Card is locked to the first merchant that
             *   successfully authorizes the card.
             * - `UNLOCKED` - _[Deprecated]_ Similar behavior to VIRTUAL cards, please use VIRTUAL
             *   instead.
             * - `DIGITAL_WALLET` - _[Deprecated]_ Similar behavior to VIRTUAL cards, please use
             *   VIRTUAL instead.
             */
            fun type(type: Type) = apply { this.type = type }

            /**
             * Globally unique identifier for the account that the card will be associated with.
             * Required for programs enrolling users using the
             * [/account_holders endpoint](https://docs.lithic.com/docs/account-holders-kyc). See
             * [Managing Your Program](doc:managing-your-program) for more information.
             */
            fun accountToken(accountToken: String?) = apply { this.accountToken = accountToken }

            /**
             * For card programs with more than one BIN range. This must be configured with Lithic
             * before use. Identifies the card program/BIN range under which to create the card. If
             * omitted, will utilize the program's default `card_program_token`. In Sandbox, use
             * 00000000-0000-0000-1000-000000000000 and 00000000-0000-0000-2000-000000000000 to test
             * creating cards on specific card programs.
             */
            fun cardProgramToken(cardProgramToken: String?) = apply {
                this.cardProgramToken = cardProgramToken
            }

            fun carrier(carrier: Carrier?) = apply { this.carrier = carrier }

            /**
             * Specifies the digital card art to be displayed in the user’s digital wallet after
             * tokenization. This artwork must be approved by Mastercard and configured by Lithic to
             * use. See
             * [Flexible Card Art Guide](https://docs.lithic.com/docs/about-digital-wallets#flexible-card-art).
             */
            fun digitalCardArtToken(digitalCardArtToken: String?) = apply {
                this.digitalCardArtToken = digitalCardArtToken
            }

            /**
             * Two digit (MM) expiry month. If neither `exp_month` nor `exp_year` is provided, an
             * expiration date will be generated.
             */
            fun expMonth(expMonth: String?) = apply { this.expMonth = expMonth }

            /**
             * Four digit (yyyy) expiry year. If neither `exp_month` nor `exp_year` is provided, an
             * expiration date will be generated.
             */
            fun expYear(expYear: String?) = apply { this.expYear = expYear }

            /** Friendly name to identify the card. */
            fun memo(memo: String?) = apply { this.memo = memo }

            /**
             * Encrypted PIN block (in base64). Applies to cards of type `PHYSICAL` and `VIRTUAL`.
             * See [Encrypted PIN Block](https://docs.lithic.com/docs/cards#encrypted-pin-block).
             */
            fun pin(pin: String?) = apply { this.pin = pin }

            /**
             * Only applicable to cards of type `PHYSICAL`. This must be configured with Lithic
             * before use. Specifies the configuration (i.e., physical card art) that the card
             * should be manufactured with.
             */
            fun productId(productId: String?) = apply { this.productId = productId }

            /**
             * Restricted field limited to select use cases. Lithic will reach out directly if this
             * field should be used. Globally unique identifier for the replacement card's account.
             * If this field is specified, `replacement_for` must also be specified. If
             * `replacement_for` is specified and this field is omitted, the replacement card's
             * account will be inferred from the card being replaced.
             */
            fun replacementAccountToken(replacementAccountToken: String?) = apply {
                this.replacementAccountToken = replacementAccountToken
            }

            /**
             * Globally unique identifier for the card that this card will replace. If the card type
             * is `PHYSICAL` it will be replaced by a `PHYSICAL` card. If the card type is `VIRTUAL`
             * it will be replaced by a `VIRTUAL` card.
             */
            fun replacementFor(replacementFor: String?) = apply {
                this.replacementFor = replacementFor
            }

            fun shippingAddress(shippingAddress: ShippingAddress?) = apply {
                this.shippingAddress = shippingAddress
            }

            /**
             * Shipping method for the card. Only applies to cards of type PHYSICAL. Use of options
             * besides `STANDARD` require additional permissions.
             * - `STANDARD` - USPS regular mail or similar international option, with no tracking
             * - `STANDARD_WITH_TRACKING` - USPS regular mail or similar international option, with
             *   tracking
             * - `PRIORITY` - USPS Priority, 1-3 day shipping, with tracking
             * - `EXPRESS` - FedEx Express, 3-day shipping, with tracking
             * - `2_DAY` - FedEx 2-day shipping, with tracking
             * - `EXPEDITED` - FedEx Standard Overnight or similar international option, with
             *   tracking
             */
            fun shippingMethod(shippingMethod: ShippingMethod?) = apply {
                this.shippingMethod = shippingMethod
            }

            /**
             * Amount (in cents) to limit approved authorizations. Transaction requests above the
             * spend limit will be declined. Note that a spend limit of 0 is effectively no limit,
             * and should only be used to reset or remove a prior limit. Only a limit of 1 or above
             * will result in declined transactions due to checks against the card limit.
             */
            fun spendLimit(spendLimit: Long?) = apply { this.spendLimit = spendLimit }

            /**
             * Spend limit duration values:
             * - `ANNUALLY` - Card will authorize transactions up to spend limit for the trailing
             *   year.
             * - `FOREVER` - Card will authorize only up to spend limit for the entire lifetime of
             *   the card.
             * - `MONTHLY` - Card will authorize transactions up to spend limit for the trailing
             *   month. To support recurring monthly payments, which can occur on different day
             *   every month, the time window we consider for monthly velocity starts 6 days after
             *   the current calendar date one month prior.
             * - `TRANSACTION` - Card will authorize multiple transactions if each individual
             *   transaction is under the spend limit.
             */
            fun spendLimitDuration(spendLimitDuration: SpendLimitDuration?) = apply {
                this.spendLimitDuration = spendLimitDuration
            }

            /**
             * Card state values:
             * - `OPEN` - Card will approve authorizations (if they match card and account
             *   parameters).
             * - `PAUSED` - Card will decline authorizations, but can be resumed at a later time.
             */
            fun state(state: State?) = apply { this.state = state }

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

            fun build(): CardCreateBody =
                CardCreateBody(
                    checkNotNull(type) { "`type` is required but was not set" },
                    accountToken,
                    cardProgramToken,
                    carrier,
                    digitalCardArtToken,
                    expMonth,
                    expYear,
                    memo,
                    pin,
                    productId,
                    replacementAccountToken,
                    replacementFor,
                    shippingAddress,
                    shippingMethod,
                    spendLimit,
                    spendLimitDuration,
                    state,
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is CardCreateBody && type == other.type && accountToken == other.accountToken && cardProgramToken == other.cardProgramToken && carrier == other.carrier && digitalCardArtToken == other.digitalCardArtToken && expMonth == other.expMonth && expYear == other.expYear && memo == other.memo && pin == other.pin && productId == other.productId && replacementAccountToken == other.replacementAccountToken && replacementFor == other.replacementFor && shippingAddress == other.shippingAddress && shippingMethod == other.shippingMethod && spendLimit == other.spendLimit && spendLimitDuration == other.spendLimitDuration && state == other.state && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(type, accountToken, cardProgramToken, carrier, digitalCardArtToken, expMonth, expYear, memo, pin, productId, replacementAccountToken, replacementFor, shippingAddress, shippingMethod, spendLimit, spendLimitDuration, state, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "CardCreateBody{type=$type, accountToken=$accountToken, cardProgramToken=$cardProgramToken, carrier=$carrier, digitalCardArtToken=$digitalCardArtToken, expMonth=$expMonth, expYear=$expYear, memo=$memo, pin=$pin, productId=$productId, replacementAccountToken=$replacementAccountToken, replacementFor=$replacementFor, shippingAddress=$shippingAddress, shippingMethod=$shippingMethod, spendLimit=$spendLimit, spendLimitDuration=$spendLimitDuration, state=$state, additionalProperties=$additionalProperties}"
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var type: Type? = null
        private var accountToken: String? = null
        private var cardProgramToken: String? = null
        private var carrier: Carrier? = null
        private var digitalCardArtToken: String? = null
        private var expMonth: String? = null
        private var expYear: String? = null
        private var memo: String? = null
        private var pin: String? = null
        private var productId: String? = null
        private var replacementAccountToken: String? = null
        private var replacementFor: String? = null
        private var shippingAddress: ShippingAddress? = null
        private var shippingMethod: ShippingMethod? = null
        private var spendLimit: Long? = null
        private var spendLimitDuration: SpendLimitDuration? = null
        private var state: State? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()
        private var additionalBodyProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(cardCreateParams: CardCreateParams) = apply {
            type = cardCreateParams.type
            accountToken = cardCreateParams.accountToken
            cardProgramToken = cardCreateParams.cardProgramToken
            carrier = cardCreateParams.carrier
            digitalCardArtToken = cardCreateParams.digitalCardArtToken
            expMonth = cardCreateParams.expMonth
            expYear = cardCreateParams.expYear
            memo = cardCreateParams.memo
            pin = cardCreateParams.pin
            productId = cardCreateParams.productId
            replacementAccountToken = cardCreateParams.replacementAccountToken
            replacementFor = cardCreateParams.replacementFor
            shippingAddress = cardCreateParams.shippingAddress
            shippingMethod = cardCreateParams.shippingMethod
            spendLimit = cardCreateParams.spendLimit
            spendLimitDuration = cardCreateParams.spendLimitDuration
            state = cardCreateParams.state
            additionalHeaders = cardCreateParams.additionalHeaders.toBuilder()
            additionalQueryParams = cardCreateParams.additionalQueryParams.toBuilder()
            additionalBodyProperties = cardCreateParams.additionalBodyProperties.toMutableMap()
        }

        /**
         * Card types:
         * - `VIRTUAL` - Card will authorize at any merchant and can be added to a digital wallet
         *   like Apple Pay or Google Pay (if the card program is digital wallet-enabled).
         * - `PHYSICAL` - Manufactured and sent to the cardholder. We offer white label branding,
         *   credit, ATM, PIN debit, chip/EMV, NFC and magstripe functionality. Reach out at
         *   [lithic.com/contact](https://lithic.com/contact) for more information.
         * - `SINGLE_USE` - Card is closed upon first successful authorization.
         * - `MERCHANT_LOCKED` - _[Deprecated]_ Card is locked to the first merchant that
         *   successfully authorizes the card.
         * - `UNLOCKED` - _[Deprecated]_ Similar behavior to VIRTUAL cards, please use VIRTUAL
         *   instead.
         * - `DIGITAL_WALLET` - _[Deprecated]_ Similar behavior to VIRTUAL cards, please use VIRTUAL
         *   instead.
         */
        fun type(type: Type) = apply { this.type = type }

        /**
         * Globally unique identifier for the account that the card will be associated with.
         * Required for programs enrolling users using the
         * [/account_holders endpoint](https://docs.lithic.com/docs/account-holders-kyc). See
         * [Managing Your Program](doc:managing-your-program) for more information.
         */
        fun accountToken(accountToken: String) = apply { this.accountToken = accountToken }

        /**
         * For card programs with more than one BIN range. This must be configured with Lithic
         * before use. Identifies the card program/BIN range under which to create the card. If
         * omitted, will utilize the program's default `card_program_token`. In Sandbox, use
         * 00000000-0000-0000-1000-000000000000 and 00000000-0000-0000-2000-000000000000 to test
         * creating cards on specific card programs.
         */
        fun cardProgramToken(cardProgramToken: String) = apply {
            this.cardProgramToken = cardProgramToken
        }

        fun carrier(carrier: Carrier) = apply { this.carrier = carrier }

        /**
         * Specifies the digital card art to be displayed in the user’s digital wallet after
         * tokenization. This artwork must be approved by Mastercard and configured by Lithic to
         * use. See
         * [Flexible Card Art Guide](https://docs.lithic.com/docs/about-digital-wallets#flexible-card-art).
         */
        fun digitalCardArtToken(digitalCardArtToken: String) = apply {
            this.digitalCardArtToken = digitalCardArtToken
        }

        /**
         * Two digit (MM) expiry month. If neither `exp_month` nor `exp_year` is provided, an
         * expiration date will be generated.
         */
        fun expMonth(expMonth: String) = apply { this.expMonth = expMonth }

        /**
         * Four digit (yyyy) expiry year. If neither `exp_month` nor `exp_year` is provided, an
         * expiration date will be generated.
         */
        fun expYear(expYear: String) = apply { this.expYear = expYear }

        /** Friendly name to identify the card. */
        fun memo(memo: String) = apply { this.memo = memo }

        /**
         * Encrypted PIN block (in base64). Applies to cards of type `PHYSICAL` and `VIRTUAL`. See
         * [Encrypted PIN Block](https://docs.lithic.com/docs/cards#encrypted-pin-block).
         */
        fun pin(pin: String) = apply { this.pin = pin }

        /**
         * Only applicable to cards of type `PHYSICAL`. This must be configured with Lithic before
         * use. Specifies the configuration (i.e., physical card art) that the card should be
         * manufactured with.
         */
        fun productId(productId: String) = apply { this.productId = productId }

        /**
         * Restricted field limited to select use cases. Lithic will reach out directly if this
         * field should be used. Globally unique identifier for the replacement card's account. If
         * this field is specified, `replacement_for` must also be specified. If `replacement_for`
         * is specified and this field is omitted, the replacement card's account will be inferred
         * from the card being replaced.
         */
        fun replacementAccountToken(replacementAccountToken: String) = apply {
            this.replacementAccountToken = replacementAccountToken
        }

        /**
         * Globally unique identifier for the card that this card will replace. If the card type is
         * `PHYSICAL` it will be replaced by a `PHYSICAL` card. If the card type is `VIRTUAL` it
         * will be replaced by a `VIRTUAL` card.
         */
        fun replacementFor(replacementFor: String) = apply { this.replacementFor = replacementFor }

        fun shippingAddress(shippingAddress: ShippingAddress) = apply {
            this.shippingAddress = shippingAddress
        }

        /**
         * Shipping method for the card. Only applies to cards of type PHYSICAL. Use of options
         * besides `STANDARD` require additional permissions.
         * - `STANDARD` - USPS regular mail or similar international option, with no tracking
         * - `STANDARD_WITH_TRACKING` - USPS regular mail or similar international option, with
         *   tracking
         * - `PRIORITY` - USPS Priority, 1-3 day shipping, with tracking
         * - `EXPRESS` - FedEx Express, 3-day shipping, with tracking
         * - `2_DAY` - FedEx 2-day shipping, with tracking
         * - `EXPEDITED` - FedEx Standard Overnight or similar international option, with tracking
         */
        fun shippingMethod(shippingMethod: ShippingMethod) = apply {
            this.shippingMethod = shippingMethod
        }

        /**
         * Amount (in cents) to limit approved authorizations. Transaction requests above the spend
         * limit will be declined. Note that a spend limit of 0 is effectively no limit, and should
         * only be used to reset or remove a prior limit. Only a limit of 1 or above will result in
         * declined transactions due to checks against the card limit.
         */
        fun spendLimit(spendLimit: Long) = apply { this.spendLimit = spendLimit }

        /**
         * Spend limit duration values:
         * - `ANNUALLY` - Card will authorize transactions up to spend limit for the trailing year.
         * - `FOREVER` - Card will authorize only up to spend limit for the entire lifetime of the
         *   card.
         * - `MONTHLY` - Card will authorize transactions up to spend limit for the trailing month.
         *   To support recurring monthly payments, which can occur on different day every month,
         *   the time window we consider for monthly velocity starts 6 days after the current
         *   calendar date one month prior.
         * - `TRANSACTION` - Card will authorize multiple transactions if each individual
         *   transaction is under the spend limit.
         */
        fun spendLimitDuration(spendLimitDuration: SpendLimitDuration) = apply {
            this.spendLimitDuration = spendLimitDuration
        }

        /**
         * Card state values:
         * - `OPEN` - Card will approve authorizations (if they match card and account parameters).
         * - `PAUSED` - Card will decline authorizations, but can be resumed at a later time.
         */
        fun state(state: State) = apply { this.state = state }

        fun additionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun additionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun putAdditionalHeader(name: String, value: String) = apply {
            additionalHeaders.put(name, value)
        }

        fun putAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.put(name, values)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun replaceAdditionalHeaders(name: String, value: String) = apply {
            additionalHeaders.replace(name, value)
        }

        fun replaceAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.replace(name, values)
        }

        fun replaceAllAdditionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun replaceAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun removeAdditionalHeaders(name: String) = apply { additionalHeaders.remove(name) }

        fun removeAllAdditionalHeaders(names: Set<String>) = apply {
            additionalHeaders.removeAll(names)
        }

        fun additionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun additionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun putAdditionalQueryParam(key: String, value: String) = apply {
            additionalQueryParams.put(key, value)
        }

        fun putAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.put(key, values)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.putAll(additionalQueryParams)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.putAll(additionalQueryParams)
            }

        fun replaceAdditionalQueryParams(key: String, value: String) = apply {
            additionalQueryParams.replace(key, value)
        }

        fun replaceAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.replace(key, values)
        }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.replaceAll(additionalQueryParams)
        }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.replaceAll(additionalQueryParams)
            }

        fun removeAdditionalQueryParams(key: String) = apply { additionalQueryParams.remove(key) }

        fun removeAllAdditionalQueryParams(keys: Set<String>) = apply {
            additionalQueryParams.removeAll(keys)
        }

        fun additionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) = apply {
            this.additionalBodyProperties.clear()
            putAllAdditionalBodyProperties(additionalBodyProperties)
        }

        fun putAdditionalBodyProperty(key: String, value: JsonValue) = apply {
            additionalBodyProperties.put(key, value)
        }

        fun putAllAdditionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) =
            apply {
                this.additionalBodyProperties.putAll(additionalBodyProperties)
            }

        fun removeAdditionalBodyProperty(key: String) = apply {
            additionalBodyProperties.remove(key)
        }

        fun removeAllAdditionalBodyProperties(keys: Set<String>) = apply {
            keys.forEach(::removeAdditionalBodyProperty)
        }

        fun build(): CardCreateParams =
            CardCreateParams(
                checkNotNull(type) { "`type` is required but was not set" },
                accountToken,
                cardProgramToken,
                carrier,
                digitalCardArtToken,
                expMonth,
                expYear,
                memo,
                pin,
                productId,
                replacementAccountToken,
                replacementFor,
                shippingAddress,
                shippingMethod,
                spendLimit,
                spendLimitDuration,
                state,
                additionalHeaders.build(),
                additionalQueryParams.build(),
                additionalBodyProperties.toImmutable(),
            )
    }

    class Type
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            val MERCHANT_LOCKED = of("MERCHANT_LOCKED")

            val PHYSICAL = of("PHYSICAL")

            val SINGLE_USE = of("SINGLE_USE")

            val VIRTUAL = of("VIRTUAL")

            val UNLOCKED = of("UNLOCKED")

            val DIGITAL_WALLET = of("DIGITAL_WALLET")

            fun of(value: String) = Type(JsonField.of(value))
        }

        enum class Known {
            MERCHANT_LOCKED,
            PHYSICAL,
            SINGLE_USE,
            VIRTUAL,
            UNLOCKED,
            DIGITAL_WALLET,
        }

        enum class Value {
            MERCHANT_LOCKED,
            PHYSICAL,
            SINGLE_USE,
            VIRTUAL,
            UNLOCKED,
            DIGITAL_WALLET,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                MERCHANT_LOCKED -> Value.MERCHANT_LOCKED
                PHYSICAL -> Value.PHYSICAL
                SINGLE_USE -> Value.SINGLE_USE
                VIRTUAL -> Value.VIRTUAL
                UNLOCKED -> Value.UNLOCKED
                DIGITAL_WALLET -> Value.DIGITAL_WALLET
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                MERCHANT_LOCKED -> Known.MERCHANT_LOCKED
                PHYSICAL -> Known.PHYSICAL
                SINGLE_USE -> Known.SINGLE_USE
                VIRTUAL -> Known.VIRTUAL
                UNLOCKED -> Known.UNLOCKED
                DIGITAL_WALLET -> Known.DIGITAL_WALLET
                else -> throw LithicInvalidDataException("Unknown Type: $value")
            }

        fun asString(): String = _value().asStringOrThrow()

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Type && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    class ShippingMethod
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            val _2_DAY = of("2_DAY")

            val EXPEDITED = of("EXPEDITED")

            val EXPRESS = of("EXPRESS")

            val PRIORITY = of("PRIORITY")

            val STANDARD = of("STANDARD")

            val STANDARD_WITH_TRACKING = of("STANDARD_WITH_TRACKING")

            fun of(value: String) = ShippingMethod(JsonField.of(value))
        }

        enum class Known {
            _2_DAY,
            EXPEDITED,
            EXPRESS,
            PRIORITY,
            STANDARD,
            STANDARD_WITH_TRACKING,
        }

        enum class Value {
            _2_DAY,
            EXPEDITED,
            EXPRESS,
            PRIORITY,
            STANDARD,
            STANDARD_WITH_TRACKING,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                _2_DAY -> Value._2_DAY
                EXPEDITED -> Value.EXPEDITED
                EXPRESS -> Value.EXPRESS
                PRIORITY -> Value.PRIORITY
                STANDARD -> Value.STANDARD
                STANDARD_WITH_TRACKING -> Value.STANDARD_WITH_TRACKING
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                _2_DAY -> Known._2_DAY
                EXPEDITED -> Known.EXPEDITED
                EXPRESS -> Known.EXPRESS
                PRIORITY -> Known.PRIORITY
                STANDARD -> Known.STANDARD
                STANDARD_WITH_TRACKING -> Known.STANDARD_WITH_TRACKING
                else -> throw LithicInvalidDataException("Unknown ShippingMethod: $value")
            }

        fun asString(): String = _value().asStringOrThrow()

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is ShippingMethod && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    class State
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            val OPEN = of("OPEN")

            val PAUSED = of("PAUSED")

            fun of(value: String) = State(JsonField.of(value))
        }

        enum class Known {
            OPEN,
            PAUSED,
        }

        enum class Value {
            OPEN,
            PAUSED,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                OPEN -> Value.OPEN
                PAUSED -> Value.PAUSED
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                OPEN -> Known.OPEN
                PAUSED -> Known.PAUSED
                else -> throw LithicInvalidDataException("Unknown State: $value")
            }

        fun asString(): String = _value().asStringOrThrow()

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is State && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is CardCreateParams && type == other.type && accountToken == other.accountToken && cardProgramToken == other.cardProgramToken && carrier == other.carrier && digitalCardArtToken == other.digitalCardArtToken && expMonth == other.expMonth && expYear == other.expYear && memo == other.memo && pin == other.pin && productId == other.productId && replacementAccountToken == other.replacementAccountToken && replacementFor == other.replacementFor && shippingAddress == other.shippingAddress && shippingMethod == other.shippingMethod && spendLimit == other.spendLimit && spendLimitDuration == other.spendLimitDuration && state == other.state && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams && additionalBodyProperties == other.additionalBodyProperties /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(type, accountToken, cardProgramToken, carrier, digitalCardArtToken, expMonth, expYear, memo, pin, productId, replacementAccountToken, replacementFor, shippingAddress, shippingMethod, spendLimit, spendLimitDuration, state, additionalHeaders, additionalQueryParams, additionalBodyProperties) /* spotless:on */

    override fun toString() =
        "CardCreateParams{type=$type, accountToken=$accountToken, cardProgramToken=$cardProgramToken, carrier=$carrier, digitalCardArtToken=$digitalCardArtToken, expMonth=$expMonth, expYear=$expYear, memo=$memo, pin=$pin, productId=$productId, replacementAccountToken=$replacementAccountToken, replacementFor=$replacementFor, shippingAddress=$shippingAddress, shippingMethod=$shippingMethod, spendLimit=$spendLimit, spendLimitDuration=$spendLimitDuration, state=$state, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams, additionalBodyProperties=$additionalBodyProperties}"
}
