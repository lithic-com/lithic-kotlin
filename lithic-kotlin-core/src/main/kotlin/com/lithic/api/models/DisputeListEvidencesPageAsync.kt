// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.lithic.api.services.async.DisputeServiceAsync
import java.util.Objects
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.FlowCollector

/** List evidence metadata for a dispute. */
class DisputeListEvidencesPageAsync
private constructor(
    private val disputesService: DisputeServiceAsync,
    private val params: DisputeListEvidencesParams,
    private val response: DisputeListEvidencesPageResponse,
) {

    /** Returns the response that this page was parsed from. */
    fun response(): DisputeListEvidencesPageResponse = response

    /**
     * Delegates to [DisputeListEvidencesPageResponse], but gracefully handles missing data.
     *
     * @see [DisputeListEvidencesPageResponse.data]
     */
    fun data(): List<DisputeEvidence> = response._data().getNullable("data") ?: emptyList()

    /**
     * Delegates to [DisputeListEvidencesPageResponse], but gracefully handles missing data.
     *
     * @see [DisputeListEvidencesPageResponse.hasMore]
     */
    fun hasMore(): Boolean? = response._hasMore().getNullable("has_more")

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is DisputeListEvidencesPageAsync && disputesService == other.disputesService && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(disputesService, params, response) /* spotless:on */

    override fun toString() =
        "DisputeListEvidencesPageAsync{disputesService=$disputesService, params=$params, response=$response}"

    fun hasNextPage(): Boolean = data().isNotEmpty()

    fun getNextPageParams(): DisputeListEvidencesParams? {
        if (!hasNextPage()) {
            return null
        }

        return if (params.endingBefore() != null) {
            params.toBuilder().endingBefore(data().first()._token().getNullable("token")).build()
        } else {
            params.toBuilder().startingAfter(data().last()._token().getNullable("token")).build()
        }
    }

    suspend fun getNextPage(): DisputeListEvidencesPageAsync? {
        return getNextPageParams()?.let { disputesService.listEvidences(it) }
    }

    fun autoPager(): AutoPager = AutoPager(this)

    companion object {

        fun of(
            disputesService: DisputeServiceAsync,
            params: DisputeListEvidencesParams,
            response: DisputeListEvidencesPageResponse,
        ) = DisputeListEvidencesPageAsync(disputesService, params, response)
    }

    class AutoPager(private val firstPage: DisputeListEvidencesPageAsync) : Flow<DisputeEvidence> {

        override suspend fun collect(collector: FlowCollector<DisputeEvidence>) {
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
