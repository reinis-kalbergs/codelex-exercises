package io.codelex.classesandobjects.practice;

public class BankAccountTest {

    public static void main(String[] args) {

        BankAccount ben = new BankAccount("Benson");
        System.out.println(ben);
        ben.deposit(10.6);
        System.out.println(ben);
        ben.withdraw(2034.28);
        System.out.println(ben);
    }
}
