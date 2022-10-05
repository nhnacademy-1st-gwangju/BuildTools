package com.nhnacademy.bank;

/**
 * Account class, submodule.
 */
public class Account {
    public boolean deposit(Money money) {
        System.out.println("Deposit : " + money.toString());
        return true;
    }

    public boolean withdraw(Money money) {
        System.out.println("Withdraw : " + money.toString());
        return true;
    }
}
