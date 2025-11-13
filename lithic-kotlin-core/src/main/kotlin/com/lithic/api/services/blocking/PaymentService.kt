// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.lithic.api.core.ClientOptions
import com.lithic.api.core.RequestOptions
import com.lithic.api.core.http.HttpResponseFor
import com.lithic.api.models.Payment
import com.lithic.api.models.PaymentCreateParams
import com.lithic.api.models.PaymentCreateResponse
import com.lithic.api.models.PaymentListPage
import com.lithic.api.models.PaymentListParams
import com.lithic.api.models.PaymentRetrieveParams
import com.lithic.api.models.PaymentRetryParams
import com.lithic.api.models.PaymentRetryResponse
import com.lithic.api.models.PaymentReturnParams
import com.lithic.api.models.PaymentReturnResponse
import com.lithic.api.models.PaymentSimulateActionParams
import com.lithic.api.models.PaymentSimulateActionResponse
import com.lithic.api.models.PaymentSimulateReceiptParams
import com.lithic.api.models.PaymentSimulateReceiptResponse
import com.lithic.api.models.PaymentSimulateReleaseParams
import com.lithic.api.models.PaymentSimulateReleaseResponse
import com.lithic.api.models.PaymentSimulateReturnParams
import com.lithic.api.models.PaymentSimulateReturnResponse

