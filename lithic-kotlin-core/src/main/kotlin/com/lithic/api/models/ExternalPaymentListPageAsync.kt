// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.lithic.api.core.checkRequired
import com.lithic.api.services.async.ExternalPaymentServiceAsync
import java.util.Objects
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.FlowCollector

/** @see [ExternalPaymentServiceAsync.list] */
class ExternalPaymentListPageAsync
private constructor(
    private val service: ExternalPaymentServiceAsync,
    private val params: ExternalPaymentListParams,
    private val response: ExternalPaymentListPageResponse,
) {

    /**
     * Delegates to [ExternalPaymentListPageResponse], but gracefully handles missing data.
     *
     * @see [ExternalPaymentListPageResponse.data]
     */
    fun data(): List<ExternalPayment> = response._data().getNullable("data") ?: emptyList()

    /**
     * Delegates to [ExternalPaymentListPageResponse], but gracefully handles missing data.
     *
     * @see [ExternalPaymentListPageResponse.hasMore]
     */
    fun hasMore(): Boolean? = response._hasMore().getNullable("has_more")

    fun hasNextPage(): Boolean = data().isNotEmpty()

    fun getNextPageParams(): ExternalPaymentListParams? {
        if (!hasNextPage()) {
            return null
        }

        return if (params.endingBefore() != null) {
            params.toBuilder().endingBefore(data().first()._token().getNullable("token")).build()
        } else {
            params.toBuilder().startingAfter(data().last()._token().getNullable("token")).build()
        }
    }

    suspend fun getNextPage(): ExternalPaymentListPageAsync? =
        getNextPageParams()?.let { service.list(it) }

    fun autoPager(): AutoPager = AutoPager(this)

    /** The parameters that were used to request this page. */
    fun params(): ExternalPaymentListParams = params

    /** The response that this page was parsed from. */
    fun response(): ExternalPaymentListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [ExternalPaymentListPageAsync].
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

    /** A builder for [ExternalPaymentListPageAsync]. */
    class Builder internal constructor() {

        private var service: ExternalPaymentServiceAsync? = null
        private var params: ExternalPaymentListParams? = null
        private var response: ExternalPaymentListPageResponse? = null

        internal fun from(externalPaymentListPageAsync: ExternalPaymentListPageAsync) = apply {
            service = externalPaymentListPageAsync.service
            params = externalPaymentListPageAsync.params
            response = externalPaymentListPageAsync.response
        }

        fun service(service: ExternalPaymentServiceAsync) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: ExternalPaymentListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: ExternalPaymentListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [ExternalPaymentListPageAsync].
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
        fun build(): ExternalPaymentListPageAsync =
            ExternalPaymentListPageAsync(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    class AutoPager(private val firstPage: ExternalPaymentListPageAsync) : Flow<ExternalPayment> {

        override suspend fun collect(collector: FlowCollector<ExternalPayment>) {
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

        return /* spotless:off */ other is ExternalPaymentListPageAsync && service == other.service && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, params, response) /* spotless:on */

    override fun toString() =
        "ExternalPaymentListPageAsync{service=$service, params=$params, response=$response}"
}
