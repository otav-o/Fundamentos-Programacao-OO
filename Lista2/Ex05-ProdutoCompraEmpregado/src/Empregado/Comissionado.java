package Empregado;

public class Comissionado extends Empregado{

    public Comissionado(double totalVenda, double taxaComissao) {
        this.taxaComissao = taxaComissao;
        this.totalVenda = totalVenda;
    }

    @Override
    public double vencimento() {
        return totalVenda * taxaComissao;
    }

    private double totalVenda;
    private double taxaComissao;
}
