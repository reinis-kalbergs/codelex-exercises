package io.codelex.classesandobjects.exercises.exercise3;

public class FuelGauge {
    private int currentFuelAmount;

    public int getCurrentFuelAmount() {
        return currentFuelAmount;
    }

    public FuelGauge(int currentFuelAmount) {
        this.currentFuelAmount = currentFuelAmount;
    }

    public FuelGauge() {
        this(0);
    }

    @Override
    public String toString() {
        return "Fuel gauge shows " + currentFuelAmount + " liters";
    }

    public void fillUp() {
        if (currentFuelAmount < 70)
            this.currentFuelAmount++;
        if (this.isFull())
            System.out.println("The fuel tank is full.");

    }

    public void burnFuel() {
        if (currentFuelAmount > 0)
            this.currentFuelAmount--;
    }

    public boolean isFull() {
        return currentFuelAmount == 70;
    }

    public boolean isEmpty() {
        return currentFuelAmount == 0;
    }
}
