package poo.bytebank_inheritance;

import poo.project_bytebank.Client;

public abstract class Account {
    protected double balance;
    private int agency = 1;
    private int number;
    private Client holder; //titular

    private static int totalAccounts = 0;

    public Account(int agency, int number) {
        if (agency <= 0) {
            System.out.println("No se permite 0");
            this.agency = 1;
            this.number = 0;
        } else  {
            this.agency = agency;
            this.number = number;
        }
        totalAccounts++;
        System.out.println("Total Accounts: "+ totalAccounts);
    }

    public abstract void deposit(Double balance);

    public boolean withdrawAccountBalance(Double balance) { //retirar
        if (isValidBalance(balance)) {
            this.balance -= balance;
            return true;
        }
        return false;
    }

    public boolean transfer(Double balance, Account account) {
        if (isValidBalance(balance)) {
            account.deposit(balance);
            withdrawAccountBalance(balance);
            //this.balance -= balance;
            return true;
        } else {
            System.out.println("Sorry, you don´t have enough money in your account for to transfer!");
            return false;
        }
    }

    private boolean isValidBalance(Double balance) {
        return this.balance >= balance && balance > 0;
    }

    public double getBalance() {
        return this.balance;
    }

    public int getAgency() {
        return agency;
    }

    public void setHolder(Client holder) {
        this.holder = holder;
    }

    public Client getHolder() {
        return holder;
    }

    public static int getTotalAccounts() {
        return totalAccounts;
    }
}