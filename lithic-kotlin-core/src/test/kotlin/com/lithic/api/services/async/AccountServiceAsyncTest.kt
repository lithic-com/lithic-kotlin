// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.services.async

import com.lithic.api.TestServerExtension
import com.lithic.api.client.okhttp.LithicOkHttpClientAsync
import com.lithic.api.models.accounts.AccountRetrieveParams
import com.lithic.api.models.accounts.AccountRetrieveSpendLimitsParams
import com.lithic.api.models.accounts.AccountUpdateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class AccountServiceAsyncTest {

    @Test
    suspend fun retrieve() {
        val client =
            LithicOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My Lithic API Key")
                .build()
        val accountServiceAsync = client.accounts()

        val account =
            accountServiceAsync.retrieve(
                AccountRetrieveParams.builder()
                    .accountToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )

        account.validate()
    }

    @Disabled("Prism returns invalid data")
    @Test
    suspend fun update() {
        val client =
            LithicOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My Lithic API Key")
                .build()
        val accountServiceAsync = client.accounts()

        val account =
            accountServiceAsync.update(
                AccountUpdateParams.builder()
                    .accountToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .dailySpendLimit(1000L)
                    .lifetimeSpendLimit(0L)
                    .monthlySpendLimit(0L)
                    .state(AccountUpdateParams.State.ACTIVE)
                    .verificationAddress(
                        AccountUpdateParams.VerificationAddress.builder()
                            .address1("address1")
                            .address2("address2")
                            .city("city")
                            .country("country")
                            .postalCode("postal_code")
                            .state("state")
                            .build()
                    )
                    .build()
            )

        account.validate()
    }

    @Test
    suspend fun list() {
        val client =
            LithicOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My Lithic API Key")
                .build()
        val accountServiceAsync = client.accounts()

        val page = accountServiceAsync.list()

        page.response().validate()
    }

    @Test
    suspend fun retrieveSpendLimits() {
        val client =
            LithicOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My Lithic API Key")
                .build()
        val accountServiceAsync = client.accounts()

        val accountSpendLimits =
            accountServiceAsync.retrieveSpendLimits(
                AccountRetrieveSpendLimitsParams.builder()
                    .accountToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )

        accountSpendLimits.validate()
    }
}
