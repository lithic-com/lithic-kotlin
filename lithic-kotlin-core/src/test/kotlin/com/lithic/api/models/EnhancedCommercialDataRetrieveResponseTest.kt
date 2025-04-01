// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lithic.api.core.jsonMapper
import java.time.LocalDate
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class EnhancedCommercialDataRetrieveResponseTest {

    @Test
    fun create() {
        val enhancedCommercialDataRetrieveResponse =
            EnhancedCommercialDataRetrieveResponse.builder()
                .addData(
                    EnhancedData.builder()
                        .token("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .common(
                            EnhancedData.CommonData.builder()
                                .addLineItem(
                                    EnhancedData.CommonData.LineItem.builder()
                                        .amount(0.0)
                                        .description("description")
                                        .productCode("product_code")
                                        .quantity(0.0)
                                        .build()
                                )
                                .tax(
                                    EnhancedData.CommonData.TaxData.builder()
                                        .amount(0L)
                                        .exempt(
                                            EnhancedData.CommonData.TaxData.TaxExemptIndicator
                                                .TAX_INCLUDED
                                        )
                                        .merchantTaxId("merchant_tax_id")
                                        .build()
                                )
                                .customerReferenceNumber("customer_reference_number")
                                .merchantReferenceNumber("merchant_reference_number")
                                .orderDate(LocalDate.parse("2019-12-27"))
                                .build()
                        )
                        .eventToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .addFleet(
                            EnhancedData.Fleet.builder()
                                .amountTotals(
                                    EnhancedData.Fleet.AmountTotals.builder()
                                        .discount(0L)
                                        .grossSale(0L)
                                        .netSale(0L)
                                        .build()
                                )
                                .fuel(
                                    EnhancedData.Fleet.FuelData.builder()
                                        .quantity(0.0)
                                        .type(EnhancedData.Fleet.FuelData.FuelType.UNKNOWN)
                                        .unitOfMeasure(
                                            EnhancedData.Fleet.FuelData.FuelUnitOfMeasure.GALLONS
                                        )
                                        .unitPrice(0L)
                                        .build()
                                )
                                .driverNumber("driver_number")
                                .odometer(0L)
                                .serviceType(EnhancedData.Fleet.ServiceType.UNKNOWN)
                                .vehicleNumber("vehicle_number")
                                .build()
                        )
                        .transactionToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .build()
                )
                .build()

        assertThat(enhancedCommercialDataRetrieveResponse.data())
            .containsExactly(
                EnhancedData.builder()
                    .token("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .common(
                        EnhancedData.CommonData.builder()
                            .addLineItem(
                                EnhancedData.CommonData.LineItem.builder()
                                    .amount(0.0)
                                    .description("description")
                                    .productCode("product_code")
                                    .quantity(0.0)
                                    .build()
                            )
                            .tax(
                                EnhancedData.CommonData.TaxData.builder()
                                    .amount(0L)
                                    .exempt(
                                        EnhancedData.CommonData.TaxData.TaxExemptIndicator
                                            .TAX_INCLUDED
                                    )
                                    .merchantTaxId("merchant_tax_id")
                                    .build()
                            )
                            .customerReferenceNumber("customer_reference_number")
                            .merchantReferenceNumber("merchant_reference_number")
                            .orderDate(LocalDate.parse("2019-12-27"))
                            .build()
                    )
                    .eventToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .addFleet(
                        EnhancedData.Fleet.builder()
                            .amountTotals(
                                EnhancedData.Fleet.AmountTotals.builder()
                                    .discount(0L)
                                    .grossSale(0L)
                                    .netSale(0L)
                                    .build()
                            )
                            .fuel(
                                EnhancedData.Fleet.FuelData.builder()
                                    .quantity(0.0)
                                    .type(EnhancedData.Fleet.FuelData.FuelType.UNKNOWN)
                                    .unitOfMeasure(
                                        EnhancedData.Fleet.FuelData.FuelUnitOfMeasure.GALLONS
                                    )
                                    .unitPrice(0L)
                                    .build()
                            )
                            .driverNumber("driver_number")
                            .odometer(0L)
                            .serviceType(EnhancedData.Fleet.ServiceType.UNKNOWN)
                            .vehicleNumber("vehicle_number")
                            .build()
                    )
                    .transactionToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val enhancedCommercialDataRetrieveResponse =
            EnhancedCommercialDataRetrieveResponse.builder()
                .addData(
                    EnhancedData.builder()
                        .token("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .common(
                            EnhancedData.CommonData.builder()
                                .addLineItem(
                                    EnhancedData.CommonData.LineItem.builder()
                                        .amount(0.0)
                                        .description("description")
                                        .productCode("product_code")
                                        .quantity(0.0)
                                        .build()
                                )
                                .tax(
                                    EnhancedData.CommonData.TaxData.builder()
                                        .amount(0L)
                                        .exempt(
                                            EnhancedData.CommonData.TaxData.TaxExemptIndicator
                                                .TAX_INCLUDED
                                        )
                                        .merchantTaxId("merchant_tax_id")
                                        .build()
                                )
                                .customerReferenceNumber("customer_reference_number")
                                .merchantReferenceNumber("merchant_reference_number")
                                .orderDate(LocalDate.parse("2019-12-27"))
                                .build()
                        )
                        .eventToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .addFleet(
                            EnhancedData.Fleet.builder()
                                .amountTotals(
                                    EnhancedData.Fleet.AmountTotals.builder()
                                        .discount(0L)
                                        .grossSale(0L)
                                        .netSale(0L)
                                        .build()
                                )
                                .fuel(
                                    EnhancedData.Fleet.FuelData.builder()
                                        .quantity(0.0)
                                        .type(EnhancedData.Fleet.FuelData.FuelType.UNKNOWN)
                                        .unitOfMeasure(
                                            EnhancedData.Fleet.FuelData.FuelUnitOfMeasure.GALLONS
                                        )
                                        .unitPrice(0L)
                                        .build()
                                )
                                .driverNumber("driver_number")
                                .odometer(0L)
                                .serviceType(EnhancedData.Fleet.ServiceType.UNKNOWN)
                                .vehicleNumber("vehicle_number")
                                .build()
                        )
                        .transactionToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .build()
                )
                .build()

        val roundtrippedEnhancedCommercialDataRetrieveResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(enhancedCommercialDataRetrieveResponse),
                jacksonTypeRef<EnhancedCommercialDataRetrieveResponse>(),
            )

        assertThat(roundtrippedEnhancedCommercialDataRetrieveResponse)
            .isEqualTo(enhancedCommercialDataRetrieveResponse)
    }
}
