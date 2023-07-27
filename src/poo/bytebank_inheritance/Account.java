package poo.bytebank_inheritance;

import poo.bytebank_inheritance.exception.InsufficientBalanceException;
import poo.project_bytebank.Client;

public abstract class Account {
    protected double balance;
    private int agency = 1;
    private int number;
    private Client holder; //titular

    private static int totalAccounts = 0;

    public Account(int agency, int number) {
        if (agency < 1 || number < 1) {
            this.agency = 1;
            this.number = 0;
            System.out.println("No se permite valores menores a 1");
            throw new IllegalArgumentException("Invalid agency or invalid number");
        } else  {
            this.agency = agency;
            this.number = number;
        }
        totalAccounts++;
        System.out.println("Total Accounts: "+ totalAccounts);
    }

    public abstract void deposit(Double balance);

    public void withdrawAccountBalance(Double balance) throws InsufficientBalanceException{ //retirar

        if (this.balance < balance) {
            throw new InsufficientBalanceException("Saldo Insuficiente, tienes: $" + this.getBalance());
        }
        this.balance -= balance;
    }

    public boolean transfer(Double balance, Account account) {
        if (isValidBalance(balance)) {
            account.deposit(balance);
            try {
                withdrawAccountBalance(balance);
            } catch (InsufficientBalanceException e) {
                throw new RuntimeException(e);
            }
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