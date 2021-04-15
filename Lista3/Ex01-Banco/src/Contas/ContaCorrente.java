package Contas;

public class ContaCorrente extends Conta{

    @Override
    public void sacar(double valor) {
        saldo -= (valor + taxaOperacao);
    }

    @Override
    public void depositar(double valor) {
        saldo += (valor - taxaOperacao);
    }

    private double taxaOperacao;
}
