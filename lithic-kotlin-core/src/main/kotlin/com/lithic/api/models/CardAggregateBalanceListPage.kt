// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.lithic.api.core.checkRequired
import com.lithic.api.services.blocking.cards.AggregateBalanceService
import java.util.Objects

/** @see [AggregateBalanceService.list] */
class CardAggregateBalanceListPage
private constructor(
    private val service: AggregateBalanceService,
    private val params: CardAggregateBalanceListParams,
    private val response: CardAggregateBalanceListPageResponse,
) {

    /**
     * Delegates to [CardAggregateBalanceListPageResponse], but gracefully handles missing data.
     *
     * @see [CardAggregateBalanceListPageResponse.data]
     */
    fun data(): List<AggregateBalanceListResponse> =
        response._data().getNullable("data") ?: emptyList()

    /**
     * Delegates to [CardAggregateBalanceListPageResponse], but gracefully handles missing data.
     *
     * @see [CardAggregateBalanceListPageResponse.hasMore]
     */
    fun hasMore(): Boolean? = response._hasMore().getNullable("has_more")

    fun hasNextPage(): Boolean = data().isNotEmpty()

    fun getNextPageParams(): CardAggregateBalanceListParams? = null

    fun getNextPage(): CardAggregateBalanceListPage? = getNextPageParams()?.let { service.list(it) }

    fun autoPager(): AutoPager = AutoPager(this)

    /** The parameters that were used to request this page. */
    fun params(): CardAggregateBalanceListParams = params

    /** The response that this page was parsed from. */
    fun response(): CardAggregateBalanceListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [CardAggregateBalanceListPage].
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

    /** A builder for [CardAggregateBalanceListPage]. */
    class Builder internal constructor() {

        private var service: AggregateBalanceService? = null
        private var params: CardAggregateBalanceListParams? = null
        private var response: CardAggregateBalanceListPageResponse? = null

        internal fun from(cardAggregateBalanceListPage: CardAggregateBalanceListPage) = apply {
            service = cardAggregateBalanceListPage.service
            params = cardAggregateBalanceListPage.params
            response = cardAggregateBalanceListPage.response
        }

        fun service(service: AggregateBalanceService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: CardAggregateBalanceListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: CardAggregateBalanceListPageResponse) = apply {
            this.response = response
        }

        /**
         * Returns an immutable instance of [CardAggregateBalanceListPage].
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
        fun build(): CardAggregateBalanceListPage =
            CardAggregateBalanceListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    class AutoPager(private val firstPage: CardAggregateBalanceListPage) :
        Sequence<AggregateBalanceListResponse> {

        override fun iterator(): Iterator<AggregateBalanceListResponse> = iterator {
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

        return /* spotless:off */ other is CardAggregateBalanceListPage && service == other.service && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, params, response) /* spotless:on */

    override fun toString() =
        "CardAggregateBalanceListPage{service=$service, params=$params, response=$response}"
}
