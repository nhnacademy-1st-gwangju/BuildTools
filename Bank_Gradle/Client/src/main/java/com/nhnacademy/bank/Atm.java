package com.nhnacademy.bank;

import java.math.BigDecimal;

public class Atm {
    public boolean deposit(BigDecimal amount, Long accountNumber) {
        System.out.println("Client try to deposit. #" + accountNumber);
        return new RestApi().postAmount(Action.DEPOSIT, accountNumber, amount);
    }

    public boolean withdraw(BigDecimal amount, Long accountNumber) {
        System.out.println("Client try to withdraw. #" + accountNumber);
        return new RestApi().postAmount(Action.WITHDRAW, accountNumber, amount);
    }
}
