package io.codelex.dateandtime;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
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

        LocalDate[] updateDays = serverUpdateDates(date, year, month);

        System.out.println(updateDays[0]);
        System.out.println(updateDays[1]);
    }

    private static LocalDate[] serverUpdateDates(LocalDate date, int year, int month) {
        int endMonth = month + 1;
        if (endMonth == 13) endMonth = 1;
        int endYear = year;
        if (endMonth == 1) endYear++;
        int count = 0;
        LocalDate[] updateDays = new LocalDate[2];
        while (!(date.getMonthValue() == endMonth && date.getYear() == endYear)) {
            date = date.plusDays(14);
            if (date.getYear() == year && date.getMonthValue() == month) {
                updateDays[count] = date;
                count++;
            }
        }
        return updateDays;
    }

}
