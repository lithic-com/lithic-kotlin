package com.lithic.api.errors

class LithicIoException constructor(message: String? = null, cause: Throwable? = null) :
    LithicException(message, cause)
