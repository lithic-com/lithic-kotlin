// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.services.async

import com.google.errorprone.annotations.MustBeClosed
import com.lithic.api.core.ClientOptions
import com.lithic.api.core.RequestOptions
import com.lithic.api.core.http.HttpResponseFor
import com.lithic.api.models.Hold
import com.lithic.api.models.HoldCreateParams
import com.lithic.api.models.HoldListPageAsync
import com.lithic.api.models.HoldListParams
import com.lithic.api.models.HoldRetrieveParams
import com.lithic.api.models.HoldVoidParams

interface HoldServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): HoldServiceAsync

    /**
     * Create a hold on a financial account. Holds reserve funds by moving them from available to
     * pending balance. They can be resolved via settlement (linked to a payment or book transfer),
     * voiding, or expiration.
     */
    suspend fun create(
        financialAccountToken: String,
        params: HoldCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Hold =
        create(
            params.toBuilder().financialAccountToken(financialAccountToken).build(),
            requestOptions,
        )

    /** @see create */
    suspend fun create(
        params: HoldCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Hold

    /** Get hold by token. */
    suspend fun retrieve(
        holdToken: String,
        params: HoldRetrieveParams = HoldRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Hold = retrieve(params.toBuilder().holdToken(holdToken).build(), requestOptions)

    /** @see retrieve */
    suspend fun retrieve(
        params: HoldRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Hold

    /** @see retrieve */
    suspend fun retrieve(holdToken: String, requestOptions: RequestOptions): Hold =
        retrieve(holdToken, HoldRetrieveParams.none(), requestOptions)

    /** List holds for a financial account. */
    suspend fun list(
        financialAccountToken: String,
        params: HoldListParams = HoldListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): HoldListPageAsync =
        list(
            params.toBuilder().financialAccountToken(financialAccountToken).build(),
            requestOptions,
        )

    /** @see list */
    suspend fun list(
        params: HoldListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): HoldListPageAsync

    /** @see list */
    suspend fun list(
        financialAccountToken: String,
        requestOptions: RequestOptions,
    ): HoldListPageAsync = list(financialAccountToken, HoldListParams.none(), requestOptions)

    /**
     * Void an active hold. This returns the held funds from pending back to available balance. Only
     * holds in PENDING status can be voided.
     */
    suspend fun void(
        holdToken: String,
        params: HoldVoidParams = HoldVoidParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Hold = void(params.toBuilder().holdToken(holdToken).build(), requestOptions)

    /** @see void */
    suspend fun void(
        params: HoldVoidParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Hold

    /** @see void */
    suspend fun void(holdToken: String, requestOptions: RequestOptions): Hold =
        void(holdToken, HoldVoidParams.none(), requestOptions)

    /** A view of [HoldServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: (ClientOptions.Builder) -> Unit): HoldServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post
         * /v1/financial_accounts/{financial_account_token}/holds`, but is otherwise the same as
         * [HoldServiceAsync.create].
         */
        @MustBeClosed
        suspend fun create(
            financialAccountToken: String,
            params: HoldCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Hold> =
            create(
                params.toBuilder().financialAccountToken(financialAccountToken).build(),
                requestOptions,
            )

        /** @see create */
        @MustBeClosed
        suspend fun create(
            params: HoldCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Hold>

        /**
         * Returns a raw HTTP response for `get /v1/holds/{hold_token}`, but is otherwise the same
         * as [HoldServiceAsync.retrieve].
         */
        @MustBeClosed
        suspend fun retrieve(
            holdToken: String,
            params: HoldRetrieveParams = HoldRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Hold> =
            retrieve(params.toBuilder().holdToken(holdToken).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        suspend fun retrieve(
            params: HoldRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Hold>

        /** @see retrieve */
        @MustBeClosed
        suspend fun retrieve(
            holdToken: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<Hold> = retrieve(holdToken, HoldRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get
         * /v1/financial_accounts/{financial_account_token}/holds`, but is otherwise the same as
         * [HoldServiceAsync.list].
         */
        @MustBeClosed
        suspend fun list(
            financialAccountToken: String,
            params: HoldListParams = HoldListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<HoldListPageAsync> =
            list(
                params.toBuilder().financialAccountToken(financialAccountToken).build(),
                requestOptions,
            )

        /** @see list */
        @MustBeClosed
        suspend fun list(
            params: HoldListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<HoldListPageAsync>

        /** @see list */
        @MustBeClosed
        suspend fun list(
            financialAccountToken: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<HoldListPageAsync> =
            list(financialAccountToken, HoldListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /v1/holds/{hold_token}/void`, but is otherwise the
         * same as [HoldServiceAsync.void].
         */
        @MustBeClosed
        suspend fun void(
            holdToken: String,
            params: HoldVoidParams = HoldVoidParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Hold> =
            void(params.toBuilder().holdToken(holdToken).build(), requestOptions)

        /** @see void */
        @MustBeClosed
        suspend fun void(
            params: HoldVoidParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Hold>

        /** @see void */
        @MustBeClosed
        suspend fun void(holdToken: String, requestOptions: RequestOptions): HttpResponseFor<Hold> =
            void(holdToken, HoldVoidParams.none(), requestOptions)
    }
}
