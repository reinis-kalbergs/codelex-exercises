package io.codelex.arithmetic.exercises;

import java.util.Scanner;

public class CheckOddEven {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input the number:");
        int num = sc.nextInt();
        if (num % 2==0){
            System.out.println("Number is even");
        } else {
            System.out.println("Number is odd");
        }
        System.out.println("bye");
    }


}
