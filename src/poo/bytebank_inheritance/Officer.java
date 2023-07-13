package poo.bytebank_inheritance;

public class Officer { //Funcionario
    private String name;
    private String document;
    private double salary;
    private int type;

    public Officer() { }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDocument() {
        return document;
    }

    public void setDocument(String document) {
        this.document = document;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public double getBonus() {
        // Si type is 0 es funcionario, si type es 1 es gerente
        if (this.type == 0) {
            return this.salary * 0.1;
        } else if (this.type == 1) {
            return this.salary;
        }
        return 0;
    }
}
