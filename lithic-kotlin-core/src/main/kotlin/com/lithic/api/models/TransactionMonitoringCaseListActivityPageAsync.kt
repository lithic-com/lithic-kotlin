// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.lithic.api.core.AutoPagerAsync
import com.lithic.api.core.PageAsync
import com.lithic.api.core.checkRequired
import com.lithic.api.services.async.transactionMonitoring.CaseServiceAsync
import java.util.Objects

/** @see CaseServiceAsync.listActivity */
class TransactionMonitoringCaseListActivityPageAsync
private constructor(
    private val service: CaseServiceAsync,
    private val params: TransactionMonitoringCaseListActivityParams,
    private val response: TransactionMonitoringCaseListActivityPageResponse,
) : PageAsync<CaseActivityEntry> {

    /**
     * Delegates to [TransactionMonitoringCaseListActivityPageResponse], but gracefully handles
     * missing data.
     *
     * @see TransactionMonitoringCaseListActivityPageResponse.data
     */
    fun data(): List<CaseActivityEntry> = response._data().getNullable("data") ?: emptyList()

    /**
     * Delegates to [TransactionMonitoringCaseListActivityPageResponse], but gracefully handles
     * missing data.
     *
     * @see TransactionMonitoringCaseListActivityPageResponse.hasMore
     */
    fun hasMore(): Boolean? = response._hasMore().getNullable("has_more")

    override fun items(): List<CaseActivityEntry> = data()

    override fun hasNextPage(): Boolean = items().isNotEmpty()

    fun nextPageParams(): TransactionMonitoringCaseListActivityParams =
        if (params.endingBefore() != null) {
            params.toBuilder().endingBefore(items().first()._token().getNullable("token")).build()
        } else {
            params.toBuilder().startingAfter(items().last()._token().getNullable("token")).build()
        }

    override suspend fun nextPage(): TransactionMonitoringCaseListActivityPageAsync =
        service.listActivity(nextPageParams())

    fun autoPager(): AutoPagerAsync<CaseActivityEntry> = AutoPagerAsync.from(this)

    /** The parameters that were used to request this page. */
    fun params(): TransactionMonitoringCaseListActivityParams = params

    /** The response that this page was parsed from. */
    fun response(): TransactionMonitoringCaseListActivityPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [TransactionMonitoringCaseListActivityPageAsync].
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

    /** A builder for [TransactionMonitoringCaseListActivityPageAsync]. */
    class Builder internal constructor() {

        private var service: CaseServiceAsync? = null
        private var params: TransactionMonitoringCaseListActivityParams? = null
        private var response: TransactionMonitoringCaseListActivityPageResponse? = null

        internal fun from(
            transactionMonitoringCaseListActivityPageAsync:
                TransactionMonitoringCaseListActivityPageAsync
        ) = apply {
            service = transactionMonitoringCaseListActivityPageAsync.service
            params = transactionMonitoringCaseListActivityPageAsync.params
            response = transactionMonitoringCaseListActivityPageAsync.response
        }

        fun service(service: CaseServiceAsync) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: TransactionMonitoringCaseListActivityParams) = apply {
            this.params = params
        }

        /** The response that this page was parsed from. */
        fun response(response: TransactionMonitoringCaseListActivityPageResponse) = apply {
            this.response = response
        }

        /**
         * Returns an immutable instance of [TransactionMonitoringCaseListActivityPageAsync].
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
        fun build(): TransactionMonitoringCaseListActivityPageAsync =
            TransactionMonitoringCaseListActivityPageAsync(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is TransactionMonitoringCaseListActivityPageAsync &&
            service == other.service &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, params, response)

    override fun toString() =
        "TransactionMonitoringCaseListActivityPageAsync{service=$service, params=$params, response=$response}"
}
