// "Crie um programa que calcule a distância entre dois pontos no plano cartesiano."
        package com.lista1;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Ponto A\n" +
                "Abscissa: ");
        double absA = in.nextDouble();
        System.out.print("Ordenada: ");
        double ordA = in.nextDouble();

        System.out.print("Ponto B\n" +
                "Abscissa: ");
        double absB = in.nextDouble();
        System.out.print("Ordenada: ");
        double ordB = in.nextDouble();

        System.out.println("A distância entre os dois pontos é " );
    }
}