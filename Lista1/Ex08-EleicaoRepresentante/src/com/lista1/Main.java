/*
    Zezin deseja realizar uma votação para representante de turma, todos os alunos
    podem ser votados e cada aluno tem direito a um voto. Faça um sistema que permita
    que os alunos realizem seus votos ao final mostre o nome do aluno ganhador e qual o
    percentual dos votos.
 */

package com.lista1;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        var turma = gerarAlunos();
        var eleicao2021 = new Eleicao(turma);
        eleicao2021.iniciarVotacao();
    }

    private static List<Aluno> gerarAlunos() {
        ArrayList<Aluno> retorno = new ArrayList<>();
        retorno.add(new Aluno(1, "Daves"));
        retorno.add(new Aluno(2, "Miriã"));
        retorno.add(new Aluno(3, "Camillo"));
        retorno.add(new Aluno(4, "Gildo"));
        retorno.add(new Aluno(5, "Camila"));
        // não existe um jeito mais fácil de acicionar elementos a uma lista? Com chaves por exemplo?

        return retorno;
    }
}