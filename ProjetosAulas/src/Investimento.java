public class Investimento {

    public Investimento() { }

    public Investimento(String descricao, double valorInvestido) {
        this.descricao = descricao;
        this.valorInvestido = valorInvestido;
    }
/*
    public valorAtual() {
        
    }
*/
    public String getDescricao() {
        return descricao;
    }

    public double getValorInvestido() {
        return valorInvestido;
    }

    private String descricao;
    private double valorInvestido;
}
