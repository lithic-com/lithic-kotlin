// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.lithic.api.services.async.EventServiceAsync
import java.util.Objects
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.FlowCollector

/** List all events. */
class EventListPageAsync
private constructor(
    private val eventsService: EventServiceAsync,
    private val params: EventListParams,
    private val response: EventListPageResponse,
) {

    /** Returns the response that this page was parsed from. */
    fun response(): EventListPageResponse = response

    /**
     * Delegates to [EventListPageResponse], but gracefully handles missing data.
     *
     * @see [EventListPageResponse.data]
     */
    fun data(): List<Event> = response._data().getNullable("data") ?: emptyList()

    /**
     * Delegates to [EventListPageResponse], but gracefully handles missing data.
     *
     * @see [EventListPageResponse.hasMore]
     */
    fun hasMore(): Boolean? = response._hasMore().getNullable("has_more")

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is EventListPageAsync && eventsService == other.eventsService && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(eventsService, params, response) /* spotless:on */

    override fun toString() =
        "EventListPageAsync{eventsService=$eventsService, params=$params, response=$response}"

    fun hasNextPage(): Boolean = data().isNotEmpty()

    fun getNextPageParams(): EventListParams? {
        if (!hasNextPage()) {
            return null
        }

        return if (params.endingBefore() != null) {
            params.toBuilder().endingBefore(data().first()._token().getNullable("token")).build()
        } else {
            params.toBuilder().startingAfter(data().last()._token().getNullable("token")).build()
        }
    }

    suspend fun getNextPage(): EventListPageAsync? {
        return getNextPageParams()?.let { eventsService.list(it) }
    }

    fun autoPager(): AutoPager = AutoPager(this)

    companion object {

        fun of(
            eventsService: EventServiceAsync,
            params: EventListParams,
            response: EventListPageResponse,
        ) = EventListPageAsync(eventsService, params, response)
    }

    class AutoPager(private val firstPage: EventListPageAsync) : Flow<Event> {

        override suspend fun collect(collector: FlowCollector<Event>) {
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
