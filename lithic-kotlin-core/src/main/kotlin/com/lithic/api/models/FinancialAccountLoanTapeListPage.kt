// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.lithic.api.services.blocking.financialAccounts.LoanTapeService
import java.util.Objects

/** List the loan tapes for a given financial account. */
class FinancialAccountLoanTapeListPage
private constructor(
    private val loanTapesService: LoanTapeService,
    private val params: FinancialAccountLoanTapeListParams,
    private val response: FinancialAccountLoanTapeListPageResponse,
) {

    /** Returns the response that this page was parsed from. */
    fun response(): FinancialAccountLoanTapeListPageResponse = response

    /**
     * Delegates to [FinancialAccountLoanTapeListPageResponse], but gracefully handles missing data.
     *
     * @see [FinancialAccountLoanTapeListPageResponse.data]
     */
    fun data(): List<LoanTape> = response._data().getNullable("data") ?: emptyList()

    /**
     * Delegates to [FinancialAccountLoanTapeListPageResponse], but gracefully handles missing data.
     *
     * @see [FinancialAccountLoanTapeListPageResponse.hasMore]
     */
    fun hasMore(): Boolean? = response._hasMore().getNullable("has_more")

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is FinancialAccountLoanTapeListPage && loanTapesService == other.loanTapesService && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(loanTapesService, params, response) /* spotless:on */

    override fun toString() =
        "FinancialAccountLoanTapeListPage{loanTapesService=$loanTapesService, params=$params, response=$response}"

    fun hasNextPage(): Boolean = data().isNotEmpty()

    fun getNextPageParams(): FinancialAccountLoanTapeListParams? {
        if (!hasNextPage()) {
            return null
        }

        return if (params.endingBefore() != null) {
            params.toBuilder().endingBefore(data().first()._token().getNullable("token")).build()
        } else {
            params.toBuilder().startingAfter(data().last()._token().getNullable("token")).build()
        }
    }

    fun getNextPage(): FinancialAccountLoanTapeListPage? {
        return getNextPageParams()?.let { loanTapesService.list(it) }
    }

    fun autoPager(): AutoPager = AutoPager(this)

    companion object {

        fun of(
            loanTapesService: LoanTapeService,
            params: FinancialAccountLoanTapeListParams,
            response: FinancialAccountLoanTapeListPageResponse,
        ) = FinancialAccountLoanTapeListPage(loanTapesService, params, response)
    }

    class AutoPager(private val firstPage: FinancialAccountLoanTapeListPage) : Sequence<LoanTape> {

        override fun iterator(): Iterator<LoanTape> = iterator {
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
