// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.core.JsonGenerator
import com.fasterxml.jackson.core.ObjectCodec
import com.fasterxml.jackson.databind.JsonNode
import com.fasterxml.jackson.databind.SerializerProvider
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.fasterxml.jackson.databind.annotation.JsonSerialize
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lithic.api.core.BaseDeserializer
import com.lithic.api.core.BaseSerializer
import com.lithic.api.core.ExcludeMissing
import com.lithic.api.core.JsonValue
import com.lithic.api.core.NoAutoDetect
import com.lithic.api.core.getOrThrow
import com.lithic.api.core.http.Headers
import com.lithic.api.core.http.QueryParams
import com.lithic.api.core.immutableEmptyMap
import com.lithic.api.core.toImmutable
import com.lithic.api.errors.LithicInvalidDataException
import java.util.Objects

class AuthRuleV2ApplyParams
constructor(
    private val authRuleToken: String,
    private val applyAuthRuleRequestAccountTokens: ApplyAuthRuleRequestAccountTokens?,
    private val applyAuthRuleRequestCardTokens: ApplyAuthRuleRequestCardTokens?,
    private val applyAuthRuleRequestProgramLevel: ApplyAuthRuleRequestProgramLevel?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) {

    fun authRuleToken(): String = authRuleToken

    fun applyAuthRuleRequestAccountTokens(): ApplyAuthRuleRequestAccountTokens? =
        applyAuthRuleRequestAccountTokens

    fun applyAuthRuleRequestCardTokens(): ApplyAuthRuleRequestCardTokens? =
        applyAuthRuleRequestCardTokens

    fun applyAuthRuleRequestProgramLevel(): ApplyAuthRuleRequestProgramLevel? =
        applyAuthRuleRequestProgramLevel

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    internal fun getBody(): AuthRuleV2ApplyBody {
        return AuthRuleV2ApplyBody(
            applyAuthRuleRequestAccountTokens,
            applyAuthRuleRequestCardTokens,
            applyAuthRuleRequestProgramLevel,
        )
    }

    internal fun getHeaders(): Headers = additionalHeaders

    internal fun getQueryParams(): QueryParams = additionalQueryParams

    fun getPathParam(index: Int): String {
        return when (index) {
            0 -> authRuleToken
            else -> ""
        }
    }

    @JsonDeserialize(using = AuthRuleV2ApplyBody.Deserializer::class)
    @JsonSerialize(using = AuthRuleV2ApplyBody.Serializer::class)
    class AuthRuleV2ApplyBody
    internal constructor(
        private val applyAuthRuleRequestAccountTokens: ApplyAuthRuleRequestAccountTokens? = null,
        private val applyAuthRuleRequestCardTokens: ApplyAuthRuleRequestCardTokens? = null,
        private val applyAuthRuleRequestProgramLevel: ApplyAuthRuleRequestProgramLevel? = null,
        private val _json: JsonValue? = null,
    ) {

        fun applyAuthRuleRequestAccountTokens(): ApplyAuthRuleRequestAccountTokens? =
            applyAuthRuleRequestAccountTokens

        fun applyAuthRuleRequestCardTokens(): ApplyAuthRuleRequestCardTokens? =
            applyAuthRuleRequestCardTokens

        fun applyAuthRuleRequestProgramLevel(): ApplyAuthRuleRequestProgramLevel? =
            applyAuthRuleRequestProgramLevel

        fun isApplyAuthRuleRequestAccountTokens(): Boolean =
            applyAuthRuleRequestAccountTokens != null

        fun isApplyAuthRuleRequestCardTokens(): Boolean = applyAuthRuleRequestCardTokens != null

        fun isApplyAuthRuleRequestProgramLevel(): Boolean = applyAuthRuleRequestProgramLevel != null

        fun asApplyAuthRuleRequestAccountTokens(): ApplyAuthRuleRequestAccountTokens =
            applyAuthRuleRequestAccountTokens.getOrThrow("applyAuthRuleRequestAccountTokens")

        fun asApplyAuthRuleRequestCardTokens(): ApplyAuthRuleRequestCardTokens =
            applyAuthRuleRequestCardTokens.getOrThrow("applyAuthRuleRequestCardTokens")

        fun asApplyAuthRuleRequestProgramLevel(): ApplyAuthRuleRequestProgramLevel =
            applyAuthRuleRequestProgramLevel.getOrThrow("applyAuthRuleRequestProgramLevel")

        fun _json(): JsonValue? = _json

        fun <T> accept(visitor: Visitor<T>): T {
            return when {
                applyAuthRuleRequestAccountTokens != null ->
                    visitor.visitApplyAuthRuleRequestAccountTokens(
                        applyAuthRuleRequestAccountTokens
                    )
                applyAuthRuleRequestCardTokens != null ->
                    visitor.visitApplyAuthRuleRequestCardTokens(applyAuthRuleRequestCardTokens)
                applyAuthRuleRequestProgramLevel != null ->
                    visitor.visitApplyAuthRuleRequestProgramLevel(applyAuthRuleRequestProgramLevel)
                else -> visitor.unknown(_json)
            }
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is AuthRuleV2ApplyBody && applyAuthRuleRequestAccountTokens == other.applyAuthRuleRequestAccountTokens && applyAuthRuleRequestCardTokens == other.applyAuthRuleRequestCardTokens && applyAuthRuleRequestProgramLevel == other.applyAuthRuleRequestProgramLevel /* spotless:on */
        }

        override fun hashCode(): Int = /* spotless:off */ Objects.hash(applyAuthRuleRequestAccountTokens, applyAuthRuleRequestCardTokens, applyAuthRuleRequestProgramLevel) /* spotless:on */

        override fun toString(): String =
            when {
                applyAuthRuleRequestAccountTokens != null ->
                    "AuthRuleV2ApplyBody{applyAuthRuleRequestAccountTokens=$applyAuthRuleRequestAccountTokens}"
                applyAuthRuleRequestCardTokens != null ->
                    "AuthRuleV2ApplyBody{applyAuthRuleRequestCardTokens=$applyAuthRuleRequestCardTokens}"
                applyAuthRuleRequestProgramLevel != null ->
                    "AuthRuleV2ApplyBody{applyAuthRuleRequestProgramLevel=$applyAuthRuleRequestProgramLevel}"
                _json != null -> "AuthRuleV2ApplyBody{_unknown=$_json}"
                else -> throw IllegalStateException("Invalid AuthRuleV2ApplyBody")
            }

        companion object {

            fun ofApplyAuthRuleRequestAccountTokens(
                applyAuthRuleRequestAccountTokens: ApplyAuthRuleRequestAccountTokens
            ) =
                AuthRuleV2ApplyBody(
                    applyAuthRuleRequestAccountTokens = applyAuthRuleRequestAccountTokens
                )

            fun ofApplyAuthRuleRequestCardTokens(
                applyAuthRuleRequestCardTokens: ApplyAuthRuleRequestCardTokens
            ) = AuthRuleV2ApplyBody(applyAuthRuleRequestCardTokens = applyAuthRuleRequestCardTokens)

            fun ofApplyAuthRuleRequestProgramLevel(
                applyAuthRuleRequestProgramLevel: ApplyAuthRuleRequestProgramLevel
            ) =
                AuthRuleV2ApplyBody(
                    applyAuthRuleRequestProgramLevel = applyAuthRuleRequestProgramLevel
                )
        }

        interface Visitor<out T> {

            fun visitApplyAuthRuleRequestAccountTokens(
                applyAuthRuleRequestAccountTokens: ApplyAuthRuleRequestAccountTokens
            ): T

            fun visitApplyAuthRuleRequestCardTokens(
                applyAuthRuleRequestCardTokens: ApplyAuthRuleRequestCardTokens
            ): T

            fun visitApplyAuthRuleRequestProgramLevel(
                applyAuthRuleRequestProgramLevel: ApplyAuthRuleRequestProgramLevel
            ): T

            fun unknown(json: JsonValue?): T {
                throw LithicInvalidDataException("Unknown AuthRuleV2ApplyBody: $json")
            }
        }

        class Deserializer : BaseDeserializer<AuthRuleV2ApplyBody>(AuthRuleV2ApplyBody::class) {

            override fun ObjectCodec.deserialize(node: JsonNode): AuthRuleV2ApplyBody {
                val json = JsonValue.fromJsonNode(node)

                tryDeserialize(node, jacksonTypeRef<ApplyAuthRuleRequestAccountTokens>())?.let {
                    return AuthRuleV2ApplyBody(applyAuthRuleRequestAccountTokens = it, _json = json)
                }
                tryDeserialize(node, jacksonTypeRef<ApplyAuthRuleRequestCardTokens>())?.let {
                    return AuthRuleV2ApplyBody(applyAuthRuleRequestCardTokens = it, _json = json)
                }
                tryDeserialize(node, jacksonTypeRef<ApplyAuthRuleRequestProgramLevel>())?.let {
                    return AuthRuleV2ApplyBody(applyAuthRuleRequestProgramLevel = it, _json = json)
                }

                return AuthRuleV2ApplyBody(_json = json)
            }
        }

        class Serializer : BaseSerializer<AuthRuleV2ApplyBody>(AuthRuleV2ApplyBody::class) {

            override fun serialize(
                value: AuthRuleV2ApplyBody,
                generator: JsonGenerator,
                provider: SerializerProvider
            ) {
                when {
                    value.applyAuthRuleRequestAccountTokens != null ->
                        generator.writeObject(value.applyAuthRuleRequestAccountTokens)
                    value.applyAuthRuleRequestCardTokens != null ->
                        generator.writeObject(value.applyAuthRuleRequestCardTokens)
                    value.applyAuthRuleRequestProgramLevel != null ->
                        generator.writeObject(value.applyAuthRuleRequestProgramLevel)
                    value._json != null -> generator.writeObject(value._json)
                    else -> throw IllegalStateException("Invalid AuthRuleV2ApplyBody")
                }
            }
        }
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var authRuleToken: String? = null
        private var applyAuthRuleRequestAccountTokens: ApplyAuthRuleRequestAccountTokens? = null
        private var applyAuthRuleRequestCardTokens: ApplyAuthRuleRequestCardTokens? = null
        private var applyAuthRuleRequestProgramLevel: ApplyAuthRuleRequestProgramLevel? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        internal fun from(authRuleV2ApplyParams: AuthRuleV2ApplyParams) = apply {
            authRuleToken = authRuleV2ApplyParams.authRuleToken
            applyAuthRuleRequestAccountTokens =
                authRuleV2ApplyParams.applyAuthRuleRequestAccountTokens
            applyAuthRuleRequestCardTokens = authRuleV2ApplyParams.applyAuthRuleRequestCardTokens
            applyAuthRuleRequestProgramLevel =
                authRuleV2ApplyParams.applyAuthRuleRequestProgramLevel
            additionalHeaders = authRuleV2ApplyParams.additionalHeaders.toBuilder()
            additionalQueryParams = authRuleV2ApplyParams.additionalQueryParams.toBuilder()
        }

        fun authRuleToken(authRuleToken: String) = apply { this.authRuleToken = authRuleToken }

        fun forApplyAuthRuleRequestAccountTokens(
            applyAuthRuleRequestAccountTokens: ApplyAuthRuleRequestAccountTokens
        ) = apply {
            this.applyAuthRuleRequestAccountTokens = applyAuthRuleRequestAccountTokens
            this.applyAuthRuleRequestCardTokens = null
            this.applyAuthRuleRequestProgramLevel = null
        }

        fun forApplyAuthRuleRequestCardTokens(
            applyAuthRuleRequestCardTokens: ApplyAuthRuleRequestCardTokens
        ) = apply {
            this.applyAuthRuleRequestAccountTokens = null
            this.applyAuthRuleRequestCardTokens = applyAuthRuleRequestCardTokens
            this.applyAuthRuleRequestProgramLevel = null
        }

        fun forApplyAuthRuleRequestProgramLevel(
            applyAuthRuleRequestProgramLevel: ApplyAuthRuleRequestProgramLevel
        ) = apply {
            this.applyAuthRuleRequestAccountTokens = null
            this.applyAuthRuleRequestCardTokens = null
            this.applyAuthRuleRequestProgramLevel = applyAuthRuleRequestProgramLevel
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

        fun build(): AuthRuleV2ApplyParams =
            AuthRuleV2ApplyParams(
                checkNotNull(authRuleToken) { "`authRuleToken` is required but was not set" },
                applyAuthRuleRequestAccountTokens,
                applyAuthRuleRequestCardTokens,
                applyAuthRuleRequestProgramLevel,
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    @NoAutoDetect
    class ApplyAuthRuleRequestAccountTokens
    @JsonCreator
    private constructor(
        @JsonProperty("account_tokens") private val accountTokens: List<String>,
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /** Account tokens to which the Auth Rule applies. */
        @JsonProperty("account_tokens") fun accountTokens(): List<String> = accountTokens

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var accountTokens: List<String>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(
                applyAuthRuleRequestAccountTokens: ApplyAuthRuleRequestAccountTokens
            ) = apply {
                accountTokens = applyAuthRuleRequestAccountTokens.accountTokens.toMutableList()
                additionalProperties =
                    applyAuthRuleRequestAccountTokens.additionalProperties.toMutableMap()
            }

            /** Account tokens to which the Auth Rule applies. */
            fun accountTokens(accountTokens: List<String>) = apply {
                this.accountTokens = accountTokens
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

            fun build(): ApplyAuthRuleRequestAccountTokens =
                ApplyAuthRuleRequestAccountTokens(
                    checkNotNull(accountTokens) { "`accountTokens` is required but was not set" }
                        .toImmutable(),
                    additionalProperties.toImmutable()
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is ApplyAuthRuleRequestAccountTokens && accountTokens == other.accountTokens && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(accountTokens, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "ApplyAuthRuleRequestAccountTokens{accountTokens=$accountTokens, additionalProperties=$additionalProperties}"
    }

    @NoAutoDetect
    class ApplyAuthRuleRequestCardTokens
    @JsonCreator
    private constructor(
        @JsonProperty("card_tokens") private val cardTokens: List<String>,
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /** Card tokens to which the Auth Rule applies. */
        @JsonProperty("card_tokens") fun cardTokens(): List<String> = cardTokens

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var cardTokens: List<String>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(applyAuthRuleRequestCardTokens: ApplyAuthRuleRequestCardTokens) =
                apply {
                    cardTokens = applyAuthRuleRequestCardTokens.cardTokens.toMutableList()
                    additionalProperties =
                        applyAuthRuleRequestCardTokens.additionalProperties.toMutableMap()
                }

            /** Card tokens to which the Auth Rule applies. */
            fun cardTokens(cardTokens: List<String>) = apply { this.cardTokens = cardTokens }

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

            fun build(): ApplyAuthRuleRequestCardTokens =
                ApplyAuthRuleRequestCardTokens(
                    checkNotNull(cardTokens) { "`cardTokens` is required but was not set" }
                        .toImmutable(),
                    additionalProperties.toImmutable()
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is ApplyAuthRuleRequestCardTokens && cardTokens == other.cardTokens && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(cardTokens, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "ApplyAuthRuleRequestCardTokens{cardTokens=$cardTokens, additionalProperties=$additionalProperties}"
    }

    @NoAutoDetect
    class ApplyAuthRuleRequestProgramLevel
    @JsonCreator
    private constructor(
        @JsonProperty("program_level") private val programLevel: Boolean,
        @JsonProperty("excluded_card_tokens") private val excludedCardTokens: List<String>?,
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /** Whether the Auth Rule applies to all authorizations on the card program. */
        @JsonProperty("program_level") fun programLevel(): Boolean = programLevel

        /** Card tokens to which the Auth Rule does not apply. */
        @JsonProperty("excluded_card_tokens")
        fun excludedCardTokens(): List<String>? = excludedCardTokens

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var programLevel: Boolean? = null
            private var excludedCardTokens: List<String>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(applyAuthRuleRequestProgramLevel: ApplyAuthRuleRequestProgramLevel) =
                apply {
                    programLevel = applyAuthRuleRequestProgramLevel.programLevel
                    excludedCardTokens =
                        applyAuthRuleRequestProgramLevel.excludedCardTokens?.toMutableList()
                    additionalProperties =
                        applyAuthRuleRequestProgramLevel.additionalProperties.toMutableMap()
                }

            /** Whether the Auth Rule applies to all authorizations on the card program. */
            fun programLevel(programLevel: Boolean) = apply { this.programLevel = programLevel }

            /** Card tokens to which the Auth Rule does not apply. */
            fun excludedCardTokens(excludedCardTokens: List<String>?) = apply {
                this.excludedCardTokens = excludedCardTokens
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

            fun build(): ApplyAuthRuleRequestProgramLevel =
                ApplyAuthRuleRequestProgramLevel(
                    checkNotNull(programLevel) { "`programLevel` is required but was not set" },
                    excludedCardTokens?.toImmutable(),
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is ApplyAuthRuleRequestProgramLevel && programLevel == other.programLevel && excludedCardTokens == other.excludedCardTokens && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(programLevel, excludedCardTokens, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "ApplyAuthRuleRequestProgramLevel{programLevel=$programLevel, excludedCardTokens=$excludedCardTokens, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is AuthRuleV2ApplyParams && authRuleToken == other.authRuleToken && applyAuthRuleRequestAccountTokens == other.applyAuthRuleRequestAccountTokens && applyAuthRuleRequestCardTokens == other.applyAuthRuleRequestCardTokens && applyAuthRuleRequestProgramLevel == other.applyAuthRuleRequestProgramLevel && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(authRuleToken, applyAuthRuleRequestAccountTokens, applyAuthRuleRequestCardTokens, applyAuthRuleRequestProgramLevel, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() =
        "AuthRuleV2ApplyParams{authRuleToken=$authRuleToken, applyAuthRuleRequestAccountTokens=$applyAuthRuleRequestAccountTokens, applyAuthRuleRequestCardTokens=$applyAuthRuleRequestCardTokens, applyAuthRuleRequestProgramLevel=$applyAuthRuleRequestProgramLevel, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
