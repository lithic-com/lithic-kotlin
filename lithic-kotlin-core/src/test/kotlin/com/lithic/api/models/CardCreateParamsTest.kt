// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.lithic.api.core.http.Headers
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CardCreateParamsTest {

    @Test
    fun create() {
        CardCreateParams.builder()
            .idempotencyKey("65a9dad4-1b60-4686-83fd-65b25078a4b4")
            .type(CardCreateParams.Type.VIRTUAL)
            .accountToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .bulkOrderToken("5e9483eb-8103-4e16-9794-2106111b2eca")
            .cardProgramToken("5e9483eb-8103-4e16-9794-2106111b2eca")
            .carrier(Carrier.builder().qrCodeUrl("qr_code_url").build())
            .digitalCardArtToken("5e9483eb-8103-4e16-9794-2106111b2eca")
            .expMonth("06")
            .expYear("2027")
            .memo("New Card")
            .pin("pin")
            .productId("1")
            .replacementAccountToken("5e9483eb-8103-4e16-9794-2106111b2eca")
            .replacementComment("replacement_comment")
            .replacementFor("5e9483eb-8103-4e16-9794-2106111b2eca")
            .replacementSubstatus(CardCreateParams.ReplacementSubstatus.LOST)
            .shippingAddress(
                ShippingAddress.builder()
                    .address1("5 Broad Street")
                    .city("NEW YORK")
                    .country("USA")
                    .firstName("Michael")
                    .lastName("Bluth")
                    .postalCode("10001-1809")
                    .state("NY")
                    .address2("Unit 25A")
                    .email("johnny@appleseed.com")
                    .line2Text("The Bluth Company")
                    .phoneNumber("+15555555555")
                    .build()
            )
            .shippingMethod(CardCreateParams.ShippingMethod._2_DAY)
            .spendLimit(1000L)
            .spendLimitDuration(SpendLimitDuration.TRANSACTION)
            .state(CardCreateParams.State.OPEN)
            .build()
    }

    @Test
    fun headers() {
        val params =
            CardCreateParams.builder()
                .idempotencyKey("65a9dad4-1b60-4686-83fd-65b25078a4b4")
                .type(CardCreateParams.Type.VIRTUAL)
                .accountToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .bulkOrderToken("5e9483eb-8103-4e16-9794-2106111b2eca")
                .cardProgramToken("5e9483eb-8103-4e16-9794-2106111b2eca")
                .carrier(Carrier.builder().qrCodeUrl("qr_code_url").build())
                .digitalCardArtToken("5e9483eb-8103-4e16-9794-2106111b2eca")
                .expMonth("06")
                .expYear("2027")
                .memo("New Card")
                .pin("pin")
                .productId("1")
                .replacementAccountToken("5e9483eb-8103-4e16-9794-2106111b2eca")
                .replacementComment("replacement_comment")
                .replacementFor("5e9483eb-8103-4e16-9794-2106111b2eca")
                .replacementSubstatus(CardCreateParams.ReplacementSubstatus.LOST)
                .shippingAddress(
                    ShippingAddress.builder()
                        .address1("5 Broad Street")
                        .city("NEW YORK")
                        .country("USA")
                        .firstName("Michael")
                        .lastName("Bluth")
                        .postalCode("10001-1809")
                        .state("NY")
                        .address2("Unit 25A")
                        .email("johnny@appleseed.com")
                        .line2Text("The Bluth Company")
                        .phoneNumber("+15555555555")
                        .build()
                )
                .shippingMethod(CardCreateParams.ShippingMethod._2_DAY)
                .spendLimit(1000L)
                .spendLimitDuration(SpendLimitDuration.TRANSACTION)
                .state(CardCreateParams.State.OPEN)
                .build()

        val headers = params._headers()

        assertThat(headers)
            .isEqualTo(
                Headers.builder()
                    .put("Idempotency-Key", "65a9dad4-1b60-4686-83fd-65b25078a4b4")
                    .build()
            )
    }

    @Test
    fun headersWithoutOptionalFields() {
        val params = CardCreateParams.builder().type(CardCreateParams.Type.VIRTUAL).build()

        val headers = params._headers()

        assertThat(headers).isEqualTo(Headers.builder().build())
    }

    @Test
    fun body() {
        val params =
            CardCreateParams.builder()
                .idempotencyKey("65a9dad4-1b60-4686-83fd-65b25078a4b4")
                .type(CardCreateParams.Type.VIRTUAL)
                .accountToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .bulkOrderToken("5e9483eb-8103-4e16-9794-2106111b2eca")
                .cardProgramToken("5e9483eb-8103-4e16-9794-2106111b2eca")
                .carrier(Carrier.builder().qrCodeUrl("qr_code_url").build())
                .digitalCardArtToken("5e9483eb-8103-4e16-9794-2106111b2eca")
                .expMonth("06")
                .expYear("2027")
                .memo("New Card")
                .pin("pin")
                .productId("1")
                .replacementAccountToken("5e9483eb-8103-4e16-9794-2106111b2eca")
                .replacementComment("replacement_comment")
                .replacementFor("5e9483eb-8103-4e16-9794-2106111b2eca")
                .replacementSubstatus(CardCreateParams.ReplacementSubstatus.LOST)
                .shippingAddress(
                    ShippingAddress.builder()
                        .address1("5 Broad Street")
                        .city("NEW YORK")
                        .country("USA")
                        .firstName("Michael")
                        .lastName("Bluth")
                        .postalCode("10001-1809")
                        .state("NY")
                        .address2("Unit 25A")
                        .email("johnny@appleseed.com")
                        .line2Text("The Bluth Company")
                        .phoneNumber("+15555555555")
                        .build()
                )
                .shippingMethod(CardCreateParams.ShippingMethod._2_DAY)
                .spendLimit(1000L)
                .spendLimitDuration(SpendLimitDuration.TRANSACTION)
                .state(CardCreateParams.State.OPEN)
                .build()

        val body = params._body()

        assertThat(body.type()).isEqualTo(CardCreateParams.Type.VIRTUAL)
        assertThat(body.accountToken()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(body.bulkOrderToken()).isEqualTo("5e9483eb-8103-4e16-9794-2106111b2eca")
        assertThat(body.cardProgramToken()).isEqualTo("5e9483eb-8103-4e16-9794-2106111b2eca")
        assertThat(body.carrier()).isEqualTo(Carrier.builder().qrCodeUrl("qr_code_url").build())
        assertThat(body.digitalCardArtToken()).isEqualTo("5e9483eb-8103-4e16-9794-2106111b2eca")
        assertThat(body.expMonth()).isEqualTo("06")
        assertThat(body.expYear()).isEqualTo("2027")
        assertThat(body.memo()).isEqualTo("New Card")
        assertThat(body.pin()).isEqualTo("pin")
        assertThat(body.productId()).isEqualTo("1")
        assertThat(body.replacementAccountToken()).isEqualTo("5e9483eb-8103-4e16-9794-2106111b2eca")
        assertThat(body.replacementComment()).isEqualTo("replacement_comment")
        assertThat(body.replacementFor()).isEqualTo("5e9483eb-8103-4e16-9794-2106111b2eca")
        assertThat(body.replacementSubstatus())
            .isEqualTo(CardCreateParams.ReplacementSubstatus.LOST)
        assertThat(body.shippingAddress())
            .isEqualTo(
                ShippingAddress.builder()
                    .address1("5 Broad Street")
                    .city("NEW YORK")
                    .country("USA")
                    .firstName("Michael")
                    .lastName("Bluth")
                    .postalCode("10001-1809")
                    .state("NY")
                    .address2("Unit 25A")
                    .email("johnny@appleseed.com")
                    .line2Text("The Bluth Company")
                    .phoneNumber("+15555555555")
                    .build()
            )
        assertThat(body.shippingMethod()).isEqualTo(CardCreateParams.ShippingMethod._2_DAY)
        assertThat(body.spendLimit()).isEqualTo(1000L)
        assertThat(body.spendLimitDuration()).isEqualTo(SpendLimitDuration.TRANSACTION)
        assertThat(body.state()).isEqualTo(CardCreateParams.State.OPEN)
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = CardCreateParams.builder().type(CardCreateParams.Type.VIRTUAL).build()

        val body = params._body()

        assertThat(body.type()).isEqualTo(CardCreateParams.Type.VIRTUAL)
    }
}
