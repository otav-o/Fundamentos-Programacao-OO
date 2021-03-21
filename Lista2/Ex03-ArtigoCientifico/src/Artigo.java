import Pessoa.Pessoa;
import java.util.ArrayList;
import java.util.List;

public class Artigo {

    public Artigo(String titulo, String resumo) {
        this.titulo = titulo; this.resumo = resumo;
    }

    public void AddAutor(Pessoa p) {
        autores.add(p);
    }

    public String getTitulo() {
        return titulo;
    }

    public String getResumo() {
        return resumo;
    }

    private String titulo;
    private String resumo;
    private List<Pessoa> autores = new ArrayList<Pessoa>();
}
