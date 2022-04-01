package io.codelex.advancedtest.exercise2;

public class BasketFullException extends RuntimeException {
    public BasketFullException() {
    }

    public BasketFullException(String message) {
        super(message);
    }
}
