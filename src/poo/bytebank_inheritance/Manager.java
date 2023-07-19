package poo.bytebank_inheritance;

import poo.bytebank_inheritance.inheritance_multiple.Auth;

import java.util.Objects;

public class Manager extends Officer implements Auth { //Gerente
    private String password;

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public void setKey(String key) {
        this.password = key;
    }

    @Override
    public boolean login(String key) {
        return Objects.equals(this.password, key); //this.key == key
    }

    //Sobre-escritura del metodo
    public double getBonus() {
        return super.getSalary() + this.getSalary() * 0.05;
    }

    //Sobre-carga
    public boolean auth( String password) {
        return this.password == password;
    }

    public boolean auth( String login, String password) {
        return this.password == password;
    }
}
