public abstract class PessoaIMC extends Pessoa{
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
