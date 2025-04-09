// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.lithic.api.services.async.reports.settlement.NetworkTotalServiceAsync
import java.util.Objects
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.FlowCollector

/** List network total records with optional filters. Not available in sandbox. */
class ReportSettlementNetworkTotalListPageAsync
private constructor(
    private val networkTotalsService: NetworkTotalServiceAsync,
    private val params: ReportSettlementNetworkTotalListParams,
    private val response: ReportSettlementNetworkTotalListPageResponse,
) {

    /** Returns the response that this page was parsed from. */
    fun response(): ReportSettlementNetworkTotalListPageResponse = response

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

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is ReportSettlementNetworkTotalListPageAsync && networkTotalsService == other.networkTotalsService && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(networkTotalsService, params, response) /* spotless:on */

    override fun toString() =
        "ReportSettlementNetworkTotalListPageAsync{networkTotalsService=$networkTotalsService, params=$params, response=$response}"

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

    suspend fun getNextPage(): ReportSettlementNetworkTotalListPageAsync? {
        return getNextPageParams()?.let { networkTotalsService.list(it) }
    }

    fun autoPager(): AutoPager = AutoPager(this)

    companion object {

        fun of(
            networkTotalsService: NetworkTotalServiceAsync,
            params: ReportSettlementNetworkTotalListParams,
            response: ReportSettlementNetworkTotalListPageResponse,
        ) = ReportSettlementNetworkTotalListPageAsync(networkTotalsService, params, response)
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
}
