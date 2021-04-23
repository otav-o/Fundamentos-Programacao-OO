import Contas.Conta;
import Contas.Imprimivel;

import java.util.ArrayList;

public class Banco implements Imprimivel {

    public void inserirConta(Conta c) {
        contas.add(c);
    }

    public Conta procurarConta(int numero) throws Exception {
        var indice = encontrarIndiceConta(numero);
        return contas.get(indice);
    }

    public void removerConta(int numero) throws Exception {
        var indice = encontrarIndiceConta(numero);
        contas.remove(indice);
    }

    private int encontrarIndiceConta(int numeroConta) throws Exception {
        for (var c : contas)
            if (c.getNumero() == numeroConta)
                return contas.indexOf(c);

        throw new Exception("Não existe conta com este número");
    }

    @Override
    public String mostrarDados() {

        String retorno = "";

        for (var c: contas) {
            retorno += ((Imprimivel) c).mostrarDados() + "\n\n";
        }

        return retorno;
    }

    private ArrayList<Conta> contas = new ArrayList<>();
}
