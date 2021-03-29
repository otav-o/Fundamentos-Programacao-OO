import Loteria.Esportiva.Cartao;
import Loteria.Esportiva.Jogo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        var jogos = jogosDaRodada();

        var joao = new Apostador("João");
        joao.addCartao(new Cartao(150));

        var gabarito = gerarGabarito();

        try {
            colherApostas(jogos, joao.getCartao(150));
            System.out.printf("%s teve %d acertos em seu cartão %d",
                    joao.getNome(),
                    joao.getNumeroAcertos(gabarito, 150),
                    joao.getCartao(150).getNumero()); // eu sei, não faz sentido pegar o mesmo número passado por parâmetro (mas é apenas um exercício de treino)

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    private static void colherApostas(List<Jogo> jogos, Cartao c) {
        for (var j : jogos) {
            System.out.printf("Jogo: %s x %s.\nGols de %s: ", j.getTime1(), j.getTime2(), j.getTime1());
            int gols1 = s.nextInt();
            System.out.print("Gols de " + j.getTime2() + " ");
            int gols2 = s.nextInt();

            c.addJogo(new Jogo(j.getTime1(), j.getTime2(), gols1, gols2));
        }
    }
    private static Cartao gerarGabarito() {
        var jogos = jogosDaRodada();
        var g = new Cartao();
        for (var j : jogos)
            g.addJogo(j);
        return g;
    }

    private static List<Jogo> jogosDaRodada() {
        var jogos = new ArrayList<Jogo>();
        jogos.add(new Jogo("São Paulo", "Palmeiras", 1, 2));
        jogos.add(new Jogo("Flamengo", "Vasco", 1, 2));
        jogos.add(new Jogo("Botafogo", "Corinthians", 1, 2));
        jogos.add(new Jogo("Grêmio", "Internacional", 1, 2));
        jogos.add(new Jogo("Chapecoense", "Tupi", 1, 2));
        jogos.add(new Jogo("Atlético MG", "Barcelona", 1, 2));
        jogos.add(new Jogo("Brasil", "Alemanha", 1, 2));
        jogos.add(new Jogo("Resende", "Chelsea", 1, 2));
        jogos.add(new Jogo("Argentina", "Uruguai", 1, 2));
        jogos.add(new Jogo("Atlético PR", "Tupinambás", 1, 2));
        jogos.add(new Jogo("Cruzeiro", "Ponte Preta", 1, 2));
        jogos.add(new Jogo("Coritiba", "Sport", 1, 2));
        jogos.add(new Jogo("Figueirense", "Santos", 1, 2));

        return jogos;
    }

    private static Scanner s = new Scanner(System.in);
}
    /*Construa um programa que leia o gabarito de um teste da loteria esportiva,

        aloteria esportiva é composta por 13 jogos de futebol, podendo ter 3
        resultadospossíveis,  primeiro time, empate ou segundo time

        Leia,   a   seguir,   as
        apostas   de   váriosapostadores, incluindo seu nome, o número do seu cartão e as
        respostas dessecartão.

        Um apostador pode realizar várias apostas. Ao final mostre para
        cadaapostador o número de acertos. Se o apostador tiver treze acertos, mostre amensagem
        “Ganhador”. */