package com.lithic.api.errors

class LithicInvalidDataException constructor(message: String? = null, cause: Throwable? = null) :
    LithicException(message, cause)
