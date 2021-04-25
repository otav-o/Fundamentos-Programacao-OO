package Bicicleta.Pecas;

public class Banco implements IPeca {

    public Banco (int maciez, int tamanho) {
        this.maciez = maciez;
        this.tamanho = tamanho;
    }

    @Override
    public double getPreco() {
        return maciez * 5 + tamanho * 4;
    }

    /**
     * Um número de 1 a 10
     */
    private int maciez;

    /**
     * Um número de 1 a 10
     */
    private int tamanho;
}
