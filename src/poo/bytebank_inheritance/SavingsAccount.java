package poo.bytebank_inheritance;

//Cuenta de Ahorro
public class SavingsAccount extends Account{

    public SavingsAccount(int agency, int number) {
        super(agency, number);
    }

    @Override
    public void deposit(Double balance) {
        this.balance += balance;
    }
}
