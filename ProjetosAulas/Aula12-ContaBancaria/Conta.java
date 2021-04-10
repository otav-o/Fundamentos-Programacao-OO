public class Conta {

    public Conta(int numero) {
        this.numero = numero;
        saldo = 0;
    }

    public void depositar(double valor) {
        saldo += valor;
    }

    public void sacar(double valor) {
        if (saldo > 0)
            saldo -= valor;
    }

    public int getNumero() {
        return numero;
    }

    public double getsaldo() {
        return saldo;
    }

    private int numero;
    protected double saldo;
}
