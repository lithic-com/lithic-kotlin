// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.lithic.api.core.AutoPagerAsync
import com.lithic.api.core.PageAsync
import com.lithic.api.core.checkRequired
import com.lithic.api.services.async.TransferLimitServiceAsync
import java.util.Objects

/** @see TransferLimitServiceAsync.list */
class TransferLimitListPageAsync
private constructor(
    private val service: TransferLimitServiceAsync,
    private val params: TransferLimitListParams,
    private val response: TransferLimitsResponse,
) : PageAsync<TransferLimitsResponse.TransferLimitItem> {

    /**
     * Delegates to [TransferLimitsResponse], but gracefully handles missing data.
     *
     * @see TransferLimitsResponse.data
     */
    fun data(): List<TransferLimitsResponse.TransferLimitItem> =
        response._data().getNullable("data") ?: emptyList()

    /**
     * Delegates to [TransferLimitsResponse], but gracefully handles missing data.
     *
     * @see TransferLimitsResponse.hasMore
     */
    fun hasMore(): Boolean? = response._hasMore().getNullable("has_more")

    override fun items(): List<TransferLimitsResponse.TransferLimitItem> = data()

    override fun hasNextPage(): Boolean = false

    fun nextPageParams(): TransferLimitListParams =
        throw IllegalStateException("Cannot construct next page params")

    override suspend fun nextPage(): TransferLimitListPageAsync = service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<TransferLimitsResponse.TransferLimitItem> =
        AutoPagerAsync.from(this)

    /** The parameters that were used to request this page. */
    fun params(): TransferLimitListParams = params

    /** The response that this page was parsed from. */
    fun response(): TransferLimitsResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [TransferLimitListPageAsync].
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

    /** A builder for [TransferLimitListPageAsync]. */
    class Builder internal constructor() {

        private var service: TransferLimitServiceAsync? = null
        private var params: TransferLimitListParams? = null
        private var response: TransferLimitsResponse? = null

        internal fun from(transferLimitListPageAsync: TransferLimitListPageAsync) = apply {
            service = transferLimitListPageAsync.service
            params = transferLimitListPageAsync.params
            response = transferLimitListPageAsync.response
        }

        fun service(service: TransferLimitServiceAsync) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: TransferLimitListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: TransferLimitsResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [TransferLimitListPageAsync].
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
        fun build(): TransferLimitListPageAsync =
            TransferLimitListPageAsync(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is TransferLimitListPageAsync &&
            service == other.service &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, params, response)

    override fun toString() =
        "TransferLimitListPageAsync{service=$service, params=$params, response=$response}"
}
