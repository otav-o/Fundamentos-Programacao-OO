public class Endereco {

    public Endereco(String rua, int numero, int complemento, String bairro, String cidade) {
        this.rua = rua;
        this.numero = numero;
        this.complemento = complemento;
        this.bairro = bairro;
        this.cidade = cidade;
    }

    @Override
    public String toString() {
        return String.format(
                "Rua: %s\n" +
                "Numero: %d\n" +
                "Complemento: %d\n" +
                "Bairro: %s\n" +
                "Cidade: %s",
                rua, numero, complemento, bairro, cidade);
    }

    private String rua;
    private int numero;
    private int complemento;
    private String bairro;
    private String cidade;
}
