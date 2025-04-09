// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.lithic.api.core.checkRequired
import com.lithic.api.services.async.cards.AggregateBalanceServiceAsync
import java.util.Objects
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.FlowCollector

/** @see [AggregateBalanceServiceAsync.list] */
class CardAggregateBalanceListPageAsync
private constructor(
    private val service: AggregateBalanceServiceAsync,
    private val params: CardAggregateBalanceListParams,
    private val response: CardAggregateBalanceListPageResponse,
) {

    /**
     * Delegates to [CardAggregateBalanceListPageResponse], but gracefully handles missing data.
     *
     * @see [CardAggregateBalanceListPageResponse.data]
     */
    fun data(): List<AggregateBalanceListResponse> =
        response._data().getNullable("data") ?: emptyList()

    /**
     * Delegates to [CardAggregateBalanceListPageResponse], but gracefully handles missing data.
     *
     * @see [CardAggregateBalanceListPageResponse.hasMore]
     */
    fun hasMore(): Boolean? = response._hasMore().getNullable("has_more")

    fun hasNextPage(): Boolean = data().isNotEmpty()

    fun getNextPageParams(): CardAggregateBalanceListParams? = null

    suspend fun getNextPage(): CardAggregateBalanceListPageAsync? =
        getNextPageParams()?.let { service.list(it) }

    fun autoPager(): AutoPager = AutoPager(this)

    /** The parameters that were used to request this page. */
    fun params(): CardAggregateBalanceListParams = params

    /** The response that this page was parsed from. */
    fun response(): CardAggregateBalanceListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [CardAggregateBalanceListPageAsync].
         *
         * The following fields are required:
         * ```kotlin
         * .service()
         * .params()
         * .response()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [CardAggregateBalanceListPageAsync]. */
    class Builder internal constructor() {

        private var service: AggregateBalanceServiceAsync? = null
        private var params: CardAggregateBalanceListParams? = null
        private var response: CardAggregateBalanceListPageResponse? = null

        internal fun from(cardAggregateBalanceListPageAsync: CardAggregateBalanceListPageAsync) =
            apply {
                service = cardAggregateBalanceListPageAsync.service
                params = cardAggregateBalanceListPageAsync.params
                response = cardAggregateBalanceListPageAsync.response
            }

        fun service(service: AggregateBalanceServiceAsync) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: CardAggregateBalanceListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: CardAggregateBalanceListPageResponse) = apply {
            this.response = response
        }

        /**
         * Returns an immutable instance of [CardAggregateBalanceListPageAsync].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```kotlin
         * .service()
         * .params()
         * .response()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): CardAggregateBalanceListPageAsync =
            CardAggregateBalanceListPageAsync(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    class AutoPager(private val firstPage: CardAggregateBalanceListPageAsync) :
        Flow<AggregateBalanceListResponse> {

        override suspend fun collect(collector: FlowCollector<AggregateBalanceListResponse>) {
            var page = firstPage
            var index = 0
            while (true) {
                while (index < page.data().size) {
                    collector.emit(page.data()[index++])
                }
                page = page.getNextPage() ?: break
                index = 0
            }
        }
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is CardAggregateBalanceListPageAsync && service == other.service && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, params, response) /* spotless:on */

    override fun toString() =
        "CardAggregateBalanceListPageAsync{service=$service, params=$params, response=$response}"
}
