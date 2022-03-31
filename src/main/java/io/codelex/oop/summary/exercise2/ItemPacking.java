package io.codelex.oop.summary.exercise2;

import java.math.BigDecimal;

public class ItemPacking implements Service {
    public final static String name = "Item packing";
    public final static BigDecimal price = new BigDecimal("5.00");

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
        return name + ", " + price + " EUR";
    }
}
