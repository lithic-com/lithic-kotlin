// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.services.async

import com.google.errorprone.annotations.MustBeClosed
import com.lithic.api.core.ClientOptions
import com.lithic.api.core.RequestOptions
import com.lithic.api.core.http.HttpResponse
import com.lithic.api.core.http.HttpResponseFor
import com.lithic.api.models.Transaction
import com.lithic.api.models.TransactionExpireAuthorizationParams
import com.lithic.api.models.TransactionListPageAsync
import com.lithic.api.models.TransactionListParams
import com.lithic.api.models.TransactionRetrieveParams
import com.lithic.api.models.TransactionSimulateAuthorizationAdviceParams
import com.lithic.api.models.TransactionSimulateAuthorizationAdviceResponse
import com.lithic.api.models.TransactionSimulateAuthorizationParams
import com.lithic.api.models.TransactionSimulateAuthorizationResponse
import com.lithic.api.models.TransactionSimulateClearingParams
import com.lithic.api.models.TransactionSimulateClearingResponse
import com.lithic.api.models.TransactionSimulateCreditAuthorizationParams
import com.lithic.api.models.TransactionSimulateCreditAuthorizationResponse
import com.lithic.api.models.TransactionSimulateReturnParams
import com.lithic.api.models.TransactionSimulateReturnResponse
import com.lithic.api.models.TransactionSimulateReturnReversalParams
import com.lithic.api.models.TransactionSimulateReturnReversalResponse
import com.lithic.api.models.TransactionSimulateVoidParams
import com.lithic.api.models.TransactionSimulateVoidResponse
import com.lithic.api.services.async.transactions.EnhancedCommercialDataServiceAsync
import com.lithic.api.services.async.transactions.EventServiceAsync

