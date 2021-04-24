public class Homem extends PessoaIMC {
    public Homem(double peso, double altura) {
        super(peso, altura);
    }

    @Override
    public String resultIMC() {
        double imc = calculaIMC();

        if (imc <= 20.7)
            return "Abaixo do peso";
        else if (20.7 < imc && imc <= 26.4)
            return "Peso ideal";
        else if (26.4 < imc)
            return "Sobrepeso";
        else
            return null;
    }
}
