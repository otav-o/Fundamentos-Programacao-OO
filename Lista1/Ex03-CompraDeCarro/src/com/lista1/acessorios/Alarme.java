package com.lista1.acessorios;

public class Alarme implements IAcessorio{
    @Override
    public double getPreco() {
        return preco;
    }

    private double preco = 800;
}
