// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lithic.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SignalsResponseTest {

    @Test
    fun create() {
        val signalsResponse =
            SignalsResponse.builder()
                .approvedTxnAmountM2(0.0)
                .approvedTxnAmountM2_30d(0.0)
                .approvedTxnAmountM2_7d(0.0)
                .approvedTxnAmountM2_90d(0.0)
                .approvedTxnCount(0L)
                .approvedTxnCount30d(0L)
                .approvedTxnCount7d(0L)
                .approvedTxnCount90d(0L)
                .avgTransactionAmount(0.0)
                .avgTransactionAmount30d(0.0)
                .avgTransactionAmount7d(0.0)
                .avgTransactionAmount90d(0.0)
                .distinctCountryCount(0L)
                .distinctMccCount(0L)
                .firstTxnAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .isFirstTransaction(true)
                .lastCpCountry("last_cp_country")
                .lastCpPostalCode("last_cp_postal_code")
                .lastCpTimestamp(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .lastTxnApprovedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .addSeenCountry("string")
                .addSeenMcc("string")
                .addSeenMerchant("string")
                .stdevTransactionAmount(0.0)
                .stdevTransactionAmount30d(0.0)
                .stdevTransactionAmount7d(0.0)
                .stdevTransactionAmount90d(0.0)
                .threeDSSuccessCount(0L)
                .threeDSSuccessRate(0.0)
                .threeDSTotalCount(0L)
                .timeSinceLastTransactionDays(0.0)
                .build()

        assertThat(signalsResponse.approvedTxnAmountM2()).isEqualTo(0.0)
        assertThat(signalsResponse.approvedTxnAmountM2_30d()).isEqualTo(0.0)
        assertThat(signalsResponse.approvedTxnAmountM2_7d()).isEqualTo(0.0)
        assertThat(signalsResponse.approvedTxnAmountM2_90d()).isEqualTo(0.0)
        assertThat(signalsResponse.approvedTxnCount()).isEqualTo(0L)
        assertThat(signalsResponse.approvedTxnCount30d()).isEqualTo(0L)
        assertThat(signalsResponse.approvedTxnCount7d()).isEqualTo(0L)
        assertThat(signalsResponse.approvedTxnCount90d()).isEqualTo(0L)
        assertThat(signalsResponse.avgTransactionAmount()).isEqualTo(0.0)
        assertThat(signalsResponse.avgTransactionAmount30d()).isEqualTo(0.0)
        assertThat(signalsResponse.avgTransactionAmount7d()).isEqualTo(0.0)
        assertThat(signalsResponse.avgTransactionAmount90d()).isEqualTo(0.0)
        assertThat(signalsResponse.distinctCountryCount()).isEqualTo(0L)
        assertThat(signalsResponse.distinctMccCount()).isEqualTo(0L)
        assertThat(signalsResponse.firstTxnAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(signalsResponse.isFirstTransaction()).isEqualTo(true)
        assertThat(signalsResponse.lastCpCountry()).isEqualTo("last_cp_country")
        assertThat(signalsResponse.lastCpPostalCode()).isEqualTo("last_cp_postal_code")
        assertThat(signalsResponse.lastCpTimestamp())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(signalsResponse.lastTxnApprovedAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(signalsResponse.seenCountries()).containsExactly("string")
        assertThat(signalsResponse.seenMccs()).containsExactly("string")
        assertThat(signalsResponse.seenMerchants()).containsExactly("string")
        assertThat(signalsResponse.stdevTransactionAmount()).isEqualTo(0.0)
        assertThat(signalsResponse.stdevTransactionAmount30d()).isEqualTo(0.0)
        assertThat(signalsResponse.stdevTransactionAmount7d()).isEqualTo(0.0)
        assertThat(signalsResponse.stdevTransactionAmount90d()).isEqualTo(0.0)
        assertThat(signalsResponse.threeDSSuccessCount()).isEqualTo(0L)
        assertThat(signalsResponse.threeDSSuccessRate()).isEqualTo(0.0)
        assertThat(signalsResponse.threeDSTotalCount()).isEqualTo(0L)
        assertThat(signalsResponse.timeSinceLastTransactionDays()).isEqualTo(0.0)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val signalsResponse =
            SignalsResponse.builder()
                .approvedTxnAmountM2(0.0)
                .approvedTxnAmountM2_30d(0.0)
                .approvedTxnAmountM2_7d(0.0)
                .approvedTxnAmountM2_90d(0.0)
                .approvedTxnCount(0L)
                .approvedTxnCount30d(0L)
                .approvedTxnCount7d(0L)
                .approvedTxnCount90d(0L)
                .avgTransactionAmount(0.0)
                .avgTransactionAmount30d(0.0)
                .avgTransactionAmount7d(0.0)
                .avgTransactionAmount90d(0.0)
                .distinctCountryCount(0L)
                .distinctMccCount(0L)
                .firstTxnAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .isFirstTransaction(true)
                .lastCpCountry("last_cp_country")
                .lastCpPostalCode("last_cp_postal_code")
                .lastCpTimestamp(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .lastTxnApprovedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .addSeenCountry("string")
                .addSeenMcc("string")
                .addSeenMerchant("string")
                .stdevTransactionAmount(0.0)
                .stdevTransactionAmount30d(0.0)
                .stdevTransactionAmount7d(0.0)
                .stdevTransactionAmount90d(0.0)
                .threeDSSuccessCount(0L)
                .threeDSSuccessRate(0.0)
                .threeDSTotalCount(0L)
                .timeSinceLastTransactionDays(0.0)
                .build()

        val roundtrippedSignalsResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(signalsResponse),
                jacksonTypeRef<SignalsResponse>(),
            )

        assertThat(roundtrippedSignalsResponse).isEqualTo(signalsResponse)
    }
}
