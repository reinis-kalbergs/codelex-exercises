package io.codelex.classesandobjects.exercises.exercise5;

public class DateTest {

    public static void main(String[] args) {

        Date date1 = new Date(12, 24, 2000);
        System.out.println(date1.displayDate());
        date1.setDay(2);
        date1.setYear(2018);
        System.out.println(date1.displayDate());

    }

}
