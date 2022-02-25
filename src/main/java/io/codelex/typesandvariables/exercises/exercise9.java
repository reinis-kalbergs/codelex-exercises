package io.codelex.typesandvariables.exercises;

import java.util.Scanner;

public class exercise9 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Input distance in meters:");
        double meters = sc.nextDouble();
        System.out.println("Input hour:");
        double hours = sc.nextDouble();
        System.out.println("Input minutes:");
        double minutes = sc.nextDouble();
        System.out.println("Input seconds:");
        double seconds = sc.nextDouble();

        double metersPerSecond = meters/(hours*3600+minutes*60+seconds);
        System.out.println("Your speed in meters/second is "+metersPerSecond);

        double kmPerHour = meters/1000/(hours+minutes/60+seconds/3600);
        System.out.println("Your speed in km/h  is "+kmPerHour);

        double milesPerHour = meters/1609/(hours+minutes/60+seconds/3600);
        System.out.println("Your speed in miles/h  is "+milesPerHour);

    }
}
