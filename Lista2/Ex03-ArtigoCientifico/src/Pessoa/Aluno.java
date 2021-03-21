package Pessoa;

import Pessoa.Pessoa;

public class Aluno extends Pessoa {
    public Aluno(String nome) {
        this.nome = nome;
    }
    private double escalaDeImportancia; // a ideia é que sejam dados valores quaisquer para ranquear os alunos
}
