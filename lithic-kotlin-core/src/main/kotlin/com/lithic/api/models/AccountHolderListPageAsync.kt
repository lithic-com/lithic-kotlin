// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.lithic.api.services.async.AccountHolderServiceAsync
import java.util.Objects
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.FlowCollector

/** Get a list of individual or business account holders and their KYC or KYB evaluation status. */
class AccountHolderListPageAsync
private constructor(
    private val accountHoldersService: AccountHolderServiceAsync,
    private val params: AccountHolderListParams,
    private val response: AccountHolderListPageResponse,
) {

    /** Returns the response that this page was parsed from. */
    fun response(): AccountHolderListPageResponse = response

    /**
     * Delegates to [AccountHolderListPageResponse], but gracefully handles missing data.
     *
     * @see [AccountHolderListPageResponse.data]
     */
    fun data(): List<AccountHolder> = response._data().getNullable("data") ?: emptyList()

    /**
     * Delegates to [AccountHolderListPageResponse], but gracefully handles missing data.
     *
     * @see [AccountHolderListPageResponse.hasMore]
     */
    fun hasMore(): Boolean? = response._hasMore().getNullable("has_more")

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is AccountHolderListPageAsync && accountHoldersService == other.accountHoldersService && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(accountHoldersService, params, response) /* spotless:on */

    override fun toString() =
        "AccountHolderListPageAsync{accountHoldersService=$accountHoldersService, params=$params, response=$response}"

    fun hasNextPage(): Boolean = data().isNotEmpty()

    fun getNextPageParams(): AccountHolderListParams? = null

    suspend fun getNextPage(): AccountHolderListPageAsync? {
        return getNextPageParams()?.let { accountHoldersService.list(it) }
    }

    fun autoPager(): AutoPager = AutoPager(this)

    companion object {

        fun of(
            accountHoldersService: AccountHolderServiceAsync,
            params: AccountHolderListParams,
            response: AccountHolderListPageResponse,
        ) = AccountHolderListPageAsync(accountHoldersService, params, response)
    }

    class AutoPager(private val firstPage: AccountHolderListPageAsync) : Flow<AccountHolder> {

        override suspend fun collect(collector: FlowCollector<AccountHolder>) {
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
