// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.services.blocking.financialAccounts

import com.lithic.api.core.RequestOptions
import com.lithic.api.models.FinancialAccountStatementListPage
import com.lithic.api.models.FinancialAccountStatementListParams
import com.lithic.api.models.FinancialAccountStatementRetrieveParams
import com.lithic.api.models.Statement
import com.lithic.api.services.blocking.financialAccounts.statements.LineItemService

interface StatementService {

    fun lineItems(): LineItemService

    /** Get a specific statement for a given financial account. */
    fun retrieve(
        params: FinancialAccountStatementRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Statement

    /** List the statements for a given financial account. */
    fun list(
        params: FinancialAccountStatementListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): FinancialAccountStatementListPage
}
