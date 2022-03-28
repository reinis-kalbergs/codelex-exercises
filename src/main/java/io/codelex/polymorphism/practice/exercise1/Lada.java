package io.codelex.polymorphism.practice.exercise1;

public class Lada implements Car, Booster {
    private Integer currentSpeed = 0;

    @Override
    public void speedUp() {
        currentSpeed += 5;
    }

    @Override
    public void slowDown() {
        currentSpeed -= 1;
    }

    @Override
    public String showCurrentSpeed() {
        return currentSpeed.toString();
    }

    public void breakDown() {
        currentSpeed = currentSpeed / 2;
    }

    @Override
    public void startEngine() {
        Car.super.startEngine();
        System.out.println("Breaking noises...");
    }

    @Override
    public void useNitrousOxideEngine() {
        System.out.println("Oops the the lada broke down");
        breakDown();
    }
}
