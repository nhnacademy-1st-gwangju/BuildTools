package com.nhnacademy.bank;

import java.math.BigDecimal;
import java.util.Currency;
import java.util.Locale;

public class RestApi {

    public boolean postAmount(Action action, Long accountNumber, BigDecimal amount) {
        System.out.println("server received request. #" + accountNumber
                + ", amount = " + amount
                + ", action=" + action);

        Account account = new Account();

        if (Action.DEPOSIT == action) {
            return account.deposit(new Money(amount, Currency.getInstance(Locale.US)));
        } else if (Action.WITHDRAW == action) {
            return account.withdraw(new Money(amount, Currency.getInstance(Locale.US)));
        }

        return false;
    }
}
