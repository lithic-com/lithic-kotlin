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
import com.lithic.api.services.async.AuthRuleServiceAsync
import java.util.Objects
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.FlowCollector

class AuthRuleListPageAsync
private constructor(
    private val authRulesService: AuthRuleServiceAsync,
    private val params: AuthRuleListParams,
    private val response: Response,
) {

    fun response(): Response = response

    fun data(): List<AuthRule> = response().data()

    fun page(): Long = response().page()

    fun totalEntries(): Long = response().totalEntries()

    fun totalPages(): Long = response().totalPages()

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is AuthRuleListPageAsync &&
            this.authRulesService == other.authRulesService &&
            this.params == other.params &&
            this.response == other.response
    }

    override fun hashCode(): Int {
        return Objects.hash(
            authRulesService,
            params,
            response,
        )
    }

    override fun toString() =
        "AuthRuleListPageAsync{authRulesService=$authRulesService, params=$params, response=$response}"

    fun hasNextPage(): Boolean {
        if (data().isEmpty()) {
            return false
        }

        return page() < totalPages()
    }

    fun getNextPageParams(): AuthRuleListParams? {
        if (!hasNextPage()) {
            return null
        }

        return AuthRuleListParams.builder().from(params).page((params.page() ?: 0) + 1).build()
    }

    suspend fun getNextPage(): AuthRuleListPageAsync? {
        return getNextPageParams()?.let { authRulesService.list(it) }
    }

    fun autoPager(): AutoPager = AutoPager(this)

    companion object {

        fun of(
            authRulesService: AuthRuleServiceAsync,
            params: AuthRuleListParams,
            response: Response
        ) =
            AuthRuleListPageAsync(
                authRulesService,
                params,
                response,
            )
    }

    @JsonDeserialize(builder = Response.Builder::class)
    @NoAutoDetect
    class Response
    constructor(
        private val data: JsonField<List<AuthRule>>,
        private val page: JsonField<Long>,
        private val totalEntries: JsonField<Long>,
        private val totalPages: JsonField<Long>,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var validated: Boolean = false

        fun data(): List<AuthRule> = data.getNullable("data") ?: listOf()

        fun page(): Long = page.getRequired("page")

        fun totalEntries(): Long = totalEntries.getRequired("total_entries")

        fun totalPages(): Long = totalPages.getRequired("total_pages")

        @JsonProperty("data") fun _data(): JsonField<List<AuthRule>>? = data

        @JsonProperty("page") fun _page(): JsonField<Long>? = page

        @JsonProperty("total_entries") fun _totalEntries(): JsonField<Long>? = totalEntries

        @JsonProperty("total_pages") fun _totalPages(): JsonField<Long>? = totalPages

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun validate(): Response = apply {
            if (!validated) {
                data().map { it.validate() }
                page()
                totalEntries()
                totalPages()
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
                this.page == other.page &&
                this.totalEntries == other.totalEntries &&
                this.totalPages == other.totalPages &&
                this.additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int {
            return Objects.hash(
                data,
                page,
                totalEntries,
                totalPages,
                additionalProperties,
            )
        }

        override fun toString() =
            "AuthRuleListPageAsync.Response{data=$data, page=$page, totalEntries=$totalEntries, totalPages=$totalPages, additionalProperties=$additionalProperties}"

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var data: JsonField<List<AuthRule>> = JsonMissing.of()
            private var page: JsonField<Long> = JsonMissing.of()
            private var totalEntries: JsonField<Long> = JsonMissing.of()
            private var totalPages: JsonField<Long> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(page: Response) = apply {
                this.data = page.data
                this.page = page.page
                this.totalEntries = page.totalEntries
                this.totalPages = page.totalPages
                this.additionalProperties.putAll(page.additionalProperties)
            }

            fun data(data: List<AuthRule>) = data(JsonField.of(data))

            @JsonProperty("data")
            fun data(data: JsonField<List<AuthRule>>) = apply { this.data = data }

            fun page(page: Long) = page(JsonField.of(page))

            @JsonProperty("page") fun page(page: JsonField<Long>) = apply { this.page = page }

            fun totalEntries(totalEntries: Long) = totalEntries(JsonField.of(totalEntries))

            @JsonProperty("total_entries")
            fun totalEntries(totalEntries: JsonField<Long>) = apply {
                this.totalEntries = totalEntries
            }

            fun totalPages(totalPages: Long) = totalPages(JsonField.of(totalPages))

            @JsonProperty("total_pages")
            fun totalPages(totalPages: JsonField<Long>) = apply { this.totalPages = totalPages }

            @JsonAnySetter
            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                this.additionalProperties.put(key, value)
            }

            fun build() =
                Response(
                    data,
                    page,
                    totalEntries,
                    totalPages,
                    additionalProperties.toUnmodifiable(),
                )
        }
    }

    class AutoPager
    constructor(
        private val firstPage: AuthRuleListPageAsync,
    ) : Flow<AuthRule> {

        override suspend fun collect(collector: FlowCollector<AuthRule>) {
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
