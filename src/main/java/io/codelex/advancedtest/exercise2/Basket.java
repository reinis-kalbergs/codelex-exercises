package io.codelex.advancedtest.exercise2;

import java.util.Stack;

public class Basket<T> {

    private Stack<T> basket = new Stack<>();

    public Basket() {

    }

    public void addToBasket(T item) {
        if (basket.size() == 10) {
            throw new BasketFullException("Basket is full");
        }
        basket.add(item);
    }

    public void removeFromBasket() {
        if (basket.size() == 0) {
            throw new BasketEmptyException("Basket is empty!");
        }
        basket.pop();
    }

}
