package io.codelex.oop.summary.exercise2;

import java.math.BigDecimal;
import java.time.LocalDate;

public class OrderProgram {
    public static void main(String[] args) {

        FoodItem foodItem = new FoodItem("Milk", new BigDecimal("0.75"), LocalDate.now());
        ElectronicsItem electronicsItem = new ElectronicsItem("Radio", new BigDecimal("25.00"), 100);
        HouseholdItem householdItem = new HouseholdItem("Bucket", new BigDecimal("5.00"), "red");
        ItemPacking itemPacking = new ItemPacking();

        Order order = new Order();
        try {
            order.addItem(foodItem);
        } catch (BadFoodException e) {
            System.out.println("The food item couldn't be added because it's expiration date is old.");
        }
        order.addItem(electronicsItem);
        order.addItem(householdItem);
        order.addItem(itemPacking);


        System.out.println("Order:\n" + order);

        Invoice invoice = new Invoice(order, 123);
        System.out.println(invoice.getInvoice());

    }
}
