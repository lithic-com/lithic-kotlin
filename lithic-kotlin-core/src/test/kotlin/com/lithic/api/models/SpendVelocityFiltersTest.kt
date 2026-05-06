// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lithic.api.core.JsonValue
import com.lithic.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SpendVelocityFiltersTest {

    @Test
    fun create() {
        val spendVelocityFilters =
            SpendVelocityFilters.builder()
                .addExcludeCountry("USD")
                .addExcludeMcc("5542")
                .addIncludeCountry("USD")
                .addIncludeMcc("5542")
                .addIncludePanEntryMode(VelocityLimitFilters.IncludePanEntryMode.AUTO_ENTRY)
                .excludeTags(
                    SpendVelocityFilters.ExcludeTags.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .includeTags(
                    SpendVelocityFilters.IncludeTags.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .build()

        assertThat(spendVelocityFilters.excludeCountries()).containsExactly("USD")
        assertThat(spendVelocityFilters.excludeMccs()).containsExactly("5542")
        assertThat(spendVelocityFilters.includeCountries()).containsExactly("USD")
        assertThat(spendVelocityFilters.includeMccs()).containsExactly("5542")
        assertThat(spendVelocityFilters.includePanEntryModes())
            .containsExactly(VelocityLimitFilters.IncludePanEntryMode.AUTO_ENTRY)
        assertThat(spendVelocityFilters.excludeTags())
            .isEqualTo(
                SpendVelocityFilters.ExcludeTags.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
        assertThat(spendVelocityFilters.includeTags())
            .isEqualTo(
                SpendVelocityFilters.IncludeTags.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val spendVelocityFilters =
            SpendVelocityFilters.builder()
                .addExcludeCountry("USD")
                .addExcludeMcc("5542")
                .addIncludeCountry("USD")
                .addIncludeMcc("5542")
                .addIncludePanEntryMode(VelocityLimitFilters.IncludePanEntryMode.AUTO_ENTRY)
                .excludeTags(
                    SpendVelocityFilters.ExcludeTags.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .includeTags(
                    SpendVelocityFilters.IncludeTags.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .build()

        val roundtrippedSpendVelocityFilters =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(spendVelocityFilters),
                jacksonTypeRef<SpendVelocityFilters>(),
            )

        assertThat(roundtrippedSpendVelocityFilters).isEqualTo(spendVelocityFilters)
    }
}
