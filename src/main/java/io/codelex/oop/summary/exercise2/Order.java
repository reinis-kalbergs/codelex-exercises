package io.codelex.oop.summary.exercise2;

import java.util.ArrayList;
import java.util.List;

public class Order {

    private List<Item> order = new ArrayList<>();

    public void addItem(Item item) {
        order.add(item);
    }

    public List<Item> getOrder() {
        return order;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder("Order:\n");
        for (Item item : order) {
            result.append(item.fullInfo()).append("\n");
        }
        return result.toString();
    }
}
