// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.lithic.api.core.checkRequired
import com.lithic.api.services.async.AccountHolderServiceAsync
import java.util.Objects
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.FlowCollector

/** @see [AccountHolderServiceAsync.list] */
class AccountHolderListPageAsync
private constructor(
    private val service: AccountHolderServiceAsync,
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

    suspend fun getNextPage(): AccountHolderListPageAsync? =
        getNextPageParams()?.let { service.list(it) }

    fun autoPager(): AutoPager = AutoPager(this)

    /** The parameters that were used to request this page. */
    fun params(): AccountHolderListParams = params

    /** The response that this page was parsed from. */
    fun response(): AccountHolderListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [AccountHolderListPageAsync].
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

    /** A builder for [AccountHolderListPageAsync]. */
    class Builder internal constructor() {

        private var service: AccountHolderServiceAsync? = null
        private var params: AccountHolderListParams? = null
        private var response: AccountHolderListPageResponse? = null

        internal fun from(accountHolderListPageAsync: AccountHolderListPageAsync) = apply {
            service = accountHolderListPageAsync.service
            params = accountHolderListPageAsync.params
            response = accountHolderListPageAsync.response
        }

        fun service(service: AccountHolderServiceAsync) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: AccountHolderListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: AccountHolderListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [AccountHolderListPageAsync].
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
        fun build(): AccountHolderListPageAsync =
            AccountHolderListPageAsync(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    class AutoPager(private val firstPage: AccountHolderListPageAsync) : Flow<AccountHolder> {

        override suspend fun collect(collector: FlowCollector<AccountHolder>) {
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

        return /* spotless:off */ other is AccountHolderListPageAsync && service == other.service && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, params, response) /* spotless:on */

    override fun toString() =
        "AccountHolderListPageAsync{service=$service, params=$params, response=$response}"
}
