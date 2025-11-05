// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lithic.api.core.JsonValue
import com.lithic.api.core.jsonMapper
import com.lithic.api.errors.LithicInvalidDataException
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.EnumSource

internal class VelocityLimitParamsPeriodWindowTest {

    @Test
    fun ofTrailingWindowObject() {
        val trailingWindowObject =
            VelocityLimitParamsPeriodWindow.TrailingWindowObject.builder()
                .duration(10L)
                .type(VelocityLimitParamsPeriodWindow.TrailingWindowObject.Type.CUSTOM)
                .build()

        val velocityLimitParamsPeriodWindow =
            VelocityLimitParamsPeriodWindow.ofTrailingWindowObject(trailingWindowObject)

        assertThat(velocityLimitParamsPeriodWindow.trailingWindowObject())
            .isEqualTo(trailingWindowObject)
        assertThat(velocityLimitParamsPeriodWindow.fixedWindowDay()).isNull()
        assertThat(velocityLimitParamsPeriodWindow.fixedWindowWeek()).isNull()
        assertThat(velocityLimitParamsPeriodWindow.fixedWindowMonth()).isNull()
        assertThat(velocityLimitParamsPeriodWindow.fixedWindowYear()).isNull()
    }

    @Test
    fun ofTrailingWindowObjectRoundtrip() {
        val jsonMapper = jsonMapper()
        val velocityLimitParamsPeriodWindow =
            VelocityLimitParamsPeriodWindow.ofTrailingWindowObject(
                VelocityLimitParamsPeriodWindow.TrailingWindowObject.builder()
                    .duration(10L)
                    .type(VelocityLimitParamsPeriodWindow.TrailingWindowObject.Type.CUSTOM)
                    .build()
            )

        val roundtrippedVelocityLimitParamsPeriodWindow =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(velocityLimitParamsPeriodWindow),
                jacksonTypeRef<VelocityLimitParamsPeriodWindow>(),
            )

