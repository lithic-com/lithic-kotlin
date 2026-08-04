// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.lithic.api.core.ClientOptions
import com.lithic.api.core.RequestOptions
import com.lithic.api.core.http.HttpResponseFor
import com.lithic.api.models.Hold
import com.lithic.api.models.HoldCreateParams
import com.lithic.api.models.HoldListPage
import com.lithic.api.models.HoldListParams
import com.lithic.api.models.HoldRetrieveParams
import com.lithic.api.models.HoldVoidParams

interface HoldService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): HoldService

    /**
     * Create a hold on a financial account. Holds reserve funds by moving them from available to
     * pending balance. They can be resolved via settlement (linked to a payment or book transfer),
     * voiding, or expiration.
     */
    fun create(
        financialAccountToken: String,
        params: HoldCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Hold =
        create(
            params.toBuilder().financialAccountToken(financialAccountToken).build(),
            requestOptions,
        )

    /** @see create */
    fun create(
        params: HoldCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Hold

    /** Get hold by token. */
    fun retrieve(
        holdToken: String,
        params: HoldRetrieveParams = HoldRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Hold = retrieve(params.toBuilder().holdToken(holdToken).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        params: HoldRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Hold

    /** @see retrieve */
    fun retrieve(holdToken: String, requestOptions: RequestOptions): Hold =
        retrieve(holdToken, HoldRetrieveParams.none(), requestOptions)

    /** List holds for a financial account. */
    fun list(
        financialAccountToken: String,
        params: HoldListParams = HoldListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): HoldListPage =
        list(
            params.toBuilder().financialAccountToken(financialAccountToken).build(),
            requestOptions,
        )

    /** @see list */
    fun list(
        params: HoldListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): HoldListPage

    /** @see list */
    fun list(financialAccountToken: String, requestOptions: RequestOptions): HoldListPage =
        list(financialAccountToken, HoldListParams.none(), requestOptions)

    /**
     * Void an active hold. This returns the held funds from pending back to available balance. Only
     * holds in PENDING status can be voided.
     */
    fun void(
        holdToken: String,
        params: HoldVoidParams = HoldVoidParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Hold = void(params.toBuilder().holdToken(holdToken).build(), requestOptions)

    /** @see void */
    fun void(params: HoldVoidParams, requestOptions: RequestOptions = RequestOptions.none()): Hold

    /** @see void */
    fun void(holdToken: String, requestOptions: RequestOptions): Hold =
        void(holdToken, HoldVoidParams.none(), requestOptions)

    /** A view of [HoldService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: (ClientOptions.Builder) -> Unit): HoldService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post
         * /v1/financial_accounts/{financial_account_token}/holds`, but is otherwise the same as
         * [HoldService.create].
         */
        @MustBeClosed
        fun create(
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
        fun create(
            params: HoldCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Hold>

        /**
         * Returns a raw HTTP response for `get /v1/holds/{hold_token}`, but is otherwise the same
         * as [HoldService.retrieve].
         */
        @MustBeClosed
        fun retrieve(
            holdToken: String,
            params: HoldRetrieveParams = HoldRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Hold> =
            retrieve(params.toBuilder().holdToken(holdToken).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: HoldRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Hold>

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(holdToken: String, requestOptions: RequestOptions): HttpResponseFor<Hold> =
            retrieve(holdToken, HoldRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get
         * /v1/financial_accounts/{financial_account_token}/holds`, but is otherwise the same as
         * [HoldService.list].
         */
        @MustBeClosed
        fun list(
            financialAccountToken: String,
            params: HoldListParams = HoldListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<HoldListPage> =
            list(
                params.toBuilder().financialAccountToken(financialAccountToken).build(),
                requestOptions,
            )

        /** @see list */
        @MustBeClosed
        fun list(
            params: HoldListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<HoldListPage>

        /** @see list */
        @MustBeClosed
        fun list(
            financialAccountToken: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<HoldListPage> =
            list(financialAccountToken, HoldListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /v1/holds/{hold_token}/void`, but is otherwise the
         * same as [HoldService.void].
         */
        @MustBeClosed
        fun void(
            holdToken: String,
            params: HoldVoidParams = HoldVoidParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Hold> =
            void(params.toBuilder().holdToken(holdToken).build(), requestOptions)

        /** @see void */
        @MustBeClosed
        fun void(
            params: HoldVoidParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Hold>

        /** @see void */
        @MustBeClosed
        fun void(holdToken: String, requestOptions: RequestOptions): HttpResponseFor<Hold> =
            void(holdToken, HoldVoidParams.none(), requestOptions)
    }
}
