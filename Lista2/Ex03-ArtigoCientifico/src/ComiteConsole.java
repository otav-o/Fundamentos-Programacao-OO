import java.util.List;
import java.util.Scanner;

public class ComiteConsole {
    public ComiteConsole(List<Artigo> artigos) {
        artigosParaAvaliar = artigos;
    }

    public void avaliar() {
        for (Artigo a : artigosParaAvaliar) {
            atribuirNota(a);
        }
    }

    private void atribuirNota(Artigo a) {
        System.out.printf("Artigo: %s\n" +
                "Resumo: %s\n" +
                "Sua nota: ", a.getTitulo(), a.getResumo());

        a.setNota(s.nextDouble());
    }

    private List<Artigo> artigosParaAvaliar;
    private Scanner s = new Scanner(System.in);
}
