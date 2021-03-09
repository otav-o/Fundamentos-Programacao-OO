package com.lista1;

import com.lista1.acessorios.IAcessorio;

import java.util.ArrayList;
import java.util.List;

public class Carro {
    //private Modelo modelo;


    public double calcularPrecoFinal() {
        double precoFinal = calcularSomaAcessorios();
        // + modelo - impostos

        return precoFinal;
    }

    public void adicionarAcessorio(IAcessorio ... ac) {
        for (IAcessorio a : ac)
            acessorios.add(a);
    }

    private double calcularSomaAcessorios() {
        double somaAcessorios = 0;
        for (IAcessorio a : acessorios)
            somaAcessorios += a.getPreco();
        return somaAcessorios;
    }

    private List<IAcessorio> acessorios = new ArrayList<>();
}
