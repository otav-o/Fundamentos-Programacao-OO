/*
    Crie um aplicativo que permita ao consumidor customizar a escolha de um carro
    novo com seus acessórios

    Ao final mostre os detalhes do carro escolhido e o custo conforme o cálculo a seguir:

    O preço do carro depende do modelo;
    IPI: 20% do custo final do veículo;
        Exceção: 10% se o motor for 1.0
    se for importado, há a taxa de 30% sobre o preço.

    Ar -> R$ 3.000,00;
    Câmbio automático -> R$ 5.000,00;
    Alarme -> R$ 800,00;
    Pintura especial, metálica ou comemorativa -> R$ 2.500,00;
    teto solar -> R$ 4.000,00;
    kit multimidia -> R$ 1.800,00
 */
package com.lista1;

import com.lista1.acessorios.*;

public class Main {

    public static void main(String[] args) {
        var c = gerarCarroCompleto();
        System.out.println(c.getPrecoFinal());
    }

    private static Carro gerarCarroCompleto() {
        var c = new Carro("Celta", new Motor(1.0));
        c.adicionarAcessorio(
                new Alarme(),
                new ArCondicionado(),
                new CambioAutomatico(),
                new KitMultimidia(),
                EPintura.COMEMORATIVA,
                new TetoSolar()
        );
        return c;
    }
}
