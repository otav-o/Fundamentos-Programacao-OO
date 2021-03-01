/*
    Criar um aplicativo para cálculo do salário líquido em que três valores devem ser
    informados pelo usuário: a quantidade de horas trabalhadas, o salário-hora e o
    número de dependentes. O aplicativo deve mostrar em janela de saída as
    informações conforme abaixo

    Salário bruto = Horas trabalhadas * salário-hora + (50 * número de dependentes)
    Desconto INSS
        Se salário bruto <= 1000 INSS=salário bruto * 8.5/100
        Se salário bruto > 1000 INSS=salário bruto * 9/100
    Desconto IR
        Se salário bruto <= 500 IR=0
        Se salário bruto > 500 e <= 1000 IR=salário bruto*5/100
        Se salário bruto > 1000 IR=salário bruto*7/100
    Salário líquido = Salário bruto - INSS – IR

 */

package com.lista1;

public class Main {

    public static void main(String[] args) {

        Emprego pedreiro = new Emprego(160, 15); // horasTrabalhadas, salarioHora

        Empregado daves = new Empregado(pedreiro, 2); // emprego, numeroDependentes

        System.out.print("O salário de Daves, descontados todos os impostos e contribuições, é: "
                + daves.getSalarioLiquido());

    }
}
