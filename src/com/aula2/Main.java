/*
    Uma empresa possui diversos funcionários, cujos salários são calculados da seguinte forma:

    Salário = salário base - 13% de inss + 50 por filho, até o limite de 3 filhos,
    -3% se o funcionário usa vale transporte
    +5% se trabalha à noite
    e +2% do total das vendas, se o funcionário for vendedor.

    Faça um sistema que leia os funcionários da empresa e mostre o total de salários a ser pago pela empresa

 */

package com.aula2;

public class Main {

    public static void main(String[] args) {

        var emp = new Empresa(20000, retornarTrabalhadores());

        System.out.println("Esta empresa pagou " + emp.calcularFolhaPagamento() + " reais em salários no último mês.");

    }

    public static Funcionario[] retornarTrabalhadores() {

        var f1 = new Funcionario(true, 5000, 50, true, 0);
        var f2 = new Funcionario(false, 1000, 0, false, 1000);
        var f3 = new Funcionario(true, 500, 2, true, 400);

        return new Funcionario[] {f1, f2, f3};
    }
}
