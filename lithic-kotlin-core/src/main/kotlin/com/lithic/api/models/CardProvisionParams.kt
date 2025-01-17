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
import com.lithic.api.core.http.Headers
import com.lithic.api.core.http.QueryParams
import com.lithic.api.core.immutableEmptyMap
import com.lithic.api.core.toImmutable
import com.lithic.api.errors.LithicInvalidDataException
import java.util.Objects

/**
 * Allow your cardholders to directly add payment cards to the device's digital wallet (e.g. Apple
 * Pay) with one touch from your app.
 *
 * This requires some additional setup and configuration. Please
 * [Contact Us](https://lithic.com/contact) or your Customer Success representative for more
 * information.
 */
class CardProvisionParams
constructor(
    private val cardToken: String,
    private val body: CardProvisionBody,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) {

    fun cardToken(): String = cardToken

    /**
     * Only applicable if `digital_wallet` is `APPLE_PAY`. Omit to receive only `activationData` in
     * the response. Apple's public leaf certificate. Base64 encoded in PEM format with headers
     * `(-----BEGIN CERTIFICATE-----)` and trailers omitted. Provided by the device's wallet.
     */
    fun certificate(): String? = body.certificate()

    /**
     * Only applicable if `digital_wallet` is `GOOGLE_PAY` or `SAMSUNG_PAY` and the card is on the
     * Visa network. Stable device identification set by the wallet provider.
     */
    fun clientDeviceId(): String? = body.clientDeviceId()

    /**
     * Only applicable if `digital_wallet` is `GOOGLE_PAY` or `SAMSUNG_PAY` and the card is on the
     * Visa network. Consumer ID that identifies the wallet account holder entity.
     */
    fun clientWalletAccountId(): String? = body.clientWalletAccountId()

    /** Name of digital wallet provider. */
    fun digitalWallet(): DigitalWallet? = body.digitalWallet()

    /**
     * Only applicable if `digital_wallet` is `APPLE_PAY`. Omit to receive only `activationData` in
     * the response. Base64 cryptographic nonce provided by the device's wallet.
     */
    fun nonce(): String? = body.nonce()

    /**
     * Only applicable if `digital_wallet` is `APPLE_PAY`. Omit to receive only `activationData` in
     * the response. Base64 cryptographic nonce provided by the device's wallet.
     */
    fun nonceSignature(): String? = body.nonceSignature()

    /**
     * Only applicable if `digital_wallet` is `APPLE_PAY`. Omit to receive only `activationData` in
     * the response. Apple's public leaf certificate. Base64 encoded in PEM format with headers
     * `(-----BEGIN CERTIFICATE-----)` and trailers omitted. Provided by the device's wallet.
     */
    fun _certificate(): JsonField<String> = body._certificate()

    /**
     * Only applicable if `digital_wallet` is `GOOGLE_PAY` or `SAMSUNG_PAY` and the card is on the
     * Visa network. Stable device identification set by the wallet provider.
     */
    fun _clientDeviceId(): JsonField<String> = body._clientDeviceId()

    /**
     * Only applicable if `digital_wallet` is `GOOGLE_PAY` or `SAMSUNG_PAY` and the card is on the
     * Visa network. Consumer ID that identifies the wallet account holder entity.
     */
    fun _clientWalletAccountId(): JsonField<String> = body._clientWalletAccountId()

    /** Name of digital wallet provider. */
    fun _digitalWallet(): JsonField<DigitalWallet> = body._digitalWallet()

    /**
     * Only applicable if `digital_wallet` is `APPLE_PAY`. Omit to receive only `activationData` in
     * the response. Base64 cryptographic nonce provided by the device's wallet.
     */
    fun _nonce(): JsonField<String> = body._nonce()

    /**
     * Only applicable if `digital_wallet` is `APPLE_PAY`. Omit to receive only `activationData` in
     * the response. Base64 cryptographic nonce provided by the device's wallet.
     */
    fun _nonceSignature(): JsonField<String> = body._nonceSignature()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    internal fun getBody(): CardProvisionBody = body

    internal fun getHeaders(): Headers = additionalHeaders

    internal fun getQueryParams(): QueryParams = additionalQueryParams

    fun getPathParam(index: Int): String {
        return when (index) {
            0 -> cardToken
            else -> ""
        }
    }

    @NoAutoDetect
    class CardProvisionBody
    @JsonCreator
    internal constructor(
        @JsonProperty("certificate")
        @ExcludeMissing
        private val certificate: JsonField<String> = JsonMissing.of(),
        @JsonProperty("client_device_id")
        @ExcludeMissing
        private val clientDeviceId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("client_wallet_account_id")
        @ExcludeMissing
        private val clientWalletAccountId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("digital_wallet")
        @ExcludeMissing
        private val digitalWallet: JsonField<DigitalWallet> = JsonMissing.of(),
        @JsonProperty("nonce")
        @ExcludeMissing
        private val nonce: JsonField<String> = JsonMissing.of(),
        @JsonProperty("nonce_signature")
        @ExcludeMissing
        private val nonceSignature: JsonField<String> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /**
         * Only applicable if `digital_wallet` is `APPLE_PAY`. Omit to receive only `activationData`
         * in the response. Apple's public leaf certificate. Base64 encoded in PEM format with
         * headers `(-----BEGIN CERTIFICATE-----)` and trailers omitted. Provided by the device's
         * wallet.
         */
        fun certificate(): String? = certificate.getNullable("certificate")

        /**
         * Only applicable if `digital_wallet` is `GOOGLE_PAY` or `SAMSUNG_PAY` and the card is on
         * the Visa network. Stable device identification set by the wallet provider.
         */
        fun clientDeviceId(): String? = clientDeviceId.getNullable("client_device_id")

        /**
         * Only applicable if `digital_wallet` is `GOOGLE_PAY` or `SAMSUNG_PAY` and the card is on
         * the Visa network. Consumer ID that identifies the wallet account holder entity.
         */
        fun clientWalletAccountId(): String? =
            clientWalletAccountId.getNullable("client_wallet_account_id")

        /** Name of digital wallet provider. */
        fun digitalWallet(): DigitalWallet? = digitalWallet.getNullable("digital_wallet")

        /**
         * Only applicable if `digital_wallet` is `APPLE_PAY`. Omit to receive only `activationData`
         * in the response. Base64 cryptographic nonce provided by the device's wallet.
         */
        fun nonce(): String? = nonce.getNullable("nonce")

        /**
         * Only applicable if `digital_wallet` is `APPLE_PAY`. Omit to receive only `activationData`
         * in the response. Base64 cryptographic nonce provided by the device's wallet.
         */
        fun nonceSignature(): String? = nonceSignature.getNullable("nonce_signature")

        /**
         * Only applicable if `digital_wallet` is `APPLE_PAY`. Omit to receive only `activationData`
         * in the response. Apple's public leaf certificate. Base64 encoded in PEM format with
         * headers `(-----BEGIN CERTIFICATE-----)` and trailers omitted. Provided by the device's
         * wallet.
         */
        @JsonProperty("certificate")
        @ExcludeMissing
        fun _certificate(): JsonField<String> = certificate

        /**
         * Only applicable if `digital_wallet` is `GOOGLE_PAY` or `SAMSUNG_PAY` and the card is on
         * the Visa network. Stable device identification set by the wallet provider.
         */
        @JsonProperty("client_device_id")
        @ExcludeMissing
        fun _clientDeviceId(): JsonField<String> = clientDeviceId

        /**
         * Only applicable if `digital_wallet` is `GOOGLE_PAY` or `SAMSUNG_PAY` and the card is on
         * the Visa network. Consumer ID that identifies the wallet account holder entity.
         */
        @JsonProperty("client_wallet_account_id")
        @ExcludeMissing
        fun _clientWalletAccountId(): JsonField<String> = clientWalletAccountId

        /** Name of digital wallet provider. */
        @JsonProperty("digital_wallet")
        @ExcludeMissing
        fun _digitalWallet(): JsonField<DigitalWallet> = digitalWallet

        /**
         * Only applicable if `digital_wallet` is `APPLE_PAY`. Omit to receive only `activationData`
         * in the response. Base64 cryptographic nonce provided by the device's wallet.
         */
        @JsonProperty("nonce") @ExcludeMissing fun _nonce(): JsonField<String> = nonce

        /**
         * Only applicable if `digital_wallet` is `APPLE_PAY`. Omit to receive only `activationData`
         * in the response. Base64 cryptographic nonce provided by the device's wallet.
         */
        @JsonProperty("nonce_signature")
        @ExcludeMissing
        fun _nonceSignature(): JsonField<String> = nonceSignature

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): CardProvisionBody = apply {
            if (validated) {
                return@apply
            }

            certificate()
            clientDeviceId()
            clientWalletAccountId()
            digitalWallet()
            nonce()
            nonceSignature()
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var certificate: JsonField<String> = JsonMissing.of()
            private var clientDeviceId: JsonField<String> = JsonMissing.of()
            private var clientWalletAccountId: JsonField<String> = JsonMissing.of()
            private var digitalWallet: JsonField<DigitalWallet> = JsonMissing.of()
            private var nonce: JsonField<String> = JsonMissing.of()
            private var nonceSignature: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(cardProvisionBody: CardProvisionBody) = apply {
                certificate = cardProvisionBody.certificate
                clientDeviceId = cardProvisionBody.clientDeviceId
                clientWalletAccountId = cardProvisionBody.clientWalletAccountId
                digitalWallet = cardProvisionBody.digitalWallet
                nonce = cardProvisionBody.nonce
                nonceSignature = cardProvisionBody.nonceSignature
                additionalProperties = cardProvisionBody.additionalProperties.toMutableMap()
            }

            /**
             * Only applicable if `digital_wallet` is `APPLE_PAY`. Omit to receive only
             * `activationData` in the response. Apple's public leaf certificate. Base64 encoded in
             * PEM format with headers `(-----BEGIN CERTIFICATE-----)` and trailers omitted.
             * Provided by the device's wallet.
             */
            fun certificate(certificate: String) = certificate(JsonField.of(certificate))

            /**
             * Only applicable if `digital_wallet` is `APPLE_PAY`. Omit to receive only
             * `activationData` in the response. Apple's public leaf certificate. Base64 encoded in
             * PEM format with headers `(-----BEGIN CERTIFICATE-----)` and trailers omitted.
             * Provided by the device's wallet.
             */
            fun certificate(certificate: JsonField<String>) = apply {
                this.certificate = certificate
            }

            /**
             * Only applicable if `digital_wallet` is `GOOGLE_PAY` or `SAMSUNG_PAY` and the card is
             * on the Visa network. Stable device identification set by the wallet provider.
             */
            fun clientDeviceId(clientDeviceId: String) =
                clientDeviceId(JsonField.of(clientDeviceId))

            /**
             * Only applicable if `digital_wallet` is `GOOGLE_PAY` or `SAMSUNG_PAY` and the card is
             * on the Visa network. Stable device identification set by the wallet provider.
             */
            fun clientDeviceId(clientDeviceId: JsonField<String>) = apply {
                this.clientDeviceId = clientDeviceId
            }

            /**
             * Only applicable if `digital_wallet` is `GOOGLE_PAY` or `SAMSUNG_PAY` and the card is
             * on the Visa network. Consumer ID that identifies the wallet account holder entity.
             */
            fun clientWalletAccountId(clientWalletAccountId: String) =
                clientWalletAccountId(JsonField.of(clientWalletAccountId))

            /**
             * Only applicable if `digital_wallet` is `GOOGLE_PAY` or `SAMSUNG_PAY` and the card is
             * on the Visa network. Consumer ID that identifies the wallet account holder entity.
             */
            fun clientWalletAccountId(clientWalletAccountId: JsonField<String>) = apply {
                this.clientWalletAccountId = clientWalletAccountId
            }

            /** Name of digital wallet provider. */
            fun digitalWallet(digitalWallet: DigitalWallet) =
                digitalWallet(JsonField.of(digitalWallet))

            /** Name of digital wallet provider. */
            fun digitalWallet(digitalWallet: JsonField<DigitalWallet>) = apply {
                this.digitalWallet = digitalWallet
            }

            /**
             * Only applicable if `digital_wallet` is `APPLE_PAY`. Omit to receive only
             * `activationData` in the response. Base64 cryptographic nonce provided by the device's
             * wallet.
             */
            fun nonce(nonce: String) = nonce(JsonField.of(nonce))

            /**
             * Only applicable if `digital_wallet` is `APPLE_PAY`. Omit to receive only
             * `activationData` in the response. Base64 cryptographic nonce provided by the device's
             * wallet.
             */
            fun nonce(nonce: JsonField<String>) = apply { this.nonce = nonce }

            /**
             * Only applicable if `digital_wallet` is `APPLE_PAY`. Omit to receive only
             * `activationData` in the response. Base64 cryptographic nonce provided by the device's
             * wallet.
             */
            fun nonceSignature(nonceSignature: String) =
                nonceSignature(JsonField.of(nonceSignature))

            /**
             * Only applicable if `digital_wallet` is `APPLE_PAY`. Omit to receive only
             * `activationData` in the response. Base64 cryptographic nonce provided by the device's
             * wallet.
             */
            fun nonceSignature(nonceSignature: JsonField<String>) = apply {
                this.nonceSignature = nonceSignature
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

            fun build(): CardProvisionBody =
                CardProvisionBody(
                    certificate,
                    clientDeviceId,
                    clientWalletAccountId,
                    digitalWallet,
                    nonce,
                    nonceSignature,
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is CardProvisionBody && certificate == other.certificate && clientDeviceId == other.clientDeviceId && clientWalletAccountId == other.clientWalletAccountId && digitalWallet == other.digitalWallet && nonce == other.nonce && nonceSignature == other.nonceSignature && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(certificate, clientDeviceId, clientWalletAccountId, digitalWallet, nonce, nonceSignature, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "CardProvisionBody{certificate=$certificate, clientDeviceId=$clientDeviceId, clientWalletAccountId=$clientWalletAccountId, digitalWallet=$digitalWallet, nonce=$nonce, nonceSignature=$nonceSignature, additionalProperties=$additionalProperties}"
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var cardToken: String? = null
        private var body: CardProvisionBody.Builder = CardProvisionBody.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        internal fun from(cardProvisionParams: CardProvisionParams) = apply {
            cardToken = cardProvisionParams.cardToken
            body = cardProvisionParams.body.toBuilder()
            additionalHeaders = cardProvisionParams.additionalHeaders.toBuilder()
            additionalQueryParams = cardProvisionParams.additionalQueryParams.toBuilder()
        }

        fun cardToken(cardToken: String) = apply { this.cardToken = cardToken }

        /**
         * Only applicable if `digital_wallet` is `APPLE_PAY`. Omit to receive only `activationData`
         * in the response. Apple's public leaf certificate. Base64 encoded in PEM format with
         * headers `(-----BEGIN CERTIFICATE-----)` and trailers omitted. Provided by the device's
         * wallet.
         */
        fun certificate(certificate: String) = apply { body.certificate(certificate) }

        /**
         * Only applicable if `digital_wallet` is `APPLE_PAY`. Omit to receive only `activationData`
         * in the response. Apple's public leaf certificate. Base64 encoded in PEM format with
         * headers `(-----BEGIN CERTIFICATE-----)` and trailers omitted. Provided by the device's
         * wallet.
         */
        fun certificate(certificate: JsonField<String>) = apply { body.certificate(certificate) }

        /**
         * Only applicable if `digital_wallet` is `GOOGLE_PAY` or `SAMSUNG_PAY` and the card is on
         * the Visa network. Stable device identification set by the wallet provider.
         */
        fun clientDeviceId(clientDeviceId: String) = apply { body.clientDeviceId(clientDeviceId) }

        /**
         * Only applicable if `digital_wallet` is `GOOGLE_PAY` or `SAMSUNG_PAY` and the card is on
         * the Visa network. Stable device identification set by the wallet provider.
         */
        fun clientDeviceId(clientDeviceId: JsonField<String>) = apply {
            body.clientDeviceId(clientDeviceId)
        }

        /**
         * Only applicable if `digital_wallet` is `GOOGLE_PAY` or `SAMSUNG_PAY` and the card is on
         * the Visa network. Consumer ID that identifies the wallet account holder entity.
         */
        fun clientWalletAccountId(clientWalletAccountId: String) = apply {
            body.clientWalletAccountId(clientWalletAccountId)
        }

        /**
         * Only applicable if `digital_wallet` is `GOOGLE_PAY` or `SAMSUNG_PAY` and the card is on
         * the Visa network. Consumer ID that identifies the wallet account holder entity.
         */
        fun clientWalletAccountId(clientWalletAccountId: JsonField<String>) = apply {
            body.clientWalletAccountId(clientWalletAccountId)
        }

        /** Name of digital wallet provider. */
        fun digitalWallet(digitalWallet: DigitalWallet) = apply {
            body.digitalWallet(digitalWallet)
        }

        /** Name of digital wallet provider. */
        fun digitalWallet(digitalWallet: JsonField<DigitalWallet>) = apply {
            body.digitalWallet(digitalWallet)
        }

        /**
         * Only applicable if `digital_wallet` is `APPLE_PAY`. Omit to receive only `activationData`
         * in the response. Base64 cryptographic nonce provided by the device's wallet.
         */
        fun nonce(nonce: String) = apply { body.nonce(nonce) }

        /**
         * Only applicable if `digital_wallet` is `APPLE_PAY`. Omit to receive only `activationData`
         * in the response. Base64 cryptographic nonce provided by the device's wallet.
         */
        fun nonce(nonce: JsonField<String>) = apply { body.nonce(nonce) }

        /**
         * Only applicable if `digital_wallet` is `APPLE_PAY`. Omit to receive only `activationData`
         * in the response. Base64 cryptographic nonce provided by the device's wallet.
         */
        fun nonceSignature(nonceSignature: String) = apply { body.nonceSignature(nonceSignature) }

        /**
         * Only applicable if `digital_wallet` is `APPLE_PAY`. Omit to receive only `activationData`
         * in the response. Base64 cryptographic nonce provided by the device's wallet.
         */
        fun nonceSignature(nonceSignature: JsonField<String>) = apply {
            body.nonceSignature(nonceSignature)
        }

        fun additionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) = apply {
            body.additionalProperties(additionalBodyProperties)
        }

        fun putAdditionalBodyProperty(key: String, value: JsonValue) = apply {
            body.putAdditionalProperty(key, value)
        }

        fun putAllAdditionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) =
            apply {
                body.putAllAdditionalProperties(additionalBodyProperties)
            }

        fun removeAdditionalBodyProperty(key: String) = apply { body.removeAdditionalProperty(key) }

        fun removeAllAdditionalBodyProperties(keys: Set<String>) = apply {
            body.removeAllAdditionalProperties(keys)
        }

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

        fun build(): CardProvisionParams =
            CardProvisionParams(
                checkRequired("cardToken", cardToken),
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    /** Name of digital wallet provider. */
    class DigitalWallet
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            val APPLE_PAY = of("APPLE_PAY")

            val GOOGLE_PAY = of("GOOGLE_PAY")

            val SAMSUNG_PAY = of("SAMSUNG_PAY")

            fun of(value: String) = DigitalWallet(JsonField.of(value))
        }

        enum class Known {
            APPLE_PAY,
            GOOGLE_PAY,
            SAMSUNG_PAY,
        }

        enum class Value {
            APPLE_PAY,
            GOOGLE_PAY,
            SAMSUNG_PAY,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                APPLE_PAY -> Value.APPLE_PAY
                GOOGLE_PAY -> Value.GOOGLE_PAY
                SAMSUNG_PAY -> Value.SAMSUNG_PAY
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                APPLE_PAY -> Known.APPLE_PAY
                GOOGLE_PAY -> Known.GOOGLE_PAY
                SAMSUNG_PAY -> Known.SAMSUNG_PAY
                else -> throw LithicInvalidDataException("Unknown DigitalWallet: $value")
            }

        fun asString(): String = _value().asStringOrThrow()

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is DigitalWallet && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is CardProvisionParams && cardToken == other.cardToken && body == other.body && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(cardToken, body, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() =
        "CardProvisionParams{cardToken=$cardToken, body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
