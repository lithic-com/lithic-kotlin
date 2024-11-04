// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.google.common.collect.ArrayListMultimap
import com.google.common.collect.ListMultimap
import com.lithic.api.core.Enum
import com.lithic.api.core.ExcludeMissing
import com.lithic.api.core.JsonField
import com.lithic.api.core.JsonValue
import com.lithic.api.core.NoAutoDetect
import com.lithic.api.core.toImmutable
import com.lithic.api.errors.LithicInvalidDataException
import com.lithic.api.models.*
import java.util.Objects

class FinancialAccountCreateParams
constructor(
    private val nickname: String,
    private val type: Type,
    private val accountToken: String?,
    private val isForBenefitOf: Boolean?,
    private val additionalHeaders: Map<String, List<String>>,
    private val additionalQueryParams: Map<String, List<String>>,
    private val additionalBodyProperties: Map<String, JsonValue>,
) {

    fun nickname(): String = nickname

    fun type(): Type = type

    fun accountToken(): String? = accountToken

    fun isForBenefitOf(): Boolean? = isForBenefitOf

    internal fun getBody(): FinancialAccountCreateBody {
        return FinancialAccountCreateBody(
            nickname,
            type,
            accountToken,
            isForBenefitOf,
            additionalBodyProperties,
        )
    }

    internal fun getHeaders(): Map<String, List<String>> = additionalHeaders

    internal fun getQueryParams(): Map<String, List<String>> = additionalQueryParams

    @JsonDeserialize(builder = FinancialAccountCreateBody.Builder::class)
    @NoAutoDetect
    class FinancialAccountCreateBody
    internal constructor(
        private val nickname: String?,
        private val type: Type?,
        private val accountToken: String?,
        private val isForBenefitOf: Boolean?,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        @JsonProperty("nickname") fun nickname(): String? = nickname

        @JsonProperty("type") fun type(): Type? = type

        @JsonProperty("account_token") fun accountToken(): String? = accountToken

        @JsonProperty("is_for_benefit_of") fun isForBenefitOf(): Boolean? = isForBenefitOf

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var nickname: String? = null
            private var type: Type? = null
            private var accountToken: String? = null
            private var isForBenefitOf: Boolean? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(financialAccountCreateBody: FinancialAccountCreateBody) = apply {
                this.nickname = financialAccountCreateBody.nickname
                this.type = financialAccountCreateBody.type
                this.accountToken = financialAccountCreateBody.accountToken
                this.isForBenefitOf = financialAccountCreateBody.isForBenefitOf
                additionalProperties(financialAccountCreateBody.additionalProperties)
            }

            @JsonProperty("nickname")
            fun nickname(nickname: String) = apply { this.nickname = nickname }

            @JsonProperty("type") fun type(type: Type) = apply { this.type = type }

            @JsonProperty("account_token")
            fun accountToken(accountToken: String) = apply { this.accountToken = accountToken }

            @JsonProperty("is_for_benefit_of")
            fun isForBenefitOf(isForBenefitOf: Boolean) = apply {
                this.isForBenefitOf = isForBenefitOf
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

            fun build(): FinancialAccountCreateBody =
                FinancialAccountCreateBody(
                    checkNotNull(nickname) { "`nickname` is required but was not set" },
                    checkNotNull(type) { "`type` is required but was not set" },
                    accountToken,
                    isForBenefitOf,
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is FinancialAccountCreateBody && this.nickname == other.nickname && this.type == other.type && this.accountToken == other.accountToken && this.isForBenefitOf == other.isForBenefitOf && this.additionalProperties == other.additionalProperties /* spotless:on */
        }

        private var hashCode: Int = 0

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode = /* spotless:off */ Objects.hash(nickname, type, accountToken, isForBenefitOf, additionalProperties) /* spotless:on */
            }
            return hashCode
        }

        override fun toString() =
            "FinancialAccountCreateBody{nickname=$nickname, type=$type, accountToken=$accountToken, isForBenefitOf=$isForBenefitOf, additionalProperties=$additionalProperties}"
    }

    fun _additionalHeaders(): Map<String, List<String>> = additionalHeaders

    fun _additionalQueryParams(): Map<String, List<String>> = additionalQueryParams

    fun _additionalBodyProperties(): Map<String, JsonValue> = additionalBodyProperties

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is FinancialAccountCreateParams && this.nickname == other.nickname && this.type == other.type && this.accountToken == other.accountToken && this.isForBenefitOf == other.isForBenefitOf && this.additionalHeaders == other.additionalHeaders && this.additionalQueryParams == other.additionalQueryParams && this.additionalBodyProperties == other.additionalBodyProperties /* spotless:on */
    }

    override fun hashCode(): Int {
        return /* spotless:off */ Objects.hash(nickname, type, accountToken, isForBenefitOf, additionalHeaders, additionalQueryParams, additionalBodyProperties) /* spotless:on */
    }

    override fun toString() =
        "FinancialAccountCreateParams{nickname=$nickname, type=$type, accountToken=$accountToken, isForBenefitOf=$isForBenefitOf, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams, additionalBodyProperties=$additionalBodyProperties}"

    fun toBuilder() = Builder().from(this)

    companion object {

        fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var nickname: String? = null
        private var type: Type? = null
        private var accountToken: String? = null
        private var isForBenefitOf: Boolean? = null
        private var additionalHeaders: ListMultimap<String, String> = ArrayListMultimap.create()
        private var additionalQueryParams: ListMultimap<String, String> = ArrayListMultimap.create()
        private var additionalBodyProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(financialAccountCreateParams: FinancialAccountCreateParams) = apply {
            this.nickname = financialAccountCreateParams.nickname
            this.type = financialAccountCreateParams.type
            this.accountToken = financialAccountCreateParams.accountToken
            this.isForBenefitOf = financialAccountCreateParams.isForBenefitOf
            additionalHeaders(financialAccountCreateParams.additionalHeaders)
            additionalQueryParams(financialAccountCreateParams.additionalQueryParams)
            additionalBodyProperties(financialAccountCreateParams.additionalBodyProperties)
        }

        fun nickname(nickname: String) = apply { this.nickname = nickname }

        fun type(type: Type) = apply { this.type = type }

        fun accountToken(accountToken: String) = apply { this.accountToken = accountToken }

        fun isForBenefitOf(isForBenefitOf: Boolean) = apply { this.isForBenefitOf = isForBenefitOf }

        fun additionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun putAdditionalHeader(name: String, value: String) = apply {
            additionalHeaders.put(name, value)
        }

        fun putAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.putAll(name, values)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            additionalHeaders.forEach(::putAdditionalHeaders)
        }

        fun replaceAdditionalHeaders(name: String, value: String) = apply {
            additionalHeaders.replaceValues(name, listOf(value))
        }

        fun replaceAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.replaceValues(name, values)
        }

        fun replaceAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            additionalHeaders.forEach(::replaceAdditionalHeaders)
        }

        fun removeAdditionalHeaders(name: String) = apply { additionalHeaders.removeAll(name) }

        fun removeAllAdditionalHeaders(names: Set<String>) = apply {
            names.forEach(::removeAdditionalHeaders)
        }

        fun additionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun putAdditionalQueryParam(key: String, value: String) = apply {
            additionalQueryParams.put(key, value)
        }

        fun putAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.putAll(key, values)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                additionalQueryParams.forEach(::putAdditionalQueryParams)
            }

        fun replaceAdditionalQueryParams(key: String, value: String) = apply {
            additionalQueryParams.replaceValues(key, listOf(value))
        }

        fun replaceAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.replaceValues(key, values)
        }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                additionalQueryParams.forEach(::replaceAdditionalQueryParams)
            }

        fun removeAdditionalQueryParams(key: String) = apply {
            additionalQueryParams.removeAll(key)
        }

        fun removeAllAdditionalQueryParams(keys: Set<String>) = apply {
            keys.forEach(::removeAdditionalQueryParams)
        }

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

        fun build(): FinancialAccountCreateParams =
            FinancialAccountCreateParams(
                checkNotNull(nickname) { "`nickname` is required but was not set" },
                checkNotNull(type) { "`type` is required but was not set" },
                accountToken,
                isForBenefitOf,
                additionalHeaders
                    .asMap()
                    .mapValues { it.value.toList().toImmutable() }
                    .toImmutable(),
                additionalQueryParams
                    .asMap()
                    .mapValues { it.value.toList().toImmutable() }
                    .toImmutable(),
                additionalBodyProperties.toImmutable(),
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

            return /* spotless:off */ other is Type && this.value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()

        companion object {

            val OPERATING = Type(JsonField.of("OPERATING"))

            fun of(value: String) = Type(JsonField.of(value))
        }

        enum class Known {
            OPERATING,
        }

        enum class Value {
            OPERATING,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                OPERATING -> Value.OPERATING
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                OPERATING -> Known.OPERATING
                else -> throw LithicInvalidDataException("Unknown Type: $value")
            }

        fun asString(): String = _value().asStringOrThrow()
    }
}
