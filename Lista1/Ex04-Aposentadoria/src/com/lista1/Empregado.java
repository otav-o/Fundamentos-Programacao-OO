package com.lista1;

public class Empregado {
    public Empregado (int anoNascimento, int anosTrabalhados) {
        this.anosTrabalhados = anosTrabalhados;
        this.anoNascimento = anoNascimento;
    }

    public int getIdade(int anoAtual) { // não consegui puxar a data atual do sistema
        return (anoAtual - anoNascimento);
    }

    public int getAnosTrabalhados() {
        return anosTrabalhados;
    }

    private int anoNascimento; // optei por não usar Date
    private int anosTrabalhados;
}