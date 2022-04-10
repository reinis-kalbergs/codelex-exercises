package io.codelex.advancedtest.exercise2;

import java.util.Stack;

public class Basket<T> {

    private Stack<T> basket;

    public Basket() {
        this.basket = new Stack<>();
    }

    public void addToBasket(T item) {
        final int MAX_BASKET_SIZE = 10;
        if (basket.size() == MAX_BASKET_SIZE) {
            throw new BasketFullException("Basket is full");
        }
        basket.add(item);
    }

    public void removeFromBasket() {
        if (basket.isEmpty()) {
            throw new BasketEmptyException("Basket is empty!");
        }
        basket.pop();
    }

}
