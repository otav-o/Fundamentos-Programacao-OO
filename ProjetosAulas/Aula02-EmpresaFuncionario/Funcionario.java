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
        return salarioBase - descontoInss() - descontoValeTransporte()
                + adicionalFilhotes() + adicionalNoturno() + adicionalVendedor();
    }

    public void setNumeroFilhos(int numeroFilhos) {
        if (numeroFilhos >= 0) {
            this.numeroFilhos = numeroFilhos;
        }
    }

    private double adicionalVendedor() {
        if (ehVendedor)
            return totalVendas * 0.02;
        return 0;
    }

    private double adicionalNoturno() {
        return trabalhaANoite ? salarioBase * 0.05 : 0;
    }

    private double descontoValeTransporte() {
        if (usaValeTransporte)
            return salarioBase * 0.03;
        else
            return 0;
    }

    private double adicionalFilhotes() {
        int numero = numeroFilhos;

        if (numero > 3)
            numero = 3;

        if (numero > 0)
            return 50 * numero;
        else
            return 0;
    }

    private double descontoInss() {
        return salarioBase * 0.13;
    }


    private boolean trabalhaANoite;
    private double salarioBase;
    private int numeroFilhos;
    private boolean usaValeTransporte;
    private boolean ehVendedor;
    private double totalVendas;
}
