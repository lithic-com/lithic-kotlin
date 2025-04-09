// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.lithic.api.core.checkRequired
import com.lithic.api.services.async.financialAccounts.LoanTapeServiceAsync
import java.util.Objects
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.FlowCollector

/** @see [LoanTapeServiceAsync.list] */
class FinancialAccountLoanTapeListPageAsync
private constructor(
    private val service: LoanTapeServiceAsync,
    private val params: FinancialAccountLoanTapeListParams,
    private val response: FinancialAccountLoanTapeListPageResponse,
) {

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

    suspend fun getNextPage(): FinancialAccountLoanTapeListPageAsync? =
        getNextPageParams()?.let { service.list(it) }

    fun autoPager(): AutoPager = AutoPager(this)

    /** The parameters that were used to request this page. */
    fun params(): FinancialAccountLoanTapeListParams = params

    /** The response that this page was parsed from. */
    fun response(): FinancialAccountLoanTapeListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [FinancialAccountLoanTapeListPageAsync].
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

    /** A builder for [FinancialAccountLoanTapeListPageAsync]. */
    class Builder internal constructor() {

        private var service: LoanTapeServiceAsync? = null
        private var params: FinancialAccountLoanTapeListParams? = null
        private var response: FinancialAccountLoanTapeListPageResponse? = null

        internal fun from(
            financialAccountLoanTapeListPageAsync: FinancialAccountLoanTapeListPageAsync
        ) = apply {
            service = financialAccountLoanTapeListPageAsync.service
            params = financialAccountLoanTapeListPageAsync.params
            response = financialAccountLoanTapeListPageAsync.response
        }

        fun service(service: LoanTapeServiceAsync) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: FinancialAccountLoanTapeListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: FinancialAccountLoanTapeListPageResponse) = apply {
            this.response = response
        }

        /**
         * Returns an immutable instance of [FinancialAccountLoanTapeListPageAsync].
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
        fun build(): FinancialAccountLoanTapeListPageAsync =
            FinancialAccountLoanTapeListPageAsync(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    class AutoPager(private val firstPage: FinancialAccountLoanTapeListPageAsync) : Flow<LoanTape> {

        override suspend fun collect(collector: FlowCollector<LoanTape>) {
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

        return /* spotless:off */ other is FinancialAccountLoanTapeListPageAsync && service == other.service && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, params, response) /* spotless:on */

    override fun toString() =
        "FinancialAccountLoanTapeListPageAsync{service=$service, params=$params, response=$response}"
}
