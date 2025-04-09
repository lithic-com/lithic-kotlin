// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.lithic.api.core.checkRequired
import com.lithic.api.services.async.TokenizationServiceAsync
import java.util.Objects
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.FlowCollector

/** @see [TokenizationServiceAsync.list] */
class TokenizationListPageAsync
private constructor(
    private val service: TokenizationServiceAsync,
    private val params: TokenizationListParams,
    private val response: TokenizationListPageResponse,
) {

    /**
     * Delegates to [TokenizationListPageResponse], but gracefully handles missing data.
     *
     * @see [TokenizationListPageResponse.data]
     */
    fun data(): List<Tokenization> = response._data().getNullable("data") ?: emptyList()

    /**
     * Delegates to [TokenizationListPageResponse], but gracefully handles missing data.
     *
     * @see [TokenizationListPageResponse.hasMore]
     */
    fun hasMore(): Boolean? = response._hasMore().getNullable("has_more")

    fun hasNextPage(): Boolean = data().isNotEmpty()

    fun getNextPageParams(): TokenizationListParams? {
        if (!hasNextPage()) {
            return null
        }

        return if (params.endingBefore() != null) {
            params.toBuilder().endingBefore(data().first()._token().getNullable("token")).build()
        } else {
            params.toBuilder().startingAfter(data().last()._token().getNullable("token")).build()
        }
    }

    suspend fun getNextPage(): TokenizationListPageAsync? =
        getNextPageParams()?.let { service.list(it) }

    fun autoPager(): AutoPager = AutoPager(this)

    /** The parameters that were used to request this page. */
    fun params(): TokenizationListParams = params

    /** The response that this page was parsed from. */
    fun response(): TokenizationListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [TokenizationListPageAsync].
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

    /** A builder for [TokenizationListPageAsync]. */
    class Builder internal constructor() {

        private var service: TokenizationServiceAsync? = null
        private var params: TokenizationListParams? = null
        private var response: TokenizationListPageResponse? = null

        internal fun from(tokenizationListPageAsync: TokenizationListPageAsync) = apply {
            service = tokenizationListPageAsync.service
            params = tokenizationListPageAsync.params
            response = tokenizationListPageAsync.response
        }

        fun service(service: TokenizationServiceAsync) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: TokenizationListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: TokenizationListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [TokenizationListPageAsync].
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
        fun build(): TokenizationListPageAsync =
            TokenizationListPageAsync(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    class AutoPager(private val firstPage: TokenizationListPageAsync) : Flow<Tokenization> {

        override suspend fun collect(collector: FlowCollector<Tokenization>) {
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

        return /* spotless:off */ other is TokenizationListPageAsync && service == other.service && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, params, response) /* spotless:on */

    override fun toString() =
        "TokenizationListPageAsync{service=$service, params=$params, response=$response}"
}
