import Contas.Conta;

import java.util.ArrayList;

public class Banco {

    public void inserirConta(Conta c) {
        contas.add(c);
    }

    public Conta procurarConta(int numero) {
        var indice = encontrarIndiceConta(numero);
        return contas.get(indice);
    }

    public void removerConta(int numero) {
        var indice = encontrarIndiceConta(numero);
        contas.remove(indice);
    }

    private int encontrarIndiceConta(int numeroConta) {
        for (var c : contas)
            if (c.getNumero() == numeroConta)
                return contas.indexOf(c);

        return -1;
    }

    private ArrayList<Conta> contas;
}
