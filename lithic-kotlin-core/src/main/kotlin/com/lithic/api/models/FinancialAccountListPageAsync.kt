// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.lithic.api.services.async.FinancialAccountServiceAsync
import java.util.Objects
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.FlowCollector

/** Retrieve information on your financial accounts including routing and account number. */
class FinancialAccountListPageAsync
private constructor(
    private val financialAccountsService: FinancialAccountServiceAsync,
    private val params: FinancialAccountListParams,
    private val response: FinancialAccountListPageResponse,
) {

    /** Returns the response that this page was parsed from. */
    fun response(): FinancialAccountListPageResponse = response

    /**
     * Delegates to [FinancialAccountListPageResponse], but gracefully handles missing data.
     *
     * @see [FinancialAccountListPageResponse.data]
     */
    fun data(): List<FinancialAccount> = response._data().getNullable("data") ?: emptyList()

    /**
     * Delegates to [FinancialAccountListPageResponse], but gracefully handles missing data.
     *
     * @see [FinancialAccountListPageResponse.hasMore]
     */
    fun hasMore(): Boolean? = response._hasMore().getNullable("has_more")

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is FinancialAccountListPageAsync && financialAccountsService == other.financialAccountsService && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(financialAccountsService, params, response) /* spotless:on */

    override fun toString() =
        "FinancialAccountListPageAsync{financialAccountsService=$financialAccountsService, params=$params, response=$response}"

    fun hasNextPage(): Boolean = data().isNotEmpty()

    fun getNextPageParams(): FinancialAccountListParams? = null

    suspend fun getNextPage(): FinancialAccountListPageAsync? {
        return getNextPageParams()?.let { financialAccountsService.list(it) }
    }

    fun autoPager(): AutoPager = AutoPager(this)

    companion object {

        fun of(
            financialAccountsService: FinancialAccountServiceAsync,
            params: FinancialAccountListParams,
            response: FinancialAccountListPageResponse,
        ) = FinancialAccountListPageAsync(financialAccountsService, params, response)
    }

    class AutoPager(private val firstPage: FinancialAccountListPageAsync) : Flow<FinancialAccount> {

        override suspend fun collect(collector: FlowCollector<FinancialAccount>) {
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
