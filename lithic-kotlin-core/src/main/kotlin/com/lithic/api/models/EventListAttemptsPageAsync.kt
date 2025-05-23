// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.lithic.api.core.AutoPagerAsync
import com.lithic.api.core.PageAsync
import com.lithic.api.core.checkRequired
import com.lithic.api.services.async.EventServiceAsync
import java.util.Objects

/** @see [EventServiceAsync.listAttempts] */
class EventListAttemptsPageAsync
private constructor(
    private val service: EventServiceAsync,
    private val params: EventListAttemptsParams,
    private val response: EventListAttemptsPageResponse,
) : PageAsync<MessageAttempt> {

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

    override fun items(): List<MessageAttempt> = data()

    override fun hasNextPage(): Boolean = items().isNotEmpty()

    fun nextPageParams(): EventListAttemptsParams =
        if (params.endingBefore() != null) {
            params.toBuilder().endingBefore(items().first()._token().getNullable("token")).build()
        } else {
            params.toBuilder().startingAfter(items().last()._token().getNullable("token")).build()
        }

    override suspend fun nextPage(): EventListAttemptsPageAsync =
        service.listAttempts(nextPageParams())

    fun autoPager(): AutoPagerAsync<MessageAttempt> = AutoPagerAsync.from(this)

    /** The parameters that were used to request this page. */
    fun params(): EventListAttemptsParams = params

    /** The response that this page was parsed from. */
    fun response(): EventListAttemptsPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [EventListAttemptsPageAsync].
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

    /** A builder for [EventListAttemptsPageAsync]. */
    class Builder internal constructor() {

        private var service: EventServiceAsync? = null
        private var params: EventListAttemptsParams? = null
        private var response: EventListAttemptsPageResponse? = null

        internal fun from(eventListAttemptsPageAsync: EventListAttemptsPageAsync) = apply {
            service = eventListAttemptsPageAsync.service
            params = eventListAttemptsPageAsync.params
            response = eventListAttemptsPageAsync.response
        }

        fun service(service: EventServiceAsync) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: EventListAttemptsParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: EventListAttemptsPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [EventListAttemptsPageAsync].
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
        fun build(): EventListAttemptsPageAsync =
            EventListAttemptsPageAsync(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is EventListAttemptsPageAsync && service == other.service && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, params, response) /* spotless:on */

    override fun toString() =
        "EventListAttemptsPageAsync{service=$service, params=$params, response=$response}"
}
