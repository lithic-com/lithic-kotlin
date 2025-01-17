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
import com.lithic.api.core.NoAutoDetect
import com.lithic.api.core.checkRequired
import com.lithic.api.core.immutableEmptyMap
import com.lithic.api.core.toImmutable
import com.lithic.api.errors.LithicInvalidDataException
import java.time.OffsetDateTime
import java.util.Objects

@NoAutoDetect
class AccountHolderCreateResponse
@JsonCreator
private constructor(
    @JsonProperty("token") @ExcludeMissing private val token: JsonField<String> = JsonMissing.of(),
    @JsonProperty("account_token")
    @ExcludeMissing
    private val accountToken: JsonField<String> = JsonMissing.of(),
    @JsonProperty("status")
    @ExcludeMissing
    private val status: JsonField<Status> = JsonMissing.of(),
    @JsonProperty("status_reasons")
    @ExcludeMissing
    private val statusReasons: JsonField<List<StatusReasons>> = JsonMissing.of(),
    @JsonProperty("created")
    @ExcludeMissing
    private val created: JsonField<OffsetDateTime> = JsonMissing.of(),
    @JsonProperty("external_id")
    @ExcludeMissing
    private val externalId: JsonField<String> = JsonMissing.of(),
    @JsonProperty("required_documents")
    @ExcludeMissing
    private val requiredDocuments: JsonField<List<RequiredDocument>> = JsonMissing.of(),
    @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
) {

    /** Globally unique identifier for the account holder. */
    fun token(): String = token.getRequired("token")

    /** Globally unique identifier for the account. */
    fun accountToken(): String = accountToken.getRequired("account_token")

    /**
     * KYC and KYB evaluation states.
     *
     * Note:
     * - `PENDING_REVIEW` is only applicable for the `KYB_BASIC` workflow.
     */
    fun status(): Status = status.getRequired("status")

    /** Reason for the evaluation status. */
    fun statusReasons(): List<StatusReasons> = statusReasons.getRequired("status_reasons")

    /** Timestamp of when the account holder was created. */
    fun created(): OffsetDateTime? = created.getNullable("created")

    /**
     * Customer-provided token that indicates a relationship with an object outside of the Lithic
     * ecosystem.
     */
    fun externalId(): String? = externalId.getNullable("external_id")

    /**
     * Only present for "KYB_BASIC" workflow. A list of documents required for the account holder to
     * be approved.
     */
    fun requiredDocuments(): List<RequiredDocument>? =
        requiredDocuments.getNullable("required_documents")

    /** Globally unique identifier for the account holder. */
    @JsonProperty("token") @ExcludeMissing fun _token(): JsonField<String> = token

    /** Globally unique identifier for the account. */
    @JsonProperty("account_token")
    @ExcludeMissing
    fun _accountToken(): JsonField<String> = accountToken

    /**
     * KYC and KYB evaluation states.
     *
     * Note:
     * - `PENDING_REVIEW` is only applicable for the `KYB_BASIC` workflow.
     */
    @JsonProperty("status") @ExcludeMissing fun _status(): JsonField<Status> = status

    /** Reason for the evaluation status. */
    @JsonProperty("status_reasons")
    @ExcludeMissing
    fun _statusReasons(): JsonField<List<StatusReasons>> = statusReasons

    /** Timestamp of when the account holder was created. */
    @JsonProperty("created") @ExcludeMissing fun _created(): JsonField<OffsetDateTime> = created

    /**
     * Customer-provided token that indicates a relationship with an object outside of the Lithic
     * ecosystem.
     */
    @JsonProperty("external_id") @ExcludeMissing fun _externalId(): JsonField<String> = externalId

    /**
     * Only present for "KYB_BASIC" workflow. A list of documents required for the account holder to
     * be approved.
     */
    @JsonProperty("required_documents")
    @ExcludeMissing
    fun _requiredDocuments(): JsonField<List<RequiredDocument>> = requiredDocuments

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    private var validated: Boolean = false

    fun validate(): AccountHolderCreateResponse = apply {
        if (validated) {
            return@apply
        }

        token()
        accountToken()
        status()
        statusReasons()
        created()
        externalId()
        requiredDocuments()?.forEach { it.validate() }
        validated = true
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        fun builder() = Builder()
    }

    class Builder {

        private var token: JsonField<String>? = null
        private var accountToken: JsonField<String>? = null
        private var status: JsonField<Status>? = null
        private var statusReasons: JsonField<MutableList<StatusReasons>>? = null
        private var created: JsonField<OffsetDateTime> = JsonMissing.of()
        private var externalId: JsonField<String> = JsonMissing.of()
        private var requiredDocuments: JsonField<MutableList<RequiredDocument>>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(accountHolderCreateResponse: AccountHolderCreateResponse) = apply {
            token = accountHolderCreateResponse.token
            accountToken = accountHolderCreateResponse.accountToken
            status = accountHolderCreateResponse.status
            statusReasons = accountHolderCreateResponse.statusReasons.map { it.toMutableList() }
            created = accountHolderCreateResponse.created
            externalId = accountHolderCreateResponse.externalId
            requiredDocuments =
                accountHolderCreateResponse.requiredDocuments.map { it.toMutableList() }
            additionalProperties = accountHolderCreateResponse.additionalProperties.toMutableMap()
        }

        /** Globally unique identifier for the account holder. */
        fun token(token: String) = token(JsonField.of(token))

        /** Globally unique identifier for the account holder. */
        fun token(token: JsonField<String>) = apply { this.token = token }

        /** Globally unique identifier for the account. */
        fun accountToken(accountToken: String) = accountToken(JsonField.of(accountToken))

        /** Globally unique identifier for the account. */
        fun accountToken(accountToken: JsonField<String>) = apply {
            this.accountToken = accountToken
        }

        /**
         * KYC and KYB evaluation states.
         *
         * Note:
         * - `PENDING_REVIEW` is only applicable for the `KYB_BASIC` workflow.
         */
        fun status(status: Status) = status(JsonField.of(status))

        /**
         * KYC and KYB evaluation states.
         *
         * Note:
         * - `PENDING_REVIEW` is only applicable for the `KYB_BASIC` workflow.
         */
        fun status(status: JsonField<Status>) = apply { this.status = status }

        /** Reason for the evaluation status. */
        fun statusReasons(statusReasons: List<StatusReasons>) =
            statusReasons(JsonField.of(statusReasons))

        /** Reason for the evaluation status. */
        fun statusReasons(statusReasons: JsonField<List<StatusReasons>>) = apply {
            this.statusReasons = statusReasons.map { it.toMutableList() }
        }

        /** Reason for the evaluation status. */
        fun addStatusReason(statusReason: StatusReasons) = apply {
            statusReasons =
                (statusReasons ?: JsonField.of(mutableListOf())).apply {
                    (asKnown()
                            ?: throw IllegalStateException(
                                "Field was set to non-list type: ${javaClass.simpleName}"
                            ))
                        .add(statusReason)
                }
        }

        /** Timestamp of when the account holder was created. */
        fun created(created: OffsetDateTime) = created(JsonField.of(created))

        /** Timestamp of when the account holder was created. */
        fun created(created: JsonField<OffsetDateTime>) = apply { this.created = created }

        /**
         * Customer-provided token that indicates a relationship with an object outside of the
         * Lithic ecosystem.
         */
        fun externalId(externalId: String) = externalId(JsonField.of(externalId))

        /**
         * Customer-provided token that indicates a relationship with an object outside of the
         * Lithic ecosystem.
         */
        fun externalId(externalId: JsonField<String>) = apply { this.externalId = externalId }

        /**
         * Only present for "KYB_BASIC" workflow. A list of documents required for the account
         * holder to be approved.
         */
        fun requiredDocuments(requiredDocuments: List<RequiredDocument>) =
            requiredDocuments(JsonField.of(requiredDocuments))

        /**
         * Only present for "KYB_BASIC" workflow. A list of documents required for the account
         * holder to be approved.
         */
        fun requiredDocuments(requiredDocuments: JsonField<List<RequiredDocument>>) = apply {
            this.requiredDocuments = requiredDocuments.map { it.toMutableList() }
        }

        /**
         * Only present for "KYB_BASIC" workflow. A list of documents required for the account
         * holder to be approved.
         */
        fun addRequiredDocument(requiredDocument: RequiredDocument) = apply {
            requiredDocuments =
                (requiredDocuments ?: JsonField.of(mutableListOf())).apply {
                    (asKnown()
                            ?: throw IllegalStateException(
                                "Field was set to non-list type: ${javaClass.simpleName}"
                            ))
                        .add(requiredDocument)
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

        fun build(): AccountHolderCreateResponse =
            AccountHolderCreateResponse(
                checkRequired("token", token),
                checkRequired("accountToken", accountToken),
                checkRequired("status", status),
                checkRequired("statusReasons", statusReasons).map { it.toImmutable() },
                created,
                externalId,
                (requiredDocuments ?: JsonMissing.of()).map { it.toImmutable() },
                additionalProperties.toImmutable(),
            )
    }

    /**
     * KYC and KYB evaluation states.
     *
     * Note:
     * - `PENDING_REVIEW` is only applicable for the `KYB_BASIC` workflow.
     */
    class Status
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            val ACCEPTED = of("ACCEPTED")

            val PENDING_REVIEW = of("PENDING_REVIEW")

            val PENDING_DOCUMENT = of("PENDING_DOCUMENT")

            val PENDING_RESUBMIT = of("PENDING_RESUBMIT")

            val REJECTED = of("REJECTED")

            fun of(value: String) = Status(JsonField.of(value))
        }

        enum class Known {
            ACCEPTED,
            PENDING_REVIEW,
            PENDING_DOCUMENT,
            PENDING_RESUBMIT,
            REJECTED,
        }

        enum class Value {
            ACCEPTED,
            PENDING_REVIEW,
            PENDING_DOCUMENT,
            PENDING_RESUBMIT,
            REJECTED,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                ACCEPTED -> Value.ACCEPTED
                PENDING_REVIEW -> Value.PENDING_REVIEW
                PENDING_DOCUMENT -> Value.PENDING_DOCUMENT
                PENDING_RESUBMIT -> Value.PENDING_RESUBMIT
                REJECTED -> Value.REJECTED
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                ACCEPTED -> Known.ACCEPTED
                PENDING_REVIEW -> Known.PENDING_REVIEW
                PENDING_DOCUMENT -> Known.PENDING_DOCUMENT
                PENDING_RESUBMIT -> Known.PENDING_RESUBMIT
                REJECTED -> Known.REJECTED
                else -> throw LithicInvalidDataException("Unknown Status: $value")
            }

        fun asString(): String = _value().asStringOrThrow()

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Status && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /** Status Reasons for KYC/KYB enrollment states */
    class StatusReasons
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            val ADDRESS_VERIFICATION_FAILURE = of("ADDRESS_VERIFICATION_FAILURE")

            val AGE_THRESHOLD_FAILURE = of("AGE_THRESHOLD_FAILURE")

            val COMPLETE_VERIFICATION_FAILURE = of("COMPLETE_VERIFICATION_FAILURE")

            val DOB_VERIFICATION_FAILURE = of("DOB_VERIFICATION_FAILURE")

            val ID_VERIFICATION_FAILURE = of("ID_VERIFICATION_FAILURE")

            val MAX_DOCUMENT_ATTEMPTS = of("MAX_DOCUMENT_ATTEMPTS")

            val MAX_RESUBMISSION_ATTEMPTS = of("MAX_RESUBMISSION_ATTEMPTS")

            val NAME_VERIFICATION_FAILURE = of("NAME_VERIFICATION_FAILURE")

            val OTHER_VERIFICATION_FAILURE = of("OTHER_VERIFICATION_FAILURE")

            val RISK_THRESHOLD_FAILURE = of("RISK_THRESHOLD_FAILURE")

            val WATCHLIST_ALERT_FAILURE = of("WATCHLIST_ALERT_FAILURE")

            val PRIMARY_BUSINESS_ENTITY_ID_VERIFICATION_FAILURE =
                of("PRIMARY_BUSINESS_ENTITY_ID_VERIFICATION_FAILURE")

            val PRIMARY_BUSINESS_ENTITY_ADDRESS_VERIFICATION_FAILURE =
                of("PRIMARY_BUSINESS_ENTITY_ADDRESS_VERIFICATION_FAILURE")

            val PRIMARY_BUSINESS_ENTITY_NAME_VERIFICATION_FAILURE =
                of("PRIMARY_BUSINESS_ENTITY_NAME_VERIFICATION_FAILURE")

            val PRIMARY_BUSINESS_ENTITY_BUSINESS_OFFICERS_NOT_MATCHED =
                of("PRIMARY_BUSINESS_ENTITY_BUSINESS_OFFICERS_NOT_MATCHED")

            val PRIMARY_BUSINESS_ENTITY_SOS_FILING_INACTIVE =
                of("PRIMARY_BUSINESS_ENTITY_SOS_FILING_INACTIVE")

            val PRIMARY_BUSINESS_ENTITY_SOS_NOT_MATCHED =
                of("PRIMARY_BUSINESS_ENTITY_SOS_NOT_MATCHED")

            val PRIMARY_BUSINESS_ENTITY_CMRA_FAILURE = of("PRIMARY_BUSINESS_ENTITY_CMRA_FAILURE")

            val PRIMARY_BUSINESS_ENTITY_WATCHLIST_FAILURE =
                of("PRIMARY_BUSINESS_ENTITY_WATCHLIST_FAILURE")

            val PRIMARY_BUSINESS_ENTITY_REGISTERED_AGENT_FAILURE =
                of("PRIMARY_BUSINESS_ENTITY_REGISTERED_AGENT_FAILURE")

            val CONTROL_PERSON_BLOCKLIST_ALERT_FAILURE =
                of("CONTROL_PERSON_BLOCKLIST_ALERT_FAILURE")

            val CONTROL_PERSON_ID_VERIFICATION_FAILURE =
                of("CONTROL_PERSON_ID_VERIFICATION_FAILURE")

            val CONTROL_PERSON_DOB_VERIFICATION_FAILURE =
                of("CONTROL_PERSON_DOB_VERIFICATION_FAILURE")

            val CONTROL_PERSON_NAME_VERIFICATION_FAILURE =
                of("CONTROL_PERSON_NAME_VERIFICATION_FAILURE")

            fun of(value: String) = StatusReasons(JsonField.of(value))
        }

        enum class Known {
            ADDRESS_VERIFICATION_FAILURE,
            AGE_THRESHOLD_FAILURE,
            COMPLETE_VERIFICATION_FAILURE,
            DOB_VERIFICATION_FAILURE,
            ID_VERIFICATION_FAILURE,
            MAX_DOCUMENT_ATTEMPTS,
            MAX_RESUBMISSION_ATTEMPTS,
            NAME_VERIFICATION_FAILURE,
            OTHER_VERIFICATION_FAILURE,
            RISK_THRESHOLD_FAILURE,
            WATCHLIST_ALERT_FAILURE,
            PRIMARY_BUSINESS_ENTITY_ID_VERIFICATION_FAILURE,
            PRIMARY_BUSINESS_ENTITY_ADDRESS_VERIFICATION_FAILURE,
            PRIMARY_BUSINESS_ENTITY_NAME_VERIFICATION_FAILURE,
            PRIMARY_BUSINESS_ENTITY_BUSINESS_OFFICERS_NOT_MATCHED,
            PRIMARY_BUSINESS_ENTITY_SOS_FILING_INACTIVE,
            PRIMARY_BUSINESS_ENTITY_SOS_NOT_MATCHED,
            PRIMARY_BUSINESS_ENTITY_CMRA_FAILURE,
            PRIMARY_BUSINESS_ENTITY_WATCHLIST_FAILURE,
            PRIMARY_BUSINESS_ENTITY_REGISTERED_AGENT_FAILURE,
            CONTROL_PERSON_BLOCKLIST_ALERT_FAILURE,
            CONTROL_PERSON_ID_VERIFICATION_FAILURE,
            CONTROL_PERSON_DOB_VERIFICATION_FAILURE,
            CONTROL_PERSON_NAME_VERIFICATION_FAILURE,
        }

        enum class Value {
            ADDRESS_VERIFICATION_FAILURE,
            AGE_THRESHOLD_FAILURE,
            COMPLETE_VERIFICATION_FAILURE,
            DOB_VERIFICATION_FAILURE,
            ID_VERIFICATION_FAILURE,
            MAX_DOCUMENT_ATTEMPTS,
            MAX_RESUBMISSION_ATTEMPTS,
            NAME_VERIFICATION_FAILURE,
            OTHER_VERIFICATION_FAILURE,
            RISK_THRESHOLD_FAILURE,
            WATCHLIST_ALERT_FAILURE,
            PRIMARY_BUSINESS_ENTITY_ID_VERIFICATION_FAILURE,
            PRIMARY_BUSINESS_ENTITY_ADDRESS_VERIFICATION_FAILURE,
            PRIMARY_BUSINESS_ENTITY_NAME_VERIFICATION_FAILURE,
            PRIMARY_BUSINESS_ENTITY_BUSINESS_OFFICERS_NOT_MATCHED,
            PRIMARY_BUSINESS_ENTITY_SOS_FILING_INACTIVE,
            PRIMARY_BUSINESS_ENTITY_SOS_NOT_MATCHED,
            PRIMARY_BUSINESS_ENTITY_CMRA_FAILURE,
            PRIMARY_BUSINESS_ENTITY_WATCHLIST_FAILURE,
            PRIMARY_BUSINESS_ENTITY_REGISTERED_AGENT_FAILURE,
            CONTROL_PERSON_BLOCKLIST_ALERT_FAILURE,
            CONTROL_PERSON_ID_VERIFICATION_FAILURE,
            CONTROL_PERSON_DOB_VERIFICATION_FAILURE,
            CONTROL_PERSON_NAME_VERIFICATION_FAILURE,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                ADDRESS_VERIFICATION_FAILURE -> Value.ADDRESS_VERIFICATION_FAILURE
                AGE_THRESHOLD_FAILURE -> Value.AGE_THRESHOLD_FAILURE
                COMPLETE_VERIFICATION_FAILURE -> Value.COMPLETE_VERIFICATION_FAILURE
                DOB_VERIFICATION_FAILURE -> Value.DOB_VERIFICATION_FAILURE
                ID_VERIFICATION_FAILURE -> Value.ID_VERIFICATION_FAILURE
                MAX_DOCUMENT_ATTEMPTS -> Value.MAX_DOCUMENT_ATTEMPTS
                MAX_RESUBMISSION_ATTEMPTS -> Value.MAX_RESUBMISSION_ATTEMPTS
                NAME_VERIFICATION_FAILURE -> Value.NAME_VERIFICATION_FAILURE
                OTHER_VERIFICATION_FAILURE -> Value.OTHER_VERIFICATION_FAILURE
                RISK_THRESHOLD_FAILURE -> Value.RISK_THRESHOLD_FAILURE
                WATCHLIST_ALERT_FAILURE -> Value.WATCHLIST_ALERT_FAILURE
                PRIMARY_BUSINESS_ENTITY_ID_VERIFICATION_FAILURE ->
                    Value.PRIMARY_BUSINESS_ENTITY_ID_VERIFICATION_FAILURE
                PRIMARY_BUSINESS_ENTITY_ADDRESS_VERIFICATION_FAILURE ->
                    Value.PRIMARY_BUSINESS_ENTITY_ADDRESS_VERIFICATION_FAILURE
                PRIMARY_BUSINESS_ENTITY_NAME_VERIFICATION_FAILURE ->
                    Value.PRIMARY_BUSINESS_ENTITY_NAME_VERIFICATION_FAILURE
                PRIMARY_BUSINESS_ENTITY_BUSINESS_OFFICERS_NOT_MATCHED ->
                    Value.PRIMARY_BUSINESS_ENTITY_BUSINESS_OFFICERS_NOT_MATCHED
                PRIMARY_BUSINESS_ENTITY_SOS_FILING_INACTIVE ->
                    Value.PRIMARY_BUSINESS_ENTITY_SOS_FILING_INACTIVE
                PRIMARY_BUSINESS_ENTITY_SOS_NOT_MATCHED ->
                    Value.PRIMARY_BUSINESS_ENTITY_SOS_NOT_MATCHED
                PRIMARY_BUSINESS_ENTITY_CMRA_FAILURE -> Value.PRIMARY_BUSINESS_ENTITY_CMRA_FAILURE
                PRIMARY_BUSINESS_ENTITY_WATCHLIST_FAILURE ->
                    Value.PRIMARY_BUSINESS_ENTITY_WATCHLIST_FAILURE
                PRIMARY_BUSINESS_ENTITY_REGISTERED_AGENT_FAILURE ->
                    Value.PRIMARY_BUSINESS_ENTITY_REGISTERED_AGENT_FAILURE
                CONTROL_PERSON_BLOCKLIST_ALERT_FAILURE ->
                    Value.CONTROL_PERSON_BLOCKLIST_ALERT_FAILURE
                CONTROL_PERSON_ID_VERIFICATION_FAILURE ->
                    Value.CONTROL_PERSON_ID_VERIFICATION_FAILURE
                CONTROL_PERSON_DOB_VERIFICATION_FAILURE ->
                    Value.CONTROL_PERSON_DOB_VERIFICATION_FAILURE
                CONTROL_PERSON_NAME_VERIFICATION_FAILURE ->
                    Value.CONTROL_PERSON_NAME_VERIFICATION_FAILURE
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                ADDRESS_VERIFICATION_FAILURE -> Known.ADDRESS_VERIFICATION_FAILURE
                AGE_THRESHOLD_FAILURE -> Known.AGE_THRESHOLD_FAILURE
                COMPLETE_VERIFICATION_FAILURE -> Known.COMPLETE_VERIFICATION_FAILURE
                DOB_VERIFICATION_FAILURE -> Known.DOB_VERIFICATION_FAILURE
                ID_VERIFICATION_FAILURE -> Known.ID_VERIFICATION_FAILURE
                MAX_DOCUMENT_ATTEMPTS -> Known.MAX_DOCUMENT_ATTEMPTS
                MAX_RESUBMISSION_ATTEMPTS -> Known.MAX_RESUBMISSION_ATTEMPTS
                NAME_VERIFICATION_FAILURE -> Known.NAME_VERIFICATION_FAILURE
                OTHER_VERIFICATION_FAILURE -> Known.OTHER_VERIFICATION_FAILURE
                RISK_THRESHOLD_FAILURE -> Known.RISK_THRESHOLD_FAILURE
                WATCHLIST_ALERT_FAILURE -> Known.WATCHLIST_ALERT_FAILURE
                PRIMARY_BUSINESS_ENTITY_ID_VERIFICATION_FAILURE ->
                    Known.PRIMARY_BUSINESS_ENTITY_ID_VERIFICATION_FAILURE
                PRIMARY_BUSINESS_ENTITY_ADDRESS_VERIFICATION_FAILURE ->
                    Known.PRIMARY_BUSINESS_ENTITY_ADDRESS_VERIFICATION_FAILURE
                PRIMARY_BUSINESS_ENTITY_NAME_VERIFICATION_FAILURE ->
                    Known.PRIMARY_BUSINESS_ENTITY_NAME_VERIFICATION_FAILURE
                PRIMARY_BUSINESS_ENTITY_BUSINESS_OFFICERS_NOT_MATCHED ->
                    Known.PRIMARY_BUSINESS_ENTITY_BUSINESS_OFFICERS_NOT_MATCHED
                PRIMARY_BUSINESS_ENTITY_SOS_FILING_INACTIVE ->
                    Known.PRIMARY_BUSINESS_ENTITY_SOS_FILING_INACTIVE
                PRIMARY_BUSINESS_ENTITY_SOS_NOT_MATCHED ->
                    Known.PRIMARY_BUSINESS_ENTITY_SOS_NOT_MATCHED
                PRIMARY_BUSINESS_ENTITY_CMRA_FAILURE -> Known.PRIMARY_BUSINESS_ENTITY_CMRA_FAILURE
                PRIMARY_BUSINESS_ENTITY_WATCHLIST_FAILURE ->
                    Known.PRIMARY_BUSINESS_ENTITY_WATCHLIST_FAILURE
                PRIMARY_BUSINESS_ENTITY_REGISTERED_AGENT_FAILURE ->
                    Known.PRIMARY_BUSINESS_ENTITY_REGISTERED_AGENT_FAILURE
                CONTROL_PERSON_BLOCKLIST_ALERT_FAILURE ->
                    Known.CONTROL_PERSON_BLOCKLIST_ALERT_FAILURE
                CONTROL_PERSON_ID_VERIFICATION_FAILURE ->
                    Known.CONTROL_PERSON_ID_VERIFICATION_FAILURE
                CONTROL_PERSON_DOB_VERIFICATION_FAILURE ->
                    Known.CONTROL_PERSON_DOB_VERIFICATION_FAILURE
                CONTROL_PERSON_NAME_VERIFICATION_FAILURE ->
                    Known.CONTROL_PERSON_NAME_VERIFICATION_FAILURE
                else -> throw LithicInvalidDataException("Unknown StatusReasons: $value")
            }

        fun asString(): String = _value().asStringOrThrow()

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is StatusReasons && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is AccountHolderCreateResponse && token == other.token && accountToken == other.accountToken && status == other.status && statusReasons == other.statusReasons && created == other.created && externalId == other.externalId && requiredDocuments == other.requiredDocuments && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(token, accountToken, status, statusReasons, created, externalId, requiredDocuments, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "AccountHolderCreateResponse{token=$token, accountToken=$accountToken, status=$status, statusReasons=$statusReasons, created=$created, externalId=$externalId, requiredDocuments=$requiredDocuments, additionalProperties=$additionalProperties}"
}
