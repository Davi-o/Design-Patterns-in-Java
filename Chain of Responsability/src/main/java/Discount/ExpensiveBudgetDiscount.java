package Discount;

import Budget.Budget;

import java.math.BigDecimal;

public class ExpensiveBudgetDiscount extends Discount {

    public ExpensiveBudgetDiscount(Discount next) {
        super(next);
    }

    public BigDecimal calculate(Budget budget){
        if (budget.getValue().compareTo(new BigDecimal("500")) > 0) {
            return budget.getValue().multiply(new BigDecimal("0.05"));
        }

        return BigDecimal.ZERO;
    }
}
