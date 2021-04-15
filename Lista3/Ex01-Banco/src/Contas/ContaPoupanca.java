package Contas;

public class ContaPoupanca extends Conta{
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

    private double limite;
}
