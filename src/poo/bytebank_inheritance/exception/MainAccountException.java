package poo.bytebank_inheritance.exception;

import poo.bytebank_inheritance.Account;
import poo.bytebank_inheritance.SavingsAccount;

public class MainAccountException {
    public static void main(String[] args) {
        Account account = new SavingsAccount(123, 456);
        account.deposit(200.0);
        try {
            account.withdrawAccountBalance(250.0);
        } catch (InsufficientBalanceException e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }
}
