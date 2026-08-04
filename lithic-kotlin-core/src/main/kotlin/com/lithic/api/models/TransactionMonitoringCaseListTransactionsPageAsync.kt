// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.lithic.api.core.AutoPagerAsync
import com.lithic.api.core.PageAsync
import com.lithic.api.core.checkRequired
import com.lithic.api.services.async.transactionMonitoring.CaseServiceAsync
import java.util.Objects

/** @see CaseServiceAsync.listTransactions */
class TransactionMonitoringCaseListTransactionsPageAsync
private constructor(
    private val service: CaseServiceAsync,
    private val params: TransactionMonitoringCaseListTransactionsParams,
    private val response: TransactionMonitoringCaseListTransactionsPageResponse,
) : PageAsync<CaseTransaction> {

    /**
     * Delegates to [TransactionMonitoringCaseListTransactionsPageResponse], but gracefully handles
     * missing data.
     *
     * @see TransactionMonitoringCaseListTransactionsPageResponse.data
     */
    fun data(): List<CaseTransaction> = response._data().getNullable("data") ?: emptyList()

    /**
     * Delegates to [TransactionMonitoringCaseListTransactionsPageResponse], but gracefully handles
     * missing data.
     *
     * @see TransactionMonitoringCaseListTransactionsPageResponse.hasMore
     */
    fun hasMore(): Boolean? = response._hasMore().getNullable("has_more")

    override fun items(): List<CaseTransaction> = data()

    override fun hasNextPage(): Boolean = items().isNotEmpty()

    fun nextPageParams(): TransactionMonitoringCaseListTransactionsParams =
        if (params.endingBefore() != null) {
            params
                .toBuilder()
                .endingBefore(
                    items()
                        .first()
                        .accept(
                            object : CaseTransaction.Visitor<String?> {
                                override fun visitCard(
                                    card: CaseTransaction.CardCaseTransaction
                                ): String? = card._token().getNullable("token")

                                override fun visitPayment(
                                    payment: CaseTransaction.PaymentCaseTransaction
                                ): String? = payment._token().getNullable("token")
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
                            object : CaseTransaction.Visitor<String?> {
                                override fun visitCard(
                                    card: CaseTransaction.CardCaseTransaction
                                ): String? = card._token().getNullable("token")

                                override fun visitPayment(
                                    payment: CaseTransaction.PaymentCaseTransaction
                                ): String? = payment._token().getNullable("token")
                            }
                        )
                )
                .build()
        }

    override suspend fun nextPage(): TransactionMonitoringCaseListTransactionsPageAsync =
        service.listTransactions(nextPageParams())

    fun autoPager(): AutoPagerAsync<CaseTransaction> = AutoPagerAsync.from(this)

    /** The parameters that were used to request this page. */
    fun params(): TransactionMonitoringCaseListTransactionsParams = params

    /** The response that this page was parsed from. */
    fun response(): TransactionMonitoringCaseListTransactionsPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [TransactionMonitoringCaseListTransactionsPageAsync].
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

    /** A builder for [TransactionMonitoringCaseListTransactionsPageAsync]. */
    class Builder internal constructor() {

        private var service: CaseServiceAsync? = null
        private var params: TransactionMonitoringCaseListTransactionsParams? = null
        private var response: TransactionMonitoringCaseListTransactionsPageResponse? = null

        internal fun from(
            transactionMonitoringCaseListTransactionsPageAsync:
                TransactionMonitoringCaseListTransactionsPageAsync
        ) = apply {
            service = transactionMonitoringCaseListTransactionsPageAsync.service
            params = transactionMonitoringCaseListTransactionsPageAsync.params
            response = transactionMonitoringCaseListTransactionsPageAsync.response
        }

        fun service(service: CaseServiceAsync) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: TransactionMonitoringCaseListTransactionsParams) = apply {
            this.params = params
        }

        /** The response that this page was parsed from. */
        fun response(response: TransactionMonitoringCaseListTransactionsPageResponse) = apply {
            this.response = response
        }

        /**
         * Returns an immutable instance of [TransactionMonitoringCaseListTransactionsPageAsync].
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
        fun build(): TransactionMonitoringCaseListTransactionsPageAsync =
            TransactionMonitoringCaseListTransactionsPageAsync(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is TransactionMonitoringCaseListTransactionsPageAsync &&
            service == other.service &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, params, response)

    override fun toString() =
        "TransactionMonitoringCaseListTransactionsPageAsync{service=$service, params=$params, response=$response}"
}
