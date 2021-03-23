import java.util.ArrayList;
import java.util.List;

public class TimeFutebol {

    public TimeFutebol(String nome, String cidade, String estado) {
        this.nome = nome;
        this.cidade = cidade;
        this.estado = estado;
    }

    public void addJogador(Jogador... colecao) {
        for(var jogador: colecao)
            jogadores.add(jogador);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public List<Jogador> getJogadores() {
        return jogadores;
    }

    private String nome;
    private String cidade;
    private String estado;

    private List<Jogador> jogadores = new ArrayList<>();
}
