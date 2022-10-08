package com.nhnacademy.bank;

import com.nhnacademy.bank.client.Atm;

import java.math.BigDecimal;

/**
 * Application class, entrypoint.
 */
public class Application {

    private static final Long ACCOUNT_NUMBER = 123L;

    /**
     * entry point main method.
     *
     * @param args system variable.
     */
    public static void main(String[] args) {
        System.out.println("########################################");
        System.out.println("NHN Academy 광주 1기 송학현");
        System.out.println("########################################");
        System.out.println();

        System.out.println("Application.main() callstack start");
        Atm atm = new Atm();
        boolean rt = atm.deposit(BigDecimal.valueOf(100.1), ACCOUNT_NUMBER);
        System.out.println(rt);
        System.out.println("Application.main() callstack end. " + rt);
    }
}
