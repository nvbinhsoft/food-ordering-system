package com.food.ordering.tech.domain.valueobject;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Money {

    private final BigDecimal amount;

    public Money(BigDecimal amount) {
        this.amount = amount;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public boolean isGreaterThanZero() {
        return amount.compareTo(BigDecimal.ZERO) > 0;
    }

    public boolean isGreaterThan(Money money) {
        return amount.compareTo(money.amount) > 0;
    }

    public Money add(Money money) {
        return new Money(setScale(amount.add(money.amount)));
    }

    private BigDecimal setScale(BigDecimal value) {
        return value.setScale(2, RoundingMode.HALF_EVEN);
    }

    public Money multiply(BigDecimal value) {
        return new Money(setScale(amount.multiply(value)));
    }

    public Money subtract(Money money) {
        return new Money(setScale(amount.subtract(money.amount)));
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Money money)) {
            return false;
        }

        return amount.equals(money.amount);
    }

    @Override
    public int hashCode() {
        return amount.hashCode();
    }
}
