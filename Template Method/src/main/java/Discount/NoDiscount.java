package Discount;

import Budget.Budget;

import java.math.BigDecimal;

public class NoDiscount extends Discount {

    public NoDiscount() {
        super(null);
    }

    public BigDecimal doTheCalculation(Budget budget){
        return BigDecimal.ZERO;
    }

    @Override
    public boolean shouldApply(Budget budget) {
        return true;
    }
}
