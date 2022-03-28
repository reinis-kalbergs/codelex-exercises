package io.codelex.polymorphism.practice.exercise1;

import java.util.ArrayList;
import java.util.List;

/**
 * Take a look at the cars in this package.
 * 1. Extract common behaviour to an interface called Car, and use it in the all classes.
 * Which methods will be extracted with an empty body, and which can be default?
 * 2. Create two more cars of your own choice.
 * 3. As you see there is a possibility to use some kind of boost in Lexus, extract it to a new interface and add that behaviour in one more car.
 * 3. Create one instance of an each car and add them to list.
 * 4. Iterate over the list 10 times, in the 3rd iteration use speed boost on the car if they have one.
 * 5. Print out the car name and speed of the fastest car
 */
public class DragRace {

    public static void main(String[] args) {

        Audi audi = new Audi();
        Lada lada = new Lada();
        Opel opel = new Opel();
        Lexus lexus = new Lexus();
        Tesla tesla = new Tesla();
        Bmw bmw = new Bmw();

        List<Car> allCars = new ArrayList<>();
        allCars.add(audi);
        allCars.add(lada);
        allCars.add(opel);
        allCars.add(lexus);
        allCars.add(tesla);
        allCars.add(bmw);

        for (int i = 0; i < 10; i++) {
            allCars.forEach(Car::speedUp);
            if (i == 2) {
                for (Car car : allCars) {
                    if (car instanceof Booster) {
                        ((Booster) car).useNitrousOxideEngine();
                    }
                }
            }
        }

        int maxSpeed = Integer.parseInt(allCars.get(0).showCurrentSpeed());
        String carName = allCars.get(0).getClass().getSimpleName();

        for (Car car : allCars) {
            if (Integer.parseInt(car.showCurrentSpeed()) > maxSpeed) {
                maxSpeed = Integer.parseInt(car.showCurrentSpeed());
                carName = car.getClass().getSimpleName();
            }
        }
        System.out.printf("The fastest car is: %s, %d", carName, maxSpeed);
    }
}
