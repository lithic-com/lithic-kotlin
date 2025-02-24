// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.services.async.financialAccounts

import com.lithic.api.core.RequestOptions
import com.lithic.api.models.FinancialTransaction
import com.lithic.api.models.FinancialTransactionListPageAsync
import com.lithic.api.models.FinancialTransactionListParams
import com.lithic.api.models.FinancialTransactionRetrieveParams

interface FinancialTransactionServiceAsync {

    /** Get the financial transaction for the provided token. */
    suspend fun retrieve(
        params: FinancialTransactionRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): FinancialTransaction

    /** List the financial transactions for a given financial account. */
    suspend fun list(
        params: FinancialTransactionListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): FinancialTransactionListPageAsync
}
