// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.lithic.api.core.AutoPagerAsync
import com.lithic.api.core.PageAsync
import com.lithic.api.core.checkRequired
import com.lithic.api.services.async.CardProgramServiceAsync
import java.util.Objects

/** @see CardProgramServiceAsync.list */
class CardProgramListPageAsync
private constructor(
    private val service: CardProgramServiceAsync,
    private val params: CardProgramListParams,
    private val response: CardProgramListPageResponse,
) : PageAsync<CardProgram> {

    /**
     * Delegates to [CardProgramListPageResponse], but gracefully handles missing data.
     *
     * @see CardProgramListPageResponse.data
     */
    fun data(): List<CardProgram> = response._data().getNullable("data") ?: emptyList()

    /**
     * Delegates to [CardProgramListPageResponse], but gracefully handles missing data.
     *
     * @see CardProgramListPageResponse.hasMore
     */
    fun hasMore(): Boolean? = response._hasMore().getNullable("has_more")

    override fun items(): List<CardProgram> = data()

    override fun hasNextPage(): Boolean = items().isNotEmpty()

    fun nextPageParams(): CardProgramListParams =
        if (params.endingBefore() != null) {
            params.toBuilder().endingBefore(items().first()._token().getNullable("token")).build()
        } else {
            params.toBuilder().startingAfter(items().last()._token().getNullable("token")).build()
        }

    override suspend fun nextPage(): CardProgramListPageAsync = service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<CardProgram> = AutoPagerAsync.from(this)

    /** The parameters that were used to request this page. */
    fun params(): CardProgramListParams = params

    /** The response that this page was parsed from. */
    fun response(): CardProgramListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [CardProgramListPageAsync].
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

    /** A builder for [CardProgramListPageAsync]. */
    class Builder internal constructor() {

        private var service: CardProgramServiceAsync? = null
        private var params: CardProgramListParams? = null
        private var response: CardProgramListPageResponse? = null

        internal fun from(cardProgramListPageAsync: CardProgramListPageAsync) = apply {
            service = cardProgramListPageAsync.service
            params = cardProgramListPageAsync.params
            response = cardProgramListPageAsync.response
        }

        fun service(service: CardProgramServiceAsync) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: CardProgramListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: CardProgramListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [CardProgramListPageAsync].
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
        fun build(): CardProgramListPageAsync =
            CardProgramListPageAsync(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is CardProgramListPageAsync && service == other.service && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, params, response) /* spotless:on */

    override fun toString() =
        "CardProgramListPageAsync{service=$service, params=$params, response=$response}"
}
