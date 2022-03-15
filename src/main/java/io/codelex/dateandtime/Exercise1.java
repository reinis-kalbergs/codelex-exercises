package io.codelex.dateandtime;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("dd.MM.yyyy");

        System.out.println("Enter the first date (dd.mm.yyyy):");
        String input = sc.nextLine();
        LocalDate date1 = LocalDate.parse(input, dateFormat);

        System.out.println("Enter the second date (dd.mm.yyyy):");
        input = sc.nextLine();
        LocalDate date2 = LocalDate.parse(input, dateFormat);

        if (date1.isAfter(date2)) {
            LocalDate dateSwitch = date2;
            date2 = date1;
            date1 = dateSwitch;
        }
        int hoursWorked = 0;
        while (!date1.isAfter(date2)) {
            if (!(date1.getDayOfWeek() == DayOfWeek.SATURDAY || date1.getDayOfWeek() == DayOfWeek.SUNDAY)) {
                hoursWorked += 8;
            }
            date1 = date1.plusDays(1);
        }
        System.out.println("Employee worked " + hoursWorked + " hours");

    }
}

