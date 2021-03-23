import java.util.ArrayList;
import java.util.List;

public class Corretor {

    public Corretor(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public double calcularComissaoTotal() {
        double total = 0;
        for (var imovel : carteira)
            total += imovel.getValorComissao();
        return total;
    }

    public void addImovel(Imovel i) {
        carteira.add(i);
    }

    private String nome;
    private int idade;
    private List<Imovel> carteira = new ArrayList<>();
}
