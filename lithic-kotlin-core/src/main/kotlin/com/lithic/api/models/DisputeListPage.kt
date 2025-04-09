// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.lithic.api.services.blocking.DisputeService
import java.util.Objects

/** List disputes. */
class DisputeListPage
private constructor(
    private val disputesService: DisputeService,
    private val params: DisputeListParams,
    private val response: DisputeListPageResponse,
) {

    /** Returns the response that this page was parsed from. */
    fun response(): DisputeListPageResponse = response

    /**
     * Delegates to [DisputeListPageResponse], but gracefully handles missing data.
     *
     * @see [DisputeListPageResponse.data]
     */
    fun data(): List<Dispute> = response._data().getNullable("data") ?: emptyList()

    /**
     * Delegates to [DisputeListPageResponse], but gracefully handles missing data.
     *
     * @see [DisputeListPageResponse.hasMore]
     */
    fun hasMore(): Boolean? = response._hasMore().getNullable("has_more")

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is DisputeListPage && disputesService == other.disputesService && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(disputesService, params, response) /* spotless:on */

    override fun toString() =
        "DisputeListPage{disputesService=$disputesService, params=$params, response=$response}"

    fun hasNextPage(): Boolean = data().isNotEmpty()

    fun getNextPageParams(): DisputeListParams? {
        if (!hasNextPage()) {
            return null
        }

        return if (params.endingBefore() != null) {
            params.toBuilder().endingBefore(data().first()._token().getNullable("token")).build()
        } else {
            params.toBuilder().startingAfter(data().last()._token().getNullable("token")).build()
        }
    }

    fun getNextPage(): DisputeListPage? {
        return getNextPageParams()?.let { disputesService.list(it) }
    }

    fun autoPager(): AutoPager = AutoPager(this)

    companion object {

        fun of(
            disputesService: DisputeService,
            params: DisputeListParams,
            response: DisputeListPageResponse,
        ) = DisputeListPage(disputesService, params, response)
    }

    class AutoPager(private val firstPage: DisputeListPage) : Sequence<Dispute> {

        override fun iterator(): Iterator<Dispute> = iterator {
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
