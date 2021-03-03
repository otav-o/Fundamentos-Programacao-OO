package com.aula2;

public class Funcionario {

    public Funcionario(boolean trabalhaANoite, double salarioBase, int numeroFilhos, boolean usaValeTransporte, double totalVendas) {
        this.trabalhaANoite = trabalhaANoite;
        this.salarioBase = salarioBase;
        this.numeroFilhos = numeroFilhos;
        this.usaValeTransporte = usaValeTransporte;
        this.totalVendas = totalVendas;
    }

    private boolean trabalhaANoite;
    private double salarioBase;
    private int numeroFilhos;
    private boolean usaValeTransporte;
    private double totalVendas;
}
