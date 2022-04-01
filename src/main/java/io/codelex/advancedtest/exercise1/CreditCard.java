package io.codelex.advancedtest.exercise1;

import java.math.BigDecimal;

public class CreditCard extends Card {

    public CreditCard(long cardNumber, String fullName, String ccvCode, BigDecimal balance) {
        super(cardNumber, fullName, ccvCode, balance);
    }

    @Override
    public void takeMoney(BigDecimal amount) throws NotEnoughFundsException {
        super.takeMoney(amount);
        if (getBalance().compareTo(new BigDecimal("100")) < 0) {
            System.out.println("Warning: Low funds");
        }
    }
}
