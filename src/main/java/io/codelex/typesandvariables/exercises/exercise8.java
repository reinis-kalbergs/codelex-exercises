package io.codelex.typesandvariables.exercises;

import java.util.Scanner;

public class exercise8 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("How many minutes?");
        String input = sc.nextLine();
        if (isNumeric(input)) {
            double minutes = Double.parseDouble(input);
            int years = (int) (minutes / (365 * 60 * 24));
            int days = (int) ((minutes / 60 / 24) % 365);
            System.out.println(minutes + " minutes is " + years + " years and " + days + " days.");
        } else {
            System.out.println("This is not a number!");
        }


    }

    public static boolean isNumeric(String str) {
        try {
            Double.parseDouble(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }


}
