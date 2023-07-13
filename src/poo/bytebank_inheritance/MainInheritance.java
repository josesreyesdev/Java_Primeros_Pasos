package poo.bytebank_inheritance;

public class MainInheritance {
    public static void main(String[] args) {
        Officer diegoOfficer = new Officer();
        diegoOfficer.setName("Diego");
        diegoOfficer.setDocument("34235235");
        diegoOfficer.setSalary(5000.00);
        diegoOfficer.setType(0);
        System.out.println("My name is: "+ diegoOfficer.getName());
        System.out.println("My number of document is: "+ diegoOfficer.getDocument());
        System.out.println("My salary per net is: "+ diegoOfficer.getSalary());
        System.out.println("Bonus: "+ diegoOfficer.getBonus());

        System.out.println();
        Manager managerOfficer = new Manager();
        managerOfficer.setName("Josep");
        managerOfficer.setDocument("12321");
        managerOfficer.setSalary(10000.00);
        managerOfficer.setType(1);
        managerOfficer.setKey("CursosAluraLatam");
        System.out.println("My name is: "+ managerOfficer.getName());
        System.out.println("My number of document is: "+ managerOfficer.getDocument());
        System.out.println("My salary per net is: "+ managerOfficer.getSalary());
        System.out.println("Bonus of 10 percent: "+ managerOfficer.getBonus());
        System.out.println("¿I can login? " + managerOfficer.login("CursosAluraLatam"));
        System.out.println("¿I can login? " + managerOfficer.login("CursosAlura"));
    }
}