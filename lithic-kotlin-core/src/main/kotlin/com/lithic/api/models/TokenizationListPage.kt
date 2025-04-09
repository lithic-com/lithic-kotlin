// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.lithic.api.services.blocking.TokenizationService
import java.util.Objects

/** List card tokenizations */
class TokenizationListPage
private constructor(
    private val tokenizationsService: TokenizationService,
    private val params: TokenizationListParams,
    private val response: TokenizationListPageResponse,
) {

    /** Returns the response that this page was parsed from. */
    fun response(): TokenizationListPageResponse = response

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

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is TokenizationListPage && tokenizationsService == other.tokenizationsService && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(tokenizationsService, params, response) /* spotless:on */

    override fun toString() =
        "TokenizationListPage{tokenizationsService=$tokenizationsService, params=$params, response=$response}"

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

    fun getNextPage(): TokenizationListPage? {
        return getNextPageParams()?.let { tokenizationsService.list(it) }
    }

    fun autoPager(): AutoPager = AutoPager(this)

    companion object {

        fun of(
            tokenizationsService: TokenizationService,
            params: TokenizationListParams,
            response: TokenizationListPageResponse,
        ) = TokenizationListPage(tokenizationsService, params, response)
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
}
