// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.lithic.api.services.async.EventServiceAsync
import java.util.Objects
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.FlowCollector

/** List all the message attempts for a given event. */
class EventListAttemptsPageAsync
private constructor(
    private val eventsService: EventServiceAsync,
    private val params: EventListAttemptsParams,
    private val response: EventListAttemptsPageResponse,
) {

    /** Returns the response that this page was parsed from. */
    fun response(): EventListAttemptsPageResponse = response

    /**
     * Delegates to [EventListAttemptsPageResponse], but gracefully handles missing data.
     *
     * @see [EventListAttemptsPageResponse.data]
     */
    fun data(): List<MessageAttempt> = response._data().getNullable("data") ?: emptyList()

    /**
     * Delegates to [EventListAttemptsPageResponse], but gracefully handles missing data.
     *
     * @see [EventListAttemptsPageResponse.hasMore]
     */
    fun hasMore(): Boolean? = response._hasMore().getNullable("has_more")

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is EventListAttemptsPageAsync && eventsService == other.eventsService && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(eventsService, params, response) /* spotless:on */

    override fun toString() =
        "EventListAttemptsPageAsync{eventsService=$eventsService, params=$params, response=$response}"

    fun hasNextPage(): Boolean = data().isNotEmpty()

    fun getNextPageParams(): EventListAttemptsParams? {
        if (!hasNextPage()) {
            return null
        }

        return if (params.endingBefore() != null) {
            params.toBuilder().endingBefore(data().first()._token().getNullable("token")).build()
        } else {
            params.toBuilder().startingAfter(data().last()._token().getNullable("token")).build()
        }
    }

    suspend fun getNextPage(): EventListAttemptsPageAsync? {
        return getNextPageParams()?.let { eventsService.listAttempts(it) }
    }

    fun autoPager(): AutoPager = AutoPager(this)

    companion object {

        fun of(
            eventsService: EventServiceAsync,
            params: EventListAttemptsParams,
            response: EventListAttemptsPageResponse,
        ) = EventListAttemptsPageAsync(eventsService, params, response)
    }

    class AutoPager(private val firstPage: EventListAttemptsPageAsync) : Flow<MessageAttempt> {

        override suspend fun collect(collector: FlowCollector<MessageAttempt>) {
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
