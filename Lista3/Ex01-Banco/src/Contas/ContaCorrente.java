package Contas;

public class ContaCorrente extends Conta implements Imprimivel {

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
                "Saldo: %f\n" +
                "Taxa de operação: R$%f", numeroConta, saldo, taxaOperacao);
    }

    private double taxaOperacao;
}
