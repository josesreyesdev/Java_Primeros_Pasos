package poo.bytebank_inheritance;

import poo.bytebank_inheritance.inheritance_multiple.Auth;

import java.util.Objects;

public class Client implements Auth {

    private String holderName; //titular
    private String document;
    private String phoneNumber;

    public String getHolderName() {
        return holderName;
    }

    public void setHolderName(String holderName) {
        this.holderName = holderName;
    }


    @Override
    public void setKey(String key) {

    }

    @Override
    public boolean login(String key) {
        return Objects.equals(key, "CursosAluraLatam"); //key == "CursosAluraLatam"
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
