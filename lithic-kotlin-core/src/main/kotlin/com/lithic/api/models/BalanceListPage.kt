// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.lithic.api.services.blocking.BalanceService
import java.util.Objects

/** Get the balances for a program, business, or a given end-user account */
class BalanceListPage
private constructor(
    private val balancesService: BalanceService,
    private val params: BalanceListParams,
    private val response: BalanceListPageResponse,
) {

    /** Returns the response that this page was parsed from. */
    fun response(): BalanceListPageResponse = response

    /**
     * Delegates to [BalanceListPageResponse], but gracefully handles missing data.
     *
     * @see [BalanceListPageResponse.data]
     */
    fun data(): List<Balance> = response._data().getNullable("data") ?: emptyList()

    /**
     * Delegates to [BalanceListPageResponse], but gracefully handles missing data.
     *
     * @see [BalanceListPageResponse.hasMore]
     */
    fun hasMore(): Boolean? = response._hasMore().getNullable("has_more")

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is BalanceListPage && balancesService == other.balancesService && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(balancesService, params, response) /* spotless:on */

    override fun toString() =
        "BalanceListPage{balancesService=$balancesService, params=$params, response=$response}"

    fun hasNextPage(): Boolean = data().isNotEmpty()

    fun getNextPageParams(): BalanceListParams? = null

    fun getNextPage(): BalanceListPage? {
        return getNextPageParams()?.let { balancesService.list(it) }
    }

    fun autoPager(): AutoPager = AutoPager(this)

    companion object {

        fun of(
            balancesService: BalanceService,
            params: BalanceListParams,
            response: BalanceListPageResponse,
        ) = BalanceListPage(balancesService, params, response)
    }

    class AutoPager(private val firstPage: BalanceListPage) : Sequence<Balance> {

        override fun iterator(): Iterator<Balance> = iterator {
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
