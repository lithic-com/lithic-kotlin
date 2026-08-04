// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.lithic.api.core.Params
import com.lithic.api.core.http.Headers
import com.lithic.api.core.http.QueryParams
import java.time.OffsetDateTime
import java.time.format.DateTimeFormatter
import java.util.Objects

/** Returns a paginated list of disputes. */
class DisputesV2ListParams
private constructor(
    private val accountToken: String?,
    private val begin: OffsetDateTime?,
    private val cardToken: String?,
    private val disputedTransactionToken: String?,
    private val end: OffsetDateTime?,
    private val endingBefore: String?,
    private val pageSize: Long?,
    private val startingAfter: String?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /** Filter by account token. */
    fun accountToken(): String? = accountToken

    /** RFC 3339 timestamp for filtering by created date, inclusive. */
    fun begin(): OffsetDateTime? = begin

    /** Filter by card token. */
    fun cardToken(): String? = cardToken

    /**
     * Filter by the token of the transaction being disputed. Corresponds with
     * transaction_series.related_transaction_token in the Dispute.
     */
    fun disputedTransactionToken(): String? = disputedTransactionToken

    /** RFC 3339 timestamp for filtering by created date, inclusive. */
    fun end(): OffsetDateTime? = end

    /**
     * A cursor representing an item's token before which a page of results should end. Used to
     * retrieve the previous page of results before this item.
     */
    fun endingBefore(): String? = endingBefore

    /** Number of items to return. */
    fun pageSize(): Long? = pageSize

    /**
     * A cursor representing an item's token after which a page of results should begin. Used to
     * retrieve the next page of results after this item.
     */
    fun startingAfter(): String? = startingAfter

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        fun none(): DisputesV2ListParams = builder().build()

        /** Returns a mutable builder for constructing an instance of [DisputesV2ListParams]. */
        fun builder() = Builder()
    }

    /** A builder for [DisputesV2ListParams]. */
    class Builder internal constructor() {

        private var accountToken: String? = null
        private var begin: OffsetDateTime? = null
        private var cardToken: String? = null
        private var disputedTransactionToken: String? = null
        private var end: OffsetDateTime? = null
        private var endingBefore: String? = null
        private var pageSize: Long? = null
        private var startingAfter: String? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        internal fun from(disputesV2ListParams: DisputesV2ListParams) = apply {
            accountToken = disputesV2ListParams.accountToken
            begin = disputesV2ListParams.begin
            cardToken = disputesV2ListParams.cardToken
            disputedTransactionToken = disputesV2ListParams.disputedTransactionToken
            end = disputesV2ListParams.end
            endingBefore = disputesV2ListParams.endingBefore
            pageSize = disputesV2ListParams.pageSize
            startingAfter = disputesV2ListParams.startingAfter
            additionalHeaders = disputesV2ListParams.additionalHeaders.toBuilder()
            additionalQueryParams = disputesV2ListParams.additionalQueryParams.toBuilder()
        }

        /** Filter by account token. */
        fun accountToken(accountToken: String?) = apply { this.accountToken = accountToken }

        /** RFC 3339 timestamp for filtering by created date, inclusive. */
        fun begin(begin: OffsetDateTime?) = apply { this.begin = begin }

        /** Filter by card token. */
        fun cardToken(cardToken: String?) = apply { this.cardToken = cardToken }

        /**
         * Filter by the token of the transaction being disputed. Corresponds with
         * transaction_series.related_transaction_token in the Dispute.
         */
        fun disputedTransactionToken(disputedTransactionToken: String?) = apply {
            this.disputedTransactionToken = disputedTransactionToken
        }

        /** RFC 3339 timestamp for filtering by created date, inclusive. */
        fun end(end: OffsetDateTime?) = apply { this.end = end }

        /**
         * A cursor representing an item's token before which a page of results should end. Used to
         * retrieve the previous page of results before this item.
         */
        fun endingBefore(endingBefore: String?) = apply { this.endingBefore = endingBefore }

        /** Number of items to return. */
        fun pageSize(pageSize: Long?) = apply { this.pageSize = pageSize }

        /**
         * Alias for [Builder.pageSize].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun pageSize(pageSize: Long) = pageSize(pageSize as Long?)

        /**
         * A cursor representing an item's token after which a page of results should begin. Used to
         * retrieve the next page of results after this item.
         */
        fun startingAfter(startingAfter: String?) = apply { this.startingAfter = startingAfter }

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
         * Returns an immutable instance of [DisputesV2ListParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): DisputesV2ListParams =
            DisputesV2ListParams(
                accountToken,
                begin,
                cardToken,
                disputedTransactionToken,
                end,
                endingBefore,
                pageSize,
                startingAfter,
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams =
        QueryParams.builder()
            .apply {
                accountToken?.let { put("account_token", it) }
                begin?.let { put("begin", DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(it)) }
                cardToken?.let { put("card_token", it) }
                disputedTransactionToken?.let { put("disputed_transaction_token", it) }
                end?.let { put("end", DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(it)) }
                endingBefore?.let { put("ending_before", it) }
                pageSize?.let { put("page_size", it.toString()) }
                startingAfter?.let { put("starting_after", it) }
                putAll(additionalQueryParams)
            }
            .build()

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is DisputesV2ListParams &&
            accountToken == other.accountToken &&
            begin == other.begin &&
            cardToken == other.cardToken &&
            disputedTransactionToken == other.disputedTransactionToken &&
            end == other.end &&
            endingBefore == other.endingBefore &&
            pageSize == other.pageSize &&
            startingAfter == other.startingAfter &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(
            accountToken,
            begin,
            cardToken,
            disputedTransactionToken,
            end,
            endingBefore,
            pageSize,
            startingAfter,
            additionalHeaders,
            additionalQueryParams,
        )

    override fun toString() =
        "DisputesV2ListParams{accountToken=$accountToken, begin=$begin, cardToken=$cardToken, disputedTransactionToken=$disputedTransactionToken, end=$end, endingBefore=$endingBefore, pageSize=$pageSize, startingAfter=$startingAfter, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
