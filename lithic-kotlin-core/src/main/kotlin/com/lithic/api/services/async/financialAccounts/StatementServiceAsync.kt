// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.services.async.financialAccounts

import com.lithic.api.core.RequestOptions
import com.lithic.api.models.FinancialAccountStatementListPageAsync
import com.lithic.api.models.FinancialAccountStatementListParams
import com.lithic.api.models.FinancialAccountStatementRetrieveParams
import com.lithic.api.models.Statement
import com.lithic.api.services.async.financialAccounts.statements.LineItemServiceAsync

interface StatementServiceAsync {

    fun lineItems(): LineItemServiceAsync

    /** Get a specific statement for a given financial account. */
    suspend fun retrieve(
        params: FinancialAccountStatementRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): Statement

    /** List the statements for a given financial account. */
    suspend fun list(
        params: FinancialAccountStatementListParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): FinancialAccountStatementListPageAsync
}
