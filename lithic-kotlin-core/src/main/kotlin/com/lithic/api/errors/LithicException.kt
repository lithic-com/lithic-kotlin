package com.lithic.api.errors

open class LithicException constructor(message: String? = null, cause: Throwable? = null) :
    RuntimeException(message, cause)
