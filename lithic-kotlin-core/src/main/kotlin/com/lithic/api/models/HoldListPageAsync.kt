// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.lithic.api.core.AutoPagerAsync
import com.lithic.api.core.PageAsync
import com.lithic.api.core.checkRequired
import com.lithic.api.services.async.HoldServiceAsync
import java.util.Objects

/** @see HoldServiceAsync.list */
class HoldListPageAsync
private constructor(
    private val service: HoldServiceAsync,
    private val params: HoldListParams,
    private val response: HoldListPageResponse,
) : PageAsync<Hold> {

    /**
     * Delegates to [HoldListPageResponse], but gracefully handles missing data.
     *
     * @see HoldListPageResponse.data
     */
    fun data(): List<Hold> = response._data().getNullable("data") ?: emptyList()

    /**
     * Delegates to [HoldListPageResponse], but gracefully handles missing data.
     *
     * @see HoldListPageResponse.hasMore
     */
    fun hasMore(): Boolean? = response._hasMore().getNullable("has_more")

    override fun items(): List<Hold> = data()

    override fun hasNextPage(): Boolean = items().isNotEmpty()

    fun nextPageParams(): HoldListParams =
        if (params.endingBefore() != null) {
            params.toBuilder().endingBefore(items().first()._token().getNullable("token")).build()
        } else {
            params.toBuilder().startingAfter(items().last()._token().getNullable("token")).build()
        }

    override suspend fun nextPage(): HoldListPageAsync = service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<Hold> = AutoPagerAsync.from(this)

    /** The parameters that were used to request this page. */
    fun params(): HoldListParams = params

    /** The response that this page was parsed from. */
    fun response(): HoldListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [HoldListPageAsync].
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

    /** A builder for [HoldListPageAsync]. */
    class Builder internal constructor() {

        private var service: HoldServiceAsync? = null
        private var params: HoldListParams? = null
        private var response: HoldListPageResponse? = null

        internal fun from(holdListPageAsync: HoldListPageAsync) = apply {
            service = holdListPageAsync.service
            params = holdListPageAsync.params
            response = holdListPageAsync.response
        }

        fun service(service: HoldServiceAsync) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: HoldListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: HoldListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [HoldListPageAsync].
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
        fun build(): HoldListPageAsync =
            HoldListPageAsync(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is HoldListPageAsync &&
            service == other.service &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, params, response)

    override fun toString() =
        "HoldListPageAsync{service=$service, params=$params, response=$response}"
}
