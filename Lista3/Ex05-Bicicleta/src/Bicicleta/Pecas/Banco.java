package Bicicleta.Pecas;

public class Banco implements IPeca {

    public Banco (int maciez, int tamanho, boolean ehImportado) {
        this.maciez = maciez;
        this.tamanho = tamanho;
        this.ehImportado = ehImportado;
    }

    @Override
    public double getPreco() {
        return maciez * 5 + tamanho * 4 + (ehImportado ? 50 : 0);
    }

    @Override
    public boolean getEhImportado() {
        return ehImportado;
    }

    /**
     * Um número de 1 a 10
     */
    private int maciez;

    /**
     * Um número de 1 a 10
     */
    private int tamanho;
    private boolean ehImportado;
}
