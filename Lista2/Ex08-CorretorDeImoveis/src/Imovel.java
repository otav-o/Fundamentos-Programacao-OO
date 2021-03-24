public class Imovel {

    public Imovel(Endereco endereco, double preco, double porcentagemComissao) {
        this.endereco = endereco;
        this.preco = preco;
        this.porcentagemComissao = porcentagemComissao;
    }

    public double getValorComissao() {
        return porcentagemComissao * preco;
    }

    private double porcentagemComissao;
    private Endereco endereco;
    private double preco;
}
