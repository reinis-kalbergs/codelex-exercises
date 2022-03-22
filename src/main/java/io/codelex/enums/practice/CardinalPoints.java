package io.codelex.enums.practice;

public enum CardinalPoints {
    North("up", 0),
    South("down", 1),
    East("right", 2),
    West("left", 3);

    private final String direction;
    private final int num;

    CardinalPoints(String direction, int num) {
        this.direction = direction;
        this.num = num;
    }

    public static void printDirection(CardinalPoints dir) {
        System.out.println(dir + ":" + dir.direction + ":" + dir.num);
    }
}
