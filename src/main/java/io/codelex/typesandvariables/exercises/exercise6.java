package io.codelex.typesandvariables.exercises;

import java.util.Scanner;

public class exercise6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any single digit number:");
        int sum = 0;
        String input = sc.nextLine();
        while (!input.equals("stop")) {
            if (isSingleDigit(input)) {
                sum += Integer.parseInt(input);
            } else {
                System.out.println("Not a single numeric digit");
            }
            System.out.println("Sum of numbers:" + sum + ". Enter next number (Or to end write 'stop'):");
            input = sc.nextLine();
        }
    }

    public static boolean isSingleDigit(String s) {
        if (s.length() != 1) {
            return false;
        }
        int digit = (int) s.charAt(0);
        return (digit >= 48 && digit <= 57);
    }
}

