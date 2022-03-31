package io.codelex.oop.summary.exercise2;

import java.math.BigDecimal;

public abstract class AbstractItem implements Item {

    private String name;
    private BigDecimal price;

    public AbstractItem(String name, BigDecimal price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public BigDecimal getPrice() {
        return price;
    }

    @Override
    public String fullInfo() {
        return name + ", " + getPrice() + " EUR";
    }
}
