package io.codelex.oop.computers;

import java.util.Objects;

public class Laptop extends Computer {
    private String battery;

    public Laptop(String processor, String RAM, String graphicsCard, String company, String model, String battery) {
        super(processor, RAM, graphicsCard, company, model);
        this.battery = battery;
    }

    public String getBattery() {
        return battery;
    }

    public void setBattery(String battery) {
        this.battery = battery;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "processor='" + getProcessor() + '\'' +
                ", RAM='" + getRam() + '\'' +
                ", graphicsCard='" + getGraphicsCard() + '\'' +
                ", company='" + getCompany() + '\'' +
                ", model='" + getModel() + '\'' +
                ", battery='" + battery + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Laptop laptop = (Laptop) o;
        return battery.equals(laptop.battery);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), battery);
    }
}
