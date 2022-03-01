package io.codelex.loops.practice;

import java.util.Scanner;

public class MultiplyByItself {

    public static void main(String[] args) {
        int i, n;

        Scanner in = new Scanner(System.in);
        System.out.print("Input number to multiply: ");
        i = in.nextInt();
        System.out.print("How many time to multiply?");
        n = in.nextInt();
        int total=i;

        //todo - complete loop to multiply i with itself n times, it is NOT allowed to use Math.pow()
        for (int j=1;j<n;j++) {
          total*=i;
        }
        System.out.println(total);
    }

}
