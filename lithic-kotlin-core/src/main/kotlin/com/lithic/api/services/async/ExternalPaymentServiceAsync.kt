// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.services.async

import com.lithic.api.core.RequestOptions
import com.lithic.api.models.ExternalPayment
import com.lithic.api.models.ExternalPaymentCancelParams
import com.lithic.api.models.ExternalPaymentCreateParams
import com.lithic.api.models.ExternalPaymentListPageAsync
import com.lithic.api.models.ExternalPaymentListParams
import com.lithic.api.models.ExternalPaymentReleaseParams
import com.lithic.api.models.ExternalPaymentRetrieveParams
import com.lithic.api.models.ExternalPaymentReverseParams
import com.lithic.api.models.ExternalPaymentSettleParams

interface ExternalPaymentServiceAsync {

    /** Create external payment */
    suspend fun create(
        params: ExternalPaymentCreateParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): ExternalPayment

    /** Get external payment */
    suspend fun retrieve(
        params: ExternalPaymentRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): ExternalPayment

    /** List external payments */
    suspend fun list(
        params: ExternalPaymentListParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): ExternalPaymentListPageAsync

    /** Cancel external payment */
    suspend fun cancel(
        params: ExternalPaymentCancelParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): ExternalPayment

    /** Release external payment */
    suspend fun release(
        params: ExternalPaymentReleaseParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): ExternalPayment

    /** Reverse external payment */
    suspend fun reverse(
        params: ExternalPaymentReverseParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): ExternalPayment

    /** Settle external payment */
    suspend fun settle(
        params: ExternalPaymentSettleParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): ExternalPayment
}
