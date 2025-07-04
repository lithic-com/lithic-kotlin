// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.services.async

import com.google.errorprone.annotations.MustBeClosed
import com.lithic.api.core.ClientOptions
import com.lithic.api.core.RequestOptions
import com.lithic.api.core.http.HttpResponseFor
import com.lithic.api.models.Payment
import com.lithic.api.models.PaymentCreateParams
import com.lithic.api.models.PaymentCreateResponse
import com.lithic.api.models.PaymentListPageAsync
import com.lithic.api.models.PaymentListParams
import com.lithic.api.models.PaymentRetrieveParams
import com.lithic.api.models.PaymentRetryParams
import com.lithic.api.models.PaymentRetryResponse
import com.lithic.api.models.PaymentSimulateActionParams
import com.lithic.api.models.PaymentSimulateActionResponse
import com.lithic.api.models.PaymentSimulateReceiptParams
import com.lithic.api.models.PaymentSimulateReceiptResponse
import com.lithic.api.models.PaymentSimulateReleaseParams
import com.lithic.api.models.PaymentSimulateReleaseResponse
import com.lithic.api.models.PaymentSimulateReturnParams
import com.lithic.api.models.PaymentSimulateReturnResponse

interface PaymentServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): PaymentServiceAsync

    /** Initiates a payment between a financial account and an external bank account. */
    suspend fun create(
        params: PaymentCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PaymentCreateResponse

    /** Get the payment by token. */
    suspend fun retrieve(
        paymentToken: String,
        params: PaymentRetrieveParams = PaymentRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Payment = retrieve(params.toBuilder().paymentToken(paymentToken).build(), requestOptions)

    /** @see [retrieve] */
    suspend fun retrieve(
        params: PaymentRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Payment

    /** @see [retrieve] */
    suspend fun retrieve(paymentToken: String, requestOptions: RequestOptions): Payment =
        retrieve(paymentToken, PaymentRetrieveParams.none(), requestOptions)

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
        paymentToken: String,
        params: PaymentRetryParams = PaymentRetryParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PaymentRetryResponse =
        retry(params.toBuilder().paymentToken(paymentToken).build(), requestOptions)

    /** @see [retry] */
    suspend fun retry(
        params: PaymentRetryParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PaymentRetryResponse

    /** @see [retry] */
    suspend fun retry(paymentToken: String, requestOptions: RequestOptions): PaymentRetryResponse =
        retry(paymentToken, PaymentRetryParams.none(), requestOptions)

    /** Simulate payment lifecycle event */
    suspend fun simulateAction(
        paymentToken: String,
        params: PaymentSimulateActionParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PaymentSimulateActionResponse =
        simulateAction(params.toBuilder().paymentToken(paymentToken).build(), requestOptions)

    /** @see [simulateAction] */
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
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): PaymentServiceAsync.WithRawResponse

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
            paymentToken: String,
            params: PaymentRetrieveParams = PaymentRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Payment> =
            retrieve(params.toBuilder().paymentToken(paymentToken).build(), requestOptions)

        /** @see [retrieve] */
        @MustBeClosed
        suspend fun retrieve(
            params: PaymentRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Payment>

        /** @see [retrieve] */
        @MustBeClosed
        suspend fun retrieve(
            paymentToken: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<Payment> =
            retrieve(paymentToken, PaymentRetrieveParams.none(), requestOptions)

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
            paymentToken: String,
            params: PaymentRetryParams = PaymentRetryParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PaymentRetryResponse> =
            retry(params.toBuilder().paymentToken(paymentToken).build(), requestOptions)

        /** @see [retry] */
        @MustBeClosed
        suspend fun retry(
            params: PaymentRetryParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PaymentRetryResponse>

        /** @see [retry] */
        @MustBeClosed
        suspend fun retry(
            paymentToken: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<PaymentRetryResponse> =
            retry(paymentToken, PaymentRetryParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /v1/simulate/payments/{payment_token}/action`, but
         * is otherwise the same as [PaymentServiceAsync.simulateAction].
         */
        @MustBeClosed
        suspend fun simulateAction(
            paymentToken: String,
            params: PaymentSimulateActionParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PaymentSimulateActionResponse> =
            simulateAction(params.toBuilder().paymentToken(paymentToken).build(), requestOptions)

        /** @see [simulateAction] */
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
