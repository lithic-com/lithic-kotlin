// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.lithic.api.core.AutoPagerAsync
import com.lithic.api.core.PageAsync
import com.lithic.api.core.checkRequired
import com.lithic.api.services.async.financialAccounts.installmentPlans.StatementServiceAsync
import java.util.Objects

/** @see StatementServiceAsync.list */
class FinancialAccountInstallmentPlanStatementListPageAsync
private constructor(
    private val service: StatementServiceAsync,
    private val params: FinancialAccountInstallmentPlanStatementListParams,
    private val response: FinancialAccountInstallmentPlanStatementListPageResponse,
) : PageAsync<InstallmentPlanStatement> {

    /**
     * Delegates to [FinancialAccountInstallmentPlanStatementListPageResponse], but gracefully
     * handles missing data.
     *
     * @see FinancialAccountInstallmentPlanStatementListPageResponse.data
     */
    fun data(): List<InstallmentPlanStatement> = response._data().getNullable("data") ?: emptyList()

    /**
     * Delegates to [FinancialAccountInstallmentPlanStatementListPageResponse], but gracefully
     * handles missing data.
     *
     * @see FinancialAccountInstallmentPlanStatementListPageResponse.hasMore
     */
    fun hasMore(): Boolean? = response._hasMore().getNullable("has_more")

    override fun items(): List<InstallmentPlanStatement> = data()

    override fun hasNextPage(): Boolean = items().isNotEmpty()

    fun nextPageParams(): FinancialAccountInstallmentPlanStatementListParams =
        if (params.endingBefore() != null) {
            params.toBuilder().endingBefore(items().first()._token().getNullable("token")).build()
        } else {
            params.toBuilder().startingAfter(items().last()._token().getNullable("token")).build()
        }

    override suspend fun nextPage(): FinancialAccountInstallmentPlanStatementListPageAsync =
        service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<InstallmentPlanStatement> = AutoPagerAsync.from(this)

    /** The parameters that were used to request this page. */
    fun params(): FinancialAccountInstallmentPlanStatementListParams = params

    /** The response that this page was parsed from. */
    fun response(): FinancialAccountInstallmentPlanStatementListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [FinancialAccountInstallmentPlanStatementListPageAsync].
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

    /** A builder for [FinancialAccountInstallmentPlanStatementListPageAsync]. */
    class Builder internal constructor() {

        private var service: StatementServiceAsync? = null
        private var params: FinancialAccountInstallmentPlanStatementListParams? = null
        private var response: FinancialAccountInstallmentPlanStatementListPageResponse? = null

        internal fun from(
            financialAccountInstallmentPlanStatementListPageAsync:
                FinancialAccountInstallmentPlanStatementListPageAsync
        ) = apply {
            service = financialAccountInstallmentPlanStatementListPageAsync.service
            params = financialAccountInstallmentPlanStatementListPageAsync.params
            response = financialAccountInstallmentPlanStatementListPageAsync.response
        }

        fun service(service: StatementServiceAsync) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: FinancialAccountInstallmentPlanStatementListParams) = apply {
            this.params = params
        }

        /** The response that this page was parsed from. */
        fun response(response: FinancialAccountInstallmentPlanStatementListPageResponse) = apply {
            this.response = response
        }

        /**
         * Returns an immutable instance of [FinancialAccountInstallmentPlanStatementListPageAsync].
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
        fun build(): FinancialAccountInstallmentPlanStatementListPageAsync =
            FinancialAccountInstallmentPlanStatementListPageAsync(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is FinancialAccountInstallmentPlanStatementListPageAsync &&
            service == other.service &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, params, response)

    override fun toString() =
        "FinancialAccountInstallmentPlanStatementListPageAsync{service=$service, params=$params, response=$response}"
}
