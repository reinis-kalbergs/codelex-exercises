package io.codelex.loops.exercises;

import java.util.Random;
import java.util.Scanner;

public class Piglet {

    static Scanner sc = new Scanner(System.in);


    public static void main(String[] args) {

        System.out.println("Welcome to Piglet!");
        Random r = new Random();
        int diceThrow = r.nextInt(6) + 1;
        int points = 0;
        System.out.println("You rolled a " + diceThrow + "!");
        while (diceThrow != 1) {
            points += diceThrow;
            System.out.print("Roll again? ");

            if (readBoolean()) {
                diceThrow = r.nextInt(6) + 1;
                System.out.println("You rolled a " + diceThrow + "!");
                if (diceThrow == 1) {
                    points = 0;
                }
            } else {
                break;
            }
        }
        System.out.println("You got " + points + " points.");

    }

    public static boolean readBoolean() {

        while (true) {
            String choice = sc.nextLine();
            if (choice.equals("y")) {

                return true;
            } else if (choice.equals("n")) {

                return false;
            } else {
                System.out.println("Invalid choice. Write 'y' or 'n'. Roll again?");
                choice = sc.nextLine();
            }
        }

    }
}

