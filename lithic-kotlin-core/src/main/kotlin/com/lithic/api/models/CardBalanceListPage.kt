// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.lithic.api.core.checkRequired
import com.lithic.api.services.blocking.cards.BalanceService
import java.util.Objects

/** @see [BalanceService.list] */
class CardBalanceListPage
private constructor(
    private val service: BalanceService,
    private val params: CardBalanceListParams,
    private val response: CardBalanceListPageResponse,
) {

    /**
     * Delegates to [CardBalanceListPageResponse], but gracefully handles missing data.
     *
     * @see [CardBalanceListPageResponse.data]
     */
    fun data(): List<BalanceListResponse> = response._data().getNullable("data") ?: emptyList()

    /**
     * Delegates to [CardBalanceListPageResponse], but gracefully handles missing data.
     *
     * @see [CardBalanceListPageResponse.hasMore]
     */
    fun hasMore(): Boolean? = response._hasMore().getNullable("has_more")

    fun hasNextPage(): Boolean = data().isNotEmpty()

    fun getNextPageParams(): CardBalanceListParams? = null

    fun getNextPage(): CardBalanceListPage? = getNextPageParams()?.let { service.list(it) }

    fun autoPager(): AutoPager = AutoPager(this)

    /** The parameters that were used to request this page. */
    fun params(): CardBalanceListParams = params

    /** The response that this page was parsed from. */
    fun response(): CardBalanceListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [CardBalanceListPage].
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

    /** A builder for [CardBalanceListPage]. */
    class Builder internal constructor() {

        private var service: BalanceService? = null
        private var params: CardBalanceListParams? = null
        private var response: CardBalanceListPageResponse? = null

        internal fun from(cardBalanceListPage: CardBalanceListPage) = apply {
            service = cardBalanceListPage.service
            params = cardBalanceListPage.params
            response = cardBalanceListPage.response
        }

        fun service(service: BalanceService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: CardBalanceListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: CardBalanceListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [CardBalanceListPage].
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
        fun build(): CardBalanceListPage =
            CardBalanceListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    class AutoPager(private val firstPage: CardBalanceListPage) : Sequence<BalanceListResponse> {

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

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is CardBalanceListPage && service == other.service && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, params, response) /* spotless:on */

    override fun toString() =
        "CardBalanceListPage{service=$service, params=$params, response=$response}"
}
