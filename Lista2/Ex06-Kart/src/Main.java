import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	    var participantesDaCorrida = gerarParticipantes(gerarCompetidores(15), gerarKarts(30));
	    var competicao1 = new Competicao(participantesDaCorrida);
	    var ordemClassificacao = competicao1.realizarCorrida();
	    imprimirResultados(ordemClassificacao);
    }

    private static void imprimirResultados(List<Participante> ordemClassificacao) {
        for (int i = 0; i < ordemClassificacao.size(); i++)
            System.out.printf("O %d° colocado dessa corrida possui %d pontos no ranking nacional.\n", i + 1, ordemClassificacao.get(i).getPontos());
    }

    private static List<Participante> gerarParticipantes(List<Competidor> competidores, List<Kart> karts) {
        var lista = new ArrayList<Participante>();
        for (int i = 0; i < competidores.size(); i++)
            lista.add(new Participante(competidores.get(i), karts.get(i), karts.get(i + 1)));
        return lista;
    }

    private static List<Competidor> gerarCompetidores(int qtd) {
        var lista = new ArrayList<Competidor>();
        for (int i = 0; i < qtd; i++)
            lista.add(new Competidor());
        return lista;
    }

    private static List<Kart> gerarKarts(int qtd) {
        var lista = new ArrayList<Kart>();
        for (int i = 0; i < qtd; i++)
            lista.add(new Kart("Michelin", "Mercedes"));
        return lista;
    }
}
