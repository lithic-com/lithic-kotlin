// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.lithic.api.core.checkRequired
import com.lithic.api.services.blocking.ManagementOperationService
import java.util.Objects

/** @see [ManagementOperationService.list] */
class ManagementOperationListPage
private constructor(
    private val service: ManagementOperationService,
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

    fun getNextPage(): ManagementOperationListPage? = getNextPageParams()?.let { service.list(it) }

    fun autoPager(): AutoPager = AutoPager(this)

    /** The parameters that were used to request this page. */
    fun params(): ManagementOperationListParams = params

    /** The response that this page was parsed from. */
    fun response(): ManagementOperationListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [ManagementOperationListPage].
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

    /** A builder for [ManagementOperationListPage]. */
    class Builder internal constructor() {

        private var service: ManagementOperationService? = null
        private var params: ManagementOperationListParams? = null
        private var response: ManagementOperationListPageResponse? = null

        internal fun from(managementOperationListPage: ManagementOperationListPage) = apply {
            service = managementOperationListPage.service
            params = managementOperationListPage.params
            response = managementOperationListPage.response
        }

        fun service(service: ManagementOperationService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: ManagementOperationListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: ManagementOperationListPageResponse) = apply {
            this.response = response
        }

        /**
         * Returns an immutable instance of [ManagementOperationListPage].
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
        fun build(): ManagementOperationListPage =
            ManagementOperationListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    class AutoPager(private val firstPage: ManagementOperationListPage) :
        Sequence<ManagementOperationTransaction> {

        override fun iterator(): Iterator<ManagementOperationTransaction> = iterator {
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

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is ManagementOperationListPage && service == other.service && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, params, response) /* spotless:on */

    override fun toString() =
        "ManagementOperationListPage{service=$service, params=$params, response=$response}"
}
