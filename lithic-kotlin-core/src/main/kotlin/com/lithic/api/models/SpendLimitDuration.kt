package com.lithic.api.models

import com.fasterxml.jackson.annotation.JsonCreator
import com.lithic.api.core.JsonField
import com.lithic.api.core.JsonValue
import com.lithic.api.errors.LithicInvalidDataException

class SpendLimitDuration
@JsonCreator
private constructor(
    private val value: JsonField<String>,
) {

    @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is SpendLimitDuration && this.value == other.value
    }

    override fun hashCode() = value.hashCode()

    override fun toString() = value.toString()

    companion object {

        val ANNUALLY = SpendLimitDuration(JsonField.of("ANNUALLY"))

        val FOREVER = SpendLimitDuration(JsonField.of("FOREVER"))

        val MONTHLY = SpendLimitDuration(JsonField.of("MONTHLY"))

        val TRANSACTION = SpendLimitDuration(JsonField.of("TRANSACTION"))

        fun of(value: String) = SpendLimitDuration(JsonField.of(value))
    }

    enum class Known {
        ANNUALLY,
        FOREVER,
        MONTHLY,
        TRANSACTION,
    }

    enum class Value {
        ANNUALLY,
        FOREVER,
        MONTHLY,
        TRANSACTION,
        _UNKNOWN,
    }

    fun value(): Value =
        when (this) {
            ANNUALLY -> Value.ANNUALLY
            FOREVER -> Value.FOREVER
            MONTHLY -> Value.MONTHLY
            TRANSACTION -> Value.TRANSACTION
            else -> Value._UNKNOWN
        }

    fun known(): Known =
        when (this) {
            ANNUALLY -> Known.ANNUALLY
            FOREVER -> Known.FOREVER
            MONTHLY -> Known.MONTHLY
            TRANSACTION -> Known.TRANSACTION
            else -> throw LithicInvalidDataException("Unknown SpendLimitDuration: $value")
        }

    fun asString(): String = _value().asStringOrThrow()
}
