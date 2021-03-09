package com.lista1;
import java.util.List;
import java.util.Scanner;


public class Eleicao {

    public Eleicao (List<Aluno> turma) {
        this.turma = turma;
    }

    public void iniciarVotacao() {
        for (Aluno a : turma) {
            Aluno eleitor = logarEleitor();
            colherVoto(eleitor);
        }
    }

    private Aluno logarEleitor() {
        Scanner s = new Scanner(System.in);
        System.out.println("Insira a SUA matrícula: ");
        Aluno eleitor = null;
        try {
            eleitor = retornarAlunoPorMatricula(s.nextInt());
        } catch (Exception e) {
            System.out.println(e.getMessage());
            eleitor = logarEleitor();
        }
        return eleitor;
    }

    private void colherVoto(Aluno eleitor) {
        Scanner s = new Scanner(System.in);
        System.out.printf("Olá, %s. Insira a matrícula do seu candidato: ", eleitor.getNome());
        Aluno candidato = null;
        try {
            candidato = retornarAlunoPorMatricula(s.nextInt());
        } catch (Exception e) {
            System.out.println(e.getMessage());
            colherVoto(eleitor);
        }
        try {
            eleitor.votar(candidato);
        } catch (Exception e) {
            System.out.println(e.getMessage() + ". Voto não registrado.");
        }
    }

    private Aluno retornarAlunoPorMatricula(int matricula) throws Exception {
        for (Aluno a : turma)
            if (a.getMatricula() == matricula)
                return a;
        throw new Exception("Não existe aluno com esta matrícula.");
    }

    private List<Aluno> turma;
}
