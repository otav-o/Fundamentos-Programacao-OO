package Compra;

public class Endereco {

    public Endereco(String logradouro, String cidade, String estado) {
        this.logradouro = logradouro;
        this.cidade = cidade;
        this.estado = estado;
    }

    public String consultaLogradouro() {
        return logradouro;
    }

    private String logradouro;
    private String cidade;
    private String estado;
}
