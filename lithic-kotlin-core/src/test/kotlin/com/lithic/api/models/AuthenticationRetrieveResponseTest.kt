// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class AuthenticationRetrieveResponseTest {

    @Test
    fun createAuthenticationRetrieveResponse() {
        val authenticationRetrieveResponse =
            AuthenticationRetrieveResponse.builder()
                .token("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .accountType(AuthenticationRetrieveResponse.AccountType.CREDIT)
                .authenticationResult(AuthenticationRetrieveResponse.AuthenticationResult.DECLINE)
                .cardExpiryCheck(AuthenticationRetrieveResponse.CardExpiryCheck.MATCH)
                .cardToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .cardholder(
                    AuthenticationRetrieveResponse.Cardholder.builder()
                        .addressMatch(true)
                        .billingAddress(
                            AuthenticationRetrieveResponse.Cardholder.ThreeDSAddress.builder()
                                .address1("address1")
                                .address2("address2")
                                .address3("address3")
                                .city("city")
                                .country("xxx")
                                .postalCode("postal_code")
                                .build()
                        )
                        .email("x")
                        .name("x")
                        .phoneNumberHome("x")
                        .phoneNumberMobile("x")
                        .phoneNumberWork("x")
                        .shippingAddress(
                            AuthenticationRetrieveResponse.Cardholder.ThreeDSAddress.builder()
                                .address1("address1")
                                .address2("address2")
                                .address3("address3")
                                .city("city")
                                .country("xxx")
                                .postalCode("postal_code")
                                .build()
                        )
                        .build()
                )
                .channel(AuthenticationRetrieveResponse.Channel.APP_BASED)
                .created(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .decisionMadeBy(AuthenticationRetrieveResponse.DecisionMadeBy.CUSTOMER_ENDPOINT)
                .merchant(
                    AuthenticationRetrieveResponse.Merchant.builder()
                        .id("id")
                        .country("xxx")
                        .mcc("xxxx")
                        .name("name")
                        .riskIndicator(
                            AuthenticationRetrieveResponse.Merchant.RiskIndicator.builder()
                                .deliveryEmailAddress("delivery_email_address")
                                .deliveryTimeFrame(
                                    AuthenticationRetrieveResponse.Merchant.RiskIndicator
                                        .DeliveryTimeFrame
                                        .ELECTRONIC_DELIVERY
                                )
                                .giftCardAmount(42.23)
                                .giftCardCount(42.23)
                                .giftCardCurrency("xxx")
                                .orderAvailability(
                                    AuthenticationRetrieveResponse.Merchant.RiskIndicator
                                        .OrderAvailability
                                        .FUTURE_AVAILABILITY
                                )
                                .preOrderAvailableDate(
                                    OffsetDateTime.parse("2019-12-27T18:11:19.117Z")
                                )
                                .reorderItems(
                                    AuthenticationRetrieveResponse.Merchant.RiskIndicator
                                        .ReorderItems
                                        .FIRST_TIME_ORDERED
                                )
                                .shippingMethod(
                                    AuthenticationRetrieveResponse.Merchant.RiskIndicator
                                        .ShippingMethod
                                        .DIGITAL_GOODS
                                )
                                .build()
                        )
                        .build()
                )
                .messageCategory(
                    AuthenticationRetrieveResponse.MessageCategory.NON_PAYMENT_AUTHENTICATION
                )
                .additionalData(
                    AuthenticationRetrieveResponse.AdditionalData.builder()
                        .networkDecision(
                            AuthenticationRetrieveResponse.AdditionalData.NetworkDecision.LOW_RISK
                        )
                        .networkRiskScore(42.23)
                        .build()
                )
                .app(
                    AuthenticationRetrieveResponse.App.builder()
                        .deviceInfo("device_info")
                        .ip("ip")
                        .build()
                )
                .authenticationRequestType(
                    AuthenticationRetrieveResponse.AuthenticationRequestType.ADD_CARD
                )
                .browser(
                    AuthenticationRetrieveResponse.Browser.builder()
                        .ip("ip")
                        .javaEnabled(true)
                        .javascriptEnabled(true)
                        .language("language")
                        .timeZone("time_zone")
                        .userAgent("user_agent")
                        .build()
                )
                .threeRiRequestType(
                    AuthenticationRetrieveResponse.ThreeRiRequestType.ACCOUNT_VERIFICATION
                )
                .transaction(
                    AuthenticationRetrieveResponse.Transaction.builder()
                        .amount(42.23)
                        .currency("xxx")
                        .currencyExponent(42.23)
                        .dateTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .type(AuthenticationRetrieveResponse.Transaction.Type.ACCOUNT_FUNDING)
                        .build()
                )
                .build()
        assertThat(authenticationRetrieveResponse).isNotNull
        assertThat(authenticationRetrieveResponse.token())
            .isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(authenticationRetrieveResponse.accountType())
            .isEqualTo(AuthenticationRetrieveResponse.AccountType.CREDIT)
        assertThat(authenticationRetrieveResponse.authenticationResult())
            .isEqualTo(AuthenticationRetrieveResponse.AuthenticationResult.DECLINE)
        assertThat(authenticationRetrieveResponse.cardExpiryCheck())
            .isEqualTo(AuthenticationRetrieveResponse.CardExpiryCheck.MATCH)
        assertThat(authenticationRetrieveResponse.cardToken())
            .isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(authenticationRetrieveResponse.cardholder())
            .isEqualTo(
                AuthenticationRetrieveResponse.Cardholder.builder()
                    .addressMatch(true)
                    .billingAddress(
                        AuthenticationRetrieveResponse.Cardholder.ThreeDSAddress.builder()
                            .address1("address1")
                            .address2("address2")
                            .address3("address3")
                            .city("city")
                            .country("xxx")
                            .postalCode("postal_code")
                            .build()
                    )
                    .email("x")
                    .name("x")
                    .phoneNumberHome("x")
                    .phoneNumberMobile("x")
                    .phoneNumberWork("x")
                    .shippingAddress(
                        AuthenticationRetrieveResponse.Cardholder.ThreeDSAddress.builder()
                            .address1("address1")
                            .address2("address2")
                            .address3("address3")
                            .city("city")
                            .country("xxx")
                            .postalCode("postal_code")
                            .build()
                    )
                    .build()
            )
        assertThat(authenticationRetrieveResponse.channel())
            .isEqualTo(AuthenticationRetrieveResponse.Channel.APP_BASED)
        assertThat(authenticationRetrieveResponse.created())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(authenticationRetrieveResponse.decisionMadeBy())
            .isEqualTo(AuthenticationRetrieveResponse.DecisionMadeBy.CUSTOMER_ENDPOINT)
        assertThat(authenticationRetrieveResponse.merchant())
            .isEqualTo(
                AuthenticationRetrieveResponse.Merchant.builder()
                    .id("id")
                    .country("xxx")
                    .mcc("xxxx")
                    .name("name")
                    .riskIndicator(
                        AuthenticationRetrieveResponse.Merchant.RiskIndicator.builder()
                            .deliveryEmailAddress("delivery_email_address")
                            .deliveryTimeFrame(
                                AuthenticationRetrieveResponse.Merchant.RiskIndicator
                                    .DeliveryTimeFrame
                                    .ELECTRONIC_DELIVERY
                            )
                            .giftCardAmount(42.23)
                            .giftCardCount(42.23)
                            .giftCardCurrency("xxx")
                            .orderAvailability(
                                AuthenticationRetrieveResponse.Merchant.RiskIndicator
                                    .OrderAvailability
                                    .FUTURE_AVAILABILITY
                            )
                            .preOrderAvailableDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .reorderItems(
                                AuthenticationRetrieveResponse.Merchant.RiskIndicator.ReorderItems
                                    .FIRST_TIME_ORDERED
                            )
                            .shippingMethod(
                                AuthenticationRetrieveResponse.Merchant.RiskIndicator.ShippingMethod
                                    .DIGITAL_GOODS
                            )
                            .build()
                    )
                    .build()
            )
        assertThat(authenticationRetrieveResponse.messageCategory())
            .isEqualTo(AuthenticationRetrieveResponse.MessageCategory.NON_PAYMENT_AUTHENTICATION)
        assertThat(authenticationRetrieveResponse.additionalData())
            .isEqualTo(
                AuthenticationRetrieveResponse.AdditionalData.builder()
                    .networkDecision(
                        AuthenticationRetrieveResponse.AdditionalData.NetworkDecision.LOW_RISK
                    )
                    .networkRiskScore(42.23)
                    .build()
            )
        assertThat(authenticationRetrieveResponse.app())
            .isEqualTo(
                AuthenticationRetrieveResponse.App.builder()
                    .deviceInfo("device_info")
                    .ip("ip")
                    .build()
            )
        assertThat(authenticationRetrieveResponse.authenticationRequestType())
            .isEqualTo(AuthenticationRetrieveResponse.AuthenticationRequestType.ADD_CARD)
        assertThat(authenticationRetrieveResponse.browser())
            .isEqualTo(
                AuthenticationRetrieveResponse.Browser.builder()
                    .ip("ip")
                    .javaEnabled(true)
                    .javascriptEnabled(true)
                    .language("language")
                    .timeZone("time_zone")
                    .userAgent("user_agent")
                    .build()
            )
        assertThat(authenticationRetrieveResponse.threeRiRequestType())
            .isEqualTo(AuthenticationRetrieveResponse.ThreeRiRequestType.ACCOUNT_VERIFICATION)
        assertThat(authenticationRetrieveResponse.transaction())
            .isEqualTo(
                AuthenticationRetrieveResponse.Transaction.builder()
                    .amount(42.23)
                    .currency("xxx")
                    .currencyExponent(42.23)
                    .dateTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .type(AuthenticationRetrieveResponse.Transaction.Type.ACCOUNT_FUNDING)
                    .build()
            )
    }
}
