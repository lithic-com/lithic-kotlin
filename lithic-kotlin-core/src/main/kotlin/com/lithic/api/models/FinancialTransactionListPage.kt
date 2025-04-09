// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.lithic.api.core.checkRequired
import com.lithic.api.services.blocking.financialAccounts.FinancialTransactionService
import java.util.Objects

/** @see [FinancialTransactionService.list] */
class FinancialTransactionListPage
private constructor(
    private val service: FinancialTransactionService,
    private val params: FinancialTransactionListParams,
    private val response: FinancialTransactionListPageResponse,
) {

    /**
     * Delegates to [FinancialTransactionListPageResponse], but gracefully handles missing data.
     *
     * @see [FinancialTransactionListPageResponse.data]
     */
    fun data(): List<FinancialTransaction> = response._data().getNullable("data") ?: emptyList()

    /**
     * Delegates to [FinancialTransactionListPageResponse], but gracefully handles missing data.
     *
     * @see [FinancialTransactionListPageResponse.hasMore]
     */
    fun hasMore(): Boolean? = response._hasMore().getNullable("has_more")

    fun hasNextPage(): Boolean = data().isNotEmpty()

    fun getNextPageParams(): FinancialTransactionListParams? = null

    fun getNextPage(): FinancialTransactionListPage? = getNextPageParams()?.let { service.list(it) }

    fun autoPager(): AutoPager = AutoPager(this)

    /** The parameters that were used to request this page. */
    fun params(): FinancialTransactionListParams = params

    /** The response that this page was parsed from. */
    fun response(): FinancialTransactionListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [FinancialTransactionListPage].
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

    /** A builder for [FinancialTransactionListPage]. */
    class Builder internal constructor() {

        private var service: FinancialTransactionService? = null
        private var params: FinancialTransactionListParams? = null
        private var response: FinancialTransactionListPageResponse? = null

        internal fun from(financialTransactionListPage: FinancialTransactionListPage) = apply {
            service = financialTransactionListPage.service
            params = financialTransactionListPage.params
            response = financialTransactionListPage.response
        }

        fun service(service: FinancialTransactionService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: FinancialTransactionListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: FinancialTransactionListPageResponse) = apply {
            this.response = response
        }

        /**
         * Returns an immutable instance of [FinancialTransactionListPage].
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
        fun build(): FinancialTransactionListPage =
            FinancialTransactionListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    class AutoPager(private val firstPage: FinancialTransactionListPage) :
        Sequence<FinancialTransaction> {

        override fun iterator(): Iterator<FinancialTransaction> = iterator {
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

        return /* spotless:off */ other is FinancialTransactionListPage && service == other.service && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, params, response) /* spotless:on */

    override fun toString() =
        "FinancialTransactionListPage{service=$service, params=$params, response=$response}"
}
