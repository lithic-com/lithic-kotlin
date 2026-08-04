// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lithic.api.core.JsonValue
import com.lithic.api.core.jsonMapper
import com.lithic.api.errors.LithicInvalidDataException
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.EnumSource

internal class ConditionalValueTest {

    @Test
    fun ofRegex() {
        val regex = "string"

        val conditionalValue = ConditionalValue.ofRegex(regex)

        assertThat(conditionalValue.regex()).isEqualTo(regex)
        assertThat(conditionalValue.long()).isNull()
        assertThat(conditionalValue.double()).isNull()
        assertThat(conditionalValue.listOfStrings()).isNull()
        assertThat(conditionalValue.timestamp()).isNull()
    }

    @Test
    fun ofRegexRoundtrip() {
        val jsonMapper = jsonMapper()
        val conditionalValue = ConditionalValue.ofRegex("string")

        val roundtrippedConditionalValue =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(conditionalValue),
                jacksonTypeRef<ConditionalValue>(),
            )

        assertThat(roundtrippedConditionalValue).isEqualTo(conditionalValue)
    }

    @Test
    fun ofLong() {
        val long = 0L

        val conditionalValue = ConditionalValue.ofLong(long)

        assertThat(conditionalValue.regex()).isNull()
        assertThat(conditionalValue.long()).isEqualTo(long)
        assertThat(conditionalValue.double()).isNull()
        assertThat(conditionalValue.listOfStrings()).isNull()
        assertThat(conditionalValue.timestamp()).isNull()
    }

    @Test
    fun ofLongRoundtrip() {
        val jsonMapper = jsonMapper()
        val conditionalValue = ConditionalValue.ofLong(0L)

        val roundtrippedConditionalValue =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(conditionalValue),
                jacksonTypeRef<ConditionalValue>(),
            )

        assertThat(roundtrippedConditionalValue).isEqualTo(conditionalValue)
    }

    @Test
    fun ofDouble() {
        val double = 0.0

        val conditionalValue = ConditionalValue.ofDouble(double)

        assertThat(conditionalValue.regex()).isNull()
        assertThat(conditionalValue.long()).isNull()
        assertThat(conditionalValue.double()).isEqualTo(double)
        assertThat(conditionalValue.listOfStrings()).isNull()
        assertThat(conditionalValue.timestamp()).isNull()
    }

    @Test
    fun ofDoubleRoundtrip() {
        val jsonMapper = jsonMapper()
        val conditionalValue = ConditionalValue.ofDouble(0.0)

        val roundtrippedConditionalValue =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(conditionalValue),
                jacksonTypeRef<ConditionalValue>(),
            )

        assertThat(roundtrippedConditionalValue).isEqualTo(conditionalValue)
    }

    @Test
    fun ofListOfStrings() {
        val listOfStrings = listOf("string")

        val conditionalValue = ConditionalValue.ofListOfStrings(listOfStrings)

        assertThat(conditionalValue.regex()).isNull()
        assertThat(conditionalValue.long()).isNull()
        assertThat(conditionalValue.double()).isNull()
        assertThat(conditionalValue.listOfStrings()).isEqualTo(listOfStrings)
        assertThat(conditionalValue.timestamp()).isNull()
    }

    @Test
    fun ofListOfStringsRoundtrip() {
        val jsonMapper = jsonMapper()
        val conditionalValue = ConditionalValue.ofListOfStrings(listOf("string"))

        val roundtrippedConditionalValue =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(conditionalValue),
                jacksonTypeRef<ConditionalValue>(),
            )

        assertThat(roundtrippedConditionalValue).isEqualTo(conditionalValue)
    }

    @Test
    fun ofTimestamp() {
        val timestamp = OffsetDateTime.parse("2019-12-27T18:11:19.117Z")

        val conditionalValue = ConditionalValue.ofTimestamp(timestamp)

        assertThat(conditionalValue.regex()).isNull()
        assertThat(conditionalValue.long()).isNull()
        assertThat(conditionalValue.double()).isNull()
        assertThat(conditionalValue.listOfStrings()).isNull()
        assertThat(conditionalValue.timestamp()).isEqualTo(timestamp)
    }

    @Test
    fun ofTimestampRoundtrip() {
        val jsonMapper = jsonMapper()
        val conditionalValue =
            ConditionalValue.ofTimestamp(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))

        val roundtrippedConditionalValue =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(conditionalValue),
                jacksonTypeRef<ConditionalValue>(),
            )

        assertThat(roundtrippedConditionalValue).isEqualTo(conditionalValue)
    }

    enum class IncompatibleJsonShapeTestCase(val value: JsonValue) {
        BOOLEAN(JsonValue.from(false)),
        OBJECT(JsonValue.from(mapOf("invalid" to "object"))),
    }

    @ParameterizedTest
    @EnumSource
    fun incompatibleJsonShapeDeserializesToUnknown(testCase: IncompatibleJsonShapeTestCase) {
        val conditionalValue =
            jsonMapper().convertValue(testCase.value, jacksonTypeRef<ConditionalValue>())

        val e = assertThrows<LithicInvalidDataException> { conditionalValue.validate() }
        assertThat(e).hasMessageStartingWith("Unknown ")
    }
}
