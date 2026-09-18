// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.lithic.api.core.AutoPagerAsync
import com.lithic.api.core.PageAsync
import com.lithic.api.core.checkRequired
import com.lithic.api.services.async.financialAccounts.InstallmentPlanServiceAsync
import java.util.Objects

/** @see InstallmentPlanServiceAsync.list */
class FinancialAccountInstallmentPlanListPageAsync
private constructor(
    private val service: InstallmentPlanServiceAsync,
    private val params: FinancialAccountInstallmentPlanListParams,
    private val response: FinancialAccountInstallmentPlanListPageResponse,
) : PageAsync<InstallmentPlan> {

    /**
     * Delegates to [FinancialAccountInstallmentPlanListPageResponse], but gracefully handles
     * missing data.
     *
     * @see FinancialAccountInstallmentPlanListPageResponse.data
     */
    fun data(): List<InstallmentPlan> = response._data().getNullable("data") ?: emptyList()

    /**
     * Delegates to [FinancialAccountInstallmentPlanListPageResponse], but gracefully handles
     * missing data.
     *
     * @see FinancialAccountInstallmentPlanListPageResponse.hasMore
     */
    fun hasMore(): Boolean? = response._hasMore().getNullable("has_more")

    override fun items(): List<InstallmentPlan> = data()

    override fun hasNextPage(): Boolean = items().isNotEmpty()

    fun nextPageParams(): FinancialAccountInstallmentPlanListParams =
        if (params.endingBefore() != null) {
            params.toBuilder().endingBefore(items().first()._token().getNullable("token")).build()
        } else {
            params.toBuilder().startingAfter(items().last()._token().getNullable("token")).build()
        }

    override suspend fun nextPage(): FinancialAccountInstallmentPlanListPageAsync =
        service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<InstallmentPlan> = AutoPagerAsync.from(this)

    /** The parameters that were used to request this page. */
    fun params(): FinancialAccountInstallmentPlanListParams = params

    /** The response that this page was parsed from. */
    fun response(): FinancialAccountInstallmentPlanListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [FinancialAccountInstallmentPlanListPageAsync].
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

    /** A builder for [FinancialAccountInstallmentPlanListPageAsync]. */
    class Builder internal constructor() {

        private var service: InstallmentPlanServiceAsync? = null
        private var params: FinancialAccountInstallmentPlanListParams? = null
        private var response: FinancialAccountInstallmentPlanListPageResponse? = null

        internal fun from(
            financialAccountInstallmentPlanListPageAsync:
                FinancialAccountInstallmentPlanListPageAsync
        ) = apply {
            service = financialAccountInstallmentPlanListPageAsync.service
            params = financialAccountInstallmentPlanListPageAsync.params
            response = financialAccountInstallmentPlanListPageAsync.response
        }

        fun service(service: InstallmentPlanServiceAsync) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: FinancialAccountInstallmentPlanListParams) = apply {
            this.params = params
        }

        /** The response that this page was parsed from. */
        fun response(response: FinancialAccountInstallmentPlanListPageResponse) = apply {
            this.response = response
        }

        /**
         * Returns an immutable instance of [FinancialAccountInstallmentPlanListPageAsync].
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
        fun build(): FinancialAccountInstallmentPlanListPageAsync =
            FinancialAccountInstallmentPlanListPageAsync(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is FinancialAccountInstallmentPlanListPageAsync &&
            service == other.service &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, params, response)

    override fun toString() =
        "FinancialAccountInstallmentPlanListPageAsync{service=$service, params=$params, response=$response}"
}
