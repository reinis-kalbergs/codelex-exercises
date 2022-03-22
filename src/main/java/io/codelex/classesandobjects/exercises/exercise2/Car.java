package io.codelex.classesandobjects.exercises.exercise2;

public class Car {
    private double startKilometers;
    private double endKilometers;
    private double liters;

    public Car(double startOdo) {
        this.startKilometers = startOdo;
    }

    public double calculateConsumption() {
        return liters / (endKilometers - startKilometers) * 100;
    }//liters per 100km

    public void filUp(double mileage, double liters) {
        this.endKilometers = mileage;
        this.liters += liters;
    }

    public boolean gasHog() {
        int GAS_HOG_CONSUMPTION = 15;
        return calculateConsumption() > GAS_HOG_CONSUMPTION;
    }

    public boolean economyCar() {
        int ECONOMY_CAR_CONSUMPTION = 5;
        return calculateConsumption() < ECONOMY_CAR_CONSUMPTION;
    }
}
