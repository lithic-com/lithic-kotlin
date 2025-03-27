// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.services.async

import com.google.errorprone.annotations.MustBeClosed
import com.lithic.api.core.RequestOptions
import com.lithic.api.core.http.HttpResponseFor
import com.lithic.api.models.payments.Payment
import com.lithic.api.models.payments.PaymentCreateParams
import com.lithic.api.models.payments.PaymentCreateResponse
import com.lithic.api.models.payments.PaymentListPageAsync
import com.lithic.api.models.payments.PaymentListParams
import com.lithic.api.models.payments.PaymentRetrieveParams
import com.lithic.api.models.payments.PaymentRetryParams
import com.lithic.api.models.payments.PaymentRetryResponse
import com.lithic.api.models.payments.PaymentSimulateActionParams
import com.lithic.api.models.payments.PaymentSimulateActionResponse
import com.lithic.api.models.payments.PaymentSimulateReceiptParams
import com.lithic.api.models.payments.PaymentSimulateReceiptResponse
import com.lithic.api.models.payments.PaymentSimulateReleaseParams
import com.lithic.api.models.payments.PaymentSimulateReleaseResponse
import com.lithic.api.models.payments.PaymentSimulateReturnParams
import com.lithic.api.models.payments.PaymentSimulateReturnResponse

interface PaymentServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /** Initiates a payment between a financial account and an external bank account. */
    suspend fun create(
        params: PaymentCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PaymentCreateResponse

    /** Get the payment by token. */
    suspend fun retrieve(
        params: PaymentRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Payment

    /** List all the payments for the provided search criteria. */
    suspend fun list(
        params: PaymentListParams = PaymentListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PaymentListPageAsync

    /** @see [list] */
    suspend fun list(requestOptions: RequestOptions): PaymentListPageAsync =
        list(PaymentListParams.none(), requestOptions)

    /** Retry an origination which has been returned. */
    suspend fun retry(
        params: PaymentRetryParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PaymentRetryResponse

    /** Simulate payment lifecycle event */
    suspend fun simulateAction(
        params: PaymentSimulateActionParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PaymentSimulateActionResponse

    /** Simulates a receipt of a Payment. */
    suspend fun simulateReceipt(
        params: PaymentSimulateReceiptParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PaymentSimulateReceiptResponse

    /** Simulates a release of a Payment. */
    suspend fun simulateRelease(
        params: PaymentSimulateReleaseParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PaymentSimulateReleaseResponse

    /** Simulates a return of a Payment. */
    suspend fun simulateReturn(
        params: PaymentSimulateReturnParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PaymentSimulateReturnResponse

    /**
     * A view of [PaymentServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `post /v1/payments`, but is otherwise the same as
         * [PaymentServiceAsync.create].
         */
        @MustBeClosed
        suspend fun create(
            params: PaymentCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PaymentCreateResponse>

        /**
         * Returns a raw HTTP response for `get /v1/payments/{payment_token}`, but is otherwise the
         * same as [PaymentServiceAsync.retrieve].
         */
        @MustBeClosed
        suspend fun retrieve(
            params: PaymentRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Payment>

        /**
         * Returns a raw HTTP response for `get /v1/payments`, but is otherwise the same as
         * [PaymentServiceAsync.list].
         */
        @MustBeClosed
        suspend fun list(
            params: PaymentListParams = PaymentListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PaymentListPageAsync>

        /** @see [list] */
        @MustBeClosed
        suspend fun list(requestOptions: RequestOptions): HttpResponseFor<PaymentListPageAsync> =
            list(PaymentListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /v1/payments/{payment_token}/retry`, but is
         * otherwise the same as [PaymentServiceAsync.retry].
         */
        @MustBeClosed
        suspend fun retry(
            params: PaymentRetryParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PaymentRetryResponse>

        /**
         * Returns a raw HTTP response for `post /v1/simulate/payments/{payment_token}/action`, but
         * is otherwise the same as [PaymentServiceAsync.simulateAction].
         */
        @MustBeClosed
        suspend fun simulateAction(
            params: PaymentSimulateActionParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PaymentSimulateActionResponse>

        /**
         * Returns a raw HTTP response for `post /v1/simulate/payments/receipt`, but is otherwise
         * the same as [PaymentServiceAsync.simulateReceipt].
         */
        @MustBeClosed
        suspend fun simulateReceipt(
            params: PaymentSimulateReceiptParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PaymentSimulateReceiptResponse>

        /**
         * Returns a raw HTTP response for `post /v1/simulate/payments/release`, but is otherwise
         * the same as [PaymentServiceAsync.simulateRelease].
         */
        @MustBeClosed
        suspend fun simulateRelease(
            params: PaymentSimulateReleaseParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PaymentSimulateReleaseResponse>

        /**
         * Returns a raw HTTP response for `post /v1/simulate/payments/return`, but is otherwise the
         * same as [PaymentServiceAsync.simulateReturn].
         */
        @MustBeClosed
        suspend fun simulateReturn(
            params: PaymentSimulateReturnParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PaymentSimulateReturnResponse>
    }
}
