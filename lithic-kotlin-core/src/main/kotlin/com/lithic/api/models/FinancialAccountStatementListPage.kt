// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.lithic.api.core.checkRequired
import com.lithic.api.services.blocking.financialAccounts.StatementService
import java.util.Objects

/** @see [StatementService.list] */
class FinancialAccountStatementListPage
private constructor(
    private val service: StatementService,
    private val params: FinancialAccountStatementListParams,
    private val response: Statements,
) {

    /**
     * Delegates to [Statements], but gracefully handles missing data.
     *
     * @see [Statements.data]
     */
    fun data(): List<Statement> = response._data().getNullable("data") ?: emptyList()

    /**
     * Delegates to [Statements], but gracefully handles missing data.
     *
     * @see [Statements.hasMore]
     */
    fun hasMore(): Boolean? = response._hasMore().getNullable("has_more")

    fun hasNextPage(): Boolean = data().isNotEmpty()

    fun getNextPageParams(): FinancialAccountStatementListParams? {
        if (!hasNextPage()) {
            return null
        }

        return if (params.endingBefore() != null) {
            params.toBuilder().endingBefore(data().first()._token().getNullable("token")).build()
        } else {
            params.toBuilder().startingAfter(data().last()._token().getNullable("token")).build()
        }
    }

    fun getNextPage(): FinancialAccountStatementListPage? =
        getNextPageParams()?.let { service.list(it) }

    fun autoPager(): AutoPager = AutoPager(this)

    /** The parameters that were used to request this page. */
    fun params(): FinancialAccountStatementListParams = params

    /** The response that this page was parsed from. */
    fun response(): Statements = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [FinancialAccountStatementListPage].
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

    /** A builder for [FinancialAccountStatementListPage]. */
    class Builder internal constructor() {

        private var service: StatementService? = null
        private var params: FinancialAccountStatementListParams? = null
        private var response: Statements? = null

        internal fun from(financialAccountStatementListPage: FinancialAccountStatementListPage) =
            apply {
                service = financialAccountStatementListPage.service
                params = financialAccountStatementListPage.params
                response = financialAccountStatementListPage.response
            }

        fun service(service: StatementService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: FinancialAccountStatementListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: Statements) = apply { this.response = response }

        /**
         * Returns an immutable instance of [FinancialAccountStatementListPage].
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
        fun build(): FinancialAccountStatementListPage =
            FinancialAccountStatementListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    class AutoPager(private val firstPage: FinancialAccountStatementListPage) :
        Sequence<Statement> {

        override fun iterator(): Iterator<Statement> = iterator {
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

        return /* spotless:off */ other is FinancialAccountStatementListPage && service == other.service && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, params, response) /* spotless:on */

    override fun toString() =
        "FinancialAccountStatementListPage{service=$service, params=$params, response=$response}"
}
