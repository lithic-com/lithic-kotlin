// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.lithic.api.services.blocking.ExternalPaymentService
import java.util.Objects

/** List external payments */
class ExternalPaymentListPage
private constructor(
    private val externalPaymentsService: ExternalPaymentService,
    private val params: ExternalPaymentListParams,
    private val response: ExternalPaymentListPageResponse,
) {

    /** Returns the response that this page was parsed from. */
    fun response(): ExternalPaymentListPageResponse = response

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

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is ExternalPaymentListPage && externalPaymentsService == other.externalPaymentsService && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(externalPaymentsService, params, response) /* spotless:on */

    override fun toString() =
        "ExternalPaymentListPage{externalPaymentsService=$externalPaymentsService, params=$params, response=$response}"

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

    fun getNextPage(): ExternalPaymentListPage? {
        return getNextPageParams()?.let { externalPaymentsService.list(it) }
    }

    fun autoPager(): AutoPager = AutoPager(this)

    companion object {

        fun of(
            externalPaymentsService: ExternalPaymentService,
            params: ExternalPaymentListParams,
            response: ExternalPaymentListPageResponse,
        ) = ExternalPaymentListPage(externalPaymentsService, params, response)
    }

    class AutoPager(private val firstPage: ExternalPaymentListPage) : Sequence<ExternalPayment> {

        override fun iterator(): Iterator<ExternalPayment> = iterator {
            var page = firstPage
            var index = 0
            while (true) {
                while (index < page.data().size) {
                    yield(page.data()[index++])
                }
                page = page.getNextPage() ?: break
                index = 0
            }
        }
    }
}
