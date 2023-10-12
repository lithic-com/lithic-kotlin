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

class CardListParams
constructor(
    private val accountToken: String?,
    private val begin: OffsetDateTime?,
    private val end: OffsetDateTime?,
    private val endingBefore: String?,
    private val pageSize: Long?,
    private val startingAfter: String?,
    private val state: State?,
    private val additionalQueryParams: Map<String, List<String>>,
    private val additionalHeaders: Map<String, List<String>>,
) {

    fun accountToken(): String? = accountToken

    fun begin(): OffsetDateTime? = begin

    fun end(): OffsetDateTime? = end

    fun endingBefore(): String? = endingBefore

    fun pageSize(): Long? = pageSize

    fun startingAfter(): String? = startingAfter

    fun state(): State? = state

    internal fun getQueryParams(): Map<String, List<String>> {
        val params = mutableMapOf<String, List<String>>()
        this.accountToken?.let { params.put("account_token", listOf(it.toString())) }
        this.begin?.let { params.put("begin", listOf(it.toString())) }
        this.end?.let { params.put("end", listOf(it.toString())) }
        this.endingBefore?.let { params.put("ending_before", listOf(it.toString())) }
        this.pageSize?.let { params.put("page_size", listOf(it.toString())) }
        this.startingAfter?.let { params.put("starting_after", listOf(it.toString())) }
        this.state?.let { params.put("state", listOf(it.toString())) }
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

        return other is CardListParams &&
            this.accountToken == other.accountToken &&
            this.begin == other.begin &&
            this.end == other.end &&
            this.endingBefore == other.endingBefore &&
            this.pageSize == other.pageSize &&
            this.startingAfter == other.startingAfter &&
            this.state == other.state &&
            this.additionalQueryParams == other.additionalQueryParams &&
            this.additionalHeaders == other.additionalHeaders
    }

    override fun hashCode(): Int {
        return Objects.hash(
            accountToken,
            begin,
            end,
            endingBefore,
            pageSize,
            startingAfter,
            state,
            additionalQueryParams,
            additionalHeaders,
        )
    }

    override fun toString() =
        "CardListParams{accountToken=$accountToken, begin=$begin, end=$end, endingBefore=$endingBefore, pageSize=$pageSize, startingAfter=$startingAfter, state=$state, additionalQueryParams=$additionalQueryParams, additionalHeaders=$additionalHeaders}"

    fun toBuilder() = Builder().from(this)

    companion object {

        fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var accountToken: String? = null
        private var begin: OffsetDateTime? = null
        private var end: OffsetDateTime? = null
        private var endingBefore: String? = null
        private var pageSize: Long? = null
        private var startingAfter: String? = null
        private var state: State? = null
        private var additionalQueryParams: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalHeaders: MutableMap<String, MutableList<String>> = mutableMapOf()

        internal fun from(cardListParams: CardListParams) = apply {
            this.accountToken = cardListParams.accountToken
            this.begin = cardListParams.begin
            this.end = cardListParams.end
            this.endingBefore = cardListParams.endingBefore
            this.pageSize = cardListParams.pageSize
            this.startingAfter = cardListParams.startingAfter
            this.state = cardListParams.state
            additionalQueryParams(cardListParams.additionalQueryParams)
            additionalHeaders(cardListParams.additionalHeaders)
        }

        /** Returns cards associated with the specified account. */
        fun accountToken(accountToken: String) = apply { this.accountToken = accountToken }

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
         * A cursor representing an item's token before which a page of results should end. Used to
         * retrieve the previous page of results before this item.
         */
        fun endingBefore(endingBefore: String) = apply { this.endingBefore = endingBefore }

        /** Page size (for pagination). */
        fun pageSize(pageSize: Long) = apply { this.pageSize = pageSize }

        /**
         * A cursor representing an item's token after which a page of results should begin. Used to
         * retrieve the next page of results after this item.
         */
        fun startingAfter(startingAfter: String) = apply { this.startingAfter = startingAfter }

        /** Returns cards with the specified state. */
        fun state(state: State) = apply { this.state = state }

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

        fun build(): CardListParams =
            CardListParams(
                accountToken,
                begin,
                end,
                endingBefore,
                pageSize,
                startingAfter,
                state,
                additionalQueryParams.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
                additionalHeaders.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
            )
    }

    class State
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is State && this.value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()

        companion object {

            val OPEN = State(JsonField.of("OPEN"))

            val PAUSED = State(JsonField.of("PAUSED"))

            val CLOSED = State(JsonField.of("CLOSED"))

            val PENDING_FULFILLMENT = State(JsonField.of("PENDING_FULFILLMENT"))

            val PENDING_ACTIVATION = State(JsonField.of("PENDING_ACTIVATION"))

            fun of(value: String) = State(JsonField.of(value))
        }

        enum class Known {
            OPEN,
            PAUSED,
            CLOSED,
            PENDING_FULFILLMENT,
            PENDING_ACTIVATION,
        }

        enum class Value {
            OPEN,
            PAUSED,
            CLOSED,
            PENDING_FULFILLMENT,
            PENDING_ACTIVATION,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                OPEN -> Value.OPEN
                PAUSED -> Value.PAUSED
                CLOSED -> Value.CLOSED
                PENDING_FULFILLMENT -> Value.PENDING_FULFILLMENT
                PENDING_ACTIVATION -> Value.PENDING_ACTIVATION
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                OPEN -> Known.OPEN
                PAUSED -> Known.PAUSED
                CLOSED -> Known.CLOSED
                PENDING_FULFILLMENT -> Known.PENDING_FULFILLMENT
                PENDING_ACTIVATION -> Known.PENDING_ACTIVATION
                else -> throw LithicInvalidDataException("Unknown State: $value")
            }

        fun asString(): String = _value().asStringOrThrow()
    }
}
