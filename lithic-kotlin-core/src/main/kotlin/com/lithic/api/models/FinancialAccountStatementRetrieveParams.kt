// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.lithic.api.core.NoAutoDetect
import com.lithic.api.core.toImmutable
import com.lithic.api.models.*
import java.util.Objects

class FinancialAccountStatementRetrieveParams
constructor(
    private val financialAccountToken: String,
    private val statementToken: String,
    private val additionalQueryParams: Map<String, List<String>>,
    private val additionalHeaders: Map<String, List<String>>,
) {

    fun financialAccountToken(): String = financialAccountToken

    fun statementToken(): String = statementToken

    internal fun getQueryParams(): Map<String, List<String>> = additionalQueryParams

    internal fun getHeaders(): Map<String, List<String>> = additionalHeaders

    fun getPathParam(index: Int): String {
        return when (index) {
            0 -> financialAccountToken
            1 -> statementToken
            else -> ""
        }
    }

    fun _additionalQueryParams(): Map<String, List<String>> = additionalQueryParams

    fun _additionalHeaders(): Map<String, List<String>> = additionalHeaders

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is FinancialAccountStatementRetrieveParams && this.financialAccountToken == other.financialAccountToken && this.statementToken == other.statementToken && this.additionalQueryParams == other.additionalQueryParams && this.additionalHeaders == other.additionalHeaders /* spotless:on */
    }

    override fun hashCode(): Int {
        return /* spotless:off */ Objects.hash(financialAccountToken, statementToken, additionalQueryParams, additionalHeaders) /* spotless:on */
    }

    override fun toString() =
        "FinancialAccountStatementRetrieveParams{financialAccountToken=$financialAccountToken, statementToken=$statementToken, additionalQueryParams=$additionalQueryParams, additionalHeaders=$additionalHeaders}"

    fun toBuilder() = Builder().from(this)

    companion object {

        fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var financialAccountToken: String? = null
        private var statementToken: String? = null
        private var additionalQueryParams: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalHeaders: MutableMap<String, MutableList<String>> = mutableMapOf()

        internal fun from(
            financialAccountStatementRetrieveParams: FinancialAccountStatementRetrieveParams
        ) = apply {
            this.financialAccountToken =
                financialAccountStatementRetrieveParams.financialAccountToken
            this.statementToken = financialAccountStatementRetrieveParams.statementToken
            additionalQueryParams(financialAccountStatementRetrieveParams.additionalQueryParams)
            additionalHeaders(financialAccountStatementRetrieveParams.additionalHeaders)
        }

        /** Globally unique identifier for financial account. */
        fun financialAccountToken(financialAccountToken: String) = apply {
            this.financialAccountToken = financialAccountToken
        }

        /** Globally unique identifier for statements. */
        fun statementToken(statementToken: String) = apply { this.statementToken = statementToken }

        fun additionalQueryParams(additionalQueryParams: Map<String, List<String>>) = apply {
            this.additionalQueryParams.clear()
            putAllQueryParams(additionalQueryParams)
        }

        fun putQueryParam(name: String, value: String) = apply {
            this.additionalQueryParams.getOrPut(name) { mutableListOf() }.add(value)
        }

        fun putQueryParams(name: String, values: Iterable<String>) = apply {
            this.additionalQueryParams.getOrPut(name) { mutableListOf() }.addAll(values)
        }

        fun putAllQueryParams(additionalQueryParams: Map<String, Iterable<String>>) = apply {
            additionalQueryParams.forEach(this::putQueryParams)
        }

        fun removeQueryParam(name: String) = apply {
            this.additionalQueryParams.put(name, mutableListOf())
        }

        fun additionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.clear()
            putAllHeaders(additionalHeaders)
        }

        fun putHeader(name: String, value: String) = apply {
            this.additionalHeaders.getOrPut(name) { mutableListOf() }.add(value)
        }

        fun putHeaders(name: String, values: Iterable<String>) = apply {
            this.additionalHeaders.getOrPut(name) { mutableListOf() }.addAll(values)
        }

        fun putAllHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            additionalHeaders.forEach(this::putHeaders)
        }

        fun removeHeader(name: String) = apply { this.additionalHeaders.put(name, mutableListOf()) }

        fun build(): FinancialAccountStatementRetrieveParams =
            FinancialAccountStatementRetrieveParams(
                checkNotNull(financialAccountToken) {
                    "`financialAccountToken` is required but was not set"
                },
                checkNotNull(statementToken) { "`statementToken` is required but was not set" },
                additionalQueryParams.mapValues { it.value.toImmutable() }.toImmutable(),
                additionalHeaders.mapValues { it.value.toImmutable() }.toImmutable(),
            )
    }
}
