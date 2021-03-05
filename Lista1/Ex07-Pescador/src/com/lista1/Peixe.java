package com.lista1;

public class Peixe implements IPescado{
    public Peixe(double peso) {
        this.peso = peso;
    }
    public double getPeso() {
        return peso;
    }
    private double peso;
}
