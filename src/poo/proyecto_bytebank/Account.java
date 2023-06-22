package poo.proyecto_bytebank;

public class Account {
    public double balance;
    public int agency;
    public int number;
    public String holder;

    public void deposit(Double balance) {
        this.balance += balance;
    }

    public boolean withdrawAccountBalance( Double balance) { //retirar
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
        } else  {
            System.out.println("Sorry, you don´t have enough money in your account for to transfer!");
            return false;
        }
    }

    private boolean isValidBalance(Double balance) {
        return this.balance >= balance ;
    }
}
