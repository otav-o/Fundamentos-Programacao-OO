// Competidor em uma competição específica

public class Participante { // extends Competidor?

    public Participante(Competidor pessoa, Kart carro1, Kart carro2) {
        competidor = pessoa;
        this.carro1 = carro1;
        this.carro2 = carro2;
    }

    public void trocarCarro() throws Exception {
        if (trocas < 1) {
            competidor.descontarPontos(5);
            trocas++;
        } else {
            throw new Exception("Não há carros restantes.");
        }
    }

    public void addPontos(int p) {
        competidor.addPontos(p);
    }

    public int getPontos() {
        return competidor.getPontos();
    }

    private int trocas = 0;
    private Kart carro1;
    private Kart carro2;
    private Competidor competidor;
}
