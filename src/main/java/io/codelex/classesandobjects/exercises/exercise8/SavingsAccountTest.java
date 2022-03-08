package io.codelex.classesandobjects.exercises.exercise8;

import java.math.BigDecimal;
import java.util.Scanner;

public class SavingsAccountTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("How much money is in the account?:");
        BigDecimal startingAmount = sc.nextBigDecimal();
        SavingsAccount account = new SavingsAccount(startingAmount);

        System.out.println("Enter the annual interest rate");
        BigDecimal interestRate = sc.nextBigDecimal();
        account.setAnnualInterestRate(interestRate);

        System.out.println("How long has the account been opened?");
        int time = sc.nextInt();
        BigDecimal totalDeposit = new BigDecimal(0);
        BigDecimal totalWithdrawn = new BigDecimal(0);

        for (int i = 0; i < time; i++) {
            System.out.println("Enter amount deposited for month: " + (i + 1));
            BigDecimal depositSum = sc.nextBigDecimal();
            account.deposit(depositSum);
            totalDeposit = totalDeposit.add(depositSum);
            System.out.println("Enter amount withdrawn for " + (i + 1) + ": ");
            BigDecimal withdrawnAmount = sc.nextBigDecimal();
            account.withdrawal(withdrawnAmount);
            totalWithdrawn = totalWithdrawn.add(withdrawnAmount);
            account.monthlyInterest();
        }

        System.out.printf("Total deposited: $%.2f\n", totalDeposit);
        System.out.printf("Total withdrawn:  $%.2f\n", totalWithdrawn);
        System.out.printf("Interest earned: $%.2f\n", account.getBalance().subtract(startingAmount).
                subtract(totalDeposit).add(totalWithdrawn));
        System.out.printf("Ending balance: $%.2f\n", account.getBalance());

    }
}
