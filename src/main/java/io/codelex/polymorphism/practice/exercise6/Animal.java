package io.codelex.polymorphism.practice.exercise6;

import java.text.DecimalFormat;

public abstract class Animal {

    private String animalName;
    final private String animalType;
    private Double animalWeight;
    private Integer foodEaten;

    public Animal(String animalName, String animalType, Double animalWeight) {
        this.animalName = animalName;
        this.animalType = animalType;
        this.animalWeight = animalWeight;
        this.foodEaten = 0;
    }

    public String getAnimalName() {
        return animalName;
    }

    public void setAnimalName(String animalName) {
        this.animalName = animalName;
    }

    public Double getAnimalWeight() {
        return animalWeight;
    }

    public String getAnimalType() {
        return animalType;
    }

    public void setAnimalWeight(Double animalWeight) {
        this.animalWeight = animalWeight;
    }

    public Integer getFoodEaten() {
        return foodEaten;
    }

    public void setFoodEaten(Integer foodEaten) {
        this.foodEaten = foodEaten;
    }

    public abstract void makeSound();

    public abstract void eat(Food food);

    @Override
    public String toString() {
        DecimalFormat decimalFormat = new DecimalFormat("0.####");
        return animalType + '{' + animalName + ", " + decimalFormat.format(animalWeight)
                + ", " + foodEaten + '}';
    }
}
