/*
    Um pescador deseja controlar o rendimento diário de seu trabalho. Toda vez que ele
    traz um peixe maior que o estabelecido pelo regulamento de pesca do Estado de Minas
    Gerais (50 quilos), deve pagar uma multa de R$4,00 por quilo excedente. Escreva um
    app que leia as informações dos peixes pegos pelo pescador, ao final mostre quanto o
    mesmo deve pagar.
 */


package com.lista1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        System.out.println("Quantos peixes você quer cadastrar? ");
        int n = s.nextInt();

        var peixes = CadastrarPeixes(n);

        var regulamento = new RegulamentoPesca();

        System.out.println("Multa de: R$" + regulamento.calcularMulta(peixes));

    }

    private static Peixe[] CadastrarPeixes(int quantidade) {
        Peixe[] peixes = new Peixe[quantidade];

        Scanner s = new Scanner(System.in);

        for (int i = 0; i < quantidade; i++) {
            System.out.printf("Insira o peso do %d° peixe: ", i + 1);
            peixes[i] = new Peixe(s.nextDouble()); // gambiarra? seria melhor uma lista
        }

        return peixes;
    }
}
