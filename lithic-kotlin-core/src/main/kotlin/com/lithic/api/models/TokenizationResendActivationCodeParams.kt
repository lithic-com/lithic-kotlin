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
import com.lithic.api.core.JsonValue
import com.lithic.api.core.NoAutoDetect
import com.lithic.api.core.http.Headers
import com.lithic.api.core.http.QueryParams
import com.lithic.api.core.toImmutable
import com.lithic.api.errors.LithicInvalidDataException
import com.lithic.api.models.*
import java.util.Objects

class TokenizationResendActivationCodeParams
constructor(
    private val tokenizationToken: String,
    private val activationMethodType: ActivationMethodType?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
    private val additionalBodyProperties: Map<String, JsonValue>,
) {

    fun tokenizationToken(): String = tokenizationToken

    fun activationMethodType(): ActivationMethodType? = activationMethodType

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun _additionalBodyProperties(): Map<String, JsonValue> = additionalBodyProperties

    internal fun getBody(): TokenizationResendActivationCodeBody {
        return TokenizationResendActivationCodeBody(activationMethodType, additionalBodyProperties)
    }

    internal fun getHeaders(): Headers = additionalHeaders

    internal fun getQueryParams(): QueryParams = additionalQueryParams

    fun getPathParam(index: Int): String {
        return when (index) {
            0 -> tokenizationToken
            else -> ""
        }
    }

    @JsonDeserialize(builder = TokenizationResendActivationCodeBody.Builder::class)
    @NoAutoDetect
    class TokenizationResendActivationCodeBody
    internal constructor(
        private val activationMethodType: ActivationMethodType?,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        /**
         * The communication method that the user has selected to use to receive the authentication
         * code. Supported Values: Sms = "TEXT_TO_CARDHOLDER_NUMBER". Email =
         * "EMAIL_TO_CARDHOLDER_ADDRESS"
         */
        @JsonProperty("activation_method_type")
        fun activationMethodType(): ActivationMethodType? = activationMethodType

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var activationMethodType: ActivationMethodType? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(
                tokenizationResendActivationCodeBody: TokenizationResendActivationCodeBody
            ) = apply {
                this.activationMethodType =
                    tokenizationResendActivationCodeBody.activationMethodType
                additionalProperties(tokenizationResendActivationCodeBody.additionalProperties)
            }

            /**
             * The communication method that the user has selected to use to receive the
             * authentication code. Supported Values: Sms = "TEXT_TO_CARDHOLDER_NUMBER". Email =
             * "EMAIL_TO_CARDHOLDER_ADDRESS"
             */
            @JsonProperty("activation_method_type")
            fun activationMethodType(activationMethodType: ActivationMethodType) = apply {
                this.activationMethodType = activationMethodType
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

            fun build(): TokenizationResendActivationCodeBody =
                TokenizationResendActivationCodeBody(
                    activationMethodType,
                    additionalProperties.toImmutable()
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is TokenizationResendActivationCodeBody && activationMethodType == other.activationMethodType && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(activationMethodType, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "TokenizationResendActivationCodeBody{activationMethodType=$activationMethodType, additionalProperties=$additionalProperties}"
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var tokenizationToken: String? = null
        private var activationMethodType: ActivationMethodType? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()
        private var additionalBodyProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(
            tokenizationResendActivationCodeParams: TokenizationResendActivationCodeParams
        ) = apply {
            tokenizationToken = tokenizationResendActivationCodeParams.tokenizationToken
            activationMethodType = tokenizationResendActivationCodeParams.activationMethodType
            additionalHeaders = tokenizationResendActivationCodeParams.additionalHeaders.toBuilder()
            additionalQueryParams =
                tokenizationResendActivationCodeParams.additionalQueryParams.toBuilder()
            additionalBodyProperties =
                tokenizationResendActivationCodeParams.additionalBodyProperties.toMutableMap()
        }

        fun tokenizationToken(tokenizationToken: String) = apply {
            this.tokenizationToken = tokenizationToken
        }

        /**
         * The communication method that the user has selected to use to receive the authentication
         * code. Supported Values: Sms = "TEXT_TO_CARDHOLDER_NUMBER". Email =
         * "EMAIL_TO_CARDHOLDER_ADDRESS"
         */
        fun activationMethodType(activationMethodType: ActivationMethodType) = apply {
            this.activationMethodType = activationMethodType
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

        fun build(): TokenizationResendActivationCodeParams =
            TokenizationResendActivationCodeParams(
                checkNotNull(tokenizationToken) {
                    "`tokenizationToken` is required but was not set"
                },
                activationMethodType,
                additionalHeaders.build(),
                additionalQueryParams.build(),
                additionalBodyProperties.toImmutable(),
            )
    }

    class ActivationMethodType
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is ActivationMethodType && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()

        companion object {

            val EMAIL_TO_CARDHOLDER_ADDRESS =
                ActivationMethodType(JsonField.of("EMAIL_TO_CARDHOLDER_ADDRESS"))

            val TEXT_TO_CARDHOLDER_NUMBER =
                ActivationMethodType(JsonField.of("TEXT_TO_CARDHOLDER_NUMBER"))

            fun of(value: String) = ActivationMethodType(JsonField.of(value))
        }

        enum class Known {
            EMAIL_TO_CARDHOLDER_ADDRESS,
            TEXT_TO_CARDHOLDER_NUMBER,
        }

        enum class Value {
            EMAIL_TO_CARDHOLDER_ADDRESS,
            TEXT_TO_CARDHOLDER_NUMBER,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                EMAIL_TO_CARDHOLDER_ADDRESS -> Value.EMAIL_TO_CARDHOLDER_ADDRESS
                TEXT_TO_CARDHOLDER_NUMBER -> Value.TEXT_TO_CARDHOLDER_NUMBER
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                EMAIL_TO_CARDHOLDER_ADDRESS -> Known.EMAIL_TO_CARDHOLDER_ADDRESS
                TEXT_TO_CARDHOLDER_NUMBER -> Known.TEXT_TO_CARDHOLDER_NUMBER
                else -> throw LithicInvalidDataException("Unknown ActivationMethodType: $value")
            }

        fun asString(): String = _value().asStringOrThrow()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is TokenizationResendActivationCodeParams && tokenizationToken == other.tokenizationToken && activationMethodType == other.activationMethodType && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams && additionalBodyProperties == other.additionalBodyProperties /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(tokenizationToken, activationMethodType, additionalHeaders, additionalQueryParams, additionalBodyProperties) /* spotless:on */

    override fun toString() =
        "TokenizationResendActivationCodeParams{tokenizationToken=$tokenizationToken, activationMethodType=$activationMethodType, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams, additionalBodyProperties=$additionalBodyProperties}"
}
