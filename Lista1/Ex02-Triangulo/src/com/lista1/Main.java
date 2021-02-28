// "Crie um programa para ler os 3 lados de um triângulo e, ao final, imprima sua área, perímetro e o tipo (Isósceles, Escaleno ou Equilátero)"
package com.lista1;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ImprimirDadosTriangulo(retornarTriangulo());
    }

    public static Triangulo retornarTriangulo() {
        Scanner le = new Scanner(System.in);
        System.out.print("CRIAÇÃO DE TRIÂNGULO\n" +
                "Primeiro lado: ");
        double l1 = le.nextDouble();

        System.out.print("Segundo lado: ");
        double l2 = le.nextDouble();

        System.out.print("Terceiro lado: ");
        double l3 = le.nextDouble();

        return new Triangulo(l1, l2, l3);
    }

    public static void ImprimirDadosTriangulo(Triangulo t) {
        System.out.printf("PERÍMETRO: %2f\n" +
                "ÁREA: %2f\n" +
                "TIPO: %s", t.getPerimetro(), t.getArea(), t.getTipo());
    }
}
