package com.lista1;

import java.util.ArrayList;
import java.util.List;

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

    public double mediaAlturaMulheres() {
        double somaAltura = 0;
        List<Pessoa> mulheres = listaMulheres();
        for (Pessoa p : mulheres) // para cada pessoa na lista de mulheres
            somaAltura += p.altura;

        return somaAltura / mulheres.size();
    }

    private List<Pessoa> listaMulheres() { // retorna todas as mulheres da população
        List<Pessoa> femeas = new ArrayList<>();

        for (int i = 0; i < populacao.length; i++)
            if (populacao[i].sexo == Genero.feminino)
                femeas.add(populacao[i]);

        return femeas;
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
/*
    Faça um programa que compile dados acerca de uma população, analisando, para cada indivíduo:
    - sexo (masculino, feminino)
    - cor dos olhos (azuis, verdes, castanhos)
    - cor dos cabelos (louros, castanhos, pretos)
    - idade.
    O aplicativo deve calcular e imprimir as seguintes informações:
    a) a maior e a menor altura dos habitantes;
    b) a média de altura das mulheres;
    c) o número de homens;
    d) A porcentagem de homens e de mulheres.
    b) A porcentagem de indivíduos do sexo feminino entre 18 e 35 anos
     e que tenham olhos verdes e cabelos louros
 */