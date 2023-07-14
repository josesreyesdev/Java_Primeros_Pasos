package poo.bytebank_inheritance;

public class MainPolymorphism {
    public static void main(String[] args) {
        Officer officer = new Officer();
        officer.setName("Diego");

        Manager manager = new Manager();
        manager.setName("Jimena");

        officer.setSalary(2000.0);
        manager.setSalary(10000.0);
    }
}
