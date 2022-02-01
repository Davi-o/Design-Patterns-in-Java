package Tax;

import Budget.Budget;
import Tax.Tax;

import java.math.BigDecimal;

public class TaxCalculator {
    public BigDecimal calculate(Budget budget, Tax tax){
        return tax.calculate(budget);
    }
}
