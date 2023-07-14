package poo.bytebank_inheritance;

import java.util.Objects;

public class Manager extends Officer { //Gerente

    private String key;
    private int password;

    public int getPassword() {
        return password;
    }

    public void setPassword(int password) {
        this.password = password;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public boolean login(String key) {
        return Objects.equals(key, "CoursesAluraLatam"); // key == "CursosAluraLatam"
    }

    //Sobre-escritura del metodo
    public double getBonus() {
        return super.getSalary() + super.getBonus();
    }

    //Sobre-carga
    public boolean authenticate( int password) {
        return this.password == password;
    }

    public boolean authenticate( String login, int password) {
        return this.password == password;
    }
}
