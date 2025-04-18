// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.lithic.api.core.checkRequired
import com.lithic.api.services.blocking.TokenizationService
import java.util.Objects

/** @see [TokenizationService.list] */
class TokenizationListPage
private constructor(
    private val service: TokenizationService,
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

    fun getNextPage(): TokenizationListPage? = getNextPageParams()?.let { service.list(it) }

    fun autoPager(): AutoPager = AutoPager(this)

    /** The parameters that were used to request this page. */
    fun params(): TokenizationListParams = params

    /** The response that this page was parsed from. */
    fun response(): TokenizationListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [TokenizationListPage].
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

    /** A builder for [TokenizationListPage]. */
    class Builder internal constructor() {

        private var service: TokenizationService? = null
        private var params: TokenizationListParams? = null
        private var response: TokenizationListPageResponse? = null

        internal fun from(tokenizationListPage: TokenizationListPage) = apply {
            service = tokenizationListPage.service
            params = tokenizationListPage.params
            response = tokenizationListPage.response
        }

        fun service(service: TokenizationService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: TokenizationListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: TokenizationListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [TokenizationListPage].
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
        fun build(): TokenizationListPage =
            TokenizationListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    class AutoPager(private val firstPage: TokenizationListPage) : Sequence<Tokenization> {

        override fun iterator(): Iterator<Tokenization> = iterator {
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

        return /* spotless:off */ other is TokenizationListPage && service == other.service && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, params, response) /* spotless:on */

    override fun toString() =
        "TokenizationListPage{service=$service, params=$params, response=$response}"
}