        assertThat(roundtrippedVelocityLimitParamsPeriodWindow)
            .isEqualTo(velocityLimitParamsPeriodWindow)
    }

    @Test
    fun ofFixedWindowDay() {
        val fixedWindowDay =
            VelocityLimitParamsPeriodWindow.FixedWindowDay.builder()
                .type(VelocityLimitParamsPeriodWindow.FixedWindowDay.Type.DAY)
                .build()

        val velocityLimitParamsPeriodWindow =
            VelocityLimitParamsPeriodWindow.ofFixedWindowDay(fixedWindowDay)

        assertThat(velocityLimitParamsPeriodWindow.trailingWindowObject()).isNull()
        assertThat(velocityLimitParamsPeriodWindow.fixedWindowDay()).isEqualTo(fixedWindowDay)
        assertThat(velocityLimitParamsPeriodWindow.fixedWindowWeek()).isNull()
        assertThat(velocityLimitParamsPeriodWindow.fixedWindowMonth()).isNull()
        assertThat(velocityLimitParamsPeriodWindow.fixedWindowYear()).isNull()
    }

    @Test
    fun ofFixedWindowDayRoundtrip() {
        val jsonMapper = jsonMapper()
        val velocityLimitParamsPeriodWindow =
            VelocityLimitParamsPeriodWindow.ofFixedWindowDay(
                VelocityLimitParamsPeriodWindow.FixedWindowDay.builder()
                    .type(VelocityLimitParamsPeriodWindow.FixedWindowDay.Type.DAY)
                    .build()
            )

        val roundtrippedVelocityLimitParamsPeriodWindow =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(velocityLimitParamsPeriodWindow),
                jacksonTypeRef<VelocityLimitParamsPeriodWindow>(),
            )

        assertThat(roundtrippedVelocityLimitParamsPeriodWindow)
            .isEqualTo(velocityLimitParamsPeriodWindow)
    }

    @Test
    fun ofFixedWindowWeek() {
        val fixedWindowWeek =
            VelocityLimitParamsPeriodWindow.FixedWindowWeek.builder()
                .type(VelocityLimitParamsPeriodWindow.FixedWindowWeek.Type.WEEK)
                .dayOfWeek(1L)
                .build()

        val velocityLimitParamsPeriodWindow =
            VelocityLimitParamsPeriodWindow.ofFixedWindowWeek(fixedWindowWeek)

        assertThat(velocityLimitParamsPeriodWindow.trailingWindowObject()).isNull()
        assertThat(velocityLimitParamsPeriodWindow.fixedWindowDay()).isNull()
        assertThat(velocityLimitParamsPeriodWindow.fixedWindowWeek()).isEqualTo(fixedWindowWeek)
        assertThat(velocityLimitParamsPeriodWindow.fixedWindowMonth()).isNull()
        assertThat(velocityLimitParamsPeriodWindow.fixedWindowYear()).isNull()
    }

    @Test
    fun ofFixedWindowWeekRoundtrip() {
        val jsonMapper = jsonMapper()
        val velocityLimitParamsPeriodWindow =
            VelocityLimitParamsPeriodWindow.ofFixedWindowWeek(
                VelocityLimitParamsPeriodWindow.FixedWindowWeek.builder()
                    .type(VelocityLimitParamsPeriodWindow.FixedWindowWeek.Type.WEEK)
                    .dayOfWeek(1L)
                    .build()
            )

        val roundtrippedVelocityLimitParamsPeriodWindow =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(velocityLimitParamsPeriodWindow),
                jacksonTypeRef<VelocityLimitParamsPeriodWindow>(),
            )

        assertThat(roundtrippedVelocityLimitParamsPeriodWindow)
            .isEqualTo(velocityLimitParamsPeriodWindow)
    }

    @Test
    fun ofFixedWindowMonth() {
        val fixedWindowMonth =
            VelocityLimitParamsPeriodWindow.FixedWindowMonth.builder()
                .type(VelocityLimitParamsPeriodWindow.FixedWindowMonth.Type.MONTH)
                .dayOfMonth(1L)
                .build()

        val velocityLimitParamsPeriodWindow =
            VelocityLimitParamsPeriodWindow.ofFixedWindowMonth(fixedWindowMonth)

        assertThat(velocityLimitParamsPeriodWindow.trailingWindowObject()).isNull()
        assertThat(velocityLimitParamsPeriodWindow.fixedWindowDay()).isNull()
        assertThat(velocityLimitParamsPeriodWindow.fixedWindowWeek()).isNull()
        assertThat(velocityLimitParamsPeriodWindow.fixedWindowMonth()).isEqualTo(fixedWindowMonth)
        assertThat(velocityLimitParamsPeriodWindow.fixedWindowYear()).isNull()
    }

    @Test
    fun ofFixedWindowMonthRoundtrip() {
        val jsonMapper = jsonMapper()
        val velocityLimitParamsPeriodWindow =
            VelocityLimitParamsPeriodWindow.ofFixedWindowMonth(
                VelocityLimitParamsPeriodWindow.FixedWindowMonth.builder()
                    .type(VelocityLimitParamsPeriodWindow.FixedWindowMonth.Type.MONTH)
                    .dayOfMonth(1L)
                    .build()
            )

        val roundtrippedVelocityLimitParamsPeriodWindow =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(velocityLimitParamsPeriodWindow),
                jacksonTypeRef<VelocityLimitParamsPeriodWindow>(),
            )

        assertThat(roundtrippedVelocityLimitParamsPeriodWindow)
            .isEqualTo(velocityLimitParamsPeriodWindow)
    }

    @Test
    fun ofFixedWindowYear() {
        val fixedWindowYear =
            VelocityLimitParamsPeriodWindow.FixedWindowYear.builder()
                .type(VelocityLimitParamsPeriodWindow.FixedWindowYear.Type.YEAR)
                .dayOfMonth(1L)
                .month(1L)
                .build()

        val velocityLimitParamsPeriodWindow =
            VelocityLimitParamsPeriodWindow.ofFixedWindowYear(fixedWindowYear)

        assertThat(velocityLimitParamsPeriodWindow.trailingWindowObject()).isNull()
        assertThat(velocityLimitParamsPeriodWindow.fixedWindowDay()).isNull()
        assertThat(velocityLimitParamsPeriodWindow.fixedWindowWeek()).isNull()
        assertThat(velocityLimitParamsPeriodWindow.fixedWindowMonth()).isNull()
        assertThat(velocityLimitParamsPeriodWindow.fixedWindowYear()).isEqualTo(fixedWindowYear)
    }

    @Test
    fun ofFixedWindowYearRoundtrip() {
        val jsonMapper = jsonMapper()
        val velocityLimitParamsPeriodWindow =
            VelocityLimitParamsPeriodWindow.ofFixedWindowYear(
                VelocityLimitParamsPeriodWindow.FixedWindowYear.builder()
                    .type(VelocityLimitParamsPeriodWindow.FixedWindowYear.Type.YEAR)
                    .dayOfMonth(1L)
                    .month(1L)
                    .build()
            )

        val roundtrippedVelocityLimitParamsPeriodWindow =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(velocityLimitParamsPeriodWindow),
                jacksonTypeRef<VelocityLimitParamsPeriodWindow>(),
            )

        assertThat(roundtrippedVelocityLimitParamsPeriodWindow)
            .isEqualTo(velocityLimitParamsPeriodWindow)
    }

    enum class IncompatibleJsonShapeTestCase(val value: JsonValue) {
        BOOLEAN(JsonValue.from(false)),
        STRING(JsonValue.from("invalid")),
        INTEGER(JsonValue.from(-1)),
        FLOAT(JsonValue.from(3.14)),
        ARRAY(JsonValue.from(listOf("invalid", "array"))),
    }

    @ParameterizedTest
    @EnumSource
    fun incompatibleJsonShapeDeserializesToUnknown(testCase: IncompatibleJsonShapeTestCase) {
        val velocityLimitParamsPeriodWindow =
            jsonMapper()
                .convertValue(testCase.value, jacksonTypeRef<VelocityLimitParamsPeriodWindow>())

        val e =
            assertThrows<LithicInvalidDataException> { velocityLimitParamsPeriodWindow.validate() }
        assertThat(e).hasMessageStartingWith("Unknown ")
    }
}
