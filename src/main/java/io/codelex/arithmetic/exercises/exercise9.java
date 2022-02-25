package io.codelex.arithmetic.exercises;

import java.util.Scanner;

public class exercise9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter weight in kg:");
        double weight = sc.nextDouble();
        System.out.println("Enter height in cm:");
        double height = sc.nextDouble();

        double weightInPounds = weight * 2.205;
        double heightInInches = height / 2.54;

        double BMI = weightInPounds * 703 / heightInInches / heightInInches;

        if (BMI < 18.5) {
            System.out.println("Person's BMI is "+BMI+". The Person is considered underweight.");
        } else if (BMI > 25) {
            System.out.println("Person's BMI is "+BMI+". The Person is considered overweight.");
        } else {
            System.out.println("Person's BMI is "+BMI+". The Person has optimal weight.");
        }

    }


}
