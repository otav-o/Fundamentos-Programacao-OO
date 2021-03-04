/*
    Faça um programa que compile dados acerca de uma população, analisando, para cada indivíduo:
    - sexo (masculino, feminino)
    - cor dos olhos (azuis, verdes, castanhos)
    - cor dos cabelos (louros, castanhos, pretos)
    - idade.
    O aplicativo deve calcular e imprimir as seguintes informações:
    a) a maior e a menor altura dos habitantes;
    b) a média de altura das mulheres;
    c) o número de homens;
    d) A porcentagem de homens e de mulheres.
    b) A porcentagem de indivíduos do sexo feminino entre 18 e 35 anos
     e que tenham olhos verdes e cabelos louros
 */

package com.lista1;

public class Main {

    public static void main(String[] args) {

	    var juizDeFora = retornarPessoas();
	    Censo c1 = new Censo(juizDeFora);
	    System.out.println(c1.retornarPesquisa());

    }

    public static Pessoa[] retornarPessoas() {
        Pessoa p1 = new Pessoa(Genero.feminino, "Azul", "Castanho", 25, 1.60);
        Pessoa p2 = new Pessoa(Genero.feminino, "Verde", "Loiro", 18, 1.75);
        Pessoa p3 = new Pessoa(Genero.masculino, "Preto", "Preto", 30, 1.80);
        Pessoa p4 = new Pessoa(Genero.masculino, "Azul", "Amarelo", 22, 1.72);
        Pessoa p5 = new Pessoa(Genero.masculino, "Verde", "Verde", 15, 1.50);
        Pessoa p6 = new Pessoa(Genero.feminino, "Verde", "Loiro", 18, 1.75);


        return new Pessoa[] {p1, p2, p3, p4, p5, p6};
    }
}
