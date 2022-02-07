package Discount;

import Budget.Budget;

import java.math.BigDecimal;

public class SmallAmountOfItemsDiscount extends Discount{

    public SmallAmountOfItemsDiscount(Discount next) {
        super(next);
    }

    public BigDecimal doTheCalculation(Budget budget){
        return budget.getValue().multiply(new BigDecimal("0.1"));
    }

    public boolean shouldApply(Budget budget) {
        return budget.getItemsQuantity() > 5;
    }
}
