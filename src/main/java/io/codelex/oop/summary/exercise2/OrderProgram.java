package io.codelex.oop.summary.exercise2;

import java.math.BigDecimal;
import java.time.LocalDate;

public class OrderProgram {
    public static void main(String[] args) {

        FoodItem foodItem = new FoodItem("Milk", new BigDecimal("0.75"), LocalDate.now());
        ElectronicsItem electronicsItem = new ElectronicsItem("Radio", new BigDecimal("25.00"), 100);
        HouseholdItem householdItem = new HouseholdItem("Bucket", new BigDecimal("5.00"), "red");
        //HouseholdItem householdItem2 = new HouseholdItem("Item packing", new BigDecimal("5.00"), "red");

        Order order = new Order();
        order.addItem(foodItem);
        order.addItem(electronicsItem);
        order.addItem(householdItem);
        //order.addItem(householdItem2);
        System.out.println(order);

        Invoice invoice = new Invoice(order, 123);
        System.out.println(invoice.getInvoice());

    }
}
