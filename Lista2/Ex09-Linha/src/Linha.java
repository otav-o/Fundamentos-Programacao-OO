public class Linha {

    public Linha(Ponto ponto1, Ponto ponto2) {
        this.ponto1 = ponto1;
        this.ponto2 = ponto2;
    }

    public double tamanho() {
        return ponto1.distanciaAte(ponto2);
    }

    public boolean ehVertical() {
        if (ponto1.getAbscissa() == ponto2.getAbscissa())
            return true;
        return false;
    }

    public boolean ehHorizontal() {
        if (ponto1.getOrdenada() == ponto2.getOrdenada())
            return true;
        return false;
    }

    private Ponto ponto1;
    private Ponto ponto2;
}
