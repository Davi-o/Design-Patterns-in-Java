package Discount;

import Budget.Budget;

import java.math.BigDecimal;

public class DiscountCalculator {

    public BigDecimal calculate(Budget budget){
        return new SmallAmountOfItemsDiscount(
                new ExpensiveBudgetDiscount(new NoDiscount())
        ).calculate(budget);
    }
}
