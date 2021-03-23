public class Jogador extends Atleta {

    public Jogador(int numero, int posicao) {
        this.numero = numero;
        this.posicao = posicao;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getPosicao() {
        return posicao;
    }

    public void setPosicao(int posicao) {
        this.posicao = posicao;
    }

    private int numero;
    private int posicao; // 0 para goleiro, 1 para zagueiro, 2 para meio campo, 3 para ataque
}
