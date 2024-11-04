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

class AccountHolderSimulateEnrollmentDocumentReviewParams
constructor(
    private val documentUploadToken: String,
    private val status: Status,
    private val acceptedEntityStatusReasons: List<String>?,
    private val statusReason: DocumentUploadStatusReasons?,
    private val additionalHeaders: Map<String, List<String>>,
    private val additionalQueryParams: Map<String, List<String>>,
    private val additionalBodyProperties: Map<String, JsonValue>,
) {

    fun documentUploadToken(): String = documentUploadToken

    fun status(): Status = status

    fun acceptedEntityStatusReasons(): List<String>? = acceptedEntityStatusReasons

    fun statusReason(): DocumentUploadStatusReasons? = statusReason

    internal fun getBody(): AccountHolderSimulateEnrollmentDocumentReviewBody {
        return AccountHolderSimulateEnrollmentDocumentReviewBody(
            documentUploadToken,
            status,
            acceptedEntityStatusReasons,
            statusReason,
            additionalBodyProperties,
        )
    }

    internal fun getHeaders(): Map<String, List<String>> = additionalHeaders

    internal fun getQueryParams(): Map<String, List<String>> = additionalQueryParams

    @JsonDeserialize(builder = AccountHolderSimulateEnrollmentDocumentReviewBody.Builder::class)
    @NoAutoDetect
    class AccountHolderSimulateEnrollmentDocumentReviewBody
    internal constructor(
        private val documentUploadToken: String?,
        private val status: Status?,
        private val acceptedEntityStatusReasons: List<String>?,
        private val statusReason: DocumentUploadStatusReasons?,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        /** The account holder document upload which to perform the simulation upon. */
        @JsonProperty("document_upload_token")
        fun documentUploadToken(): String? = documentUploadToken

        /** An account holder document's upload status for use within the simulation. */
        @JsonProperty("status") fun status(): Status? = status

        /** A list of status reasons associated with a KYB account holder in PENDING_REVIEW */
        @JsonProperty("accepted_entity_status_reasons")
        fun acceptedEntityStatusReasons(): List<String>? = acceptedEntityStatusReasons

        /**
         * Status reason that will be associated with the simulated account holder status. Only
         * required for a `REJECTED` status or `PARTIAL_APPROVAL` status.
         */
        @JsonProperty("status_reason")
        fun statusReason(): DocumentUploadStatusReasons? = statusReason

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var documentUploadToken: String? = null
            private var status: Status? = null
            private var acceptedEntityStatusReasons: List<String>? = null
            private var statusReason: DocumentUploadStatusReasons? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(
                accountHolderSimulateEnrollmentDocumentReviewBody:
                    AccountHolderSimulateEnrollmentDocumentReviewBody
            ) = apply {
                this.documentUploadToken =
                    accountHolderSimulateEnrollmentDocumentReviewBody.documentUploadToken
                this.status = accountHolderSimulateEnrollmentDocumentReviewBody.status
                this.acceptedEntityStatusReasons =
                    accountHolderSimulateEnrollmentDocumentReviewBody.acceptedEntityStatusReasons
                this.statusReason = accountHolderSimulateEnrollmentDocumentReviewBody.statusReason
                additionalProperties(
                    accountHolderSimulateEnrollmentDocumentReviewBody.additionalProperties
                )
            }

            /** The account holder document upload which to perform the simulation upon. */
            @JsonProperty("document_upload_token")
            fun documentUploadToken(documentUploadToken: String) = apply {
                this.documentUploadToken = documentUploadToken
            }

            /** An account holder document's upload status for use within the simulation. */
            @JsonProperty("status") fun status(status: Status) = apply { this.status = status }

            /** A list of status reasons associated with a KYB account holder in PENDING_REVIEW */
            @JsonProperty("accepted_entity_status_reasons")
            fun acceptedEntityStatusReasons(acceptedEntityStatusReasons: List<String>) = apply {
                this.acceptedEntityStatusReasons = acceptedEntityStatusReasons
            }

            /**
             * Status reason that will be associated with the simulated account holder status. Only
             * required for a `REJECTED` status or `PARTIAL_APPROVAL` status.
             */
            @JsonProperty("status_reason")
            fun statusReason(statusReason: DocumentUploadStatusReasons) = apply {
                this.statusReason = statusReason
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

            fun build(): AccountHolderSimulateEnrollmentDocumentReviewBody =
                AccountHolderSimulateEnrollmentDocumentReviewBody(
                    checkNotNull(documentUploadToken) {
                        "`documentUploadToken` is required but was not set"
                    },
                    checkNotNull(status) { "`status` is required but was not set" },
                    acceptedEntityStatusReasons?.toImmutable(),
                    statusReason,
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is AccountHolderSimulateEnrollmentDocumentReviewBody && this.documentUploadToken == other.documentUploadToken && this.status == other.status && this.acceptedEntityStatusReasons == other.acceptedEntityStatusReasons && this.statusReason == other.statusReason && this.additionalProperties == other.additionalProperties /* spotless:on */
        }

        private var hashCode: Int = 0

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode = /* spotless:off */ Objects.hash(documentUploadToken, status, acceptedEntityStatusReasons, statusReason, additionalProperties) /* spotless:on */
            }
            return hashCode
        }

        override fun toString() =
            "AccountHolderSimulateEnrollmentDocumentReviewBody{documentUploadToken=$documentUploadToken, status=$status, acceptedEntityStatusReasons=$acceptedEntityStatusReasons, statusReason=$statusReason, additionalProperties=$additionalProperties}"
    }

    fun _additionalHeaders(): Map<String, List<String>> = additionalHeaders

    fun _additionalQueryParams(): Map<String, List<String>> = additionalQueryParams

    fun _additionalBodyProperties(): Map<String, JsonValue> = additionalBodyProperties

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is AccountHolderSimulateEnrollmentDocumentReviewParams && this.documentUploadToken == other.documentUploadToken && this.status == other.status && this.acceptedEntityStatusReasons == other.acceptedEntityStatusReasons && this.statusReason == other.statusReason && this.additionalHeaders == other.additionalHeaders && this.additionalQueryParams == other.additionalQueryParams && this.additionalBodyProperties == other.additionalBodyProperties /* spotless:on */
    }

    override fun hashCode(): Int {
        return /* spotless:off */ Objects.hash(documentUploadToken, status, acceptedEntityStatusReasons, statusReason, additionalHeaders, additionalQueryParams, additionalBodyProperties) /* spotless:on */
    }

    override fun toString() =
        "AccountHolderSimulateEnrollmentDocumentReviewParams{documentUploadToken=$documentUploadToken, status=$status, acceptedEntityStatusReasons=$acceptedEntityStatusReasons, statusReason=$statusReason, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams, additionalBodyProperties=$additionalBodyProperties}"

    fun toBuilder() = Builder().from(this)

    companion object {

        fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var documentUploadToken: String? = null
        private var status: Status? = null
        private var acceptedEntityStatusReasons: MutableList<String> = mutableListOf()
        private var statusReason: DocumentUploadStatusReasons? = null
        private var additionalHeaders: ListMultimap<String, String> = ArrayListMultimap.create()
        private var additionalQueryParams: ListMultimap<String, String> = ArrayListMultimap.create()
        private var additionalBodyProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(
            accountHolderSimulateEnrollmentDocumentReviewParams:
                AccountHolderSimulateEnrollmentDocumentReviewParams
        ) = apply {
            this.documentUploadToken =
                accountHolderSimulateEnrollmentDocumentReviewParams.documentUploadToken
            this.status = accountHolderSimulateEnrollmentDocumentReviewParams.status
            this.acceptedEntityStatusReasons(
                accountHolderSimulateEnrollmentDocumentReviewParams.acceptedEntityStatusReasons
                    ?: listOf()
            )
            this.statusReason = accountHolderSimulateEnrollmentDocumentReviewParams.statusReason
            additionalHeaders(accountHolderSimulateEnrollmentDocumentReviewParams.additionalHeaders)
            additionalQueryParams(
                accountHolderSimulateEnrollmentDocumentReviewParams.additionalQueryParams
            )
            additionalBodyProperties(
                accountHolderSimulateEnrollmentDocumentReviewParams.additionalBodyProperties
            )
        }

        /** The account holder document upload which to perform the simulation upon. */
        fun documentUploadToken(documentUploadToken: String) = apply {
            this.documentUploadToken = documentUploadToken
        }

        /** An account holder document's upload status for use within the simulation. */
        fun status(status: Status) = apply { this.status = status }

        /** A list of status reasons associated with a KYB account holder in PENDING_REVIEW */
        fun acceptedEntityStatusReasons(acceptedEntityStatusReasons: List<String>) = apply {
            this.acceptedEntityStatusReasons.clear()
            this.acceptedEntityStatusReasons.addAll(acceptedEntityStatusReasons)
        }

        /** A list of status reasons associated with a KYB account holder in PENDING_REVIEW */
        fun addAcceptedEntityStatusReason(acceptedEntityStatusReason: String) = apply {
            this.acceptedEntityStatusReasons.add(acceptedEntityStatusReason)
        }

        /**
         * Status reason that will be associated with the simulated account holder status. Only
         * required for a `REJECTED` status or `PARTIAL_APPROVAL` status.
         */
        fun statusReason(statusReason: DocumentUploadStatusReasons) = apply {
            this.statusReason = statusReason
        }

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

        fun removeAdditionalHeader(name: String) = apply { additionalHeaders.removeAll(name) }

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

        fun removeAdditionalQueryParam(key: String) = apply { additionalQueryParams.removeAll(key) }

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

        fun build(): AccountHolderSimulateEnrollmentDocumentReviewParams =
            AccountHolderSimulateEnrollmentDocumentReviewParams(
                checkNotNull(documentUploadToken) {
                    "`documentUploadToken` is required but was not set"
                },
                checkNotNull(status) { "`status` is required but was not set" },
                if (acceptedEntityStatusReasons.size == 0) null
                else acceptedEntityStatusReasons.toImmutable(),
                statusReason,
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

    class Status
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Status && this.value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()

        companion object {

            val UPLOADED = Status(JsonField.of("UPLOADED"))

            val ACCEPTED = Status(JsonField.of("ACCEPTED"))

            val REJECTED = Status(JsonField.of("REJECTED"))

            val PARTIAL_APPROVAL = Status(JsonField.of("PARTIAL_APPROVAL"))

            fun of(value: String) = Status(JsonField.of(value))
        }

        enum class Known {
            UPLOADED,
            ACCEPTED,
            REJECTED,
            PARTIAL_APPROVAL,
        }

        enum class Value {
            UPLOADED,
            ACCEPTED,
            REJECTED,
            PARTIAL_APPROVAL,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                UPLOADED -> Value.UPLOADED
                ACCEPTED -> Value.ACCEPTED
                REJECTED -> Value.REJECTED
                PARTIAL_APPROVAL -> Value.PARTIAL_APPROVAL
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                UPLOADED -> Known.UPLOADED
                ACCEPTED -> Known.ACCEPTED
                REJECTED -> Known.REJECTED
                PARTIAL_APPROVAL -> Known.PARTIAL_APPROVAL
                else -> throw LithicInvalidDataException("Unknown Status: $value")
            }

        fun asString(): String = _value().asStringOrThrow()
    }

    class DocumentUploadStatusReasons
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is DocumentUploadStatusReasons && this.value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()

        companion object {

            val DOCUMENT_MISSING_REQUIRED_DATA =
                DocumentUploadStatusReasons(JsonField.of("DOCUMENT_MISSING_REQUIRED_DATA"))

            val DOCUMENT_UPLOAD_TOO_BLURRY =
                DocumentUploadStatusReasons(JsonField.of("DOCUMENT_UPLOAD_TOO_BLURRY"))

            val FILE_SIZE_TOO_LARGE =
                DocumentUploadStatusReasons(JsonField.of("FILE_SIZE_TOO_LARGE"))

            val INVALID_DOCUMENT_TYPE =
                DocumentUploadStatusReasons(JsonField.of("INVALID_DOCUMENT_TYPE"))

            val INVALID_DOCUMENT_UPLOAD =
                DocumentUploadStatusReasons(JsonField.of("INVALID_DOCUMENT_UPLOAD"))

            val INVALID_ENTITY = DocumentUploadStatusReasons(JsonField.of("INVALID_ENTITY"))

            val DOCUMENT_EXPIRED = DocumentUploadStatusReasons(JsonField.of("DOCUMENT_EXPIRED"))

            val DOCUMENT_ISSUED_GREATER_THAN_30_DAYS =
                DocumentUploadStatusReasons(JsonField.of("DOCUMENT_ISSUED_GREATER_THAN_30_DAYS"))

            val DOCUMENT_TYPE_NOT_SUPPORTED =
                DocumentUploadStatusReasons(JsonField.of("DOCUMENT_TYPE_NOT_SUPPORTED"))

            val UNKNOWN_FAILURE_REASON =
                DocumentUploadStatusReasons(JsonField.of("UNKNOWN_FAILURE_REASON"))

            val UNKNOWN_ERROR = DocumentUploadStatusReasons(JsonField.of("UNKNOWN_ERROR"))

            fun of(value: String) = DocumentUploadStatusReasons(JsonField.of(value))
        }

        enum class Known {
            DOCUMENT_MISSING_REQUIRED_DATA,
            DOCUMENT_UPLOAD_TOO_BLURRY,
            FILE_SIZE_TOO_LARGE,
            INVALID_DOCUMENT_TYPE,
            INVALID_DOCUMENT_UPLOAD,
            INVALID_ENTITY,
            DOCUMENT_EXPIRED,
            DOCUMENT_ISSUED_GREATER_THAN_30_DAYS,
            DOCUMENT_TYPE_NOT_SUPPORTED,
            UNKNOWN_FAILURE_REASON,
            UNKNOWN_ERROR,
        }

        enum class Value {
            DOCUMENT_MISSING_REQUIRED_DATA,
            DOCUMENT_UPLOAD_TOO_BLURRY,
            FILE_SIZE_TOO_LARGE,
            INVALID_DOCUMENT_TYPE,
            INVALID_DOCUMENT_UPLOAD,
            INVALID_ENTITY,
            DOCUMENT_EXPIRED,
            DOCUMENT_ISSUED_GREATER_THAN_30_DAYS,
            DOCUMENT_TYPE_NOT_SUPPORTED,
            UNKNOWN_FAILURE_REASON,
            UNKNOWN_ERROR,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                DOCUMENT_MISSING_REQUIRED_DATA -> Value.DOCUMENT_MISSING_REQUIRED_DATA
                DOCUMENT_UPLOAD_TOO_BLURRY -> Value.DOCUMENT_UPLOAD_TOO_BLURRY
                FILE_SIZE_TOO_LARGE -> Value.FILE_SIZE_TOO_LARGE
                INVALID_DOCUMENT_TYPE -> Value.INVALID_DOCUMENT_TYPE
                INVALID_DOCUMENT_UPLOAD -> Value.INVALID_DOCUMENT_UPLOAD
                INVALID_ENTITY -> Value.INVALID_ENTITY
                DOCUMENT_EXPIRED -> Value.DOCUMENT_EXPIRED
                DOCUMENT_ISSUED_GREATER_THAN_30_DAYS -> Value.DOCUMENT_ISSUED_GREATER_THAN_30_DAYS
                DOCUMENT_TYPE_NOT_SUPPORTED -> Value.DOCUMENT_TYPE_NOT_SUPPORTED
                UNKNOWN_FAILURE_REASON -> Value.UNKNOWN_FAILURE_REASON
                UNKNOWN_ERROR -> Value.UNKNOWN_ERROR
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                DOCUMENT_MISSING_REQUIRED_DATA -> Known.DOCUMENT_MISSING_REQUIRED_DATA
                DOCUMENT_UPLOAD_TOO_BLURRY -> Known.DOCUMENT_UPLOAD_TOO_BLURRY
                FILE_SIZE_TOO_LARGE -> Known.FILE_SIZE_TOO_LARGE
                INVALID_DOCUMENT_TYPE -> Known.INVALID_DOCUMENT_TYPE
                INVALID_DOCUMENT_UPLOAD -> Known.INVALID_DOCUMENT_UPLOAD
                INVALID_ENTITY -> Known.INVALID_ENTITY
                DOCUMENT_EXPIRED -> Known.DOCUMENT_EXPIRED
                DOCUMENT_ISSUED_GREATER_THAN_30_DAYS -> Known.DOCUMENT_ISSUED_GREATER_THAN_30_DAYS
                DOCUMENT_TYPE_NOT_SUPPORTED -> Known.DOCUMENT_TYPE_NOT_SUPPORTED
                UNKNOWN_FAILURE_REASON -> Known.UNKNOWN_FAILURE_REASON
                UNKNOWN_ERROR -> Known.UNKNOWN_ERROR
                else ->
                    throw LithicInvalidDataException("Unknown DocumentUploadStatusReasons: $value")
            }

        fun asString(): String = _value().asStringOrThrow()
    }
}
