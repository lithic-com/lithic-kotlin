// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.fasterxml.jackson.annotation.JsonCreator
import com.lithic.api.core.Enum
import com.lithic.api.core.JsonField
import com.lithic.api.core.NoAutoDetect
import com.lithic.api.core.http.Headers
import com.lithic.api.core.http.QueryParams
import com.lithic.api.errors.LithicInvalidDataException
import java.time.OffsetDateTime
import java.time.format.DateTimeFormatter
import java.util.Objects

class BookTransferListParams
constructor(
    private val accountToken: String?,
    private val begin: OffsetDateTime?,
    private val businessAccountToken: String?,
    private val category: Category?,
    private val end: OffsetDateTime?,
    private val endingBefore: String?,
    private val financialAccountToken: String?,
    private val pageSize: Long?,
    private val result: Result?,
    private val startingAfter: String?,
    private val status: Status?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) {

    fun accountToken(): String? = accountToken

    /**
     * Date string in RFC 3339 format. Only entries created after the specified time will be
     * included. UTC time zone.
     */
    fun begin(): OffsetDateTime? = begin

    fun businessAccountToken(): String? = businessAccountToken

    /** Book Transfer category to be returned. */
    fun category(): Category? = category

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

    /**
     * Globally unique identifier for the financial account or card that will send the funds.
     * Accepted type dependent on the program's use case.
     */
    fun financialAccountToken(): String? = financialAccountToken

    /** Page size (for pagination). */
    fun pageSize(): Long? = pageSize

    /** Book transfer result to be returned. */
    fun result(): Result? = result

    /**
     * A cursor representing an item's token after which a page of results should begin. Used to
     * retrieve the next page of results after this item.
     */
    fun startingAfter(): String? = startingAfter

    /** Book transfer status to be returned. */
    fun status(): Status? = status

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    internal fun getHeaders(): Headers = additionalHeaders

    internal fun getQueryParams(): QueryParams {
        val queryParams = QueryParams.builder()
        this.accountToken?.let { queryParams.put("account_token", listOf(it.toString())) }
        this.begin?.let {
            queryParams.put("begin", listOf(DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(it)))
        }
        this.businessAccountToken?.let {
            queryParams.put("business_account_token", listOf(it.toString()))
        }
        this.category?.let { queryParams.put("category", listOf(it.toString())) }
        this.end?.let {
            queryParams.put("end", listOf(DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(it)))
        }
        this.endingBefore?.let { queryParams.put("ending_before", listOf(it.toString())) }
        this.financialAccountToken?.let {
            queryParams.put("financial_account_token", listOf(it.toString()))
        }
        this.pageSize?.let { queryParams.put("page_size", listOf(it.toString())) }
        this.result?.let { queryParams.put("result", listOf(it.toString())) }
        this.startingAfter?.let { queryParams.put("starting_after", listOf(it.toString())) }
        this.status?.let { queryParams.put("status", listOf(it.toString())) }
        queryParams.putAll(additionalQueryParams)
        return queryParams.build()
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var accountToken: String? = null
        private var begin: OffsetDateTime? = null
        private var businessAccountToken: String? = null
        private var category: Category? = null
        private var end: OffsetDateTime? = null
        private var endingBefore: String? = null
        private var financialAccountToken: String? = null
        private var pageSize: Long? = null
        private var result: Result? = null
        private var startingAfter: String? = null
        private var status: Status? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        internal fun from(bookTransferListParams: BookTransferListParams) = apply {
            accountToken = bookTransferListParams.accountToken
            begin = bookTransferListParams.begin
            businessAccountToken = bookTransferListParams.businessAccountToken
            category = bookTransferListParams.category
            end = bookTransferListParams.end
            endingBefore = bookTransferListParams.endingBefore
            financialAccountToken = bookTransferListParams.financialAccountToken
            pageSize = bookTransferListParams.pageSize
            result = bookTransferListParams.result
            startingAfter = bookTransferListParams.startingAfter
            status = bookTransferListParams.status
            additionalHeaders = bookTransferListParams.additionalHeaders.toBuilder()
            additionalQueryParams = bookTransferListParams.additionalQueryParams.toBuilder()
        }

        fun accountToken(accountToken: String?) = apply { this.accountToken = accountToken }

        /**
         * Date string in RFC 3339 format. Only entries created after the specified time will be
         * included. UTC time zone.
         */
        fun begin(begin: OffsetDateTime?) = apply { this.begin = begin }

        fun businessAccountToken(businessAccountToken: String?) = apply {
            this.businessAccountToken = businessAccountToken
        }

        /** Book Transfer category to be returned. */
        fun category(category: Category?) = apply { this.category = category }

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

        /**
         * Globally unique identifier for the financial account or card that will send the funds.
         * Accepted type dependent on the program's use case.
         */
        fun financialAccountToken(financialAccountToken: String?) = apply {
            this.financialAccountToken = financialAccountToken
        }

        /** Page size (for pagination). */
        fun pageSize(pageSize: Long?) = apply { this.pageSize = pageSize }

        /** Page size (for pagination). */
        fun pageSize(pageSize: Long) = pageSize(pageSize as Long?)

        /** Book transfer result to be returned. */
        fun result(result: Result?) = apply { this.result = result }

        /**
         * A cursor representing an item's token after which a page of results should begin. Used to
         * retrieve the next page of results after this item.
         */
        fun startingAfter(startingAfter: String?) = apply { this.startingAfter = startingAfter }

        /** Book transfer status to be returned. */
        fun status(status: Status?) = apply { this.status = status }

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

        fun build(): BookTransferListParams =
            BookTransferListParams(
                accountToken,
                begin,
                businessAccountToken,
                category,
                end,
                endingBefore,
                financialAccountToken,
                pageSize,
                result,
                startingAfter,
                status,
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    class Category
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            val BALANCE_OR_FUNDING = of("BALANCE_OR_FUNDING")

            val FEE = of("FEE")

            val REWARD = of("REWARD")

            val ADJUSTMENT = of("ADJUSTMENT")

            val DERECOGNITION = of("DERECOGNITION")

            val DISPUTE = of("DISPUTE")

            val INTERNAL = of("INTERNAL")

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

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Category && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    class Result
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            val APPROVED = of("APPROVED")

            val DECLINED = of("DECLINED")

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

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Result && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    class Status
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            val DECLINED = of("DECLINED")

            val SETTLED = of("SETTLED")

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

        return /* spotless:off */ other is BookTransferListParams && accountToken == other.accountToken && begin == other.begin && businessAccountToken == other.businessAccountToken && category == other.category && end == other.end && endingBefore == other.endingBefore && financialAccountToken == other.financialAccountToken && pageSize == other.pageSize && result == other.result && startingAfter == other.startingAfter && status == other.status && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(accountToken, begin, businessAccountToken, category, end, endingBefore, financialAccountToken, pageSize, result, startingAfter, status, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() =
        "BookTransferListParams{accountToken=$accountToken, begin=$begin, businessAccountToken=$businessAccountToken, category=$category, end=$end, endingBefore=$endingBefore, financialAccountToken=$financialAccountToken, pageSize=$pageSize, result=$result, startingAfter=$startingAfter, status=$status, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
