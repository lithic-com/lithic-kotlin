// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.lithic.api.core.AutoPagerAsync
import com.lithic.api.core.PageAsync
import com.lithic.api.core.checkRequired
import com.lithic.api.services.async.AccountActivityServiceAsync
import java.util.Objects

/** @see AccountActivityServiceAsync.list */
class AccountActivityListPageAsync
private constructor(
    private val service: AccountActivityServiceAsync,
    private val params: AccountActivityListParams,
    private val response: AccountActivityListPageResponse,
) : PageAsync<AccountActivityListResponse> {

    /**
     * Delegates to [AccountActivityListPageResponse], but gracefully handles missing data.
     *
     * @see AccountActivityListPageResponse.data
     */
    fun data(): List<AccountActivityListResponse> =
        response._data().getNullable("data") ?: emptyList()

    /**
     * Delegates to [AccountActivityListPageResponse], but gracefully handles missing data.
     *
     * @see AccountActivityListPageResponse.hasMore
     */
    fun hasMore(): Boolean? = response._hasMore().getNullable("has_more")

    override fun items(): List<AccountActivityListResponse> = data()

    override fun hasNextPage(): Boolean = items().isNotEmpty()

    fun nextPageParams(): AccountActivityListParams =
        if (params.endingBefore() != null) {
            params
                .toBuilder()
                .endingBefore(
                    items()
                        .first()
                        .accept(
                            object : AccountActivityListResponse.Visitor<String?> {
                                override fun visitInternal(
                                    internal_: AccountActivityListResponse.FinancialTransaction
                                ): String? = internal_._token().getNullable("token")

                                override fun visitTransfer(
                                    transfer: BookTransferResponse
                                ): String? = transfer._token().getNullable("token")

                                override fun visitCard(
                                    card: AccountActivityListResponse.CardTransaction
                                ): String? = card._token().getNullable("token")

                                override fun visitPayment(payment: Payment): String? =
                                    payment._token().getNullable("token")

                                override fun visitExternalPayment(
                                    externalPayment: ExternalPayment
                                ): String? = externalPayment._token().getNullable("token")

                                override fun visitManagementOperation(
                                    managementOperation: ManagementOperationTransaction
                                ): String? = managementOperation._token().getNullable("token")
                            }
                        )
                )
                .build()
        } else {
            params
                .toBuilder()
                .startingAfter(
                    items()
                        .last()
                        .accept(
                            object : AccountActivityListResponse.Visitor<String?> {
                                override fun visitInternal(
                                    internal_: AccountActivityListResponse.FinancialTransaction
                                ): String? = internal_._token().getNullable("token")

                                override fun visitTransfer(
                                    transfer: BookTransferResponse
                                ): String? = transfer._token().getNullable("token")

                                override fun visitCard(
                                    card: AccountActivityListResponse.CardTransaction
                                ): String? = card._token().getNullable("token")

                                override fun visitPayment(payment: Payment): String? =
                                    payment._token().getNullable("token")

                                override fun visitExternalPayment(
                                    externalPayment: ExternalPayment
                                ): String? = externalPayment._token().getNullable("token")

                                override fun visitManagementOperation(
                                    managementOperation: ManagementOperationTransaction
                                ): String? = managementOperation._token().getNullable("token")
                            }
                        )
                )
                .build()
        }

    override suspend fun nextPage(): AccountActivityListPageAsync = service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<AccountActivityListResponse> = AutoPagerAsync.from(this)

    /** The parameters that were used to request this page. */
    fun params(): AccountActivityListParams = params

    /** The response that this page was parsed from. */
    fun response(): AccountActivityListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [AccountActivityListPageAsync].
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

    /** A builder for [AccountActivityListPageAsync]. */
    class Builder internal constructor() {

        private var service: AccountActivityServiceAsync? = null
        private var params: AccountActivityListParams? = null
        private var response: AccountActivityListPageResponse? = null

        internal fun from(accountActivityListPageAsync: AccountActivityListPageAsync) = apply {
            service = accountActivityListPageAsync.service
            params = accountActivityListPageAsync.params
            response = accountActivityListPageAsync.response
        }

        fun service(service: AccountActivityServiceAsync) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: AccountActivityListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: AccountActivityListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [AccountActivityListPageAsync].
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
        fun build(): AccountActivityListPageAsync =
            AccountActivityListPageAsync(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is AccountActivityListPageAsync &&
            service == other.service &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, params, response)

    override fun toString() =
        "AccountActivityListPageAsync{service=$service, params=$params, response=$response}"
}
