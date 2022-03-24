package io.codelex.collections.practice;

import java.util.*;

/**
 * Origination:
 * Audi -> Germany
 * BMW -> Germany
 * Honda -> Japan
 * Mercedes -> Germany
 * VolksWagen -> Germany
 * Tesla -> USA
 */
public class Exercise1 {
    public static void main(String[] args) {
        String[] array = {"Audi", "BMW", "Honda", "Mercedes", "VolksWagen", "Mercedes", "Tesla"};

        //replace array with an ArrayList and print out the results
        List<String> list = new ArrayList<>(Arrays.asList(array));
        System.out.println(list);

        //replace array with a HashSet and print out the results
        Set<String> set = new HashSet<>();
        Collections.addAll(set, array);
        System.out.println(set);

        //replace array with a HashMap (use brand as key and origination as value) an print out the results
        Map<String, String> map = new HashMap<>();
        for (String key : array) {
            switch (key) {
                case "Audi", "BMW", "Mercedes", "VolksWagen" -> map.put(key, "Germany");
                case "Honda" -> map.put(key, "Japan");
                case "Tesla" -> map.put(key, "USA");
            }
        }
        System.out.println(map);
    }
}
