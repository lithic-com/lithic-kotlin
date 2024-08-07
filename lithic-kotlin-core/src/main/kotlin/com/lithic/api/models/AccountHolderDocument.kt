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
import com.lithic.api.core.toUnmodifiable
import com.lithic.api.errors.LithicInvalidDataException
import java.util.Objects

/** Describes the document and the required document image uploads required to re-run KYC. */
@JsonDeserialize(builder = AccountHolderDocument.Builder::class)
@NoAutoDetect
class AccountHolderDocument
private constructor(
    private val accountHolderToken: JsonField<String>,
    private val documentType: JsonField<DocumentType>,
    private val entityToken: JsonField<String>,
    private val requiredDocumentUploads: JsonField<List<RequiredDocumentUpload>>,
    private val token: JsonField<String>,
    private val additionalProperties: Map<String, JsonValue>,
) {

    private var validated: Boolean = false

    private var hashCode: Int = 0

    /** Globally unique identifier for the account holder. */
    fun accountHolderToken(): String? = accountHolderToken.getNullable("account_holder_token")

    /** Type of documentation to be submitted for verification. */
    fun documentType(): DocumentType? = documentType.getNullable("document_type")

    /** Globally unique identifier for the entity. */
    fun entityToken(): String? = entityToken.getNullable("entity_token")

    fun requiredDocumentUploads(): List<RequiredDocumentUpload>? =
        requiredDocumentUploads.getNullable("required_document_uploads")

    /** Globally unique identifier for the document. */
    fun token(): String? = token.getNullable("token")

    /** Globally unique identifier for the account holder. */
    @JsonProperty("account_holder_token")
    @ExcludeMissing
    fun _accountHolderToken() = accountHolderToken

    /** Type of documentation to be submitted for verification. */
    @JsonProperty("document_type") @ExcludeMissing fun _documentType() = documentType

    /** Globally unique identifier for the entity. */
    @JsonProperty("entity_token") @ExcludeMissing fun _entityToken() = entityToken

    @JsonProperty("required_document_uploads")
    @ExcludeMissing
    fun _requiredDocumentUploads() = requiredDocumentUploads

    /** Globally unique identifier for the document. */
    @JsonProperty("token") @ExcludeMissing fun _token() = token

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    fun validate(): AccountHolderDocument = apply {
        if (!validated) {
            accountHolderToken()
            documentType()
            entityToken()
            requiredDocumentUploads()?.forEach { it.validate() }
            token()
            validated = true
        }
    }

    fun toBuilder() = Builder().from(this)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is AccountHolderDocument &&
            this.accountHolderToken == other.accountHolderToken &&
            this.documentType == other.documentType &&
            this.entityToken == other.entityToken &&
            this.requiredDocumentUploads == other.requiredDocumentUploads &&
            this.token == other.token &&
            this.additionalProperties == other.additionalProperties
    }

    override fun hashCode(): Int {
        if (hashCode == 0) {
            hashCode =
                Objects.hash(
                    accountHolderToken,
                    documentType,
                    entityToken,
                    requiredDocumentUploads,
                    token,
                    additionalProperties,
                )
        }
        return hashCode
    }

    override fun toString() =
        "AccountHolderDocument{accountHolderToken=$accountHolderToken, documentType=$documentType, entityToken=$entityToken, requiredDocumentUploads=$requiredDocumentUploads, token=$token, additionalProperties=$additionalProperties}"

    companion object {

        fun builder() = Builder()
    }

    class Builder {

        private var accountHolderToken: JsonField<String> = JsonMissing.of()
        private var documentType: JsonField<DocumentType> = JsonMissing.of()
        private var entityToken: JsonField<String> = JsonMissing.of()
        private var requiredDocumentUploads: JsonField<List<RequiredDocumentUpload>> =
            JsonMissing.of()
        private var token: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(accountHolderDocument: AccountHolderDocument) = apply {
            this.accountHolderToken = accountHolderDocument.accountHolderToken
            this.documentType = accountHolderDocument.documentType
            this.entityToken = accountHolderDocument.entityToken
            this.requiredDocumentUploads = accountHolderDocument.requiredDocumentUploads
            this.token = accountHolderDocument.token
            additionalProperties(accountHolderDocument.additionalProperties)
        }

        /** Globally unique identifier for the account holder. */
        fun accountHolderToken(accountHolderToken: String) =
            accountHolderToken(JsonField.of(accountHolderToken))

        /** Globally unique identifier for the account holder. */
        @JsonProperty("account_holder_token")
        @ExcludeMissing
        fun accountHolderToken(accountHolderToken: JsonField<String>) = apply {
            this.accountHolderToken = accountHolderToken
        }

        /** Type of documentation to be submitted for verification. */
        fun documentType(documentType: DocumentType) = documentType(JsonField.of(documentType))

        /** Type of documentation to be submitted for verification. */
        @JsonProperty("document_type")
        @ExcludeMissing
        fun documentType(documentType: JsonField<DocumentType>) = apply {
            this.documentType = documentType
        }

        /** Globally unique identifier for the entity. */
        fun entityToken(entityToken: String) = entityToken(JsonField.of(entityToken))

        /** Globally unique identifier for the entity. */
        @JsonProperty("entity_token")
        @ExcludeMissing
        fun entityToken(entityToken: JsonField<String>) = apply { this.entityToken = entityToken }

        fun requiredDocumentUploads(requiredDocumentUploads: List<RequiredDocumentUpload>) =
            requiredDocumentUploads(JsonField.of(requiredDocumentUploads))

        @JsonProperty("required_document_uploads")
        @ExcludeMissing
        fun requiredDocumentUploads(
            requiredDocumentUploads: JsonField<List<RequiredDocumentUpload>>
        ) = apply { this.requiredDocumentUploads = requiredDocumentUploads }

        /** Globally unique identifier for the document. */
        fun token(token: String) = token(JsonField.of(token))

        /** Globally unique identifier for the document. */
        @JsonProperty("token")
        @ExcludeMissing
        fun token(token: JsonField<String>) = apply { this.token = token }

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

        fun build(): AccountHolderDocument =
            AccountHolderDocument(
                accountHolderToken,
                documentType,
                entityToken,
                requiredDocumentUploads.map { it.toUnmodifiable() },
                token,
                additionalProperties.toUnmodifiable(),
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

            return other is DocumentType && this.value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()

        companion object {

            val EIN_LETTER = DocumentType(JsonField.of("EIN_LETTER"))

            val TAX_RETURN = DocumentType(JsonField.of("TAX_RETURN"))

            val OPERATING_AGREEMENT = DocumentType(JsonField.of("OPERATING_AGREEMENT"))

            val CERTIFICATE_OF_FORMATION = DocumentType(JsonField.of("CERTIFICATE_OF_FORMATION"))

            val DRIVERS_LICENSE = DocumentType(JsonField.of("DRIVERS_LICENSE"))

            val PASSPORT = DocumentType(JsonField.of("PASSPORT"))

            val PASSPORT_CARD = DocumentType(JsonField.of("PASSPORT_CARD"))

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
            EIN_LETTER,
            TAX_RETURN,
            OPERATING_AGREEMENT,
            CERTIFICATE_OF_FORMATION,
            DRIVERS_LICENSE,
            PASSPORT,
            PASSPORT_CARD,
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
            EIN_LETTER,
            TAX_RETURN,
            OPERATING_AGREEMENT,
            CERTIFICATE_OF_FORMATION,
            DRIVERS_LICENSE,
            PASSPORT,
            PASSPORT_CARD,
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
                EIN_LETTER -> Value.EIN_LETTER
                TAX_RETURN -> Value.TAX_RETURN
                OPERATING_AGREEMENT -> Value.OPERATING_AGREEMENT
                CERTIFICATE_OF_FORMATION -> Value.CERTIFICATE_OF_FORMATION
                DRIVERS_LICENSE -> Value.DRIVERS_LICENSE
                PASSPORT -> Value.PASSPORT
                PASSPORT_CARD -> Value.PASSPORT_CARD
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
                EIN_LETTER -> Known.EIN_LETTER
                TAX_RETURN -> Known.TAX_RETURN
                OPERATING_AGREEMENT -> Known.OPERATING_AGREEMENT
                CERTIFICATE_OF_FORMATION -> Known.CERTIFICATE_OF_FORMATION
                DRIVERS_LICENSE -> Known.DRIVERS_LICENSE
                PASSPORT -> Known.PASSPORT
                PASSPORT_CARD -> Known.PASSPORT_CARD
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
        private val status: JsonField<Status>,
        private val statusReasons: JsonField<List<StatusReason>>,
        private val uploadUrl: JsonField<String>,
        private val token: JsonField<String>,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var validated: Boolean = false

        private var hashCode: Int = 0

        /** Type of image to upload. */
        fun imageType(): ImageType? = imageType.getNullable("image_type")

        /** Status of document image upload. */
        fun status(): Status? = status.getNullable("status")

        fun statusReasons(): List<StatusReason>? = statusReasons.getNullable("status_reasons")

        /**
         * URL to upload document image to.
         *
         * Note that the upload URLs expire after 7 days. If an upload URL expires, you can refresh
         * the URLs by retrieving the document upload from `GET
         * /account_holders/{account_holder_token}/documents`.
         */
        fun uploadUrl(): String? = uploadUrl.getNullable("upload_url")

        /** Globally unique identifier for the document upload. */
        fun token(): String? = token.getNullable("token")

        /** Type of image to upload. */
        @JsonProperty("image_type") @ExcludeMissing fun _imageType() = imageType

        /** Status of document image upload. */
        @JsonProperty("status") @ExcludeMissing fun _status() = status

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
                validated = true
            }
        }

        fun toBuilder() = Builder().from(this)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is RequiredDocumentUpload &&
                this.imageType == other.imageType &&
                this.status == other.status &&
                this.statusReasons == other.statusReasons &&
                this.uploadUrl == other.uploadUrl &&
                this.token == other.token &&
                this.additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode =
                    Objects.hash(
                        imageType,
                        status,
                        statusReasons,
                        uploadUrl,
                        token,
                        additionalProperties,
                    )
            }
            return hashCode
        }

        override fun toString() =
            "RequiredDocumentUpload{imageType=$imageType, status=$status, statusReasons=$statusReasons, uploadUrl=$uploadUrl, token=$token, additionalProperties=$additionalProperties}"

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var imageType: JsonField<ImageType> = JsonMissing.of()
            private var status: JsonField<Status> = JsonMissing.of()
            private var statusReasons: JsonField<List<StatusReason>> = JsonMissing.of()
            private var uploadUrl: JsonField<String> = JsonMissing.of()
            private var token: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(requiredDocumentUpload: RequiredDocumentUpload) = apply {
                this.imageType = requiredDocumentUpload.imageType
                this.status = requiredDocumentUpload.status
                this.statusReasons = requiredDocumentUpload.statusReasons
                this.uploadUrl = requiredDocumentUpload.uploadUrl
                this.token = requiredDocumentUpload.token
                additionalProperties(requiredDocumentUpload.additionalProperties)
            }

            /** Type of image to upload. */
            fun imageType(imageType: ImageType) = imageType(JsonField.of(imageType))

            /** Type of image to upload. */
            @JsonProperty("image_type")
            @ExcludeMissing
            fun imageType(imageType: JsonField<ImageType>) = apply { this.imageType = imageType }

            /** Status of document image upload. */
            fun status(status: Status) = status(JsonField.of(status))

            /** Status of document image upload. */
            @JsonProperty("status")
            @ExcludeMissing
            fun status(status: JsonField<Status>) = apply { this.status = status }

            fun statusReasons(statusReasons: List<StatusReason>) =
                statusReasons(JsonField.of(statusReasons))

            @JsonProperty("status_reasons")
            @ExcludeMissing
            fun statusReasons(statusReasons: JsonField<List<StatusReason>>) = apply {
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
                    statusReasons.map { it.toUnmodifiable() },
                    uploadUrl,
                    token,
                    additionalProperties.toUnmodifiable(),
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

                return other is ImageType && this.value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()

            companion object {

                val BACK = ImageType(JsonField.of("back"))

                val FRONT = ImageType(JsonField.of("front"))

                fun of(value: String) = ImageType(JsonField.of(value))
            }

            enum class Known {
                BACK,
                FRONT,
            }

            enum class Value {
                BACK,
                FRONT,
                _UNKNOWN,
            }

            fun value(): Value =
                when (this) {
                    BACK -> Value.BACK
                    FRONT -> Value.FRONT
                    else -> Value._UNKNOWN
                }

            fun known(): Known =
                when (this) {
                    BACK -> Known.BACK
                    FRONT -> Known.FRONT
                    else -> throw LithicInvalidDataException("Unknown ImageType: $value")
                }

            fun asString(): String = _value().asStringOrThrow()
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

                return other is Status && this.value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()

            companion object {

                val COMPLETED = Status(JsonField.of("COMPLETED"))

                val FAILED = Status(JsonField.of("FAILED"))

                val PENDING_UPLOAD = Status(JsonField.of("PENDING_UPLOAD"))

                val UPLOADED = Status(JsonField.of("UPLOADED"))

                fun of(value: String) = Status(JsonField.of(value))
            }

            enum class Known {
                COMPLETED,
                FAILED,
                PENDING_UPLOAD,
                UPLOADED,
            }

            enum class Value {
                COMPLETED,
                FAILED,
                PENDING_UPLOAD,
                UPLOADED,
                _UNKNOWN,
            }

            fun value(): Value =
                when (this) {
                    COMPLETED -> Value.COMPLETED
                    FAILED -> Value.FAILED
                    PENDING_UPLOAD -> Value.PENDING_UPLOAD
                    UPLOADED -> Value.UPLOADED
                    else -> Value._UNKNOWN
                }

            fun known(): Known =
                when (this) {
                    COMPLETED -> Known.COMPLETED
                    FAILED -> Known.FAILED
                    PENDING_UPLOAD -> Known.PENDING_UPLOAD
                    UPLOADED -> Known.UPLOADED
                    else -> throw LithicInvalidDataException("Unknown Status: $value")
                }

            fun asString(): String = _value().asStringOrThrow()
        }

        class StatusReason
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) : Enum {

            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is StatusReason && this.value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()

            companion object {

                val BACK_IMAGE_BLURRY = StatusReason(JsonField.of("BACK_IMAGE_BLURRY"))

                val FILE_SIZE_TOO_LARGE = StatusReason(JsonField.of("FILE_SIZE_TOO_LARGE"))

                val FRONT_IMAGE_BLURRY = StatusReason(JsonField.of("FRONT_IMAGE_BLURRY"))

                val FRONT_IMAGE_GLARE = StatusReason(JsonField.of("FRONT_IMAGE_GLARE"))

                val INVALID_FILE_TYPE = StatusReason(JsonField.of("INVALID_FILE_TYPE"))

                val UNKNOWN_ERROR = StatusReason(JsonField.of("UNKNOWN_ERROR"))

                fun of(value: String) = StatusReason(JsonField.of(value))
            }

            enum class Known {
                BACK_IMAGE_BLURRY,
                FILE_SIZE_TOO_LARGE,
                FRONT_IMAGE_BLURRY,
                FRONT_IMAGE_GLARE,
                INVALID_FILE_TYPE,
                UNKNOWN_ERROR,
            }

            enum class Value {
                BACK_IMAGE_BLURRY,
                FILE_SIZE_TOO_LARGE,
                FRONT_IMAGE_BLURRY,
                FRONT_IMAGE_GLARE,
                INVALID_FILE_TYPE,
                UNKNOWN_ERROR,
                _UNKNOWN,
            }

            fun value(): Value =
                when (this) {
                    BACK_IMAGE_BLURRY -> Value.BACK_IMAGE_BLURRY
                    FILE_SIZE_TOO_LARGE -> Value.FILE_SIZE_TOO_LARGE
                    FRONT_IMAGE_BLURRY -> Value.FRONT_IMAGE_BLURRY
                    FRONT_IMAGE_GLARE -> Value.FRONT_IMAGE_GLARE
                    INVALID_FILE_TYPE -> Value.INVALID_FILE_TYPE
                    UNKNOWN_ERROR -> Value.UNKNOWN_ERROR
                    else -> Value._UNKNOWN
                }

            fun known(): Known =
                when (this) {
                    BACK_IMAGE_BLURRY -> Known.BACK_IMAGE_BLURRY
                    FILE_SIZE_TOO_LARGE -> Known.FILE_SIZE_TOO_LARGE
                    FRONT_IMAGE_BLURRY -> Known.FRONT_IMAGE_BLURRY
                    FRONT_IMAGE_GLARE -> Known.FRONT_IMAGE_GLARE
                    INVALID_FILE_TYPE -> Known.INVALID_FILE_TYPE
                    UNKNOWN_ERROR -> Known.UNKNOWN_ERROR
                    else -> throw LithicInvalidDataException("Unknown StatusReason: $value")
                }

            fun asString(): String = _value().asStringOrThrow()
        }
    }
}
