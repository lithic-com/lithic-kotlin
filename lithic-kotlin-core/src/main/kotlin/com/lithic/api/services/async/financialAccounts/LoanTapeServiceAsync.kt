// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.lithic.api.services.async.financialAccounts

import com.lithic.api.core.RequestOptions
import com.lithic.api.models.FinancialAccountLoanTapeListPageAsync
import com.lithic.api.models.FinancialAccountLoanTapeListParams
import com.lithic.api.models.FinancialAccountLoanTapeRetrieveParams
import com.lithic.api.models.LoanTape

interface LoanTapeServiceAsync {

    /** Get a specific loan tape for a given financial account. */
    suspend fun retrieve(
        params: FinancialAccountLoanTapeRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): LoanTape

    /** List the loan tapes for a given financial account. */
    suspend fun list(
        params: FinancialAccountLoanTapeListParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): FinancialAccountLoanTapeListPageAsync
}
