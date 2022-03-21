package io.codelex.oop.shapes;

public class Hexagon extends Shape {//regularHexagon
    private double sideLength;

    public Hexagon(int numSides, double sideLength) {
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
        return sideLength * sideLength * 3 * Math.sqrt(3) / 2;
    }

    @Override
    protected double getPerimeter() {
        return sideLength * 6;
    }
}
