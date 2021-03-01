package com.lista1;

public class Censo {

    public Censo (Pessoa[] populacao) {
        this.populacao = populacao;
    }

    private Pessoa maiorAltura() {

        Pessoa maisAlta = populacao[0];

        for (int i = 0; i < populacao.length; i++) {
            if (populacao[i].altura > maisAlta.altura)
                maisAlta = populacao[i];
        }
        return maisAlta;
    }

    private Pessoa[] populacao;
}