// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.lithic.api.core.RequestOptions
import com.lithic.api.core.http.HttpResponseFor
import com.lithic.api.models.transactions.Transaction
import com.lithic.api.models.transactions.TransactionListPage
import com.lithic.api.models.transactions.TransactionListParams
import com.lithic.api.models.transactions.TransactionRetrieveParams
import com.lithic.api.models.transactions.TransactionSimulateAuthorizationAdviceParams
import com.lithic.api.models.transactions.TransactionSimulateAuthorizationAdviceResponse
import com.lithic.api.models.transactions.TransactionSimulateAuthorizationParams
import com.lithic.api.models.transactions.TransactionSimulateAuthorizationResponse
import com.lithic.api.models.transactions.TransactionSimulateClearingParams
import com.lithic.api.models.transactions.TransactionSimulateClearingResponse
import com.lithic.api.models.transactions.TransactionSimulateCreditAuthorizationParams
import com.lithic.api.models.transactions.TransactionSimulateCreditAuthorizationResponse
import com.lithic.api.models.transactions.TransactionSimulateReturnParams
import com.lithic.api.models.transactions.TransactionSimulateReturnResponse
import com.lithic.api.models.transactions.TransactionSimulateReturnReversalParams
import com.lithic.api.models.transactions.TransactionSimulateReturnReversalResponse
import com.lithic.api.models.transactions.TransactionSimulateVoidParams
import com.lithic.api.models.transactions.TransactionSimulateVoidResponse
import com.lithic.api.services.blocking.transactions.EnhancedCommercialDataService
import com.lithic.api.services.blocking.transactions.EventService

interface TransactionService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    fun enhancedCommercialData(): EnhancedCommercialDataService

    fun events(): EventService

    /**
     * Get a specific card transaction. All amounts are in the smallest unit of their respective
     * currency (e.g., cents for USD).
     */
    fun retrieve(
        params: TransactionRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Transaction

    /**
     * List card transactions. All amounts are in the smallest unit of their respective currency
     * (e.g., cents for USD) and inclusive of any acquirer fees.
     */
    fun list(
        params: TransactionListParams = TransactionListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): TransactionListPage

    /** @see [list] */
    fun list(requestOptions: RequestOptions): TransactionListPage =
        list(TransactionListParams.none(), requestOptions)

    /**
     * Simulates an authorization request from the card network as if it came from a merchant
     * acquirer. If you are configured for ASA, simulating authorizations requires your ASA client
     * to be set up properly, i.e. be able to respond to the ASA request with a valid JSON. For
     * users that are not configured for ASA, a daily transaction limit of $5000 USD is applied by
     * default. You can update this limit via the
     * [update account](https://docs.lithic.com/reference/patchaccountbytoken) endpoint.
     */
    fun simulateAuthorization(
        params: TransactionSimulateAuthorizationParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): TransactionSimulateAuthorizationResponse

    /**
     * Simulates an authorization advice from the card network as if it came from a merchant
     * acquirer. An authorization advice changes the pending amount of the transaction.
     */
    fun simulateAuthorizationAdvice(
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
    fun simulateClearing(
        params: TransactionSimulateClearingParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): TransactionSimulateClearingResponse

    /**
     * Simulates a credit authorization advice from the card network. This message indicates that
     * the network approved a credit authorization on your behalf.
     */
    fun simulateCreditAuthorization(
        params: TransactionSimulateCreditAuthorizationParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): TransactionSimulateCreditAuthorizationResponse

    /**
     * Returns, or refunds, an amount back to a card. Returns simulated via this endpoint clear
     * immediately, without prior authorization, and result in a `SETTLED` transaction status.
     */
    fun simulateReturn(
        params: TransactionSimulateReturnParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): TransactionSimulateReturnResponse

    /**
     * Reverses a return, i.e. a credit transaction with a `SETTLED` status. Returns can be
     * financial credit authorizations, or credit authorizations that have cleared.
     */
    fun simulateReturnReversal(
        params: TransactionSimulateReturnReversalParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): TransactionSimulateReturnReversalResponse

    /**
     * Voids a pending authorization. If `amount` is not set, the full amount will be voided. Can be
     * used on partially voided transactions but not partially cleared transactions. _Simulating an
     * authorization expiry on credit authorizations or credit authorization advice is not currently
     * supported but will be added soon._
     */
    fun simulateVoid(
        params: TransactionSimulateVoidParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): TransactionSimulateVoidResponse

    /**
     * A view of [TransactionService] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        fun enhancedCommercialData(): EnhancedCommercialDataService.WithRawResponse

        fun events(): EventService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /v1/transactions/{transaction_token}`, but is
         * otherwise the same as [TransactionService.retrieve].
         */
        @MustBeClosed
        fun retrieve(
            params: TransactionRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Transaction>

        /**
         * Returns a raw HTTP response for `get /v1/transactions`, but is otherwise the same as
         * [TransactionService.list].
         */
        @MustBeClosed
        fun list(
            params: TransactionListParams = TransactionListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<TransactionListPage>

        /** @see [list] */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<TransactionListPage> =
            list(TransactionListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /v1/simulate/authorize`, but is otherwise the same
         * as [TransactionService.simulateAuthorization].
         */
        @MustBeClosed
        fun simulateAuthorization(
            params: TransactionSimulateAuthorizationParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<TransactionSimulateAuthorizationResponse>

        /**
         * Returns a raw HTTP response for `post /v1/simulate/authorization_advice`, but is
         * otherwise the same as [TransactionService.simulateAuthorizationAdvice].
         */
        @MustBeClosed
        fun simulateAuthorizationAdvice(
            params: TransactionSimulateAuthorizationAdviceParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<TransactionSimulateAuthorizationAdviceResponse>

        /**
         * Returns a raw HTTP response for `post /v1/simulate/clearing`, but is otherwise the same
         * as [TransactionService.simulateClearing].
         */
        @MustBeClosed
        fun simulateClearing(
            params: TransactionSimulateClearingParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<TransactionSimulateClearingResponse>

        /**
         * Returns a raw HTTP response for `post /v1/simulate/credit_authorization_advice`, but is
         * otherwise the same as [TransactionService.simulateCreditAuthorization].
         */
        @MustBeClosed
        fun simulateCreditAuthorization(
            params: TransactionSimulateCreditAuthorizationParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<TransactionSimulateCreditAuthorizationResponse>

        /**
         * Returns a raw HTTP response for `post /v1/simulate/return`, but is otherwise the same as
         * [TransactionService.simulateReturn].
         */
        @MustBeClosed
        fun simulateReturn(
            params: TransactionSimulateReturnParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<TransactionSimulateReturnResponse>

        /**
         * Returns a raw HTTP response for `post /v1/simulate/return_reversal`, but is otherwise the
         * same as [TransactionService.simulateReturnReversal].
         */
        @MustBeClosed
        fun simulateReturnReversal(
            params: TransactionSimulateReturnReversalParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<TransactionSimulateReturnReversalResponse>

        /**
         * Returns a raw HTTP response for `post /v1/simulate/void`, but is otherwise the same as
         * [TransactionService.simulateVoid].
         */
        @MustBeClosed
        fun simulateVoid(
            params: TransactionSimulateVoidParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<TransactionSimulateVoidResponse>
    }
}
