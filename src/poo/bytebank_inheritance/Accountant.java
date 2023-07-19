package poo.bytebank_inheritance;

public class Accountant extends Officer{
    public double getBonus() {
        return super.getSalary() * 0.10;
    }
}
