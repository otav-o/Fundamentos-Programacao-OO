public class ContaCorrente extends Conta {
    public ContaCorrente(int numero) {
        super(numero); // se a classe pai não tiver construtor vazio
        limiteCredito = 1000;
    }

    public ContaCorrente(int numero, double limiteCredito) {
        super(numero);
        this.limiteCredito = limiteCredito;
    }

    @Override
    public void sacar(double valor) {
        if (saldo + limiteCredito >= valor)
            saldo -= valor;
    }

    public double getLimiteCredito() {
        return limiteCredito;
    }

    private double limiteCredito;
}
