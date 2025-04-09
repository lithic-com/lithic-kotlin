// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.lithic.api.services.blocking.financialAccounts.BalanceService
import java.util.Objects

/** Get the balances for a given financial account. */
class FinancialAccountBalanceListPage
private constructor(
    private val balancesService: BalanceService,
    private val params: FinancialAccountBalanceListParams,
    private val response: FinancialAccountBalanceListPageResponse,
) {

    /** Returns the response that this page was parsed from. */
    fun response(): FinancialAccountBalanceListPageResponse = response

    /**
     * Delegates to [FinancialAccountBalanceListPageResponse], but gracefully handles missing data.
     *
     * @see [FinancialAccountBalanceListPageResponse.data]
     */
    fun data(): List<BalanceListResponse> = response._data().getNullable("data") ?: emptyList()

    /**
     * Delegates to [FinancialAccountBalanceListPageResponse], but gracefully handles missing data.
     *
     * @see [FinancialAccountBalanceListPageResponse.hasMore]
     */
    fun hasMore(): Boolean? = response._hasMore().getNullable("has_more")

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is FinancialAccountBalanceListPage && balancesService == other.balancesService && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(balancesService, params, response) /* spotless:on */

    override fun toString() =
        "FinancialAccountBalanceListPage{balancesService=$balancesService, params=$params, response=$response}"

    fun hasNextPage(): Boolean = data().isNotEmpty()

    fun getNextPageParams(): FinancialAccountBalanceListParams? = null

    fun getNextPage(): FinancialAccountBalanceListPage? {
        return getNextPageParams()?.let { balancesService.list(it) }
    }

    fun autoPager(): AutoPager = AutoPager(this)

    companion object {

        fun of(
            balancesService: BalanceService,
            params: FinancialAccountBalanceListParams,
            response: FinancialAccountBalanceListPageResponse,
        ) = FinancialAccountBalanceListPage(balancesService, params, response)
    }

    class AutoPager(private val firstPage: FinancialAccountBalanceListPage) :
        Sequence<BalanceListResponse> {

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
