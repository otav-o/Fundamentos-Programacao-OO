package Contas;

public class ContaPoupanca extends Conta implements Imprimivel {

    public ContaPoupanca(int numero, double limite) {
        this.numeroConta = numero;
        this.limite = limite;
    }

    public int getNumero() {
        return numeroConta;
    }

    @Override
    public void sacar(double valor) {
        if (valor <= saldo)
            saldo -= valor;
        else if (valor <= saldo + limite)
            saldo -= valor; // ficará negativo até o valor do limite
        else
            return;
    }

    @Override
    public void depositar(double valor) {
        if (valor > 0)
            saldo += valor;
    }

    @Override
    public String mostrarDados() {
        return String.format("Número da conta: %d\n" +
                "Saldo: %.2f\n" +
                "Limite: R$%.2f", numeroConta, saldo, limite);
    }

    private double limite;
}
