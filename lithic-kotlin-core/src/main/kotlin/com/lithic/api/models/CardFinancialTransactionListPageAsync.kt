// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.lithic.api.core.checkRequired
import com.lithic.api.services.async.cards.FinancialTransactionServiceAsync
import java.util.Objects
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.FlowCollector

/** @see [FinancialTransactionServiceAsync.list] */
class CardFinancialTransactionListPageAsync
private constructor(
    private val service: FinancialTransactionServiceAsync,
    private val params: CardFinancialTransactionListParams,
    private val response: CardFinancialTransactionListPageResponse,
) {

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

    fun hasNextPage(): Boolean = data().isNotEmpty()

    fun getNextPageParams(): CardFinancialTransactionListParams? = null

    suspend fun getNextPage(): CardFinancialTransactionListPageAsync? =
        getNextPageParams()?.let { service.list(it) }

    fun autoPager(): AutoPager = AutoPager(this)

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

    class AutoPager(private val firstPage: CardFinancialTransactionListPageAsync) :
        Flow<FinancialTransaction> {

        override suspend fun collect(collector: FlowCollector<FinancialTransaction>) {
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

        return /* spotless:off */ other is CardFinancialTransactionListPageAsync && service == other.service && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, params, response) /* spotless:on */

    override fun toString() =
        "CardFinancialTransactionListPageAsync{service=$service, params=$params, response=$response}"
}
