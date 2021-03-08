package com.lista1;

public class Aluno {

    public Aluno(String nome, boolean ehCandidato) {
        this.nome = nome;
        this.ehCandidato = ehCandidato;
        jaVotou = false;
    }

    public void votar(Aluno a) throws Exception {
        if (this.jaVotou)
            throw new Exception(this.nome + " já votou.");

        a.votosRecebidos++;
        this.jaVotou = true;
    }

    private String nome;
    private boolean jaVotou;
    private boolean ehCandidato;
    private int votosRecebidos;
}