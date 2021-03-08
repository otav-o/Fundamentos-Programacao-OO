package com.lista1;
import java.util.ArrayList;
import java.util.List;

public class Eleicao {

    public Eleicao (List<Aluno> turma) {
        this.turma = turma;
    }

    public void realizarEleicao() {

    }

    private List<Aluno> retornarCandidatos() {
        List<Aluno> candidatos = new ArrayList<>();
        for (Aluno a : turma)
            if (a.getEhCandidato())
                candidatos.add(a);
        return candidatos;
    }

    private List<Aluno> turma;
}
