// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.lithic.api.core.AutoPagerAsync
import com.lithic.api.core.PageAsync
import com.lithic.api.core.checkRequired
import com.lithic.api.services.async.FundingEventServiceAsync
import java.util.Objects

/** @see FundingEventServiceAsync.list */
class FundingEventListPageAsync
private constructor(
    private val service: FundingEventServiceAsync,
    private val params: FundingEventListParams,
    private val response: FundingEventListPageResponse,
) : PageAsync<FundingEventListResponse> {

    /**
     * Delegates to [FundingEventListPageResponse], but gracefully handles missing data.
     *
     * @see FundingEventListPageResponse.data
     */
    fun data(): List<FundingEventListResponse> = response._data().getNullable("data") ?: emptyList()

    /**
     * Delegates to [FundingEventListPageResponse], but gracefully handles missing data.
     *
     * @see FundingEventListPageResponse.hasMore
     */
    fun hasMore(): Boolean? = response._hasMore().getNullable("has_more")

    override fun items(): List<FundingEventListResponse> = data()

    override fun hasNextPage(): Boolean = items().isNotEmpty()

    fun nextPageParams(): FundingEventListParams =
        if (params.endingBefore() != null) {
            params.toBuilder().endingBefore(items().first()._token().getNullable("token")).build()
        } else {
            params.toBuilder().startingAfter(items().last()._token().getNullable("token")).build()
        }

    override suspend fun nextPage(): FundingEventListPageAsync = service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<FundingEventListResponse> = AutoPagerAsync.from(this)

    /** The parameters that were used to request this page. */
    fun params(): FundingEventListParams = params

    /** The response that this page was parsed from. */
    fun response(): FundingEventListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [FundingEventListPageAsync].
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

    /** A builder for [FundingEventListPageAsync]. */
    class Builder internal constructor() {

        private var service: FundingEventServiceAsync? = null
        private var params: FundingEventListParams? = null
        private var response: FundingEventListPageResponse? = null

        internal fun from(fundingEventListPageAsync: FundingEventListPageAsync) = apply {
            service = fundingEventListPageAsync.service
            params = fundingEventListPageAsync.params
            response = fundingEventListPageAsync.response
        }

        fun service(service: FundingEventServiceAsync) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: FundingEventListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: FundingEventListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [FundingEventListPageAsync].
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
        fun build(): FundingEventListPageAsync =
            FundingEventListPageAsync(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is FundingEventListPageAsync && service == other.service && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, params, response) /* spotless:on */

    override fun toString() =
        "FundingEventListPageAsync{service=$service, params=$params, response=$response}"
}
