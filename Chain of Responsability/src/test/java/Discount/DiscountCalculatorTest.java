package Discount;

import Budget.Budget;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

class DiscountCalculatorTest {
    @Test
    void givenAnAmountOfItemsWhenCalculateTheDiscountThenShouldWorkCorrectly(){
        Budget budget = new Budget(new BigDecimal("200"),6);
        DiscountCalculator calculator = new DiscountCalculator();
        assertEquals(new BigDecimal("20.0"),calculator.calculate(budget));
    }

    @Test
    void givenAHighValueWhenCalculateTheDiscountThenShouldWorkCorrectly(){
        Budget budget = new Budget(new BigDecimal("1000"),1);
        DiscountCalculator calculator = new DiscountCalculator();
        assertEquals(new BigDecimal("50.00"),calculator.calculate(budget));
    }

}