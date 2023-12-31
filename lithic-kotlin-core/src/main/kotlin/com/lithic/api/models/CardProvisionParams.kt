// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.lithic.api.core.ExcludeMissing
import com.lithic.api.core.JsonField
import com.lithic.api.core.JsonValue
import com.lithic.api.core.NoAutoDetect
import com.lithic.api.core.toUnmodifiable
import com.lithic.api.errors.LithicInvalidDataException
import com.lithic.api.models.*
import java.util.Objects

class CardProvisionParams
constructor(
    private val cardToken: String,
    private val certificate: String?,
    private val digitalWallet: DigitalWallet?,
    private val nonce: String?,
    private val nonceSignature: String?,
    private val additionalQueryParams: Map<String, List<String>>,
    private val additionalHeaders: Map<String, List<String>>,
    private val additionalBodyProperties: Map<String, JsonValue>,
) {

    fun cardToken(): String = cardToken

    fun certificate(): String? = certificate

    fun digitalWallet(): DigitalWallet? = digitalWallet

    fun nonce(): String? = nonce

    fun nonceSignature(): String? = nonceSignature

    internal fun getBody(): CardProvisionBody {
        return CardProvisionBody(
            certificate,
            digitalWallet,
            nonce,
            nonceSignature,
            additionalBodyProperties,
        )
    }

    internal fun getQueryParams(): Map<String, List<String>> = additionalQueryParams

    internal fun getHeaders(): Map<String, List<String>> = additionalHeaders

    fun getPathParam(index: Int): String {
        return when (index) {
            0 -> cardToken
            else -> ""
        }
    }

    @JsonDeserialize(builder = CardProvisionBody.Builder::class)
    @NoAutoDetect
    class CardProvisionBody
    internal constructor(
        private val certificate: String?,
        private val digitalWallet: DigitalWallet?,
        private val nonce: String?,
        private val nonceSignature: String?,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var hashCode: Int = 0

        /**
         * Only applicable if `digital_wallet` is `APPLE_PAY`. Omit to receive only `activationData`
         * in the response. Apple's public leaf certificate. Base64 encoded in PEM format with
         * headers `(-----BEGIN CERTIFICATE-----)` and trailers omitted. Provided by the device's
         * wallet.
         */
        @JsonProperty("certificate") fun certificate(): String? = certificate

        /** Name of digital wallet provider. */
        @JsonProperty("digital_wallet") fun digitalWallet(): DigitalWallet? = digitalWallet

        /**
         * Only applicable if `digital_wallet` is `APPLE_PAY`. Omit to receive only `activationData`
         * in the response. Base64 cryptographic nonce provided by the device's wallet.
         */
        @JsonProperty("nonce") fun nonce(): String? = nonce

        /**
         * Only applicable if `digital_wallet` is `APPLE_PAY`. Omit to receive only `activationData`
         * in the response. Base64 cryptographic nonce provided by the device's wallet.
         */
        @JsonProperty("nonce_signature") fun nonceSignature(): String? = nonceSignature

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is CardProvisionBody &&
                this.certificate == other.certificate &&
                this.digitalWallet == other.digitalWallet &&
                this.nonce == other.nonce &&
                this.nonceSignature == other.nonceSignature &&
                this.additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode =
                    Objects.hash(
                        certificate,
                        digitalWallet,
                        nonce,
                        nonceSignature,
                        additionalProperties,
                    )
            }
            return hashCode
        }

        override fun toString() =
            "CardProvisionBody{certificate=$certificate, digitalWallet=$digitalWallet, nonce=$nonce, nonceSignature=$nonceSignature, additionalProperties=$additionalProperties}"

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var certificate: String? = null
            private var digitalWallet: DigitalWallet? = null
            private var nonce: String? = null
            private var nonceSignature: String? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(cardProvisionBody: CardProvisionBody) = apply {
                this.certificate = cardProvisionBody.certificate
                this.digitalWallet = cardProvisionBody.digitalWallet
                this.nonce = cardProvisionBody.nonce
                this.nonceSignature = cardProvisionBody.nonceSignature
                additionalProperties(cardProvisionBody.additionalProperties)
            }

            /**
             * Only applicable if `digital_wallet` is `APPLE_PAY`. Omit to receive only
             * `activationData` in the response. Apple's public leaf certificate. Base64 encoded in
             * PEM format with headers `(-----BEGIN CERTIFICATE-----)` and trailers omitted.
             * Provided by the device's wallet.
             */
            @JsonProperty("certificate")
            fun certificate(certificate: String) = apply { this.certificate = certificate }

            /** Name of digital wallet provider. */
            @JsonProperty("digital_wallet")
            fun digitalWallet(digitalWallet: DigitalWallet) = apply {
                this.digitalWallet = digitalWallet
            }

            /**
             * Only applicable if `digital_wallet` is `APPLE_PAY`. Omit to receive only
             * `activationData` in the response. Base64 cryptographic nonce provided by the device's
             * wallet.
             */
            @JsonProperty("nonce") fun nonce(nonce: String) = apply { this.nonce = nonce }

            /**
             * Only applicable if `digital_wallet` is `APPLE_PAY`. Omit to receive only
             * `activationData` in the response. Base64 cryptographic nonce provided by the device's
             * wallet.
             */
            @JsonProperty("nonce_signature")
            fun nonceSignature(nonceSignature: String) = apply {
                this.nonceSignature = nonceSignature
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

            fun build(): CardProvisionBody =
                CardProvisionBody(
                    certificate,
                    digitalWallet,
                    nonce,
                    nonceSignature,
                    additionalProperties.toUnmodifiable(),
                )
        }
    }

    fun _additionalQueryParams(): Map<String, List<String>> = additionalQueryParams

    fun _additionalHeaders(): Map<String, List<String>> = additionalHeaders

    fun _additionalBodyProperties(): Map<String, JsonValue> = additionalBodyProperties

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is CardProvisionParams &&
            this.cardToken == other.cardToken &&
            this.certificate == other.certificate &&
            this.digitalWallet == other.digitalWallet &&
            this.nonce == other.nonce &&
            this.nonceSignature == other.nonceSignature &&
            this.additionalQueryParams == other.additionalQueryParams &&
            this.additionalHeaders == other.additionalHeaders &&
            this.additionalBodyProperties == other.additionalBodyProperties
    }

    override fun hashCode(): Int {
        return Objects.hash(
            cardToken,
            certificate,
            digitalWallet,
            nonce,
            nonceSignature,
            additionalQueryParams,
            additionalHeaders,
            additionalBodyProperties,
        )
    }

    override fun toString() =
        "CardProvisionParams{cardToken=$cardToken, certificate=$certificate, digitalWallet=$digitalWallet, nonce=$nonce, nonceSignature=$nonceSignature, additionalQueryParams=$additionalQueryParams, additionalHeaders=$additionalHeaders, additionalBodyProperties=$additionalBodyProperties}"

    fun toBuilder() = Builder().from(this)

    companion object {

        fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var cardToken: String? = null
        private var certificate: String? = null
        private var digitalWallet: DigitalWallet? = null
        private var nonce: String? = null
        private var nonceSignature: String? = null
        private var additionalQueryParams: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalHeaders: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalBodyProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(cardProvisionParams: CardProvisionParams) = apply {
            this.cardToken = cardProvisionParams.cardToken
            this.certificate = cardProvisionParams.certificate
            this.digitalWallet = cardProvisionParams.digitalWallet
            this.nonce = cardProvisionParams.nonce
            this.nonceSignature = cardProvisionParams.nonceSignature
            additionalQueryParams(cardProvisionParams.additionalQueryParams)
            additionalHeaders(cardProvisionParams.additionalHeaders)
            additionalBodyProperties(cardProvisionParams.additionalBodyProperties)
        }

        fun cardToken(cardToken: String) = apply { this.cardToken = cardToken }

        /**
         * Only applicable if `digital_wallet` is `APPLE_PAY`. Omit to receive only `activationData`
         * in the response. Apple's public leaf certificate. Base64 encoded in PEM format with
         * headers `(-----BEGIN CERTIFICATE-----)` and trailers omitted. Provided by the device's
         * wallet.
         */
        fun certificate(certificate: String) = apply { this.certificate = certificate }

        /** Name of digital wallet provider. */
        fun digitalWallet(digitalWallet: DigitalWallet) = apply {
            this.digitalWallet = digitalWallet
        }

        /**
         * Only applicable if `digital_wallet` is `APPLE_PAY`. Omit to receive only `activationData`
         * in the response. Base64 cryptographic nonce provided by the device's wallet.
         */
        fun nonce(nonce: String) = apply { this.nonce = nonce }

        /**
         * Only applicable if `digital_wallet` is `APPLE_PAY`. Omit to receive only `activationData`
         * in the response. Base64 cryptographic nonce provided by the device's wallet.
         */
        fun nonceSignature(nonceSignature: String) = apply { this.nonceSignature = nonceSignature }

        fun additionalQueryParams(additionalQueryParams: Map<String, List<String>>) = apply {
            this.additionalQueryParams.clear()
            putAllQueryParams(additionalQueryParams)
        }

        fun putQueryParam(name: String, value: String) = apply {
            this.additionalQueryParams.getOrPut(name) { mutableListOf() }.add(value)
        }

        fun putQueryParams(name: String, values: Iterable<String>) = apply {
            this.additionalQueryParams.getOrPut(name) { mutableListOf() }.addAll(values)
        }

        fun putAllQueryParams(additionalQueryParams: Map<String, Iterable<String>>) = apply {
            additionalQueryParams.forEach(this::putQueryParams)
        }

        fun removeQueryParam(name: String) = apply {
            this.additionalQueryParams.put(name, mutableListOf())
        }

        fun additionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.clear()
            putAllHeaders(additionalHeaders)
        }

        fun putHeader(name: String, value: String) = apply {
            this.additionalHeaders.getOrPut(name) { mutableListOf() }.add(value)
        }

        fun putHeaders(name: String, values: Iterable<String>) = apply {
            this.additionalHeaders.getOrPut(name) { mutableListOf() }.addAll(values)
        }

        fun putAllHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            additionalHeaders.forEach(this::putHeaders)
        }

        fun removeHeader(name: String) = apply { this.additionalHeaders.put(name, mutableListOf()) }

        fun additionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) = apply {
            this.additionalBodyProperties.clear()
            this.additionalBodyProperties.putAll(additionalBodyProperties)
        }

        fun putAdditionalBodyProperty(key: String, value: JsonValue) = apply {
            this.additionalBodyProperties.put(key, value)
        }

        fun putAllAdditionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) =
            apply {
                this.additionalBodyProperties.putAll(additionalBodyProperties)
            }

        fun build(): CardProvisionParams =
            CardProvisionParams(
                checkNotNull(cardToken) { "`cardToken` is required but was not set" },
                certificate,
                digitalWallet,
                nonce,
                nonceSignature,
                additionalQueryParams.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
                additionalHeaders.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
                additionalBodyProperties.toUnmodifiable(),
            )
    }

    class DigitalWallet
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is DigitalWallet && this.value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()

        companion object {

            val APPLE_PAY = DigitalWallet(JsonField.of("APPLE_PAY"))

            val GOOGLE_PAY = DigitalWallet(JsonField.of("GOOGLE_PAY"))

            val SAMSUNG_PAY = DigitalWallet(JsonField.of("SAMSUNG_PAY"))

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
    }
}
