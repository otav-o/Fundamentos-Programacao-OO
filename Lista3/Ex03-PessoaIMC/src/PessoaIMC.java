public abstract class PessoaIMC extends Pessoa{
    public PessoaIMC(double peso, double altura) {
        this.peso = peso;
        this.altura = altura;
    }

    public double calculaIMC() {
        return peso / Math.pow(altura, 2);
    }

    public abstract String resultIMC();

    @Override
    public String toString() {
        return String.format("Nome: %s Data de Nascimento: %s Peso: %s Altura: %s");
    }

    private double peso;
    private double altura;
}
