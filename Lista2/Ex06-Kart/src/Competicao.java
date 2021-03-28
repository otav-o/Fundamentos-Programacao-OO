import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Competicao {

    public Competicao(List<Participante> participantes) {
        this.participantes = participantes;
    }

    public List<Participante> realizarCorrida() {
        Collections.shuffle(participantes); // embaralha simulando que a competição ocorreu
        pontuarParticipantes();
        return participantes;
    }

    public void addParticipante(Participante p) {
        participantes.add(p);
    };

    private void pontuarParticipantes() {
        for (int i = 0; i < pontuacao.length; i++) {
            participantes.get(i).addPontos(pontuacao[i]);
        }
    }

    private List<Participante> participantes = new ArrayList<>();
    private int[] pontuacao = new int[] {25, 15, 10, 7, 5, 1}; // o ideal seria receber de uma fonte externa
}
