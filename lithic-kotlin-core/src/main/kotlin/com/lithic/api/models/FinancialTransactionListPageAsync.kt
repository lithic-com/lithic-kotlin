// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.lithic.api.core.AutoPagerAsync
import com.lithic.api.core.PageAsync
import com.lithic.api.core.checkRequired
import com.lithic.api.services.async.financialAccounts.FinancialTransactionServiceAsync
import java.util.Objects

/** @see [FinancialTransactionServiceAsync.list] */
class FinancialTransactionListPageAsync
private constructor(
    private val service: FinancialTransactionServiceAsync,
    private val params: FinancialTransactionListParams,
    private val response: FinancialTransactionListPageResponse,
) : PageAsync<FinancialTransaction> {

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

    override fun items(): List<FinancialTransaction> = data()

    override fun hasNextPage(): Boolean = false

    fun nextPageParams(): FinancialTransactionListParams =
        throw IllegalStateException("Cannot construct next page params")

    override suspend fun nextPage(): FinancialTransactionListPageAsync =
        service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<FinancialTransaction> = AutoPagerAsync.from(this)

    /** The parameters that were used to request this page. */
    fun params(): FinancialTransactionListParams = params

    /** The response that this page was parsed from. */
    fun response(): FinancialTransactionListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [FinancialTransactionListPageAsync].
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

    /** A builder for [FinancialTransactionListPageAsync]. */
    class Builder internal constructor() {

        private var service: FinancialTransactionServiceAsync? = null
        private var params: FinancialTransactionListParams? = null
        private var response: FinancialTransactionListPageResponse? = null

        internal fun from(financialTransactionListPageAsync: FinancialTransactionListPageAsync) =
            apply {
                service = financialTransactionListPageAsync.service
                params = financialTransactionListPageAsync.params
                response = financialTransactionListPageAsync.response
            }

        fun service(service: FinancialTransactionServiceAsync) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: FinancialTransactionListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: FinancialTransactionListPageResponse) = apply {
            this.response = response
        }

        /**
         * Returns an immutable instance of [FinancialTransactionListPageAsync].
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
        fun build(): FinancialTransactionListPageAsync =
            FinancialTransactionListPageAsync(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is FinancialTransactionListPageAsync && service == other.service && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, params, response) /* spotless:on */

    override fun toString() =
        "FinancialTransactionListPageAsync{service=$service, params=$params, response=$response}"
}
