// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lithic.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AddressUpdateTest {

    @Test
    fun create() {
        val addressUpdate =
            AddressUpdate.builder()
                .address1("123 Old Forest Way")
                .address2("address2")
                .city("Omaha")
                .country("USA")
                .postalCode("68022")
                .state("NE")
                .build()

        assertThat(addressUpdate.address1()).isEqualTo("123 Old Forest Way")
        assertThat(addressUpdate.address2()).isEqualTo("address2")
        assertThat(addressUpdate.city()).isEqualTo("Omaha")
        assertThat(addressUpdate.country()).isEqualTo("USA")
        assertThat(addressUpdate.postalCode()).isEqualTo("68022")
        assertThat(addressUpdate.state()).isEqualTo("NE")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val addressUpdate =
            AddressUpdate.builder()
                .address1("123 Old Forest Way")
                .address2("address2")
                .city("Omaha")
                .country("USA")
                .postalCode("68022")
                .state("NE")
                .build()

        val roundtrippedAddressUpdate =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(addressUpdate),
                jacksonTypeRef<AddressUpdate>(),
            )

        assertThat(roundtrippedAddressUpdate).isEqualTo(addressUpdate)
    }
}
