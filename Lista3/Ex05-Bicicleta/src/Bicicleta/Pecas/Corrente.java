package Bicicleta.Pecas;

public class Corrente implements IPeca {

    public Corrente(double espessura) {
        this.espessura = espessura;
    }

    @Override
    public double getPreco() {
        double valor;
        if (espessura > 50)
            valor = 120;
        else if (espessura > 100)
            valor = 250;
        else
            valor = 70;
        return ehImportado ? valor * 1.3 : valor;
    }

    @Override
    public boolean getEhImportado() {
        return ehImportado;
    }

    private double espessura;
    private boolean ehImportado;
}
