package io.codelex.arrays.practice;

import java.util.Random;

public class Exercise6 {
    public static void main(String[] args) {
        Random r = new Random();
        int[] myArray1 = new int[10];

        for (int i = 0; i < 10; i++) {
            myArray1[i] = r.nextInt(100)+1;
        }
        int[] myArray2 = myArray1.clone();// vai  System.arraycopy()
        myArray1[9] = -7;
        System.out.println("Array 1: " + printOut1DArray(myArray1));
        System.out.println("Array 2: " + printOut1DArray(myArray2));
    }

    public static String printOut1DArray(int[] arr) {
        StringBuilder res = new StringBuilder();
        for (int a : arr) {
            res.append(a).append(" ");
        }
        return res.substring(0, res.length() - 1);
    }


}
