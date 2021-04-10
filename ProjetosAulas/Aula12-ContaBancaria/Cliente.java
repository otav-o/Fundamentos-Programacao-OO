import java.util.ArrayList;
import java.util.List;

public class Cliente {

    public Cliente (String nome) {
        this.nome = nome;
    }

    public String getNome () { return nome; }

    public void addConta(Conta conta) {
        this.contas.add(conta);
    }

    private String nome;
    private List<Conta> contas = new ArrayList<>(); // polimorfismo
}
