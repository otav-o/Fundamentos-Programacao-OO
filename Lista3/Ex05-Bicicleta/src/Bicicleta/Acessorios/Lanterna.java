package Bicicleta.Acessorios;

public class Lanterna implements IAcessorio {

    public Lanterna(int potencia) {
        this.potencia = potencia;
    }

    @Override
    public double getPreco() {
        return potencia * 25;
    }

    /**
     * Um número de 1 a 10
     */
    private int potencia;
}
