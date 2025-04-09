// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.lithic.api.core.checkRequired
import com.lithic.api.services.async.ManagementOperationServiceAsync
import java.util.Objects
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.FlowCollector

/** @see [ManagementOperationServiceAsync.list] */
class ManagementOperationListPageAsync
private constructor(
    private val service: ManagementOperationServiceAsync,
    private val params: ManagementOperationListParams,
    private val response: ManagementOperationListPageResponse,
) {

    /**
     * Delegates to [ManagementOperationListPageResponse], but gracefully handles missing data.
     *
     * @see [ManagementOperationListPageResponse.data]
     */
    fun data(): List<ManagementOperationTransaction> =
        response._data().getNullable("data") ?: emptyList()

    /**
     * Delegates to [ManagementOperationListPageResponse], but gracefully handles missing data.
     *
     * @see [ManagementOperationListPageResponse.hasMore]
     */
    fun hasMore(): Boolean? = response._hasMore().getNullable("has_more")

    fun hasNextPage(): Boolean = data().isNotEmpty()

    fun getNextPageParams(): ManagementOperationListParams? {
        if (!hasNextPage()) {
            return null
        }

        return if (params.endingBefore() != null) {
            params.toBuilder().endingBefore(data().first()._token().getNullable("token")).build()
        } else {
            params.toBuilder().startingAfter(data().last()._token().getNullable("token")).build()
        }
    }

    suspend fun getNextPage(): ManagementOperationListPageAsync? =
        getNextPageParams()?.let { service.list(it) }

    fun autoPager(): AutoPager = AutoPager(this)

    /** The parameters that were used to request this page. */
    fun params(): ManagementOperationListParams = params

    /** The response that this page was parsed from. */
    fun response(): ManagementOperationListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [ManagementOperationListPageAsync].
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

    /** A builder for [ManagementOperationListPageAsync]. */
    class Builder internal constructor() {

        private var service: ManagementOperationServiceAsync? = null
        private var params: ManagementOperationListParams? = null
        private var response: ManagementOperationListPageResponse? = null

        internal fun from(managementOperationListPageAsync: ManagementOperationListPageAsync) =
            apply {
                service = managementOperationListPageAsync.service
                params = managementOperationListPageAsync.params
                response = managementOperationListPageAsync.response
            }

        fun service(service: ManagementOperationServiceAsync) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: ManagementOperationListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: ManagementOperationListPageResponse) = apply {
            this.response = response
        }

        /**
         * Returns an immutable instance of [ManagementOperationListPageAsync].
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
        fun build(): ManagementOperationListPageAsync =
            ManagementOperationListPageAsync(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    class AutoPager(private val firstPage: ManagementOperationListPageAsync) :
        Flow<ManagementOperationTransaction> {

        override suspend fun collect(collector: FlowCollector<ManagementOperationTransaction>) {
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

        return /* spotless:off */ other is ManagementOperationListPageAsync && service == other.service && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, params, response) /* spotless:on */

    override fun toString() =
        "ManagementOperationListPageAsync{service=$service, params=$params, response=$response}"
}
