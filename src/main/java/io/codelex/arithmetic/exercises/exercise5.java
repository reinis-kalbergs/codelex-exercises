package io.codelex.arithmetic.exercises;

import java.util.Random;
import java.util.Scanner;

public class exercise5 {
    public static void main(String[] args) {
        Random r = new Random();
        int randomInt = r.nextInt(100) + 1;
        //int randomInt = (int ) (Math.random() * 100 +1); - not as good

        Scanner sc = new Scanner(System.in);
        System.out.println("I'm thinking of a number between 1-100.  Try to guess it.:");
        int guess = sc.nextInt();
        if (guess > randomInt) {
            System.out.println("Sorry, you are too high.  I was thinking of " + randomInt);
        } else if (guess < randomInt) {
            System.out.println("Sorry, you are too low.  I was thinking of " + randomInt);
        } else {
            System.out.println("You guessed it!");
        }

    }
}
