public class Main {

    public static void main(String[] args) {
	    var t1 = new TimeFutebol("São Paulo", "São Paulo", "SP");

	    var j1 = new Jogador("Daniel Alves", 72, 10, 2);
	    var j2 = new Jogador("Thiao Volpi", 78, 1, 0);

	    t1.addJogador(j1, j2);
	    ImprimirJogadores(t1);
    }
    private static void ImprimirJogadores(TimeFutebol time) {
        for (var jogadro : time.getJogadores())
            System.out.printf("Nome: %s\n" +
                    "Número: %d\n" +
                    "Peso: %.2f\n" +
                    "Posição: %d\n\n",
                    jogadro.nome, jogadro.getNumero(), jogadro.getPeso(), jogadro.getPosicao());
        // estranho. Não sabia que protected no Java estendia para o mesmo pacote
    }
}
