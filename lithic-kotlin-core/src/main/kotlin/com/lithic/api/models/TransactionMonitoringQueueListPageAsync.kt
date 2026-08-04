// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.lithic.api.core.AutoPagerAsync
import com.lithic.api.core.PageAsync
import com.lithic.api.core.checkRequired
import com.lithic.api.services.async.transactionMonitoring.QueueServiceAsync
import java.util.Objects

/** @see QueueServiceAsync.list */
class TransactionMonitoringQueueListPageAsync
private constructor(
    private val service: QueueServiceAsync,
    private val params: TransactionMonitoringQueueListParams,
    private val response: TransactionMonitoringQueueListPageResponse,
) : PageAsync<Queue> {

    /**
     * Delegates to [TransactionMonitoringQueueListPageResponse], but gracefully handles missing
     * data.
     *
     * @see TransactionMonitoringQueueListPageResponse.data
     */
    fun data(): List<Queue> = response._data().getNullable("data") ?: emptyList()

    /**
     * Delegates to [TransactionMonitoringQueueListPageResponse], but gracefully handles missing
     * data.
     *
     * @see TransactionMonitoringQueueListPageResponse.hasMore
     */
    fun hasMore(): Boolean? = response._hasMore().getNullable("has_more")

    override fun items(): List<Queue> = data()

    override fun hasNextPage(): Boolean = items().isNotEmpty()

    fun nextPageParams(): TransactionMonitoringQueueListParams =
        if (params.endingBefore() != null) {
            params.toBuilder().endingBefore(items().first()._token().getNullable("token")).build()
        } else {
            params.toBuilder().startingAfter(items().last()._token().getNullable("token")).build()
        }

    override suspend fun nextPage(): TransactionMonitoringQueueListPageAsync =
        service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<Queue> = AutoPagerAsync.from(this)

    /** The parameters that were used to request this page. */
    fun params(): TransactionMonitoringQueueListParams = params

    /** The response that this page was parsed from. */
    fun response(): TransactionMonitoringQueueListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [TransactionMonitoringQueueListPageAsync].
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

    /** A builder for [TransactionMonitoringQueueListPageAsync]. */
    class Builder internal constructor() {

        private var service: QueueServiceAsync? = null
        private var params: TransactionMonitoringQueueListParams? = null
        private var response: TransactionMonitoringQueueListPageResponse? = null

        internal fun from(
            transactionMonitoringQueueListPageAsync: TransactionMonitoringQueueListPageAsync
        ) = apply {
            service = transactionMonitoringQueueListPageAsync.service
            params = transactionMonitoringQueueListPageAsync.params
            response = transactionMonitoringQueueListPageAsync.response
        }

        fun service(service: QueueServiceAsync) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: TransactionMonitoringQueueListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: TransactionMonitoringQueueListPageResponse) = apply {
            this.response = response
        }

        /**
         * Returns an immutable instance of [TransactionMonitoringQueueListPageAsync].
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
        fun build(): TransactionMonitoringQueueListPageAsync =
            TransactionMonitoringQueueListPageAsync(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is TransactionMonitoringQueueListPageAsync &&
            service == other.service &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, params, response)

    override fun toString() =
        "TransactionMonitoringQueueListPageAsync{service=$service, params=$params, response=$response}"
}
