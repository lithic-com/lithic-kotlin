// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.lithic.api.core.checkRequired
import com.lithic.api.services.blocking.AccountHolderService
import java.util.Objects

/** @see [AccountHolderService.list] */
class AccountHolderListPage
private constructor(
    private val service: AccountHolderService,
    private val params: AccountHolderListParams,
    private val response: AccountHolderListPageResponse,
) {

    /**
     * Delegates to [AccountHolderListPageResponse], but gracefully handles missing data.
     *
     * @see [AccountHolderListPageResponse.data]
     */
    fun data(): List<AccountHolder> = response._data().getNullable("data") ?: emptyList()

    /**
     * Delegates to [AccountHolderListPageResponse], but gracefully handles missing data.
     *
     * @see [AccountHolderListPageResponse.hasMore]
     */
    fun hasMore(): Boolean? = response._hasMore().getNullable("has_more")

    fun hasNextPage(): Boolean = data().isNotEmpty()

    fun getNextPageParams(): AccountHolderListParams? = null

    fun getNextPage(): AccountHolderListPage? = getNextPageParams()?.let { service.list(it) }

    fun autoPager(): AutoPager = AutoPager(this)

    /** The parameters that were used to request this page. */
    fun params(): AccountHolderListParams = params

    /** The response that this page was parsed from. */
    fun response(): AccountHolderListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [AccountHolderListPage].
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

    /** A builder for [AccountHolderListPage]. */
    class Builder internal constructor() {

        private var service: AccountHolderService? = null
        private var params: AccountHolderListParams? = null
        private var response: AccountHolderListPageResponse? = null

        internal fun from(accountHolderListPage: AccountHolderListPage) = apply {
            service = accountHolderListPage.service
            params = accountHolderListPage.params
            response = accountHolderListPage.response
        }

        fun service(service: AccountHolderService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: AccountHolderListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: AccountHolderListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [AccountHolderListPage].
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
        fun build(): AccountHolderListPage =
            AccountHolderListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    class AutoPager(private val firstPage: AccountHolderListPage) : Sequence<AccountHolder> {

        override fun iterator(): Iterator<AccountHolder> = iterator {
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

        return /* spotless:off */ other is AccountHolderListPage && service == other.service && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, params, response) /* spotless:on */

    override fun toString() =
        "AccountHolderListPage{service=$service, params=$params, response=$response}"
}
