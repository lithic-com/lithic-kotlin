// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.lithic.api.core.checkRequired
import com.lithic.api.services.async.events.SubscriptionServiceAsync
import java.util.Objects
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.FlowCollector

/** @see [SubscriptionServiceAsync.listAttempts] */
class EventSubscriptionListAttemptsPageAsync
private constructor(
    private val service: SubscriptionServiceAsync,
    private val params: EventSubscriptionListAttemptsParams,
    private val response: EventSubscriptionListAttemptsPageResponse,
) {

    /**
     * Delegates to [EventSubscriptionListAttemptsPageResponse], but gracefully handles missing
     * data.
     *
     * @see [EventSubscriptionListAttemptsPageResponse.data]
     */
    fun data(): List<MessageAttempt> = response._data().getNullable("data") ?: emptyList()

    /**
     * Delegates to [EventSubscriptionListAttemptsPageResponse], but gracefully handles missing
     * data.
     *
     * @see [EventSubscriptionListAttemptsPageResponse.hasMore]
     */
    fun hasMore(): Boolean? = response._hasMore().getNullable("has_more")

    fun hasNextPage(): Boolean = data().isNotEmpty()

    fun getNextPageParams(): EventSubscriptionListAttemptsParams? {
        if (!hasNextPage()) {
            return null
        }

        return if (params.endingBefore() != null) {
            params.toBuilder().endingBefore(data().first()._token().getNullable("token")).build()
        } else {
            params.toBuilder().startingAfter(data().last()._token().getNullable("token")).build()
        }
    }

    suspend fun getNextPage(): EventSubscriptionListAttemptsPageAsync? =
        getNextPageParams()?.let { service.listAttempts(it) }

    fun autoPager(): AutoPager = AutoPager(this)

    /** The parameters that were used to request this page. */
    fun params(): EventSubscriptionListAttemptsParams = params

    /** The response that this page was parsed from. */
    fun response(): EventSubscriptionListAttemptsPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [EventSubscriptionListAttemptsPageAsync].
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

    /** A builder for [EventSubscriptionListAttemptsPageAsync]. */
    class Builder internal constructor() {

        private var service: SubscriptionServiceAsync? = null
        private var params: EventSubscriptionListAttemptsParams? = null
        private var response: EventSubscriptionListAttemptsPageResponse? = null

        internal fun from(
            eventSubscriptionListAttemptsPageAsync: EventSubscriptionListAttemptsPageAsync
        ) = apply {
            service = eventSubscriptionListAttemptsPageAsync.service
            params = eventSubscriptionListAttemptsPageAsync.params
            response = eventSubscriptionListAttemptsPageAsync.response
        }

        fun service(service: SubscriptionServiceAsync) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: EventSubscriptionListAttemptsParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: EventSubscriptionListAttemptsPageResponse) = apply {
            this.response = response
        }

        /**
         * Returns an immutable instance of [EventSubscriptionListAttemptsPageAsync].
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
        fun build(): EventSubscriptionListAttemptsPageAsync =
            EventSubscriptionListAttemptsPageAsync(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    class AutoPager(private val firstPage: EventSubscriptionListAttemptsPageAsync) :
        Flow<MessageAttempt> {

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

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is EventSubscriptionListAttemptsPageAsync && service == other.service && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, params, response) /* spotless:on */

    override fun toString() =
        "EventSubscriptionListAttemptsPageAsync{service=$service, params=$params, response=$response}"
}
