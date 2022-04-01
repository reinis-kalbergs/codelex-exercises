package io.codelex.advancedtest.exercise1;

import java.math.BigDecimal;

public class DebitCard extends Card {
    public DebitCard(long cardNumber, String fullName, String ccvCode, BigDecimal balance) {
        super(cardNumber, fullName, ccvCode, balance);
    }

    @Override
    public void addMoney(BigDecimal amount) {
        super.addMoney(amount);
        if (getBalance().compareTo(new BigDecimal("10000")) > 0) {
            System.out.println("Warning: Too much money");
        }
    }
}
