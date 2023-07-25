@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.lithic.api.services.async.externalBankAccounts

import com.lithic.api.core.RequestOptions
import com.lithic.api.models.ExternalBankAccountMicroDepositCreateParams
import com.lithic.api.models.MicroDepositCreateResponse

interface MicroDepositServiceAsync {

    /** Verify the external bank account by providing the micro deposit amounts. */
    suspend fun create(
        params: ExternalBankAccountMicroDepositCreateParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): MicroDepositCreateResponse
}
