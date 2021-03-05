package com.lista1;

public class RegulamentoPesca {

    private double calcularMulta(Peixe[] peixes) {
        double pesoExcedido = 0;
        for (Peixe p : peixes) {
            if (p.getPeso() > pesoMaximoPorPeixe)
                pesoExcedido += p.getPeso() - pesoMaximoPorPeixe;
        }
        return pesoExcedido * multaPorQuiloExcedente;
    }

    private double multaPorQuiloExcedente = 4;
    private double pesoMaximoPorPeixe = 50;
}
