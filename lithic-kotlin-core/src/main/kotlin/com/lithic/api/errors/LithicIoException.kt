package com.lithic.api.errors

class LithicIoException(message: String? = null, cause: Throwable? = null) :
    LithicException(message, cause)
