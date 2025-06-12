// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.services.async

import com.google.errorprone.annotations.MustBeClosed
import com.lithic.api.core.ClientOptions
import com.lithic.api.core.RequestOptions
import com.lithic.api.core.http.HttpResponseFor
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

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): ExternalPaymentServiceAsync

    /** Create external payment */
    suspend fun create(
        params: ExternalPaymentCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ExternalPayment

    /** Get external payment */
    suspend fun retrieve(
        externalPaymentToken: String,
        params: ExternalPaymentRetrieveParams = ExternalPaymentRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ExternalPayment =
        retrieve(
            params.toBuilder().externalPaymentToken(externalPaymentToken).build(),
            requestOptions,
        )

    /** @see [retrieve] */
    suspend fun retrieve(
        params: ExternalPaymentRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ExternalPayment

    /** @see [retrieve] */
    suspend fun retrieve(
        externalPaymentToken: String,
        requestOptions: RequestOptions,
    ): ExternalPayment =
        retrieve(externalPaymentToken, ExternalPaymentRetrieveParams.none(), requestOptions)

    /** List external payments */
    suspend fun list(
        params: ExternalPaymentListParams = ExternalPaymentListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ExternalPaymentListPageAsync

    /** @see [list] */
    suspend fun list(requestOptions: RequestOptions): ExternalPaymentListPageAsync =
        list(ExternalPaymentListParams.none(), requestOptions)

    /** Cancel external payment */
    suspend fun cancel(
        externalPaymentToken: String,
        params: ExternalPaymentCancelParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ExternalPayment =
        cancel(
            params.toBuilder().externalPaymentToken(externalPaymentToken).build(),
            requestOptions,
        )

    /** @see [cancel] */
    suspend fun cancel(
        params: ExternalPaymentCancelParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ExternalPayment

    /** Release external payment */
    suspend fun release(
        externalPaymentToken: String,
        params: ExternalPaymentReleaseParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ExternalPayment =
        release(
            params.toBuilder().externalPaymentToken(externalPaymentToken).build(),
            requestOptions,
        )

    /** @see [release] */
    suspend fun release(
        params: ExternalPaymentReleaseParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ExternalPayment

    /** Reverse external payment */
    suspend fun reverse(
        externalPaymentToken: String,
        params: ExternalPaymentReverseParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ExternalPayment =
        reverse(
            params.toBuilder().externalPaymentToken(externalPaymentToken).build(),
            requestOptions,
        )

    /** @see [reverse] */
    suspend fun reverse(
        params: ExternalPaymentReverseParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ExternalPayment

    /** Settle external payment */
    suspend fun settle(
        externalPaymentToken: String,
        params: ExternalPaymentSettleParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ExternalPayment =
        settle(
            params.toBuilder().externalPaymentToken(externalPaymentToken).build(),
            requestOptions,
        )

    /** @see [settle] */
    suspend fun settle(
        params: ExternalPaymentSettleParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ExternalPayment

    /**
     * A view of [ExternalPaymentServiceAsync] that provides access to raw HTTP responses for each
     * method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): ExternalPaymentServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /v1/external_payments`, but is otherwise the same
         * as [ExternalPaymentServiceAsync.create].
         */
        @MustBeClosed
        suspend fun create(
            params: ExternalPaymentCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ExternalPayment>

        /**
         * Returns a raw HTTP response for `get /v1/external_payments/{external_payment_token}`, but
         * is otherwise the same as [ExternalPaymentServiceAsync.retrieve].
         */
        @MustBeClosed
        suspend fun retrieve(
            externalPaymentToken: String,
            params: ExternalPaymentRetrieveParams = ExternalPaymentRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ExternalPayment> =
            retrieve(
                params.toBuilder().externalPaymentToken(externalPaymentToken).build(),
                requestOptions,
            )

        /** @see [retrieve] */
        @MustBeClosed
        suspend fun retrieve(
            params: ExternalPaymentRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ExternalPayment>

        /** @see [retrieve] */
        @MustBeClosed
        suspend fun retrieve(
            externalPaymentToken: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ExternalPayment> =
            retrieve(externalPaymentToken, ExternalPaymentRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /v1/external_payments`, but is otherwise the same as
         * [ExternalPaymentServiceAsync.list].
         */
        @MustBeClosed
        suspend fun list(
            params: ExternalPaymentListParams = ExternalPaymentListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ExternalPaymentListPageAsync>

        /** @see [list] */
        @MustBeClosed
        suspend fun list(
            requestOptions: RequestOptions
        ): HttpResponseFor<ExternalPaymentListPageAsync> =
            list(ExternalPaymentListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post
         * /v1/external_payments/{external_payment_token}/cancel`, but is otherwise the same as
         * [ExternalPaymentServiceAsync.cancel].
         */
        @MustBeClosed
        suspend fun cancel(
            externalPaymentToken: String,
            params: ExternalPaymentCancelParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ExternalPayment> =
            cancel(
                params.toBuilder().externalPaymentToken(externalPaymentToken).build(),
                requestOptions,
            )

        /** @see [cancel] */
        @MustBeClosed
        suspend fun cancel(
            params: ExternalPaymentCancelParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ExternalPayment>

        /**
         * Returns a raw HTTP response for `post
         * /v1/external_payments/{external_payment_token}/release`, but is otherwise the same as
         * [ExternalPaymentServiceAsync.release].
         */
        @MustBeClosed
        suspend fun release(
            externalPaymentToken: String,
            params: ExternalPaymentReleaseParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ExternalPayment> =
            release(
                params.toBuilder().externalPaymentToken(externalPaymentToken).build(),
                requestOptions,
            )

        /** @see [release] */
        @MustBeClosed
        suspend fun release(
            params: ExternalPaymentReleaseParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ExternalPayment>

        /**
         * Returns a raw HTTP response for `post
         * /v1/external_payments/{external_payment_token}/reverse`, but is otherwise the same as
         * [ExternalPaymentServiceAsync.reverse].
         */
        @MustBeClosed
        suspend fun reverse(
            externalPaymentToken: String,
            params: ExternalPaymentReverseParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ExternalPayment> =
            reverse(
                params.toBuilder().externalPaymentToken(externalPaymentToken).build(),
                requestOptions,
            )

        /** @see [reverse] */
        @MustBeClosed
        suspend fun reverse(
            params: ExternalPaymentReverseParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ExternalPayment>

        /**
         * Returns a raw HTTP response for `post
         * /v1/external_payments/{external_payment_token}/settle`, but is otherwise the same as
         * [ExternalPaymentServiceAsync.settle].
         */
        @MustBeClosed
        suspend fun settle(
            externalPaymentToken: String,
            params: ExternalPaymentSettleParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ExternalPayment> =
            settle(
                params.toBuilder().externalPaymentToken(externalPaymentToken).build(),
                requestOptions,
            )

        /** @see [settle] */
        @MustBeClosed
        suspend fun settle(
            params: ExternalPaymentSettleParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ExternalPayment>
    }
}
