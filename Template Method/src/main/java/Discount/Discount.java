package Discount;

import Budget.Budget;

import java.math.BigDecimal;

public abstract class Discount {
    protected Discount next;

    public Discount(Discount next) {
        this.next = next;
    }

    public BigDecimal calculate(Budget budget){

        if(shouldApply(budget)){
            this.doTheCalculation(budget);
        }

        return next.doTheCalculation(budget);
    };

    protected abstract BigDecimal doTheCalculation(Budget budget);

    protected abstract boolean shouldApply(Budget budget);

}
