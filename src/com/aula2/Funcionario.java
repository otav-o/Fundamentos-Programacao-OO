package com.aula2;

public class Funcionario {

    public Funcionario(boolean trabalhaANoite, double salarioBase, int numeroFilhos, boolean usaValeTransporte, Empresa empresa) {
        this.trabalhaANoite = trabalhaANoite;
        this.salarioBase = salarioBase;
        this.numeroFilhos = numeroFilhos;
        this.usaValeTransporte = usaValeTransporte;
        this.empresa = empresa;
    }

    public double CalcularSalario() {
        double salario = deduzirInss(salarioBase);
        salario = adicionalFilhotes(salario);
        salario = deduzirValeTransporte(salario);
        salario = adicionalNoturno(salario);
        salario = adicionalVendedor(salario);

        return salario;
    }

    private double adicionalVendedor(double salario) {
        if (ehVendedor)
            salario += empresa.getTotalVendas() * 0.02;
        return salario;
    }

    private double adicionalNoturno(double salario) {
        if (trabalhaANoite)
            return salario * 1.05;
        else
            return salario;
    }

    private double deduzirValeTransporte(double salario) {
        if (usaValeTransporte)
            return salario * 0.97;
        else
            return salario;
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
    private boolean ehVendedor;
    private Empresa empresa;
}
