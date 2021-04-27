package Bicicleta.Acessorios;

public class GarrafaDeAgua implements IAcessorio {

    public GarrafaDeAgua(double capacidade, boolean ehImportado) {
        this.capacidade = capacidade;
        this.ehImportado = ehImportado;
    }

    @Override
    public double getPreco() {
        double total;
        if (capacidade <= 500)
            total = 60;
        else
            total = 100;
        return ehImportado ? total * 1.3 : total;
    }

    @Override
    public boolean getEhImportado() {
        return ehImportado;
    }

    /**
     * Valor em mililitros (ml)
     */
    private double capacidade;
    private boolean ehImportado;
}
