package io.codelex.collections.practice.lists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListExercise11 {

    public static void main(String[] args) {
        // Create an ArrayList with String elements
        List<String> list = new ArrayList<>();
        // Add 10 values to list
        for (int i = 0; i < 10; i++) {
            list.add("Item nr." + (i + 1));
        }
        // Add new value at 5th position
        list.add(4, "Item inserted into 5th position");
        // Change value at last position (Calculate last position programmatically)
        list.set(list.size() - 1, "Last item changed");
        // Sort your list in alphabetical order
        Collections.sort(list);
        // Check if your list contains "Foobar" element
        if (list.contains("Foobar")) {
            System.out.println("list contains \"Foobar\" element");
        } else {
            System.out.println("list doesn't contains \"Foobar\" element");
        }
        // Print each element of list using loop
        for (String element : list) {
            System.out.println(element);
        }
    }

}
