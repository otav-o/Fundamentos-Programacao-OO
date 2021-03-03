package com.aula2;

public class Empresa {

    public Empresa (Funcionario[] funcionarios) {
        this.funcionarios = funcionarios;
    }

    public double calcularFolhaPagamento() {
        double total = 0;
        for (int i = 0; i < funcionarios.length; i++)
            total += funcionarios[0].CalcularSalario();

        return total;
    }

    private Funcionario[] funcionarios;
}
