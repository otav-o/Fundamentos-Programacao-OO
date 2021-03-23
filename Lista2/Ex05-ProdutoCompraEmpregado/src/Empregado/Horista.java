package Empregado;

public class Horista extends Empregado {

    public Horista(double precoHora, double horasTrabalhadas) {
        this.precoHora = precoHora; this.horasTrabalhadas = horasTrabalhadas;
    }

    @Override
    public double vencimento() {
        return precoHora * horasTrabalhadas;
    }

    private double precoHora;
    private double horasTrabalhadas;
}
