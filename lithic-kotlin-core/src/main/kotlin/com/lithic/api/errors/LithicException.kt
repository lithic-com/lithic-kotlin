package com.lithic.api.errors

open class LithicException(message: String? = null, cause: Throwable? = null) :
    RuntimeException(message, cause)
