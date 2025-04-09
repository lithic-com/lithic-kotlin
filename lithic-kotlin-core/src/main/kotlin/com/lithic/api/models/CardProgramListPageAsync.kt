// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.lithic.api.services.async.CardProgramServiceAsync
import java.util.Objects
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.FlowCollector

/** List card programs. */
class CardProgramListPageAsync
private constructor(
    private val cardProgramsService: CardProgramServiceAsync,
    private val params: CardProgramListParams,
    private val response: CardProgramListPageResponse,
) {

    /** Returns the response that this page was parsed from. */
    fun response(): CardProgramListPageResponse = response

    /**
     * Delegates to [CardProgramListPageResponse], but gracefully handles missing data.
     *
     * @see [CardProgramListPageResponse.data]
     */
    fun data(): List<CardProgram> = response._data().getNullable("data") ?: emptyList()

    /**
     * Delegates to [CardProgramListPageResponse], but gracefully handles missing data.
     *
     * @see [CardProgramListPageResponse.hasMore]
     */
    fun hasMore(): Boolean? = response._hasMore().getNullable("has_more")

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is CardProgramListPageAsync && cardProgramsService == other.cardProgramsService && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(cardProgramsService, params, response) /* spotless:on */

    override fun toString() =
        "CardProgramListPageAsync{cardProgramsService=$cardProgramsService, params=$params, response=$response}"

    fun hasNextPage(): Boolean = data().isNotEmpty()

    fun getNextPageParams(): CardProgramListParams? {
        if (!hasNextPage()) {
            return null
        }

        return if (params.endingBefore() != null) {
            params.toBuilder().endingBefore(data().first()._token().getNullable("token")).build()
        } else {
            params.toBuilder().startingAfter(data().last()._token().getNullable("token")).build()
        }
    }

    suspend fun getNextPage(): CardProgramListPageAsync? {
        return getNextPageParams()?.let { cardProgramsService.list(it) }
    }

    fun autoPager(): AutoPager = AutoPager(this)

    companion object {

        fun of(
            cardProgramsService: CardProgramServiceAsync,
            params: CardProgramListParams,
            response: CardProgramListPageResponse,
        ) = CardProgramListPageAsync(cardProgramsService, params, response)
    }

    class AutoPager(private val firstPage: CardProgramListPageAsync) : Flow<CardProgram> {

        override suspend fun collect(collector: FlowCollector<CardProgram>) {
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
