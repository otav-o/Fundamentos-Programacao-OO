package com.lista1;

public class Censo {

    public Censo (Pessoa[] populacao) {
        this.populacao = populacao;
    }

    public double maiorAltura() {
        return maisAlta().altura;
    }

    public double menorAltura() {
        return maisBaixa().altura;
    }

    private Pessoa maisAlta() {

        Pessoa maisAlta = populacao[0];

        for (int i = 0; i < populacao.length; i++) {
            if (populacao[i].altura > maisAlta.altura)
                maisAlta = populacao[i];
        }
        return maisAlta;
    }

    private Pessoa maisBaixa() { // código repetido!

        Pessoa maisBaixa = populacao[0];

        for (int i = 0; i < populacao.length; i++) {
            if (populacao[i].altura > maisBaixa.altura)
                maisBaixa = populacao[i];
        }
        return maisBaixa;


    }

    private Pessoa[] populacao;
}