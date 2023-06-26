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

class DisputeListParams
constructor(
    private val transactionTokens: List<String>?,
    private val status: Status?,
    private val pageSize: Long?,
    private val begin: OffsetDateTime?,
    private val end: OffsetDateTime?,
    private val startingAfter: String?,
    private val endingBefore: String?,
    private val additionalQueryParams: Map<String, List<String>>,
    private val additionalHeaders: Map<String, List<String>>,
) {

    fun transactionTokens(): List<String>? = transactionTokens

    fun status(): Status? = status

    fun pageSize(): Long? = pageSize

    fun begin(): OffsetDateTime? = begin

    fun end(): OffsetDateTime? = end

    fun startingAfter(): String? = startingAfter

    fun endingBefore(): String? = endingBefore

    internal fun getQueryParams(): Map<String, List<String>> {
        val params = mutableMapOf<String, List<String>>()
        this.transactionTokens?.let {
            params.put("transaction_tokens", listOf(it.joinToString(separator = ",")))
        }
        this.status?.let { params.put("status", listOf(it.toString())) }
        this.pageSize?.let { params.put("page_size", listOf(it.toString())) }
        this.begin?.let { params.put("begin", listOf(it.toString())) }
        this.end?.let { params.put("end", listOf(it.toString())) }
        this.startingAfter?.let { params.put("starting_after", listOf(it.toString())) }
        this.endingBefore?.let { params.put("ending_before", listOf(it.toString())) }
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

        return other is DisputeListParams &&
            this.transactionTokens == other.transactionTokens &&
            this.status == other.status &&
            this.pageSize == other.pageSize &&
            this.begin == other.begin &&
            this.end == other.end &&
            this.startingAfter == other.startingAfter &&
            this.endingBefore == other.endingBefore &&
            this.additionalQueryParams == other.additionalQueryParams &&
            this.additionalHeaders == other.additionalHeaders
    }

    override fun hashCode(): Int {
        return Objects.hash(
            transactionTokens,
            status,
            pageSize,
            begin,
            end,
            startingAfter,
            endingBefore,
            additionalQueryParams,
            additionalHeaders,
        )
    }

    override fun toString() =
        "DisputeListParams{transactionTokens=$transactionTokens, status=$status, pageSize=$pageSize, begin=$begin, end=$end, startingAfter=$startingAfter, endingBefore=$endingBefore, additionalQueryParams=$additionalQueryParams, additionalHeaders=$additionalHeaders}"

    fun toBuilder() = Builder().from(this)

    companion object {

        fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var transactionTokens: List<String>? = null
        private var status: Status? = null
        private var pageSize: Long? = null
        private var begin: OffsetDateTime? = null
        private var end: OffsetDateTime? = null
        private var startingAfter: String? = null
        private var endingBefore: String? = null
        private var additionalQueryParams: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalHeaders: MutableMap<String, MutableList<String>> = mutableMapOf()

        internal fun from(disputeListParams: DisputeListParams) = apply {
            this.transactionTokens = disputeListParams.transactionTokens
            this.status = disputeListParams.status
            this.pageSize = disputeListParams.pageSize
            this.begin = disputeListParams.begin
            this.end = disputeListParams.end
            this.startingAfter = disputeListParams.startingAfter
            this.endingBefore = disputeListParams.endingBefore
            additionalQueryParams(disputeListParams.additionalQueryParams)
            additionalHeaders(disputeListParams.additionalHeaders)
        }

        /** Transaction tokens to filter by. */
        fun transactionTokens(transactionTokens: List<String>) = apply {
            this.transactionTokens = transactionTokens
        }

        /** List disputes of a specific status. */
        fun status(status: Status) = apply { this.status = status }

        /** Page size (for pagination). */
        fun pageSize(pageSize: Long) = apply { this.pageSize = pageSize }

        /**
         * Date string in RFC 3339 format. Only entries created after the specified date will be
         * included. UTC time zone.
         */
        fun begin(begin: OffsetDateTime) = apply { this.begin = begin }

        /**
         * Date string in RFC 3339 format. Only entries created before the specified date will be
         * included. UTC time zone.
         */
        fun end(end: OffsetDateTime) = apply { this.end = end }

        /**
         * A cursor representing an item's token after which a page of results should begin. Used to
         * retrieve the next page of results after this item.
         */
        fun startingAfter(startingAfter: String) = apply { this.startingAfter = startingAfter }

        /**
         * A cursor representing an item's token before which a page of results should end. Used to
         * retrieve the previous page of results before this item.
         */
        fun endingBefore(endingBefore: String) = apply { this.endingBefore = endingBefore }

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

        fun build(): DisputeListParams =
            DisputeListParams(
                transactionTokens?.toUnmodifiable(),
                status,
                pageSize,
                begin,
                end,
                startingAfter,
                endingBefore,
                additionalQueryParams.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
                additionalHeaders.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
            )
    }

    class Status
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) {

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

            val NEW = Status(JsonField.of("NEW"))

            val PENDING_CUSTOMER = Status(JsonField.of("PENDING_CUSTOMER"))

            val SUBMITTED = Status(JsonField.of("SUBMITTED"))

            val REPRESENTMENT = Status(JsonField.of("REPRESENTMENT"))

            val PREARBITRATION = Status(JsonField.of("PREARBITRATION"))

            val ARBITRATION = Status(JsonField.of("ARBITRATION"))

            val CASE_WON = Status(JsonField.of("CASE_WON"))

            val CASE_CLOSED = Status(JsonField.of("CASE_CLOSED"))

            fun of(value: String) = Status(JsonField.of(value))
        }

        enum class Known {
            NEW,
            PENDING_CUSTOMER,
            SUBMITTED,
            REPRESENTMENT,
            PREARBITRATION,
            ARBITRATION,
            CASE_WON,
            CASE_CLOSED,
        }

        enum class Value {
            NEW,
            PENDING_CUSTOMER,
            SUBMITTED,
            REPRESENTMENT,
            PREARBITRATION,
            ARBITRATION,
            CASE_WON,
            CASE_CLOSED,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                NEW -> Value.NEW
                PENDING_CUSTOMER -> Value.PENDING_CUSTOMER
                SUBMITTED -> Value.SUBMITTED
                REPRESENTMENT -> Value.REPRESENTMENT
                PREARBITRATION -> Value.PREARBITRATION
                ARBITRATION -> Value.ARBITRATION
                CASE_WON -> Value.CASE_WON
                CASE_CLOSED -> Value.CASE_CLOSED
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                NEW -> Known.NEW
                PENDING_CUSTOMER -> Known.PENDING_CUSTOMER
                SUBMITTED -> Known.SUBMITTED
                REPRESENTMENT -> Known.REPRESENTMENT
                PREARBITRATION -> Known.PREARBITRATION
                ARBITRATION -> Known.ARBITRATION
                CASE_WON -> Known.CASE_WON
                CASE_CLOSED -> Known.CASE_CLOSED
                else -> throw LithicInvalidDataException("Unknown Status: $value")
            }

        fun asString(): String = _value().asStringOrThrow()
    }
}
