package Compra;

public class Compra {

    public Compra(Pessoa pessoa, Produto produto) {
        this.pessoa = pessoa;
        this.produto = produto;
    }

    public void comprar(Pessoa pessoa, Produto produto) {
        // ??
    }

    public String verificarCompra() {
        return String.format("%s comprou %s",
                pessoa.consultaNome(), produto.consultaNome());
    }

    private Pessoa pessoa;
    private Produto produto;
}
