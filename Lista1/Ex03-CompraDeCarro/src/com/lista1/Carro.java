package com.lista1;

import com.lista1.acessorios.IAcessorio;

import java.util.List;

public class Carro {
    //private Modelo modelo;


    private double calcularPrecoFinal() {
        double precoFinal = calcularSomaAcessorios();
        // + modelo - impostos


        return precoFinal;
    }

    private double calcularSomaAcessorios() {
        double somaAcessorios = 0;
        for (IAcessorio a : acessorios)
            somaAcessorios += a.getPreco();
        return somaAcessorios;
    }
    private List<IAcessorio> acessorios;
}
