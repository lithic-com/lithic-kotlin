// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.lithic.api.services.blocking.CardProgramService
import java.util.Objects

/** List card programs. */
class CardProgramListPage
private constructor(
    private val cardProgramsService: CardProgramService,
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

        return /* spotless:off */ other is CardProgramListPage && cardProgramsService == other.cardProgramsService && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(cardProgramsService, params, response) /* spotless:on */

    override fun toString() =
        "CardProgramListPage{cardProgramsService=$cardProgramsService, params=$params, response=$response}"

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

    fun getNextPage(): CardProgramListPage? {
        return getNextPageParams()?.let { cardProgramsService.list(it) }
    }

    fun autoPager(): AutoPager = AutoPager(this)

    companion object {

        fun of(
            cardProgramsService: CardProgramService,
            params: CardProgramListParams,
            response: CardProgramListPageResponse,
        ) = CardProgramListPage(cardProgramsService, params, response)
    }

    class AutoPager(private val firstPage: CardProgramListPage) : Sequence<CardProgram> {

        override fun iterator(): Iterator<CardProgram> = iterator {
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
