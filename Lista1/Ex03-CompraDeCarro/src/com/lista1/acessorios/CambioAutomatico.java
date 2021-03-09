package com.lista1.acessorios;

public class CambioAutomatico implements IAcessorio{
    @Override
    public double getPreco() {
        return preco;
    }

    private double preco = 5000;
}
