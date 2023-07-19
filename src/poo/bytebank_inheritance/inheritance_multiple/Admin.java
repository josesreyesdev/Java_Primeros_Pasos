package poo.bytebank_inheritance.inheritance_multiple;


import poo.bytebank_inheritance.Officer;

public class Admin extends Officer implements Auth {

    private String password;

    @Override
    public double getBonus() {
        return super.getSalary() + this.getSalary() * 0.10;
    }

    @Override
    public void setKey(String key) {
        this.password = key;
    }

    @Override
    public boolean login(String key) {
        return this.password == key;
    }
}
