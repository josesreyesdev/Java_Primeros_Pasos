package poo.bytebank_inheritance;

public class BonusControl {
    private double sum;
    public void recordSalary( Officer officer) { //registrar salario
        this.sum += officer.getBonus();
    }

    public double getSum() {
        return this.sum;
    }
}
