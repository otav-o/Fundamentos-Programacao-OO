package com.aula2;

public class Empresa {

    public Empresa (double totalVendas, Funcionario[] funcionarios) {
        this.totalVendas = totalVendas;
        this.funcionarios = funcionarios;
    }

    public double calcularFolhaPagamento() {
        double total = 0;
        for (int i = 0; i < funcionarios.length; i++)
            total += funcionarios[0].CalcularSalario();

        return total;
    }

    private double totalVendas; // inútil

    private Funcionario[] funcionarios;

    public double getTotalVendas() {
        return totalVendas;
    } // inútil
}
