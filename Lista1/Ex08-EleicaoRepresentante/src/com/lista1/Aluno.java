package com.lista1;

public class Aluno {

    public Aluno(String nome) {
        this.nome = nome;
    }

    public void votar(Aluno a) throws Exception {
        if (this.jaVotou)
            throw new Exception(this.nome + " já votou.");

        a.votosRecebidos++;
        this.jaVotou = true;
    }

    private String nome;
    private boolean jaVotou;
    private int votosRecebidos;
}