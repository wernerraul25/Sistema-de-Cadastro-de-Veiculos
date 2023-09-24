package Trabalho3LRF;

public class Pessoal extends Veiculos {
    private int numPassageiros;
    private int numPortas;

    public int getNumPassageiros() {
        return numPassageiros;
    }

    public void setNumPassageiros(int numPassageiros) {
        this.numPassageiros = numPassageiros;
    }

    public int getNumPortas() {
        return numPortas;
    }

    public void setNumPortas(int numPortas) {
        this.numPortas = numPortas;
    }

    @Override
    public String toString() {
        return super.toString()
                + "\n- Número de Passageiros: " + this.numPassageiros +
                " \n- Número de Portas: " + this.numPortas;
    }
}