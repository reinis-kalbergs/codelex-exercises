package io.codelex.oop.persons;

import java.time.LocalDate;

public class PersonTest {
    public static void main(String[] args) {
        Customer customer = new Customer("John", "Sanders", "12310-230812",
                27, "123456", 4);
        System.out.println(customer.getInfo());
        customer.setPurchaseCount(123);
        System.out.println("Customer made " + customer.getPurchaseCount() + " purchases");
        customer.setCustomerId("100000000000");
        System.out.println("Customer's " + customer.getFirstName() + " " + customer.getLastName() + " new customer id: " + customer.getCustomerId() + '\n');


        Employee employee = new Employee("Peter", "Smith", "10239-290422",
                45, "Smith", LocalDate.now().minusDays(367));
        System.out.println(employee.getInfo());
        System.out.println(employee.getWorkingExperience());
        System.out.println("Employee's age " + employee.getAge());
        System.out.println("Employee's id:" + employee.getId());
    }
}