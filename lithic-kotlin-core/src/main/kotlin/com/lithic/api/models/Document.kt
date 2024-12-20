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

/** Describes the document and the required document image uploads required to re-run KYC */
@JsonDeserialize(builder = Document.Builder::class)
@NoAutoDetect
class Document
private constructor(
    private val token: JsonField<String>,
    private val accountHolderToken: JsonField<String>,
    private val documentType: JsonField<DocumentType>,
    private val entityToken: JsonField<String>,
    private val requiredDocumentUploads: JsonField<List<RequiredDocumentUpload>>,
    private val additionalProperties: Map<String, JsonValue>,
) {

    private var validated: Boolean = false

    /** Globally unique identifier for the document. */
    fun token(): String = token.getRequired("token")

    /** Globally unique identifier for the account holder. */
    fun accountHolderToken(): String = accountHolderToken.getRequired("account_holder_token")

    /** Type of documentation to be submitted for verification of an account holder */
    fun documentType(): DocumentType = documentType.getRequired("document_type")

    /** Globally unique identifier for an entity. */
    fun entityToken(): String = entityToken.getRequired("entity_token")

    /** Represents a single image of the document to upload. */
    fun requiredDocumentUploads(): List<RequiredDocumentUpload> =
        requiredDocumentUploads.getRequired("required_document_uploads")

    /** Globally unique identifier for the document. */
    @JsonProperty("token") @ExcludeMissing fun _token() = token

    /** Globally unique identifier for the account holder. */
    @JsonProperty("account_holder_token")
    @ExcludeMissing
    fun _accountHolderToken() = accountHolderToken

    /** Type of documentation to be submitted for verification of an account holder */
    @JsonProperty("document_type") @ExcludeMissing fun _documentType() = documentType

    /** Globally unique identifier for an entity. */
    @JsonProperty("entity_token") @ExcludeMissing fun _entityToken() = entityToken

    /** Represents a single image of the document to upload. */
    @JsonProperty("required_document_uploads")
    @ExcludeMissing
    fun _requiredDocumentUploads() = requiredDocumentUploads

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    fun validate(): Document = apply {
        if (!validated) {
            token()
            accountHolderToken()
            documentType()
            entityToken()
            requiredDocumentUploads().forEach { it.validate() }
            validated = true
        }
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        fun builder() = Builder()
    }

    class Builder {

        private var token: JsonField<String> = JsonMissing.of()
        private var accountHolderToken: JsonField<String> = JsonMissing.of()
        private var documentType: JsonField<DocumentType> = JsonMissing.of()
        private var entityToken: JsonField<String> = JsonMissing.of()
        private var requiredDocumentUploads: JsonField<List<RequiredDocumentUpload>> =
            JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(document: Document) = apply {
            this.token = document.token
            this.accountHolderToken = document.accountHolderToken
            this.documentType = document.documentType
            this.entityToken = document.entityToken
            this.requiredDocumentUploads = document.requiredDocumentUploads
            additionalProperties(document.additionalProperties)
        }

        /** Globally unique identifier for the document. */
        fun token(token: String) = token(JsonField.of(token))

        /** Globally unique identifier for the document. */
        @JsonProperty("token")
        @ExcludeMissing
        fun token(token: JsonField<String>) = apply { this.token = token }

        /** Globally unique identifier for the account holder. */
        fun accountHolderToken(accountHolderToken: String) =
            accountHolderToken(JsonField.of(accountHolderToken))

        /** Globally unique identifier for the account holder. */
        @JsonProperty("account_holder_token")
        @ExcludeMissing
        fun accountHolderToken(accountHolderToken: JsonField<String>) = apply {
            this.accountHolderToken = accountHolderToken
        }

        /** Type of documentation to be submitted for verification of an account holder */
        fun documentType(documentType: DocumentType) = documentType(JsonField.of(documentType))

        /** Type of documentation to be submitted for verification of an account holder */
        @JsonProperty("document_type")
        @ExcludeMissing
        fun documentType(documentType: JsonField<DocumentType>) = apply {
            this.documentType = documentType
        }

        /** Globally unique identifier for an entity. */
        fun entityToken(entityToken: String) = entityToken(JsonField.of(entityToken))

        /** Globally unique identifier for an entity. */
        @JsonProperty("entity_token")
        @ExcludeMissing
        fun entityToken(entityToken: JsonField<String>) = apply { this.entityToken = entityToken }

        /** Represents a single image of the document to upload. */
        fun requiredDocumentUploads(requiredDocumentUploads: List<RequiredDocumentUpload>) =
            requiredDocumentUploads(JsonField.of(requiredDocumentUploads))

        /** Represents a single image of the document to upload. */
        @JsonProperty("required_document_uploads")
        @ExcludeMissing
        fun requiredDocumentUploads(
            requiredDocumentUploads: JsonField<List<RequiredDocumentUpload>>
        ) = apply { this.requiredDocumentUploads = requiredDocumentUploads }

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

        fun build(): Document =
            Document(
                token,
                accountHolderToken,
                documentType,
                entityToken,
                requiredDocumentUploads.map { it.toImmutable() },
                additionalProperties.toImmutable(),
            )
    }

    class DocumentType
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is DocumentType && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()

        companion object {

            val DRIVERS_LICENSE = DocumentType(JsonField.of("DRIVERS_LICENSE"))

            val PASSPORT = DocumentType(JsonField.of("PASSPORT"))

            val PASSPORT_CARD = DocumentType(JsonField.of("PASSPORT_CARD"))

            val EIN_LETTER = DocumentType(JsonField.of("EIN_LETTER"))

            val TAX_RETURN = DocumentType(JsonField.of("TAX_RETURN"))

            val OPERATING_AGREEMENT = DocumentType(JsonField.of("OPERATING_AGREEMENT"))

            val CERTIFICATE_OF_FORMATION = DocumentType(JsonField.of("CERTIFICATE_OF_FORMATION"))

            val CERTIFICATE_OF_GOOD_STANDING =
                DocumentType(JsonField.of("CERTIFICATE_OF_GOOD_STANDING"))

            val ARTICLES_OF_INCORPORATION = DocumentType(JsonField.of("ARTICLES_OF_INCORPORATION"))

            val ARTICLES_OF_ORGANIZATION = DocumentType(JsonField.of("ARTICLES_OF_ORGANIZATION"))

            val BYLAWS = DocumentType(JsonField.of("BYLAWS"))

            val GOVERNMENT_BUSINESS_LICENSE =
                DocumentType(JsonField.of("GOVERNMENT_BUSINESS_LICENSE"))

            val PARTNERSHIP_AGREEMENT = DocumentType(JsonField.of("PARTNERSHIP_AGREEMENT"))

            val SS4_FORM = DocumentType(JsonField.of("SS4_FORM"))

            val BANK_STATEMENT = DocumentType(JsonField.of("BANK_STATEMENT"))

            val UTILITY_BILL_STATEMENT = DocumentType(JsonField.of("UTILITY_BILL_STATEMENT"))

            val SSN_CARD = DocumentType(JsonField.of("SSN_CARD"))

            val ITIN_LETTER = DocumentType(JsonField.of("ITIN_LETTER"))

            fun of(value: String) = DocumentType(JsonField.of(value))
        }

        enum class Known {
            DRIVERS_LICENSE,
            PASSPORT,
            PASSPORT_CARD,
            EIN_LETTER,
            TAX_RETURN,
            OPERATING_AGREEMENT,
            CERTIFICATE_OF_FORMATION,
            CERTIFICATE_OF_GOOD_STANDING,
            ARTICLES_OF_INCORPORATION,
            ARTICLES_OF_ORGANIZATION,
            BYLAWS,
            GOVERNMENT_BUSINESS_LICENSE,
            PARTNERSHIP_AGREEMENT,
            SS4_FORM,
            BANK_STATEMENT,
            UTILITY_BILL_STATEMENT,
            SSN_CARD,
            ITIN_LETTER,
        }

        enum class Value {
            DRIVERS_LICENSE,
            PASSPORT,
            PASSPORT_CARD,
            EIN_LETTER,
            TAX_RETURN,
            OPERATING_AGREEMENT,
            CERTIFICATE_OF_FORMATION,
            CERTIFICATE_OF_GOOD_STANDING,
            ARTICLES_OF_INCORPORATION,
            ARTICLES_OF_ORGANIZATION,
            BYLAWS,
            GOVERNMENT_BUSINESS_LICENSE,
            PARTNERSHIP_AGREEMENT,
            SS4_FORM,
            BANK_STATEMENT,
            UTILITY_BILL_STATEMENT,
            SSN_CARD,
            ITIN_LETTER,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                DRIVERS_LICENSE -> Value.DRIVERS_LICENSE
                PASSPORT -> Value.PASSPORT
                PASSPORT_CARD -> Value.PASSPORT_CARD
                EIN_LETTER -> Value.EIN_LETTER
                TAX_RETURN -> Value.TAX_RETURN
                OPERATING_AGREEMENT -> Value.OPERATING_AGREEMENT
                CERTIFICATE_OF_FORMATION -> Value.CERTIFICATE_OF_FORMATION
                CERTIFICATE_OF_GOOD_STANDING -> Value.CERTIFICATE_OF_GOOD_STANDING
                ARTICLES_OF_INCORPORATION -> Value.ARTICLES_OF_INCORPORATION
                ARTICLES_OF_ORGANIZATION -> Value.ARTICLES_OF_ORGANIZATION
                BYLAWS -> Value.BYLAWS
                GOVERNMENT_BUSINESS_LICENSE -> Value.GOVERNMENT_BUSINESS_LICENSE
                PARTNERSHIP_AGREEMENT -> Value.PARTNERSHIP_AGREEMENT
                SS4_FORM -> Value.SS4_FORM
                BANK_STATEMENT -> Value.BANK_STATEMENT
                UTILITY_BILL_STATEMENT -> Value.UTILITY_BILL_STATEMENT
                SSN_CARD -> Value.SSN_CARD
                ITIN_LETTER -> Value.ITIN_LETTER
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                DRIVERS_LICENSE -> Known.DRIVERS_LICENSE
                PASSPORT -> Known.PASSPORT
                PASSPORT_CARD -> Known.PASSPORT_CARD
                EIN_LETTER -> Known.EIN_LETTER
                TAX_RETURN -> Known.TAX_RETURN
                OPERATING_AGREEMENT -> Known.OPERATING_AGREEMENT
                CERTIFICATE_OF_FORMATION -> Known.CERTIFICATE_OF_FORMATION
                CERTIFICATE_OF_GOOD_STANDING -> Known.CERTIFICATE_OF_GOOD_STANDING
                ARTICLES_OF_INCORPORATION -> Known.ARTICLES_OF_INCORPORATION
                ARTICLES_OF_ORGANIZATION -> Known.ARTICLES_OF_ORGANIZATION
                BYLAWS -> Known.BYLAWS
                GOVERNMENT_BUSINESS_LICENSE -> Known.GOVERNMENT_BUSINESS_LICENSE
                PARTNERSHIP_AGREEMENT -> Known.PARTNERSHIP_AGREEMENT
                SS4_FORM -> Known.SS4_FORM
                BANK_STATEMENT -> Known.BANK_STATEMENT
                UTILITY_BILL_STATEMENT -> Known.UTILITY_BILL_STATEMENT
                SSN_CARD -> Known.SSN_CARD
                ITIN_LETTER -> Known.ITIN_LETTER
                else -> throw LithicInvalidDataException("Unknown DocumentType: $value")
            }

        fun asString(): String = _value().asStringOrThrow()
    }

    /** Represents a single image of the document to upload. */
    @JsonDeserialize(builder = RequiredDocumentUpload.Builder::class)
    @NoAutoDetect
    class RequiredDocumentUpload
    private constructor(
        private val imageType: JsonField<ImageType>,
        private val status: JsonField<DocumentUploadStatus>,
        private val statusReasons: JsonField<List<DocumentUploadStatusReasons>>,
        private val uploadUrl: JsonField<String>,
        private val token: JsonField<String>,
        private val acceptedEntityStatusReasons: JsonField<List<String>>,
        private val rejectedEntityStatusReasons: JsonField<List<String>>,
        private val created: JsonField<OffsetDateTime>,
        private val updated: JsonField<OffsetDateTime>,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var validated: Boolean = false

        /** Type of image to upload. */
        fun imageType(): ImageType = imageType.getRequired("image_type")

        /** Status of an account holder's document upload. */
        fun status(): DocumentUploadStatus = status.getRequired("status")

        /** Reasons for document image upload status. */
        fun statusReasons(): List<DocumentUploadStatusReasons> =
            statusReasons.getRequired("status_reasons")

        /**
         * URL to upload document image to.
         *
         * Note that the upload URLs expire after 7 days. If an upload URL expires, you can refresh
         * the URLs by retrieving the document upload from `GET
         * /account_holders/{account_holder_token}/documents`.
         */
        fun uploadUrl(): String = uploadUrl.getRequired("upload_url")

        /** Globally unique identifier for the document upload. */
        fun token(): String = token.getRequired("token")

        /**
         * A list of status reasons associated with a KYB account holder that have been satisfied by
         * the document upload
         */
        fun acceptedEntityStatusReasons(): List<String> =
            acceptedEntityStatusReasons.getRequired("accepted_entity_status_reasons")

        /**
         * A list of status reasons associated with a KYB account holder that have not been
         * satisfied by the document upload
         */
        fun rejectedEntityStatusReasons(): List<String> =
            rejectedEntityStatusReasons.getRequired("rejected_entity_status_reasons")

        /** When the document upload was created */
        fun created(): OffsetDateTime = created.getRequired("created")

        /** When the document upload was last updated */
        fun updated(): OffsetDateTime = updated.getRequired("updated")

        /** Type of image to upload. */
        @JsonProperty("image_type") @ExcludeMissing fun _imageType() = imageType

        /** Status of an account holder's document upload. */
        @JsonProperty("status") @ExcludeMissing fun _status() = status

        /** Reasons for document image upload status. */
        @JsonProperty("status_reasons") @ExcludeMissing fun _statusReasons() = statusReasons

        /**
         * URL to upload document image to.
         *
         * Note that the upload URLs expire after 7 days. If an upload URL expires, you can refresh
         * the URLs by retrieving the document upload from `GET
         * /account_holders/{account_holder_token}/documents`.
         */
        @JsonProperty("upload_url") @ExcludeMissing fun _uploadUrl() = uploadUrl

        /** Globally unique identifier for the document upload. */
        @JsonProperty("token") @ExcludeMissing fun _token() = token

        /**
         * A list of status reasons associated with a KYB account holder that have been satisfied by
         * the document upload
         */
        @JsonProperty("accepted_entity_status_reasons")
        @ExcludeMissing
        fun _acceptedEntityStatusReasons() = acceptedEntityStatusReasons

        /**
         * A list of status reasons associated with a KYB account holder that have not been
         * satisfied by the document upload
         */
        @JsonProperty("rejected_entity_status_reasons")
        @ExcludeMissing
        fun _rejectedEntityStatusReasons() = rejectedEntityStatusReasons

        /** When the document upload was created */
        @JsonProperty("created") @ExcludeMissing fun _created() = created

        /** When the document upload was last updated */
        @JsonProperty("updated") @ExcludeMissing fun _updated() = updated

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun validate(): RequiredDocumentUpload = apply {
            if (!validated) {
                imageType()
                status()
                statusReasons()
                uploadUrl()
                token()
                acceptedEntityStatusReasons()
                rejectedEntityStatusReasons()
                created()
                updated()
                validated = true
            }
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var imageType: JsonField<ImageType> = JsonMissing.of()
            private var status: JsonField<DocumentUploadStatus> = JsonMissing.of()
            private var statusReasons: JsonField<List<DocumentUploadStatusReasons>> =
                JsonMissing.of()
            private var uploadUrl: JsonField<String> = JsonMissing.of()
            private var token: JsonField<String> = JsonMissing.of()
            private var acceptedEntityStatusReasons: JsonField<List<String>> = JsonMissing.of()
            private var rejectedEntityStatusReasons: JsonField<List<String>> = JsonMissing.of()
            private var created: JsonField<OffsetDateTime> = JsonMissing.of()
            private var updated: JsonField<OffsetDateTime> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(requiredDocumentUpload: RequiredDocumentUpload) = apply {
                this.imageType = requiredDocumentUpload.imageType
                this.status = requiredDocumentUpload.status
                this.statusReasons = requiredDocumentUpload.statusReasons
                this.uploadUrl = requiredDocumentUpload.uploadUrl
                this.token = requiredDocumentUpload.token
                this.acceptedEntityStatusReasons =
                    requiredDocumentUpload.acceptedEntityStatusReasons
                this.rejectedEntityStatusReasons =
                    requiredDocumentUpload.rejectedEntityStatusReasons
                this.created = requiredDocumentUpload.created
                this.updated = requiredDocumentUpload.updated
                additionalProperties(requiredDocumentUpload.additionalProperties)
            }

            /** Type of image to upload. */
            fun imageType(imageType: ImageType) = imageType(JsonField.of(imageType))

            /** Type of image to upload. */
            @JsonProperty("image_type")
            @ExcludeMissing
            fun imageType(imageType: JsonField<ImageType>) = apply { this.imageType = imageType }

            /** Status of an account holder's document upload. */
            fun status(status: DocumentUploadStatus) = status(JsonField.of(status))

            /** Status of an account holder's document upload. */
            @JsonProperty("status")
            @ExcludeMissing
            fun status(status: JsonField<DocumentUploadStatus>) = apply { this.status = status }

            /** Reasons for document image upload status. */
            fun statusReasons(statusReasons: List<DocumentUploadStatusReasons>) =
                statusReasons(JsonField.of(statusReasons))

            /** Reasons for document image upload status. */
            @JsonProperty("status_reasons")
            @ExcludeMissing
            fun statusReasons(statusReasons: JsonField<List<DocumentUploadStatusReasons>>) = apply {
                this.statusReasons = statusReasons
            }

            /**
             * URL to upload document image to.
             *
             * Note that the upload URLs expire after 7 days. If an upload URL expires, you can
             * refresh the URLs by retrieving the document upload from `GET
             * /account_holders/{account_holder_token}/documents`.
             */
            fun uploadUrl(uploadUrl: String) = uploadUrl(JsonField.of(uploadUrl))

            /**
             * URL to upload document image to.
             *
             * Note that the upload URLs expire after 7 days. If an upload URL expires, you can
             * refresh the URLs by retrieving the document upload from `GET
             * /account_holders/{account_holder_token}/documents`.
             */
            @JsonProperty("upload_url")
            @ExcludeMissing
            fun uploadUrl(uploadUrl: JsonField<String>) = apply { this.uploadUrl = uploadUrl }

            /** Globally unique identifier for the document upload. */
            fun token(token: String) = token(JsonField.of(token))

            /** Globally unique identifier for the document upload. */
            @JsonProperty("token")
            @ExcludeMissing
            fun token(token: JsonField<String>) = apply { this.token = token }

            /**
             * A list of status reasons associated with a KYB account holder that have been
             * satisfied by the document upload
             */
            fun acceptedEntityStatusReasons(acceptedEntityStatusReasons: List<String>) =
                acceptedEntityStatusReasons(JsonField.of(acceptedEntityStatusReasons))

            /**
             * A list of status reasons associated with a KYB account holder that have been
             * satisfied by the document upload
             */
            @JsonProperty("accepted_entity_status_reasons")
            @ExcludeMissing
            fun acceptedEntityStatusReasons(acceptedEntityStatusReasons: JsonField<List<String>>) =
                apply {
                    this.acceptedEntityStatusReasons = acceptedEntityStatusReasons
                }

            /**
             * A list of status reasons associated with a KYB account holder that have not been
             * satisfied by the document upload
             */
            fun rejectedEntityStatusReasons(rejectedEntityStatusReasons: List<String>) =
                rejectedEntityStatusReasons(JsonField.of(rejectedEntityStatusReasons))

            /**
             * A list of status reasons associated with a KYB account holder that have not been
             * satisfied by the document upload
             */
            @JsonProperty("rejected_entity_status_reasons")
            @ExcludeMissing
            fun rejectedEntityStatusReasons(rejectedEntityStatusReasons: JsonField<List<String>>) =
                apply {
                    this.rejectedEntityStatusReasons = rejectedEntityStatusReasons
                }

            /** When the document upload was created */
            fun created(created: OffsetDateTime) = created(JsonField.of(created))

            /** When the document upload was created */
            @JsonProperty("created")
            @ExcludeMissing
            fun created(created: JsonField<OffsetDateTime>) = apply { this.created = created }

            /** When the document upload was last updated */
            fun updated(updated: OffsetDateTime) = updated(JsonField.of(updated))

            /** When the document upload was last updated */
            @JsonProperty("updated")
            @ExcludeMissing
            fun updated(updated: JsonField<OffsetDateTime>) = apply { this.updated = updated }

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

            fun build(): RequiredDocumentUpload =
                RequiredDocumentUpload(
                    imageType,
                    status,
                    statusReasons.map { it.toImmutable() },
                    uploadUrl,
                    token,
                    acceptedEntityStatusReasons.map { it.toImmutable() },
                    rejectedEntityStatusReasons.map { it.toImmutable() },
                    created,
                    updated,
                    additionalProperties.toImmutable(),
                )
        }

        class ImageType
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) : Enum {

            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is ImageType && value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()

            companion object {

                val FRONT = ImageType(JsonField.of("FRONT"))

                val BACK = ImageType(JsonField.of("BACK"))

                fun of(value: String) = ImageType(JsonField.of(value))
            }

            enum class Known {
                FRONT,
                BACK,
            }

            enum class Value {
                FRONT,
                BACK,
                _UNKNOWN,
            }

            fun value(): Value =
                when (this) {
                    FRONT -> Value.FRONT
                    BACK -> Value.BACK
                    else -> Value._UNKNOWN
                }

            fun known(): Known =
                when (this) {
                    FRONT -> Known.FRONT
                    BACK -> Known.BACK
                    else -> throw LithicInvalidDataException("Unknown ImageType: $value")
                }

            fun asString(): String = _value().asStringOrThrow()
        }

        class DocumentUploadStatus
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) : Enum {

            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is DocumentUploadStatus && value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()

            companion object {

                val ACCEPTED = DocumentUploadStatus(JsonField.of("ACCEPTED"))

                val REJECTED = DocumentUploadStatus(JsonField.of("REJECTED"))

                val PENDING_UPLOAD = DocumentUploadStatus(JsonField.of("PENDING_UPLOAD"))

                val UPLOADED = DocumentUploadStatus(JsonField.of("UPLOADED"))

                val PARTIAL_APPROVAL = DocumentUploadStatus(JsonField.of("PARTIAL_APPROVAL"))

                fun of(value: String) = DocumentUploadStatus(JsonField.of(value))
            }

            enum class Known {
                ACCEPTED,
                REJECTED,
                PENDING_UPLOAD,
                UPLOADED,
                PARTIAL_APPROVAL,
            }

            enum class Value {
                ACCEPTED,
                REJECTED,
                PENDING_UPLOAD,
                UPLOADED,
                PARTIAL_APPROVAL,
                _UNKNOWN,
            }

            fun value(): Value =
                when (this) {
                    ACCEPTED -> Value.ACCEPTED
                    REJECTED -> Value.REJECTED
                    PENDING_UPLOAD -> Value.PENDING_UPLOAD
                    UPLOADED -> Value.UPLOADED
                    PARTIAL_APPROVAL -> Value.PARTIAL_APPROVAL
                    else -> Value._UNKNOWN
                }

            fun known(): Known =
                when (this) {
                    ACCEPTED -> Known.ACCEPTED
                    REJECTED -> Known.REJECTED
                    PENDING_UPLOAD -> Known.PENDING_UPLOAD
                    UPLOADED -> Known.UPLOADED
                    PARTIAL_APPROVAL -> Known.PARTIAL_APPROVAL
                    else -> throw LithicInvalidDataException("Unknown DocumentUploadStatus: $value")
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

                return /* spotless:off */ other is DocumentUploadStatusReasons && value == other.value /* spotless:on */
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
                    DocumentUploadStatusReasons(
                        JsonField.of("DOCUMENT_ISSUED_GREATER_THAN_30_DAYS")
                    )

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
                    DOCUMENT_ISSUED_GREATER_THAN_30_DAYS ->
                        Value.DOCUMENT_ISSUED_GREATER_THAN_30_DAYS
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
                    DOCUMENT_ISSUED_GREATER_THAN_30_DAYS ->
                        Known.DOCUMENT_ISSUED_GREATER_THAN_30_DAYS
                    DOCUMENT_TYPE_NOT_SUPPORTED -> Known.DOCUMENT_TYPE_NOT_SUPPORTED
                    UNKNOWN_FAILURE_REASON -> Known.UNKNOWN_FAILURE_REASON
                    UNKNOWN_ERROR -> Known.UNKNOWN_ERROR
                    else ->
                        throw LithicInvalidDataException(
                            "Unknown DocumentUploadStatusReasons: $value"
                        )
                }

            fun asString(): String = _value().asStringOrThrow()
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is RequiredDocumentUpload && imageType == other.imageType && status == other.status && statusReasons == other.statusReasons && uploadUrl == other.uploadUrl && token == other.token && acceptedEntityStatusReasons == other.acceptedEntityStatusReasons && rejectedEntityStatusReasons == other.rejectedEntityStatusReasons && created == other.created && updated == other.updated && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(imageType, status, statusReasons, uploadUrl, token, acceptedEntityStatusReasons, rejectedEntityStatusReasons, created, updated, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "RequiredDocumentUpload{imageType=$imageType, status=$status, statusReasons=$statusReasons, uploadUrl=$uploadUrl, token=$token, acceptedEntityStatusReasons=$acceptedEntityStatusReasons, rejectedEntityStatusReasons=$rejectedEntityStatusReasons, created=$created, updated=$updated, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is Document && token == other.token && accountHolderToken == other.accountHolderToken && documentType == other.documentType && entityToken == other.entityToken && requiredDocumentUploads == other.requiredDocumentUploads && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(token, accountHolderToken, documentType, entityToken, requiredDocumentUploads, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "Document{token=$token, accountHolderToken=$accountHolderToken, documentType=$documentType, entityToken=$entityToken, requiredDocumentUploads=$requiredDocumentUploads, additionalProperties=$additionalProperties}"
}
