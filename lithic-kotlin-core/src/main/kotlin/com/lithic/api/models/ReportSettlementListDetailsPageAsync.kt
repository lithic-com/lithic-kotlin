// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.lithic.api.services.async.reports.SettlementServiceAsync
import java.util.Objects
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.FlowCollector

/** List details. */
class ReportSettlementListDetailsPageAsync
private constructor(
    private val settlementService: SettlementServiceAsync,
    private val params: ReportSettlementListDetailsParams,
    private val response: ReportSettlementListDetailsPageResponse,
) {

    /** Returns the response that this page was parsed from. */
    fun response(): ReportSettlementListDetailsPageResponse = response

    /**
     * Delegates to [ReportSettlementListDetailsPageResponse], but gracefully handles missing data.
     *
     * @see [ReportSettlementListDetailsPageResponse.data]
     */
    fun data(): List<SettlementDetail> = response._data().getNullable("data") ?: emptyList()

    /**
     * Delegates to [ReportSettlementListDetailsPageResponse], but gracefully handles missing data.
     *
     * @see [ReportSettlementListDetailsPageResponse.hasMore]
     */
    fun hasMore(): Boolean? = response._hasMore().getNullable("has_more")

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is ReportSettlementListDetailsPageAsync && settlementService == other.settlementService && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(settlementService, params, response) /* spotless:on */

    override fun toString() =
        "ReportSettlementListDetailsPageAsync{settlementService=$settlementService, params=$params, response=$response}"

    fun hasNextPage(): Boolean = data().isNotEmpty()

    fun getNextPageParams(): ReportSettlementListDetailsParams? {
        if (!hasNextPage()) {
            return null
        }

        return if (params.endingBefore() != null) {
            params.toBuilder().endingBefore(data().first()._token().getNullable("token")).build()
        } else {
            params.toBuilder().startingAfter(data().last()._token().getNullable("token")).build()
        }
    }

    suspend fun getNextPage(): ReportSettlementListDetailsPageAsync? {
        return getNextPageParams()?.let { settlementService.listDetails(it) }
    }

    fun autoPager(): AutoPager = AutoPager(this)

    companion object {

        fun of(
            settlementService: SettlementServiceAsync,
            params: ReportSettlementListDetailsParams,
            response: ReportSettlementListDetailsPageResponse,
        ) = ReportSettlementListDetailsPageAsync(settlementService, params, response)
    }

    class AutoPager(private val firstPage: ReportSettlementListDetailsPageAsync) :
        Flow<SettlementDetail> {

        override suspend fun collect(collector: FlowCollector<SettlementDetail>) {
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
