package poo.bytebank_inheritance;

import poo.bytebank_inheritance.inheritance_multiple.account.Tributation;

//Cuenta corriente
public class CheckingAccount extends Account implements Tributation {

    public CheckingAccount(int agency, int number) {
        super(agency, number);
    }

    @Override
    public void deposit(Double balance) {
        this.balance += balance;
    }

    //Sobre-escritura
    @Override
    public boolean withdrawAccountBalance(Double balance) {
        double commission = balance + 0.2;
        return super.withdrawAccountBalance(commission);
    }

    @Override
    public double getTaxValue() {
        return super.balance * 0.01;
    }
}
