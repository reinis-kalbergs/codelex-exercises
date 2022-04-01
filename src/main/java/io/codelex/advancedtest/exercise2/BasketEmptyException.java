package io.codelex.advancedtest.exercise2;

public class BasketEmptyException extends RuntimeException {
    public BasketEmptyException() {
    }

    public BasketEmptyException(String message) {
        super(message);
    }
}
