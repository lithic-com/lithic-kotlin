// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.fasterxml.jackson.annotation.JsonCreator
import com.lithic.api.core.Enum
import com.lithic.api.core.JsonField
import com.lithic.api.core.JsonValue
import com.lithic.api.core.NoAutoDetect
import com.lithic.api.core.http.Headers
import com.lithic.api.core.http.QueryParams
import com.lithic.api.errors.LithicInvalidDataException
import com.lithic.api.models.*
import java.time.OffsetDateTime
import java.time.format.DateTimeFormatter
import java.util.Objects

class TransactionListParams
constructor(
    private val accountToken: String?,
    private val begin: OffsetDateTime?,
    private val cardToken: String?,
    private val end: OffsetDateTime?,
    private val endingBefore: String?,
    private val pageSize: Long?,
    private val result: Result?,
    private val startingAfter: String?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) {

    fun accountToken(): String? = accountToken

    fun begin(): OffsetDateTime? = begin

    fun cardToken(): String? = cardToken

    fun end(): OffsetDateTime? = end

    fun endingBefore(): String? = endingBefore

    fun pageSize(): Long? = pageSize

    fun result(): Result? = result

    fun startingAfter(): String? = startingAfter

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    internal fun getHeaders(): Headers = additionalHeaders

    internal fun getQueryParams(): QueryParams {
        val queryParams = QueryParams.builder()
        this.accountToken?.let { queryParams.put("account_token", listOf(it.toString())) }
        this.begin?.let {
            queryParams.put("begin", listOf(DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(it)))
        }
        this.cardToken?.let { queryParams.put("card_token", listOf(it.toString())) }
        this.end?.let {
            queryParams.put("end", listOf(DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(it)))
        }
        this.endingBefore?.let { queryParams.put("ending_before", listOf(it.toString())) }
        this.pageSize?.let { queryParams.put("page_size", listOf(it.toString())) }
        this.result?.let { queryParams.put("result", listOf(it.toString())) }
        this.startingAfter?.let { queryParams.put("starting_after", listOf(it.toString())) }
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
        private var cardToken: String? = null
        private var end: OffsetDateTime? = null
        private var endingBefore: String? = null
        private var pageSize: Long? = null
        private var result: Result? = null
        private var startingAfter: String? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        internal fun from(transactionListParams: TransactionListParams) = apply {
            accountToken = transactionListParams.accountToken
            begin = transactionListParams.begin
            cardToken = transactionListParams.cardToken
            end = transactionListParams.end
            endingBefore = transactionListParams.endingBefore
            pageSize = transactionListParams.pageSize
            result = transactionListParams.result
            startingAfter = transactionListParams.startingAfter
            additionalHeaders = transactionListParams.additionalHeaders.toBuilder()
            additionalQueryParams = transactionListParams.additionalQueryParams.toBuilder()
        }

        /** Filters for transactions associated with a specific account. */
        fun accountToken(accountToken: String) = apply { this.accountToken = accountToken }

        /**
         * Date string in RFC 3339 format. Only entries created after the specified time will be
         * included. UTC time zone.
         */
        fun begin(begin: OffsetDateTime) = apply { this.begin = begin }

        /** Filters for transactions associated with a specific card. */
        fun cardToken(cardToken: String) = apply { this.cardToken = cardToken }

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

        /** Page size (for pagination). */
        fun pageSize(pageSize: Long) = apply { this.pageSize = pageSize }

        /**
         * Filters for transactions using transaction result field. Can filter by `APPROVED`, and
         * `DECLINED`.
         */
        fun result(result: Result) = apply { this.result = result }

        /**
         * A cursor representing an item's token after which a page of results should begin. Used to
         * retrieve the next page of results after this item.
         */
        fun startingAfter(startingAfter: String) = apply { this.startingAfter = startingAfter }

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

        fun build(): TransactionListParams =
            TransactionListParams(
                accountToken,
                begin,
                cardToken,
                end,
                endingBefore,
                pageSize,
                result,
                startingAfter,
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
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

            return /* spotless:off */ other is Result && value == other.value /* spotless:on */
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

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is TransactionListParams && accountToken == other.accountToken && begin == other.begin && cardToken == other.cardToken && end == other.end && endingBefore == other.endingBefore && pageSize == other.pageSize && result == other.result && startingAfter == other.startingAfter && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(accountToken, begin, cardToken, end, endingBefore, pageSize, result, startingAfter, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() =
        "TransactionListParams{accountToken=$accountToken, begin=$begin, cardToken=$cardToken, end=$end, endingBefore=$endingBefore, pageSize=$pageSize, result=$result, startingAfter=$startingAfter, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
