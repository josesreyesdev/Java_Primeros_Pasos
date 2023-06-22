package poo;

import poo.proyecto_bytebank.Account;

public class CreateAccount {
    public static void main(String[] args) {

        Account account = new Account();
        account.balance = 1000;
        System.out.println(account.balance);

        Account account2 = new Account();
        account2.balance = 1500;
        System.out.println(account2.balance);
    }
}