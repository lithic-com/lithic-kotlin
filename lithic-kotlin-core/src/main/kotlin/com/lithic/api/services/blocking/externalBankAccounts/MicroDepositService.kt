// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.services.blocking.externalBankAccounts

import com.lithic.api.core.RequestOptions
import com.lithic.api.models.ExternalBankAccountMicroDepositCreateParams
import com.lithic.api.models.MicroDepositCreateResponse

interface MicroDepositService {

    /** Verify the external bank account by providing the micro deposit amounts. */
    fun create(
        params: ExternalBankAccountMicroDepositCreateParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): MicroDepositCreateResponse
}
