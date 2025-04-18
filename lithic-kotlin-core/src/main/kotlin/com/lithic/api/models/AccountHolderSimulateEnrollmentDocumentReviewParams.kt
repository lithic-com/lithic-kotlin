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
import com.lithic.api.core.Params
import com.lithic.api.core.checkKnown
import com.lithic.api.core.checkRequired
import com.lithic.api.core.http.Headers
import com.lithic.api.core.http.QueryParams
import com.lithic.api.core.toImmutable
import com.lithic.api.errors.LithicInvalidDataException
import java.util.Collections
import java.util.Objects

/** Simulates a review for an account holder document upload. */
class AccountHolderSimulateEnrollmentDocumentReviewParams
private constructor(
    private val body: SimulateEnrollmentDocumentReviewRequest,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /**
     * The account holder document upload which to perform the simulation upon.
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun documentUploadToken(): String = body.documentUploadToken()

    /**
     * An account holder document's upload status for use within the simulation.
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun status(): Status = body.status()

    /**
     * A list of status reasons associated with a KYB account holder in PENDING_REVIEW
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun acceptedEntityStatusReasons(): List<String>? = body.acceptedEntityStatusReasons()

    /**
     * Status reason that will be associated with the simulated account holder status. Only required
     * for a `REJECTED` status or `PARTIAL_APPROVAL` status.
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun statusReason(): DocumentUploadStatusReasons? = body.statusReason()

    /**
     * Returns the raw JSON value of [documentUploadToken].
     *
     * Unlike [documentUploadToken], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _documentUploadToken(): JsonField<String> = body._documentUploadToken()

    /**
     * Returns the raw JSON value of [status].
     *
     * Unlike [status], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _status(): JsonField<Status> = body._status()

    /**
     * Returns the raw JSON value of [acceptedEntityStatusReasons].
     *
     * Unlike [acceptedEntityStatusReasons], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    fun _acceptedEntityStatusReasons(): JsonField<List<String>> =
        body._acceptedEntityStatusReasons()

    /**
     * Returns the raw JSON value of [statusReason].
     *
     * Unlike [statusReason], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _statusReason(): JsonField<DocumentUploadStatusReasons> = body._statusReason()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [AccountHolderSimulateEnrollmentDocumentReviewParams].
         *
         * The following fields are required:
         * ```kotlin
         * .documentUploadToken()
         * .status()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [AccountHolderSimulateEnrollmentDocumentReviewParams]. */
    class Builder internal constructor() {

        private var body: SimulateEnrollmentDocumentReviewRequest.Builder =
            SimulateEnrollmentDocumentReviewRequest.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        internal fun from(
            accountHolderSimulateEnrollmentDocumentReviewParams:
                AccountHolderSimulateEnrollmentDocumentReviewParams
        ) = apply {
            body = accountHolderSimulateEnrollmentDocumentReviewParams.body.toBuilder()
            additionalHeaders =
                accountHolderSimulateEnrollmentDocumentReviewParams.additionalHeaders.toBuilder()
            additionalQueryParams =
                accountHolderSimulateEnrollmentDocumentReviewParams.additionalQueryParams
                    .toBuilder()
        }

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [documentUploadToken]
         * - [status]
         * - [acceptedEntityStatusReasons]
         * - [statusReason]
         */
        fun body(body: SimulateEnrollmentDocumentReviewRequest) = apply {
            this.body = body.toBuilder()
        }

        /** The account holder document upload which to perform the simulation upon. */
        fun documentUploadToken(documentUploadToken: String) = apply {
            body.documentUploadToken(documentUploadToken)
        }

        /**
         * Sets [Builder.documentUploadToken] to an arbitrary JSON value.
         *
         * You should usually call [Builder.documentUploadToken] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun documentUploadToken(documentUploadToken: JsonField<String>) = apply {
            body.documentUploadToken(documentUploadToken)
        }

        /** An account holder document's upload status for use within the simulation. */
        fun status(status: Status) = apply { body.status(status) }

        /**
         * Sets [Builder.status] to an arbitrary JSON value.
         *
         * You should usually call [Builder.status] with a well-typed [Status] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun status(status: JsonField<Status>) = apply { body.status(status) }

        /** A list of status reasons associated with a KYB account holder in PENDING_REVIEW */
        fun acceptedEntityStatusReasons(acceptedEntityStatusReasons: List<String>) = apply {
            body.acceptedEntityStatusReasons(acceptedEntityStatusReasons)
        }

        /**
         * Sets [Builder.acceptedEntityStatusReasons] to an arbitrary JSON value.
         *
         * You should usually call [Builder.acceptedEntityStatusReasons] with a well-typed
         * `List<String>` value instead. This method is primarily for setting the field to an
         * undocumented or not yet supported value.
         */
        fun acceptedEntityStatusReasons(acceptedEntityStatusReasons: JsonField<List<String>>) =
            apply {
                body.acceptedEntityStatusReasons(acceptedEntityStatusReasons)
            }

        /**
         * Adds a single [String] to [acceptedEntityStatusReasons].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addAcceptedEntityStatusReason(acceptedEntityStatusReason: String) = apply {
            body.addAcceptedEntityStatusReason(acceptedEntityStatusReason)
        }

        /**
         * Status reason that will be associated with the simulated account holder status. Only
         * required for a `REJECTED` status or `PARTIAL_APPROVAL` status.
         */
        fun statusReason(statusReason: DocumentUploadStatusReasons) = apply {
            body.statusReason(statusReason)
        }

        /**
         * Sets [Builder.statusReason] to an arbitrary JSON value.
         *
         * You should usually call [Builder.statusReason] with a well-typed
         * [DocumentUploadStatusReasons] value instead. This method is primarily for setting the
         * field to an undocumented or not yet supported value.
         */
        fun statusReason(statusReason: JsonField<DocumentUploadStatusReasons>) = apply {
            body.statusReason(statusReason)
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

        /**
         * Returns an immutable instance of [AccountHolderSimulateEnrollmentDocumentReviewParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```kotlin
         * .documentUploadToken()
         * .status()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): AccountHolderSimulateEnrollmentDocumentReviewParams =
            AccountHolderSimulateEnrollmentDocumentReviewParams(
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): SimulateEnrollmentDocumentReviewRequest = body

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    class SimulateEnrollmentDocumentReviewRequest
    private constructor(
        private val documentUploadToken: JsonField<String>,
        private val status: JsonField<Status>,
        private val acceptedEntityStatusReasons: JsonField<List<String>>,
        private val statusReason: JsonField<DocumentUploadStatusReasons>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("document_upload_token")
            @ExcludeMissing
            documentUploadToken: JsonField<String> = JsonMissing.of(),
            @JsonProperty("status") @ExcludeMissing status: JsonField<Status> = JsonMissing.of(),
            @JsonProperty("accepted_entity_status_reasons")
            @ExcludeMissing
            acceptedEntityStatusReasons: JsonField<List<String>> = JsonMissing.of(),
            @JsonProperty("status_reason")
            @ExcludeMissing
            statusReason: JsonField<DocumentUploadStatusReasons> = JsonMissing.of(),
        ) : this(
            documentUploadToken,
            status,
            acceptedEntityStatusReasons,
            statusReason,
            mutableMapOf(),
        )

        /**
         * The account holder document upload which to perform the simulation upon.
         *
         * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun documentUploadToken(): String = documentUploadToken.getRequired("document_upload_token")

        /**
         * An account holder document's upload status for use within the simulation.
         *
         * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun status(): Status = status.getRequired("status")

        /**
         * A list of status reasons associated with a KYB account holder in PENDING_REVIEW
         *
         * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun acceptedEntityStatusReasons(): List<String>? =
            acceptedEntityStatusReasons.getNullable("accepted_entity_status_reasons")

        /**
         * Status reason that will be associated with the simulated account holder status. Only
         * required for a `REJECTED` status or `PARTIAL_APPROVAL` status.
         *
         * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun statusReason(): DocumentUploadStatusReasons? = statusReason.getNullable("status_reason")

        /**
         * Returns the raw JSON value of [documentUploadToken].
         *
         * Unlike [documentUploadToken], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("document_upload_token")
        @ExcludeMissing
        fun _documentUploadToken(): JsonField<String> = documentUploadToken

        /**
         * Returns the raw JSON value of [status].
         *
         * Unlike [status], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("status") @ExcludeMissing fun _status(): JsonField<Status> = status

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
         * Returns the raw JSON value of [statusReason].
         *
         * Unlike [statusReason], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("status_reason")
        @ExcludeMissing
        fun _statusReason(): JsonField<DocumentUploadStatusReasons> = statusReason

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
             * Returns a mutable builder for constructing an instance of
             * [SimulateEnrollmentDocumentReviewRequest].
             *
             * The following fields are required:
             * ```kotlin
             * .documentUploadToken()
             * .status()
             * ```
             */
            fun builder() = Builder()
        }

        /** A builder for [SimulateEnrollmentDocumentReviewRequest]. */
        class Builder internal constructor() {

            private var documentUploadToken: JsonField<String>? = null
            private var status: JsonField<Status>? = null
            private var acceptedEntityStatusReasons: JsonField<MutableList<String>>? = null
            private var statusReason: JsonField<DocumentUploadStatusReasons> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(
                simulateEnrollmentDocumentReviewRequest: SimulateEnrollmentDocumentReviewRequest
            ) = apply {
                documentUploadToken = simulateEnrollmentDocumentReviewRequest.documentUploadToken
                status = simulateEnrollmentDocumentReviewRequest.status
                acceptedEntityStatusReasons =
                    simulateEnrollmentDocumentReviewRequest.acceptedEntityStatusReasons.map {
                        it.toMutableList()
                    }
                statusReason = simulateEnrollmentDocumentReviewRequest.statusReason
                additionalProperties =
                    simulateEnrollmentDocumentReviewRequest.additionalProperties.toMutableMap()
            }

            /** The account holder document upload which to perform the simulation upon. */
            fun documentUploadToken(documentUploadToken: String) =
                documentUploadToken(JsonField.of(documentUploadToken))

            /**
             * Sets [Builder.documentUploadToken] to an arbitrary JSON value.
             *
             * You should usually call [Builder.documentUploadToken] with a well-typed [String]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun documentUploadToken(documentUploadToken: JsonField<String>) = apply {
                this.documentUploadToken = documentUploadToken
            }

            /** An account holder document's upload status for use within the simulation. */
            fun status(status: Status) = status(JsonField.of(status))

            /**
             * Sets [Builder.status] to an arbitrary JSON value.
             *
             * You should usually call [Builder.status] with a well-typed [Status] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun status(status: JsonField<Status>) = apply { this.status = status }

            /** A list of status reasons associated with a KYB account holder in PENDING_REVIEW */
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

            /**
             * Status reason that will be associated with the simulated account holder status. Only
             * required for a `REJECTED` status or `PARTIAL_APPROVAL` status.
             */
            fun statusReason(statusReason: DocumentUploadStatusReasons) =
                statusReason(JsonField.of(statusReason))

            /**
             * Sets [Builder.statusReason] to an arbitrary JSON value.
             *
             * You should usually call [Builder.statusReason] with a well-typed
             * [DocumentUploadStatusReasons] value instead. This method is primarily for setting the
             * field to an undocumented or not yet supported value.
             */
            fun statusReason(statusReason: JsonField<DocumentUploadStatusReasons>) = apply {
                this.statusReason = statusReason
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
             * Returns an immutable instance of [SimulateEnrollmentDocumentReviewRequest].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```kotlin
             * .documentUploadToken()
             * .status()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): SimulateEnrollmentDocumentReviewRequest =
                SimulateEnrollmentDocumentReviewRequest(
                    checkRequired("documentUploadToken", documentUploadToken),
                    checkRequired("status", status),
                    (acceptedEntityStatusReasons ?: JsonMissing.of()).map { it.toImmutable() },
                    statusReason,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): SimulateEnrollmentDocumentReviewRequest = apply {
            if (validated) {
                return@apply
            }

            documentUploadToken()
            status().validate()
            acceptedEntityStatusReasons()
            statusReason()?.validate()
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
            (if (documentUploadToken.asKnown() == null) 0 else 1) +
                (status.asKnown()?.validity() ?: 0) +
                (acceptedEntityStatusReasons.asKnown()?.size ?: 0) +
                (statusReason.asKnown()?.validity() ?: 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is SimulateEnrollmentDocumentReviewRequest && documentUploadToken == other.documentUploadToken && status == other.status && acceptedEntityStatusReasons == other.acceptedEntityStatusReasons && statusReason == other.statusReason && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(documentUploadToken, status, acceptedEntityStatusReasons, statusReason, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "SimulateEnrollmentDocumentReviewRequest{documentUploadToken=$documentUploadToken, status=$status, acceptedEntityStatusReasons=$acceptedEntityStatusReasons, statusReason=$statusReason, additionalProperties=$additionalProperties}"
    }

    /** An account holder document's upload status for use within the simulation. */
    class Status @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            val UPLOADED = of("UPLOADED")

            val ACCEPTED = of("ACCEPTED")

            val REJECTED = of("REJECTED")

            val PARTIAL_APPROVAL = of("PARTIAL_APPROVAL")

            fun of(value: String) = Status(JsonField.of(value))
        }

        /** An enum containing [Status]'s known values. */
        enum class Known {
            UPLOADED,
            ACCEPTED,
            REJECTED,
            PARTIAL_APPROVAL,
        }

        /**
         * An enum containing [Status]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Status] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            UPLOADED,
            ACCEPTED,
            REJECTED,
            PARTIAL_APPROVAL,
            /** An enum member indicating that [Status] was instantiated with an unknown value. */
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
                UPLOADED -> Value.UPLOADED
                ACCEPTED -> Value.ACCEPTED
                REJECTED -> Value.REJECTED
                PARTIAL_APPROVAL -> Value.PARTIAL_APPROVAL
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
                UPLOADED -> Known.UPLOADED
                ACCEPTED -> Known.ACCEPTED
                REJECTED -> Known.REJECTED
                PARTIAL_APPROVAL -> Known.PARTIAL_APPROVAL
                else -> throw LithicInvalidDataException("Unknown Status: $value")
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

        fun validate(): Status = apply {
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

            return /* spotless:off */ other is Status && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /**
     * Status reason that will be associated with the simulated account holder status. Only required
     * for a `REJECTED` status or `PARTIAL_APPROVAL` status.
     */
    class DocumentUploadStatusReasons
    @JsonCreator
    private constructor(private val value: JsonField<String>) : Enum {

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

            val DOCUMENT_MISSING_REQUIRED_DATA = of("DOCUMENT_MISSING_REQUIRED_DATA")

            val DOCUMENT_UPLOAD_TOO_BLURRY = of("DOCUMENT_UPLOAD_TOO_BLURRY")

            val FILE_SIZE_TOO_LARGE = of("FILE_SIZE_TOO_LARGE")

            val INVALID_DOCUMENT_TYPE = of("INVALID_DOCUMENT_TYPE")

            val INVALID_DOCUMENT_UPLOAD = of("INVALID_DOCUMENT_UPLOAD")

            val INVALID_ENTITY = of("INVALID_ENTITY")

            val DOCUMENT_EXPIRED = of("DOCUMENT_EXPIRED")

            val DOCUMENT_ISSUED_GREATER_THAN_30_DAYS = of("DOCUMENT_ISSUED_GREATER_THAN_30_DAYS")

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
         * An enum containing [DocumentUploadStatusReasons]'s known values, as well as an [_UNKNOWN]
         * member.
         *
         * An instance of [DocumentUploadStatusReasons] can contain an unknown value in a couple of
         * cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
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
             * An enum member indicating that [DocumentUploadStatusReasons] was instantiated with an
             * unknown value.
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

        return /* spotless:off */ other is AccountHolderSimulateEnrollmentDocumentReviewParams && body == other.body && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(body, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() =
        "AccountHolderSimulateEnrollmentDocumentReviewParams{body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
