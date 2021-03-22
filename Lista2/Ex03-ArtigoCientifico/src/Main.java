/*
    Um artigo científico é um trabalho submetido para avaliação de qualidade por algum comitê.
    Um artigo é escrito por um orientador, um professor, e por alguns alunos.
    A ordem de inclusão do nome dos alunos se dá pela relevância na participação no artigo.
    O artigo deve ter um título e um resumo, além dos seus autores.
    Faça um sistema que auxilie um comitê a avaliar os artigos
    submetidos e atribua uma nota. Ao final mostre os 3 artigos mais bem avaliados.
 */


import Pessoa.Aluno;
import Pessoa.Orientador;
import Pessoa.Professor;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	    var artigos = criarArtigos();
	    atribuirAutores(artigos);
	    ComiteConsole c = new ComiteConsole(artigos);
	    c.avaliar();
	    c.ImprimirResultado();
    }

    private static List<Artigo> criarArtigos() {
        var a1 = new Artigo("Os altos salários dos professores de TI", "Um estudo sobre meu professor de FPOO");
        var a2 = new Artigo("Impactos da pandemia na saúde mental universitária", "Sim, o milésimo artigo sobre esse tema");
        var a3 = new Artigo("Como a cevada aumenta o rendimento de estudantes", "Uma defesa à gratuidade da cerveja");
        var a4 = new Artigo("Por que a vacinação deve ser obrigatória", "Eu mando e você obedece");

        var artigos = new ArrayList<Artigo>(); artigos.add(a1); artigos.add(a2); artigos.add(a3); artigos.add(a4);
        return artigos;
    }

    private static void atribuirAutores(List<Artigo> artigos) {
        var p1 = new Orientador("Daves");
        var p2 = new Aluno("Jonas");
        var p3 = new Professor("Marcelo");

        for (var a : artigos)
            a.addAutor(p1, p2, p3);
    }
}
