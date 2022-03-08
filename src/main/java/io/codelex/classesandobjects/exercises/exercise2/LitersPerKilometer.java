package io.codelex.classesandobjects.exercises.exercise2;

import java.util.Scanner;

public class LitersPerKilometer {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double startKilometers, endKilometers, liters;

        System.out.print("Enter first reading: ");
        startKilometers = scan.nextDouble();

        System.out.print("Enter second reading: ");
        endKilometers = scan.nextDouble();

        System.out.print("Enter liters consumed: ");
        liters = scan.nextDouble();

        Car car = new Car(startKilometers);
        car.filUp(endKilometers, liters);
        System.out.println("For this car: liters per 100 kilometers are " + car.calculateConsumption());
        if (car.gasHog()) {
            System.out.println("This car is a gas hog");
        } else if (car.economyCar()) {
            System.out.println("This car is an economy car");
        }

        System.out.print("Enter second reading: ");
        endKilometers = scan.nextDouble();

        System.out.print("Enter liters consumed: ");
        liters = scan.nextDouble();
        car.filUp(endKilometers, liters);
        System.out.println("For this car: liters per 100 kilometers are " + car.calculateConsumption());

    }
}
