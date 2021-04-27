package Bicicleta;

import Bicicleta.Acessorios.IAcessorio;
import Bicicleta.Pecas.Banco;
import Bicicleta.Pecas.Corrente;
import Bicicleta.Pecas.IPeca;
import Bicicleta.Pecas.Roda;

import java.util.ArrayList;
import java.util.List;

public class Bicicleta implements IPreco {

    public Bicicleta(int aro, int tamanhoBanco, int maciezBanco, double espessuraCorrente, boolean ehImportado) {
        addPeca(
                new Roda(aro, true),
                new Roda(aro, true),
                new Banco(tamanhoBanco, maciezBanco, false),
                new Corrente(espessuraCorrente)
        );
        this.ehImportado = ehImportado;
    }

    public void addAcessorio(IAcessorio... acessorio) {
        for (var a : acessorio)
            acessorios.add(a);
    }

    @Override
    public double getPreco() {
        double total = 0;
        for (IPreco objeto : acessorios)
            total += objeto.getPreco();
        for (IPreco objeto : pecas)
            total += objeto.getPreco();
        return ehImportado ? total * 1.3 : total;
    }

    @Override
    public boolean getEhImportado() {
        return ehImportado;
    }

    private void addPeca(IPeca... pecas) {
        for (var p : pecas)
            this.pecas.add(p);
    }

    private List<IPeca> pecas = new ArrayList<>();
    private List<IAcessorio> acessorios = new ArrayList<>();
    private String cor;
    private boolean ehImportado;
}
