// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.lithic.api.services.blocking.reports.SettlementService
import java.util.Objects

/** List details. */
class ReportSettlementListDetailsPage
private constructor(
    private val settlementService: SettlementService,
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

        return /* spotless:off */ other is ReportSettlementListDetailsPage && settlementService == other.settlementService && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(settlementService, params, response) /* spotless:on */

    override fun toString() =
        "ReportSettlementListDetailsPage{settlementService=$settlementService, params=$params, response=$response}"

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

    fun getNextPage(): ReportSettlementListDetailsPage? {
        return getNextPageParams()?.let { settlementService.listDetails(it) }
    }

    fun autoPager(): AutoPager = AutoPager(this)

    companion object {

        fun of(
            settlementService: SettlementService,
            params: ReportSettlementListDetailsParams,
            response: ReportSettlementListDetailsPageResponse,
        ) = ReportSettlementListDetailsPage(settlementService, params, response)
    }

    class AutoPager(private val firstPage: ReportSettlementListDetailsPage) :
        Sequence<SettlementDetail> {

        override fun iterator(): Iterator<SettlementDetail> = iterator {
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
