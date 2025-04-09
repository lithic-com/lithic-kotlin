// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.lithic.api.services.async.BookTransferServiceAsync
import java.util.Objects
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.FlowCollector

/** List book transfers */
class BookTransferListPageAsync
private constructor(
    private val bookTransfersService: BookTransferServiceAsync,
    private val params: BookTransferListParams,
    private val response: BookTransferListPageResponse,
) {

    /** Returns the response that this page was parsed from. */
    fun response(): BookTransferListPageResponse = response

    /**
     * Delegates to [BookTransferListPageResponse], but gracefully handles missing data.
     *
     * @see [BookTransferListPageResponse.data]
     */
    fun data(): List<BookTransferResponse> = response._data().getNullable("data") ?: emptyList()

    /**
     * Delegates to [BookTransferListPageResponse], but gracefully handles missing data.
     *
     * @see [BookTransferListPageResponse.hasMore]
     */
    fun hasMore(): Boolean? = response._hasMore().getNullable("has_more")

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is BookTransferListPageAsync && bookTransfersService == other.bookTransfersService && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(bookTransfersService, params, response) /* spotless:on */

    override fun toString() =
        "BookTransferListPageAsync{bookTransfersService=$bookTransfersService, params=$params, response=$response}"

    fun hasNextPage(): Boolean = data().isNotEmpty()

    fun getNextPageParams(): BookTransferListParams? {
        if (!hasNextPage()) {
            return null
        }

        return if (params.endingBefore() != null) {
            params.toBuilder().endingBefore(data().first()._token().getNullable("token")).build()
        } else {
            params.toBuilder().startingAfter(data().last()._token().getNullable("token")).build()
        }
    }

    suspend fun getNextPage(): BookTransferListPageAsync? {
        return getNextPageParams()?.let { bookTransfersService.list(it) }
    }

    fun autoPager(): AutoPager = AutoPager(this)

    companion object {

        fun of(
            bookTransfersService: BookTransferServiceAsync,
            params: BookTransferListParams,
            response: BookTransferListPageResponse,
        ) = BookTransferListPageAsync(bookTransfersService, params, response)
    }

    class AutoPager(private val firstPage: BookTransferListPageAsync) : Flow<BookTransferResponse> {

        override suspend fun collect(collector: FlowCollector<BookTransferResponse>) {
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
