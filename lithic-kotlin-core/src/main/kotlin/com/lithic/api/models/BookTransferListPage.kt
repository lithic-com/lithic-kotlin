// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.lithic.api.core.checkRequired
import com.lithic.api.services.blocking.BookTransferService
import java.util.Objects

/** @see [BookTransferService.list] */
class BookTransferListPage
private constructor(
    private val service: BookTransferService,
    private val params: BookTransferListParams,
    private val response: BookTransferListPageResponse,
) {

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

    fun getNextPage(): BookTransferListPage? = getNextPageParams()?.let { service.list(it) }

    fun autoPager(): AutoPager = AutoPager(this)

    /** The parameters that were used to request this page. */
    fun params(): BookTransferListParams = params

    /** The response that this page was parsed from. */
    fun response(): BookTransferListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [BookTransferListPage].
         *
         * The following fields are required:
         * ```kotlin
         * .service()
         * .params()
         * .response()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [BookTransferListPage]. */
    class Builder internal constructor() {

        private var service: BookTransferService? = null
        private var params: BookTransferListParams? = null
        private var response: BookTransferListPageResponse? = null

        internal fun from(bookTransferListPage: BookTransferListPage) = apply {
            service = bookTransferListPage.service
            params = bookTransferListPage.params
            response = bookTransferListPage.response
        }

        fun service(service: BookTransferService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: BookTransferListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: BookTransferListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [BookTransferListPage].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```kotlin
         * .service()
         * .params()
         * .response()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): BookTransferListPage =
            BookTransferListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    class AutoPager(private val firstPage: BookTransferListPage) : Sequence<BookTransferResponse> {

        override fun iterator(): Iterator<BookTransferResponse> = iterator {
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

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is BookTransferListPage && service == other.service && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, params, response) /* spotless:on */

    override fun toString() =
        "BookTransferListPage{service=$service, params=$params, response=$response}"
}
