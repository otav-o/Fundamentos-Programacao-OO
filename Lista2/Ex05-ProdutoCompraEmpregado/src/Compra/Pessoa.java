package Compra;

public class Pessoa {

    public Pessoa(String nome, Endereco endereco, String numero) {
        this.nome = nome;
        this.endereco = endereco;
        this.numero = numero;
    }

    public Endereco consultaEndereco() {
        return endereco;
    }

    public String consultaNome() {
        return nome;
    }

    private String nome;
    private Endereco endereco;
    private String numero; // não entendi!
}
