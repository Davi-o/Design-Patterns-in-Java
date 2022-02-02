package Discount;

import Budget.Budget;

import java.math.BigDecimal;

public class SmallAmountOfItemsDiscount extends Discount{

    public SmallAmountOfItemsDiscount(Discount next) {
        super(next);
    }

    public BigDecimal calculate(Budget budget){
        if (budget.getItemsQuantity() > 5) {
            return budget.getValue().multiply(new BigDecimal("0.1"));
        }

        return next.calculate(budget);
    }
}
