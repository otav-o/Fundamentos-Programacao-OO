package Compra;

public class Pessoa {

    public Endereco consultaEndereco() {
        return endereco;
    }

    public String consultaNome() {
        return nome;
    }

    private String nome;
    private Endereco endereco;
    private String numero;
}
