package io.codelex.oop.shapes;

public abstract class Shape {
    //exercise 1 and 9
    private final int numSides;

    public Shape(int numSides) {
        this.numSides = numSides;
    }

    public int getNumSides() {
        return numSides;
    }

    protected abstract double getArea();

    protected abstract double getPerimeter();
}