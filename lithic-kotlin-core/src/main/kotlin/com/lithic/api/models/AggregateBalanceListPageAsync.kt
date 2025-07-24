// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.lithic.api.core.AutoPagerAsync
import com.lithic.api.core.PageAsync
import com.lithic.api.core.checkRequired
import com.lithic.api.services.async.AggregateBalanceServiceAsync
import java.util.Objects

/** @see AggregateBalanceServiceAsync.list */
class AggregateBalanceListPageAsync
private constructor(
    private val service: AggregateBalanceServiceAsync,
    private val params: AggregateBalanceListParams,
    private val response: AggregateBalanceListPageResponse,
) : PageAsync<AggregateBalance> {

    /**
     * Delegates to [AggregateBalanceListPageResponse], but gracefully handles missing data.
     *
     * @see AggregateBalanceListPageResponse.data
     */
    fun data(): List<AggregateBalance> = response._data().getNullable("data") ?: emptyList()

    /**
     * Delegates to [AggregateBalanceListPageResponse], but gracefully handles missing data.
     *
     * @see AggregateBalanceListPageResponse.hasMore
     */
    fun hasMore(): Boolean? = response._hasMore().getNullable("has_more")

    override fun items(): List<AggregateBalance> = data()

    override fun hasNextPage(): Boolean = false

    fun nextPageParams(): AggregateBalanceListParams =
        throw IllegalStateException("Cannot construct next page params")

    override suspend fun nextPage(): AggregateBalanceListPageAsync = service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<AggregateBalance> = AutoPagerAsync.from(this)

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
