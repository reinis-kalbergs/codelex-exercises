package io.codelex.typesandvariables.exercises;

import java.util.Scanner;

public class exercise7 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the text, for which to determine number of upper case letters:");
        String input = sc.nextLine();
        int upperCaseLetters = 0;
        for (int i = 0; i < input.length(); i++) {
            int letter = (int) input.charAt(i);
            if (Character.isUpperCase(letter)) {
                upperCaseLetters++;
            }
        }
        System.out.println("Text has " + upperCaseLetters + " upper case letters");


    }
}
