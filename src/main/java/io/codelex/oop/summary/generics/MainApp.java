package io.codelex.oop.summary.generics;

import java.math.BigDecimal;

public class MainApp {
    public static void main(String[] args) {
        System.out.println(Combiner.combineTwoItems("123", BigDecimal.ONE));

        Printer<Double> printer = new Printer<>(123.2);
        printer.print();

        StorageHouse<String> storageHouse = new StorageHouse<>("notNull");
        storageHouse.addMoreItems("abc");
        System.out.println(storageHouse.getMaybeFirstItem().isPresent());
        storageHouse.printItems();

    }
}
