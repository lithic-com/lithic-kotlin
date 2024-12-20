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

class AccountHolderSimulateEnrollmentReviewParams
constructor(
    private val accountHolderToken: String?,
    private val status: Status?,
    private val statusReasons: List<StatusReason>?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
    private val additionalBodyProperties: Map<String, JsonValue>,
) {

    fun accountHolderToken(): String? = accountHolderToken

    fun status(): Status? = status

    fun statusReasons(): List<StatusReason>? = statusReasons

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun _additionalBodyProperties(): Map<String, JsonValue> = additionalBodyProperties

    internal fun getBody(): AccountHolderSimulateEnrollmentReviewBody {
        return AccountHolderSimulateEnrollmentReviewBody(
            accountHolderToken,
            status,
            statusReasons,
            additionalBodyProperties,
        )
    }

    internal fun getHeaders(): Headers = additionalHeaders

    internal fun getQueryParams(): QueryParams = additionalQueryParams

    @JsonDeserialize(builder = AccountHolderSimulateEnrollmentReviewBody.Builder::class)
    @NoAutoDetect
    class AccountHolderSimulateEnrollmentReviewBody
    internal constructor(
        private val accountHolderToken: String?,
        private val status: Status?,
        private val statusReasons: List<StatusReason>?,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        /** The account holder which to perform the simulation upon. */
        @JsonProperty("account_holder_token") fun accountHolderToken(): String? = accountHolderToken

        /** An account holder's status for use within the simulation. */
        @JsonProperty("status") fun status(): Status? = status

        /**
         * Status reason that will be associated with the simulated account holder status. Only
         * required for a `REJECTED` status.
         */
        @JsonProperty("status_reasons") fun statusReasons(): List<StatusReason>? = statusReasons

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var accountHolderToken: String? = null
            private var status: Status? = null
            private var statusReasons: List<StatusReason>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(
                accountHolderSimulateEnrollmentReviewBody: AccountHolderSimulateEnrollmentReviewBody
            ) = apply {
                this.accountHolderToken =
                    accountHolderSimulateEnrollmentReviewBody.accountHolderToken
                this.status = accountHolderSimulateEnrollmentReviewBody.status
                this.statusReasons = accountHolderSimulateEnrollmentReviewBody.statusReasons
                additionalProperties(accountHolderSimulateEnrollmentReviewBody.additionalProperties)
            }

            /** The account holder which to perform the simulation upon. */
            @JsonProperty("account_holder_token")
            fun accountHolderToken(accountHolderToken: String) = apply {
                this.accountHolderToken = accountHolderToken
            }

            /** An account holder's status for use within the simulation. */
            @JsonProperty("status") fun status(status: Status) = apply { this.status = status }

            /**
             * Status reason that will be associated with the simulated account holder status. Only
             * required for a `REJECTED` status.
             */
            @JsonProperty("status_reasons")
            fun statusReasons(statusReasons: List<StatusReason>) = apply {
                this.statusReasons = statusReasons
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

            fun build(): AccountHolderSimulateEnrollmentReviewBody =
                AccountHolderSimulateEnrollmentReviewBody(
                    accountHolderToken,
                    status,
                    statusReasons?.toImmutable(),
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is AccountHolderSimulateEnrollmentReviewBody && accountHolderToken == other.accountHolderToken && status == other.status && statusReasons == other.statusReasons && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(accountHolderToken, status, statusReasons, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "AccountHolderSimulateEnrollmentReviewBody{accountHolderToken=$accountHolderToken, status=$status, statusReasons=$statusReasons, additionalProperties=$additionalProperties}"
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var accountHolderToken: String? = null
        private var status: Status? = null
        private var statusReasons: MutableList<StatusReason> = mutableListOf()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()
        private var additionalBodyProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(
            accountHolderSimulateEnrollmentReviewParams: AccountHolderSimulateEnrollmentReviewParams
        ) = apply {
            accountHolderToken = accountHolderSimulateEnrollmentReviewParams.accountHolderToken
            status = accountHolderSimulateEnrollmentReviewParams.status
            statusReasons =
                accountHolderSimulateEnrollmentReviewParams.statusReasons?.toMutableList()
                    ?: mutableListOf()
            additionalHeaders =
                accountHolderSimulateEnrollmentReviewParams.additionalHeaders.toBuilder()
            additionalQueryParams =
                accountHolderSimulateEnrollmentReviewParams.additionalQueryParams.toBuilder()
            additionalBodyProperties =
                accountHolderSimulateEnrollmentReviewParams.additionalBodyProperties.toMutableMap()
        }

        /** The account holder which to perform the simulation upon. */
        fun accountHolderToken(accountHolderToken: String) = apply {
            this.accountHolderToken = accountHolderToken
        }

        /** An account holder's status for use within the simulation. */
        fun status(status: Status) = apply { this.status = status }

        /**
         * Status reason that will be associated with the simulated account holder status. Only
         * required for a `REJECTED` status.
         */
        fun statusReasons(statusReasons: List<StatusReason>) = apply {
            this.statusReasons.clear()
            this.statusReasons.addAll(statusReasons)
        }

        /**
         * Status reason that will be associated with the simulated account holder status. Only
         * required for a `REJECTED` status.
         */
        fun addStatusReason(statusReason: StatusReason) = apply {
            this.statusReasons.add(statusReason)
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

        fun build(): AccountHolderSimulateEnrollmentReviewParams =
            AccountHolderSimulateEnrollmentReviewParams(
                accountHolderToken,
                status,
                statusReasons.toImmutable().ifEmpty { null },
                additionalHeaders.build(),
                additionalQueryParams.build(),
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

            return /* spotless:off */ other is Status && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()

        companion object {

            val ACCEPTED = Status(JsonField.of("ACCEPTED"))

            val REJECTED = Status(JsonField.of("REJECTED"))

            fun of(value: String) = Status(JsonField.of(value))
        }

        enum class Known {
            ACCEPTED,
            REJECTED,
        }

        enum class Value {
            ACCEPTED,
            REJECTED,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                ACCEPTED -> Value.ACCEPTED
                REJECTED -> Value.REJECTED
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                ACCEPTED -> Known.ACCEPTED
                REJECTED -> Known.REJECTED
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

            return /* spotless:off */ other is StatusReason && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()

        companion object {

            val PRIMARY_BUSINESS_ENTITY_ID_VERIFICATION_FAILURE =
                StatusReason(JsonField.of("PRIMARY_BUSINESS_ENTITY_ID_VERIFICATION_FAILURE"))

            val PRIMARY_BUSINESS_ENTITY_ADDRESS_VERIFICATION_FAILURE =
                StatusReason(JsonField.of("PRIMARY_BUSINESS_ENTITY_ADDRESS_VERIFICATION_FAILURE"))

            val PRIMARY_BUSINESS_ENTITY_NAME_VERIFICATION_FAILURE =
                StatusReason(JsonField.of("PRIMARY_BUSINESS_ENTITY_NAME_VERIFICATION_FAILURE"))

            val PRIMARY_BUSINESS_ENTITY_BUSINESS_OFFICERS_NOT_MATCHED =
                StatusReason(JsonField.of("PRIMARY_BUSINESS_ENTITY_BUSINESS_OFFICERS_NOT_MATCHED"))

            val PRIMARY_BUSINESS_ENTITY_SOS_FILING_INACTIVE =
                StatusReason(JsonField.of("PRIMARY_BUSINESS_ENTITY_SOS_FILING_INACTIVE"))

            val PRIMARY_BUSINESS_ENTITY_SOS_NOT_MATCHED =
                StatusReason(JsonField.of("PRIMARY_BUSINESS_ENTITY_SOS_NOT_MATCHED"))

            val PRIMARY_BUSINESS_ENTITY_CMRA_FAILURE =
                StatusReason(JsonField.of("PRIMARY_BUSINESS_ENTITY_CMRA_FAILURE"))

            val PRIMARY_BUSINESS_ENTITY_WATCHLIST_FAILURE =
                StatusReason(JsonField.of("PRIMARY_BUSINESS_ENTITY_WATCHLIST_FAILURE"))

            val PRIMARY_BUSINESS_ENTITY_REGISTERED_AGENT_FAILURE =
                StatusReason(JsonField.of("PRIMARY_BUSINESS_ENTITY_REGISTERED_AGENT_FAILURE"))

            val CONTROL_PERSON_BLOCKLIST_ALERT_FAILURE =
                StatusReason(JsonField.of("CONTROL_PERSON_BLOCKLIST_ALERT_FAILURE"))

            val CONTROL_PERSON_ID_VERIFICATION_FAILURE =
                StatusReason(JsonField.of("CONTROL_PERSON_ID_VERIFICATION_FAILURE"))

            val CONTROL_PERSON_DOB_VERIFICATION_FAILURE =
                StatusReason(JsonField.of("CONTROL_PERSON_DOB_VERIFICATION_FAILURE"))

            val CONTROL_PERSON_NAME_VERIFICATION_FAILURE =
                StatusReason(JsonField.of("CONTROL_PERSON_NAME_VERIFICATION_FAILURE"))

            val BENEFICIAL_OWNER_INDIVIDUAL_DOB_VERIFICATION_FAILURE =
                StatusReason(JsonField.of("BENEFICIAL_OWNER_INDIVIDUAL_DOB_VERIFICATION_FAILURE"))

            val BENEFICIAL_OWNER_INDIVIDUAL_BLOCKLIST_ALERT_FAILURE =
                StatusReason(JsonField.of("BENEFICIAL_OWNER_INDIVIDUAL_BLOCKLIST_ALERT_FAILURE"))

            val BENEFICIAL_OWNER_INDIVIDUAL_ID_VERIFICATION_FAILURE =
                StatusReason(JsonField.of("BENEFICIAL_OWNER_INDIVIDUAL_ID_VERIFICATION_FAILURE"))

            val BENEFICIAL_OWNER_INDIVIDUAL_NAME_VERIFICATION_FAILURE =
                StatusReason(JsonField.of("BENEFICIAL_OWNER_INDIVIDUAL_NAME_VERIFICATION_FAILURE"))

            fun of(value: String) = StatusReason(JsonField.of(value))
        }

        enum class Known {
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
            BENEFICIAL_OWNER_INDIVIDUAL_DOB_VERIFICATION_FAILURE,
            BENEFICIAL_OWNER_INDIVIDUAL_BLOCKLIST_ALERT_FAILURE,
            BENEFICIAL_OWNER_INDIVIDUAL_ID_VERIFICATION_FAILURE,
            BENEFICIAL_OWNER_INDIVIDUAL_NAME_VERIFICATION_FAILURE,
        }

        enum class Value {
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
            BENEFICIAL_OWNER_INDIVIDUAL_DOB_VERIFICATION_FAILURE,
            BENEFICIAL_OWNER_INDIVIDUAL_BLOCKLIST_ALERT_FAILURE,
            BENEFICIAL_OWNER_INDIVIDUAL_ID_VERIFICATION_FAILURE,
            BENEFICIAL_OWNER_INDIVIDUAL_NAME_VERIFICATION_FAILURE,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
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
                BENEFICIAL_OWNER_INDIVIDUAL_DOB_VERIFICATION_FAILURE ->
                    Value.BENEFICIAL_OWNER_INDIVIDUAL_DOB_VERIFICATION_FAILURE
                BENEFICIAL_OWNER_INDIVIDUAL_BLOCKLIST_ALERT_FAILURE ->
                    Value.BENEFICIAL_OWNER_INDIVIDUAL_BLOCKLIST_ALERT_FAILURE
                BENEFICIAL_OWNER_INDIVIDUAL_ID_VERIFICATION_FAILURE ->
                    Value.BENEFICIAL_OWNER_INDIVIDUAL_ID_VERIFICATION_FAILURE
                BENEFICIAL_OWNER_INDIVIDUAL_NAME_VERIFICATION_FAILURE ->
                    Value.BENEFICIAL_OWNER_INDIVIDUAL_NAME_VERIFICATION_FAILURE
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
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
                BENEFICIAL_OWNER_INDIVIDUAL_DOB_VERIFICATION_FAILURE ->
                    Known.BENEFICIAL_OWNER_INDIVIDUAL_DOB_VERIFICATION_FAILURE
                BENEFICIAL_OWNER_INDIVIDUAL_BLOCKLIST_ALERT_FAILURE ->
                    Known.BENEFICIAL_OWNER_INDIVIDUAL_BLOCKLIST_ALERT_FAILURE
                BENEFICIAL_OWNER_INDIVIDUAL_ID_VERIFICATION_FAILURE ->
                    Known.BENEFICIAL_OWNER_INDIVIDUAL_ID_VERIFICATION_FAILURE
                BENEFICIAL_OWNER_INDIVIDUAL_NAME_VERIFICATION_FAILURE ->
                    Known.BENEFICIAL_OWNER_INDIVIDUAL_NAME_VERIFICATION_FAILURE
                else -> throw LithicInvalidDataException("Unknown StatusReason: $value")
            }

        fun asString(): String = _value().asStringOrThrow()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is AccountHolderSimulateEnrollmentReviewParams && accountHolderToken == other.accountHolderToken && status == other.status && statusReasons == other.statusReasons && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams && additionalBodyProperties == other.additionalBodyProperties /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(accountHolderToken, status, statusReasons, additionalHeaders, additionalQueryParams, additionalBodyProperties) /* spotless:on */

    override fun toString() =
        "AccountHolderSimulateEnrollmentReviewParams{accountHolderToken=$accountHolderToken, status=$status, statusReasons=$statusReasons, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams, additionalBodyProperties=$additionalBodyProperties}"
}
