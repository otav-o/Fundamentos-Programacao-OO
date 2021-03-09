package com.lista1;
import java.util.List;
import java.util.Scanner;


public class Eleicao {

    public Eleicao (List<Aluno> turma) {
        this.turma = turma;
    }



    private Aluno retornarAlunoPorMatricula(int matricula) throws Exception {
        for (Aluno a : turma)
            if (a.getMatricula() == matricula)
                return a;
        throw new Exception("Não existe aluno com esta matrícula.");
    }

    private List<Aluno> turma;
}
