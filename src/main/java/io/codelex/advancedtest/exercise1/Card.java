package io.codelex.advancedtest.exercise1;

import java.math.BigDecimal;

public abstract class Card {

    private long cardNumber;
    private String fullName;
    private String ccvCode;
    private BigDecimal balance;

    public Card(long cardNumber, String fullName, String ccvCode, BigDecimal balance) {
        this.cardNumber = cardNumber;
        this.fullName = fullName;
        this.ccvCode = ccvCode;
        this.balance = balance;
    }

    public long getCardNumber() {
        return cardNumber;
    }

    public String getFullName() {
        return fullName;
    }

    public String getCcvCode() {
        return ccvCode;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public void addMoney(BigDecimal amount) {
        this.balance = balance.add(amount);
    }

    public void takeMoney(BigDecimal amount) throws NotEnoughFundsException {
        if (amount.compareTo(balance) > 0) {
            throw new NotEnoughFundsException("Not enough money");
        }
        this.balance = balance.subtract(amount);
    }

}
