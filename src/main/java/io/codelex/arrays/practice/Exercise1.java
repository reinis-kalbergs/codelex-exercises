package io.codelex.arrays.practice;

import java.util.Arrays;

public class Exercise1 {

    //Write a Java program to sort a numeric array and a string array.
    public static void main(String[] args) {

        int[] myArray1 = {
                1789, 2035, 1899, 1456, 2013,
                1458, 2458, 1254, 1472, 2365,
                1456, 2165, 1457, 2456
        };

        String[] myArray2 = {
                "Java",
                "Python",
                "PHP",
                "C#",
                "C Programming",
                "C++"
        };

        System.out.println("Original numeric array : " + printOut1DArray(myArray1));
        Arrays.sort(myArray1); //Sort array
        System.out.println("Sorted numeric array : " + printOut1DArray(myArray1));

        System.out.println("Original string array : " + printOut1DArray(myArray2));
        Arrays.sort(myArray2); //Sort array
        System.out.println("Sorted string array : " + printOut1DArray(myArray2));

    }

    public static String printOut1DArray(String[] arr) {
        StringBuilder res = new StringBuilder();
        for (String a : arr) {
            res.append(a).append(" , ");
        }
        return res.substring(0, res.length() - 3);
    }

    public static String printOut1DArray(int[] arr) {
        StringBuilder res = new StringBuilder();
        for (int a : arr) {
            res.append(a).append(" , ");
        }
        return res.substring(0, res.length() - 3);
    }

}
