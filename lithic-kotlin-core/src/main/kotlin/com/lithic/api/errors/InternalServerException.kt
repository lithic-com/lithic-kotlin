package com.lithic.api.errors

import com.google.common.collect.ListMultimap

class InternalServerException(
    statusCode: Int,
    headers: ListMultimap<String, String>,
    body: String,
    error: LithicError,
) : LithicServiceException(statusCode, headers, body, error)
