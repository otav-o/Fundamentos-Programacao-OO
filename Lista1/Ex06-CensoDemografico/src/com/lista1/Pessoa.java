package com.lista1;

public class Pessoa {

    public Pessoa(Genero sexo, String corOlhos, String corCabelos, int idade, double altura) {
        this.sexo = sexo;
        this.corOlhos = corOlhos;
        this.corCabelos = corCabelos;
        this.idade = idade;
        this.altura = altura;
    }

    private Genero sexo;
    private String corOlhos;
    private String corCabelos;
    private int idade;
    public double altura;
}