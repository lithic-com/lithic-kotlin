// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.lithic.api.core.checkRequired
import com.lithic.api.services.blocking.EventService
import java.util.Objects

/** @see [EventService.listAttempts] */
class EventListAttemptsPage
private constructor(
    private val service: EventService,
    private val params: EventListAttemptsParams,
    private val response: EventListAttemptsPageResponse,
) {

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

    fun getNextPage(): EventListAttemptsPage? =
        getNextPageParams()?.let { service.listAttempts(it) }

    fun autoPager(): AutoPager = AutoPager(this)

    /** The parameters that were used to request this page. */
    fun params(): EventListAttemptsParams = params

    /** The response that this page was parsed from. */
    fun response(): EventListAttemptsPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [EventListAttemptsPage].
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

    /** A builder for [EventListAttemptsPage]. */
    class Builder internal constructor() {

        private var service: EventService? = null
        private var params: EventListAttemptsParams? = null
        private var response: EventListAttemptsPageResponse? = null

        internal fun from(eventListAttemptsPage: EventListAttemptsPage) = apply {
            service = eventListAttemptsPage.service
            params = eventListAttemptsPage.params
            response = eventListAttemptsPage.response
        }

        fun service(service: EventService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: EventListAttemptsParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: EventListAttemptsPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [EventListAttemptsPage].
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
        fun build(): EventListAttemptsPage =
            EventListAttemptsPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    class AutoPager(private val firstPage: EventListAttemptsPage) : Sequence<MessageAttempt> {

        override fun iterator(): Iterator<MessageAttempt> = iterator {
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

        return /* spotless:off */ other is EventListAttemptsPage && service == other.service && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, params, response) /* spotless:on */

    override fun toString() =
        "EventListAttemptsPage{service=$service, params=$params, response=$response}"
}
