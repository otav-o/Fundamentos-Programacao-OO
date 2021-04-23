package Contas;

public class ContaCorrente extends Conta implements Imprimivel {

    public ContaCorrente(int numero, double taxaOperacao) {
        this.numeroConta = numero;
        this.taxaOperacao = taxaOperacao;
    }

    @Override
    public void sacar(double valor) {
        saldo -= (valor + taxaOperacao);
    }

    @Override
    public void depositar(double valor) {
        saldo += (valor - taxaOperacao);
    }

    @Override
    public String mostrarDados() {
        return String.format("Número da conta: %d\n" +
                "Saldo: %.2f\n" +
                "Taxa de operação: R$%.2f", numeroConta, saldo, taxaOperacao);
    }

    private double taxaOperacao;
}
