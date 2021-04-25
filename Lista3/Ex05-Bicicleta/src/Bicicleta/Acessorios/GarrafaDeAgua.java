package Bicicleta.Acessorios;

public class GarrafaDeAgua implements IAcessorio {

    public GarrafaDeAgua(double capacidade) {
        this.capacidade = capacidade;
    }

    @Override
    public double getPreco() {
        if (capacidade <= 500)
            return 60;
        else
            return 100;
    }

    /**
     * Valor em mililitros (ml)
     */
    private double capacidade;
}