interface TransactionServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): TransactionServiceAsync

    fun enhancedCommercialData(): EnhancedCommercialDataServiceAsync

    fun events(): EventServiceAsync

    /**
     * Get a specific card transaction. All amounts are in the smallest unit of their respective
     * currency (e.g., cents for USD).
     */
    suspend fun retrieve(
        transactionToken: String,
        params: TransactionRetrieveParams = TransactionRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Transaction =
        retrieve(params.toBuilder().transactionToken(transactionToken).build(), requestOptions)

    /** @see retrieve */
    suspend fun retrieve(
        params: TransactionRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Transaction

    /** @see retrieve */
    suspend fun retrieve(transactionToken: String, requestOptions: RequestOptions): Transaction =
        retrieve(transactionToken, TransactionRetrieveParams.none(), requestOptions)

    /**
     * List card transactions. All amounts are in the smallest unit of their respective currency
     * (e.g., cents for USD) and inclusive of any acquirer fees.
     */
    suspend fun list(
        params: TransactionListParams = TransactionListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): TransactionListPageAsync

    /** @see list */
    suspend fun list(requestOptions: RequestOptions): TransactionListPageAsync =
        list(TransactionListParams.none(), requestOptions)

    /** Expire authorization */
    suspend fun expireAuthorization(
        transactionToken: String,
        params: TransactionExpireAuthorizationParams = TransactionExpireAuthorizationParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ) =
        expireAuthorization(
            params.toBuilder().transactionToken(transactionToken).build(),
            requestOptions,
        )

    /** @see expireAuthorization */
    suspend fun expireAuthorization(
        params: TransactionExpireAuthorizationParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** @see expireAuthorization */
    suspend fun expireAuthorization(transactionToken: String, requestOptions: RequestOptions) =
        expireAuthorization(
            transactionToken,
            TransactionExpireAuthorizationParams.none(),
            requestOptions,
        )

    /**
     * Simulates an authorization request from the card network as if it came from a merchant
     * acquirer. If you are configured for ASA, simulating authorizations requires your ASA client
     * to be set up properly, i.e. be able to respond to the ASA request with a valid JSON. For
     * users that are not configured for ASA, a daily transaction limit of $5000 USD is applied by
     * default. You can update this limit via the
     * [update account](https://docs.lithic.com/reference/patchaccountbytoken) endpoint.
     */
    suspend fun simulateAuthorization(
        params: TransactionSimulateAuthorizationParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): TransactionSimulateAuthorizationResponse

    /**
     * Simulates an authorization advice from the card network as if it came from a merchant
     * acquirer. An authorization advice changes the pending amount of the transaction.
     */
    suspend fun simulateAuthorizationAdvice(
        params: TransactionSimulateAuthorizationAdviceParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): TransactionSimulateAuthorizationAdviceResponse

    /**
     * Clears an existing authorization, either debit or credit. After this event, the transaction
     * transitions from `PENDING` to `SETTLED` status.
     *
     * If `amount` is not set, the full amount of the transaction will be cleared. Transactions that
     * have already cleared, either partially or fully, cannot be cleared again using this endpoint.
     */
    suspend fun simulateClearing(
        params: TransactionSimulateClearingParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): TransactionSimulateClearingResponse

    /**
     * Simulates a credit authorization advice from the card network. This message indicates that
     * the network approved a credit authorization on your behalf.
     */
    suspend fun simulateCreditAuthorization(
        params: TransactionSimulateCreditAuthorizationParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): TransactionSimulateCreditAuthorizationResponse

    /**
     * Returns, or refunds, an amount back to a card. Returns simulated via this endpoint clear
     * immediately, without prior authorization, and result in a `SETTLED` transaction status.
     */
    suspend fun simulateReturn(
        params: TransactionSimulateReturnParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): TransactionSimulateReturnResponse

    /**
     * Reverses a return, i.e. a credit transaction with a `SETTLED` status. Returns can be
     * financial credit authorizations, or credit authorizations that have cleared.
     */
    suspend fun simulateReturnReversal(
        params: TransactionSimulateReturnReversalParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): TransactionSimulateReturnReversalResponse

    /**
     * Voids a pending authorization. If `amount` is not set, the full amount will be voided. Can be
     * used on partially voided transactions but not partially cleared transactions. _Simulating an
     * authorization expiry on credit authorizations or credit authorization advice is not currently
     * supported but will be added soon._
     */
    suspend fun simulateVoid(
        params: TransactionSimulateVoidParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): TransactionSimulateVoidResponse

    /**
     * A view of [TransactionServiceAsync] that provides access to raw HTTP responses for each
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
        ): TransactionServiceAsync.WithRawResponse

        fun enhancedCommercialData(): EnhancedCommercialDataServiceAsync.WithRawResponse

        fun events(): EventServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /v1/transactions/{transaction_token}`, but is
         * otherwise the same as [TransactionServiceAsync.retrieve].
         */
        @MustBeClosed
        suspend fun retrieve(
            transactionToken: String,
            params: TransactionRetrieveParams = TransactionRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Transaction> =
            retrieve(params.toBuilder().transactionToken(transactionToken).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        suspend fun retrieve(
            params: TransactionRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Transaction>

        /** @see retrieve */
        @MustBeClosed
        suspend fun retrieve(
            transactionToken: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<Transaction> =
            retrieve(transactionToken, TransactionRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /v1/transactions`, but is otherwise the same as
         * [TransactionServiceAsync.list].
         */
        @MustBeClosed
        suspend fun list(
            params: TransactionListParams = TransactionListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<TransactionListPageAsync>

        /** @see list */
        @MustBeClosed
        suspend fun list(
            requestOptions: RequestOptions
        ): HttpResponseFor<TransactionListPageAsync> =
            list(TransactionListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post
         * /v1/transactions/{transaction_token}/expire_authorization`, but is otherwise the same as
         * [TransactionServiceAsync.expireAuthorization].
         */
        @MustBeClosed
        suspend fun expireAuthorization(
            transactionToken: String,
            params: TransactionExpireAuthorizationParams =
                TransactionExpireAuthorizationParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse =
            expireAuthorization(
                params.toBuilder().transactionToken(transactionToken).build(),
                requestOptions,
            )

        /** @see expireAuthorization */
        @MustBeClosed
        suspend fun expireAuthorization(
            params: TransactionExpireAuthorizationParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see expireAuthorization */
        @MustBeClosed
        suspend fun expireAuthorization(
            transactionToken: String,
            requestOptions: RequestOptions,
        ): HttpResponse =
            expireAuthorization(
                transactionToken,
                TransactionExpireAuthorizationParams.none(),
                requestOptions,
            )

        /**
         * Returns a raw HTTP response for `post /v1/simulate/authorize`, but is otherwise the same
         * as [TransactionServiceAsync.simulateAuthorization].
         */
        @MustBeClosed
        suspend fun simulateAuthorization(
            params: TransactionSimulateAuthorizationParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<TransactionSimulateAuthorizationResponse>

        /**
         * Returns a raw HTTP response for `post /v1/simulate/authorization_advice`, but is
         * otherwise the same as [TransactionServiceAsync.simulateAuthorizationAdvice].
         */
        @MustBeClosed
        suspend fun simulateAuthorizationAdvice(
            params: TransactionSimulateAuthorizationAdviceParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<TransactionSimulateAuthorizationAdviceResponse>

        /**
         * Returns a raw HTTP response for `post /v1/simulate/clearing`, but is otherwise the same
         * as [TransactionServiceAsync.simulateClearing].
         */
        @MustBeClosed
        suspend fun simulateClearing(
            params: TransactionSimulateClearingParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<TransactionSimulateClearingResponse>

        /**
         * Returns a raw HTTP response for `post /v1/simulate/credit_authorization_advice`, but is
         * otherwise the same as [TransactionServiceAsync.simulateCreditAuthorization].
         */
        @MustBeClosed
        suspend fun simulateCreditAuthorization(
            params: TransactionSimulateCreditAuthorizationParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<TransactionSimulateCreditAuthorizationResponse>

        /**
         * Returns a raw HTTP response for `post /v1/simulate/return`, but is otherwise the same as
         * [TransactionServiceAsync.simulateReturn].
         */
        @MustBeClosed
        suspend fun simulateReturn(
            params: TransactionSimulateReturnParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<TransactionSimulateReturnResponse>

        /**
         * Returns a raw HTTP response for `post /v1/simulate/return_reversal`, but is otherwise the
         * same as [TransactionServiceAsync.simulateReturnReversal].
         */
        @MustBeClosed
        suspend fun simulateReturnReversal(
            params: TransactionSimulateReturnReversalParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<TransactionSimulateReturnReversalResponse>

        /**
         * Returns a raw HTTP response for `post /v1/simulate/void`, but is otherwise the same as
         * [TransactionServiceAsync.simulateVoid].
         */
        @MustBeClosed
        suspend fun simulateVoid(
            params: TransactionSimulateVoidParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<TransactionSimulateVoidResponse>
    }
}
