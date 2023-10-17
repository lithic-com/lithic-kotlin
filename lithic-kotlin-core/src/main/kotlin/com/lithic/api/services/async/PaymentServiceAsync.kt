// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.lithic.api.services.async

import com.lithic.api.core.RequestOptions
import com.lithic.api.models.Payment
import com.lithic.api.models.PaymentCreateParams
import com.lithic.api.models.PaymentCreateResponse
import com.lithic.api.models.PaymentListPageAsync
import com.lithic.api.models.PaymentListParams
import com.lithic.api.models.PaymentRetrieveParams
import com.lithic.api.models.PaymentRetryParams
import com.lithic.api.models.PaymentRetryResponse
import com.lithic.api.models.PaymentSimulateReleaseParams
import com.lithic.api.models.PaymentSimulateReleaseResponse
import com.lithic.api.models.PaymentSimulateReturnParams
import com.lithic.api.models.PaymentSimulateReturnResponse

interface PaymentServiceAsync {

    /** Initiates a payment between a financial account and an external bank account. */
    suspend fun create(
        params: PaymentCreateParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): PaymentCreateResponse

    /** Get the payment by token. */
    suspend fun retrieve(
        params: PaymentRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): Payment

    /** List all the payments for the provided search criteria. */
    suspend fun list(
        params: PaymentListParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): PaymentListPageAsync

    /** Retry an origination which has been returned. */
    suspend fun retry(
        params: PaymentRetryParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): PaymentRetryResponse

    /** Simulates a release of a Payment. */
    suspend fun simulateRelease(
        params: PaymentSimulateReleaseParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): PaymentSimulateReleaseResponse

    /** Simulates a return of a Payment. */
    suspend fun simulateReturn(
        params: PaymentSimulateReturnParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): PaymentSimulateReturnResponse
}
