package io.codelex.loops.exercises;

import java.util.Scanner;

public class exercise5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter first word:");
        String firstWord = in.nextLine();
        System.out.print("Enter second word:");
        String secondWord = in.nextLine();

        if (firstWord.length() + secondWord.length() >= 30) {
            System.out.println("Both words together have too many letters");
        } else {
            System.out.print(firstWord);
            int len = 30 - firstWord.length() - secondWord.length();
            for (int i = 0; i < len; i++) {

                System.out.print(".");
            }
            System.out.print(secondWord);
        }
    }
}
