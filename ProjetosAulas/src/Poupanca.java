public class Poupanca extends Conta {

    public Poupanca(int numero) {
        super(numero);
    }

    public void rendimento(double taxaJuros) {
        saldo *= 1 + taxaJuros;
    }
}
