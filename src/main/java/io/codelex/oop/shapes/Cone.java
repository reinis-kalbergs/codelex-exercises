package io.codelex.oop.shapes;

public class Cone extends Shape3D {
    private double radius;
    private double height;

    public Cone(int numSides, double radius, double height) {
        super(numSides);
        this.radius = radius;
        this.height = height;
    }

    @Override
    protected double getArea() {
        return Math.PI * radius * (radius + Math.sqrt(height * height + radius + radius));
    }

    @Override
    protected double getPerimeter() {
        return radius * 2 * Math.PI;
    }

    @Override
    public double calculateVolume() {
        return Math.PI * radius * radius * height / 3;
    }
}
