// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.lithic.api.core.ExcludeMissing
import com.lithic.api.core.JsonField
import com.lithic.api.core.JsonMissing
import com.lithic.api.core.JsonValue
import com.lithic.api.core.NoAutoDetect
import com.lithic.api.core.checkKnown
import com.lithic.api.core.checkRequired
import com.lithic.api.core.immutableEmptyMap
import com.lithic.api.core.toImmutable
import java.util.Objects

@NoAutoDetect
class RequiredDocument
@JsonCreator
private constructor(
    @JsonProperty("entity_token")
    @ExcludeMissing
    private val entityToken: JsonField<String> = JsonMissing.of(),
    @JsonProperty("status_reasons")
    @ExcludeMissing
    private val statusReasons: JsonField<List<String>> = JsonMissing.of(),
    @JsonProperty("valid_documents")
    @ExcludeMissing
    private val validDocuments: JsonField<List<String>> = JsonMissing.of(),
    @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
) {

    /** Globally unique identifier for an entity. */
    fun entityToken(): String = entityToken.getRequired("entity_token")

    /**
     * rovides the status reasons that will be satisfied by providing one of the valid documents.
     */
    fun statusReasons(): List<String> = statusReasons.getRequired("status_reasons")

    /**
     * A list of valid documents that will satisfy the KYC requirements for the specified entity.
     */
    fun validDocuments(): List<String> = validDocuments.getRequired("valid_documents")

    /** Globally unique identifier for an entity. */
    @JsonProperty("entity_token")
    @ExcludeMissing
    fun _entityToken(): JsonField<String> = entityToken

    /**
     * rovides the status reasons that will be satisfied by providing one of the valid documents.
     */
    @JsonProperty("status_reasons")
    @ExcludeMissing
    fun _statusReasons(): JsonField<List<String>> = statusReasons

    /**
     * A list of valid documents that will satisfy the KYC requirements for the specified entity.
     */
    @JsonProperty("valid_documents")
    @ExcludeMissing
    fun _validDocuments(): JsonField<List<String>> = validDocuments

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    private var validated: Boolean = false

    fun validate(): RequiredDocument = apply {
        if (validated) {
            return@apply
        }

        entityToken()
        statusReasons()
        validDocuments()
        validated = true
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [RequiredDocument].
         *
         * The following fields are required:
         * ```kotlin
         * .entityToken()
         * .statusReasons()
         * .validDocuments()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [RequiredDocument]. */
    class Builder internal constructor() {

        private var entityToken: JsonField<String>? = null
        private var statusReasons: JsonField<MutableList<String>>? = null
        private var validDocuments: JsonField<MutableList<String>>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(requiredDocument: RequiredDocument) = apply {
            entityToken = requiredDocument.entityToken
            statusReasons = requiredDocument.statusReasons.map { it.toMutableList() }
            validDocuments = requiredDocument.validDocuments.map { it.toMutableList() }
            additionalProperties = requiredDocument.additionalProperties.toMutableMap()
        }

        /** Globally unique identifier for an entity. */
        fun entityToken(entityToken: String) = entityToken(JsonField.of(entityToken))

        /** Globally unique identifier for an entity. */
        fun entityToken(entityToken: JsonField<String>) = apply { this.entityToken = entityToken }

        /**
         * rovides the status reasons that will be satisfied by providing one of the valid
         * documents.
         */
        fun statusReasons(statusReasons: List<String>) = statusReasons(JsonField.of(statusReasons))

        /**
         * rovides the status reasons that will be satisfied by providing one of the valid
         * documents.
         */
        fun statusReasons(statusReasons: JsonField<List<String>>) = apply {
            this.statusReasons = statusReasons.map { it.toMutableList() }
        }

        /**
         * rovides the status reasons that will be satisfied by providing one of the valid
         * documents.
         */
        fun addStatusReason(statusReason: String) = apply {
            statusReasons =
                (statusReasons ?: JsonField.of(mutableListOf())).also {
                    checkKnown("statusReasons", it).add(statusReason)
                }
        }

        /**
         * A list of valid documents that will satisfy the KYC requirements for the specified
         * entity.
         */
        fun validDocuments(validDocuments: List<String>) =
            validDocuments(JsonField.of(validDocuments))

        /**
         * A list of valid documents that will satisfy the KYC requirements for the specified
         * entity.
         */
        fun validDocuments(validDocuments: JsonField<List<String>>) = apply {
            this.validDocuments = validDocuments.map { it.toMutableList() }
        }

        /**
         * A list of valid documents that will satisfy the KYC requirements for the specified
         * entity.
         */
        fun addValidDocument(validDocument: String) = apply {
            validDocuments =
                (validDocuments ?: JsonField.of(mutableListOf())).also {
                    checkKnown("validDocuments", it).add(validDocument)
                }
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

        fun build(): RequiredDocument =
            RequiredDocument(
                checkRequired("entityToken", entityToken),
                checkRequired("statusReasons", statusReasons).map { it.toImmutable() },
                checkRequired("validDocuments", validDocuments).map { it.toImmutable() },
                additionalProperties.toImmutable(),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is RequiredDocument && entityToken == other.entityToken && statusReasons == other.statusReasons && validDocuments == other.validDocuments && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(entityToken, statusReasons, validDocuments, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "RequiredDocument{entityToken=$entityToken, statusReasons=$statusReasons, validDocuments=$validDocuments, additionalProperties=$additionalProperties}"
}
