// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.lithic.api.services.async.ManagementOperationServiceAsync
import java.util.Objects
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.FlowCollector

/** List management operations */
class ManagementOperationListPageAsync
private constructor(
    private val managementOperationsService: ManagementOperationServiceAsync,
    private val params: ManagementOperationListParams,
    private val response: ManagementOperationListPageResponse,
) {

    /** Returns the response that this page was parsed from. */
    fun response(): ManagementOperationListPageResponse = response

    /**
     * Delegates to [ManagementOperationListPageResponse], but gracefully handles missing data.
     *
     * @see [ManagementOperationListPageResponse.data]
     */
    fun data(): List<ManagementOperationTransaction> =
        response._data().getNullable("data") ?: emptyList()

    /**
     * Delegates to [ManagementOperationListPageResponse], but gracefully handles missing data.
     *
     * @see [ManagementOperationListPageResponse.hasMore]
     */
    fun hasMore(): Boolean? = response._hasMore().getNullable("has_more")

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is ManagementOperationListPageAsync && managementOperationsService == other.managementOperationsService && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(managementOperationsService, params, response) /* spotless:on */

    override fun toString() =
        "ManagementOperationListPageAsync{managementOperationsService=$managementOperationsService, params=$params, response=$response}"

    fun hasNextPage(): Boolean = data().isNotEmpty()

    fun getNextPageParams(): ManagementOperationListParams? {
        if (!hasNextPage()) {
            return null
        }

        return if (params.endingBefore() != null) {
            params.toBuilder().endingBefore(data().first()._token().getNullable("token")).build()
        } else {
            params.toBuilder().startingAfter(data().last()._token().getNullable("token")).build()
        }
    }

    suspend fun getNextPage(): ManagementOperationListPageAsync? {
        return getNextPageParams()?.let { managementOperationsService.list(it) }
    }

    fun autoPager(): AutoPager = AutoPager(this)

    companion object {

        fun of(
            managementOperationsService: ManagementOperationServiceAsync,
            params: ManagementOperationListParams,
            response: ManagementOperationListPageResponse,
        ) = ManagementOperationListPageAsync(managementOperationsService, params, response)
    }

    class AutoPager(private val firstPage: ManagementOperationListPageAsync) :
        Flow<ManagementOperationTransaction> {

        override suspend fun collect(collector: FlowCollector<ManagementOperationTransaction>) {
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
