package poo.proyecto_bytebank;

public class TestMethods {

    public static void main(String[] args) {
        Account account = new Account();
        account.balance = 300;
        account.deposit(200.0);
        if (account.withdrawAccountBalance(50.0)) {
            System.out.println("Withdraw account balance success");
        }
        System.out.println("Balance: " + account.balance);

        account.deposit(100.0);
        System.out.println("Balance: " + account.balance);

        Account accountJimena = new Account();
        accountJimena.deposit(1000.0);
        System.out.println("Balance Jimena: "+ accountJimena.balance);
        accountJimena.transfer(400.0, account);
        System.out.println("Balance Jimena: "+ accountJimena.balance);

        System.out.println("My Balance: " + account.balance);

    }
}
