package io.codelex.oop.persons;

public abstract class Person {
    private String firstName;
    private String lastName;
    private final String id;
    private int age;

    public Person(String firstName, String lastName, String id, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.id = id;
        this.age = age;
    }

    protected String getFirstName() {
        return firstName;
    }

    protected String getLastName() {
        return lastName;
    }

    protected String getId() {
        return id;
    }

    protected int getAge() {
        return age;
    }

    protected abstract String getInfo();
}