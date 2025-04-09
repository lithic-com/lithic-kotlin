// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.lithic.api.services.blocking.cards.FinancialTransactionService
import java.util.Objects

/** List the financial transactions for a given card. */
class CardFinancialTransactionListPage
private constructor(
    private val financialTransactionsService: FinancialTransactionService,
    private val params: CardFinancialTransactionListParams,
    private val response: CardFinancialTransactionListPageResponse,
) {

    /** Returns the response that this page was parsed from. */
    fun response(): CardFinancialTransactionListPageResponse = response

    /**
     * Delegates to [CardFinancialTransactionListPageResponse], but gracefully handles missing data.
     *
     * @see [CardFinancialTransactionListPageResponse.data]
     */
    fun data(): List<FinancialTransaction> = response._data().getNullable("data") ?: emptyList()

    /**
     * Delegates to [CardFinancialTransactionListPageResponse], but gracefully handles missing data.
     *
     * @see [CardFinancialTransactionListPageResponse.hasMore]
     */
    fun hasMore(): Boolean? = response._hasMore().getNullable("has_more")

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is CardFinancialTransactionListPage && financialTransactionsService == other.financialTransactionsService && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(financialTransactionsService, params, response) /* spotless:on */

    override fun toString() =
        "CardFinancialTransactionListPage{financialTransactionsService=$financialTransactionsService, params=$params, response=$response}"

    fun hasNextPage(): Boolean = data().isNotEmpty()

    fun getNextPageParams(): CardFinancialTransactionListParams? = null

    fun getNextPage(): CardFinancialTransactionListPage? {
        return getNextPageParams()?.let { financialTransactionsService.list(it) }
    }

    fun autoPager(): AutoPager = AutoPager(this)

    companion object {

        fun of(
            financialTransactionsService: FinancialTransactionService,
            params: CardFinancialTransactionListParams,
            response: CardFinancialTransactionListPageResponse,
        ) = CardFinancialTransactionListPage(financialTransactionsService, params, response)
    }

    class AutoPager(private val firstPage: CardFinancialTransactionListPage) :
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
