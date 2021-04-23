package Contas;

public abstract class Conta {
    public abstract void sacar(double valor);
    public abstract void depositar(double valor);

    public abstract int getNumero();

    protected int numeroConta;
    protected double saldo;
}
