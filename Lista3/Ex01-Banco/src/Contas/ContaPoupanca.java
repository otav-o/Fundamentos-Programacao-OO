package Contas;

public class ContaPoupanca extends Conta implements Imprimivel {
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

    }

    @Override
    public String mostrarDados() {
        return String.format("Número da conta: %d\n" +
                "Saldo: %f\n" +
                "Limite: R$%f", numeroConta, saldo, limite);
    }

    private double limite;
}
