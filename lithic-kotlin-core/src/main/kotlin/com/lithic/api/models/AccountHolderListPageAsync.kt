// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.lithic.api.core.ExcludeMissing
import com.lithic.api.core.JsonField
import com.lithic.api.core.JsonMissing
import com.lithic.api.core.JsonValue
import com.lithic.api.core.NoAutoDetect
import com.lithic.api.core.toUnmodifiable
import com.lithic.api.services.async.AccountHolderServiceAsync
import java.util.Objects
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.FlowCollector

class AccountHolderListPageAsync
private constructor(
    private val accountHoldersService: AccountHolderServiceAsync,
    private val params: AccountHolderListParams,
    private val response: Response,
) {

    fun response(): Response = response

    fun data(): List<AccountHolder> = response().data()

    fun hasMore(): Boolean = response().hasMore()

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is AccountHolderListPageAsync &&
            this.accountHoldersService == other.accountHoldersService &&
            this.params == other.params &&
            this.response == other.response
    }

    override fun hashCode(): Int {
        return Objects.hash(
            accountHoldersService,
            params,
            response,
        )
    }

    override fun toString() =
        "AccountHolderListPageAsync{accountHoldersService=$accountHoldersService, params=$params, response=$response}"

    fun hasNextPage(): Boolean {
        return !data().isEmpty()
    }

    fun getNextPageParams(): AccountHolderListParams? {
        return null
    }

    suspend fun getNextPage(): AccountHolderListPageAsync? {
        return getNextPageParams()?.let { accountHoldersService.list(it) }
    }

    fun autoPager(): AutoPager = AutoPager(this)

    companion object {

        fun of(
            accountHoldersService: AccountHolderServiceAsync,
            params: AccountHolderListParams,
            response: Response
        ) =
            AccountHolderListPageAsync(
                accountHoldersService,
                params,
                response,
            )
    }

    @JsonDeserialize(builder = Response.Builder::class)
    @NoAutoDetect
    class Response
    constructor(
        private val data: JsonField<List<AccountHolder>>,
        private val hasMore: JsonField<Boolean>,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var validated: Boolean = false

        fun data(): List<AccountHolder> = data.getNullable("data") ?: listOf()

        fun hasMore(): Boolean = hasMore.getRequired("has_more")

        @JsonProperty("data") fun _data(): JsonField<List<AccountHolder>>? = data

        @JsonProperty("has_more") fun _hasMore(): JsonField<Boolean>? = hasMore

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun validate(): Response = apply {
            if (!validated) {
                data().map { it.validate() }
                hasMore()
                validated = true
            }
        }

        fun toBuilder() = Builder().from(this)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Response &&
                this.data == other.data &&
                this.hasMore == other.hasMore &&
                this.additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int {
            return Objects.hash(
                data,
                hasMore,
                additionalProperties,
            )
        }

        override fun toString() =
            "AccountHolderListPageAsync.Response{data=$data, hasMore=$hasMore, additionalProperties=$additionalProperties}"

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var data: JsonField<List<AccountHolder>> = JsonMissing.of()
            private var hasMore: JsonField<Boolean> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(page: Response) = apply {
                this.data = page.data
                this.hasMore = page.hasMore
                this.additionalProperties.putAll(page.additionalProperties)
            }

            fun data(data: List<AccountHolder>) = data(JsonField.of(data))

            @JsonProperty("data")
            fun data(data: JsonField<List<AccountHolder>>) = apply { this.data = data }

            fun hasMore(hasMore: Boolean) = hasMore(JsonField.of(hasMore))

            @JsonProperty("has_more")
            fun hasMore(hasMore: JsonField<Boolean>) = apply { this.hasMore = hasMore }

            @JsonAnySetter
            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                this.additionalProperties.put(key, value)
            }

            fun build() =
                Response(
                    data,
                    hasMore,
                    additionalProperties.toUnmodifiable(),
                )
        }
    }

    class AutoPager
    constructor(
        private val firstPage: AccountHolderListPageAsync,
    ) : Flow<AccountHolder> {

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
