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
import com.lithic.api.services.async.ExternalPaymentServiceAsync
import java.util.Collections
import java.util.Objects
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.FlowCollector

/** List external payments */
class ExternalPaymentListPageAsync
private constructor(
    private val externalPaymentsService: ExternalPaymentServiceAsync,
    private val params: ExternalPaymentListParams,
    private val response: Response,
) {

    fun response(): Response = response

    fun data(): List<ExternalPayment> = response().data()

    fun hasMore(): Boolean = response().hasMore()

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is ExternalPaymentListPageAsync && externalPaymentsService == other.externalPaymentsService && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(externalPaymentsService, params, response) /* spotless:on */

    override fun toString() =
        "ExternalPaymentListPageAsync{externalPaymentsService=$externalPaymentsService, params=$params, response=$response}"

    fun hasNextPage(): Boolean {
        return !data().isEmpty()
    }

    fun getNextPageParams(): ExternalPaymentListParams? {
        if (!hasNextPage()) {
            return null
        }

        return if (params.endingBefore() != null) {
            params.toBuilder().endingBefore(data().first().token()).build()
        } else {
            params.toBuilder().startingAfter(data().last().token()).build()
        }
    }

    suspend fun getNextPage(): ExternalPaymentListPageAsync? {
        return getNextPageParams()?.let { externalPaymentsService.list(it) }
    }

    fun autoPager(): AutoPager = AutoPager(this)

    companion object {

        fun of(
            externalPaymentsService: ExternalPaymentServiceAsync,
            params: ExternalPaymentListParams,
            response: Response,
        ) = ExternalPaymentListPageAsync(externalPaymentsService, params, response)
    }

    class Response(
        private val data: JsonField<List<ExternalPayment>>,
        private val hasMore: JsonField<Boolean>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("data") data: JsonField<List<ExternalPayment>> = JsonMissing.of(),
            @JsonProperty("has_more") hasMore: JsonField<Boolean> = JsonMissing.of(),
        ) : this(data, hasMore, mutableMapOf())

        fun data(): List<ExternalPayment> = data.getNullable("data") ?: listOf()

        fun hasMore(): Boolean = hasMore.getRequired("has_more")

        @JsonProperty("data") fun _data(): JsonField<List<ExternalPayment>>? = data

        @JsonProperty("has_more") fun _hasMore(): JsonField<Boolean>? = hasMore

        @JsonAnySetter
        private fun putAdditionalProperty(key: String, value: JsonValue) {
            additionalProperties.put(key, value)
        }

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> =
            Collections.unmodifiableMap(additionalProperties)

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

            /**
             * Returns a mutable builder for constructing an instance of
             * [ExternalPaymentListPageAsync].
             */
            fun builder() = Builder()
        }

        class Builder {

            private var data: JsonField<List<ExternalPayment>> = JsonMissing.of()
            private var hasMore: JsonField<Boolean> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(page: Response) = apply {
                this.data = page.data
                this.hasMore = page.hasMore
                this.additionalProperties.putAll(page.additionalProperties)
            }

            fun data(data: List<ExternalPayment>) = data(JsonField.of(data))

            fun data(data: JsonField<List<ExternalPayment>>) = apply { this.data = data }

            fun hasMore(hasMore: Boolean) = hasMore(JsonField.of(hasMore))

            fun hasMore(hasMore: JsonField<Boolean>) = apply { this.hasMore = hasMore }

            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                this.additionalProperties.put(key, value)
            }

            /**
             * Returns an immutable instance of [Response].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Response = Response(data, hasMore, additionalProperties.toMutableMap())
        }
    }

    class AutoPager(private val firstPage: ExternalPaymentListPageAsync) : Flow<ExternalPayment> {

        override suspend fun collect(collector: FlowCollector<ExternalPayment>) {
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
