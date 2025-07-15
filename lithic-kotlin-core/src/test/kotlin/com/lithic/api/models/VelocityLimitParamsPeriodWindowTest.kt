// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lithic.api.core.JsonValue
import com.lithic.api.core.jsonMapper
import com.lithic.api.errors.LithicInvalidDataException
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows

internal class VelocityLimitParamsPeriodWindowTest {

    @Test
    fun ofTrailing() {
        val trailing = 10L

        val velocityLimitParamsPeriodWindow = VelocityLimitParamsPeriodWindow.ofTrailing(trailing)

        assertThat(velocityLimitParamsPeriodWindow.trailing()).isEqualTo(trailing)
        assertThat(velocityLimitParamsPeriodWindow.fixed()).isNull()
        assertThat(velocityLimitParamsPeriodWindow.trailingWindowObject()).isNull()
        assertThat(velocityLimitParamsPeriodWindow.fixedWindowDay()).isNull()
        assertThat(velocityLimitParamsPeriodWindow.fixedWindowWeek()).isNull()
        assertThat(velocityLimitParamsPeriodWindow.fixedWindowMonth()).isNull()
        assertThat(velocityLimitParamsPeriodWindow.fixedWindowYear()).isNull()
    }

    @Test
    fun ofTrailingRoundtrip() {
        val jsonMapper = jsonMapper()
        val velocityLimitParamsPeriodWindow = VelocityLimitParamsPeriodWindow.ofTrailing(10L)

        val roundtrippedVelocityLimitParamsPeriodWindow =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(velocityLimitParamsPeriodWindow),
                jacksonTypeRef<VelocityLimitParamsPeriodWindow>(),
            )

        assertThat(roundtrippedVelocityLimitParamsPeriodWindow)
            .isEqualTo(velocityLimitParamsPeriodWindow)
    }

    @Test
    fun ofFixed() {
        val fixed = VelocityLimitParamsPeriodWindow.FixedWindow.DAY

        val velocityLimitParamsPeriodWindow = VelocityLimitParamsPeriodWindow.ofFixed(fixed)

        assertThat(velocityLimitParamsPeriodWindow.trailing()).isNull()
        assertThat(velocityLimitParamsPeriodWindow.fixed()).isEqualTo(fixed)
        assertThat(velocityLimitParamsPeriodWindow.trailingWindowObject()).isNull()
        assertThat(velocityLimitParamsPeriodWindow.fixedWindowDay()).isNull()
        assertThat(velocityLimitParamsPeriodWindow.fixedWindowWeek()).isNull()
        assertThat(velocityLimitParamsPeriodWindow.fixedWindowMonth()).isNull()
        assertThat(velocityLimitParamsPeriodWindow.fixedWindowYear()).isNull()
    }

    @Test
    fun ofFixedRoundtrip() {
        val jsonMapper = jsonMapper()
        val velocityLimitParamsPeriodWindow =
            VelocityLimitParamsPeriodWindow.ofFixed(VelocityLimitParamsPeriodWindow.FixedWindow.DAY)

        val roundtrippedVelocityLimitParamsPeriodWindow =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(velocityLimitParamsPeriodWindow),
                jacksonTypeRef<VelocityLimitParamsPeriodWindow>(),
            )

        assertThat(roundtrippedVelocityLimitParamsPeriodWindow)
            .isEqualTo(velocityLimitParamsPeriodWindow)
    }

    @Test
    fun ofTrailingWindowObject() {
        val trailingWindowObject =
            VelocityLimitParamsPeriodWindow.TrailingWindowObject.builder()
                .duration(10L)
                .type(VelocityLimitParamsPeriodWindow.TrailingWindowObject.Type.CUSTOM)
                .build()

        val velocityLimitParamsPeriodWindow =
            VelocityLimitParamsPeriodWindow.ofTrailingWindowObject(trailingWindowObject)

        assertThat(velocityLimitParamsPeriodWindow.trailing()).isNull()
        assertThat(velocityLimitParamsPeriodWindow.fixed()).isNull()
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

        assertThat(velocityLimitParamsPeriodWindow.trailing()).isNull()
        assertThat(velocityLimitParamsPeriodWindow.fixed()).isNull()
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
                .dayOfWeek(1L)
                .type(VelocityLimitParamsPeriodWindow.FixedWindowWeek.Type.WEEK)
                .build()

        val velocityLimitParamsPeriodWindow =
            VelocityLimitParamsPeriodWindow.ofFixedWindowWeek(fixedWindowWeek)

        assertThat(velocityLimitParamsPeriodWindow.trailing()).isNull()
        assertThat(velocityLimitParamsPeriodWindow.fixed()).isNull()
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
                    .dayOfWeek(1L)
                    .type(VelocityLimitParamsPeriodWindow.FixedWindowWeek.Type.WEEK)
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
                .dayOfMonth(1L)
                .type(VelocityLimitParamsPeriodWindow.FixedWindowMonth.Type.MONTH)
                .build()

        val velocityLimitParamsPeriodWindow =
            VelocityLimitParamsPeriodWindow.ofFixedWindowMonth(fixedWindowMonth)

        assertThat(velocityLimitParamsPeriodWindow.trailing()).isNull()
        assertThat(velocityLimitParamsPeriodWindow.fixed()).isNull()
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
                    .dayOfMonth(1L)
                    .type(VelocityLimitParamsPeriodWindow.FixedWindowMonth.Type.MONTH)
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
                .dayOfMonth(1L)
                .month(1L)
                .type(VelocityLimitParamsPeriodWindow.FixedWindowYear.Type.YEAR)
                .build()

        val velocityLimitParamsPeriodWindow =
            VelocityLimitParamsPeriodWindow.ofFixedWindowYear(fixedWindowYear)

        assertThat(velocityLimitParamsPeriodWindow.trailing()).isNull()
        assertThat(velocityLimitParamsPeriodWindow.fixed()).isNull()
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
                    .dayOfMonth(1L)
                    .month(1L)
                    .type(VelocityLimitParamsPeriodWindow.FixedWindowYear.Type.YEAR)
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
    fun incompatibleJsonShapeDeserializesToUnknown() {
        val value = JsonValue.from(listOf("invalid", "array"))
        val velocityLimitParamsPeriodWindow =
            jsonMapper().convertValue(value, jacksonTypeRef<VelocityLimitParamsPeriodWindow>())

        val e =
            assertThrows<LithicInvalidDataException> { velocityLimitParamsPeriodWindow.validate() }
        assertThat(e).hasMessageStartingWith("Unknown ")
    }
}
