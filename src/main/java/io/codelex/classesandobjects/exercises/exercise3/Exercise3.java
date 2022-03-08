package io.codelex.classesandobjects.exercises.exercise3;

public class Exercise3 {
    public static void main(String[] args) {

        FuelGauge fuelGauge1 = new FuelGauge();
        Odometer odometer1 = new Odometer(999980);

        System.out.println(fuelGauge1 + "\n");
        while (!fuelGauge1.isFull()) {//simulated fill up
            fuelGauge1.fillUp();
        }
        System.out.println(fuelGauge1 + "\n");

        odometer1.driveFor(fuelGauge1, 680);
        System.out.println(fuelGauge1);
        System.out.println(odometer1 + "\n");

        while (!fuelGauge1.isEmpty()) {
            odometer1.justDrive(fuelGauge1);
            System.out.println("Fuel gauge: " + fuelGauge1.getCurrentFuelAmount() + " Odometer: " + odometer1.getMileage());
        }
    }
}
