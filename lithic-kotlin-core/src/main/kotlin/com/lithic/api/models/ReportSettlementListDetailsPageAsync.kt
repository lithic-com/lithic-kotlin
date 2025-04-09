// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.lithic.api.core.checkRequired
import com.lithic.api.services.async.reports.SettlementServiceAsync
import java.util.Objects
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.FlowCollector

/** @see [SettlementServiceAsync.listDetails] */
class ReportSettlementListDetailsPageAsync
private constructor(
    private val service: SettlementServiceAsync,
    private val params: ReportSettlementListDetailsParams,
    private val response: ReportSettlementListDetailsPageResponse,
) {

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

    suspend fun getNextPage(): ReportSettlementListDetailsPageAsync? =
        getNextPageParams()?.let { service.listDetails(it) }

    fun autoPager(): AutoPager = AutoPager(this)

    /** The parameters that were used to request this page. */
    fun params(): ReportSettlementListDetailsParams = params

    /** The response that this page was parsed from. */
    fun response(): ReportSettlementListDetailsPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [ReportSettlementListDetailsPageAsync].
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

    /** A builder for [ReportSettlementListDetailsPageAsync]. */
    class Builder internal constructor() {

        private var service: SettlementServiceAsync? = null
        private var params: ReportSettlementListDetailsParams? = null
        private var response: ReportSettlementListDetailsPageResponse? = null

        internal fun from(
            reportSettlementListDetailsPageAsync: ReportSettlementListDetailsPageAsync
        ) = apply {
            service = reportSettlementListDetailsPageAsync.service
            params = reportSettlementListDetailsPageAsync.params
            response = reportSettlementListDetailsPageAsync.response
        }

        fun service(service: SettlementServiceAsync) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: ReportSettlementListDetailsParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: ReportSettlementListDetailsPageResponse) = apply {
            this.response = response
        }

        /**
         * Returns an immutable instance of [ReportSettlementListDetailsPageAsync].
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
        fun build(): ReportSettlementListDetailsPageAsync =
            ReportSettlementListDetailsPageAsync(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
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

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is ReportSettlementListDetailsPageAsync && service == other.service && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, params, response) /* spotless:on */

    override fun toString() =
        "ReportSettlementListDetailsPageAsync{service=$service, params=$params, response=$response}"
}
