package Bicicleta.Acessorios;

public class Lanterna implements IAcessorio {

    public Lanterna(int potencia, boolean ehImportado) {
        this.potencia = potencia;
        this.ehImportado = ehImportado;
    }

    @Override
    public double getPreco() {
        double mult = 1;

        if (ehImportado)
            mult = 1.40;

        return potencia * 25 * mult;
    }

    @Override
    public boolean getEhImportado() { // está certo usar interface para forçar a criação de um atributo?
        return ehImportado;
    }

    /**
     * Um número de 1 a 10
     */
    private int potencia;
    private boolean ehImportado;
}
