import Pessoa.Pessoa;
import java.util.ArrayList;
import java.util.List;

public class Artigo {

    public Artigo(String titulo, String resumo) {
        this.titulo = titulo; this.resumo = resumo;
    }

    public void addAutor(Pessoa... pessoas) {
        for (Pessoa p : pessoas)
            autores.add(p);
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    public double getNota() {
        return nota;
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
    private double nota; // nota não deveria estar aqui, pois um artigo pode participar de várias competições
}
