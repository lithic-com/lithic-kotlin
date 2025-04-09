// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.lithic.api.core.checkRequired
import com.lithic.api.services.async.AggregateBalanceServiceAsync
import java.util.Objects
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.FlowCollector

/** @see [AggregateBalanceServiceAsync.list] */
class AggregateBalanceListPageAsync
private constructor(
    private val service: AggregateBalanceServiceAsync,
    private val params: AggregateBalanceListParams,
    private val response: AggregateBalanceListPageResponse,
) {

    /**
     * Delegates to [AggregateBalanceListPageResponse], but gracefully handles missing data.
     *
     * @see [AggregateBalanceListPageResponse.data]
     */
    fun data(): List<AggregateBalance> = response._data().getNullable("data") ?: emptyList()

    /**
     * Delegates to [AggregateBalanceListPageResponse], but gracefully handles missing data.
     *
     * @see [AggregateBalanceListPageResponse.hasMore]
     */
    fun hasMore(): Boolean? = response._hasMore().getNullable("has_more")

    fun hasNextPage(): Boolean = data().isNotEmpty()

    fun getNextPageParams(): AggregateBalanceListParams? = null

    suspend fun getNextPage(): AggregateBalanceListPageAsync? =
        getNextPageParams()?.let { service.list(it) }

    fun autoPager(): AutoPager = AutoPager(this)

    /** The parameters that were used to request this page. */
    fun params(): AggregateBalanceListParams = params

    /** The response that this page was parsed from. */
    fun response(): AggregateBalanceListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [AggregateBalanceListPageAsync].
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

    /** A builder for [AggregateBalanceListPageAsync]. */
    class Builder internal constructor() {

        private var service: AggregateBalanceServiceAsync? = null
        private var params: AggregateBalanceListParams? = null
        private var response: AggregateBalanceListPageResponse? = null

        internal fun from(aggregateBalanceListPageAsync: AggregateBalanceListPageAsync) = apply {
            service = aggregateBalanceListPageAsync.service
            params = aggregateBalanceListPageAsync.params
            response = aggregateBalanceListPageAsync.response
        }

        fun service(service: AggregateBalanceServiceAsync) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: AggregateBalanceListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: AggregateBalanceListPageResponse) = apply {
            this.response = response
        }

        /**
         * Returns an immutable instance of [AggregateBalanceListPageAsync].
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
        fun build(): AggregateBalanceListPageAsync =
            AggregateBalanceListPageAsync(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    class AutoPager(private val firstPage: AggregateBalanceListPageAsync) : Flow<AggregateBalance> {

        override suspend fun collect(collector: FlowCollector<AggregateBalance>) {
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

        return /* spotless:off */ other is AggregateBalanceListPageAsync && service == other.service && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, params, response) /* spotless:on */

    override fun toString() =
        "AggregateBalanceListPageAsync{service=$service, params=$params, response=$response}"
}
