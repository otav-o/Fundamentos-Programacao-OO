public class Mulher extends PessoaIMC {
    public Mulher(double peso, double altura) {
        super(peso, altura);
    }

    @Override
    public String resultIMC() {
        double imc = calculaIMC();

        if (imc <= 19)
            return "Abaixo do peso";
        else if (19 < imc && imc <= 25.8)
            return "Peso ideal";
        else if (25.8 < imc)
            return "Sobrepeso";
        else
            return null;
    }
}
