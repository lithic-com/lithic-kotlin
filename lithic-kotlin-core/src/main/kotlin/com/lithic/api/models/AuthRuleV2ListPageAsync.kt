// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.lithic.api.services.async.authRules.V2ServiceAsync
import java.util.Objects
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.FlowCollector

/** Lists V2 authorization rules */
class AuthRuleV2ListPageAsync
private constructor(
    private val v2Service: V2ServiceAsync,
    private val params: AuthRuleV2ListParams,
    private val response: AuthRuleV2ListPageResponse,
) {

    /** Returns the response that this page was parsed from. */
    fun response(): AuthRuleV2ListPageResponse = response

    /**
     * Delegates to [AuthRuleV2ListPageResponse], but gracefully handles missing data.
     *
     * @see [AuthRuleV2ListPageResponse.data]
     */
    fun data(): List<V2ListResponse> = response._data().getNullable("data") ?: emptyList()

    /**
     * Delegates to [AuthRuleV2ListPageResponse], but gracefully handles missing data.
     *
     * @see [AuthRuleV2ListPageResponse.hasMore]
     */
    fun hasMore(): Boolean? = response._hasMore().getNullable("has_more")

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is AuthRuleV2ListPageAsync && v2Service == other.v2Service && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(v2Service, params, response) /* spotless:on */

    override fun toString() =
        "AuthRuleV2ListPageAsync{v2Service=$v2Service, params=$params, response=$response}"

    fun hasNextPage(): Boolean = data().isNotEmpty()

    fun getNextPageParams(): AuthRuleV2ListParams? {
        if (!hasNextPage()) {
            return null
        }

        return if (params.endingBefore() != null) {
            params.toBuilder().endingBefore(data().first()._token().getNullable("token")).build()
        } else {
            params.toBuilder().startingAfter(data().last()._token().getNullable("token")).build()
        }
    }

    suspend fun getNextPage(): AuthRuleV2ListPageAsync? {
        return getNextPageParams()?.let { v2Service.list(it) }
    }

    fun autoPager(): AutoPager = AutoPager(this)

    companion object {

        fun of(
            v2Service: V2ServiceAsync,
            params: AuthRuleV2ListParams,
            response: AuthRuleV2ListPageResponse,
        ) = AuthRuleV2ListPageAsync(v2Service, params, response)
    }

    class AutoPager(private val firstPage: AuthRuleV2ListPageAsync) : Flow<V2ListResponse> {

        override suspend fun collect(collector: FlowCollector<V2ListResponse>) {
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
