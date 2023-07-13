package poo.bytebank_inheritance;

import java.util.Objects;

public class Manager extends Officer{ //Gerente

    private String key;
    public void setKey(String key) {
        this.key = key;
    }
    public boolean login(String key) {
        return Objects.equals(key, "CursosAluraLatam"); // key == "CursosAluraLatam"
    }
}
