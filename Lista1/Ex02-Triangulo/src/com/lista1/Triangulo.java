package com.lista1;
import java.lang.Math;

public class Triangulo {
    private double lado1;
    private double lado2;
    private double lado3;

    public Triangulo(double l1, double l2, double l3) {
        lado1 = l1; lado2 = l2; lado3 = l3;
    }

    public double getArea() {
        double p = getPerimetro() / 2;
        return Math.sqrt(p * (p-lado1) * (p-lado2) * (p-lado3));
    }

    public double getPerimetro() {
        return lado1 + lado2 + lado3;
    }

    public String getTipo() {
        if (lado1 == lado2 && lado1 == lado3)
            return "Equilátero";
        else if (lado1 == lado2 || lado2 == lado3 || lado1 == lado3)
            return "Isósceles";
        else
            return "Escaleno";
    }
}
