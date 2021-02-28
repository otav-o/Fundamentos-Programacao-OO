// "Crie um programa que calcule a distância entre dois pontos no plano cartesiano."

package com.lista1;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Ponto a = retornarPonto("a");
        Ponto b = retornarPonto("b");

        System.out.println("A distância entre os dois pontos é " + a.distanciaAte(b));
        System.out.println("Confirmação da distância: " + b.distanciaAte(a));

    }

    public static Ponto retornarPonto(String nome) {
        Scanner in = new Scanner(System.in);

        System.out.print("Ponto " + nome +"\n" +
                "Abscissa: ");
        double abs = in.nextDouble();

        System.out.print("Ordenada: ");
        double ord = in.nextDouble();

        return new Ponto(abs, ord);
    }
} // FIM