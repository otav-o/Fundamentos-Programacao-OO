package Compra;

public class Produto {

    public Produto(long codigo, String nome) {
        this.codigo = codigo;
        this.nome = nome;
    }

    public String consultaNome() {
        return nome;
    }

    private long codigo;
    private String nome;
}
