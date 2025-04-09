// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.lithic.api.services.async.TransactionServiceAsync
import java.util.Objects
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.FlowCollector

/**
 * List card transactions. All amounts are in the smallest unit of their respective currency (e.g.,
 * cents for USD) and inclusive of any acquirer fees.
 */
class TransactionListPageAsync
private constructor(
    private val transactionsService: TransactionServiceAsync,
    private val params: TransactionListParams,
    private val response: TransactionListPageResponse,
) {

    /** Returns the response that this page was parsed from. */
    fun response(): TransactionListPageResponse = response

    /**
     * Delegates to [TransactionListPageResponse], but gracefully handles missing data.
     *
     * @see [TransactionListPageResponse.data]
     */
    fun data(): List<Transaction> = response._data().getNullable("data") ?: emptyList()

    /**
     * Delegates to [TransactionListPageResponse], but gracefully handles missing data.
     *
     * @see [TransactionListPageResponse.hasMore]
     */
    fun hasMore(): Boolean? = response._hasMore().getNullable("has_more")

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is TransactionListPageAsync && transactionsService == other.transactionsService && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(transactionsService, params, response) /* spotless:on */

    override fun toString() =
        "TransactionListPageAsync{transactionsService=$transactionsService, params=$params, response=$response}"

    fun hasNextPage(): Boolean = data().isNotEmpty()

    fun getNextPageParams(): TransactionListParams? {
        if (!hasNextPage()) {
            return null
        }

        return if (params.endingBefore() != null) {
            params.toBuilder().endingBefore(data().first()._token().getNullable("token")).build()
        } else {
            params.toBuilder().startingAfter(data().last()._token().getNullable("token")).build()
        }
    }

    suspend fun getNextPage(): TransactionListPageAsync? {
        return getNextPageParams()?.let { transactionsService.list(it) }
    }

    fun autoPager(): AutoPager = AutoPager(this)

    companion object {

        fun of(
            transactionsService: TransactionServiceAsync,
            params: TransactionListParams,
            response: TransactionListPageResponse,
        ) = TransactionListPageAsync(transactionsService, params, response)
    }

    class AutoPager(private val firstPage: TransactionListPageAsync) : Flow<Transaction> {

        override suspend fun collect(collector: FlowCollector<Transaction>) {
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
