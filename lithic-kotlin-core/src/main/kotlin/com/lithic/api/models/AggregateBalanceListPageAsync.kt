// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.lithic.api.services.async.AggregateBalanceServiceAsync
import java.util.Objects
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.FlowCollector

/** Get the aggregated balance across all end-user accounts by financial account type */
class AggregateBalanceListPageAsync
private constructor(
    private val aggregateBalancesService: AggregateBalanceServiceAsync,
    private val params: AggregateBalanceListParams,
    private val response: AggregateBalanceListPageResponse,
) {

    /** Returns the response that this page was parsed from. */
    fun response(): AggregateBalanceListPageResponse = response

    /**
     * Delegates to [AggregateBalanceListPageResponse], but gracefully handles missing data.
     *
     * @see [AggregateBalanceListPageResponse.data]
     */
    fun data(): List<AggregateBalance> = response._data().getNullable("data") ?: emptyList()

    /**
     * Delegates to [AggregateBalanceListPageResponse], but gracefully handles missing data.
     *
     * @see [AggregateBalanceListPageResponse.hasMore]
     */
    fun hasMore(): Boolean? = response._hasMore().getNullable("has_more")

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is AggregateBalanceListPageAsync && aggregateBalancesService == other.aggregateBalancesService && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(aggregateBalancesService, params, response) /* spotless:on */

    override fun toString() =
        "AggregateBalanceListPageAsync{aggregateBalancesService=$aggregateBalancesService, params=$params, response=$response}"

    fun hasNextPage(): Boolean = data().isNotEmpty()

    fun getNextPageParams(): AggregateBalanceListParams? = null

    suspend fun getNextPage(): AggregateBalanceListPageAsync? {
        return getNextPageParams()?.let { aggregateBalancesService.list(it) }
    }

    fun autoPager(): AutoPager = AutoPager(this)

    companion object {

        fun of(
            aggregateBalancesService: AggregateBalanceServiceAsync,
            params: AggregateBalanceListParams,
            response: AggregateBalanceListPageResponse,
        ) = AggregateBalanceListPageAsync(aggregateBalancesService, params, response)
    }

    class AutoPager(private val firstPage: AggregateBalanceListPageAsync) : Flow<AggregateBalance> {

        override suspend fun collect(collector: FlowCollector<AggregateBalance>) {
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
}
