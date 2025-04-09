// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.lithic.api.services.blocking.cards.BalanceService
import java.util.Objects

/** Get the balances for a given card. */
class CardBalanceListPage
private constructor(
    private val balancesService: BalanceService,
    private val params: CardBalanceListParams,
    private val response: CardBalanceListPageResponse,
) {

    /** Returns the response that this page was parsed from. */
    fun response(): CardBalanceListPageResponse = response

    /**
     * Delegates to [CardBalanceListPageResponse], but gracefully handles missing data.
     *
     * @see [CardBalanceListPageResponse.data]
     */
    fun data(): List<BalanceListResponse> = response._data().getNullable("data") ?: emptyList()

    /**
     * Delegates to [CardBalanceListPageResponse], but gracefully handles missing data.
     *
     * @see [CardBalanceListPageResponse.hasMore]
     */
    fun hasMore(): Boolean? = response._hasMore().getNullable("has_more")

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is CardBalanceListPage && balancesService == other.balancesService && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(balancesService, params, response) /* spotless:on */

    override fun toString() =
        "CardBalanceListPage{balancesService=$balancesService, params=$params, response=$response}"

    fun hasNextPage(): Boolean = data().isNotEmpty()

    fun getNextPageParams(): CardBalanceListParams? = null

    fun getNextPage(): CardBalanceListPage? {
        return getNextPageParams()?.let { balancesService.list(it) }
    }

    fun autoPager(): AutoPager = AutoPager(this)

    companion object {

        fun of(
            balancesService: BalanceService,
            params: CardBalanceListParams,
            response: CardBalanceListPageResponse,
        ) = CardBalanceListPage(balancesService, params, response)
    }

    class AutoPager(private val firstPage: CardBalanceListPage) : Sequence<BalanceListResponse> {

        override fun iterator(): Iterator<BalanceListResponse> = iterator {
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
