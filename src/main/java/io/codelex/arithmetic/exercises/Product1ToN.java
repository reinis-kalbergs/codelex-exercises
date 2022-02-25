package io.codelex.arithmetic.exercises;

import java.util.Scanner;

public class Product1ToN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input the number:");
        int N = sc.nextInt();
        int factorial = 1;
        for (int i = 1; i <= N; i++) {
            factorial *= i;
        }
        System.out.println("The factorial of " + N + " is " + factorial);
    }
}
