package io.codelex.classesandobjects.practice;

// Each BankAccount object represents one user's account
// information including name and balance of money.

public class BankAccount {
    public String name;
    public double balance;

    public final void deposit(double amount) {
        this.balance += amount;
    }

    public final void withdraw(double amount) {
        this.balance -= amount;
    }

    @Override
    public String toString() {
        if (this.balance >= 0) {
            return name + ", $" + String.format("%.02f", balance);
        } else {
            return name + ", -$" + String.format("%.02f", balance * (-1));
        }

    }

    public BankAccount(String name, double balance) {
        this.name = name;
        this.balance = balance;
    }

    public BankAccount(String name) {
        this.name = name;
    }
}
