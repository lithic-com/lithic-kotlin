// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.lithic.api.core.checkRequired
import com.lithic.api.services.async.reports.settlement.NetworkTotalServiceAsync
import java.util.Objects
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.FlowCollector

/** @see [NetworkTotalServiceAsync.list] */
class ReportSettlementNetworkTotalListPageAsync
private constructor(
    private val service: NetworkTotalServiceAsync,
    private val params: ReportSettlementNetworkTotalListParams,
    private val response: ReportSettlementNetworkTotalListPageResponse,
) {

    /**
     * Delegates to [ReportSettlementNetworkTotalListPageResponse], but gracefully handles missing
     * data.
     *
     * @see [ReportSettlementNetworkTotalListPageResponse.data]
     */
    fun data(): List<NetworkTotalListResponse> = response._data().getNullable("data") ?: emptyList()

    /**
     * Delegates to [ReportSettlementNetworkTotalListPageResponse], but gracefully handles missing
     * data.
     *
     * @see [ReportSettlementNetworkTotalListPageResponse.hasMore]
     */
    fun hasMore(): Boolean? = response._hasMore().getNullable("has_more")

    fun hasNextPage(): Boolean = data().isNotEmpty()

    fun getNextPageParams(): ReportSettlementNetworkTotalListParams? {
        if (!hasNextPage()) {
            return null
        }

        return if (params.endingBefore() != null) {
            params.toBuilder().endingBefore(data().first()._token().getNullable("token")).build()
        } else {
            params.toBuilder().startingAfter(data().last()._token().getNullable("token")).build()
        }
    }

    suspend fun getNextPage(): ReportSettlementNetworkTotalListPageAsync? =
        getNextPageParams()?.let { service.list(it) }

    fun autoPager(): AutoPager = AutoPager(this)

    /** The parameters that were used to request this page. */
    fun params(): ReportSettlementNetworkTotalListParams = params

    /** The response that this page was parsed from. */
    fun response(): ReportSettlementNetworkTotalListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [ReportSettlementNetworkTotalListPageAsync].
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

    /** A builder for [ReportSettlementNetworkTotalListPageAsync]. */
    class Builder internal constructor() {

        private var service: NetworkTotalServiceAsync? = null
        private var params: ReportSettlementNetworkTotalListParams? = null
        private var response: ReportSettlementNetworkTotalListPageResponse? = null

        internal fun from(
            reportSettlementNetworkTotalListPageAsync: ReportSettlementNetworkTotalListPageAsync
        ) = apply {
            service = reportSettlementNetworkTotalListPageAsync.service
            params = reportSettlementNetworkTotalListPageAsync.params
            response = reportSettlementNetworkTotalListPageAsync.response
        }

        fun service(service: NetworkTotalServiceAsync) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: ReportSettlementNetworkTotalListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: ReportSettlementNetworkTotalListPageResponse) = apply {
            this.response = response
        }

        /**
         * Returns an immutable instance of [ReportSettlementNetworkTotalListPageAsync].
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
        fun build(): ReportSettlementNetworkTotalListPageAsync =
            ReportSettlementNetworkTotalListPageAsync(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    class AutoPager(private val firstPage: ReportSettlementNetworkTotalListPageAsync) :
        Flow<NetworkTotalListResponse> {

        override suspend fun collect(collector: FlowCollector<NetworkTotalListResponse>) {
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

        return /* spotless:off */ other is ReportSettlementNetworkTotalListPageAsync && service == other.service && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, params, response) /* spotless:on */

    override fun toString() =
        "ReportSettlementNetworkTotalListPageAsync{service=$service, params=$params, response=$response}"
}
