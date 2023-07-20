package poo.bytebank_inheritance.inheritance_multiple.account;

import poo.bytebank_inheritance.CheckingAccount;

public class MainTributation {
    public static void main(String[] args) {
        CheckingAccount cc = new CheckingAccount(222, 333);
        cc.deposit(100.0);

        LifeInsurance lifeInsurance = new LifeInsurance();

        CalculatorTax calculatorTax = new CalculatorTax();

        calculatorTax.register(cc);
        calculatorTax.register(lifeInsurance);

        System.out.println("Total tax: "+ calculatorTax.getTotalTax());
    }
}