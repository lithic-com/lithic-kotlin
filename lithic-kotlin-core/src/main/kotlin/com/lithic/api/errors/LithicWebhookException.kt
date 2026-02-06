package com.lithic.api.errors

class LithicWebhookException(message: String? = null, cause: Throwable? = null) :
    LithicException(message, cause)
