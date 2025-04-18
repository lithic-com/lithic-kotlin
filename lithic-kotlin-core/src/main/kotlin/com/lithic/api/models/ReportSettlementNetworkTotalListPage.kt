// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.lithic.api.core.checkRequired
import com.lithic.api.services.blocking.reports.settlement.NetworkTotalService
import java.util.Objects

/** @see [NetworkTotalService.list] */
class ReportSettlementNetworkTotalListPage
private constructor(
    private val service: NetworkTotalService,
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

    fun getNextPage(): ReportSettlementNetworkTotalListPage? =
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
         * [ReportSettlementNetworkTotalListPage].
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

    /** A builder for [ReportSettlementNetworkTotalListPage]. */
    class Builder internal constructor() {

        private var service: NetworkTotalService? = null
        private var params: ReportSettlementNetworkTotalListParams? = null
        private var response: ReportSettlementNetworkTotalListPageResponse? = null

        internal fun from(
            reportSettlementNetworkTotalListPage: ReportSettlementNetworkTotalListPage
        ) = apply {
            service = reportSettlementNetworkTotalListPage.service
            params = reportSettlementNetworkTotalListPage.params
            response = reportSettlementNetworkTotalListPage.response
        }

        fun service(service: NetworkTotalService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: ReportSettlementNetworkTotalListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: ReportSettlementNetworkTotalListPageResponse) = apply {
            this.response = response
        }

        /**
         * Returns an immutable instance of [ReportSettlementNetworkTotalListPage].
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
        fun build(): ReportSettlementNetworkTotalListPage =
            ReportSettlementNetworkTotalListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    class AutoPager(private val firstPage: ReportSettlementNetworkTotalListPage) :
        Sequence<NetworkTotalListResponse> {

        override fun iterator(): Iterator<NetworkTotalListResponse> = iterator {
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

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is ReportSettlementNetworkTotalListPage && service == other.service && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, params, response) /* spotless:on */

    override fun toString() =
        "ReportSettlementNetworkTotalListPage{service=$service, params=$params, response=$response}"
}
