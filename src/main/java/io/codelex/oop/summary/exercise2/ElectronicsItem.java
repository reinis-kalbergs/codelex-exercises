package io.codelex.oop.summary.exercise2;

import java.math.BigDecimal;

public class ElectronicsItem extends AbstractItem {

    private int powerInWatts;

    public ElectronicsItem(String name, BigDecimal price, int powerInWatts) {
        super(name, price);
        this.powerInWatts = powerInWatts;
    }

    public int getPowerInWatts() {
        return powerInWatts;
    }

    @Override
    public String fullInfo() {
        return super.fullInfo() + " power: " + powerInWatts + "W";
    }
}
