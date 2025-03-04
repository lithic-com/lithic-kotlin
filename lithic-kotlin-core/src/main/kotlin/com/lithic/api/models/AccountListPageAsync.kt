// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.lithic.api.core.ExcludeMissing
import com.lithic.api.core.JsonField
import com.lithic.api.core.JsonMissing
import com.lithic.api.core.JsonValue
import com.lithic.api.core.NoAutoDetect
import com.lithic.api.core.immutableEmptyMap
import com.lithic.api.core.toImmutable
import com.lithic.api.services.async.AccountServiceAsync
import java.util.Objects
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.FlowCollector

/** List account configurations. */
class AccountListPageAsync
private constructor(
    private val accountsService: AccountServiceAsync,
    private val params: AccountListParams,
    private val response: Response,
) {

    fun response(): Response = response

    fun data(): List<Account> = response().data()

    fun hasMore(): Boolean = response().hasMore()

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is AccountListPageAsync && accountsService == other.accountsService && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(accountsService, params, response) /* spotless:on */

    override fun toString() =
        "AccountListPageAsync{accountsService=$accountsService, params=$params, response=$response}"

    fun hasNextPage(): Boolean {
        return !data().isEmpty()
    }

    fun getNextPageParams(): AccountListParams? {
        if (!hasNextPage()) {
            return null
        }

        return if (params.endingBefore() != null) {
            AccountListParams.builder().from(params).endingBefore(data().first().token()).build()
        } else {
            AccountListParams.builder().from(params).startingAfter(data().last().token()).build()
        }
    }

    suspend fun getNextPage(): AccountListPageAsync? {
        return getNextPageParams()?.let { accountsService.list(it) }
    }

    fun autoPager(): AutoPager = AutoPager(this)

    companion object {

        fun of(
            accountsService: AccountServiceAsync,
            params: AccountListParams,
            response: Response,
        ) = AccountListPageAsync(accountsService, params, response)
    }

    @NoAutoDetect
    class Response
    @JsonCreator
    constructor(
        @JsonProperty("data") private val data: JsonField<List<Account>> = JsonMissing.of(),
        @JsonProperty("has_more") private val hasMore: JsonField<Boolean> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        fun data(): List<Account> = data.getNullable("data") ?: listOf()

        fun hasMore(): Boolean = hasMore.getRequired("has_more")

        @JsonProperty("data") fun _data(): JsonField<List<Account>>? = data

        @JsonProperty("has_more") fun _hasMore(): JsonField<Boolean>? = hasMore

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): Response = apply {
            if (validated) {
                return@apply
            }

            data().map { it.validate() }
            hasMore()
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Response && data == other.data && hasMore == other.hasMore && additionalProperties == other.additionalProperties /* spotless:on */
        }

        override fun hashCode(): Int = /* spotless:off */ Objects.hash(data, hasMore, additionalProperties) /* spotless:on */

        override fun toString() =
            "Response{data=$data, hasMore=$hasMore, additionalProperties=$additionalProperties}"

        companion object {

            /** Returns a mutable builder for constructing an instance of [AccountListPageAsync]. */
            fun builder() = Builder()
        }

        class Builder {

            private var data: JsonField<List<Account>> = JsonMissing.of()
            private var hasMore: JsonField<Boolean> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(page: Response) = apply {
                this.data = page.data
                this.hasMore = page.hasMore
                this.additionalProperties.putAll(page.additionalProperties)
            }

            fun data(data: List<Account>) = data(JsonField.of(data))

            fun data(data: JsonField<List<Account>>) = apply { this.data = data }

            fun hasMore(hasMore: Boolean) = hasMore(JsonField.of(hasMore))

            fun hasMore(hasMore: JsonField<Boolean>) = apply { this.hasMore = hasMore }

            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                this.additionalProperties.put(key, value)
            }

            fun build() = Response(data, hasMore, additionalProperties.toImmutable())
        }
    }

    class AutoPager(private val firstPage: AccountListPageAsync) : Flow<Account> {

        override suspend fun collect(collector: FlowCollector<Account>) {
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
