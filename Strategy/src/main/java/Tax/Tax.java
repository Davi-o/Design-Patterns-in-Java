package Tax;

import Budget.Budget;

import java.math.BigDecimal;

public interface Tax {
    BigDecimal calculate(Budget budget);
}
