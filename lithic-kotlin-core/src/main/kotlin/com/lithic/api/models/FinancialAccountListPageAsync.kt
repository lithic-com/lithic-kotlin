// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.lithic.api.core.AutoPagerAsync
import com.lithic.api.core.PageAsync
import com.lithic.api.core.checkRequired
import com.lithic.api.services.async.FinancialAccountServiceAsync
import java.util.Objects

/** @see FinancialAccountServiceAsync.list */
class FinancialAccountListPageAsync
private constructor(
    private val service: FinancialAccountServiceAsync,
    private val params: FinancialAccountListParams,
    private val response: FinancialAccountListPageResponse,
) : PageAsync<FinancialAccount> {

    /**
     * Delegates to [FinancialAccountListPageResponse], but gracefully handles missing data.
     *
     * @see FinancialAccountListPageResponse.data
     */
    fun data(): List<FinancialAccount> = response._data().getNullable("data") ?: emptyList()

    /**
     * Delegates to [FinancialAccountListPageResponse], but gracefully handles missing data.
     *
     * @see FinancialAccountListPageResponse.hasMore
     */
    fun hasMore(): Boolean? = response._hasMore().getNullable("has_more")

    override fun items(): List<FinancialAccount> = data()

    override fun hasNextPage(): Boolean = false

    fun nextPageParams(): FinancialAccountListParams =
        throw IllegalStateException("Cannot construct next page params")

    override suspend fun nextPage(): FinancialAccountListPageAsync = service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<FinancialAccount> = AutoPagerAsync.from(this)

    /** The parameters that were used to request this page. */
    fun params(): FinancialAccountListParams = params

    /** The response that this page was parsed from. */
    fun response(): FinancialAccountListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [FinancialAccountListPageAsync].
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

    /** A builder for [FinancialAccountListPageAsync]. */
    class Builder internal constructor() {

        private var service: FinancialAccountServiceAsync? = null
        private var params: FinancialAccountListParams? = null
        private var response: FinancialAccountListPageResponse? = null

        internal fun from(financialAccountListPageAsync: FinancialAccountListPageAsync) = apply {
            service = financialAccountListPageAsync.service
            params = financialAccountListPageAsync.params
            response = financialAccountListPageAsync.response
        }

        fun service(service: FinancialAccountServiceAsync) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: FinancialAccountListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: FinancialAccountListPageResponse) = apply {
            this.response = response
        }

        /**
         * Returns an immutable instance of [FinancialAccountListPageAsync].
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
        fun build(): FinancialAccountListPageAsync =
            FinancialAccountListPageAsync(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is FinancialAccountListPageAsync &&
            service == other.service &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, params, response)

    override fun toString() =
        "FinancialAccountListPageAsync{service=$service, params=$params, response=$response}"
}
