package poo.bytebank_inheritance.mains;

import poo.bytebank_inheritance.model.Accountant;
import poo.bytebank_inheritance.model.Manager;
import poo.bytebank_inheritance.model.Officer;

public class MainPolymorphism {
    public static void main(String[] args) {
        Officer officer = new Accountant();
        officer.setName("Diego");

        Manager manager = new Manager();
        manager.setName("Jimena");

        officer.setSalary(2000.0);
        manager.setSalary(10000.0);
    }
}
