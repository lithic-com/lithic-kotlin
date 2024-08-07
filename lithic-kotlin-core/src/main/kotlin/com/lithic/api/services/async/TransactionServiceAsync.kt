// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.lithic.api.services.async

import com.lithic.api.core.RequestOptions
import com.lithic.api.models.Transaction
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

    fun enhancedCommercialData(): EnhancedCommercialDataServiceAsync

    fun events(): EventServiceAsync

    /** Get specific card transaction. */
    suspend fun retrieve(
        params: TransactionRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): Transaction

    /** List card transactions. */
    suspend fun list(
        params: TransactionListParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): TransactionListPageAsync

    /**
     * Simulates an authorization request from the payment network as if it came from a merchant
     * acquirer. If you're configured for ASA, simulating auths requires your ASA client to be set
     * up properly (respond with a valid JSON to the ASA request). For users that are not configured
     * for ASA, a daily transaction limit of $5000 USD is applied by default. This limit can be
     * modified via the [update account](https://docs.lithic.com/reference/patchaccountbytoken)
     * endpoint.
     */
    suspend fun simulateAuthorization(
        params: TransactionSimulateAuthorizationParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): TransactionSimulateAuthorizationResponse

    /**
     * Simulates an authorization advice request from the payment network as if it came from a
     * merchant acquirer. An authorization advice request changes the amount of the transaction.
     */
    suspend fun simulateAuthorizationAdvice(
        params: TransactionSimulateAuthorizationAdviceParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): TransactionSimulateAuthorizationAdviceResponse

    /**
     * Clears an existing authorization. After this event, the transaction is no longer pending.
     *
     * If no `amount` is supplied to this endpoint, the amount of the transaction will be captured.
     * Any transaction that has any amount completed at all do not have access to this behavior.
     */
    suspend fun simulateClearing(
        params: TransactionSimulateClearingParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): TransactionSimulateClearingResponse

    /**
     * Simulates a credit authorization advice message from the payment network. This message
     * indicates that a credit authorization was approved on your behalf by the network.
     */
    suspend fun simulateCreditAuthorization(
        params: TransactionSimulateCreditAuthorizationParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): TransactionSimulateCreditAuthorizationResponse

    /**
     * Returns (aka refunds) an amount back to a card. Returns are cleared immediately and do not
     * spend time in a `PENDING` state.
     */
    suspend fun simulateReturn(
        params: TransactionSimulateReturnParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): TransactionSimulateReturnResponse

    /**
     * Voids a settled credit transaction – i.e., a transaction with a negative amount and `SETTLED`
     * status. These can be credit authorizations that have already cleared or financial credit
     * authorizations.
     */
    suspend fun simulateReturnReversal(
        params: TransactionSimulateReturnReversalParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): TransactionSimulateReturnReversalResponse

    /**
     * Voids an existing, uncleared (aka pending) authorization. If amount is not sent the full
     * amount will be voided. Cannot be used on partially completed transactions, but can be used on
     * partially voided transactions. _Note that simulating an authorization expiry on credit
     * authorizations or credit authorization advice is not currently supported but will be added
     * soon._
     */
    suspend fun simulateVoid(
        params: TransactionSimulateVoidParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): TransactionSimulateVoidResponse
}
