/*
    Um pescador deseja controlar o rendimento diário de seu trabalho. Toda vez que ele
    traz um peixe maior que o estabelecido pelo regulamento de pesca do Estado de Minas
    Gerais (50 quilos), deve pagar uma multa de R$4,00 por quilo excedente. Escreva um
    app que leia as informações dos peixes pegos pelo pescador, ao final mostre quanto o
    mesmo deve pagar.
 */


package com.lista1;

public class Main {

    public static void main(String[] args) {
        var peixes = Pescar();

        var regulamento = new RegulamentoPesca();

        System.out.println("Multa de: R$" + regulamento.calcularMulta(peixes));

    }

    private static Peixe[] Pescar() {
        return new Peixe [] {
                new Peixe(35),
                new Peixe(50),
                new Peixe(52),
                new Peixe(10),
                new Peixe(65)
        };
    }
}
