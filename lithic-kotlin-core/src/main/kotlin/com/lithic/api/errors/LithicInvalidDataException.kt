package com.lithic.api.errors

class LithicInvalidDataException(message: String? = null, cause: Throwable? = null) :
    LithicException(message, cause)
