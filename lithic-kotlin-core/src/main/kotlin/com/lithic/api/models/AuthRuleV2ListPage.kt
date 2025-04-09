// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.lithic.api.services.blocking.authRules.V2Service
import java.util.Objects

/** Lists V2 authorization rules */
class AuthRuleV2ListPage
private constructor(
    private val v2Service: V2Service,
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

        return /* spotless:off */ other is AuthRuleV2ListPage && v2Service == other.v2Service && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(v2Service, params, response) /* spotless:on */

    override fun toString() =
        "AuthRuleV2ListPage{v2Service=$v2Service, params=$params, response=$response}"

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

    fun getNextPage(): AuthRuleV2ListPage? {
        return getNextPageParams()?.let { v2Service.list(it) }
    }

    fun autoPager(): AutoPager = AutoPager(this)

    companion object {

        fun of(
            v2Service: V2Service,
            params: AuthRuleV2ListParams,
            response: AuthRuleV2ListPageResponse,
        ) = AuthRuleV2ListPage(v2Service, params, response)
    }

    class AutoPager(private val firstPage: AuthRuleV2ListPage) : Sequence<V2ListResponse> {

        override fun iterator(): Iterator<V2ListResponse> = iterator {
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
