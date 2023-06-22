package poo.proyecto_bytebank;

public class TestReference {
    public static void main(String[] args) {
        Account firstAccount = new Account();
        firstAccount.balance = 200;
        System.out.println("First Account "+ firstAccount.balance);

        Account secondAccount = firstAccount;
        secondAccount.balance = 100;
        System.out.println("Second Account "+ secondAccount.balance);
        System.out.println("First Account " + firstAccount.balance);

        System.out.println(firstAccount);
        System.out.println(secondAccount);
    }
}
