public class Quadrado {

    public Quadrado(Linha base, Linha altura) {
        this.base = base;
        this.altura = altura;
    }

    public double getPerimetro() {
        return base.tamanho() * 2 + altura.tamanho() * 2;
    }

    private Linha base;
    private Linha altura;
}
