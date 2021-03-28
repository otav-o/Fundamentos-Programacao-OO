// Representa uma pessoa que participa de várias competições

public class Competidor {

    public void addPontos(int p) {
        pontos += p;
    }

    public void descontarPontos(int p) {
        pontos -= p;
    }

    public int getPontos() {
        return pontos;
    }

    private int pontos;
}
