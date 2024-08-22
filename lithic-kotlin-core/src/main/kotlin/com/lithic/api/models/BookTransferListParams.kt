// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.fasterxml.jackson.annotation.JsonCreator
import com.lithic.api.core.Enum
import com.lithic.api.core.JsonField
import com.lithic.api.core.JsonValue
import com.lithic.api.core.NoAutoDetect
import com.lithic.api.core.toUnmodifiable
import com.lithic.api.errors.LithicInvalidDataException
import com.lithic.api.models.*
import java.time.OffsetDateTime
import java.time.format.DateTimeFormatter
import java.util.Objects

class BookTransferListParams
constructor(
    private val begin: OffsetDateTime?,
    private val category: Category?,
    private val end: OffsetDateTime?,
    private val endingBefore: String?,
    private val financialAccountToken: String?,
    private val pageSize: Long?,
    private val result: Result?,
    private val startingAfter: String?,
    private val status: Status?,
    private val additionalQueryParams: Map<String, List<String>>,
    private val additionalHeaders: Map<String, List<String>>,
) {

    fun begin(): OffsetDateTime? = begin

    fun category(): Category? = category

    fun end(): OffsetDateTime? = end

    fun endingBefore(): String? = endingBefore

    fun financialAccountToken(): String? = financialAccountToken

    fun pageSize(): Long? = pageSize

    fun result(): Result? = result

    fun startingAfter(): String? = startingAfter

    fun status(): Status? = status

    internal fun getQueryParams(): Map<String, List<String>> {
        val params = mutableMapOf<String, List<String>>()
        this.begin?.let {
            params.put("begin", listOf(DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(it)))
        }
        this.category?.let { params.put("category", listOf(it.toString())) }
        this.end?.let {
            params.put("end", listOf(DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(it)))
        }
        this.endingBefore?.let { params.put("ending_before", listOf(it.toString())) }
        this.financialAccountToken?.let {
            params.put("financial_account_token", listOf(it.toString()))
        }
        this.pageSize?.let { params.put("page_size", listOf(it.toString())) }
        this.result?.let { params.put("result", listOf(it.toString())) }
        this.startingAfter?.let { params.put("starting_after", listOf(it.toString())) }
        this.status?.let { params.put("status", listOf(it.toString())) }
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

        return other is BookTransferListParams &&
            this.begin == other.begin &&
            this.category == other.category &&
            this.end == other.end &&
            this.endingBefore == other.endingBefore &&
            this.financialAccountToken == other.financialAccountToken &&
            this.pageSize == other.pageSize &&
            this.result == other.result &&
            this.startingAfter == other.startingAfter &&
            this.status == other.status &&
            this.additionalQueryParams == other.additionalQueryParams &&
            this.additionalHeaders == other.additionalHeaders
    }

    override fun hashCode(): Int {
        return Objects.hash(
            begin,
            category,
            end,
            endingBefore,
            financialAccountToken,
            pageSize,
            result,
            startingAfter,
            status,
            additionalQueryParams,
            additionalHeaders,
        )
    }

    override fun toString() =
        "BookTransferListParams{begin=$begin, category=$category, end=$end, endingBefore=$endingBefore, financialAccountToken=$financialAccountToken, pageSize=$pageSize, result=$result, startingAfter=$startingAfter, status=$status, additionalQueryParams=$additionalQueryParams, additionalHeaders=$additionalHeaders}"

    fun toBuilder() = Builder().from(this)

    companion object {

        fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var begin: OffsetDateTime? = null
        private var category: Category? = null
        private var end: OffsetDateTime? = null
        private var endingBefore: String? = null
        private var financialAccountToken: String? = null
        private var pageSize: Long? = null
        private var result: Result? = null
        private var startingAfter: String? = null
        private var status: Status? = null
        private var additionalQueryParams: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalHeaders: MutableMap<String, MutableList<String>> = mutableMapOf()

        internal fun from(bookTransferListParams: BookTransferListParams) = apply {
            this.begin = bookTransferListParams.begin
            this.category = bookTransferListParams.category
            this.end = bookTransferListParams.end
            this.endingBefore = bookTransferListParams.endingBefore
            this.financialAccountToken = bookTransferListParams.financialAccountToken
            this.pageSize = bookTransferListParams.pageSize
            this.result = bookTransferListParams.result
            this.startingAfter = bookTransferListParams.startingAfter
            this.status = bookTransferListParams.status
            additionalQueryParams(bookTransferListParams.additionalQueryParams)
            additionalHeaders(bookTransferListParams.additionalHeaders)
        }

        /**
         * Date string in RFC 3339 format. Only entries created after the specified time will be
         * included. UTC time zone.
         */
        fun begin(begin: OffsetDateTime) = apply { this.begin = begin }

        /** Book Transfer category to be returned. */
        fun category(category: Category) = apply { this.category = category }

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

        /**
         * Globally unique identifier for the financial account or card that will send the funds.
         * Accepted type dependent on the program's use case.
         */
        fun financialAccountToken(financialAccountToken: String) = apply {
            this.financialAccountToken = financialAccountToken
        }

        /** Page size (for pagination). */
        fun pageSize(pageSize: Long) = apply { this.pageSize = pageSize }

        /** Book transfer result to be returned. */
        fun result(result: Result) = apply { this.result = result }

        /**
         * A cursor representing an item's token after which a page of results should begin. Used to
         * retrieve the next page of results after this item.
         */
        fun startingAfter(startingAfter: String) = apply { this.startingAfter = startingAfter }

        /** Book transfer status to be returned. */
        fun status(status: Status) = apply { this.status = status }

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

        fun build(): BookTransferListParams =
            BookTransferListParams(
                begin,
                category,
                end,
                endingBefore,
                financialAccountToken,
                pageSize,
                result,
                startingAfter,
                status,
                additionalQueryParams.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
                additionalHeaders.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
            )
    }

    class Category
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Category && this.value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()

        companion object {

            val BALANCE_OR_FUNDING = Category(JsonField.of("BALANCE_OR_FUNDING"))

            val FEE = Category(JsonField.of("FEE"))

            val REWARD = Category(JsonField.of("REWARD"))

            val ADJUSTMENT = Category(JsonField.of("ADJUSTMENT"))

            val DERECOGNITION = Category(JsonField.of("DERECOGNITION"))

            val DISPUTE = Category(JsonField.of("DISPUTE"))

            val INTERNAL = Category(JsonField.of("INTERNAL"))

            fun of(value: String) = Category(JsonField.of(value))
        }

        enum class Known {
            BALANCE_OR_FUNDING,
            FEE,
            REWARD,
            ADJUSTMENT,
            DERECOGNITION,
            DISPUTE,
            INTERNAL,
        }

        enum class Value {
            BALANCE_OR_FUNDING,
            FEE,
            REWARD,
            ADJUSTMENT,
            DERECOGNITION,
            DISPUTE,
            INTERNAL,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                BALANCE_OR_FUNDING -> Value.BALANCE_OR_FUNDING
                FEE -> Value.FEE
                REWARD -> Value.REWARD
                ADJUSTMENT -> Value.ADJUSTMENT
                DERECOGNITION -> Value.DERECOGNITION
                DISPUTE -> Value.DISPUTE
                INTERNAL -> Value.INTERNAL
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                BALANCE_OR_FUNDING -> Known.BALANCE_OR_FUNDING
                FEE -> Known.FEE
                REWARD -> Known.REWARD
                ADJUSTMENT -> Known.ADJUSTMENT
                DERECOGNITION -> Known.DERECOGNITION
                DISPUTE -> Known.DISPUTE
                INTERNAL -> Known.INTERNAL
                else -> throw LithicInvalidDataException("Unknown Category: $value")
            }

        fun asString(): String = _value().asStringOrThrow()
    }

    class Result
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Result && this.value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()

        companion object {

            val APPROVED = Result(JsonField.of("APPROVED"))

            val DECLINED = Result(JsonField.of("DECLINED"))

            fun of(value: String) = Result(JsonField.of(value))
        }

        enum class Known {
            APPROVED,
            DECLINED,
        }

        enum class Value {
            APPROVED,
            DECLINED,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                APPROVED -> Value.APPROVED
                DECLINED -> Value.DECLINED
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                APPROVED -> Known.APPROVED
                DECLINED -> Known.DECLINED
                else -> throw LithicInvalidDataException("Unknown Result: $value")
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

            val DECLINED = Status(JsonField.of("DECLINED"))

            val SETTLED = Status(JsonField.of("SETTLED"))

            fun of(value: String) = Status(JsonField.of(value))
        }

        enum class Known {
            DECLINED,
            SETTLED,
        }

        enum class Value {
            DECLINED,
            SETTLED,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                DECLINED -> Value.DECLINED
                SETTLED -> Value.SETTLED
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                DECLINED -> Known.DECLINED
                SETTLED -> Known.SETTLED
                else -> throw LithicInvalidDataException("Unknown Status: $value")
            }

        fun asString(): String = _value().asStringOrThrow()
    }
}
