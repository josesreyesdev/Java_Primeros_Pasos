package poo.bytebank_inheritance;

//Cuenta corriente
public class CheckingAccount extends Account {

    public CheckingAccount(int agency, int number) {
        super(agency, number);
    }

    //Sobre-escritura
    @Override
    public boolean withdrawAccountBalance(Double balance) {
        double commission = balance + 0.2;
        return super.withdrawAccountBalance(commission);
    }
}
