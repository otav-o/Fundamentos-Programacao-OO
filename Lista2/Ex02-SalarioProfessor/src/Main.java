/*
    Um professor tem seu salário mensal calculado a partir do número
    de aulas ministradas ao mês. Por exemplo, uma disciplina de 4 créditos
    semanais, são 16 horas mensais.
    O valor por hora depende da formação do professor:
    - se for graduado, o valor da hora-aula é R$ 25,00,
    - se possuir especialização, há um acréscimo de 15%,
    - se for mestre, um aumento de 45%,
    - e se for doutor há um aumento de 75%.

    Todos os aumentos ocorrem sobre o valor da hora-aula.
    Se a disciplina for EAD, o valor por hora-aula diminui em 25%.
    Faça um sistema que permita cadastrar um professor, suas disciplinas e calcular o salário
 */

import java.util.Scanner;

public class Main {
    static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
        var prof = cadastrarProfessor();
        //cadastrarDisciplinas(prof);
    }

    private static Professor cadastrarProfessor() {

        System.out.printf("Cadastro de professor.\n" +
                "Nome: ");
        var nome = s.next();
        int escolha = menuEspecializacao();

        return new Professor(nome, escolha);
    }

    private static int menuEspecializacao() {
        System.out.print("Escolha o grau de instrução\n" +
                "(1) Superior completo\n" +
                "(2) Especialização\n" +
                "(3) Mestrado completo\n" +
                "(4) Doutorado completo\n" +
                "Digite o número: ");
        return s.nextInt();
    }
}
