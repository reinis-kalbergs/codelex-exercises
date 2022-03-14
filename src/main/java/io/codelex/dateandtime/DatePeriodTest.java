package io.codelex.dateandtime;

import java.time.LocalDate;

public class DatePeriodTest {
    public static void main(String[] args) {

        LocalDate firstStart = LocalDate.of(2022, 1, 1);
        LocalDate firstEnd = LocalDate.of(2022, 1, 15);
        DatePeriod firstPeriod = new DatePeriod(firstStart, firstEnd);

        LocalDate secondStart = LocalDate.of(2022, 1, 20);
        LocalDate secondEnd = LocalDate.of(2022, 1, 15);
        DatePeriod secondPeriod = new DatePeriod(secondStart, secondEnd);

        DatePeriod overlap = firstPeriod.intersection(secondPeriod);
        if (overlap != null) {
            System.out.println(overlap);
        } else {
            System.out.println("The dare periods do not overlap");
        }
//overlap variable should have start date 10.01.2022 and end date 15.01.2022

    }

}
