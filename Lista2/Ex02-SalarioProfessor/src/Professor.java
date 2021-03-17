public class Professor {

    public Professor(String nome, int especializacao) {
        this.nome = nome;
        setEspecializacao(especializacao);
    }

    public void setEspecializacao (int n) {
        switch (n) {
            case 2: possuiEspecializacao = true; break;
            case 3: possuiMestrado = true; break;
            case 4: possuiDoutorado = true; break;
        }
    }

    private int horasTrabalhadas;
    private boolean possuiMestrado = false;
    private boolean possuiEspecializacao = false;
    private boolean possuiDoutorado = false;
    private String nome;
    // obs.: vou considerar os acréscimos não cumulativos
}
