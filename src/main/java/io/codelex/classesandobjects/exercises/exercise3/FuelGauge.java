package io.codelex.classesandobjects.exercises.exercise3;

public class FuelGauge {
    private int currentFuelAmount;
    private final int MAX_FUEL_GAUGE = 70;

    public int getCurrentFuelAmount() {
        return currentFuelAmount;
    }

    public FuelGauge(int currentFuelAmount) {
        this.currentFuelAmount = currentFuelAmount;
    }

    public FuelGauge() {
    }

    @Override
    public String toString() {
        return "Fuel gauge shows " + currentFuelAmount + " liters";
    }

    public void fillUp() {
        if (currentFuelAmount < MAX_FUEL_GAUGE) {
            this.currentFuelAmount++;
        }
        if (this.isFull()) {
            System.out.println("The fuel tank is full.");
        }

    }

    public void burnFuel() {
        if (currentFuelAmount > 0)
            this.currentFuelAmount--;
    }

    public boolean isFull() {
        return currentFuelAmount == MAX_FUEL_GAUGE;
    }

    public boolean isEmpty() {
        return currentFuelAmount == 0;
    }
}
