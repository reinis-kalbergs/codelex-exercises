package io.codelex.polymorphism.practice.exercise3;

public class PersonTest {
    public static void main(String[] args) {
        Student student1 = new Student("John", "Smith", "Some street", 1023, 4.5);
        Employee employee1 = new Employee("John", "Black", "Another street", 1092, "Accountant");

        student1.display();
        employee1.display();
    }
}
