// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.lithic.api.services.blocking.financialAccounts.FinancialTransactionService
import java.util.Objects

/** List the financial transactions for a given financial account. */
class FinancialTransactionListPage
private constructor(
    private val financialTransactionsService: FinancialTransactionService,
    private val params: FinancialTransactionListParams,
    private val response: FinancialTransactionListPageResponse,
) {

    /** Returns the response that this page was parsed from. */
    fun response(): FinancialTransactionListPageResponse = response

    /**
     * Delegates to [FinancialTransactionListPageResponse], but gracefully handles missing data.
     *
     * @see [FinancialTransactionListPageResponse.data]
     */
    fun data(): List<FinancialTransaction> = response._data().getNullable("data") ?: emptyList()

    /**
     * Delegates to [FinancialTransactionListPageResponse], but gracefully handles missing data.
     *
     * @see [FinancialTransactionListPageResponse.hasMore]
     */
    fun hasMore(): Boolean? = response._hasMore().getNullable("has_more")

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is FinancialTransactionListPage && financialTransactionsService == other.financialTransactionsService && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(financialTransactionsService, params, response) /* spotless:on */

    override fun toString() =
        "FinancialTransactionListPage{financialTransactionsService=$financialTransactionsService, params=$params, response=$response}"

    fun hasNextPage(): Boolean = data().isNotEmpty()

    fun getNextPageParams(): FinancialTransactionListParams? = null

    fun getNextPage(): FinancialTransactionListPage? {
        return getNextPageParams()?.let { financialTransactionsService.list(it) }
    }

    fun autoPager(): AutoPager = AutoPager(this)

    companion object {

        fun of(
            financialTransactionsService: FinancialTransactionService,
            params: FinancialTransactionListParams,
            response: FinancialTransactionListPageResponse,
        ) = FinancialTransactionListPage(financialTransactionsService, params, response)
    }

    class AutoPager(private val firstPage: FinancialTransactionListPage) :
        Sequence<FinancialTransaction> {

        override fun iterator(): Iterator<FinancialTransaction> = iterator {
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
