package io.codelex.oop.persons;

import java.time.LocalDate;
import java.time.Period;

public class Employee extends Person {

    private String position;
    private final LocalDate startedWorking;

    public Employee(String firstName, String lastName, String id, int age, String position, LocalDate startedWorking) {
        super(firstName, lastName, id, age);
        this.position = position;
        this.startedWorking = startedWorking;
    }

    public int getWorkingExperience() {
        LocalDate today = LocalDate.now();
        Period period = Period.between(today, startedWorking);

        return Math.abs(period.getYears());
    }

    @Override
    protected String getInfo() {
        return position + " " + getFirstName() + " " + getLastName() + " (" + getWorkingExperience() + " years)";
    }
}