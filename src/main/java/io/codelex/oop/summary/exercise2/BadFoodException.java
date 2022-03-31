package io.codelex.oop.summary.exercise2;

public class BadFoodException extends IllegalArgumentException {
    public BadFoodException() {
    }

    public BadFoodException(String s) {
        super(s);
    }
}
