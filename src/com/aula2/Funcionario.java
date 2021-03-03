package com.aula2;

public class Funcionario {

    public Funcionario(boolean trabalhaANoite, double salarioBase, int numeroFilhos, boolean usaValeTransporte, double totalVendas) {
        this.trabalhaANoite = trabalhaANoite;
        this.salarioBase = salarioBase;
        this.numeroFilhos = numeroFilhos;
        this.usaValeTransporte = usaValeTransporte;
        this.totalVendas = totalVendas;
    }

    public double CalcularSalario() {
        double salario = deduzirInss(salarioBase);
        salario = adicionalFilhotes(salario);

    }

    private double adicionalFilhotes(double salario) {
        int numero = numeroFilhos;

        if (numero > 3)
            numero = 3;

        if (numero > 0)
            salario += 50 * numero;

        return salario;
    }

    private double deduzirInss(double salario) {
        return salario * 0.87;
    }


    private boolean trabalhaANoite;
    private double salarioBase;
    private int numeroFilhos;
    private boolean usaValeTransporte;
    private double totalVendas;
}
