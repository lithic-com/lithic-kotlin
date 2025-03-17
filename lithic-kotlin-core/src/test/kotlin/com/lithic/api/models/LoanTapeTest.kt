// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import java.time.LocalDate
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class LoanTapeTest {

    @Test
    fun createLoanTape() {
        val loanTape =
            LoanTape.builder()
                .token("token")
                .accountStanding(
                    LoanTape.AccountStanding.builder()
                        .consecutiveFullPaymentsMade(0L)
                        .consecutiveMinimumPaymentsMade(0L)
                        .consecutiveMinimumPaymentsMissed(0L)
                        .daysPastDue(0L)
                        .hasGrace(true)
                        .periodNumber(0L)
                        .periodState(LoanTape.AccountStanding.PeriodState.STANDARD)
                        .build()
                )
                .availableCredit(0L)
                .balances(
                    LoanTape.Balances.builder()
                        .due(
                            LoanTape.Balances.CategoryBalances.builder()
                                .fees(0L)
                                .interest(0L)
                                .principal(0L)
                                .build()
                        )
                        .nextStatementDue(
                            LoanTape.Balances.CategoryBalances.builder()
                                .fees(0L)
                                .interest(0L)
                                .principal(0L)
                                .build()
                        )
                        .pastDue(
                            LoanTape.Balances.CategoryBalances.builder()
                                .fees(0L)
                                .interest(0L)
                                .principal(0L)
                                .build()
                        )
                        .pastStatementsDue(
                            LoanTape.Balances.CategoryBalances.builder()
                                .fees(0L)
                                .interest(0L)
                                .principal(0L)
                                .build()
                        )
                        .build()
                )
                .created(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .creditLimit(0L)
                .creditProductToken("credit_product_token")
                .date(LocalDate.parse("2019-12-27"))
                .dayTotals(
                    LoanTape.StatementTotals.builder()
                        .balanceTransfers(0L)
                        .cashAdvances(0L)
                        .credits(0L)
                        .fees(0L)
                        .interest(0L)
                        .payments(0L)
                        .purchases(0L)
                        .build()
                )
                .endingBalance(0L)
                .excessCredits(0L)
                .financialAccountToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .interestDetails(
                    LoanTape.InterestDetails.builder()
                        .actualInterestCharged(0L)
                        .dailyBalanceAmounts(
                            LoanTape.InterestDetails.CategoryDetails.builder()
                                .balanceTransfers("balance_transfers")
                                .cashAdvances("cash_advances")
                                .purchases("purchases")
                                .build()
                        )
                        .effectiveApr(
                            LoanTape.InterestDetails.CategoryDetails.builder()
                                .balanceTransfers("balance_transfers")
                                .cashAdvances("cash_advances")
                                .purchases("purchases")
                                .build()
                        )
                        .interestCalculationMethod(
                            LoanTape.InterestDetails.InterestCalculationMethod.DAILY
                        )
                        .interestForPeriod(
                            LoanTape.InterestDetails.CategoryDetails.builder()
                                .balanceTransfers("balance_transfers")
                                .cashAdvances("cash_advances")
                                .purchases("purchases")
                                .build()
                        )
                        .primeRate("prime_rate")
                        .minimumInterestCharged(0L)
                        .build()
                )
                .minimumPaymentBalance(
                    LoanTape.BalanceDetails.builder().amount(0L).remaining(0L).build()
                )
                .paymentAllocation(
                    LoanTape.CategoryBalances.builder().fees(0L).interest(0L).principal(0L).build()
                )
                .periodTotals(
                    LoanTape.StatementTotals.builder()
                        .balanceTransfers(0L)
                        .cashAdvances(0L)
                        .credits(0L)
                        .fees(0L)
                        .interest(0L)
                        .payments(0L)
                        .purchases(0L)
                        .build()
                )
                .previousStatementBalance(
                    LoanTape.BalanceDetails.builder().amount(0L).remaining(0L).build()
                )
                .startingBalance(0L)
                .updated(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .version(0L)
                .ytdTotals(
                    LoanTape.StatementTotals.builder()
                        .balanceTransfers(0L)
                        .cashAdvances(0L)
                        .credits(0L)
                        .fees(0L)
                        .interest(0L)
                        .payments(0L)
                        .purchases(0L)
                        .build()
                )
                .tier("tier")
                .build()
        assertThat(loanTape).isNotNull
        assertThat(loanTape.token()).isEqualTo("token")
        assertThat(loanTape.accountStanding())
            .isEqualTo(
                LoanTape.AccountStanding.builder()
                    .consecutiveFullPaymentsMade(0L)
                    .consecutiveMinimumPaymentsMade(0L)
                    .consecutiveMinimumPaymentsMissed(0L)
                    .daysPastDue(0L)
                    .hasGrace(true)
                    .periodNumber(0L)
                    .periodState(LoanTape.AccountStanding.PeriodState.STANDARD)
                    .build()
            )
        assertThat(loanTape.availableCredit()).isEqualTo(0L)
        assertThat(loanTape.balances())
            .isEqualTo(
                LoanTape.Balances.builder()
                    .due(
                        LoanTape.Balances.CategoryBalances.builder()
                            .fees(0L)
                            .interest(0L)
                            .principal(0L)
                            .build()
                    )
                    .nextStatementDue(
                        LoanTape.Balances.CategoryBalances.builder()
                            .fees(0L)
                            .interest(0L)
                            .principal(0L)
                            .build()
                    )
                    .pastDue(
                        LoanTape.Balances.CategoryBalances.builder()
                            .fees(0L)
                            .interest(0L)
                            .principal(0L)
                            .build()
                    )
                    .pastStatementsDue(
                        LoanTape.Balances.CategoryBalances.builder()
                            .fees(0L)
                            .interest(0L)
                            .principal(0L)
                            .build()
                    )
                    .build()
            )
        assertThat(loanTape.created()).isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(loanTape.creditLimit()).isEqualTo(0L)
        assertThat(loanTape.creditProductToken()).isEqualTo("credit_product_token")
        assertThat(loanTape.date()).isEqualTo(LocalDate.parse("2019-12-27"))
        assertThat(loanTape.dayTotals())
            .isEqualTo(
                LoanTape.StatementTotals.builder()
                    .balanceTransfers(0L)
                    .cashAdvances(0L)
                    .credits(0L)
                    .fees(0L)
                    .interest(0L)
                    .payments(0L)
                    .purchases(0L)
                    .build()
            )
        assertThat(loanTape.endingBalance()).isEqualTo(0L)
        assertThat(loanTape.excessCredits()).isEqualTo(0L)
        assertThat(loanTape.financialAccountToken())
            .isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(loanTape.interestDetails())
            .isEqualTo(
                LoanTape.InterestDetails.builder()
                    .actualInterestCharged(0L)
                    .dailyBalanceAmounts(
                        LoanTape.InterestDetails.CategoryDetails.builder()
                            .balanceTransfers("balance_transfers")
                            .cashAdvances("cash_advances")
                            .purchases("purchases")
                            .build()
                    )
                    .effectiveApr(
                        LoanTape.InterestDetails.CategoryDetails.builder()
                            .balanceTransfers("balance_transfers")
                            .cashAdvances("cash_advances")
                            .purchases("purchases")
                            .build()
                    )
                    .interestCalculationMethod(
                        LoanTape.InterestDetails.InterestCalculationMethod.DAILY
                    )
                    .interestForPeriod(
                        LoanTape.InterestDetails.CategoryDetails.builder()
                            .balanceTransfers("balance_transfers")
                            .cashAdvances("cash_advances")
                            .purchases("purchases")
                            .build()
                    )
                    .primeRate("prime_rate")
                    .minimumInterestCharged(0L)
                    .build()
            )
        assertThat(loanTape.minimumPaymentBalance())
            .isEqualTo(LoanTape.BalanceDetails.builder().amount(0L).remaining(0L).build())
        assertThat(loanTape.paymentAllocation())
            .isEqualTo(
                LoanTape.CategoryBalances.builder().fees(0L).interest(0L).principal(0L).build()
            )
        assertThat(loanTape.periodTotals())
            .isEqualTo(
                LoanTape.StatementTotals.builder()
                    .balanceTransfers(0L)
                    .cashAdvances(0L)
                    .credits(0L)
                    .fees(0L)
                    .interest(0L)
                    .payments(0L)
                    .purchases(0L)
                    .build()
            )
        assertThat(loanTape.previousStatementBalance())
            .isEqualTo(LoanTape.BalanceDetails.builder().amount(0L).remaining(0L).build())
        assertThat(loanTape.startingBalance()).isEqualTo(0L)
        assertThat(loanTape.updated()).isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(loanTape.version()).isEqualTo(0L)
        assertThat(loanTape.ytdTotals())
            .isEqualTo(
                LoanTape.StatementTotals.builder()
                    .balanceTransfers(0L)
                    .cashAdvances(0L)
                    .credits(0L)
                    .fees(0L)
                    .interest(0L)
                    .payments(0L)
                    .purchases(0L)
                    .build()
            )
        assertThat(loanTape.tier()).isEqualTo("tier")
    }
}
