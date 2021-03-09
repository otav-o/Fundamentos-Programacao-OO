package com.lista1.acessorios;

public class TetoSolar implements IAcessorio{
    @Override
    public double getPreco() {
        return preco;
    }

    private double preco = 4000;
}
