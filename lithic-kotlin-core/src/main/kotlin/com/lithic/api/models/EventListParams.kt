// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.fasterxml.jackson.annotation.JsonCreator
import com.lithic.api.core.JsonField
import com.lithic.api.core.JsonValue
import com.lithic.api.core.NoAutoDetect
import com.lithic.api.core.toUnmodifiable
import com.lithic.api.errors.LithicInvalidDataException
import com.lithic.api.models.*
import java.time.OffsetDateTime
import java.util.Objects

class EventListParams
constructor(
    private val begin: OffsetDateTime?,
    private val end: OffsetDateTime?,
    private val endingBefore: String?,
    private val eventTypes: List<EventType>?,
    private val pageSize: Long?,
    private val startingAfter: String?,
    private val withContent: Boolean?,
    private val additionalQueryParams: Map<String, List<String>>,
    private val additionalHeaders: Map<String, List<String>>,
) {

    fun begin(): OffsetDateTime? = begin

    fun end(): OffsetDateTime? = end

    fun endingBefore(): String? = endingBefore

    fun eventTypes(): List<EventType>? = eventTypes

    fun pageSize(): Long? = pageSize

    fun startingAfter(): String? = startingAfter

    fun withContent(): Boolean? = withContent

    internal fun getQueryParams(): Map<String, List<String>> {
        val params = mutableMapOf<String, List<String>>()
        this.begin?.let { params.put("begin", listOf(it.toString())) }
        this.end?.let { params.put("end", listOf(it.toString())) }
        this.endingBefore?.let { params.put("ending_before", listOf(it.toString())) }
        this.eventTypes?.let { params.put("event_types", listOf(it.joinToString(separator = ","))) }
        this.pageSize?.let { params.put("page_size", listOf(it.toString())) }
        this.startingAfter?.let { params.put("starting_after", listOf(it.toString())) }
        this.withContent?.let { params.put("with_content", listOf(it.toString())) }
        params.putAll(additionalQueryParams)
        return params.toUnmodifiable()
    }

    internal fun getHeaders(): Map<String, List<String>> = additionalHeaders

    fun _additionalQueryParams(): Map<String, List<String>> = additionalQueryParams

    fun _additionalHeaders(): Map<String, List<String>> = additionalHeaders

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is EventListParams &&
            this.begin == other.begin &&
            this.end == other.end &&
            this.endingBefore == other.endingBefore &&
            this.eventTypes == other.eventTypes &&
            this.pageSize == other.pageSize &&
            this.startingAfter == other.startingAfter &&
            this.withContent == other.withContent &&
            this.additionalQueryParams == other.additionalQueryParams &&
            this.additionalHeaders == other.additionalHeaders
    }

    override fun hashCode(): Int {
        return Objects.hash(
            begin,
            end,
            endingBefore,
            eventTypes,
            pageSize,
            startingAfter,
            withContent,
            additionalQueryParams,
            additionalHeaders,
        )
    }

    override fun toString() =
        "EventListParams{begin=$begin, end=$end, endingBefore=$endingBefore, eventTypes=$eventTypes, pageSize=$pageSize, startingAfter=$startingAfter, withContent=$withContent, additionalQueryParams=$additionalQueryParams, additionalHeaders=$additionalHeaders}"

    fun toBuilder() = Builder().from(this)

    companion object {

        fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var begin: OffsetDateTime? = null
        private var end: OffsetDateTime? = null
        private var endingBefore: String? = null
        private var eventTypes: MutableList<EventType> = mutableListOf()
        private var pageSize: Long? = null
        private var startingAfter: String? = null
        private var withContent: Boolean? = null
        private var additionalQueryParams: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalHeaders: MutableMap<String, MutableList<String>> = mutableMapOf()

        internal fun from(eventListParams: EventListParams) = apply {
            this.begin = eventListParams.begin
            this.end = eventListParams.end
            this.endingBefore = eventListParams.endingBefore
            this.eventTypes(eventListParams.eventTypes ?: listOf())
            this.pageSize = eventListParams.pageSize
            this.startingAfter = eventListParams.startingAfter
            this.withContent = eventListParams.withContent
            additionalQueryParams(eventListParams.additionalQueryParams)
            additionalHeaders(eventListParams.additionalHeaders)
        }

        /**
         * Date string in RFC 3339 format. Only entries created after the specified time will be
         * included. UTC time zone.
         */
        fun begin(begin: OffsetDateTime) = apply { this.begin = begin }

        /**
         * Date string in RFC 3339 format. Only entries created before the specified time will be
         * included. UTC time zone.
         */
        fun end(end: OffsetDateTime) = apply { this.end = end }

        /**
         * A cursor representing an item's token before which a page of results should end. Used to
         * retrieve the previous page of results before this item.
         */
        fun endingBefore(endingBefore: String) = apply { this.endingBefore = endingBefore }

        /** Event types to filter events by. */
        fun eventTypes(eventTypes: List<EventType>) = apply {
            this.eventTypes.clear()
            this.eventTypes.addAll(eventTypes)
        }

        /** Event types to filter events by. */
        fun addEventType(eventType: EventType) = apply { this.eventTypes.add(eventType) }

        /** Page size (for pagination). */
        fun pageSize(pageSize: Long) = apply { this.pageSize = pageSize }

        /**
         * A cursor representing an item's token after which a page of results should begin. Used to
         * retrieve the next page of results after this item.
         */
        fun startingAfter(startingAfter: String) = apply { this.startingAfter = startingAfter }

        /** Whether to include the event payload content in the response. */
        fun withContent(withContent: Boolean) = apply { this.withContent = withContent }

        fun additionalQueryParams(additionalQueryParams: Map<String, List<String>>) = apply {
            this.additionalQueryParams.clear()
            putAllQueryParams(additionalQueryParams)
        }

        fun putQueryParam(name: String, value: String) = apply {
            this.additionalQueryParams.getOrPut(name) { mutableListOf() }.add(value)
        }

        fun putQueryParams(name: String, values: Iterable<String>) = apply {
            this.additionalQueryParams.getOrPut(name) { mutableListOf() }.addAll(values)
        }

        fun putAllQueryParams(additionalQueryParams: Map<String, Iterable<String>>) = apply {
            additionalQueryParams.forEach(this::putQueryParams)
        }

        fun removeQueryParam(name: String) = apply {
            this.additionalQueryParams.put(name, mutableListOf())
        }

        fun additionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.clear()
            putAllHeaders(additionalHeaders)
        }

        fun putHeader(name: String, value: String) = apply {
            this.additionalHeaders.getOrPut(name) { mutableListOf() }.add(value)
        }

        fun putHeaders(name: String, values: Iterable<String>) = apply {
            this.additionalHeaders.getOrPut(name) { mutableListOf() }.addAll(values)
        }

        fun putAllHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            additionalHeaders.forEach(this::putHeaders)
        }

        fun removeHeader(name: String) = apply { this.additionalHeaders.put(name, mutableListOf()) }

        fun build(): EventListParams =
            EventListParams(
                begin,
                end,
                endingBefore,
                if (eventTypes.size == 0) null else eventTypes.toUnmodifiable(),
                pageSize,
                startingAfter,
                withContent,
                additionalQueryParams.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
                additionalHeaders.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
            )
    }

    class EventType
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is EventType && this.value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()

        companion object {

            val ACCOUNT_HOLDER_CREATED = EventType(JsonField.of("account_holder.created"))

            val ACCOUNT_HOLDER_UPDATED = EventType(JsonField.of("account_holder.updated"))

            val ACCOUNT_HOLDER_VERIFICATION = EventType(JsonField.of("account_holder.verification"))

            val BALANCE_UPDATED = EventType(JsonField.of("balance.updated"))

            val CARD_CREATED = EventType(JsonField.of("card.created"))

            val CARD_RENEWED = EventType(JsonField.of("card.renewed"))

            val CARD_SHIPPED = EventType(JsonField.of("card.shipped"))

            val CARD_TRANSACTION_UPDATED = EventType(JsonField.of("card_transaction.updated"))

            val DIGITAL_WALLET_TOKENIZATION_APPROVAL_REQUEST =
                EventType(JsonField.of("digital_wallet.tokenization_approval_request"))

            val DIGITAL_WALLET_TOKENIZATION_RESULT =
                EventType(JsonField.of("digital_wallet.tokenization_result"))

            val DIGITAL_WALLET_TOKENIZATION_TWO_FACTOR_AUTHENTICATION_CODE =
                EventType(
                    JsonField.of("digital_wallet.tokenization_two_factor_authentication_code")
                )

            val DIGITAL_WALLET_TOKENIZATION_TWO_FACTOR_AUTHENTICATION_CODE_SENT =
                EventType(
                    JsonField.of("digital_wallet.tokenization_two_factor_authentication_code_sent")
                )

            val DIGITAL_WALLET_TOKENIZATION_UPDATED =
                EventType(JsonField.of("digital_wallet.tokenization_updated"))

            val DISPUTE_UPDATED = EventType(JsonField.of("dispute.updated"))

            val DISPUTE_EVIDENCE_UPLOAD_FAILED =
                EventType(JsonField.of("dispute_evidence.upload_failed"))

            val EXTERNAL_BANK_ACCOUNT_CREATED =
                EventType(JsonField.of("external_bank_account.created"))

            val EXTERNAL_BANK_ACCOUNT_UPDATED =
                EventType(JsonField.of("external_bank_account.updated"))

            val FINANCIAL_ACCOUNT_CREATED = EventType(JsonField.of("financial_account.created"))

            val PAYMENT_TRANSACTION_CREATED = EventType(JsonField.of("payment_transaction.created"))

            val PAYMENT_TRANSACTION_UPDATED = EventType(JsonField.of("payment_transaction.updated"))

            val SETTLEMENT_REPORT_UPDATED = EventType(JsonField.of("settlement_report.updated"))

            val STATEMENTS_CREATED = EventType(JsonField.of("statements.created"))

            val THREE_DS_AUTHENTICATION_CREATED =
                EventType(JsonField.of("three_ds_authentication.created"))

            val TRANSFER_TRANSACTION_CREATED =
                EventType(JsonField.of("transfer_transaction.created"))

            fun of(value: String) = EventType(JsonField.of(value))
        }

        enum class Known {
            ACCOUNT_HOLDER_CREATED,
            ACCOUNT_HOLDER_UPDATED,
            ACCOUNT_HOLDER_VERIFICATION,
            BALANCE_UPDATED,
            CARD_CREATED,
            CARD_RENEWED,
            CARD_SHIPPED,
            CARD_TRANSACTION_UPDATED,
            DIGITAL_WALLET_TOKENIZATION_APPROVAL_REQUEST,
            DIGITAL_WALLET_TOKENIZATION_RESULT,
            DIGITAL_WALLET_TOKENIZATION_TWO_FACTOR_AUTHENTICATION_CODE,
            DIGITAL_WALLET_TOKENIZATION_TWO_FACTOR_AUTHENTICATION_CODE_SENT,
            DIGITAL_WALLET_TOKENIZATION_UPDATED,
            DISPUTE_UPDATED,
            DISPUTE_EVIDENCE_UPLOAD_FAILED,
            EXTERNAL_BANK_ACCOUNT_CREATED,
            EXTERNAL_BANK_ACCOUNT_UPDATED,
            FINANCIAL_ACCOUNT_CREATED,
            PAYMENT_TRANSACTION_CREATED,
            PAYMENT_TRANSACTION_UPDATED,
            SETTLEMENT_REPORT_UPDATED,
            STATEMENTS_CREATED,
            THREE_DS_AUTHENTICATION_CREATED,
            TRANSFER_TRANSACTION_CREATED,
        }

        enum class Value {
            ACCOUNT_HOLDER_CREATED,
            ACCOUNT_HOLDER_UPDATED,
            ACCOUNT_HOLDER_VERIFICATION,
            BALANCE_UPDATED,
            CARD_CREATED,
            CARD_RENEWED,
            CARD_SHIPPED,
            CARD_TRANSACTION_UPDATED,
            DIGITAL_WALLET_TOKENIZATION_APPROVAL_REQUEST,
            DIGITAL_WALLET_TOKENIZATION_RESULT,
            DIGITAL_WALLET_TOKENIZATION_TWO_FACTOR_AUTHENTICATION_CODE,
            DIGITAL_WALLET_TOKENIZATION_TWO_FACTOR_AUTHENTICATION_CODE_SENT,
            DIGITAL_WALLET_TOKENIZATION_UPDATED,
            DISPUTE_UPDATED,
            DISPUTE_EVIDENCE_UPLOAD_FAILED,
            EXTERNAL_BANK_ACCOUNT_CREATED,
            EXTERNAL_BANK_ACCOUNT_UPDATED,
            FINANCIAL_ACCOUNT_CREATED,
            PAYMENT_TRANSACTION_CREATED,
            PAYMENT_TRANSACTION_UPDATED,
            SETTLEMENT_REPORT_UPDATED,
            STATEMENTS_CREATED,
            THREE_DS_AUTHENTICATION_CREATED,
            TRANSFER_TRANSACTION_CREATED,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                ACCOUNT_HOLDER_CREATED -> Value.ACCOUNT_HOLDER_CREATED
                ACCOUNT_HOLDER_UPDATED -> Value.ACCOUNT_HOLDER_UPDATED
                ACCOUNT_HOLDER_VERIFICATION -> Value.ACCOUNT_HOLDER_VERIFICATION
                BALANCE_UPDATED -> Value.BALANCE_UPDATED
                CARD_CREATED -> Value.CARD_CREATED
                CARD_RENEWED -> Value.CARD_RENEWED
                CARD_SHIPPED -> Value.CARD_SHIPPED
                CARD_TRANSACTION_UPDATED -> Value.CARD_TRANSACTION_UPDATED
                DIGITAL_WALLET_TOKENIZATION_APPROVAL_REQUEST ->
                    Value.DIGITAL_WALLET_TOKENIZATION_APPROVAL_REQUEST
                DIGITAL_WALLET_TOKENIZATION_RESULT -> Value.DIGITAL_WALLET_TOKENIZATION_RESULT
                DIGITAL_WALLET_TOKENIZATION_TWO_FACTOR_AUTHENTICATION_CODE ->
                    Value.DIGITAL_WALLET_TOKENIZATION_TWO_FACTOR_AUTHENTICATION_CODE
                DIGITAL_WALLET_TOKENIZATION_TWO_FACTOR_AUTHENTICATION_CODE_SENT ->
                    Value.DIGITAL_WALLET_TOKENIZATION_TWO_FACTOR_AUTHENTICATION_CODE_SENT
                DIGITAL_WALLET_TOKENIZATION_UPDATED -> Value.DIGITAL_WALLET_TOKENIZATION_UPDATED
                DISPUTE_UPDATED -> Value.DISPUTE_UPDATED
                DISPUTE_EVIDENCE_UPLOAD_FAILED -> Value.DISPUTE_EVIDENCE_UPLOAD_FAILED
                EXTERNAL_BANK_ACCOUNT_CREATED -> Value.EXTERNAL_BANK_ACCOUNT_CREATED
                EXTERNAL_BANK_ACCOUNT_UPDATED -> Value.EXTERNAL_BANK_ACCOUNT_UPDATED
                FINANCIAL_ACCOUNT_CREATED -> Value.FINANCIAL_ACCOUNT_CREATED
                PAYMENT_TRANSACTION_CREATED -> Value.PAYMENT_TRANSACTION_CREATED
                PAYMENT_TRANSACTION_UPDATED -> Value.PAYMENT_TRANSACTION_UPDATED
                SETTLEMENT_REPORT_UPDATED -> Value.SETTLEMENT_REPORT_UPDATED
                STATEMENTS_CREATED -> Value.STATEMENTS_CREATED
                THREE_DS_AUTHENTICATION_CREATED -> Value.THREE_DS_AUTHENTICATION_CREATED
                TRANSFER_TRANSACTION_CREATED -> Value.TRANSFER_TRANSACTION_CREATED
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                ACCOUNT_HOLDER_CREATED -> Known.ACCOUNT_HOLDER_CREATED
                ACCOUNT_HOLDER_UPDATED -> Known.ACCOUNT_HOLDER_UPDATED
                ACCOUNT_HOLDER_VERIFICATION -> Known.ACCOUNT_HOLDER_VERIFICATION
                BALANCE_UPDATED -> Known.BALANCE_UPDATED
                CARD_CREATED -> Known.CARD_CREATED
                CARD_RENEWED -> Known.CARD_RENEWED
                CARD_SHIPPED -> Known.CARD_SHIPPED
                CARD_TRANSACTION_UPDATED -> Known.CARD_TRANSACTION_UPDATED
                DIGITAL_WALLET_TOKENIZATION_APPROVAL_REQUEST ->
                    Known.DIGITAL_WALLET_TOKENIZATION_APPROVAL_REQUEST
                DIGITAL_WALLET_TOKENIZATION_RESULT -> Known.DIGITAL_WALLET_TOKENIZATION_RESULT
                DIGITAL_WALLET_TOKENIZATION_TWO_FACTOR_AUTHENTICATION_CODE ->
                    Known.DIGITAL_WALLET_TOKENIZATION_TWO_FACTOR_AUTHENTICATION_CODE
                DIGITAL_WALLET_TOKENIZATION_TWO_FACTOR_AUTHENTICATION_CODE_SENT ->
                    Known.DIGITAL_WALLET_TOKENIZATION_TWO_FACTOR_AUTHENTICATION_CODE_SENT
                DIGITAL_WALLET_TOKENIZATION_UPDATED -> Known.DIGITAL_WALLET_TOKENIZATION_UPDATED
                DISPUTE_UPDATED -> Known.DISPUTE_UPDATED
                DISPUTE_EVIDENCE_UPLOAD_FAILED -> Known.DISPUTE_EVIDENCE_UPLOAD_FAILED
                EXTERNAL_BANK_ACCOUNT_CREATED -> Known.EXTERNAL_BANK_ACCOUNT_CREATED
                EXTERNAL_BANK_ACCOUNT_UPDATED -> Known.EXTERNAL_BANK_ACCOUNT_UPDATED
                FINANCIAL_ACCOUNT_CREATED -> Known.FINANCIAL_ACCOUNT_CREATED
                PAYMENT_TRANSACTION_CREATED -> Known.PAYMENT_TRANSACTION_CREATED
                PAYMENT_TRANSACTION_UPDATED -> Known.PAYMENT_TRANSACTION_UPDATED
                SETTLEMENT_REPORT_UPDATED -> Known.SETTLEMENT_REPORT_UPDATED
                STATEMENTS_CREATED -> Known.STATEMENTS_CREATED
                THREE_DS_AUTHENTICATION_CREATED -> Known.THREE_DS_AUTHENTICATION_CREATED
                TRANSFER_TRANSACTION_CREATED -> Known.TRANSFER_TRANSACTION_CREATED
                else -> throw LithicInvalidDataException("Unknown EventType: $value")
            }

        fun asString(): String = _value().asStringOrThrow()
    }
}
