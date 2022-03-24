package io.codelex.collections.practice;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class NumberIsHappy {
    // exercise nr.5
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if (sc.hasNextLine()) {
            sc.nextLine();
        }
        if (isHappy(num)) {
            System.out.println("The number is happy.");
        } else {
            System.out.println("The number is not happy.");
        }
    }

    private static boolean isHappy(int number) {
        Set<Integer> allNumbers = new HashSet<>();
        while (!allNumbers.contains(number)) {
            if (number == 1) {
                return true;
            }
            allNumbers.add(number);
            number = sumOfDigitsSquared(number);
        }
        return false;
    }

    private static int sumOfDigitsSquared(int num) {
        String numToString = String.valueOf(num);
        int result = 0;
        StringBuilder showWork = new StringBuilder();

        for (int i = 0; i < numToString.length(); i++) {
            int digit = Integer.parseInt(numToString.substring(i, i + 1));
            result += digit * digit;
            showWork.append(digit).append("^2 ");
            if (i != numToString.length() - 1) {
                showWork.append("+ ");
            }
        }
        showWork.append("= ").append(result);
        System.out.println(showWork);
        return result;
    }
}