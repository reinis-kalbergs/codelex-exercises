package io.codelex.classesandobjects.exercises.exercise9;

public class Point {
    public int x;
    public int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public static void swapPoints(Point p1, Point p2) {
        int tempX = p1.x;
        p1.x = p2.x;
        p2.x = tempX;
        int tempY = p1.y;
        p1.y = p2.y;
        p2.y = tempY;
    }
}
