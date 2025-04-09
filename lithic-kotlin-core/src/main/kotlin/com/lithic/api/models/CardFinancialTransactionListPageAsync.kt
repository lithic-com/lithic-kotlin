// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.lithic.api.services.async.cards.FinancialTransactionServiceAsync
import java.util.Objects
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.FlowCollector

/** List the financial transactions for a given card. */
class CardFinancialTransactionListPageAsync
private constructor(
    private val financialTransactionsService: FinancialTransactionServiceAsync,
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

        return /* spotless:off */ other is CardFinancialTransactionListPageAsync && financialTransactionsService == other.financialTransactionsService && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(financialTransactionsService, params, response) /* spotless:on */

    override fun toString() =
        "CardFinancialTransactionListPageAsync{financialTransactionsService=$financialTransactionsService, params=$params, response=$response}"

    fun hasNextPage(): Boolean = data().isNotEmpty()

    fun getNextPageParams(): CardFinancialTransactionListParams? = null

    suspend fun getNextPage(): CardFinancialTransactionListPageAsync? {
        return getNextPageParams()?.let { financialTransactionsService.list(it) }
    }

    fun autoPager(): AutoPager = AutoPager(this)

    companion object {

        fun of(
            financialTransactionsService: FinancialTransactionServiceAsync,
            params: CardFinancialTransactionListParams,
            response: CardFinancialTransactionListPageResponse,
        ) = CardFinancialTransactionListPageAsync(financialTransactionsService, params, response)
    }

    class AutoPager(private val firstPage: CardFinancialTransactionListPageAsync) :
        Flow<FinancialTransaction> {

        override suspend fun collect(collector: FlowCollector<FinancialTransaction>) {
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
