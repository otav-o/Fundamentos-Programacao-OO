package com.lista1.acessorios;

public class ArCondicionado implements IAcessorio {
    @Override
    public double getPreco() {
        return preco;
    }

    private double preco = 3000;
}
