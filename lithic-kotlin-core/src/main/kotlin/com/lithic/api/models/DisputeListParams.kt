// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.fasterxml.jackson.annotation.JsonCreator
import com.lithic.api.core.Enum
import com.lithic.api.core.JsonField
import com.lithic.api.core.NoAutoDetect
import com.lithic.api.core.http.Headers
import com.lithic.api.core.http.QueryParams
import com.lithic.api.core.toImmutable
import com.lithic.api.errors.LithicInvalidDataException
import java.time.OffsetDateTime
import java.time.format.DateTimeFormatter
import java.util.Objects

/** List disputes. */
class DisputeListParams
constructor(
    private val begin: OffsetDateTime?,
    private val end: OffsetDateTime?,
    private val endingBefore: String?,
    private val pageSize: Long?,
    private val startingAfter: String?,
    private val status: Status?,
    private val transactionTokens: List<String>?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) {

    /**
     * Date string in RFC 3339 format. Only entries created after the specified time will be
     * included. UTC time zone.
     */
    fun begin(): OffsetDateTime? = begin

    /**
     * Date string in RFC 3339 format. Only entries created before the specified time will be
     * included. UTC time zone.
     */
    fun end(): OffsetDateTime? = end

    /**
     * A cursor representing an item's token before which a page of results should end. Used to
     * retrieve the previous page of results before this item.
     */
    fun endingBefore(): String? = endingBefore

    /** Page size (for pagination). */
    fun pageSize(): Long? = pageSize

    /**
     * A cursor representing an item's token after which a page of results should begin. Used to
     * retrieve the next page of results after this item.
     */
    fun startingAfter(): String? = startingAfter

    /** List disputes of a specific status. */
    fun status(): Status? = status

    /** Transaction tokens to filter by. */
    fun transactionTokens(): List<String>? = transactionTokens

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    internal fun getHeaders(): Headers = additionalHeaders

    internal fun getQueryParams(): QueryParams {
        val queryParams = QueryParams.builder()
        this.begin?.let {
            queryParams.put("begin", listOf(DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(it)))
        }
        this.end?.let {
            queryParams.put("end", listOf(DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(it)))
        }
        this.endingBefore?.let { queryParams.put("ending_before", listOf(it.toString())) }
        this.pageSize?.let { queryParams.put("page_size", listOf(it.toString())) }
        this.startingAfter?.let { queryParams.put("starting_after", listOf(it.toString())) }
        this.status?.let { queryParams.put("status", listOf(it.toString())) }
        this.transactionTokens?.let {
            queryParams.put("transaction_tokens", listOf(it.joinToString(separator = ",")))
        }
        queryParams.putAll(additionalQueryParams)
        return queryParams.build()
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var begin: OffsetDateTime? = null
        private var end: OffsetDateTime? = null
        private var endingBefore: String? = null
        private var pageSize: Long? = null
        private var startingAfter: String? = null
        private var status: Status? = null
        private var transactionTokens: MutableList<String>? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        internal fun from(disputeListParams: DisputeListParams) = apply {
            begin = disputeListParams.begin
            end = disputeListParams.end
            endingBefore = disputeListParams.endingBefore
            pageSize = disputeListParams.pageSize
            startingAfter = disputeListParams.startingAfter
            status = disputeListParams.status
            transactionTokens = disputeListParams.transactionTokens?.toMutableList()
            additionalHeaders = disputeListParams.additionalHeaders.toBuilder()
            additionalQueryParams = disputeListParams.additionalQueryParams.toBuilder()
        }

        /**
         * Date string in RFC 3339 format. Only entries created after the specified time will be
         * included. UTC time zone.
         */
        fun begin(begin: OffsetDateTime?) = apply { this.begin = begin }

        /**
         * Date string in RFC 3339 format. Only entries created before the specified time will be
         * included. UTC time zone.
         */
        fun end(end: OffsetDateTime?) = apply { this.end = end }

        /**
         * A cursor representing an item's token before which a page of results should end. Used to
         * retrieve the previous page of results before this item.
         */
        fun endingBefore(endingBefore: String?) = apply { this.endingBefore = endingBefore }

        /** Page size (for pagination). */
        fun pageSize(pageSize: Long?) = apply { this.pageSize = pageSize }

        /** Page size (for pagination). */
        fun pageSize(pageSize: Long) = pageSize(pageSize as Long?)

        /**
         * A cursor representing an item's token after which a page of results should begin. Used to
         * retrieve the next page of results after this item.
         */
        fun startingAfter(startingAfter: String?) = apply { this.startingAfter = startingAfter }

        /** List disputes of a specific status. */
        fun status(status: Status?) = apply { this.status = status }

        /** Transaction tokens to filter by. */
        fun transactionTokens(transactionTokens: List<String>?) = apply {
            this.transactionTokens = transactionTokens?.toMutableList()
        }

        /** Transaction tokens to filter by. */
        fun addTransactionToken(transactionToken: String) = apply {
            transactionTokens =
                (transactionTokens ?: mutableListOf()).apply { add(transactionToken) }
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

        fun build(): DisputeListParams =
            DisputeListParams(
                begin,
                end,
                endingBefore,
                pageSize,
                startingAfter,
                status,
                transactionTokens?.toImmutable(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    /** List disputes of a specific status. */
    class Status
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            val ARBITRATION = of("ARBITRATION")

            val CASE_CLOSED = of("CASE_CLOSED")

            val CASE_WON = of("CASE_WON")

            val NEW = of("NEW")

            val PENDING_CUSTOMER = of("PENDING_CUSTOMER")

            val PREARBITRATION = of("PREARBITRATION")

            val REPRESENTMENT = of("REPRESENTMENT")

            val SUBMITTED = of("SUBMITTED")

            fun of(value: String) = Status(JsonField.of(value))
        }

        enum class Known {
            ARBITRATION,
            CASE_CLOSED,
            CASE_WON,
            NEW,
            PENDING_CUSTOMER,
            PREARBITRATION,
            REPRESENTMENT,
            SUBMITTED,
        }

        enum class Value {
            ARBITRATION,
            CASE_CLOSED,
            CASE_WON,
            NEW,
            PENDING_CUSTOMER,
            PREARBITRATION,
            REPRESENTMENT,
            SUBMITTED,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                ARBITRATION -> Value.ARBITRATION
                CASE_CLOSED -> Value.CASE_CLOSED
                CASE_WON -> Value.CASE_WON
                NEW -> Value.NEW
                PENDING_CUSTOMER -> Value.PENDING_CUSTOMER
                PREARBITRATION -> Value.PREARBITRATION
                REPRESENTMENT -> Value.REPRESENTMENT
                SUBMITTED -> Value.SUBMITTED
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                ARBITRATION -> Known.ARBITRATION
                CASE_CLOSED -> Known.CASE_CLOSED
                CASE_WON -> Known.CASE_WON
                NEW -> Known.NEW
                PENDING_CUSTOMER -> Known.PENDING_CUSTOMER
                PREARBITRATION -> Known.PREARBITRATION
                REPRESENTMENT -> Known.REPRESENTMENT
                SUBMITTED -> Known.SUBMITTED
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

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is DisputeListParams && begin == other.begin && end == other.end && endingBefore == other.endingBefore && pageSize == other.pageSize && startingAfter == other.startingAfter && status == other.status && transactionTokens == other.transactionTokens && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(begin, end, endingBefore, pageSize, startingAfter, status, transactionTokens, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() =
        "DisputeListParams{begin=$begin, end=$end, endingBefore=$endingBefore, pageSize=$pageSize, startingAfter=$startingAfter, status=$status, transactionTokens=$transactionTokens, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
