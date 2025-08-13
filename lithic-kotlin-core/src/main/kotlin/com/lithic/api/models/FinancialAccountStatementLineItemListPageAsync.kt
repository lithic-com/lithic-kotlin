// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.lithic.api.core.AutoPagerAsync
import com.lithic.api.core.PageAsync
import com.lithic.api.core.checkRequired
import com.lithic.api.services.async.financialAccounts.statements.LineItemServiceAsync
import java.util.Objects

/** @see LineItemServiceAsync.list */
class FinancialAccountStatementLineItemListPageAsync
private constructor(
    private val service: LineItemServiceAsync,
    private val params: FinancialAccountStatementLineItemListParams,
    private val response: StatementLineItems,
) : PageAsync<StatementLineItems.StatementLineItemResponse> {

    /**
     * Delegates to [StatementLineItems], but gracefully handles missing data.
     *
     * @see StatementLineItems.data
     */
    fun data(): List<StatementLineItems.StatementLineItemResponse> =
        response._data().getNullable("data") ?: emptyList()

    /**
     * Delegates to [StatementLineItems], but gracefully handles missing data.
     *
     * @see StatementLineItems.hasMore
     */
    fun hasMore(): Boolean? = response._hasMore().getNullable("has_more")

    override fun items(): List<StatementLineItems.StatementLineItemResponse> = data()

    override fun hasNextPage(): Boolean = items().isNotEmpty()

    fun nextPageParams(): FinancialAccountStatementLineItemListParams =
        if (params.endingBefore() != null) {
            params.toBuilder().endingBefore(items().first()._token().getNullable("token")).build()
        } else {
            params.toBuilder().startingAfter(items().last()._token().getNullable("token")).build()
        }

    override suspend fun nextPage(): FinancialAccountStatementLineItemListPageAsync =
        service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<StatementLineItems.StatementLineItemResponse> =
        AutoPagerAsync.from(this)

    /** The parameters that were used to request this page. */
    fun params(): FinancialAccountStatementLineItemListParams = params

    /** The response that this page was parsed from. */
    fun response(): StatementLineItems = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [FinancialAccountStatementLineItemListPageAsync].
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

    /** A builder for [FinancialAccountStatementLineItemListPageAsync]. */
    class Builder internal constructor() {

        private var service: LineItemServiceAsync? = null
        private var params: FinancialAccountStatementLineItemListParams? = null
        private var response: StatementLineItems? = null

        internal fun from(
            financialAccountStatementLineItemListPageAsync:
                FinancialAccountStatementLineItemListPageAsync
        ) = apply {
            service = financialAccountStatementLineItemListPageAsync.service
            params = financialAccountStatementLineItemListPageAsync.params
            response = financialAccountStatementLineItemListPageAsync.response
        }

        fun service(service: LineItemServiceAsync) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: FinancialAccountStatementLineItemListParams) = apply {
            this.params = params
        }

        /** The response that this page was parsed from. */
        fun response(response: StatementLineItems) = apply { this.response = response }

        /**
         * Returns an immutable instance of [FinancialAccountStatementLineItemListPageAsync].
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
        fun build(): FinancialAccountStatementLineItemListPageAsync =
            FinancialAccountStatementLineItemListPageAsync(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is FinancialAccountStatementLineItemListPageAsync &&
            service == other.service &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, params, response)

    override fun toString() =
        "FinancialAccountStatementLineItemListPageAsync{service=$service, params=$params, response=$response}"
}
