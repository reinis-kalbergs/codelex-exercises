package io.codelex.oop.shapes;

public class ShapesTest {
    public static void main(String[] args) {
        Triangle triangle = new Triangle(3, 4, 5);
        Rectangle rectangle = new Rectangle(4, 6, 7);

        System.out.println(triangle.getArea());
        System.out.println(triangle.getPerimeter());

        System.out.println(rectangle.getArea());
        System.out.println(rectangle.getPerimeter());
    }
}