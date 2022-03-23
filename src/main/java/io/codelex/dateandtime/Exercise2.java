package io.codelex.dateandtime;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter when the server launched (dd.mm.yyyy):");
        String input = sc.nextLine();
        DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        LocalDate date = LocalDate.parse(input, dateFormat);

        System.out.println("Enter for which year");
        int year = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter the number of the month");
        int month = sc.nextInt();
        sc.nextLine();

        List<LocalDate> updateDays = serverUpdateDates(date, year, month);
        System.out.println("Server update days:");
        for (LocalDate localDate : updateDays) {
            System.out.println(localDate);
        }
    }

    private static List<LocalDate> serverUpdateDates(LocalDate date, int year, int month) {
        final int DAYS_BETWEEN_SERVER_UPDATE = 5;
        int endMonth = month + 1;
        if (endMonth == 13) {
            endMonth = 1;
        }
        int endYear = year;
        if (endMonth == 1) {
            endYear++;
        }
        List<LocalDate> updateDays = new ArrayList<>();
        while (!(date.getMonthValue() == endMonth && date.getYear() == endYear)) {
            date = date.plusDays(DAYS_BETWEEN_SERVER_UPDATE);
            if (date.getYear() == year && date.getMonthValue() == month) {
                updateDays.add(date);
            }
        }
        return updateDays;
    }

}
