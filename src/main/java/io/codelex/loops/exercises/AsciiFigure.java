package io.codelex.loops.exercises;

import java.util.Scanner;

public class AsciiFigure {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ievadi n:");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = n - 1; j > 0; j--) {
                if (j > i) {
                    System.out.print("////");
                } else {
                    System.out.print("****");
                }
            }
            for (int k = 0; k < n - 1; k++) {
                if (k >= i) {
                    System.out.print("\\\\\\\\");
                } else {
                    System.out.print("****");
                }
            }
            System.out.println();
        }

    }
}
