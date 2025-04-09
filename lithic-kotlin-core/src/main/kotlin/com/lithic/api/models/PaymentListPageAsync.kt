// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.lithic.api.services.async.PaymentServiceAsync
import java.util.Objects
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.FlowCollector

/** List all the payments for the provided search criteria. */
class PaymentListPageAsync
private constructor(
    private val paymentsService: PaymentServiceAsync,
    private val params: PaymentListParams,
    private val response: PaymentListPageResponse,
) {

    /** Returns the response that this page was parsed from. */
    fun response(): PaymentListPageResponse = response

    /**
     * Delegates to [PaymentListPageResponse], but gracefully handles missing data.
     *
     * @see [PaymentListPageResponse.data]
     */
    fun data(): List<Payment> = response._data().getNullable("data") ?: emptyList()

    /**
     * Delegates to [PaymentListPageResponse], but gracefully handles missing data.
     *
     * @see [PaymentListPageResponse.hasMore]
     */
    fun hasMore(): Boolean? = response._hasMore().getNullable("has_more")

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is PaymentListPageAsync && paymentsService == other.paymentsService && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(paymentsService, params, response) /* spotless:on */

    override fun toString() =
        "PaymentListPageAsync{paymentsService=$paymentsService, params=$params, response=$response}"

    fun hasNextPage(): Boolean = data().isNotEmpty()

    fun getNextPageParams(): PaymentListParams? {
        if (!hasNextPage()) {
            return null
        }

        return if (params.endingBefore() != null) {
            params.toBuilder().endingBefore(data().first()._token().getNullable("token")).build()
        } else {
            params.toBuilder().startingAfter(data().last()._token().getNullable("token")).build()
        }
    }

    suspend fun getNextPage(): PaymentListPageAsync? {
        return getNextPageParams()?.let { paymentsService.list(it) }
    }

    fun autoPager(): AutoPager = AutoPager(this)

    companion object {

        fun of(
            paymentsService: PaymentServiceAsync,
            params: PaymentListParams,
            response: PaymentListPageResponse,
        ) = PaymentListPageAsync(paymentsService, params, response)
    }

    class AutoPager(private val firstPage: PaymentListPageAsync) : Flow<Payment> {

        override suspend fun collect(collector: FlowCollector<Payment>) {
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
}
