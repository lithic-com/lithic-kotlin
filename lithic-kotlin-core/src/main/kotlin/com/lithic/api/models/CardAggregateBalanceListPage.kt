// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.lithic.api.services.blocking.cards.AggregateBalanceService
import java.util.Objects

/** Get the aggregated card balance across all end-user accounts. */
class CardAggregateBalanceListPage
private constructor(
    private val aggregateBalancesService: AggregateBalanceService,
    private val params: CardAggregateBalanceListParams,
    private val response: CardAggregateBalanceListPageResponse,
) {

    /** Returns the response that this page was parsed from. */
    fun response(): CardAggregateBalanceListPageResponse = response

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

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is CardAggregateBalanceListPage && aggregateBalancesService == other.aggregateBalancesService && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(aggregateBalancesService, params, response) /* spotless:on */

    override fun toString() =
        "CardAggregateBalanceListPage{aggregateBalancesService=$aggregateBalancesService, params=$params, response=$response}"

    fun hasNextPage(): Boolean = data().isNotEmpty()

    fun getNextPageParams(): CardAggregateBalanceListParams? = null

    fun getNextPage(): CardAggregateBalanceListPage? {
        return getNextPageParams()?.let { aggregateBalancesService.list(it) }
    }

    fun autoPager(): AutoPager = AutoPager(this)

    companion object {

        fun of(
            aggregateBalancesService: AggregateBalanceService,
            params: CardAggregateBalanceListParams,
            response: CardAggregateBalanceListPageResponse,
        ) = CardAggregateBalanceListPage(aggregateBalancesService, params, response)
    }

    class AutoPager(private val firstPage: CardAggregateBalanceListPage) :
        Sequence<AggregateBalanceListResponse> {

        override fun iterator(): Iterator<AggregateBalanceListResponse> = iterator {
            var page = firstPage
            var index = 0
            while (true) {
                while (index < page.data().size) {
                    yield(page.data()[index++])
                }
                page = page.getNextPage() ?: break
                index = 0
            }
        }
    }
}
