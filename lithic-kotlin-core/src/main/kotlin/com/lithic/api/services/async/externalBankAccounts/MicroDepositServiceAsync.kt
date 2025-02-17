// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.services.async.externalBankAccounts

import com.lithic.api.core.RequestOptions
import com.lithic.api.models.ExternalBankAccountMicroDepositCreateParams
import com.lithic.api.models.MicroDepositCreateResponse

interface MicroDepositServiceAsync {

    /** Verify the external bank account by providing the micro deposit amounts. */
    suspend fun create(
        params: ExternalBankAccountMicroDepositCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): MicroDepositCreateResponse
}
