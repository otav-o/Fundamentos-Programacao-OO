package com.lista1;

public class Inss {

    private int anoAtual = 2021;

    public Inss(Empregado emp) {
        this.emp = emp;
    }

    public boolean PodeAposentar() {
        if (aposentadoriaPorIdade() || aposentadoriaTempoServico() || aposentadoriaHibrida())
            return true;
        return false;
    }

    public boolean aposentadoriaPorIdade() {
        if (emp.getIdade(anoAtual) > 65)
            return true;
        return false;
    }

    public boolean aposentadoriaTempoServico() {
        if (emp.getAnosTrabalhados() > 30)
            return true;
        return false;
    }

    public boolean aposentadoriaHibrida() {
        if (emp.getIdade(anoAtual) >= 60 && emp.getAnosTrabalhados() >= 25)
            return true;
        return false;
    }

    private Empregado emp;
}
