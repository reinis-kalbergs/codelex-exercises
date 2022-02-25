package io.codelex.arithmetic.exercises;

import java.util.Scanner;

public class exercise1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Input first number:");
        int num1 = sc.nextInt();
        System.out.println("Input second number:");
        int num2 = sc.nextInt();
        if (task1(num1,num2)){
            System.out.println("true");
        }

    }
    public static boolean task1(int a,int b){
        if (a==15 || b==15 || a+b==15 || a-b==15 || b-a==15) {
            return true;
        }
        return false;
    }

}
