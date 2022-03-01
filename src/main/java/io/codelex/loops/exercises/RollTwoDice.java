package io.codelex.loops.exercises;

import java.util.Random;
import java.util.Scanner;

public class RollTwoDice {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Desired sum: ");
        int desiredSum = sc.nextInt();
        if (desiredSum>12) {
            System.out.println("Cannot get that sum");
        }else{
            System.out.println();
            Random r = new Random();
            int sum;
            int diceThrow1;
            int diceThrow2;

            do {
                diceThrow1 = r.nextInt(6) + 1;
                diceThrow2 = r.nextInt(6) + 1;
                sum = diceThrow1 + diceThrow2;
                System.out.println(diceThrow1 + " and " + diceThrow2 + " = " + sum);
            } while (sum != desiredSum);
        }





    }


}
