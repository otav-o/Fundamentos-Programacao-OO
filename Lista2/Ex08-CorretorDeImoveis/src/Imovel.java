public class Imovel {

    public Imovel(Endereco endereco, double preco) {
        this.endereco = endereco;
        this.preco = preco;
    }

    public double getValorComissao() {
        return porcentagemComissao * preco;
    }

    private double porcentagemComissao;
    private Endereco endereco;
    private double preco;
}