interface PaymentService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): PaymentService

    /** Initiates a payment between a financial account and an external bank account. */
    fun create(
        params: PaymentCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PaymentCreateResponse

    /** Get the payment by token. */
    fun retrieve(
        paymentToken: String,
        params: PaymentRetrieveParams = PaymentRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Payment = retrieve(params.toBuilder().paymentToken(paymentToken).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        params: PaymentRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Payment

    /** @see retrieve */
    fun retrieve(paymentToken: String, requestOptions: RequestOptions): Payment =
        retrieve(paymentToken, PaymentRetrieveParams.none(), requestOptions)

    /** List all the payments for the provided search criteria. */
    fun list(
        params: PaymentListParams = PaymentListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PaymentListPage

    /** @see list */
    fun list(requestOptions: RequestOptions): PaymentListPage =
        list(PaymentListParams.none(), requestOptions)

    /** Retry an origination which has been returned. */
    fun retry(
        paymentToken: String,
        params: PaymentRetryParams = PaymentRetryParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PaymentRetryResponse =
        retry(params.toBuilder().paymentToken(paymentToken).build(), requestOptions)

    /** @see retry */
    fun retry(
        params: PaymentRetryParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PaymentRetryResponse

    /** @see retry */
    fun retry(paymentToken: String, requestOptions: RequestOptions): PaymentRetryResponse =
        retry(paymentToken, PaymentRetryParams.none(), requestOptions)

    /**
     * Return an ACH payment with a specified return reason code. Returns must be initiated within
     * the time window specified by NACHA rules for each return code (typically 2 banking days for
     * most codes, 60 calendar days for unauthorized debits). For a complete list of return codes
     * and their meanings, see the
     * [ACH Return Reasons documentation](https://docs.lithic.com/docs/ach-overview#ach-return-reasons).
     *
     * Note:
     * * This endpoint does not modify the state of the financial account associated with the
     *   payment. If you would like to change the account state, use the
     *   [Update financial account status](https://docs.lithic.com/reference/updatefinancialaccountstatus)
     *   endpoint.
     * * By default this endpoint is not enabled for your account. Please contact your
     *   implementations manager to enable this feature.
     */
    fun return_(
        paymentToken: String,
        params: PaymentReturnParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PaymentReturnResponse =
        return_(params.toBuilder().paymentToken(paymentToken).build(), requestOptions)

    /** @see return_ */
    fun return_(
        params: PaymentReturnParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PaymentReturnResponse

    /** Simulate payment lifecycle event */
    fun simulateAction(
        paymentToken: String,
        params: PaymentSimulateActionParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PaymentSimulateActionResponse =
        simulateAction(params.toBuilder().paymentToken(paymentToken).build(), requestOptions)

    /** @see simulateAction */
    fun simulateAction(
        params: PaymentSimulateActionParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PaymentSimulateActionResponse

    /** Simulates a receipt of a Payment. */
    fun simulateReceipt(
        params: PaymentSimulateReceiptParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PaymentSimulateReceiptResponse

    /** Simulates a release of a Payment. */
    fun simulateRelease(
        params: PaymentSimulateReleaseParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PaymentSimulateReleaseResponse

    /** Simulates a return of a Payment. */
    fun simulateReturn(
        params: PaymentSimulateReturnParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PaymentSimulateReturnResponse

    /** A view of [PaymentService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: (ClientOptions.Builder) -> Unit): PaymentService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /v1/payments`, but is otherwise the same as
         * [PaymentService.create].
         */
        @MustBeClosed
        fun create(
            params: PaymentCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PaymentCreateResponse>

        /**
         * Returns a raw HTTP response for `get /v1/payments/{payment_token}`, but is otherwise the
         * same as [PaymentService.retrieve].
         */
        @MustBeClosed
        fun retrieve(
            paymentToken: String,
            params: PaymentRetrieveParams = PaymentRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Payment> =
            retrieve(params.toBuilder().paymentToken(paymentToken).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: PaymentRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Payment>

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            paymentToken: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<Payment> =
            retrieve(paymentToken, PaymentRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /v1/payments`, but is otherwise the same as
         * [PaymentService.list].
         */
        @MustBeClosed
        fun list(
            params: PaymentListParams = PaymentListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PaymentListPage>

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<PaymentListPage> =
            list(PaymentListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /v1/payments/{payment_token}/retry`, but is
         * otherwise the same as [PaymentService.retry].
         */
        @MustBeClosed
        fun retry(
            paymentToken: String,
            params: PaymentRetryParams = PaymentRetryParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PaymentRetryResponse> =
            retry(params.toBuilder().paymentToken(paymentToken).build(), requestOptions)

        /** @see retry */
        @MustBeClosed
        fun retry(
            params: PaymentRetryParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PaymentRetryResponse>

        /** @see retry */
        @MustBeClosed
        fun retry(
            paymentToken: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<PaymentRetryResponse> =
            retry(paymentToken, PaymentRetryParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /v1/payments/{payment_token}/return`, but is
         * otherwise the same as [PaymentService.return_].
         */
        @MustBeClosed
        fun return_(
            paymentToken: String,
            params: PaymentReturnParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PaymentReturnResponse> =
            return_(params.toBuilder().paymentToken(paymentToken).build(), requestOptions)

        /** @see return_ */
        @MustBeClosed
        fun return_(
            params: PaymentReturnParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PaymentReturnResponse>

        /**
         * Returns a raw HTTP response for `post /v1/simulate/payments/{payment_token}/action`, but
         * is otherwise the same as [PaymentService.simulateAction].
         */
        @MustBeClosed
        fun simulateAction(
            paymentToken: String,
            params: PaymentSimulateActionParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PaymentSimulateActionResponse> =
            simulateAction(params.toBuilder().paymentToken(paymentToken).build(), requestOptions)

        /** @see simulateAction */
        @MustBeClosed
        fun simulateAction(
            params: PaymentSimulateActionParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PaymentSimulateActionResponse>

        /**
         * Returns a raw HTTP response for `post /v1/simulate/payments/receipt`, but is otherwise
         * the same as [PaymentService.simulateReceipt].
         */
        @MustBeClosed
        fun simulateReceipt(
            params: PaymentSimulateReceiptParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PaymentSimulateReceiptResponse>

        /**
         * Returns a raw HTTP response for `post /v1/simulate/payments/release`, but is otherwise
         * the same as [PaymentService.simulateRelease].
         */
        @MustBeClosed
        fun simulateRelease(
            params: PaymentSimulateReleaseParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PaymentSimulateReleaseResponse>

        /**
         * Returns a raw HTTP response for `post /v1/simulate/payments/return`, but is otherwise the
         * same as [PaymentService.simulateReturn].
         */
        @MustBeClosed
        fun simulateReturn(
            params: PaymentSimulateReturnParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PaymentSimulateReturnResponse>
    }
}
