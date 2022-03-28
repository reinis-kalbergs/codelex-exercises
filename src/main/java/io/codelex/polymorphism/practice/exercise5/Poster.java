package io.codelex.polymorphism.practice.exercise5;

public class Poster extends Advert {
    private int dimensionX;// in cm
    private int dimensionY;// in cm
    private int numberOfCopies;
    private int costPerCopy;

    public Poster(int fee, int dimensionX, int dimensionY, int numberOfCopies, int costPerCopy) {
        super(fee);
        this.dimensionX = dimensionX;
        this.dimensionY = dimensionY;
        this.numberOfCopies = numberOfCopies;
        this.costPerCopy = costPerCopy;
    }

    public int cost() {
        return super.cost() + numberOfCopies * costPerCopy;
    }

    public String toString() {
        return super.toString() + "Poster: Dimensions: " + dimensionX + "x" + dimensionY
                + ", number of copies: " + numberOfCopies + ", cost per copy:" + costPerCopy;
    }
}
