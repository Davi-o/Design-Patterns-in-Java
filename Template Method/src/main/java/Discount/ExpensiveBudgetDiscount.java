package Discount;

import Budget.Budget;

import java.math.BigDecimal;

public class ExpensiveBudgetDiscount extends Discount {

    public ExpensiveBudgetDiscount(Discount next) {
        super(next);
    }

    public BigDecimal doTheCalculation(Budget budget){
        return budget.getValue().multiply(new BigDecimal("0.05"));
    }

    @Override
    public boolean shouldApply(Budget budget) {
        return budget.getValue().compareTo(new BigDecimal("500")) > 0;
    }
}
