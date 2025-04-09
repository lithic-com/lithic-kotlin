// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.lithic.api.core.checkRequired
import com.lithic.api.services.blocking.CardProgramService
import java.util.Objects

/** @see [CardProgramService.list] */
class CardProgramListPage
private constructor(
    private val service: CardProgramService,
    private val params: CardProgramListParams,
    private val response: CardProgramListPageResponse,
) {

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

    fun getNextPage(): CardProgramListPage? = getNextPageParams()?.let { service.list(it) }

    fun autoPager(): AutoPager = AutoPager(this)

    /** The parameters that were used to request this page. */
    fun params(): CardProgramListParams = params

    /** The response that this page was parsed from. */
    fun response(): CardProgramListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [CardProgramListPage].
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

    /** A builder for [CardProgramListPage]. */
    class Builder internal constructor() {

        private var service: CardProgramService? = null
        private var params: CardProgramListParams? = null
        private var response: CardProgramListPageResponse? = null

        internal fun from(cardProgramListPage: CardProgramListPage) = apply {
            service = cardProgramListPage.service
            params = cardProgramListPage.params
            response = cardProgramListPage.response
        }

        fun service(service: CardProgramService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: CardProgramListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: CardProgramListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [CardProgramListPage].
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
        fun build(): CardProgramListPage =
            CardProgramListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
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

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is CardProgramListPage && service == other.service && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, params, response) /* spotless:on */

    override fun toString() =
        "CardProgramListPage{service=$service, params=$params, response=$response}"
}
