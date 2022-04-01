package io.codelex.advancedtest.exercise2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BasketTest {

    @Test
    void mushroomBasketIsEmpty() {
        Basket<Mushroom> basket = new Basket<>();

        basket.addToBasket(new Mushroom());
        basket.removeFromBasket();

        Assertions.assertThrows(BasketEmptyException.class, basket::removeFromBasket);
    }

    @Test
    void appleBasketIsTooFull() {
        Basket<Apple> basket = new Basket<>();

        for (int i = 0; i < 10; i++) {
            basket.addToBasket(new Apple());
        }

        Assertions.assertThrows(BasketFullException.class, () -> basket.addToBasket(new Apple()));
    }
}
