package io.codelex.oop.shapes;

public class Cube extends Shape3D {
    private double sideLength;

    public Cube(int numSides, double sideLength) {
        super(numSides);
        this.sideLength = sideLength;
    }

    public double getSideLength() {
        return sideLength;
    }

    public void setSideLength(double sideLength) {
        this.sideLength = sideLength;
    }

    @Override
    protected double getArea() {
        return sideLength * sideLength * 6;
    }

    @Override
    protected double getPerimeter() {
        return sideLength * 12;
    }

    @Override
    public double calculateVolume() {
        return sideLength * sideLength * sideLength;
    }
}
