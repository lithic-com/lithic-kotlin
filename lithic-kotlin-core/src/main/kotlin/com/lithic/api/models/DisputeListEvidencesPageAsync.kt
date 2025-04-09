// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.lithic.api.core.checkRequired
import com.lithic.api.services.async.DisputeServiceAsync
import java.util.Objects
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.FlowCollector

/** @see [DisputeServiceAsync.listEvidences] */
class DisputeListEvidencesPageAsync
private constructor(
    private val service: DisputeServiceAsync,
    private val params: DisputeListEvidencesParams,
    private val response: DisputeListEvidencesPageResponse,
) {

    /**
     * Delegates to [DisputeListEvidencesPageResponse], but gracefully handles missing data.
     *
     * @see [DisputeListEvidencesPageResponse.data]
     */
    fun data(): List<DisputeEvidence> = response._data().getNullable("data") ?: emptyList()

    /**
     * Delegates to [DisputeListEvidencesPageResponse], but gracefully handles missing data.
     *
     * @see [DisputeListEvidencesPageResponse.hasMore]
     */
    fun hasMore(): Boolean? = response._hasMore().getNullable("has_more")

    fun hasNextPage(): Boolean = data().isNotEmpty()

    fun getNextPageParams(): DisputeListEvidencesParams? {
        if (!hasNextPage()) {
            return null
        }

        return if (params.endingBefore() != null) {
            params.toBuilder().endingBefore(data().first()._token().getNullable("token")).build()
        } else {
            params.toBuilder().startingAfter(data().last()._token().getNullable("token")).build()
        }
    }

    suspend fun getNextPage(): DisputeListEvidencesPageAsync? =
        getNextPageParams()?.let { service.listEvidences(it) }

    fun autoPager(): AutoPager = AutoPager(this)

    /** The parameters that were used to request this page. */
    fun params(): DisputeListEvidencesParams = params

    /** The response that this page was parsed from. */
    fun response(): DisputeListEvidencesPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [DisputeListEvidencesPageAsync].
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

    /** A builder for [DisputeListEvidencesPageAsync]. */
    class Builder internal constructor() {

        private var service: DisputeServiceAsync? = null
        private var params: DisputeListEvidencesParams? = null
        private var response: DisputeListEvidencesPageResponse? = null

        internal fun from(disputeListEvidencesPageAsync: DisputeListEvidencesPageAsync) = apply {
            service = disputeListEvidencesPageAsync.service
            params = disputeListEvidencesPageAsync.params
            response = disputeListEvidencesPageAsync.response
        }

        fun service(service: DisputeServiceAsync) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: DisputeListEvidencesParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: DisputeListEvidencesPageResponse) = apply {
            this.response = response
        }

        /**
         * Returns an immutable instance of [DisputeListEvidencesPageAsync].
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
        fun build(): DisputeListEvidencesPageAsync =
            DisputeListEvidencesPageAsync(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    class AutoPager(private val firstPage: DisputeListEvidencesPageAsync) : Flow<DisputeEvidence> {

        override suspend fun collect(collector: FlowCollector<DisputeEvidence>) {
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

        return /* spotless:off */ other is DisputeListEvidencesPageAsync && service == other.service && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, params, response) /* spotless:on */

    override fun toString() =
        "DisputeListEvidencesPageAsync{service=$service, params=$params, response=$response}"
}
