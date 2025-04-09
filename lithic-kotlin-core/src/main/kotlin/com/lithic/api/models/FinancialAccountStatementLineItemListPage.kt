// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.lithic.api.services.blocking.financialAccounts.statements.LineItemService
import java.util.Objects

/** List the line items for a given statement within a given financial account. */
class FinancialAccountStatementLineItemListPage
private constructor(
    private val lineItemsService: LineItemService,
    private val params: FinancialAccountStatementLineItemListParams,
    private val response: StatementLineItems,
) {

    /** Returns the response that this page was parsed from. */
    fun response(): StatementLineItems = response

    /**
     * Delegates to [StatementLineItems], but gracefully handles missing data.
     *
     * @see [StatementLineItems.data]
     */
    fun data(): List<StatementLineItems.StatementLineItemResponse> =
        response._data().getNullable("data") ?: emptyList()

    /**
     * Delegates to [StatementLineItems], but gracefully handles missing data.
     *
     * @see [StatementLineItems.hasMore]
     */
    fun hasMore(): Boolean? = response._hasMore().getNullable("has_more")

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is FinancialAccountStatementLineItemListPage && lineItemsService == other.lineItemsService && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(lineItemsService, params, response) /* spotless:on */

    override fun toString() =
        "FinancialAccountStatementLineItemListPage{lineItemsService=$lineItemsService, params=$params, response=$response}"

    fun hasNextPage(): Boolean = data().isNotEmpty()

    fun getNextPageParams(): FinancialAccountStatementLineItemListParams? {
        if (!hasNextPage()) {
            return null
        }

        return if (params.endingBefore() != null) {
            params.toBuilder().endingBefore(data().first()._token().getNullable("token")).build()
        } else {
            params.toBuilder().startingAfter(data().last()._token().getNullable("token")).build()
        }
    }

    fun getNextPage(): FinancialAccountStatementLineItemListPage? {
        return getNextPageParams()?.let { lineItemsService.list(it) }
    }

    fun autoPager(): AutoPager = AutoPager(this)

    companion object {

        fun of(
            lineItemsService: LineItemService,
            params: FinancialAccountStatementLineItemListParams,
            response: StatementLineItems,
        ) = FinancialAccountStatementLineItemListPage(lineItemsService, params, response)
    }

    class AutoPager(private val firstPage: FinancialAccountStatementLineItemListPage) :
        Sequence<StatementLineItems.StatementLineItemResponse> {

        override fun iterator(): Iterator<StatementLineItems.StatementLineItemResponse> = iterator {
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
