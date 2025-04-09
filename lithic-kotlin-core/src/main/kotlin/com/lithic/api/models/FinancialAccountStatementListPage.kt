// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.lithic.api.services.blocking.financialAccounts.StatementService
import java.util.Objects

/** List the statements for a given financial account. */
class FinancialAccountStatementListPage
private constructor(
    private val statementsService: StatementService,
    private val params: FinancialAccountStatementListParams,
    private val response: Statements,
) {

    /** Returns the response that this page was parsed from. */
    fun response(): Statements = response

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

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is FinancialAccountStatementListPage && statementsService == other.statementsService && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(statementsService, params, response) /* spotless:on */

    override fun toString() =
        "FinancialAccountStatementListPage{statementsService=$statementsService, params=$params, response=$response}"

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

    fun getNextPage(): FinancialAccountStatementListPage? {
        return getNextPageParams()?.let { statementsService.list(it) }
    }

    fun autoPager(): AutoPager = AutoPager(this)

    companion object {

        fun of(
            statementsService: StatementService,
            params: FinancialAccountStatementListParams,
            response: Statements,
        ) = FinancialAccountStatementListPage(statementsService, params, response)
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
}
