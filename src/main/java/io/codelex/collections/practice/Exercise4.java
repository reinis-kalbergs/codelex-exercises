package io.codelex.collections.practice;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Exercise4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Set<String> listOfNames = new HashSet<>();
        System.out.print("Enter a name: ");
        String input = sc.nextLine();
        while (!input.isBlank()) {
            listOfNames.add(input);
            System.out.print("Enter a name: ");
            input = sc.nextLine();
        }
        System.out.println("Unique name list contains: " + listOfNames);
    }
}
