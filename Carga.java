package Trabalho3LRF;

public class Carga extends Veiculos {
    private double maxKg;

    public double getMaxKg() {
        return maxKg;
    }

    public void setMaxKg(double maxKg) {
        this.maxKg = maxKg;
    }

    @Override
    public String toString() {
        return super.toString()
                + "\n- Carga Máxima em Kilos: " + this.maxKg;
    }

}