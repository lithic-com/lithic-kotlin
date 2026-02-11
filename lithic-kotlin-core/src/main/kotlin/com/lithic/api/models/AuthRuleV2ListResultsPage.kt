// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.lithic.api.core.AutoPager
import com.lithic.api.core.Page
import com.lithic.api.core.checkRequired
import com.lithic.api.services.blocking.authRules.V2Service
import java.util.Objects

/** @see V2Service.listResults */
class AuthRuleV2ListResultsPage
private constructor(
    private val service: V2Service,
    private val params: AuthRuleV2ListResultsParams,
    private val response: AuthRuleV2ListResultsPageResponse,
) : Page<V2ListResultsResponse> {

    /**
     * Delegates to [AuthRuleV2ListResultsPageResponse], but gracefully handles missing data.
     *
     * @see AuthRuleV2ListResultsPageResponse.data
     */
    fun data(): List<V2ListResultsResponse> = response._data().getNullable("data") ?: emptyList()

    /**
     * Delegates to [AuthRuleV2ListResultsPageResponse], but gracefully handles missing data.
     *
     * @see AuthRuleV2ListResultsPageResponse.hasMore
     */
    fun hasMore(): Boolean? = response._hasMore().getNullable("has_more")

    override fun items(): List<V2ListResultsResponse> = data()

    override fun hasNextPage(): Boolean = items().isNotEmpty()

    fun nextPageParams(): AuthRuleV2ListResultsParams =
        if (params.endingBefore() != null) {
            params
                .toBuilder()
                .endingBefore(
                    items()
                        .first()
                        .accept(
                            object : V2ListResultsResponse.Visitor<String?> {
                                override fun visitAuthorizationResult(
                                    authorizationResult: V2ListResultsResponse.AuthorizationResult
                                ): String? = authorizationResult._token().getNullable("token")

                                override fun visitAuthentication3dsResult(
                                    authentication3dsResult:
                                        V2ListResultsResponse.Authentication3dsResult
                                ): String? = authentication3dsResult._token().getNullable("token")

                                override fun visitTokenizationResult(
                                    tokenizationResult: V2ListResultsResponse.TokenizationResult
                                ): String? = tokenizationResult._token().getNullable("token")

                                override fun visitAchResult(
                                    achResult: V2ListResultsResponse.AchResult
                                ): String? = achResult._token().getNullable("token")
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
                            object : V2ListResultsResponse.Visitor<String?> {
                                override fun visitAuthorizationResult(
                                    authorizationResult: V2ListResultsResponse.AuthorizationResult
                                ): String? = authorizationResult._token().getNullable("token")

                                override fun visitAuthentication3dsResult(
                                    authentication3dsResult:
                                        V2ListResultsResponse.Authentication3dsResult
                                ): String? = authentication3dsResult._token().getNullable("token")

                                override fun visitTokenizationResult(
                                    tokenizationResult: V2ListResultsResponse.TokenizationResult
                                ): String? = tokenizationResult._token().getNullable("token")

                                override fun visitAchResult(
                                    achResult: V2ListResultsResponse.AchResult
                                ): String? = achResult._token().getNullable("token")
                            }
                        )
                )
                .build()
        }

    override fun nextPage(): AuthRuleV2ListResultsPage = service.listResults(nextPageParams())

    fun autoPager(): AutoPager<V2ListResultsResponse> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): AuthRuleV2ListResultsParams = params

    /** The response that this page was parsed from. */
    fun response(): AuthRuleV2ListResultsPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [AuthRuleV2ListResultsPage].
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

    /** A builder for [AuthRuleV2ListResultsPage]. */
    class Builder internal constructor() {

        private var service: V2Service? = null
        private var params: AuthRuleV2ListResultsParams? = null
        private var response: AuthRuleV2ListResultsPageResponse? = null

        internal fun from(authRuleV2ListResultsPage: AuthRuleV2ListResultsPage) = apply {
            service = authRuleV2ListResultsPage.service
            params = authRuleV2ListResultsPage.params
            response = authRuleV2ListResultsPage.response
        }

        fun service(service: V2Service) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: AuthRuleV2ListResultsParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: AuthRuleV2ListResultsPageResponse) = apply {
            this.response = response
        }

        /**
         * Returns an immutable instance of [AuthRuleV2ListResultsPage].
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
        fun build(): AuthRuleV2ListResultsPage =
            AuthRuleV2ListResultsPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is AuthRuleV2ListResultsPage &&
            service == other.service &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, params, response)

    override fun toString() =
        "AuthRuleV2ListResultsPage{service=$service, params=$params, response=$response}"
}
