// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.services.async.financialAccounts.statements

import com.lithic.api.core.RequestOptions
import com.lithic.api.models.FinancialAccountStatementLineItemListPageAsync
import com.lithic.api.models.FinancialAccountStatementLineItemListParams

interface LineItemServiceAsync {

    /** List the line items for a given statement within a given financial account. */
    suspend fun list(
        params: FinancialAccountStatementLineItemListParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): FinancialAccountStatementLineItemListPageAsync
}
