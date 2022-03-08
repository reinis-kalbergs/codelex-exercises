package io.codelex.classesandobjects.exercises.exercise8;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class SavingsAccount {
    private BigDecimal balance;
    private BigDecimal interestRate;

    public SavingsAccount(BigDecimal balance) {
        this.balance = balance;
    }

    public void deposit(BigDecimal depositAmount) {
        this.balance = this.balance.add(depositAmount);
    }

    public void withdrawal(BigDecimal withdrawalAmount) {
        if (this.balance.compareTo(withdrawalAmount) > 0) {
            this.balance = this.balance.subtract(withdrawalAmount);
        } else {
            System.out.println("Not enough money in the savings account.");
        }
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public BigDecimal getInterestRate() {
        return interestRate;
    }

    public void setAnnualInterestRate(BigDecimal annualInterestRate) {
        this.interestRate = annualInterestRate.divide(BigDecimal.valueOf(1200), 4, RoundingMode.HALF_UP);
    }

    public void monthlyInterest() {
        this.balance = balance.add(balance.multiply(this.interestRate).setScale(2, RoundingMode.HALF_DOWN));
    }
}












