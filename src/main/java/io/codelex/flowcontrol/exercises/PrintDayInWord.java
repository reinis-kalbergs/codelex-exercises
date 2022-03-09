package io.codelex.flowcontrol.exercises;

import java.util.Scanner;

public class PrintDayInWord {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of the day: ");
        int dayNumber = sc.nextInt();

        switch (dayNumber) {
            case 0 -> System.out.println("Sunday");
            case 1 -> System.out.println("Monday");
            case 2 -> System.out.println("Tuesday");
            case 3 -> System.out.println("Wednesday");
            case 4 -> System.out.println("Thursday");
            case 5 -> System.out.println("Friday");
            case 6 -> System.out.println("Saturday");
            default -> System.out.println("Not a valid day");
        }
    }
}
