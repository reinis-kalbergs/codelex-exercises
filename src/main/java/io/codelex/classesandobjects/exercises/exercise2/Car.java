package io.codelex.classesandobjects.exercises.exercise2;

public class Car {
    private double startKilometers;
    private double endKilometers;
    private double liters;

    public Car(double startOdo) {
        this.startKilometers = startOdo;
    }

    public double calculateConsumption() {
        return liters/(endKilometers - startKilometers)*100;
    }//liters per 100km

    public void filUp(double mileage, double liters) {
        this.endKilometers = mileage;
        this.liters += liters;
    }

    public boolean gasHog() {
        return calculateConsumption() > 15;
    }

    public boolean economyCar() {
        return calculateConsumption() < 5;
    }
}
