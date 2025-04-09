// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.lithic.api.services.async.TokenizationServiceAsync
import java.util.Objects
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.FlowCollector

/** List card tokenizations */
class TokenizationListPageAsync
private constructor(
    private val tokenizationsService: TokenizationServiceAsync,
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

        return /* spotless:off */ other is TokenizationListPageAsync && tokenizationsService == other.tokenizationsService && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(tokenizationsService, params, response) /* spotless:on */

    override fun toString() =
        "TokenizationListPageAsync{tokenizationsService=$tokenizationsService, params=$params, response=$response}"

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

    suspend fun getNextPage(): TokenizationListPageAsync? {
        return getNextPageParams()?.let { tokenizationsService.list(it) }
    }

    fun autoPager(): AutoPager = AutoPager(this)

    companion object {

        fun of(
            tokenizationsService: TokenizationServiceAsync,
            params: TokenizationListParams,
            response: TokenizationListPageResponse,
        ) = TokenizationListPageAsync(tokenizationsService, params, response)
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
}
