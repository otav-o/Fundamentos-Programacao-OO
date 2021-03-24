public class Linha {

    public Linha(Ponto ponto1, Ponto ponto2) {
        this.ponto1 = ponto1;
        this.ponto2 = ponto2;
    }

    public double tamanho() {
        return ponto1.distanciaAte(ponto2);
    }
    
    private Ponto ponto1;
    private Ponto ponto2;
}
