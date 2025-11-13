// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.lithic.api.core.AutoPagerAsync
import com.lithic.api.core.PageAsync
import com.lithic.api.core.checkRequired
import com.lithic.api.services.async.DisputesV2ServiceAsync
import java.util.Objects

/** @see DisputesV2ServiceAsync.list */
class DisputesV2ListPageAsync
private constructor(
    private val service: DisputesV2ServiceAsync,
    private val params: DisputesV2ListParams,
    private val response: DisputesV2ListPageResponse,
) : PageAsync<DisputeV2> {

    /**
     * Delegates to [DisputesV2ListPageResponse], but gracefully handles missing data.
     *
     * @see DisputesV2ListPageResponse.data
     */
    fun data(): List<DisputeV2> = response._data().getNullable("data") ?: emptyList()

    /**
     * Delegates to [DisputesV2ListPageResponse], but gracefully handles missing data.
     *
     * @see DisputesV2ListPageResponse.hasMore
     */
    fun hasMore(): Boolean? = response._hasMore().getNullable("has_more")

    override fun items(): List<DisputeV2> = data()

    override fun hasNextPage(): Boolean = items().isNotEmpty()

    fun nextPageParams(): DisputesV2ListParams =
        if (params.endingBefore() != null) {
            params.toBuilder().endingBefore(items().first()._token().getNullable("token")).build()
        } else {
            params.toBuilder().startingAfter(items().last()._token().getNullable("token")).build()
        }

    override suspend fun nextPage(): DisputesV2ListPageAsync = service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<DisputeV2> = AutoPagerAsync.from(this)

    /** The parameters that were used to request this page. */
    fun params(): DisputesV2ListParams = params

    /** The response that this page was parsed from. */
    fun response(): DisputesV2ListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [DisputesV2ListPageAsync].
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

    /** A builder for [DisputesV2ListPageAsync]. */
    class Builder internal constructor() {

        private var service: DisputesV2ServiceAsync? = null
        private var params: DisputesV2ListParams? = null
        private var response: DisputesV2ListPageResponse? = null

        internal fun from(disputesV2ListPageAsync: DisputesV2ListPageAsync) = apply {
            service = disputesV2ListPageAsync.service
            params = disputesV2ListPageAsync.params
            response = disputesV2ListPageAsync.response
        }

        fun service(service: DisputesV2ServiceAsync) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: DisputesV2ListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: DisputesV2ListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [DisputesV2ListPageAsync].
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
        fun build(): DisputesV2ListPageAsync =
            DisputesV2ListPageAsync(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is DisputesV2ListPageAsync &&
            service == other.service &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, params, response)

    override fun toString() =
        "DisputesV2ListPageAsync{service=$service, params=$params, response=$response}"
}
