package Tax;

import Budget.Budget;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

class TaxesTest {
    @Test
    void givenBudgetWhenCalculateICMSTaxThenWillReturnCorrectly(){
        Budget budget = new Budget(new BigDecimal("100"));
        TaxCalculator calculator = new TaxCalculator();

        assertEquals(new BigDecimal("10.0"),calculator.calculate(budget, new ICMS()));

    }

    @Test
    void givenBudgetWhenCalculateISSTaxThenWillReturnCorrectly(){
        Budget budget = new Budget(new BigDecimal("100"));
        TaxCalculator calculator = new TaxCalculator();

        assertEquals(new BigDecimal("6.00"),calculator.calculate(budget, new ISS()));

    }
}