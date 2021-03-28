public class ImovelAntigo extends Imovel {
    public ImovelAntigo(Endereco endereco, double preco, double comissao, double desconto) {
        super(endereco, preco - desconto, comissao);
    }
}
