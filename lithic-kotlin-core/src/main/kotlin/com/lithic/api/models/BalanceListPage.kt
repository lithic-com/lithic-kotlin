// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.lithic.api.core.checkRequired
import com.lithic.api.services.blocking.BalanceService
import java.util.Objects

/** @see [BalanceService.list] */
class BalanceListPage
private constructor(
    private val service: BalanceService,
    private val params: BalanceListParams,
    private val response: BalanceListPageResponse,
) {

    /**
     * Delegates to [BalanceListPageResponse], but gracefully handles missing data.
     *
     * @see [BalanceListPageResponse.data]
     */
    fun data(): List<Balance> = response._data().getNullable("data") ?: emptyList()

    /**
     * Delegates to [BalanceListPageResponse], but gracefully handles missing data.
     *
     * @see [BalanceListPageResponse.hasMore]
     */
    fun hasMore(): Boolean? = response._hasMore().getNullable("has_more")

    fun hasNextPage(): Boolean = data().isNotEmpty()

    fun getNextPageParams(): BalanceListParams? = null

    fun getNextPage(): BalanceListPage? = getNextPageParams()?.let { service.list(it) }

    fun autoPager(): AutoPager = AutoPager(this)

    /** The parameters that were used to request this page. */
    fun params(): BalanceListParams = params

    /** The response that this page was parsed from. */
    fun response(): BalanceListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [BalanceListPage].
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

    /** A builder for [BalanceListPage]. */
    class Builder internal constructor() {

        private var service: BalanceService? = null
        private var params: BalanceListParams? = null
        private var response: BalanceListPageResponse? = null

        internal fun from(balanceListPage: BalanceListPage) = apply {
            service = balanceListPage.service
            params = balanceListPage.params
            response = balanceListPage.response
        }

        fun service(service: BalanceService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: BalanceListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: BalanceListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [BalanceListPage].
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
        fun build(): BalanceListPage =
            BalanceListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    class AutoPager(private val firstPage: BalanceListPage) : Sequence<Balance> {

        override fun iterator(): Iterator<Balance> = iterator {
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

        return /* spotless:off */ other is BalanceListPage && service == other.service && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, params, response) /* spotless:on */

    override fun toString() =
        "BalanceListPage{service=$service, params=$params, response=$response}"
}
