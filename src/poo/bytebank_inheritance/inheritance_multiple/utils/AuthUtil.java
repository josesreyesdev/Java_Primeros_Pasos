package poo.bytebank_inheritance.inheritance_multiple.utils;

public class AuthUtil {
    private String password;

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean login(String password) {
        return this.password.equals(password); //this.password == password
    }
}
