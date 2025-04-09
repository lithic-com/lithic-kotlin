// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.lithic.api.services.async.ExternalBankAccountServiceAsync
import java.util.Objects
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.FlowCollector

/** List all the external bank accounts for the provided search criteria. */
class ExternalBankAccountListPageAsync
private constructor(
    private val externalBankAccountsService: ExternalBankAccountServiceAsync,
    private val params: ExternalBankAccountListParams,
    private val response: ExternalBankAccountListPageResponse,
) {

    /** Returns the response that this page was parsed from. */
    fun response(): ExternalBankAccountListPageResponse = response

    /**
     * Delegates to [ExternalBankAccountListPageResponse], but gracefully handles missing data.
     *
     * @see [ExternalBankAccountListPageResponse.data]
     */
    fun data(): List<ExternalBankAccountListResponse> =
        response._data().getNullable("data") ?: emptyList()

    /**
     * Delegates to [ExternalBankAccountListPageResponse], but gracefully handles missing data.
     *
     * @see [ExternalBankAccountListPageResponse.hasMore]
     */
    fun hasMore(): Boolean? = response._hasMore().getNullable("has_more")

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is ExternalBankAccountListPageAsync && externalBankAccountsService == other.externalBankAccountsService && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(externalBankAccountsService, params, response) /* spotless:on */

    override fun toString() =
        "ExternalBankAccountListPageAsync{externalBankAccountsService=$externalBankAccountsService, params=$params, response=$response}"

    fun hasNextPage(): Boolean = data().isNotEmpty()

    fun getNextPageParams(): ExternalBankAccountListParams? {
        if (!hasNextPage()) {
            return null
        }

        return if (params.endingBefore() != null) {
            params.toBuilder().endingBefore(data().first()._token().getNullable("token")).build()
        } else {
            params.toBuilder().startingAfter(data().last()._token().getNullable("token")).build()
        }
    }

    suspend fun getNextPage(): ExternalBankAccountListPageAsync? {
        return getNextPageParams()?.let { externalBankAccountsService.list(it) }
    }

    fun autoPager(): AutoPager = AutoPager(this)

    companion object {

        fun of(
            externalBankAccountsService: ExternalBankAccountServiceAsync,
            params: ExternalBankAccountListParams,
            response: ExternalBankAccountListPageResponse,
        ) = ExternalBankAccountListPageAsync(externalBankAccountsService, params, response)
    }

    class AutoPager(private val firstPage: ExternalBankAccountListPageAsync) :
        Flow<ExternalBankAccountListResponse> {

        override suspend fun collect(collector: FlowCollector<ExternalBankAccountListResponse>) {
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
