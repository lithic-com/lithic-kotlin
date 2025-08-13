// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.lithic.api.core.AutoPagerAsync
import com.lithic.api.core.PageAsync
import com.lithic.api.core.checkRequired
import com.lithic.api.services.async.NetworkProgramServiceAsync
import java.util.Objects

/** @see NetworkProgramServiceAsync.list */
class NetworkProgramListPageAsync
private constructor(
    private val service: NetworkProgramServiceAsync,
    private val params: NetworkProgramListParams,
    private val response: NetworkProgramListPageResponse,
) : PageAsync<NetworkProgram> {

    /**
     * Delegates to [NetworkProgramListPageResponse], but gracefully handles missing data.
     *
     * @see NetworkProgramListPageResponse.data
     */
    fun data(): List<NetworkProgram> = response._data().getNullable("data") ?: emptyList()

    /**
     * Delegates to [NetworkProgramListPageResponse], but gracefully handles missing data.
     *
     * @see NetworkProgramListPageResponse.hasMore
     */
    fun hasMore(): Boolean? = response._hasMore().getNullable("has_more")

    override fun items(): List<NetworkProgram> = data()

    override fun hasNextPage(): Boolean = false

    fun nextPageParams(): NetworkProgramListParams =
        throw IllegalStateException("Cannot construct next page params")

    override suspend fun nextPage(): NetworkProgramListPageAsync = service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<NetworkProgram> = AutoPagerAsync.from(this)

    /** The parameters that were used to request this page. */
    fun params(): NetworkProgramListParams = params

    /** The response that this page was parsed from. */
    fun response(): NetworkProgramListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [NetworkProgramListPageAsync].
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

    /** A builder for [NetworkProgramListPageAsync]. */
    class Builder internal constructor() {

        private var service: NetworkProgramServiceAsync? = null
        private var params: NetworkProgramListParams? = null
        private var response: NetworkProgramListPageResponse? = null

        internal fun from(networkProgramListPageAsync: NetworkProgramListPageAsync) = apply {
            service = networkProgramListPageAsync.service
            params = networkProgramListPageAsync.params
            response = networkProgramListPageAsync.response
        }

        fun service(service: NetworkProgramServiceAsync) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: NetworkProgramListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: NetworkProgramListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [NetworkProgramListPageAsync].
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
        fun build(): NetworkProgramListPageAsync =
            NetworkProgramListPageAsync(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is NetworkProgramListPageAsync &&
            service == other.service &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, params, response)

    override fun toString() =
        "NetworkProgramListPageAsync{service=$service, params=$params, response=$response}"
}
