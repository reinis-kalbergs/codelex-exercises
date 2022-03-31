package io.codelex.oop.summary.exercise2;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Order {

    private List<SellableThing> order = new ArrayList<>();

    public void addItem(FoodItem item) throws BadFoodException {
        if (item.getDateOfExpiration().isBefore(LocalDate.now())) {
            throw new BadFoodException("Can't add food with expiration before today!");
        }
        order.add(item);
    }

    public void addItem(SellableThing sellableThing) {
        order.add(sellableThing);
    }

    public List<SellableThing> getOrder() {
        return order;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        for (SellableThing sellableThing : order) {
            result.append(sellableThing.fullInfo()).append("\n");
        }
        return result.toString();
    }
}
