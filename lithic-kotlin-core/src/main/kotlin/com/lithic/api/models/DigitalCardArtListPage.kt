// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.lithic.api.services.blocking.DigitalCardArtService
import java.util.Objects

/** List digital card art. */
class DigitalCardArtListPage
private constructor(
    private val digitalCardArtService: DigitalCardArtService,
    private val params: DigitalCardArtListParams,
    private val response: DigitalCardArtListPageResponse,
) {

    /** Returns the response that this page was parsed from. */
    fun response(): DigitalCardArtListPageResponse = response

    /**
     * Delegates to [DigitalCardArtListPageResponse], but gracefully handles missing data.
     *
     * @see [DigitalCardArtListPageResponse.data]
     */
    fun data(): List<DigitalCardArt> = response._data().getNullable("data") ?: emptyList()

    /**
     * Delegates to [DigitalCardArtListPageResponse], but gracefully handles missing data.
     *
     * @see [DigitalCardArtListPageResponse.hasMore]
     */
    fun hasMore(): Boolean? = response._hasMore().getNullable("has_more")

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is DigitalCardArtListPage && digitalCardArtService == other.digitalCardArtService && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(digitalCardArtService, params, response) /* spotless:on */

    override fun toString() =
        "DigitalCardArtListPage{digitalCardArtService=$digitalCardArtService, params=$params, response=$response}"

    fun hasNextPage(): Boolean = data().isNotEmpty()

    fun getNextPageParams(): DigitalCardArtListParams? {
        if (!hasNextPage()) {
            return null
        }

        return if (params.endingBefore() != null) {
            params.toBuilder().endingBefore(data().first()._token().getNullable("token")).build()
        } else {
            params.toBuilder().startingAfter(data().last()._token().getNullable("token")).build()
        }
    }

    fun getNextPage(): DigitalCardArtListPage? {
        return getNextPageParams()?.let { digitalCardArtService.list(it) }
    }

    fun autoPager(): AutoPager = AutoPager(this)

    companion object {

        fun of(
            digitalCardArtService: DigitalCardArtService,
            params: DigitalCardArtListParams,
            response: DigitalCardArtListPageResponse,
        ) = DigitalCardArtListPage(digitalCardArtService, params, response)
    }

    class AutoPager(private val firstPage: DigitalCardArtListPage) : Sequence<DigitalCardArt> {

        override fun iterator(): Iterator<DigitalCardArt> = iterator {
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
