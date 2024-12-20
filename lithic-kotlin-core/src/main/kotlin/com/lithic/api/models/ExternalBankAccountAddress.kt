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
import com.lithic.api.core.toImmutable
import java.util.Objects

@JsonDeserialize(builder = ExternalBankAccountAddress.Builder::class)
@NoAutoDetect
class ExternalBankAccountAddress
private constructor(
    private val address1: JsonField<String>,
    private val address2: JsonField<String>,
    private val city: JsonField<String>,
    private val state: JsonField<String>,
    private val postalCode: JsonField<String>,
    private val country: JsonField<String>,
    private val additionalProperties: Map<String, JsonValue>,
) {

    private var validated: Boolean = false

    fun address1(): String = address1.getRequired("address1")

    fun address2(): String? = address2.getNullable("address2")

    fun city(): String = city.getRequired("city")

    fun state(): String = state.getRequired("state")

    fun postalCode(): String = postalCode.getRequired("postal_code")

    fun country(): String = country.getRequired("country")

    @JsonProperty("address1") @ExcludeMissing fun _address1() = address1

    @JsonProperty("address2") @ExcludeMissing fun _address2() = address2

    @JsonProperty("city") @ExcludeMissing fun _city() = city

    @JsonProperty("state") @ExcludeMissing fun _state() = state

    @JsonProperty("postal_code") @ExcludeMissing fun _postalCode() = postalCode

    @JsonProperty("country") @ExcludeMissing fun _country() = country

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    fun validate(): ExternalBankAccountAddress = apply {
        if (!validated) {
            address1()
            address2()
            city()
            state()
            postalCode()
            country()
            validated = true
        }
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        fun builder() = Builder()
    }

    class Builder {

        private var address1: JsonField<String> = JsonMissing.of()
        private var address2: JsonField<String> = JsonMissing.of()
        private var city: JsonField<String> = JsonMissing.of()
        private var state: JsonField<String> = JsonMissing.of()
        private var postalCode: JsonField<String> = JsonMissing.of()
        private var country: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(externalBankAccountAddress: ExternalBankAccountAddress) = apply {
            this.address1 = externalBankAccountAddress.address1
            this.address2 = externalBankAccountAddress.address2
            this.city = externalBankAccountAddress.city
            this.state = externalBankAccountAddress.state
            this.postalCode = externalBankAccountAddress.postalCode
            this.country = externalBankAccountAddress.country
            additionalProperties(externalBankAccountAddress.additionalProperties)
        }

        fun address1(address1: String) = address1(JsonField.of(address1))

        @JsonProperty("address1")
        @ExcludeMissing
        fun address1(address1: JsonField<String>) = apply { this.address1 = address1 }

        fun address2(address2: String) = address2(JsonField.of(address2))

        @JsonProperty("address2")
        @ExcludeMissing
        fun address2(address2: JsonField<String>) = apply { this.address2 = address2 }

        fun city(city: String) = city(JsonField.of(city))

        @JsonProperty("city")
        @ExcludeMissing
        fun city(city: JsonField<String>) = apply { this.city = city }

        fun state(state: String) = state(JsonField.of(state))

        @JsonProperty("state")
        @ExcludeMissing
        fun state(state: JsonField<String>) = apply { this.state = state }

        fun postalCode(postalCode: String) = postalCode(JsonField.of(postalCode))

        @JsonProperty("postal_code")
        @ExcludeMissing
        fun postalCode(postalCode: JsonField<String>) = apply { this.postalCode = postalCode }

        fun country(country: String) = country(JsonField.of(country))

        @JsonProperty("country")
        @ExcludeMissing
        fun country(country: JsonField<String>) = apply { this.country = country }

        fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
            this.additionalProperties.clear()
            this.additionalProperties.putAll(additionalProperties)
        }

        @JsonAnySetter
        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
            this.additionalProperties.put(key, value)
        }

        fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
            this.additionalProperties.putAll(additionalProperties)
        }

        fun build(): ExternalBankAccountAddress =
            ExternalBankAccountAddress(
                address1,
                address2,
                city,
                state,
                postalCode,
                country,
                additionalProperties.toImmutable(),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is ExternalBankAccountAddress && address1 == other.address1 && address2 == other.address2 && city == other.city && state == other.state && postalCode == other.postalCode && country == other.country && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(address1, address2, city, state, postalCode, country, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "ExternalBankAccountAddress{address1=$address1, address2=$address2, city=$city, state=$state, postalCode=$postalCode, country=$country, additionalProperties=$additionalProperties}"
}
