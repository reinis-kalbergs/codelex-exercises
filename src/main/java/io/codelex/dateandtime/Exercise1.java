package io.codelex.dateandtime;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {

        final int HOURS_WORKED_IN_DAY = 8;
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
            if (isWorkday(date1)) {
                hoursWorked += HOURS_WORKED_IN_DAY;
            }
            date1 = date1.plusDays(1);
        }
        System.out.println("Employee worked " + hoursWorked + " hours");

    }

    private static boolean isWorkday(LocalDate date) {
        return !(date.getDayOfWeek() == DayOfWeek.SATURDAY || date.getDayOfWeek() == DayOfWeek.SUNDAY);
    }
}

