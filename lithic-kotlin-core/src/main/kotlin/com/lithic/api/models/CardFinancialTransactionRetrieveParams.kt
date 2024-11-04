// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.google.common.collect.ArrayListMultimap
import com.google.common.collect.ListMultimap
import com.lithic.api.core.NoAutoDetect
import com.lithic.api.core.toImmutable
import com.lithic.api.models.*
import java.util.Objects

class CardFinancialTransactionRetrieveParams
constructor(
    private val cardToken: String,
    private val financialTransactionToken: String,
    private val additionalHeaders: Map<String, List<String>>,
    private val additionalQueryParams: Map<String, List<String>>,
) {

    fun cardToken(): String = cardToken

    fun financialTransactionToken(): String = financialTransactionToken

    internal fun getHeaders(): Map<String, List<String>> = additionalHeaders

    internal fun getQueryParams(): Map<String, List<String>> = additionalQueryParams

    fun getPathParam(index: Int): String {
        return when (index) {
            0 -> cardToken
            1 -> financialTransactionToken
            else -> ""
        }
    }

    fun _additionalHeaders(): Map<String, List<String>> = additionalHeaders

    fun _additionalQueryParams(): Map<String, List<String>> = additionalQueryParams

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is CardFinancialTransactionRetrieveParams && this.cardToken == other.cardToken && this.financialTransactionToken == other.financialTransactionToken && this.additionalHeaders == other.additionalHeaders && this.additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int {
        return /* spotless:off */ Objects.hash(cardToken, financialTransactionToken, additionalHeaders, additionalQueryParams) /* spotless:on */
    }

    override fun toString() =
        "CardFinancialTransactionRetrieveParams{cardToken=$cardToken, financialTransactionToken=$financialTransactionToken, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"

    fun toBuilder() = Builder().from(this)

    companion object {

        fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var cardToken: String? = null
        private var financialTransactionToken: String? = null
        private var additionalHeaders: ListMultimap<String, String> = ArrayListMultimap.create()
        private var additionalQueryParams: ListMultimap<String, String> = ArrayListMultimap.create()

        internal fun from(
            cardFinancialTransactionRetrieveParams: CardFinancialTransactionRetrieveParams
        ) = apply {
            this.cardToken = cardFinancialTransactionRetrieveParams.cardToken
            this.financialTransactionToken =
                cardFinancialTransactionRetrieveParams.financialTransactionToken
            additionalHeaders(cardFinancialTransactionRetrieveParams.additionalHeaders)
            additionalQueryParams(cardFinancialTransactionRetrieveParams.additionalQueryParams)
        }

        fun cardToken(cardToken: String) = apply { this.cardToken = cardToken }

        fun financialTransactionToken(financialTransactionToken: String) = apply {
            this.financialTransactionToken = financialTransactionToken
        }

        fun additionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun putAdditionalHeader(name: String, value: String) = apply {
            additionalHeaders.put(name, value)
        }

        fun putAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.putAll(name, values)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            additionalHeaders.forEach(::putAdditionalHeaders)
        }

        fun removeAdditionalHeader(name: String) = apply { additionalHeaders.removeAll(name) }

        fun additionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun putAdditionalQueryParam(key: String, value: String) = apply {
            additionalQueryParams.put(key, value)
        }

        fun putAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.putAll(key, values)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                additionalQueryParams.forEach(::putAdditionalQueryParams)
            }

        fun removeAdditionalQueryParam(key: String) = apply { additionalQueryParams.removeAll(key) }

        fun build(): CardFinancialTransactionRetrieveParams =
            CardFinancialTransactionRetrieveParams(
                checkNotNull(cardToken) { "`cardToken` is required but was not set" },
                checkNotNull(financialTransactionToken) {
                    "`financialTransactionToken` is required but was not set"
                },
                additionalHeaders
                    .asMap()
                    .mapValues { it.value.toList().toImmutable() }
                    .toImmutable(),
                additionalQueryParams
                    .asMap()
                    .mapValues { it.value.toList().toImmutable() }
                    .toImmutable(),
            )
    }
}
