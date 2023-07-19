package poo.bytebank_inheritance.inheritance_multiple;

public class InternalSystem {
    private String password = "1234";
    public void authUser(Auth auth) {
        boolean youCanLogin = auth.login(this.password);
        if (youCanLogin) {
            System.out.println("Login success");
        } else System.out.println("Login error");
    }
}
