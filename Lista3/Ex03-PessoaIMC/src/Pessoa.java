import java.time.LocalDate;

public class Pessoa {
    @Override
    public String toString() {
        return String.format("Nome: %s Data de Nascimento: %s", nome, dataNascimento.toString());
    }

    private String nome;
    private LocalDate dataNascimento;
}
