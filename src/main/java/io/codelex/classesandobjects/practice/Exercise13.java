package io.codelex.classesandobjects.practice;

public class Exercise13 {
    public static void main(String[] args) {

        Account someAccount = new Account("some account", 100.0);
        someAccount.deposit(20.0);
        System.out.println(someAccount);

        Account mattAccount = new Account("Matt's account", 1000.0);
        Account myAccount = new Account("My account", 0);
        mattAccount.withdrawal(100);
        myAccount.deposit(100);
        System.out.println(mattAccount);
        System.out.println(myAccount);

        Account accountA= new Account("A",100.0);
        Account accountB= new Account("B",0.0);
        Account accountC= new Account("C",0.0);
        Account.transfer(accountA,accountB,50);
        Account.transfer(accountB,accountC,25);
        System.out.println(accountA);
        System.out.println(accountB);
        System.out.println(accountC);
    }
}
