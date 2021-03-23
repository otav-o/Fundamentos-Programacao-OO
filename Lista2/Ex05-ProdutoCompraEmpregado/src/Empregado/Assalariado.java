package Empregado;

public class Assalariado extends Empregado {

    public Assalariado(String nome, String sobrenome, double salario) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.salario = salario;
    }

    @Override
    public double vencimento() {
        return salario;
    }

    private double salario;
}
