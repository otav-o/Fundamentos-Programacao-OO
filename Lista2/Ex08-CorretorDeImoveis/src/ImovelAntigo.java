public class ImovelAntigo extends Imovel {
    public ImovelAntigo(Endereco endereco, double preco, double comissao) {
        super(endereco, preco, comissao);
    }

    public double getValorComissao(double desconto) {
        return super.getValorComissao() - desconto;
    }
}
