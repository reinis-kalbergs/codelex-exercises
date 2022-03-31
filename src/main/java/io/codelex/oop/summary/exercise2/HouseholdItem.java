package io.codelex.oop.summary.exercise2;

import java.math.BigDecimal;

public class HouseholdItem extends AbstractItem {

    private String color;

    public HouseholdItem(String name, BigDecimal price, String color) {
        super(name, price);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    @Override
    public String fullInfo() {
        return super.fullInfo() + " color: " + color;
    }
}
