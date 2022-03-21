package io.codelex.oop.shapes;

public abstract class Shape3D extends Shape {
    public Shape3D(int numSides) {
        super(numSides);
    }

    public abstract double calculateVolume();
}
