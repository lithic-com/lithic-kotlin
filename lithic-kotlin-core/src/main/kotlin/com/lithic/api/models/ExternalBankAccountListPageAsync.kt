// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.lithic.api.core.AutoPagerAsync
import com.lithic.api.core.PageAsync
import com.lithic.api.core.checkRequired
import com.lithic.api.services.async.ExternalBankAccountServiceAsync
import java.util.Objects

/** @see ExternalBankAccountServiceAsync.list */
class ExternalBankAccountListPageAsync
private constructor(
    private val service: ExternalBankAccountServiceAsync,
    private val params: ExternalBankAccountListParams,
    private val response: ExternalBankAccountListPageResponse,
) : PageAsync<ExternalBankAccountListResponse> {

    /**
     * Delegates to [ExternalBankAccountListPageResponse], but gracefully handles missing data.
     *
     * @see ExternalBankAccountListPageResponse.data
     */
    fun data(): List<ExternalBankAccountListResponse> =
        response._data().getNullable("data") ?: emptyList()

    /**
     * Delegates to [ExternalBankAccountListPageResponse], but gracefully handles missing data.
     *
     * @see ExternalBankAccountListPageResponse.hasMore
     */
    fun hasMore(): Boolean? = response._hasMore().getNullable("has_more")

    override fun items(): List<ExternalBankAccountListResponse> = data()

    override fun hasNextPage(): Boolean = items().isNotEmpty()

    fun nextPageParams(): ExternalBankAccountListParams =
        if (params.endingBefore() != null) {
            params.toBuilder().endingBefore(items().first()._token().getNullable("token")).build()
        } else {
            params.toBuilder().startingAfter(items().last()._token().getNullable("token")).build()
        }

    override suspend fun nextPage(): ExternalBankAccountListPageAsync =
        service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<ExternalBankAccountListResponse> = AutoPagerAsync.from(this)

    /** The parameters that were used to request this page. */
    fun params(): ExternalBankAccountListParams = params

    /** The response that this page was parsed from. */
    fun response(): ExternalBankAccountListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [ExternalBankAccountListPageAsync].
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

    /** A builder for [ExternalBankAccountListPageAsync]. */
    class Builder internal constructor() {

        private var service: ExternalBankAccountServiceAsync? = null
        private var params: ExternalBankAccountListParams? = null
        private var response: ExternalBankAccountListPageResponse? = null

        internal fun from(externalBankAccountListPageAsync: ExternalBankAccountListPageAsync) =
            apply {
                service = externalBankAccountListPageAsync.service
                params = externalBankAccountListPageAsync.params
                response = externalBankAccountListPageAsync.response
            }

        fun service(service: ExternalBankAccountServiceAsync) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: ExternalBankAccountListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: ExternalBankAccountListPageResponse) = apply {
            this.response = response
        }

        /**
         * Returns an immutable instance of [ExternalBankAccountListPageAsync].
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
        fun build(): ExternalBankAccountListPageAsync =
            ExternalBankAccountListPageAsync(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is ExternalBankAccountListPageAsync && service == other.service && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, params, response) /* spotless:on */

    override fun toString() =
        "ExternalBankAccountListPageAsync{service=$service, params=$params, response=$response}"
}
