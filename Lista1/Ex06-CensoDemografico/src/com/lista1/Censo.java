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

    public double numeroHomens() {
        List<Pessoa> homens = pessoasPorSexo(Genero.masculino); // problema de desempenho: vai executar toda vez que for chamado
        return homens.size();
    }

    private double numeroMulheres() {
        List<Pessoa> mulheres = pessoasPorSexo(Genero.feminino);
        return mulheres.size();
    }

    public double mediaAlturaMulheres() {
        double somaAltura = 0;

        List<Pessoa> mulheres = pessoasPorSexo(Genero.feminino);
        for (Pessoa p : mulheres) // para cada pessoa na lista de mulheres
            somaAltura += p.altura;

        return somaAltura / mulheres.size();
    }

    private List<Pessoa> pessoasPorSexo(Genero g) {
        List<Pessoa> lista = new ArrayList<>();

        for (int i = 0; i < populacao.length; i++)
            if (populacao[i].sexo == g)
                lista.add(populacao[i]);

        return lista;
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