// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.lithic.api.core.AutoPagerAsync
import com.lithic.api.core.PageAsync
import com.lithic.api.core.checkRequired
import com.lithic.api.services.async.BookTransferServiceAsync
import java.util.Objects

/** @see BookTransferServiceAsync.list */
class BookTransferListPageAsync
private constructor(
    private val service: BookTransferServiceAsync,
    private val params: BookTransferListParams,
    private val response: BookTransferListPageResponse,
) : PageAsync<BookTransferResponse> {

    /**
     * Delegates to [BookTransferListPageResponse], but gracefully handles missing data.
     *
     * @see BookTransferListPageResponse.data
     */
    fun data(): List<BookTransferResponse> = response._data().getNullable("data") ?: emptyList()

    /**
     * Delegates to [BookTransferListPageResponse], but gracefully handles missing data.
     *
     * @see BookTransferListPageResponse.hasMore
     */
    fun hasMore(): Boolean? = response._hasMore().getNullable("has_more")

    override fun items(): List<BookTransferResponse> = data()

    override fun hasNextPage(): Boolean = items().isNotEmpty()

    fun nextPageParams(): BookTransferListParams =
        if (params.endingBefore() != null) {
            params.toBuilder().endingBefore(items().first()._token().getNullable("token")).build()
        } else {
            params.toBuilder().startingAfter(items().last()._token().getNullable("token")).build()
        }

    override suspend fun nextPage(): BookTransferListPageAsync = service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<BookTransferResponse> = AutoPagerAsync.from(this)

    /** The parameters that were used to request this page. */
    fun params(): BookTransferListParams = params

    /** The response that this page was parsed from. */
    fun response(): BookTransferListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [BookTransferListPageAsync].
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

    /** A builder for [BookTransferListPageAsync]. */
    class Builder internal constructor() {

        private var service: BookTransferServiceAsync? = null
        private var params: BookTransferListParams? = null
        private var response: BookTransferListPageResponse? = null

        internal fun from(bookTransferListPageAsync: BookTransferListPageAsync) = apply {
            service = bookTransferListPageAsync.service
            params = bookTransferListPageAsync.params
            response = bookTransferListPageAsync.response
        }

        fun service(service: BookTransferServiceAsync) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: BookTransferListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: BookTransferListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [BookTransferListPageAsync].
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
        fun build(): BookTransferListPageAsync =
            BookTransferListPageAsync(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is BookTransferListPageAsync && service == other.service && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, params, response) /* spotless:on */

    override fun toString() =
        "BookTransferListPageAsync{service=$service, params=$params, response=$response}"
}
