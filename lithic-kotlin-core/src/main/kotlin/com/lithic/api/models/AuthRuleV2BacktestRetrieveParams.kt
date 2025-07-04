// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.lithic.api.core.Params
import com.lithic.api.core.checkRequired
import com.lithic.api.core.http.Headers
import com.lithic.api.core.http.QueryParams
import java.util.Objects

/**
 * Returns the backtest results of an Auth rule (if available).
 *
 * Backtesting is an asynchronous process that requires time to complete. If a customer retrieves
 * the backtest results using this endpoint before the report is fully generated, the response will
 * return null for `results.current_version` and `results.draft_version`. Customers are advised to
 * wait for the backtest creation process to complete (as indicated by the webhook event
 * auth_rules.backtest_report.created) before retrieving results from this endpoint.
 *
 * Backtesting is an asynchronous process, while the backtest is being processed, results will not
 * be available which will cause `results.current_version` and `results.draft_version` objects to
 * contain `null`. The entries in `results` will also always represent the configuration of the rule
 * at the time requests are made to this endpoint. For example, the results for `current_version` in
 * the served backtest report will be consistent with which version of the rule is currently
 * activated in the respective event stream, regardless of which version of the rule was active in
 * the event stream at the time a backtest is requested.
 */
class AuthRuleV2BacktestRetrieveParams
private constructor(
    private val authRuleToken: String,
    private val authRuleBacktestToken: String?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun authRuleToken(): String = authRuleToken

    fun authRuleBacktestToken(): String? = authRuleBacktestToken

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [AuthRuleV2BacktestRetrieveParams].
         *
         * The following fields are required:
         * ```kotlin
         * .authRuleToken()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [AuthRuleV2BacktestRetrieveParams]. */
    class Builder internal constructor() {

        private var authRuleToken: String? = null
        private var authRuleBacktestToken: String? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        internal fun from(authRuleV2BacktestRetrieveParams: AuthRuleV2BacktestRetrieveParams) =
            apply {
                authRuleToken = authRuleV2BacktestRetrieveParams.authRuleToken
                authRuleBacktestToken = authRuleV2BacktestRetrieveParams.authRuleBacktestToken
                additionalHeaders = authRuleV2BacktestRetrieveParams.additionalHeaders.toBuilder()
                additionalQueryParams =
                    authRuleV2BacktestRetrieveParams.additionalQueryParams.toBuilder()
            }

        fun authRuleToken(authRuleToken: String) = apply { this.authRuleToken = authRuleToken }

        fun authRuleBacktestToken(authRuleBacktestToken: String?) = apply {
            this.authRuleBacktestToken = authRuleBacktestToken
        }

        fun additionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun additionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun putAdditionalHeader(name: String, value: String) = apply {
            additionalHeaders.put(name, value)
        }

        fun putAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.put(name, values)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun replaceAdditionalHeaders(name: String, value: String) = apply {
            additionalHeaders.replace(name, value)
        }

        fun replaceAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.replace(name, values)
        }

        fun replaceAllAdditionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun replaceAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun removeAdditionalHeaders(name: String) = apply { additionalHeaders.remove(name) }

        fun removeAllAdditionalHeaders(names: Set<String>) = apply {
            additionalHeaders.removeAll(names)
        }

        fun additionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun additionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun putAdditionalQueryParam(key: String, value: String) = apply {
            additionalQueryParams.put(key, value)
        }

        fun putAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.put(key, values)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.putAll(additionalQueryParams)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.putAll(additionalQueryParams)
            }

        fun replaceAdditionalQueryParams(key: String, value: String) = apply {
            additionalQueryParams.replace(key, value)
        }

        fun replaceAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.replace(key, values)
        }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.replaceAll(additionalQueryParams)
        }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.replaceAll(additionalQueryParams)
            }

        fun removeAdditionalQueryParams(key: String) = apply { additionalQueryParams.remove(key) }

        fun removeAllAdditionalQueryParams(keys: Set<String>) = apply {
            additionalQueryParams.removeAll(keys)
        }

        /**
         * Returns an immutable instance of [AuthRuleV2BacktestRetrieveParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```kotlin
         * .authRuleToken()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): AuthRuleV2BacktestRetrieveParams =
            AuthRuleV2BacktestRetrieveParams(
                checkRequired("authRuleToken", authRuleToken),
                authRuleBacktestToken,
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _pathParam(index: Int): String =
        when (index) {
            0 -> authRuleToken
            1 -> authRuleBacktestToken ?: ""
            else -> ""
        }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is AuthRuleV2BacktestRetrieveParams && authRuleToken == other.authRuleToken && authRuleBacktestToken == other.authRuleBacktestToken && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(authRuleToken, authRuleBacktestToken, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() =
        "AuthRuleV2BacktestRetrieveParams{authRuleToken=$authRuleToken, authRuleBacktestToken=$authRuleBacktestToken, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
