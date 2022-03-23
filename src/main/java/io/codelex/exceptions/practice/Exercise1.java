package io.codelex.exceptions.practice;

import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);

        while (true) {
            try {
                System.out.println("Enter the numerator");
                String numeratorString = scanner.next();
                if (numeratorString.substring(0, 1).equalsIgnoreCase("q")) {
                    break;
                }
                int numerator = Integer.parseInt(numeratorString);
                System.out.println("Enter the divisor");
                int divisor = scanner.nextInt();
                System.out.println(numerator + " / " + divisor + " = " + numerator / divisor + "\n");
            } catch (RuntimeException e) {
                if (scanner.hasNextLine()) {
                    scanner.nextLine();
                }
                System.out.println("You entered bad data.\n Please try again.\n");
            }
        }
    }
}
