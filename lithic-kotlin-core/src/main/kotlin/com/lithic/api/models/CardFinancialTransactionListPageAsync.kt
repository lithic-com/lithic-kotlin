// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.lithic.api.core.AutoPagerAsync
import com.lithic.api.core.PageAsync
import com.lithic.api.core.checkRequired
import com.lithic.api.services.async.cards.FinancialTransactionServiceAsync
import java.util.Objects

/** @see [FinancialTransactionServiceAsync.list] */
class CardFinancialTransactionListPageAsync
private constructor(
    private val service: FinancialTransactionServiceAsync,
    private val params: CardFinancialTransactionListParams,
    private val response: CardFinancialTransactionListPageResponse,
) : PageAsync<FinancialTransaction> {

    /**
     * Delegates to [CardFinancialTransactionListPageResponse], but gracefully handles missing data.
     *
     * @see [CardFinancialTransactionListPageResponse.data]
     */
    fun data(): List<FinancialTransaction> = response._data().getNullable("data") ?: emptyList()

    /**
     * Delegates to [CardFinancialTransactionListPageResponse], but gracefully handles missing data.
     *
     * @see [CardFinancialTransactionListPageResponse.hasMore]
     */
    fun hasMore(): Boolean? = response._hasMore().getNullable("has_more")

    override fun items(): List<FinancialTransaction> = data()

    override fun hasNextPage(): Boolean = false

    fun nextPageParams(): CardFinancialTransactionListParams =
        throw IllegalStateException("Cannot construct next page params")

    override suspend fun nextPage(): CardFinancialTransactionListPageAsync =
        service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<FinancialTransaction> = AutoPagerAsync.from(this)

    /** The parameters that were used to request this page. */
    fun params(): CardFinancialTransactionListParams = params

    /** The response that this page was parsed from. */
    fun response(): CardFinancialTransactionListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [CardFinancialTransactionListPageAsync].
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

    /** A builder for [CardFinancialTransactionListPageAsync]. */
    class Builder internal constructor() {

        private var service: FinancialTransactionServiceAsync? = null
        private var params: CardFinancialTransactionListParams? = null
        private var response: CardFinancialTransactionListPageResponse? = null

        internal fun from(
            cardFinancialTransactionListPageAsync: CardFinancialTransactionListPageAsync
        ) = apply {
            service = cardFinancialTransactionListPageAsync.service
            params = cardFinancialTransactionListPageAsync.params
            response = cardFinancialTransactionListPageAsync.response
        }

        fun service(service: FinancialTransactionServiceAsync) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: CardFinancialTransactionListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: CardFinancialTransactionListPageResponse) = apply {
            this.response = response
        }

        /**
         * Returns an immutable instance of [CardFinancialTransactionListPageAsync].
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
        fun build(): CardFinancialTransactionListPageAsync =
            CardFinancialTransactionListPageAsync(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is CardFinancialTransactionListPageAsync && service == other.service && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, params, response) /* spotless:on */

    override fun toString() =
        "CardFinancialTransactionListPageAsync{service=$service, params=$params, response=$response}"
}
