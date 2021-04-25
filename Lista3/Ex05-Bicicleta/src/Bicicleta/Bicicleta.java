package Bicicleta;

import Bicicleta.Acessorios.IAcessorio;
import Bicicleta.Pecas.IPeca;

import java.util.ArrayList;
import java.util.List;

public class Bicicleta implements IPreco {

    public void addAcessorio(IAcessorio acessorio) {
        acessorios.add(acessorio);
    }

    @Override
    public double getPreco() {
        double total = 0;
        for (IPreco objeto : acessorios)
            total += objeto.getPreco();
        for (IPreco objeto : pecas)
            total += objeto.getPreco();
        return total;
    }

    private List<IPeca> pecas = new ArrayList<>();
    private List<IAcessorio> acessorios = new ArrayList<>();
    private String cor;
}
