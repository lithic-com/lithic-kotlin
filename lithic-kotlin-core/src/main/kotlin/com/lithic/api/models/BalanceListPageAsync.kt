// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.lithic.api.core.checkRequired
import com.lithic.api.services.async.BalanceServiceAsync
import java.util.Objects
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.FlowCollector

/** @see [BalanceServiceAsync.list] */
class BalanceListPageAsync
private constructor(
    private val service: BalanceServiceAsync,
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

    suspend fun getNextPage(): BalanceListPageAsync? = getNextPageParams()?.let { service.list(it) }

    fun autoPager(): AutoPager = AutoPager(this)

    /** The parameters that were used to request this page. */
    fun params(): BalanceListParams = params

    /** The response that this page was parsed from. */
    fun response(): BalanceListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [BalanceListPageAsync].
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

    /** A builder for [BalanceListPageAsync]. */
    class Builder internal constructor() {

        private var service: BalanceServiceAsync? = null
        private var params: BalanceListParams? = null
        private var response: BalanceListPageResponse? = null

        internal fun from(balanceListPageAsync: BalanceListPageAsync) = apply {
            service = balanceListPageAsync.service
            params = balanceListPageAsync.params
            response = balanceListPageAsync.response
        }

        fun service(service: BalanceServiceAsync) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: BalanceListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: BalanceListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [BalanceListPageAsync].
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
        fun build(): BalanceListPageAsync =
            BalanceListPageAsync(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    class AutoPager(private val firstPage: BalanceListPageAsync) : Flow<Balance> {

        override suspend fun collect(collector: FlowCollector<Balance>) {
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

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is BalanceListPageAsync && service == other.service && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, params, response) /* spotless:on */

    override fun toString() =
        "BalanceListPageAsync{service=$service, params=$params, response=$response}"
}
