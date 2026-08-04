// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.lithic.api.core.AutoPagerAsync
import com.lithic.api.core.PageAsync
import com.lithic.api.core.checkRequired
import com.lithic.api.services.async.cards.BalanceServiceAsync
import java.util.Objects

/** @see BalanceServiceAsync.list */
class CardBalanceListPageAsync
private constructor(
    private val service: BalanceServiceAsync,
    private val params: CardBalanceListParams,
    private val response: CardBalanceListPageResponse,
) : PageAsync<FinancialAccountBalance> {

    /**
     * Delegates to [CardBalanceListPageResponse], but gracefully handles missing data.
     *
     * @see CardBalanceListPageResponse.data
     */
    fun data(): List<FinancialAccountBalance> = response._data().getNullable("data") ?: emptyList()

    /**
     * Delegates to [CardBalanceListPageResponse], but gracefully handles missing data.
     *
     * @see CardBalanceListPageResponse.hasMore
     */
    fun hasMore(): Boolean? = response._hasMore().getNullable("has_more")

    override fun items(): List<FinancialAccountBalance> = data()

    override fun hasNextPage(): Boolean = false

    fun nextPageParams(): CardBalanceListParams =
        throw IllegalStateException("Cannot construct next page params")

    override suspend fun nextPage(): CardBalanceListPageAsync = service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<FinancialAccountBalance> = AutoPagerAsync.from(this)

    /** The parameters that were used to request this page. */
    fun params(): CardBalanceListParams = params

    /** The response that this page was parsed from. */
    fun response(): CardBalanceListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [CardBalanceListPageAsync].
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

    /** A builder for [CardBalanceListPageAsync]. */
    class Builder internal constructor() {

        private var service: BalanceServiceAsync? = null
        private var params: CardBalanceListParams? = null
        private var response: CardBalanceListPageResponse? = null

        internal fun from(cardBalanceListPageAsync: CardBalanceListPageAsync) = apply {
            service = cardBalanceListPageAsync.service
            params = cardBalanceListPageAsync.params
            response = cardBalanceListPageAsync.response
        }

        fun service(service: BalanceServiceAsync) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: CardBalanceListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: CardBalanceListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [CardBalanceListPageAsync].
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
        fun build(): CardBalanceListPageAsync =
            CardBalanceListPageAsync(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is CardBalanceListPageAsync &&
            service == other.service &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, params, response)

    override fun toString() =
        "CardBalanceListPageAsync{service=$service, params=$params, response=$response}"
}
