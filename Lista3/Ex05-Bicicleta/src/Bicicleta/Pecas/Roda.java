package Bicicleta.Pecas;

public class Roda implements IPeca {

    public Roda(int aro, boolean ehImportado) {
        this.aro = aro;
        this.ehImportado = ehImportado;
    }

    @Override
    public double getPreco() {
        double total;
        if (aro <= 15)
            total = 30;
        else if (aro <= 20)
            total = 50;
        else if (aro <= 22)
            total = 70;
        else if (aro <= 25)
            total = 100;
        else if (aro <= 29)
            total = 140;
        else
            total = 200;
        return ehImportado ? total * 1.3 : total;
    }

    @Override
    public boolean getEhImportado() {
        return ehImportado;
    }

    private int aro;
    private boolean ehImportado;
}
