@file:JvmName("Utils")

package com.lithic.api.core

import com.google.common.collect.ImmutableListMultimap
import com.google.common.collect.ListMultimap
import com.lithic.api.errors.LithicInvalidDataException
import java.util.Collections

internal fun <T : Any> T?.getOrThrow(name: String): T =
    this ?: throw LithicInvalidDataException("`${name}` is not present")

internal fun <T> List<T>.toImmutable(): List<T> =
    if (isEmpty()) Collections.emptyList() else Collections.unmodifiableList(toList())

internal fun <K, V> Map<K, V>.toImmutable(): Map<K, V> =
    if (isEmpty()) Collections.emptyMap() else Collections.unmodifiableMap(toMap())

internal fun <K, V> ListMultimap<K, V>.toImmutable(): ListMultimap<K, V> =
    ImmutableListMultimap.copyOf(this)

internal interface Enum
