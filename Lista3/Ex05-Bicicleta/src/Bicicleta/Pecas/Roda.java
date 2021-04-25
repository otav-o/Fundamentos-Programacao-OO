package Bicicleta.Pecas;

public class Roda implements IPeca {

    public Roda(int aro) {
        this.aro = aro;
    }

    @Override
    public double getPreco() {
        if (aro <= 15)
            return 30;
        else if (aro <= 20)
            return 50;
        else if (aro <= 22)
            return 70;
        else if (aro <= 25)
            return 100;
        else if (aro <= 29)
            return 140;
        else
            return 200;
    }

    private int aro;
}
