package Bicicleta.Pecas;

public class Corrente implements IPeca {

    public Corrente(double espessura) {
        this.espessura = espessura;
    }

    @Override
    public double getPreco() {
        if (espessura > 50)
            return 120;
        else if (espessura > 100)
            return 250;
        else
            return 70;
    }

    private double espessura;
}
