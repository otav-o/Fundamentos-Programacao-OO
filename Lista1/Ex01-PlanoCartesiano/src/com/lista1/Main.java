// "Crie um programa que calcule a distância entre dois pontos no plano cartesiano."

package com.lista1;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("com.lista1.Ponto A\n" +
                "Abscissa: ");
        double absA = in.nextDouble();
        System.out.print("Ordenada: ");
        double ordA = in.nextDouble();

        System.out.print("com.lista1.Ponto B\n" +
                "Abscissa: ");
        double absB = in.nextDouble();
        System.out.print("Ordenada: ");
        double ordB = in.nextDouble();

        Ponto a = new Ponto(absA, ordA);
        Ponto b = new Ponto(absB, ordB);

        System.out.println("A distância entre os dois pontos é " + a.distanciaAte(b));
        System.out.println("Confirmação da distância: " + b.distanciaAte(a));

    }


}