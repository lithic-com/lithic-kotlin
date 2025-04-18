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
import com.lithic.api.core.checkKnown
import com.lithic.api.core.checkRequired
import com.lithic.api.core.toImmutable
import com.lithic.api.errors.LithicInvalidDataException
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects

/** Describes the document and the required document image uploads required to re-run KYC */
class Document
private constructor(
    private val token: JsonField<String>,
    private val accountHolderToken: JsonField<String>,
    private val documentType: JsonField<DocumentType>,
    private val entityToken: JsonField<String>,
    private val requiredDocumentUploads: JsonField<List<RequiredDocumentUpload>>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("token") @ExcludeMissing token: JsonField<String> = JsonMissing.of(),
        @JsonProperty("account_holder_token")
        @ExcludeMissing
        accountHolderToken: JsonField<String> = JsonMissing.of(),
        @JsonProperty("document_type")
        @ExcludeMissing
        documentType: JsonField<DocumentType> = JsonMissing.of(),
        @JsonProperty("entity_token")
        @ExcludeMissing
        entityToken: JsonField<String> = JsonMissing.of(),
        @JsonProperty("required_document_uploads")
        @ExcludeMissing
        requiredDocumentUploads: JsonField<List<RequiredDocumentUpload>> = JsonMissing.of(),
    ) : this(
        token,
        accountHolderToken,
        documentType,
        entityToken,
        requiredDocumentUploads,
        mutableMapOf(),
    )

    /**
     * Globally unique identifier for the document.
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun token(): String = token.getRequired("token")

    /**
     * Globally unique identifier for the account holder.
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun accountHolderToken(): String = accountHolderToken.getRequired("account_holder_token")

    /**
     * Type of documentation to be submitted for verification of an account holder
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun documentType(): DocumentType = documentType.getRequired("document_type")

    /**
     * Globally unique identifier for an entity.
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun entityToken(): String = entityToken.getRequired("entity_token")

    /**
     * Represents a single image of the document to upload.
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun requiredDocumentUploads(): List<RequiredDocumentUpload> =
        requiredDocumentUploads.getRequired("required_document_uploads")

    /**
     * Returns the raw JSON value of [token].
     *
     * Unlike [token], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("token") @ExcludeMissing fun _token(): JsonField<String> = token

    /**
     * Returns the raw JSON value of [accountHolderToken].
     *
     * Unlike [accountHolderToken], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("account_holder_token")
    @ExcludeMissing
    fun _accountHolderToken(): JsonField<String> = accountHolderToken

    /**
     * Returns the raw JSON value of [documentType].
     *
     * Unlike [documentType], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("document_type")
    @ExcludeMissing
    fun _documentType(): JsonField<DocumentType> = documentType

    /**
     * Returns the raw JSON value of [entityToken].
     *
     * Unlike [entityToken], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("entity_token")
    @ExcludeMissing
    fun _entityToken(): JsonField<String> = entityToken

    /**
     * Returns the raw JSON value of [requiredDocumentUploads].
     *
     * Unlike [requiredDocumentUploads], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("required_document_uploads")
    @ExcludeMissing
    fun _requiredDocumentUploads(): JsonField<List<RequiredDocumentUpload>> =
        requiredDocumentUploads

    @JsonAnySetter
    private fun putAdditionalProperty(key: String, value: JsonValue) {
        additionalProperties.put(key, value)
    }

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> =
        Collections.unmodifiableMap(additionalProperties)

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [Document].
         *
         * The following fields are required:
         * ```kotlin
         * .token()
         * .accountHolderToken()
         * .documentType()
         * .entityToken()
         * .requiredDocumentUploads()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [Document]. */
    class Builder internal constructor() {

        private var token: JsonField<String>? = null
        private var accountHolderToken: JsonField<String>? = null
        private var documentType: JsonField<DocumentType>? = null
        private var entityToken: JsonField<String>? = null
        private var requiredDocumentUploads: JsonField<MutableList<RequiredDocumentUpload>>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(document: Document) = apply {
            token = document.token
            accountHolderToken = document.accountHolderToken
            documentType = document.documentType
            entityToken = document.entityToken
            requiredDocumentUploads = document.requiredDocumentUploads.map { it.toMutableList() }
            additionalProperties = document.additionalProperties.toMutableMap()
        }

        /** Globally unique identifier for the document. */
        fun token(token: String) = token(JsonField.of(token))

        /**
         * Sets [Builder.token] to an arbitrary JSON value.
         *
         * You should usually call [Builder.token] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun token(token: JsonField<String>) = apply { this.token = token }

        /** Globally unique identifier for the account holder. */
        fun accountHolderToken(accountHolderToken: String) =
            accountHolderToken(JsonField.of(accountHolderToken))

        /**
         * Sets [Builder.accountHolderToken] to an arbitrary JSON value.
         *
         * You should usually call [Builder.accountHolderToken] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun accountHolderToken(accountHolderToken: JsonField<String>) = apply {
            this.accountHolderToken = accountHolderToken
        }

        /** Type of documentation to be submitted for verification of an account holder */
        fun documentType(documentType: DocumentType) = documentType(JsonField.of(documentType))

        /**
         * Sets [Builder.documentType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.documentType] with a well-typed [DocumentType] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun documentType(documentType: JsonField<DocumentType>) = apply {
            this.documentType = documentType
        }

        /** Globally unique identifier for an entity. */
        fun entityToken(entityToken: String) = entityToken(JsonField.of(entityToken))

        /**
         * Sets [Builder.entityToken] to an arbitrary JSON value.
         *
         * You should usually call [Builder.entityToken] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun entityToken(entityToken: JsonField<String>) = apply { this.entityToken = entityToken }

        /** Represents a single image of the document to upload. */
        fun requiredDocumentUploads(requiredDocumentUploads: List<RequiredDocumentUpload>) =
            requiredDocumentUploads(JsonField.of(requiredDocumentUploads))

        /**
         * Sets [Builder.requiredDocumentUploads] to an arbitrary JSON value.
         *
         * You should usually call [Builder.requiredDocumentUploads] with a well-typed
         * `List<RequiredDocumentUpload>` value instead. This method is primarily for setting the
         * field to an undocumented or not yet supported value.
         */
        fun requiredDocumentUploads(
            requiredDocumentUploads: JsonField<List<RequiredDocumentUpload>>
        ) = apply {
            this.requiredDocumentUploads = requiredDocumentUploads.map { it.toMutableList() }
        }

        /**
         * Adds a single [RequiredDocumentUpload] to [requiredDocumentUploads].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addRequiredDocumentUpload(requiredDocumentUpload: RequiredDocumentUpload) = apply {
            requiredDocumentUploads =
                (requiredDocumentUploads ?: JsonField.of(mutableListOf())).also {
                    checkKnown("requiredDocumentUploads", it).add(requiredDocumentUpload)
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

        /**
         * Returns an immutable instance of [Document].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```kotlin
         * .token()
         * .accountHolderToken()
         * .documentType()
         * .entityToken()
         * .requiredDocumentUploads()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): Document =
            Document(
                checkRequired("token", token),
                checkRequired("accountHolderToken", accountHolderToken),
                checkRequired("documentType", documentType),
                checkRequired("entityToken", entityToken),
                checkRequired("requiredDocumentUploads", requiredDocumentUploads).map {
                    it.toImmutable()
                },
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): Document = apply {
        if (validated) {
            return@apply
        }

        token()
        accountHolderToken()
        documentType().validate()
        entityToken()
        requiredDocumentUploads().forEach { it.validate() }
        validated = true
    }

    fun isValid(): Boolean =
        try {
            validate()
            true
        } catch (e: LithicInvalidDataException) {
            false
        }

    /**
     * Returns a score indicating how many valid values are contained in this object recursively.
     *
     * Used for best match union deserialization.
     */
    internal fun validity(): Int =
        (if (token.asKnown() == null) 0 else 1) +
            (if (accountHolderToken.asKnown() == null) 0 else 1) +
            (documentType.asKnown()?.validity() ?: 0) +
            (if (entityToken.asKnown() == null) 0 else 1) +
            (requiredDocumentUploads.asKnown()?.sumOf { it.validity().toInt() } ?: 0)

    /** Type of documentation to be submitted for verification of an account holder */
    class DocumentType @JsonCreator private constructor(private val value: JsonField<String>) :
        Enum {

        /**
         * Returns this class instance's raw value.
         *
         * This is usually only useful if this instance was deserialized from data that doesn't
         * match any known member, and you want to know that value. For example, if the SDK is on an
         * older version than the API, then the API may respond with new members that the SDK is
         * unaware of.
         */
        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            val DRIVERS_LICENSE = of("DRIVERS_LICENSE")

            val PASSPORT = of("PASSPORT")

            val PASSPORT_CARD = of("PASSPORT_CARD")

            val EIN_LETTER = of("EIN_LETTER")

            val TAX_RETURN = of("TAX_RETURN")

            val OPERATING_AGREEMENT = of("OPERATING_AGREEMENT")

            val CERTIFICATE_OF_FORMATION = of("CERTIFICATE_OF_FORMATION")

            val CERTIFICATE_OF_GOOD_STANDING = of("CERTIFICATE_OF_GOOD_STANDING")

            val ARTICLES_OF_INCORPORATION = of("ARTICLES_OF_INCORPORATION")

            val ARTICLES_OF_ORGANIZATION = of("ARTICLES_OF_ORGANIZATION")

            val BYLAWS = of("BYLAWS")

            val GOVERNMENT_BUSINESS_LICENSE = of("GOVERNMENT_BUSINESS_LICENSE")

            val PARTNERSHIP_AGREEMENT = of("PARTNERSHIP_AGREEMENT")

            val SS4_FORM = of("SS4_FORM")

            val BANK_STATEMENT = of("BANK_STATEMENT")

            val UTILITY_BILL_STATEMENT = of("UTILITY_BILL_STATEMENT")

            val SSN_CARD = of("SSN_CARD")

            val ITIN_LETTER = of("ITIN_LETTER")

            val FINCEN_BOI_REPORT = of("FINCEN_BOI_REPORT")

            fun of(value: String) = DocumentType(JsonField.of(value))
        }

        /** An enum containing [DocumentType]'s known values. */
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
            FINCEN_BOI_REPORT,
        }

        /**
         * An enum containing [DocumentType]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [DocumentType] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
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
            FINCEN_BOI_REPORT,
            /**
             * An enum member indicating that [DocumentType] was instantiated with an unknown value.
             */
            _UNKNOWN,
        }

        /**
         * Returns an enum member corresponding to this class instance's value, or [Value._UNKNOWN]
         * if the class was instantiated with an unknown value.
         *
         * Use the [known] method instead if you're certain the value is always known or if you want
         * to throw for the unknown case.
         */
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
                FINCEN_BOI_REPORT -> Value.FINCEN_BOI_REPORT
                else -> Value._UNKNOWN
            }

        /**
         * Returns an enum member corresponding to this class instance's value.
         *
         * Use the [value] method instead if you're uncertain the value is always known and don't
         * want to throw for the unknown case.
         *
         * @throws LithicInvalidDataException if this class instance's value is a not a known
         *   member.
         */
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
                FINCEN_BOI_REPORT -> Known.FINCEN_BOI_REPORT
                else -> throw LithicInvalidDataException("Unknown DocumentType: $value")
            }

        /**
         * Returns this class instance's primitive wire representation.
         *
         * This differs from the [toString] method because that method is primarily for debugging
         * and generally doesn't throw.
         *
         * @throws LithicInvalidDataException if this class instance's value does not have the
         *   expected primitive type.
         */
        fun asString(): String =
            _value().asString() ?: throw LithicInvalidDataException("Value is not a String")

        private var validated: Boolean = false

        fun validate(): DocumentType = apply {
            if (validated) {
                return@apply
            }

            known()
            validated = true
        }

        fun isValid(): Boolean =
            try {
                validate()
                true
            } catch (e: LithicInvalidDataException) {
                false
            }

        /**
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is DocumentType && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /** Represents a single image of the document to upload. */
    class RequiredDocumentUpload
    private constructor(
        private val token: JsonField<String>,
        private val acceptedEntityStatusReasons: JsonField<List<String>>,
        private val created: JsonField<OffsetDateTime>,
        private val imageType: JsonField<ImageType>,
        private val rejectedEntityStatusReasons: JsonField<List<String>>,
        private val status: JsonField<DocumentUploadStatus>,
        private val statusReasons: JsonField<List<DocumentUploadStatusReasons>>,
        private val updated: JsonField<OffsetDateTime>,
        private val uploadUrl: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("token") @ExcludeMissing token: JsonField<String> = JsonMissing.of(),
            @JsonProperty("accepted_entity_status_reasons")
            @ExcludeMissing
            acceptedEntityStatusReasons: JsonField<List<String>> = JsonMissing.of(),
            @JsonProperty("created")
            @ExcludeMissing
            created: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("image_type")
            @ExcludeMissing
            imageType: JsonField<ImageType> = JsonMissing.of(),
            @JsonProperty("rejected_entity_status_reasons")
            @ExcludeMissing
            rejectedEntityStatusReasons: JsonField<List<String>> = JsonMissing.of(),
            @JsonProperty("status")
            @ExcludeMissing
            status: JsonField<DocumentUploadStatus> = JsonMissing.of(),
            @JsonProperty("status_reasons")
            @ExcludeMissing
            statusReasons: JsonField<List<DocumentUploadStatusReasons>> = JsonMissing.of(),
            @JsonProperty("updated")
            @ExcludeMissing
            updated: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("upload_url")
            @ExcludeMissing
            uploadUrl: JsonField<String> = JsonMissing.of(),
        ) : this(
            token,
            acceptedEntityStatusReasons,
            created,
            imageType,
            rejectedEntityStatusReasons,
            status,
            statusReasons,
            updated,
            uploadUrl,
            mutableMapOf(),
        )

        /**
         * Globally unique identifier for the document upload.
         *
         * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun token(): String = token.getRequired("token")

        /**
         * A list of status reasons associated with a KYB account holder that have been satisfied by
         * the document upload
         *
         * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun acceptedEntityStatusReasons(): List<String> =
            acceptedEntityStatusReasons.getRequired("accepted_entity_status_reasons")

        /**
         * When the document upload was created
         *
         * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun created(): OffsetDateTime = created.getRequired("created")

        /**
         * Type of image to upload.
         *
         * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun imageType(): ImageType = imageType.getRequired("image_type")

        /**
         * A list of status reasons associated with a KYB account holder that have not been
         * satisfied by the document upload
         *
         * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun rejectedEntityStatusReasons(): List<String> =
            rejectedEntityStatusReasons.getRequired("rejected_entity_status_reasons")

        /**
         * Status of an account holder's document upload.
         *
         * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun status(): DocumentUploadStatus = status.getRequired("status")

        /**
         * Reasons for document image upload status.
         *
         * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun statusReasons(): List<DocumentUploadStatusReasons> =
            statusReasons.getRequired("status_reasons")

        /**
         * When the document upload was last updated
         *
         * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun updated(): OffsetDateTime = updated.getRequired("updated")

        /**
         * URL to upload document image to.
         *
         * Note that the upload URLs expire after 7 days. If an upload URL expires, you can refresh
         * the URLs by retrieving the document upload from `GET
         * /account_holders/{account_holder_token}/documents`.
         *
         * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun uploadUrl(): String = uploadUrl.getRequired("upload_url")

        /**
         * Returns the raw JSON value of [token].
         *
         * Unlike [token], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("token") @ExcludeMissing fun _token(): JsonField<String> = token

        /**
         * Returns the raw JSON value of [acceptedEntityStatusReasons].
         *
         * Unlike [acceptedEntityStatusReasons], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("accepted_entity_status_reasons")
        @ExcludeMissing
        fun _acceptedEntityStatusReasons(): JsonField<List<String>> = acceptedEntityStatusReasons

        /**
         * Returns the raw JSON value of [created].
         *
         * Unlike [created], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("created") @ExcludeMissing fun _created(): JsonField<OffsetDateTime> = created

        /**
         * Returns the raw JSON value of [imageType].
         *
         * Unlike [imageType], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("image_type")
        @ExcludeMissing
        fun _imageType(): JsonField<ImageType> = imageType

        /**
         * Returns the raw JSON value of [rejectedEntityStatusReasons].
         *
         * Unlike [rejectedEntityStatusReasons], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("rejected_entity_status_reasons")
        @ExcludeMissing
        fun _rejectedEntityStatusReasons(): JsonField<List<String>> = rejectedEntityStatusReasons

        /**
         * Returns the raw JSON value of [status].
         *
         * Unlike [status], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("status")
        @ExcludeMissing
        fun _status(): JsonField<DocumentUploadStatus> = status

        /**
         * Returns the raw JSON value of [statusReasons].
         *
         * Unlike [statusReasons], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("status_reasons")
        @ExcludeMissing
        fun _statusReasons(): JsonField<List<DocumentUploadStatusReasons>> = statusReasons

        /**
         * Returns the raw JSON value of [updated].
         *
         * Unlike [updated], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("updated") @ExcludeMissing fun _updated(): JsonField<OffsetDateTime> = updated

        /**
         * Returns the raw JSON value of [uploadUrl].
         *
         * Unlike [uploadUrl], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("upload_url") @ExcludeMissing fun _uploadUrl(): JsonField<String> = uploadUrl

        @JsonAnySetter
        private fun putAdditionalProperty(key: String, value: JsonValue) {
            additionalProperties.put(key, value)
        }

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> =
            Collections.unmodifiableMap(additionalProperties)

        fun toBuilder() = Builder().from(this)

        companion object {

            /**
             * Returns a mutable builder for constructing an instance of [RequiredDocumentUpload].
             *
             * The following fields are required:
             * ```kotlin
             * .token()
             * .acceptedEntityStatusReasons()
             * .created()
             * .imageType()
             * .rejectedEntityStatusReasons()
             * .status()
             * .statusReasons()
             * .updated()
             * .uploadUrl()
             * ```
             */
            fun builder() = Builder()
        }

        /** A builder for [RequiredDocumentUpload]. */
        class Builder internal constructor() {

            private var token: JsonField<String>? = null
            private var acceptedEntityStatusReasons: JsonField<MutableList<String>>? = null
            private var created: JsonField<OffsetDateTime>? = null
            private var imageType: JsonField<ImageType>? = null
            private var rejectedEntityStatusReasons: JsonField<MutableList<String>>? = null
            private var status: JsonField<DocumentUploadStatus>? = null
            private var statusReasons: JsonField<MutableList<DocumentUploadStatusReasons>>? = null
            private var updated: JsonField<OffsetDateTime>? = null
            private var uploadUrl: JsonField<String>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(requiredDocumentUpload: RequiredDocumentUpload) = apply {
                token = requiredDocumentUpload.token
                acceptedEntityStatusReasons =
                    requiredDocumentUpload.acceptedEntityStatusReasons.map { it.toMutableList() }
                created = requiredDocumentUpload.created
                imageType = requiredDocumentUpload.imageType
                rejectedEntityStatusReasons =
                    requiredDocumentUpload.rejectedEntityStatusReasons.map { it.toMutableList() }
                status = requiredDocumentUpload.status
                statusReasons = requiredDocumentUpload.statusReasons.map { it.toMutableList() }
                updated = requiredDocumentUpload.updated
                uploadUrl = requiredDocumentUpload.uploadUrl
                additionalProperties = requiredDocumentUpload.additionalProperties.toMutableMap()
            }

            /** Globally unique identifier for the document upload. */
            fun token(token: String) = token(JsonField.of(token))

            /**
             * Sets [Builder.token] to an arbitrary JSON value.
             *
             * You should usually call [Builder.token] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun token(token: JsonField<String>) = apply { this.token = token }

            /**
             * A list of status reasons associated with a KYB account holder that have been
             * satisfied by the document upload
             */
            fun acceptedEntityStatusReasons(acceptedEntityStatusReasons: List<String>) =
                acceptedEntityStatusReasons(JsonField.of(acceptedEntityStatusReasons))

            /**
             * Sets [Builder.acceptedEntityStatusReasons] to an arbitrary JSON value.
             *
             * You should usually call [Builder.acceptedEntityStatusReasons] with a well-typed
             * `List<String>` value instead. This method is primarily for setting the field to an
             * undocumented or not yet supported value.
             */
            fun acceptedEntityStatusReasons(acceptedEntityStatusReasons: JsonField<List<String>>) =
                apply {
                    this.acceptedEntityStatusReasons =
                        acceptedEntityStatusReasons.map { it.toMutableList() }
                }

            /**
             * Adds a single [String] to [acceptedEntityStatusReasons].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addAcceptedEntityStatusReason(acceptedEntityStatusReason: String) = apply {
                acceptedEntityStatusReasons =
                    (acceptedEntityStatusReasons ?: JsonField.of(mutableListOf())).also {
                        checkKnown("acceptedEntityStatusReasons", it)
                            .add(acceptedEntityStatusReason)
                    }
            }

            /** When the document upload was created */
            fun created(created: OffsetDateTime) = created(JsonField.of(created))

            /**
             * Sets [Builder.created] to an arbitrary JSON value.
             *
             * You should usually call [Builder.created] with a well-typed [OffsetDateTime] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun created(created: JsonField<OffsetDateTime>) = apply { this.created = created }

            /** Type of image to upload. */
            fun imageType(imageType: ImageType) = imageType(JsonField.of(imageType))

            /**
             * Sets [Builder.imageType] to an arbitrary JSON value.
             *
             * You should usually call [Builder.imageType] with a well-typed [ImageType] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun imageType(imageType: JsonField<ImageType>) = apply { this.imageType = imageType }

            /**
             * A list of status reasons associated with a KYB account holder that have not been
             * satisfied by the document upload
             */
            fun rejectedEntityStatusReasons(rejectedEntityStatusReasons: List<String>) =
                rejectedEntityStatusReasons(JsonField.of(rejectedEntityStatusReasons))

            /**
             * Sets [Builder.rejectedEntityStatusReasons] to an arbitrary JSON value.
             *
             * You should usually call [Builder.rejectedEntityStatusReasons] with a well-typed
             * `List<String>` value instead. This method is primarily for setting the field to an
             * undocumented or not yet supported value.
             */
            fun rejectedEntityStatusReasons(rejectedEntityStatusReasons: JsonField<List<String>>) =
                apply {
                    this.rejectedEntityStatusReasons =
                        rejectedEntityStatusReasons.map { it.toMutableList() }
                }

            /**
             * Adds a single [String] to [rejectedEntityStatusReasons].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addRejectedEntityStatusReason(rejectedEntityStatusReason: String) = apply {
                rejectedEntityStatusReasons =
                    (rejectedEntityStatusReasons ?: JsonField.of(mutableListOf())).also {
                        checkKnown("rejectedEntityStatusReasons", it)
                            .add(rejectedEntityStatusReason)
                    }
            }

            /** Status of an account holder's document upload. */
            fun status(status: DocumentUploadStatus) = status(JsonField.of(status))

            /**
             * Sets [Builder.status] to an arbitrary JSON value.
             *
             * You should usually call [Builder.status] with a well-typed [DocumentUploadStatus]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun status(status: JsonField<DocumentUploadStatus>) = apply { this.status = status }

            /** Reasons for document image upload status. */
            fun statusReasons(statusReasons: List<DocumentUploadStatusReasons>) =
                statusReasons(JsonField.of(statusReasons))

            /**
             * Sets [Builder.statusReasons] to an arbitrary JSON value.
             *
             * You should usually call [Builder.statusReasons] with a well-typed
             * `List<DocumentUploadStatusReasons>` value instead. This method is primarily for
             * setting the field to an undocumented or not yet supported value.
             */
            fun statusReasons(statusReasons: JsonField<List<DocumentUploadStatusReasons>>) = apply {
                this.statusReasons = statusReasons.map { it.toMutableList() }
            }

            /**
             * Adds a single [DocumentUploadStatusReasons] to [statusReasons].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addStatusReason(statusReason: DocumentUploadStatusReasons) = apply {
                statusReasons =
                    (statusReasons ?: JsonField.of(mutableListOf())).also {
                        checkKnown("statusReasons", it).add(statusReason)
                    }
            }

            /** When the document upload was last updated */
            fun updated(updated: OffsetDateTime) = updated(JsonField.of(updated))

            /**
             * Sets [Builder.updated] to an arbitrary JSON value.
             *
             * You should usually call [Builder.updated] with a well-typed [OffsetDateTime] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun updated(updated: JsonField<OffsetDateTime>) = apply { this.updated = updated }

            /**
             * URL to upload document image to.
             *
             * Note that the upload URLs expire after 7 days. If an upload URL expires, you can
             * refresh the URLs by retrieving the document upload from `GET
             * /account_holders/{account_holder_token}/documents`.
             */
            fun uploadUrl(uploadUrl: String) = uploadUrl(JsonField.of(uploadUrl))

            /**
             * Sets [Builder.uploadUrl] to an arbitrary JSON value.
             *
             * You should usually call [Builder.uploadUrl] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun uploadUrl(uploadUrl: JsonField<String>) = apply { this.uploadUrl = uploadUrl }

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

            /**
             * Returns an immutable instance of [RequiredDocumentUpload].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```kotlin
             * .token()
             * .acceptedEntityStatusReasons()
             * .created()
             * .imageType()
             * .rejectedEntityStatusReasons()
             * .status()
             * .statusReasons()
             * .updated()
             * .uploadUrl()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): RequiredDocumentUpload =
                RequiredDocumentUpload(
                    checkRequired("token", token),
                    checkRequired("acceptedEntityStatusReasons", acceptedEntityStatusReasons).map {
                        it.toImmutable()
                    },
                    checkRequired("created", created),
                    checkRequired("imageType", imageType),
                    checkRequired("rejectedEntityStatusReasons", rejectedEntityStatusReasons).map {
                        it.toImmutable()
                    },
                    checkRequired("status", status),
                    checkRequired("statusReasons", statusReasons).map { it.toImmutable() },
                    checkRequired("updated", updated),
                    checkRequired("uploadUrl", uploadUrl),
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): RequiredDocumentUpload = apply {
            if (validated) {
                return@apply
            }

            token()
            acceptedEntityStatusReasons()
            created()
            imageType().validate()
            rejectedEntityStatusReasons()
            status().validate()
            statusReasons().forEach { it.validate() }
            updated()
            uploadUrl()
            validated = true
        }

        fun isValid(): Boolean =
            try {
                validate()
                true
            } catch (e: LithicInvalidDataException) {
                false
            }

        /**
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        internal fun validity(): Int =
            (if (token.asKnown() == null) 0 else 1) +
                (acceptedEntityStatusReasons.asKnown()?.size ?: 0) +
                (if (created.asKnown() == null) 0 else 1) +
                (imageType.asKnown()?.validity() ?: 0) +
                (rejectedEntityStatusReasons.asKnown()?.size ?: 0) +
                (status.asKnown()?.validity() ?: 0) +
                (statusReasons.asKnown()?.sumOf { it.validity().toInt() } ?: 0) +
                (if (updated.asKnown() == null) 0 else 1) +
                (if (uploadUrl.asKnown() == null) 0 else 1)

        /** Type of image to upload. */
        class ImageType @JsonCreator private constructor(private val value: JsonField<String>) :
            Enum {

            /**
             * Returns this class instance's raw value.
             *
             * This is usually only useful if this instance was deserialized from data that doesn't
             * match any known member, and you want to know that value. For example, if the SDK is
             * on an older version than the API, then the API may respond with new members that the
             * SDK is unaware of.
             */
            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                val FRONT = of("FRONT")

                val BACK = of("BACK")

                fun of(value: String) = ImageType(JsonField.of(value))
            }

            /** An enum containing [ImageType]'s known values. */
            enum class Known {
                FRONT,
                BACK,
            }

            /**
             * An enum containing [ImageType]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [ImageType] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                FRONT,
                BACK,
                /**
                 * An enum member indicating that [ImageType] was instantiated with an unknown
                 * value.
                 */
                _UNKNOWN,
            }

            /**
             * Returns an enum member corresponding to this class instance's value, or
             * [Value._UNKNOWN] if the class was instantiated with an unknown value.
             *
             * Use the [known] method instead if you're certain the value is always known or if you
             * want to throw for the unknown case.
             */
            fun value(): Value =
                when (this) {
                    FRONT -> Value.FRONT
                    BACK -> Value.BACK
                    else -> Value._UNKNOWN
                }

            /**
             * Returns an enum member corresponding to this class instance's value.
             *
             * Use the [value] method instead if you're uncertain the value is always known and
             * don't want to throw for the unknown case.
             *
             * @throws LithicInvalidDataException if this class instance's value is a not a known
             *   member.
             */
            fun known(): Known =
                when (this) {
                    FRONT -> Known.FRONT
                    BACK -> Known.BACK
                    else -> throw LithicInvalidDataException("Unknown ImageType: $value")
                }

            /**
             * Returns this class instance's primitive wire representation.
             *
             * This differs from the [toString] method because that method is primarily for
             * debugging and generally doesn't throw.
             *
             * @throws LithicInvalidDataException if this class instance's value does not have the
             *   expected primitive type.
             */
            fun asString(): String =
                _value().asString() ?: throw LithicInvalidDataException("Value is not a String")

            private var validated: Boolean = false

            fun validate(): ImageType = apply {
                if (validated) {
                    return@apply
                }

                known()
                validated = true
            }

            fun isValid(): Boolean =
                try {
                    validate()
                    true
                } catch (e: LithicInvalidDataException) {
                    false
                }

            /**
             * Returns a score indicating how many valid values are contained in this object
             * recursively.
             *
             * Used for best match union deserialization.
             */
            internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is ImageType && value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        /** Status of an account holder's document upload. */
        class DocumentUploadStatus
        @JsonCreator
        private constructor(private val value: JsonField<String>) : Enum {

            /**
             * Returns this class instance's raw value.
             *
             * This is usually only useful if this instance was deserialized from data that doesn't
             * match any known member, and you want to know that value. For example, if the SDK is
             * on an older version than the API, then the API may respond with new members that the
             * SDK is unaware of.
             */
            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                val ACCEPTED = of("ACCEPTED")

                val REJECTED = of("REJECTED")

                val PENDING_UPLOAD = of("PENDING_UPLOAD")

                val UPLOADED = of("UPLOADED")

                val PARTIAL_APPROVAL = of("PARTIAL_APPROVAL")

                fun of(value: String) = DocumentUploadStatus(JsonField.of(value))
            }

            /** An enum containing [DocumentUploadStatus]'s known values. */
            enum class Known {
                ACCEPTED,
                REJECTED,
                PENDING_UPLOAD,
                UPLOADED,
                PARTIAL_APPROVAL,
            }

            /**
             * An enum containing [DocumentUploadStatus]'s known values, as well as an [_UNKNOWN]
             * member.
             *
             * An instance of [DocumentUploadStatus] can contain an unknown value in a couple of
             * cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                ACCEPTED,
                REJECTED,
                PENDING_UPLOAD,
                UPLOADED,
                PARTIAL_APPROVAL,
                /**
                 * An enum member indicating that [DocumentUploadStatus] was instantiated with an
                 * unknown value.
                 */
                _UNKNOWN,
            }

            /**
             * Returns an enum member corresponding to this class instance's value, or
             * [Value._UNKNOWN] if the class was instantiated with an unknown value.
             *
             * Use the [known] method instead if you're certain the value is always known or if you
             * want to throw for the unknown case.
             */
            fun value(): Value =
                when (this) {
                    ACCEPTED -> Value.ACCEPTED
                    REJECTED -> Value.REJECTED
                    PENDING_UPLOAD -> Value.PENDING_UPLOAD
                    UPLOADED -> Value.UPLOADED
                    PARTIAL_APPROVAL -> Value.PARTIAL_APPROVAL
                    else -> Value._UNKNOWN
                }

            /**
             * Returns an enum member corresponding to this class instance's value.
             *
             * Use the [value] method instead if you're uncertain the value is always known and
             * don't want to throw for the unknown case.
             *
             * @throws LithicInvalidDataException if this class instance's value is a not a known
             *   member.
             */
            fun known(): Known =
                when (this) {
                    ACCEPTED -> Known.ACCEPTED
                    REJECTED -> Known.REJECTED
                    PENDING_UPLOAD -> Known.PENDING_UPLOAD
                    UPLOADED -> Known.UPLOADED
                    PARTIAL_APPROVAL -> Known.PARTIAL_APPROVAL
                    else -> throw LithicInvalidDataException("Unknown DocumentUploadStatus: $value")
                }

            /**
             * Returns this class instance's primitive wire representation.
             *
             * This differs from the [toString] method because that method is primarily for
             * debugging and generally doesn't throw.
             *
             * @throws LithicInvalidDataException if this class instance's value does not have the
             *   expected primitive type.
             */
            fun asString(): String =
                _value().asString() ?: throw LithicInvalidDataException("Value is not a String")

            private var validated: Boolean = false

            fun validate(): DocumentUploadStatus = apply {
                if (validated) {
                    return@apply
                }

                known()
                validated = true
            }

            fun isValid(): Boolean =
                try {
                    validate()
                    true
                } catch (e: LithicInvalidDataException) {
                    false
                }

            /**
             * Returns a score indicating how many valid values are contained in this object
             * recursively.
             *
             * Used for best match union deserialization.
             */
            internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is DocumentUploadStatus && value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        /** The status reasons for an account holder document upload that is not ACCEPTED */
        class DocumentUploadStatusReasons
        @JsonCreator
        private constructor(private val value: JsonField<String>) : Enum {

            /**
             * Returns this class instance's raw value.
             *
             * This is usually only useful if this instance was deserialized from data that doesn't
             * match any known member, and you want to know that value. For example, if the SDK is
             * on an older version than the API, then the API may respond with new members that the
             * SDK is unaware of.
             */
            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                val DOCUMENT_MISSING_REQUIRED_DATA = of("DOCUMENT_MISSING_REQUIRED_DATA")

                val DOCUMENT_UPLOAD_TOO_BLURRY = of("DOCUMENT_UPLOAD_TOO_BLURRY")

                val FILE_SIZE_TOO_LARGE = of("FILE_SIZE_TOO_LARGE")

                val INVALID_DOCUMENT_TYPE = of("INVALID_DOCUMENT_TYPE")

                val INVALID_DOCUMENT_UPLOAD = of("INVALID_DOCUMENT_UPLOAD")

                val INVALID_ENTITY = of("INVALID_ENTITY")

                val DOCUMENT_EXPIRED = of("DOCUMENT_EXPIRED")

                val DOCUMENT_ISSUED_GREATER_THAN_30_DAYS =
                    of("DOCUMENT_ISSUED_GREATER_THAN_30_DAYS")

                val DOCUMENT_TYPE_NOT_SUPPORTED = of("DOCUMENT_TYPE_NOT_SUPPORTED")

                val UNKNOWN_FAILURE_REASON = of("UNKNOWN_FAILURE_REASON")

                val UNKNOWN_ERROR = of("UNKNOWN_ERROR")

                fun of(value: String) = DocumentUploadStatusReasons(JsonField.of(value))
            }

            /** An enum containing [DocumentUploadStatusReasons]'s known values. */
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

            /**
             * An enum containing [DocumentUploadStatusReasons]'s known values, as well as an
             * [_UNKNOWN] member.
             *
             * An instance of [DocumentUploadStatusReasons] can contain an unknown value in a couple
             * of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
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
                /**
                 * An enum member indicating that [DocumentUploadStatusReasons] was instantiated
                 * with an unknown value.
                 */
                _UNKNOWN,
            }

            /**
             * Returns an enum member corresponding to this class instance's value, or
             * [Value._UNKNOWN] if the class was instantiated with an unknown value.
             *
             * Use the [known] method instead if you're certain the value is always known or if you
             * want to throw for the unknown case.
             */
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

            /**
             * Returns an enum member corresponding to this class instance's value.
             *
             * Use the [value] method instead if you're uncertain the value is always known and
             * don't want to throw for the unknown case.
             *
             * @throws LithicInvalidDataException if this class instance's value is a not a known
             *   member.
             */
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

            /**
             * Returns this class instance's primitive wire representation.
             *
             * This differs from the [toString] method because that method is primarily for
             * debugging and generally doesn't throw.
             *
             * @throws LithicInvalidDataException if this class instance's value does not have the
             *   expected primitive type.
             */
            fun asString(): String =
                _value().asString() ?: throw LithicInvalidDataException("Value is not a String")

            private var validated: Boolean = false

            fun validate(): DocumentUploadStatusReasons = apply {
                if (validated) {
                    return@apply
                }

                known()
                validated = true
            }

            fun isValid(): Boolean =
                try {
                    validate()
                    true
                } catch (e: LithicInvalidDataException) {
                    false
                }

            /**
             * Returns a score indicating how many valid values are contained in this object
             * recursively.
             *
             * Used for best match union deserialization.
             */
            internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is DocumentUploadStatusReasons && value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is RequiredDocumentUpload && token == other.token && acceptedEntityStatusReasons == other.acceptedEntityStatusReasons && created == other.created && imageType == other.imageType && rejectedEntityStatusReasons == other.rejectedEntityStatusReasons && status == other.status && statusReasons == other.statusReasons && updated == other.updated && uploadUrl == other.uploadUrl && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(token, acceptedEntityStatusReasons, created, imageType, rejectedEntityStatusReasons, status, statusReasons, updated, uploadUrl, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "RequiredDocumentUpload{token=$token, acceptedEntityStatusReasons=$acceptedEntityStatusReasons, created=$created, imageType=$imageType, rejectedEntityStatusReasons=$rejectedEntityStatusReasons, status=$status, statusReasons=$statusReasons, updated=$updated, uploadUrl=$uploadUrl, additionalProperties=$additionalProperties}"
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
